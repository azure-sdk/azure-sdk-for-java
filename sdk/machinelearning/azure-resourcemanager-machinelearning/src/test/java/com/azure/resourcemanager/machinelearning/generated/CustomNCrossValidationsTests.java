// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.CustomNCrossValidations;
import org.junit.jupiter.api.Assertions;

public final class CustomNCrossValidationsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomNCrossValidations model = BinaryData.fromString("{\"mode\":\"Custom\",\"value\":1824520711}")
            .toObject(CustomNCrossValidations.class);
        Assertions.assertEquals(1824520711, model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomNCrossValidations model = new CustomNCrossValidations().withValue(1824520711);
        model = BinaryData.fromObject(model).toObject(CustomNCrossValidations.class);
        Assertions.assertEquals(1824520711, model.value());
    }
}
