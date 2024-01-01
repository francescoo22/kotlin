/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.scopeProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.scopeProvider.AbstractDeclaredMemberScopeTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleDeclaredMemberScopeTestGenerated extends AbstractDeclaredMemberScopeTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInDeclaredMemberScope() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("class.kt")
    public void testClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/class.kt");
    }

    @Test
    @TestMetadata("delegateInterface.kt")
    public void testDelegateInterface() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/delegateInterface.kt");
    }

    @Test
    @TestMetadata("delegateInterfaceLibrary.kt")
    public void testDelegateInterfaceLibrary() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/delegateInterfaceLibrary.kt");
    }

    @Test
    @TestMetadata("enumClass.kt")
    public void testEnumClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/enumClass.kt");
    }

    @Test
    @TestMetadata("enumClassWithAbstractMembers.kt")
    public void testEnumClassWithAbstractMembers() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/enumClassWithAbstractMembers.kt");
    }

    @Test
    @TestMetadata("enumClassWithFinalMembers.kt")
    public void testEnumClassWithFinalMembers() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/enumClassWithFinalMembers.kt");
    }

    @Test
    @TestMetadata("enumEntryInitializer.kt")
    public void testEnumEntryInitializer() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/enumEntryInitializer.kt");
    }

    @Test
    @TestMetadata("enumEntryInitializerWithEmptyBody.kt")
    public void testEnumEntryInitializerWithEmptyBody() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/enumEntryInitializerWithEmptyBody.kt");
    }

    @Test
    @TestMetadata("enumEntryInitializerWithFinalEnumMember.kt")
    public void testEnumEntryInitializerWithFinalEnumMember() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/enumEntryInitializerWithFinalEnumMember.kt");
    }

    @Test
    @TestMetadata("enumEntryInitializerWithOverriddenMember.kt")
    public void testEnumEntryInitializerWithOverriddenMember() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/enumEntryInitializerWithOverriddenMember.kt");
    }

    @Test
    @TestMetadata("innerClass.kt")
    public void testInnerClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/innerClass.kt");
    }

    @Test
    @TestMetadata("javaClass.kt")
    public void testJavaClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/javaClass.kt");
    }

    @Test
    @TestMetadata("javaDeclaredEnhancementScope.kt")
    public void testJavaDeclaredEnhancementScope() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/javaDeclaredEnhancementScope.kt");
    }

    @Test
    @TestMetadata("javaDeclaredInheritList.kt")
    public void testJavaDeclaredInheritList() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/javaDeclaredInheritList.kt");
    }

    @Test
    @TestMetadata("javaInnerClassConstructor.kt")
    public void testJavaInnerClassConstructor() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/declaredMemberScope/javaInnerClassConstructor.kt");
    }
}
