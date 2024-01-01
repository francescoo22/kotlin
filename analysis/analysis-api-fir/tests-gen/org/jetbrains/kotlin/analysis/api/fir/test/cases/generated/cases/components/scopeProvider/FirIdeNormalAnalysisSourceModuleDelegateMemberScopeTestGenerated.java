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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.scopeProvider.AbstractDelegateMemberScopeTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/scopeProvider/delegatedMemberScope")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisSourceModuleDelegateMemberScopeTestGenerated extends AbstractDelegateMemberScopeTest {
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
    public void testAllFilesPresentInDelegatedMemberScope() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/scopeProvider/delegatedMemberScope"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("propertyWithGetter.kt")
    public void testPropertyWithGetter() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/delegatedMemberScope/propertyWithGetter.kt");
    }

    @Test
    @TestMetadata("simple.kt")
    public void testSimple() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/delegatedMemberScope/simple.kt");
    }

    @Test
    @TestMetadata("simpleLibrary.kt")
    public void testSimpleLibrary() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/delegatedMemberScope/simpleLibrary.kt");
    }

    @Test
    @TestMetadata("withImplicitType.kt")
    public void testWithImplicitType() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/delegatedMemberScope/withImplicitType.kt");
    }

    @Test
    @TestMetadata("withOverridden.kt")
    public void testWithOverridden() throws Exception {
        runTest("analysis/analysis-api/testData/components/scopeProvider/delegatedMemberScope/withOverridden.kt");
    }
}
