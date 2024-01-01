/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.components.symbolInfoProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fe10.test.configurator.AnalysisApiFe10TestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.symbolInfoProvider.AbstractAnnotationApplicableTargetsTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/symbolInfoProvider/annotationApplicableTargets")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleAnnotationApplicableTargetsTestGenerated extends AbstractAnnotationApplicableTargetsTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFe10TestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fe10,
                TestModuleKind.Source,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInAnnotationApplicableTargets() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/symbolInfoProvider/annotationApplicableTargets"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("defaultTargets.kt")
    public void testDefaultTargets() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolInfoProvider/annotationApplicableTargets/defaultTargets.kt");
    }

    @Test
    @TestMetadata("emptyTargets.kt")
    public void testEmptyTargets() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolInfoProvider/annotationApplicableTargets/emptyTargets.kt");
    }

    @Test
    @TestMetadata("javaAnnotation.kt")
    public void testJavaAnnotation() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolInfoProvider/annotationApplicableTargets/javaAnnotation.kt");
    }

    @Test
    @TestMetadata("listedTargets.kt")
    public void testListedTargets() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolInfoProvider/annotationApplicableTargets/listedTargets.kt");
    }

    @Test
    @TestMetadata("nonAnnotationClass.kt")
    public void testNonAnnotationClass() throws Exception {
        runTest("analysis/analysis-api/testData/components/symbolInfoProvider/annotationApplicableTargets/nonAnnotationClass.kt");
    }
}
