// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import java.time.Duration;

/**
 * Samples for Users CreateOrUpdate.
 */
public final class UsersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/labservices/resource-manager/Microsoft.LabServices/stable/2022-08-01/examples/Users/putUser.json
     */
    /**
     * Sample code: putUser.
     * 
     * @param manager Entry point to LabServicesManager.
     */
    public static void putUser(com.azure.resourcemanager.labservices.LabServicesManager manager) {
        manager.users()
            .define("testuser")
            .withExistingLab("testrg123", "testlab")
            .withEmail("testuser@contoso.com")
            .withAdditionalUsageQuota(Duration.parse("PT10H"))
            .create();
    }
}
