// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

/**
 * Samples for NetworkSecurityPerimeterConfigurations ReconcileForPrivateLinkScope.
 */
public final class NetworkSecurityPerimeterConfigurationsReconcileForPrivateLinkScopeSamples {
    /*
     * x-ms-original-file:
     * specification/hybridcompute/resource-manager/Microsoft.HybridCompute/preview/2025-02-19-preview/examples/
     * networkSecurityPerimeterConfiguration/NetworkSecurityPerimeterConfigurationReconcile.json
     */
    /**
     * Sample code: Reconciles the network security perimeter configuration of the private link scope.
     * 
     * @param manager Entry point to HybridComputeManager.
     */
    public static void reconcilesTheNetworkSecurityPerimeterConfigurationOfThePrivateLinkScope(
        com.azure.resourcemanager.hybridcompute.HybridComputeManager manager) {
        manager.networkSecurityPerimeterConfigurations()
            .reconcileForPrivateLinkScope("my-resource-group", "my-privatelinkscope",
                "aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee.myAssociation", com.azure.core.util.Context.NONE);
    }
}
