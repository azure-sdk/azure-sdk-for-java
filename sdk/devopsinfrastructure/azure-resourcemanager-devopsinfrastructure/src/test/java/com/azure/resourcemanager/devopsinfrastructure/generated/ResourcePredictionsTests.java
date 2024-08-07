// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devopsinfrastructure.models.ResourcePredictions;

public final class ResourcePredictionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourcePredictions model = BinaryData.fromString("{}").toObject(ResourcePredictions.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourcePredictions model = new ResourcePredictions();
        model = BinaryData.fromObject(model).toObject(ResourcePredictions.class);
    }
}
