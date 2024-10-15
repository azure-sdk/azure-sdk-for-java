# Code snippets and samples


## DefenderForStorage

- [CancelMalwareScan](#defenderforstorage_cancelmalwarescan)
- [Create](#defenderforstorage_create)
- [Get](#defenderforstorage_get)
- [GetMalwareScan](#defenderforstorage_getmalwarescan)
- [StartMalwareScan](#defenderforstorage_startmalwarescan)

## Operations

- [List](#operations_list)
### DefenderForStorage_CancelMalwareScan

```java
import com.azure.resourcemanager.security.models.SettingName;

/**
 * Samples for DefenderForStorage CancelMalwareScan.
 */
public final class DefenderForStorageCancelMalwareScanSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2024-10-01-preview/examples/DefenderForStorage
     * /CancelMalwareScan_example.json
     */
    /**
     * Sample code: Cancel a Defender for Storage malware scan for the specified storage resource.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void cancelADefenderForStorageMalwareScanForTheSpecifiedStorageResource(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.defenderForStorages()
            .cancelMalwareScanWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/SampleRG/providers/Microsoft.Storage/storageAccounts/samplestorageaccount",
                SettingName.CURRENT, "latest", com.azure.core.util.Context.NONE);
    }
}
```

### DefenderForStorage_Create

```java
import com.azure.resourcemanager.security.models.DefenderForStorageSettingProperties;
import com.azure.resourcemanager.security.models.MalwareScanningProperties;
import com.azure.resourcemanager.security.models.OnUploadProperties;
import com.azure.resourcemanager.security.models.SensitiveDataDiscoveryProperties;
import com.azure.resourcemanager.security.models.SettingName;

/**
 * Samples for DefenderForStorage Create.
 */
public final class DefenderForStorageCreateSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2024-10-01-preview/examples/DefenderForStorage
     * /PutDefenderForStorageSettings_example.json
     */
    /**
     * Sample code: Creates or updates the Defender for Storage settings on a specified resource.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void createsOrUpdatesTheDefenderForStorageSettingsOnASpecifiedResource(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.defenderForStorages()
            .define(SettingName.CURRENT)
            .withExistingResourceId(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/SampleRG/providers/Microsoft.Storage/storageAccounts/samplestorageaccount")
            .withProperties(new DefenderForStorageSettingProperties().withIsEnabled(true)
                .withMalwareScanning(new MalwareScanningProperties()
                    .withOnUpload(new OnUploadProperties().withIsEnabled(true).withCapGBPerMonth(-1))
                    .withScanResultsEventGridTopicResourceId(
                        "/subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/SampleRG/providers/Microsoft.EventGrid/topics/sampletopic"))
                .withSensitiveDataDiscovery(new SensitiveDataDiscoveryProperties().withIsEnabled(true))
                .withOverrideSubscriptionLevelSettings(true))
            .create();
    }
}
```

### DefenderForStorage_Get

```java
import com.azure.resourcemanager.security.models.SettingName;

/**
 * Samples for DefenderForStorage Get.
 */
public final class DefenderForStorageGetSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2024-10-01-preview/examples/DefenderForStorage
     * /GetDefenderForStorageSettings_example.json
     */
    /**
     * Sample code: Gets the Defender for Storage settings for the specified resource.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getsTheDefenderForStorageSettingsForTheSpecifiedResource(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.defenderForStorages()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/SampleRG/providers/Microsoft.Storage/storageAccounts/samplestorageaccount",
                SettingName.CURRENT, com.azure.core.util.Context.NONE);
    }
}
```

### DefenderForStorage_GetMalwareScan

```java
import com.azure.resourcemanager.security.models.SettingName;

/**
 * Samples for DefenderForStorage GetMalwareScan.
 */
public final class DefenderForStorageGetMalwareScanSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2024-10-01-preview/examples/DefenderForStorage
     * /GetMalwareScan_example.json
     */
    /**
     * Sample code: Gets the Defender for Storage malware scan for the specified storage resource.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void getsTheDefenderForStorageMalwareScanForTheSpecifiedStorageResource(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.defenderForStorages()
            .getMalwareScanWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/SampleRG/providers/Microsoft.Storage/storageAccounts/samplestorageaccount",
                SettingName.CURRENT, "latest", com.azure.core.util.Context.NONE);
    }
}
```

### DefenderForStorage_StartMalwareScan

```java
import com.azure.resourcemanager.security.models.SettingName;

/**
 * Samples for DefenderForStorage StartMalwareScan.
 */
public final class DefenderForStorageStartMalwareScanSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2024-10-01-preview/examples/DefenderForStorage
     * /StartMalwareScan_example.json
     */
    /**
     * Sample code: Initiate a Defender for Storage malware scan for the specified storage account.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void initiateADefenderForStorageMalwareScanForTheSpecifiedStorageAccount(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.defenderForStorages()
            .startMalwareScanWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/SampleRG/providers/Microsoft.Storage/storageAccounts/samplestorageaccount",
                SettingName.CURRENT, com.azure.core.util.Context.NONE);
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
     * specification/security/resource-manager/Microsoft.Security/preview/2024-10-01-preview/examples/Operations/
     * ListOperations_example.json
     */
    /**
     * Sample code: List the operations for the Microsoft.Security (Microsoft Defender for Cloud) resource provider.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void listTheOperationsForTheMicrosoftSecurityMicrosoftDefenderForCloudResourceProvider(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

