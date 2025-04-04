// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oep.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oep.fluent.models.EnergyServiceInner;
import com.azure.resourcemanager.oep.models.DataPartitionNames;
import com.azure.resourcemanager.oep.models.EnergyServiceProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class EnergyServiceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnergyServiceInner model = BinaryData.fromString(
            "{\"properties\":{\"dnsName\":\"ifkwmrvktsizntoc\",\"provisioningState\":\"Unknown\",\"authAppId\":\"uajpsquc\",\"dataPartitionNames\":[{\"name\":\"fdkfogk\"}]},\"tags\":{\"eqsrdeupewnwreit\":\"jofjd\",\"usarhmofc\":\"zyf\"},\"location\":\"hs\",\"id\":\"urkdtmlx\",\"name\":\"ekuksjtx\",\"type\":\"kc\"}")
            .toObject(EnergyServiceInner.class);
        Assertions.assertEquals("uajpsquc", model.properties().authAppId());
        Assertions.assertEquals("fdkfogk", model.properties().dataPartitionNames().get(0).name());
        Assertions.assertEquals("jofjd", model.tags().get("eqsrdeupewnwreit"));
        Assertions.assertEquals("hs", model.location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnergyServiceInner model = new EnergyServiceInner()
            .withProperties(new EnergyServiceProperties().withAuthAppId("uajpsquc")
                .withDataPartitionNames(Arrays.asList(new DataPartitionNames().withName("fdkfogk"))))
            .withTags(mapOf("eqsrdeupewnwreit", "jofjd", "usarhmofc", "zyf"))
            .withLocation("hs");
        model = BinaryData.fromObject(model).toObject(EnergyServiceInner.class);
        Assertions.assertEquals("uajpsquc", model.properties().authAppId());
        Assertions.assertEquals("fdkfogk", model.properties().dataPartitionNames().get(0).name());
        Assertions.assertEquals("jofjd", model.tags().get("eqsrdeupewnwreit"));
        Assertions.assertEquals("hs", model.location());
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
