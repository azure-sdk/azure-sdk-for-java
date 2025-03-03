// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.workloads.models.StopRequest;
import org.junit.jupiter.api.Assertions;

public final class StopRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StopRequest model
            = BinaryData.fromString("{\"softStopTimeoutSeconds\":5194499110087869555}").toObject(StopRequest.class);
        Assertions.assertEquals(5194499110087869555L, model.softStopTimeoutSeconds());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StopRequest model = new StopRequest().withSoftStopTimeoutSeconds(5194499110087869555L);
        model = BinaryData.fromObject(model).toObject(StopRequest.class);
        Assertions.assertEquals(5194499110087869555L, model.softStopTimeoutSeconds());
    }
}
