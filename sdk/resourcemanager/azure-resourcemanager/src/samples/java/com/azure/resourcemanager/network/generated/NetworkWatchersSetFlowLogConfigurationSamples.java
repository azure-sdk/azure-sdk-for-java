// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.fluent.models.FlowLogInformationInner;
import com.azure.resourcemanager.network.models.ManagedServiceIdentity;
import com.azure.resourcemanager.network.models.ManagedServiceIdentityUserAssignedIdentities;
import com.azure.resourcemanager.network.models.ResourceIdentityType;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for NetworkWatchers SetFlowLogConfiguration.
 */
public final class NetworkWatchersSetFlowLogConfigurationSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2024-07-01/examples/
     * NetworkWatcherFlowLogConfigure.json
     */
    /**
     * Sample code: Configure flow log.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void configureFlowLog(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks()
            .manager()
            .serviceClient()
            .getNetworkWatchers()
            .setFlowLogConfiguration("rg1", "nw1", new FlowLogInformationInner()
                .withTargetResourceId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkSecurityGroups/nsg1")
                .withIdentity(new ManagedServiceIdentity().withType(ResourceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id1",
                        new ManagedServiceIdentityUserAssignedIdentities())))
                .withStorageId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Storage/storageAccounts/st1")
                .withEnabled(true), com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
