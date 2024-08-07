// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGet;
import com.azure.resourcemanager.appcontainers.models.ContainerAppProbeHttpGetHttpHeadersItem;
import com.azure.resourcemanager.appcontainers.models.Scheme;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ContainerAppProbeHttpGetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerAppProbeHttpGet model = BinaryData.fromString(
            "{\"host\":\"lvpnpp\",\"httpHeaders\":[{\"name\":\"lrwdmhdlxyj\",\"value\":\"xsaga\"},{\"name\":\"cnihgwqapnedgfbc\",\"value\":\"kcvqvpke\"}],\"path\":\"cvdrhvoodsot\",\"port\":1582782062,\"scheme\":\"HTTPS\"}")
            .toObject(ContainerAppProbeHttpGet.class);
        Assertions.assertEquals("lvpnpp", model.host());
        Assertions.assertEquals("lrwdmhdlxyj", model.httpHeaders().get(0).name());
        Assertions.assertEquals("xsaga", model.httpHeaders().get(0).value());
        Assertions.assertEquals("cvdrhvoodsot", model.path());
        Assertions.assertEquals(1582782062, model.port());
        Assertions.assertEquals(Scheme.HTTPS, model.scheme());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerAppProbeHttpGet model
            = new ContainerAppProbeHttpGet().withHost("lvpnpp")
                .withHttpHeaders(Arrays.asList(
                    new ContainerAppProbeHttpGetHttpHeadersItem().withName("lrwdmhdlxyj").withValue("xsaga"),
                    new ContainerAppProbeHttpGetHttpHeadersItem().withName("cnihgwqapnedgfbc").withValue("kcvqvpke")))
                .withPath("cvdrhvoodsot")
                .withPort(1582782062)
                .withScheme(Scheme.HTTPS);
        model = BinaryData.fromObject(model).toObject(ContainerAppProbeHttpGet.class);
        Assertions.assertEquals("lvpnpp", model.host());
        Assertions.assertEquals("lrwdmhdlxyj", model.httpHeaders().get(0).name());
        Assertions.assertEquals("xsaga", model.httpHeaders().get(0).value());
        Assertions.assertEquals("cvdrhvoodsot", model.path());
        Assertions.assertEquals(1582782062, model.port());
        Assertions.assertEquals(Scheme.HTTPS, model.scheme());
    }
}
