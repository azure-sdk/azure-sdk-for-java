# Code snippets and samples


## AvailabilityStatuses

- [GetByResource](#availabilitystatuses_getbyresource)
- [List](#availabilitystatuses_list)
- [ListByResourceGroup](#availabilitystatuses_listbyresourcegroup)
- [ListBySubscriptionId](#availabilitystatuses_listbysubscriptionid)

## EventOperation

- [GetBySubscriptionIdAndTrackingId](#eventoperation_getbysubscriptionidandtrackingid)
- [GetByTenantIdAndTrackingId](#eventoperation_getbytenantidandtrackingid)

## EventsOperation

- [List](#eventsoperation_list)
- [ListBySingleResource](#eventsoperation_listbysingleresource)
- [ListByTenantId](#eventsoperation_listbytenantid)

## ImpactedResources

- [Get](#impactedresources_get)
- [ListBySubscriptionIdAndEventId](#impactedresources_listbysubscriptionidandeventid)

## Operations

- [List](#operations_list)
### AvailabilityStatuses_GetByResource

```java
/** Samples for AvailabilityStatuses GetByResource. */
public final class AvailabilityStatusesGetByResourceSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/AvailabilityStatus_GetByResource.json
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
            .getByResourceWithResponse("resourceUri", null, "recommendedactions", com.azure.core.util.Context.NONE);
    }
}
```

### AvailabilityStatuses_List

```java
/** Samples for AvailabilityStatuses List. */
public final class AvailabilityStatusesListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/AvailabilityStatuses_List.json
     */
    /**
     * Sample code: GetHealthHistoryByResource.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getHealthHistoryByResource(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.availabilityStatuses().list("resourceUri", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### AvailabilityStatuses_ListByResourceGroup

```java
/** Samples for AvailabilityStatuses ListByResourceGroup. */
public final class AvailabilityStatusesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/AvailabilityStatuses_ListByResourceGroup.json
     */
    /**
     * Sample code: ListByResourceGroup.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listByResourceGroup(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .availabilityStatuses()
            .listByResourceGroup("resourceGroupName", null, "recommendedactions", com.azure.core.util.Context.NONE);
    }
}
```

### AvailabilityStatuses_ListBySubscriptionId

```java
/** Samples for AvailabilityStatuses ListBySubscriptionId. */
public final class AvailabilityStatusesListBySubscriptionIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/AvailabilityStatuses_ListBySubscriptionId.json
     */
    /**
     * Sample code: ListHealthBySubscriptionId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listHealthBySubscriptionId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .availabilityStatuses()
            .listBySubscriptionId(null, "recommendedactions", com.azure.core.util.Context.NONE);
    }
}
```

### EventOperation_GetBySubscriptionIdAndTrackingId

```java
/** Samples for EventOperation GetBySubscriptionIdAndTrackingId. */
public final class EventOperationGetBySubscriptionIdAndTrackingIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/Event_GetBySubscriptionIdAndTrackingId.json
     */
    /**
     * Sample code: SecurityAdvisoriesEventBySubscriptionIdAndTrackingId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void securityAdvisoriesEventBySubscriptionIdAndTrackingId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .eventOperations()
            .getBySubscriptionIdAndTrackingIdWithResponse(
                "eventTrackingId", "properties/status eq 'Active'", "7/10/2022", com.azure.core.util.Context.NONE);
    }
}
```

### EventOperation_GetByTenantIdAndTrackingId

```java
/** Samples for EventOperation GetByTenantIdAndTrackingId. */
public final class EventOperationGetByTenantIdAndTrackingIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/Event_GetByTenantIdAndTrackingId.json
     */
    /**
     * Sample code: EventByTenantIdAndTrackingId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void eventByTenantIdAndTrackingId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .eventOperations()
            .getByTenantIdAndTrackingIdWithResponse(
                "eventTrackingId", "properties/status eq 'Active'", "7/10/2022", com.azure.core.util.Context.NONE);
    }
}
```

### EventsOperation_List

```java
/** Samples for EventsOperation List. */
public final class EventsOperationListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/Events_ListBySubscriptionId.json
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
            .list(
                "service eq 'Virtual Machines' or region eq 'West US'", "7/24/2020", com.azure.core.util.Context.NONE);
    }
}
```

### EventsOperation_ListBySingleResource

```java
/** Samples for EventsOperation ListBySingleResource. */
public final class EventsOperationListBySingleResourceSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/Events_ListBySingleResource.json
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
                com.azure.core.util.Context.NONE);
    }
}
```

### EventsOperation_ListByTenantId

```java
/** Samples for EventsOperation ListByTenantId. */
public final class EventsOperationListByTenantIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/Events_ListByTenantId.json
     */
    /**
     * Sample code: ListEventsByTenantId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listEventsByTenantId(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .eventsOperations()
            .listByTenantId(
                "service eq 'Virtual Machines' or region eq 'West US'", "7/24/2020", com.azure.core.util.Context.NONE);
    }
}
```

### ImpactedResources_Get

```java
/** Samples for ImpactedResources Get. */
public final class ImpactedResourcesGetSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/ImpactedResources_Get.json
     */
    /**
     * Sample code: ImpactedResourcesGet.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void impactedResourcesGet(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.impactedResources().getWithResponse("BC_1-FXZ", "abc-123-ghj-456", com.azure.core.util.Context.NONE);
    }
}
```

### ImpactedResources_ListBySubscriptionIdAndEventId

```java
/** Samples for ImpactedResources ListBySubscriptionIdAndEventId. */
public final class ImpactedResourcesListBySubscriptionIdAndEventIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/ImpactedResources_ListBySubscriptionId_ListByEventId.json
     */
    /**
     * Sample code: ListImpactedResourcesBySubscriptionId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listImpactedResourcesBySubscriptionId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .impactedResources()
            .listBySubscriptionIdAndEventId("BC_1-FXZ", "targetRegion eq 'westus'", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2022-05-01/examples/Operations_List.json
     */
    /**
     * Sample code: GetOperationsList.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void getOperationsList(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.operations().listWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

