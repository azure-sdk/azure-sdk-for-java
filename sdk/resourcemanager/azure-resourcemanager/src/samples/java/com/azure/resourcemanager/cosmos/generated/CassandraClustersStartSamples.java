// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for CassandraClusters Start.
 */
public final class CassandraClustersStartSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2025-04-15/examples/
     * CosmosDBManagedCassandraClusterStart.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraClusterStart.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBManagedCassandraClusterStart(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getCassandraClusters()
            .start("cassandra-prod-rg", "cassandra-prod", com.azure.core.util.Context.NONE);
    }
}
