// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for NetworkSecurityPerimeters Delete.
 */
public final class NetworkSecurityPerimetersDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * NetworkSecurityPerimeterDelete.json
     */
    /**
     * Sample code: NetworkSecurityPerimeterDelete.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void networkSecurityPerimeterDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkSecurityPerimeters()
            .delete("rg1", "testNSP1", null, com.azure.core.util.Context.NONE);
    }
}
