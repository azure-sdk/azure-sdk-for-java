// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.trustedsigning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.trustedsigning.models.AccountSkuPatch;
import com.azure.resourcemanager.trustedsigning.models.SkuName;
import org.junit.jupiter.api.Assertions;

public final class AccountSkuPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AccountSkuPatch model = BinaryData.fromString("{\"name\":\"Premium\"}").toObject(AccountSkuPatch.class);
        Assertions.assertEquals(SkuName.PREMIUM, model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AccountSkuPatch model = new AccountSkuPatch().withName(SkuName.PREMIUM);
        model = BinaryData.fromObject(model).toObject(AccountSkuPatch.class);
        Assertions.assertEquals(SkuName.PREMIUM, model.name());
    }
}
