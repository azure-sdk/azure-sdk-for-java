// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.fabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.fabric.models.RpSku;
import com.azure.resourcemanager.fabric.models.RpSkuTier;
import org.junit.jupiter.api.Assertions;

public final class RpSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RpSku model = BinaryData.fromString("{\"name\":\"xrifkwmrvkts\",\"tier\":\"Fabric\"}").toObject(RpSku.class);
        Assertions.assertEquals("xrifkwmrvkts", model.name());
        Assertions.assertEquals(RpSkuTier.FABRIC, model.tier());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RpSku model = new RpSku().withName("xrifkwmrvkts").withTier(RpSkuTier.FABRIC);
        model = BinaryData.fromObject(model).toObject(RpSku.class);
        Assertions.assertEquals("xrifkwmrvkts", model.name());
        Assertions.assertEquals(RpSkuTier.FABRIC, model.tier());
    }
}
