// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.storagediscovery.generated;

import com.azure.resourcemanager.storagediscovery.models.StorageDiscoveryResourceType;
import com.azure.resourcemanager.storagediscovery.models.StorageDiscoveryScope;
import com.azure.resourcemanager.storagediscovery.models.StorageDiscoveryWorkspaceProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for StorageDiscoveryWorkspaces CreateOrUpdate.
 */
public final class StorageDiscoveryWorkspacesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-06-01-preview/StorageDiscoveryWorkspaces_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or Update a StorageDiscoveryWorkspace.
     * 
     * @param manager Entry point to StorageDiscoveryManager.
     */
    public static void createOrUpdateAStorageDiscoveryWorkspace(
        com.azure.resourcemanager.storagediscovery.StorageDiscoveryManager manager) {
        manager.storageDiscoveryWorkspaces()
            .define("Sample-Storage-Workspace")
            .withRegion("westeurope")
            .withExistingResourceGroup("sample-rg")
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withProperties(new StorageDiscoveryWorkspaceProperties()
                .withDescription("Sample Storage Discovery Workspace")
                .withWorkspaceRoots(Arrays.asList("/subscriptions/b79cb3ba-745e-5d9a-8903-4a02327a7e09"))
                .withScopes(Arrays.asList(new StorageDiscoveryScope().withDisplayName("Sample-Collection")
                    .withResourceTypes(Arrays.asList(StorageDiscoveryResourceType.fromString(
                        "/subscriptions/b79cb3ba-745e-5d9a-8903-4a02327a7e09/resourceGroups/sample-rg/providers/Microsoft.Storage/storageAccounts/sample-storageAccount")))
                    .withTagKeysOnly(Arrays.asList("filterTag1", "filterTag2"))
                    .withTags(mapOf("filterTag3", "value3", "filterTag4", "value4")),
                    new StorageDiscoveryScope().withDisplayName("Sample-Collection-2")
                        .withResourceTypes(Arrays.asList(StorageDiscoveryResourceType.fromString(
                            "/subscriptions/b79cb3ba-745e-5d9a-8903-4a02327a7e09/resourceGroups/sample-rg/providers/Microsoft.Storage/storageAccounts/sample-storageAccount")))
                        .withTagKeysOnly(Arrays.asList("filterTag5"))
                        .withTags(mapOf("filterTag6", "value6")))))
            .create();
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
