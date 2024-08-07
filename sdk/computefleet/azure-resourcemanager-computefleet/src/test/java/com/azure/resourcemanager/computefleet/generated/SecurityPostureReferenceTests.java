// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.computefleet.models.SecurityPostureReference;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SecurityPostureReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityPostureReference model = BinaryData
            .fromString("{\"id\":\"qzvszjf\",\"excludeExtensions\":[\"j\",\"dxxiv\"],\"isOverridable\":true}")
            .toObject(SecurityPostureReference.class);
        Assertions.assertEquals("qzvszjf", model.id());
        Assertions.assertEquals("j", model.excludeExtensions().get(0));
        Assertions.assertEquals(true, model.isOverridable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityPostureReference model = new SecurityPostureReference().withId("qzvszjf")
            .withExcludeExtensions(Arrays.asList("j", "dxxiv"))
            .withIsOverridable(true);
        model = BinaryData.fromObject(model).toObject(SecurityPostureReference.class);
        Assertions.assertEquals("qzvszjf", model.id());
        Assertions.assertEquals("j", model.excludeExtensions().get(0));
        Assertions.assertEquals(true, model.isOverridable());
    }
}
