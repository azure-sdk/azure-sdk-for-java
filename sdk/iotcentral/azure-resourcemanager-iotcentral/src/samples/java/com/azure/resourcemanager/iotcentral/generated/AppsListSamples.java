// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.generated;

/**
 * Samples for Apps List.
 */
public final class AppsListSamples {
    /*
     * x-ms-original-file:
     * specification/iotcentral/resource-manager/Microsoft.IoTCentral/preview/2021-11-01-preview/examples/
     * Apps_ListBySubscription.json
     */
    /**
     * Sample code: Apps_ListBySubscription.
     * 
     * @param manager Entry point to IotCentralManager.
     */
    public static void appsListBySubscription(com.azure.resourcemanager.iotcentral.IotCentralManager manager) {
        manager.apps().list(com.azure.core.util.Context.NONE);
    }
}
