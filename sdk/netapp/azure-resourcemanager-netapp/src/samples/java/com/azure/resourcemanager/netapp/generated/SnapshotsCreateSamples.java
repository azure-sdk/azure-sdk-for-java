// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for Snapshots Create.
 */
public final class SnapshotsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2025-03-01/examples/Snapshots_Create.json
     */
    /**
     * Sample code: Snapshots_Create.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void snapshotsCreate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.snapshots()
            .define("snapshot1")
            .withRegion("eastus")
            .withExistingVolume("myRG", "account1", "pool1", "volume1")
            .create();
    }
}
