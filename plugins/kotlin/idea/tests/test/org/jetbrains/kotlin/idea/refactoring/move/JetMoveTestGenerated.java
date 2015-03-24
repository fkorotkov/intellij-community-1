/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.idea.refactoring.move;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.InnerTestClasses;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/refactoring/move")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class JetMoveTestGenerated extends AbstractJetMoveTest {
    public void testAllFilesPresentInMove() throws Exception {
        JetTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), new File("idea/testData/refactoring/move"), Pattern.compile("^(.+)\\.test$"));
    }

    @TestMetadata("java/moveClass/moveAsMember/moveClassToExternalNestedClass/moveClassToExternalNestedClass.test")
    public void testJava_moveClass_moveAsMember_moveClassToExternalNestedClass_MoveClassToExternalNestedClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToExternalNestedClass/moveClassToExternalNestedClass.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveAsMember/moveClassToNestedSiblingClass/moveClassToNestedSiblingClass.test")
    public void testJava_moveClass_moveAsMember_moveClassToNestedSiblingClass_MoveClassToNestedSiblingClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToNestedSiblingClass/moveClassToNestedSiblingClass.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveAsMember/moveClassToTopLevelClass/moveClassToTopLevelClass.test")
    public void testJava_moveClass_moveAsMember_moveClassToTopLevelClass_MoveClassToTopLevelClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToTopLevelClass/moveClassToTopLevelClass.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveAsMember/moveClassToTopLevelClassAndMakePackageLocal/moveClassToTopLevelClassAndMakePackageLocal.test")
    public void testJava_moveClass_moveAsMember_moveClassToTopLevelClassAndMakePackageLocal_MoveClassToTopLevelClassAndMakePackageLocal() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToTopLevelClassAndMakePackageLocal/moveClassToTopLevelClassAndMakePackageLocal.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveAsMember/moveClassToTopLevelClassAndMakePrivate/moveClassToTopLevelClassAndMakePrivate.test")
    public void testJava_moveClass_moveAsMember_moveClassToTopLevelClassAndMakePrivate_MoveClassToTopLevelClassAndMakePrivate() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToTopLevelClassAndMakePrivate/moveClassToTopLevelClassAndMakePrivate.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveAsMember/moveClassToTopLevelClassOfAnotherPackage/moveClassToTopLevelClassOfAnotherPackage.test")
    public void testJava_moveClass_moveAsMember_moveClassToTopLevelClassOfAnotherPackage_MoveClassToTopLevelClassOfAnotherPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveAsMember/moveClassToTopLevelClassOfAnotherPackage/moveClassToTopLevelClassOfAnotherPackage.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInAnotherPackage/moveNestedClassToTopLevelInAnotherPackage.test")
    public void testJava_moveClass_moveInnerToTop_moveNestedClassToTopLevelInAnotherPackage_MoveNestedClassToTopLevelInAnotherPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInAnotherPackage/moveNestedClassToTopLevelInAnotherPackage.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackage/moveNestedClassToTopLevelInTheSamePackage.test")
    public void testJava_moveClass_moveInnerToTop_moveNestedClassToTopLevelInTheSamePackage_MoveNestedClassToTopLevelInTheSamePackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackage/moveNestedClassToTopLevelInTheSamePackage.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackageAndAddOuterInstance/moveNestedClassToTopLevelInTheSamePackageAndAddOuterInstance.test")
    public void testJava_moveClass_moveInnerToTop_moveNestedClassToTopLevelInTheSamePackageAndAddOuterInstance_MoveNestedClassToTopLevelInTheSamePackageAndAddOuterInstance() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackageAndAddOuterInstance/moveNestedClassToTopLevelInTheSamePackageAndAddOuterInstance.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackageAndAddOuterInstanceWithLambda/moveNestedClassToTopLevelInTheSamePackageAndAddOuterInstanceWithLambda.test")
    public void testJava_moveClass_moveInnerToTop_moveNestedClassToTopLevelInTheSamePackageAndAddOuterInstanceWithLambda_MoveNestedClassToTopLevelInTheSamePackageAndAddOuterInstanceWithLambda() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackageAndAddOuterInstanceWithLambda/moveNestedClassToTopLevelInTheSamePackageAndAddOuterInstanceWithLambda.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackageAndRename/moveNestedClassToTopLevelInTheSamePackageAndRename.test")
    public void testJava_moveClass_moveInnerToTop_moveNestedClassToTopLevelInTheSamePackageAndRename_MoveNestedClassToTopLevelInTheSamePackageAndRename() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveInnerToTop/moveNestedClassToTopLevelInTheSamePackageAndRename/moveNestedClassToTopLevelInTheSamePackageAndRename.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveTop/moveTopLevelClassToAnotherPackage/moveTopLevelClassToAnotherPackage.test")
    public void testJava_moveClass_moveTop_moveTopLevelClassToAnotherPackage_MoveTopLevelClassToAnotherPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveTop/moveTopLevelClassToAnotherPackage/moveTopLevelClassToAnotherPackage.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveTopToInner/moveTopLevelClassToNestedClass/moveTopLevelClassToTopLevelClass.test")
    public void testJava_moveClass_moveTopToInner_moveTopLevelClassToNestedClass_MoveTopLevelClassToTopLevelClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveTopToInner/moveTopLevelClassToNestedClass/moveTopLevelClassToTopLevelClass.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveTopToInner/moveTopLevelClassToTopLevelClass/moveTopLevelClassToTopLevelClass.test")
    public void testJava_moveClass_moveTopToInner_moveTopLevelClassToTopLevelClass_MoveTopLevelClassToTopLevelClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveTopToInner/moveTopLevelClassToTopLevelClass/moveTopLevelClassToTopLevelClass.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveClass/moveTopToInner/moveTopLevelClassToTopLevelClassOfAnotherPackage/moveTopLevelClassToTopLevelClassOfAnotherPackage.test")
    public void testJava_moveClass_moveTopToInner_moveTopLevelClassToTopLevelClassOfAnotherPackage_MoveTopLevelClassToTopLevelClassOfAnotherPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveClass/moveTopToInner/moveTopLevelClassToTopLevelClassOfAnotherPackage/moveTopLevelClassToTopLevelClassOfAnotherPackage.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveField/moveFieldToExternalNestedClass/moveFieldToExternalNestedClass.test")
    public void testJava_moveField_moveFieldToExternalNestedClass_MoveFieldToExternalNestedClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveField/moveFieldToExternalNestedClass/moveFieldToExternalNestedClass.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveField/moveFieldToNestedSiblingClass/moveFieldToNestedSiblingClass.test")
    public void testJava_moveField_moveFieldToNestedSiblingClass_MoveFieldToNestedSiblingClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveField/moveFieldToNestedSiblingClass/moveFieldToNestedSiblingClass.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveField/moveFieldToTopLevelClass/moveFieldToTopLevelClass.test")
    public void testJava_moveField_moveFieldToTopLevelClass_MoveFieldToTopLevelClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveField/moveFieldToTopLevelClass/moveFieldToTopLevelClass.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveField/moveFieldToTopLevelClassAndMakePackageLocal/moveFieldToTopLevelClassAndMakePackageLocal.test")
    public void testJava_moveField_moveFieldToTopLevelClassAndMakePackageLocal_MoveFieldToTopLevelClassAndMakePackageLocal() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveField/moveFieldToTopLevelClassAndMakePackageLocal/moveFieldToTopLevelClassAndMakePackageLocal.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveField/moveFieldToTopLevelClassAndMakePrivate/moveFieldToTopLevelClassAndMakePrivate.test")
    public void testJava_moveField_moveFieldToTopLevelClassAndMakePrivate_MoveFieldToTopLevelClassAndMakePrivate() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveField/moveFieldToTopLevelClassAndMakePrivate/moveFieldToTopLevelClassAndMakePrivate.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveField/moveFieldToTopLevelClassOfAnotherPackage/moveFieldToTopLevelClassOfAnotherPackage.test")
    public void testJava_moveField_moveFieldToTopLevelClassOfAnotherPackage_MoveFieldToTopLevelClassOfAnotherPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveField/moveFieldToTopLevelClassOfAnotherPackage/moveFieldToTopLevelClassOfAnotherPackage.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveFile/moveFileToAnotherPackage/moveFileToAnotherPackage.test")
    public void testJava_moveFile_moveFileToAnotherPackage_MoveFileToAnotherPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveFile/moveFileToAnotherPackage/moveFileToAnotherPackage.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveMethod/moveMethodToExternalNestedClass/moveMethodToExternalNestedClass.test")
    public void testJava_moveMethod_moveMethodToExternalNestedClass_MoveMethodToExternalNestedClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveMethod/moveMethodToExternalNestedClass/moveMethodToExternalNestedClass.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveMethod/moveMethodToNestedSiblingClass/moveMethodToNestedSiblingClass.test")
    public void testJava_moveMethod_moveMethodToNestedSiblingClass_MoveMethodToNestedSiblingClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveMethod/moveMethodToNestedSiblingClass/moveMethodToNestedSiblingClass.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveMethod/moveMethodToTopLevelClass/moveMethodToTopLevelClass.test")
    public void testJava_moveMethod_moveMethodToTopLevelClass_MoveMethodToTopLevelClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveMethod/moveMethodToTopLevelClass/moveMethodToTopLevelClass.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveMethod/moveMethodToTopLevelClassAndMakePackageLocal/moveMethodToTopLevelClassAndMakePackageLocal.test")
    public void testJava_moveMethod_moveMethodToTopLevelClassAndMakePackageLocal_MoveMethodToTopLevelClassAndMakePackageLocal() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveMethod/moveMethodToTopLevelClassAndMakePackageLocal/moveMethodToTopLevelClassAndMakePackageLocal.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveMethod/moveMethodToTopLevelClassAndMakePrivate/moveMethodToTopLevelClassAndMakePrivate.test")
    public void testJava_moveMethod_moveMethodToTopLevelClassAndMakePrivate_MoveMethodToTopLevelClassAndMakePrivate() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveMethod/moveMethodToTopLevelClassAndMakePrivate/moveMethodToTopLevelClassAndMakePrivate.test");
        doTest(fileName);
    }

    @TestMetadata("java/moveMethod/moveMethodToTopLevelClassOfAnotherPackage/moveMethodToTopLevelClassOfAnotherPackage.test")
    public void testJava_moveMethod_moveMethodToTopLevelClassOfAnotherPackage_MoveMethodToTopLevelClassOfAnotherPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/moveMethod/moveMethodToTopLevelClassOfAnotherPackage/moveMethodToTopLevelClassOfAnotherPackage.test");
        doTest(fileName);
    }

    @TestMetadata("java/movePackage/movePackageToAnotherPackage/movePackageToAnotherPackage.test")
    public void testJava_movePackage_movePackageToAnotherPackage_MovePackageToAnotherPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/java/movePackage/movePackageToAnotherPackage/movePackageToAnotherPackage.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveFile/internalReferences/internalReferences.test")
    public void testKotlin_moveFile_internalReferences_InternalReferences() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveFile/internalReferences/internalReferences.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveFile/moveFileToFile/moveFileToFile.test")
    public void testKotlin_moveFile_moveFileToFile_MoveFileToFile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveFile/moveFileToFile/moveFileToFile.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveFile/moveFileWithoutPackageRename/moveFileWithoutPackageRename.test")
    public void testKotlin_moveFile_moveFileWithoutPackageRename_MoveFileWithoutPackageRename() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveFile/moveFileWithoutPackageRename/moveFileWithoutPackageRename.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveFile/moveFileWithPackageRename/moveFileWithPackageRename.test")
    public void testKotlin_moveFile_moveFileWithPackageRename_MoveFileWithPackageRename() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveFile/moveFileWithPackageRename/moveFileWithPackageRename.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/movePackage/movePackage/movePackage.test")
    public void testKotlin_movePackage_movePackage_MovePackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/movePackage/movePackage/movePackage.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/misc/internalReferences/internalReferences.test")
    public void testKotlin_moveTopLevelDeclarations_misc_internalReferences_InternalReferences() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/misc/internalReferences/internalReferences.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/misc/moveClassFromDefaultPackage/moveClassFromDefaultPackage.test")
    public void testKotlin_moveTopLevelDeclarations_misc_moveClassFromDefaultPackage_MoveClassFromDefaultPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/misc/moveClassFromDefaultPackage/moveClassFromDefaultPackage.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/misc/moveClassToDefaultPackage/moveClassToDefaultPackage.test")
    public void testKotlin_moveTopLevelDeclarations_misc_moveClassToDefaultPackage_MoveClassToDefaultPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/misc/moveClassToDefaultPackage/moveClassToDefaultPackage.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/misc/moveClassWithImportsRetained/moveClassWithImportsRetained.test")
    public void testKotlin_moveTopLevelDeclarations_misc_moveClassWithImportsRetained_MoveClassWithImportsRetained() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/misc/moveClassWithImportsRetained/moveClassWithImportsRetained.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/misc/moveFunctionWithImportsRetained/moveFunctionWithImportsRetained.test")
    public void testKotlin_moveTopLevelDeclarations_misc_moveFunctionWithImportsRetained_MoveFunctionWithImportsRetained() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/misc/moveFunctionWithImportsRetained/moveFunctionWithImportsRetained.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/misc/selfReferences/selfReferences.test")
    public void testKotlin_moveTopLevelDeclarations_misc_selfReferences_SelfReferences() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/misc/selfReferences/selfReferences.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/misc/singletonsAndStatics/singletonsAndStatics.test")
    public void testKotlin_moveTopLevelDeclarations_misc_singletonsAndStatics_SingletonsAndStatics() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/misc/singletonsAndStatics/singletonsAndStatics.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/misc/superReferences/superReferences.test")
    public void testKotlin_moveTopLevelDeclarations_misc_superReferences_SuperReferences() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/misc/superReferences/superReferences.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/misc/syntheticMembers/syntheticMembers.test")
    public void testKotlin_moveTopLevelDeclarations_misc_syntheticMembers_SyntheticMembers() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/misc/syntheticMembers/syntheticMembers.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveClassToFile/moveClassToFile.test")
    public void testKotlin_moveTopLevelDeclarations_moveClassToFile_MoveClassToFile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveClassToFile/moveClassToFile.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveClassToPackage/moveClassToPackage.test")
    public void testKotlin_moveTopLevelDeclarations_moveClassToPackage_MoveClassToPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveClassToPackage/moveClassToPackage.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveClassToPackageWithConflicts/moveClassToPackageWithConflicts.test")
    public void testKotlin_moveTopLevelDeclarations_moveClassToPackageWithConflicts_MoveClassToPackageWithConflicts() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveClassToPackageWithConflicts/moveClassToPackageWithConflicts.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveExtensionFunctionToFil/moveExtensionFunctionToFile.test")
    public void testKotlin_moveTopLevelDeclarations_moveExtensionFunctionToFil_MoveExtensionFunctionToFile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveExtensionFunctionToFil/moveExtensionFunctionToFile.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveExtensionPropertyToFile/moveExtensionPropertyToFile.test")
    public void testKotlin_moveTopLevelDeclarations_moveExtensionPropertyToFile_MoveExtensionPropertyToFile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveExtensionPropertyToFile/moveExtensionPropertyToFile.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveFunctionToFile/moveFunctionToFile.test")
    public void testKotlin_moveTopLevelDeclarations_moveFunctionToFile_MoveFunctionToFile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveFunctionToFile/moveFunctionToFile.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveFunctionToPackage/moveFunctionToPackage.test")
    public void testKotlin_moveTopLevelDeclarations_moveFunctionToPackage_MoveFunctionToPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveFunctionToPackage/moveFunctionToPackage.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveFunctionToPackageUsedInJava/moveFunctionToPackageUsedInJava.test")
    public void testKotlin_moveTopLevelDeclarations_moveFunctionToPackageUsedInJava_MoveFunctionToPackageUsedInJava() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveFunctionToPackageUsedInJava/moveFunctionToPackageUsedInJava.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveFunctionToPackageWithConflicts/moveFunctionToPackageWithConflicts.test")
    public void testKotlin_moveTopLevelDeclarations_moveFunctionToPackageWithConflicts_MoveFunctionToPackageWithConflicts() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveFunctionToPackageWithConflicts/moveFunctionToPackageWithConflicts.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveObjectToFile/moveObjectToFile.test")
    public void testKotlin_moveTopLevelDeclarations_moveObjectToFile_MoveObjectToFile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveObjectToFile/moveObjectToFile.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveObjectToPackage/moveObjectToPackage.test")
    public void testKotlin_moveTopLevelDeclarations_moveObjectToPackage_MoveObjectToPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveObjectToPackage/moveObjectToPackage.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveObjectToPackageWithConflicts/moveObjectToPackageWithConflicts.test")
    public void testKotlin_moveTopLevelDeclarations_moveObjectToPackageWithConflicts_MoveObjectToPackageWithConflicts() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveObjectToPackageWithConflicts/moveObjectToPackageWithConflicts.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/moveOnlyFunctionToPackageUsedInJava/moveOnlyFunctionToPackageUsedInJava.test")
    public void testKotlin_moveTopLevelDeclarations_moveOnlyFunctionToPackageUsedInJava_MoveOnlyFunctionToPackageUsedInJava() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/moveOnlyFunctionToPackageUsedInJava/moveOnlyFunctionToPackageUsedInJava.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/movePropertyToFile/movePropertyToFile.test")
    public void testKotlin_moveTopLevelDeclarations_movePropertyToFile_MovePropertyToFile() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/movePropertyToFile/movePropertyToFile.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/movePropertyToPackage/movePropertyToPackage.test")
    public void testKotlin_moveTopLevelDeclarations_movePropertyToPackage_MovePropertyToPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/movePropertyToPackage/movePropertyToPackage.test");
        doTest(fileName);
    }

    @TestMetadata("kotlin/moveTopLevelDeclarations/movePropertyToPackageWithConflicts/movePropertyToPackageWithConflicts.test")
    public void testKotlin_moveTopLevelDeclarations_movePropertyToPackageWithConflicts_MovePropertyToPackageWithConflicts() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/refactoring/move/kotlin/moveTopLevelDeclarations/movePropertyToPackageWithConflicts/movePropertyToPackageWithConflicts.test");
        doTest(fileName);
    }
}
