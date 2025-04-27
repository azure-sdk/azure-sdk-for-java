# Code snippets and samples


## AlertRuleResources

- [CreateOrUpdate](#alertruleresources_createorupdate)
- [Delete](#alertruleresources_delete)
- [Get](#alertruleresources_get)
- [ListByParent](#alertruleresources_listbyparent)

## HealthValidations

- [Get](#healthvalidations_get)
- [ListByParent](#healthvalidations_listbyparent)
- [StartValidation](#healthvalidations_startvalidation)

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
### AlertRuleResources_CreateOrUpdate

```java
/**
 * Samples for Watchers ListByResourceGroup.
 */
public final class WatchersListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Watchers_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Watchers_ListByResourceGroup_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void watchersListByResourceGroupMaximumSet(
        com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().listByResourceGroup("rgWatcher", com.azure.core.util.Context.NONE);
    }
}
```

### AlertRuleResources_Delete

```java
import com.azure.resourcemanager.databasewatcher.models.Datastore;
import com.azure.resourcemanager.databasewatcher.models.KustoOfferingType;
import com.azure.resourcemanager.databasewatcher.models.ManagedServiceIdentity;
import com.azure.resourcemanager.databasewatcher.models.ManagedServiceIdentityType;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Watchers CreateOrUpdate.
 */
public final class WatchersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Watchers_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Watchers_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        watchersCreateOrUpdateMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers()
            .define("testWatcher")
            .withRegion("eastus2")
            .withExistingResourceGroup("rgWatcher")
            .withTags(mapOf())
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
            .withDatastore(new Datastore().withAdxClusterResourceId(
                "/subscriptions/49e0fbd3-75e8-44e7-96fd-5b64d9ad818d/resourceGroups/apiTest/providers/Microsoft.Kusto/clusters/apiTestKusto")
                .withKustoClusterDisplayName("kustoUri-adx")
                .withKustoClusterUri("https://kustouri-adx.eastus.kusto.windows.net")
                .withKustoDataIngestionUri("https://ingest-kustouri-adx.eastus.kusto.windows.net")
                .withKustoDatabaseName("kustoDatabaseName1")
                .withKustoManagementUrl("https://portal.azure.com/")
                .withKustoOfferingType(KustoOfferingType.ADX))
            .withDefaultAlertRuleIdentityResourceId(
                "/subscriptions/469DD77C-C8DB-47B7-B9E1-72D29F8C878B/resourceGroups/rgWatcher/providers/Microsoft.ManagedIdentity/userAssignedIdentities/3pmtest")
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

### AlertRuleResources_Get

```java
/**
 * Samples for Targets Get.
 */
public final class TargetsGetSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Targets_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Targets_Get_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void targetsGetMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.targets()
            .getWithResponse("apiTest-ddat4p", "databasemo3ej9ih", "monitoringh22eed",
                com.azure.core.util.Context.NONE);
    }
}
```

### AlertRuleResources_ListByParent

```java
/**
 * Samples for Watchers Start.
 */
public final class WatchersStartSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Watchers_Start_MaximumSet_Gen.json
     */
    /**
     * Sample code: Watchers_Start_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        watchersStartMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().start("rgWatcher", "testWatcher", com.azure.core.util.Context.NONE);
    }
}
```

### HealthValidations_Get

```java
import com.azure.resourcemanager.databasewatcher.models.AlertRuleCreationProperties;
import java.time.OffsetDateTime;

/**
 * Samples for AlertRuleResources CreateOrUpdate.
 */
public final class AlertRuleResourcesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * AlertRuleResources_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: AlertRuleResources_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void alertRuleResourcesCreateOrUpdateMaximumSet(
        com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.alertRuleResources()
            .define("testAlert")
            .withExistingWatcher("rgWatcher", "testWatcher")
            .withAlertRuleResourceId(
                "/subscriptions/469DD77C-C8DB-47B7-B9E1-72D29F8C878Be/resourceGroups/rgWatcher/providers/microsoft.insights/scheduledqueryrules/alerts-demo")
            .withCreatedWithProperties(AlertRuleCreationProperties.CREATED_WITH_ACTION_GROUP)
            .withCreationTime(OffsetDateTime.parse("2024-07-25T15:38:47.798Z"))
            .withAlertRuleTemplateId("someTemplateId")
            .withAlertRuleTemplateVersion("1.0")
            .create();
    }
}
```

### HealthValidations_ListByParent

```java
import com.azure.resourcemanager.databasewatcher.models.SqlDbSingleDatabaseTargetProperties;
import com.azure.resourcemanager.databasewatcher.models.TargetAuthenticationType;

/**
 * Samples for Targets CreateOrUpdate.
 */
public final class TargetsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Targets_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Targets_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        targetsCreateOrUpdateMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.targets()
            .define("monitoringh22eed")
            .withExistingWatcher("apiTest-ddat4p", "databasemo3ej9ih")
            .withProperties(new SqlDbSingleDatabaseTargetProperties()
                .withTargetAuthenticationType(TargetAuthenticationType.AAD)
                .withConnectionServerName("sqlServero1ihe2")
                .withSqlDbResourceId(
                    "/subscriptions/49e0fbd3-75e8-44e7-96fd-5b64d9ad818d/resourceGroups/apiTest-ddat4p/providers/Microsoft.Sql/servers/m1/databases/m2"))
            .create();
    }
}
```

### HealthValidations_StartValidation

```java
/**
 * Samples for Watchers Stop.
 */
public final class WatchersStopSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Watchers_Stop_MaximumSet_Gen.json
     */
    /**
     * Sample code: Watchers_Stop_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        watchersStopMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().stop("rgWatcher", "myWatcher", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for AlertRuleResources Get.
 */
public final class AlertRuleResourcesGetSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * AlertRuleResources_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: AlertRuleResources_Get_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        alertRuleResourcesGetMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.alertRuleResources()
            .getWithResponse("rgWatcher", "testWatcher", "testAlert", com.azure.core.util.Context.NONE);
    }
}
```

### SharedPrivateLinkResources_Create

```java
/**
 * Samples for Targets ListByWatcher.
 */
public final class TargetsListByWatcherSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Targets_ListByWatcher_MaximumSet_Gen.json
     */
    /**
     * Sample code: Targets_ListByWatcher_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        targetsListByWatcherMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.targets().listByWatcher("apiTest-ddat4p", "databasemo3ej9ih", com.azure.core.util.Context.NONE);
    }
}
```

### SharedPrivateLinkResources_Delete

```java
/**
 * Samples for HealthValidations Get.
 */
public final class HealthValidationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * HealthValidations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: HealthValidations_Get_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        healthValidationsGetMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.healthValidations()
            .getWithResponse("rgWatcher", "testWatcher", "testHealthValidation", com.azure.core.util.Context.NONE);
    }
}
```

### SharedPrivateLinkResources_Get

```java
/**
 * Samples for AlertRuleResources ListByParent.
 */
public final class AlertRuleResourcesListByParentSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * AlertRuleResources_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: AlertRuleResources_ListByParent_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void alertRuleResourcesListByParentMaximumSet(
        com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.alertRuleResources().listByParent("rgWatcher", "testWatcher", com.azure.core.util.Context.NONE);
    }
}
```

### SharedPrivateLinkResources_ListByWatcher

```java
/**
 * Samples for Watchers Delete.
 */
public final class WatchersDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Watchers_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Watchers_Delete_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        watchersDeleteMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().delete("rgWatcher", "testWatcher", com.azure.core.util.Context.NONE);
    }
}
```

### Targets_CreateOrUpdate

```java
/**
 * Samples for HealthValidations StartValidation.
 */
public final class HealthValidationsStartValidationSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * HealthValidations_StartValidation_MaximumSet_Gen.json
     */
    /**
     * Sample code: HealthValidations_StartValidation_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void healthValidationsStartValidationMaximumSet(
        com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.healthValidations()
            .startValidation("rgWatcher", "testWatcher", "testHealthValidation", com.azure.core.util.Context.NONE);
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
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Targets_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Targets_Delete_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        targetsDeleteMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.targets()
            .deleteWithResponse("apiTest-ddat4p", "databasemo3ej9ih", "monitoringh22eed",
                com.azure.core.util.Context.NONE);
    }
}
```

### Targets_Get

```java
import com.azure.resourcemanager.databasewatcher.models.DatastoreUpdate;
import com.azure.resourcemanager.databasewatcher.models.KustoOfferingType;
import com.azure.resourcemanager.databasewatcher.models.ManagedServiceIdentity;
import com.azure.resourcemanager.databasewatcher.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.databasewatcher.models.Watcher;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Watchers Update.
 */
public final class WatchersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Watchers_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Watchers_Update_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        watchersUpdateMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        Watcher resource = manager.watchers()
            .getByResourceGroupWithResponse("rgWatcher", "testWatcher", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf())
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
            .withDatastore(new DatastoreUpdate().withAdxClusterResourceId(
                "/subscriptions/49e0fbd3-75e8-44e7-96fd-5b64d9ad818d/resourceGroups/apiTest/providers/Microsoft.Kusto/clusters/apiTestKusto")
                .withKustoClusterDisplayName("kustoUri-adx")
                .withKustoClusterUri("https://kustouri-adx.eastus.kusto.windows.net")
                .withKustoDataIngestionUri("https://ingest-kustouri-adx.eastus.kusto.windows.net")
                .withKustoDatabaseName("kustoDatabaseName1")
                .withKustoManagementUrl("https://portal.azure.com/")
                .withKustoOfferingType(KustoOfferingType.ADX))
            .withDefaultAlertRuleIdentityResourceId(
                "/subscriptions/469DD77C-C8DB-47B7-B9E1-72D29F8C878B/resourceGroups/rgWatcher/providers/Microsoft.ManagedIdentity/userAssignedIdentities/newtest")
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

### Targets_ListByWatcher

```java
/**
 * Samples for AlertRuleResources Delete.
 */
public final class AlertRuleResourcesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * AlertRuleResources_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: AlertRuleResources_Delete_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        alertRuleResourcesDeleteMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.alertRuleResources()
            .deleteWithResponse("rgWatcher", "testWatcher", "testAlert", com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_CreateOrUpdate

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MinimumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        operationsListMinimumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        operationsListMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_Delete

```java
/**
 * Samples for Watchers GetByResourceGroup.
 */
public final class WatchersGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Watchers_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Watchers_Get_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void watchersGetMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().getByResourceGroupWithResponse("rgWatcher", "myWatcher", com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_GetByResourceGroup

```java
/**
 * Samples for HealthValidations ListByParent.
 */
public final class HealthValidationsListByParentSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * HealthValidations_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: HealthValidations_ListByParent_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void healthValidationsListByParentMaximumSet(
        com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.healthValidations().listByParent("rgWatcher", "testWatcher", com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_List

```java
/**
 * Samples for SharedPrivateLinkResources Create.
 */
public final class SharedPrivateLinkResourcesCreateSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * SharedPrivateLinkResources_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: SharedPrivateLinkResources_Create_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void sharedPrivateLinkResourcesCreateMaximumSet(
        com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.sharedPrivateLinkResources()
            .define("monitoringh22eed")
            .withExistingWatcher("apiTest-ddat4p", "databasemo3ej9ih")
            .withPrivateLinkResourceId(
                "/subscriptions/49e0fbd3-75e8-44e7-96fd-5b64d9ad818d/resourceGroups/apiTest-ddat4p/providers/Microsoft.KeyVault/vaults/kvmo3ej9ih")
            .withGroupId("vault")
            .withRequestMessage("request message")
            .withDnsZone("ec3ae9d410ba")
            .create();
    }
}
```

### Watchers_ListByResourceGroup

```java
/**
 * Samples for SharedPrivateLinkResources Delete.
 */
public final class SharedPrivateLinkResourcesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * SharedPrivateLinkResources_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: SharedPrivateLinkResources_Delete_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void sharedPrivateLinkResourcesDeleteMaximumSet(
        com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.sharedPrivateLinkResources()
            .delete("apiTest-ddat4p", "databasemo3ej9ih", "monitoringh22eed", com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_Start

```java
/**
 * Samples for SharedPrivateLinkResources ListByWatcher.
 */
public final class SharedPrivateLinkResourcesListByWatcherSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * SharedPrivateLinkResources_ListByWatcher_MaximumSet_Gen.json
     */
    /**
     * Sample code: SharedPrivateLinkResources_ListByWatcher_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void sharedPrivateLinkResourcesListByWatcherMaximumSet(
        com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.sharedPrivateLinkResources()
            .listByWatcher("apiTest-ddat4p", "databasemo3ej9ih", com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_Stop

```java
/**
 * Samples for SharedPrivateLinkResources Get.
 */
public final class SharedPrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * SharedPrivateLinkResources_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: SharedPrivateLinkResources_Get_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void sharedPrivateLinkResourcesGetMaximumSet(
        com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.sharedPrivateLinkResources()
            .getWithResponse("apiTest-ddat4p", "databasemo3ej9ih", "monitoringh22eed",
                com.azure.core.util.Context.NONE);
    }
}
```

### Watchers_Update

```java
/**
 * Samples for Watchers List.
 */
public final class WatchersListSamples {
    /*
     * x-ms-original-file:
     * specification/databasewatcher/resource-manager/Microsoft.DatabaseWatcher/stable/2025-01-02/examples/
     * Watchers_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: Watchers_ListBySubscription_MaximumSet.
     * 
     * @param manager Entry point to DatabasewatcherManager.
     */
    public static void
        watchersListBySubscriptionMaximumSet(com.azure.resourcemanager.databasewatcher.DatabasewatcherManager manager) {
        manager.watchers().list(com.azure.core.util.Context.NONE);
    }
}
```

