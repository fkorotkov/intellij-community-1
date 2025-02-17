package com.intellij.ide.starters.local

import com.intellij.codeInsight.actions.ReformatCodeProcessor
import com.intellij.ide.projectWizard.ProjectSettingsStep
import com.intellij.ide.starters.JavaStartersBundle
import com.intellij.ide.starters.StarterModuleImporter
import com.intellij.ide.starters.StarterModulePreprocessor
import com.intellij.ide.starters.local.generator.AssetsProcessor
import com.intellij.ide.starters.local.wizard.StarterInitialStep
import com.intellij.ide.starters.local.wizard.StarterLibrariesStep
import com.intellij.ide.starters.shared.*
import com.intellij.ide.util.projectWizard.*
import com.intellij.openapi.Disposable
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.application.ModalityState
import com.intellij.openapi.application.WriteAction
import com.intellij.openapi.diagnostic.logger
import com.intellij.openapi.extensions.ExtensionPointName
import com.intellij.openapi.externalSystem.model.ExternalSystemDataKeys
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.fileEditor.OpenFileDescriptor
import com.intellij.openapi.module.JavaModuleType
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.module.StdModuleTypes
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.project.rootManager
import com.intellij.openapi.projectRoots.JavaSdkType
import com.intellij.openapi.projectRoots.SdkTypeId
import com.intellij.openapi.roots.ModifiableRootModel
import com.intellij.openapi.roots.ui.configuration.ModulesProvider
import com.intellij.openapi.roots.ui.configuration.setupNewModuleJdk
import com.intellij.openapi.startup.StartupManager
import com.intellij.openapi.ui.Messages
import com.intellij.openapi.vfs.LocalFileSystem
import com.intellij.openapi.vfs.VfsUtil
import com.intellij.pom.java.LanguageLevel
import com.intellij.ui.GuiUtils
import com.intellij.util.lang.JavaVersion
import java.io.IOException
import java.net.URL

abstract class StarterModuleBuilder : ModuleBuilder() {

  companion object {
    @JvmStatic
    private val VALID_PACKAGE_NAME_PATTERN: Regex = Regex("[^a-zA-Z0-9_.]")
    @JvmStatic
    private val IMPORTER_EP_NAME: ExtensionPointName<StarterModuleImporter> =
      ExtensionPointName.create("com.intellij.starter.moduleImporter")

    @JvmStatic
    private val PREPROCESSOR_EP_NAME: ExtensionPointName<StarterModulePreprocessor> =
      ExtensionPointName.create("com.intellij.starter.modulePreprocessor")

    @JvmStatic
    fun getPackageName(group: String, artifact: String): String {
      val artifactSanitized = artifact.replace(VALID_PACKAGE_NAME_PATTERN, "_")
      val groupSanitized = group.replace("-", ".").replace(VALID_PACKAGE_NAME_PATTERN, "_")

      return "$groupSanitized.$artifactSanitized"
    }

    fun importModule(module: Module) {
      if (module.isDisposed) return
      val moduleBuilderPostTasks = IMPORTER_EP_NAME.extensions
      for (task in moduleBuilderPostTasks) {
        if (!task.runAfterSetup(module)) break
      }
    }

    fun preprocessModule(module: Module, builder: ModuleBuilder, frameworkVersion: String?) {
      PREPROCESSOR_EP_NAME.forEachExtensionSafe {
        it.process(module, builder, frameworkVersion)
      }
    }

    internal fun openSampleFiles(module: Module, filePathsToOpen: List<String>) {
      val contentRoot = module.rootManager.contentRoots.firstOrNull()
      if (contentRoot != null) {
        val fileEditorManager = FileEditorManager.getInstance(module.project)
        for (filePath in filePathsToOpen) {
          val fileToOpen = VfsUtil.findRelativeFile(filePath, contentRoot)
          if (fileToOpen != null) {
            fileEditorManager.openTextEditor(OpenFileDescriptor(module.project, fileToOpen), true)
          }
          else {
            logger<StarterModuleBuilder>().debug("Unable to find sample file $filePath in module: ${module.name}")
          }
        }
      }
    }
  }

  protected val starterContext: StarterContext = StarterContext()
  private val starterSettings: StarterWizardSettings by lazy { createSettings() }

  override fun getModuleType(): ModuleType<*> = StdModuleTypes.JAVA
  override fun getParentGroup(): String = JavaModuleType.BUILD_TOOLS_GROUP
  override fun getWeight(): Int = JavaModuleBuilder.BUILD_SYSTEM_WEIGHT + 10
  open fun getHelpId(): String? = null

  protected abstract fun getProjectTypes() : List<StarterProjectType>
  protected abstract fun getLanguages(): List<StarterLanguage>
  protected abstract fun getStarterPack(): StarterPack
  protected abstract fun getTestFrameworks(): List<StarterTestRunner>
  protected abstract fun getAssets(starter: Starter): List<GeneratorAsset>
  protected open fun isExampleCodeProvided(): Boolean = false
  protected open fun getMinJavaVersion() : JavaVersion? = LanguageLevel.JDK_1_8.toJavaVersion()

  protected open fun getCustomizedMessages(): CustomizedMessages? = null

  protected open fun getFilePathsToOpen(): List<String> = emptyList()

  internal fun isDependencyAvailableInternal(starter: Starter, dependency: Library): Boolean {
    return isDependencyAvailable(starter, dependency)
  }

  protected open fun isDependencyAvailable(starter: Starter, dependency: Library): Boolean {
    return true
  }

  override fun isSuitableSdkType(sdkType: SdkTypeId?): Boolean {
    return sdkType is JavaSdkType && !sdkType.isDependent
  }

  override fun modifyProjectTypeStep(settingsStep: SettingsStep): ModuleWizardStep? {
    // do not add standard SDK selector at the top
    return null
  }

  override fun setupModule(module: Module) {
    super.setupModule(module)

    if (starterContext.isCreatingNewProject) {
      val project = module.project

      project.putUserData(ExternalSystemDataKeys.NEWLY_CREATED_PROJECT, java.lang.Boolean.TRUE)
      project.putUserData(ExternalSystemDataKeys.NEWLY_IMPORTED_PROJECT, java.lang.Boolean.TRUE)
    }

    startGenerator(module)
  }

  private fun createSettings() : StarterWizardSettings {
    return StarterWizardSettings(
      getProjectTypes(),
      getLanguages(),
      isExampleCodeProvided(),
      false,
      emptyList(),
      null,
      emptyList(),
      emptyList(),
      getTestFrameworks(),
      getCustomizedMessages()
    )
  }

  override fun getCustomOptionsStep(context: WizardContext, parentDisposable: Disposable): ModuleWizardStep {
    starterContext.language = starterSettings.languages.first()
    starterContext.testFramework = starterSettings.testFrameworks.firstOrNull()
    starterContext.projectType = starterSettings.projectTypes.firstOrNull()
    starterContext.applicationType = starterSettings.applicationTypes.firstOrNull()
    starterContext.isCreatingNewProject = context.isCreatingNewProject

    return createOptionsStep(StarterContextProvider(this, parentDisposable, starterContext, context, starterSettings, ::getStarterPack))
  }

  override fun createWizardSteps(context: WizardContext, modulesProvider: ModulesProvider): Array<ModuleWizardStep> {
    return arrayOf(createLibrariesStep(StarterContextProvider(this, context.disposable, starterContext, context, starterSettings, ::getStarterPack)))
  }

  protected open fun createOptionsStep(contextProvider: StarterContextProvider): StarterInitialStep {
    return StarterInitialStep(contextProvider)
  }

  protected open fun createLibrariesStep(contextProvider: StarterContextProvider): StarterLibrariesStep {
    return StarterLibrariesStep(contextProvider)
  }

  override fun getIgnoredSteps(): List<Class<out ModuleWizardStep>> {
    return listOf(ProjectSettingsStep::class.java)
  }

  internal fun getMinJavaVersionInternal() : JavaVersion? = getMinJavaVersion()

  override fun setupRootModel(modifiableRootModel: ModifiableRootModel) {
    setupNewModuleJdk(modifiableRootModel, moduleJdk, starterContext.isCreatingNewProject)
    doAddContentEntry(modifiableRootModel)
  }

  private fun startGenerator(module: Module) {
    val moduleContentRoot = LocalFileSystem.getInstance().refreshAndFindFileByPath(contentEntryPath!!.replace("\\", "/"))
                            ?: throw IllegalStateException("Module root not found")

    val starter = starterContext.starter ?: throw IllegalStateException("Starter is not set")
    val generatorContext = GeneratorContext(
      starter.id,
      module.name,
      starterContext.group,
      starterContext.artifact,
      starterContext.version,
      starterContext.testFramework!!.id,
      starterContext.language.id,
      starterContext.libraryIds,
      starterContext.starterDependencyConfig ?: error("Starter dependency config is not set"),
      getGeneratorContextProperties(),
      getAssets(starter),
      moduleContentRoot
    )

    ProgressManager.getInstance().runProcessWithProgressSynchronously(
      {
        WriteAction.runAndWait<Throwable> {
          try {
            AssetsProcessor().generateSources(generatorContext, getTemplateProperties())
          }
          catch (e: IOException) {
            logger<StarterModuleBuilder>().error("Unable to create module by template", e)

            ApplicationManager.getApplication().invokeLater {
              Messages.showErrorDialog(
                JavaStartersBundle.message("starter.generation.error", e.message ?: ""),
                presentableName)
            }
          }

          applyAdditionalChanges(module)
        }
      },
      JavaStartersBundle.message("starter.generation.progress", presentableName),
      true, module.project)

    StartupManager.getInstance(module.project).runAfterOpened {  // IDEA-244863
      GuiUtils.invokeLaterIfNeeded(Runnable {
        if (module.isDisposed) return@Runnable

        ReformatCodeProcessor(module.project, module, false).run()
        // import of module may dispose it and create another, open files first
        openSampleFiles(module, getFilePathsToOpen())

        importModule(module)
      }, ModalityState.NON_MODAL, module.disposed)
    }
  }

  open fun getTemplateProperties(): Map<String, Any> = emptyMap()

  open fun applyAdditionalChanges(module: Module) {
    // optional hook method
  }

  protected fun getDependencyConfig(resourcePath: String): URL {
    return javaClass.getResource(resourcePath) ?: error("Failed to get resource: $resourcePath")
  }

  protected open fun getGeneratorContextProperties(): Map<String, String> {
    val packageName = getPackageName(starterContext.group, starterContext.artifact)
    return mapOf("rootPackage" to packageName)
  }

  protected fun getSamplesExt(language: StarterLanguage): String {
    return when (language.id) {
      "java" -> "java"
      "groovy" -> "groovy"
      "kotlin" -> "kt"
      else -> throw UnsupportedOperationException()
    }
  }
}