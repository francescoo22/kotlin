/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.components.typeInfoProvider;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.typeInfoProvider.AbstractIsDenotableTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/typeInfoProvider/isDenotable")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleIsDenotableTestGenerated extends AbstractIsDenotableTest {
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
    public void testAllFilesPresentInIsDenotable() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/typeInfoProvider/isDenotable"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile(".*\\.descriptors\\.kt$"), true);
    }

    @Test
    @TestMetadata("localTypes.kt")
    public void testLocalTypes() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeInfoProvider/isDenotable/localTypes.kt");
    }

    @Test
    @TestMetadata("simpleTypes.kt")
    public void testSimpleTypes() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeInfoProvider/isDenotable/simpleTypes.kt");
    }

    @Test
    @TestMetadata("smartcast.kt")
    public void testSmartcast() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeInfoProvider/isDenotable/smartcast.kt");
    }

    @Test
    @TestMetadata("typeParameter.kt")
    public void testTypeParameter() throws Exception {
        runTest("analysis/analysis-api/testData/components/typeInfoProvider/isDenotable/typeParameter.kt");
    }
}
