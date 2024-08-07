// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated;

import com.azure.resourcemanager.eventhubs.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.eventhubs.models.ConnectionState;
import com.azure.resourcemanager.eventhubs.models.EndPointProvisioningState;
import com.azure.resourcemanager.eventhubs.models.PrivateEndpoint;
import com.azure.resourcemanager.eventhubs.models.PrivateLinkConnectionStatus;

/**
 * Samples for PrivateEndpointConnections CreateOrUpdate.
 */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/eventhub/resource-manager/Microsoft.EventHub/stable/2024-01-01/examples/NameSpaces/
     * PrivateEndPointConnectionCreate.json
     */
    /**
     * Sample code: NameSpacePrivateEndPointConnectionCreate.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void nameSpacePrivateEndPointConnectionCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.eventHubs()
            .manager()
            .serviceClient()
            .getPrivateEndpointConnections()
            .createOrUpdateWithResponse("ArunMonocle", "sdk-Namespace-2924", "privateEndpointConnectionName",
                new PrivateEndpointConnectionInner().withPrivateEndpoint(new PrivateEndpoint().withId(
                    "/subscriptions/dbedb4e0-40e6-4145-81f3-f1314c150774/resourceGroups/SDK-EventHub-8396/providers/Microsoft.Network/privateEndpoints/sdk-Namespace-2847"))
                    .withPrivateLinkServiceConnectionState(
                        new ConnectionState().withStatus(PrivateLinkConnectionStatus.REJECTED)
                            .withDescription("testing"))
                    .withProvisioningState(EndPointProvisioningState.SUCCEEDED),
                com.azure.core.util.Context.NONE);
    }
}
