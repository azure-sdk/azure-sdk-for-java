# Code snippets and samples


## AvailabilityStatuses

- [GetByResource](#availabilitystatuses_getbyresource)
- [List](#availabilitystatuses_list)
- [ListByResourceGroup](#availabilitystatuses_listbyresourcegroup)
- [ListBySubscriptionId](#availabilitystatuses_listbysubscriptionid)

## ChildAvailabilityStatuses

- [GetByResource](#childavailabilitystatuses_getbyresource)
- [List](#childavailabilitystatuses_list)

## ChildResources

- [List](#childresources_list)

## EmergingIssues

- [Get](#emergingissues_get)
- [List](#emergingissues_list)

## EventsOperation

- [List](#eventsoperation_list)
- [ListBySingleResource](#eventsoperation_listbysingleresource)

## ImpactedResources

- [List](#impactedresources_list)

## Metadata

- [GetEntity](#metadata_getentity)
- [List](#metadata_list)

## Operations

- [List](#operations_list)
### AvailabilityStatuses_GetByResource

```java
import com.azure.core.util.Context;

/** Samples for AvailabilityStatuses GetByResource. */
public final class AvailabilityStatusesGetByResourceSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/AvailabilityStatus_GetByResource.json
     */
    /**
     * Sample code: GetCurrentHealthByResource.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getCurrentHealthByResource(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .availabilityStatuses()
            .getByResourceWithResponse("resourceUri", null, "recommendedactions", Context.NONE);
    }
}
```

### AvailabilityStatuses_List

```java
import com.azure.core.util.Context;

/** Samples for AvailabilityStatuses List. */
public final class AvailabilityStatusesListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/AvailabilityStatuses_List.json
     */
    /**
     * Sample code: GetHealthHistoryByResource.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getHealthHistoryByResource(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.availabilityStatuses().list("resourceUri", null, null, Context.NONE);
    }
}
```

### AvailabilityStatuses_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for AvailabilityStatuses ListByResourceGroup. */
public final class AvailabilityStatusesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/AvailabilityStatuses_ListByResourceGroup.json
     */
    /**
     * Sample code: ListByResourceGroup.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listByResourceGroup(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .availabilityStatuses()
            .listByResourceGroup("resourceGroupName", null, "recommendedactions", Context.NONE);
    }
}
```

### AvailabilityStatuses_ListBySubscriptionId

```java
import com.azure.core.util.Context;

/** Samples for AvailabilityStatuses ListBySubscriptionId. */
public final class AvailabilityStatusesListBySubscriptionIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/AvailabilityStatuses_ListBySubscriptionId.json
     */
    /**
     * Sample code: ListAvailabilityStatusBySubscriptionId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listAvailabilityStatusBySubscriptionId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.availabilityStatuses().listBySubscriptionId(null, "recommendedactions", Context.NONE);
    }
}
```

### ChildAvailabilityStatuses_GetByResource

```java
import com.azure.core.util.Context;

/** Samples for ChildAvailabilityStatuses GetByResource. */
public final class ChildAvailabilityStatusesGetByResourceSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/ChildAvailabilityStatus_GetByResource.json
     */
    /**
     * Sample code: GetCurrentHealthByResource.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getCurrentHealthByResource(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .childAvailabilityStatuses()
            .getByResourceWithResponse("resourceUri", null, "recommendedactions", Context.NONE);
    }
}
```

### ChildAvailabilityStatuses_List

```java
import com.azure.core.util.Context;

/** Samples for ChildAvailabilityStatuses List. */
public final class ChildAvailabilityStatusesListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/ChildAvailabilityStatuses_List.json
     */
    /**
     * Sample code: GetHealthHistoryByResource.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getHealthHistoryByResource(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.childAvailabilityStatuses().list("resourceUri", null, null, Context.NONE);
    }
}
```

### ChildResources_List

```java
import com.azure.core.util.Context;

/** Samples for ChildResources List. */
public final class ChildResourcesListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/ChildResources_List.json
     */
    /**
     * Sample code: GetHealthHistoryByResource.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getHealthHistoryByResource(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.childResources().list("resourceUri", null, null, Context.NONE);
    }
}
```

### EmergingIssues_Get

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcehealth.models.IssueNameParameter;

/** Samples for EmergingIssues Get. */
public final class EmergingIssuesGetSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/EmergingIssues_Get.json
     */
    /**
     * Sample code: GetEmergingIssues.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getEmergingIssues(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.emergingIssues().getWithResponse(IssueNameParameter.DEFAULT, Context.NONE);
    }
}
```

### EmergingIssues_List

```java
import com.azure.core.util.Context;

/** Samples for EmergingIssues List. */
public final class EmergingIssuesListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/EmergingIssues_List.json
     */
    /**
     * Sample code: GetEmergingIssuesList.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getEmergingIssuesList(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.emergingIssues().list(Context.NONE);
    }
}
```

### EventsOperation_List

```java
import com.azure.core.util.Context;

/** Samples for EventsOperation List. */
public final class EventsOperationListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/Events_ListBySubscriptionId.json
     */
    /**
     * Sample code: ListEventsBySubscriptionId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listEventsBySubscriptionId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .eventsOperations()
            .list("service eq 'Virtual Machines' or region eq 'West US'", "7/24/2020", null, Context.NONE);
    }
}
```

### EventsOperation_ListBySingleResource

```java
import com.azure.core.util.Context;

/** Samples for EventsOperation ListBySingleResource. */
public final class EventsOperationListBySingleResourceSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/Events_ListBySingleResource.json
     */
    /**
     * Sample code: ListEventsBySingleResource.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listEventsBySingleResource(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .eventsOperations()
            .listBySingleResource(
                "subscriptions/4abcdefgh-ijkl-mnop-qrstuvwxyz/resourceGroups/rhctestenv/providers/Microsoft.Compute/virtualMachines/rhctestenvV1PI",
                null,
                null,
                Context.NONE);
    }
}
```

### ImpactedResources_List

```java
import com.azure.core.util.Context;

/** Samples for ImpactedResources List. */
public final class ImpactedResourcesListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/ImpactedResources_ListBySubscriptionId.json
     */
    /**
     * Sample code: ListImpactedResourcesBySubscriptionId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listImpactedResourcesBySubscriptionId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.impactedResources().list("service eq 'Virtual Machines' or region eq 'West US'", Context.NONE);
    }
}
```

### Metadata_GetEntity

```java
import com.azure.core.util.Context;

/** Samples for Metadata GetEntity. */
public final class MetadataGetEntitySamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/Metadata_GetEntity.json
     */
    /**
     * Sample code: GetMetadataEntity.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getMetadataEntity(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.metadatas().getEntityWithResponse("status", Context.NONE);
    }
}
```

### Metadata_List

```java
import com.azure.core.util.Context;

/** Samples for Metadata List. */
public final class MetadataListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/Metadata_List.json
     */
    /**
     * Sample code: GetMetadata.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getMetadata(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.metadatas().list(Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-07-01/examples/Operations_List.json
     */
    /**
     * Sample code: GetOperationsList.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getOperationsList(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.operations().listWithResponse(Context.NONE);
    }
}
```

