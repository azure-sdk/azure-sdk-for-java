// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.orbital.models.ResourceReference;
import org.junit.jupiter.api.Assertions;

public final class ResourceReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceReference model = BinaryData.fromString("{\"id\":\"uouq\"}").toObject(ResourceReference.class);
        Assertions.assertEquals("uouq", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceReference model = new ResourceReference().withId("uouq");
        model = BinaryData.fromObject(model).toObject(ResourceReference.class);
        Assertions.assertEquals("uouq", model.id());
    }
}
