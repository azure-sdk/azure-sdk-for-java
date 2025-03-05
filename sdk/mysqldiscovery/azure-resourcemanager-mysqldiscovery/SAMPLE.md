# Code snippets and samples


## ErrorSummaries

- [Get](#errorsummaries_get)
- [ListBySite](#errorsummaries_listbysite)

## MysqlServers

- [CreateOrUpdate](#mysqlservers_createorupdate)
- [Delete](#mysqlservers_delete)
- [Get](#mysqlservers_get)
- [ListBySite](#mysqlservers_listbysite)
- [Update](#mysqlservers_update)

## MysqlSites

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

### MysqlServers_CreateOrUpdate

```java
import com.azure.resourcemanager.mysqldiscovery.models.MysqlServerProperties;
import com.azure.resourcemanager.mysqldiscovery.models.SupportStatus;
import java.util.Arrays;

/**
 * Samples for MysqlServers CreateOrUpdate.
 */
public final class MysqlServersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLServers_Create.json
     */
    /**
     * Sample code: MysqlServers_Create.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mysqlServersCreate(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mysqlServers()
            .define("testServerName")
            .withExistingMySQLSite("testrg", "testSite")
            .withProperties(new MysqlServerProperties().withHostname("test.mysql.server")
                .withHostIp(Arrays.asList("127.0.0.1", "127.0.0.2"))
                .withMachineId(
                    "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourcegroups/demoRG/providers/Microsoft.OffAzure/serverSites/xxx/machines/xxx")
                .withPortNumber("3306")
                .withMysqlVersion("8.0")
                .withNumberOfDatabase(16L)
                .withSupportStatus(SupportStatus.MAINSTREAM))
            .create();
    }
}
```

### MysqlServers_Delete

```java
/**
 * Samples for MysqlServers Delete.
 */
public final class MysqlServersDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLServers_Delete.json
     */
    /**
     * Sample code: MysqlServers_Delete.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mysqlServersDelete(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mysqlServers()
            .deleteWithResponse("testrg", "testSite", "testServerName", com.azure.core.util.Context.NONE);
    }
}
```

### MysqlServers_Get

```java
/**
 * Samples for MysqlServers Get.
 */
public final class MysqlServersGetSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLServers_Get.json
     */
    /**
     * Sample code: MysqlServers_Get.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mysqlServersGet(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mysqlServers()
            .getWithResponse("testrg", "testSite", "testServerName", com.azure.core.util.Context.NONE);
    }
}
```

### MysqlServers_ListBySite

```java
/**
 * Samples for MysqlServers ListBySite.
 */
public final class MysqlServersListBySiteSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLServers_ListBySite.json
     */
    /**
     * Sample code: MysqlServers_ListBySite.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mysqlServersListBySite(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mysqlServers().listBySite("testrg", "testSite", com.azure.core.util.Context.NONE);
    }
}
```

### MysqlServers_Update

```java
import com.azure.resourcemanager.mysqldiscovery.models.Edition;
import com.azure.resourcemanager.mysqldiscovery.models.MysqlServer;
import com.azure.resourcemanager.mysqldiscovery.models.MysqlServerProperties;
import com.azure.resourcemanager.mysqldiscovery.models.SupportStatus;
import java.time.LocalDate;

/**
 * Samples for MysqlServers Update.
 */
public final class MysqlServersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLServers_Update.json
     */
    /**
     * Sample code: MysqlServers_Update.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mysqlServersUpdate(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        MysqlServer resource = manager.mysqlServers()
            .getWithResponse("testrg", "testSite", "testDatabaseName", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new MysqlServerProperties().withHostname("test.mysql.server")
                .withMachineId(
                    "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourcegroups/demoRG/providers/Microsoft.OffAzure/serverSites/xxx/machines/xxx")
                .withPortNumber("3306")
                .withNumberOfDatabase(16L)
                .withSupportStatus(SupportStatus.MAINSTREAM)
                .withEdition(Edition.COMMUNITY)
                .withSupportEndIn(LocalDate.parse("2021-04-01")))
            .apply();
    }
}
```

### MysqlSites_CreateOrUpdate

```java
import com.azure.resourcemanager.mysqldiscovery.models.ExtendedLocation;
import com.azure.resourcemanager.mysqldiscovery.models.MysqlSiteProperties;

/**
 * Samples for MysqlSites CreateOrUpdate.
 */
public final class MysqlSitesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_Create.json
     */
    /**
     * Sample code: MysqlSites_Create.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mysqlSitesCreate(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mysqlSites()
            .define("testSite")
            .withRegion("East US")
            .withExistingResourceGroup("testrg")
            .withProperties(new MysqlSiteProperties().withMasterSiteId(
                "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.OffAzure/MasterSites/xxx")
                .withMigrateProjectId(
                    "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourcegroups/demoRG/providers/microsoft.migrate/migrateprojects/xxx"))
            .withExtendedLocation(new ExtendedLocation().withType("customLocation")
                .withName(
                    "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.ExtendedLocation/customLocations/contoso"))
            .create();
    }
}
```

### MysqlSites_Delete

```java
/**
 * Samples for MysqlSites Delete.
 */
public final class MysqlSitesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_Delete.json
     */
    /**
     * Sample code: MysqlSites_Delete.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mysqlSitesDelete(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mysqlSites().deleteByResourceGroupWithResponse("testrg", "testSite", com.azure.core.util.Context.NONE);
    }
}
```

### MysqlSites_GetByResourceGroup

```java
/**
 * Samples for MysqlSites GetByResourceGroup.
 */
public final class MysqlSitesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_Get.json
     */
    /**
     * Sample code: MysqlSites_Get.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mysqlSitesGet(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mysqlSites().getByResourceGroupWithResponse("testrg", "testSite", com.azure.core.util.Context.NONE);
    }
}
```

### MysqlSites_List

```java
/**
 * Samples for MysqlSites List.
 */
public final class MysqlSitesListSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_ListBySubscription.json
     */
    /**
     * Sample code: MysqlSites_ListBySubscription.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void
        mysqlSitesListBySubscription(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mysqlSites().list(com.azure.core.util.Context.NONE);
    }
}
```

### MysqlSites_ListByResourceGroup

```java
/**
 * Samples for MysqlSites ListByResourceGroup.
 */
public final class MysqlSitesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_ListByResourceGroup.json
     */
    /**
     * Sample code: MysqlSites_ListByResourceGroup.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void
        mysqlSitesListByResourceGroup(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mysqlSites().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
```

### MysqlSites_TriggerRefresh

```java
/**
 * Samples for MysqlSites TriggerRefresh.
 */
public final class MysqlSitesTriggerRefreshSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_TriggerRefresh.json
     */
    /**
     * Sample code: MysqlSites_TriggerRefresh.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void
        mysqlSitesTriggerRefresh(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        manager.mysqlSites().triggerRefresh("testrg", "testSite", com.azure.core.util.Context.NONE);
    }
}
```

### MysqlSites_Update

```java
import com.azure.resourcemanager.mysqldiscovery.models.MysqlSite;
import com.azure.resourcemanager.mysqldiscovery.models.MysqlSiteProperties;

/**
 * Samples for MysqlSites Update.
 */
public final class MysqlSitesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mysqldiscovery/resource-manager/Microsoft.MySQLDiscovery/preview/2024-09-30-preview/examples/
     * MySQLSites_Update.json
     */
    /**
     * Sample code: MysqlSites_Update.
     * 
     * @param manager Entry point to MysqldiscoveryManager.
     */
    public static void mysqlSitesUpdate(com.azure.resourcemanager.mysqldiscovery.MysqldiscoveryManager manager) {
        MysqlSite resource = manager.mysqlSites()
            .getByResourceGroupWithResponse("testrg", "testSite", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new MysqlSiteProperties().withMasterSiteId(
                "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.OffAzure/MasterSites/xxx")
                .withMigrateProjectId(
                    "/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourcegroups/demoRG/providers/microsoft.migrate/migrateprojects/xxx"))
            .apply();
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

