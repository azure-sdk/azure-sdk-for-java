// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for WebApps GetAuthSettings.
 */
public final class WebAppsGetAuthSettingsSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2024-11-01/examples/ListAuthSettings.json
     */
    /**
     * Sample code: List Auth Settings.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAuthSettings(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .getAuthSettingsWithResponse("testrg123", "sitef6141", com.azure.core.util.Context.NONE);
    }
}
