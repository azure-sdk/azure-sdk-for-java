// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.voiceservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.voiceservices.models.CommunicationsGatewayUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class CommunicationsGatewayUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommunicationsGatewayUpdate model = BinaryData.fromString("{\"tags\":{\"qedqytbciqfoufl\":\"rxybz\"}}")
            .toObject(CommunicationsGatewayUpdate.class);
        Assertions.assertEquals("rxybz", model.tags().get("qedqytbciqfoufl"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommunicationsGatewayUpdate model
            = new CommunicationsGatewayUpdate().withTags(mapOf("qedqytbciqfoufl", "rxybz"));
        model = BinaryData.fromObject(model).toObject(CommunicationsGatewayUpdate.class);
        Assertions.assertEquals("rxybz", model.tags().get("qedqytbciqfoufl"));
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
