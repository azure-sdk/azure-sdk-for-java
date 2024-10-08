// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.fluent.models.ExtensionPatchProperties;
import com.azure.resourcemanager.azurestackhci.models.ExtensionPatchParameters;
import org.junit.jupiter.api.Assertions;

public final class ExtensionPatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExtensionPatchProperties model = BinaryData.fromString(
            "{\"extensionParameters\":{\"typeHandlerVersion\":\"wvvb\",\"enableAutomaticUpgrade\":false,\"settings\":\"datal\",\"protectedSettings\":\"datahpodbzev\"}}")
            .toObject(ExtensionPatchProperties.class);
        Assertions.assertEquals("wvvb", model.extensionParameters().typeHandlerVersion());
        Assertions.assertEquals(false, model.extensionParameters().enableAutomaticUpgrade());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExtensionPatchProperties model = new ExtensionPatchProperties()
            .withExtensionParameters(new ExtensionPatchParameters().withTypeHandlerVersion("wvvb")
                .withEnableAutomaticUpgrade(false)
                .withSettings("datal")
                .withProtectedSettings("datahpodbzev"));
        model = BinaryData.fromObject(model).toObject(ExtensionPatchProperties.class);
        Assertions.assertEquals("wvvb", model.extensionParameters().typeHandlerVersion());
        Assertions.assertEquals(false, model.extensionParameters().enableAutomaticUpgrade());
    }
}
