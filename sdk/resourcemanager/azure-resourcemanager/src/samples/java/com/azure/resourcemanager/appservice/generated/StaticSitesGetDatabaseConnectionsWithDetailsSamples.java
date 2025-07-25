// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for StaticSites GetDatabaseConnectionsWithDetails.
 */
public final class StaticSitesGetDatabaseConnectionsWithDetailsSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2024-11-01/examples/
     * GetStaticSiteDatabaseConnectionsWithDetails.json
     */
    /**
     * Sample code: List full details of database connections for the static site.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listFullDetailsOfDatabaseConnectionsForTheStaticSite(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps()
            .manager()
            .serviceClient()
            .getStaticSites()
            .getDatabaseConnectionsWithDetails("rg", "testStaticSite0", com.azure.core.util.Context.NONE);
    }
}
