// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

/**
 * Samples for ExascaleDbNodes ListByParent.
 */
public final class ExascaleDbNodesListByParentSamples {
    /*
     * x-ms-original-file: 2025-03-01/ExascaleDbNodes_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExascaleDbNodes_ListByParent_MaximumSet.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void
        exascaleDbNodesListByParentMaximumSet(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.exascaleDbNodes().listByParent("rgopenapi", "vmClusterName", com.azure.core.util.Context.NONE);
    }
}
