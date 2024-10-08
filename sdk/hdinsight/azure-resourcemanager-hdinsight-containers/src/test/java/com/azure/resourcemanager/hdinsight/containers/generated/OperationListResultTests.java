// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.OperationListResult;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"ydxtqm\",\"isDataAction\":false,\"display\":{\"provider\":\"rgguf\",\"resource\":\"aomtbghhavgrvkff\",\"operation\":\"jzhpjbibgjmfx\",\"description\":\"vfcluyovwxnbkfe\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"}],\"nextLink\":\"hwzdgirujbz\"}")
            .toObject(OperationListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model = new OperationListResult();
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
    }
}
