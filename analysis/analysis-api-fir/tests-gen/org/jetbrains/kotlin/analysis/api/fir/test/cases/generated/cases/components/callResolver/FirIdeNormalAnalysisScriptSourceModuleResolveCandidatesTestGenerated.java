/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.components.callResolver;

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
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.callResolver.AbstractResolveCandidatesTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCandidates")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisScriptSourceModuleResolveCandidatesTestGenerated extends AbstractResolveCandidatesTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.ScriptSource,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInResolveCandidates() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCandidates"), Pattern.compile("^(.+)\\.kts$"), null, true);
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates")
    @TestDataPath("$PROJECT_ROOT")
    public class MultipleCandidates {
        @Test
        public void testAllFilesPresentInMultipleCandidates() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCandidates/multipleCandidates"), Pattern.compile("^(.+)\\.kts$"), null, true);
        }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates")
    @TestDataPath("$PROJECT_ROOT")
    public class NoCandidates {
        @Test
        public void testAllFilesPresentInNoCandidates() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCandidates/noCandidates"), Pattern.compile("^(.+)\\.kts$"), null, true);
        }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate")
    @TestDataPath("$PROJECT_ROOT")
    public class SingleCandidate {
        @Test
        public void testAllFilesPresentInSingleCandidate() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/callResolver/resolveCandidates/singleCandidate"), Pattern.compile("^(.+)\\.kts$"), null, true);
        }
    }
}
