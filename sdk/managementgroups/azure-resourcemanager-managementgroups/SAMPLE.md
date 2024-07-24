# Code snippets and samples


## EntitiesOperations

- [List](#entitiesoperations_list)

## HierarchySettingsOperationGroup

- [CreateOrUpdate](#hierarchysettingsoperationgroup_createorupdate)
- [Delete](#hierarchysettingsoperationgroup_delete)
- [Get](#hierarchysettingsoperationgroup_get)
- [List](#hierarchysettingsoperationgroup_list)
- [Update](#hierarchysettingsoperationgroup_update)

## ManagementGroups

- [CreateOrUpdate](#managementgroups_createorupdate)
- [Delete](#managementgroups_delete)
- [Get](#managementgroups_get)
- [GetDescendants](#managementgroups_getdescendants)
- [ListSettings](#managementgroups_listsettings)
- [Update](#managementgroups_update)

## Operations

- [List](#operations_list)

## ResourceProvider

- [CheckNameAvailability](#resourceprovider_checknameavailability)
- [StartTenantBackfill](#resourceprovider_starttenantbackfill)
- [TenantBackfillStatus](#resourceprovider_tenantbackfillstatus)

## SubscriptionUnderManagementGroups

- [Create](#subscriptionundermanagementgroups_create)
- [Delete](#subscriptionundermanagementgroups_delete)
- [GetSubscription](#subscriptionundermanagementgroups_getsubscription)
- [GetSubscriptionsUnderManagementGroup](#subscriptionundermanagementgroups_getsubscriptionsundermanagementgroup)
### EntitiesOperations_List

```java

/**
 * Samples for EntitiesOperations List.
 */
public final class EntitiesOperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/GetEntities.json
     */
    /**
     * Sample code: GetEntities.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void getEntities(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.entitiesOperations()
            .list(null, null, null, null, null, null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### HierarchySettingsOperationGroup_CreateOrUpdate

```java
import com.azure.resourcemanager.managementgroups.fluent.models.HierarchySettingsInner;
import com.azure.resourcemanager.managementgroups.models.HierarchySettingsProperties;

/**
 * Samples for HierarchySettingsOperationGroup CreateOrUpdate.
 */
public final class HierarchySettingsOperationGroupCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * PutHierarchySettings.json
     */
    /**
     * Sample code: PutHierarchySettings.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        putHierarchySettings(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.hierarchySettingsOperationGroups()
            .createOrUpdateWithResponse("root",
                new HierarchySettingsInner()
                    .withProperties(new HierarchySettingsProperties().withRequireAuthorizationForGroupCreation(true)
                        .withDefaultManagementGroup("/providers/Microsoft.Management/managementGroups/DefaultGroup")),
                com.azure.core.util.Context.NONE);
    }
}
```

### HierarchySettingsOperationGroup_Delete

```java
/**
 * Samples for HierarchySettingsOperationGroup Delete.
 */
public final class HierarchySettingsOperationGroupDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * DeleteHierarchySettings.json
     */
    /**
     * Sample code: DeleteHierarchySettings.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        deleteHierarchySettings(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.hierarchySettingsOperationGroups().deleteWithResponse("root", com.azure.core.util.Context.NONE);
    }
}
```

### HierarchySettingsOperationGroup_Get

```java
/**
 * Samples for HierarchySettingsOperationGroup Get.
 */
public final class HierarchySettingsOperationGroupGetSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * GetHierarchySettings.json
     */
    /**
     * Sample code: GetHierarchySettings.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        getHierarchySettings(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.hierarchySettingsOperationGroups().getWithResponse("root", com.azure.core.util.Context.NONE);
    }
}
```

### HierarchySettingsOperationGroup_List

```java
/**
 * Samples for HierarchySettingsOperationGroup List.
 */
public final class HierarchySettingsOperationGroupListSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ListHierarchySettings.json
     */
    /**
     * Sample code: ListHierarchySettings.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        listHierarchySettings(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.hierarchySettingsOperationGroups().list("root", com.azure.core.util.Context.NONE);
    }
}
```

### HierarchySettingsOperationGroup_Update

```java
import com.azure.resourcemanager.managementgroups.models.CreateOrUpdateSettingsProperties;
import com.azure.resourcemanager.managementgroups.models.CreateOrUpdateSettingsRequest;

/**
 * Samples for HierarchySettingsOperationGroup Update.
 */
public final class HierarchySettingsOperationGroupUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * PatchHierarchySettings.json
     */
    /**
     * Sample code: PatchHierarchySettings.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        patchHierarchySettings(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.hierarchySettingsOperationGroups()
            .updateWithResponse("root",
                new CreateOrUpdateSettingsRequest().withProperties(
                    new CreateOrUpdateSettingsProperties().withRequireAuthorizationForGroupCreation(true)
                        .withDefaultManagementGroup("/providers/Microsoft.Management/managementGroups/DefaultGroup")),
                com.azure.core.util.Context.NONE);
    }
}
```

### ManagementGroups_CreateOrUpdate

```java
import com.azure.resourcemanager.managementgroups.fluent.models.ManagementGroupInner;
import com.azure.resourcemanager.managementgroups.models.ManagementGroupDetails;
import com.azure.resourcemanager.managementgroups.models.ManagementGroupProperties;
import com.azure.resourcemanager.managementgroups.models.ParentGroupInfo;

/**
 * Samples for ManagementGroups CreateOrUpdate.
 */
public final class ManagementGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ManagementGroups_CreateOrUpdate.json
     */
    /**
     * Sample code: PutManagementGroup.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void putManagementGroup(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.managementGroups()
            .createOrUpdate("ChildGroup",
                new ManagementGroupInner().withProperties(new ManagementGroupProperties().withDisplayName("ChildGroup")
                    .withDetails(new ManagementGroupDetails().withParent(
                        new ParentGroupInfo().withId("/providers/Microsoft.Management/managementGroups/RootGroup")))),
                "no-cache", com.azure.core.util.Context.NONE);
    }
}
```

### ManagementGroups_Delete

```java
/**
 * Samples for ManagementGroups Delete.
 */
public final class ManagementGroupsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ManagementGroups_Delete.json
     */
    /**
     * Sample code: DeleteManagementGroup.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        deleteManagementGroup(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.managementGroups().delete("GroupToDelete", "no-cache", com.azure.core.util.Context.NONE);
    }
}
```

### ManagementGroups_Get

```java
import com.azure.resourcemanager.managementgroups.models.ManagementGroupExpandType;

/**
 * Samples for ManagementGroups Get.
 */
public final class ManagementGroupsGetSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ManagementGroups_Get_Get_Management_Group_With_Path.json
     */
    /**
     * Sample code: GetManagementGroupWithPath.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        getManagementGroupWithPath(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.managementGroups()
            .getWithResponse("20000000-0001-0000-0000-000000000000", ManagementGroupExpandType.PATH, null, null,
                "no-cache", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ManagementGroups_Get_Get_Management_Group_With_Ancestors.json
     */
    /**
     * Sample code: GetManagementGroupWithAncestors.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        getManagementGroupWithAncestors(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.managementGroups()
            .getWithResponse("20000000-0001-0000-0000-00000000000", ManagementGroupExpandType.ANCESTORS, null, null,
                "no-cache", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ManagementGroups_Get_Get_Management_Group_With_Expand.json
     */
    /**
     * Sample code: GetManagementGroupWithExpand.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        getManagementGroupWithExpand(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.managementGroups()
            .getWithResponse("20000000-0001-0000-0000-000000000000", ManagementGroupExpandType.CHILDREN, null, null,
                "no-cache", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ManagementGroups_Get_Get_Management_Group.json
     */
    /**
     * Sample code: GetManagementGroup.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void getManagementGroup(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.managementGroups()
            .getWithResponse("20000000-0001-0000-0000-000000000000", null, null, null, "no-cache",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ManagementGroups_Get_Get_Management_Groups_With_Expand_And_Recurse.json
     */
    /**
     * Sample code: GetManagementGroupsWithExpandAndRecurse.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void getManagementGroupsWithExpandAndRecurse(
        com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.managementGroups()
            .getWithResponse("20000000-0001-0000-0000-000000000000", ManagementGroupExpandType.CHILDREN, true, null,
                "no-cache", com.azure.core.util.Context.NONE);
    }
}
```

### ManagementGroups_GetDescendants

```java
/**
 * Samples for ManagementGroups GetDescendants.
 */
public final class ManagementGroupsGetDescendantsSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ManagementGroups_GetDescendants.json
     */
    /**
     * Sample code: GetDescendants.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void getDescendants(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.managementGroups()
            .getDescendants("20000000-0000-0000-0000-000000000000", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### ManagementGroups_ListSettings

```java
/**
 * Samples for ManagementGroups ListSettings.
 */
public final class ManagementGroupsListSettingsSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ListHierarchySettings.json
     */
    /**
     * Sample code: ListHierarchySettings.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        listHierarchySettings(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.managementGroups().listSettings("root", com.azure.core.util.Context.NONE);
    }
}
```

### ManagementGroups_Update

```java
import com.azure.resourcemanager.managementgroups.models.PatchManagementGroupRequest;

/**
 * Samples for ManagementGroups Update.
 */
public final class ManagementGroupsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ManagementGroups_Update.json
     */
    /**
     * Sample code: PatchManagementGroup.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        patchManagementGroup(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.managementGroups()
            .updateWithResponse("ChildGroup", new PatchManagementGroupRequest(), "no-cache",
                com.azure.core.util.Context.NONE);
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
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/ListOperations.
     * json
     */
    /**
     * Sample code: ListOperations.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void listOperations(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_CheckNameAvailability

```java
import com.azure.resourcemanager.managementgroups.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.managementgroups.models.CheckNameAvailabilityRequestType;
import com.azure.resourcemanager.managementgroups.models.ResourceProviderCheckNameAvailabilityRequestBody;

/**
 * Samples for ResourceProvider CheckNameAvailability.
 */
public final class ResourceProviderCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * ManagementGroups_CheckNameAvailability.json
     */
    /**
     * Sample code: CheckNameAvailability.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        checkNameAvailability(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.resourceProviders()
            .checkNameAvailabilityWithResponse(
                new ResourceProviderCheckNameAvailabilityRequestBody()
                    .withCheckNameAvailabilityRequest(new CheckNameAvailabilityRequest().withName("groupName")
                        .withType(CheckNameAvailabilityRequestType.MICROSOFT_MANAGEMENT_MANAGEMENT_GROUPS)),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_StartTenantBackfill

```java
/**
 * Samples for ResourceProvider StartTenantBackfill.
 */
public final class ResourceProviderStartTenantBackfillSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * StartTenantBackfillRequest.json
     */
    /**
     * Sample code: StartTenantBackfillRequest.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        startTenantBackfillRequest(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.resourceProviders().startTenantBackfillWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_TenantBackfillStatus

```java
/**
 * Samples for ResourceProvider TenantBackfillStatus.
 */
public final class ResourceProviderTenantBackfillStatusSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * TenantBackfillStatusRequest.json
     */
    /**
     * Sample code: TenantBackfillStatusRequest.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        tenantBackfillStatusRequest(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.resourceProviders().tenantBackfillStatusWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### SubscriptionUnderManagementGroups_Create

```java

/**
 * Samples for SubscriptionUnderManagementGroups Create.
 */
public final class SubscriptionUnderManagementGroupsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * AddManagementGroupSubscription.json
     */
    /**
     * Sample code: AddManagementGroupSubscription.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        addManagementGroupSubscription(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.subscriptionUnderManagementGroups()
            .createWithResponse("Group", "728bcbe4-8d56-4510-86c2-4921b8beefbc", "no-cache", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### SubscriptionUnderManagementGroups_Delete

```java
/**
 * Samples for SubscriptionUnderManagementGroups Delete.
 */
public final class SubscriptionUnderManagementGroupsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * RemoveManagementGroupSubscription.json
     */
    /**
     * Sample code: RemoveManagementGroupSubscription.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        removeManagementGroupSubscription(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.subscriptionUnderManagementGroups()
            .deleteWithResponse("Group", "728bcbe4-8d56-4510-86c2-4921b8beefbc", "no-cache",
                com.azure.core.util.Context.NONE);
    }
}
```

### SubscriptionUnderManagementGroups_GetSubscription

```java
/**
 * Samples for SubscriptionUnderManagementGroups GetSubscription.
 */
public final class SubscriptionUnderManagementGroupsGetSubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * GetSubscriptionFromManagementGroup.json
     */
    /**
     * Sample code: GetSubscriptionFromManagementGroup.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void
        getSubscriptionFromManagementGroup(com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.subscriptionUnderManagementGroups()
            .getSubscriptionWithResponse("Group", "728bcbe4-8d56-4510-86c2-4921b8beefbc", "no-cache",
                com.azure.core.util.Context.NONE);
    }
}
```

### SubscriptionUnderManagementGroups_GetSubscriptionsUnderManagementGroup

```java
/**
 * Samples for SubscriptionUnderManagementGroups GetSubscriptionsUnderManagementGroup.
 */
public final class SubscriptionUnderManagementGroupsGetSubscriptionsUnderManagementGroupSamples {
    /*
     * x-ms-original-file:
     * specification/managementgroups/resource-manager/Microsoft.Management/stable/2023-04-01/examples/
     * GetAllSubscriptionsFromManagementGroup.json
     */
    /**
     * Sample code: GetAllSubscriptionsFromManagementGroup.
     * 
     * @param manager Entry point to ManagementGroupsManager.
     */
    public static void getAllSubscriptionsFromManagementGroup(
        com.azure.resourcemanager.managementgroups.ManagementGroupsManager manager) {
        manager.subscriptionUnderManagementGroups()
            .getSubscriptionsUnderManagementGroup("Group", null, com.azure.core.util.Context.NONE);
    }
}
```

