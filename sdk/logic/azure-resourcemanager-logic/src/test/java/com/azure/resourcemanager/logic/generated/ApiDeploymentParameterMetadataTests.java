// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.ApiDeploymentParameterMetadata;
import com.azure.resourcemanager.logic.models.ApiDeploymentParameterVisibility;
import org.junit.jupiter.api.Assertions;

public final class ApiDeploymentParameterMetadataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiDeploymentParameterMetadata model = BinaryData.fromString(
            "{\"type\":\"rmhw\",\"isRequired\":true,\"displayName\":\"pyf\",\"description\":\"bhvjglr\",\"visibility\":\"Default\"}")
            .toObject(ApiDeploymentParameterMetadata.class);
        Assertions.assertEquals("rmhw", model.type());
        Assertions.assertEquals(true, model.isRequired());
        Assertions.assertEquals("pyf", model.displayName());
        Assertions.assertEquals("bhvjglr", model.description());
        Assertions.assertEquals(ApiDeploymentParameterVisibility.DEFAULT, model.visibility());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiDeploymentParameterMetadata model = new ApiDeploymentParameterMetadata().withType("rmhw")
            .withIsRequired(true)
            .withDisplayName("pyf")
            .withDescription("bhvjglr")
            .withVisibility(ApiDeploymentParameterVisibility.DEFAULT);
        model = BinaryData.fromObject(model).toObject(ApiDeploymentParameterMetadata.class);
        Assertions.assertEquals("rmhw", model.type());
        Assertions.assertEquals(true, model.isRequired());
        Assertions.assertEquals("pyf", model.displayName());
        Assertions.assertEquals("bhvjglr", model.description());
        Assertions.assertEquals(ApiDeploymentParameterVisibility.DEFAULT, model.visibility());
    }
}
