// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ScheduleActionBase;
import com.azure.resourcemanager.machinelearning.models.ScheduleProperties;
import com.azure.resourcemanager.machinelearning.models.TriggerBase;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SchedulePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleProperties model = BinaryData.fromString(
            "{\"displayName\":\"t\",\"isEnabled\":true,\"trigger\":{\"triggerType\":\"TriggerBase\",\"endTime\":\"logxsvtzar\",\"startTime\":\"vqnsqk\",\"timeZone\":\"mbjwzzoslpkyb\"},\"action\":{\"actionType\":\"ScheduleActionBase\"},\"provisioningState\":\"Deleting\",\"description\":\"kzpgaj\",\"tags\":{\"uqrebluimmbwx\":\"cemqbmfuvqarwz\",\"kraokq\":\"fgtdmbvx\",\"aokbavlyttaaknwf\":\"budbt\",\"sm\":\"ke\"},\"properties\":{\"gatolekscbctnan\":\"ujd\",\"wnsnlaimouxwks\":\"imwbzxpdcldpk\",\"fco\":\"mud\",\"kbqsjhbtqqvyfscy\":\"bicziuswswj\"}}")
            .toObject(ScheduleProperties.class);
        Assertions.assertEquals("kzpgaj", model.description());
        Assertions.assertEquals("cemqbmfuvqarwz", model.tags().get("uqrebluimmbwx"));
        Assertions.assertEquals("ujd", model.properties().get("gatolekscbctnan"));
        Assertions.assertEquals("t", model.displayName());
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("logxsvtzar", model.trigger().endTime());
        Assertions.assertEquals("vqnsqk", model.trigger().startTime());
        Assertions.assertEquals("mbjwzzoslpkyb", model.trigger().timeZone());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleProperties model = new ScheduleProperties().withDescription("kzpgaj")
            .withTags(
                mapOf("uqrebluimmbwx", "cemqbmfuvqarwz", "kraokq", "fgtdmbvx", "aokbavlyttaaknwf", "budbt", "sm", "ke"))
            .withProperties(mapOf("gatolekscbctnan", "ujd", "wnsnlaimouxwks", "imwbzxpdcldpk", "fco", "mud",
                "kbqsjhbtqqvyfscy", "bicziuswswj"))
            .withDisplayName("t")
            .withIsEnabled(true)
            .withTrigger(
                new TriggerBase().withEndTime("logxsvtzar").withStartTime("vqnsqk").withTimeZone("mbjwzzoslpkyb"))
            .withAction(new ScheduleActionBase());
        model = BinaryData.fromObject(model).toObject(ScheduleProperties.class);
        Assertions.assertEquals("kzpgaj", model.description());
        Assertions.assertEquals("cemqbmfuvqarwz", model.tags().get("uqrebluimmbwx"));
        Assertions.assertEquals("ujd", model.properties().get("gatolekscbctnan"));
        Assertions.assertEquals("t", model.displayName());
        Assertions.assertEquals(true, model.isEnabled());
        Assertions.assertEquals("logxsvtzar", model.trigger().endTime());
        Assertions.assertEquals("vqnsqk", model.trigger().startTime());
        Assertions.assertEquals("mbjwzzoslpkyb", model.trigger().timeZone());
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
