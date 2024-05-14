# Code snippets and samples


## Instances

- [CreateOrUpdate](#instances_createorupdate)
- [Delete](#instances_delete)
- [GetByResourceGroup](#instances_getbyresourcegroup)
- [LinkLogAnalytics](#instances_linkloganalytics)
- [List](#instances_list)
- [ListByResourceGroup](#instances_listbyresourcegroup)
- [PatchServers](#instances_patchservers)
- [Scale](#instances_scale)
- [UnlinkLogAnalytics](#instances_unlinkloganalytics)
- [Update](#instances_update)
- [UpdateLogAnalytics](#instances_updateloganalytics)

## ManagedGatewaysOperation

- [CreateOrUpdate](#managedgatewaysoperation_createorupdate)
- [Delete](#managedgatewaysoperation_delete)
- [Get](#managedgatewaysoperation_get)
- [ListByManagedInstance](#managedgatewaysoperation_listbymanagedinstance)

## MonitoredResourcesOperation

- [CreateOrUpdate](#monitoredresourcesoperation_createorupdate)
- [Delete](#monitoredresourcesoperation_delete)
- [Get](#monitoredresourcesoperation_get)
- [ListByManagedInstance](#monitoredresourcesoperation_listbymanagedinstance)

## Offboard

- [Gateway](#offboard_gateway)
- [MonitoredResource](#offboard_monitoredresource)

## Onboard

- [Gateway](#onboard_gateway)

## Operations

- [ListV2](#operations_listv2)

## Resource

- [List](#resource_list)
- [Summary](#resource_summary)
### Instances_CreateOrUpdate

```java
import com.azure.resourcemanager.scom.fluent.models.MonitoringInstancePropertiesInner;
import com.azure.resourcemanager.scom.models.AzureHybridBenefitProperties;
import com.azure.resourcemanager.scom.models.DatabaseInstanceProperties;
import com.azure.resourcemanager.scom.models.DomainControllerProperties;
import com.azure.resourcemanager.scom.models.DomainUserCredentials;
import com.azure.resourcemanager.scom.models.GmsaDetails;
import com.azure.resourcemanager.scom.models.HybridLicenseType;
import com.azure.resourcemanager.scom.models.ManagedIdentity;
import com.azure.resourcemanager.scom.models.ManagedIdentityType;
import com.azure.resourcemanager.scom.models.UserIdentity;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Instances CreateOrUpdate.
 */
public final class InstancesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Instance_Create.json
     */
    /**
     * Sample code: Instances_CreateOrUpdate.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesCreateOrUpdate(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances()
            .define("myInstace")
            .withRegion("eastus2")
            .withExistingResourceGroup("myResGroup")
            .withTags(mapOf())
            .withProperties(new MonitoringInstancePropertiesInner().withVNetSubnetId(
                "/subscriptions/5a87dd7e-200a-4e94-8cd6-a9461de63755/resourceGroups/mySCOMMIGroup/providers/Microsoft.Network/virtualNetworks/vNet2/subnets/default")
                .withDatabaseInstance(new DatabaseInstanceProperties().withDatabaseInstanceId(
                    "/subscriptions/5a87dd7e-200a-4e94-8cd6-a9461de63755/resourceGroups/mySCOMMIGroup/providers/Microsoft.sql/managedInstances/inst1")
                    .withDatabaseFqdn("inst1.public.99e6c0ec1d52.database.windows.net,3342"))
                .withDomainController(
                    new DomainControllerProperties().withDomainName("domain.com").withDnsServer("10.10.10.10"))
                .withDomainUserCredentials(new DomainUserCredentials().withKeyVaultUrl("fakeTokenPlaceholder")
                    .withUsernameSecret("fakeTokenPlaceholder")
                    .withPasswordSecret("fakeTokenPlaceholder"))
                .withGmsaDetails(new GmsaDetails().withLoadBalancerIp("10.10.10.10")
                    .withGmsaAccount("vmsslb2$")
                    .withManagementServerGroupName("servergroup")
                    .withDnsName("dnsname.com"))
                .withAzureHybridBenefit(new AzureHybridBenefitProperties().withScomLicenseType(HybridLicenseType.NONE)
                    .withWindowsServerLicenseType(HybridLicenseType.NONE)
                    .withSqlServerLicenseType(HybridLicenseType.NONE)))
            .withIdentity(new ManagedIdentity().withType(ManagedIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/subid/resourceGroups/mySCOMMIGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id1",
                    new UserIdentity())))
            .create();
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

### Instances_Delete

```java
/**
 * Samples for Instances Delete.
 */
public final class InstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Instance_Delete.json
     */
    /**
     * Sample code: Instances_Delete.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesDelete(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().delete("mySCOMMIGroup", "myInstace", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_GetByResourceGroup

```java
/**
 * Samples for Instances GetByResourceGroup.
 */
public final class InstancesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Instance_Get.json
     */
    /**
     * Sample code: Instances_Get.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesGet(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().getByResourceGroupWithResponse("myResGroup", "myInstace", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_LinkLogAnalytics

```java
import com.azure.resourcemanager.scom.fluent.models.LogAnalyticsConfigurationInner;
import com.azure.resourcemanager.scom.models.DataType;
import java.util.Arrays;

/**
 * Samples for Instances LinkLogAnalytics.
 */
public final class InstancesLinkLogAnalyticsSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Instance_LinkLogAnalytics.json
     */
    /**
     * Sample code: Instances_LinkLogAnalytics.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesLinkLogAnalytics(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances()
            .linkLogAnalytics("myResGroup", "myInstance", new LogAnalyticsConfigurationInner().withWorkspaceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/00000000/providers/microsoft.operationalinsights/workspaces/00000000")
                .withDataTypes(Arrays.asList(DataType.STATE, DataType.PERFORMANCE, DataType.EVENT, DataType.AUDIT))
                .withImportData(true), com.azure.core.util.Context.NONE);
    }
}
```

### Instances_List

```java
/**
 * Samples for Instances List.
 */
public final class InstancesListSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Instances_ListBySubscription.json
     */
    /**
     * Sample code: Instances_ListBySubscription.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesListBySubscription(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().list(com.azure.core.util.Context.NONE);
    }
}
```

### Instances_ListByResourceGroup

```java
/**
 * Samples for Instances ListByResourceGroup.
 */
public final class InstancesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Instances_ListByResourceGroup.json
     */
    /**
     * Sample code: Instances_ListByResourceGroup.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesListByResourceGroup(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().listByResourceGroup("mySCOMMIGroup", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_PatchServers

```java
/**
 * Samples for Instances PatchServers.
 */
public final class InstancesPatchServersSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Instances_PatchServers.json
     */
    /**
     * Sample code: Instances_PatchServers.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesPatchServers(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().patchServers("myResGroup", "myInstace", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_Scale

```java
import com.azure.resourcemanager.scom.models.ScalingProperties;

/**
 * Samples for Instances Scale.
 */
public final class InstancesScaleSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Instance_Scale.json
     */
    /**
     * Sample code: Instances_Scale.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesScale(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances()
            .scale("myResGroup", "myInstace", new ScalingProperties().withServerCount(3L),
                com.azure.core.util.Context.NONE);
    }
}
```

### Instances_UnlinkLogAnalytics

```java
/**
 * Samples for Instances UnlinkLogAnalytics.
 */
public final class InstancesUnlinkLogAnalyticsSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Instance_UnlinkLogAnalytics.json
     */
    /**
     * Sample code: Instances_UnlinkLogAnalytics.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesUnlinkLogAnalytics(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().unlinkLogAnalytics("myResGroup", "myInstance", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_Update

```java
import com.azure.resourcemanager.scom.models.DomainUserCredentials;
import com.azure.resourcemanager.scom.models.ManagedInstance;
import com.azure.resourcemanager.scom.models.MonitoringInstancePatchProperties;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Instances Update.
 */
public final class InstancesUpdateSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Instance_Update.json
     */
    /**
     * Sample code: Instances_Patch.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesPatch(com.azure.resourcemanager.scom.ScomManager manager) {
        ManagedInstance resource = manager.instances()
            .getByResourceGroupWithResponse("myResGroup", "myInstace", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("additionalProp1", "string", "additionalProp2", "string", "additionalProp3", "string"))
            .withProperties(new MonitoringInstancePatchProperties()
                .withDomainUserCredentials(new DomainUserCredentials().withKeyVaultUrl("fakeTokenPlaceholder")
                    .withUsernameSecret("fakeTokenPlaceholder")
                    .withPasswordSecret("fakeTokenPlaceholder")))
            .apply();
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

### Instances_UpdateLogAnalytics

```java
import com.azure.resourcemanager.scom.fluent.models.LogAnalyticsUpdateConfigurationInner;
import com.azure.resourcemanager.scom.models.DataType;
import java.util.Arrays;

/**
 * Samples for Instances UpdateLogAnalytics.
 */
public final class InstancesUpdateLogAnalyticsSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Instance_UpdateLogAnalytics.json
     */
    /**
     * Sample code: Instances_UpdateLogAnalytics.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesUpdateLogAnalytics(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances()
            .updateLogAnalytics("myResGroup", "myInstance",
                new LogAnalyticsUpdateConfigurationInner()
                    .withDataTypes(Arrays.asList(DataType.STATE, DataType.PERFORMANCE, DataType.EVENT, DataType.AUDIT)),
                com.azure.core.util.Context.NONE);
    }
}
```

### ManagedGatewaysOperation_CreateOrUpdate

```java
import com.azure.resourcemanager.scom.models.ManagedGatewayProperties;
import com.azure.resourcemanager.scom.models.OnboardingStatusProperties;
import com.azure.resourcemanager.scom.models.OnboardingStatusValues;

/**
 * Samples for ManagedGatewaysOperation CreateOrUpdate.
 */
public final class ManagedGatewaysOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/ManagedGateway_CreateOrUpdate.json
     */
    /**
     * Sample code: ManagedGateway_CreateOrUpdate.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void managedGatewayCreateOrUpdate(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.managedGatewaysOperations()
            .define("d877b154-9a8d-4bfe-8a24-20682fcf2ed3")
            .withExistingManagedInstance("myResGroup", "myInstance")
            .withProperties(new ManagedGatewayProperties()
                .withResourceId(
                    "/subscriptions/vmsubid/resourceGroups/vmrg/providers/Microsoft.Compute/virtualMachines/vmname1")
                .withResourceLocation("eastus2")
                .withComputerName("abcd")
                .withDomainName("SCOMMI.com")
                .withOnboardingStatus(new OnboardingStatusProperties().withStatus(OnboardingStatusValues.FAILED)
                    .withMessage("Extension Failed")))
            .create();
    }
}
```

### ManagedGatewaysOperation_Delete

```java
/**
 * Samples for ManagedGatewaysOperation Delete.
 */
public final class ManagedGatewaysOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/ManagedGateway_Delete.json
     */
    /**
     * Sample code: ManagedGateway_Delete.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void managedGatewayDelete(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.managedGatewaysOperations()
            .deleteWithResponse("myResGroup", "myInstance", "d877b154-9a8d-4bfe-8a24-20682fcf2ed3",
                com.azure.core.util.Context.NONE);
    }
}
```

### ManagedGatewaysOperation_Get

```java
/**
 * Samples for ManagedGatewaysOperation Get.
 */
public final class ManagedGatewaysOperationGetSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/ManagedGateway_Get.json
     */
    /**
     * Sample code: ManagedGateway_Get.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void managedGatewayGet(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.managedGatewaysOperations()
            .getWithResponse("myResGroup", "myInstance", "d877b154-9a8d-4bfe-8a24-20682fcf2ed3",
                com.azure.core.util.Context.NONE);
    }
}
```

### ManagedGatewaysOperation_ListByManagedInstance

```java
/**
 * Samples for ManagedGatewaysOperation ListByManagedInstance.
 */
public final class ManagedGatewaysOperationListByManagedInstanceSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/ManagedGateways_ListByResourceGroup.json
     */
    /**
     * Sample code: ManagedGateways_ListByResourceGroup.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void managedGatewaysListByResourceGroup(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.managedGatewaysOperations()
            .listByManagedInstance("myResGroup", "myInstance", com.azure.core.util.Context.NONE);
    }
}
```

### MonitoredResourcesOperation_CreateOrUpdate

```java
import com.azure.resourcemanager.scom.models.MonitoredResourceProperties;
import com.azure.resourcemanager.scom.models.OnboardingStatusProperties;
import com.azure.resourcemanager.scom.models.OnboardingStatusValues;

/**
 * Samples for MonitoredResourcesOperation CreateOrUpdate.
 */
public final class MonitoredResourcesOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/MonitoredResource_CreateOrUpdate.json
     */
    /**
     * Sample code: MonitoredResources_CreateOrUpdate.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void monitoredResourcesCreateOrUpdate(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.monitoredResourcesOperations()
            .define("d877b154-9a8d-4bfe-8a24-20682fcf2ed3")
            .withExistingManagedInstance("myResGroup", "myInstance")
            .withProperties(new MonitoredResourceProperties()
                .withResourceId(
                    "/subscriptions/vmsubid/resourceGroups/vmrg/providers/Microsoft.Compute/virtualMachines/vmname1")
                .withResourceLocation("eastus2")
                .withComputerName("abcd")
                .withDomainName("SCOMMI.com")
                .withOnboardingStatus(new OnboardingStatusProperties().withStatus(OnboardingStatusValues.FAILED)
                    .withMessage("Extension Failed")))
            .create();
    }
}
```

### MonitoredResourcesOperation_Delete

```java
/**
 * Samples for MonitoredResourcesOperation Delete.
 */
public final class MonitoredResourcesOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/MonitoredResource_Delete.json
     */
    /**
     * Sample code: MonitoredResource_Delete.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void monitoredResourceDelete(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.monitoredResourcesOperations()
            .deleteWithResponse("myResGroup", "myInstance", "d877b154-9a8d-4bfe-8a24-20682fcf2ed3",
                com.azure.core.util.Context.NONE);
    }
}
```

### MonitoredResourcesOperation_Get

```java
/**
 * Samples for MonitoredResourcesOperation Get.
 */
public final class MonitoredResourcesOperationGetSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/MonitoredResource_Get.json
     */
    /**
     * Sample code: MonitoredResource_Get.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void monitoredResourceGet(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.monitoredResourcesOperations()
            .getWithResponse("myResGroup", "myInstance", "d877b154-9a8d-4bfe-8a24-20682fcf2ed3",
                com.azure.core.util.Context.NONE);
    }
}
```

### MonitoredResourcesOperation_ListByManagedInstance

```java
/**
 * Samples for MonitoredResourcesOperation ListByManagedInstance.
 */
public final class MonitoredResourcesOperationListByManagedInstanceSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/MonitoredResources_ListByResourceGroup.json
     */
    /**
     * Sample code: MonitoredResources_ListByResourceGroup.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void monitoredResourcesListByResourceGroup(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.monitoredResourcesOperations()
            .listByManagedInstance("myResGroup", "myInstance", com.azure.core.util.Context.NONE);
    }
}
```

### Offboard_Gateway

```java
import com.azure.resourcemanager.scom.models.GatewayOnboardingProperties;

/**
 * Samples for Offboard Gateway.
 */
public final class OffboardGatewaySamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Gateway_Offboard.json
     */
    /**
     * Sample code: Instances_Scale.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesScale(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.offboards()
            .gateway("myResGroup", "myInstace", new GatewayOnboardingProperties().withScomGateway("gatewaycomputername")
                .withResourceId(
                    "/subscriptions/5a87dd7e-200a-4e94-8cd6-a9461de63755/resourceGroups/vmrg/providers/Microsoft.Compute/virtualMachines/vmname1"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Offboard_MonitoredResource

```java
import com.azure.resourcemanager.scom.models.MonitoredResourceOffboardingProperties;

/**
 * Samples for Offboard MonitoredResource.
 */
public final class OffboardMonitoredResourceSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/MonitoredResource_Offboard.json
     */
    /**
     * Sample code: Instances_Scale.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesScale(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.offboards()
            .monitoredResource("myResGroup", "myInstace", new MonitoredResourceOffboardingProperties()
                .withComputerName("computerName")
                .withResourceId(
                    "/subscriptions/5a87dd7e-200a-4e94-8cd6-a9461de63755/resourceGroups/vmrg/providers/Microsoft.Compute/virtualMachines/vmname1"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Onboard_Gateway

```java
import com.azure.resourcemanager.scom.models.GatewayOnboardingProperties;

/**
 * Samples for Onboard Gateway.
 */
public final class OnboardGatewaySamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Gateway_Onboard.json
     */
    /**
     * Sample code: Instances_Scale.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesScale(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.onboards()
            .gateway("myResGroup", "myInstace", new GatewayOnboardingProperties().withScomGateway("gatewaycomputername")
                .withResourceId(
                    "/subscriptions/5a87dd7e-200a-4e94-8cd6-a9461de63755/resourceGroups/vmrg/providers/Microsoft.Compute/virtualMachines/vmname1"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Operations_ListV2

```java
/**
 * Samples for Operations ListV2.
 */
public final class OperationsListV2Samples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void operationsList(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.operations().listV2(com.azure.core.util.Context.NONE);
    }
}
```

### Resource_List

```java
import com.azure.resourcemanager.scom.models.FilterProperties;
import com.azure.resourcemanager.scom.models.GetResourceListProperties;
import java.util.Arrays;

/**
 * Samples for Resource List.
 */
public final class ResourceListSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Resource_List.json
     */
    /**
     * Sample code: Instances_Get.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesGet(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.resources()
            .listWithResponse("myResGroup", "myInstance",
                new GetResourceListProperties().withFilterProperties(new FilterProperties().withSkip(5L)
                    .withTake(10L)
                    .withResourceType("monitoredResources")
                    .withName("abcd")
                    .withSubscription(Arrays.asList("subs1", "subs2"))
                    .withResourcegroup(Arrays.asList("rg1", "rg2"))
                    .withLocation(Arrays.asList("WESTUS", "EASTUS"))
                    .withHealthStatus(Arrays.asList("Critical", "Healthy", "Warning"))
                    .withAutoUpgrade(Arrays.asList("Enabled", "Disabled"))
                    .withMachineType(Arrays.asList("Azure Virtual Machine", "Azure Arc Machine"))),
                com.azure.core.util.Context.NONE);
    }
}
```

### Resource_Summary

```java
/**
 * Samples for Resource Summary.
 */
public final class ResourceSummarySamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/stable/2023-10-30/examples/Resource_Summary.json
     */
    /**
     * Sample code: Instances_Get.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesGet(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.resources().summaryWithResponse("myResGroup", "myInstace", com.azure.core.util.Context.NONE);
    }
}
```

