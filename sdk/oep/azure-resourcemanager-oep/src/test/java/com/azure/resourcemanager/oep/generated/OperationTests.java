// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oep.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oep.models.Operation;
import com.azure.resourcemanager.oep.models.OperationDisplay;

public final class OperationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Operation model = BinaryData.fromString(
            "{\"name\":\"oqpsoa\",\"isDataAction\":false,\"display\":{\"provider\":\"akl\",\"resource\":\"ahbc\",\"operation\":\"ffdfdosygexpa\",\"description\":\"akhmsbzjhcrz\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"}")
            .toObject(Operation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Operation model = new Operation().withDisplay(new OperationDisplay());
        model = BinaryData.fromObject(model).toObject(Operation.class);
    }
}
