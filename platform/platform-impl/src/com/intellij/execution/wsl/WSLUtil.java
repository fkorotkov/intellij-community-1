// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.execution.wsl;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.ProcessOutput;
import com.intellij.execution.util.ExecUtil;
import com.intellij.openapi.application.Experiments;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.util.ThreeState;
import com.intellij.util.containers.ContainerUtil;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Class for working with WSL after Fall Creators Update
 * https://blogs.msdn.microsoft.com/commandline/2017/10/11/whats-new-in-wsl-in-windows-10-fall-creators-update/
 * - multiple linuxes
 * - file system is unavailable form windows (for now at least)
 */
public final class WSLUtil {
  public static final Logger LOG = Logger.getInstance("#com.intellij.execution.wsl");

  /**
   * @deprecated use {@link WslDistributionManager#getInstalledDistributions} instead.
   * Alternatively, check {@link WSLUtil#isSystemCompatible} and show standard WSL UI, e.g.
   * {@link com.intellij.execution.wsl.ui.WslDistributionComboBox}. If no WSL distributions installed,
   * it will show "No installed distributions" message.
   */
  @Deprecated
  public static boolean hasAvailableDistributions() {
    return !getAvailableDistributions().isEmpty();
  }


  /**
   * @deprecated use {@link WslDistributionManager#getInstalledDistributions()} instead
   */
  @Deprecated
  @ApiStatus.ScheduledForRemoval(inVersion = "2021.3")
  @NotNull
  public static List<WSLDistribution> getAvailableDistributions() {
    if (!isSystemCompatible()) return Collections.emptyList();

    final Path executableRoot = getExecutableRootPath();
    if (executableRoot == null) return Collections.emptyList();

    Collection<WslDistributionDescriptor> descriptors = WSLDistributionService.getInstance().getDescriptors();
    final List<WSLDistribution> result = new ArrayList<>(descriptors.size() + 1 /* LEGACY_WSL */);

    for (WslDistributionDescriptor descriptor: descriptors) {
      String executablePathStr = descriptor.getExecutablePath();
      if (executablePathStr != null) {
        Path executablePath = Paths.get(executablePathStr);
        if (!executablePath.isAbsolute()) {
          executablePath = executableRoot.resolve(executablePath);
        }

        if (Files.exists(executablePath, LinkOption.NOFOLLOW_LINKS)) {
          result.add(new WSLDistribution(descriptor, executablePath));
        }
      }
    }

    // add legacy WSL if it's available and enabled
    if (Experiments.getInstance().isFeatureEnabled("wsl.legacy.distribution")) {
      ContainerUtil.addIfNotNull(result, WSLDistributionLegacy.getInstance());
    }

    return result;
  }

  /**
   * @return root for WSL executable or null if unavailable
   */
  @Nullable
  private static Path getExecutableRootPath() {
    String localAppDataPath = System.getenv().get("LOCALAPPDATA");
    return StringUtil.isEmpty(localAppDataPath) ? null : Paths.get(localAppDataPath, "Microsoft\\WindowsApps");
  }

  /**
   * @deprecated use {@link WslDistributionManager#getOrCreateDistributionByMsId(String)} instead
   */
  @Deprecated
  @ApiStatus.ScheduledForRemoval(inVersion = "2021.3")
  @Nullable
  public static WSLDistribution getDistributionById(@Nullable String id) {
    if (id == null) {
      return null;
    }
    for (WSLDistribution distribution : getAvailableDistributions()) {
      if (id.equals(distribution.getId())) {
        return distribution;
      }
    }
    return null;
  }

  /**
   * @return instance of WSL distribution or null if it's unavailable
   * @deprecated Use {@link WslDistributionManager#getOrCreateDistributionByMsId(String)}
   */
  @Nullable
  @Deprecated
  public static WSLDistribution getDistributionByMsId(@Nullable String name) {
    if (name == null) {
      return null;
    }
    for (WSLDistribution distribution : getAvailableDistributions()) {
      if (name.equals(distribution.getMsId())) {
        return distribution;
      }
    }
    return null;
  }

  public static boolean isSystemCompatible() {
    return SystemInfo.isWin10OrNewer;
  }

  /**
   * @param wslPath a path in WSL file system, e.g. "/mnt/c/Users/file.txt" or "/c/Users/file.txt"
   * @param mntRoot a directory where fixed drives will be mounted. Default is "/mnt/" - {@link WSLDistribution#DEFAULT_WSL_MNT_ROOT}).
   *               See https://docs.microsoft.com/ru-ru/windows/wsl/wsl-config#configuration-options
   * @return Windows-dependent path to the file, pointed by {@code wslPath} in WSL or null if the path is unmappable.
   * For example, {@code getWindowsPath("/mnt/c/Users/file.txt", "/mnt/") returns "C:\Users\file.txt"}
   */
  @Nullable
  public static String getWindowsPath(@NotNull String wslPath, @NotNull String mntRoot) {
    if (!wslPath.startsWith(mntRoot)) {
      return null;
    }
    int driveLetterIndex = mntRoot.length();
    if (driveLetterIndex >= wslPath.length() || !Character.isLetter(wslPath.charAt(driveLetterIndex))) {
      return null;
    }
    int slashIndex = driveLetterIndex + 1;
    if (slashIndex < wslPath.length() && wslPath.charAt(slashIndex) != '/') {
      return null;
    }
    return FileUtil.toSystemDependentName(Character.toUpperCase(wslPath.charAt(driveLetterIndex)) + ":" + wslPath.substring(slashIndex));
  }

  public static @NotNull ThreeState isWsl1(@NotNull WSLDistribution distribution) {
    int version = getWslVersion(distribution);
    return version < 0 ? ThreeState.UNSURE : ThreeState.fromBoolean(version == 1);
  }

  /**
   * @param distribution
   * @return version if it can be determined or -1 instead
   */
  public static int getWslVersion(@NotNull WSLDistribution distribution) {
    int version = getVersionFromWslCli(distribution);
    if (version < 0) {
      version = getVersionByUname(distribution);
    }
    return version;
  }

  private static int getVersionFromWslCli(@NotNull WSLDistribution distribution) {
    Path wslExe = WSLDistribution.findWslExe();
    if (wslExe == null) {
      LOG.warn("wsl.exe is not found");
      return -1;
    }

    GeneralCommandLine commandLine = new GeneralCommandLine(wslExe.toString(), "-l", "-v").withCharset(StandardCharsets.UTF_16LE);

    ProcessOutput output;
    try {
      output = ExecUtil.execAndGetOutput(commandLine, WSLDistribution.DEFAULT_TIMEOUT);
    }
    catch (ExecutionException e) {
      LOG.warn("Failed to run " + commandLine.getCommandLineString(), e);
      return -1;
    }
    if (output.isTimeout() || output.getExitCode() != 0 || !output.getStderr().isEmpty()) {
      String details = StringUtil.join(ContainerUtil.newArrayList(
        "timeout: " + output.isTimeout(),
        "exitCode: " + output.getExitCode(),
        "stdout: " + output.getStdout(),
        "stderr: " + output.getStderr()
      ), ", ");
      LOG.warn("Failed to run " + commandLine.getCommandLineString() + ": " + details);
      return -1;
    }

    List<@NlsSafe String> lines = output.getStdoutLines();
    return lines.stream().skip(1).mapToInt(l -> {
      List<String> words = StringUtil.split(l, " ");

      int size = words.size();
      if (size >= 3 && distribution.getMsId().equals(words.get(size - 3))) {
        return StringUtil.parseInt(words.get(size - 1), -1);
      }
      return -1;
    }).filter(v -> v != -1).findFirst().orElse(-1);
  }

  // To be removed when old WSL installations (without wsl.exe) are gone.
  private static int getVersionByUname(@NotNull WSLDistribution distribution) {
    try {
      ProcessOutput output = distribution.executeOnWsl(WSLDistribution.DEFAULT_TIMEOUT, "uname", "-v");
      if (output.checkSuccess(LOG)) {
        return output.getStdout().contains("Microsoft") ? 1 : 2;
      }
    }
    catch (ExecutionException e) {
      LOG.warn(e);
    }
    return -1;
  }

  public static @NotNull @NlsSafe String getMsId(@NotNull @NlsSafe String msOrInternalId) {
    WslDistributionDescriptor descriptor = ContainerUtil.find(WSLDistributionService.getInstance().getDescriptors(),
                                                              d -> d.getId().equals(msOrInternalId));
    return descriptor != null ? descriptor.getMsId() : msOrInternalId;
  }
}
