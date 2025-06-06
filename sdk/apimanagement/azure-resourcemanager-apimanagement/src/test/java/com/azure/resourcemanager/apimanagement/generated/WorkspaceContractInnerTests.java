// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.WorkspaceContractInner;
import org.junit.jupiter.api.Assertions;

public final class WorkspaceContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceContractInner model = BinaryData.fromString(
            "{\"properties\":{\"displayName\":\"zufy\",\"description\":\"xmlynzly\"},\"id\":\"apbkrbuoggtdl\",\"name\":\"lcuhaizi\",\"type\":\"vaylz\"}")
            .toObject(WorkspaceContractInner.class);
        Assertions.assertEquals("zufy", model.displayName());
        Assertions.assertEquals("xmlynzly", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceContractInner model = new WorkspaceContractInner().withDisplayName("zufy").withDescription("xmlynzly");
        model = BinaryData.fromObject(model).toObject(WorkspaceContractInner.class);
        Assertions.assertEquals("zufy", model.displayName());
        Assertions.assertEquals("xmlynzly", model.description());
    }
}
