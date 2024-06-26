// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DeleteActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LogStorageSettings;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DeleteActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeleteActivityTypeProperties model = BinaryData.fromString(
            "{\"recursive\":\"datafgrms\",\"maxConcurrentConnections\":1585292907,\"enableLogging\":\"datarb\",\"logStorageSettings\":{\"linkedServiceName\":{\"referenceName\":\"mfp\",\"parameters\":{\"dyxqjy\":\"datadcvwsb\"}},\"path\":\"dataouyfcfded\",\"logLevel\":\"dataphgnfaanubjeboel\",\"enableReliableLogging\":\"datag\",\"\":{\"mjdhwnf\":\"datawmv\",\"vlkpwavd\":\"datajhhpfjz\",\"bitudwuoxir\":\"datapecjmovrsrtldijg\",\"gb\":\"datailuzokxphcjtwh\"}},\"dataset\":{\"referenceName\":\"jmgctwamjjw\",\"parameters\":{\"m\":\"datagistnyzmhhope\",\"qtgfbmocvb\":\"dataxtdyxzg\"}},\"storeSettings\":{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"datakqxhkh\",\"disableMetricsCollection\":\"datarcqpxaajt\",\"\":{\"azmxssbv\":\"dataqtuztzmubxngs\"}}}")
            .toObject(DeleteActivityTypeProperties.class);
        Assertions.assertEquals(1585292907, model.maxConcurrentConnections());
        Assertions.assertEquals("mfp", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("jmgctwamjjw", model.dataset().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeleteActivityTypeProperties model = new DeleteActivityTypeProperties().withRecursive("datafgrms")
            .withMaxConcurrentConnections(1585292907)
            .withEnableLogging("datarb")
            .withLogStorageSettings(new LogStorageSettings()
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("mfp").withParameters(mapOf("dyxqjy", "datadcvwsb")))
                .withPath("dataouyfcfded")
                .withLogLevel("dataphgnfaanubjeboel")
                .withEnableReliableLogging("datag")
                .withAdditionalProperties(mapOf()))
            .withDataset(new DatasetReference().withReferenceName("jmgctwamjjw")
                .withParameters(mapOf("m", "datagistnyzmhhope", "qtgfbmocvb", "dataxtdyxzg")))
            .withStoreSettings(new StoreReadSettings().withMaxConcurrentConnections("datakqxhkh")
                .withDisableMetricsCollection("datarcqpxaajt")
                .withAdditionalProperties(mapOf("type", "StoreReadSettings")));
        model = BinaryData.fromObject(model).toObject(DeleteActivityTypeProperties.class);
        Assertions.assertEquals(1585292907, model.maxConcurrentConnections());
        Assertions.assertEquals("mfp", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("jmgctwamjjw", model.dataset().referenceName());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
