# Code snippets and samples


## Instances

- [CreateOrUpdate](#instances_createorupdate)
- [Delete](#instances_delete)
- [GetByResourceGroup](#instances_getbyresourcegroup)
- [List](#instances_list)
- [ListByResourceGroup](#instances_listbyresourcegroup)
- [PatchServers](#instances_patchservers)
- [Scale](#instances_scale)
- [Update](#instances_update)

## Operations

- [ListByResourceGroup](#operations_listbyresourcegroup)
### Instances_CreateOrUpdate

```java
import com.azure.resourcemanager.scom.models.AzureHybridBenefitProperties;
import com.azure.resourcemanager.scom.models.DatabaseInstanceProperties;
import com.azure.resourcemanager.scom.models.DomainControllerProperties;
import com.azure.resourcemanager.scom.models.DomainUserCredentials;
import com.azure.resourcemanager.scom.models.GmsaDetails;
import com.azure.resourcemanager.scom.models.HybridLicenseType;
import com.azure.resourcemanager.scom.models.ManagedIdentity;
import com.azure.resourcemanager.scom.models.ManagedIdentityType;
import com.azure.resourcemanager.scom.models.MonitoringInstanceProperties;
import com.azure.resourcemanager.scom.models.UserIdentity;
import java.util.HashMap;
import java.util.Map;

/** Samples for Instances CreateOrUpdate. */
public final class InstancesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.SCOM/preview/2022-09-13-preview/examples/Instance_Create.json
     */
    /**
     * Sample code: Instances_CreateOrUpdate.
     *
     * @param manager Entry point to ScomManager.
     */
    public static void instancesCreateOrUpdate(com.azure.resourcemanager.scom.ScomManager manager) {
        manager
            .instances()
            .define("myInstace")
            .withRegion("eastus2")
            .withExistingResourceGroup("myResGroup")
            .withTags(mapOf())
            .withProperties(
                new MonitoringInstanceProperties()
                    .withVNetSubnetId(
                        "/subscriptions/{subscription-id}/resourceGroups/mySCOMMIGroup/providers/Microsoft.Network/virtualNetworks/vNet2/subnets/default")
                    .withDatabaseInstance(
                        new DatabaseInstanceProperties()
                            .withDatabaseInstanceId(
                                "/subscriptions/{subscription-id}/resourceGroups/mySCOMMIGroup/providers/Microsoft.sql/managedInstances/inst1"))
                    .withDomainController(
                        new DomainControllerProperties().withDomainName("domain.com").withDnsServer("10.10.10.10"))
                    .withDomainUserCredentials(
                        new DomainUserCredentials()
                            .withKeyVaultUrl("fakeTokenPlaceholder")
                            .withUsernameSecret("fakeTokenPlaceholder")
                            .withPasswordSecret("fakeTokenPlaceholder"))
                    .withGmsaDetails(
                        new GmsaDetails()
                            .withLoadBalancerIp("10.10.10.10")
                            .withGmsaAccount("vmsslb2$")
                            .withManagementServerGroupName("servergroup")
                            .withDnsName("dnsname.com"))
                    .withAzureHybridBenefit(
                        new AzureHybridBenefitProperties()
                            .withScomLicenseType(HybridLicenseType.NONE)
                            .withWindowsServerLicenseType(HybridLicenseType.NONE)
                            .withSqlServerLicenseType(HybridLicenseType.NONE)))
            .withIdentity(
                new ManagedIdentity()
                    .withType(ManagedIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                    .withUserAssignedIdentities(
                        mapOf(
                            "/subscriptions/subid/resourceGroups/mySCOMMIGroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id1",
                            new UserIdentity())))
            .create();
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

### Instances_Delete

```java
/** Samples for Instances Delete. */
public final class InstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.SCOM/preview/2022-09-13-preview/examples/Instance_Delete.json
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
/** Samples for Instances GetByResourceGroup. */
public final class InstancesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.SCOM/preview/2022-09-13-preview/examples/Instance_Get.json
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

### Instances_List

```java
/** Samples for Instances List. */
public final class InstancesListSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.SCOM/preview/2022-09-13-preview/examples/Instances_ListBySubscription.json
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
/** Samples for Instances ListByResourceGroup. */
public final class InstancesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.SCOM/preview/2022-09-13-preview/examples/Instances_ListByResourceGroup.json
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
/** Samples for Instances PatchServers. */
public final class InstancesPatchServersSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.SCOM/preview/2022-09-13-preview/examples/Instances_PatchServers.json
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

/** Samples for Instances Scale. */
public final class InstancesScaleSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.SCOM/preview/2022-09-13-preview/examples/Instance_Scale.json
     */
    /**
     * Sample code: Instances_Scale.
     *
     * @param manager Entry point to ScomManager.
     */
    public static void instancesScale(com.azure.resourcemanager.scom.ScomManager manager) {
        manager
            .instances()
            .scale(
                "myResGroup",
                "myInstace",
                new ScalingProperties().withServerCount(3L),
                com.azure.core.util.Context.NONE);
    }
}
```

### Instances_Update

```java
import com.azure.resourcemanager.scom.models.MonitoringInstance;
import java.util.HashMap;
import java.util.Map;

/** Samples for Instances Update. */
public final class InstancesUpdateSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.SCOM/preview/2022-09-13-preview/examples/Instance_Update.json
     */
    /**
     * Sample code: Instances_Patch.
     *
     * @param manager Entry point to ScomManager.
     */
    public static void instancesPatch(com.azure.resourcemanager.scom.ScomManager manager) {
        MonitoringInstance resource =
            manager
                .instances()
                .getByResourceGroupWithResponse("myResGroup", "myInstace", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("additionalProp1", "string", "additionalProp2", "string", "additionalProp3", "string"))
            .apply();
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

### Operations_ListByResourceGroup

```java
/** Samples for Operations ListByResourceGroup. */
public final class OperationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.SCOM/preview/2022-09-13-preview/examples/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     *
     * @param manager Entry point to ScomManager.
     */
    public static void operationsList(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.operations().listByResourceGroup("myGroup", com.azure.core.util.Context.NONE);
    }
}
```

