// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.EnvironmentListResponseInner;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.EnvironmentResourceInner;
import com.azure.resourcemanager.timeseriesinsights.models.Sku;
import com.azure.resourcemanager.timeseriesinsights.models.SkuName;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class EnvironmentListResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnvironmentListResponseInner model = BinaryData.fromString(
            "{\"value\":[{\"kind\":\"EnvironmentResource\",\"sku\":{\"name\":\"L1\",\"capacity\":1731046264},\"location\":\"tjixhbkuofqweyk\",\"tags\":{\"vfyexfw\":\"n\",\"nnaamdectehfiqsc\":\"ybcibvyvdcsit\",\"hcjrefovgmk\":\"eypvhezrkg\",\"yvxyqjp\":\"sle\"},\"id\":\"cattpngjcrcczsq\",\"name\":\"jh\",\"type\":\"mdajv\"}]}")
            .toObject(EnvironmentListResponseInner.class);
        Assertions.assertEquals("tjixhbkuofqweyk", model.value().get(0).location());
        Assertions.assertEquals("n", model.value().get(0).tags().get("vfyexfw"));
        Assertions.assertEquals(SkuName.L1, model.value().get(0).sku().name());
        Assertions.assertEquals(1731046264, model.value().get(0).sku().capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnvironmentListResponseInner model = new EnvironmentListResponseInner()
            .withValue(Arrays.asList(new EnvironmentResourceInner().withLocation("tjixhbkuofqweyk")
                .withTags(mapOf("vfyexfw", "n", "nnaamdectehfiqsc", "ybcibvyvdcsit", "hcjrefovgmk", "eypvhezrkg",
                    "yvxyqjp", "sle"))
                .withSku(new Sku().withName(SkuName.L1).withCapacity(1731046264))));
        model = BinaryData.fromObject(model).toObject(EnvironmentListResponseInner.class);
        Assertions.assertEquals("tjixhbkuofqweyk", model.value().get(0).location());
        Assertions.assertEquals("n", model.value().get(0).tags().get("vfyexfw"));
        Assertions.assertEquals(SkuName.L1, model.value().get(0).sku().name());
        Assertions.assertEquals(1731046264, model.value().get(0).sku().capacity());
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
