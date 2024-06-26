// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.StorageConfiguration;
import org.junit.jupiter.api.Assertions;

public final class StorageConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageConfiguration model
            = BinaryData.fromString("{\"storageResourceId\":\"smx\",\"fileSystemName\":\"hmpvecx\"}")
                .toObject(StorageConfiguration.class);
        Assertions.assertEquals("smx", model.storageResourceId());
        Assertions.assertEquals("hmpvecx", model.fileSystemName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageConfiguration model
            = new StorageConfiguration().withStorageResourceId("smx").withFileSystemName("hmpvecx");
        model = BinaryData.fromObject(model).toObject(StorageConfiguration.class);
        Assertions.assertEquals("smx", model.storageResourceId());
        Assertions.assertEquals("hmpvecx", model.fileSystemName());
    }
}
