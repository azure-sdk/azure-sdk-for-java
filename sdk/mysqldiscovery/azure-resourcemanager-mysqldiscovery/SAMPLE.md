# Code snippets and samples


## ErrorSummaries

- [Get](#errorsummaries_get)
- [ListBySite](#errorsummaries_listbysite)

## MySqlServers

- [CreateOrUpdate](#mysqlservers_createorupdate)
- [Delete](#mysqlservers_delete)
- [Get](#mysqlservers_get)
- [ListBySite](#mysqlservers_listbysite)
- [Update](#mysqlservers_update)

## MySqlSites

- [CreateOrUpdate](#mysqlsites_createorupdate)
- [Delete](#mysqlsites_delete)
- [GetByResourceGroup](#mysqlsites_getbyresourcegroup)
- [List](#mysqlsites_list)
- [ListByResourceGroup](#mysqlsites_listbyresourcegroup)
- [TriggerRefresh](#mysqlsites_triggerrefresh)
- [Update](#mysqlsites_update)

## Operations

- [List](#operations_list)

## Summaries

- [Get](#summaries_get)
- [ListBySite](#summaries_listbysite)
### ErrorSummaries_Get

```java
/**
 * Samples for ErrorSummaries Get.
 */
public final class ErrorSummariesGetSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * ErrorSummaries_Get.json
     */
    /**
     * Sample code: ErrorSummaries_Get.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void errorSummariesGet(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.errorSummaries()
            .getWithResponse("testrg", "testSite", "testErrorSummaryName", com.azure.core.util.Context.NONE);
    }
}
```

### ErrorSummaries_ListBySite

```java
/**
 * Samples for ErrorSummaries ListBySite.
 */
public final class ErrorSummariesListBySiteSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * ErrorSummaries_ListBySite.json
     */
    /**
     * Sample code: ErrorSummaries_ListBySite.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void
        errorSummariesListBySite(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.errorSummaries().listBySite("testrg", "testSite", com.azure.core.util.Context.NONE);
    }
}
```

### MySqlServers_CreateOrUpdate

```java
import com.azure.resourcemanager.mysqldiscovery.models.SupportStatus;
import java.util.Arrays;

/**
 * Samples for MySqlServers CreateOrUpdate.
 */
public final class MySqlServersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLServers_Create.json
     */
    /**
     * Sample code: MySQLServers_Create.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mySQLServersCreate(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mySqlServers()
            .define("testServerName")
            .withExistingMySQLSite("testrg", "testSite")
            .withHostname("test.mysql.server")
            .withPortNumber("3306")
            .withHostIp(Arrays.asList("127.0.0.1", "127.0.0.2"))
            .withMachineId(
                "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourcegroups/demoRG/providers/Microsoft.OffAzure/serverSites/xxx/machines/xxx")
            .withMysqlVersion("8.0")
            .withNumberOfDatabase(16L)
            .withSupportStatus(SupportStatus.MAINSTREAM)
            .create();
    }
}
```

### MySqlServers_Delete

```java
/**
 * Samples for MySqlServers Delete.
 */
public final class MySqlServersDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLServers_Delete.json
     */
    /**
     * Sample code: MySQLServers_Delete.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mySQLServersDelete(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mySqlServers()
            .deleteWithResponse("testrg", "testSite", "testServerName", com.azure.core.util.Context.NONE);
    }
}
```

### MySqlServers_Get

```java
/**
 * Samples for MySqlServers Get.
 */
public final class MySqlServersGetSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLServers_Get.json
     */
    /**
     * Sample code: MySQLServers_Get.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mySQLServersGet(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mySqlServers()
            .getWithResponse("testrg", "testSite", "testServerName", com.azure.core.util.Context.NONE);
    }
}
```

### MySqlServers_ListBySite

```java
/**
 * Samples for MySqlServers ListBySite.
 */
public final class MySqlServersListBySiteSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLServers_ListBySite.json
     */
    /**
     * Sample code: MySQLServers_ListBySite.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mySQLServersListBySite(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mySqlServers().listBySite("testrg", "testSite", com.azure.core.util.Context.NONE);
    }
}
```

### MySqlServers_Update

```java
import com.azure.resourcemanager.mysqldiscovery.models.MySqlServer;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for MySqlServers Update.
 */
public final class MySqlServersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLServers_Update.json
     */
    /**
     * Sample code: MySQLServers_Update.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mySQLServersUpdate(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        MySqlServer resource = manager.mySqlServers()
            .getWithResponse("testrg", "testSite", "testDatabaseName", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### MySqlSites_CreateOrUpdate

```java
import com.azure.resourcemanager.mysqldiscovery.models.ExtendedLocation;

/**
 * Samples for MySqlSites CreateOrUpdate.
 */
public final class MySqlSitesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_Create.json
     */
    /**
     * Sample code: MySQLSites_Create.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mySQLSitesCreate(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mySqlSites()
            .define("testSite")
            .withRegion("East US")
            .withExistingResourceGroup("testrg")
            .withExtendedLocation(new ExtendedLocation().withType("customLocation")
                .withName(
                    "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.ExtendedLocation/customLocations/contoso"))
            .withMasterSiteId(
                "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.OffAzure/MasterSites/xxx")
            .withMigrateProjectId(
                "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourcegroups/demoRG/providers/microsoft.migrate/migrateprojects/xxx")
            .create();
    }
}
```

### MySqlSites_Delete

```java
/**
 * Samples for MySqlSites Delete.
 */
public final class MySqlSitesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_Delete.json
     */
    /**
     * Sample code: MySQLSites_Delete.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mySQLSitesDelete(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mySqlSites().deleteByResourceGroupWithResponse("testrg", "testSite", com.azure.core.util.Context.NONE);
    }
}
```

### MySqlSites_GetByResourceGroup

```java
/**
 * Samples for MySqlSites GetByResourceGroup.
 */
public final class MySqlSitesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_Get.json
     */
    /**
     * Sample code: MySQLSites_Get.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mySQLSitesGet(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mySqlSites().getByResourceGroupWithResponse("testrg", "testSite", com.azure.core.util.Context.NONE);
    }
}
```

### MySqlSites_List

```java
/**
 * Samples for MySqlSites List.
 */
public final class MySqlSitesListSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_ListBySubscription.json
     */
    /**
     * Sample code: MySQLSites_ListBySubscription.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void
        mySQLSitesListBySubscription(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mySqlSites().list(com.azure.core.util.Context.NONE);
    }
}
```

### MySqlSites_ListByResourceGroup

```java
/**
 * Samples for MySqlSites ListByResourceGroup.
 */
public final class MySqlSitesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_ListByResourceGroup.json
     */
    /**
     * Sample code: MySQLSites_ListByResourceGroup.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void
        mySQLSitesListByResourceGroup(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mySqlSites().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
```

### MySqlSites_TriggerRefresh

```java
/**
 * Samples for MySqlSites TriggerRefresh.
 */
public final class MySqlSitesTriggerRefreshSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_TriggerRefresh.json
     */
    /**
     * Sample code: MySQLSites_TriggerRefresh.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void
        mySQLSitesTriggerRefresh(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mySqlSites().triggerRefresh("testrg", "testSite", com.azure.core.util.Context.NONE);
    }
}
```

### MySqlSites_Update

```java
import com.azure.resourcemanager.mysqldiscovery.models.MySqlSite;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for MySqlSites Update.
 */
public final class MySqlSitesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_Update.json
     */
    /**
     * Sample code: MySQLSites_Update.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mySQLSitesUpdate(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        MySqlSite resource = manager.mySqlSites()
            .getByResourceGroupWithResponse("testrg", "testSite", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void operationsList(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Summaries_Get

```java
/**
 * Samples for Summaries Get.
 */
public final class SummariesGetSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * Summaries_Get.json
     */
    /**
     * Sample code: Summaries_Get.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void summariesGet(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.summaries().getWithResponse("testrg", "testSite", "testSummaryName", com.azure.core.util.Context.NONE);
    }
}
```

### Summaries_ListBySite

```java
/**
 * Samples for Summaries ListBySite.
 */
public final class SummariesListBySiteSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * Summaries_ListBySite.json
     */
    /**
     * Sample code: Summaries_ListBySite.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void summariesListBySite(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.summaries().listBySite("testrg", "testSite", com.azure.core.util.Context.NONE);
    }
}
```

