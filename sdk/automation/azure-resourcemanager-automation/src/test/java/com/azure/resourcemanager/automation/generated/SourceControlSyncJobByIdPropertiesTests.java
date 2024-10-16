// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.SourceControlSyncJobByIdProperties;
import com.azure.resourcemanager.automation.models.ProvisioningState;
import com.azure.resourcemanager.automation.models.SyncType;
import org.junit.jupiter.api.Assertions;

public final class SourceControlSyncJobByIdPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SourceControlSyncJobByIdProperties model = BinaryData.fromString(
            "{\"sourceControlSyncJobId\":\"um\",\"creationTime\":\"2021-07-07T00:12:33Z\",\"provisioningState\":\"Failed\",\"startTime\":\"2021-11-04T09:02:42Z\",\"endTime\":\"2021-08-19T23:12:04Z\",\"syncType\":\"FullSync\",\"exception\":\"bhjpglkfgohdne\"}")
            .toObject(SourceControlSyncJobByIdProperties.class);
        Assertions.assertEquals("um", model.sourceControlSyncJobId());
        Assertions.assertEquals(ProvisioningState.FAILED, model.provisioningState());
        Assertions.assertEquals(SyncType.FULL_SYNC, model.syncType());
        Assertions.assertEquals("bhjpglkfgohdne", model.exception());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SourceControlSyncJobByIdProperties model
            = new SourceControlSyncJobByIdProperties().withSourceControlSyncJobId("um")
                .withProvisioningState(ProvisioningState.FAILED)
                .withSyncType(SyncType.FULL_SYNC)
                .withException("bhjpglkfgohdne");
        model = BinaryData.fromObject(model).toObject(SourceControlSyncJobByIdProperties.class);
        Assertions.assertEquals("um", model.sourceControlSyncJobId());
        Assertions.assertEquals(ProvisioningState.FAILED, model.provisioningState());
        Assertions.assertEquals(SyncType.FULL_SYNC, model.syncType());
        Assertions.assertEquals("bhjpglkfgohdne", model.exception());
    }
}
