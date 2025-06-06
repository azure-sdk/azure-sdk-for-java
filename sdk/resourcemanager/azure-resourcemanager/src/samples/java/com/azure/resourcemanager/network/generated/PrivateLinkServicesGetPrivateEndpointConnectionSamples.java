// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for PrivateLinkServices GetPrivateEndpointConnection.
 */
public final class PrivateLinkServicesGetPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * PrivateLinkServiceGetPrivateEndpointConnection.json
     */
    /**
     * Sample code: Get private end point connection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getPrivateEndPointConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getPrivateLinkServices()
            .getPrivateEndpointConnectionWithResponse("rg1", "testPls", "testPlePeConnection", null,
                com.azure.core.util.Context.NONE);
    }
}
