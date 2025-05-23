// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

/**
 * Samples for TuningOptions ListByServer.
 */
public final class TuningOptionsListByServerSamples {
    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * Tuning_ListTuningOptions.json
     */
    /**
     * Sample code: TuningOptions_ListByServer.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void
        tuningOptionsListByServer(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.tuningOptions().listByServer("testrg", "testserver", com.azure.core.util.Context.NONE);
    }
}
