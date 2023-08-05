# Code snippets and samples


## AzureLargeInstance

- [Delete](#azurelargeinstance_delete)
- [GetByResourceGroup](#azurelargeinstance_getbyresourcegroup)
- [List](#azurelargeinstance_list)
- [ListByResourceGroup](#azurelargeinstance_listbyresourcegroup)
- [Put](#azurelargeinstance_put)
- [Restart](#azurelargeinstance_restart)
- [Shutdown](#azurelargeinstance_shutdown)
- [Start](#azurelargeinstance_start)
- [Update](#azurelargeinstance_update)

## AzureLargeStorageInstance

- [Create](#azurelargestorageinstance_create)
- [Delete](#azurelargestorageinstance_delete)
- [GetByResourceGroup](#azurelargestorageinstance_getbyresourcegroup)
- [List](#azurelargestorageinstance_list)
- [ListByResourceGroup](#azurelargestorageinstance_listbyresourcegroup)
- [Update](#azurelargestorageinstance_update)

## Operations

- [List](#operations_list)
### AzureLargeInstance_Delete

```java
/** Samples for AzureLargeInstance Delete. */
public final class AzureLargeInstanceDeleteSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeInstance_Delete.json
     */
    /**
     * Sample code: Delete an Azure Large Instance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void deleteAnAzureLargeInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager
            .azureLargeInstances()
            .deleteByResourceGroupWithResponse(
                "myResourceGroup", "myAzureLargeInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstance_GetByResourceGroup

```java
/** Samples for AzureLargeInstance GetByResourceGroup. */
public final class AzureLargeInstanceGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeInstance_Get.json
     */
    /**
     * Sample code: Get an Azure Large Instance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void getAnAzureLargeInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager
            .azureLargeInstances()
            .getByResourceGroupWithResponse(
                "myResourceGroup", "myAzureLargeInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstance_List

```java
/** Samples for AzureLargeInstance List. */
public final class AzureLargeInstanceListSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeInstance_ListBySubscription.json
     */
    /**
     * Sample code: List all Azure Large Instances in a subscription.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void listAllAzureLargeInstancesInASubscription(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager.azureLargeInstances().list(com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstance_ListByResourceGroup

```java
/** Samples for AzureLargeInstance ListByResourceGroup. */
public final class AzureLargeInstanceListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeInstance_ListByResourceGroup.json
     */
    /**
     * Sample code: List all Azure Large Instances in a resource group.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void listAllAzureLargeInstancesInAResourceGroup(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager.azureLargeInstances().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstance_Put

```java
/** Samples for AzureLargeInstance Put. */
public final class AzureLargeInstancePutSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeInstance_Put.json
     */
    /**
     * Sample code: Put a new Azure Large Instance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void putANewAzureLargeInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager
            .azureLargeInstances()
            .define("myAzureLargeInstance")
            .withRegion((String) null)
            .withExistingResourceGroup("myResourceGroup")
            .create();
    }
}
```

### AzureLargeInstance_Restart

```java
/** Samples for AzureLargeInstance Restart. */
public final class AzureLargeInstanceRestartSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeInstance_Restart.json
     */
    /**
     * Sample code: Restart an Azure Large Instance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void restartAnAzureLargeInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager.azureLargeInstances().restart("myResourceGroup", "myALInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstance_Shutdown

```java
/** Samples for AzureLargeInstance Shutdown. */
public final class AzureLargeInstanceShutdownSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeInstance_Shutdown.json
     */
    /**
     * Sample code: Shutdown an AzureLarge instance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void shutdownAnAzureLargeInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager.azureLargeInstances().shutdown("myResourceGroup", "myALInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstance_Start

```java
/** Samples for AzureLargeInstance Start. */
public final class AzureLargeInstanceStartSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeInstance_Start.json
     */
    /**
     * Sample code: Start an Azure Large Instance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void startAnAzureLargeInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager.azureLargeInstances().start("myResourceGroup", "myALInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeInstance_Update

```java
import com.azure.resourcemanager.azurelargeinstance.models.AzureLargeInstance;
import java.util.HashMap;
import java.util.Map;

/** Samples for AzureLargeInstance Update. */
public final class AzureLargeInstanceUpdateSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeInstance_PatchTags.json
     */
    /**
     * Sample code: Update Tags field of an Azure Large Instance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void updateTagsFieldOfAnAzureLargeInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        AzureLargeInstance resource =
            manager
                .azureLargeInstances()
                .getByResourceGroupWithResponse("myResourceGroup", "myALInstance", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("testkey", "fakeTokenPlaceholder")).apply();
    }

    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeInstance_PatchTags_Delete.json
     */
    /**
     * Sample code: Delete Tags field of an Azure Large Instance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void deleteTagsFieldOfAnAzureLargeInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        AzureLargeInstance resource =
            manager
                .azureLargeInstances()
                .getByResourceGroupWithResponse("myResourceGroup", "myALInstance", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf()).apply();
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

### AzureLargeStorageInstance_Create

```java
import com.azure.resourcemanager.azurelargeinstance.models.ProvisioningState;
import com.azure.resourcemanager.azurelargeinstance.models.StorageBillingProperties;
import com.azure.resourcemanager.azurelargeinstance.models.StorageProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for AzureLargeStorageInstance Create. */
public final class AzureLargeStorageInstanceCreateSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeStorageInstance_Create.json
     */
    /**
     * Sample code: Put a new AzureLargeStorageInstance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void putANewAzureLargeStorageInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager
            .azureLargeStorageInstances()
            .define("myAzureLargeStorageInstance")
            .withRegion("westus2")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("key", "fakeTokenPlaceholder"))
            .withAzureLargeStorageInstanceUniqueIdentifier("23415635-4d7e-41dc-9598-8194f22c24e9")
            .withStorageProperties(
                new StorageProperties()
                    .withProvisioningState(ProvisioningState.SUCCEEDED)
                    .withOfferingType("EPIC")
                    .withStorageType("FC")
                    .withGeneration("Gen4")
                    .withHardwareType("NetApp")
                    .withWorkloadType("ODB")
                    .withStorageBillingProperties(new StorageBillingProperties().withBillingMode("PAYG").withSku("")))
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

### AzureLargeStorageInstance_Delete

```java
/** Samples for AzureLargeStorageInstance Delete. */
public final class AzureLargeStorageInstanceDeleteSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeStorageInstance_Delete.json
     */
    /**
     * Sample code: Delete an AzureLargeStorageInstance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void deleteAnAzureLargeStorageInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager
            .azureLargeStorageInstances()
            .deleteByResourceGroupWithResponse(
                "myResourceGroup", "myAzureLargeStorageInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeStorageInstance_GetByResourceGroup

```java
/** Samples for AzureLargeStorageInstance GetByResourceGroup. */
public final class AzureLargeStorageInstanceGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeStorageInstance_Get.json
     */
    /**
     * Sample code: Get an AzureLargeStorageStorage instance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void getAnAzureLargeStorageStorageInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager
            .azureLargeStorageInstances()
            .getByResourceGroupWithResponse(
                "myResourceGroup", "myAzureLargeStorageInstance", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeStorageInstance_List

```java
/** Samples for AzureLargeStorageInstance List. */
public final class AzureLargeStorageInstanceListSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeStorageInstance_ListBySubscription.json
     */
    /**
     * Sample code: List all AzureLargeStorageInstances in a subscription.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void listAllAzureLargeStorageInstancesInASubscription(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager.azureLargeStorageInstances().list(com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeStorageInstance_ListByResourceGroup

```java
/** Samples for AzureLargeStorageInstance ListByResourceGroup. */
public final class AzureLargeStorageInstanceListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeStorageInstance_ListByResourceGroup.json
     */
    /**
     * Sample code: List all AzureLargeStorageInstances in a resource group.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void listAllAzureLargeStorageInstancesInAResourceGroup(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager.azureLargeStorageInstances().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### AzureLargeStorageInstance_Update

```java
import com.azure.resourcemanager.azurelargeinstance.models.AzureLargeStorageInstance;
import java.util.HashMap;
import java.util.Map;

/** Samples for AzureLargeStorageInstance Update. */
public final class AzureLargeStorageInstanceUpdateSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeStorageInstance_PatchTags.json
     */
    /**
     * Sample code: Update Tags field of an AzureLargeStorageStorage instance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void updateTagsFieldOfAnAzureLargeStorageStorageInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        AzureLargeStorageInstance resource =
            manager
                .azureLargeStorageInstances()
                .getByResourceGroupWithResponse("myResourceGroup", "myALSInstance", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("testkey", "fakeTokenPlaceholder")).apply();
    }

    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeStorageInstance_PatchTags_Delete.json
     */
    /**
     * Sample code: Delete Tags field of an AzureLargeStorageStorage instance.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void deleteTagsFieldOfAnAzureLargeStorageStorageInstance(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        AzureLargeStorageInstance resource =
            manager
                .azureLargeStorageInstances()
                .getByResourceGroupWithResponse("myResourceGroup", "myALSInstance", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf()).apply();
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

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/azurelargeinstance/resource-manager/Microsoft.AzureLargeInstance/stable/2023-07-20/examples/AzureLargeInstanceOperations_List.json
     */
    /**
     * Sample code: List all management operations supported by the AzureLargeInstance RP.
     *
     * @param manager Entry point to AzurelargeinstanceManager.
     */
    public static void listAllManagementOperationsSupportedByTheAzureLargeInstanceRP(
        com.azure.resourcemanager.azurelargeinstance.AzurelargeinstanceManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

