# Code snippets and samples


## Membership

- [CreatePurchase](#membership_createpurchase)
- [Delete](#membership_delete)
- [GetByResourceGroup](#membership_getbyresourcegroup)

## MembershipByResourceGroup

- [List](#membershipbyresourcegroup_list)

## MembershipBySubscription

- [List](#membershipbysubscription_list)

## Operations

- [List](#operations_list)
### Membership_CreatePurchase

```java
/** Samples for Membership CreatePurchase. */
public final class MembershipCreatePurchaseSamples {
    /*
     * x-ms-original-file: specification/mcpp/resource-manager/Microsoft.CloudPartnerProgramMembership/preview/2023-02-09-preview/examples/createMcppPurchase.json
     */
    /**
     * Sample code: putOperations.
     *
     * @param manager Entry point to McppManager.
     */
    public static void putOperations(com.azure.resourcemanager.mcpp.McppManager manager) {
        manager
            .memberships()
            .define("microsoftactionpack")
            .withExistingResourceGroup("291bba3f-e0a5-47bc-a099-3bdcb2a50a05", "McppPurchases")
            .withProductCode("test product")
            .create();
    }
}
```

### Membership_Delete

```java
/** Samples for Membership Delete. */
public final class MembershipDeleteSamples {
    /*
     * x-ms-original-file: specification/mcpp/resource-manager/Microsoft.CloudPartnerProgramMembership/preview/2023-02-09-preview/examples/cancelMcppPurchase.json
     */
    /**
     * Sample code: deleteOperations.
     *
     * @param manager Entry point to McppManager.
     */
    public static void deleteOperations(com.azure.resourcemanager.mcpp.McppManager manager) {
        manager
            .memberships()
            .deleteWithResponse(
                "291bba3f-e0a5-47bc-a099-3bdcb2a50a05",
                "McppPurchases",
                "microsoftactionpack",
                com.azure.core.util.Context.NONE);
    }
}
```

### Membership_GetByResourceGroup

```java
/** Samples for Membership GetByResourceGroup. */
public final class MembershipGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mcpp/resource-manager/Microsoft.CloudPartnerProgramMembership/preview/2023-02-09-preview/examples/getMcppPurchaseDetails.json
     */
    /**
     * Sample code: getOperations.
     *
     * @param manager Entry point to McppManager.
     */
    public static void getOperations(com.azure.resourcemanager.mcpp.McppManager manager) {
        manager
            .memberships()
            .getByResourceGroupWithResponse(
                "291bba3f-e0a5-47bc-a099-3bdcb2a50a05",
                "McppPurchases",
                "microsoftactionpack",
                com.azure.core.util.Context.NONE);
    }
}
```

### MembershipByResourceGroup_List

```java
/** Samples for MembershipByResourceGroup List. */
public final class MembershipByResourceGroupListSamples {
    /*
     * x-ms-original-file: specification/mcpp/resource-manager/Microsoft.CloudPartnerProgramMembership/preview/2023-02-09-preview/examples/getMcppPurchaseDetailsList.json
     */
    /**
     * Sample code: getOperations.
     *
     * @param manager Entry point to McppManager.
     */
    public static void getOperations(com.azure.resourcemanager.mcpp.McppManager manager) {
        manager
            .membershipByResourceGroups()
            .listWithResponse(
                "291bba3f-e0a5-47bc-a099-3bdcb2a50a05", "McppPurchases", com.azure.core.util.Context.NONE);
    }
}
```

### MembershipBySubscription_List

```java
/** Samples for MembershipBySubscription List. */
public final class MembershipBySubscriptionListSamples {
    /*
     * x-ms-original-file: specification/mcpp/resource-manager/Microsoft.CloudPartnerProgramMembership/preview/2023-02-09-preview/examples/getMcppPurchaseDetailsForSubscription.json
     */
    /**
     * Sample code: getOperations.
     *
     * @param manager Entry point to McppManager.
     */
    public static void getOperations(com.azure.resourcemanager.mcpp.McppManager manager) {
        manager
            .membershipBySubscriptions()
            .listWithResponse("291bba3f-e0a5-47bc-a099-3bdcb2a50a05", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/mcpp/resource-manager/Microsoft.CloudPartnerProgramMembership/preview/2023-02-09-preview/examples/getOperations.json
     */
    /**
     * Sample code: getOperations.
     *
     * @param manager Entry point to McppManager.
     */
    public static void getOperations(com.azure.resourcemanager.mcpp.McppManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

