// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.BuiltInInfoType;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class BuiltInInfoTypeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BuiltInInfoType model = BinaryData
            .fromString("{\"name\":\"ezwwv\",\"id\":\"6885c7f9-8a0e-4789-a08b-dd82e250235c\",\"type\":\"yuvvfonkp\"}")
            .toObject(BuiltInInfoType.class);
        Assertions.assertEquals("ezwwv", model.name());
        Assertions.assertEquals(UUID.fromString("6885c7f9-8a0e-4789-a08b-dd82e250235c"), model.id());
        Assertions.assertEquals("yuvvfonkp", model.type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BuiltInInfoType model = new BuiltInInfoType().withName("ezwwv")
            .withId(UUID.fromString("6885c7f9-8a0e-4789-a08b-dd82e250235c"))
            .withType("yuvvfonkp");
        model = BinaryData.fromObject(model).toObject(BuiltInInfoType.class);
        Assertions.assertEquals("ezwwv", model.name());
        Assertions.assertEquals(UUID.fromString("6885c7f9-8a0e-4789-a08b-dd82e250235c"), model.id());
        Assertions.assertEquals("yuvvfonkp", model.type());
    }
}
