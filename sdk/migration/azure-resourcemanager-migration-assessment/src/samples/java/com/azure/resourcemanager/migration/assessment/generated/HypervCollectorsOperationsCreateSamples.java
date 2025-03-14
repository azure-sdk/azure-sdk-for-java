// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

import com.azure.resourcemanager.migration.assessment.models.CollectorAgentPropertiesBase;
import com.azure.resourcemanager.migration.assessment.models.CollectorAgentSpnPropertiesBase;
import com.azure.resourcemanager.migration.assessment.models.CollectorPropertiesBaseWithAgent;
import com.azure.resourcemanager.migration.assessment.models.ProvisioningState;
import java.time.OffsetDateTime;

/**
 * Samples for HypervCollectorsOperations Create.
 */
public final class HypervCollectorsOperationsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/migrate/resource-manager/Microsoft.Migrate/AssessmentProjects/stable/2023-03-15/examples/
     * HypervCollectorsOperations_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: HypervCollectorsOperations_Create_MaximumSet_Gen.
     * 
     * @param manager Entry point to MigrationAssessmentManager.
     */
    public static void hypervCollectorsOperationsCreateMaximumSetGen(
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager) {
        manager.hypervCollectorsOperations()
            .define("test-697cecollector")
            .withExistingAssessmentProject("ayagrawRG", "app18700project")
            .withProperties(new CollectorPropertiesBaseWithAgent().withProvisioningState(ProvisioningState.SUCCEEDED)
                .withAgentProperties(new CollectorAgentPropertiesBase().withId("12f1d90f-b3fa-4926-8893-e56803a09af0")
                    .withVersion("2.0.1993.19")
                    .withLastHeartbeatUtc(OffsetDateTime.parse("2022-07-07T14:25:35.708325Z"))
                    .withSpnDetails(new CollectorAgentSpnPropertiesBase()
                        .withAuthority("https://login.windows.net/72f988bf-86f1-41af-91ab-2d7cd011db47")
                        .withApplicationId("e3bd6eaa-980b-40ae-a30e-2a5069ba097c")
                        .withAudience("e3bd6eaa-980b-40ae-a30e-2a5069ba097c")
                        .withObjectId("01b9f9e2-2d82-414c-adaa-09ce259b6b44")
                        .withTenantId("72f988bf-86f1-41af-91ab-2d7cd011db47")))
                .withDiscoverySiteId(
                    "/subscriptions/4bd2aa0f-2bd2-4d67-91a8-5a4533d58600/resourceGroups/ayagrawRG/providers/Microsoft.OffAzure/HyperVSites/test-60527site"))
            .create();
    }
}
