// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.BillingMeter;
import com.azure.resourcemanager.appcontainers.models.BillingMeterProperties;
import org.junit.jupiter.api.Assertions;

public final class BillingMeterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BillingMeter model = BinaryData.fromString(
            "{\"location\":\"ixzbinjeputtmryw\",\"properties\":{\"category\":\"oqftiyqzrnkcq\",\"meterType\":\"xlwhzlsicoh\",\"displayName\":\"qnwvlrya\"},\"id\":\"hheunmmqhgyx\",\"name\":\"konocu\",\"type\":\"oklyaxuconuq\"}")
            .toObject(BillingMeter.class);
        Assertions.assertEquals("ixzbinjeputtmryw", model.location());
        Assertions.assertEquals("oqftiyqzrnkcq", model.properties().category());
        Assertions.assertEquals("xlwhzlsicoh", model.properties().meterType());
        Assertions.assertEquals("qnwvlrya", model.properties().displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BillingMeter model
            = new BillingMeter().withLocation("ixzbinjeputtmryw").withProperties(new BillingMeterProperties()
                .withCategory("oqftiyqzrnkcq").withMeterType("xlwhzlsicoh").withDisplayName("qnwvlrya"));
        model = BinaryData.fromObject(model).toObject(BillingMeter.class);
        Assertions.assertEquals("ixzbinjeputtmryw", model.location());
        Assertions.assertEquals("oqftiyqzrnkcq", model.properties().category());
        Assertions.assertEquals("xlwhzlsicoh", model.properties().meterType());
        Assertions.assertEquals("qnwvlrya", model.properties().displayName());
    }
}
