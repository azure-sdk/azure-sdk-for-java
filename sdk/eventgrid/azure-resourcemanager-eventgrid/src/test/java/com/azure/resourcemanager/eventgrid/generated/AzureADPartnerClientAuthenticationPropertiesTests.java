// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.AzureADPartnerClientAuthenticationProperties;
import org.junit.jupiter.api.Assertions;

public final class AzureADPartnerClientAuthenticationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureADPartnerClientAuthenticationProperties model = BinaryData.fromString(
            "{\"azureActiveDirectoryTenantId\":\"mfcnrjajqmatxj\",\"azureActiveDirectoryApplicationIdOrUri\":\"elnzqgxxgfbbmt\"}")
            .toObject(AzureADPartnerClientAuthenticationProperties.class);
        Assertions.assertEquals("mfcnrjajqmatxj", model.azureActiveDirectoryTenantId());
        Assertions.assertEquals("elnzqgxxgfbbmt", model.azureActiveDirectoryApplicationIdOrUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureADPartnerClientAuthenticationProperties model
            = new AzureADPartnerClientAuthenticationProperties().withAzureActiveDirectoryTenantId("mfcnrjajqmatxj")
                .withAzureActiveDirectoryApplicationIdOrUri("elnzqgxxgfbbmt");
        model = BinaryData.fromObject(model).toObject(AzureADPartnerClientAuthenticationProperties.class);
        Assertions.assertEquals("mfcnrjajqmatxj", model.azureActiveDirectoryTenantId());
        Assertions.assertEquals("elnzqgxxgfbbmt", model.azureActiveDirectoryApplicationIdOrUri());
    }
}
