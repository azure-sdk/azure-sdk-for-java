// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ScopeConnections Delete.
 */
public final class ScopeConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * NetworkManagerScopeConnectionDelete.json
     */
    /**
     * Sample code: Delete Network Manager Scope Connection.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteNetworkManagerScopeConnection(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getScopeConnections()
            .deleteWithResponse("rg1", "testNetworkManager", "TestScopeConnection", com.azure.core.util.Context.NONE);
    }
}
