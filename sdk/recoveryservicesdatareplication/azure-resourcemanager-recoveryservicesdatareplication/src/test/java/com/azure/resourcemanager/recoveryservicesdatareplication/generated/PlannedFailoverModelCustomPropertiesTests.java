// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.PlannedFailoverModelCustomProperties;

public final class PlannedFailoverModelCustomPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PlannedFailoverModelCustomProperties model
            = BinaryData.fromString("{\"instanceType\":\"PlannedFailoverModelCustomProperties\"}")
                .toObject(PlannedFailoverModelCustomProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PlannedFailoverModelCustomProperties model = new PlannedFailoverModelCustomProperties();
        model = BinaryData.fromObject(model).toObject(PlannedFailoverModelCustomProperties.class);
    }
}
