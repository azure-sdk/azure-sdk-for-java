// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

/**
 * Samples for Workflow List.
 */
public final class WorkflowListSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesdatareplication/resource-manager/Microsoft.DataReplication/preview/2021-02-16-
     * preview/examples/Workflow_List.json
     */
    /**
     * Sample code: Workflow_List.
     * 
     * @param manager Entry point to RecoveryServicesDataReplicationManager.
     */
    public static void workflowList(
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager) {
        manager.workflows()
            .list("rgrecoveryservicesdatareplication", "4", "mnebpgmjcitjleipnttx", "rdavrzbethhslmkqgajontnxsue",
                com.azure.core.util.Context.NONE);
    }
}
