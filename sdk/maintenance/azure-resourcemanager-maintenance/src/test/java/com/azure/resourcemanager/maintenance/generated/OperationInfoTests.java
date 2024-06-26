// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.maintenance.models.OperationInfo;
import org.junit.jupiter.api.Assertions;

public final class OperationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInfo model = BinaryData.fromString(
            "{\"provider\":\"zmh\",\"resource\":\"ongmtsa\",\"operation\":\"cbpwxqpsrknft\",\"description\":\"vriuhprwmdyvx\"}")
            .toObject(OperationInfo.class);
        Assertions.assertEquals("zmh", model.provider());
        Assertions.assertEquals("ongmtsa", model.resource());
        Assertions.assertEquals("cbpwxqpsrknft", model.operation());
        Assertions.assertEquals("vriuhprwmdyvx", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInfo model = new OperationInfo().withProvider("zmh")
            .withResource("ongmtsa")
            .withOperation("cbpwxqpsrknft")
            .withDescription("vriuhprwmdyvx");
        model = BinaryData.fromObject(model).toObject(OperationInfo.class);
        Assertions.assertEquals("zmh", model.provider());
        Assertions.assertEquals("ongmtsa", model.resource());
        Assertions.assertEquals("cbpwxqpsrknft", model.operation());
        Assertions.assertEquals("vriuhprwmdyvx", model.description());
    }
}
