# Code snippets and samples


## NetworkSettings

- [Create](#networksettings_create)
- [Delete](#networksettings_delete)
- [GetByResourceGroup](#networksettings_getbyresourcegroup)
- [List](#networksettings_list)
- [ListByResourceGroup](#networksettings_listbyresourcegroup)
- [Update](#networksettings_update)

## Operations

- [List](#operations_list)
### NetworkSettings_Create

```java
import com.azure.resourcemanager.githubnetwork.models.NetworkSettingsResourceProperties;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for NetworkSettings Create.
 */
public final class NetworkSettingsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/github-network/resource-manager/GitHub.Network/stable/2024-04-02/examples/NetworkSettings_Create.
     * json
     */
    /**
     * Sample code: networkSettingsCreate.
     * 
     * @param manager Entry point to GitHubNetworkManager.
     */
    public static void networkSettingsCreate(com.azure.resourcemanager.githubnetwork.GitHubNetworkManager manager) {
        manager.networkSettings()
            .define("networkSettings")
            .withRegion("eastus")
            .withExistingResourceGroup("resourceGroup")
            .withTags(mapOf())
            .withProperties(new NetworkSettingsResourceProperties().withSubnetId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceGroup/providers/Microsoft.Network/virtualNetworks/vnet/subnets/subnet")
                .withBusinessId("GitHub"))
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
```

### NetworkSettings_Delete

```java
import com.azure.resourcemanager.githubnetwork.models.NetworkSettingsResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for NetworkSettings Update.
 */
public final class NetworkSettingsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/github-network/resource-manager/GitHub.Network/stable/2024-04-02/examples/NetworkSettings_Update.
     * json
     */
    /**
     * Sample code: networkSettingsUpdate.
     * 
     * @param manager Entry point to GitHubNetworkManager.
     */
    public static void networkSettingsUpdate(com.azure.resourcemanager.githubnetwork.GitHubNetworkManager manager) {
        NetworkSettingsResource resource = manager.networkSettings()
            .getByResourceGroupWithResponse("resourceGroup", "networkSettings", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tagName", "tagValue")).apply();
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
```

### NetworkSettings_GetByResourceGroup

```java
/**
 * Samples for NetworkSettings GetByResourceGroup.
 */
public final class NetworkSettingsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/github-network/resource-manager/GitHub.Network/stable/2024-04-02/examples/NetworkSettings_Get.json
     */
    /**
     * Sample code: networkSettingsGet.
     * 
     * @param manager Entry point to GitHubNetworkManager.
     */
    public static void networkSettingsGet(com.azure.resourcemanager.githubnetwork.GitHubNetworkManager manager) {
        manager.networkSettings()
            .getByResourceGroupWithResponse("resourceGroup", "networkSettings", com.azure.core.util.Context.NONE);
    }
}
```

### NetworkSettings_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/github-network/resource-manager/GitHub.Network/stable/2024-04-02/examples/Operations_List.json
     */
    /**
     * Sample code: operationsList.
     * 
     * @param manager Entry point to GitHubNetworkManager.
     */
    public static void operationsList(com.azure.resourcemanager.githubnetwork.GitHubNetworkManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### NetworkSettings_ListByResourceGroup

```java
/**
 * Samples for NetworkSettings Delete.
 */
public final class NetworkSettingsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/github-network/resource-manager/GitHub.Network/stable/2024-04-02/examples/NetworkSettings_Delete.
     * json
     */
    /**
     * Sample code: networkSettingsDelete.
     * 
     * @param manager Entry point to GitHubNetworkManager.
     */
    public static void networkSettingsDelete(com.azure.resourcemanager.githubnetwork.GitHubNetworkManager manager) {
        manager.networkSettings()
            .deleteByResourceGroupWithResponse("resourceGroup", "networkSettings", com.azure.core.util.Context.NONE);
    }
}
```

### NetworkSettings_Update

```java
/**
 * Samples for NetworkSettings List.
 */
public final class NetworkSettingsListSamples {
    /*
     * x-ms-original-file: specification/github-network/resource-manager/GitHub.Network/stable/2024-04-02/examples/
     * NetworkSettings_ListBySubscription.json
     */
    /**
     * Sample code: networkSettingsListBySub.
     * 
     * @param manager Entry point to GitHubNetworkManager.
     */
    public static void networkSettingsListBySub(com.azure.resourcemanager.githubnetwork.GitHubNetworkManager manager) {
        manager.networkSettings().list(com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for NetworkSettings ListByResourceGroup.
 */
public final class NetworkSettingsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/github-network/resource-manager/GitHub.Network/stable/2024-04-02/examples/
     * NetworkSettings_ListByResourceGroup.json
     */
    /**
     * Sample code: networkSettingsListGet.
     * 
     * @param manager Entry point to GitHubNetworkManager.
     */
    public static void networkSettingsListGet(com.azure.resourcemanager.githubnetwork.GitHubNetworkManager manager) {
        manager.networkSettings().listByResourceGroup("resourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

