# Code snippets and samples


## ApplicationDefinitions

- [CreateOrUpdate](#applicationdefinitions_createorupdate)
- [CreateOrUpdateById](#applicationdefinitions_createorupdatebyid)
- [Delete](#applicationdefinitions_delete)
- [DeleteById](#applicationdefinitions_deletebyid)
- [GetById](#applicationdefinitions_getbyid)
- [GetByResourceGroup](#applicationdefinitions_getbyresourcegroup)
- [List](#applicationdefinitions_list)
- [ListByResourceGroup](#applicationdefinitions_listbyresourcegroup)
- [Update](#applicationdefinitions_update)
- [UpdateById](#applicationdefinitions_updatebyid)

## Applications

- [CreateOrUpdate](#applications_createorupdate)
- [CreateOrUpdateById](#applications_createorupdatebyid)
- [Delete](#applications_delete)
- [DeleteById](#applications_deletebyid)
- [GetById](#applications_getbyid)
- [GetByResourceGroup](#applications_getbyresourcegroup)
- [List](#applications_list)
- [ListAllowedUpgradePlans](#applications_listallowedupgradeplans)
- [ListByResourceGroup](#applications_listbyresourcegroup)
- [ListTokens](#applications_listtokens)
- [RefreshPermissions](#applications_refreshpermissions)
- [Update](#applications_update)
- [UpdateAccess](#applications_updateaccess)
- [UpdateById](#applications_updatebyid)

## JitRequests

- [CreateOrUpdate](#jitrequests_createorupdate)
- [Delete](#jitrequests_delete)
- [GetByResourceGroup](#jitrequests_getbyresourcegroup)
- [ListByResourceGroup](#jitrequests_listbyresourcegroup)
- [ListBySubscription](#jitrequests_listbysubscription)
- [Update](#jitrequests_update)

## ResourceProvider

- [ListOperations](#resourceprovider_listoperations)
### ApplicationDefinitions_CreateOrUpdate

```java
import com.azure.resourcemanager.solutions.models.ApplicationAuthorization;
import com.azure.resourcemanager.solutions.models.ApplicationLockLevel;
import java.util.Arrays;

/** Samples for ApplicationDefinitions CreateOrUpdate. */
public final class ApplicationDefinitionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/createOrUpdateApplicationDefinition.json
     */
    /**
     * Sample code: Create or update managed application definition.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void createOrUpdateManagedApplicationDefinition(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager
            .applicationDefinitions()
            .define("myManagedApplicationDef")
            .withRegion((String) null)
            .withExistingResourceGroup("rg")
            .withLockLevel(ApplicationLockLevel.NONE)
            .withDisplayName("myManagedApplicationDef")
            .withAuthorizations(
                Arrays
                    .asList(
                        new ApplicationAuthorization()
                            .withPrincipalId("validprincipalguid")
                            .withRoleDefinitionId("validroleguid")))
            .withDescription("myManagedApplicationDef description")
            .withPackageFileUri("https://path/to/packagezipfile")
            .create();
    }
}
```

### ApplicationDefinitions_CreateOrUpdateById

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.solutions.fluent.models.ApplicationDefinitionInner;
import com.azure.resourcemanager.solutions.models.ApplicationAuthorization;
import com.azure.resourcemanager.solutions.models.ApplicationLockLevel;
import java.util.Arrays;

/** Samples for ApplicationDefinitions CreateOrUpdateById. */
public final class ApplicationDefinitionsCreateOrUpdateByIdSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/createOrUpdateApplicationDefinition.json
     */
    /**
     * Sample code: Create or update managed application definition.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void createOrUpdateManagedApplicationDefinition(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager
            .applicationDefinitions()
            .createOrUpdateByIdWithResponse(
                "rg",
                "myManagedApplicationDef",
                new ApplicationDefinitionInner()
                    .withLockLevel(ApplicationLockLevel.NONE)
                    .withDisplayName("myManagedApplicationDef")
                    .withAuthorizations(
                        Arrays
                            .asList(
                                new ApplicationAuthorization()
                                    .withPrincipalId("validprincipalguid")
                                    .withRoleDefinitionId("validroleguid")))
                    .withDescription("myManagedApplicationDef description")
                    .withPackageFileUri("https://path/to/packagezipfile"),
                Context.NONE);
    }
}
```

### ApplicationDefinitions_Delete

```java
import com.azure.core.util.Context;

/** Samples for ApplicationDefinitions Delete. */
public final class ApplicationDefinitionsDeleteSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/deleteApplicationDefinition.json
     */
    /**
     * Sample code: delete managed application definition.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void deleteManagedApplicationDefinition(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applicationDefinitions().deleteWithResponse("rg", "myManagedApplicationDef", Context.NONE);
    }
}
```

### ApplicationDefinitions_DeleteById

```java
import com.azure.core.util.Context;

/** Samples for ApplicationDefinitions DeleteById. */
public final class ApplicationDefinitionsDeleteByIdSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/deleteApplicationDefinition.json
     */
    /**
     * Sample code: Deletes managed application definition.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void deletesManagedApplicationDefinition(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applicationDefinitions().deleteByIdWithResponse("rg", "myManagedApplicationDef", Context.NONE);
    }
}
```

### ApplicationDefinitions_GetById

```java
import com.azure.core.util.Context;

/** Samples for ApplicationDefinitions GetById. */
public final class ApplicationDefinitionsGetByIdSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/getApplicationDefinition.json
     */
    /**
     * Sample code: Get managed application definition.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void getManagedApplicationDefinition(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applicationDefinitions().getByIdWithResponse("rg", "myManagedApplicationDef", Context.NONE);
    }
}
```

### ApplicationDefinitions_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ApplicationDefinitions GetByResourceGroup. */
public final class ApplicationDefinitionsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/getApplicationDefinition.json
     */
    /**
     * Sample code: Get managed application definition.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void getManagedApplicationDefinition(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applicationDefinitions().getByResourceGroupWithResponse("rg", "myManagedApplicationDef", Context.NONE);
    }
}
```

### ApplicationDefinitions_List

```java
import com.azure.core.util.Context;

/** Samples for ApplicationDefinitions List. */
public final class ApplicationDefinitionsListSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/listApplicationDefinitionsBySubscription.json
     */
    /**
     * Sample code: Lists all the application definitions within a subscription.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void listsAllTheApplicationDefinitionsWithinASubscription(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applicationDefinitions().list(Context.NONE);
    }
}
```

### ApplicationDefinitions_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ApplicationDefinitions ListByResourceGroup. */
public final class ApplicationDefinitionsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/listApplicationDefinitionsByResourceGroup.json
     */
    /**
     * Sample code: Lists the managed application definitions in a resource group.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void listsTheManagedApplicationDefinitionsInAResourceGroup(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applicationDefinitions().listByResourceGroup("rg", Context.NONE);
    }
}
```

### ApplicationDefinitions_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.solutions.models.ApplicationDefinition;
import java.util.HashMap;
import java.util.Map;

/** Samples for ApplicationDefinitions Update. */
public final class ApplicationDefinitionsUpdateSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/updateApplicationDefinition.json
     */
    /**
     * Sample code: Update managed application definition.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void updateManagedApplicationDefinition(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        ApplicationDefinition resource =
            manager
                .applicationDefinitions()
                .getByResourceGroupWithResponse("rg", "myManagedApplicationDef", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("department", "Finance")).apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### ApplicationDefinitions_UpdateById

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.solutions.models.ApplicationDefinitionPatchable;
import java.util.HashMap;
import java.util.Map;

/** Samples for ApplicationDefinitions UpdateById. */
public final class ApplicationDefinitionsUpdateByIdSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/updateApplicationDefinition.json
     */
    /**
     * Sample code: Update managed application definition.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void updateManagedApplicationDefinition(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager
            .applicationDefinitions()
            .updateByIdWithResponse(
                "rg",
                "myManagedApplicationDef",
                new ApplicationDefinitionPatchable().withTags(mapOf("department", "Finance")),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### Applications_CreateOrUpdate

```java
/** Samples for Applications CreateOrUpdate. */
public final class ApplicationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/createOrUpdateApplication.json
     */
    /**
     * Sample code: Create or update managed application.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void createOrUpdateManagedApplication(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager
            .applications()
            .define("myManagedApplication")
            .withRegion((String) null)
            .withExistingResourceGroup("rg")
            .withKind("ServiceCatalog")
            .withManagedResourceGroupId("/subscriptions/subid/resourceGroups/myManagedRG")
            .withApplicationDefinitionId(
                "/subscriptions/subid/resourceGroups/rg/providers/Microsoft.Solutions/applicationDefinitions/myAppDef")
            .create();
    }
}
```

### Applications_CreateOrUpdateById

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.solutions.fluent.models.ApplicationInner;

/** Samples for Applications CreateOrUpdateById. */
public final class ApplicationsCreateOrUpdateByIdSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/createOrUpdateApplicationById.json
     */
    /**
     * Sample code: Creates or updates a managed application.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void createsOrUpdatesAManagedApplication(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager
            .applications()
            .createOrUpdateById(
                "subscriptions/subid/resourceGroups/rg/providers/Microsoft.Solutions/applications/myManagedApplication",
                new ApplicationInner()
                    .withKind("ServiceCatalog")
                    .withManagedResourceGroupId("/subscriptions/subid/resourceGroups/myManagedRG")
                    .withApplicationDefinitionId(
                        "/subscriptions/subid/resourceGroups/rg/providers/Microsoft.Solutions/applicationDefinitions/myAppDef"),
                Context.NONE);
    }
}
```

### Applications_Delete

```java
import com.azure.core.util.Context;

/** Samples for Applications Delete. */
public final class ApplicationsDeleteSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/deleteApplication.json
     */
    /**
     * Sample code: Delete managed application.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void deleteManagedApplication(com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applications().delete("rg", "myManagedApplication", Context.NONE);
    }
}
```

### Applications_DeleteById

```java
import com.azure.core.util.Context;

/** Samples for Applications DeleteById. */
public final class ApplicationsDeleteByIdSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/deleteApplicationById.json
     */
    /**
     * Sample code: Deletes the managed application.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void deletesTheManagedApplication(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager
            .applications()
            .deleteById(
                "subscriptions/subid/resourceGroups/rg/providers/Microsoft.Solutions/applications/myManagedApplication",
                Context.NONE);
    }
}
```

### Applications_GetById

```java
import com.azure.core.util.Context;

/** Samples for Applications GetById. */
public final class ApplicationsGetByIdSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/getApplicationById.json
     */
    /**
     * Sample code: Gets the managed application.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void getsTheManagedApplication(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager
            .applications()
            .getByIdWithResponse(
                "subscriptions/subid/resourceGroups/rg/providers/Microsoft.Solutions/applications/myManagedApplication",
                Context.NONE);
    }
}
```

### Applications_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Applications GetByResourceGroup. */
public final class ApplicationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/getApplication.json
     */
    /**
     * Sample code: Get a managed application.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void getAManagedApplication(com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applications().getByResourceGroupWithResponse("rg", "myManagedApplication", Context.NONE);
    }
}
```

### Applications_List

```java
import com.azure.core.util.Context;

/** Samples for Applications List. */
public final class ApplicationsListSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/listApplicationsByResourceGroup.json
     */
    /**
     * Sample code: Lists all the applications within a subscription.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void listsAllTheApplicationsWithinASubscription(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applications().list(Context.NONE);
    }
}
```

### Applications_ListAllowedUpgradePlans

```java
import com.azure.core.util.Context;

/** Samples for Applications ListAllowedUpgradePlans. */
public final class ApplicationsListAllowedUpgradePlansSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/listAllowedUpgradePlans.json
     */
    /**
     * Sample code: List allowed upgrade plans for application.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void listAllowedUpgradePlansForApplication(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applications().listAllowedUpgradePlansWithResponse("rg", "myManagedApplication", Context.NONE);
    }
}
```

### Applications_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Applications ListByResourceGroup. */
public final class ApplicationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/listApplicationsByResourceGroup.json
     */
    /**
     * Sample code: Lists all the applications within a resource group.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void listsAllTheApplicationsWithinAResourceGroup(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applications().listByResourceGroup("rg", Context.NONE);
    }
}
```

### Applications_ListTokens

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.solutions.models.ListTokenRequest;
import java.util.Arrays;

/** Samples for Applications ListTokens. */
public final class ApplicationsListTokensSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/listToken.json
     */
    /**
     * Sample code: List tokens for application.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void listTokensForApplication(com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager
            .applications()
            .listTokensWithResponse(
                "rg",
                "myManagedApplication",
                new ListTokenRequest()
                    .withAuthorizationAudience("authorizationAudience")
                    .withUserAssignedIdentities(Arrays.asList("IdentityOne", "IdentityTwo")),
                Context.NONE);
    }
}
```

### Applications_RefreshPermissions

```java
import com.azure.core.util.Context;

/** Samples for Applications RefreshPermissions. */
public final class ApplicationsRefreshPermissionsSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/refreshApplicationPermissions.json
     */
    /**
     * Sample code: Refresh managed application permissions.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void refreshManagedApplicationPermissions(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.applications().refreshPermissions("rg", "myManagedApplication", Context.NONE);
    }
}
```

### Applications_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.solutions.models.Application;

/** Samples for Applications Update. */
public final class ApplicationsUpdateSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/updateApplication.json
     */
    /**
     * Sample code: Updates managed application.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void updatesManagedApplication(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        Application resource =
            manager
                .applications()
                .getByResourceGroupWithResponse("rg", "myManagedApplication", Context.NONE)
                .getValue();
        resource
            .update()
            .withKind("ServiceCatalog")
            .withManagedResourceGroupId("/subscriptions/subid/resourceGroups/myManagedRG")
            .withApplicationDefinitionId(
                "/subscriptions/subid/resourceGroups/rg/providers/Microsoft.Solutions/applicationDefinitions/myAppDef")
            .apply();
    }
}
```

### Applications_UpdateAccess

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.solutions.fluent.models.UpdateAccessDefinitionInner;
import com.azure.resourcemanager.solutions.models.JitRequestMetadata;
import com.azure.resourcemanager.solutions.models.Status;
import com.azure.resourcemanager.solutions.models.Substatus;

/** Samples for Applications UpdateAccess. */
public final class ApplicationsUpdateAccessSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/updateAccess.json
     */
    /**
     * Sample code: Update access for application.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void updateAccessForApplication(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager
            .applications()
            .updateAccess(
                "rg",
                "myManagedApplication",
                new UpdateAccessDefinitionInner()
                    .withApprover("amauser")
                    .withMetadata(
                        new JitRequestMetadata()
                            .withOriginRequestId("originRequestId")
                            .withRequestorId("RequestorId")
                            .withTenantDisplayName("TenantDisplayName")
                            .withSubjectDisplayName("SubjectDisplayName"))
                    .withStatus(Status.ELEVATE)
                    .withSubStatus(Substatus.APPROVED),
                Context.NONE);
    }
}
```

### Applications_UpdateById

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.solutions.models.ApplicationPatchable;

/** Samples for Applications UpdateById. */
public final class ApplicationsUpdateByIdSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/updateApplicationById.json
     */
    /**
     * Sample code: Updates an existing managed application.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void updatesAnExistingManagedApplication(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager
            .applications()
            .updateById(
                "subscriptions/subid/resourceGroups/rg/providers/Microsoft.Solutions/applications/myManagedApplication",
                new ApplicationPatchable()
                    .withKind("ServiceCatalog")
                    .withManagedResourceGroupId("/subscriptions/subid/resourceGroups/myManagedRG")
                    .withApplicationDefinitionId(
                        "/subscriptions/subid/resourceGroups/rg/providers/Microsoft.Solutions/applicationDefinitions/myAppDef"),
                Context.NONE);
    }
}
```

### JitRequests_CreateOrUpdate

```java
import com.azure.resourcemanager.solutions.models.JitAuthorizationPolicies;
import com.azure.resourcemanager.solutions.models.JitSchedulingPolicy;
import com.azure.resourcemanager.solutions.models.JitSchedulingType;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for JitRequests CreateOrUpdate. */
public final class JitRequestsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/createOrUpdateJitRequest.json
     */
    /**
     * Sample code: Create or update jit request.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void createOrUpdateJitRequest(com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager
            .jitRequests()
            .define("myJitRequest")
            .withRegion((String) null)
            .withExistingResourceGroup("rg")
            .withApplicationResourceId(
                "/subscriptions/00c76877-e316-48a7-af60-4a09fec9d43f/resourceGroups/52F30DB2/providers/Microsoft.Solutions/applications/7E193158")
            .withJitAuthorizationPolicies(
                Arrays
                    .asList(
                        new JitAuthorizationPolicies()
                            .withPrincipalId("1db8e132e2934dbcb8e1178a61319491")
                            .withRoleDefinitionId("ecd05a23-931a-4c38-a52b-ac7c4c583334")))
            .withJitSchedulingPolicy(
                new JitSchedulingPolicy()
                    .withType(JitSchedulingType.ONCE)
                    .withDuration(Duration.parse("PT8H"))
                    .withStartTime(OffsetDateTime.parse("2021-04-22T05:48:30.6661804Z")))
            .create();
    }
}
```

### JitRequests_Delete

```java
import com.azure.core.util.Context;

/** Samples for JitRequests Delete. */
public final class JitRequestsDeleteSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/deleteJitRequest.json
     */
    /**
     * Sample code: Delete jit request.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void deleteJitRequest(com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.jitRequests().deleteWithResponse("rg", "myJitRequest", Context.NONE);
    }
}
```

### JitRequests_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for JitRequests GetByResourceGroup. */
public final class JitRequestsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/getJitRequest.json
     */
    /**
     * Sample code: Gets the jit request.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void getsTheJitRequest(com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.jitRequests().getByResourceGroupWithResponse("rg", "myJitRequest", Context.NONE);
    }
}
```

### JitRequests_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for JitRequests ListByResourceGroup. */
public final class JitRequestsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/listJitRequestsByResourceGroup.json
     */
    /**
     * Sample code: Lists all JIT requests within the resource group.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void listsAllJITRequestsWithinTheResourceGroup(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.jitRequests().listByResourceGroupWithResponse("rg", Context.NONE);
    }
}
```

### JitRequests_ListBySubscription

```java
import com.azure.core.util.Context;

/** Samples for JitRequests ListBySubscription. */
public final class JitRequestsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/listJitRequestsByResourceGroup.json
     */
    /**
     * Sample code: Lists all JIT requests within the subscription.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void listsAllJITRequestsWithinTheSubscription(
        com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.jitRequests().listBySubscriptionWithResponse(Context.NONE);
    }
}
```

### JitRequests_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.solutions.models.JitRequestDefinition;
import java.util.HashMap;
import java.util.Map;

/** Samples for JitRequests Update. */
public final class JitRequestsUpdateSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/updateJitRequest.json
     */
    /**
     * Sample code: Update jit request.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void updateJitRequest(com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        JitRequestDefinition resource =
            manager.jitRequests().getByResourceGroupWithResponse("rg", "myJitRequest", Context.NONE).getValue();
        resource.update().withTags(mapOf("department", "Finance")).apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### ResourceProvider_ListOperations

```java
import com.azure.core.util.Context;

/** Samples for ResourceProvider ListOperations. */
public final class ResourceProviderListOperationsSamples {
    /*
     * x-ms-original-file: specification/solutions/resource-manager/Microsoft.Solutions/stable/2021-07-01/examples/listSolutionsOperations.json
     */
    /**
     * Sample code: List Solutions operations.
     *
     * @param manager Entry point to ManagedApplicationManager.
     */
    public static void listSolutionsOperations(com.azure.resourcemanager.solutions.ManagedApplicationManager manager) {
        manager.resourceProviders().listOperations(Context.NONE);
    }
}
```

