# Code snippets and samples


## AgentPools

- [Create](#agentpools_create)
- [Delete](#agentpools_delete)
- [Get](#agentpools_get)
- [GetQueueStatus](#agentpools_getqueuestatus)
- [List](#agentpools_list)
- [Update](#agentpools_update)

## ArchiveVersions

- [Create](#archiveversions_create)
- [Delete](#archiveversions_delete)
- [Get](#archiveversions_get)
- [List](#archiveversions_list)

## Archives

- [Create](#archives_create)
- [Delete](#archives_delete)
- [Get](#archives_get)
- [List](#archives_list)
- [Update](#archives_update)

## CacheRules

- [Create](#cacherules_create)
- [Delete](#cacherules_delete)
- [Get](#cacherules_get)
- [List](#cacherules_list)
- [Update](#cacherules_update)

## ConnectedRegistries

- [Create](#connectedregistries_create)
- [Deactivate](#connectedregistries_deactivate)
- [Delete](#connectedregistries_delete)
- [Get](#connectedregistries_get)
- [List](#connectedregistries_list)
- [Update](#connectedregistries_update)

## CredentialSets

- [Create](#credentialsets_create)
- [Delete](#credentialsets_delete)
- [Get](#credentialsets_get)
- [List](#credentialsets_list)
- [Update](#credentialsets_update)

## ExportPipelines

- [Create](#exportpipelines_create)
- [Delete](#exportpipelines_delete)
- [Get](#exportpipelines_get)
- [List](#exportpipelines_list)

## ImportPipelines

- [Create](#importpipelines_create)
- [Delete](#importpipelines_delete)
- [Get](#importpipelines_get)
- [List](#importpipelines_list)

## Operations

- [List](#operations_list)

## PipelineRuns

- [Create](#pipelineruns_create)
- [Delete](#pipelineruns_delete)
- [Get](#pipelineruns_get)
- [List](#pipelineruns_list)

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
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .withCount(1)
            .withTier("S1")
            .withOs(OS.LINUX)
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

### AgentPools_Delete

```java
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
        manager.agentPools().delete("myResourceGroup", "myRegistry", "myAgentPool", com.azure.core.util.Context.NONE);
    }
}
```

### AgentPools_Get

```java
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
        manager
            .agentPools()
            .getWithResponse("myResourceGroup", "myRegistry", "myAgentPool", com.azure.core.util.Context.NONE);
    }
}
```

### AgentPools_GetQueueStatus

```java
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
        manager
            .agentPools()
            .getQueueStatusWithResponse(
                "myResourceGroup", "myRegistry", "myAgentPool", com.azure.core.util.Context.NONE);
    }
}
```

### AgentPools_List

```java
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
        manager.agentPools().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### AgentPools_Update

```java
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
                .getWithResponse("myResourceGroup", "myRegistry", "myAgentPool", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withCount(1).apply();
    }
}
```

### ArchiveVersions_Create

```java
/** Samples for ArchiveVersions Create. */
public final class ArchiveVersionsCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ArchiveVersionCreate.json
     */
    /**
     * Sample code: ArchiveVersionCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void archiveVersionCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .archiveVersions()
            .create(
                "myResourceGroup",
                "myRegistry",
                "rpm",
                "myArchiveName",
                "myArchiveVersionName",
                com.azure.core.util.Context.NONE);
    }
}
```

### ArchiveVersions_Delete

```java
/** Samples for ArchiveVersions Delete. */
public final class ArchiveVersionsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ArchiveVersionDelete.json
     */
    /**
     * Sample code: ArchiveVersionDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void archiveVersionDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .archiveVersions()
            .delete(
                "myResourceGroup",
                "myRegistry",
                "myPackageType",
                "myArchiveName",
                "myArchiveVersionName",
                com.azure.core.util.Context.NONE);
    }
}
```

### ArchiveVersions_Get

```java
/** Samples for ArchiveVersions Get. */
public final class ArchiveVersionsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ArchiveVersionGet.json
     */
    /**
     * Sample code: ArchiveVersionGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void archiveVersionGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .archiveVersions()
            .getWithResponse(
                "myResourceGroup",
                "myRegistry",
                "rpm",
                "myArchiveName",
                "myArchiveVersionName",
                com.azure.core.util.Context.NONE);
    }
}
```

### ArchiveVersions_List

```java
/** Samples for ArchiveVersions List. */
public final class ArchiveVersionsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ArchiveVersionList.json
     */
    /**
     * Sample code: ArchiveVersionList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void archiveVersionList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .archiveVersions()
            .list("myResourceGroup", "myRegistry", "myPackageType", "myArchiveName", com.azure.core.util.Context.NONE);
    }
}
```

### Archives_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.ArchivePackageSourceProperties;
import com.azure.resourcemanager.containerregistry.generated.models.PackageSourceType;

/** Samples for Archives Create. */
public final class ArchivesCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ArchiveCreate.json
     */
    /**
     * Sample code: ArchiveCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void archiveCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .archives()
            .define("myArchiveName")
            .withExistingPackage("myResourceGroup", "myRegistry", "rpm")
            .withPackageSource(
                new ArchivePackageSourceProperties().withType(PackageSourceType.REMOTE).withUrl("string"))
            .withPublishedVersion("string")
            .withRepositoryEndpointPrefix("string")
            .create();
    }
}
```

### Archives_Delete

```java
/** Samples for Archives Delete. */
public final class ArchivesDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ArchiveDelete.json
     */
    /**
     * Sample code: ArchiveDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void archiveDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .archives()
            .delete(
                "myResourceGroup", "myRegistry", "myPackageType", "myArchiveName", com.azure.core.util.Context.NONE);
    }
}
```

### Archives_Get

```java
/** Samples for Archives Get. */
public final class ArchivesGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ArchiveGet.json
     */
    /**
     * Sample code: ArchiveGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void archiveGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .archives()
            .getWithResponse(
                "myResourceGroup", "myRegistry", "myPackageType", "myArchiveName", com.azure.core.util.Context.NONE);
    }
}
```

### Archives_List

```java
/** Samples for Archives List. */
public final class ArchivesListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ArchiveList.json
     */
    /**
     * Sample code: ArchiveList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void archiveList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.archives().list("myResourceGroup", "myRegistry", "myPackageType", com.azure.core.util.Context.NONE);
    }
}
```

### Archives_Update

```java
import com.azure.resourcemanager.containerregistry.generated.models.Archive;

/** Samples for Archives Update. */
public final class ArchivesUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ArchiveUpdate.json
     */
    /**
     * Sample code: ArchiveUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void archiveUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Archive resource =
            manager
                .archives()
                .getWithResponse(
                    "myResourceGroup", "myRegistry", "myPackageType", "myArchiveName", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withPublishedVersion("string").apply();
    }
}
```

### CacheRules_Create

```java
/** Samples for CacheRules Create. */
public final class CacheRulesCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/CacheRuleCreate.json
     */
    /**
     * Sample code: CacheRuleCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void cacheRuleCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .cacheRules()
            .define("myCacheRule")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withCredentialSetResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/credentialSets/myCredentialSet")
            .withSourceRepository("docker.io/library/hello-world")
            .withTargetRepository("cached-docker-hub/hello-world")
            .create();
    }
}
```

### CacheRules_Delete

```java
/** Samples for CacheRules Delete. */
public final class CacheRulesDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/CacheRuleDelete.json
     */
    /**
     * Sample code: CacheRuleDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void cacheRuleDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.cacheRules().delete("myResourceGroup", "myRegistry", "myCacheRule", com.azure.core.util.Context.NONE);
    }
}
```

### CacheRules_Get

```java
/** Samples for CacheRules Get. */
public final class CacheRulesGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/CacheRuleGet.json
     */
    /**
     * Sample code: CacheRuleGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void cacheRuleGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .cacheRules()
            .getWithResponse("myResourceGroup", "myRegistry", "myCacheRule", com.azure.core.util.Context.NONE);
    }
}
```

### CacheRules_List

```java
/** Samples for CacheRules List. */
public final class CacheRulesListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/CacheRuleList.json
     */
    /**
     * Sample code: CacheRuleList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void cacheRuleList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.cacheRules().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### CacheRules_Update

```java
import com.azure.resourcemanager.containerregistry.generated.models.CacheRule;

/** Samples for CacheRules Update. */
public final class CacheRulesUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/CacheRuleUpdate.json
     */
    /**
     * Sample code: CacheRuleUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void cacheRuleUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        CacheRule resource =
            manager
                .cacheRules()
                .getWithResponse("myResourceGroup", "myRegistry", "myCacheRule", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withCredentialSetResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/credentialSets/myCredentialSet2")
            .apply();
    }
}
```

### ConnectedRegistries_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.ConnectedRegistryMode;
import com.azure.resourcemanager.containerregistry.generated.models.ParentProperties;
import com.azure.resourcemanager.containerregistry.generated.models.SyncProperties;
import java.time.Duration;
import java.util.Arrays;

/** Samples for ConnectedRegistries Create. */
public final class ConnectedRegistriesCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ConnectedRegistryCreate.json
     */
    /**
     * Sample code: ConnectedRegistryCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void connectedRegistryCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .connectedRegistries()
            .define("myConnectedRegistry")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withMode(ConnectedRegistryMode.READ_WRITE)
            .withParent(
                new ParentProperties()
                    .withSyncProperties(
                        new SyncProperties()
                            .withTokenId("fakeTokenPlaceholder")
                            .withSchedule("0 9 * * *")
                            .withSyncWindow(Duration.parse("PT3H"))
                            .withMessageTtl(Duration.parse("P2D"))))
            .withClientTokenIds(
                Arrays
                    .asList(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/tokens/client1Token"))
            .withNotificationsList(Arrays.asList("hello-world:*:*", "sample/repo/*:1.0:*"))
            .create();
    }
}
```

### ConnectedRegistries_Deactivate

```java
/** Samples for ConnectedRegistries Deactivate. */
public final class ConnectedRegistriesDeactivateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ConnectedRegistryDeactivate.json
     */
    /**
     * Sample code: ConnectedRegistryDeactivate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void connectedRegistryDeactivate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .connectedRegistries()
            .deactivate("myResourceGroup", "myRegistry", "myConnectedRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectedRegistries_Delete

```java
/** Samples for ConnectedRegistries Delete. */
public final class ConnectedRegistriesDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ConnectedRegistryDelete.json
     */
    /**
     * Sample code: ConnectedRegistryDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void connectedRegistryDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .connectedRegistries()
            .delete("myResourceGroup", "myRegistry", "myConnectedRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectedRegistries_Get

```java
/** Samples for ConnectedRegistries Get. */
public final class ConnectedRegistriesGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ConnectedRegistryGet.json
     */
    /**
     * Sample code: ConnectedRegistryGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void connectedRegistryGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .connectedRegistries()
            .getWithResponse("myResourceGroup", "myRegistry", "myConnectedRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectedRegistries_List

```java
/** Samples for ConnectedRegistries List. */
public final class ConnectedRegistriesListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ConnectedRegistryList.json
     */
    /**
     * Sample code: ConnectedRegistryList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void connectedRegistryList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.connectedRegistries().list("myResourceGroup", "myRegistry", null, com.azure.core.util.Context.NONE);
    }
}
```

### ConnectedRegistries_Update

```java
import com.azure.resourcemanager.containerregistry.generated.models.AuditLogStatus;
import com.azure.resourcemanager.containerregistry.generated.models.ConnectedRegistry;
import com.azure.resourcemanager.containerregistry.generated.models.LogLevel;
import com.azure.resourcemanager.containerregistry.generated.models.LoggingProperties;
import com.azure.resourcemanager.containerregistry.generated.models.SyncUpdateProperties;
import java.time.Duration;
import java.util.Arrays;

/** Samples for ConnectedRegistries Update. */
public final class ConnectedRegistriesUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ConnectedRegistryUpdate.json
     */
    /**
     * Sample code: ConnectedRegistryUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void connectedRegistryUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        ConnectedRegistry resource =
            manager
                .connectedRegistries()
                .getWithResponse("myResourceGroup", "myRegistry", "myScopeMap", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withSyncProperties(
                new SyncUpdateProperties()
                    .withSchedule("0 0 */10 * *")
                    .withSyncWindow(Duration.parse("P2D"))
                    .withMessageTtl(Duration.parse("P30D")))
            .withLogging(
                new LoggingProperties().withLogLevel(LogLevel.DEBUG).withAuditLogStatus(AuditLogStatus.ENABLED))
            .withClientTokenIds(
                Arrays
                    .asList(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/tokens/client1Token",
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/tokens/client2Token"))
            .withNotificationsList(Arrays.asList("hello-world:*:*", "sample/repo/*:1.0:*"))
            .apply();
    }
}
```

### CredentialSets_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.AuthCredential;
import com.azure.resourcemanager.containerregistry.generated.models.CredentialName;
import com.azure.resourcemanager.containerregistry.generated.models.IdentityProperties;
import com.azure.resourcemanager.containerregistry.generated.models.ResourceIdentityType;
import java.util.Arrays;

/** Samples for CredentialSets Create. */
public final class CredentialSetsCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/CredentialSetCreate.json
     */
    /**
     * Sample code: CredentialSetCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void credentialSetCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .credentialSets()
            .define("myCredentialSet")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withIdentity(new IdentityProperties().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withLoginServer("docker.io")
            .withAuthCredentials(
                Arrays
                    .asList(
                        new AuthCredential()
                            .withName(CredentialName.CREDENTIAL1)
                            .withUsernameSecretIdentifier("fakeTokenPlaceholder")
                            .withPasswordSecretIdentifier("fakeTokenPlaceholder")))
            .create();
    }
}
```

### CredentialSets_Delete

```java
/** Samples for CredentialSets Delete. */
public final class CredentialSetsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/CredentialSetDelete.json
     */
    /**
     * Sample code: CredentialSetDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void credentialSetDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .credentialSets()
            .delete("myResourceGroup", "myRegistry", "myCredentialSet", com.azure.core.util.Context.NONE);
    }
}
```

### CredentialSets_Get

```java
/** Samples for CredentialSets Get. */
public final class CredentialSetsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/CredentialSetGet.json
     */
    /**
     * Sample code: CredentialSetGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void credentialSetGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .credentialSets()
            .getWithResponse("myResourceGroup", "myRegistry", "myCredentialSet", com.azure.core.util.Context.NONE);
    }
}
```

### CredentialSets_List

```java
/** Samples for CredentialSets List. */
public final class CredentialSetsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/CredentialSetList.json
     */
    /**
     * Sample code: CredentialSetList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void credentialSetList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.credentialSets().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### CredentialSets_Update

```java
import com.azure.resourcemanager.containerregistry.generated.models.AuthCredential;
import com.azure.resourcemanager.containerregistry.generated.models.CredentialName;
import com.azure.resourcemanager.containerregistry.generated.models.CredentialSet;
import java.util.Arrays;

/** Samples for CredentialSets Update. */
public final class CredentialSetsUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/CredentialSetUpdate.json
     */
    /**
     * Sample code: CredentialSetUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void credentialSetUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        CredentialSet resource =
            manager
                .credentialSets()
                .getWithResponse("myResourceGroup", "myRegistry", "myCredentialSet", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withAuthCredentials(
                Arrays
                    .asList(
                        new AuthCredential()
                            .withName(CredentialName.CREDENTIAL1)
                            .withUsernameSecretIdentifier("fakeTokenPlaceholder")
                            .withPasswordSecretIdentifier("fakeTokenPlaceholder")))
            .apply();
    }
}
```

### ExportPipelines_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.ExportPipelineTargetProperties;
import com.azure.resourcemanager.containerregistry.generated.models.IdentityProperties;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineOptions;
import com.azure.resourcemanager.containerregistry.generated.models.ResourceIdentityType;
import java.util.Arrays;

/** Samples for ExportPipelines Create. */
public final class ExportPipelinesCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ExportPipelineCreate.json
     */
    /**
     * Sample code: ExportPipelineCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void exportPipelineCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .exportPipelines()
            .define("myExportPipeline")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withRegion("westus")
            .withIdentity(new IdentityProperties().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withTarget(
                new ExportPipelineTargetProperties()
                    .withType("AzureStorageBlobContainer")
                    .withUri("https://accountname.blob.core.windows.net/containername")
                    .withKeyVaultUri("fakeTokenPlaceholder"))
            .withOptions(Arrays.asList(PipelineOptions.OVERWRITE_BLOBS))
            .create();
    }
}
```

### ExportPipelines_Delete

```java
/** Samples for ExportPipelines Delete. */
public final class ExportPipelinesDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ExportPipelineDelete.json
     */
    /**
     * Sample code: ExportPipelineDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void exportPipelineDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .exportPipelines()
            .delete("myResourceGroup", "myRegistry", "myExportPipeline", com.azure.core.util.Context.NONE);
    }
}
```

### ExportPipelines_Get

```java
/** Samples for ExportPipelines Get. */
public final class ExportPipelinesGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ExportPipelineGet.json
     */
    /**
     * Sample code: ExportPipelineGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void exportPipelineGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .exportPipelines()
            .getWithResponse("myResourceGroup", "myRegistry", "myExportPipeline", com.azure.core.util.Context.NONE);
    }
}
```

### ExportPipelines_List

```java
/** Samples for ExportPipelines List. */
public final class ExportPipelinesListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ExportPipelineList.json
     */
    /**
     * Sample code: ExportPipelineList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void exportPipelineList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.exportPipelines().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### ImportPipelines_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.IdentityProperties;
import com.azure.resourcemanager.containerregistry.generated.models.ImportPipelineSourceProperties;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineOptions;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineSourceType;
import com.azure.resourcemanager.containerregistry.generated.models.ResourceIdentityType;
import com.azure.resourcemanager.containerregistry.generated.models.UserIdentityProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for ImportPipelines Create. */
public final class ImportPipelinesCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ImportPipelineCreate.json
     */
    /**
     * Sample code: ImportPipelineCreate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void importPipelineCreate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .importPipelines()
            .define("myImportPipeline")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withRegion("westus")
            .withIdentity(
                new IdentityProperties()
                    .withType(ResourceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/f9d7ebed-adbd-4cb4-b973-aaf82c136138/resourcegroups/myResourceGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/identity2",
                            new UserIdentityProperties())))
            .withSource(
                new ImportPipelineSourceProperties()
                    .withType(PipelineSourceType.AZURE_STORAGE_BLOB_CONTAINER)
                    .withUri("https://accountname.blob.core.windows.net/containername")
                    .withKeyVaultUri("fakeTokenPlaceholder"))
            .withOptions(
                Arrays
                    .asList(
                        PipelineOptions.OVERWRITE_TAGS,
                        PipelineOptions.DELETE_SOURCE_BLOB_ON_SUCCESS,
                        PipelineOptions.CONTINUE_ON_ERRORS))
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

### ImportPipelines_Delete

```java
/** Samples for ImportPipelines Delete. */
public final class ImportPipelinesDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ImportPipelineDelete.json
     */
    /**
     * Sample code: ImportPipelineDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void importPipelineDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .importPipelines()
            .delete("myResourceGroup", "myRegistry", "myImportPipeline", com.azure.core.util.Context.NONE);
    }
}
```

### ImportPipelines_Get

```java
/** Samples for ImportPipelines Get. */
public final class ImportPipelinesGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ImportPipelineGet.json
     */
    /**
     * Sample code: ImportPipelineGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void importPipelineGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .importPipelines()
            .getWithResponse("myResourceGroup", "myRegistry", "myImportPipeline", com.azure.core.util.Context.NONE);
    }
}
```

### ImportPipelines_List

```java
/** Samples for ImportPipelines List. */
public final class ImportPipelinesListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ImportPipelineList.json
     */
    /**
     * Sample code: ImportPipelineList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void importPipelineList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.importPipelines().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/OperationList.json
     */
    /**
     * Sample code: OperationList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void operationList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### PipelineRuns_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.PipelineRunRequest;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineRunSourceProperties;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineRunSourceType;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineRunTargetProperties;
import com.azure.resourcemanager.containerregistry.generated.models.PipelineRunTargetType;
import java.util.Arrays;

/** Samples for PipelineRuns Create. */
public final class PipelineRunsCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/PipelineRunCreate_Import.json
     */
    /**
     * Sample code: PipelineRunCreate_Import.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void pipelineRunCreateImport(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .pipelineRuns()
            .define("myPipelineRun")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withRequest(
                new PipelineRunRequest()
                    .withPipelineResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/importPipelines/myImportPipeline")
                    .withSource(
                        new PipelineRunSourceProperties()
                            .withType(PipelineRunSourceType.AZURE_STORAGE_BLOB)
                            .withName("myblob.tar.gz"))
                    .withCatalogDigest("sha256@"))
            .withForceUpdateTag("2020-03-04T17:23:21.9261521+00:00")
            .create();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/PipelineRunCreate_Export.json
     */
    /**
     * Sample code: PipelineRunCreate_Export.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void pipelineRunCreateExport(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .pipelineRuns()
            .define("myPipelineRun")
            .withExistingRegistry("myResourceGroup", "myRegistry")
            .withRequest(
                new PipelineRunRequest()
                    .withPipelineResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.ContainerRegistry/registries/myRegistry/exportPipelines/myExportPipeline")
                    .withArtifacts(
                        Arrays
                            .asList(
                                "sourceRepository/hello-world",
                                "sourceRepository2@sha256:00000000000000000000000000000000000"))
                    .withTarget(
                        new PipelineRunTargetProperties()
                            .withType(PipelineRunTargetType.AZURE_STORAGE_BLOB)
                            .withName("myblob.tar.gz")))
            .create();
    }
}
```

### PipelineRuns_Delete

```java
/** Samples for PipelineRuns Delete. */
public final class PipelineRunsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/PipelineRunDelete.json
     */
    /**
     * Sample code: PipelineRunDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void pipelineRunDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .pipelineRuns()
            .delete("myResourceGroup", "myRegistry", "myPipelineRun", com.azure.core.util.Context.NONE);
    }
}
```

### PipelineRuns_Get

```java
/** Samples for PipelineRuns Get. */
public final class PipelineRunsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/PipelineRunGet.json
     */
    /**
     * Sample code: PipelineRunGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void pipelineRunGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .pipelineRuns()
            .getWithResponse("myResourceGroup", "myRegistry", "myPipelineRun", com.azure.core.util.Context.NONE);
    }
}
```

### PipelineRuns_List

```java
/** Samples for PipelineRuns List. */
public final class PipelineRunsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/PipelineRunList.json
     */
    /**
     * Sample code: PipelineRunList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void pipelineRunList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.pipelineRuns().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/PrivateEndpointConnectionCreateOrUpdate.json
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
/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/PrivateEndpointConnectionDelete.json
     */
    /**
     * Sample code: PrivateEndpointConnectionDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void privateEndpointConnectionDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .privateEndpointConnections()
            .delete("myResourceGroup", "myRegistry", "myConnection", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/PrivateEndpointConnectionGet.json
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
            .getWithResponse("myResourceGroup", "myRegistry", "myConnection", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_List

```java
/** Samples for PrivateEndpointConnections List. */
public final class PrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/PrivateEndpointConnectionList.json
     */
    /**
     * Sample code: PrivateEndpointConnectionList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void privateEndpointConnectionList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.privateEndpointConnections().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Registries_CheckNameAvailability

```java
import com.azure.resourcemanager.containerregistry.generated.models.RegistryNameCheckRequest;

/** Samples for Registries CheckNameAvailability. */
public final class RegistriesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryCheckNameAvailable.json
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
            .checkNameAvailabilityWithResponse(
                new RegistryNameCheckRequest().withName("myRegistry"), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryCheckNameNotAvailable.json
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
            .checkNameAvailabilityWithResponse(
                new RegistryNameCheckRequest().withName("myRegistry"), com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryCreateZoneRedundant.json
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
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .withZoneRedundancy(ZoneRedundancy.ENABLED)
            .create();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryCreate.json
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
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .withAdminUserEnabled(true)
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

### Registries_Delete

```java
/** Samples for Registries Delete. */
public final class RegistriesDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryDelete.json
     */
    /**
     * Sample code: RegistryDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().delete("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Registries_GenerateCredentials

```java
import com.azure.resourcemanager.containerregistry.generated.models.GenerateCredentialsParameters;
import java.time.OffsetDateTime;

/** Samples for Registries GenerateCredentials. */
public final class RegistriesGenerateCredentialsSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryGenerateCredentials.json
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
                com.azure.core.util.Context.NONE);
    }
}
```

### Registries_GetBuildSourceUploadUrl

```java
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
        manager
            .registries()
            .getBuildSourceUploadUrlWithResponse("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Registries_GetByResourceGroup

```java
/** Samples for Registries GetByResourceGroup. */
public final class RegistriesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryGet.json
     */
    /**
     * Sample code: RegistryGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .getByResourceGroupWithResponse("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Registries_GetPrivateLinkResource

```java
/** Samples for Registries GetPrivateLinkResource. */
public final class RegistriesGetPrivateLinkResourceSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryGetPrivateLinkResource.json
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
            .getPrivateLinkResourceWithResponse(
                "myResourceGroup", "myRegistry", "registry", com.azure.core.util.Context.NONE);
    }
}
```

### Registries_ImportImage

```java
import com.azure.resourcemanager.containerregistry.generated.models.ImportImageParameters;
import com.azure.resourcemanager.containerregistry.generated.models.ImportMode;
import com.azure.resourcemanager.containerregistry.generated.models.ImportSource;
import java.util.Arrays;

/** Samples for Registries ImportImage. */
public final class RegistriesImportImageSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ImportImageFromPublicRegistry.json
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
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ImportImageByTag.json
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
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ImportImageByManifestDigest.json
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
                com.azure.core.util.Context.NONE);
    }
}
```

### Registries_List

```java
/** Samples for Registries List. */
public final class RegistriesListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryList.json
     */
    /**
     * Sample code: RegistryList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().list(com.azure.core.util.Context.NONE);
    }
}
```

### Registries_ListByResourceGroup

```java
/** Samples for Registries ListByResourceGroup. */
public final class RegistriesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryListByResourceGroup.json
     */
    /**
     * Sample code: RegistryListByResourceGroup.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryListByResourceGroup(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### Registries_ListCredentials

```java
/** Samples for Registries ListCredentials. */
public final class RegistriesListCredentialsSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryListCredentials.json
     */
    /**
     * Sample code: RegistryListCredentials.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryListCredentials(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .listCredentialsWithResponse("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Registries_ListPrivateLinkResources

```java
/** Samples for Registries ListPrivateLinkResources. */
public final class RegistriesListPrivateLinkResourcesSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryListPrivateLinkResources.json
     */
    /**
     * Sample code: RegistryListPrivateLinkResources.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryListPrivateLinkResources(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .registries()
            .listPrivateLinkResources("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Registries_ListUsages

```java
/** Samples for Registries ListUsages. */
public final class RegistriesListUsagesSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryListUsages.json
     */
    /**
     * Sample code: RegistryListUsages.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void registryListUsages(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.registries().listUsagesWithResponse("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Registries_RegenerateCredential

```java
import com.azure.resourcemanager.containerregistry.generated.models.PasswordName;
import com.azure.resourcemanager.containerregistry.generated.models.RegenerateCredentialParameters;

/** Samples for Registries RegenerateCredential. */
public final class RegistriesRegenerateCredentialSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryRegenerateCredential.json
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
                com.azure.core.util.Context.NONE);
    }
}
```

### Registries_ScheduleRun

```java
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
                com.azure.core.util.Context.NONE);
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
                com.azure.core.util.Context.NONE);
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
                com.azure.core.util.Context.NONE);
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
                com.azure.core.util.Context.NONE);
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
                com.azure.core.util.Context.NONE);
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
                com.azure.core.util.Context.NONE);
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
                com.azure.core.util.Context.NONE);
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

### Registries_Update

```java
import com.azure.resourcemanager.containerregistry.generated.models.Registry;
import com.azure.resourcemanager.containerregistry.generated.models.Sku;
import com.azure.resourcemanager.containerregistry.generated.models.SkuName;
import java.util.HashMap;
import java.util.Map;

/** Samples for Registries Update. */
public final class RegistriesUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/RegistryUpdate.json
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
                .getByResourceGroupWithResponse("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .withSku(new Sku().withName(SkuName.STANDARD))
            .withAdminUserEnabled(true)
            .apply();
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

### Replications_Create

```java
import com.azure.resourcemanager.containerregistry.generated.models.ZoneRedundancy;
import java.util.HashMap;
import java.util.Map;

/** Samples for Replications Create. */
public final class ReplicationsCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ReplicationCreate.json
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
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .create();
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ReplicationCreateZoneRedundant.json
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
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .withRegionEndpointEnabled(true)
            .withZoneRedundancy(ZoneRedundancy.ENABLED)
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

### Replications_Delete

```java
/** Samples for Replications Delete. */
public final class ReplicationsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ReplicationDelete.json
     */
    /**
     * Sample code: ReplicationDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void replicationDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .replications()
            .delete("myResourceGroup", "myRegistry", "myReplication", com.azure.core.util.Context.NONE);
    }
}
```

### Replications_Get

```java
/** Samples for Replications Get. */
public final class ReplicationsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ReplicationGet.json
     */
    /**
     * Sample code: ReplicationGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void replicationGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .replications()
            .getWithResponse("myResourceGroup", "myRegistry", "myReplication", com.azure.core.util.Context.NONE);
    }
}
```

### Replications_List

```java
/** Samples for Replications List. */
public final class ReplicationsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ReplicationList.json
     */
    /**
     * Sample code: ReplicationList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void replicationList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.replications().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Replications_Update

```java
import com.azure.resourcemanager.containerregistry.generated.models.Replication;
import java.util.HashMap;
import java.util.Map;

/** Samples for Replications Update. */
public final class ReplicationsUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ReplicationUpdate.json
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
                .getWithResponse("myResourceGroup", "myRegistry", "myReplication", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key", "fakeTokenPlaceholder")).apply();
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

### Runs_Cancel

```java
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
        manager
            .runs()
            .cancel(
                "myResourceGroup",
                "myRegistry",
                "0accec26-d6de-4757-8e74-d080f38eaaab",
                com.azure.core.util.Context.NONE);
    }
}
```

### Runs_Get

```java
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
            .getWithResponse(
                "myResourceGroup",
                "myRegistry",
                "0accec26-d6de-4757-8e74-d080f38eaaab",
                com.azure.core.util.Context.NONE);
    }
}
```

### Runs_GetLogSasUrl

```java
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
                "myResourceGroup",
                "myRegistry",
                "0accec26-d6de-4757-8e74-d080f38eaaab",
                com.azure.core.util.Context.NONE);
    }
}
```

### Runs_List

```java
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
        manager.runs().list("myResourceGroup", "myRegistry", "", 10, com.azure.core.util.Context.NONE);
    }
}
```

### Runs_Update

```java
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
                com.azure.core.util.Context.NONE);
    }
}
```

### ScopeMaps_Create

```java
import java.util.Arrays;

/** Samples for ScopeMaps Create. */
public final class ScopeMapsCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ScopeMapCreate.json
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
/** Samples for ScopeMaps Delete. */
public final class ScopeMapsDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ScopeMapDelete.json
     */
    /**
     * Sample code: ScopeMapDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void scopeMapDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.scopeMaps().delete("myResourceGroup", "myRegistry", "myScopeMap", com.azure.core.util.Context.NONE);
    }
}
```

### ScopeMaps_Get

```java
/** Samples for ScopeMaps Get. */
public final class ScopeMapsGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ScopeMapGet.json
     */
    /**
     * Sample code: ScopeMapGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void scopeMapGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .scopeMaps()
            .getWithResponse("myResourceGroup", "myRegistry", "myScopeMap", com.azure.core.util.Context.NONE);
    }
}
```

### ScopeMaps_List

```java
/** Samples for ScopeMaps List. */
public final class ScopeMapsListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ScopeMapList.json
     */
    /**
     * Sample code: ScopeMapList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void scopeMapList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.scopeMaps().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### ScopeMaps_Update

```java
import com.azure.resourcemanager.containerregistry.generated.models.ScopeMap;
import java.util.Arrays;

/** Samples for ScopeMaps Update. */
public final class ScopeMapsUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/ScopeMapUpdate.json
     */
    /**
     * Sample code: ScopeMapUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void scopeMapUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        ScopeMap resource =
            manager
                .scopeMaps()
                .getWithResponse("myResourceGroup", "myRegistry", "myScopeMap", com.azure.core.util.Context.NONE)
                .getValue();
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
        manager.taskRuns().delete("myResourceGroup", "myRegistry", "myRun", com.azure.core.util.Context.NONE);
    }
}
```

### TaskRuns_Get

```java
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
        manager.taskRuns().getWithResponse("myResourceGroup", "myRegistry", "myRun", com.azure.core.util.Context.NONE);
    }
}
```

### TaskRuns_GetDetails

```java
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
        manager
            .taskRuns()
            .getDetailsWithResponse("myResourceGroup", "myRegistry", "myRun", com.azure.core.util.Context.NONE);
    }
}
```

### TaskRuns_List

```java
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
        manager.taskRuns().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### TaskRuns_Update

```java
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
            manager
                .taskRuns()
                .getWithResponse("myResourceGroup", "myRegistry", "myRun", com.azure.core.util.Context.NONE)
                .getValue();
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
            .withTags(mapOf("testkey", "fakeTokenPlaceholder"))
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
            .withTags(mapOf("testkey", "fakeTokenPlaceholder"))
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
            .withTags(mapOf("testkey", "fakeTokenPlaceholder"))
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
            .withTags(mapOf("testkey", "fakeTokenPlaceholder"))
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
            .withTags(mapOf("testkey", "fakeTokenPlaceholder"))
            .withStatus(TaskStatus.ENABLED)
            .withLogTemplate("acr/tasks:{{.Run.OS}}")
            .withIsSystemTask(true)
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

### Tasks_Delete

```java
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
        manager.tasks().delete("myResourceGroup", "myRegistry", "myTask", com.azure.core.util.Context.NONE);
    }
}
```

### Tasks_Get

```java
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
        manager.tasks().getWithResponse("myResourceGroup", "myRegistry", "myTask", com.azure.core.util.Context.NONE);
    }
}
```

### Tasks_GetDetails

```java
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
        manager
            .tasks()
            .getDetailsWithResponse("myResourceGroup", "myRegistry", "myTask", com.azure.core.util.Context.NONE);
    }
}
```

### Tasks_List

```java
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
        manager.tasks().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Tasks_Update

```java
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
            manager
                .tasks()
                .getWithResponse("myResourceGroup", "myRegistry", "quicktask", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("testkey", "fakeTokenPlaceholder"))
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
            manager
                .tasks()
                .getWithResponse("myResourceGroup", "myRegistry", "myTask", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("testkey", "fakeTokenPlaceholder"))
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
            manager
                .tasks()
                .getWithResponse("myResourceGroup", "myRegistry", "myTask", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("testkey", "fakeTokenPlaceholder"))
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
            manager
                .tasks()
                .getWithResponse("myResourceGroup", "myRegistry", "myTask", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("testkey", "fakeTokenPlaceholder"))
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
            manager
                .tasks()
                .getWithResponse("myResourceGroup", "myRegistry", "myTask", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("testkey", "fakeTokenPlaceholder"))
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
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/TokenCreate.json
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
/** Samples for Tokens Delete. */
public final class TokensDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/TokenDelete.json
     */
    /**
     * Sample code: TokenDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tokenDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.tokens().delete("myResourceGroup", "myRegistry", "myToken", com.azure.core.util.Context.NONE);
    }
}
```

### Tokens_Get

```java
/** Samples for Tokens Get. */
public final class TokensGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/TokenGet.json
     */
    /**
     * Sample code: TokenGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tokenGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.tokens().getWithResponse("myResourceGroup", "myRegistry", "myToken", com.azure.core.util.Context.NONE);
    }
}
```

### Tokens_List

```java
/** Samples for Tokens List. */
public final class TokensListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/TokenList.json
     */
    /**
     * Sample code: TokenList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tokenList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.tokens().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Tokens_Update

```java
import com.azure.resourcemanager.containerregistry.generated.models.Token;
import com.azure.resourcemanager.containerregistry.generated.models.TokenCertificate;
import com.azure.resourcemanager.containerregistry.generated.models.TokenCertificateName;
import com.azure.resourcemanager.containerregistry.generated.models.TokenCredentialsProperties;
import java.util.Arrays;

/** Samples for Tokens Update. */
public final class TokensUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/TokenUpdate.json
     */
    /**
     * Sample code: TokenUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void tokenUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Token resource =
            manager
                .tokens()
                .getWithResponse("myResourceGroup", "myRegistry", "myToken", com.azure.core.util.Context.NONE)
                .getValue();
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
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/WebhookCreate.json
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
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .withServiceUri("http://myservice.com")
            .withCustomHeaders(mapOf("Authorization", "fakeTokenPlaceholder"))
            .withStatus(WebhookStatus.ENABLED)
            .withScope("myRepository")
            .withActions(Arrays.asList(WebhookAction.PUSH))
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

### Webhooks_Delete

```java
/** Samples for Webhooks Delete. */
public final class WebhooksDeleteSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/WebhookDelete.json
     */
    /**
     * Sample code: WebhookDelete.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookDelete(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.webhooks().delete("myResourceGroup", "myRegistry", "myWebhook", com.azure.core.util.Context.NONE);
    }
}
```

### Webhooks_Get

```java
/** Samples for Webhooks Get. */
public final class WebhooksGetSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/WebhookGet.json
     */
    /**
     * Sample code: WebhookGet.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookGet(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .webhooks()
            .getWithResponse("myResourceGroup", "myRegistry", "myWebhook", com.azure.core.util.Context.NONE);
    }
}
```

### Webhooks_GetCallbackConfig

```java
/** Samples for Webhooks GetCallbackConfig. */
public final class WebhooksGetCallbackConfigSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/WebhookGetCallbackConfig.json
     */
    /**
     * Sample code: WebhookGetCallbackConfig.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookGetCallbackConfig(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .webhooks()
            .getCallbackConfigWithResponse(
                "myResourceGroup", "myRegistry", "myWebhook", com.azure.core.util.Context.NONE);
    }
}
```

### Webhooks_List

```java
/** Samples for Webhooks List. */
public final class WebhooksListSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/WebhookList.json
     */
    /**
     * Sample code: WebhookList.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookList(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.webhooks().list("myResourceGroup", "myRegistry", com.azure.core.util.Context.NONE);
    }
}
```

### Webhooks_ListEvents

```java
/** Samples for Webhooks ListEvents. */
public final class WebhooksListEventsSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/WebhookListEvents.json
     */
    /**
     * Sample code: WebhookListEvents.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookListEvents(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager.webhooks().listEvents("myResourceGroup", "myRegistry", "myWebhook", com.azure.core.util.Context.NONE);
    }
}
```

### Webhooks_Ping

```java
/** Samples for Webhooks Ping. */
public final class WebhooksPingSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/WebhookPing.json
     */
    /**
     * Sample code: WebhookPing.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookPing(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        manager
            .webhooks()
            .pingWithResponse("myResourceGroup", "myRegistry", "myWebhook", com.azure.core.util.Context.NONE);
    }
}
```

### Webhooks_Update

```java
import com.azure.resourcemanager.containerregistry.generated.models.Webhook;
import com.azure.resourcemanager.containerregistry.generated.models.WebhookAction;
import com.azure.resourcemanager.containerregistry.generated.models.WebhookStatus;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Webhooks Update. */
public final class WebhooksUpdateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/WebhookUpdate.json
     */
    /**
     * Sample code: WebhookUpdate.
     *
     * @param manager Entry point to ContainerRegistryManager.
     */
    public static void webhookUpdate(
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager) {
        Webhook resource =
            manager
                .webhooks()
                .getWithResponse("myResourceGroup", "myRegistry", "myWebhook", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .withServiceUri("http://myservice.com")
            .withCustomHeaders(mapOf("Authorization", "fakeTokenPlaceholder"))
            .withStatus(WebhookStatus.ENABLED)
            .withScope("myRepository")
            .withActions(Arrays.asList(WebhookAction.PUSH))
            .apply();
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

