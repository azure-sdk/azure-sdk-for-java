// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.InputDeliveryMode;
import com.azure.resourcemanager.machinelearning.models.LogVerbosity;
import com.azure.resourcemanager.machinelearning.models.MLTableJobInput;
import com.azure.resourcemanager.machinelearning.models.NlpVerticalFeaturizationSettings;
import com.azure.resourcemanager.machinelearning.models.NlpVerticalLimitSettings;
import com.azure.resourcemanager.machinelearning.models.TextClassificationMultilabel;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class TextClassificationMultilabelTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TextClassificationMultilabel model = BinaryData.fromString(
            "{\"taskType\":\"TextClassificationMultilabel\",\"primaryMetric\":\"NormMacroRecall\",\"limitSettings\":{\"timeout\":\"PT197H4M37S\",\"maxTrials\":470605377,\"maxConcurrentTrials\":1118935796},\"featurizationSettings\":{\"datasetLanguage\":\"xagf\"},\"validationData\":{\"jobInputType\":\"mltable\",\"uri\":\"dbqjnye\",\"mode\":\"Direct\",\"description\":\"gxqqqasfeooqftp\"},\"logVerbosity\":\"NotSet\",\"trainingData\":{\"jobInputType\":\"mltable\",\"uri\":\"tarp\",\"mode\":\"ReadOnlyMount\",\"description\":\"liiqeanu\"},\"targetColumnName\":\"jno\"}")
            .toObject(TextClassificationMultilabel.class);
        Assertions.assertEquals(LogVerbosity.NOT_SET, model.logVerbosity());
        Assertions.assertEquals("liiqeanu", model.trainingData().description());
        Assertions.assertEquals("tarp", model.trainingData().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.trainingData().mode());
        Assertions.assertEquals("jno", model.targetColumnName());
        Assertions.assertEquals(Duration.parse("PT197H4M37S"), model.limitSettings().timeout());
        Assertions.assertEquals(470605377, model.limitSettings().maxTrials());
        Assertions.assertEquals(1118935796, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals("xagf", model.featurizationSettings().datasetLanguage());
        Assertions.assertEquals("gxqqqasfeooqftp", model.validationData().description());
        Assertions.assertEquals("dbqjnye", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.DIRECT, model.validationData().mode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TextClassificationMultilabel model = new TextClassificationMultilabel().withLogVerbosity(LogVerbosity.NOT_SET)
            .withTrainingData(new MLTableJobInput().withDescription("liiqeanu")
                .withUri("tarp")
                .withMode(InputDeliveryMode.READ_ONLY_MOUNT))
            .withTargetColumnName("jno")
            .withLimitSettings(new NlpVerticalLimitSettings().withTimeout(Duration.parse("PT197H4M37S"))
                .withMaxTrials(470605377)
                .withMaxConcurrentTrials(1118935796))
            .withFeaturizationSettings(new NlpVerticalFeaturizationSettings().withDatasetLanguage("xagf"))
            .withValidationData(new MLTableJobInput().withDescription("gxqqqasfeooqftp")
                .withUri("dbqjnye")
                .withMode(InputDeliveryMode.DIRECT));
        model = BinaryData.fromObject(model).toObject(TextClassificationMultilabel.class);
        Assertions.assertEquals(LogVerbosity.NOT_SET, model.logVerbosity());
        Assertions.assertEquals("liiqeanu", model.trainingData().description());
        Assertions.assertEquals("tarp", model.trainingData().uri());
        Assertions.assertEquals(InputDeliveryMode.READ_ONLY_MOUNT, model.trainingData().mode());
        Assertions.assertEquals("jno", model.targetColumnName());
        Assertions.assertEquals(Duration.parse("PT197H4M37S"), model.limitSettings().timeout());
        Assertions.assertEquals(470605377, model.limitSettings().maxTrials());
        Assertions.assertEquals(1118935796, model.limitSettings().maxConcurrentTrials());
        Assertions.assertEquals("xagf", model.featurizationSettings().datasetLanguage());
        Assertions.assertEquals("gxqqqasfeooqftp", model.validationData().description());
        Assertions.assertEquals("dbqjnye", model.validationData().uri());
        Assertions.assertEquals(InputDeliveryMode.DIRECT, model.validationData().mode());
    }
}
