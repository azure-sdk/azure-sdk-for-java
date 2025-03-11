# Code snippets and samples


## ErrorSummaries

- [Get](#errorsummaries_get)
- [ListBySite](#errorsummaries_listbysite)

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

