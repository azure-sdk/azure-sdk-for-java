# Code snippets and samples


## ActiveSessionHostConfigurations

- [Get](#activesessionhostconfigurations_get)
- [ListByHostPool](#activesessionhostconfigurations_listbyhostpool)

## AppAttachPackage

- [CreateOrUpdate](#appattachpackage_createorupdate)
- [Delete](#appattachpackage_delete)
- [GetByResourceGroup](#appattachpackage_getbyresourcegroup)
- [List](#appattachpackage_list)
- [ListByResourceGroup](#appattachpackage_listbyresourcegroup)
- [Update](#appattachpackage_update)

## AppAttachPackageInfo

- [ImportMethod](#appattachpackageinfo_importmethod)

## ApplicationGroups

- [CreateOrUpdate](#applicationgroups_createorupdate)
- [Delete](#applicationgroups_delete)
- [GetByResourceGroup](#applicationgroups_getbyresourcegroup)
- [List](#applicationgroups_list)
- [ListByResourceGroup](#applicationgroups_listbyresourcegroup)
- [Update](#applicationgroups_update)

## Applications

- [CreateOrUpdate](#applications_createorupdate)
- [Delete](#applications_delete)
- [Get](#applications_get)
- [List](#applications_list)
- [Update](#applications_update)

## ControlSessionHostUpdate

- [Post](#controlsessionhostupdate_post)

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
- [RetrieveRegistrationToken](#hostpools_retrieveregistrationtoken)
- [Update](#hostpools_update)

## InitiateSessionHostUpdate

- [Post](#initiatesessionhostupdate_post)

## MsixImages

- [Expand](#msiximages_expand)

## MsixPackages

- [CreateOrUpdate](#msixpackages_createorupdate)
- [Delete](#msixpackages_delete)
- [Get](#msixpackages_get)
- [List](#msixpackages_list)
- [Update](#msixpackages_update)

## Operations

- [List](#operations_list)

## PrivateEndpointConnections

- [DeleteByHostPool](#privateendpointconnections_deletebyhostpool)
- [DeleteByWorkspace](#privateendpointconnections_deletebyworkspace)
- [GetByHostPool](#privateendpointconnections_getbyhostpool)
- [GetByWorkspace](#privateendpointconnections_getbyworkspace)
- [ListByHostPool](#privateendpointconnections_listbyhostpool)
- [ListByWorkspace](#privateendpointconnections_listbyworkspace)
- [UpdateByHostPool](#privateendpointconnections_updatebyhostpool)
- [UpdateByWorkspace](#privateendpointconnections_updatebyworkspace)

## PrivateLinkResources

- [ListByHostPool](#privatelinkresources_listbyhostpool)
- [ListByWorkspace](#privatelinkresources_listbyworkspace)

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
- [ListByHostPool](#scalingplans_listbyhostpool)
- [ListByResourceGroup](#scalingplans_listbyresourcegroup)
- [Update](#scalingplans_update)

## SessionHostConfigurations

- [CreateOrUpdate](#sessionhostconfigurations_createorupdate)
- [Get](#sessionhostconfigurations_get)
- [ListByHostPool](#sessionhostconfigurations_listbyhostpool)
- [Update](#sessionhostconfigurations_update)

## SessionHostConfigurationsOperationStatus

- [Get](#sessionhostconfigurationsoperationstatus_get)
- [List](#sessionhostconfigurationsoperationstatus_list)

## SessionHostManagements

- [CreateOrUpdate](#sessionhostmanagements_createorupdate)
- [Get](#sessionhostmanagements_get)
- [ListByHostPool](#sessionhostmanagements_listbyhostpool)
- [Update](#sessionhostmanagements_update)

## SessionHostManagementsOperationStatus

- [Get](#sessionhostmanagementsoperationstatus_get)
- [List](#sessionhostmanagementsoperationstatus_list)

## SessionHostOperation

- [RetryProvisioning](#sessionhostoperation_retryprovisioning)

## SessionHosts

- [Delete](#sessionhosts_delete)
- [Get](#sessionhosts_get)
- [List](#sessionhosts_list)
- [Update](#sessionhosts_update)

## StartMenuItems

- [List](#startmenuitems_list)

## UserSessions

- [Delete](#usersessions_delete)
- [Disconnect](#usersessions_disconnect)
- [Get](#usersessions_get)
- [List](#usersessions_list)
- [ListByHostPool](#usersessions_listbyhostpool)
- [SendMessage](#usersessions_sendmessage)

## ValidateSessionHostUpdate

- [Post](#validatesessionhostupdate_post)

## Workspaces

- [CreateOrUpdate](#workspaces_createorupdate)
- [Delete](#workspaces_delete)
- [GetByResourceGroup](#workspaces_getbyresourcegroup)
- [List](#workspaces_list)
- [ListByResourceGroup](#workspaces_listbyresourcegroup)
- [Update](#workspaces_update)
### ActiveSessionHostConfigurations_Get

```java
/**
 * Samples for ActiveSessionHostConfigurations Get.
 */
public final class ActiveSessionHostConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ActiveSessionHostConfigurations_Get.json
     */
    /**
     * Sample code: SessionHostConfigurations_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostConfigurationsGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.activeSessionHostConfigurations().getWithResponse("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE);
    }
}
```

### ActiveSessionHostConfigurations_ListByHostPool

```java
/**
 * Samples for ActiveSessionHostConfigurations ListByHostPool.
 */
public final class ActiveSessionHostConfigurationsListByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ActiveSessionHostConfigurations_ListByHostPool.json
     */
    /**
     * Sample code: SessionHostConfigurations_ListByHostPool.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostConfigurationsListByHostPool(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.activeSessionHostConfigurations().listByHostPool("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE);
    }
}
```

### AppAttachPackage_CreateOrUpdate

```java
import com.azure.resourcemanager.desktopvirtualization.models.AppAttachPackageInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.AppAttachPackageProperties;
import com.azure.resourcemanager.desktopvirtualization.models.FailHealthCheckOnStagingFailure;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageApplications;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageDependencies;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Samples for AppAttachPackage CreateOrUpdate.
 */
public final class AppAttachPackageCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/AppAttachPackage_Create.json
     */
    /**
     * Sample code: AppAttachPackage_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void appAttachPackageCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.appAttachPackages().define("msixpackagefullname").withRegion("southcentralus").withExistingResourceGroup("resourceGroup1").withProperties(new AppAttachPackageProperties().withImage(new AppAttachPackageInfoProperties().withPackageAlias("msixpackagealias").withImagePath("imagepath").withPackageName("MsixPackageName").withPackageFamilyName("MsixPackage_FamilyName").withPackageFullName("MsixPackage_FullName").withDisplayName("displayname").withPackageRelativePath("packagerelativepath").withIsRegularRegistration(false).withIsActive(false).withPackageDependencies(Arrays.asList(new MsixPackageDependencies().withDependencyName("MsixPackage_Dependency_Name").withPublisher("MsixPackage_Dependency_Publisher").withMinVersion("packageDep_version"))).withVersion("packageversion").withLastUpdated(OffsetDateTime.parse("2008-09-22T14:01:54.9571247Z")).withPackageApplications(Arrays.asList(new MsixPackageApplications().withAppId("AppId").withDescription("PackageApplicationDescription").withAppUserModelId("AppUserModelId").withFriendlyName("FriendlyName").withIconImageName("Iconimagename").withRawIcon("VGhpcyBpcyBhIHN0cmluZyB0byBoYXNo".getBytes()).withRawPng("VGhpcyBpcyBhIHN0cmluZyB0byBoYXNo".getBytes()))).withCertificateName("certName").withCertificateExpiry(OffsetDateTime.parse("2023-01-02T17:18:19.1234567Z"))).withHostPoolReferences(Arrays.asList()).withKeyVaultUrl("fakeTokenPlaceholder").withFailHealthCheckOnStagingFailure(FailHealthCheckOnStagingFailure.NEEDS_ASSISTANCE)).create();
    }
}
```

### AppAttachPackage_Delete

```java
/**
 * Samples for AppAttachPackage Delete.
 */
public final class AppAttachPackageDeleteSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/AppAttachPackage_Delete.json
     */
    /**
     * Sample code: AppAttachPackage_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void appAttachPackageDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.appAttachPackages().deleteWithResponse("resourceGroup1", "packagefullname", null, com.azure.core.util.Context.NONE);
    }
}
```

### AppAttachPackage_GetByResourceGroup

```java
/**
 * Samples for AppAttachPackage GetByResourceGroup.
 */
public final class AppAttachPackageGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/AppAttachPackage_Get.json
     */
    /**
     * Sample code: AppAttachPackage_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void appAttachPackageGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.appAttachPackages().getByResourceGroupWithResponse("resourceGroup1", "packagefullname", com.azure.core.util.Context.NONE);
    }
}
```

### AppAttachPackage_List

```java
/**
 * Samples for AppAttachPackage List.
 */
public final class AppAttachPackageListSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/AppAttachPackage_ListBySubscription.json
     */
    /**
     * Sample code: AppAttachPackage_ListBySubscription.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void appAttachPackageListBySubscription(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.appAttachPackages().list("HostPoolName eq 'hostpool1'", com.azure.core.util.Context.NONE);
    }
}
```

### AppAttachPackage_ListByResourceGroup

```java
/**
 * Samples for AppAttachPackage ListByResourceGroup.
 */
public final class AppAttachPackageListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/AppAttachPackage_ListByResourceGroup.json
     */
    /**
     * Sample code: AppAttachPackage_ListByResourceGroup.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void appAttachPackageListByResourceGroup(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.appAttachPackages().listByResourceGroup("resourceGroup1", "HostPoolName eq 'hostpool1'", com.azure.core.util.Context.NONE);
    }
}
```

### AppAttachPackage_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.AppAttachPackage;

/**
 * Samples for AppAttachPackage Update.
 */
public final class AppAttachPackageUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/AppAttachPackage_Update.json
     */
    /**
     * Sample code: AppAttachPackage_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void appAttachPackageUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        AppAttachPackage resource = manager.appAttachPackages().getByResourceGroupWithResponse("resourceGroup1", "msixpackagefullname", com.azure.core.util.Context.NONE).getValue();
        resource.update().apply();
    }
}
```

### AppAttachPackageInfo_ImportMethod

```java
import com.azure.resourcemanager.desktopvirtualization.models.AppAttachPackageArchitectures;
import com.azure.resourcemanager.desktopvirtualization.models.ImportPackageInfoRequest;
import java.util.stream.Collectors;

/**
 * Samples for AppAttachPackageInfo ImportMethod.
 */
public final class AppAttachPackageInfoImportMethodSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/AppAttachPackageInfo_Import_Post.json
     */
    /**
     * Sample code: AppAttachPackageInfo_Import.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void appAttachPackageInfoImport(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.appAttachPackageInfoes().importMethod("resourceGroup1", "hostpool1", new ImportPackageInfoRequest().withPath("imagepath").withPackageArchitecture(AppAttachPackageArchitectures.X64), com.azure.core.util.Context.NONE);
    }
}
```

### ApplicationGroups_CreateOrUpdate

```java
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationGroupType;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for ApplicationGroups CreateOrUpdate.
 */
public final class ApplicationGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ApplicationGroup_Create.json
     */
    /**
     * Sample code: ApplicationGroup_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationGroupCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applicationGroups().define("applicationGroup1").withRegion("centralus").withExistingResourceGroup("resourceGroup1").withHostPoolArmPath("/subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroup1/providers/Microsoft.DesktopVirtualization/hostPools/hostPool1").withApplicationGroupType(ApplicationGroupType.REMOTE_APP).withTags(mapOf("tag1", "value1", "tag2", "value2")).withDescription("des1").withFriendlyName("friendly").withShowInFeed(true).create();
    }

    // Use "Map.of" if available
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

### ApplicationGroups_Delete

```java
/**
 * Samples for ApplicationGroups Delete.
 */
public final class ApplicationGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ApplicationGroup_Delete.json
     */
    /**
     * Sample code: ApplicationGroup_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationGroupDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applicationGroups().deleteByResourceGroupWithResponse("resourceGroup1", "applicationGroup1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ApplicationGroup_Get.json
     */
    /**
     * Sample code: ApplicationGroup_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationGroupGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applicationGroups().getByResourceGroupWithResponse("resourceGroup1", "applicationGroup1", com.azure.core.util.Context.NONE);
    }
}
```

### ApplicationGroups_List

```java
/**
 * Samples for ApplicationGroups List.
 */
public final class ApplicationGroupsListSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ApplicationGroup_ListBySubscription.json
     */
    /**
     * Sample code: ApplicationGroup_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationGroupList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applicationGroups().list("applicationGroupType eq 'RailApplication'", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ApplicationGroup_ListByResourceGroup.json
     */
    /**
     * Sample code: ApplicationGroup_ListByResourceGroup.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationGroupListByResourceGroup(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applicationGroups().listByResourceGroup("resourceGroup1", "applicationGroupType eq 'RailApplication'", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### ApplicationGroups_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationGroup;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ApplicationGroups Update.
 */
public final class ApplicationGroupsUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ApplicationGroup_Update.json
     */
    /**
     * Sample code: ApplicationGroups_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationGroupsUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        ApplicationGroup resource = manager.applicationGroups().getByResourceGroupWithResponse("resourceGroup1", "applicationGroup1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).withDescription("des1").withFriendlyName("friendly").withShowInFeed(true).apply();
    }

    // Use "Map.of" if available
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
import com.azure.resourcemanager.desktopvirtualization.models.CommandLineSetting;
import java.util.stream.Collectors;

/**
 * Samples for Applications CreateOrUpdate.
 */
public final class ApplicationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Application_Create.json
     */
    /**
     * Sample code: Application_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applications().define("application1").withExistingApplicationGroup("resourceGroup1", "applicationGroup1").withCommandLineSetting(CommandLineSetting.ALLOW).withDescription("des1").withFriendlyName("friendly").withFilePath("path").withCommandLineArguments("arguments").withShowInPortal(true).withIconPath("icon").withIconIndex(1).create();
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Application_Delete.json
     */
    /**
     * Sample code: Application_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applications().deleteWithResponse("resourceGroup1", "applicationGroup1", "application1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Application_Get.json
     */
    /**
     * Sample code: Application_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applications().getWithResponse("resourceGroup1", "applicationGroup1", "application1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Application_List.json
     */
    /**
     * Sample code: Applications_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationsList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.applications().list("resourceGroup1", "applicationGroup1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### Applications_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.Application;
import com.azure.resourcemanager.desktopvirtualization.models.CommandLineSetting;
import com.azure.resourcemanager.desktopvirtualization.models.RemoteApplicationType;
import java.util.stream.Collectors;

/**
 * Samples for Applications Update.
 */
public final class ApplicationsUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Application_Update.json
     */
    /**
     * Sample code: Application_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void applicationUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        Application resource = manager.applications().getWithResponse("resourceGroup1", "applicationGroup1", "application1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withDescription("des1").withFriendlyName("friendly").withFilePath("path").withCommandLineSetting(CommandLineSetting.ALLOW).withCommandLineArguments("arguments").withShowInPortal(true).withIconPath("icon").withIconIndex(1).withApplicationType(RemoteApplicationType.IN_BUILT).apply();
    }
}
```

### ControlSessionHostUpdate_Post

```java
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolControlParameter;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolUpdateAction;
import java.util.stream.Collectors;

/**
 * Samples for ControlSessionHostUpdate Post.
 */
public final class ControlSessionHostUpdatePostSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostManagements_ControlSessionHostUpdate_Post.json
     */
    /**
     * Sample code: SessionHostManagements_ControlUpdate_Post.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostManagementsControlUpdatePost(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.controlSessionHostUpdates().post("resourceGroup1", "hostPool1", new HostPoolControlParameter().withAction(HostPoolUpdateAction.START).withCancelMessage("Host pool update started"), com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Desktop_Get.json
     */
    /**
     * Sample code: Desktop_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void desktopGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.desktops().getWithResponse("resourceGroup1", "applicationGroup1", "SessionDesktop", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Desktop_List.json
     */
    /**
     * Sample code: Desktop_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void desktopList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.desktops().list("resourceGroup1", "applicationGroup1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### Desktops_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.DesktopPatch;

/**
 * Samples for Desktops Update.
 */
public final class DesktopsUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Desktop_Update.json
     */
    /**
     * Sample code: Desktop_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void desktopUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.desktops().updateWithResponse("resourceGroup1", "applicationGroup1", "SessionDesktop", new DesktopPatch().withDescription("des1").withFriendlyName("friendly"), com.azure.core.util.Context.NONE);
    }
}
```

### HostPools_CreateOrUpdate

```java
import com.azure.resourcemanager.desktopvirtualization.fluent.models.RegistrationInfoInner;
import com.azure.resourcemanager.desktopvirtualization.models.AgentUpdateProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolType;
import com.azure.resourcemanager.desktopvirtualization.models.LoadBalancerType;
import com.azure.resourcemanager.desktopvirtualization.models.MaintenanceWindowProperties;
import com.azure.resourcemanager.desktopvirtualization.models.ManagementType;
import com.azure.resourcemanager.desktopvirtualization.models.PersonalDesktopAssignmentType;
import com.azure.resourcemanager.desktopvirtualization.models.PreferredAppGroupType;
import com.azure.resourcemanager.desktopvirtualization.models.RegistrationTokenOperation;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostComponentUpdateType;
import com.azure.resourcemanager.desktopvirtualization.models.SsoSecretType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for HostPools CreateOrUpdate.
 */
public final class HostPoolsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/HostPool_Create.json
     */
    /**
     * Sample code: HostPool_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.hostPools().define("hostPool1").withRegion("centralus").withExistingResourceGroup("resourceGroup1").withHostPoolType(HostPoolType.POOLED).withLoadBalancerType(LoadBalancerType.BREADTH_FIRST).withPreferredAppGroupType(PreferredAppGroupType.DESKTOP).withTags(mapOf("tag1", "value1", "tag2", "value2")).withFriendlyName("friendly").withDescription("des1").withPersonalDesktopAssignmentType(PersonalDesktopAssignmentType.AUTOMATIC).withMaxSessionLimit(999999).withRegistrationInfo(new RegistrationInfoInner().withExpirationTime(OffsetDateTime.parse("2020-10-01T14:01:54.9571247Z")).withRegistrationTokenOperation(RegistrationTokenOperation.UPDATE)).withVmTemplate("{json:json}").withManagementType(ManagementType.AUTOMATED).withSsoadfsAuthority("https://adfs").withSsoClientId("client").withSsoClientSecretKeyVaultPath("https://keyvault/secret").withSsoSecretType(SsoSecretType.SHARED_KEY).withStartVMOnConnect(false).withAgentUpdate(new AgentUpdateProperties().withType(SessionHostComponentUpdateType.SCHEDULED).withUseSessionHostLocalTime(false).withMaintenanceWindowTimeZone("Alaskan Standard Time").withMaintenanceWindows(Arrays.asList(new MaintenanceWindowProperties().withHour(7).withDayOfWeek(DayOfWeek.FRIDAY), new MaintenanceWindowProperties().withHour(8).withDayOfWeek(DayOfWeek.SATURDAY)))).create();
    }

    // Use "Map.of" if available
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

### HostPools_Delete

```java
/**
 * Samples for HostPools Delete.
 */
public final class HostPoolsDeleteSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/HostPool_Delete.json
     */
    /**
     * Sample code: HostPool_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/HostPool_Get.json
     */
    /**
     * Sample code: HostPool_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.hostPools().getByResourceGroupWithResponse("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/HostPool_List.json
     */
    /**
     * Sample code: HostPool_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/HostPool_ListByResourceGroup.json
     */
    /**
     * Sample code: HostPool_ListByResourceGroup.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolListByResourceGroup(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.hostPools().listByResourceGroup("resourceGroup1", 10, true, 0, com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/HostPools_RetrieveRegistrationToken_Post.json
     */
    /**
     * Sample code: HostPools_RetrieveRegistrationToken_Post.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolsRetrieveRegistrationTokenPost(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.hostPools().retrieveRegistrationTokenWithResponse("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE);
    }
}
```

### HostPools_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.AgentUpdatePatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.HostPool;
import com.azure.resourcemanager.desktopvirtualization.models.LoadBalancerType;
import com.azure.resourcemanager.desktopvirtualization.models.MaintenanceWindowPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.PersonalDesktopAssignmentType;
import com.azure.resourcemanager.desktopvirtualization.models.RegistrationInfoPatch;
import com.azure.resourcemanager.desktopvirtualization.models.RegistrationTokenOperation;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostComponentUpdateType;
import com.azure.resourcemanager.desktopvirtualization.models.SsoSecretType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for HostPools Update.
 */
public final class HostPoolsUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/HostPool_Update.json
     */
    /**
     * Sample code: HostPool_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        HostPool resource = manager.hostPools().getByResourceGroupWithResponse("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).withFriendlyName("friendly").withDescription("des1").withMaxSessionLimit(999999).withPersonalDesktopAssignmentType(PersonalDesktopAssignmentType.AUTOMATIC).withLoadBalancerType(LoadBalancerType.BREADTH_FIRST).withRegistrationInfo(new RegistrationInfoPatch().withExpirationTime(OffsetDateTime.parse("2020-10-01T15:01:54.9571247Z")).withRegistrationTokenOperation(RegistrationTokenOperation.UPDATE)).withVmTemplate("{json:json}").withSsoadfsAuthority("https://adfs").withSsoClientId("client").withSsoClientSecretKeyVaultPath("https://keyvault/secret").withSsoSecretType(SsoSecretType.SHARED_KEY).withStartVMOnConnect(false).withAgentUpdate(new AgentUpdatePatchProperties().withType(SessionHostComponentUpdateType.SCHEDULED).withUseSessionHostLocalTime(false).withMaintenanceWindowTimeZone("Alaskan Standard Time").withMaintenanceWindows(Arrays.asList(new MaintenanceWindowPatchProperties().withHour(7).withDayOfWeek(DayOfWeek.FRIDAY), new MaintenanceWindowPatchProperties().withHour(8).withDayOfWeek(DayOfWeek.SATURDAY)))).apply();
    }

    // Use "Map.of" if available
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

### InitiateSessionHostUpdate_Post

```java
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolUpdateConfigurationPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.UpdateSessionHostsRequestBody;
import java.time.OffsetDateTime;

/**
 * Samples for InitiateSessionHostUpdate Post.
 */
public final class InitiateSessionHostUpdatePostSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostManagements_UpdateSessionHosts_Post.json
     */
    /**
     * Sample code: HostPools_Update_Post.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolsUpdatePost(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.initiateSessionHostUpdates().post("resourceGroup1", "hostPool1", new UpdateSessionHostsRequestBody().withScheduledDateTime(OffsetDateTime.parse("2008-09-22T14:01:54.9571247Z")).withScheduledDateTimeZone("Alaskan Standard Time").withUpdate(new HostPoolUpdateConfigurationPatchProperties().withDeleteOriginalVm(true).withMaxVmsRemoved(4).withLogOffDelayMinutes(10).withLogOffMessage("logging off for hostpool update")), com.azure.core.util.Context.NONE);
    }
}
```

### MsixImages_Expand

```java
import com.azure.resourcemanager.desktopvirtualization.models.MsixImageUri;

/**
 * Samples for MsixImages Expand.
 */
public final class MsixImagesExpandSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/MsixImage_Expand_Post.json
     */
    /**
     * Sample code: MsixImage_Expand.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void msixImageExpand(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.msixImages().expand("resourceGroup1", "hostpool1", new MsixImageUri().withUri("imagepath"), com.azure.core.util.Context.NONE);
    }
}
```

### MsixPackages_CreateOrUpdate

```java
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageApplications;
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackageDependencies;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for MsixPackages CreateOrUpdate.
 */
public final class MsixPackagesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/MsixPackage_Create.json
     */
    /**
     * Sample code: MSIXPackage_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void mSIXPackageCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.msixPackages().define("msixpackagefullname").withExistingHostPool("resourceGroup1", "hostpool1").withImagePath("imagepath").withPackageName("MsixPackage_name").withPackageFamilyName("MsixPackage_FamilyName").withDisplayName("displayname").withPackageRelativePath("packagerelativepath").withIsRegularRegistration(false).withIsActive(false).withPackageDependencies(Arrays.asList(new MsixPackageDependencies().withDependencyName("MsixTest_Dependency_Name").withPublisher("PublishedName").withMinVersion("version"))).withVersion("version").withLastUpdated(OffsetDateTime.parse("2008-09-22T14:01:54.9571247Z")).withPackageApplications(Arrays.asList(new MsixPackageApplications().withAppId("ApplicationId").withDescription("application-desc").withAppUserModelId("AppUserModelId").withFriendlyName("friendlyname").withIconImageName("Apptile").withRawIcon("VGhpcyBpcyBhIHN0cmluZyB0byBoYXNo".getBytes()).withRawPng("VGhpcyBpcyBhIHN0cmluZyB0byBoYXNo".getBytes()))).create();
    }
}
```

### MsixPackages_Delete

```java
/**
 * Samples for MsixPackages Delete.
 */
public final class MsixPackagesDeleteSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/MsixPackage_Delete.json
     */
    /**
     * Sample code: MSIXPackage_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void mSIXPackageDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.msixPackages().deleteWithResponse("resourceGroup1", "hostpool1", "packagefullname", com.azure.core.util.Context.NONE);
    }
}
```

### MsixPackages_Get

```java
/**
 * Samples for MsixPackages Get.
 */
public final class MsixPackagesGetSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/MsixPackage_Get.json
     */
    /**
     * Sample code: MSIXPackage_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void mSIXPackageGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.msixPackages().getWithResponse("resourceGroup1", "hostpool1", "packagefullname", com.azure.core.util.Context.NONE);
    }
}
```

### MsixPackages_List

```java
/**
 * Samples for MsixPackages List.
 */
public final class MsixPackagesListSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/MsixPackage_List.json
     */
    /**
     * Sample code: MSIXPackage_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void mSIXPackageList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.msixPackages().list("resourceGroup1", "hostpool1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### MsixPackages_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.MsixPackage;

/**
 * Samples for MsixPackages Update.
 */
public final class MsixPackagesUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/MsixPackage_Update.json
     */
    /**
     * Sample code: MSIXPackage_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void mSIXPackageUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        MsixPackage resource = manager.msixPackages().getWithResponse("resourceGroup1", "hostpool1", "msixpackagefullname", com.azure.core.util.Context.NONE).getValue();
        resource.update().withIsActive(true).withIsRegularRegistration(false).withDisplayName("displayname").apply();
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/OperationDescription_List.json
     */
    /**
     * Sample code: OperationDescription_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void operationDescriptionList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_DeleteByHostPool

```java
/**
 * Samples for PrivateEndpointConnections DeleteByHostPool.
 */
public final class PrivateEndpointConnectionsDeleteByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/PrivateEndpointConnection_DeleteByHostPool.json
     */
    /**
     * Sample code: PrivateEndpointConnection_DeleteByHostPool.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateEndpointConnectionDeleteByHostPool(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.privateEndpointConnections().deleteByHostPoolWithResponse("resourceGroup1", "hostPool1", "hostPool1.377103f1-5179-4bdf-8556-4cdd3207cc5b", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_DeleteByWorkspace

```java
/**
 * Samples for PrivateEndpointConnections DeleteByWorkspace.
 */
public final class PrivateEndpointConnectionsDeleteByWorkspaceSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/PrivateEndpointConnection_DeleteByWorkspace.json
     */
    /**
     * Sample code: PrivateEndpointConnection_DeleteByWorkspace.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateEndpointConnectionDeleteByWorkspace(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.privateEndpointConnections().deleteByWorkspaceWithResponse("resourceGroup1", "workspace1", "workspace1.377103f1-5179-4bdf-8556-4cdd3207cc5b", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_GetByHostPool

```java
/**
 * Samples for PrivateEndpointConnections GetByHostPool.
 */
public final class PrivateEndpointConnectionsGetByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/PrivateEndpointConnection_GetByHostPool.json
     */
    /**
     * Sample code: PrivateEndpointConnection_GetByHostPool.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateEndpointConnectionGetByHostPool(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.privateEndpointConnections().getByHostPoolWithResponse("resourceGroup1", "hostPool1", "hostPool1.377103f1-5179-4bdf-8556-4cdd3207cc5b", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_GetByWorkspace

```java
/**
 * Samples for PrivateEndpointConnections GetByWorkspace.
 */
public final class PrivateEndpointConnectionsGetByWorkspaceSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/PrivateEndpointConnection_GetByWorkspace.json
     */
    /**
     * Sample code: PrivateEndpointConnection_GetByWorkspace.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateEndpointConnectionGetByWorkspace(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.privateEndpointConnections().getByWorkspaceWithResponse("resourceGroup1", "workspace1", "workspace1.377103f1-5179-4bdf-8556-4cdd3207cc5b", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_ListByHostPool

```java
/**
 * Samples for PrivateEndpointConnections ListByHostPool.
 */
public final class PrivateEndpointConnectionsListByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/PrivateEndpointConnection_ListByHostPool.json
     */
    /**
     * Sample code: PrivateEndpointConnection_ListByHostPool.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateEndpointConnectionListByHostPool(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.privateEndpointConnections().listByHostPool("resourceGroup1", "hostPool1", null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_ListByWorkspace

```java
/**
 * Samples for PrivateEndpointConnections ListByWorkspace.
 */
public final class PrivateEndpointConnectionsListByWorkspaceSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/PrivateEndpointConnection_ListByWorkspace.json
     */
    /**
     * Sample code: PrivateEndpointConnection_ListByWorkspace.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateEndpointConnectionListByWorkspace(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.privateEndpointConnections().listByWorkspace("resourceGroup1", "workspace1", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_UpdateByHostPool

```java
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnection;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateLinkServiceConnectionState;
import java.util.stream.Collectors;

/**
 * Samples for PrivateEndpointConnections UpdateByHostPool.
 */
public final class PrivateEndpointConnectionsUpdateByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/PrivateEndpointConnection_UpdateByHostPool.json
     */
    /**
     * Sample code: PrivateEndpointConnection_UpdateByHostPool.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateEndpointConnectionUpdateByHostPool(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.privateEndpointConnections().updateByHostPoolWithResponse("resourceGroup1", "hostPool1", "hostPool1.377103f1-5179-4bdf-8556-4cdd3207cc5b", new PrivateEndpointConnection().withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED).withDescription("Approved by admin@consoto.com").withActionsRequired("None")), com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_UpdateByWorkspace

```java
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnection;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateLinkServiceConnectionState;
import java.util.stream.Collectors;

/**
 * Samples for PrivateEndpointConnections UpdateByWorkspace.
 */
public final class PrivateEndpointConnectionsUpdateByWorkspaceSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/PrivateEndpointConnection_UpdateByWorkspace.json
     */
    /**
     * Sample code: PrivateEndpointConnection_UpdateByWorkspace.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateEndpointConnectionUpdateByWorkspace(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.privateEndpointConnections().updateByWorkspaceWithResponse("resourceGroup1", "workspace1", "workspace1.377103f1-5179-4bdf-8556-4cdd3207cc5b", new PrivateEndpointConnection().withPrivateLinkServiceConnectionState(new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED).withDescription("Approved by admin@consoto.com").withActionsRequired("None")), com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_ListByHostPool

```java
/**
 * Samples for PrivateLinkResources ListByHostPool.
 */
public final class PrivateLinkResourcesListByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/PrivateLinkResources_ListByHostPool.json
     */
    /**
     * Sample code: PrivateLinkResources_ListByHostPool.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateLinkResourcesListByHostPool(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.privateLinkResources().listByHostPool("resourceGroup1", "hostPool1", null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_ListByWorkspace

```java
/**
 * Samples for PrivateLinkResources ListByWorkspace.
 */
public final class PrivateLinkResourcesListByWorkspaceSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/PrivateLinkResources_ListByWorkspace.json
     */
    /**
     * Sample code: PrivateLinkResources_ListByWorkspace.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void privateLinkResourcesListByWorkspace(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.privateLinkResources().listByWorkspace("resourceGroup1", "workspace1", null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlanPersonalSchedules_Create

```java
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHandlingOperation;
import com.azure.resourcemanager.desktopvirtualization.models.SetStartVMOnConnect;
import com.azure.resourcemanager.desktopvirtualization.models.StartupBehavior;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Samples for ScalingPlanPersonalSchedules Create.
 */
public final class ScalingPlanPersonalSchedulesCreateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlanPersonalSchedule_Create.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPersonalSchedules().define("scalingPlanScheduleWeekdays1").withExistingScalingPlan("resourceGroup1", "scalingPlan1").withDaysOfWeek(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY)).withRampUpStartTime(new Time().withHour(6).withMinute(0)).withRampUpAutoStartHosts(StartupBehavior.ALL).withRampUpStartVMOnConnect(SetStartVMOnConnect.ENABLE).withRampUpActionOnDisconnect(SessionHandlingOperation.NONE).withRampUpMinutesToWaitOnDisconnect(10).withRampUpActionOnLogoff(SessionHandlingOperation.NONE).withRampUpMinutesToWaitOnLogoff(10).withPeakStartTime(new Time().withHour(8).withMinute(0)).withPeakStartVMOnConnect(SetStartVMOnConnect.ENABLE).withPeakActionOnDisconnect(SessionHandlingOperation.NONE).withPeakMinutesToWaitOnDisconnect(10).withPeakActionOnLogoff(SessionHandlingOperation.DEALLOCATE).withPeakMinutesToWaitOnLogoff(10).withRampDownStartTime(new Time().withHour(18).withMinute(0)).withRampDownStartVMOnConnect(SetStartVMOnConnect.ENABLE).withRampDownActionOnDisconnect(SessionHandlingOperation.NONE).withRampDownMinutesToWaitOnDisconnect(10).withRampDownActionOnLogoff(SessionHandlingOperation.DEALLOCATE).withRampDownMinutesToWaitOnLogoff(10).withOffPeakStartTime(new Time().withHour(20).withMinute(0)).withOffPeakStartVMOnConnect(SetStartVMOnConnect.ENABLE).withOffPeakActionOnDisconnect(SessionHandlingOperation.NONE).withOffPeakMinutesToWaitOnDisconnect(10).withOffPeakActionOnLogoff(SessionHandlingOperation.DEALLOCATE).withOffPeakMinutesToWaitOnLogoff(10).create();
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlanPersonalSchedule_Delete.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPersonalSchedules().deleteWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlanPersonalSchedule_Get.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPersonalSchedules().getWithResponse("resourceGroup1", "PersonalScalingPlan1", "PersonalScalingPlanSchedule", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlanPersonalSchedule_List.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPersonalSchedules().list("resourceGroup1", "scalingPlan", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlanPersonalSchedules_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPersonalSchedule;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHandlingOperation;
import com.azure.resourcemanager.desktopvirtualization.models.SetStartVMOnConnect;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.stream.Collectors;

/**
 * Samples for ScalingPlanPersonalSchedules Update.
 */
public final class ScalingPlanPersonalSchedulesUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlanPersonalSchedule_Update.json
     */
    /**
     * Sample code: ScalingPlanPersonalSchedules_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPersonalSchedulesUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        ScalingPlanPersonalSchedule resource = manager.scalingPlanPersonalSchedules().getWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withPeakStartTime(new Time().withHour(8).withMinute(0)).withPeakActionOnDisconnect(SessionHandlingOperation.NONE).withPeakMinutesToWaitOnDisconnect(10).withPeakActionOnLogoff(SessionHandlingOperation.DEALLOCATE).withPeakMinutesToWaitOnLogoff(10).withRampDownStartTime(new Time().withHour(18).withMinute(0)).withRampDownActionOnDisconnect(SessionHandlingOperation.NONE).withRampDownMinutesToWaitOnDisconnect(10).withRampDownActionOnLogoff(SessionHandlingOperation.DEALLOCATE).withRampDownMinutesToWaitOnLogoff(10).withOffPeakStartTime(new Time().withHour(20).withMinute(0)).withOffPeakStartVMOnConnect(SetStartVMOnConnect.DISABLE).withOffPeakActionOnDisconnect(SessionHandlingOperation.NONE).withOffPeakMinutesToWaitOnDisconnect(10).withOffPeakActionOnLogoff(SessionHandlingOperation.DEALLOCATE).withOffPeakMinutesToWaitOnLogoff(10).apply();
    }
}
```

### ScalingPlanPooledSchedules_Create

```java
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostLoadBalancingAlgorithm;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Samples for ScalingPlanPooledSchedules Create.
 */
public final class ScalingPlanPooledSchedulesCreateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlanPooledSchedule_Create.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPooledSchedules().define("scalingPlanScheduleWeekdays1").withExistingScalingPlan("resourceGroup1", "scalingPlan1").withDaysOfWeek(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY)).withRampUpStartTime(new Time().withHour(6).withMinute(0)).withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST).withRampUpMinimumHostsPct(20).withRampUpCapacityThresholdPct(80).withPeakStartTime(new Time().withHour(8).withMinute(0)).withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST).withRampDownStartTime(new Time().withHour(18).withMinute(0)).withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST).withRampDownMinimumHostsPct(20).withRampDownCapacityThresholdPct(50).withRampDownForceLogoffUsers(true).withRampDownWaitTimeMinutes(30).withRampDownNotificationMessage("message").withOffPeakStartTime(new Time().withHour(20).withMinute(0)).withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST).create();
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlanPooledSchedule_Delete.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPooledSchedules().deleteWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlanPooledSchedule_Get.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPooledSchedules().getWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlanPooledSchedule_List.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlanPooledSchedules().list("resourceGroup1", "scalingPlan1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlanPooledSchedules_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.DayOfWeek;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPooledSchedule;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostLoadBalancingAlgorithm;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Samples for ScalingPlanPooledSchedules Update.
 */
public final class ScalingPlanPooledSchedulesUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlanPooledSchedule_Update.json
     */
    /**
     * Sample code: ScalingPlanPooledSchedules_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanPooledSchedulesUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        ScalingPlanPooledSchedule resource = manager.scalingPlanPooledSchedules().getWithResponse("resourceGroup1", "scalingPlan1", "scalingPlanScheduleWeekdays1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withDaysOfWeek(Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY)).withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST).withRampUpCapacityThresholdPct(80).withPeakStartTime(new Time().withHour(8).withMinute(0)).withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST).withRampDownMinimumHostsPct(20).withRampDownWaitTimeMinutes(30).apply();
    }
}
```

### ScalingPlans_Create

```java
import com.azure.resourcemanager.desktopvirtualization.models.ScalingHostPoolReference;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingHostPoolType;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingSchedule;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingScheduleDaysOfWeekItem;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostLoadBalancingAlgorithm;
import com.azure.resourcemanager.desktopvirtualization.models.Time;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for ScalingPlans Create.
 */
public final class ScalingPlansCreateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlan_Create.json
     */
    /**
     * Sample code: ScalingPlans_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlansCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlans().define("scalingPlan1").withRegion("centralus").withExistingResourceGroup("resourceGroup1").withTimeZone("Central Standard Time").withTags(mapOf("tag1", "value1", "tag2", "value2")).withDescription("Description of Scaling Plan").withFriendlyName("Scaling Plan 1").withHostPoolType(ScalingHostPoolType.POOLED).withExclusionTag("value").withSchedules(Arrays.asList(new ScalingSchedule().withName("schedule1").withDaysOfWeek(Arrays.asList(ScalingScheduleDaysOfWeekItem.MONDAY, ScalingScheduleDaysOfWeekItem.TUESDAY, ScalingScheduleDaysOfWeekItem.WEDNESDAY, ScalingScheduleDaysOfWeekItem.THURSDAY, ScalingScheduleDaysOfWeekItem.FRIDAY)).withRampUpStartTime(new Time().withHour(6).withMinute(0)).withRampUpLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST).withRampUpMinimumHostsPct(20).withRampUpCapacityThresholdPct(80).withPeakStartTime(new Time().withHour(8).withMinute(0)).withPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.BREADTH_FIRST).withRampDownStartTime(new Time().withHour(18).withMinute(0)).withRampDownLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST).withRampDownMinimumHostsPct(20).withRampDownCapacityThresholdPct(50).withRampDownForceLogoffUsers(true).withRampDownWaitTimeMinutes(30).withRampDownNotificationMessage("message").withOffPeakStartTime(new Time().withHour(20).withMinute(0)).withOffPeakLoadBalancingAlgorithm(SessionHostLoadBalancingAlgorithm.DEPTH_FIRST))).withHostPoolReferences(Arrays.asList(new ScalingHostPoolReference().withHostPoolArmPath("/subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroup1/providers/Microsoft.DesktopVirtualization/hostPools/hostPool1").withScalingPlanEnabled(true))).create();
    }

    // Use "Map.of" if available
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

### ScalingPlans_Delete

```java
/**
 * Samples for ScalingPlans Delete.
 */
public final class ScalingPlansDeleteSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlan_Delete.json
     */
    /**
     * Sample code: ScalingPlans_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlansDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlans().deleteByResourceGroupWithResponse("resourceGroup1", "scalingPlan1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlan_Get.json
     */
    /**
     * Sample code: ScalingPlans_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlansGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlans().getByResourceGroupWithResponse("resourceGroup1", "scalingPlan1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlan_ListBySubscription.json
     */
    /**
     * Sample code: ScalingPlans_ListBySubscription.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlansListBySubscription(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlans().list(10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### ScalingPlans_ListByHostPool

```java
/**
 * Samples for ScalingPlans ListByHostPool.
 */
public final class ScalingPlansListByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlan_ListByHostPool.json
     */
    /**
     * Sample code: ScalingPlan_ListByHostPool.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlanListByHostPool(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.scalingPlans().listByHostPool("resourceGroup1", "hostPool1", 10, true, 0, com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlan_ListByResourceGroup.json
     */
    /**
     * Sample code: ScalingPlans_ListByResourceGroup.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlansListByResourceGroup(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/ScalingPlan_Update.json
     */
    /**
     * Sample code: ScalingPlans_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void scalingPlansUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        ScalingPlan resource = manager.scalingPlans().getByResourceGroupWithResponse("resourceGroup1", "scalingPlan1", com.azure.core.util.Context.NONE).getValue();
        resource.update().apply();
    }
}
```

### SessionHostConfigurations_CreateOrUpdate

```java
import com.azure.resourcemanager.desktopvirtualization.fluent.models.SessionHostConfigurationInner;
import com.azure.resourcemanager.desktopvirtualization.models.ActiveDirectoryInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.AzureActiveDirectoryInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.BootDiagnosticsInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.CustomInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DiskInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DomainInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DomainJoinType;
import com.azure.resourcemanager.desktopvirtualization.models.ImageInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.KeyVaultCredentialsProperties;
import com.azure.resourcemanager.desktopvirtualization.models.MarketplaceInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.NetworkInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.SecurityInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.Type;
import com.azure.resourcemanager.desktopvirtualization.models.VirtualMachineDiskType;
import com.azure.resourcemanager.desktopvirtualization.models.VirtualMachineSecurityType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for SessionHostConfigurations CreateOrUpdate.
 */
public final class SessionHostConfigurationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostConfigurations_Create.json
     */
    /**
     * Sample code: SessionHostConfigurations_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostConfigurationsCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostConfigurations().createOrUpdateWithResponse("resourceGroup1", "hostPool1", new SessionHostConfigurationInner().withFriendlyName("InitialConfiguration").withVmTags(mapOf("Department", "myDepartment", "Team", "myTeam")).withVmLocation("eastus2").withVmResourceGroup("myResourceGroup").withVmNamePrefix("westus2-vm").withAvailabilityZones(Arrays.asList(1, 3)).withNetworkInfo(new NetworkInfoProperties().withSubnetId("/subscriptions/.../resourceGroups/.../providers/Microsoft.Network/virtualNetworks/.../subnets/subnet1").withSecurityGroupId("/subscriptions/.../resourceGroups/.../provider s/Microsoft.Network/networkSecurityGroups/nsg1")).withVmSizeId("Standard_D2s_v3").withDiskInfo(new DiskInfoProperties().withType(VirtualMachineDiskType.STANDARD_LRS)).withCustomConfigurationScriptUrl("https://storageaccountname.blob.core.windows.net/blobcontainer/file").withImageInfo(new ImageInfoProperties().withType(Type.MARKETPLACE).withMarketplaceInfo(new MarketplaceInfoProperties().withOffer("Windows-10").withPublisher("MicrosoftWindowsDesktop").withSku("19h2-ent").withExactVersion("2019.0.20190115")).withCustomInfo(new CustomInfoProperties().withResourceId("/subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroup1/providers/Microsoft.Compute/images/imageName"))).withDomainInfo(new DomainInfoProperties().withJoinType(DomainJoinType.ACTIVE_DIRECTORY).withActiveDirectoryInfo(new ActiveDirectoryInfoProperties().withDomainCredentials(new KeyVaultCredentialsProperties().withUsernameKeyVaultSecretUri("fakeTokenPlaceholder").withPasswordKeyVaultSecretUri("fakeTokenPlaceholder")).withOuPath("OU=testOU,DC=domain,DC=Domain,DC=com").withDomainName("wvdarmtest1.net")).withAzureActiveDirectoryInfo(new AzureActiveDirectoryInfoProperties().withMdmProviderGuid("bdefabc0-95b4-48b3-b645-8a753a63c4fa"))).withSecurityInfo(new SecurityInfoProperties().withType(VirtualMachineSecurityType.TRUSTED_LAUNCH).withSecureBootEnabled(true).withVTpmEnabled(true)).withVmAdminCredentials(new KeyVaultCredentialsProperties().withUsernameKeyVaultSecretUri("fakeTokenPlaceholder").withPasswordKeyVaultSecretUri("fakeTokenPlaceholder")).withBootDiagnosticsInfo(new BootDiagnosticsInfoProperties().withEnabled(true).withStorageUri("/subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroupName/providers/Microsoft.Storage/storageAccounts/storageAccountName")), com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
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

### SessionHostConfigurations_Get

```java
/**
 * Samples for SessionHostConfigurations Get.
 */
public final class SessionHostConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostConfigurations_Get.json
     */
    /**
     * Sample code: SessionHostConfigurations_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostConfigurationsGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostConfigurations().getWithResponse("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE);
    }
}
```

### SessionHostConfigurations_ListByHostPool

```java
/**
 * Samples for SessionHostConfigurations ListByHostPool.
 */
public final class SessionHostConfigurationsListByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostConfigurations_ListByHostPool.json
     */
    /**
     * Sample code: SessionHostConfigurations_ListByHostPool.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostConfigurationsListByHostPool(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostConfigurations().listByHostPool("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE);
    }
}
```

### SessionHostConfigurations_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.ActiveDirectoryInfoPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.BootDiagnosticsInfoPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.CustomInfoPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DiskInfoPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DomainInfoPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.ImageInfoPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.KeyVaultCredentialsPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.MarketplaceInfoPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.NetworkInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.SecurityInfoPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostConfigurationPatch;
import com.azure.resourcemanager.desktopvirtualization.models.Type;
import com.azure.resourcemanager.desktopvirtualization.models.VirtualMachineDiskType;
import com.azure.resourcemanager.desktopvirtualization.models.VirtualMachineSecurityType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for SessionHostConfigurations Update.
 */
public final class SessionHostConfigurationsUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostConfigurations_Update.json
     */
    /**
     * Sample code: SessionHostConfigurations_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostConfigurationsUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostConfigurations().update("resourceGroup1", "hostPool1", new SessionHostConfigurationPatch().withFriendlyName("Second Version, Updated Location").withVmTags(mapOf("Department", "myDepartment", "Team", "myTeam")).withVmLocation("eastus2").withVmResourceGroup("myResourceGroup").withVmNamePrefix("westus2-vm").withAvailabilityZones(Arrays.asList(1, 3)).withNetworkInfo(new NetworkInfoProperties().withSubnetId("/subscriptions/.../resourceGroups/.../providers/Microsoft.Network/virtualNetworks/.../subnets/subnet1").withSecurityGroupId("/subscriptions/.../resourceGroups/.../provider s/Microsoft.Network/networkSecurityGroups/nsg1")).withVmSizeId("Standard_D2s_v3").withDiskInfo(new DiskInfoPatchProperties().withType(VirtualMachineDiskType.STANDARD_LRS)).withCustomConfigurationScriptUrl("https://storageaccountname.blob.core.windows.net/blobcontainer/file").withImageInfo(new ImageInfoPatchProperties().withType(Type.MARKETPLACE).withMarketplaceInfo(new MarketplaceInfoPatchProperties().withOffer("Windows-10").withPublisher("MicrosoftWindowsDesktop").withSku("19h2-ent").withExactVersion("2019.0.20190115")).withCustomInfo(new CustomInfoPatchProperties().withResourceId("/subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroup1/providers/Microsoft.Compute/images/imageName"))).withDomainInfo(new DomainInfoPatchProperties().withActiveDirectoryInfo(new ActiveDirectoryInfoPatchProperties().withDomainCredentials(new KeyVaultCredentialsPatchProperties().withUsernameKeyVaultSecretUri("fakeTokenPlaceholder").withPasswordKeyVaultSecretUri("fakeTokenPlaceholder")))).withSecurityInfo(new SecurityInfoPatchProperties().withType(VirtualMachineSecurityType.TRUSTED_LAUNCH).withSecureBootEnabled(true).withVTpmEnabled(true)).withVmAdminCredentials(new KeyVaultCredentialsPatchProperties().withUsernameKeyVaultSecretUri("fakeTokenPlaceholder").withPasswordKeyVaultSecretUri("fakeTokenPlaceholder")).withBootDiagnosticsInfo(new BootDiagnosticsInfoPatchProperties().withEnabled(true).withStorageUri("/subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroupName/providers/Microsoft.Storage/storageAccounts/storageAccountName")), com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
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

### SessionHostConfigurationsOperationStatus_Get

```java
/**
 * Samples for SessionHostConfigurationsOperationStatus Get.
 */
public final class SessionHostConfigurationsOperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostConfigurationsOperationStatus_Get.json
     */
    /**
     * Sample code: SessionHostConfigurationsOperationStatus_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostConfigurationsOperationStatusGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostConfigurationsOperationStatus().getWithResponse("resourceGroup1", "hostPool1", "55582798-3f6e-4cda-9371-8723b27bd664", com.azure.core.util.Context.NONE);
    }
}
```

### SessionHostConfigurationsOperationStatus_List

```java
/**
 * Samples for SessionHostConfigurationsOperationStatus List.
 */
public final class SessionHostConfigurationsOperationStatusListSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostConfigurationsOperationStatus_List.json
     */
    /**
     * Sample code: SessionHostConfigurationsOperationStatus_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostConfigurationsOperationStatusList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostConfigurationsOperationStatus().list("resourceGroup1", "hostPool1", true, false, com.azure.core.util.Context.NONE);
    }
}
```

### SessionHostManagements_CreateOrUpdate

```java
import com.azure.resourcemanager.desktopvirtualization.fluent.models.SessionHostManagementInner;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolUpdateConfigurationProperties;

/**
 * Samples for SessionHostManagements CreateOrUpdate.
 */
public final class SessionHostManagementsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostManagements_Create.json
     */
    /**
     * Sample code: SessionHostManagements_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostManagementsCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostManagements().createOrUpdateWithResponse("resourceGroup1", "hostPool1", new SessionHostManagementInner().withScheduledDateTimeZone("Alaskan Standard Time").withUpdate(new HostPoolUpdateConfigurationProperties().withDeleteOriginalVm(true).withMaxVmsRemoved(4).withLogOffDelayMinutes(10).withLogOffMessage("logging off for hostpool update")), com.azure.core.util.Context.NONE);
    }
}
```

### SessionHostManagements_Get

```java
/**
 * Samples for SessionHostManagements Get.
 */
public final class SessionHostManagementsGetSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostManagements_Get.json
     */
    /**
     * Sample code: SessionHostManagements_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostManagementsGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostManagements().getWithResponse("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE);
    }
}
```

### SessionHostManagements_ListByHostPool

```java
/**
 * Samples for SessionHostManagements ListByHostPool.
 */
public final class SessionHostManagementsListByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostManagements_ListByHostPool.json
     */
    /**
     * Sample code: SessionHostConfigurations_ListByHostPool.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostConfigurationsListByHostPool(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostManagements().listByHostPool("resourceGroup1", "hostPool1", com.azure.core.util.Context.NONE);
    }
}
```

### SessionHostManagements_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolUpdateConfigurationPatchProperties;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostManagementPatch;

/**
 * Samples for SessionHostManagements Update.
 */
public final class SessionHostManagementsUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostManagements_Update.json
     */
    /**
     * Sample code: SessionHostManagements_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostManagementsUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostManagements().updateWithResponse("resourceGroup1", "hostPool1", new SessionHostManagementPatch().withScheduledDateTimeZone("Alaskan Standard Time").withUpdate(new HostPoolUpdateConfigurationPatchProperties().withDeleteOriginalVm(true).withMaxVmsRemoved(4).withLogOffDelayMinutes(10).withLogOffMessage("logging off for hostpool update")), com.azure.core.util.Context.NONE);
    }
}
```

### SessionHostManagementsOperationStatus_Get

```java
/**
 * Samples for SessionHostManagementsOperationStatus Get.
 */
public final class SessionHostManagementsOperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostManagementsOperationStatus_Get.json
     */
    /**
     * Sample code: SessionHostManagementsOperationStatus_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostManagementsOperationStatusGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostManagementsOperationStatus().getWithResponse("resourceGroup1", "hostPool1", "12345678-1234-1234-1234-123456789012", com.azure.core.util.Context.NONE);
    }
}
```

### SessionHostManagementsOperationStatus_List

```java
/**
 * Samples for SessionHostManagementsOperationStatus List.
 */
public final class SessionHostManagementsOperationStatusListSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostManagementsOperationStatus_List.json
     */
    /**
     * Sample code: SessionHostManagementsOperationStatus_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostManagementsOperationStatusList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostManagementsOperationStatus().list("resourceGroup1", "hostPool1", false, "InitiateSessionHostUpdate", true, "2fa5c06c-2771-448b-a71e-e1124f44907f", "", false, com.azure.core.util.Context.NONE);
    }
}
```

### SessionHostOperation_RetryProvisioning

```java
/**
 * Samples for SessionHostOperation RetryProvisioning.
 */
public final class SessionHostOperationRetryProvisioningSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHost_RetryProvisioning_Post.json
     */
    /**
     * Sample code: SessionHost_RetryProvisioning_Post.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostRetryProvisioningPost(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHostOperations().retryProvisioningWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHost_Delete.json
     */
    /**
     * Sample code: SessionHost_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHosts().deleteWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", true, com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHost_Get.json
     */
    /**
     * Sample code: SessionHost_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHosts().getWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHost_List.json
     */
    /**
     * Sample code: SessionHost_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHosts().list("resourceGroup1", "hostPool1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### SessionHosts_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostPatch;

/**
 * Samples for SessionHosts Update.
 */
public final class SessionHostsUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHost_Update.json
     */
    /**
     * Sample code: SessionHost_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.sessionHosts().updateWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", true, new SessionHostPatch().withAllowNewSession(true).withAssignedUser("user1@microsoft.com").withFriendlyName("friendly"), com.azure.core.util.Context.NONE);
    }
}
```

### StartMenuItems_List

```java
/**
 * Samples for StartMenuItems List.
 */
public final class StartMenuItemsListSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/StartMenuItem_List.json
     */
    /**
     * Sample code: StartMenuItem_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void startMenuItemList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.startMenuItems().list("resourceGroup1", "applicationGroup1", null, null, null, com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/UserSession_Delete.json
     */
    /**
     * Sample code: UserSession_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void userSessionDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.userSessions().deleteWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", "1", true, com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/UserSession_Disconnect_Post.json
     */
    /**
     * Sample code: UserSession_Disconnect_Post.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void userSessionDisconnectPost(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.userSessions().disconnectWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", "1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/UserSession_Get.json
     */
    /**
     * Sample code: UserSession_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void userSessionGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.userSessions().getWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", "1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/UserSession_List.json
     */
    /**
     * Sample code: UserSession_List.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void userSessionList(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.userSessions().list("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### UserSessions_ListByHostPool

```java
/**
 * Samples for UserSessions ListByHostPool.
 */
public final class UserSessionsListByHostPoolSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/UserSession_ListByHostPool.json
     */
    /**
     * Sample code: UserSession_ListByHostPool.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void userSessionListByHostPool(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.userSessions().listByHostPool("resourceGroup1", "hostPool1", "userPrincipalName eq 'user1@microsoft.com' and state eq 'active'", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### UserSessions_SendMessage

```java
import com.azure.resourcemanager.desktopvirtualization.models.SendMessage;

/**
 * Samples for UserSessions SendMessage.
 */
public final class UserSessionsSendMessageSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/UserSession_SendMessage_Post.json
     */
    /**
     * Sample code: UserSession_SendMessage_Post.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void userSessionSendMessagePost(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.userSessions().sendMessageWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", "1", new SendMessage().withMessageTitle("title").withMessageBody("body"), com.azure.core.util.Context.NONE);
    }
}
```

### ValidateSessionHostUpdate_Post

```java
import com.azure.resourcemanager.desktopvirtualization.fluent.models.SessionHostConfigurationInner;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.SessionHostManagementInner;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ValidateSessionHostUpdateRequestBodyInner;
import com.azure.resourcemanager.desktopvirtualization.models.ActiveDirectoryInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.AzureActiveDirectoryInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.BootDiagnosticsInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.CustomInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DiskInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DomainInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.DomainJoinType;
import com.azure.resourcemanager.desktopvirtualization.models.HostPoolUpdateConfigurationProperties;
import com.azure.resourcemanager.desktopvirtualization.models.ImageInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.KeyVaultCredentialsProperties;
import com.azure.resourcemanager.desktopvirtualization.models.MarketplaceInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.NetworkInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.SecurityInfoProperties;
import com.azure.resourcemanager.desktopvirtualization.models.Type;
import com.azure.resourcemanager.desktopvirtualization.models.VirtualMachineDiskType;
import com.azure.resourcemanager.desktopvirtualization.models.VirtualMachineSecurityType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for ValidateSessionHostUpdate Post.
 */
public final class ValidateSessionHostUpdatePostSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/SessionHostManagements_ValidateSessionHostUpdate_Post.json
     */
    /**
     * Sample code: HostPools_Update_Post.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void hostPoolsUpdatePost(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.validateSessionHostUpdates().post("resourceGroup1", "hostPool1", new ValidateSessionHostUpdateRequestBodyInner().withSessionHostConfiguration(new SessionHostConfigurationInner().withFriendlyName("InitialConfiguration").withVmTags(mapOf("Department", "myDepartment", "Team", "myTeam")).withVmLocation("eastus2").withVmResourceGroup("myResourceGroup").withVmNamePrefix("westus2-vm").withAvailabilityZones(Arrays.asList(1, 3)).withNetworkInfo(new NetworkInfoProperties().withSubnetId("/subscriptions/.../resourceGroups/.../providers/Microsoft.Network/virtualNetworks/.../subnets/subnet1").withSecurityGroupId("/subscriptions/.../resourceGroups/.../provider s/Microsoft.Network/networkSecurityGroups/nsg1")).withVmSizeId("Standard_D2s_v3").withDiskInfo(new DiskInfoProperties().withType(VirtualMachineDiskType.STANDARD_LRS)).withCustomConfigurationScriptUrl("https://storageaccountname.blob.core.windows.net/blobcontainer/file").withImageInfo(new ImageInfoProperties().withType(Type.MARKETPLACE).withMarketplaceInfo(new MarketplaceInfoProperties().withOffer("Windows-10").withPublisher("MicrosoftWindowsDesktop").withSku("19h2-ent").withExactVersion("2019.0.20190115")).withCustomInfo(new CustomInfoProperties().withResourceId("/subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroup1/providers/Microsoft.Compute/images/imageName"))).withDomainInfo(new DomainInfoProperties().withJoinType(DomainJoinType.ACTIVE_DIRECTORY).withActiveDirectoryInfo(new ActiveDirectoryInfoProperties().withDomainCredentials(new KeyVaultCredentialsProperties().withUsernameKeyVaultSecretUri("fakeTokenPlaceholder").withPasswordKeyVaultSecretUri("fakeTokenPlaceholder")).withOuPath("OU=testOU,DC=domain,DC=Domain,DC=com").withDomainName("wvdarmtest1.net")).withAzureActiveDirectoryInfo(new AzureActiveDirectoryInfoProperties().withMdmProviderGuid("bdefabc0-95b4-48b3-b645-8a753a63c4fa"))).withSecurityInfo(new SecurityInfoProperties().withType(VirtualMachineSecurityType.TRUSTED_LAUNCH).withSecureBootEnabled(true).withVTpmEnabled(true)).withVmAdminCredentials(new KeyVaultCredentialsProperties().withUsernameKeyVaultSecretUri("fakeTokenPlaceholder").withPasswordKeyVaultSecretUri("fakeTokenPlaceholder")).withBootDiagnosticsInfo(new BootDiagnosticsInfoProperties().withEnabled(true).withStorageUri("/subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroupName/providers/Microsoft.Storage/storageAccounts/storageAccountName"))).withSessionHostManagement(new SessionHostManagementInner().withScheduledDateTimeZone("Alaskan Standard Time").withUpdate(new HostPoolUpdateConfigurationProperties().withDeleteOriginalVm(true).withMaxVmsRemoved(4).withLogOffDelayMinutes(10).withLogOffMessage("logging off for hostpool update"))).withScheduledDateTime(OffsetDateTime.parse("2008-09-22T14:01:54.9571247Z")), com.azure.core.util.Context.NONE);
    }

    // Use "Map.of" if available
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

### Workspaces_CreateOrUpdate

```java
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Workspaces CreateOrUpdate.
 */
public final class WorkspacesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Workspace_Create.json
     */
    /**
     * Sample code: Workspace_Create.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void workspaceCreate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.workspaces().define("workspace1").withRegion("centralus").withExistingResourceGroup("resourceGroup1").withTags(mapOf("tag1", "value1", "tag2", "value2")).withDescription("des1").withFriendlyName("friendly").create();
    }

    // Use "Map.of" if available
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

### Workspaces_Delete

```java
/**
 * Samples for Workspaces Delete.
 */
public final class WorkspacesDeleteSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Workspace_Delete.json
     */
    /**
     * Sample code: Workspace_Delete.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void workspaceDelete(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.workspaces().deleteByResourceGroupWithResponse("resourceGroup1", "workspace1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Workspace_Get.json
     */
    /**
     * Sample code: Workspace_Get.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void workspaceGet(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.workspaces().getByResourceGroupWithResponse("resourceGroup1", "workspace1", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Workspace_ListBySubscription.json
     */
    /**
     * Sample code: Workspace_ListBySubscription.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void workspaceListBySubscription(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
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
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Workspace_ListByResourceGroup.json
     */
    /**
     * Sample code: Workspace_ListByResourceGroup.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void workspaceListByResourceGroup(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager.workspaces().listByResourceGroup("resourceGroup1", 10, true, 0, com.azure.core.util.Context.NONE);
    }
}
```

### Workspaces_Update

```java
import com.azure.resourcemanager.desktopvirtualization.models.Workspace;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Workspaces Update.
 */
public final class WorkspacesUpdateSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2023-11-01-preview/examples/Workspace_Update.json
     */
    /**
     * Sample code: Workspace_Update.
     * 
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void workspaceUpdate(com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        Workspace resource = manager.workspaces().getByResourceGroupWithResponse("resourceGroup1", "workspace1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).withDescription("des1").withFriendlyName("friendly").apply();
    }

    // Use "Map.of" if available
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

