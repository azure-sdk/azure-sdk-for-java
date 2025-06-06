// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.PrivateEndpointConnectionRequestProperties;
import com.azure.resourcemanager.apimanagement.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.apimanagement.models.PrivateLinkServiceConnectionState;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionRequestProperties model = BinaryData.fromString(
            "{\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"vssqywjopackyhy\",\"actionsRequired\":\"ikmfn\"}}")
            .toObject(PrivateEndpointConnectionRequestProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("vssqywjopackyhy", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("ikmfn", model.privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionRequestProperties model
            = new PrivateEndpointConnectionRequestProperties().withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                    .withDescription("vssqywjopackyhy")
                    .withActionsRequired("ikmfn"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionRequestProperties.class);
        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("vssqywjopackyhy", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("ikmfn", model.privateLinkServiceConnectionState().actionsRequired());
    }
}
