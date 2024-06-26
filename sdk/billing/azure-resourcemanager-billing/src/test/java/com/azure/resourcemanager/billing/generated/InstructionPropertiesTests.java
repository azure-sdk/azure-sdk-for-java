// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.fluent.models.InstructionProperties;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class InstructionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InstructionProperties model =
            BinaryData
                .fromString(
                    "{\"amount\":70.4461,\"startDate\":\"2021-04-18T21:39:40Z\",\"endDate\":\"2021-05-04T00:16:05Z\",\"creationDate\":\"2021-11-21T07:12:40Z\"}")
                .toObject(InstructionProperties.class);
        Assertions.assertEquals(70.4461f, model.amount());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-18T21:39:40Z"), model.startDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-04T00:16:05Z"), model.endDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-21T07:12:40Z"), model.creationDate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InstructionProperties model =
            new InstructionProperties()
                .withAmount(70.4461f)
                .withStartDate(OffsetDateTime.parse("2021-04-18T21:39:40Z"))
                .withEndDate(OffsetDateTime.parse("2021-05-04T00:16:05Z"))
                .withCreationDate(OffsetDateTime.parse("2021-11-21T07:12:40Z"));
        model = BinaryData.fromObject(model).toObject(InstructionProperties.class);
        Assertions.assertEquals(70.4461f, model.amount());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-18T21:39:40Z"), model.startDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-04T00:16:05Z"), model.endDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-21T07:12:40Z"), model.creationDate());
    }
}
