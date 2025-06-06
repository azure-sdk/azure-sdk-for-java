// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ExpressRouteCircuitPeerings List.
 */
public final class ExpressRouteCircuitPeeringsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * ExpressRouteCircuitPeeringList.json
     */
    /**
     * Sample code: List ExpressRouteCircuit Peerings.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listExpressRouteCircuitPeerings(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getExpressRouteCircuitPeerings()
            .list("rg1", "circuitName", com.azure.core.util.Context.NONE);
    }
}
