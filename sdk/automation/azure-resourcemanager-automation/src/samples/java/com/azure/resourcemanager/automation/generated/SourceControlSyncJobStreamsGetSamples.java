// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import java.util.UUID;

/**
 * Samples for SourceControlSyncJobStreams Get.
 */
public final class SourceControlSyncJobStreamsGetSamples {
    /*
     * x-ms-original-file:
     * specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/examples/
     * sourceControlSyncJobStreams/getSourceControlSyncJobStreamsByStreamId.json
     */
    /**
     * Sample code: Get a sync job stream identified by sync job stream id.
     * 
     * @param manager Entry point to AutomationManager.
     */
    public static void
        getASyncJobStreamIdentifiedBySyncJobStreamId(com.azure.resourcemanager.automation.AutomationManager manager) {
        manager.sourceControlSyncJobStreams()
            .getWithResponse("rg", "myAutomationAccount33", "MySourceControl",
                UUID.fromString("ce6fe3e3-9db3-4096-a6b4-82bfb4c10a2b"),
                "b86c5c31-e9fd-4734-8764-ddd6c101e706_00636596855139029522_00000000000000000007",
                com.azure.core.util.Context.NONE);
    }
}
