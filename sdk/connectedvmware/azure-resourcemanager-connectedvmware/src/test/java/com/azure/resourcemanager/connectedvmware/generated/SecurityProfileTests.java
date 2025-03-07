// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.connectedvmware.models.SecurityProfile;
import com.azure.resourcemanager.connectedvmware.models.UefiSettings;
import org.junit.jupiter.api.Assertions;

public final class SecurityProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityProfile model
            = BinaryData.fromString("{\"uefiSettings\":{\"secureBootEnabled\":true}}").toObject(SecurityProfile.class);
        Assertions.assertEquals(true, model.uefiSettings().secureBootEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityProfile model = new SecurityProfile().withUefiSettings(new UefiSettings().withSecureBootEnabled(true));
        model = BinaryData.fromObject(model).toObject(SecurityProfile.class);
        Assertions.assertEquals(true, model.uefiSettings().secureBootEnabled());
    }
}
