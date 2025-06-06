// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.models.PrivateLinkResource;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResource model = BinaryData.fromString(
            "{\"properties\":{\"groupId\":\"ycnojvknmefqsg\",\"requiredMembers\":[\"hapjyzhpvgqz\"],\"requiredZoneNames\":[\"vxdjzlmwlxkvugf\",\"zovawjvz\",\"nluthnnp\"]},\"id\":\"xipeilpjzuaejx\",\"name\":\"ultskzbbtdz\",\"type\":\"mv\"}")
            .toObject(PrivateLinkResource.class);
        Assertions.assertEquals("vxdjzlmwlxkvugf", model.requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResource model
            = new PrivateLinkResource().withRequiredZoneNames(Arrays.asList("vxdjzlmwlxkvugf", "zovawjvz", "nluthnnp"));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResource.class);
        Assertions.assertEquals("vxdjzlmwlxkvugf", model.requiredZoneNames().get(0));
    }
}
