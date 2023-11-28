# Code snippets and samples


## MetricDefinitions

- [List](#metricdefinitions_list)
- [ListAtSubscriptionScope](#metricdefinitions_listatsubscriptionscope)

## Metrics

- [List](#metrics_list)
- [ListAtSubscriptionScope](#metrics_listatsubscriptionscope)
- [ListAtSubscriptionScopePost](#metrics_listatsubscriptionscopepost)

## Operations

- [List](#operations_list)
### MetricDefinitions_List

```java
/**
 * Samples for MetricDefinitions List.
 */
public final class MetricDefinitionsListSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/GetMetricDefinitions.json
     */
    /**
     * Sample code: Get Metric Definitions without filter.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void getMetricDefinitionsWithoutFilter(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metricDefinitions().list("subscriptions/07c0b09d-9f69-4e6e-8d05-f59f67299cb2/resourceGroups/Rac46PostSwapRG/providers/Microsoft.Web/sites/alertruleTest/providers/microsoft.insights/metricDefinitions", "Microsoft.Web/sites", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/GetMetricDefinitionsApplicationInsights.json
     */
    /**
     * Sample code: Get Application Insights Metric Definitions without filter.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void getApplicationInsightsMetricDefinitionsWithoutFilter(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metricDefinitions().list("subscriptions/182c901a-129a-4f5d-86e4-cc6b294590a2/resourceGroups/hyr-log/providers/microsoft.insights/components/f1-bill/providers/microsoft.insights/metricdefinitions", "microsoft.insights/components", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/GetMetricDefinitionsMetricClass.json
     */
    /**
     * Sample code: Get StorageCache Metric Definitions with metric class.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void getStorageCacheMetricDefinitionsWithMetricClass(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metricDefinitions().list("subscriptions/46841c0e-69c8-4b17-af46-6626ecb15fc2/resourceGroups/adgarntptestrg/providers/Microsoft.StorageCache/caches/adgarntptestcache", "microsoft.storagecache/caches", com.azure.core.util.Context.NONE);
    }
}
```

### MetricDefinitions_ListAtSubscriptionScope

```java
/**
 * Samples for MetricDefinitions ListAtSubscriptionScope.
 */
public final class MetricDefinitionsListAtSubscriptionScopeSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/GetMultiResourceMetricDefinitions.json
     */
    /**
     * Sample code: Get Subscription level Metric Definitions without filter.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void getSubscriptionLevelMetricDefinitionsWithoutFilter(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metricDefinitions().listAtSubscriptionScope("westus2", "microsoft.compute/virtualmachines", com.azure.core.util.Context.NONE);
    }
}
```

### Metrics_List

```java
import com.azure.resourcemanager.monitor.generated.models.ResultType;
import java.time.Duration;
import java.util.stream.Collectors;

/**
 * Samples for Metrics List.
 */
public final class MetricsListSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/GetMetric.json
     */
    /**
     * Sample code: Get Metric for data.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void getMetricForData(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metrics().listWithResponse("subscriptions/1f3fa6d2-851c-4a91-9087-1a050f3a9c38/resourceGroups/todking/providers/Microsoft.Storage/storageAccounts/tkfileserv/blobServices/default", "2021-04-20T09:00:00.000Z/2021-04-20T14:00:00.000Z", Duration.parse("PT6H"), "BlobCount,BlobCapacity", "average,minimum,maximum", 5, "average asc", "Tier eq '*'", null, "Microsoft.Storage/storageAccounts/blobServices", true, false, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/GetMetricMetadata.json
     */
    /**
     * Sample code: Get Metric for metadata.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void getMetricForMetadata(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metrics().listWithResponse("subscriptions/1f3fa6d2-851c-4a91-9087-1a050f3a9c38/resourceGroups/todking/providers/Microsoft.Storage/storageAccounts/tkfileserv/blobServices/default", "2017-04-14T02:20:00Z/2017-04-14T04:20:00Z", null, null, null, null, null, "Tier eq '*'", ResultType.fromString("metadata"), "Microsoft.Storage/storageAccounts/blobServices", null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/GetMetricError.json
     */
    /**
     * Sample code: Get Metric with error.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void getMetricWithError(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metrics().listWithResponse("subscriptions/ac41e21f-afd6-4a79-8070-f01eba278f97/resourceGroups/todking/providers/Microsoft.DocumentDb/databaseAccounts/tk-cosmos-mongo", "2021-06-07T21:51:00Z/2021-06-08T01:51:00Z", Duration.parse("FULL"), "MongoRequestsCount,MongoRequests", "average", null, null, null, null, "microsoft.documentdb/databaseaccounts", true, false, com.azure.core.util.Context.NONE);
    }
}
```

### Metrics_ListAtSubscriptionScope

```java
import com.azure.resourcemanager.monitor.generated.models.MetricResultType;
import java.time.Duration;
import java.util.stream.Collectors;

/**
 * Samples for Metrics ListAtSubscriptionScope.
 */
public final class MetricsListAtSubscriptionScopeSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/GetMultiResourceMetric.json
     */
    /**
     * Sample code: Get subscription level metric data.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void getSubscriptionLevelMetricData(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metrics().listAtSubscriptionScopeWithResponse("westus2", "2021-06-08T19:00:00Z/2021-06-12T01:00:00Z", Duration.parse("PT6H"), "Data Disk Max Burst IOPS", "count", 10, "count desc", "LUN eq '0' and Microsoft.ResourceId eq '*'", null, "microsoft.compute/virtualmachines", true, false, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/GetMultiResourceMetricMetadata.json
     */
    /**
     * Sample code: Get subscription level metric metadata.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void getSubscriptionLevelMetricMetadata(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metrics().listAtSubscriptionScopeWithResponse("westus2", "2021-06-10T02:23:16.129Z/2021-06-12T02:23:16.129Z", null, "Data Disk Max Burst IOPS", null, null, null, "LUN eq '0'", MetricResultType.fromString("metadata"), "microsoft.compute/virtualmachines", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Metrics_ListAtSubscriptionScopePost

```java
import com.azure.resourcemanager.monitor.generated.models.MetricResultType;
import com.azure.resourcemanager.monitor.generated.models.SubscriptionScopeMetricsRequestBodyParameters;
import java.time.Duration;
import java.util.stream.Collectors;

/**
 * Samples for Metrics ListAtSubscriptionScopePost.
 */
public final class MetricsListAtSubscriptionScopePostSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/GetMultiResourceMetric.json
     */
    /**
     * Sample code: Post request for subscription level metric data.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void postRequestForSubscriptionLevelMetricData(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metrics().listAtSubscriptionScopePostWithResponse("westus2", "2021-06-08T19:00:00Z/2021-06-12T01:00:00Z", Duration.parse("PT6H"), "Data Disk Max Burst IOPS", "count", 10, "count desc", "LUN eq '0' and Microsoft.ResourceId eq '*'", null, "microsoft.compute/virtualmachines", true, false, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/GetMultiResourceMetricMetadata.json
     */
    /**
     * Sample code: Post request for subscription level metric metadata.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void postRequestForSubscriptionLevelMetricMetadata(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metrics().listAtSubscriptionScopePostWithResponse("westus2", "2021-06-10T02:23:16.129Z/2021-06-12T02:23:16.129Z", null, "Data Disk Max Burst IOPS", null, null, null, "LUN eq '0'", MetricResultType.fromString("metadata"), "microsoft.compute/virtualmachines", null, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/PostMultiResourceMetricBody.json
     */
    /**
     * Sample code: Post request for subscription level metric data using body params.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void postRequestForSubscriptionLevelMetricDataUsingBodyParams(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.metrics().listAtSubscriptionScopePostWithResponse("westus2", null, null, null, null, null, null, null, null, null, null, null, new SubscriptionScopeMetricsRequestBodyParameters().withTimespan("2021-06-08T19:00:00Z/2021-06-12T01:00:00Z").withInterval(Duration.parse("PT6H")).withMetricNames("Data Disk Max Burst IOPS").withAggregation("count").withFilter("LUN eq '0' and Microsoft.ResourceId eq '*'").withTop(10).withOrderBy("count desc").withRollUpBy("LUN").withMetricNamespace("microsoft.compute/virtualmachines").withAutoAdjustTimegrain(true).withValidateDimensions(false), com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2023-11-01/examples/OperationList.json
     */
    /**
     * Sample code: Get a list of operations for a resource provider.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void getAListOfOperationsForAResourceProvider(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.operations().listWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

