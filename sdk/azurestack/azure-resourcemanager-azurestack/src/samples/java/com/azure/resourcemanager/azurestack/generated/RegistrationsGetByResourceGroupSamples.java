// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

/**
 * Samples for Registrations GetByResourceGroup.
 */
public final class RegistrationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/azurestack/resource-manager/Microsoft.AzureStack/stable/2022-06-01/examples/Registration/Get.json
     */
    /**
     * Sample code: Returns the properties of an Azure Stack registration.
     * 
     * @param manager Entry point to AzureStackManager.
     */
    public static void
        returnsThePropertiesOfAnAzureStackRegistration(com.azure.resourcemanager.azurestack.AzureStackManager manager) {
        manager.registrations()
            .getByResourceGroupWithResponse("azurestack", "testregistration", com.azure.core.util.Context.NONE);
    }
}
