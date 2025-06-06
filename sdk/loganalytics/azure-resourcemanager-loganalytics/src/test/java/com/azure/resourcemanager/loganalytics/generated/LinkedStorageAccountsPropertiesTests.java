// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loganalytics.fluent.models.LinkedStorageAccountsProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LinkedStorageAccountsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LinkedStorageAccountsProperties model
            = BinaryData.fromString("{\"dataSourceType\":\"AzureWatson\",\"storageAccountIds\":[\"sx\"]}")
                .toObject(LinkedStorageAccountsProperties.class);
        Assertions.assertEquals("sx", model.storageAccountIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LinkedStorageAccountsProperties model
            = new LinkedStorageAccountsProperties().withStorageAccountIds(Arrays.asList("sx"));
        model = BinaryData.fromObject(model).toObject(LinkedStorageAccountsProperties.class);
        Assertions.assertEquals("sx", model.storageAccountIds().get(0));
    }
}
