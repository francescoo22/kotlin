/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.FirPipeline;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.UseStandardTestCaseGroupProvider;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
public class FirInfrastructureTestGenerated extends AbstractNativeBlackBoxTest {
    @Nested
    @TestMetadata("native/native.tests/testData/samples")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("infrastructure")
    @Tag("frontend-fir")
    @FirPipeline()
    @UseStandardTestCaseGroupProvider()
    public class Samples {
        @Test
        public void testAllFilesPresentInSamples() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/samples"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("regular_custom_args.kt")
        public void testRegular_custom_args() throws Exception {
            runTest("native/native.tests/testData/samples/regular_custom_args.kt");
        }

        @Test
        @TestMetadata("regular_multifile.kt")
        public void testRegular_multifile() throws Exception {
            runTest("native/native.tests/testData/samples/regular_multifile.kt");
        }

        @Test
        @TestMetadata("regular_multifile_with_explicit_packages.kt")
        public void testRegular_multifile_with_explicit_packages() throws Exception {
            runTest("native/native.tests/testData/samples/regular_multifile_with_explicit_packages.kt");
        }

        @Test
        @TestMetadata("regular_multimodule.kt")
        public void testRegular_multimodule() throws Exception {
            runTest("native/native.tests/testData/samples/regular_multimodule.kt");
        }

        @Test
        @TestMetadata("regular_multimodule_implicit_first_module.kt")
        public void testRegular_multimodule_implicit_first_module() throws Exception {
            runTest("native/native.tests/testData/samples/regular_multimodule_implicit_first_module.kt");
        }

        @Test
        @TestMetadata("regular_multimodule_implicit_first_module_with_header_comment.kt")
        public void testRegular_multimodule_implicit_first_module_with_header_comment() throws Exception {
            runTest("native/native.tests/testData/samples/regular_multimodule_implicit_first_module_with_header_comment.kt");
        }

        @Test
        @TestMetadata("regular_multimodule_implicit_first_module_with_header_statement.kt")
        public void testRegular_multimodule_implicit_first_module_with_header_statement() throws Exception {
            runTest("native/native.tests/testData/samples/regular_multimodule_implicit_first_module_with_header_statement.kt");
        }

        @Test
        @TestMetadata("regular_multimodule_with_header_comment.kt")
        public void testRegular_multimodule_with_header_comment() throws Exception {
            runTest("native/native.tests/testData/samples/regular_multimodule_with_header_comment.kt");
        }

        @Test
        @TestMetadata("regular_multimodule_with_header_statement.kt")
        public void testRegular_multimodule_with_header_statement() throws Exception {
            runTest("native/native.tests/testData/samples/regular_multimodule_with_header_statement.kt");
        }

        @Test
        @TestMetadata("regular_simple.kt")
        public void testRegular_simple() throws Exception {
            runTest("native/native.tests/testData/samples/regular_simple.kt");
        }

        @Test
        @TestMetadata("regular_simple_default_tr.kt")
        public void testRegular_simple_default_tr() throws Exception {
            runTest("native/native.tests/testData/samples/regular_simple_default_tr.kt");
        }

        @Test
        @TestMetadata("regular_simple_explicit_kind.kt")
        public void testRegular_simple_explicit_kind() throws Exception {
            runTest("native/native.tests/testData/samples/regular_simple_explicit_kind.kt");
        }

        @Test
        @TestMetadata("regular_simple_noexit_tr.kt")
        public void testRegular_simple_noexit_tr() throws Exception {
            runTest("native/native.tests/testData/samples/regular_simple_noexit_tr.kt");
        }

        @Test
        @TestMetadata("regular_simple_with_output.kt")
        public void testRegular_simple_with_output() throws Exception {
            runTest("native/native.tests/testData/samples/regular_simple_with_output.kt");
        }

        @Test
        @TestMetadata("regular_simple_worker_tr.kt")
        public void testRegular_simple_worker_tr() throws Exception {
            runTest("native/native.tests/testData/samples/regular_simple_worker_tr.kt");
        }

        @Test
        @TestMetadata("standalone_lldb_stepping.kt")
        public void testStandalone_lldb_stepping() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_lldb_stepping.kt");
        }

        @Test
        @TestMetadata("standalone_multifile.kt")
        public void testStandalone_multifile() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_multifile.kt");
        }

        @Test
        @TestMetadata("standalone_notr_long_running.kt")
        public void testStandalone_notr_long_running() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_long_running.kt");
        }

        @Test
        @TestMetadata("standalone_notr_long_running_and_verbose.kt")
        public void testStandalone_notr_long_running_and_verbose() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_long_running_and_verbose.kt");
        }

        @Test
        @TestMetadata("standalone_notr_multifile_entry_point.kt")
        public void testStandalone_notr_multifile_entry_point() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_multifile_entry_point.kt");
        }

        @Test
        @TestMetadata("standalone_notr_nonzero_exit_code.kt")
        public void testStandalone_notr_nonzero_exit_code() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_nonzero_exit_code.kt");
        }

        @Test
        @TestMetadata("standalone_notr_nonzero_exit_code2.kt")
        public void testStandalone_notr_nonzero_exit_code2() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_nonzero_exit_code2.kt");
        }

        @Test
        @TestMetadata("standalone_notr_simple.kt")
        public void testStandalone_notr_simple() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_simple.kt");
        }

        @Test
        @TestMetadata("standalone_notr_simple2.kt")
        public void testStandalone_notr_simple2() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_simple2.kt");
        }

        @Test
        @TestMetadata("standalone_notr_simple_entry_point.kt")
        public void testStandalone_notr_simple_entry_point() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_simple_entry_point.kt");
        }

        @Test
        @TestMetadata("standalone_notr_simple_entry_point2.kt")
        public void testStandalone_notr_simple_entry_point2() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_simple_entry_point2.kt");
        }

        @Test
        @TestMetadata("standalone_notr_simple_with_input_and_output.kt")
        public void testStandalone_notr_simple_with_input_and_output() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_simple_with_input_and_output.kt");
        }

        @Test
        @TestMetadata("standalone_notr_simple_with_output.kt")
        public void testStandalone_notr_simple_with_output() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_simple_with_output.kt");
        }

        @Test
        @TestMetadata("standalone_notr_too_verbose.kt")
        public void testStandalone_notr_too_verbose() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_too_verbose.kt");
        }

        @Test
        @TestMetadata("standalone_notr_zero_exit_code.kt")
        public void testStandalone_notr_zero_exit_code() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_notr_zero_exit_code.kt");
        }

        @Test
        @TestMetadata("standalone_simple.kt")
        public void testStandalone_simple() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_simple.kt");
        }

        @Test
        @TestMetadata("standalone_simple_default_tr.kt")
        public void testStandalone_simple_default_tr() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_simple_default_tr.kt");
        }

        @Test
        @TestMetadata("standalone_simple_noexit_tr.kt")
        public void testStandalone_simple_noexit_tr() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_simple_noexit_tr.kt");
        }

        @Test
        @TestMetadata("standalone_simple_with_output.kt")
        public void testStandalone_simple_with_output() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_simple_with_output.kt");
        }

        @Test
        @TestMetadata("standalone_simple_worker_tr.kt")
        public void testStandalone_simple_worker_tr() throws Exception {
            runTest("native/native.tests/testData/samples/standalone_simple_worker_tr.kt");
        }

        @Nested
        @TestMetadata("native/native.tests/testData/samples/inner")
        @TestDataPath("$PROJECT_ROOT")
        @Tag("infrastructure")
        @Tag("frontend-fir")
        @FirPipeline()
        @UseStandardTestCaseGroupProvider()
        public class Inner {
            @Test
            public void testAllFilesPresentInInner() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/samples/inner"), Pattern.compile("^(.+)\\.kt$"), null, true);
            }

            @Test
            @TestMetadata("regular_simple.kt")
            public void testRegular_simple() throws Exception {
                runTest("native/native.tests/testData/samples/inner/regular_simple.kt");
            }
        }
    }

    @Nested
    @TestMetadata("native/native.tests/testData/samples2")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("infrastructure")
    @Tag("frontend-fir")
    @FirPipeline()
    @UseStandardTestCaseGroupProvider()
    public class Samples2 {
        @Test
        public void testAllFilesPresentInSamples2() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/samples2"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("regular_simple.kt")
        public void testRegular_simple() throws Exception {
            runTest("native/native.tests/testData/samples2/regular_simple.kt");
        }
    }
}
