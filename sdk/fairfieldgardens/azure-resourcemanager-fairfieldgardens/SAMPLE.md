# Code snippets and samples


## DeviceProvisioningStates

- [CreateOrUpdate](#deviceprovisioningstates_createorupdate)
- [Delete](#deviceprovisioningstates_delete)
- [Get](#deviceprovisioningstates_get)
- [List](#deviceprovisioningstates_list)
- [Update](#deviceprovisioningstates_update)

## Operations

- [List](#operations_list)

## ProvisioningPolicies

- [CreateOrUpdate](#provisioningpolicies_createorupdate)
- [Delete](#provisioningpolicies_delete)
- [Get](#provisioningpolicies_get)
- [ListByProvisioningResource](#provisioningpolicies_listbyprovisioningresource)
- [Update](#provisioningpolicies_update)

## ProvisioningResources

- [CreateOrUpdate](#provisioningresources_createorupdate)
- [Delete](#provisioningresources_delete)
- [GetByResourceGroup](#provisioningresources_getbyresourcegroup)
- [List](#provisioningresources_list)
- [ListByResourceGroup](#provisioningresources_listbyresourcegroup)
- [Update](#provisioningresources_update)
### DeviceProvisioningStates_CreateOrUpdate

```java
import com.azure.resourcemanager.fairfieldgardens.fluent.models.DeviceProvisioningStateInner;
import com.azure.resourcemanager.fairfieldgardens.models.OnboardingStatus;
import java.util.stream.Collectors;

/**
 * Samples for DeviceProvisioningStates CreateOrUpdate.
 */
public final class DeviceProvisioningStatesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/DeviceProvisioningStates_CreateOrUpdate.json
     */
    /**
     * Sample code: DeviceProvisioningStates_CreateOrUpdate.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void deviceProvisioningStatesCreateOrUpdate(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.deviceProvisioningStates().createOrUpdateWithResponse("subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testrg/providers/Microsoft.Devices/provisioningServices/exampleProvisioningServiceName/enrollments/exampleEnrollmentId/deviceProvisioningStates/examplename", new DeviceProvisioningStateInner().withRegistrationId("inbhfzvbvuqehnlnxyuxrlfbgiczi").withOnboardingStatus(OnboardingStatus.PENDING).withDiscoveryEnabled(true).withProvisioningPolicyResourceId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/exampleResourceGroup/providers/Microsoft.FairfieldGardens/provisioningResources/exampleProvisioningResource/provisioningPolicies/examplePolicyName"), com.azure.core.util.Context.NONE);
    }
}
```

### DeviceProvisioningStates_Delete

```java
/**
 * Samples for DeviceProvisioningStates Delete.
 */
public final class DeviceProvisioningStatesDeleteSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/DeviceProvisioningStates_Delete.json
     */
    /**
     * Sample code: DeviceProvisioningStates_Delete.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void deviceProvisioningStatesDelete(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.deviceProvisioningStates().deleteWithResponse("subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testrg/providers/Microsoft.Devices/provisioningServices/exampleProvisioningServiceName/enrollments/exampleEnrollmentId/deviceProvisioningStates/examplename", com.azure.core.util.Context.NONE);
    }
}
```

### DeviceProvisioningStates_Get

```java
/**
 * Samples for DeviceProvisioningStates Get.
 */
public final class DeviceProvisioningStatesGetSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/DeviceProvisioningStates_Get.json
     */
    /**
     * Sample code: DeviceProvisioningStates_Get.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void deviceProvisioningStatesGet(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.deviceProvisioningStates().getWithResponse("subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testrg/providers/Microsoft.Devices/provisioningServices/exampleProvisioningServiceName/enrollments/exampleEnrollmentId/deviceProvisioningStates/examplename", com.azure.core.util.Context.NONE);
    }
}
```

### DeviceProvisioningStates_List

```java
/**
 * Samples for DeviceProvisioningStates List.
 */
public final class DeviceProvisioningStatesListSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/DeviceProvisioningStates_List.json
     */
    /**
     * Sample code: DeviceProvisioningStates_List.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void deviceProvisioningStatesList(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.deviceProvisioningStates().list("subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testrg/providers/Microsoft.Devices/provisioningServices/exampleProvisioningServiceName/enrollments/exampleEnrollmentId/deviceProvisioningStates/examplename", com.azure.core.util.Context.NONE);
    }
}
```

### DeviceProvisioningStates_Update

```java
import com.azure.resourcemanager.fairfieldgardens.models.DeviceProvisioningStateUpdate;
import com.azure.resourcemanager.fairfieldgardens.models.OnboardingStatus;
import java.util.stream.Collectors;

/**
 * Samples for DeviceProvisioningStates Update.
 */
public final class DeviceProvisioningStatesUpdateSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/DeviceProvisioningStates_Update.json
     */
    /**
     * Sample code: DeviceProvisioningStates_Update.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void deviceProvisioningStatesUpdate(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.deviceProvisioningStates().updateWithResponse("subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testrg/providers/Microsoft.Devices/provisioningServices/exampleProvisioningServiceName/enrollments/exampleEnrollmentId/deviceProvisioningStates/examplename", new DeviceProvisioningStateUpdate().withOnboardingStatus(OnboardingStatus.PENDING).withDiscoveryEnabled(true).withProvisioningPolicyResourceId("/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/exampleResourceGroup/providers/Microsoft.FairfieldGardens/provisioningResources/exampleProvisioningResource/provisioningPolicies/examplePolicyName"), com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void operationsList(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ProvisioningPolicies_CreateOrUpdate

```java
import com.azure.resourcemanager.fairfieldgardens.models.AllocationEndpoint;
import com.azure.resourcemanager.fairfieldgardens.models.DeviceRegistryProvisioningPolicyResourceDetails;
import com.azure.resourcemanager.fairfieldgardens.models.EndpointType;
import com.azure.resourcemanager.fairfieldgardens.models.EvenlyDistributedAllocationRule;
import com.azure.resourcemanager.fairfieldgardens.models.IdentityInfo;
import com.azure.resourcemanager.fairfieldgardens.models.JitRule;
import com.azure.resourcemanager.fairfieldgardens.models.X509BootstrapAuthenticationRule;
import com.azure.resourcemanager.fairfieldgardens.models.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for ProvisioningPolicies CreateOrUpdate.
 */
public final class ProvisioningPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/ProvisioningPolicies_CreateOrUpdate.json
     */
    /**
     * Sample code: ProvisioningPolicies_CreateOrUpdate.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void provisioningPoliciesCreateOrUpdate(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.provisioningPolicies().define("I--q").withRegion("ltkyyilngvwkirs").withExistingProvisioningResource("rgopenapi", "3u2333IBL").withTags(mapOf()).withDescription("example description of the provisioning policy").withStatus(true).withBootstrapAuthentication(new X509BootstrapAuthenticationRule().withPrimaryCertificate(new X509Certificate().withCertificate("ZXhhbXBsZSBjZXJ0aWZpY2F0ZSBmb3IgYXp1cmU=")).withSecondaryCertificate(new X509Certificate().withCertificate("ZXhhbXBsZSBjZXJ0aWipY2F0ZSBmb3IgYXp1cmU="))).withAllocations(Arrays.asList(new EvenlyDistributedAllocationRule().withName("grxgkqrzwudpsfmpo").withEndpointType(EndpointType.MICROSOFT_EVENT_GRID_NAMESPACES).withEndpoints(Arrays.asList(new AllocationEndpoint().withResourceId("/subscriptions/vzbhvmvyczrhnuzwd/resourceGroups/K_-/providers/Microsoft.EventGrid/namespaces/testStaticAllocationEndpoint").withHostname("testStaticAllocationEndpoint.azure.net"))))).withJit(new JitRule().withPriority(10).withSubscriptionId("vzbhvmvyczrhnuzwd").withResourceGroupName("K_-")).withResourceDetails(new DeviceRegistryProvisioningPolicyResourceDetails().withOperationalIdentityInfo(new IdentityInfo().withDeviceTemplateId("00000000-0000-0000-0000-00000000").withStaticGroupId("00000000-0000-0000-0000-00000000"))).create();
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

### ProvisioningPolicies_Delete

```java
/**
 * Samples for ProvisioningPolicies Delete.
 */
public final class ProvisioningPoliciesDeleteSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/ProvisioningPolicies_Delete.json
     */
    /**
     * Sample code: ProvisioningPolicies_Delete.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void provisioningPoliciesDelete(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.provisioningPolicies().deleteWithResponse("rgopenapi", "F7M4US815B7OP9-S--Q", "3926Vy-7K1-m878T366", com.azure.core.util.Context.NONE);
    }
}
```

### ProvisioningPolicies_Get

```java
/**
 * Samples for ProvisioningPolicies Get.
 */
public final class ProvisioningPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/ProvisioningPolicies_Get.json
     */
    /**
     * Sample code: ProvisioningPolicies_Get.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void provisioningPoliciesGet(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.provisioningPolicies().getWithResponse("rgopenapi", "QDnuX5r6684GtJ62", "QDnuX5r6684GtJ62", com.azure.core.util.Context.NONE);
    }
}
```

### ProvisioningPolicies_ListByProvisioningResource

```java
/**
 * Samples for ProvisioningPolicies ListByProvisioningResource.
 */
public final class ProvisioningPoliciesListByProvisioningResourceSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/ProvisioningPolicies_ListByProvisioningResource.json
     */
    /**
     * Sample code: ProvisioningPolicies_ListByProvisioningResource.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void provisioningPoliciesListByProvisioningResource(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.provisioningPolicies().listByProvisioningResource("rgopenapi", "j50p7S25iW32", com.azure.core.util.Context.NONE);
    }
}
```

### ProvisioningPolicies_Update

```java
import com.azure.resourcemanager.fairfieldgardens.models.AllocationEndpoint;
import com.azure.resourcemanager.fairfieldgardens.models.DeviceRegistryProvisioningPolicyResourceDetails;
import com.azure.resourcemanager.fairfieldgardens.models.EndpointType;
import com.azure.resourcemanager.fairfieldgardens.models.EvenlyDistributedAllocationRule;
import com.azure.resourcemanager.fairfieldgardens.models.IdentityInfo;
import com.azure.resourcemanager.fairfieldgardens.models.JitRuleUpdate;
import com.azure.resourcemanager.fairfieldgardens.models.ProvisioningPolicy;
import com.azure.resourcemanager.fairfieldgardens.models.X509BootstrapAuthenticationRule;
import com.azure.resourcemanager.fairfieldgardens.models.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for ProvisioningPolicies Update.
 */
public final class ProvisioningPoliciesUpdateSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/ProvisioningPolicies_Update.json
     */
    /**
     * Sample code: ProvisioningPolicies_Update.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void provisioningPoliciesUpdate(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        ProvisioningPolicy resource = manager.provisioningPolicies().getWithResponse("rgopenapi", "Jack", "QDnuX5r6684GtJ62", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("key5221", "fakeTokenPlaceholder")).withDescription("example description of the provisioning policy").withStatus(true).withBootstrapAuthentication(new X509BootstrapAuthenticationRule().withPrimaryCertificate(new X509Certificate().withCertificate("ZXhhbXBsZSBjZXJ0aWZpY2F0ZSBmb3IgYXp1cmU=")).withSecondaryCertificate(new X509Certificate().withCertificate("ZXhhbXBsZSBjZXJ0aWipY2F0ZSBmb3IgYXp1cmU="))).withAllocations(Arrays.asList(new EvenlyDistributedAllocationRule().withName("grxgkqrzwudpsfmpo").withEndpointType(EndpointType.MICROSOFT_EVENT_GRID_NAMESPACES).withEndpoints(Arrays.asList(new AllocationEndpoint().withResourceId("/subscriptions/vzbhvmvyczrhnuzwd/resourceGroups/K_-/providers/Microsoft.EventGrid/namespaces/testStaticAllocationEndpoint").withHostname("testStaticAllocationEndpoint.azure.net"))))).withJit(new JitRuleUpdate().withPriority(10).withSubscriptionId("vzbhvmvyczrhnuzwd").withResourceGroupName("K_-")).withResourceDetails(new DeviceRegistryProvisioningPolicyResourceDetails().withOperationalIdentityInfo(new IdentityInfo().withDeviceTemplateId("00000000-0000-0000-0000-00000000").withStaticGroupId("00000000-0000-0000-0000-00000000"))).apply();
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

### ProvisioningResources_CreateOrUpdate

```java
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ProvisioningResources CreateOrUpdate.
 */
public final class ProvisioningResourcesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/ProvisioningResources_CreateOrUpdate.json
     */
    /**
     * Sample code: ProvisioningResources_CreateOrUpdate.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void provisioningResourcesCreateOrUpdate(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.provisioningResources().define("Jack").withRegion("eastus").withExistingResourceGroup("testrg").withTags(mapOf()).withEnableOperationalCertificates(true).create();
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

### ProvisioningResources_Delete

```java
/**
 * Samples for ProvisioningResources Delete.
 */
public final class ProvisioningResourcesDeleteSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/ProvisioningResources_Delete.json
     */
    /**
     * Sample code: ProvisioningResources_Delete.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void provisioningResourcesDelete(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.provisioningResources().delete("rgopenapi", "Jack", com.azure.core.util.Context.NONE);
    }
}
```

### ProvisioningResources_GetByResourceGroup

```java
/**
 * Samples for ProvisioningResources GetByResourceGroup.
 */
public final class ProvisioningResourcesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/ProvisioningResources_Get.json
     */
    /**
     * Sample code: GetProvisioningResource.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void getProvisioningResource(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.provisioningResources().getByResourceGroupWithResponse("testrg", "Jack", com.azure.core.util.Context.NONE);
    }
}
```

### ProvisioningResources_List

```java
/**
 * Samples for ProvisioningResources List.
 */
public final class ProvisioningResourcesListSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/ProvisioningResources_ListBySubscription.json
     */
    /**
     * Sample code: ProvisioningResources_ListBySubscription.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void provisioningResourcesListBySubscription(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.provisioningResources().list(com.azure.core.util.Context.NONE);
    }
}
```

### ProvisioningResources_ListByResourceGroup

```java
/**
 * Samples for ProvisioningResources ListByResourceGroup.
 */
public final class ProvisioningResourcesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/ProvisioningResources_ListByResourceGroup.json
     */
    /**
     * Sample code: ProvisioningResources_ListByResourceGroup.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void provisioningResourcesListByResourceGroup(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        manager.provisioningResources().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### ProvisioningResources_Update

```java
import com.azure.resourcemanager.fairfieldgardens.models.ProvisioningResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ProvisioningResources Update.
 */
public final class ProvisioningResourcesUpdateSamples {
    /*
     * x-ms-original-file: specification/fairfieldgardens/resource-manager/Microsoft.FairfieldGardens/preview/2023-12-01-preview/examples/ProvisioningResources_Update.json
     */
    /**
     * Sample code: ProvisioningResources_Update.
     * 
     * @param manager Entry point to FairfieldgardensManager.
     */
    public static void provisioningResourcesUpdate(com.azure.resourcemanager.fairfieldgardens.FairfieldgardensManager manager) {
        ProvisioningResource resource = manager.provisioningResources().getByResourceGroupWithResponse("rgopenapi", "Jack", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("key7410", "fakeTokenPlaceholder")).apply();
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

