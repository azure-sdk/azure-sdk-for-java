// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.resourcemanager.databox.models.DataBoxScheduleAvailabilityRequest;
import com.azure.resourcemanager.databox.models.DeviceCapabilityRequest;
import com.azure.resourcemanager.databox.models.ModelName;
import com.azure.resourcemanager.databox.models.RegionConfigurationRequest;
import com.azure.resourcemanager.databox.models.SkuName;

/**
 * Samples for Service RegionConfiguration.
 */
public final class ServiceRegionConfigurationSamples {
    /*
     * x-ms-original-file:
     * specification/databox/resource-manager/Microsoft.DataBox/stable/2025-02-01/examples/RegionConfiguration.json
     */
    /**
     * Sample code: RegionConfiguration.
     * 
     * @param manager Entry point to DataBoxManager.
     */
    public static void regionConfiguration(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager.services()
            .regionConfigurationWithResponse("westus", new RegionConfigurationRequest()
                .withScheduleAvailabilityRequest(new DataBoxScheduleAvailabilityRequest().withStorageLocation("westus")
                    .withModel(ModelName.DATA_BOX))
                .withDeviceCapabilityRequest(new DeviceCapabilityRequest().withSkuName(SkuName.DATA_BOX_DISK)
                    .withModel(ModelName.DATA_BOX_DISK)),
                com.azure.core.util.Context.NONE);
    }
}
