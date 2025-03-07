// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.generated;

/**
 * Samples for VirtualMachineTemplates List.
 */
public final class VirtualMachineTemplatesListSamples {
    /*
     * x-ms-original-file:
     * specification/vmwarecloudsimple/resource-manager/Microsoft.VMwareCloudSimple/stable/2019-04-01/examples/
     * ListVirtualMachineTemplates.json
     */
    /**
     * Sample code: ListVirtualMachineTemplates.
     * 
     * @param manager Entry point to VMwareCloudSimpleManager.
     */
    public static void
        listVirtualMachineTemplates(com.azure.resourcemanager.vmwarecloudsimple.VMwareCloudSimpleManager manager) {
        manager.virtualMachineTemplates()
            .list("myPrivateCloud", "westus2",
                "/subscriptions/{subscription-id}/providers/Microsoft.VMwareCloudSimple/locations/westus2/privateClouds/myPrivateCloud/resourcePools/resgroup-26",
                com.azure.core.util.Context.NONE);
    }
}
