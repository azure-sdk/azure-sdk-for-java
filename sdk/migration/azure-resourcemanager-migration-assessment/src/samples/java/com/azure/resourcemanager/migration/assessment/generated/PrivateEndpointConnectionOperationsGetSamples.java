// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

/**
 * Samples for PrivateEndpointConnectionOperations Get.
 */
public final class PrivateEndpointConnectionOperationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/migrate/resource-manager/Microsoft.Migrate/AssessmentProjects/stable/2023-03-15/examples/
     * PrivateEndpointConnectionOperations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnectionOperations_Get_MaximumSet_Gen.
     * 
     * @param manager Entry point to MigrationAssessmentManager.
     */
    public static void privateEndpointConnectionOperationsGetMaximumSetGen(
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager) {
        manager.privateEndpointConnectionOperations()
            .getWithResponse("sakanwar", "sakanwar1204project",
                "sakanwar1204project1634pe.bf42f8a1-09f5-4ee4-aea6-a019cc60f9d7", com.azure.core.util.Context.NONE);
    }
}
