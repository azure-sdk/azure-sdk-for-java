// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/automanage/resource-manager/Microsoft.Automanage/stable/2022-05-04/examples/listOperations.json
     */
    /**
     * Sample code: Lists all of the available Automanage REST API operations.
     * 
     * @param manager Entry point to AutomanageManager.
     */
    public static void listsAllOfTheAvailableAutomanageRESTAPIOperations(
        com.azure.resourcemanager.automanage.AutomanageManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
