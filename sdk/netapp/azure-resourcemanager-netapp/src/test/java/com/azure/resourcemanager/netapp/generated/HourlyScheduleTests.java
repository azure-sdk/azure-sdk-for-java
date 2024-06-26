// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.HourlySchedule;
import org.junit.jupiter.api.Assertions;

public final class HourlyScheduleTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HourlySchedule model = BinaryData
            .fromString("{\"snapshotsToKeep\":1969431903,\"minute\":452446013,\"usedBytes\":7839409166109908201}")
            .toObject(HourlySchedule.class);
        Assertions.assertEquals(1969431903, model.snapshotsToKeep());
        Assertions.assertEquals(452446013, model.minute());
        Assertions.assertEquals(7839409166109908201L, model.usedBytes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HourlySchedule model = new HourlySchedule().withSnapshotsToKeep(1969431903)
            .withMinute(452446013)
            .withUsedBytes(7839409166109908201L);
        model = BinaryData.fromObject(model).toObject(HourlySchedule.class);
        Assertions.assertEquals(1969431903, model.snapshotsToKeep());
        Assertions.assertEquals(452446013, model.minute());
        Assertions.assertEquals(7839409166109908201L, model.usedBytes());
    }
}
