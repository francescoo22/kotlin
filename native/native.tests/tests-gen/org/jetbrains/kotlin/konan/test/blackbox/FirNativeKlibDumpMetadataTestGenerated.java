/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.FirPipeline;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/native.tests/testData/klib/dump-metadata")
@TestDataPath("$PROJECT_ROOT")
@Tag("frontend-fir")
@FirPipeline()
public class FirNativeKlibDumpMetadataTestGenerated extends AbstractNativeKlibDumpMetadataTest {
    @Test
    @TestMetadata("Accessors.kt")
    public void testAccessors() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/Accessors.kt");
    }

    @Test
    public void testAllFilesPresentInDump_metadata() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/klib/dump-metadata"), Pattern.compile("^([^_](.+)).kt$"), null, true);
    }

    @Test
    @TestMetadata("annotations.kt")
    public void testAnnotations() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/annotations.kt");
    }

    @Test
    @TestMetadata("annotations_source_retention.kt")
    public void testAnnotations_source_retention() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/annotations_source_retention.kt");
    }

    @Test
    @TestMetadata("Classes.kt")
    public void testClasses() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/Classes.kt");
    }

    @Test
    @TestMetadata("Constructors.kt")
    public void testConstructors() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/Constructors.kt");
    }

    @Test
    @TestMetadata("data_class.kt")
    public void testData_class() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/data_class.kt");
    }

    @Test
    @TestMetadata("Enum.kt")
    public void testEnum() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/Enum.kt");
    }

    @Test
    @TestMetadata("FunctionModifiers.kt")
    public void testFunctionModifiers() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/FunctionModifiers.kt");
    }

    @Test
    @TestMetadata("kt55464_serializeTypeAnnotation.kt")
    public void testKt55464_serializeTypeAnnotation() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/kt55464_serializeTypeAnnotation.kt");
    }

    @Test
    @TestMetadata("kt56018_value_parameters_annotations.kt")
    public void testKt56018_value_parameters_annotations() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/kt56018_value_parameters_annotations.kt");
    }

    @Test
    @TestMetadata("MethodModality.kt")
    public void testMethodModality() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/MethodModality.kt");
    }

    @Test
    @TestMetadata("Objects.kt")
    public void testObjects() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/Objects.kt");
    }

    @Test
    @TestMetadata("property_accessors.kt")
    public void testProperty_accessors() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/property_accessors.kt");
    }

    @Test
    @TestMetadata("TopLevelFunctions.kt")
    public void testTopLevelFunctions() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/TopLevelFunctions.kt");
    }

    @Test
    @TestMetadata("TopLevelPropertiesCustomPackage.kt")
    public void testTopLevelPropertiesCustomPackage() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/TopLevelPropertiesCustomPackage.kt");
    }

    @Test
    @TestMetadata("TopLevelPropertiesRootPackage.kt")
    public void testTopLevelPropertiesRootPackage() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/TopLevelPropertiesRootPackage.kt");
    }

    @Test
    @TestMetadata("TopLevelPropertiesWithClassesCustomPackage.kt")
    public void testTopLevelPropertiesWithClassesCustomPackage() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/TopLevelPropertiesWithClassesCustomPackage.kt");
    }

    @Test
    @TestMetadata("TopLevelPropertiesWithClassesRootPackage.kt")
    public void testTopLevelPropertiesWithClassesRootPackage() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/TopLevelPropertiesWithClassesRootPackage.kt");
    }

    @Test
    @TestMetadata("type_annotations.kt")
    public void testType_annotations() throws Exception {
        runTest("native/native.tests/testData/klib/dump-metadata/type_annotations.kt");
    }

    @Nested
    @TestMetadata("native/native.tests/testData/klib/dump-metadata/builtinsSerializer")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("frontend-fir")
    @FirPipeline()
    public class BuiltinsSerializer {
        @Test
        public void testAllFilesPresentInBuiltinsSerializer() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/klib/dump-metadata/builtinsSerializer"), Pattern.compile("^([^_](.+)).kt$"), null, true);
        }

        @Test
        @TestMetadata("annotatedEnumEntry.kt")
        public void testAnnotatedEnumEntry() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/annotatedEnumEntry.kt");
        }

        @Test
        @TestMetadata("annotationTargets.kt")
        public void testAnnotationTargets() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/annotationTargets.kt");
        }

        @Test
        @TestMetadata("binaryRetainedAnnotation.kt")
        public void testBinaryRetainedAnnotation() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/binaryRetainedAnnotation.kt");
        }

        @Test
        @TestMetadata("compileTimeConstants.kt")
        public void testCompileTimeConstants() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/compileTimeConstants.kt");
        }

        @Test
        @TestMetadata("nestedClassesAndObjects.kt")
        public void testNestedClassesAndObjects() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/nestedClassesAndObjects.kt");
        }

        @Test
        @TestMetadata("propertyAccessorAnnotations.kt")
        public void testPropertyAccessorAnnotations() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/propertyAccessorAnnotations.kt");
        }

        @Test
        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/simple.kt");
        }

        @Test
        @TestMetadata("sourceRetainedAnnotation.kt")
        public void testSourceRetainedAnnotation() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/sourceRetainedAnnotation.kt");
        }

        @Test
        @TestMetadata("stringConcatenation.kt")
        public void testStringConcatenation() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/stringConcatenation.kt");
        }

        @Test
        @TestMetadata("typeParameterAnnotation.kt")
        public void testTypeParameterAnnotation() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/typeParameterAnnotation.kt");
        }

        @Nested
        @TestMetadata("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/annotationArguments")
        @TestDataPath("$PROJECT_ROOT")
        @Tag("frontend-fir")
        @FirPipeline()
        public class AnnotationArguments {
            @Test
            public void testAllFilesPresentInAnnotationArguments() throws Exception {
                KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/annotationArguments"), Pattern.compile("^([^_](.+)).kt$"), null, true);
            }

            @Test
            @TestMetadata("annotation.kt")
            public void testAnnotation() throws Exception {
                runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/annotationArguments/annotation.kt");
            }

            @Test
            @TestMetadata("enum.kt")
            public void testEnum() throws Exception {
                runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/annotationArguments/enum.kt");
            }

            @Test
            @TestMetadata("primitiveArrays.kt")
            public void testPrimitiveArrays() throws Exception {
                runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/annotationArguments/primitiveArrays.kt");
            }

            @Test
            @TestMetadata("primitives.kt")
            public void testPrimitives() throws Exception {
                runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/annotationArguments/primitives.kt");
            }

            @Test
            @TestMetadata("string.kt")
            public void testString() throws Exception {
                runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/annotationArguments/string.kt");
            }

            @Test
            @TestMetadata("varargs.kt")
            public void testVarargs() throws Exception {
                runTest("native/native.tests/testData/klib/dump-metadata/builtinsSerializer/annotationArguments/varargs.kt");
            }
        }
    }

    @Nested
    @TestMetadata("native/native.tests/testData/klib/dump-metadata/klib")
    @TestDataPath("$PROJECT_ROOT")
    @Tag("frontend-fir")
    @FirPipeline()
    public class Klib {
        @Test
        public void testAllFilesPresentInKlib() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/testData/klib/dump-metadata/klib"), Pattern.compile("^([^_](.+)).kt$"), null, true);
        }

        @Test
        @TestMetadata("fieldAnnotations.kt")
        public void testFieldAnnotations() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/klib/fieldAnnotations.kt");
        }

        @Test
        @TestMetadata("receiverAnnotations.kt")
        public void testReceiverAnnotations() throws Exception {
            runTest("native/native.tests/testData/klib/dump-metadata/klib/receiverAnnotations.kt");
        }
    }
}
