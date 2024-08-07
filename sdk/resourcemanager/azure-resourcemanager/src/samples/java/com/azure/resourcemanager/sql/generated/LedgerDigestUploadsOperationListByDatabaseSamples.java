// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for LedgerDigestUploadsOperation ListByDatabase.
 */
public final class LedgerDigestUploadsOperationListByDatabaseSamples {
    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/LedgerDigestUploadsList.json
     */
    /**
     * Sample code: Gets list of ledger digest upload settings on a database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getsListOfLedgerDigestUploadSettingsOnADatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getLedgerDigestUploadsOperations()
            .listByDatabase("ledgertestrg", "ledgertestserver", "testdb", com.azure.core.util.Context.NONE);
    }
}
