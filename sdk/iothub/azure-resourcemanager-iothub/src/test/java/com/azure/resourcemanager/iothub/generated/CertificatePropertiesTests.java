// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.CertificateProperties;
import org.junit.jupiter.api.Assertions;

public final class CertificatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CertificateProperties model = BinaryData.fromString(
            "{\"subject\":\"otllxdyhgsyo\",\"expiry\":\"Fri, 30 Apr 2021 11:16:28 GMT\",\"thumbprint\":\"ltdtbnnhad\",\"isVerified\":true,\"created\":\"Sun, 16 May 2021 20:34:23 GMT\",\"updated\":\"Wed, 23 Dec 2020 13:08:39 GMT\",\"certificate\":\"khnvpam\"}")
            .toObject(CertificateProperties.class);
        Assertions.assertEquals(true, model.isVerified());
        Assertions.assertEquals("khnvpam", model.certificate());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CertificateProperties model = new CertificateProperties().withIsVerified(true).withCertificate("khnvpam");
        model = BinaryData.fromObject(model).toObject(CertificateProperties.class);
        Assertions.assertEquals(true, model.isVerified());
        Assertions.assertEquals("khnvpam", model.certificate());
    }
}
