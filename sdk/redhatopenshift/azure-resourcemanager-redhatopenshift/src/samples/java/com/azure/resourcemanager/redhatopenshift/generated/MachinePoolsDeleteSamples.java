// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.generated;

/**
 * Samples for MachinePools Delete.
 */
public final class MachinePoolsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/redhatopenshift/resource-manager/Microsoft.RedHatOpenShift/openshiftclusters/stable/2023-11-22/
     * examples/MachinePools_Delete.json
     */
    /**
     * Sample code: Deletes a MachinePool with the specified subscription, resource group and resource name.
     * 
     * @param manager Entry point to RedHatOpenShiftManager.
     */
    public static void deletesAMachinePoolWithTheSpecifiedSubscriptionResourceGroupAndResourceName(
        com.azure.resourcemanager.redhatopenshift.RedHatOpenShiftManager manager) {
        manager.machinePools()
            .deleteWithResponse("resourceGroup", "resourceName", "childResourceName", com.azure.core.util.Context.NONE);
    }
}
