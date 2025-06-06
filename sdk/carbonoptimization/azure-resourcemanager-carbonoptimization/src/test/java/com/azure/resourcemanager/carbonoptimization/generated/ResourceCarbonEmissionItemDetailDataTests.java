// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.carbonoptimization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.carbonoptimization.models.CategoryTypeEnum;
import com.azure.resourcemanager.carbonoptimization.models.ResourceCarbonEmissionItemDetailData;
import org.junit.jupiter.api.Assertions;

public final class ResourceCarbonEmissionItemDetailDataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceCarbonEmissionItemDetailData model = BinaryData.fromString(
            "{\"dataType\":\"ResourceItemDetailsData\",\"itemName\":\"kyfi\",\"categoryType\":\"ResourceGroup\",\"subscriptionId\":\"fidfvzw\",\"resourceGroup\":\"zuhtymwisdkfthwx\",\"resourceId\":\"nteiwaopv\",\"location\":\"ijcmmx\",\"resourceType\":\"ufufsrp\",\"latestMonthEmissions\":74.0755200384253,\"previousMonthEmissions\":56.62892405768821,\"monthOverMonthEmissionsChangeRatio\":42.455758085656015,\"monthlyEmissionsChangeValue\":38.43033430574524}")
            .toObject(ResourceCarbonEmissionItemDetailData.class);
        Assertions.assertEquals(74.0755200384253, model.latestMonthEmissions());
        Assertions.assertEquals(56.62892405768821, model.previousMonthEmissions());
        Assertions.assertEquals(42.455758085656015D, model.monthOverMonthEmissionsChangeRatio());
        Assertions.assertEquals(38.43033430574524D, model.monthlyEmissionsChangeValue());
        Assertions.assertEquals("kyfi", model.itemName());
        Assertions.assertEquals(CategoryTypeEnum.RESOURCE_GROUP, model.categoryType());
        Assertions.assertEquals("fidfvzw", model.subscriptionId());
        Assertions.assertEquals("zuhtymwisdkfthwx", model.resourceGroup());
        Assertions.assertEquals("nteiwaopv", model.resourceId());
        Assertions.assertEquals("ijcmmx", model.location());
        Assertions.assertEquals("ufufsrp", model.resourceType());
    }
}
