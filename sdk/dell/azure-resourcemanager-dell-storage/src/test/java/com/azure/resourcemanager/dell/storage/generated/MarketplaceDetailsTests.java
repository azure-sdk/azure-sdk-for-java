// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.dell.storage.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dell.storage.models.MarketplaceDetails;
import org.junit.jupiter.api.Assertions;

public final class MarketplaceDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketplaceDetails model = BinaryData.fromString(
            "{\"marketplaceSubscriptionId\":\"wjzrnfygxgisp\",\"planId\":\"mvtzfkufub\",\"offerId\":\"jofxqe\",\"publisherId\":\"jaeq\",\"privateOfferId\":\"qjbasvms\",\"planName\":\"jqul\",\"marketplaceSubscriptionStatus\":\"Suspended\",\"endDate\":\"tnb\",\"termUnit\":\"kzgcwrwcl\"}")
            .toObject(MarketplaceDetails.class);
        Assertions.assertEquals("wjzrnfygxgisp", model.marketplaceSubscriptionId());
        Assertions.assertEquals("mvtzfkufub", model.planId());
        Assertions.assertEquals("jofxqe", model.offerId());
        Assertions.assertEquals("jaeq", model.publisherId());
        Assertions.assertEquals("qjbasvms", model.privateOfferId());
        Assertions.assertEquals("jqul", model.planName());
        Assertions.assertEquals("tnb", model.endDate());
        Assertions.assertEquals("kzgcwrwcl", model.termUnit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketplaceDetails model = new MarketplaceDetails().withMarketplaceSubscriptionId("wjzrnfygxgisp")
            .withPlanId("mvtzfkufub")
            .withOfferId("jofxqe")
            .withPublisherId("jaeq")
            .withPrivateOfferId("qjbasvms")
            .withPlanName("jqul")
            .withEndDate("tnb")
            .withTermUnit("kzgcwrwcl");
        model = BinaryData.fromObject(model).toObject(MarketplaceDetails.class);
        Assertions.assertEquals("wjzrnfygxgisp", model.marketplaceSubscriptionId());
        Assertions.assertEquals("mvtzfkufub", model.planId());
        Assertions.assertEquals("jofxqe", model.offerId());
        Assertions.assertEquals("jaeq", model.publisherId());
        Assertions.assertEquals("qjbasvms", model.privateOfferId());
        Assertions.assertEquals("jqul", model.planName());
        Assertions.assertEquals("tnb", model.endDate());
        Assertions.assertEquals("kzgcwrwcl", model.termUnit());
    }
}
