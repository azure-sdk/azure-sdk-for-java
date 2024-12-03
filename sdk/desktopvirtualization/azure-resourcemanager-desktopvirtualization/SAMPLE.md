# Code snippets and samples


## ApplicationGroups

- [CreateOrUpdate](#applicationgroups_createorupdate)
- [Delete](#applicationgroups_delete)
- [GetByResourceGroup](#applicationgroups_getbyresourcegroup)
- [ListByResourceGroup](#applicationgroups_listbyresourcegroup)
- [ListBySubscription](#applicationgroups_listbysubscription)
- [Update](#applicationgroups_update)

## Applications

- [CreateOrUpdate](#applications_createorupdate)
- [Delete](#applications_delete)
- [Get](#applications_get)
- [List](#applications_list)
- [Update](#applications_update)

## Desktops

- [Get](#desktops_get)
- [List](#desktops_list)
- [Update](#desktops_update)

## HostPools

- [CreateOrUpdate](#hostpools_createorupdate)
- [Delete](#hostpools_delete)
- [GetByResourceGroup](#hostpools_getbyresourcegroup)
- [List](#hostpools_list)
- [ListByResourceGroup](#hostpools_listbyresourcegroup)
- [ListRegistrationTokens](#hostpools_listregistrationtokens)
- [RetrieveRegistrationToken](#hostpools_retrieveregistrationtoken)
- [Update](#hostpools_update)

## ScalingPlanPersonalSchedules

- [Create](#scalingplanpersonalschedules_create)
- [Delete](#scalingplanpersonalschedules_delete)
- [Get](#scalingplanpersonalschedules_get)
- [List](#scalingplanpersonalschedules_list)
- [Update](#scalingplanpersonalschedules_update)

## ScalingPlanPooledSchedules

- [Create](#scalingplanpooledschedules_create)
- [Delete](#scalingplanpooledschedules_delete)
- [Get](#scalingplanpooledschedules_get)
- [List](#scalingplanpooledschedules_list)
- [Update](#scalingplanpooledschedules_update)

## ScalingPlans

- [Create](#scalingplans_create)
- [Delete](#scalingplans_delete)
- [GetByResourceGroup](#scalingplans_getbyresourcegroup)
- [List](#scalingplans_list)
- [ListByResourceGroup](#scalingplans_listbyresourcegroup)
- [Update](#scalingplans_update)

## SessionHosts

- [Delete](#sessionhosts_delete)
- [Get](#sessionhosts_get)
- [List](#sessionhosts_list)
- [Update](#sessionhosts_update)

## UserSessions

- [Delete](#usersessions_delete)
- [Disconnect](#usersessions_disconnect)
- [Get](#usersessions_get)
- [List](#usersessions_list)
- [SendMessage](#usersessions_sendmessage)

## Workspaces

- [CreateOrUpdate](#workspaces_createorupdate)
- [Delete](#workspaces_delete)
- [GetByResourceGroup](#workspaces_getbyresourcegroup)
- [List](#workspaces_list)
- [ListByResourceGroup](#workspaces_listbyresourcegroup)
- [Update](#workspaces_update)
### ApplicationGroups_CreateOrUpdate

```java
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationGroupProperties;

/**
 * Samples for ApplicationGroups CreateOrUpdate.
 */
public final class ApplicationGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ApplicationGroups_CreateOrUpdate.json
     */
    /**
     * Sample code: ApplicationGroup_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        applicationGroupCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applicationGroups()
            .define("applicationGroup1")
            .withRegion((String) null)
            .withExistingResourceGroup("resourceGroup1")
            .withProperties((ApplicationGroupProperties) null)
            .create();
    }
}
```

### ApplicationGroups_Delete

```java
/**
 * Samples for ApplicationGroups Delete.
 */
public final class ApplicationGroupsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ApplicationGroups_Delete.json
     */
    /**
     * Sample code: ApplicationGroup_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        applicationGroupDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applicationGroups()
            .deleteByResourceGroupWithResponse("resourceGroup1", "applicationGroup1", com.azure.core.util.Context.NONE);
    }
}
```

### ApplicationGroups_GetByResourceGroup

```java
/**
 * Samples for ApplicationGroups GetByResourceGroup.
 */
public final class ApplicationGroupsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ApplicationGroups_Get.json
     */
    /**
     * Sample code: ApplicationGroup_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        applicationGroupGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applicationGroups()
            .getByResourceGroupWithResponse("resourceGroup1", "applicationGroup1", com.azure.core.util.Context.NONE);
    }
}
```

### ApplicationGroups_ListByResourceGroup

```java
/**
 * Samples for ApplicationGroups ListByResourceGroup.
 */
public final class ApplicationGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ApplicationGroups_ListByResourceGroup.json
     */
    /**
     * Sample code: ApplicationGroup_ListByResourceGroup.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationGroupListByResourceGroup(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applicationGroups()
            .listByResourceGroup("resourceGroup1", "applicationGroupType eq 'RailApplication'", 10, true, 0,
                com.azure.core.util.Context.NONE);
    }
}
```

### ApplicationGroups_ListBySubscription

```java
/**
 * Samples for ApplicationGroups ListBySubscription.
 */
public final class ApplicationGroupsListBySubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ApplicationGroups_ListBySubscription.json
     */
    /**
     * Sample code: ApplicationGroup_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        applicationGroupList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applicationGroups()
            .listBySubscription("applicationGroupType eq 'RailApplication'", com.azure.core.util.Context.NONE);
    }
}
```

### ApplicationGroups_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationGroup;

/**
 * Samples for ApplicationGroups Update.
 */
public final class ApplicationGroupsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ApplicationGroups_Update.json
     */
    /**
     * Sample code: ApplicationGroups_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        applicationGroupsUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        ApplicationGroup resource = manager.applicationGroups()
            .getByResourceGroupWithResponse("resourceGroup1", "applicationGroup1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### Applications_CreateOrUpdate

```java
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationProperties;

/**
 * Samples for Applications CreateOrUpdate.
 */
public final class ApplicationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Applications_CreateOrUpdate.json
     */
    /**
     * Sample code: Application_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        applicationCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applications()
            .define("application1")
            .withExistingApplicationGroup("resourceGroup1", "applicationGroup1")
            .withProperties((ApplicationProperties) null)
            .create();
    }
}
```

### Applications_Delete

```java
/**
 * Samples for Applications Delete.
 */
public final class ApplicationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Applications_Delete.json
     */
    /**
     * Sample code: Application_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        applicationDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applications()
            .deleteWithResponse("resourceGroup1", "applicationGroup1", "application1",
                com.azure.core.util.Context.NONE);
    }
}
```

### Applications_Get

```java
/**
 * Samples for Applications Get.
 */
public final class ApplicationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Applications_Get.json
     */
    /**
     * Sample code: Application_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        applicationGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applications()
            .getWithResponse("resourceGroup1", "applicationGroup1", "application1", com.azure.core.util.Context.NONE);
    }
}
```

### Applications_List

```java
/**
 * Samples for Applications List.
 */
public final class ApplicationsListSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Applications_List.json
     */
    /**
     * Sample code: Applications_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        applicationsList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applications()
            .list("resourceGroup1", "applicationGroup1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### Applications_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.Application;

/**
 * Samples for Applications Update.
 */
public final class ApplicationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Applications_Update.json
     */
    /**
     * Sample code: Application_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        applicationUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        Application resource = manager.applications()
            .getWithResponse("resourceGroup1", "applicationGroup1", "application1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### Desktops_Get

```java
/**
 * Samples for Desktops Get.
 */
public final class DesktopsGetSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Desktops_Get.json
     */
    /**
     * Sample code: Desktop_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        desktopGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.desktops()
            .getWithResponse("resourceGroup1", "applicationGroup1", "SessionDesktop", com.azure.core.util.Context.NONE);
    }
}
```

### Desktops_List

```java
/**
 * Samples for Desktops List.
 */
public final class DesktopsListSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Desktops_List.json
     */
    /**
     * Sample code: Desktop_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        desktopList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.desktops().list("resourceGroup1", "applicationGroup1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### Desktops_Update

```java

/**
 * Samples for Desktops Update.
 */
public final class DesktopsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Desktops_Update.json
     */
    /**
     * Sample code: Desktop_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        desktopUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.desktops()
            .updateWithResponse("resourceGroup1", "applicationGroup1", "SessionDesktop", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### HostPools_CreateOrUpdate

```java
import com.azure.resourcemanager.desktopvirtualization.fluent.models.HostPoolPropertiesInner;

/**
 * Samples for HostPools CreateOrUpdate.
 */
public final class HostPoolsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * HostPools_CreateOrUpdate.json
     */
    /**
     * Sample code: HostPool_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        hostPoolCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.hostPools()
            .define("hostPool1")
            .withRegion((String) null)
            .withExistingResourceGroup("resourceGroup1")
            .withProperties((HostPoolPropertiesInner) null)
            .create();
    }
}
```

### HostPools_Delete

```java
/**
 * Samples for HostPools Delete.
 */
public final class HostPoolsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * HostPools_Delete.json
     */
    /**
     * Sample code: HostPool_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        hostPoolDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.hostPools().deleteWithResponse("resourceGroup1", "hostPool1", true, com.azure.core.util.Context.NONE);
    }
}
```

### HostPools_GetByResourceGroup

```java
/**
 * Samples for HostPools GetByResourceGroup.
 */
public final class HostPoolsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * HostPools_Get.json
     */
    /**
     * Sample code: HostPool_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        hostPoolGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.hostPools()
            .getByResourceGroupWithResponse("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE);
    }
}
```

### HostPools_List

```java
/**
 * Samples for HostPools List.
 */
public final class HostPoolsListSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * HostPools_List.json
     */
    /**
     * Sample code: HostPool_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        hostPoolList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.hostPools().list(10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### HostPools_ListByResourceGroup

```java
/**
 * Samples for HostPools ListByResourceGroup.
 */
public final class HostPoolsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * HostPools_ListByResourceGroup.json
     */
    /**
     * Sample code: HostPool_ListByResourceGroup.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolListByResourceGroup(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.hostPools().listByResourceGroup("resourceGroup1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### HostPools_ListRegistrationTokens

```java
/**
 * Samples for HostPools ListRegistrationTokens.
 */
public final class HostPoolsListRegistrationTokensSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * HostPools_ListRegistrationTokens.json
     */
    /**
     * Sample code: HostPools_ListRegistrationToken_Post.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolsListRegistrationTokenPost(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.hostPools()
            .listRegistrationTokensWithResponse("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE);
    }
}
```

### HostPools_RetrieveRegistrationToken

```java
/**
 * Samples for HostPools RetrieveRegistrationToken.
 */
public final class HostPoolsRetrieveRegistrationTokenSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * HostPools_RetrieveRegistrationToken.json
     */
    /**
     * Sample code: HostPools_RetrieveRegistrationToken_Post.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolsRetrieveRegistrationTokenPost(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.hostPools()
            .retrieveRegistrationTokenWithResponse("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE);
    }
}
```

### HostPools_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.HostPool;

/**
 * Samples for HostPools Update.
 */
public final class HostPoolsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * HostPools_Update.json
     */
    /**
     * Sample code: HostPool_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        hostPoolUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        HostPool resource = manager.hostPools()
            .getByResourceGroupWithResponse("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### ScalingPlanPersonalSchedules_Create

```java
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPersonalScheduleProperties;

/**
 * Samples for ScalingPlanPersonalSchedules Create.
 */
public final class ScalingPlanPersonalSchedulesCreateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlanPersonalSchedules_Create.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesCreate(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPersonalSchedules()
            .define("scalingPlanScheduleWeekdays1")
            .withExistingScalingPlan("resourceGroup1", "scalingPlan1")
            .withProperties((ScalingPlanPersonalScheduleProperties) null)
            .create();
    }
}
```

### ScalingPlanPersonalSchedules_Delete

```java
/**
 * Samples for ScalingPlanPersonalSchedules Delete.
 */
public final class ScalingPlanPersonalSchedulesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlanPersonalSchedules_Delete.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesDelete(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPersonalSchedules()
            .deleteWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1",
                com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlanPersonalSchedules_Get

```java
/**
 * Samples for ScalingPlanPersonalSchedules Get.
 */
public final class ScalingPlanPersonalSchedulesGetSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlanPersonalSchedules_Get.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesGet(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPersonalSchedules()
            .getWithResponse("resourceGroup1", "PersonalScalingPlan1", "PersonalScalingPlanSchedule",
                com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlanPersonalSchedules_List

```java
/**
 * Samples for ScalingPlanPersonalSchedules List.
 */
public final class ScalingPlanPersonalSchedulesListSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlanPersonalSchedules_List.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesList(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPersonalSchedules()
            .list("resourceGroup1", "scalingPlan", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlanPersonalSchedules_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPersonalSchedule;

/**
 * Samples for ScalingPlanPersonalSchedules Update.
 */
public final class ScalingPlanPersonalSchedulesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlanPersonalSchedules_Update.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesUpdate(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        ScalingPlanPersonalSchedule resource = manager.scalingPlanPersonalSchedules()
            .getWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### ScalingPlanPooledSchedules_Create

```java
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPooledScheduleProperties;

/**
 * Samples for ScalingPlanPooledSchedules Create.
 */
public final class ScalingPlanPooledSchedulesCreateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlanPooledSchedules_Create.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesCreate(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPooledSchedules()
            .define("scalingPlanScheduleWeekdays1")
            .withExistingScalingPlan("resourceGroup1", "scalingPlan1")
            .withProperties((ScalingPlanPooledScheduleProperties) null)
            .create();
    }
}
```

### ScalingPlanPooledSchedules_Delete

```java
/**
 * Samples for ScalingPlanPooledSchedules Delete.
 */
public final class ScalingPlanPooledSchedulesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlanPooledSchedules_Delete.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesDelete(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPooledSchedules()
            .deleteWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1",
                com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlanPooledSchedules_Get

```java
/**
 * Samples for ScalingPlanPooledSchedules Get.
 */
public final class ScalingPlanPooledSchedulesGetSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlanPooledSchedules_Get.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesGet(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPooledSchedules()
            .getWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1",
                com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlanPooledSchedules_List

```java
/**
 * Samples for ScalingPlanPooledSchedules List.
 */
public final class ScalingPlanPooledSchedulesListSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlanPooledSchedules_List.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesList(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPooledSchedules()
            .list("resourceGroup1", "scalingPlan1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlanPooledSchedules_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPooledSchedule;

/**
 * Samples for ScalingPlanPooledSchedules Update.
 */
public final class ScalingPlanPooledSchedulesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlanPooledSchedules_Update.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesUpdate(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        ScalingPlanPooledSchedule resource = manager.scalingPlanPooledSchedules()
            .getWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### ScalingPlans_Create

```java
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanProperties;

/**
 * Samples for ScalingPlans Create.
 */
public final class ScalingPlansCreateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlans_Create.json
     */
    /**
     * Sample code: ScalingPlans_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        scalingPlansCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlans()
            .define("scalingPlan1")
            .withRegion((String) null)
            .withExistingResourceGroup("resourceGroup1")
            .withProperties((ScalingPlanProperties) null)
            .create();
    }
}
```

### ScalingPlans_Delete

```java
/**
 * Samples for ScalingPlans Delete.
 */
public final class ScalingPlansDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlans_Delete.json
     */
    /**
     * Sample code: ScalingPlans_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        scalingPlansDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlans()
            .deleteByResourceGroupWithResponse("resourceGroup1", "scalingPlan1", com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlans_GetByResourceGroup

```java
/**
 * Samples for ScalingPlans GetByResourceGroup.
 */
public final class ScalingPlansGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlans_Get.json
     */
    /**
     * Sample code: ScalingPlans_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        scalingPlansGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlans()
            .getByResourceGroupWithResponse("resourceGroup1", "scalingPlan1", com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlans_List

```java
/**
 * Samples for ScalingPlans List.
 */
public final class ScalingPlansListSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlans_ListBySubscription.json
     */
    /**
     * Sample code: ScalingPlans_ListBySubscription.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlansListBySubscription(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlans().list(10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlans_ListByResourceGroup

```java
/**
 * Samples for ScalingPlans ListByResourceGroup.
 */
public final class ScalingPlansListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlans_ListByResourceGroup.json
     */
    /**
     * Sample code: ScalingPlans_ListByResourceGroup.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlansListByResourceGroup(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlans().listByResourceGroup("resourceGroup1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlans_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlan;

/**
 * Samples for ScalingPlans Update.
 */
public final class ScalingPlansUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * ScalingPlans_Update.json
     */
    /**
     * Sample code: ScalingPlans_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        scalingPlansUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        ScalingPlan resource = manager.scalingPlans()
            .getByResourceGroupWithResponse("resourceGroup1", "scalingPlan1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### SessionHosts_Delete

```java
/**
 * Samples for SessionHosts Delete.
 */
public final class SessionHostsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * SessionHosts_Delete.json
     */
    /**
     * Sample code: SessionHost_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        sessionHostDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHosts()
            .deleteWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", true,
                com.azure.core.util.Context.NONE);
    }
}
```

### SessionHosts_Get

```java
/**
 * Samples for SessionHosts Get.
 */
public final class SessionHostsGetSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * SessionHosts_Get.json
     */
    /**
     * Sample code: SessionHost_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        sessionHostGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHosts()
            .getWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com",
                com.azure.core.util.Context.NONE);
    }
}
```

### SessionHosts_List

```java
/**
 * Samples for SessionHosts List.
 */
public final class SessionHostsListSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * SessionHosts_List.json
     */
    /**
     * Sample code: SessionHost_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        sessionHostList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHosts().list("resourceGroup1", "hostPool1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### SessionHosts_Update

```java

/**
 * Samples for SessionHosts Update.
 */
public final class SessionHostsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * SessionHosts_Update.json
     */
    /**
     * Sample code: SessionHost_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        sessionHostUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHosts()
            .updateWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", null, true,
                com.azure.core.util.Context.NONE);
    }
}
```

### UserSessions_Delete

```java
/**
 * Samples for UserSessions Delete.
 */
public final class UserSessionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * UserSessions_Delete.json
     */
    /**
     * Sample code: UserSession_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        userSessionDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.userSessions()
            .deleteWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", "1", true,
                com.azure.core.util.Context.NONE);
    }
}
```

### UserSessions_Disconnect

```java
/**
 * Samples for UserSessions Disconnect.
 */
public final class UserSessionsDisconnectSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * UserSessions_Disconnect.json
     */
    /**
     * Sample code: UserSession_Disconnect_Post.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void userSessionDisconnectPost(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.userSessions()
            .disconnectWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", "1",
                com.azure.core.util.Context.NONE);
    }
}
```

### UserSessions_Get

```java
/**
 * Samples for UserSessions Get.
 */
public final class UserSessionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * UserSessions_Get.json
     */
    /**
     * Sample code: UserSession_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        userSessionGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.userSessions()
            .getWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", "1",
                com.azure.core.util.Context.NONE);
    }
}
```

### UserSessions_List

```java
/**
 * Samples for UserSessions List.
 */
public final class UserSessionsListSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * UserSessions_List.json
     */
    /**
     * Sample code: UserSession_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        userSessionList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.userSessions()
            .list("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", 10, true, 0,
                com.azure.core.util.Context.NONE);
    }
}
```

### UserSessions_SendMessage

```java

/**
 * Samples for UserSessions SendMessage.
 */
public final class UserSessionsSendMessageSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * UserSessions_SendMessage.json
     */
    /**
     * Sample code: UserSession_SendMessage_Post.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void userSessionSendMessagePost(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.userSessions()
            .sendMessageWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", "1", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Workspaces_CreateOrUpdate

```java
/**
 * Samples for Workspaces CreateOrUpdate.
 */
public final class WorkspacesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Workspaces_CreateOrUpdate.json
     */
    /**
     * Sample code: Workspace_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        workspaceCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.workspaces()
            .define("workspace1")
            .withRegion((String) null)
            .withExistingResourceGroup("resourceGroup1")
            .create();
    }
}
```

### Workspaces_Delete

```java
/**
 * Samples for Workspaces Delete.
 */
public final class WorkspacesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Workspaces_Delete.json
     */
    /**
     * Sample code: Workspace_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        workspaceDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.workspaces()
            .deleteByResourceGroupWithResponse("resourceGroup1", "workspace1", com.azure.core.util.Context.NONE);
    }
}
```

### Workspaces_GetByResourceGroup

```java
/**
 * Samples for Workspaces GetByResourceGroup.
 */
public final class WorkspacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Workspaces_Get.json
     */
    /**
     * Sample code: Workspace_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        workspaceGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.workspaces()
            .getByResourceGroupWithResponse("resourceGroup1", "workspace1", com.azure.core.util.Context.NONE);
    }
}
```

### Workspaces_List

```java
/**
 * Samples for Workspaces List.
 */
public final class WorkspacesListSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Workspaces_ListBySubscription.json
     */
    /**
     * Sample code: Workspace_ListBySubscription.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void workspaceListBySubscription(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.workspaces().list(com.azure.core.util.Context.NONE);
    }
}
```

### Workspaces_ListByResourceGroup

```java
/**
 * Samples for Workspaces ListByResourceGroup.
 */
public final class WorkspacesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Workspaces_ListByResourceGroup.json
     */
    /**
     * Sample code: Workspace_ListByResourceGroup.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void workspaceListByResourceGroup(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.workspaces().listByResourceGroup("resourceGroup1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### Workspaces_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.Workspace;

/**
 * Samples for Workspaces Update.
 */
public final class WorkspacesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/stable/2024-09-10/examples/
     * Workspaces_Update.json
     */
    /**
     * Sample code: Workspace_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void
        workspaceUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        Workspace resource = manager.workspaces()
            .getByResourceGroupWithResponse("resourceGroup1", "workspace1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

