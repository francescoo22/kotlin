/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.psiTypeProvider;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.psiTypeProvider.AbstractAnalysisApiKtTypeByPsiTypeProviderTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeDependentAnalysisSourceModuleAnalysisApiKtTypeByPsiTypeProviderTestGenerated extends AbstractAnalysisApiKtTypeByPsiTypeProviderTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.Source,
                AnalysisSessionMode.Dependent,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInAsKtType() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("anonym.kt")
    public void testAnonym() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/anonym.kt");
    }

    @Test
    @TestMetadata("extends.kt")
    public void testExtends() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/extends.kt");
    }

    @Test
    @TestMetadata("methodTypeParameters.kt")
    public void testMethodTypeParameters() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/methodTypeParameters.kt");
    }

    @Test
    @TestMetadata("nestedGenerics.kt")
    public void testNestedGenerics() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/nestedGenerics.kt");
    }

    @Test
    @TestMetadata("nullableString.kt")
    public void testNullableString() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/nullableString.kt");
    }

    @Test
    @TestMetadata("primitive.kt")
    public void testPrimitive() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/primitive.kt");
    }

    @Test
    @TestMetadata("typeParameters.kt")
    public void testTypeParameters() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/typeParameters.kt");
    }

    @Test
    @TestMetadata("typeParameters2.kt")
    public void testTypeParameters2() throws Exception {
        runTest("analysis/analysis-api/testData/components/psiTypeProvider/psiType/asKtType/typeParameters2.kt");
    }
}
