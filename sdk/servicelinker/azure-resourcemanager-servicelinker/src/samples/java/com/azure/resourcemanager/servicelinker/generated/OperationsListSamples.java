// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/preview/2024-07-01-preview/examples/
     * OperationsList.json
     */
    /**
     * Sample code: GetConfiguration.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void getConfiguration(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
