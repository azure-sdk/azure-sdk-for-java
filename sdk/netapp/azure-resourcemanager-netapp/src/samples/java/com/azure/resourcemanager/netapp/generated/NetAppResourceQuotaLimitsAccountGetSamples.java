// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/**
 * Samples for NetAppResourceQuotaLimitsAccount Get.
 */
public final class NetAppResourceQuotaLimitsAccountGetSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/preview/2025-01-01-preview/examples/QuotaLimitsAccount_Get
     * .json
     */
    /**
     * Sample code: Volumes_RestoreStatus.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumesRestoreStatus(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.netAppResourceQuotaLimitsAccounts()
            .getWithResponse("myRG", "myAccount", "poolsPerAccount", com.azure.core.util.Context.NONE);
    }
}
