# Code snippets and samples


## ApplicationDefinitions

- [CreateOrUpdate](#applicationdefinitions_createorupdate)
- [Delete](#applicationdefinitions_delete)
- [Get](#applicationdefinitions_get)
- [ListByResourceGroup](#applicationdefinitions_listbyresourcegroup)
- [ListBySubscription](#applicationdefinitions_listbysubscription)

## Applications

- [CreateOrUpdate](#applications_createorupdate)
- [Delete](#applications_delete)
- [Get](#applications_get)
- [ListByResourceGroup](#applications_listbyresourcegroup)
- [ListBySubscription](#applications_listbysubscription)
- [RefreshPermissions](#applications_refreshpermissions)
- [Update](#applications_update)

## ApplicationsDefinitions

- [Update](#applicationsdefinitions_update)

## JitRequests

- [CreateOrUpdate](#jitrequests_createorupdate)
- [Delete](#jitrequests_delete)
- [Get](#jitrequests_get)
- [ListByResourceGroup](#jitrequests_listbyresourcegroup)
- [ListBySubscription](#jitrequests_listbysubscription)
- [Update](#jitrequests_update)

## Operations

- [List](#operations_list)
### ApplicationDefinitions_CreateOrUpdate

```java
import com.azure.resourcemanager.ai.models.ApplicationAuthorization;
import com.azure.resourcemanager.ai.models.ApplicationLockLevel;
import java.util.Arrays;

/** Samples for ApplicationDefinitions CreateOrUpdate. */
public final class ApplicationDefinitionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/createOrUpdateApplicationDefinition.json
     */
    /**
     * Sample code: Create or update managed application definition.
     *
     * @param manager Entry point to AiManager.
     */
    public static void createOrUpdateManagedApplicationDefinition(com.azure.resourcemanager.ai.AiManager manager) {
        manager
            .applicationDefinitions()
            .define("myManagedApplicationDef")
            .withExistingLocation("rg", "westus")
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

### ApplicationDefinitions_Delete

```java
import com.azure.core.util.Context;

/** Samples for ApplicationDefinitions Delete. */
public final class ApplicationDefinitionsDeleteSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/deleteApplicationDefinition.json
     */
    /**
     * Sample code: Delete managed application.
     *
     * @param manager Entry point to AiManager.
     */
    public static void deleteManagedApplication(com.azure.resourcemanager.ai.AiManager manager) {
        manager.applicationDefinitions().delete("rg", "myManagedApplicationDef", "westus", Context.NONE);
    }
}
```

### ApplicationDefinitions_Get

```java
import com.azure.core.util.Context;

/** Samples for ApplicationDefinitions Get. */
public final class ApplicationDefinitionsGetSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/getApplicationDefinition.json
     */
    /**
     * Sample code: Get managed application definition.
     *
     * @param manager Entry point to AiManager.
     */
    public static void getManagedApplicationDefinition(com.azure.resourcemanager.ai.AiManager manager) {
        manager.applicationDefinitions().getWithResponse("rg", "myManagedApplicationDef", "westus", Context.NONE);
    }
}
```

### ApplicationDefinitions_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for ApplicationDefinitions ListByResourceGroup. */
public final class ApplicationDefinitionsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/listApplicationDefinitionsByResourceGroup.json
     */
    /**
     * Sample code: List managed application definitions.
     *
     * @param manager Entry point to AiManager.
     */
    public static void listManagedApplicationDefinitions(com.azure.resourcemanager.ai.AiManager manager) {
        manager.applicationDefinitions().listByResourceGroup("rg", "westus", Context.NONE);
    }
}
```

### ApplicationDefinitions_ListBySubscription

```java
import com.azure.core.util.Context;

/** Samples for ApplicationDefinitions ListBySubscription. */
public final class ApplicationDefinitionsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/listApplicationDefinitionsBySubscription.json
     */
    /**
     * Sample code: Lists applications definitions by subscription.
     *
     * @param manager Entry point to AiManager.
     */
    public static void listsApplicationsDefinitionsBySubscription(com.azure.resourcemanager.ai.AiManager manager) {
        manager.applicationDefinitions().listBySubscription("westus", Context.NONE);
    }
}
```

### Applications_CreateOrUpdate

```java
/** Samples for Applications CreateOrUpdate. */
public final class ApplicationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/createOrUpdateApplication.json
     */
    /**
     * Sample code: Create or update managed application.
     *
     * @param manager Entry point to AiManager.
     */
    public static void createOrUpdateManagedApplication(com.azure.resourcemanager.ai.AiManager manager) {
        manager
            .applications()
            .define("myManagedApplication")
            .withExistingLocation("rg", "westus")
            .withKind("ServiceCatalog")
            .withManagedResourceGroupId("/subscriptions/subid/resourceGroups/myManagedRG")
            .withApplicationDefinitionId(
                "/subscriptions/subid/resourceGroups/rg/providers/Microsoft.AI/applicationDefinitions/myAppDef")
            .create();
    }
}
```

### Applications_Delete

```java
import com.azure.core.util.Context;

/** Samples for Applications Delete. */
public final class ApplicationsDeleteSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/deleteApplication.json
     */
    /**
     * Sample code: Delete a managed application.
     *
     * @param manager Entry point to AiManager.
     */
    public static void deleteAManagedApplication(com.azure.resourcemanager.ai.AiManager manager) {
        manager.applications().delete("rg", "myManagedApplication", "westus", Context.NONE);
    }
}
```

### Applications_Get

```java
import com.azure.core.util.Context;

/** Samples for Applications Get. */
public final class ApplicationsGetSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/getApplication.json
     */
    /**
     * Sample code: Get a managed application.
     *
     * @param manager Entry point to AiManager.
     */
    public static void getAManagedApplication(com.azure.resourcemanager.ai.AiManager manager) {
        manager.applications().getWithResponse("rg", "myManagedApplication", "westus", Context.NONE);
    }
}
```

### Applications_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Applications ListByResourceGroup. */
public final class ApplicationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/listApplicationsByResourceGroup.json
     */
    /**
     * Sample code: Lists applications by Resource Group.
     *
     * @param manager Entry point to AiManager.
     */
    public static void listsApplicationsByResourceGroup(com.azure.resourcemanager.ai.AiManager manager) {
        manager.applications().listByResourceGroup("rg", "westus", Context.NONE);
    }
}
```

### Applications_ListBySubscription

```java
import com.azure.core.util.Context;

/** Samples for Applications ListBySubscription. */
public final class ApplicationsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/listApplicationsByResourceGroup.json
     */
    /**
     * Sample code: Lists applications by Subscription.
     *
     * @param manager Entry point to AiManager.
     */
    public static void listsApplicationsBySubscription(com.azure.resourcemanager.ai.AiManager manager) {
        manager.applications().listBySubscription("westus", Context.NONE);
    }
}
```

### Applications_RefreshPermissions

```java
import com.azure.core.util.Context;

/** Samples for Applications RefreshPermissions. */
public final class ApplicationsRefreshPermissionsSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/patchRefreshPermissions.json
     */
    /**
     * Sample code: Get refresh permission.
     *
     * @param manager Entry point to AiManager.
     */
    public static void getRefreshPermission(com.azure.resourcemanager.ai.AiManager manager) {
        manager.applications().refreshPermissions("rg", "applicationName", "westus", Context.NONE);
    }
}
```

### Applications_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.ai.models.Application;

/** Samples for Applications Update. */
public final class ApplicationsUpdateSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/patchApplication.json
     */
    /**
     * Sample code: Update managed application.
     *
     * @param manager Entry point to AiManager.
     */
    public static void updateManagedApplication(com.azure.resourcemanager.ai.AiManager manager) {
        Application resource =
            manager.applications().getWithResponse("rg", "myManagedApplication", "westus", Context.NONE).getValue();
        resource.update().apply();
    }
}
```

### ApplicationsDefinitions_Update

```java
import com.azure.core.util.Context;

/** Samples for ApplicationsDefinitions Update. */
public final class ApplicationsDefinitionsUpdateSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/patchApplicationDefinition.json
     */
    /**
     * Sample code: Update managed application.
     *
     * @param manager Entry point to AiManager.
     */
    public static void updateManagedApplication(com.azure.resourcemanager.ai.AiManager manager) {
        manager.applicationsDefinitions().update("rg", "myManagedApplication", "westus", null, Context.NONE);
    }
}
```

### JitRequests_CreateOrUpdate

```java
/** Samples for JitRequests CreateOrUpdate. */
public final class JitRequestsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/putJitRequest.json
     */
    /**
     * Sample code: Put applications.
     *
     * @param manager Entry point to AiManager.
     */
    public static void putApplications(com.azure.resourcemanager.ai.AiManager manager) {
        manager.jitRequests().define("jitRequest").withExistingLocation("rg", "westus").create();
    }
}
```

### JitRequests_Delete

```java
import com.azure.core.util.Context;

/** Samples for JitRequests Delete. */
public final class JitRequestsDeleteSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/deleteJitRequest.json
     */
    /**
     * Sample code: Delete applications.
     *
     * @param manager Entry point to AiManager.
     */
    public static void deleteApplications(com.azure.resourcemanager.ai.AiManager manager) {
        manager.jitRequests().deleteWithResponse("rg", "jitRequest", "westus", Context.NONE);
    }
}
```

### JitRequests_Get

```java
import com.azure.core.util.Context;

/** Samples for JitRequests Get. */
public final class JitRequestsGetSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/getJitRequest.json
     */
    /**
     * Sample code: Get Jit Request.
     *
     * @param manager Entry point to AiManager.
     */
    public static void getJitRequest(com.azure.resourcemanager.ai.AiManager manager) {
        manager.jitRequests().getWithResponse("rg", "jitRequest", "westus", Context.NONE);
    }
}
```

### JitRequests_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for JitRequests ListByResourceGroup. */
public final class JitRequestsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/getJitRequestByResourceGroup.json
     */
    /**
     * Sample code: Get Jit Request by Resource Group.
     *
     * @param manager Entry point to AiManager.
     */
    public static void getJitRequestByResourceGroup(com.azure.resourcemanager.ai.AiManager manager) {
        manager.jitRequests().listByResourceGroup("rg", "westus", Context.NONE);
    }
}
```

### JitRequests_ListBySubscription

```java
import com.azure.core.util.Context;

/** Samples for JitRequests ListBySubscription. */
public final class JitRequestsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/getJitRequestBySubscription.json
     */
    /**
     * Sample code: Get Jit Request by Subscription.
     *
     * @param manager Entry point to AiManager.
     */
    public static void getJitRequestBySubscription(com.azure.resourcemanager.ai.AiManager manager) {
        manager.jitRequests().listBySubscription("westus", Context.NONE);
    }
}
```

### JitRequests_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.ai.models.JitRequestDefinition;

/** Samples for JitRequests Update. */
public final class JitRequestsUpdateSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/patchJitRequest.json
     */
    /**
     * Sample code: Patch Jit Request.
     *
     * @param manager Entry point to AiManager.
     */
    public static void patchJitRequest(com.azure.resourcemanager.ai.AiManager manager) {
        JitRequestDefinition resource =
            manager.jitRequests().getWithResponse("rg", "jitRequest", "westus", Context.NONE).getValue();
        resource.update().apply();
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/ai/resource-manager/Microsoft.AI/stable/2022-08-02/examples/listSolutionsOperations.json
     */
    /**
     * Sample code: List Solutions operations.
     *
     * @param manager Entry point to AiManager.
     */
    public static void listSolutionsOperations(com.azure.resourcemanager.ai.AiManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

