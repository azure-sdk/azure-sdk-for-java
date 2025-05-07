# Code snippets and samples


## Connectors

- [CreateOrUpdate](#connectors_createorupdate)
- [Delete](#connectors_delete)
- [Get](#connectors_get)
- [List](#connectors_list)
- [Update](#connectors_update)

## ImpactCategories

- [Get](#impactcategories_get)
- [List](#impactcategories_list)

## Insights

- [Create](#insights_create)
- [Delete](#insights_delete)
- [Get](#insights_get)
- [ListBySubscription](#insights_listbysubscription)

## Operations

- [List](#operations_list)

## WorkloadImpacts

- [Create](#workloadimpacts_create)
- [Delete](#workloadimpacts_delete)
- [Get](#workloadimpacts_get)
- [List](#workloadimpacts_list)
### Connectors_CreateOrUpdate

```java
import com.azure.resourcemanager.impact.models.ClientIncidentDetails;
import com.azure.resourcemanager.impact.models.Connectivity;
import com.azure.resourcemanager.impact.models.IncidentSource;
import com.azure.resourcemanager.impact.models.MetricUnit;
import com.azure.resourcemanager.impact.models.Performance;
import com.azure.resourcemanager.impact.models.Protocol;
import com.azure.resourcemanager.impact.models.SourceOrTarget;
import com.azure.resourcemanager.impact.models.Toolset;
import com.azure.resourcemanager.impact.models.Workload;
import com.azure.resourcemanager.impact.models.WorkloadImpactProperties;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for WorkloadImpacts Create.
 */
public final class WorkloadImpactsCreateSamples {
    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * WorkloadAvailability_Create.json
     */
    /**
     * Sample code: Reporting availability related impact.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void reportingAvailabilityRelatedImpact(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.workloadImpacts()
            .define("impact-002")
            .withProperties(new WorkloadImpactProperties()
                .withStartDateTime(OffsetDateTime.parse("2022-06-15T05:59:46.6517821Z"))
                .withImpactedResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-rg/providers/Microsoft.Sql/sqlserver/dbservercontext")
                .withImpactCategory("Availability")
                .withImpactDescription("read calls failed")
                .withWorkload(new Workload().withContext("webapp/scenario1").withToolset(Toolset.OTHER))
                .withClientIncidentDetails(new ClientIncidentDetails().withClientIncidentId("AA123")
                    .withClientIncidentSource(IncidentSource.JIRA)))
            .create();
    }

    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * WorkloadConnectivityImpact_Create.json
     */
    /**
     * Sample code: Reporting a connectivity impact.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void reportingAConnectivityImpact(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.workloadImpacts()
            .define("impact-001")
            .withProperties(new WorkloadImpactProperties()
                .withStartDateTime(OffsetDateTime.parse("2022-06-15T05:59:46.6517821Z"))
                .withImpactedResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-rg/providers/Microsoft.Sql/sqlserver/dbservercontext")
                .withImpactCategory("Resource.Connectivity")
                .withImpactDescription("conection failure")
                .withConnectivity(new Connectivity().withProtocol(Protocol.TCP)
                    .withPort(1443)
                    .withSource(new SourceOrTarget().withAzureResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceSub/providers/Microsoft.compute/virtualmachines/vm1"))
                    .withTarget(new SourceOrTarget().withAzureResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resourceSub/providers/Microsoft.compute/virtualmachines/vm2")))
                .withWorkload(new Workload().withContext("webapp/scenario1").withToolset(Toolset.OTHER))
                .withClientIncidentDetails(new ClientIncidentDetails().withClientIncidentId("AA123")
                    .withClientIncidentSource(IncidentSource.JIRA)))
            .create();
    }

    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * WorkloadArmOperation_create.json
     */
    /**
     * Sample code: Reporting Arm operation failure.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void reportingArmOperationFailure(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.workloadImpacts()
            .define("impact-002")
            .withProperties(new WorkloadImpactProperties()
                .withStartDateTime(OffsetDateTime.parse("2022-06-15T05:59:46.6517821Z"))
                .withImpactedResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-rg/providers/Microsoft.Sql/sqlserver/dbservercontext")
                .withImpactCategory("ArmOperation")
                .withImpactDescription("deletion of resource failed")
                .withArmCorrelationIds(Arrays.asList("00000000-0000-0000-0000-000000000000"))
                .withWorkload(new Workload().withContext("webapp/scenario1").withToolset(Toolset.OTHER))
                .withClientIncidentDetails(new ClientIncidentDetails().withClientIncidentId("AA123")
                    .withClientIncidentSource(IncidentSource.JIRA)))
            .create();
    }

    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * WorkloadPerformance_Create.json
     */
    /**
     * Sample code: Reporting performance related impact.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void reportingPerformanceRelatedImpact(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.workloadImpacts()
            .define("impact-002")
            .withProperties(new WorkloadImpactProperties()
                .withStartDateTime(OffsetDateTime.parse("2022-06-15T05:59:46.6517821Z"))
                .withImpactedResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-rg/providers/Microsoft.Sql/sqlserver/dbservercontext")
                .withImpactCategory("Resource.Performance")
                .withImpactDescription("high cpu utilization")
                .withPerformance(Arrays.asList(new Performance().withMetricName("CPU")
                    .withExpected(60.0D)
                    .withActual(90.0D)
                    .withUnit(MetricUnit.fromString("garbage"))))
                .withWorkload(new Workload().withContext("webapp/scenario1").withToolset(Toolset.OTHER))
                .withClientIncidentDetails(new ClientIncidentDetails().withClientIncidentId("AA123")
                    .withClientIncidentSource(IncidentSource.JIRA)))
            .create();
    }
}
```

### Connectors_Delete

```java
/**
 * Samples for WorkloadImpacts Get.
 */
public final class WorkloadImpactsGetSamples {
    /*
     * x-ms-original-file:
     * specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/WorkloadImpact_Get.
     * json
     */
    /**
     * Sample code: Get WorkloadImpact Resource by name example.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void getWorkloadImpactResourceByNameExample(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.workloadImpacts().getWithResponse("impact-001", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_Get

```java
/**
 * Samples for Insights ListBySubscription.
 */
public final class InsightsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * Insights_ListBySubscription.json
     */
    /**
     * Sample code: List Insight resources by workloadImpactName.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void
        listInsightResourcesByWorkloadImpactName(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.insights().listBySubscription("impactid22", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_List

```java
/**
 * Samples for Insights Delete.
 */
public final class InsightsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/Insights_Delete.json
     */
    /**
     * Sample code: Delete an Insight.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void deleteAnInsight(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.insights()
            .deleteByResourceGroupWithResponse("impactid22", "insightId12", com.azure.core.util.Context.NONE);
    }
}
```

### Connectors_Update

```java
import com.azure.resourcemanager.impact.models.ConnectorProperties;
import com.azure.resourcemanager.impact.models.Platform;

/**
 * Samples for Connectors CreateOrUpdate.
 */
public final class ConnectorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * Connectors_CreateOrUpdate.json
     */
    /**
     * Sample code: Connectors_CreateOrUpdate.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void connectorsCreateOrUpdate(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.connectors()
            .define("testconnector1")
            .withProperties(new ConnectorProperties().withConnectorType(Platform.AZURE_MONITOR))
            .create();
    }
}
```

### ImpactCategories_Get

```java
/**
 * Samples for Connectors Get.
 */
public final class ConnectorsGetSamples {
    /*
     * x-ms-original-file:
     * specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/Connectors_Get.json
     */
    /**
     * Sample code: Connectors_Get.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void connectorsGet(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.connectors().getWithResponse("testconnector1", com.azure.core.util.Context.NONE);
    }
}
```

### ImpactCategories_List

```java
import com.azure.resourcemanager.impact.models.Connector;
import com.azure.resourcemanager.impact.models.ConnectorUpdateProperties;
import com.azure.resourcemanager.impact.models.Platform;

/**
 * Samples for Connectors Update.
 */
public final class ConnectorsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/Connectors_Update.json
     */
    /**
     * Sample code: Connectors_Update.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void connectorsUpdate(com.azure.resourcemanager.impact.ImpactManager manager) {
        Connector resource
            = manager.connectors().getWithResponse("testconnector1", com.azure.core.util.Context.NONE).getValue();
        resource.update()
            .withProperties(new ConnectorUpdateProperties().withConnectorType(Platform.AZURE_MONITOR))
            .apply();
    }
}
```

### Insights_Create

```java
/**
 * Samples for WorkloadImpacts List.
 */
public final class WorkloadImpactsListSamples {
    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * WorkloadImpacts_ListBySubscription.json
     */
    /**
     * Sample code: List WorkloadImpact resources by subscription.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void
        listWorkloadImpactResourcesBySubscription(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.workloadImpacts().list(com.azure.core.util.Context.NONE);
    }
}
```

### Insights_Delete

```java
/**
 * Samples for Connectors Delete.
 */
public final class ConnectorsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/Connectors_Delete.json
     */
    /**
     * Sample code: Connectors_Delete.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void connectorsDelete(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.connectors().deleteWithResponse("testconnector1", com.azure.core.util.Context.NONE);
    }
}
```

### Insights_Get

```java
/**
 * Samples for ImpactCategories List.
 */
public final class ImpactCategoriesListSamples {
    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * ImpactCategories_ListBySubscription.json
     */
    /**
     * Sample code: Get ImpactCategories list by subscription.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void getImpactCategoriesListBySubscription(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.impactCategories().list("microsoft.compute/virtualmachines", null, com.azure.core.util.Context.NONE);
    }
}
```

### Insights_ListBySubscription

```java
/**
 * Samples for Connectors List.
 */
public final class ConnectorsListSamples {
    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * Connectors_ListBySubscription.json
     */
    /**
     * Sample code: Connectors_ListBySubscription.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void connectorsListBySubscription(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.connectors().list(com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for ImpactCategories Get.
 */
public final class ImpactCategoriesGetSamples {
    /*
     * x-ms-original-file:
     * specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/ImpactCategories_Get.
     * json
     */
    /**
     * Sample code: Get WorkloadImpact Resource by name.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void getWorkloadImpactResourceByName(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.impactCategories().getWithResponse("ARMOperation.Create", com.azure.core.util.Context.NONE);
    }
}
```

### WorkloadImpacts_Create

```java
/**
 * Samples for Insights Get.
 */
public final class InsightsGetSamples {
    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * Insights_Get_mitigationAction.json
     */
    /**
     * Sample code: Get Insight sample for MitigationAction category.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void
        getInsightSampleForMitigationActionCategory(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.insights().getWithResponse("impactId", "HPCUASucceeded", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * Insights_Get_diagnostics.json
     */
    /**
     * Sample code: Get Insight sample for Diagnostics category.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void getInsightSampleForDiagnosticsCategory(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.insights().getWithResponse("impactid", "insight1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/
     * Insights_Get_servicehealth.json
     */
    /**
     * Sample code: Get Insight sample for service health category.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void
        getInsightSampleForServiceHealthCategory(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.insights().getWithResponse("impactid", "insightname", com.azure.core.util.Context.NONE);
    }
}
```

### WorkloadImpacts_Delete

```java
import com.azure.resourcemanager.impact.models.Content;
import com.azure.resourcemanager.impact.models.ImpactDetails;
import com.azure.resourcemanager.impact.models.InsightProperties;
import java.time.OffsetDateTime;

/**
 * Samples for Insights Create.
 */
public final class InsightsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/Insights_Create.json
     */
    /**
     * Sample code: Creating an insight.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void creatingAnInsight(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.insights()
            .define("insightId12")
            .withExistingWorkloadImpact("impactid22")
            .withProperties(new InsightProperties().withCategory("repair")
                .withStatus("resolved")
                .withContent(new Content().withTitle("Impact Has been correlated to an outage")
                    .withDescription(
                        "At 2018-11-08T00:00:00Z UTC, your services dependent on these resources <link href=”…”>VM1</link> may have experienced an issue. <br/><div>We have identified an outage that affected these resources(s). You can look at outage information on <link href=\"https:// portal.azure.com/#view/Microsoft_Azure_Health/AzureHealthBrowseBlade/~/serviceIssues/trackingId/NL2W-VCZ\">NL2W-VCZ</link> link.<div>"))
                .withEventTime(OffsetDateTime.parse("2023-06-15T04:00:00.009223Z"))
                .withInsightUniqueId("00000000-0000-0000-0000-000000000000")
                .withImpact(new ImpactDetails().withImpactedResourceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resource-rg/providers/Microsoft.Sql/sqlserver/dbservername")
                    .withStartTime(OffsetDateTime.parse("2023-06-15T01:00:00.009223Z"))
                    .withImpactId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/providers/microsoft.Impact/workloadImpacts/impactid22")))
            .create();
    }
}
```

### WorkloadImpacts_Get

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/Operations_List.json
     */
    /**
     * Sample code: OperationsList.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void operationsList(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### WorkloadImpacts_List

```java
/**
 * Samples for WorkloadImpacts Delete.
 */
public final class WorkloadImpactsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/impact/resource-manager/Microsoft.Impact/preview/2024-05-01-preview/examples/WorkloadImpact_Delete.
     * json
     */
    /**
     * Sample code: Delete WorkloadImpact Resource by name example.
     * 
     * @param manager Entry point to ImpactManager.
     */
    public static void
        deleteWorkloadImpactResourceByNameExample(com.azure.resourcemanager.impact.ImpactManager manager) {
        manager.workloadImpacts().deleteWithResponse("impact-001", com.azure.core.util.Context.NONE);
    }
}
```

