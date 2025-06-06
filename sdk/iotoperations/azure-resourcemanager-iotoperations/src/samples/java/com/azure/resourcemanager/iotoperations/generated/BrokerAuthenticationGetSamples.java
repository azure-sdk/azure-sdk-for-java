// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.generated;

/**
 * Samples for BrokerAuthentication Get.
 */
public final class BrokerAuthenticationGetSamples {
    /*
     * x-ms-original-file: 2025-04-01/BrokerAuthentication_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: BrokerAuthentication_Get.
     * 
     * @param manager Entry point to IoTOperationsManager.
     */
    public static void brokerAuthenticationGet(com.azure.resourcemanager.iotoperations.IoTOperationsManager manager) {
        manager.brokerAuthentications()
            .getWithResponse("rgiotoperations", "resource-name123", "resource-name123", "resource-name123",
                com.azure.core.util.Context.NONE);
    }
}
