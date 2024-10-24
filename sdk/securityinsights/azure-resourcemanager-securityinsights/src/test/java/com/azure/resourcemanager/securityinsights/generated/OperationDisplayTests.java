// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model = BinaryData.fromString(
            "{\"description\":\"bqxvhcsyhzlwxae\",\"operation\":\"vurex\",\"provider\":\"d\",\"resource\":\"dwead\"}")
            .toObject(OperationDisplay.class);
        Assertions.assertEquals("bqxvhcsyhzlwxae", model.description());
        Assertions.assertEquals("vurex", model.operation());
        Assertions.assertEquals("d", model.provider());
        Assertions.assertEquals("dwead", model.resource());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplay model = new OperationDisplay().withDescription("bqxvhcsyhzlwxae")
            .withOperation("vurex")
            .withProvider("d")
            .withResource("dwead");
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
        Assertions.assertEquals("bqxvhcsyhzlwxae", model.description());
        Assertions.assertEquals("vurex", model.operation());
        Assertions.assertEquals("d", model.provider());
        Assertions.assertEquals("dwead", model.resource());
    }
}
