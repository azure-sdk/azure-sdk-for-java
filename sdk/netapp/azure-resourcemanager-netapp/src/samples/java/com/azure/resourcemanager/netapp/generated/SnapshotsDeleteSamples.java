// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for Snapshots Delete.
 */
public final class SnapshotsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/stable/2025-03-01/examples/Snapshots_Delete.json
     */
    /**
     * Sample code: Snapshots_Delete.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void snapshotsDelete(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.snapshots()
            .delete("myRG", "account1", "pool1", "volume1", "snapshot1", com.azure.core.util.Context.NONE);
    }
}
