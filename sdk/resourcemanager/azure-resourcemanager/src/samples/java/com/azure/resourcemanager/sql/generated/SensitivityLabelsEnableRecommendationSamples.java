// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for SensitivityLabels EnableRecommendation.
 */
public final class SensitivityLabelsEnableRecommendationSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2021-11-01/examples/
     * RecommendedColumnSensitivityLabelEnable.json
     */
    /**
     * Sample code: Enables sensitivity recommendations on a given column.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        enablesSensitivityRecommendationsOnAGivenColumn(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers()
            .manager()
            .serviceClient()
            .getSensitivityLabels()
            .enableRecommendationWithResponse("myRG", "myServer", "myDatabase", "dbo", "myTable", "myColumn",
                com.azure.core.util.Context.NONE);
    }
}
