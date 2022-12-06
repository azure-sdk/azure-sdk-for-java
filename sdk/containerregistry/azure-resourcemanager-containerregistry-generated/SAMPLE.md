# Code snippets and samples


## Operations

- [List](#operations_list)

## PrivateEndpointConnections

- [CreateOrUpdate](#privateendpointconnections_createorupdate)
- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [List](#privateendpointconnections_list)

## Registries

- [CheckNameAvailability](#registries_checknameavailability)
- [Create](#registries_create)
- [Delete](#registries_delete)
- [GetByResourceGroup](#registries_getbyresourcegroup)
- [GetPrivateLinkResource](#registries_getprivatelinkresource)
- [ImportImage](#registries_importimage)
- [List](#registries_list)
- [ListByResourceGroup](#registries_listbyresourcegroup)
- [ListCredentials](#registries_listcredentials)
- [ListPrivateLinkResources](#registries_listprivatelinkresources)
- [ListUsages](#registries_listusages)
- [RegenerateCredential](#registries_regeneratecredential)
- [Update](#registries_update)

## Replications

- [Create](#replications_create)
- [Delete](#replications_delete)
- [Get](#replications_get)
- [List](#replications_list)
- [Update](#replications_update)

## Webhooks

- [Create](#webhooks_create)
- [Delete](#webhooks_delete)
- [Get](#webhooks_get)
- [GetCallbackConfig](#webhooks_getcallbackconfig)
- [List](#webhooks_list)
- [ListEvents](#webhooks_listevents)
- [Ping](#webhooks_ping)
- [Update](#webhooks_update)
### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/OperationList.json
     */
    /**
     * Sample code: OperationList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void operationList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

### PrivateEndpointConnections_CreateOrUpdate

```java
import com.azure.resourcemanager.containerregistry.generated.models.ConnectionStatus;
import com.azure.resourcemanager.containerregistry.generated.models.PrivateLinkServiceConnectionState;

/** Samples for PrivateEndpointConnections CreateOrUpdate. */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/PrivateEndpointConnectionCreateOrUpdate.json
     */
    /**
     * Sample code: PrivateEndpointConnectionCreateOrUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void privateEndpointConnectionCreateOrUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .privateEndpointConnections()
            .define("myConnection")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState()
                    .withStatus(ConnectionStatus.APPROVED)
                    .withDescription("Auto-Approved"))
            .create();
    }
}
```

### PrivateEndpointConnections_Delete

```java
import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/PrivateEndpointConnectionDelete.json
     */
    /**
     * Sample code: PrivateEndpointConnectionDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void privateEndpointConnectionDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.privateEndpointConnections().delete("myResourceGroup", "myRegistry", "myConnection", Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/PrivateEndpointConnectionGet.json
     */
    /**
     * Sample code: PrivateEndpointConnectionGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void privateEndpointConnectionGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse("myResourceGroup", "myRegistry", "myConnection", Context.NONE);
    }
}
```

### PrivateEndpointConnections_List

```java
import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections List. */
public final class PrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/PrivateEndpointConnectionList.json
     */
    /**
     * Sample code: PrivateEndpointConnectionList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void privateEndpointConnectionList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.privateEndpointConnections().list("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### Registries_CheckNameAvailability

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.RegistryNameCheckRequest;

/** Samples for Registries CheckNameAvailability. */
public final class RegistriesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryCheckNameAvailable.json
     */
    /**
     * Sample code: RegistryCheckNameAvailable.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryCheckNameAvailable(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .checkNameAvailabilityWithResponse(new RegistryNameCheckRequest().withName("myRegistry"), Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryCheckNameNotAvailable.json
     */
    /**
     * Sample code: RegistryCheckNameNotAvailable.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryCheckNameNotAvailable(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .checkNameAvailabilityWithResponse(new RegistryNameCheckRequest().withName("myRegistry"), Context.NONE);
    }
}
```

### Registries_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.Sku;
import com.azure.resourcemanager.containerregistry.generated.models.SkuName;
import com.azure.resourcemanager.containerregistry.generated.models.ZoneRedundancy;
import java.util.HashMap;
import java.util.Map;

/** Samples for Registries Create. */
public final class RegistriesCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryCreateZoneRedundant.json
     */
    /**
     * Sample code: RegistryCreateZoneRedundant.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryCreateZoneRedundant(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .define("myRegistry")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new Sku().withName(SkuName.STANDARD))
            .withTags(mapOf("key", "value"))
            .withZoneRedundancy(ZoneRedundancy.ENABLED)
            .create();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryCreate.json
     */
    /**
     * Sample code: RegistryCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .define("myRegistry")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new Sku().withName(SkuName.STANDARD))
            .withTags(mapOf("key", "value"))
            .withAdminUserEnabled(true)
            .create();
    }

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

### Registries_Delete

```java
import com.azure.core.util.Context;

/** Samples for Registries Delete. */
public final class RegistriesDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryDelete.json
     */
    /**
     * Sample code: RegistryDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().delete("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### Registries_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Registries GetByResourceGroup. */
public final class RegistriesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryGet.json
     */
    /**
     * Sample code: RegistryGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().getByResourceGroupWithResponse("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### Registries_GetPrivateLinkResource

```java
import com.azure.core.util.Context;

/** Samples for Registries GetPrivateLinkResource. */
public final class RegistriesGetPrivateLinkResourceSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryGetPrivateLinkResource.json
     */
    /**
     * Sample code: RegistryGetPrivateLinkResource.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryGetPrivateLinkResource(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .getPrivateLinkResourceWithResponse("myResourceGroup", "myRegistry", "registry", Context.NONE);
    }
}
```

### Registries_ImportImage

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.ImportImageParameters;
import com.azure.resourcemanager.containerregistry.generated.models.ImportMode;
import com.azure.resourcemanager.containerregistry.generated.models.ImportSource;
import java.util.Arrays;

/** Samples for Registries ImportImage. */
public final class RegistriesImportImageSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ImportImageFromPublicRegistry.json
     */
    /**
     * Sample code: ImportImageFromPublicRegistry.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void importImageFromPublicRegistry(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .importImage(
                "myResourceGroup",
                "myRegistry",
                new ImportImageParameters()
                    .withSource(
                        new ImportSource()
                            .withRegistryUri("registry.hub.docker.com")
                            .withSourceImage("library/hello-world"))
                    .withTargetTags(Arrays.asList("targetRepository:targetTag"))
                    .withUntaggedTargetRepositories(Arrays.asList("targetRepository1"))
                    .withMode(ImportMode.FORCE),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ImportImageByTag.json
     */
    /**
     * Sample code: ImportImageByTag.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void importImageByTag(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .importImage(
                "myResourceGroup",
                "myRegistry",
                new ImportImageParameters()
                    .withSource(
                        new ImportSource()
                            .withResourceId(
                                "/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/sourceResourceGroup/providers/Microsoft.ContainerRegistry/registries/sourceRegistry")
                            .withSourceImage("sourceRepository:sourceTag"))
                    .withTargetTags(Arrays.asList("targetRepository:targetTag"))
                    .withUntaggedTargetRepositories(Arrays.asList("targetRepository1"))
                    .withMode(ImportMode.FORCE),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ImportImageByManifestDigest.json
     */
    /**
     * Sample code: ImportImageByManifestDigest.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void importImageByManifestDigest(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .importImage(
                "myResourceGroup",
                "myRegistry",
                new ImportImageParameters()
                    .withSource(
                        new ImportSource()
                            .withResourceId(
                                "/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/sourceResourceGroup/providers/Microsoft.ContainerRegistry/registries/sourceRegistry")
                            .withSourceImage(
                                "sourceRepository@sha256:0000000000000000000000000000000000000000000000000000000000000000"))
                    .withTargetTags(Arrays.asList("targetRepository:targetTag"))
                    .withUntaggedTargetRepositories(Arrays.asList("targetRepository1"))
                    .withMode(ImportMode.FORCE),
                Context.NONE);
    }
}
```

### Registries_List

```java
import com.azure.core.util.Context;

/** Samples for Registries List. */
public final class RegistriesListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryList.json
     */
    /**
     * Sample code: RegistryList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().list(Context.NONE);
    }
}
```

### Registries_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Registries ListByResourceGroup. */
public final class RegistriesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryListByResourceGroup.json
     */
    /**
     * Sample code: RegistryListByResourceGroup.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryListByResourceGroup(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
```

### Registries_ListCredentials

```java
import com.azure.core.util.Context;

/** Samples for Registries ListCredentials. */
public final class RegistriesListCredentialsSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryListCredentials.json
     */
    /**
     * Sample code: RegistryListCredentials.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryListCredentials(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().listCredentialsWithResponse("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### Registries_ListPrivateLinkResources

```java
import com.azure.core.util.Context;

/** Samples for Registries ListPrivateLinkResources. */
public final class RegistriesListPrivateLinkResourcesSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryListPrivateLinkResources.json
     */
    /**
     * Sample code: RegistryListPrivateLinkResources.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryListPrivateLinkResources(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().listPrivateLinkResources("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### Registries_ListUsages

```java
import com.azure.core.util.Context;

/** Samples for Registries ListUsages. */
public final class RegistriesListUsagesSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryListUsages.json
     */
    /**
     * Sample code: RegistryListUsages.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryListUsages(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().listUsagesWithResponse("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### Registries_RegenerateCredential

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.PasswordName;
import com.azure.resourcemanager.containerregistry.generated.models.RegenerateCredentialParameters;

/** Samples for Registries RegenerateCredential. */
public final class RegistriesRegenerateCredentialSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryRegenerateCredential.json
     */
    /**
     * Sample code: RegistryRegenerateCredential.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryRegenerateCredential(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .regenerateCredentialWithResponse(
                "myResourceGroup",
                "myRegistry",
                new RegenerateCredentialParameters().withName(PasswordName.PASSWORD),
                Context.NONE);
    }
}
```

### Registries_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.Registry;
import com.azure.resourcemanager.containerregistry.generated.models.Sku;
import com.azure.resourcemanager.containerregistry.generated.models.SkuName;
import java.util.HashMap;
import java.util.Map;

/** Samples for Registries Update. */
public final class RegistriesUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryUpdate.json
     */
    /**
     * Sample code: RegistryUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Registry resource =
            manager
                .registries()
                .getByResourceGroupWithResponse("myResourceGroup", "myRegistry", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key", "value"))
            .withSku(new Sku().withName(SkuName.STANDARD))
            .withAdminUserEnabled(true)
            .apply();
    }

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

### Replications_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.ZoneRedundancy;
import java.util.HashMap;
import java.util.Map;

/** Samples for Replications Create. */
public final class ReplicationsCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ReplicationCreate.json
     */
    /**
     * Sample code: ReplicationCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void replicationCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .replications()
            .define("myReplication")
            .withRegion("eastus")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withTags(mapOf("key", "value"))
            .create();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ReplicationCreateZoneRedundant.json
     */
    /**
     * Sample code: ReplicationCreateZoneRedundant.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void replicationCreateZoneRedundant(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .replications()
            .define("myReplication")
            .withRegion("eastus")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withTags(mapOf("key", "value"))
            .withRegionEndpointEnabled(true)
            .withZoneRedundancy(ZoneRedundancy.ENABLED)
            .create();
    }

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

### Replications_Delete

```java
import com.azure.core.util.Context;

/** Samples for Replications Delete. */
public final class ReplicationsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ReplicationDelete.json
     */
    /**
     * Sample code: ReplicationDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void replicationDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.replications().delete("myResourceGroup", "myRegistry", "myReplication", Context.NONE);
    }
}
```

### Replications_Get

```java
import com.azure.core.util.Context;

/** Samples for Replications Get. */
public final class ReplicationsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ReplicationGet.json
     */
    /**
     * Sample code: ReplicationGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void replicationGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.replications().getWithResponse("myResourceGroup", "myRegistry", "myReplication", Context.NONE);
    }
}
```

### Replications_List

```java
import com.azure.core.util.Context;

/** Samples for Replications List. */
public final class ReplicationsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ReplicationList.json
     */
    /**
     * Sample code: ReplicationList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void replicationList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.replications().list("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### Replications_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.Replication;
import java.util.HashMap;
import java.util.Map;

/** Samples for Replications Update. */
public final class ReplicationsUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ReplicationUpdate.json
     */
    /**
     * Sample code: ReplicationUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void replicationUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Replication resource =
            manager
                .replications()
                .getWithResponse("myResourceGroup", "myRegistry", "myReplication", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key", "value")).apply();
    }

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

### Webhooks_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.WebhookAction;
import com.azure.resourcemanager.containerregistry.generated.models.WebhookStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Webhooks Create. */
public final class WebhooksCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/WebhookCreate.json
     */
    /**
     * Sample code: WebhookCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .webhooks()
            .define("myWebhook")
            .withRegion("westus")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withTags(mapOf("key", "value"))
            .withServiceUri("http://myservice.com")
            .withCustomHeaders(mapOf("Authorization", "Basic 000000000000000000000000000000000000000000000000000"))
            .withStatus(WebhookStatus.ENABLED)
            .withScope("myRepository")
            .withActions(Arrays.asList(WebhookAction.PUSH))
            .create();
    }

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

### Webhooks_Delete

```java
import com.azure.core.util.Context;

/** Samples for Webhooks Delete. */
public final class WebhooksDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/WebhookDelete.json
     */
    /**
     * Sample code: WebhookDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.webhooks().delete("myResourceGroup", "myRegistry", "myWebhook", Context.NONE);
    }
}
```

### Webhooks_Get

```java
import com.azure.core.util.Context;

/** Samples for Webhooks Get. */
public final class WebhooksGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/WebhookGet.json
     */
    /**
     * Sample code: WebhookGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.webhooks().getWithResponse("myResourceGroup", "myRegistry", "myWebhook", Context.NONE);
    }
}
```

### Webhooks_GetCallbackConfig

```java
import com.azure.core.util.Context;

/** Samples for Webhooks GetCallbackConfig. */
public final class WebhooksGetCallbackConfigSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/WebhookGetCallbackConfig.json
     */
    /**
     * Sample code: WebhookGetCallbackConfig.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookGetCallbackConfig(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.webhooks().getCallbackConfigWithResponse("myResourceGroup", "myRegistry", "myWebhook", Context.NONE);
    }
}
```

### Webhooks_List

```java
import com.azure.core.util.Context;

/** Samples for Webhooks List. */
public final class WebhooksListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/WebhookList.json
     */
    /**
     * Sample code: WebhookList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.webhooks().list("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### Webhooks_ListEvents

```java
import com.azure.core.util.Context;

/** Samples for Webhooks ListEvents. */
public final class WebhooksListEventsSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/WebhookListEvents.json
     */
    /**
     * Sample code: WebhookListEvents.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookListEvents(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.webhooks().listEvents("myResourceGroup", "myRegistry", "myWebhook", Context.NONE);
    }
}
```

### Webhooks_Ping

```java
import com.azure.core.util.Context;

/** Samples for Webhooks Ping. */
public final class WebhooksPingSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/WebhookPing.json
     */
    /**
     * Sample code: WebhookPing.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookPing(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.webhooks().pingWithResponse("myResourceGroup", "myRegistry", "myWebhook", Context.NONE);
    }
}
```

### Webhooks_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.Webhook;
import com.azure.resourcemanager.containerregistry.generated.models.WebhookAction;
import com.azure.resourcemanager.containerregistry.generated.models.WebhookStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Webhooks Update. */
public final class WebhooksUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/WebhookUpdate.json
     */
    /**
     * Sample code: WebhookUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Webhook resource =
            manager.webhooks().getWithResponse("myResourceGroup", "myRegistry", "myWebhook", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("key", "value"))
            .withServiceUri("http://myservice.com")
            .withCustomHeaders(mapOf("Authorization", "Basic 000000000000000000000000000000000000000000000000000"))
            .withStatus(WebhookStatus.ENABLED)
            .withScope("myRepository")
            .withActions(Arrays.asList(WebhookAction.PUSH))
            .apply();
    }

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

