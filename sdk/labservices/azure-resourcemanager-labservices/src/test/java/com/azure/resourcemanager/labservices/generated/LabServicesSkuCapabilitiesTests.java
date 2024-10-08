// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.labservices.models.LabServicesSkuCapabilities;

public final class LabServicesSkuCapabilitiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LabServicesSkuCapabilities model = BinaryData.fromString("{\"name\":\"gohdneuelfphsd\",\"value\":\"t\"}")
            .toObject(LabServicesSkuCapabilities.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LabServicesSkuCapabilities model = new LabServicesSkuCapabilities();
        model = BinaryData.fromObject(model).toObject(LabServicesSkuCapabilities.class);
    }
}
