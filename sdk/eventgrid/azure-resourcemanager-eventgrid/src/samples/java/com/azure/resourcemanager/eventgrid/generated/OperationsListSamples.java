// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2025-04-01-preview/examples/Operations_List.
     * json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void operationsList(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
