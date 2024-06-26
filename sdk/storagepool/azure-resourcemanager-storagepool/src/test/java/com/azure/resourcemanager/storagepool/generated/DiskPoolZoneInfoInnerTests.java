// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagepool.fluent.models.DiskPoolZoneInfoInner;

public final class DiskPoolZoneInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiskPoolZoneInfoInner model =
            BinaryData
                .fromString(
                    "{\"availabilityZones\":[\"nvowgujju\",\"wdkcglhsl\"],\"additionalCapabilities\":[\"dyggdtjixhbku\",\"fqweykhmene\",\"fyexfwhy\"],\"sku\":{\"name\":\"i\",\"tier\":\"yvdcsitynnaa\"}}")
                .toObject(DiskPoolZoneInfoInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiskPoolZoneInfoInner model = new DiskPoolZoneInfoInner();
        model = BinaryData.fromObject(model).toObject(DiskPoolZoneInfoInner.class);
    }
}
