// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.generated;

/**
 * Samples for DisasterRecoveryConfigs BreakPairing.
 */
public final class DisasterRecoveryConfigsBreakPairingSamples {
    /*
     * x-ms-original-file:
     * specification/servicebus/resource-manager/Microsoft.ServiceBus/stable/2021-11-01/examples/disasterRecoveryConfigs
     * /SBEHAliasBreakPairing.json
     */
    /**
     * Sample code: SBEHAliasBreakPairing.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void sBEHAliasBreakPairing(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.serviceBusNamespaces()
            .manager()
            .serviceClient()
            .getDisasterRecoveryConfigs()
            .breakPairingWithResponse("ardsouzatestRG", "sdk-Namespace-8860", "sdk-DisasterRecovery-3814",
                com.azure.core.util.Context.NONE);
    }
}
