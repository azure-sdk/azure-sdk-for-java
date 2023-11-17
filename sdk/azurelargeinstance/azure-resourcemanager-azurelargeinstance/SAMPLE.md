# Code snippets and samples


## AzureLargeInstances

- [Create](#azurelargeinstances_create)
- [Delete](#azurelargeinstances_delete)
- [GetByResourceGroup](#azurelargeinstances_getbyresourcegroup)
- [List](#azurelargeinstances_list)
- [ListByResourceGroup](#azurelargeinstances_listbyresourcegroup)
- [Restart](#azurelargeinstances_restart)
- [Shutdown](#azurelargeinstances_shutdown)
- [Start](#azurelargeinstances_start)
- [Update](#azurelargeinstances_update)

## AzureLargeStorageInstances

- [GetByResourceGroup](#azurelargestorageinstances_getbyresourcegroup)
- [List](#azurelargestorageinstances_list)
- [ListByResourceGroup](#azurelargestorageinstances_listbyresourcegroup)
- [Update](#azurelargestorageinstances_update)

## Operations

- [List](#operations_list)
### AzureLargeInstances_Create

```java
import com.azure.resourcemanager.azurelargeinstance.models.AzureLargeInstanceHardwareTypeNamesEnum;
import com.azure.resourcemanager.azurelargeinstance.models.AzureLargeInstanceSizeNamesEnum;
import com.azure.resourcemanager.azurelargeinstance.models.HardwareProfile;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for AzureLargeInstances Create.
 */
public final class AzureLargeInstancesCreateSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeInstance_Create.json
     */
    /**
     * Sample code: Create an Azure Large Instance if server is provisioned.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void createAnAzureLargeInstanceIfServerIsProvisioned(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeInstances().define("myALInstance").withRegion("westus2").withExistingResourceGroup("myResourceGroup").withTags(mapOf("key", "fakeTokenPlaceholder")).withHardwareProfile(new HardwareProfile().withHardwareType(AzureLargeInstanceHardwareTypeNamesEnum.CISCO_UCS).withAzureLargeInstanceSize(AzureLargeInstanceSizeNamesEnum.S72)).create();
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

### AzureLargeInstances_Delete

```java
/**
 * Samples for AzureLargeInstances Delete.
 */
public final class AzureLargeInstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeInstance_Delete.json
     */
    /**
     * Sample code: Delete Azure Large Instance.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void deleteAzureLargeInstance(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeInstances().delete("myResourceGroup", "myALInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstances_GetByResourceGroup

```java
/**
 * Samples for AzureLargeInstances GetByResourceGroup.
 */
public final class AzureLargeInstancesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeInstance_Get.json
     */
    /**
     * Sample code: Get an Azure Large Instance.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void getAnAzureLargeInstance(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeInstances().getByResourceGroupWithResponse("myResourceGroup", "myAzureLargeInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstances_List

```java
/**
 * Samples for AzureLargeInstances List.
 */
public final class AzureLargeInstancesListSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeInstance_ListBySubscription.json
     */
    /**
     * Sample code: List all Azure Large Instances in a subscription.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void listAllAzureLargeInstancesInASubscription(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeInstances().list(com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstances_ListByResourceGroup

```java
/**
 * Samples for AzureLargeInstances ListByResourceGroup.
 */
public final class AzureLargeInstancesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeInstance_ListByResourceGroup.json
     */
    /**
     * Sample code: List all Azure Large Instances in a resource group.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void listAllAzureLargeInstancesInAResourceGroup(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeInstances().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstances_Restart

```java
import com.azure.resourcemanager.azurelargeinstance.models.ForceState;

/**
 * Samples for AzureLargeInstances Restart.
 */
public final class AzureLargeInstancesRestartSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeInstance_Restart.json
     */
    /**
     * Sample code: Restart an Azure Large Instance.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void restartAnAzureLargeInstance(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeInstances().restart("myResourceGroup", "myALInstance", null, com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstances_Shutdown

```java
/**
 * Samples for AzureLargeInstances Shutdown.
 */
public final class AzureLargeInstancesShutdownSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeInstance_Shutdown.json
     */
    /**
     * Sample code: Shutdown an AzureLarge instance.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void shutdownAnAzureLargeInstance(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeInstances().shutdown("myResourceGroup", "myALInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstances_Start

```java
/**
 * Samples for AzureLargeInstances Start.
 */
public final class AzureLargeInstancesStartSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeInstance_Start.json
     */
    /**
     * Sample code: Start an Azure Large Instance.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void startAnAzureLargeInstance(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeInstances().start("myResourceGroup", "myALInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstances_Update

```java
import com.azure.resourcemanager.azurelargeinstance.models.AzureLargeInstance;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AzureLargeInstances Update.
 */
public final class AzureLargeInstancesUpdateSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeInstance_PatchTags.json
     */
    /**
     * Sample code: Update Tags field of an Azure Large Instance.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void updateTagsFieldOfAnAzureLargeInstance(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        AzureLargeInstance resource = manager.azureLargeInstances().getByResourceGroupWithResponse("myResourceGroup", "myALInstance", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("testkey", "fakeTokenPlaceholder")).apply();
    }

    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeInstance_PatchTags_Delete.json
     */
    /**
     * Sample code: Delete Tags field of an Azure Large Instance.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void deleteTagsFieldOfAnAzureLargeInstance(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        AzureLargeInstance resource = manager.azureLargeInstances().getByResourceGroupWithResponse("myResourceGroup", "myALInstance", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf()).apply();
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

### AzureLargeStorageInstances_GetByResourceGroup

```java
/**
 * Samples for AzureLargeStorageInstances GetByResourceGroup.
 */
public final class AzureLargeStorageInstancesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeStorageInstance_Get.json
     */
    /**
     * Sample code: Get an AzureLargeStorageStorage instance.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void getAnAzureLargeStorageStorageInstance(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeStorageInstances().getByResourceGroupWithResponse("myResourceGroup", "myAzureLargeStorageInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeStorageInstances_List

```java
/**
 * Samples for AzureLargeStorageInstances List.
 */
public final class AzureLargeStorageInstancesListSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeStorageInstance_ListBySubscription.json
     */
    /**
     * Sample code: List all AzureLargeStorageInstances in a subscription.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void listAllAzureLargeStorageInstancesInASubscription(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeStorageInstances().list(com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeStorageInstances_ListByResourceGroup

```java
/**
 * Samples for AzureLargeStorageInstances ListByResourceGroup.
 */
public final class AzureLargeStorageInstancesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeStorageInstance_ListByResourceGroup.json
     */
    /**
     * Sample code: List all AzureLargeStorageInstances in a resource group.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void listAllAzureLargeStorageInstancesInAResourceGroup(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeStorageInstances().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeStorageInstances_Update

```java
import com.azure.resourcemanager.azurelargeinstance.models.Tags;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AzureLargeStorageInstances Update.
 */
public final class AzureLargeStorageInstancesUpdateSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeStorageInstance_PatchTags.json
     */
    /**
     * Sample code: Update Tags field of an AzureLargeStorageStorage instance.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void updateTagsFieldOfAnAzureLargeStorageStorageInstance(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeStorageInstances().updateWithResponse("myResourceGroup", "myALSInstance", new Tags().withTags(mapOf("testkey", "fakeTokenPlaceholder")), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeStorageInstance_PatchTags_Delete.json
     */
    /**
     * Sample code: Delete Tags field of an AzureLargeStorageStorage instance.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void deleteTagsFieldOfAnAzureLargeStorageStorageInstance(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.azureLargeStorageInstances().updateWithResponse("myResourceGroup", "myALSInstance", new Tags().withTags(mapOf()), com.azure.core.util.Context.NONE);
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

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/preview/2023-07-20-preview/examples/AzureLargeInstanceOperations_List.json
     */
    /**
     * Sample code: List all management operations supported by the AzureLargeInstance RP.
     * 
     * @param manager Entry point to AzureLargeInstanceManager.
     */
    public static void listAllManagementOperationsSupportedByTheAzureLargeInstanceRP(com.azure.resourcemanager.azurelargeinstance.AzureLargeInstanceManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

