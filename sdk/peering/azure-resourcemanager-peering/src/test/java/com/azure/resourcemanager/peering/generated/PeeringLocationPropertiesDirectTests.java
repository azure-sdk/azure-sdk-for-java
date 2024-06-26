// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.models.DirectPeeringFacility;
import com.azure.resourcemanager.peering.models.DirectPeeringType;
import com.azure.resourcemanager.peering.models.PeeringBandwidthOffer;
import com.azure.resourcemanager.peering.models.PeeringLocationPropertiesDirect;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PeeringLocationPropertiesDirectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PeeringLocationPropertiesDirect model =
            BinaryData
                .fromString(
                    "{\"peeringFacilities\":[{\"address\":\"buxwgip\",\"directPeeringType\":\"Edge\",\"peeringDBFacilityId\":390798331,\"peeringDBFacilityLink\":\"kgshwa\"},{\"address\":\"ixzbinjeputtmryw\",\"directPeeringType\":\"Ix\",\"peeringDBFacilityId\":1117331465,\"peeringDBFacilityLink\":\"tiyqzrnkcqv\"},{\"address\":\"lwh\",\"directPeeringType\":\"Internal\",\"peeringDBFacilityId\":1205063617,\"peeringDBFacilityLink\":\"hoqqnwvlr\"},{\"address\":\"vwhheunmmqhgyx\",\"directPeeringType\":\"Transit\",\"peeringDBFacilityId\":521536914,\"peeringDBFacilityLink\":\"uko\"}],\"bandwidthOffers\":[{\"offerName\":\"xuconu\",\"valueInMbps\":447504444},{\"offerName\":\"kbeype\",\"valueInMbps\":1004577663},{\"offerName\":\"mwvvjektcxsenhw\",\"valueInMbps\":223779123},{\"offerName\":\"frzpwvlqdqgb\",\"valueInMbps\":629213684}]}")
                .toObject(PeeringLocationPropertiesDirect.class);
        Assertions.assertEquals("buxwgip", model.peeringFacilities().get(0).address());
        Assertions.assertEquals(DirectPeeringType.EDGE, model.peeringFacilities().get(0).directPeeringType());
        Assertions.assertEquals(390798331, model.peeringFacilities().get(0).peeringDBFacilityId());
        Assertions.assertEquals("kgshwa", model.peeringFacilities().get(0).peeringDBFacilityLink());
        Assertions.assertEquals("xuconu", model.bandwidthOffers().get(0).offerName());
        Assertions.assertEquals(447504444, model.bandwidthOffers().get(0).valueInMbps());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PeeringLocationPropertiesDirect model =
            new PeeringLocationPropertiesDirect()
                .withPeeringFacilities(
                    Arrays
                        .asList(
                            new DirectPeeringFacility()
                                .withAddress("buxwgip")
                                .withDirectPeeringType(DirectPeeringType.EDGE)
                                .withPeeringDBFacilityId(390798331)
                                .withPeeringDBFacilityLink("kgshwa"),
                            new DirectPeeringFacility()
                                .withAddress("ixzbinjeputtmryw")
                                .withDirectPeeringType(DirectPeeringType.IX)
                                .withPeeringDBFacilityId(1117331465)
                                .withPeeringDBFacilityLink("tiyqzrnkcqv"),
                            new DirectPeeringFacility()
                                .withAddress("lwh")
                                .withDirectPeeringType(DirectPeeringType.INTERNAL)
                                .withPeeringDBFacilityId(1205063617)
                                .withPeeringDBFacilityLink("hoqqnwvlr"),
                            new DirectPeeringFacility()
                                .withAddress("vwhheunmmqhgyx")
                                .withDirectPeeringType(DirectPeeringType.TRANSIT)
                                .withPeeringDBFacilityId(521536914)
                                .withPeeringDBFacilityLink("uko")))
                .withBandwidthOffers(
                    Arrays
                        .asList(
                            new PeeringBandwidthOffer().withOfferName("xuconu").withValueInMbps(447504444),
                            new PeeringBandwidthOffer().withOfferName("kbeype").withValueInMbps(1004577663),
                            new PeeringBandwidthOffer().withOfferName("mwvvjektcxsenhw").withValueInMbps(223779123),
                            new PeeringBandwidthOffer().withOfferName("frzpwvlqdqgb").withValueInMbps(629213684)));
        model = BinaryData.fromObject(model).toObject(PeeringLocationPropertiesDirect.class);
        Assertions.assertEquals("buxwgip", model.peeringFacilities().get(0).address());
        Assertions.assertEquals(DirectPeeringType.EDGE, model.peeringFacilities().get(0).directPeeringType());
        Assertions.assertEquals(390798331, model.peeringFacilities().get(0).peeringDBFacilityId());
        Assertions.assertEquals("kgshwa", model.peeringFacilities().get(0).peeringDBFacilityLink());
        Assertions.assertEquals("xuconu", model.bandwidthOffers().get(0).offerName());
        Assertions.assertEquals(447504444, model.bandwidthOffers().get(0).valueInMbps());
    }
}
