// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.resourcemanager.oracledatabase.models.SystemShapes;

/**
 * Samples for FlexComponents ListByParent.
 */
public final class FlexComponentsListByParentSamples {
    /*
     * x-ms-original-file: 2025-03-01/FlexComponents_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: FlexComponents_ListByParent_MaximumSet.
     * 
     * @param manager Entry point to OracleDatabaseManager.
     */
    public static void
        flexComponentsListByParentMaximumSet(com.azure.resourcemanager.oracledatabase.OracleDatabaseManager manager) {
        manager.flexComponents().listByParent("eastus", SystemShapes.EXADATA_X11M, com.azure.core.util.Context.NONE);
    }
}
