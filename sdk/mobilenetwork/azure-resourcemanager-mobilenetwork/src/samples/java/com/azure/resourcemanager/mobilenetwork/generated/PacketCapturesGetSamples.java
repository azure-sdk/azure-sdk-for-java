// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

/**
 * Samples for PacketCaptures Get.
 */
public final class PacketCapturesGetSamples {
    /*
     * x-ms-original-file:
     * specification/mobilenetwork/resource-manager/Microsoft.MobileNetwork/stable/2024-04-01/examples/PacketCaptureGet.
     * json
     */
    /**
     * Sample code: Get packet capture session.
     * 
     * @param manager Entry point to MobileNetworkManager.
     */
    public static void getPacketCaptureSession(com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager) {
        manager.packetCaptures().getWithResponse("rg1", "TestPacketCoreCP", "pc1", com.azure.core.util.Context.NONE);
    }
}
