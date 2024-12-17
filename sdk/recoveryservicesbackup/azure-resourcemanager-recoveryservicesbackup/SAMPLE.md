# Code snippets and samples


## AadPropertiesOperation

- [Get](#aadpropertiesoperation_get)

## BackupCrrJobDetails

- [Get](#backupcrrjobdetails_get)

## BackupCrrJobs

- [List](#backupcrrjobs_list)

## BackupProtectedItemsCrr

- [List](#backupprotecteditemscrr_list)

## BackupResourceStorageConfigs

- [Get](#backupresourcestorageconfigs_get)
- [Patch](#backupresourcestorageconfigs_patch)
- [Update](#backupresourcestorageconfigs_update)

## BackupUsageSummariesCrr

- [List](#backupusagesummariescrr_list)

## CrossRegionRestore

- [Trigger](#crossregionrestore_trigger)

## CrrOperationResults

- [Get](#crroperationresults_get)

## CrrOperationStatus

- [Get](#crroperationstatus_get)

## RecoveryPoints

- [GetAccessToken](#recoverypoints_getaccesstoken)

## RecoveryPointsCrr

- [Get](#recoverypointscrr_get)
- [List](#recoverypointscrr_list)
### AadPropertiesOperation_Get

```java
/**
 * Samples for AadPropertiesOperation Get.
 */
public final class AadPropertiesOperationGetSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * AzureIaasVm/BackupAadProperties_Get.json
     */
    /**
     * Sample code: Get AAD Properties for authentication in the third region.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getAADPropertiesForAuthenticationInTheThirdRegion(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.aadPropertiesOperations().getWithResponse("southeastasia", null, com.azure.core.util.Context.NONE);
    }
}
```

### BackupCrrJobDetails_Get

```java
import com.azure.resourcemanager.recoveryservicesbackup.models.CrrJobRequest;

/**
 * Samples for BackupCrrJobDetails Get.
 */
public final class BackupCrrJobDetailsGetSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * AzureIaasVm/GetCrrJob_Post.json
     */
    /**
     * Sample code: Get Cross Region Restore Job Details in the secondary region.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getCrossRegionRestoreJobDetailsInTheSecondaryRegion(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupCrrJobDetails()
            .getWithResponse("southeastasia", new CrrJobRequest().withResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Compute/VirtualMachines/testVm")
                .withJobName("02585cc9-d7f4-4b46-860c-14c048cce178"), com.azure.core.util.Context.NONE);
    }
}
```

### BackupCrrJobs_List

```java
import com.azure.resourcemanager.recoveryservicesbackup.models.CrrJobRequest;

/**
 * Samples for BackupCrrJobs List.
 */
public final class BackupCrrJobsListSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * AzureIaasVm/ListCrrJobs_Post.json
     */
    /**
     * Sample code: List Cross Region Restore Jobs in the secondary region.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void listCrossRegionRestoreJobsInTheSecondaryRegion(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupCrrJobs()
            .list("southeastasia", new CrrJobRequest().withResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.Compute/VirtualMachines/testVm")
                .withJobName("02585cc9-d7f4-4b46-860c-14c048cce178"), null, null, com.azure.core.util.Context.NONE);
    }
}
```

### BackupProtectedItemsCrr_List

```java
/**
 * Samples for BackupProtectedItemsCrr List.
 */
public final class BackupProtectedItemsCrrListSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * AzureIaasVm/BackupProtectedItems_List.json
     */
    /**
     * Sample code: List protected items with backupManagementType filter as AzureIaasVm.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void listProtectedItemsWithBackupManagementTypeFilterAsAzureIaasVm(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupProtectedItemsCrrs()
            .list("NetSDKTestRsVault", "SwaggerTestRg", "backupManagementType eq 'AzureIaasVM' and itemType eq 'VM'",
                null, com.azure.core.util.Context.NONE);
    }
}
```

### BackupResourceStorageConfigs_Get

```java
/**
 * Samples for BackupResourceStorageConfigs Get.
 */
public final class BackupResourceStorageConfigsGetSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * Common/BackupStorageConfig_Get.json
     */
    /**
     * Sample code: Get Vault Storage Configuration.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getVaultStorageConfiguration(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupResourceStorageConfigs()
            .getWithResponse("PySDKBackupTestRsVault", "PythonSDKBackupTestRg", com.azure.core.util.Context.NONE);
    }
}
```

### BackupResourceStorageConfigs_Patch

```java
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupResourceConfigResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceConfig;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageType;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageTypeState;

/**
 * Samples for BackupResourceStorageConfigs Patch.
 */
public final class BackupResourceStorageConfigsPatchSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * Common/BackupStorageConfig_Patch.json
     */
    /**
     * Sample code: Update Vault Storage Configuration.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void updateVaultStorageConfiguration(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupResourceStorageConfigs()
            .patchWithResponse("PySDKBackupTestRsVault", "PythonSDKBackupTestRg",
                new BackupResourceConfigResourceInner()
                    .withProperties(new BackupResourceConfig().withStorageType(StorageType.LOCALLY_REDUNDANT)
                        .withStorageTypeState(StorageTypeState.UNLOCKED)),
                com.azure.core.util.Context.NONE);
    }
}
```

### BackupResourceStorageConfigs_Update

```java
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupResourceConfigResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceConfig;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageType;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageTypeState;

/**
 * Samples for BackupResourceStorageConfigs Update.
 */
public final class BackupResourceStorageConfigsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * Common/BackupStorageConfig_Put.json
     */
    /**
     * Sample code: Update Vault Storage Configuration.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void updateVaultStorageConfiguration(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupResourceStorageConfigs()
            .updateWithResponse("PySDKBackupTestRsVault", "PythonSDKBackupTestRg",
                new BackupResourceConfigResourceInner()
                    .withProperties(new BackupResourceConfig().withStorageType(StorageType.LOCALLY_REDUNDANT)
                        .withStorageTypeState(StorageTypeState.UNLOCKED)),
                com.azure.core.util.Context.NONE);
    }
}
```

### BackupUsageSummariesCrr_List

```java
/**
 * Samples for BackupUsageSummariesCrr List.
 */
public final class BackupUsageSummariesCrrListSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * Common/BackupProtectedItem_UsageSummary_Get.json
     */
    /**
     * Sample code: Get Protected Items Usages Summary.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getProtectedItemsUsagesSummary(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupUsageSummariesCrrs()
            .list("testVault", "testRG", "type eq 'BackupProtectedItemCountSummary'", null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * Common/BackupProtectionContainers_UsageSummary_Get.json
     */
    /**
     * Sample code: Get Protected Containers Usages Summary.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getProtectedContainersUsagesSummary(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.backupUsageSummariesCrrs()
            .list("testVault", "testRG", "type eq 'BackupProtectionContainerCountSummary'", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### CrossRegionRestore_Trigger

```java
import com.azure.resourcemanager.recoveryservicesbackup.models.CrossRegionRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.EncryptionDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.IaasVMRestoreRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.IdentityBasedRestoreDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.IdentityInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadCrrAccessToken;
import java.util.Arrays;

/**
 * Samples for CrossRegionRestore Trigger.
 */
public final class CrossRegionRestoreTriggerSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * AzureIaasVm/TriggerCrossRegionRestore_Post.json
     */
    /**
     * Sample code: Trigger Cross Region Restore.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void triggerCrossRegionRestore(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.crossRegionRestores()
            .trigger("southeastasia", new CrossRegionRestoreRequest()
                .withCrossRegionRestoreAccessDetails(
                    new WorkloadCrrAccessToken().withAccessTokenString("fakeTokenPlaceholder")
                        .withSubscriptionId("f2edfd5d-5496-4683-b94f-b3588c579009")
                        .withResourceGroupName("srinivasccyrg")
                        .withResourceName("sriniccyvault")
                        .withResourceId("1330837906418138160")
                        .withRecoveryPointId("87178355392716")
                        .withRecoveryPointTime("10/9/2019 6:05:54 PM")
                        .withContainerName("iaasvmcontainerv2;srinivasccyrg;sriniccylinux")
                        .withContainerType("IaasVMContainer")
                        .withBackupManagementType("AzureIaasVM")
                        .withDatasourceType("VM")
                        .withDatasourceName("sriniccylinux")
                        .withDatasourceId("1142937031")
                        .withDatasourceContainerName("iaasvmcontainerv2;srinivasccyrg;sriniccylinux")
                        .withCoordinatorServiceStampUri("https://pod01-coord1.ccy.backup.windowsazure.com")
                        .withProtectionServiceStampId("90d98224-2ac6-4bda-9f35-33fb22841f2a")
                        .withProtectionServiceStampUri("https://pod01-prot1-int.ccy.backup.windowsazure.com")
                        .withTokenExtendedInformation("fakeTokenPlaceholder"))
                .withRestoreRequest(new IaasVMRestoreRequest().withRecoveryPointId("87178355392716")
                    .withRecoveryType(RecoveryType.ALTERNATE_LOCATION)
                    .withSourceResourceId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/srinivasccyrg/providers/Microsoft.Compute/virtualMachines/sriniccylinux")
                    .withTargetVirtualMachineId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/00networkAckl/providers/Microsoft.Compute/virtualMachines/gaallaVM")
                    .withTargetResourceGroupId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/00networkAckl")
                    .withStorageAccountId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/00prjaiTestRg1/providers/Microsoft.Storage/storageAccounts/00prjaitestrg1disks993")
                    .withVirtualNetworkId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/00networkAcklVaultCCY/providers/Microsoft.Network/virtualNetworks/00networkAcklVaultCCY-vnet")
                    .withSubnetId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/00networkAcklVaultCCY/providers/Microsoft.Network/virtualNetworks/00networkAcklVaultCCY-vnet/subnets/default")
                    .withRegion("eastus2euap")
                    .withAffinityGroup("")
                    .withCreateNewCloudService(false)
                    .withOriginalStorageAccountOption(false)
                    .withEncryptionDetails(new EncryptionDetails().withEncryptionEnabled(false))
                    .withZones(Arrays.asList("2"))
                    .withIdentityInfo(new IdentityInfo().withIsSystemAssignedIdentity(false)
                        .withManagedIdentityResourceId(
                            "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/asmaskarRG1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/asmaskartestmsi"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * AzureIaasVm/TriggerCrossRegionRestore_IdentityBasedRestoreDetails_Post.json
     */
    /**
     * Sample code: Trigger Cross Region Restore with identityBasedRestoreDetails.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void triggerCrossRegionRestoreWithIdentityBasedRestoreDetails(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.crossRegionRestores()
            .trigger("southeastasia", new CrossRegionRestoreRequest()
                .withCrossRegionRestoreAccessDetails(
                    new WorkloadCrrAccessToken().withAccessTokenString("fakeTokenPlaceholder")
                        .withSubscriptionId("f2edfd5d-5496-4683-b94f-b3588c579009")
                        .withResourceGroupName("srinivasccyrg")
                        .withResourceName("sriniccyvault")
                        .withResourceId("1330837906418138160")
                        .withRecoveryPointId("87178355392716")
                        .withRecoveryPointTime("10/9/2019 6:05:54 PM")
                        .withContainerName("iaasvmcontainerv2;srinivasccyrg;sriniccylinux")
                        .withContainerType("IaasVMContainer")
                        .withBackupManagementType("AzureIaasVM")
                        .withDatasourceType("VM")
                        .withDatasourceName("sriniccylinux")
                        .withDatasourceId("1142937031")
                        .withDatasourceContainerName("iaasvmcontainerv2;srinivasccyrg;sriniccylinux")
                        .withCoordinatorServiceStampUri("https://pod01-coord1.ccy.backup.windowsazure.com")
                        .withProtectionServiceStampId("90d98224-2ac6-4bda-9f35-33fb22841f2a")
                        .withProtectionServiceStampUri("https://pod01-prot1-int.ccy.backup.windowsazure.com")
                        .withTokenExtendedInformation("fakeTokenPlaceholder"))
                .withRestoreRequest(new IaasVMRestoreRequest().withRecoveryPointId("87178355392716")
                    .withRecoveryType(RecoveryType.ALTERNATE_LOCATION)
                    .withSourceResourceId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/srinivasccyrg/providers/Microsoft.Compute/virtualMachines/sriniccylinux")
                    .withTargetVirtualMachineId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/00networkAckl/providers/Microsoft.Compute/virtualMachines/gaallaVM")
                    .withTargetResourceGroupId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/00networkAckl")
                    .withVirtualNetworkId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/00networkAcklVaultCCY/providers/Microsoft.Network/virtualNetworks/00networkAcklVaultCCY-vnet")
                    .withSubnetId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/00networkAcklVaultCCY/providers/Microsoft.Network/virtualNetworks/00networkAcklVaultCCY-vnet/subnets/default")
                    .withRegion("eastus2euap")
                    .withAffinityGroup("")
                    .withCreateNewCloudService(false)
                    .withOriginalStorageAccountOption(false)
                    .withEncryptionDetails(new EncryptionDetails().withEncryptionEnabled(false))
                    .withZones(Arrays.asList("2"))
                    .withIdentityInfo(new IdentityInfo().withIsSystemAssignedIdentity(false)
                        .withManagedIdentityResourceId(
                            "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/asmaskarRG1/providers/Microsoft.ManagedIdentity/userAssignedIdentities/asmaskartestmsi"))
                    .withIdentityBasedRestoreDetails(new IdentityBasedRestoreDetails().withTargetStorageAccountId(
                        "/subscriptions/f2edfd5d-5496-4683-b94f-b3588c579009/resourceGroups/00prjaiTestRg1/providers/Microsoft.Storage/storageAccounts/00prjaitestrg1disks993"))),
                com.azure.core.util.Context.NONE);
    }
}
```

### CrrOperationResults_Get

```java
/**
 * Samples for CrrOperationResults Get.
 */
public final class CrrOperationResultsGetSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * AzureIaasVm/GetCrrOperationResults_Get.json
     */
    /**
     * Sample code: Get Operation Results for Cross Region Restore.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getOperationResultsForCrossRegionRestore(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.crrOperationResults()
            .getWithResponse("southeastasia", "00000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
```

### CrrOperationStatus_Get

```java
/**
 * Samples for CrrOperationStatus Get.
 */
public final class CrrOperationStatusGetSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * AzureIaasVm/GetCrrOperationStatus_Get.json
     */
    /**
     * Sample code: Get Operation Status for Cross Region Restore.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getOperationStatusForCrossRegionRestore(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.crrOperationStatus()
            .getWithResponse("southeastasia", "00000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
```

### RecoveryPoints_GetAccessToken

```java
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.AadPropertiesResourceInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.AadProperties;

/**
 * Samples for RecoveryPoints GetAccessToken.
 */
public final class RecoveryPointsGetAccessTokenSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * AzureIaasVm/GetAccessToken_Get.json
     */
    /**
     * Sample code: Get Access Token for Crr.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void
        getAccessTokenForCrr(com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.recoveryPoints()
            .getAccessTokenWithResponse("rshvault", "rshhtestmdvmrg", "Azure",
                "IaasVMContainer;iaasvmcontainerv2;rshhtestmdvmrg;rshmdvmsmall",
                "VM;iaasvmcontainerv2;rshhtestmdvmrg;rshmdvmsmall", "26083826328862",
                new AadPropertiesResourceInner()
                    .withProperties(new AadProperties().withTenantId("33e01921-4d64-4f8c-a055-5bdaffd5e33d")
                        .withAudience("https://RecoveryServices/IaasCoord/aadmgmt/ase")
                        .withServicePrincipalObjectId("5ecd8123-cf74-4037-83e9-9246b227b351")),
                com.azure.core.util.Context.NONE);
    }
}
```

### RecoveryPointsCrr_Get

```java
/**
 * Samples for RecoveryPointsCrr Get.
 */
public final class RecoveryPointsCrrGetSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * AzureIaasVm/RecoveryPoints_Get.json
     */
    /**
     * Sample code: Get Azure Vm Recovery Point Details.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getAzureVmRecoveryPointDetails(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.recoveryPointsCrrs()
            .getWithResponse("rshvault", "rshhtestmdvmrg", "Azure",
                "IaasVMContainer;iaasvmcontainerv2;rshhtestmdvmrg;rshmdvmsmall",
                "VM;iaasvmcontainerv2;rshhtestmdvmrg;rshmdvmsmall", "26083826328862", com.azure.core.util.Context.NONE);
    }
}
```

### RecoveryPointsCrr_List

```java
/**
 * Samples for RecoveryPointsCrr List.
 */
public final class RecoveryPointsCrrListSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2024-11-15/examples/
     * AzureIaasVm/RecoveryPoints_List.json
     */
    /**
     * Sample code: Get Protected Azure Vm Recovery Points.
     * 
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void getProtectedAzureVmRecoveryPoints(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager.recoveryPointsCrrs()
            .list("rshvault", "rshhtestmdvmrg", "Azure",
                "IaasVMContainer;iaasvmcontainerv2;rshhtestmdvmrg;rshmdvmsmall",
                "VM;iaasvmcontainerv2;rshhtestmdvmrg;rshmdvmsmall", null, com.azure.core.util.Context.NONE);
    }
}
```

