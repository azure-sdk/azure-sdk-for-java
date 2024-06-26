// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.models.HelmUpgradeOptions;
import org.junit.jupiter.api.Assertions;

public final class HelmUpgradeOptionsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HelmUpgradeOptions model
            = BinaryData.fromString("{\"atomic\":\"qbw\",\"wait\":\"pqtgsfjac\",\"timeout\":\"lhhxudbxvodhtnsi\"}")
                .toObject(HelmUpgradeOptions.class);
        Assertions.assertEquals("qbw", model.atomic());
        Assertions.assertEquals("pqtgsfjac", model.waitOption());
        Assertions.assertEquals("lhhxudbxvodhtnsi", model.timeout());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HelmUpgradeOptions model
            = new HelmUpgradeOptions().withAtomic("qbw").withWaitOption("pqtgsfjac").withTimeout("lhhxudbxvodhtnsi");
        model = BinaryData.fromObject(model).toObject(HelmUpgradeOptions.class);
        Assertions.assertEquals("qbw", model.atomic());
        Assertions.assertEquals("pqtgsfjac", model.waitOption());
        Assertions.assertEquals("lhhxudbxvodhtnsi", model.timeout());
    }
}
