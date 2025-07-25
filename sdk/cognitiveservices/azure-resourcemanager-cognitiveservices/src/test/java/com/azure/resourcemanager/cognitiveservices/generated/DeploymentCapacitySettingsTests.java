// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.DeploymentCapacitySettings;
import org.junit.jupiter.api.Assertions;

public final class DeploymentCapacitySettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeploymentCapacitySettings model
            = BinaryData.fromString("{\"designatedCapacity\":1109301596,\"priority\":1353667842}")
                .toObject(DeploymentCapacitySettings.class);
        Assertions.assertEquals(1109301596, model.designatedCapacity());
        Assertions.assertEquals(1353667842, model.priority());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeploymentCapacitySettings model
            = new DeploymentCapacitySettings().withDesignatedCapacity(1109301596).withPriority(1353667842);
        model = BinaryData.fromObject(model).toObject(DeploymentCapacitySettings.class);
        Assertions.assertEquals(1109301596, model.designatedCapacity());
        Assertions.assertEquals(1353667842, model.priority());
    }
}
