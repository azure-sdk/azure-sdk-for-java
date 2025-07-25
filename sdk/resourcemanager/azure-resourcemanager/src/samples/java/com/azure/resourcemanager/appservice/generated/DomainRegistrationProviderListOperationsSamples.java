// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for DomainRegistrationProvider ListOperations.
 */
public final class DomainRegistrationProviderListOperationsSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.DomainRegistration/stable/2024-11-01/examples/ListOperations.json
     */
    /**
     * Sample code: List operations.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listOperations(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getDomainRegistrationProviders()
            .listOperations(com.azure.core.util.Context.NONE);
    }
}
