/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir.diagnostic.compiler.based;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/boxModernJdk")
@TestDataPath("$PROJECT_ROOT")
public class LLFirBlackBoxModernJdkCodegenBasedTestGenerated extends AbstractLLFirBlackBoxCodegenBasedTest {
    @Test
    public void testAllFilesPresentInBoxModernJdk() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Nested
    @Tag("<modernJava>")
    @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava11")
    @TestDataPath("$PROJECT_ROOT")
    public class TestsWithJava11 {
        @Test
        public void testAllFilesPresentInTestsWithJava11() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava11"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("concatDynamic.kt")
        public void testConcatDynamic() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamic.kt");
        }

        @Test
        @TestMetadata("concatDynamic199Long.kt")
        public void testConcatDynamic199Long() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamic199Long.kt");
        }

        @Test
        @TestMetadata("concatDynamic200.kt")
        public void testConcatDynamic200() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamic200.kt");
        }

        @Test
        @TestMetadata("concatDynamic200Long.kt")
        public void testConcatDynamic200Long() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamic200Long.kt");
        }

        @Test
        @TestMetadata("concatDynamic201.kt")
        public void testConcatDynamic201() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamic201.kt");
        }

        @Test
        @TestMetadata("concatDynamicIndy199Long.kt")
        public void testConcatDynamicIndy199Long() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamicIndy199Long.kt");
        }

        @Test
        @TestMetadata("concatDynamicIndy200.kt")
        public void testConcatDynamicIndy200() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamicIndy200.kt");
        }

        @Test
        @TestMetadata("concatDynamicIndy200Long.kt")
        public void testConcatDynamicIndy200Long() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamicIndy200Long.kt");
        }

        @Test
        @TestMetadata("concatDynamicIndy201.kt")
        public void testConcatDynamicIndy201() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamicIndy201.kt");
        }

        @Test
        @TestMetadata("concatDynamicInlineClasses.kt")
        public void testConcatDynamicInlineClasses() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamicInlineClasses.kt");
        }

        @Test
        @TestMetadata("concatDynamicSpecialSymbols.kt")
        public void testConcatDynamicSpecialSymbols() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamicSpecialSymbols.kt");
        }

        @Test
        @TestMetadata("concatDynamicWithInline.kt")
        public void testConcatDynamicWithInline() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/concatDynamicWithInline.kt");
        }

        @Test
        @TestMetadata("kt36984.kt")
        public void testKt36984() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/kt36984.kt");
        }

        @Test
        @TestMetadata("kt47917.kt")
        public void testKt47917() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/kt47917.kt");
        }

        @Test
        @TestMetadata("kt47917_oldBackend.kt")
        public void testKt47917_oldBackend() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/kt47917_oldBackend.kt");
        }

        @Test
        @TestMetadata("kt47917_russian.kt")
        public void testKt47917_russian() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/kt47917_russian.kt");
        }

        @Test
        @TestMetadata("kt47917_surrogatePairs.kt")
        public void testKt47917_surrogatePairs() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/kt47917_surrogatePairs.kt");
        }

        @Test
        @TestMetadata("varHandle.kt")
        public void testVarHandle() throws Exception {
            runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/varHandle.kt");
        }

        @Nested
        @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag")
        @TestDataPath("$PROJECT_ROOT")
        public class ReleaseFlag {
            @Test
            public void testAllFilesPresentInReleaseFlag() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag"), Pattern.compile("^(.+)\\.kt$"), null, true);
            }

            @Nested
            @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/byteBuffer")
            @TestDataPath("$PROJECT_ROOT")
            public class ByteBuffer {
                @Test
                public void testAllFilesPresentInByteBuffer() throws Exception {
                    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/byteBuffer"), Pattern.compile("^(.+)\\.kt$"), null, true);
                }

                @Test
                @TestMetadata("byteBuffer.kt")
                public void testByteBuffer() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/byteBuffer/byteBuffer.kt");
                }

                @Test
                @TestMetadata("byteBuffer_10.kt")
                public void testByteBuffer_10() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/byteBuffer/byteBuffer_10.kt");
                }

                @Test
                @TestMetadata("byteBuffer_11.kt")
                public void testByteBuffer_11() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/byteBuffer/byteBuffer_11.kt");
                }

                @Test
                @TestMetadata("byteBuffer_6.kt")
                public void testByteBuffer_6() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/byteBuffer/byteBuffer_6.kt");
                }

                @Test
                @TestMetadata("byteBuffer_8.kt")
                public void testByteBuffer_8() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/byteBuffer/byteBuffer_8.kt");
                }

                @Test
                @TestMetadata("byteBuffer_9.kt")
                public void testByteBuffer_9() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/byteBuffer/byteBuffer_9.kt");
                }
            }

            @Nested
            @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/innerClass")
            @TestDataPath("$PROJECT_ROOT")
            public class InnerClass {
                @Test
                public void testAllFilesPresentInInnerClass() throws Exception {
                    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/innerClass"), Pattern.compile("^(.+)\\.kt$"), null, true);
                }

                @Test
                @TestMetadata("threadState_10.kt")
                public void testThreadState_10() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/innerClass/threadState_10.kt");
                }

                @Test
                @TestMetadata("threadState_11.kt")
                public void testThreadState_11() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/innerClass/threadState_11.kt");
                }

                @Test
                @TestMetadata("threadState_8.kt")
                public void testThreadState_8() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/innerClass/threadState_8.kt");
                }

                @Test
                @TestMetadata("threadState_9.kt")
                public void testThreadState_9() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/innerClass/threadState_9.kt");
                }
            }

            @Nested
            @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/reflective")
            @TestDataPath("$PROJECT_ROOT")
            public class Reflective {
                @Test
                public void testAllFilesPresentInReflective() throws Exception {
                    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/reflective"), Pattern.compile("^(.+)\\.kt$"), null, true);
                }

                @Test
                @TestMetadata("reflective.kt")
                public void testReflective() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/reflective/reflective.kt");
                }

                @Test
                @TestMetadata("reflective_10.kt")
                public void testReflective_10() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/reflective/reflective_10.kt");
                }

                @Test
                @TestMetadata("reflective_11.kt")
                public void testReflective_11() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/reflective/reflective_11.kt");
                }

                @Test
                @TestMetadata("reflective_6.kt")
                public void testReflective_6() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/reflective/reflective_6.kt");
                }

                @Test
                @TestMetadata("reflective_8.kt")
                public void testReflective_8() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/reflective/reflective_8.kt");
                }

                @Test
                @TestMetadata("reflective_9.kt")
                public void testReflective_9() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/reflective/reflective_9.kt");
                }
            }

            @Nested
            @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/withJava")
            @TestDataPath("$PROJECT_ROOT")
            public class WithJava {
                @Test
                public void testAllFilesPresentInWithJava() throws Exception {
                    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/withJava"), Pattern.compile("^(.+)\\.kt$"), null, true);
                }

                @Test
                @TestMetadata("withJava_10.kt")
                public void testWithJava_10() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/withJava/withJava_10.kt");
                }

                @Test
                @TestMetadata("withJava_11.kt")
                public void testWithJava_11() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/withJava/withJava_11.kt");
                }

                @Test
                @TestMetadata("withJava_6.kt")
                public void testWithJava_6() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/withJava/withJava_6.kt");
                }

                @Test
                @TestMetadata("withJava_8.kt")
                public void testWithJava_8() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/withJava/withJava_8.kt");
                }

                @Test
                @TestMetadata("withJava_9.kt")
                public void testWithJava_9() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava11/releaseFlag/withJava/withJava_9.kt");
                }
            }
        }
    }

    @Nested
    @Tag("<modernJava>")
    @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava17")
    @TestDataPath("$PROJECT_ROOT")
    public class TestsWithJava17 {
        @Test
        public void testAllFilesPresentInTestsWithJava17() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava17"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @Nested
        @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava17/records")
        @TestDataPath("$PROJECT_ROOT")
        public class Records {
            @Test
            public void testAllFilesPresentInRecords() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava17/records"), Pattern.compile("^(.+)\\.kt$"), null, true);
            }

            @Test
            @TestMetadata("binaryRecord.kt")
            public void testBinaryRecord() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/binaryRecord.kt");
            }

            @Test
            @TestMetadata("bytecodeShapeForJava.kt")
            public void testBytecodeShapeForJava() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/bytecodeShapeForJava.kt");
            }

            @Test
            @TestMetadata("callableReferenceToGenericRecord.kt")
            public void testCallableReferenceToGenericRecord() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/callableReferenceToGenericRecord.kt");
            }

            @Test
            @TestMetadata("collectionSizeOverrides.kt")
            public void testCollectionSizeOverrides() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/collectionSizeOverrides.kt");
            }

            @Test
            @TestMetadata("dataJvmRecord.kt")
            public void testDataJvmRecord() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/dataJvmRecord.kt");
            }

            @Test
            @TestMetadata("jvmRecordBinary.kt")
            public void testJvmRecordBinary() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/jvmRecordBinary.kt");
            }

            @Test
            @TestMetadata("kt54573.kt")
            public void testKt54573() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/kt54573.kt");
            }

            @Test
            @TestMetadata("propertiesOverrides.kt")
            public void testPropertiesOverrides() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/propertiesOverrides.kt");
            }

            @Test
            @TestMetadata("propertiesOverridesAllCompatibilityJvmDefault.kt")
            public void testPropertiesOverridesAllCompatibilityJvmDefault() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/propertiesOverridesAllCompatibilityJvmDefault.kt");
            }

            @Test
            @TestMetadata("propertiesOverridesAllJvmDefault.kt")
            public void testPropertiesOverridesAllJvmDefault() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/propertiesOverridesAllJvmDefault.kt");
            }

            @Test
            @TestMetadata("recordDifferentPropertyOverride.kt")
            public void testRecordDifferentPropertyOverride() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/recordDifferentPropertyOverride.kt");
            }

            @Test
            @TestMetadata("recordDifferentSyntheticProperty.kt")
            public void testRecordDifferentSyntheticProperty() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/recordDifferentSyntheticProperty.kt");
            }

            @Test
            @TestMetadata("recordPropertyAccess.kt")
            public void testRecordPropertyAccess() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/recordPropertyAccess.kt");
            }

            @Test
            @TestMetadata("recordWithCompanion.kt")
            public void testRecordWithCompanion() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/records/recordWithCompanion.kt");
            }
        }

        @Nested
        @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag")
        @TestDataPath("$PROJECT_ROOT")
        public class ReleaseFlag {
            @Test
            public void testAllFilesPresentInReleaseFlag() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag"), Pattern.compile("^(.+)\\.kt$"), null, true);
            }

            @Nested
            @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer")
            @TestDataPath("$PROJECT_ROOT")
            public class ByteBuffer {
                @Test
                public void testAllFilesPresentInByteBuffer() throws Exception {
                    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer"), Pattern.compile("^(.+)\\.kt$"), null, true);
                }

                @Test
                @TestMetadata("byteBuffer.kt")
                public void testByteBuffer() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer/byteBuffer.kt");
                }

                @Test
                @TestMetadata("byteBuffer_10.kt")
                public void testByteBuffer_10() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer/byteBuffer_10.kt");
                }

                @Test
                @TestMetadata("byteBuffer_11.kt")
                public void testByteBuffer_11() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer/byteBuffer_11.kt");
                }

                @Test
                @TestMetadata("byteBuffer_12.kt")
                public void testByteBuffer_12() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer/byteBuffer_12.kt");
                }

                @Test
                @TestMetadata("byteBuffer_13.kt")
                public void testByteBuffer_13() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer/byteBuffer_13.kt");
                }

                @Test
                @TestMetadata("byteBuffer_14.kt")
                public void testByteBuffer_14() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer/byteBuffer_14.kt");
                }

                @Test
                @TestMetadata("byteBuffer_15.kt")
                public void testByteBuffer_15() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer/byteBuffer_15.kt");
                }

                @Test
                @TestMetadata("byteBuffer_16.kt")
                public void testByteBuffer_16() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer/byteBuffer_16.kt");
                }

                @Test
                @TestMetadata("byteBuffer_17.kt")
                public void testByteBuffer_17() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer/byteBuffer_17.kt");
                }

                @Test
                @TestMetadata("byteBuffer_8.kt")
                public void testByteBuffer_8() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer/byteBuffer_8.kt");
                }

                @Test
                @TestMetadata("byteBuffer_9.kt")
                public void testByteBuffer_9() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/byteBuffer/byteBuffer_9.kt");
                }
            }

            @Nested
            @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable")
            @TestDataPath("$PROJECT_ROOT")
            public class Constable {
                @Test
                public void testAllFilesPresentInConstable() throws Exception {
                    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable"), Pattern.compile("^(.+)\\.kt$"), null, true);
                }

                @Test
                @TestMetadata("constable.kt")
                public void testConstable() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable/constable.kt");
                }

                @Test
                @TestMetadata("constable_10.kt")
                public void testConstable_10() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable/constable_10.kt");
                }

                @Test
                @TestMetadata("constable_11.kt")
                public void testConstable_11() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable/constable_11.kt");
                }

                @Test
                @TestMetadata("constable_12.kt")
                public void testConstable_12() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable/constable_12.kt");
                }

                @Test
                @TestMetadata("constable_13.kt")
                public void testConstable_13() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable/constable_13.kt");
                }

                @Test
                @TestMetadata("constable_14.kt")
                public void testConstable_14() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable/constable_14.kt");
                }

                @Test
                @TestMetadata("constable_15.kt")
                public void testConstable_15() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable/constable_15.kt");
                }

                @Test
                @TestMetadata("constable_16.kt")
                public void testConstable_16() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable/constable_16.kt");
                }

                @Test
                @TestMetadata("constable_17.kt")
                public void testConstable_17() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable/constable_17.kt");
                }

                @Test
                @TestMetadata("constable_8.kt")
                public void testConstable_8() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable/constable_8.kt");
                }

                @Test
                @TestMetadata("constable_9.kt")
                public void testConstable_9() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/constable/constable_9.kt");
                }
            }

            @Nested
            @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass")
            @TestDataPath("$PROJECT_ROOT")
            public class InnerClass {
                @Test
                public void testAllFilesPresentInInnerClass() throws Exception {
                    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass"), Pattern.compile("^(.+)\\.kt$"), null, true);
                }

                @Test
                @TestMetadata("threadState_10.kt")
                public void testThreadState_10() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass/threadState_10.kt");
                }

                @Test
                @TestMetadata("threadState_11.kt")
                public void testThreadState_11() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass/threadState_11.kt");
                }

                @Test
                @TestMetadata("threadState_12.kt")
                public void testThreadState_12() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass/threadState_12.kt");
                }

                @Test
                @TestMetadata("threadState_13.kt")
                public void testThreadState_13() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass/threadState_13.kt");
                }

                @Test
                @TestMetadata("threadState_14.kt")
                public void testThreadState_14() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass/threadState_14.kt");
                }

                @Test
                @TestMetadata("threadState_15.kt")
                public void testThreadState_15() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass/threadState_15.kt");
                }

                @Test
                @TestMetadata("threadState_16.kt")
                public void testThreadState_16() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass/threadState_16.kt");
                }

                @Test
                @TestMetadata("threadState_17.kt")
                public void testThreadState_17() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass/threadState_17.kt");
                }

                @Test
                @TestMetadata("threadState_8.kt")
                public void testThreadState_8() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass/threadState_8.kt");
                }

                @Test
                @TestMetadata("threadState_9.kt")
                public void testThreadState_9() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/innerClass/threadState_9.kt");
                }
            }

            @Nested
            @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava")
            @TestDataPath("$PROJECT_ROOT")
            public class WithJava {
                @Test
                public void testAllFilesPresentInWithJava() throws Exception {
                    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava"), Pattern.compile("^(.+)\\.kt$"), null, true);
                }

                @Test
                @TestMetadata("withJava_10.kt")
                public void testWithJava_10() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava/withJava_10.kt");
                }

                @Test
                @TestMetadata("withJava_11.kt")
                public void testWithJava_11() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava/withJava_11.kt");
                }

                @Test
                @TestMetadata("withJava_12.kt")
                public void testWithJava_12() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava/withJava_12.kt");
                }

                @Test
                @TestMetadata("withJava_13.kt")
                public void testWithJava_13() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava/withJava_13.kt");
                }

                @Test
                @TestMetadata("withJava_14.kt")
                public void testWithJava_14() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava/withJava_14.kt");
                }

                @Test
                @TestMetadata("withJava_15.kt")
                public void testWithJava_15() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava/withJava_15.kt");
                }

                @Test
                @TestMetadata("withJava_16.kt")
                public void testWithJava_16() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava/withJava_16.kt");
                }

                @Test
                @TestMetadata("withJava_17.kt")
                public void testWithJava_17() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava/withJava_17.kt");
                }

                @Test
                @TestMetadata("withJava_8.kt")
                public void testWithJava_8() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava/withJava_8.kt");
                }

                @Test
                @TestMetadata("withJava_9.kt")
                public void testWithJava_9() throws Exception {
                    runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/releaseFlag/withJava/withJava_9.kt");
                }
            }
        }

        @Nested
        @TestMetadata("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed")
        @TestDataPath("$PROJECT_ROOT")
        public class Sealed {
            @Test
            public void testAllFilesPresentInSealed() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed"), Pattern.compile("^(.+)\\.kt$"), null, true);
            }

            @Test
            @TestMetadata("compiledJavaSealedClass.kt")
            public void testCompiledJavaSealedClass() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed/compiledJavaSealedClass.kt");
            }

            @Test
            @TestMetadata("compiledJavaSealedInterface.kt")
            public void testCompiledJavaSealedInterface() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed/compiledJavaSealedInterface.kt");
            }

            @Test
            @TestMetadata("javaExhaustiveWhenOnKotlinSealedClass.kt")
            public void testJavaExhaustiveWhenOnKotlinSealedClass() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed/javaExhaustiveWhenOnKotlinSealedClass.kt");
            }

            @Test
            @TestMetadata("javaRecordsViaKotlinReflection.kt")
            public void testJavaRecordsViaKotlinReflection() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed/javaRecordsViaKotlinReflection.kt");
            }

            @Test
            @TestMetadata("javaSealedClass.kt")
            public void testJavaSealedClass() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed/javaSealedClass.kt");
            }

            @Test
            @TestMetadata("javaSealedInterface.kt")
            public void testJavaSealedInterface() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed/javaSealedInterface.kt");
            }

            @Test
            @TestMetadata("kotlinExhaustiveWhenOnJavaSealedClass.kt")
            public void testKotlinExhaustiveWhenOnJavaSealedClass() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed/kotlinExhaustiveWhenOnJavaSealedClass.kt");
            }

            @Test
            @TestMetadata("permittedSubclassesOfSealedKotlinClass.kt")
            public void testPermittedSubclassesOfSealedKotlinClass() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed/permittedSubclassesOfSealedKotlinClass.kt");
            }

            @Test
            @TestMetadata("sealedJavaClassViaJavaReflection.kt")
            public void testSealedJavaClassViaJavaReflection() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed/sealedJavaClassViaJavaReflection.kt");
            }

            @Test
            @TestMetadata("sealedJavaClassViaKotlinReflection.kt")
            public void testSealedJavaClassViaKotlinReflection() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed/sealedJavaClassViaKotlinReflection.kt");
            }

            @Test
            @TestMetadata("sealedJavaInterfaceViaKotlinReflection.kt")
            public void testSealedJavaInterfaceViaKotlinReflection() throws Exception {
                runTest("compiler/testData/codegen/boxModernJdk/testsWithJava17/sealed/sealedJavaInterfaceViaKotlinReflection.kt");
            }
        }
    }
}
