# Code snippets and samples


## AvailabilityStatuses

- [GetByResource](#availabilitystatuses_getbyresource)
- [List](#availabilitystatuses_list)
- [ListByResourceGroup](#availabilitystatuses_listbyresourcegroup)
- [ListBySubscriptionId](#availabilitystatuses_listbysubscriptionid)

## EventOperation

- [FetchDetailsBySubscriptionIdAndTrackingId](#eventoperation_fetchdetailsbysubscriptionidandtrackingid)
- [FetchDetailsByTenantIdAndTrackingId](#eventoperation_fetchdetailsbytenantidandtrackingid)
- [GetBySubscriptionIdAndTrackingId](#eventoperation_getbysubscriptionidandtrackingid)
- [GetByTenantIdAndTrackingId](#eventoperation_getbytenantidandtrackingid)

## EventsOperation

- [List](#eventsoperation_list)
- [ListBySingleResource](#eventsoperation_listbysingleresource)
- [ListByTenantId](#eventsoperation_listbytenantid)

## ImpactedResources

- [Get](#impactedresources_get)
- [GetByTenantId](#impactedresources_getbytenantid)
- [ListBySubscriptionIdAndEventId](#impactedresources_listbysubscriptionidandeventid)
- [ListByTenantIdAndEventId](#impactedresources_listbytenantidandeventid)

## Operations

- [List](#operations_list)

## SecurityAdvisoryImpactedResources

- [ListBySubscriptionIdAndEventId](#securityadvisoryimpactedresources_listbysubscriptionidandeventid)
- [ListByTenantIdAndEventId](#securityadvisoryimpactedresources_listbytenantidandeventid)
### AvailabilityStatuses_GetByResource

```java
import com.azure.core.util.Context;

/** Samples for AvailabilityStatuses GetByResource. */
public final class AvailabilityStatusesGetByResourceSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/AvailabilityStatus_GetByResource.json
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
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/AvailabilityStatuses_List.json
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
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/AvailabilityStatuses_ListByResourceGroup.json
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
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/AvailabilityStatuses_ListBySubscriptionId.json
     */
    /**
     * Sample code: ListHealthBySubscriptionId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listHealthBySubscriptionId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.availabilityStatuses().listBySubscriptionId(null, "recommendedactions", Context.NONE);
    }
}
```

### EventOperation_FetchDetailsBySubscriptionIdAndTrackingId

```java
import com.azure.core.util.Context;

/** Samples for EventOperation FetchDetailsBySubscriptionIdAndTrackingId. */
public final class EventOperationFetchDetailsBySubscriptionIdAndTrackingIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/Event_fetchDetailsBySubscriptionIdAndTrackingId.json
     */
    /**
     * Sample code: EventDetailsBySubscriptionIdAndTrackingId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void eventDetailsBySubscriptionIdAndTrackingId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .eventOperations()
            .fetchDetailsBySubscriptionIdAndTrackingIdWithResponse("eventTrackingId", Context.NONE);
    }
}
```

### EventOperation_FetchDetailsByTenantIdAndTrackingId

```java
import com.azure.core.util.Context;

/** Samples for EventOperation FetchDetailsByTenantIdAndTrackingId. */
public final class EventOperationFetchDetailsByTenantIdAndTrackingIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/Event_fetchDetailsByTenantIdAndTrackingId.json
     */
    /**
     * Sample code: EventDetailsByTenantIdAndTrackingId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void eventDetailsByTenantIdAndTrackingId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.eventOperations().fetchDetailsByTenantIdAndTrackingIdWithResponse("eventTrackingId", Context.NONE);
    }
}
```

### EventOperation_GetBySubscriptionIdAndTrackingId

```java
import com.azure.core.util.Context;

/** Samples for EventOperation GetBySubscriptionIdAndTrackingId. */
public final class EventOperationGetBySubscriptionIdAndTrackingIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/Event_GetBySubscriptionIdAndTrackingId.json
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
                "eventTrackingId", "properties/status eq 'Active'", "7/10/2022", Context.NONE);
    }
}
```

### EventOperation_GetByTenantIdAndTrackingId

```java
import com.azure.core.util.Context;

/** Samples for EventOperation GetByTenantIdAndTrackingId. */
public final class EventOperationGetByTenantIdAndTrackingIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/Event_GetByTenantIdAndTrackingId.json
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
                "eventTrackingId", "properties/status eq 'Active'", "7/10/2022", Context.NONE);
    }
}
```

### EventsOperation_List

```java
import com.azure.core.util.Context;

/** Samples for EventsOperation List. */
public final class EventsOperationListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/Events_ListBySubscriptionId.json
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
            .list("service eq 'Virtual Machines' or region eq 'West US'", "7/24/2020", Context.NONE);
    }
}
```

### EventsOperation_ListBySingleResource

```java
import com.azure.core.util.Context;

/** Samples for EventsOperation ListBySingleResource. */
public final class EventsOperationListBySingleResourceSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/Events_ListBySingleResource.json
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
                Context.NONE);
    }
}
```

### EventsOperation_ListByTenantId

```java
import com.azure.core.util.Context;

/** Samples for EventsOperation ListByTenantId. */
public final class EventsOperationListByTenantIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/Events_ListByTenantId.json
     */
    /**
     * Sample code: ListEventsByTenantId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listEventsByTenantId(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager
            .eventsOperations()
            .listByTenantId("service eq 'Virtual Machines' or region eq 'West US'", "7/24/2020", Context.NONE);
    }
}
```

### ImpactedResources_Get

```java
import com.azure.core.util.Context;

/** Samples for ImpactedResources Get. */
public final class ImpactedResourcesGetSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/ImpactedResources_Get.json
     */
    /**
     * Sample code: ImpactedResourcesGet.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void impactedResourcesGet(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.impactedResources().getWithResponse("BC_1-FXZ", "abc-123-ghj-456", Context.NONE);
    }
}
```

### ImpactedResources_GetByTenantId

```java
import com.azure.core.util.Context;

/** Samples for ImpactedResources GetByTenantId. */
public final class ImpactedResourcesGetByTenantIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/ImpactedResources_GetByTenantId.json
     */
    /**
     * Sample code: ImpactedResourcesGet.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void impactedResourcesGet(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.impactedResources().getByTenantIdWithResponse("BC_1-FXZ", "abc-123-ghj-456", Context.NONE);
    }
}
```

### ImpactedResources_ListBySubscriptionIdAndEventId

```java
import com.azure.core.util.Context;

/** Samples for ImpactedResources ListBySubscriptionIdAndEventId. */
public final class ImpactedResourcesListBySubscriptionIdAndEventIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/ImpactedResources_ListBySubscriptionId_ListByEventId.json
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
            .listBySubscriptionIdAndEventId("BC_1-FXZ", "targetRegion eq 'westus'", Context.NONE);
    }
}
```

### ImpactedResources_ListByTenantIdAndEventId

```java
import com.azure.core.util.Context;

/** Samples for ImpactedResources ListByTenantIdAndEventId. */
public final class ImpactedResourcesListByTenantIdAndEventIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/ImpactedResources_ListByTenantId_ListByEventId.json
     */
    /**
     * Sample code: ListEventsByTenantId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listEventsByTenantId(com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.impactedResources().listByTenantIdAndEventId("BC_1-FXZ", "targetRegion eq 'westus'", Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/Operations_List.json
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

### SecurityAdvisoryImpactedResources_ListBySubscriptionIdAndEventId

```java
import com.azure.core.util.Context;

/** Samples for SecurityAdvisoryImpactedResources ListBySubscriptionIdAndEventId. */
public final class SecurityAdvisoryImpactedResourcesListBySubscriptionIdAndEventIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/SecurityAdvisoryImpactedResources_ListBySubscriptionId_ListByEventId.json
     */
    /**
     * Sample code: ListSecurityAdvisoryImpactedResourcesBySubscriptionId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listSecurityAdvisoryImpactedResourcesBySubscriptionId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.securityAdvisoryImpactedResources().listBySubscriptionIdAndEventId("BC_1-FXZ", null, Context.NONE);
    }
}
```

### SecurityAdvisoryImpactedResources_ListByTenantIdAndEventId

```java
import com.azure.core.util.Context;

/** Samples for SecurityAdvisoryImpactedResources ListByTenantIdAndEventId. */
public final class SecurityAdvisoryImpactedResourcesListByTenantIdAndEventIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2022-10-01-preview/examples/SecurityAdvisoryImpactedResources_ListByTenantId_ListByEventId.json
     */
    /**
     * Sample code: ListSecurityAdvisoryImpactedResourcesByTenantId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listSecurityAdvisoryImpactedResourcesByTenantId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.securityAdvisoryImpactedResources().listByTenantIdAndEventId("BC_1-FXZ", null, Context.NONE);
    }
}
```

