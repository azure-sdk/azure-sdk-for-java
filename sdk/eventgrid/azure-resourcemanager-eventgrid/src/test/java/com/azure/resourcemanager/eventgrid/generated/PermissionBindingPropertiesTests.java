// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.PermissionBindingProperties;
import com.azure.resourcemanager.eventgrid.models.PermissionType;
import org.junit.jupiter.api.Assertions;

public final class PermissionBindingPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PermissionBindingProperties model = BinaryData.fromString(
            "{\"description\":\"bbjpmcubkmif\",\"topicSpaceName\":\"xkubvphavpmhbrbq\",\"permission\":\"Subscriber\",\"clientGroupName\":\"vpbbt\",\"provisioningState\":\"Deleted\"}")
            .toObject(PermissionBindingProperties.class);
        Assertions.assertEquals("bbjpmcubkmif", model.description());
        Assertions.assertEquals("xkubvphavpmhbrbq", model.topicSpaceName());
        Assertions.assertEquals(PermissionType.SUBSCRIBER, model.permission());
        Assertions.assertEquals("vpbbt", model.clientGroupName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PermissionBindingProperties model = new PermissionBindingProperties().withDescription("bbjpmcubkmif")
            .withTopicSpaceName("xkubvphavpmhbrbq")
            .withPermission(PermissionType.SUBSCRIBER)
            .withClientGroupName("vpbbt");
        model = BinaryData.fromObject(model).toObject(PermissionBindingProperties.class);
        Assertions.assertEquals("bbjpmcubkmif", model.description());
        Assertions.assertEquals("xkubvphavpmhbrbq", model.topicSpaceName());
        Assertions.assertEquals(PermissionType.SUBSCRIBER, model.permission());
        Assertions.assertEquals("vpbbt", model.clientGroupName());
    }
}
