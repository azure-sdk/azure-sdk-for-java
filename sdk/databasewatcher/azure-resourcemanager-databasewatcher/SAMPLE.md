# Code snippets and samples


## Operations

- [List](#operations_list)

## SharedPrivateLinkResources

- [Create](#sharedprivatelinkresources_create)
- [Delete](#sharedprivatelinkresources_delete)
- [Get](#sharedprivatelinkresources_get)
- [ListByWatcher](#sharedprivatelinkresources_listbywatcher)

## Targets

- [CreateOrUpdate](#targets_createorupdate)
- [Delete](#targets_delete)
- [Get](#targets_get)
- [ListByWatcher](#targets_listbywatcher)

## Watchers

- [CreateOrUpdate](#watchers_createorupdate)
- [Delete](#watchers_delete)
- [GetByResourceGroup](#watchers_getbyresourcegroup)
- [List](#watchers_list)
- [ListByResourceGroup](#watchers_listbyresourcegroup)
- [Start](#watchers_start)
- [Stop](#watchers_stop)
- [Update](#watchers_update)
### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Operations_List_200.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void operationsList(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### SharedPrivateLinkResources_Create

```java
/**
 * Samples for SharedPrivateLinkResources Create.
 */
public final class SharedPrivateLinkResourcesCreateSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * SharedPrivateLinkResources_Create_200.json
     */
    /**
     * Sample code: SharedPrivateLinkResources_Create.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        sharedPrivateLinkResourcesCreate(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.sharedPrivateLinkResources().define("monitoringh22eed")
            .withExistingWatcher("apiTest-ddat4p", "databasemo3ej9ih")
            .withPrivateLinkResourceId(
                "/subscriptions/6f53185c-ea09-4fc3-9075-318dec805303/resourceGroups/apiTest-ddat4p/providers/Microsoft.KeyVault/vaults/kvmo3ej9ih")
            .withGroupId("vault").withRequestMessage("request message").withDnsZone("ec3ae9d410ba").create();
    }
}
```

### SharedPrivateLinkResources_Delete

```java
/**
 * Samples for SharedPrivateLinkResources Delete.
 */
public final class SharedPrivateLinkResourcesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * SharedPrivateLinkResources_Delete_200.json
     */
    /**
     * Sample code: SharedPrivateLinkResources_Delete.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        sharedPrivateLinkResourcesDelete(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.sharedPrivateLinkResources().delete("apiTest-ddat4p", "databasemo3ej9ih", "monitoringh22eed",
            com.azure.core.util.Context.NONE);
    }
}
```

### SharedPrivateLinkResources_Get

```java
/**
 * Samples for SharedPrivateLinkResources Get.
 */
public final class SharedPrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * SharedPrivateLinkResources_Get_200.json
     */
    /**
     * Sample code: SharedPrivateLinkResources_Get.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        sharedPrivateLinkResourcesGet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.sharedPrivateLinkResources().getWithResponse("apiTest-ddat4p", "databasemo3ej9ih", "monitoringh22eed",
            com.azure.core.util.Context.NONE);
    }
}
```

### SharedPrivateLinkResources_ListByWatcher

```java
/**
 * Samples for SharedPrivateLinkResources ListByWatcher.
 */
public final class SharedPrivateLinkResourcesListByWatcherSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * SharedPrivateLinkResources_ListByWatcher_200.json
     */
    /**
     * Sample code: SharedPrivateLinkResources_ListByWatcher.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void sharedPrivateLinkResourcesListByWatcher(
        com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.sharedPrivateLinkResources().listByWatcher("apiTest-ddat4p", "databasemo3ej9ih",
            com.azure.core.util.Context.NONE);
    }
}
```

### Targets_CreateOrUpdate

```java
import com.azure.resourcemanager.databasewatcher.models.SqlDbSingleDatabaseTargetProperties;
import com.azure.resourcemanager.databasewatcher.models.TargetAuthenticationType;

/**
 * Samples for Targets CreateOrUpdate.
 */
public final class TargetsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Targets_CreateOrUpdate_200.json
     */
    /**
     * Sample code: Targets_CreateOrUpdate.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void targetsCreateOrUpdate(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.targets().define("monitoringh22eed").withExistingWatcher("apiTest-ddat4p", "databasemo3ej9ih")
            .withProperties(new SqlDbSingleDatabaseTargetProperties()
                .withTargetAuthenticationType(TargetAuthenticationType.AAD).withConnectionServerName("sqlServero1ihe2")
                .withSqlDbResourceId(
                    "/subscriptions/6f53185c-ea09-4fc3-9075-318dec805303/resourceGroups/apiTest-ddat4p/providers/Microsoft.Sql/servers/m1/databases/m2"))
            .create();
    }
}
```

### Targets_Delete

```java
/**
 * Samples for Targets Delete.
 */
public final class TargetsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Targets_Delete_200.json
     */
    /**
     * Sample code: Targets_Delete.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void targetsDelete(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.targets().deleteWithResponse("apiTest-ddat4p", "databasemo3ej9ih", "monitoringh22eed",
            com.azure.core.util.Context.NONE);
    }
}
```

### Targets_Get

```java
/**
 * Samples for Targets Get.
 */
public final class TargetsGetSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Targets_Get_200.json
     */
    /**
     * Sample code: Targets_Get.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void targetsGet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.targets().getWithResponse("apiTest-ddat4p", "databasemo3ej9ih", "monitoringh22eed",
            com.azure.core.util.Context.NONE);
    }
}
```

### Targets_ListByWatcher

```java
/**
 * Samples for Targets ListByWatcher.
 */
public final class TargetsListByWatcherSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Targets_ListByWatcher_200.json
     */
    /**
     * Sample code: Targets_ListByWatcher.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void targetsListByWatcher(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.targets().listByWatcher("apiTest-ddat4p", "databasemo3ej9ih", com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_CreateOrUpdate

```java
/**
 * Samples for Watchers CreateOrUpdate.
 */
public final class WatchersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Watchers_CreateOrUpdate_200.json
     */
    /**
     * Sample code: Watchers_CreateOrUpdate.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        watchersCreateOrUpdate(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().define("databasemo3ej9ih").withRegion("westus").withExistingResourceGroup("apiTest-ddat4p")
            .create();
    }
}
```

### Watchers_Delete

```java
/**
 * Samples for Watchers Delete.
 */
public final class WatchersDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Watchers_Delete_200.json
     */
    /**
     * Sample code: Watchers_Delete.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void watchersDelete(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().delete("apiTest-ddat4p", "databasemo3ej9ih", com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_GetByResourceGroup

```java
/**
 * Samples for Watchers GetByResourceGroup.
 */
public final class WatchersGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Watchers_Get_200.json
     */
    /**
     * Sample code: Watchers_Get.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void watchersGet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().getByResourceGroupWithResponse("apiTest-ddat4p", "databasemo3ej9ih",
            com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_List

```java
/**
 * Samples for Watchers List.
 */
public final class WatchersListSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Watchers_ListBySubscription_200.json
     */
    /**
     * Sample code: Watchers_ListBySubscription.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        watchersListBySubscription(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().list(com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_ListByResourceGroup

```java
/**
 * Samples for Watchers ListByResourceGroup.
 */
public final class WatchersListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Watchers_ListByResourceGroup_200.json
     */
    /**
     * Sample code: Watchers_ListByResourceGroup.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        watchersListByResourceGroup(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().listByResourceGroup("apiTest-ddat4p", com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_Start

```java
/**
 * Samples for Watchers Start.
 */
public final class WatchersStartSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Watchers_Start_200.json
     */
    /**
     * Sample code: Watchers_Start.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void watchersStart(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().start("apiTest-ddat4p", "databasemo3ej9ih", com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_Stop

```java
/**
 * Samples for Watchers Stop.
 */
public final class WatchersStopSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Watchers_Stop_200.json
     */
    /**
     * Sample code: Watchers_Stop.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void watchersStop(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().stop("apiTest-ddat4p", "databasemo3ej9ih", com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_Update

```java
import com.azure.resourcemanager.databasewatcher.models.DatastoreUpdate;
import com.azure.resourcemanager.databasewatcher.models.KustoOfferingType;
import com.azure.resourcemanager.databasewatcher.models.ManagedServiceIdentity;
import com.azure.resourcemanager.databasewatcher.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.databasewatcher.models.Watcher;

/**
 * Samples for Watchers Update.
 */
public final class WatchersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/preview/2023-09-01-preview/examples/
     * Watchers_Update_200.json
     */
    /**
     * Sample code: Watchers_Update.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void watchersUpdate(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        Watcher resource = manager.watchers()
            .getByResourceGroupWithResponse("apiTest-lzect6", "databasemohkp6fn", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
            .withDatastore(new DatastoreUpdate().withAdxClusterResourceId(
                "/subscriptions/ef5e6a8a-fbb4-4e78-89da-f3690adfaa15/resourceGroups/SalADFTest/providers/Microsoft.Kusto/clusters/adf2kusto")
                .withKustoClusterDisplayName("kustoUri-adx")
                .withKustoClusterUri("https://kustouri-adx.eastus.kusto.windows.net")
                .withKustoDataIngestionUri("https://ingest-kustouri-adx.eastus.kusto.windows.net")
                .withKustoDatabaseName("kustoDatabaseName1").withKustoManagementUrl("https://portal.azure.com/")
                .withKustoOfferingType(KustoOfferingType.ADX))
            .apply();
    }
}
```

