# Code snippets and samples


## AzureExtendedZones

- [Get](#azureextendedzones_get)
- [List](#azureextendedzones_list)
- [Register](#azureextendedzones_register)
- [Unregister](#azureextendedzones_unregister)

## Operations

- [List](#operations_list)
### AzureExtendedZones_Get

```java
/**
 * Samples for AzureExtendedZones Get.
 */
public final class AzureExtendedZonesGetSamples {
    /*
     * x-ms-original-file:
     * specification/edgezones/resource-manager/Microsoft.EdgeZones/preview/2024-04-01-preview/examples/
     * AzureExtendedZones_Get.json
     */
    /**
     * Sample code: GetAzureExtendedZone.
     * 
     * @param manager Entry point to EdgezonesManager.
     */
    public static void getAzureExtendedZone(com.azure.resourcemanager.edgezones.EdgezonesManager manager) {
        manager.azureExtendedZones().getWithResponse("losangeles", com.azure.core.util.Context.NONE);
    }
}
```

### AzureExtendedZones_List

```java
/**
 * Samples for AzureExtendedZones List.
 */
public final class AzureExtendedZonesListSamples {
    /*
     * x-ms-original-file:
     * specification/edgezones/resource-manager/Microsoft.EdgeZones/preview/2024-04-01-preview/examples/
     * AzureExtendedZones_ListBySubscription.json
     */
    /**
     * Sample code: ListAzureExtendedZones.
     * 
     * @param manager Entry point to EdgezonesManager.
     */
    public static void listAzureExtendedZones(com.azure.resourcemanager.edgezones.EdgezonesManager manager) {
        manager.azureExtendedZones().list(com.azure.core.util.Context.NONE);
    }
}
```

### AzureExtendedZones_Register

```java
/**
 * Samples for AzureExtendedZones Register.
 */
public final class AzureExtendedZonesRegisterSamples {
    /*
     * x-ms-original-file:
     * specification/edgezones/resource-manager/Microsoft.EdgeZones/preview/2024-04-01-preview/examples/
     * AzureExtendedZones_Register.json
     */
    /**
     * Sample code: RegisterAzureExtendedZone.
     * 
     * @param manager Entry point to EdgezonesManager.
     */
    public static void registerAzureExtendedZone(com.azure.resourcemanager.edgezones.EdgezonesManager manager) {
        manager.azureExtendedZones().registerWithResponse("losangeles", com.azure.core.util.Context.NONE);
    }
}
```

### AzureExtendedZones_Unregister

```java
/**
 * Samples for AzureExtendedZones Unregister.
 */
public final class AzureExtendedZonesUnregisterSamples {
    /*
     * x-ms-original-file:
     * specification/edgezones/resource-manager/Microsoft.EdgeZones/preview/2024-04-01-preview/examples/
     * AzureExtendedZones_Unregister.json
     */
    /**
     * Sample code: UnregisterAzureExtendedZone.
     * 
     * @param manager Entry point to EdgezonesManager.
     */
    public static void unregisterAzureExtendedZone(com.azure.resourcemanager.edgezones.EdgezonesManager manager) {
        manager.azureExtendedZones().unregisterWithResponse("losangeles", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file:
     * specification/edgezones/resource-manager/Microsoft.EdgeZones/preview/2024-04-01-preview/examples/Operations_List.
     * json
     */
    /**
     * Sample code: ListOperations.
     * 
     * @param manager Entry point to EdgezonesManager.
     */
    public static void listOperations(com.azure.resourcemanager.edgezones.EdgezonesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

