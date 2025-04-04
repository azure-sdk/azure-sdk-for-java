// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.BackendPoolProperties;
import com.azure.resourcemanager.frontdoor.models.Backend;
import com.azure.resourcemanager.frontdoor.models.BackendEnabledState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class BackendPoolPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackendPoolProperties model = BinaryData.fromString(
            "{\"resourceState\":\"Disabling\",\"backends\":[{\"address\":\"vv\",\"privateLinkAlias\":\"nk\",\"privateLinkResourceId\":\"hqyikvy\",\"privateLinkLocation\":\"uyav\",\"privateEndpointStatus\":\"Pending\",\"privateLinkApprovalMessage\":\"ncstt\",\"httpPort\":2120109491,\"httpsPort\":1869546664,\"enabledState\":\"Disabled\",\"priority\":1465256653,\"weight\":576086700,\"backendHostHeader\":\"gsgbdhuzq\"},{\"address\":\"j\",\"privateLinkAlias\":\"kynscliqhzv\",\"privateLinkResourceId\":\"nk\",\"privateLinkLocation\":\"tkubotppn\",\"privateEndpointStatus\":\"Disconnected\",\"privateLinkApprovalMessage\":\"xhihfrbbcevqagtl\",\"httpPort\":169373915,\"httpsPort\":1706986082,\"enabledState\":\"Enabled\",\"priority\":2094473580,\"weight\":1199430603,\"backendHostHeader\":\"vgtrdcnifmzzs\"},{\"address\":\"m\",\"privateLinkAlias\":\"nysuxmprafwgckh\",\"privateLinkResourceId\":\"xvd\",\"privateLinkLocation\":\"fwafqrouda\",\"privateEndpointStatus\":\"Rejected\",\"privateLinkApprovalMessage\":\"ehhr\",\"httpPort\":221531853,\"httpsPort\":50845900,\"enabledState\":\"Enabled\",\"priority\":484340114,\"weight\":83009194,\"backendHostHeader\":\"xg\"}],\"loadBalancingSettings\":{\"id\":\"yxcdyuibhmfdnbzy\"},\"healthProbeSettings\":{\"id\":\"vfcjnaeoisrvhmg\"}}")
            .toObject(BackendPoolProperties.class);
        Assertions.assertEquals("vv", model.backends().get(0).address());
        Assertions.assertEquals("nk", model.backends().get(0).privateLinkAlias());
        Assertions.assertEquals("hqyikvy", model.backends().get(0).privateLinkResourceId());
        Assertions.assertEquals("uyav", model.backends().get(0).privateLinkLocation());
        Assertions.assertEquals("ncstt", model.backends().get(0).privateLinkApprovalMessage());
        Assertions.assertEquals(2120109491, model.backends().get(0).httpPort());
        Assertions.assertEquals(1869546664, model.backends().get(0).httpsPort());
        Assertions.assertEquals(BackendEnabledState.DISABLED, model.backends().get(0).enabledState());
        Assertions.assertEquals(1465256653, model.backends().get(0).priority());
        Assertions.assertEquals(576086700, model.backends().get(0).weight());
        Assertions.assertEquals("gsgbdhuzq", model.backends().get(0).backendHostHeader());
        Assertions.assertEquals("yxcdyuibhmfdnbzy", model.loadBalancingSettings().id());
        Assertions.assertEquals("vfcjnaeoisrvhmg", model.healthProbeSettings().id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackendPoolProperties model = new BackendPoolProperties()
            .withBackends(Arrays.asList(
                new Backend().withAddress("vv")
                    .withPrivateLinkAlias("nk")
                    .withPrivateLinkResourceId("hqyikvy")
                    .withPrivateLinkLocation("uyav")
                    .withPrivateLinkApprovalMessage("ncstt")
                    .withHttpPort(2120109491)
                    .withHttpsPort(1869546664)
                    .withEnabledState(BackendEnabledState.DISABLED)
                    .withPriority(1465256653)
                    .withWeight(576086700)
                    .withBackendHostHeader("gsgbdhuzq"),
                new Backend().withAddress("j")
                    .withPrivateLinkAlias("kynscliqhzv")
                    .withPrivateLinkResourceId("nk")
                    .withPrivateLinkLocation("tkubotppn")
                    .withPrivateLinkApprovalMessage("xhihfrbbcevqagtl")
                    .withHttpPort(169373915)
                    .withHttpsPort(1706986082)
                    .withEnabledState(BackendEnabledState.ENABLED)
                    .withPriority(2094473580)
                    .withWeight(1199430603)
                    .withBackendHostHeader("vgtrdcnifmzzs"),
                new Backend().withAddress("m")
                    .withPrivateLinkAlias("nysuxmprafwgckh")
                    .withPrivateLinkResourceId("xvd")
                    .withPrivateLinkLocation("fwafqrouda")
                    .withPrivateLinkApprovalMessage("ehhr")
                    .withHttpPort(221531853)
                    .withHttpsPort(50845900)
                    .withEnabledState(BackendEnabledState.ENABLED)
                    .withPriority(484340114)
                    .withWeight(83009194)
                    .withBackendHostHeader("xg")))
            .withLoadBalancingSettings(new SubResource().withId("yxcdyuibhmfdnbzy"))
            .withHealthProbeSettings(new SubResource().withId("vfcjnaeoisrvhmg"));
        model = BinaryData.fromObject(model).toObject(BackendPoolProperties.class);
        Assertions.assertEquals("vv", model.backends().get(0).address());
        Assertions.assertEquals("nk", model.backends().get(0).privateLinkAlias());
        Assertions.assertEquals("hqyikvy", model.backends().get(0).privateLinkResourceId());
        Assertions.assertEquals("uyav", model.backends().get(0).privateLinkLocation());
        Assertions.assertEquals("ncstt", model.backends().get(0).privateLinkApprovalMessage());
        Assertions.assertEquals(2120109491, model.backends().get(0).httpPort());
        Assertions.assertEquals(1869546664, model.backends().get(0).httpsPort());
        Assertions.assertEquals(BackendEnabledState.DISABLED, model.backends().get(0).enabledState());
        Assertions.assertEquals(1465256653, model.backends().get(0).priority());
        Assertions.assertEquals(576086700, model.backends().get(0).weight());
        Assertions.assertEquals("gsgbdhuzq", model.backends().get(0).backendHostHeader());
        Assertions.assertEquals("yxcdyuibhmfdnbzy", model.loadBalancingSettings().id());
        Assertions.assertEquals("vfcjnaeoisrvhmg", model.healthProbeSettings().id());
    }
}
