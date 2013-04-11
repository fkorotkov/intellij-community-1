/*
 * Copyright 2010-2013 JetBrains s.r.o.
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

package org.jetbrains.jet.completion;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.completion.AbstractJetJSCompletionTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.GenerateTests}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({JetBasicJSCompletionTest.Basic.class, JetBasicJSCompletionTest.Extensions.class, JetBasicJSCompletionTest.Js.class})
public class JetBasicJSCompletionTest extends AbstractJetJSCompletionTest {
    @TestMetadata("idea/testData/completion/basic")
    public static class Basic extends AbstractJetJSCompletionTest {
        public void testAllFilesPresentInBasic() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/completion/basic"), Pattern.compile("^(.+)\\.kt$"), false);
        }
        
        @TestMetadata("AutoCastAfterIf.kt")
        public void testAutoCastAfterIf() throws Exception {
            doTest("idea/testData/completion/basic/AutoCastAfterIf.kt");
        }
        
        @TestMetadata("AutoCastAfterIfMethod.kt")
        public void testAutoCastAfterIfMethod() throws Exception {
            doTest("idea/testData/completion/basic/AutoCastAfterIfMethod.kt");
        }
        
        @TestMetadata("AutoCastForThis.kt")
        public void testAutoCastForThis() throws Exception {
            doTest("idea/testData/completion/basic/AutoCastForThis.kt");
        }
        
        @TestMetadata("AutoCastInWhen.kt")
        public void testAutoCastInWhen() throws Exception {
            doTest("idea/testData/completion/basic/AutoCastInWhen.kt");
        }
        
        @TestMetadata("BasicAny.kt")
        public void testBasicAny() throws Exception {
            doTest("idea/testData/completion/basic/BasicAny.kt");
        }
        
        @TestMetadata("BasicInt.kt")
        public void testBasicInt() throws Exception {
            doTest("idea/testData/completion/basic/BasicInt.kt");
        }
        
        @TestMetadata("BeforeDotInCall.kt")
        public void testBeforeDotInCall() throws Exception {
            doTest("idea/testData/completion/basic/BeforeDotInCall.kt");
        }
        
        @TestMetadata("CallLocalLambda.kt")
        public void testCallLocalLambda() throws Exception {
            doTest("idea/testData/completion/basic/CallLocalLambda.kt");
        }
        
        @TestMetadata("ClassRedeclaration1.kt")
        public void testClassRedeclaration1() throws Exception {
            doTest("idea/testData/completion/basic/ClassRedeclaration1.kt");
        }
        
        @TestMetadata("ClassRedeclaration2.kt")
        public void testClassRedeclaration2() throws Exception {
            doTest("idea/testData/completion/basic/ClassRedeclaration2.kt");
        }
        
        @TestMetadata("CompletionInSetter.kt")
        public void testCompletionInSetter() throws Exception {
            doTest("idea/testData/completion/basic/CompletionInSetter.kt");
        }
        
        @TestMetadata("DoNotCompleteForErrorReceivers.kt")
        public void testDoNotCompleteForErrorReceivers() throws Exception {
            doTest("idea/testData/completion/basic/DoNotCompleteForErrorReceivers.kt");
        }
        
        @TestMetadata("ExtendClassName.kt")
        public void testExtendClassName() throws Exception {
            doTest("idea/testData/completion/basic/ExtendClassName.kt");
        }
        
        @TestMetadata("ExtendQualifiedClassName.kt")
        public void testExtendQualifiedClassName() throws Exception {
            doTest("idea/testData/completion/basic/ExtendQualifiedClassName.kt");
        }
        
        @TestMetadata("ExtensionForProperty.kt")
        public void testExtensionForProperty() throws Exception {
            doTest("idea/testData/completion/basic/ExtensionForProperty.kt");
        }
        
        @TestMetadata("ExtensionFunReceiver.kt")
        public void testExtensionFunReceiver() throws Exception {
            doTest("idea/testData/completion/basic/ExtensionFunReceiver.kt");
        }
        
        @TestMetadata("ExtensionWithAdditionalTypeParameters.kt")
        public void testExtensionWithAdditionalTypeParameters() throws Exception {
            doTest("idea/testData/completion/basic/ExtensionWithAdditionalTypeParameters.kt");
        }
        
        @TestMetadata("ExtensionWithGenericParamInReceiver.kt")
        public void testExtensionWithGenericParamInReceiver() throws Exception {
            doTest("idea/testData/completion/basic/ExtensionWithGenericParamInReceiver.kt");
        }
        
        @TestMetadata("ExtensionWithGenericReceiver.kt")
        public void testExtensionWithGenericReceiver() throws Exception {
            doTest("idea/testData/completion/basic/ExtensionWithGenericReceiver.kt");
        }
        
        @TestMetadata("ExtensionWithInternalGenericParameters.kt")
        public void testExtensionWithInternalGenericParameters() throws Exception {
            doTest("idea/testData/completion/basic/ExtensionWithInternalGenericParameters.kt");
        }
        
        @TestMetadata("ExtensionWithManyTypeParamsInReceiver.kt")
        public void testExtensionWithManyTypeParamsInReceiver() throws Exception {
            doTest("idea/testData/completion/basic/ExtensionWithManyTypeParamsInReceiver.kt");
        }
        
        @TestMetadata("FromImports.kt")
        public void testFromImports() throws Exception {
            doTest("idea/testData/completion/basic/FromImports.kt");
        }
        
        @TestMetadata("FunctionCompletionFormatting.kt")
        public void testFunctionCompletionFormatting() throws Exception {
            doTest("idea/testData/completion/basic/FunctionCompletionFormatting.kt");
        }
        
        @TestMetadata("InCallExpression.kt")
        public void testInCallExpression() throws Exception {
            doTest("idea/testData/completion/basic/InCallExpression.kt");
        }
        
        @TestMetadata("InClassInitializer.kt")
        public void testInClassInitializer() throws Exception {
            doTest("idea/testData/completion/basic/InClassInitializer.kt");
        }
        
        @TestMetadata("InClassPropertyAccessor.kt")
        public void testInClassPropertyAccessor() throws Exception {
            doTest("idea/testData/completion/basic/InClassPropertyAccessor.kt");
        }
        
        @TestMetadata("InEmptyImport.kt")
        public void testInEmptyImport() throws Exception {
            doTest("idea/testData/completion/basic/InEmptyImport.kt");
        }
        
        @TestMetadata("InExpressionNoPrefix.kt")
        public void testInExpressionNoPrefix() throws Exception {
            doTest("idea/testData/completion/basic/InExpressionNoPrefix.kt");
        }
        
        @TestMetadata("InExtendTypeAnnotation.kt")
        public void testInExtendTypeAnnotation() throws Exception {
            doTest("idea/testData/completion/basic/InExtendTypeAnnotation.kt");
        }
        
        @TestMetadata("InFileWithMultiDeclaration.kt")
        public void testInFileWithMultiDeclaration() throws Exception {
            doTest("idea/testData/completion/basic/InFileWithMultiDeclaration.kt");
        }
        
        @TestMetadata("InFileWithTypedef.kt")
        public void testInFileWithTypedef() throws Exception {
            doTest("idea/testData/completion/basic/InFileWithTypedef.kt");
        }
        
        @TestMetadata("InFunInClassInitializer.kt")
        public void testInFunInClassInitializer() throws Exception {
            doTest("idea/testData/completion/basic/InFunInClassInitializer.kt");
        }
        
        @TestMetadata("InGlobalPropertyInitializer.kt")
        public void testInGlobalPropertyInitializer() throws Exception {
            doTest("idea/testData/completion/basic/InGlobalPropertyInitializer.kt");
        }
        
        @TestMetadata("InImport.kt")
        public void testInImport() throws Exception {
            doTest("idea/testData/completion/basic/InImport.kt");
        }
        
        @TestMetadata("InInitializerInPropertyAccessor.kt")
        public void testInInitializerInPropertyAccessor() throws Exception {
            doTest("idea/testData/completion/basic/InInitializerInPropertyAccessor.kt");
        }
        
        @TestMetadata("InLocalObjectDeclaration.kt")
        public void testInLocalObjectDeclaration() throws Exception {
            doTest("idea/testData/completion/basic/InLocalObjectDeclaration.kt");
        }
        
        @TestMetadata("InLongDotQualifiedExpression.kt")
        public void testInLongDotQualifiedExpression() throws Exception {
            doTest("idea/testData/completion/basic/InLongDotQualifiedExpression.kt");
        }
        
        @TestMetadata("InMiddleOfNamespace.kt")
        public void testInMiddleOfNamespace() throws Exception {
            doTest("idea/testData/completion/basic/InMiddleOfNamespace.kt");
        }
        
        @TestMetadata("InMiddleOfPackage.kt")
        public void testInMiddleOfPackage() throws Exception {
            doTest("idea/testData/completion/basic/InMiddleOfPackage.kt");
        }
        
        @TestMetadata("InObjectInDelegationSpecifier.kt")
        public void testInObjectInDelegationSpecifier() throws Exception {
            doTest("idea/testData/completion/basic/InObjectInDelegationSpecifier.kt");
        }
        
        @TestMetadata("InPackageBegin.kt")
        public void testInPackageBegin() throws Exception {
            doTest("idea/testData/completion/basic/InPackageBegin.kt");
        }
        
        @TestMetadata("InTypeAnnotation.kt")
        public void testInTypeAnnotation() throws Exception {
            doTest("idea/testData/completion/basic/InTypeAnnotation.kt");
        }
        
        @TestMetadata("JavaPackage.kt")
        public void testJavaPackage() throws Exception {
            doTest("idea/testData/completion/basic/JavaPackage.kt");
        }
        
        @TestMetadata("LocalMultideclarationValues.kt")
        public void testLocalMultideclarationValues() throws Exception {
            doTest("idea/testData/completion/basic/LocalMultideclarationValues.kt");
        }
        
        @TestMetadata("NamedObject.kt")
        public void testNamedObject() throws Exception {
            doTest("idea/testData/completion/basic/NamedObject.kt");
        }
        
        @TestMetadata("NoClassNameDuplication.kt")
        public void testNoClassNameDuplication() throws Exception {
            doTest("idea/testData/completion/basic/NoClassNameDuplication.kt");
        }
        
        @TestMetadata("NoEmptyNamespace.kt")
        public void testNoEmptyNamespace() throws Exception {
            doTest("idea/testData/completion/basic/NoEmptyNamespace.kt");
        }
        
        @TestMetadata("NoObjectInTypePosition.kt")
        public void testNoObjectInTypePosition() throws Exception {
            doTest("idea/testData/completion/basic/NoObjectInTypePosition.kt");
        }
        
        @TestMetadata("NoTopLevelCompletionInQualifiedUserTypes.kt")
        public void testNoTopLevelCompletionInQualifiedUserTypes() throws Exception {
            doTest("idea/testData/completion/basic/NoTopLevelCompletionInQualifiedUserTypes.kt");
        }
        
        @TestMetadata("ObjectRedeclaration1.kt")
        public void testObjectRedeclaration1() throws Exception {
            doTest("idea/testData/completion/basic/ObjectRedeclaration1.kt");
        }
        
        @TestMetadata("ObjectRedeclaration2.kt")
        public void testObjectRedeclaration2() throws Exception {
            doTest("idea/testData/completion/basic/ObjectRedeclaration2.kt");
        }
        
        @TestMetadata("OnlyScopedClassesWithoutExplicit.kt")
        public void testOnlyScopedClassesWithoutExplicit() throws Exception {
            doTest("idea/testData/completion/basic/OnlyScopedClassesWithoutExplicit.kt");
        }
        
        @TestMetadata("OverloadFunctions.kt")
        public void testOverloadFunctions() throws Exception {
            doTest("idea/testData/completion/basic/OverloadFunctions.kt");
        }
        
        @TestMetadata("ShortClassNamesInTypePosition.kt")
        public void testShortClassNamesInTypePosition() throws Exception {
            doTest("idea/testData/completion/basic/ShortClassNamesInTypePosition.kt");
        }
        
        @TestMetadata("StandardJetArrayFirst.kt")
        public void testStandardJetArrayFirst() throws Exception {
            doTest("idea/testData/completion/basic/StandardJetArrayFirst.kt");
        }
        
        @TestMetadata("StandardJetDoubleFirst.kt")
        public void testStandardJetDoubleFirst() throws Exception {
            doTest("idea/testData/completion/basic/StandardJetDoubleFirst.kt");
        }
        
        @TestMetadata("SubpackageInFun.kt")
        public void testSubpackageInFun() throws Exception {
            doTest("idea/testData/completion/basic/SubpackageInFun.kt");
        }
        
        @TestMetadata("VariableClassName.kt")
        public void testVariableClassName() throws Exception {
            doTest("idea/testData/completion/basic/VariableClassName.kt");
        }
        
        @TestMetadata("VisibilityClassMembersFromExternal.kt")
        public void testVisibilityClassMembersFromExternal() throws Exception {
            doTest("idea/testData/completion/basic/VisibilityClassMembersFromExternal.kt");
        }
        
        @TestMetadata("VisibilityClassMembersFromExternalForce.kt")
        public void testVisibilityClassMembersFromExternalForce() throws Exception {
            doTest("idea/testData/completion/basic/VisibilityClassMembersFromExternalForce.kt");
        }
        
        @TestMetadata("VisibilityInSubclass.kt")
        public void testVisibilityInSubclass() throws Exception {
            doTest("idea/testData/completion/basic/VisibilityInSubclass.kt");
        }
        
        @TestMetadata("VisibilityInSubclassForce.kt")
        public void testVisibilityInSubclassForce() throws Exception {
            doTest("idea/testData/completion/basic/VisibilityInSubclassForce.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/completion/basic/extensions")
    public static class Extensions extends AbstractJetJSCompletionTest {
        public void testAllFilesPresentInExtensions() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/completion/basic/extensions"), Pattern.compile("^(.+)\\.kt$"), false);
        }
        
        @TestMetadata("ExtensionInExtendedClass.kt")
        public void testExtensionInExtendedClass() throws Exception {
            doTest("idea/testData/completion/basic/extensions/ExtensionInExtendedClass.kt");
        }
        
        @TestMetadata("ExtensionInExtendedClassThis.kt")
        public void testExtensionInExtendedClassThis() throws Exception {
            doTest("idea/testData/completion/basic/extensions/ExtensionInExtendedClassThis.kt");
        }
        
        @TestMetadata("ExtensionInExtension.kt")
        public void testExtensionInExtension() throws Exception {
            doTest("idea/testData/completion/basic/extensions/ExtensionInExtension.kt");
        }
        
        @TestMetadata("ExtensionInExtensionThis.kt")
        public void testExtensionInExtensionThis() throws Exception {
            doTest("idea/testData/completion/basic/extensions/ExtensionInExtensionThis.kt");
        }
        
        @TestMetadata("InvalidTypeParameters.kt")
        public void testInvalidTypeParameters() throws Exception {
            doTest("idea/testData/completion/basic/extensions/InvalidTypeParameters.kt");
        }
        
        @TestMetadata("IrrelevantExtension.kt")
        public void testIrrelevantExtension() throws Exception {
            doTest("idea/testData/completion/basic/extensions/IrrelevantExtension.kt");
        }
        
        @TestMetadata("JavaTypeExtension.kt")
        public void testJavaTypeExtension() throws Exception {
            doTest("idea/testData/completion/basic/extensions/JavaTypeExtension.kt");
        }
        
        @TestMetadata("KotlinGenericTypeExtension.kt")
        public void testKotlinGenericTypeExtension() throws Exception {
            doTest("idea/testData/completion/basic/extensions/KotlinGenericTypeExtension.kt");
        }
        
        @TestMetadata("KotlinTypeExtension.kt")
        public void testKotlinTypeExtension() throws Exception {
            doTest("idea/testData/completion/basic/extensions/KotlinTypeExtension.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/completion/basic/js")
    public static class Js extends AbstractJetJSCompletionTest {
        public void testAllFilesPresentInJs() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.GenerateTests", new File("idea/testData/completion/basic/js"), Pattern.compile("^(.+)\\.kt$"), false);
        }
        
        @TestMetadata("InPackage.kt")
        public void testInPackage() throws Exception {
            doTest("idea/testData/completion/basic/js/InPackage.kt");
        }
        
        @TestMetadata("JSStd.kt")
        public void testJSStd() throws Exception {
            doTest("idea/testData/completion/basic/js/JSStd.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("JetBasicJSCompletionTest");
        suite.addTestSuite(Basic.class);
        suite.addTestSuite(Extensions.class);
        suite.addTestSuite(Js.class);
        return suite;
    }
}
