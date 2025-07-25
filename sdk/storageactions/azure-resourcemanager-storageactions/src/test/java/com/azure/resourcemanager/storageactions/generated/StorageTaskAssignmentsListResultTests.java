// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.storageactions.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storageactions.implementation.models.StorageTaskAssignmentsListResult;

public final class StorageTaskAssignmentsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageTaskAssignmentsListResult model
            = BinaryData.fromString("{\"value\":[{\"id\":\"wpn\"}],\"nextLink\":\"t\"}")
                .toObject(StorageTaskAssignmentsListResult.class);
    }
}
