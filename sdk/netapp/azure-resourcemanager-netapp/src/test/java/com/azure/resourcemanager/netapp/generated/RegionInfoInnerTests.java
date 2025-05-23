// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.RegionInfoInner;
import com.azure.resourcemanager.netapp.models.RegionInfoAvailabilityZoneMappingsItem;
import com.azure.resourcemanager.netapp.models.RegionStorageToNetworkProximity;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RegionInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionInfoInner model = BinaryData.fromString(
            "{\"storageToNetworkProximity\":\"T1\",\"availabilityZoneMappings\":[{\"availabilityZone\":\"hrsajiwkuofo\",\"isAvailable\":true}]}")
            .toObject(RegionInfoInner.class);
        Assertions.assertEquals(RegionStorageToNetworkProximity.T1, model.storageToNetworkProximity());
        Assertions.assertEquals("hrsajiwkuofo", model.availabilityZoneMappings().get(0).availabilityZone());
        Assertions.assertTrue(model.availabilityZoneMappings().get(0).isAvailable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegionInfoInner model = new RegionInfoInner().withStorageToNetworkProximity(RegionStorageToNetworkProximity.T1)
            .withAvailabilityZoneMappings(
                Arrays.asList(new RegionInfoAvailabilityZoneMappingsItem().withAvailabilityZone("hrsajiwkuofo")
                    .withIsAvailable(true)));
        model = BinaryData.fromObject(model).toObject(RegionInfoInner.class);
        Assertions.assertEquals(RegionStorageToNetworkProximity.T1, model.storageToNetworkProximity());
        Assertions.assertEquals("hrsajiwkuofo", model.availabilityZoneMappings().get(0).availabilityZone());
        Assertions.assertTrue(model.availabilityZoneMappings().get(0).isAvailable());
    }
}
