// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagepool.fluent.models.OutboundEnvironmentEndpointInner;
import com.azure.resourcemanager.storagepool.models.EndpointDependency;
import com.azure.resourcemanager.storagepool.models.EndpointDetail;
import com.azure.resourcemanager.storagepool.models.OutboundEnvironmentEndpointList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OutboundEnvironmentEndpointListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OutboundEnvironmentEndpointList model = BinaryData.fromString(
            "{\"value\":[{\"category\":\"dhbt\",\"endpoints\":[{\"domainName\":\"ywpnvjt\",\"endpointDetails\":[{},{}]},{\"domainName\":\"rmclfplphoxu\",\"endpointDetails\":[{},{}]}]},{\"category\":\"abgy\",\"endpoints\":[{\"domainName\":\"jta\",\"endpointDetails\":[{},{},{}]}]}],\"nextLink\":\"xywpmueefjzwfqkq\"}")
            .toObject(OutboundEnvironmentEndpointList.class);
        Assertions.assertEquals("dhbt", model.value().get(0).category());
        Assertions.assertEquals("ywpnvjt", model.value().get(0).endpoints().get(0).domainName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OutboundEnvironmentEndpointList model = new OutboundEnvironmentEndpointList().withValue(Arrays.asList(
            new OutboundEnvironmentEndpointInner().withCategory("dhbt")
                .withEndpoints(Arrays.asList(
                    new EndpointDependency().withDomainName("ywpnvjt")
                        .withEndpointDetails(Arrays.asList(new EndpointDetail(), new EndpointDetail())),
                    new EndpointDependency().withDomainName("rmclfplphoxu")
                        .withEndpointDetails(Arrays.asList(new EndpointDetail(), new EndpointDetail())))),
            new OutboundEnvironmentEndpointInner().withCategory("abgy")
                .withEndpoints(Arrays.asList(new EndpointDependency().withDomainName("jta")
                    .withEndpointDetails(
                        Arrays.asList(new EndpointDetail(), new EndpointDetail(), new EndpointDetail()))))));
        model = BinaryData.fromObject(model).toObject(OutboundEnvironmentEndpointList.class);
        Assertions.assertEquals("dhbt", model.value().get(0).category());
        Assertions.assertEquals("ywpnvjt", model.value().get(0).endpoints().get(0).domainName());
    }
}
