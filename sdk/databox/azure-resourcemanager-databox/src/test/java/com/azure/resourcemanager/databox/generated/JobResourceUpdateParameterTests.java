// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.JobResourceUpdateParameter;
import com.azure.resourcemanager.databox.models.ResourceIdentity;
import com.azure.resourcemanager.databox.models.UpdateJobDetails;
import com.azure.resourcemanager.databox.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class JobResourceUpdateParameterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JobResourceUpdateParameter model = BinaryData.fromString(
            "{\"properties\":{\"details\":{}},\"tags\":{\"xqpvfadmw\":\"quhcdhmduala\",\"vgomz\":\"rcrgvx\"},\"identity\":{\"type\":\"isgwbnbbeldawkz\",\"principalId\":\"liourqhak\",\"tenantId\":\"hashsfwxosow\",\"userAssignedIdentities\":{\"vo\":{\"principalId\":\"gicjooxdjeb\",\"clientId\":\"ucww\"},\"otwmcdyt\":{\"principalId\":\"vmeueci\",\"clientId\":\"hzceuojgjrwjue\"},\"qwgxhniskx\":{\"principalId\":\"wit\",\"clientId\":\"rjaw\"}}}}")
            .toObject(JobResourceUpdateParameter.class);
        Assertions.assertEquals("quhcdhmduala", model.tags().get("xqpvfadmw"));
        Assertions.assertEquals("isgwbnbbeldawkz", model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JobResourceUpdateParameter model
            = new JobResourceUpdateParameter().withTags(mapOf("xqpvfadmw", "quhcdhmduala", "vgomz", "rcrgvx"))
                .withIdentity(new ResourceIdentity().withType("isgwbnbbeldawkz")
                    .withUserAssignedIdentities(mapOf("vo", new UserAssignedIdentity(), "otwmcdyt",
                        new UserAssignedIdentity(), "qwgxhniskx", new UserAssignedIdentity())))
                .withDetails(new UpdateJobDetails());
        model = BinaryData.fromObject(model).toObject(JobResourceUpdateParameter.class);
        Assertions.assertEquals("quhcdhmduala", model.tags().get("xqpvfadmw"));
        Assertions.assertEquals("isgwbnbbeldawkz", model.identity().type());
    }

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
