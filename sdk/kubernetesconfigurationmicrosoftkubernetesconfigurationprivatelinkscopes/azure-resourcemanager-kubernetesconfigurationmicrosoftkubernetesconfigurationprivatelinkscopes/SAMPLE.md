# Code snippets and samples


## PrivateEndpointConnections

- [CreateOrUpdate](#privateendpointconnections_createorupdate)
- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [ListByPrivateLinkScope](#privateendpointconnections_listbyprivatelinkscope)

## PrivateLinkResources

- [Get](#privatelinkresources_get)
- [ListByPrivateLinkScope](#privatelinkresources_listbyprivatelinkscope)

## PrivateLinkScopes

- [CreateOrUpdate](#privatelinkscopes_createorupdate)
- [Delete](#privatelinkscopes_delete)
- [GetByResourceGroup](#privatelinkscopes_getbyresourcegroup)
- [List](#privatelinkscopes_list)
- [ListByResourceGroup](#privatelinkscopes_listbyresourcegroup)
- [UpdateTags](#privatelinkscopes_updatetags)
### PrivateEndpointConnections_CreateOrUpdate

```java
/**
 * Samples for PrivateEndpointConnections ListByPrivateLinkScope.
 */
public final class PrivateEndpointConnectionsListByPrivateLinkScopeSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateEndpointConnectionList.json
     */
    /**
     * Sample code: Gets list of private endpoint connections on a private link scope.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void getsListOfPrivateEndpointConnectionsOnAPrivateLinkScope(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateEndpointConnections()
            .listByPrivateLinkScopeWithResponse("myResourceGroup", "myPrivateLinkScope",
                com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Delete

```java
/**
 * Samples for PrivateLinkScopes ListByResourceGroup.
 */
public final class PrivateLinkScopesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateLinkScopesListByResourceGroup.json
     */
    /**
     * Sample code: PrivateLinkScopeListByResourceGroup.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void privateLinkScopeListByResourceGroup(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateLinkScopes().listByResourceGroup("my-resource-group", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
import com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.models.PrivateLinkServiceConnectionState;

/**
 * Samples for PrivateEndpointConnections CreateOrUpdate.
 */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateEndpointConnectionUpdate.json
     */
    /**
     * Sample code: Approve or reject a private endpoint connection with a given name.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void approveOrRejectAPrivateEndpointConnectionWithAGivenName(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateEndpointConnections()
            .define("private-endpoint-connection-name")
            .withExistingPrivateLinkScope("myResourceGroup", "myPrivateLinkScope")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                    .withDescription("Approved by johndoe@contoso.com"))
            .create();
    }
}
```

### PrivateEndpointConnections_ListByPrivateLinkScope

```java
/**
 * Samples for PrivateLinkResources Get.
 */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateLinkScopePrivateLinkResourceGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void getsPrivateEndpointConnection(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateLinkResources()
            .getWithResponse("myResourceGroup", "myPrivateLinkScope", "KubernetesConfiguration",
                com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_Get

```java
/**
 * Samples for PrivateEndpointConnections Delete.
 */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateEndpointConnectionDelete.json
     */
    /**
     * Sample code: Deletes a private endpoint connection with a given name.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void deletesAPrivateEndpointConnectionWithAGivenName(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateEndpointConnections()
            .deleteWithResponse("myResourceGroup", "myPrivateLinkScope", "private-endpoint-connection-name",
                com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_ListByPrivateLinkScope

```java
/**
 * Samples for PrivateLinkScopes GetByResourceGroup.
 */
public final class PrivateLinkScopesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateLinkScopesGet.json
     */
    /**
     * Sample code: PrivateLinkScopeGet.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void privateLinkScopeGet(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateLinkScopes()
            .getByResourceGroupWithResponse("my-resource-group", "my-privatelinkscope",
                com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkScopes_CreateOrUpdate

```java
import com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.models.KubernetesConfigurationPrivateLinkScope;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PrivateLinkScopes UpdateTags.
 */
public final class PrivateLinkScopesUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateLinkScopesUpdateTagsOnly.json
     */
    /**
     * Sample code: PrivateLinkScopeUpdateTagsOnly.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void privateLinkScopeUpdateTagsOnly(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        KubernetesConfigurationPrivateLinkScope resource = manager.privateLinkScopes()
            .getByResourceGroupWithResponse("my-resource-group", "my-privatelinkscope",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("Tag1", "Value1", "Tag2", "Value2")).apply();
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

### PrivateLinkScopes_Delete

```java
/**
 * Samples for PrivateLinkScopes Delete.
 */
public final class PrivateLinkScopesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateLinkScopesDelete.json
     */
    /**
     * Sample code: PrivateLinkScopesDelete.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void privateLinkScopesDelete(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateLinkScopes()
            .deleteByResourceGroupWithResponse("my-resource-group", "my-privatelinkscope",
                com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkScopes_GetByResourceGroup

```java
/**
 * Samples for PrivateEndpointConnections Get.
 */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateEndpointConnectionGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void getsPrivateEndpointConnection(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateEndpointConnections()
            .getWithResponse("myResourceGroup", "myPrivateLinkScope", "private-endpoint-connection-name",
                com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkScopes_List

```java
/**
 * Samples for PrivateLinkScopes List.
 */
public final class PrivateLinkScopesListSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateLinkScopesList.json
     */
    /**
     * Sample code: PrivateLinkScopesList.json.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void privateLinkScopesListJson(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateLinkScopes().list(com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkScopes_ListByResourceGroup

```java
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PrivateLinkScopes CreateOrUpdate.
 */
public final class PrivateLinkScopesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateLinkScopesCreate.json
     */
    /**
     * Sample code: PrivateLinkScopeCreate.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void privateLinkScopeCreate(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateLinkScopes()
            .define("my-privatelinkscope")
            .withRegion("westus")
            .withExistingResourceGroup("my-resource-group")
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateLinkScopesUpdate.json
     */
    /**
     * Sample code: PrivateLinkScopeUpdate.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void privateLinkScopeUpdate(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateLinkScopes()
            .define("my-privatelinkscope")
            .withRegion("westus")
            .withExistingResourceGroup("my-resource-group")
            .withTags(mapOf("Tag1", "Value1"))
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

### PrivateLinkScopes_UpdateTags

```java
/**
 * Samples for PrivateLinkResources ListByPrivateLinkScope.
 */
public final class PrivateLinkResourcesListByPrivateLinkScopeSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/privateLinkScopes/
     * preview/2024-11-01-preview/examples/PrivateLinkScopePrivateLinkResourceListGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     * 
     * @param manager Entry point to PrivateLinkScopesManager.
     */
    public static void getsPrivateEndpointConnection(
        com.azure.resourcemanager.kubernetesconfigurationmicrosoftkubernetesconfigurationprivatelinkscopes.PrivateLinkScopesManager manager) {
        manager.privateLinkResources()
            .listByPrivateLinkScopeWithResponse("myResourceGroup", "myPrivateLinkScope",
                com.azure.core.util.Context.NONE);
    }
}
```

