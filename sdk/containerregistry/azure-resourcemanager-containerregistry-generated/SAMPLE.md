# Code snippets and samples


## AgentPools

- [Create](#agentpools_create)
- [Delete](#agentpools_delete)
- [Get](#agentpools_get)
- [GetQueueStatus](#agentpools_getqueuestatus)
- [List](#agentpools_list)
- [Update](#agentpools_update)

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
- [GenerateCredentials](#registries_generatecredentials)
- [GetBuildSourceUploadUrl](#registries_getbuildsourceuploadurl)
- [GetByResourceGroup](#registries_getbyresourcegroup)
- [GetPrivateLinkResource](#registries_getprivatelinkresource)
- [ImportImage](#registries_importimage)
- [List](#registries_list)
- [ListByResourceGroup](#registries_listbyresourcegroup)
- [ListCredentials](#registries_listcredentials)
- [ListPrivateLinkResources](#registries_listprivatelinkresources)
- [ListUsages](#registries_listusages)
- [RegenerateCredential](#registries_regeneratecredential)
- [ScheduleRun](#registries_schedulerun)
- [Update](#registries_update)

## Replications

- [Create](#replications_create)
- [Delete](#replications_delete)
- [Get](#replications_get)
- [List](#replications_list)
- [Update](#replications_update)

## Runs

- [Cancel](#runs_cancel)
- [Get](#runs_get)
- [GetLogSasUrl](#runs_getlogsasurl)
- [List](#runs_list)
- [Update](#runs_update)

## ScopeMaps

- [Create](#scopemaps_create)
- [Delete](#scopemaps_delete)
- [Get](#scopemaps_get)
- [List](#scopemaps_list)
- [Update](#scopemaps_update)

## TaskRuns

- [Create](#taskruns_create)
- [Delete](#taskruns_delete)
- [Get](#taskruns_get)
- [GetDetails](#taskruns_getdetails)
- [List](#taskruns_list)
- [Update](#taskruns_update)

## Tasks

- [Create](#tasks_create)
- [Delete](#tasks_delete)
- [Get](#tasks_get)
- [GetDetails](#tasks_getdetails)
- [List](#tasks_list)
- [Update](#tasks_update)

## Tokens

- [Create](#tokens_create)
- [Delete](#tokens_delete)
- [Get](#tokens_get)
- [List](#tokens_list)
- [Update](#tokens_update)

## Webhooks

- [Create](#webhooks_create)
- [Delete](#webhooks_delete)
- [Get](#webhooks_get)
- [GetCallbackConfig](#webhooks_getcallbackconfig)
- [List](#webhooks_list)
- [ListEvents](#webhooks_listevents)
- [Ping](#webhooks_ping)
- [Update](#webhooks_update)
### AgentPools_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.OS;
import java.util.HashMap;
import java.util.Map;

/** Samples for AgentPools Create. */
public final class AgentPoolsCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/AgentPoolsCreate.json
     */
    /**
     * Sample code: AgentPools_Create.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void agentPoolsCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .agentPools()
            .define("myAgentPool")
            .withRegion("WESTUS")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withTags(mapOf("key", "value"))
            .withCount(1)
            .withTier("S1")
            .withOs(OS.LINUX)
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

### AgentPools_Delete

```java
import com.azure.core.util.Context;

/** Samples for AgentPools Delete. */
public final class AgentPoolsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/AgentPoolsDelete.json
     */
    /**
     * Sample code: AgentPools_Delete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void agentPoolsDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.agentPools().delete("myResourceGroup", "myRegistry", "myAgentPool", Context.NONE);
    }
}
```

### AgentPools_Get

```java
import com.azure.core.util.Context;

/** Samples for AgentPools Get. */
public final class AgentPoolsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/AgentPoolsGet.json
     */
    /**
     * Sample code: AgentPools_Get.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void agentPoolsGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.agentPools().getWithResponse("myResourceGroup", "myRegistry", "myAgentPool", Context.NONE);
    }
}
```

### AgentPools_GetQueueStatus

```java
import com.azure.core.util.Context;

/** Samples for AgentPools GetQueueStatus. */
public final class AgentPoolsGetQueueStatusSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/AgentPoolsGetQueueStatus.json
     */
    /**
     * Sample code: AgentPools_GetQueueStatus.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void agentPoolsGetQueueStatus(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.agentPools().getQueueStatusWithResponse("myResourceGroup", "myRegistry", "myAgentPool", Context.NONE);
    }
}
```

### AgentPools_List

```java
import com.azure.core.util.Context;

/** Samples for AgentPools List. */
public final class AgentPoolsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/AgentPoolsList.json
     */
    /**
     * Sample code: AgentPools_List.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void agentPoolsList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.agentPools().list("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### AgentPools_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.AgentPool;

/** Samples for AgentPools Update. */
public final class AgentPoolsUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/AgentPoolsUpdate.json
     */
    /**
     * Sample code: AgentPools_Update.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void agentPoolsUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        AgentPool resource =
            manager
                .agentPools()
                .getWithResponse("myResourceGroup", "myRegistry", "myAgentPool", Context.NONE)
                .getValue();
        resource.update().withCount(1).apply();
    }
}
```

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

### Registries_GenerateCredentials

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.GenerateCredentialsParameters;
import java.time.OffsetDateTime;

/** Samples for Registries GenerateCredentials. */
public final class RegistriesGenerateCredentialsSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryGenerateCredentials.json
     */
    /**
     * Sample code: RegistryGenerateCredentials.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryGenerateCredentials(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .generateCredentials(
                "myResourceGroup",
                "myRegistry",
                new GenerateCredentialsParameters()
                    .withTokenId("fakeTokenPlaceholder")
                    .withExpiry(OffsetDateTime.parse("2020-12-31T15:59:59.0707808Z")),
                Context.NONE);
    }
}
```

### Registries_GetBuildSourceUploadUrl

```java
import com.azure.core.util.Context;

/** Samples for Registries GetBuildSourceUploadUrl. */
public final class RegistriesGetBuildSourceUploadUrlSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RegistriesGetBuildSourceUploadUrl.json
     */
    /**
     * Sample code: Registries_GetBuildSourceUploadUrl.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registriesGetBuildSourceUploadUrl(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().getBuildSourceUploadUrlWithResponse("myResourceGroup", "myRegistry", Context.NONE);
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

### Registries_ScheduleRun

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.AgentProperties;
import com.azure.resourcemanager.containerregistry.generated.models.Architecture;
import com.azure.resourcemanager.containerregistry.generated.models.Argument;
import com.azure.resourcemanager.containerregistry.generated.models.Credentials;
import com.azure.resourcemanager.containerregistry.generated.models.CustomRegistryCredentials;
import com.azure.resourcemanager.containerregistry.generated.models.DockerBuildRequest;
import com.azure.resourcemanager.containerregistry.generated.models.EncodedTaskRunRequest;
import com.azure.resourcemanager.containerregistry.generated.models.FileTaskRunRequest;
import com.azure.resourcemanager.containerregistry.generated.models.OS;
import com.azure.resourcemanager.containerregistry.generated.models.OverrideTaskStepProperties;
import com.azure.resourcemanager.containerregistry.generated.models.PlatformProperties;
import com.azure.resourcemanager.containerregistry.generated.models.SecretObject;
import com.azure.resourcemanager.containerregistry.generated.models.SecretObjectType;
import com.azure.resourcemanager.containerregistry.generated.models.SetValue;
import com.azure.resourcemanager.containerregistry.generated.models.SourceRegistryCredentials;
import com.azure.resourcemanager.containerregistry.generated.models.SourceRegistryLoginMode;
import com.azure.resourcemanager.containerregistry.generated.models.TaskRunRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Registries ScheduleRun. */
public final class RegistriesScheduleRunSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RegistriesScheduleRun_FileTaskRun.json
     */
    /**
     * Sample code: Registries_ScheduleRun_FileTaskRun.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registriesScheduleRunFileTaskRun(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .scheduleRun(
                "myResourceGroup",
                "myRegistry",
                new FileTaskRunRequest()
                    .withTaskFilePath("acb.yaml")
                    .withValuesFilePath("prod-values.yaml")
                    .withValues(
                        Arrays
                            .asList(
                                new SetValue().withName("mytestargument").withValue("mytestvalue").withIsSecret(false),
                                new SetValue()
                                    .withName("mysecrettestargument")
                                    .withValue("mysecrettestvalue")
                                    .withIsSecret(true)))
                    .withPlatform(new PlatformProperties().withOs(OS.LINUX))
                    .withAgentConfiguration(new AgentProperties().withCpu(2))
                    .withSourceLocation(
                        "https://myaccount.blob.core.windows.net/sascontainer/source.zip?sv=2015-04-05&st=2015-04-29T22%3A18%3A26Z&se=2015-04-30T02%3A23%3A26Z&sr=b&sp=rw&sip=168.1.5.60-168.1.5.70&spr=https&sig=Z%2FRHIX5Xcg0Mq2rqI3OlWTjEg2tYkboXr1P9ZUXDtkk%3D"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RegistriesScheduleRun.json
     */
    /**
     * Sample code: Registries_ScheduleRun.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registriesScheduleRun(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .scheduleRun(
                "myResourceGroup",
                "myRegistry",
                new DockerBuildRequest()
                    .withIsArchiveEnabled(true)
                    .withImageNames(Arrays.asList("azurerest:testtag"))
                    .withIsPushEnabled(true)
                    .withNoCache(true)
                    .withDockerFilePath("DockerFile")
                    .withArguments(
                        Arrays
                            .asList(
                                new Argument().withName("mytestargument").withValue("mytestvalue").withIsSecret(false),
                                new Argument()
                                    .withName("mysecrettestargument")
                                    .withValue("mysecrettestvalue")
                                    .withIsSecret(true)))
                    .withPlatform(new PlatformProperties().withOs(OS.LINUX).withArchitecture(Architecture.AMD64))
                    .withAgentConfiguration(new AgentProperties().withCpu(2))
                    .withSourceLocation(
                        "https://myaccount.blob.core.windows.net/sascontainer/source.zip?sv=2015-04-05&st=2015-04-29T22%3A18%3A26Z&se=2015-04-30T02%3A23%3A26Z&sr=b&sp=rw&sip=168.1.5.60-168.1.5.70&spr=https&sig=Z%2FRHIX5Xcg0Mq2rqI3OlWTjEg2tYkboXr1P9ZUXDtkk%3D"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RegistriesScheduleRun_EncodedTaskRun.json
     */
    /**
     * Sample code: Registries_ScheduleRun_EncodedTaskRun.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registriesScheduleRunEncodedTaskRun(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .scheduleRun(
                "myResourceGroup",
                "myRegistry",
                new EncodedTaskRunRequest()
                    .withEncodedTaskContent("fakeTokenPlaceholder")
                    .withEncodedValuesContent("fakeTokenPlaceholder")
                    .withValues(
                        Arrays
                            .asList(
                                new SetValue().withName("mytestargument").withValue("mytestvalue").withIsSecret(false),
                                new SetValue()
                                    .withName("mysecrettestargument")
                                    .withValue("mysecrettestvalue")
                                    .withIsSecret(true)))
                    .withPlatform(new PlatformProperties().withOs(OS.LINUX))
                    .withAgentConfiguration(new AgentProperties().withCpu(2)),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RegistriesScheduleRun_WithCustomCredentials.json
     */
    /**
     * Sample code: Registries_ScheduleRun_WithCustomCredentials.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registriesScheduleRunWithCustomCredentials(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .scheduleRun(
                "myResourceGroup",
                "myRegistry",
                new DockerBuildRequest()
                    .withIsArchiveEnabled(true)
                    .withImageNames(Arrays.asList("azurerest:testtag"))
                    .withIsPushEnabled(true)
                    .withNoCache(true)
                    .withDockerFilePath("DockerFile")
                    .withTarget("stage1")
                    .withArguments(
                        Arrays
                            .asList(
                                new Argument().withName("mytestargument").withValue("mytestvalue").withIsSecret(false),
                                new Argument()
                                    .withName("mysecrettestargument")
                                    .withValue("mysecrettestvalue")
                                    .withIsSecret(true)))
                    .withPlatform(new PlatformProperties().withOs(OS.LINUX).withArchitecture(Architecture.AMD64))
                    .withAgentConfiguration(new AgentProperties().withCpu(2))
                    .withSourceLocation(
                        "https://myaccount.blob.core.windows.net/sascontainer/source.zip?sv=2015-04-05&st=2015-04-29T22%3A18%3A26Z&se=2015-04-30T02%3A23%3A26Z&sr=b&sp=rw&sip=168.1.5.60-168.1.5.70&spr=https&sig=Z%2FRHIX5Xcg0Mq2rqI3OlWTjEg2tYkboXr1P9ZUXDtkk%3D")
                    .withCredentials(
                        new Credentials()
                            .withSourceRegistry(
                                new SourceRegistryCredentials().withLoginMode(SourceRegistryLoginMode.DEFAULT))
                            .withCustomRegistries(
                                mapOf(
                                    "myregistry.azurecr.io",
                                    new CustomRegistryCredentials()
                                        .withUsername(
                                            new SecretObject().withValue("reg1").withType(SecretObjectType.OPAQUE))
                                        .withPassword(
                                            new SecretObject().withValue("***").withType(SecretObjectType.OPAQUE)),
                                    "myregistry2.azurecr.io",
                                    new CustomRegistryCredentials()
                                        .withUsername(
                                            new SecretObject().withValue("reg2").withType(SecretObjectType.OPAQUE))
                                        .withPassword(
                                            new SecretObject().withValue("***").withType(SecretObjectType.OPAQUE))))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RegistriesScheduleRun_WithLogTemplate.json
     */
    /**
     * Sample code: Registries_ScheduleRun_WithLogTemplate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registriesScheduleRunWithLogTemplate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .scheduleRun(
                "myResourceGroup",
                "myRegistry",
                new DockerBuildRequest()
                    .withIsArchiveEnabled(true)
                    .withLogTemplate("acr/tasks:{{.Run.OS}}")
                    .withImageNames(Arrays.asList("azurerest:testtag"))
                    .withIsPushEnabled(true)
                    .withNoCache(true)
                    .withDockerFilePath("DockerFile")
                    .withArguments(
                        Arrays
                            .asList(
                                new Argument().withName("mytestargument").withValue("mytestvalue").withIsSecret(false),
                                new Argument()
                                    .withName("mysecrettestargument")
                                    .withValue("mysecrettestvalue")
                                    .withIsSecret(true)))
                    .withPlatform(new PlatformProperties().withOs(OS.LINUX).withArchitecture(Architecture.AMD64))
                    .withAgentConfiguration(new AgentProperties().withCpu(2))
                    .withSourceLocation(
                        "https://myaccount.blob.core.windows.net/sascontainer/source.zip?sv=2015-04-05&st=2015-04-29T22%3A18%3A26Z&se=2015-04-30T02%3A23%3A26Z&sr=b&sp=rw&sip=168.1.5.60-168.1.5.70&spr=https&sig=Z%2FRHIX5Xcg0Mq2rqI3OlWTjEg2tYkboXr1P9ZUXDtkk%3D"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RegistriesScheduleRun_Task.json
     */
    /**
     * Sample code: Registries_ScheduleRun_Task.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registriesScheduleRunTask(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .scheduleRun(
                "myResourceGroup",
                "myRegistry",
                new TaskRunRequest()
                    .withTaskId("myTask")
                    .withOverrideTaskStepProperties(
                        new OverrideTaskStepProperties()
                            .withFile("overriddenDockerfile")
                            .withArguments(
                                Arrays
                                    .asList(
                                        new Argument()
                                            .withName("mytestargument")
                                            .withValue("mytestvalue")
                                            .withIsSecret(false),
                                        new Argument()
                                            .withName("mysecrettestargument")
                                            .withValue("mysecrettestvalue")
                                            .withIsSecret(true)))
                            .withTarget("build")
                            .withValues(
                                Arrays
                                    .asList(
                                        new SetValue()
                                            .withName("mytestname")
                                            .withValue("mytestvalue")
                                            .withIsSecret(false),
                                        new SetValue()
                                            .withName("mysecrettestname")
                                            .withValue("mysecrettestvalue")
                                            .withIsSecret(true)))
                            .withUpdateTriggerToken("fakeTokenPlaceholder")),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RegistriesScheduleRun_FileTask_WithCustomCredentials.json
     */
    /**
     * Sample code: Registries_ScheduleRun_Task_WithCustomCredentials.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registriesScheduleRunTaskWithCustomCredentials(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .scheduleRun(
                "myResourceGroup",
                "myRegistry",
                new FileTaskRunRequest()
                    .withTaskFilePath("acb.yaml")
                    .withValues(
                        Arrays
                            .asList(
                                new SetValue().withName("mytestargument").withValue("mytestvalue").withIsSecret(false),
                                new SetValue()
                                    .withName("mysecrettestargument")
                                    .withValue("mysecrettestvalue")
                                    .withIsSecret(true)))
                    .withPlatform(new PlatformProperties().withOs(OS.LINUX))
                    .withCredentials(
                        new Credentials()
                            .withSourceRegistry(
                                new SourceRegistryCredentials().withLoginMode(SourceRegistryLoginMode.DEFAULT))
                            .withCustomRegistries(
                                mapOf(
                                    "myregistry.azurecr.io",
                                    new CustomRegistryCredentials()
                                        .withUsername(
                                            new SecretObject().withValue("reg1").withType(SecretObjectType.OPAQUE))
                                        .withPassword(
                                            new SecretObject().withValue("***").withType(SecretObjectType.OPAQUE))))),
                Context.NONE);
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

### Runs_Cancel

```java
import com.azure.core.util.Context;

/** Samples for Runs Cancel. */
public final class RunsCancelSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RunsCancel.json
     */
    /**
     * Sample code: Runs_Cancel.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void runsCancel(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.runs().cancel("myResourceGroup", "myRegistry", "0accec26-d6de-4757-8e74-d080f38eaaab", Context.NONE);
    }
}
```

### Runs_Get

```java
import com.azure.core.util.Context;

/** Samples for Runs Get. */
public final class RunsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RunsGet.json
     */
    /**
     * Sample code: Runs_Get.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void runsGet(com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .runs()
            .getWithResponse("myResourceGroup", "myRegistry", "0accec26-d6de-4757-8e74-d080f38eaaab", Context.NONE);
    }
}
```

### Runs_GetLogSasUrl

```java
import com.azure.core.util.Context;

/** Samples for Runs GetLogSasUrl. */
public final class RunsGetLogSasUrlSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RunsGetLogSasUrl.json
     */
    /**
     * Sample code: Runs_GetLogSasUrl.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void runsGetLogSasUrl(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .runs()
            .getLogSasUrlWithResponse(
                "myResourceGroup", "myRegistry", "0accec26-d6de-4757-8e74-d080f38eaaab", Context.NONE);
    }
}
```

### Runs_List

```java
import com.azure.core.util.Context;

/** Samples for Runs List. */
public final class RunsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RunsList.json
     */
    /**
     * Sample code: Runs_List.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void runsList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.runs().list("myResourceGroup", "myRegistry", "", 10, Context.NONE);
    }
}
```

### Runs_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.RunUpdateParameters;

/** Samples for Runs Update. */
public final class RunsUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/RunsUpdate.json
     */
    /**
     * Sample code: Runs_Update.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void runsUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .runs()
            .update(
                "myResourceGroup",
                "myRegistry",
                "0accec26-d6de-4757-8e74-d080f38eaaab",
                new RunUpdateParameters().withIsArchiveEnabled(true),
                Context.NONE);
    }
}
```

### ScopeMaps_Create

```java
import java.util.Arrays;

/** Samples for ScopeMaps Create. */
public final class ScopeMapsCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ScopeMapCreate.json
     */
    /**
     * Sample code: ScopeMapCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void scopeMapCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .scopeMaps()
            .define("myScopeMap")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withDescription("Developer Scopes")
            .withActions(Arrays.asList("repositories/myrepository/contentWrite", "repositories/myrepository/delete"))
            .create();
    }
}
```

### ScopeMaps_Delete

```java
import com.azure.core.util.Context;

/** Samples for ScopeMaps Delete. */
public final class ScopeMapsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ScopeMapDelete.json
     */
    /**
     * Sample code: ScopeMapDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void scopeMapDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.scopeMaps().delete("myResourceGroup", "myRegistry", "myScopeMap", Context.NONE);
    }
}
```

### ScopeMaps_Get

```java
import com.azure.core.util.Context;

/** Samples for ScopeMaps Get. */
public final class ScopeMapsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ScopeMapGet.json
     */
    /**
     * Sample code: ScopeMapGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void scopeMapGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.scopeMaps().getWithResponse("myResourceGroup", "myRegistry", "myScopeMap", Context.NONE);
    }
}
```

### ScopeMaps_List

```java
import com.azure.core.util.Context;

/** Samples for ScopeMaps List. */
public final class ScopeMapsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ScopeMapList.json
     */
    /**
     * Sample code: ScopeMapList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void scopeMapList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.scopeMaps().list("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### ScopeMaps_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.ScopeMap;
import java.util.Arrays;

/** Samples for ScopeMaps Update. */
public final class ScopeMapsUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/ScopeMapUpdate.json
     */
    /**
     * Sample code: ScopeMapUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void scopeMapUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        ScopeMap resource =
            manager.scopeMaps().getWithResponse("myResourceGroup", "myRegistry", "myScopeMap", Context.NONE).getValue();
        resource
            .update()
            .withDescription("Developer Scopes")
            .withActions(
                Arrays.asList("repositories/myrepository/contentWrite", "repositories/myrepository/contentRead"))
            .apply();
    }
}
```

### TaskRuns_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.Architecture;
import com.azure.resourcemanager.containerregistry.generated.models.Credentials;
import com.azure.resourcemanager.containerregistry.generated.models.EncodedTaskRunRequest;
import com.azure.resourcemanager.containerregistry.generated.models.OS;
import com.azure.resourcemanager.containerregistry.generated.models.PlatformProperties;
import java.util.Arrays;

/** Samples for TaskRuns Create. */
public final class TaskRunsCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TaskRunsCreate.json
     */
    /**
     * Sample code: TaskRuns_Create.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void taskRunsCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .taskRuns()
            .define("myRun")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withRunRequest(
                new EncodedTaskRunRequest()
                    .withEncodedTaskContent("fakeTokenPlaceholder")
                    .withEncodedValuesContent("fakeTokenPlaceholder")
                    .withValues(Arrays.asList())
                    .withPlatform(new PlatformProperties().withOs(OS.LINUX).withArchitecture(Architecture.AMD64))
                    .withCredentials(new Credentials()))
            .withForceUpdateTag("test")
            .create();
    }
}
```

### TaskRuns_Delete

```java
import com.azure.core.util.Context;

/** Samples for TaskRuns Delete. */
public final class TaskRunsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TaskRunsDelete.json
     */
    /**
     * Sample code: TaskRuns_Delete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void taskRunsDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.taskRuns().delete("myResourceGroup", "myRegistry", "myRun", Context.NONE);
    }
}
```

### TaskRuns_Get

```java
import com.azure.core.util.Context;

/** Samples for TaskRuns Get. */
public final class TaskRunsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TaskRunsGet.json
     */
    /**
     * Sample code: TaskRuns_Get.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void taskRunsGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.taskRuns().getWithResponse("myResourceGroup", "myRegistry", "myRun", Context.NONE);
    }
}
```

### TaskRuns_GetDetails

```java
import com.azure.core.util.Context;

/** Samples for TaskRuns GetDetails. */
public final class TaskRunsGetDetailsSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TaskRunsGetDetails.json
     */
    /**
     * Sample code: TaskRuns_GetDetails.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void taskRunsGetDetails(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.taskRuns().getDetailsWithResponse("myResourceGroup", "myRegistry", "myRun", Context.NONE);
    }
}
```

### TaskRuns_List

```java
import com.azure.core.util.Context;

/** Samples for TaskRuns List. */
public final class TaskRunsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TaskRunsList.json
     */
    /**
     * Sample code: TaskRuns_List.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void taskRunsList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.taskRuns().list("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### TaskRuns_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.Architecture;
import com.azure.resourcemanager.containerregistry.generated.models.Credentials;
import com.azure.resourcemanager.containerregistry.generated.models.EncodedTaskRunRequest;
import com.azure.resourcemanager.containerregistry.generated.models.OS;
import com.azure.resourcemanager.containerregistry.generated.models.PlatformProperties;
import com.azure.resourcemanager.containerregistry.generated.models.TaskRun;
import java.util.Arrays;

/** Samples for TaskRuns Update. */
public final class TaskRunsUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TaskRunsUpdate.json
     */
    /**
     * Sample code: TaskRuns_Update.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void taskRunsUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        TaskRun resource =
            manager.taskRuns().getWithResponse("myResourceGroup", "myRegistry", "myRun", Context.NONE).getValue();
        resource
            .update()
            .withRunRequest(
                new EncodedTaskRunRequest()
                    .withIsArchiveEnabled(true)
                    .withEncodedTaskContent("fakeTokenPlaceholder")
                    .withEncodedValuesContent("fakeTokenPlaceholder")
                    .withValues(Arrays.asList())
                    .withPlatform(new PlatformProperties().withOs(OS.LINUX).withArchitecture(Architecture.AMD64))
                    .withCredentials(new Credentials()))
            .withForceUpdateTag("test")
            .apply();
    }
}
```

### Tasks_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.AgentProperties;
import com.azure.resourcemanager.containerregistry.generated.models.Architecture;
import com.azure.resourcemanager.containerregistry.generated.models.Argument;
import com.azure.resourcemanager.containerregistry.generated.models.AuthInfo;
import com.azure.resourcemanager.containerregistry.generated.models.BaseImageTrigger;
import com.azure.resourcemanager.containerregistry.generated.models.BaseImageTriggerType;
import com.azure.resourcemanager.containerregistry.generated.models.DockerTaskStep;
import com.azure.resourcemanager.containerregistry.generated.models.IdentityProperties;
import com.azure.resourcemanager.containerregistry.generated.models.OS;
import com.azure.resourcemanager.containerregistry.generated.models.PlatformProperties;
import com.azure.resourcemanager.containerregistry.generated.models.ResourceIdentityType;
import com.azure.resourcemanager.containerregistry.generated.models.SourceControlType;
import com.azure.resourcemanager.containerregistry.generated.models.SourceProperties;
import com.azure.resourcemanager.containerregistry.generated.models.SourceTrigger;
import com.azure.resourcemanager.containerregistry.generated.models.SourceTriggerEvent;
import com.azure.resourcemanager.containerregistry.generated.models.TaskStatus;
import com.azure.resourcemanager.containerregistry.generated.models.TimerTrigger;
import com.azure.resourcemanager.containerregistry.generated.models.TokenType;
import com.azure.resourcemanager.containerregistry.generated.models.TriggerProperties;
import com.azure.resourcemanager.containerregistry.generated.models.UpdateTriggerPayloadType;
import com.azure.resourcemanager.containerregistry.generated.models.UserIdentityProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Tasks Create. */
public final class TasksCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/ManagedIdentity/TasksCreate_WithSystemIdentity.json
     */
    /**
     * Sample code: Tasks_Create_WithUserIdentities_WithSystemIdentity.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksCreateWithUserIdentitiesWithSystemIdentity(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .tasks()
            .define("mytTask")
            .withRegion("eastus")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withTags(mapOf("testkey", "value"))
            .withIdentity(new IdentityProperties().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withStatus(TaskStatus.ENABLED)
            .withPlatform(new PlatformProperties().withOs(OS.LINUX).withArchitecture(Architecture.AMD64))
            .withAgentConfiguration(new AgentProperties().withCpu(2))
            .withStep(
                new DockerTaskStep()
                    .withContextPath("src")
                    .withImageNames(Arrays.asList("azurerest:testtag"))
                    .withIsPushEnabled(true)
                    .withNoCache(false)
                    .withDockerFilePath("src/DockerFile")
                    .withArguments(
                        Arrays
                            .asList(
                                new Argument().withName("mytestargument").withValue("mytestvalue").withIsSecret(false),
                                new Argument()
                                    .withName("mysecrettestargument")
                                    .withValue("mysecrettestvalue")
                                    .withIsSecret(true))))
            .withTrigger(
                new TriggerProperties()
                    .withTimerTriggers(
                        Arrays.asList(new TimerTrigger().withSchedule("30 9 * * 1-5").withName("myTimerTrigger")))
                    .withSourceTriggers(
                        Arrays
                            .asList(
                                new SourceTrigger()
                                    .withSourceRepository(
                                        new SourceProperties()
                                            .withSourceControlType(SourceControlType.GITHUB)
                                            .withRepositoryUrl("https://github.com/Azure/azure-rest-api-specs")
                                            .withBranch("master")
                                            .withSourceControlAuthProperties(
                                                new AuthInfo()
                                                    .withTokenType(TokenType.PAT)
                                                    .withToken("fakeTokenPlaceholder")))
                                    .withSourceTriggerEvents(Arrays.asList(SourceTriggerEvent.COMMIT))
                                    .withName("mySourceTrigger")))
                    .withBaseImageTrigger(
                        new BaseImageTrigger()
                            .withBaseImageTriggerType(BaseImageTriggerType.RUNTIME)
                            .withName("myBaseImageTrigger")))
            .withIsSystemTask(false)
            .create();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TasksCreate.json
     */
    /**
     * Sample code: Tasks_Create.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .tasks()
            .define("mytTask")
            .withRegion("eastus")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withTags(mapOf("testkey", "value"))
            .withIdentity(new IdentityProperties().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withStatus(TaskStatus.ENABLED)
            .withPlatform(new PlatformProperties().withOs(OS.LINUX).withArchitecture(Architecture.AMD64))
            .withAgentConfiguration(new AgentProperties().withCpu(2))
            .withStep(
                new DockerTaskStep()
                    .withContextPath("src")
                    .withImageNames(Arrays.asList("azurerest:testtag"))
                    .withIsPushEnabled(true)
                    .withNoCache(false)
                    .withDockerFilePath("src/DockerFile")
                    .withArguments(
                        Arrays
                            .asList(
                                new Argument().withName("mytestargument").withValue("mytestvalue").withIsSecret(false),
                                new Argument()
                                    .withName("mysecrettestargument")
                                    .withValue("mysecrettestvalue")
                                    .withIsSecret(true))))
            .withTrigger(
                new TriggerProperties()
                    .withTimerTriggers(
                        Arrays.asList(new TimerTrigger().withSchedule("30 9 * * 1-5").withName("myTimerTrigger")))
                    .withSourceTriggers(
                        Arrays
                            .asList(
                                new SourceTrigger()
                                    .withSourceRepository(
                                        new SourceProperties()
                                            .withSourceControlType(SourceControlType.GITHUB)
                                            .withRepositoryUrl("https://github.com/Azure/azure-rest-api-specs")
                                            .withBranch("master")
                                            .withSourceControlAuthProperties(
                                                new AuthInfo()
                                                    .withTokenType(TokenType.PAT)
                                                    .withToken("fakeTokenPlaceholder")))
                                    .withSourceTriggerEvents(Arrays.asList(SourceTriggerEvent.COMMIT))
                                    .withName("mySourceTrigger")))
                    .withBaseImageTrigger(
                        new BaseImageTrigger()
                            .withBaseImageTriggerType(BaseImageTriggerType.RUNTIME)
                            .withUpdateTriggerEndpoint("https://user:pass@mycicd.webhook.com?token=foo")
                            .withUpdateTriggerPayloadType(UpdateTriggerPayloadType.TOKEN)
                            .withName("myBaseImageTrigger")))
            .withLogTemplate("acr/tasks:{{.Run.OS}}")
            .withIsSystemTask(false)
            .create();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/ManagedIdentity/TasksCreate_WithSystemAndUserIdentities.json
     */
    /**
     * Sample code: Tasks_Create_WithSystemAndUserIdentities.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksCreateWithSystemAndUserIdentities(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .tasks()
            .define("mytTask")
            .withRegion("eastus")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withTags(mapOf("testkey", "value"))
            .withIdentity(
                new IdentityProperties()
                    .withType(ResourceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/f9d7ebed-adbd-4cb4-b973-aaf82c136138/resourcegroups/myResourceGroup1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity2",
                            new UserIdentityProperties())))
            .withStatus(TaskStatus.ENABLED)
            .withPlatform(new PlatformProperties().withOs(OS.LINUX).withArchitecture(Architecture.AMD64))
            .withAgentConfiguration(new AgentProperties().withCpu(2))
            .withStep(
                new DockerTaskStep()
                    .withContextPath("src")
                    .withImageNames(Arrays.asList("azurerest:testtag"))
                    .withIsPushEnabled(true)
                    .withNoCache(false)
                    .withDockerFilePath("src/DockerFile")
                    .withArguments(
                        Arrays
                            .asList(
                                new Argument().withName("mytestargument").withValue("mytestvalue").withIsSecret(false),
                                new Argument()
                                    .withName("mysecrettestargument")
                                    .withValue("mysecrettestvalue")
                                    .withIsSecret(true))))
            .withTrigger(
                new TriggerProperties()
                    .withTimerTriggers(
                        Arrays.asList(new TimerTrigger().withSchedule("30 9 * * 1-5").withName("myTimerTrigger")))
                    .withSourceTriggers(
                        Arrays
                            .asList(
                                new SourceTrigger()
                                    .withSourceRepository(
                                        new SourceProperties()
                                            .withSourceControlType(SourceControlType.GITHUB)
                                            .withRepositoryUrl("https://github.com/Azure/azure-rest-api-specs")
                                            .withBranch("master")
                                            .withSourceControlAuthProperties(
                                                new AuthInfo()
                                                    .withTokenType(TokenType.PAT)
                                                    .withToken("fakeTokenPlaceholder")))
                                    .withSourceTriggerEvents(Arrays.asList(SourceTriggerEvent.COMMIT))
                                    .withName("mySourceTrigger")))
                    .withBaseImageTrigger(
                        new BaseImageTrigger()
                            .withBaseImageTriggerType(BaseImageTriggerType.RUNTIME)
                            .withUpdateTriggerEndpoint("https://user:pass@mycicd.webhook.com?token=foo")
                            .withUpdateTriggerPayloadType(UpdateTriggerPayloadType.DEFAULT)
                            .withName("myBaseImageTrigger")))
            .withIsSystemTask(false)
            .create();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/ManagedIdentity/TasksCreate_WithUserIdentities.json
     */
    /**
     * Sample code: Tasks_Create_WithUserIdentities.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksCreateWithUserIdentities(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .tasks()
            .define("mytTask")
            .withRegion("eastus")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withTags(mapOf("testkey", "value"))
            .withIdentity(
                new IdentityProperties()
                    .withType(ResourceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/f9d7ebed-adbd-4cb4-b973-aaf82c136138/resourcegroups/myResourceGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity1",
                            new UserIdentityProperties(),
                            "/subscriptions/f9d7ebed-adbd-4cb4-b973-aaf82c136138/resourcegroups/myResourceGroup1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity2",
                            new UserIdentityProperties())))
            .withStatus(TaskStatus.ENABLED)
            .withPlatform(new PlatformProperties().withOs(OS.LINUX).withArchitecture(Architecture.AMD64))
            .withAgentConfiguration(new AgentProperties().withCpu(2))
            .withStep(
                new DockerTaskStep()
                    .withContextPath("src")
                    .withImageNames(Arrays.asList("azurerest:testtag"))
                    .withIsPushEnabled(true)
                    .withNoCache(false)
                    .withDockerFilePath("src/DockerFile")
                    .withArguments(
                        Arrays
                            .asList(
                                new Argument().withName("mytestargument").withValue("mytestvalue").withIsSecret(false),
                                new Argument()
                                    .withName("mysecrettestargument")
                                    .withValue("mysecrettestvalue")
                                    .withIsSecret(true))))
            .withTrigger(
                new TriggerProperties()
                    .withTimerTriggers(
                        Arrays.asList(new TimerTrigger().withSchedule("30 9 * * 1-5").withName("myTimerTrigger")))
                    .withSourceTriggers(
                        Arrays
                            .asList(
                                new SourceTrigger()
                                    .withSourceRepository(
                                        new SourceProperties()
                                            .withSourceControlType(SourceControlType.GITHUB)
                                            .withRepositoryUrl("https://github.com/Azure/azure-rest-api-specs")
                                            .withBranch("master")
                                            .withSourceControlAuthProperties(
                                                new AuthInfo()
                                                    .withTokenType(TokenType.PAT)
                                                    .withToken("fakeTokenPlaceholder")))
                                    .withSourceTriggerEvents(Arrays.asList(SourceTriggerEvent.COMMIT))
                                    .withName("mySourceTrigger")))
                    .withBaseImageTrigger(
                        new BaseImageTrigger()
                            .withBaseImageTriggerType(BaseImageTriggerType.RUNTIME)
                            .withUpdateTriggerEndpoint("https://user:pass@mycicd.webhook.com?token=foo")
                            .withUpdateTriggerPayloadType(UpdateTriggerPayloadType.DEFAULT)
                            .withName("myBaseImageTrigger")))
            .withIsSystemTask(false)
            .create();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TasksCreate_QuickTask.json
     */
    /**
     * Sample code: Tasks_Create_QuickTask.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksCreateQuickTask(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .tasks()
            .define("quicktask")
            .withRegion("eastus")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withTags(mapOf("testkey", "value"))
            .withStatus(TaskStatus.ENABLED)
            .withLogTemplate("acr/tasks:{{.Run.OS}}")
            .withIsSystemTask(true)
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

### Tasks_Delete

```java
import com.azure.core.util.Context;

/** Samples for Tasks Delete. */
public final class TasksDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TasksDelete.json
     */
    /**
     * Sample code: Tasks_Delete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.tasks().delete("myResourceGroup", "myRegistry", "myTask", Context.NONE);
    }
}
```

### Tasks_Get

```java
import com.azure.core.util.Context;

/** Samples for Tasks Get. */
public final class TasksGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TasksGet.json
     */
    /**
     * Sample code: Tasks_Get.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.tasks().getWithResponse("myResourceGroup", "myRegistry", "myTask", Context.NONE);
    }
}
```

### Tasks_GetDetails

```java
import com.azure.core.util.Context;

/** Samples for Tasks GetDetails. */
public final class TasksGetDetailsSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TasksGetDetails.json
     */
    /**
     * Sample code: Tasks_GetDetails.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksGetDetails(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.tasks().getDetailsWithResponse("myResourceGroup", "myRegistry", "myTask", Context.NONE);
    }
}
```

### Tasks_List

```java
import com.azure.core.util.Context;

/** Samples for Tasks List. */
public final class TasksListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TasksList.json
     */
    /**
     * Sample code: Tasks_List.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.tasks().list("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### Tasks_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.AgentProperties;
import com.azure.resourcemanager.containerregistry.generated.models.AuthInfoUpdateParameters;
import com.azure.resourcemanager.containerregistry.generated.models.Credentials;
import com.azure.resourcemanager.containerregistry.generated.models.CustomRegistryCredentials;
import com.azure.resourcemanager.containerregistry.generated.models.DockerBuildStepUpdateParameters;
import com.azure.resourcemanager.containerregistry.generated.models.SecretObject;
import com.azure.resourcemanager.containerregistry.generated.models.SecretObjectType;
import com.azure.resourcemanager.containerregistry.generated.models.SourceTriggerEvent;
import com.azure.resourcemanager.containerregistry.generated.models.SourceTriggerUpdateParameters;
import com.azure.resourcemanager.containerregistry.generated.models.SourceUpdateParameters;
import com.azure.resourcemanager.containerregistry.generated.models.Task;
import com.azure.resourcemanager.containerregistry.generated.models.TaskStatus;
import com.azure.resourcemanager.containerregistry.generated.models.TokenType;
import com.azure.resourcemanager.containerregistry.generated.models.TriggerUpdateParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Tasks Update. */
public final class TasksUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TasksUpdate_QuickTask.json
     */
    /**
     * Sample code: Tasks_Update_QuickTask.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksUpdateQuickTask(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Task resource =
            manager.tasks().getWithResponse("myResourceGroup", "myRegistry", "quicktask", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("testkey", "value"))
            .withStatus(TaskStatus.ENABLED)
            .withLogTemplate("acr/tasks:{{.Run.OS}}")
            .apply();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/ManagedIdentity/TasksUpdate_WithMSICustomCredentials.json
     */
    /**
     * Sample code: Tasks_Update_WithMSICustomCredentials.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksUpdateWithMSICustomCredentials(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Task resource =
            manager.tasks().getWithResponse("myResourceGroup", "myRegistry", "myTask", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("testkey", "value"))
            .withStatus(TaskStatus.ENABLED)
            .withAgentConfiguration(new AgentProperties().withCpu(3))
            .withStep(
                new DockerBuildStepUpdateParameters()
                    .withImageNames(Arrays.asList("azurerest:testtag1"))
                    .withDockerFilePath("src/DockerFile"))
            .withTrigger(
                new TriggerUpdateParameters()
                    .withSourceTriggers(
                        Arrays
                            .asList(
                                new SourceTriggerUpdateParameters()
                                    .withSourceRepository(
                                        new SourceUpdateParameters()
                                            .withSourceControlAuthProperties(
                                                new AuthInfoUpdateParameters()
                                                    .withTokenType(TokenType.PAT)
                                                    .withToken("fakeTokenPlaceholder")))
                                    .withSourceTriggerEvents(Arrays.asList(SourceTriggerEvent.COMMIT))
                                    .withName("mySourceTrigger"))))
            .withCredentials(
                new Credentials()
                    .withCustomRegistries(
                        mapOf("myregistry.azurecr.io", new CustomRegistryCredentials().withIdentity("[system]"))))
            .apply();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/ManagedIdentity/TasksUpdate_WithKeyVaultCustomCredentials.json
     */
    /**
     * Sample code: Tasks_Update_WithKeyVaultCustomCredentials.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksUpdateWithKeyVaultCustomCredentials(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Task resource =
            manager.tasks().getWithResponse("myResourceGroup", "myRegistry", "myTask", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("testkey", "value"))
            .withStatus(TaskStatus.ENABLED)
            .withAgentConfiguration(new AgentProperties().withCpu(3))
            .withStep(
                new DockerBuildStepUpdateParameters()
                    .withImageNames(Arrays.asList("azurerest:testtag1"))
                    .withDockerFilePath("src/DockerFile"))
            .withTrigger(
                new TriggerUpdateParameters()
                    .withSourceTriggers(
                        Arrays
                            .asList(
                                new SourceTriggerUpdateParameters()
                                    .withSourceRepository(
                                        new SourceUpdateParameters()
                                            .withSourceControlAuthProperties(
                                                new AuthInfoUpdateParameters()
                                                    .withTokenType(TokenType.PAT)
                                                    .withToken("fakeTokenPlaceholder")))
                                    .withSourceTriggerEvents(Arrays.asList(SourceTriggerEvent.COMMIT))
                                    .withName("mySourceTrigger"))))
            .withCredentials(
                new Credentials()
                    .withCustomRegistries(
                        mapOf(
                            "myregistry.azurecr.io",
                            new CustomRegistryCredentials()
                                .withUsername(
                                    new SecretObject()
                                        .withValue("https://myacbvault.vault.azure.net/secrets/username")
                                        .withType(SecretObjectType.VAULTSECRET))
                                .withPassword(
                                    new SecretObject()
                                        .withValue("https://myacbvault.vault.azure.net/secrets/password")
                                        .withType(SecretObjectType.VAULTSECRET))
                                .withIdentity("[system]"))))
            .apply();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TasksUpdate.json
     */
    /**
     * Sample code: Tasks_Update.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Task resource =
            manager.tasks().getWithResponse("myResourceGroup", "myRegistry", "myTask", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("testkey", "value"))
            .withStatus(TaskStatus.ENABLED)
            .withAgentConfiguration(new AgentProperties().withCpu(3))
            .withStep(
                new DockerBuildStepUpdateParameters()
                    .withImageNames(Arrays.asList("azurerest:testtag1"))
                    .withDockerFilePath("src/DockerFile"))
            .withTrigger(
                new TriggerUpdateParameters()
                    .withSourceTriggers(
                        Arrays
                            .asList(
                                new SourceTriggerUpdateParameters()
                                    .withSourceRepository(
                                        new SourceUpdateParameters()
                                            .withSourceControlAuthProperties(
                                                new AuthInfoUpdateParameters()
                                                    .withTokenType(TokenType.PAT)
                                                    .withToken("fakeTokenPlaceholder")))
                                    .withSourceTriggerEvents(Arrays.asList(SourceTriggerEvent.COMMIT))
                                    .withName("mySourceTrigger"))))
            .withCredentials(
                new Credentials()
                    .withCustomRegistries(
                        mapOf(
                            "myregistry.azurecr.io",
                            new CustomRegistryCredentials()
                                .withUsername(
                                    new SecretObject().withValue("username").withType(SecretObjectType.OPAQUE))
                                .withPassword(
                                    new SecretObject()
                                        .withValue("https://myacbvault.vault.azure.net/secrets/password")
                                        .withType(SecretObjectType.VAULTSECRET))
                                .withIdentity("[system]"))))
            .withLogTemplate("acr/tasks:{{.Run.OS}}")
            .apply();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TasksUpdate_WithOpaqueCustomCredentials.json
     */
    /**
     * Sample code: Tasks_Update_WithOpaqueCustomCredentials.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tasksUpdateWithOpaqueCustomCredentials(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Task resource =
            manager.tasks().getWithResponse("myResourceGroup", "myRegistry", "myTask", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("testkey", "value"))
            .withStatus(TaskStatus.ENABLED)
            .withAgentConfiguration(new AgentProperties().withCpu(3))
            .withStep(
                new DockerBuildStepUpdateParameters()
                    .withImageNames(Arrays.asList("azurerest:testtag1"))
                    .withDockerFilePath("src/DockerFile"))
            .withTrigger(
                new TriggerUpdateParameters()
                    .withSourceTriggers(
                        Arrays
                            .asList(
                                new SourceTriggerUpdateParameters()
                                    .withSourceRepository(
                                        new SourceUpdateParameters()
                                            .withSourceControlAuthProperties(
                                                new AuthInfoUpdateParameters()
                                                    .withTokenType(TokenType.PAT)
                                                    .withToken("fakeTokenPlaceholder")))
                                    .withSourceTriggerEvents(Arrays.asList(SourceTriggerEvent.COMMIT))
                                    .withName("mySourceTrigger"))))
            .withCredentials(
                new Credentials()
                    .withCustomRegistries(
                        mapOf(
                            "myregistry.azurecr.io",
                            new CustomRegistryCredentials()
                                .withUsername(
                                    new SecretObject().withValue("username").withType(SecretObjectType.OPAQUE))
                                .withPassword(new SecretObject().withValue("***").withType(SecretObjectType.OPAQUE)))))
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

### Tokens_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.TokenCertificate;
import com.azure.resourcemanager.containerregistry.generated.models.TokenCertificateName;
import com.azure.resourcemanager.containerregistry.generated.models.TokenCredentialsProperties;
import com.azure.resourcemanager.containerregistry.generated.models.TokenStatus;
import java.util.Arrays;

/** Samples for Tokens Create. */
public final class TokensCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/TokenCreate.json
     */
    /**
     * Sample code: TokenCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tokenCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .tokens()
            .define("myToken")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withScopeMapId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/scopeMaps/myScopeMap")
            .withCredentials(
                new TokenCredentialsProperties()
                    .withCertificates(
                        Arrays
                            .asList(
                                new TokenCertificate()
                                    .withName(TokenCertificateName.CERTIFICATE1)
                                    .withEncodedPemCertificate("fakeTokenPlaceholder"))))
            .withStatus(TokenStatus.DISABLED)
            .create();
    }
}
```

### Tokens_Delete

```java
import com.azure.core.util.Context;

/** Samples for Tokens Delete. */
public final class TokensDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/TokenDelete.json
     */
    /**
     * Sample code: TokenDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tokenDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.tokens().delete("myResourceGroup", "myRegistry", "myToken", Context.NONE);
    }
}
```

### Tokens_Get

```java
import com.azure.core.util.Context;

/** Samples for Tokens Get. */
public final class TokensGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/TokenGet.json
     */
    /**
     * Sample code: TokenGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tokenGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.tokens().getWithResponse("myResourceGroup", "myRegistry", "myToken", Context.NONE);
    }
}
```

### Tokens_List

```java
import com.azure.core.util.Context;

/** Samples for Tokens List. */
public final class TokensListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/TokenList.json
     */
    /**
     * Sample code: TokenList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tokenList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.tokens().list("myResourceGroup", "myRegistry", Context.NONE);
    }
}
```

### Tokens_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.containerregistry.generated.models.Token;
import com.azure.resourcemanager.containerregistry.generated.models.TokenCertificate;
import com.azure.resourcemanager.containerregistry.generated.models.TokenCertificateName;
import com.azure.resourcemanager.containerregistry.generated.models.TokenCredentialsProperties;
import java.util.Arrays;

/** Samples for Tokens Update. */
public final class TokensUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/TokenUpdate.json
     */
    /**
     * Sample code: TokenUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tokenUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Token resource =
            manager.tokens().getWithResponse("myResourceGroup", "myRegistry", "myToken", Context.NONE).getValue();
        resource
            .update()
            .withScopeMapId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/scopeMaps/myNewScopeMap")
            .withCredentials(
                new TokenCredentialsProperties()
                    .withCertificates(
                        Arrays
                            .asList(
                                new TokenCertificate()
                                    .withName(TokenCertificateName.CERTIFICATE1)
                                    .withEncodedPemCertificate("fakeTokenPlaceholder"))))
            .apply();
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

