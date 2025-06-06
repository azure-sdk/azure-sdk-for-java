// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.DatabaseSummaryResult;

public final class DatabaseSummaryResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseSummaryResult model = BinaryData.fromString(
            "{\"sizeMB\":7.652588154665596,\"name\":\"mfnczd\",\"startedOn\":\"2021-06-14T22:03:09Z\",\"endedOn\":\"2021-05-11T22:31:41Z\",\"state\":\"Warning\",\"statusMessage\":\"l\",\"itemsCount\":8856612047832221194,\"itemsCompletedCount\":1186256809003482579,\"errorPrefix\":\"evwrdnhfuk\",\"resultPrefix\":\"sjcswsmystuluqyp\"}")
            .toObject(DatabaseSummaryResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseSummaryResult model = new DatabaseSummaryResult();
        model = BinaryData.fromObject(model).toObject(DatabaseSummaryResult.class);
    }
}
