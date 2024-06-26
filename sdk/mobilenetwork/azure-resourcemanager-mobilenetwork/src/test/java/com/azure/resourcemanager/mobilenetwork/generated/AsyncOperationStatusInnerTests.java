// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AsyncOperationStatusInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class AsyncOperationStatusInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AsyncOperationStatusInner model = BinaryData.fromString(
            "{\"id\":\"qzrnkcqvyxlwhz\",\"name\":\"icohoqqnwvl\",\"status\":\"yav\",\"resourceId\":\"heun\",\"startTime\":\"2021-02-20T01:45:10Z\",\"endTime\":\"2021-10-16T07:10:15Z\",\"percentComplete\":22.279060088789205,\"properties\":\"dataonocukok\"}")
            .toObject(AsyncOperationStatusInner.class);
        Assertions.assertEquals("qzrnkcqvyxlwhz", model.id());
        Assertions.assertEquals("icohoqqnwvl", model.name());
        Assertions.assertEquals("yav", model.status());
        Assertions.assertEquals("heun", model.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-20T01:45:10Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-16T07:10:15Z"), model.endTime());
        Assertions.assertEquals(22.279060088789205D, model.percentComplete());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AsyncOperationStatusInner model = new AsyncOperationStatusInner().withId("qzrnkcqvyxlwhz")
            .withName("icohoqqnwvl")
            .withStatus("yav")
            .withResourceId("heun")
            .withStartTime(OffsetDateTime.parse("2021-02-20T01:45:10Z"))
            .withEndTime(OffsetDateTime.parse("2021-10-16T07:10:15Z"))
            .withPercentComplete(22.279060088789205D)
            .withProperties("dataonocukok");
        model = BinaryData.fromObject(model).toObject(AsyncOperationStatusInner.class);
        Assertions.assertEquals("qzrnkcqvyxlwhz", model.id());
        Assertions.assertEquals("icohoqqnwvl", model.name());
        Assertions.assertEquals("yav", model.status());
        Assertions.assertEquals("heun", model.resourceId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-20T01:45:10Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-16T07:10:15Z"), model.endTime());
        Assertions.assertEquals(22.279060088789205D, model.percentComplete());
    }
}
