// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.ClientCertificateCommonName;
import org.junit.jupiter.api.Assertions;

public final class ClientCertificateCommonNameTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientCertificateCommonName model = BinaryData.fromString(
            "{\"isAdmin\":false,\"certificateCommonName\":\"jpsq\",\"certificateIssuerThumbprint\":\"cmpoyfdkfogkny\"}")
            .toObject(ClientCertificateCommonName.class);
        Assertions.assertEquals(false, model.isAdmin());
        Assertions.assertEquals("jpsq", model.certificateCommonName());
        Assertions.assertEquals("cmpoyfdkfogkny", model.certificateIssuerThumbprint());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientCertificateCommonName model = new ClientCertificateCommonName().withIsAdmin(false)
            .withCertificateCommonName("jpsq")
            .withCertificateIssuerThumbprint("cmpoyfdkfogkny");
        model = BinaryData.fromObject(model).toObject(ClientCertificateCommonName.class);
        Assertions.assertEquals(false, model.isAdmin());
        Assertions.assertEquals("jpsq", model.certificateCommonName());
        Assertions.assertEquals("cmpoyfdkfogkny", model.certificateIssuerThumbprint());
    }
}
