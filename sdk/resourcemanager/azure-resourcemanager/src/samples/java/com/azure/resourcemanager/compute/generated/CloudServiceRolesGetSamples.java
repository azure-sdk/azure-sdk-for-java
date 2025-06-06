// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for CloudServiceRoles Get.
 */
public final class CloudServiceRolesGetSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/CloudserviceRP/stable/2024-11-04/examples/
     * CloudServiceRole_Get.json
     */
    /**
     * Sample code: Get Cloud Service Role.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getCloudServiceRole(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines()
            .manager()
            .serviceClient()
            .getCloudServiceRoles()
            .getWithResponse("{role-name}", "ConstosoRG", "{cs-name}", com.azure.core.util.Context.NONE);
    }
}
