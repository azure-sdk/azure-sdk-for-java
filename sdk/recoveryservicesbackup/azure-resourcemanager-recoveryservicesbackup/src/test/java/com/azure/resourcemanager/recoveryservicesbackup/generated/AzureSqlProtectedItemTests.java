// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureSqlProtectedItem;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureSqlProtectedItemExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.CreateMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectedItemState;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureSqlProtectedItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureSqlProtectedItem model = BinaryData.fromString(
            "{\"protectedItemType\":\"Microsoft.Sql/servers/databases\",\"protectedItemDataId\":\"hrnxrxc\",\"protectionState\":\"BackupsSuspended\",\"extendedInfo\":{\"oldestRecoveryPoint\":\"2021-04-05T16:50:28Z\",\"recoveryPointCount\":120876150,\"policyState\":\"qdzfvazivjlfrqtt\"},\"backupManagementType\":\"DefaultBackup\",\"workloadType\":\"VMwareVM\",\"containerName\":\"tnwxy\",\"sourceResourceId\":\"pidkqqfkuvscxkdm\",\"policyId\":\"govibrxkpmloazu\",\"lastRecoveryPoint\":\"2021-08-28T07:45:52Z\",\"backupSetName\":\"bgo\",\"createMode\":\"Recover\",\"deferredDeleteTimeInUTC\":\"2021-06-09T05:18:29Z\",\"isScheduledForDeferredDelete\":false,\"deferredDeleteTimeRemaining\":\"fhjxakvvjgs\",\"isDeferredDeleteScheduleUpcoming\":false,\"isRehydrate\":false,\"resourceGuardOperationRequests\":[\"yw\",\"t\",\"gkxnyedabg\",\"vudtjuewbcihx\"],\"isArchiveEnabled\":false,\"policyName\":\"c\",\"softDeleteRetentionPeriodInDays\":2057414837,\"vaultId\":\"cybvpayakkudzpxg\"}")
            .toObject(AzureSqlProtectedItem.class);
        Assertions.assertEquals("tnwxy", model.containerName());
        Assertions.assertEquals("pidkqqfkuvscxkdm", model.sourceResourceId());
        Assertions.assertEquals("govibrxkpmloazu", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-28T07:45:52Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("bgo", model.backupSetName());
        Assertions.assertEquals(CreateMode.RECOVER, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-09T05:18:29Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(false, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("fhjxakvvjgs", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(false, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("yw", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("c", model.policyName());
        Assertions.assertEquals(2057414837, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("hrnxrxc", model.protectedItemDataId());
        Assertions.assertEquals(ProtectedItemState.BACKUPS_SUSPENDED, model.protectionState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-05T16:50:28Z"),
            model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(120876150, model.extendedInfo().recoveryPointCount());
        Assertions.assertEquals("qdzfvazivjlfrqtt", model.extendedInfo().policyState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureSqlProtectedItem model = new AzureSqlProtectedItem().withContainerName("tnwxy")
            .withSourceResourceId("pidkqqfkuvscxkdm")
            .withPolicyId("govibrxkpmloazu")
            .withLastRecoveryPoint(OffsetDateTime.parse("2021-08-28T07:45:52Z"))
            .withBackupSetName("bgo")
            .withCreateMode(CreateMode.RECOVER)
            .withDeferredDeleteTimeInUtc(OffsetDateTime.parse("2021-06-09T05:18:29Z"))
            .withIsScheduledForDeferredDelete(false)
            .withDeferredDeleteTimeRemaining("fhjxakvvjgs")
            .withIsDeferredDeleteScheduleUpcoming(false)
            .withIsRehydrate(false)
            .withResourceGuardOperationRequests(Arrays.asList("yw", "t", "gkxnyedabg", "vudtjuewbcihx"))
            .withIsArchiveEnabled(false)
            .withPolicyName("c")
            .withSoftDeleteRetentionPeriod(2057414837)
            .withProtectedItemDataId("hrnxrxc")
            .withProtectionState(ProtectedItemState.BACKUPS_SUSPENDED)
            .withExtendedInfo(new AzureSqlProtectedItemExtendedInfo()
                .withOldestRecoveryPoint(OffsetDateTime.parse("2021-04-05T16:50:28Z"))
                .withRecoveryPointCount(120876150)
                .withPolicyState("qdzfvazivjlfrqtt"));
        model = BinaryData.fromObject(model).toObject(AzureSqlProtectedItem.class);
        Assertions.assertEquals("tnwxy", model.containerName());
        Assertions.assertEquals("pidkqqfkuvscxkdm", model.sourceResourceId());
        Assertions.assertEquals("govibrxkpmloazu", model.policyId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-28T07:45:52Z"), model.lastRecoveryPoint());
        Assertions.assertEquals("bgo", model.backupSetName());
        Assertions.assertEquals(CreateMode.RECOVER, model.createMode());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-09T05:18:29Z"), model.deferredDeleteTimeInUtc());
        Assertions.assertEquals(false, model.isScheduledForDeferredDelete());
        Assertions.assertEquals("fhjxakvvjgs", model.deferredDeleteTimeRemaining());
        Assertions.assertEquals(false, model.isDeferredDeleteScheduleUpcoming());
        Assertions.assertEquals(false, model.isRehydrate());
        Assertions.assertEquals("yw", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, model.isArchiveEnabled());
        Assertions.assertEquals("c", model.policyName());
        Assertions.assertEquals(2057414837, model.softDeleteRetentionPeriod());
        Assertions.assertEquals("hrnxrxc", model.protectedItemDataId());
        Assertions.assertEquals(ProtectedItemState.BACKUPS_SUSPENDED, model.protectionState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-05T16:50:28Z"),
            model.extendedInfo().oldestRecoveryPoint());
        Assertions.assertEquals(120876150, model.extendedInfo().recoveryPointCount());
        Assertions.assertEquals("qdzfvazivjlfrqtt", model.extendedInfo().policyState());
    }
}
