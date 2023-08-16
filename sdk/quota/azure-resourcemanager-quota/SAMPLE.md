# Code snippets and samples


## GroupQuotaLimits

- [CreateOrUpdate](#groupquotalimits_createorupdate)
- [Get](#groupquotalimits_get)
- [List](#groupquotalimits_list)
- [Update](#groupquotalimits_update)

## GroupQuotaLimitsRequests

- [Get](#groupquotalimitsrequests_get)
- [List](#groupquotalimitsrequests_list)

## GroupQuotaSubscriptionQuotaAllocation

- [CreateOrUpdate](#groupquotasubscriptionquotaallocation_createorupdate)
- [Get](#groupquotasubscriptionquotaallocation_get)
- [List](#groupquotasubscriptionquotaallocation_list)
- [Update](#groupquotasubscriptionquotaallocation_update)

## GroupQuotaSubscriptionQuotaAllocationRequests

- [Get](#groupquotasubscriptionquotaallocationrequests_get)
- [List](#groupquotasubscriptionquotaallocationrequests_list)

## GroupQuotaSubscriptions

- [CreateOrUpdate](#groupquotasubscriptions_createorupdate)
- [Delete](#groupquotasubscriptions_delete)
- [Get](#groupquotasubscriptions_get)
- [List](#groupquotasubscriptions_list)
- [Update](#groupquotasubscriptions_update)

## GroupQuotas

- [CreateOrUpdate](#groupquotas_createorupdate)
- [Delete](#groupquotas_delete)
- [Get](#groupquotas_get)
- [List](#groupquotas_list)
- [Update](#groupquotas_update)

## Quota

- [CreateOrUpdate](#quota_createorupdate)
- [Get](#quota_get)
- [List](#quota_list)
- [Update](#quota_update)

## QuotaOperation

- [List](#quotaoperation_list)

## QuotaRequestStatus

- [Get](#quotarequeststatus_get)
- [List](#quotarequeststatus_list)

## SubscriptionRequests

- [Get](#subscriptionrequests_get)
- [List](#subscriptionrequests_list)

## Usages

- [Get](#usages_get)
- [List](#usages_list)
### GroupQuotaLimits_CreateOrUpdate

```java
/** Samples for GroupQuotaLimits CreateOrUpdate. */
public final class GroupQuotaLimitsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotaLimits/PutGroupQuotaLimits-Compute.json
     */
    /**
     * Sample code: GroupQuotaLimits_Put_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotaLimitsPutRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaLimits()
            .createOrUpdate(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                "cores",
                null,
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaLimits_Get

```java
/** Samples for GroupQuotaLimits Get. */
public final class GroupQuotaLimitsGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotaLimits/GetGroupQuotaLimits-Compute.json
     */
    /**
     * Sample code: GroupQuotaLimits_Get_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotaLimitsGetRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaLimits()
            .getWithResponse(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                "cores",
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaLimits_List

```java
/** Samples for GroupQuotaLimits List. */
public final class GroupQuotaLimitsListSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotaLimits/ListGroupQuotaLimits-Compute.json
     */
    /**
     * Sample code: GroupQuotaLimits_List_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotaLimitsListRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaLimits()
            .list(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaLimits_Update

```java
/** Samples for GroupQuotaLimits Update. */
public final class GroupQuotaLimitsUpdateSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotaLimits/PatchGroupQuotaLimits-Compute.json
     */
    /**
     * Sample code: GroupQuotaLimits_Patch_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotaLimitsPatchRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaLimits()
            .update(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                "cores",
                null,
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaLimitsRequests_Get

```java
/** Samples for GroupQuotaLimitsRequests Get. */
public final class GroupQuotaLimitsRequestsGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotaLimitsRequests/GroupQuotaLimitsRequests_Get.json
     */
    /**
     * Sample code: GroupQuotaLimitsRequests_Get.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotaLimitsRequestsGet(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaLimitsRequests()
            .getWithResponse(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                "someId",
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaLimitsRequests_List

```java
/** Samples for GroupQuotaLimitsRequests List. */
public final class GroupQuotaLimitsRequestsListSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotaLimitsRequests/GroupQuotaLimitsRequests_List.json
     */
    /**
     * Sample code: GroupQuotaLimitsRequests_List.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotaLimitsRequestsList(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaLimitsRequests()
            .list(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaSubscriptionQuotaAllocation_CreateOrUpdate

```java
import com.azure.resourcemanager.quota.fluent.models.SubscriptionQuotaAllocationsInner;
import com.azure.resourcemanager.quota.models.SubscriptionGroupQuotaAssignment;
import com.azure.resourcemanager.quota.models.SubscriptionQuotaDetails;
import java.util.Arrays;

/** Samples for GroupQuotaSubscriptionQuotaAllocation CreateOrUpdate. */
public final class GroupQuotaSubscriptionQuotaAllocationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/SubscriptionQuotaAllocation/SubscriptionQuotaAllocation_Put_Request-Compute.json
     */
    /**
     * Sample code: SubscriptionQuotaAllocation_Put_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void subscriptionQuotaAllocationPutRequestForCompute(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaSubscriptionQuotaAllocations()
            .createOrUpdate(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                "cores",
                new SubscriptionQuotaAllocationsInner()
                    .withProperties(
                        new SubscriptionQuotaDetails()
                            .withQuotaSources(
                                Arrays
                                    .asList(
                                        new SubscriptionGroupQuotaAssignment()
                                            .withManagementGroupId("00000000-0000-0000-0000-000000000000")
                                            .withQuotaAllocated(75L)))),
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaSubscriptionQuotaAllocation_Get

```java
/** Samples for GroupQuotaSubscriptionQuotaAllocation Get. */
public final class GroupQuotaSubscriptionQuotaAllocationGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/SubscriptionQuotaAllocation/SubscriptionQuotaAllocation_Get_Request-Compute.json
     */
    /**
     * Sample code: SubscriptionQuotaAllocation_Get_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void subscriptionQuotaAllocationGetRequestForCompute(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaSubscriptionQuotaAllocations()
            .getWithResponse(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                "cores",
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaSubscriptionQuotaAllocation_List

```java
/** Samples for GroupQuotaSubscriptionQuotaAllocation List. */
public final class GroupQuotaSubscriptionQuotaAllocationListSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/SubscriptionQuotaAllocation/SubscriptionQuotaAllocation_List_Request-Compute.json
     */
    /**
     * Sample code: SubscriptionQuotaAllocation_List_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void subscriptionQuotaAllocationListRequestForCompute(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaSubscriptionQuotaAllocations()
            .list(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaSubscriptionQuotaAllocation_Update

```java
import com.azure.resourcemanager.quota.fluent.models.SubscriptionQuotaAllocationsInner;
import com.azure.resourcemanager.quota.models.SubscriptionGroupQuotaAssignment;
import com.azure.resourcemanager.quota.models.SubscriptionQuotaDetails;
import java.util.Arrays;

/** Samples for GroupQuotaSubscriptionQuotaAllocation Update. */
public final class GroupQuotaSubscriptionQuotaAllocationUpdateSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/SubscriptionQuotaAllocation/SubscriptionQuotaAllocation_Patch_Request-Compute.json
     */
    /**
     * Sample code: SubscriptionQuotaAllocation_Patch_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void subscriptionQuotaAllocationPatchRequestForCompute(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaSubscriptionQuotaAllocations()
            .update(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                "cores",
                new SubscriptionQuotaAllocationsInner()
                    .withProperties(
                        new SubscriptionQuotaDetails()
                            .withQuotaSources(
                                Arrays
                                    .asList(
                                        new SubscriptionGroupQuotaAssignment()
                                            .withManagementGroupId("00000000-0000-0000-0000-000000000000")
                                            .withQuotaAllocated(75L)))),
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaSubscriptionQuotaAllocationRequests_Get

```java
/** Samples for GroupQuotaSubscriptionQuotaAllocationRequests Get. */
public final class GroupQuotaSubscriptionQuotaAllocationRequestsGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/SubscriptionQuotaAllocationRequests/SubscriptionQuotaAllocationRequests_Get_Request-Compute.json
     */
    /**
     * Sample code: SubscriptionQuotaAllocationRequests_Get_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void subscriptionQuotaAllocationRequestsGetRequestForCompute(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaSubscriptionQuotaAllocationRequests()
            .getWithResponse(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                "11111111-1111-1111-1111-111111111111",
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaSubscriptionQuotaAllocationRequests_List

```java
/** Samples for GroupQuotaSubscriptionQuotaAllocationRequests List. */
public final class GroupQuotaSubscriptionQuotaAllocationRequestsListSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/SubscriptionQuotaAllocationRequests/SubscriptionQuotaAllocationRequests_List_Request-Compute.json
     */
    /**
     * Sample code: SubscriptionQuotaAllocationRequests_List_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void subscriptionQuotaAllocationRequestsListRequestForCompute(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaSubscriptionQuotaAllocationRequests()
            .list(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "providers/Microsoft.Compute/locations/westus",
                "groupquota1",
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaSubscriptions_CreateOrUpdate

```java
/** Samples for GroupQuotaSubscriptions CreateOrUpdate. */
public final class GroupQuotaSubscriptionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotasSubscriptions/PutGroupQuotasSubscription.json
     */
    /**
     * Sample code: GroupQuotaSubscriptions_Put_Subscriptions.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotaSubscriptionsPutSubscriptions(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaSubscriptions()
            .createOrUpdate("E7EC67B3-7657-4966-BFFC-41EFD36BAA09", "groupquota1", com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaSubscriptions_Delete

```java
/** Samples for GroupQuotaSubscriptions Delete. */
public final class GroupQuotaSubscriptionsDeleteSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotasSubscriptions/DeleteGroupQuotaSubscriptions.json
     */
    /**
     * Sample code: GroupQuotaSubscriptions_Delete_Subscriptions.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotaSubscriptionsDeleteSubscriptions(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaSubscriptions()
            .deleteByResourceGroupWithResponse(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09", "groupquota1", com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaSubscriptions_Get

```java
/** Samples for GroupQuotaSubscriptions Get. */
public final class GroupQuotaSubscriptionsGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotasSubscriptions/GetGroupQuotaSubscriptions.json
     */
    /**
     * Sample code: GroupQuotaSubscriptions_Get_Subscriptions.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotaSubscriptionsGetSubscriptions(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaSubscriptions()
            .getWithResponse("E7EC67B3-7657-4966-BFFC-41EFD36BAA09", "groupquota1", com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaSubscriptions_List

```java
/** Samples for GroupQuotaSubscriptions List. */
public final class GroupQuotaSubscriptionsListSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotasSubscriptions/ListGroupQuotaSubscriptions.json
     */
    /**
     * Sample code: GroupQuotaSubscriptions_List_Subscriptions.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotaSubscriptionsListSubscriptions(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaSubscriptions()
            .list("E7EC67B3-7657-4966-BFFC-41EFD36BAA09", "groupquota1", com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotaSubscriptions_Update

```java
/** Samples for GroupQuotaSubscriptions Update. */
public final class GroupQuotaSubscriptionsUpdateSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotasSubscriptions/PatchGroupQuotasSubscription.json
     */
    /**
     * Sample code: GroupQuotaSubscriptions_Patch_Subscriptions.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotaSubscriptionsPatchSubscriptions(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotaSubscriptions()
            .update("E7EC67B3-7657-4966-BFFC-41EFD36BAA09", "groupquota1", com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotas_CreateOrUpdate

```java
import com.azure.resourcemanager.quota.fluent.models.GroupQuotasEntityInner;
import com.azure.resourcemanager.quota.models.AdditionalAttributes;
import com.azure.resourcemanager.quota.models.EnvironmentType;
import com.azure.resourcemanager.quota.models.GroupQuotasEntityBase;
import com.azure.resourcemanager.quota.models.GroupingId;
import com.azure.resourcemanager.quota.models.GroupingIdType;

/** Samples for GroupQuotas CreateOrUpdate. */
public final class GroupQuotasCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotas/PutGroupQuotas.json
     */
    /**
     * Sample code: GroupQuotas_Put_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotasPutRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotas()
            .createOrUpdate(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "groupquota1",
                new GroupQuotasEntityInner()
                    .withProperties(
                        new GroupQuotasEntityBase()
                            .withDisplayName("GroupQuota1")
                            .withAdditionalAttributes(
                                new AdditionalAttributes()
                                    .withGroupId(
                                        new GroupingId()
                                            .withGroupingIdType(GroupingIdType.SERVICE_TREE_ID)
                                            .withValue("yourServiceTreeIdHere"))
                                    .withEnvironment(EnvironmentType.PRODUCTION))),
                com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotas_Delete

```java
/** Samples for GroupQuotas Delete. */
public final class GroupQuotasDeleteSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotas/DeleteGroupQuotas.json
     */
    /**
     * Sample code: GroupQuotas_Delete_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotasDeleteRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotas()
            .deleteByResourceGroupWithResponse(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09", "groupquota1", com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotas_Get

```java
/** Samples for GroupQuotas Get. */
public final class GroupQuotasGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotas/GetGroupQuotas.json
     */
    /**
     * Sample code: GroupQuotas_Get_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotasGetRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotas()
            .getWithResponse("E7EC67B3-7657-4966-BFFC-41EFD36BAA09", "groupquota1", com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotas_List

```java
/** Samples for GroupQuotas List. */
public final class GroupQuotasListSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotas/GetGroupQuotasList.json
     */
    /**
     * Sample code: GroupQuotas_List_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotasListRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager.groupQuotas().list("E7EC67B3-7657-4966-BFFC-41EFD36BAA09", com.azure.core.util.Context.NONE);
    }
}
```

### GroupQuotas_Update

```java
import com.azure.resourcemanager.quota.fluent.models.GroupQuotasEntityInner;
import com.azure.resourcemanager.quota.models.AdditionalAttributes;
import com.azure.resourcemanager.quota.models.EnvironmentType;
import com.azure.resourcemanager.quota.models.GroupQuotasEntityBase;
import com.azure.resourcemanager.quota.models.GroupingId;
import com.azure.resourcemanager.quota.models.GroupingIdType;

/** Samples for GroupQuotas Update. */
public final class GroupQuotasUpdateSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/GroupQuotas/PatchGroupQuotas.json
     */
    /**
     * Sample code: GroupQuotas_Patch_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void groupQuotasPatchRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .groupQuotas()
            .update(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "groupquota1",
                new GroupQuotasEntityInner()
                    .withProperties(
                        new GroupQuotasEntityBase()
                            .withDisplayName("GroupQuota1")
                            .withAdditionalAttributes(
                                new AdditionalAttributes()
                                    .withGroupId(
                                        new GroupingId()
                                            .withGroupingIdType(GroupingIdType.SERVICE_TREE_ID)
                                            .withValue("yourServiceTreeIdHere"))
                                    .withEnvironment(EnvironmentType.PRODUCTION))),
                com.azure.core.util.Context.NONE);
    }
}
```

### Quota_CreateOrUpdate

```java
import com.azure.resourcemanager.quota.models.LimitObject;
import com.azure.resourcemanager.quota.models.QuotaProperties;
import com.azure.resourcemanager.quota.models.ResourceName;

/** Samples for Quota CreateOrUpdate. */
public final class QuotaCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/putMachineLearningServicesQuotaRequestLowPriority.json
     */
    /**
     * Sample code: Quotas_Request_ForMachineLearningServices_LowPriorityResource.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasRequestForMachineLearningServicesLowPriorityResource(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotas()
            .define("TotalLowPriorityCores")
            .withExistingScope(
                "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.MachineLearningServices/locations/eastus")
            .withProperties(
                new QuotaProperties()
                    .withLimit(new LimitObject().withValue(10))
                    .withName(new ResourceName().withValue("TotalLowPriorityCores"))
                    .withResourceType("lowPriority"))
            .create();
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/putNetworkOneSkuQuotaRequestStandardSkuPublicIpAddresses.json
     */
    /**
     * Sample code: Quotas_PutRequest_ForNetwork_StandardSkuPublicIpAddressesResource.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasPutRequestForNetworkStandardSkuPublicIpAddressesResource(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotas()
            .define("StandardSkuPublicIpAddresses")
            .withExistingScope(
                "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.Network/locations/eastus")
            .withProperties(
                new QuotaProperties()
                    .withLimit(new LimitObject().withValue(10))
                    .withName(new ResourceName().withValue("StandardSkuPublicIpAddresses"))
                    .withResourceType("PublicIpAddresses"))
            .create();
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/putComputeOneSkuQuotaRequest.json
     */
    /**
     * Sample code: Quotas_Put_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasPutRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotas()
            .define("standardFSv2Family")
            .withExistingScope(
                "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.Compute/locations/eastus")
            .withProperties(
                new QuotaProperties()
                    .withLimit(new LimitObject().withValue(10))
                    .withName(new ResourceName().withValue("standardFSv2Family")))
            .create();
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/putNetworkOneSkuQuotaRequest.json
     */
    /**
     * Sample code: Quotas_PutRequest_ForNetwork.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasPutRequestForNetwork(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotas()
            .define("MinPublicIpInterNetworkPrefixLength")
            .withExistingScope(
                "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.Network/locations/eastus")
            .withProperties(
                new QuotaProperties()
                    .withLimit(new LimitObject().withValue(10))
                    .withName(new ResourceName().withValue("MinPublicIpInterNetworkPrefixLength"))
                    .withResourceType("MinPublicIpInterNetworkPrefixLength"))
            .create();
    }
}
```

### Quota_Get

```java
/** Samples for Quota Get. */
public final class QuotaGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getNetworkOneSkuQuotaLimit.json
     */
    /**
     * Sample code: Quotas_UsagesRequest_ForNetwork.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasUsagesRequestForNetwork(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotas()
            .getWithResponse(
                "MinPublicIpInterNetworkPrefixLength",
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Network/locations/eastus",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getComputeOneSkuQuotaLimit.json
     */
    /**
     * Sample code: Quotas_Get_Request_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasGetRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotas()
            .getWithResponse(
                "standardNDSFamily",
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Compute/locations/eastus",
                com.azure.core.util.Context.NONE);
    }
}
```

### Quota_List

```java
/** Samples for Quota List. */
public final class QuotaListSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getMachineLearningServicesQuotaLimits.json
     */
    /**
     * Sample code: Quotas_listQuotaLimitsMachineLearningServices.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasListQuotaLimitsMachineLearningServices(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotas()
            .list(
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.MachineLearningServices/locations/eastus",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getComputeQuotaLimits.json
     */
    /**
     * Sample code: Quotas_listQuotaLimitsForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasListQuotaLimitsForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotas()
            .list(
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Compute/locations/eastus",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getNetworkQuotaLimits.json
     */
    /**
     * Sample code: Quotas_listQuotaLimitsForNetwork.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasListQuotaLimitsForNetwork(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotas()
            .list(
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Network/locations/eastus",
                com.azure.core.util.Context.NONE);
    }
}
```

### Quota_Update

```java
import com.azure.resourcemanager.quota.models.CurrentQuotaLimitBase;
import com.azure.resourcemanager.quota.models.LimitObject;
import com.azure.resourcemanager.quota.models.QuotaProperties;
import com.azure.resourcemanager.quota.models.ResourceName;

/** Samples for Quota Update. */
public final class QuotaUpdateSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/patchComputeQuotaRequest.json
     */
    /**
     * Sample code: Quotas_Request_PatchForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasRequestPatchForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        CurrentQuotaLimitBase resource =
            manager
                .quotas()
                .getWithResponse(
                    "standardFSv2Family",
                    "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.Compute/locations/eastus",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new QuotaProperties()
                    .withLimit(new LimitObject().withValue(10))
                    .withName(new ResourceName().withValue("standardFSv2Family")))
            .apply();
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/patchNetworkOneSkuQuotaRequest.json
     */
    /**
     * Sample code: Quotas_Request_PatchForNetwork.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasRequestPatchForNetwork(com.azure.resourcemanager.quota.QuotaManager manager) {
        CurrentQuotaLimitBase resource =
            manager
                .quotas()
                .getWithResponse(
                    "MinPublicIpInterNetworkPrefixLength",
                    "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.Network/locations/eastus",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new QuotaProperties()
                    .withLimit(new LimitObject().withValue(10))
                    .withName(new ResourceName().withValue("MinPublicIpInterNetworkPrefixLength"))
                    .withResourceType("MinPublicIpInterNetworkPrefixLength"))
            .apply();
    }
}
```

### QuotaOperation_List

```java
/** Samples for QuotaOperation List. */
public final class QuotaOperationListSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/GetOperations.json
     */
    /**
     * Sample code: GetOperations.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void getOperations(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager.quotaOperations().list(com.azure.core.util.Context.NONE);
    }
}
```

### QuotaRequestStatus_Get

```java
/** Samples for QuotaRequestStatus Get. */
public final class QuotaRequestStatusGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getQuotaRequestStatusFailed.json
     */
    /**
     * Sample code: QuotaRequestFailed.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotaRequestFailed(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotaRequestStatus()
            .getWithResponse(
                "2B5C8515-37D8-4B6A-879B-CD641A2CF605",
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Compute/locations/eastus",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getQuotaRequestStatusById.json
     */
    /**
     * Sample code: QuotaRequestStatus.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotaRequestStatus(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotaRequestStatus()
            .getWithResponse(
                "2B5C8515-37D8-4B6A-879B-CD641A2CF605",
                "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.Compute/locations/eastus",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getQuotaRequestStatusInProgress.json
     */
    /**
     * Sample code: QuotaRequestInProgress.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotaRequestInProgress(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotaRequestStatus()
            .getWithResponse(
                "2B5C8515-37D8-4B6A-879B-CD641A2CF605",
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Compute/locations/eastus",
                com.azure.core.util.Context.NONE);
    }
}
```

### QuotaRequestStatus_List

```java
/** Samples for QuotaRequestStatus List. */
public final class QuotaRequestStatusListSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getQuotaRequestsHistory.json
     */
    /**
     * Sample code: QuotaRequestHistory.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotaRequestHistory(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .quotaRequestStatus()
            .list(
                "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.Compute/locations/eastus",
                null,
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
```

### SubscriptionRequests_Get

```java
/** Samples for SubscriptionRequests Get. */
public final class SubscriptionRequestsGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/SubscriptionRequests/SubscriptionRequests_Get.json
     */
    /**
     * Sample code: SubscriptionRequests_Get.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void subscriptionRequestsGet(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .subscriptionRequests()
            .getWithResponse(
                "E7EC67B3-7657-4966-BFFC-41EFD36BAA09",
                "groupquota1",
                "00000000-0000-0000-0000-000000000000",
                com.azure.core.util.Context.NONE);
    }
}
```

### SubscriptionRequests_List

```java
/** Samples for SubscriptionRequests List. */
public final class SubscriptionRequestsListSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2023-06-01-preview/examples/SubscriptionRequests/SubscriptionRequests_List.json
     */
    /**
     * Sample code: SubscriptionRequests_List.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void subscriptionRequestsList(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .subscriptionRequests()
            .list("E7EC67B3-7657-4966-BFFC-41EFD36BAA09", "groupquota1", com.azure.core.util.Context.NONE);
    }
}
```

### Usages_Get

```java
/** Samples for Usages Get. */
public final class UsagesGetSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getNetworkOneSkuUsages.json
     */
    /**
     * Sample code: Quotas_UsagesRequest_ForNetwork.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasUsagesRequestForNetwork(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .usages()
            .getWithResponse(
                "MinPublicIpInterNetworkPrefixLength",
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Network/locations/eastus",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getComputeOneSkuUsages.json
     */
    /**
     * Sample code: Quotas_UsagesRequest_ForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasUsagesRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .usages()
            .getWithResponse(
                "standardNDSFamily",
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Compute/locations/eastus",
                com.azure.core.util.Context.NONE);
    }
}
```

### Usages_List

```java
/** Samples for Usages List. */
public final class UsagesListSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getComputeUsages.json
     */
    /**
     * Sample code: Quotas_listUsagesForCompute.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasListUsagesForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .usages()
            .list(
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Compute/locations/eastus",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getNetworkUsages.json
     */
    /**
     * Sample code: Quotas_listUsagesForNetwork.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasListUsagesForNetwork(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .usages()
            .list(
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.Network/locations/eastus",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/stable/2023-02-01/examples/getMachineLearningServicesUsages.json
     */
    /**
     * Sample code: Quotas_listUsagesMachineLearningServices.
     *
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasListUsagesMachineLearningServices(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager
            .usages()
            .list(
                "subscriptions/00000000-0000-0000-0000-000000000000/providers/Microsoft.MachineLearningServices/locations/eastus",
                com.azure.core.util.Context.NONE);
    }
}
```

