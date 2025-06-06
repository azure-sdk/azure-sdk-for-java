// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.generated;

/**
 * Samples for VirtualMachines Get.
 */
public final class VirtualMachinesGetSamples {
    /*
     * x-ms-original-file: 2024-09-01/VirtualMachines_Get.json
     */
    /**
     * Sample code: VirtualMachines_Get.
     * 
     * @param manager Entry point to AvsManager.
     */
    public static void virtualMachinesGet(com.azure.resourcemanager.avs.AvsManager manager) {
        manager.virtualMachines()
            .getWithResponse("group1", "cloud1", "cluster1", "vm-209", com.azure.core.util.Context.NONE);
    }
}
