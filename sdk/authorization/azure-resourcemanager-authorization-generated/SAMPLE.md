# Code snippets and samples


## ClassicAdministrators

- [List](#classicadministrators_list)

## DenyAssignments

- [Get](#denyassignments_get)
- [GetById](#denyassignments_getbyid)
- [List](#denyassignments_list)
- [ListByResourceGroup](#denyassignments_listbyresourcegroup)
- [ListForResource](#denyassignments_listforresource)
- [ListForScope](#denyassignments_listforscope)

## EligibleChildResources

- [Get](#eligiblechildresources_get)

## GlobalAdministrator

- [ElevateAccess](#globaladministrator_elevateaccess)

## Permissions

- [ListByResourceGroup](#permissions_listbyresourcegroup)
- [ListForResource](#permissions_listforresource)

## ProviderOperationsMetadata

- [Get](#provideroperationsmetadata_get)
- [List](#provideroperationsmetadata_list)

## RoleAssignmentScheduleInstances

- [Get](#roleassignmentscheduleinstances_get)
- [ListForScope](#roleassignmentscheduleinstances_listforscope)

## RoleAssignmentScheduleRequests

- [Cancel](#roleassignmentschedulerequests_cancel)
- [Create](#roleassignmentschedulerequests_create)
- [Get](#roleassignmentschedulerequests_get)
- [ListForScope](#roleassignmentschedulerequests_listforscope)
- [Validate](#roleassignmentschedulerequests_validate)

## RoleAssignmentSchedules

- [Get](#roleassignmentschedules_get)
- [ListForScope](#roleassignmentschedules_listforscope)

## RoleAssignments

- [Create](#roleassignments_create)
- [CreateById](#roleassignments_createbyid)
- [Delete](#roleassignments_delete)
- [DeleteById](#roleassignments_deletebyid)
- [Get](#roleassignments_get)
- [GetById](#roleassignments_getbyid)
- [List](#roleassignments_list)
- [ListByResourceGroup](#roleassignments_listbyresourcegroup)
- [ListForResource](#roleassignments_listforresource)
- [ListForScope](#roleassignments_listforscope)

## RoleDefinitions

- [CreateOrUpdate](#roledefinitions_createorupdate)
- [Delete](#roledefinitions_delete)
- [Get](#roledefinitions_get)
- [GetById](#roledefinitions_getbyid)
- [List](#roledefinitions_list)

## RoleEligibilityScheduleInstances

- [Get](#roleeligibilityscheduleinstances_get)
- [ListForScope](#roleeligibilityscheduleinstances_listforscope)

## RoleEligibilityScheduleRequests

- [Cancel](#roleeligibilityschedulerequests_cancel)
- [Create](#roleeligibilityschedulerequests_create)
- [Get](#roleeligibilityschedulerequests_get)
- [ListForScope](#roleeligibilityschedulerequests_listforscope)
- [Validate](#roleeligibilityschedulerequests_validate)

## RoleEligibilitySchedules

- [Get](#roleeligibilityschedules_get)
- [ListForScope](#roleeligibilityschedules_listforscope)

## RoleManagementPolicies

- [Delete](#rolemanagementpolicies_delete)
- [Get](#rolemanagementpolicies_get)
- [ListForScope](#rolemanagementpolicies_listforscope)
- [Update](#rolemanagementpolicies_update)

## RoleManagementPolicyAssignments

- [Create](#rolemanagementpolicyassignments_create)
- [Delete](#rolemanagementpolicyassignments_delete)
- [Get](#rolemanagementpolicyassignments_get)
- [ListForScope](#rolemanagementpolicyassignments_listforscope)
### ClassicAdministrators_List

```java
import com.azure.core.util.Context;

/** Samples for ClassicAdministrators List. */
public final class ClassicAdministratorsListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2015-07-01/examples/GetClassicAdministrators.json
     */
    /**
     * Sample code: List classic administrators.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listClassicAdministrators(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.classicAdministrators().list(Context.NONE);
    }
}
```

### DenyAssignments_Get

```java
import com.azure.core.util.Context;

/** Samples for DenyAssignments Get. */
public final class DenyAssignmentsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetDenyAssignmentByNameId.json
     */
    /**
     * Sample code: Get deny assignment by name.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getDenyAssignmentByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .denyAssignments()
            .getWithResponse("subscriptions/subId/resourcegroups/rgname", "denyAssignmentId", Context.NONE);
    }
}
```

### DenyAssignments_GetById

```java
import com.azure.core.util.Context;

/** Samples for DenyAssignments GetById. */
public final class DenyAssignmentsGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetDenyAssignmentById.json
     */
    /**
     * Sample code: Get deny assignment by ID.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getDenyAssignmentByID(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .denyAssignments()
            .getByIdWithResponse(
                "subscriptions/subId/resourcegroups/rgname/providers/Microsoft.Authorization/denyAssignments/daId",
                Context.NONE);
    }
}
```

### DenyAssignments_List

```java
import com.azure.core.util.Context;

/** Samples for DenyAssignments List. */
public final class DenyAssignmentsListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetAllDenyAssignments.json
     */
    /**
     * Sample code: List deny assignments for subscription.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listDenyAssignmentsForSubscription(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.denyAssignments().list(null, Context.NONE);
    }
}
```

### DenyAssignments_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for DenyAssignments ListByResourceGroup. */
public final class DenyAssignmentsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetDenyAssignmentsForResourceGroup.json
     */
    /**
     * Sample code: List deny assignments for resource group.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listDenyAssignmentsForResourceGroup(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.denyAssignments().listByResourceGroup("rgname", null, Context.NONE);
    }
}
```

### DenyAssignments_ListForResource

```java
import com.azure.core.util.Context;

/** Samples for DenyAssignments ListForResource. */
public final class DenyAssignmentsListForResourceSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetDenyAssignmentsForResource.json
     */
    /**
     * Sample code: List deny assignments for resource.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listDenyAssignmentsForResource(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .denyAssignments()
            .listForResource(
                "rgname",
                "resourceProviderNamespace",
                "parentResourcePath",
                "resourceType",
                "resourceName",
                null,
                Context.NONE);
    }
}
```

### DenyAssignments_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for DenyAssignments ListForScope. */
public final class DenyAssignmentsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetDenyAssignmentByScope.json
     */
    /**
     * Sample code: List deny assignments for scope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listDenyAssignmentsForScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.denyAssignments().listForScope("subscriptions/subId", null, Context.NONE);
    }
}
```

### EligibleChildResources_Get

```java
import com.azure.core.util.Context;

/** Samples for EligibleChildResources Get. */
public final class EligibleChildResourcesGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetEligibleChildResourcesByScope.json
     */
    /**
     * Sample code: GetEligibleChildResourcesByScope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getEligibleChildResourcesByScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .eligibleChildResources()
            .get(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "resourceType eq 'resourcegroup'",
                Context.NONE);
    }
}
```

### GlobalAdministrator_ElevateAccess

```java
import com.azure.core.util.Context;

/** Samples for GlobalAdministrator ElevateAccess. */
public final class GlobalAdministratorElevateAccessSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2015-07-01/examples/ElevateAccess.json
     */
    /**
     * Sample code: Elevate access global administrator.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void elevateAccessGlobalAdministrator(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.globalAdministrators().elevateAccessWithResponse(Context.NONE);
    }
}
```

### Permissions_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Permissions ListByResourceGroup. */
public final class PermissionsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetPermissions.json
     */
    /**
     * Sample code: List permissions for resource group.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listPermissionsForResourceGroup(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.permissions().listByResourceGroup("rgname", Context.NONE);
    }
}
```

### Permissions_ListForResource

```java
import com.azure.core.util.Context;

/** Samples for Permissions ListForResource. */
public final class PermissionsListForResourceSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetResourcePermissions.json
     */
    /**
     * Sample code: List permissions for resource.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listPermissionsForResource(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .permissions()
            .listForResource(
                "rgname", "rpnamespace", "parentResourcePath", "resourceType", "resourceName", Context.NONE);
    }
}
```

### ProviderOperationsMetadata_Get

```java
import com.azure.core.util.Context;

/** Samples for ProviderOperationsMetadata Get. */
public final class ProviderOperationsMetadataGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetProviderOperationsRP.json
     */
    /**
     * Sample code: List provider operations metadata for resource provider.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listProviderOperationsMetadataForResourceProvider(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.providerOperationsMetadatas().getWithResponse("resourceProviderNamespace", null, Context.NONE);
    }
}
```

### ProviderOperationsMetadata_List

```java
import com.azure.core.util.Context;

/** Samples for ProviderOperationsMetadata List. */
public final class ProviderOperationsMetadataListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetAllProviderOperations.json
     */
    /**
     * Sample code: List provider operations metadata for all resource providers.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listProviderOperationsMetadataForAllResourceProviders(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.providerOperationsMetadatas().list(null, Context.NONE);
    }
}
```

### RoleAssignmentScheduleInstances_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignmentScheduleInstances Get. */
public final class RoleAssignmentScheduleInstancesGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleAssignmentScheduleInstanceByName.json
     */
    /**
     * Sample code: GetRoleAssignmentScheduleInstanceByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentScheduleInstanceByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleInstances()
            .getWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "ed9b8180-cef7-4c77-a63c-b8566ecfc412",
                Context.NONE);
    }
}
```

### RoleAssignmentScheduleInstances_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignmentScheduleInstances ListForScope. */
public final class RoleAssignmentScheduleInstancesListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleAssignmentScheduleInstancesByScope.json
     */
    /**
     * Sample code: GetRoleAssignmentScheduleInstancesByScope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentScheduleInstancesByScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleInstances()
            .listForScope(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "assignedTo('a3bb8764-cb92-4276-9d2a-ca1e895e55ea')",
                Context.NONE);
    }
}
```

### RoleAssignmentScheduleRequests_Cancel

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignmentScheduleRequests Cancel. */
public final class RoleAssignmentScheduleRequestsCancelSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/CancelRoleAssignmentScheduleRequestByName.json
     */
    /**
     * Sample code: CancelRoleAssignmentScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void cancelRoleAssignmentScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleRequests()
            .cancelWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "fea7a502-9a96-4806-a26f-eee560e52045",
                Context.NONE);
    }
}
```

### RoleAssignmentScheduleRequests_Create

```java
import com.azure.resourcemanager.authorization.generated.models.RequestType;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration;
import com.azure.resourcemanager.authorization.generated.models.Type;
import java.time.OffsetDateTime;

/** Samples for RoleAssignmentScheduleRequests Create. */
public final class RoleAssignmentScheduleRequestsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/PutRoleAssignmentScheduleRequest.json
     */
    /**
     * Sample code: PutRoleAssignmentScheduleRequest.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void putRoleAssignmentScheduleRequest(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleRequests()
            .define("fea7a502-9a96-4806-a26f-eee560e52045")
            .withExistingScope("providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f")
            .withRoleDefinitionId(
                "/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f/providers/Microsoft.Authorization/roleDefinitions/c8d4ff99-41c3-41a8-9f60-21dfdad59608")
            .withPrincipalId("a3bb8764-cb92-4276-9d2a-ca1e895e55ea")
            .withRequestType(RequestType.SELF_ACTIVATE)
            .withScheduleInfo(
                new RoleAssignmentScheduleRequestPropertiesScheduleInfo()
                    .withStartDateTime(OffsetDateTime.parse("2020-09-09T21:35:27.91Z"))
                    .withExpiration(
                        new RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration()
                            .withType(Type.AFTER_DURATION)
                            .withDuration("PT8H")))
            .withLinkedRoleEligibilityScheduleId("b1477448-2cc6-4ceb-93b4-54a202a89413")
            .withCondition(
                "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                    + " StringEqualsIgnoreCase 'foo_storage_container'")
            .withConditionVersion("1.0")
            .create();
    }
}
```

### RoleAssignmentScheduleRequests_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignmentScheduleRequests Get. */
public final class RoleAssignmentScheduleRequestsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleAssignmentScheduleRequestByName.json
     */
    /**
     * Sample code: GetRoleAssignmentScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleRequests()
            .getWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "fea7a502-9a96-4806-a26f-eee560e52045",
                Context.NONE);
    }
}
```

### RoleAssignmentScheduleRequests_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignmentScheduleRequests ListForScope. */
public final class RoleAssignmentScheduleRequestsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleAssignmentScheduleRequestByScope.json
     */
    /**
     * Sample code: GetRoleAssignmentScheduleRequestByScope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentScheduleRequestByScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleRequests()
            .listForScope(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "assignedTo('A3BB8764-CB92-4276-9D2A-CA1E895E55EA')",
                Context.NONE);
    }
}
```

### RoleAssignmentScheduleRequests_Validate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleAssignmentScheduleRequestInner;
import com.azure.resourcemanager.authorization.generated.models.RequestType;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration;
import com.azure.resourcemanager.authorization.generated.models.Type;
import java.time.OffsetDateTime;

/** Samples for RoleAssignmentScheduleRequests Validate. */
public final class RoleAssignmentScheduleRequestsValidateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/ValidateRoleAssignmentScheduleRequestByName.json
     */
    /**
     * Sample code: ValidateRoleAssignmentScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void validateRoleAssignmentScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentScheduleRequests()
            .validateWithResponse(
                "subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "fea7a502-9a96-4806-a26f-eee560e52045",
                new RoleAssignmentScheduleRequestInner()
                    .withRoleDefinitionId(
                        "/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f/providers/Microsoft.Authorization/roleDefinitions/c8d4ff99-41c3-41a8-9f60-21dfdad59608")
                    .withPrincipalId("a3bb8764-cb92-4276-9d2a-ca1e895e55ea")
                    .withRequestType(RequestType.SELF_ACTIVATE)
                    .withScheduleInfo(
                        new RoleAssignmentScheduleRequestPropertiesScheduleInfo()
                            .withStartDateTime(OffsetDateTime.parse("2020-09-09T21:35:27.91Z"))
                            .withExpiration(
                                new RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration()
                                    .withType(Type.AFTER_DURATION)
                                    .withDuration("PT8H")))
                    .withLinkedRoleEligibilityScheduleId("b1477448-2cc6-4ceb-93b4-54a202a89413")
                    .withCondition(
                        "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                            + " StringEqualsIgnoreCase 'foo_storage_container'")
                    .withConditionVersion("1.0"),
                Context.NONE);
    }
}
```

### RoleAssignmentSchedules_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignmentSchedules Get. */
public final class RoleAssignmentSchedulesGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleAssignmentScheduleByName.json
     */
    /**
     * Sample code: GetRoleAssignmentScheduleByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentScheduleByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentSchedules()
            .getWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "c9e264ff-3133-4776-a81a-ebc7c33c8ec6",
                Context.NONE);
    }
}
```

### RoleAssignmentSchedules_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignmentSchedules ListForScope. */
public final class RoleAssignmentSchedulesListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleAssignmentSchedulesByScope.json
     */
    /**
     * Sample code: GetRoleAssignmentSchedulesByScope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentSchedulesByScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignmentSchedules()
            .listForScope(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "assignedTo('a3bb8764-cb92-4276-9d2a-ca1e895e55ea')",
                Context.NONE);
    }
}
```

### RoleAssignments_Create

```java
import com.azure.resourcemanager.authorization.generated.models.PrincipalType;

/** Samples for RoleAssignments Create. */
public final class RoleAssignmentsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_CreateForSubscription.json
     */
    /**
     * Sample code: Create role assignment for subscription.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void createRoleAssignmentForSubscription(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .define("05c5a614-a7d6-4502-b150-c2fb455033ff")
            .withExistingScope("subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2")
            .withRoleDefinitionId(
                "/subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/providers/Microsoft.Authorization/roleDefinitions/0b5fe924-9a61-425c-96af-cfe6e287ca2d")
            .withPrincipalId("ce2ce14e-85d7-4629-bdbc-454d0519d987")
            .withPrincipalType(PrincipalType.USER)
            .create();
    }

    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_CreateForResourceGroup.json
     */
    /**
     * Sample code: Create role assignment for resource group.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void createRoleAssignmentForResourceGroup(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .define("05c5a614-a7d6-4502-b150-c2fb455033ff")
            .withExistingScope("subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/resourceGroups/testrg")
            .withRoleDefinitionId(
                "/subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/providers/Microsoft.Authorization/roleDefinitions/0b5fe924-9a61-425c-96af-cfe6e287ca2d")
            .withPrincipalId("ce2ce14e-85d7-4629-bdbc-454d0519d987")
            .withPrincipalType(PrincipalType.USER)
            .create();
    }

    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_CreateForResource.json
     */
    /**
     * Sample code: Create role assignment for resource.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void createRoleAssignmentForResource(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .define("05c5a614-a7d6-4502-b150-c2fb455033ff")
            .withExistingScope(
                "subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/resourceGroups/testrg/providers/Microsoft.DocumentDb/databaseAccounts/test-db-account")
            .withRoleDefinitionId(
                "/subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/providers/Microsoft.Authorization/roleDefinitions/0b5fe924-9a61-425c-96af-cfe6e287ca2d")
            .withPrincipalId("ce2ce14e-85d7-4629-bdbc-454d0519d987")
            .withPrincipalType(PrincipalType.USER)
            .create();
    }
}
```

### RoleAssignments_CreateById

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.models.PrincipalType;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentCreateParameters;

/** Samples for RoleAssignments CreateById. */
public final class RoleAssignmentsCreateByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_CreateById.json
     */
    /**
     * Sample code: Create or update role assignment by ID.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void createOrUpdateRoleAssignmentByID(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .createByIdWithResponse(
                "subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/providers/Microsoft.Authorization/roleAssignments/b0f43c54-e787-4862-89b1-a653fa9cf747",
                new RoleAssignmentCreateParameters()
                    .withRoleDefinitionId(
                        "/providers/Microsoft.Authorization/roleDefinitions/0b5fe924-9a61-425c-96af-cfe6e287ca2d")
                    .withPrincipalId("ce2ce14e-85d7-4629-bdbc-454d0519d987")
                    .withPrincipalType(PrincipalType.USER),
                Context.NONE);
    }
}
```

### RoleAssignments_Delete

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments Delete. */
public final class RoleAssignmentsDeleteSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_Delete.json
     */
    /**
     * Sample code: Delete role assignment.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteRoleAssignment(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .deleteWithResponse(
                "subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2",
                "b0f43c54-e787-4862-89b1-a653fa9cf747",
                null,
                Context.NONE);
    }
}
```

### RoleAssignments_DeleteById

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments DeleteById. */
public final class RoleAssignmentsDeleteByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_DeleteById.json
     */
    /**
     * Sample code: Delete role assignment by ID.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteRoleAssignmentByID(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .deleteByIdWithResponse(
                "subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/providers/Microsoft.Authorization/roleAssignments/b0f43c54-e787-4862-89b1-a653fa9cf747",
                null,
                Context.NONE);
    }
}
```

### RoleAssignments_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments Get. */
public final class RoleAssignmentsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_Get.json
     */
    /**
     * Sample code: Get role assignment by scope and name.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentByScopeAndName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .getWithResponse(
                "subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2",
                "b0f43c54-e787-4862-89b1-a653fa9cf747",
                null,
                Context.NONE);
    }
}
```

### RoleAssignments_GetById

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments GetById. */
public final class RoleAssignmentsGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_GetById.json
     */
    /**
     * Sample code: Get role assignment by ID.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentByID(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .getByIdWithResponse(
                "subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2/providers/Microsoft.Authorization/roleAssignments/b0f43c54-e787-4862-89b1-a653fa9cf747",
                null,
                Context.NONE);
    }
}
```

### RoleAssignments_List

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments List. */
public final class RoleAssignmentsListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_ListForSubscription.json
     */
    /**
     * Sample code: List role assignments for subscription.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listRoleAssignmentsForSubscription(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignments().list(null, null, Context.NONE);
    }
}
```

### RoleAssignments_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments ListByResourceGroup. */
public final class RoleAssignmentsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_ListForResourceGroup.json
     */
    /**
     * Sample code: List role assignments for resource group.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listRoleAssignmentsForResourceGroup(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignments().listByResourceGroup("testrg", null, null, Context.NONE);
    }
}
```

### RoleAssignments_ListForResource

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments ListForResource. */
public final class RoleAssignmentsListForResourceSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_ListForResource.json
     */
    /**
     * Sample code: List role assignments for a resource.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listRoleAssignmentsForAResource(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .listForResource(
                "testrg", "Microsoft.DocumentDb", "databaseAccounts", "test-db-account", null, null, Context.NONE);
    }
}
```

### RoleAssignments_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleAssignments ListForScope. */
public final class RoleAssignmentsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/RoleAssignments_ListForScope.json
     */
    /**
     * Sample code: List role assignments for scope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listRoleAssignmentsForScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleAssignments()
            .listForScope("subscriptions/a925f2f7-5c63-4b7b-8799-25a5f97bc3b2", null, null, null, Context.NONE);
    }
}
```

### RoleDefinitions_CreateOrUpdate

```java
/** Samples for RoleDefinitions CreateOrUpdate. */
public final class RoleDefinitionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/PutRoleDefinition.json
     */
    /**
     * Sample code: Create role definition.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void createRoleDefinition(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleDefinitions().define("roleDefinitionId").withExistingScope("scope").create();
    }
}
```

### RoleDefinitions_Delete

```java
import com.azure.core.util.Context;

/** Samples for RoleDefinitions Delete. */
public final class RoleDefinitionsDeleteSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/DeleteRoleDefinition.json
     */
    /**
     * Sample code: Delete role definition.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteRoleDefinition(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleDefinitions().deleteWithResponse("scope", "roleDefinitionId", Context.NONE);
    }
}
```

### RoleDefinitions_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleDefinitions Get. */
public final class RoleDefinitionsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetRoleDefinitionByName.json
     */
    /**
     * Sample code: Get role definition by name.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleDefinitionByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleDefinitions().getWithResponse("scope", "roleDefinitionId", Context.NONE);
    }
}
```

### RoleDefinitions_GetById

```java
import com.azure.core.util.Context;

/** Samples for RoleDefinitions GetById. */
public final class RoleDefinitionsGetByIdSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetRoleDefinitionById.json
     */
    /**
     * Sample code: Get role definition by ID.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleDefinitionByID(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleDefinitions().getByIdWithResponse("roleDefinitionId", Context.NONE);
    }
}
```

### RoleDefinitions_List

```java
import com.azure.core.util.Context;

/** Samples for RoleDefinitions List. */
public final class RoleDefinitionsListSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2022-04-01/examples/GetRoleDefinitionAtScope.json
     */
    /**
     * Sample code: List role definitions for scope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void listRoleDefinitionsForScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleDefinitions().list("scope", null, Context.NONE);
    }
}
```

### RoleEligibilityScheduleInstances_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleEligibilityScheduleInstances Get. */
public final class RoleEligibilityScheduleInstancesGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleEligibilityScheduleInstanceByName.json
     */
    /**
     * Sample code: GetRoleEligibilityScheduleInstanceByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleEligibilityScheduleInstanceByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleInstances()
            .getWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "21e4b59a-0499-4fe0-a3c3-43a3055b773a",
                Context.NONE);
    }
}
```

### RoleEligibilityScheduleInstances_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleEligibilityScheduleInstances ListForScope. */
public final class RoleEligibilityScheduleInstancesListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleEligibilityScheduleInstancesByScope.json
     */
    /**
     * Sample code: GetRoleEligibilityScheduleInstancesByScope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleEligibilityScheduleInstancesByScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleInstances()
            .listForScope(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "assignedTo('a3bb8764-cb92-4276-9d2a-ca1e895e55ea')",
                Context.NONE);
    }
}
```

### RoleEligibilityScheduleRequests_Cancel

```java
import com.azure.core.util.Context;

/** Samples for RoleEligibilityScheduleRequests Cancel. */
public final class RoleEligibilityScheduleRequestsCancelSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/CancelRoleEligibilityScheduleRequestByName.json
     */
    /**
     * Sample code: CancelRoleEligibilityScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void cancelRoleEligibilityScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleRequests()
            .cancelWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "64caffb6-55c0-4deb-a585-68e948ea1ad6",
                Context.NONE);
    }
}
```

### RoleEligibilityScheduleRequests_Create

```java
import com.azure.resourcemanager.authorization.generated.models.RequestType;
import com.azure.resourcemanager.authorization.generated.models.RoleEligibilityScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.generated.models.RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration;
import com.azure.resourcemanager.authorization.generated.models.Type;
import java.time.OffsetDateTime;

/** Samples for RoleEligibilityScheduleRequests Create. */
public final class RoleEligibilityScheduleRequestsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/PutRoleEligibilityScheduleRequest.json
     */
    /**
     * Sample code: PutRoleEligibilityScheduleRequest.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void putRoleEligibilityScheduleRequest(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleRequests()
            .define("64caffb6-55c0-4deb-a585-68e948ea1ad6")
            .withExistingScope("providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f")
            .withRoleDefinitionId(
                "/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f/providers/Microsoft.Authorization/roleDefinitions/c8d4ff99-41c3-41a8-9f60-21dfdad59608")
            .withPrincipalId("a3bb8764-cb92-4276-9d2a-ca1e895e55ea")
            .withRequestType(RequestType.ADMIN_ASSIGN)
            .withScheduleInfo(
                new RoleEligibilityScheduleRequestPropertiesScheduleInfo()
                    .withStartDateTime(OffsetDateTime.parse("2020-09-09T21:31:27.91Z"))
                    .withExpiration(
                        new RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration()
                            .withType(Type.AFTER_DURATION)
                            .withDuration("P365D")))
            .withCondition(
                "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                    + " StringEqualsIgnoreCase 'foo_storage_container'")
            .withConditionVersion("1.0")
            .create();
    }
}
```

### RoleEligibilityScheduleRequests_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleEligibilityScheduleRequests Get. */
public final class RoleEligibilityScheduleRequestsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleEligibilityScheduleRequestByName.json
     */
    /**
     * Sample code: GetRoleEligibilityScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleEligibilityScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleRequests()
            .getWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "64caffb6-55c0-4deb-a585-68e948ea1ad6",
                Context.NONE);
    }
}
```

### RoleEligibilityScheduleRequests_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleEligibilityScheduleRequests ListForScope. */
public final class RoleEligibilityScheduleRequestsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleEligibilityScheduleRequestByScope.json
     */
    /**
     * Sample code: GetRoleEligibilityScheduleRequestByScope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleEligibilityScheduleRequestByScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleRequests()
            .listForScope(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "assignedTo('A3BB8764-CB92-4276-9D2A-CA1E895E55EA')",
                Context.NONE);
    }
}
```

### RoleEligibilityScheduleRequests_Validate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleEligibilityScheduleRequestInner;
import com.azure.resourcemanager.authorization.generated.models.RequestType;
import com.azure.resourcemanager.authorization.generated.models.RoleEligibilityScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.generated.models.RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration;
import com.azure.resourcemanager.authorization.generated.models.Type;
import java.time.OffsetDateTime;

/** Samples for RoleEligibilityScheduleRequests Validate. */
public final class RoleEligibilityScheduleRequestsValidateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/ValidateRoleEligibilityScheduleRequestByName.json
     */
    /**
     * Sample code: ValidateRoleEligibilityScheduleRequestByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void validateRoleEligibilityScheduleRequestByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilityScheduleRequests()
            .validateWithResponse(
                "subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "64caffb6-55c0-4deb-a585-68e948ea1ad6",
                new RoleEligibilityScheduleRequestInner()
                    .withRoleDefinitionId(
                        "/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f/providers/Microsoft.Authorization/roleDefinitions/c8d4ff99-41c3-41a8-9f60-21dfdad59608")
                    .withPrincipalId("a3bb8764-cb92-4276-9d2a-ca1e895e55ea")
                    .withRequestType(RequestType.ADMIN_ASSIGN)
                    .withScheduleInfo(
                        new RoleEligibilityScheduleRequestPropertiesScheduleInfo()
                            .withStartDateTime(OffsetDateTime.parse("2020-09-09T21:31:27.91Z"))
                            .withExpiration(
                                new RoleEligibilityScheduleRequestPropertiesScheduleInfoExpiration()
                                    .withType(Type.AFTER_DURATION)
                                    .withDuration("P365D")))
                    .withCondition(
                        "@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName]"
                            + " StringEqualsIgnoreCase 'foo_storage_container'")
                    .withConditionVersion("1.0"),
                Context.NONE);
    }
}
```

### RoleEligibilitySchedules_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleEligibilitySchedules Get. */
public final class RoleEligibilitySchedulesGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleEligibilityScheduleByName.json
     */
    /**
     * Sample code: GetRoleEligibilityScheduleByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleEligibilityScheduleByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilitySchedules()
            .getWithResponse(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "b1477448-2cc6-4ceb-93b4-54a202a89413",
                Context.NONE);
    }
}
```

### RoleEligibilitySchedules_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleEligibilitySchedules ListForScope. */
public final class RoleEligibilitySchedulesListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleEligibilitySchedulesByScope.json
     */
    /**
     * Sample code: GetRoleEligibilitySchedulesByScope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleEligibilitySchedulesByScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleEligibilitySchedules()
            .listForScope(
                "providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f",
                "assignedTo('a3bb8764-cb92-4276-9d2a-ca1e895e55ea')",
                Context.NONE);
    }
}
```

### RoleManagementPolicies_Delete

```java
import com.azure.core.util.Context;

/** Samples for RoleManagementPolicies Delete. */
public final class RoleManagementPoliciesDeleteSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/DeleteRoleManagementPolicy.json
     */
    /**
     * Sample code: DeleteRoleManagementPolicy.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteRoleManagementPolicy(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleManagementPolicies()
            .deleteWithResponse(
                "providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368",
                "570c3619-7688-4b34-b290-2b8bb3ccab2a",
                Context.NONE);
    }
}
```

### RoleManagementPolicies_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleManagementPolicies Get. */
public final class RoleManagementPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleManagementPolicyByName.json
     */
    /**
     * Sample code: GetRoleManagementPolicyByName.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleManagementPolicyByName(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleManagementPolicies()
            .getWithResponse(
                "providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368",
                "570c3619-7688-4b34-b290-2b8bb3ccab2a",
                Context.NONE);
    }
}
```

### RoleManagementPolicies_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleManagementPolicies ListForScope. */
public final class RoleManagementPoliciesListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleManagementPolicyByScope.json
     */
    /**
     * Sample code: GetRoleManagementPolicyByRoleDefinitionFilter.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleManagementPolicyByRoleDefinitionFilter(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleManagementPolicies()
            .listForScope(
                "providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368", Context.NONE);
    }
}
```

### RoleManagementPolicies_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleManagementPolicyInner;
import com.azure.resourcemanager.authorization.generated.models.ApprovalMode;
import com.azure.resourcemanager.authorization.generated.models.ApprovalSettings;
import com.azure.resourcemanager.authorization.generated.models.ApprovalStage;
import com.azure.resourcemanager.authorization.generated.models.EnablementRules;
import com.azure.resourcemanager.authorization.generated.models.NotificationDeliveryMechanism;
import com.azure.resourcemanager.authorization.generated.models.NotificationLevel;
import com.azure.resourcemanager.authorization.generated.models.RecipientType;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyApprovalRule;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyAuthenticationContextRule;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyEnablementRule;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyExpirationRule;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyNotificationRule;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyRuleTarget;
import com.azure.resourcemanager.authorization.generated.models.UserSet;
import com.azure.resourcemanager.authorization.generated.models.UserType;
import java.util.Arrays;

/** Samples for RoleManagementPolicies Update. */
public final class RoleManagementPoliciesUpdateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/PatchPartialRoleManagementPolicy.json
     */
    /**
     * Sample code: PatchPartialRoleManagementPolicy.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void patchPartialRoleManagementPolicy(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleManagementPolicies()
            .updateWithResponse(
                "providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368",
                "570c3619-7688-4b34-b290-2b8bb3ccab2a",
                new RoleManagementPolicyInner()
                    .withRules(
                        Arrays
                            .asList(
                                new RoleManagementPolicyExpirationRule()
                                    .withId("Expiration_Admin_Eligibility")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Eligibility"))
                                    .withIsExpirationRequired(false)
                                    .withMaximumDuration("P180D"),
                                new RoleManagementPolicyNotificationRule()
                                    .withId("Notification_Admin_Admin_Eligibility")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Eligibility"))
                                    .withNotificationType(NotificationDeliveryMechanism.EMAIL)
                                    .withNotificationLevel(NotificationLevel.CRITICAL)
                                    .withRecipientType(RecipientType.ADMIN)
                                    .withNotificationRecipients(Arrays.asList("admin_admin_eligible@test.com"))
                                    .withIsDefaultRecipientsEnabled(false))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/PatchRoleManagementPolicy.json
     */
    /**
     * Sample code: PatchRoleManagementPolicy.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void patchRoleManagementPolicy(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleManagementPolicies()
            .updateWithResponse(
                "providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368",
                "570c3619-7688-4b34-b290-2b8bb3ccab2a",
                new RoleManagementPolicyInner()
                    .withRules(
                        Arrays
                            .asList(
                                new RoleManagementPolicyExpirationRule()
                                    .withId("Expiration_Admin_Eligibility")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Eligibility"))
                                    .withIsExpirationRequired(false)
                                    .withMaximumDuration("P180D"),
                                new RoleManagementPolicyNotificationRule()
                                    .withId("Notification_Admin_Admin_Eligibility")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Eligibility"))
                                    .withNotificationType(NotificationDeliveryMechanism.EMAIL)
                                    .withNotificationLevel(NotificationLevel.CRITICAL)
                                    .withRecipientType(RecipientType.ADMIN)
                                    .withNotificationRecipients(Arrays.asList("admin_admin_eligible@test.com"))
                                    .withIsDefaultRecipientsEnabled(false),
                                new RoleManagementPolicyNotificationRule()
                                    .withId("Notification_Requestor_Admin_Eligibility")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Eligibility"))
                                    .withNotificationType(NotificationDeliveryMechanism.EMAIL)
                                    .withNotificationLevel(NotificationLevel.CRITICAL)
                                    .withRecipientType(RecipientType.REQUESTOR)
                                    .withNotificationRecipients(Arrays.asList("requestor_admin_eligible@test.com"))
                                    .withIsDefaultRecipientsEnabled(false),
                                new RoleManagementPolicyNotificationRule()
                                    .withId("Notification_Approver_Admin_Eligibility")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Eligibility"))
                                    .withNotificationType(NotificationDeliveryMechanism.EMAIL)
                                    .withNotificationLevel(NotificationLevel.CRITICAL)
                                    .withRecipientType(RecipientType.APPROVER)
                                    .withNotificationRecipients(Arrays.asList("approver_admin_eligible@test.com"))
                                    .withIsDefaultRecipientsEnabled(false),
                                new RoleManagementPolicyEnablementRule()
                                    .withId("Enablement_Admin_Eligibility")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Eligibility"))
                                    .withEnabledRules(Arrays.asList()),
                                new RoleManagementPolicyExpirationRule()
                                    .withId("Expiration_Admin_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withIsExpirationRequired(false)
                                    .withMaximumDuration("P90D"),
                                new RoleManagementPolicyEnablementRule()
                                    .withId("Enablement_Admin_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withEnabledRules(
                                        Arrays
                                            .asList(
                                                EnablementRules.JUSTIFICATION,
                                                EnablementRules.MULTI_FACTOR_AUTHENTICATION)),
                                new RoleManagementPolicyNotificationRule()
                                    .withId("Notification_Admin_Admin_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withNotificationType(NotificationDeliveryMechanism.EMAIL)
                                    .withNotificationLevel(NotificationLevel.CRITICAL)
                                    .withRecipientType(RecipientType.ADMIN)
                                    .withNotificationRecipients(Arrays.asList("admin_admin_member@test.com"))
                                    .withIsDefaultRecipientsEnabled(false),
                                new RoleManagementPolicyNotificationRule()
                                    .withId("Notification_Requestor_Admin_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withNotificationType(NotificationDeliveryMechanism.EMAIL)
                                    .withNotificationLevel(NotificationLevel.CRITICAL)
                                    .withRecipientType(RecipientType.REQUESTOR)
                                    .withNotificationRecipients(Arrays.asList("requestor_admin_member@test.com"))
                                    .withIsDefaultRecipientsEnabled(false),
                                new RoleManagementPolicyNotificationRule()
                                    .withId("Notification_Approver_Admin_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("Admin")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withNotificationType(NotificationDeliveryMechanism.EMAIL)
                                    .withNotificationLevel(NotificationLevel.CRITICAL)
                                    .withRecipientType(RecipientType.APPROVER)
                                    .withNotificationRecipients(Arrays.asList("approver_admin_member@test.com"))
                                    .withIsDefaultRecipientsEnabled(false),
                                new RoleManagementPolicyExpirationRule()
                                    .withId("Expiration_EndUser_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("EndUser")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withIsExpirationRequired(true)
                                    .withMaximumDuration("PT7H"),
                                new RoleManagementPolicyEnablementRule()
                                    .withId("Enablement_EndUser_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("EndUser")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withEnabledRules(
                                        Arrays
                                            .asList(
                                                EnablementRules.JUSTIFICATION,
                                                EnablementRules.MULTI_FACTOR_AUTHENTICATION,
                                                EnablementRules.TICKETING)),
                                new RoleManagementPolicyApprovalRule()
                                    .withId("Approval_EndUser_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("EndUser")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withSetting(
                                        new ApprovalSettings()
                                            .withIsApprovalRequired(true)
                                            .withIsApprovalRequiredForExtension(false)
                                            .withIsRequestorJustificationRequired(true)
                                            .withApprovalMode(ApprovalMode.SINGLE_STAGE)
                                            .withApprovalStages(
                                                Arrays
                                                    .asList(
                                                        new ApprovalStage()
                                                            .withApprovalStageTimeOutInDays(1)
                                                            .withIsApproverJustificationRequired(true)
                                                            .withEscalationTimeInMinutes(0)
                                                            .withPrimaryApprovers(
                                                                Arrays
                                                                    .asList(
                                                                        new UserSet()
                                                                            .withUserType(UserType.GROUP)
                                                                            .withIsBackup(false)
                                                                            .withId(
                                                                                "2385b0f3-5fa9-43cf-8ca4-b01dc97298cd")
                                                                            .withDescription("amansw_new_group"),
                                                                        new UserSet()
                                                                            .withUserType(UserType.GROUP)
                                                                            .withIsBackup(false)
                                                                            .withId(
                                                                                "2f4913c9-d15b-406a-9946-1d66a28f2690")
                                                                            .withDescription("amansw_group")))
                                                            .withIsEscalationEnabled(false)))),
                                new RoleManagementPolicyAuthenticationContextRule()
                                    .withId("AuthenticationContext_EndUser_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("EndUser")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withIsEnabled(false)
                                    .withClaimValue(""),
                                new RoleManagementPolicyNotificationRule()
                                    .withId("Notification_Admin_EndUser_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("EndUser")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withNotificationType(NotificationDeliveryMechanism.EMAIL)
                                    .withNotificationLevel(NotificationLevel.CRITICAL)
                                    .withRecipientType(RecipientType.ADMIN)
                                    .withNotificationRecipients(Arrays.asList("admin_enduser_member@test.com"))
                                    .withIsDefaultRecipientsEnabled(false),
                                new RoleManagementPolicyNotificationRule()
                                    .withId("Notification_Requestor_EndUser_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("EndUser")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withNotificationType(NotificationDeliveryMechanism.EMAIL)
                                    .withNotificationLevel(NotificationLevel.CRITICAL)
                                    .withRecipientType(RecipientType.REQUESTOR)
                                    .withNotificationRecipients(Arrays.asList("requestor_enduser_member@test.com"))
                                    .withIsDefaultRecipientsEnabled(false),
                                new RoleManagementPolicyNotificationRule()
                                    .withId("Notification_Approver_EndUser_Assignment")
                                    .withTarget(
                                        new RoleManagementPolicyRuleTarget()
                                            .withCaller("EndUser")
                                            .withOperations(Arrays.asList("All"))
                                            .withLevel("Assignment"))
                                    .withNotificationType(NotificationDeliveryMechanism.EMAIL)
                                    .withNotificationLevel(NotificationLevel.CRITICAL)
                                    .withRecipientType(RecipientType.APPROVER)
                                    .withIsDefaultRecipientsEnabled(true))),
                Context.NONE);
    }
}
```

### RoleManagementPolicyAssignments_Create

```java
/** Samples for RoleManagementPolicyAssignments Create. */
public final class RoleManagementPolicyAssignmentsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/PutRoleManagementPolicyAssignment.json
     */
    /**
     * Sample code: PutRoleManagementPolicyAssignment.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void putRoleManagementPolicyAssignment(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleManagementPolicyAssignments()
            .define("b959d571-f0b5-4042-88a7-01be6cb22db9_a1705bd2-3a8f-45a5-8683-466fcfd5cc24")
            .withExistingScope("providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368")
            .withScope("/subscriptions/129ff972-28f8-46b8-a726-e497be039368")
            .withRoleDefinitionId(
                "/subscriptions/129ff972-28f8-46b8-a726-e497be039368/providers/Microsoft.Authorization/roleDefinitions/a1705bd2-3a8f-45a5-8683-466fcfd5cc24")
            .withPolicyId(
                "/subscriptions/129ff972-28f8-46b8-a726-e497be039368/providers/Microsoft.Authorization/roleManagementPolicies/b959d571-f0b5-4042-88a7-01be6cb22db9")
            .create();
    }
}
```

### RoleManagementPolicyAssignments_Delete

```java
import com.azure.core.util.Context;

/** Samples for RoleManagementPolicyAssignments Delete. */
public final class RoleManagementPolicyAssignmentsDeleteSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/DeleteRoleManagementPolicyAssignment.json
     */
    /**
     * Sample code: DeleteRoleManagementPolicyAssignment.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteRoleManagementPolicyAssignment(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleManagementPolicyAssignments()
            .deleteWithResponse(
                "providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368",
                "b959d571-f0b5-4042-88a7-01be6cb22db9_a1705bd2-3a8f-45a5-8683-466fcfd5cc24",
                Context.NONE);
    }
}
```

### RoleManagementPolicyAssignments_Get

```java
import com.azure.core.util.Context;

/** Samples for RoleManagementPolicyAssignments Get. */
public final class RoleManagementPolicyAssignmentsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleManagementPolicyAssignmentByName.json
     */
    /**
     * Sample code: GetConfigurations.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getConfigurations(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleManagementPolicyAssignments()
            .getWithResponse(
                "providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368",
                "b959d571-f0b5-4042-88a7-01be6cb22db9_a1705bd2-3a8f-45a5-8683-466fcfd5cc24",
                Context.NONE);
    }
}
```

### RoleManagementPolicyAssignments_ListForScope

```java
import com.azure.core.util.Context;

/** Samples for RoleManagementPolicyAssignments ListForScope. */
public final class RoleManagementPolicyAssignmentsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/stable/2020-10-01/examples/GetRoleManagementPolicyAssignmentByScope.json
     */
    /**
     * Sample code: GetRoleManagementPolicyAssignmentByScope.
     *
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleManagementPolicyAssignmentByScope(
        com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager
            .roleManagementPolicyAssignments()
            .listForScope(
                "providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368", Context.NONE);
    }
}
```

