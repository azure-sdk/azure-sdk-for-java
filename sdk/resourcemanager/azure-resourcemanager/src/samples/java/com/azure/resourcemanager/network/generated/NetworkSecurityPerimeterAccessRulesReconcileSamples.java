// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;

/**
 * Samples for NetworkSecurityPerimeterAccessRules Reconcile.
 */
public final class NetworkSecurityPerimeterAccessRulesReconcileSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/NspAccessRuleReconcile.json
     */
    /**
     * Sample code: NspAccessRuleReconcile.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void nspAccessRuleReconcile(com.azure.resourcemanager.AzureResourceManager azure) throws IOException {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkSecurityPerimeterAccessRules()
            .reconcileWithResponse("rg1", "nsp1", "profile1", "accessRuleName1",
                SerializerFactory.createDefaultManagementSerializerAdapter()
                    .deserialize("{\"properties\":{}}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }
}
