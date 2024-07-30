# Release History

## 1.0.0-beta.1 (2024-07-30)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-preview-2024-07. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.AzureVmWorkloadSapHanaScaleoutProtectableItem` was added

* `models.UpdateRecoveryPointRequest` was added

* `models.PatchRecoveryPointPropertiesInput` was added

* `models.PatchRecoveryPointInput` was added

#### `models.AzureWorkloadSqlPointInTimeRecoveryPoint` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MabJobTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureIaaSClassicComputeVMContainer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IaaSvmContainer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationStatusExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TargetRestoreInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RestoreFileSpecs` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureIaaSComputeVMProtectedItem` was modified

* `backupManagementType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `vaultId()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `friendlyName()` was added
* `lastBackupTime()` was added
* `healthStatus()` was added
* `workloadType()` was added
* `protectedItemDataId()` was added
* `virtualMachineId()` was added

#### `models.AzureWorkloadPointInTimeRecoveryPoint` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureFileShareProvisionIlrRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RetentionDuration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmWorkloadSapHanaHsr` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadRecoveryPoint` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationStatusValidateOperationExtendedInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionIntentResourceList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVMAppContainerProtectableContainer` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVmWorkloadSapHanaSystemWorkloadItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IaasVMRestoreRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationStatusProvisionIlrExtendedInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVmWorkloadSapHanaDatabaseWorkloadItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MabFileFolderProtectedItem` was modified

* `workloadType()` was added
* `vaultId()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `backupManagementType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.GenericRecoveryPoint` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IaasVMBackupRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ListRecoveryPointsRecommendedForMoveRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DpmBackupEngine` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MabContainerExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadSqlRecoveryPoint` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPoints` was modified

* `update(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,models.UpdateRecoveryPointRequest)` was added
* `updateWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,models.UpdateRecoveryPointRequest,com.azure.core.util.Context)` was added

#### `models.GenericContainerExtendedInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureStorageProtectableContainer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NameInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MoveRPAcrossTiersRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmWorkloadSapHanaDBInstance` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FetchTieringCostInfoForRehydrationRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.BackupEngineBase` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationWorkerResponse` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RestoreRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectableContainer` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrepareDataMoveRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureFileShareBackupRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IdentityInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmWorkloadSapHanaDatabaseProtectedItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `vaultId()` was added
* `workloadType()` was added
* `backupManagementType()` was added
* `friendlyName()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `protectionStatus()` was added

#### `models.LongTermSchedulePolicy` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmWorkloadSqlInstanceProtectableItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVmWorkloadSqlAvailabilityGroupProtectableItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.YearlyRetentionSchedule` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmWorkloadSapAseDatabaseProtectedItem` was modified

* `backupManagementType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `friendlyName()` was added
* `vaultId()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `protectionStatus()` was added
* `workloadType()` was added

#### `models.AzureFileShareProtectableItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPointMoveReadinessInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PointInTimeRange` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadErrorInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadSqlRestoreWithRehydrateRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MabContainer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UserAssignedIdentityProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureIaaSvmJobExtendedInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceHealthDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadJobTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureIaaSvmErrorInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BackupResourceVaultConfig` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.GenericProtectionPolicy` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SqlDataDirectory` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.BackupResourceEncryptionConfig` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ClientDiscoveryForServiceSpecification` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IaasVMRestoreWithRehydrationRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ValidateOperationRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadSapHanaPointInTimeRestoreRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadSqlPointInTimeRestoreRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadSqlAutoProtectionIntent` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.BackupRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceGuardOperationDetail` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SubProtectionPolicy` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DpmContainerExtendedInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MabJob` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureStorageJobTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureFileShareRestoreRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.KeyAndSecretDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ErrorDetail` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionContainer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadContainerExtendedInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadSapHanaPointInTimeRecoveryPoint` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureIaaSComputeVMProtectableItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MonthlyRetentionSchedule` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RetentionPolicy` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TargetDiskNetworkAccessSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrivateEndpoint` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.JobResourceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadSapHanaRestoreWithRehydrateRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BackupResourceEncryptionConfigExtended` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MabErrorInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPointResourceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Settings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureIaaSvmProtectedItem` was modified

* `backupManagementType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `workloadType()` was added
* `vaultId()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ContainerIdentityInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadContainerAutoProtectionIntent` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InstantItemRecoveryTarget` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionPolicy` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ValidateOperationResponse` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProtectableContainerResourceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DpmErrorInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InstantRPAdditionalDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HourlySchedule` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VaultJobExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPointProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadJob` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationResultInfoBase` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DpmProtectedItemExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureIaaSvmJob` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FetchTieringCostSavingsInfoForVaultRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureStorageErrorInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExtendedProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DailyRetentionFormat` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SimpleRetentionPolicy` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BackupStatusRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadInquiryDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DpmJobExtendedInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadItemResourceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EncryptionDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PreBackupValidation` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UserAssignedManagedIdentityDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureIaaSvmProtectionPolicy` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.LongTermRetentionPolicy` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmWorkloadSapAseSystemWorkloadItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IaasVmilrRegistrationRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InquiryValidation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DpmJobTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MabFileFolderProtectedItemExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureSqlProtectedItemExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DailyRetentionSchedule` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPointDiskConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResourceGuardProxyBaseResourceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RestoreRequestResource` was modified

* `type()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `id()` was added
* `name()` was added

#### `models.ProtectedItemResourceList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UnlockDeleteRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureSqlProtectionPolicy` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProtectionContainerResourceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ValidateIaasVMRestoreOperationRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureStorageJob` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WeeklyRetentionSchedule` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WeeklySchedule` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVmWorkloadSqlDatabaseProtectedItem` was modified

* `protectionStatus()` was added
* `backupManagementType()` was added
* `friendlyName()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `vaultId()` was added
* `workloadType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPointRehydrationInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadProtectableItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SimpleSchedulePolicyV2` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VaultRetentionPolicy` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVmWorkloadProtectedItem` was modified

* `workloadType()` was added
* `vaultId()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `backupManagementType()` was added

#### `models.AzureVmWorkloadItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmWorkloadSqlInstanceWorkloadItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IdentityBasedRestoreDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BackupManagementUsageList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVmWorkloadProtectionPolicy` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SchedulePolicy` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionIntent` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionPolicyResourceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureResourceProtectionIntent` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SecurityPinBase` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BackupEngineBaseResourceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectedItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureSqlContainer` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVmWorkloadSapHanaSystemProtectableItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureSqlagWorkloadContainerProtectionContainer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPointTierInformationV2` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BackupResourceEncryptionConfigResource` was modified

* `type()` was added
* `id()` was added
* `name()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadSqlRecoveryPointExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureIaaSvmJobTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InquiryInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVmWorkloadSapAseDatabaseWorkloadItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.KekDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MabJobExtendedInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TriggerDataMoveRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadRestoreRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VaultJob` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IlrRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVmWorkloadSqlDatabaseWorkloadItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmWorkloadProtectableItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SecuredVMDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.GenericContainer` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVMAppContainerProtectionContainer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ClientDiscoveryDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TieringCostRehydrationInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IaasVMRecoveryPoint` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ClientDiscoveryForProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IlrRequestResource` was modified

* `type()` was added
* `name()` was added
* `id()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmWorkloadSapHanaDBInstanceProtectedItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `friendlyName()` was added
* `protectionStatus()` was added
* `vaultId()` was added
* `workloadType()` was added
* `backupManagementType()` was added

#### `models.IaaSvmProtectableItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureBackupServerContainer` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureBackupServerEngine` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DailySchedule` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureIaaSClassicComputeVMProtectableItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExportJobsOperationResultInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TieringPolicy` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ValidateOperationRequestResource` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureFileShareRecoveryPoint` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationStatusJobExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResourceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadBackupRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadContainer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResourceGuardProxyBase` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FeatureSupportRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ValidateRestoreOperationRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPointTierInformation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadAutoProtectionIntent` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadProtectableItemResourceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FetchTieringCostInfoRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Day` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DpmJob` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVMResourceFeatureSupportRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BackupEngineExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureIaaSvmHealthDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `message()` was added
* `recommendations()` was added
* `code()` was added
* `title()` was added

#### `models.PrivateLinkServiceConnectionState` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SnapshotRestoreParameters` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureIaaSClassicComputeVMProtectedItem` was modified

* `protectedItemDataId()` was added
* `workloadType()` was added
* `lastBackupTime()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `backupManagementType()` was added
* `friendlyName()` was added
* `virtualMachineId()` was added
* `vaultId()` was added
* `healthStatus()` was added

#### `models.GenericProtectedItem` was modified

* `backupManagementType()` was added
* `workloadType()` was added
* `vaultId()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VaultJobErrorInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVmWorkloadProtectedItemExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadSapHanaRecoveryPoint` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationStatusJobsExtendedInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPoint` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationStatusError` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrivateEndpointConnection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureBackupGoalFeatureSupportRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmWorkloadSqlDatabaseProtectableItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SimpleSchedulePolicy` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SqlDataDirectoryMapping` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmWorkloadSapAseSystemProtectableItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ClientScriptForConnect` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MabProtectionPolicy` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SnapshotBackupAdditionalDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureFileshareProtectedItem` was modified

* `workloadType()` was added
* `backupManagementType()` was added
* `vaultId()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureStorageJobExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Job` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PreValidateEnableBackupRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.KpiResourceHealthDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WeeklyRetentionFormat` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DistributedNodesInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadJobExtendedInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureRecoveryServiceVaultProtectionIntent` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureFileshareProtectedItemExtendedInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureFileShareProtectionPolicy` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiskExclusionProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FetchTieringCostSavingsInfoForProtectedItemRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureSqlProtectedItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `workloadType()` was added
* `vaultId()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `backupManagementType()` was added

#### `models.BackupRequestResource` was modified

* `id()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `name()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added

#### `models.AzureIaaSvmProtectedItemExtendedInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationResultInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ClientDiscoveryForLogSpecification` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadSapHanaRestoreRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.LogSchedulePolicy` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExtendedLocation` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiskInformation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadPointInTimeRestoreRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureWorkloadSqlRestoreRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BekDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureIaaSvmJobV2` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrepareDataMoveResponse` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureStorageContainer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TieringCostSavingInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FetchTieringCostSavingsInfoForPolicyRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MabContainerHealthDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TargetAfsRestoreInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureIaaSComputeVMContainer` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ClientDiscoveryResponse` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DpmContainer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.BackupResourceConfig` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DpmProtectedItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `backupManagementType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `vaultId()` was added
* `workloadType()` was added

#### `models.AzureVmWorkloadSapHanaDatabaseProtectableItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

## 1.4.0 (2024-05-23)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2024-04. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

- IMPORTANT: use `AuxiliaryAuthenticationPolicy` from "azure-resourcemanager-resources" module via `RecoveryServicesBackupManager.configure().withPolicy(..)`, for setting "x-ms-authorization-auxiliary" header.

### Features Added

* `models.IaasVMSnapshotConsistencyType` was added

#### `models.AzureWorkloadSqlPointInTimeRecoveryPoint` was modified

* `objectType()` was added

#### `models.AzureIaaSClassicComputeVMContainer` was modified

* `containerType()` was added

#### `models.IaaSvmContainer` was modified

* `containerType()` was added

#### `models.OperationStatusExtendedInfo` was modified

* `objectType()` was added

#### `models.AzureIaaSComputeVMProtectedItem` was modified

* `protectedItemType()` was added

#### `models.AzureWorkloadPointInTimeRecoveryPoint` was modified

* `objectType()` was added

#### `models.AzureFileShareProvisionIlrRequest` was modified

* `objectType()` was added

#### `models.AzureVmWorkloadSapHanaHsr` was modified

* `protectableItemType()` was added

#### `models.AzureWorkloadRecoveryPoint` was modified

* `objectType()` was added

#### `models.OperationStatusValidateOperationExtendedInfo` was modified

* `objectType()` was added

#### `models.AzureVMAppContainerProtectableContainer` was modified

* `protectableContainerType()` was added

#### `models.AzureVmWorkloadSapHanaSystemWorkloadItem` was modified

* `workloadItemType()` was added

#### `models.IaasVMRestoreRequest` was modified

* `withResourceGuardOperationRequests(java.util.List)` was added
* `objectType()` was added

#### `models.OperationStatusProvisionIlrExtendedInfo` was modified

* `objectType()` was added

#### `models.AzureVmWorkloadSapHanaDatabaseWorkloadItem` was modified

* `workloadItemType()` was added

#### `models.MabFileFolderProtectedItem` was modified

* `protectedItemType()` was added

#### `models.GenericRecoveryPoint` was modified

* `objectType()` was added

#### `models.IaasVMBackupRequest` was modified

* `objectType()` was added

#### `models.DpmBackupEngine` was modified

* `backupEngineType()` was added

#### `models.AzureWorkloadSqlRecoveryPoint` was modified

* `objectType()` was added

#### `models.AzureStorageProtectableContainer` was modified

* `protectableContainerType()` was added

#### `models.AzureVmWorkloadSapHanaDBInstance` was modified

* `protectableItemType()` was added

#### `models.FetchTieringCostInfoForRehydrationRequest` was modified

* `objectType()` was added

#### `models.BackupEngineBase` was modified

* `backupEngineType()` was added

#### `models.RestoreRequest` was modified

* `objectType()` was added
* `resourceGuardOperationRequests()` was added
* `withResourceGuardOperationRequests(java.util.List)` was added

#### `models.ProtectableContainer` was modified

* `protectableContainerType()` was added

#### `models.AzureFileShareBackupRequest` was modified

* `objectType()` was added

#### `models.AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest` was modified

* `withResourceGuardOperationRequests(java.util.List)` was added
* `objectType()` was added

#### `models.AzureVmWorkloadSapHanaDatabaseProtectedItem` was modified

* `protectedItemType()` was added

#### `models.LongTermSchedulePolicy` was modified

* `schedulePolicyType()` was added

#### `models.AzureVmWorkloadSqlInstanceProtectableItem` was modified

* `protectableItemType()` was added

#### `models.AzureVmWorkloadSqlAvailabilityGroupProtectableItem` was modified

* `protectableItemType()` was added

#### `models.AzureVmWorkloadSapAseDatabaseProtectedItem` was modified

* `protectedItemType()` was added

#### `models.AzureFileShareProtectableItem` was modified

* `protectableItemType()` was added

#### `models.AzureWorkloadSqlRestoreWithRehydrateRequest` was modified

* `withResourceGuardOperationRequests(java.util.List)` was added
* `objectType()` was added

#### `models.MabContainer` was modified

* `containerType()` was added

#### `models.GenericProtectionPolicy` was modified

* `backupManagementType()` was added

#### `models.IaasVMRestoreWithRehydrationRequest` was modified

* `withResourceGuardOperationRequests(java.util.List)` was added
* `objectType()` was added

#### `models.ValidateOperationRequest` was modified

* `objectType()` was added

#### `models.AzureWorkloadSapHanaPointInTimeRestoreRequest` was modified

* `withResourceGuardOperationRequests(java.util.List)` was added
* `objectType()` was added

#### `models.AzureWorkloadSqlPointInTimeRestoreRequest` was modified

* `objectType()` was added
* `withResourceGuardOperationRequests(java.util.List)` was added

#### `models.AzureWorkloadSqlAutoProtectionIntent` was modified

* `protectionIntentItemType()` was added

#### `models.BackupRequest` was modified

* `objectType()` was added

#### `models.TieringCostInfo` was modified

* `objectType()` was added

#### `models.MabJob` was modified

* `jobType()` was added

#### `models.AzureFileShareRestoreRequest` was modified

* `withResourceGuardOperationRequests(java.util.List)` was added
* `objectType()` was added

#### `models.ProtectionContainer` was modified

* `containerType()` was added

#### `models.AzureWorkloadSapHanaPointInTimeRecoveryPoint` was modified

* `objectType()` was added

#### `models.AzureIaaSComputeVMProtectableItem` was modified

* `protectableItemType()` was added

#### `models.RetentionPolicy` was modified

* `retentionPolicyType()` was added

#### `models.AzureWorkloadSapHanaRestoreWithRehydrateRequest` was modified

* `objectType()` was added
* `withResourceGuardOperationRequests(java.util.List)` was added

#### `models.AzureIaaSvmProtectedItem` was modified

* `protectedItemType()` was added

#### `models.AzureWorkloadContainerAutoProtectionIntent` was modified

* `protectionIntentItemType()` was added

#### `models.ProtectionPolicy` was modified

* `backupManagementType()` was added

#### `models.WorkloadItem` was modified

* `workloadItemType()` was added

#### `models.AzureWorkloadJob` was modified

* `jobType()` was added

#### `models.OperationResultInfoBase` was modified

* `objectType()` was added

#### `models.AzureIaaSvmJob` was modified

* `jobType()` was added

#### `models.FetchTieringCostSavingsInfoForVaultRequest` was modified

* `objectType()` was added

#### `models.SimpleRetentionPolicy` was modified

* `retentionPolicyType()` was added

#### `models.AzureIaaSvmProtectionPolicy` was modified

* `snapshotConsistencyType()` was added
* `backupManagementType()` was added
* `withSnapshotConsistencyType(models.IaasVMSnapshotConsistencyType)` was added

#### `models.LongTermRetentionPolicy` was modified

* `retentionPolicyType()` was added

#### `models.AzureVmWorkloadSapAseSystemWorkloadItem` was modified

* `workloadItemType()` was added

#### `models.IaasVmilrRegistrationRequest` was modified

* `objectType()` was added

#### `models.AzureSqlProtectionPolicy` was modified

* `backupManagementType()` was added

#### `models.ValidateIaasVMRestoreOperationRequest` was modified

* `objectType()` was added

#### `models.AzureStorageJob` was modified

* `jobType()` was added

#### `models.AzureVmWorkloadSqlDatabaseProtectedItem` was modified

* `protectedItemType()` was added

#### `models.WorkloadProtectableItem` was modified

* `protectableItemType()` was added

#### `models.SimpleSchedulePolicyV2` was modified

* `schedulePolicyType()` was added

#### `models.AzureVmWorkloadProtectedItem` was modified

* `protectedItemType()` was added

#### `models.AzureVmWorkloadItem` was modified

* `workloadItemType()` was added

#### `models.AzureVmWorkloadSqlInstanceWorkloadItem` was modified

* `workloadItemType()` was added

#### `models.AzureVmWorkloadProtectionPolicy` was modified

* `backupManagementType()` was added

#### `models.SchedulePolicy` was modified

* `schedulePolicyType()` was added

#### `models.ProtectionIntent` was modified

* `protectionIntentItemType()` was added

#### `models.AzureResourceProtectionIntent` was modified

* `protectionIntentItemType()` was added

#### `models.ProtectedItem` was modified

* `protectedItemType()` was added

#### `models.AzureSqlContainer` was modified

* `containerType()` was added

#### `models.AzureVmWorkloadSapHanaSystemProtectableItem` was modified

* `protectableItemType()` was added

#### `models.AzureSqlagWorkloadContainerProtectionContainer` was modified

* `containerType()` was added

#### `models.AzureVmWorkloadSapAseDatabaseWorkloadItem` was modified

* `workloadItemType()` was added

#### `models.AzureWorkloadRestoreRequest` was modified

* `withResourceGuardOperationRequests(java.util.List)` was added
* `objectType()` was added

#### `models.VaultJob` was modified

* `jobType()` was added

#### `models.IlrRequest` was modified

* `objectType()` was added

#### `models.AzureVmWorkloadSqlDatabaseWorkloadItem` was modified

* `workloadItemType()` was added

#### `models.AzureVmWorkloadProtectableItem` was modified

* `protectableItemType()` was added

#### `models.GenericContainer` was modified

* `containerType()` was added

#### `models.AzureVMAppContainerProtectionContainer` was modified

* `containerType()` was added

#### `models.TieringCostRehydrationInfo` was modified

* `objectType()` was added

#### `models.IaasVMRecoveryPoint` was modified

* `objectType()` was added

#### `models.AzureVmWorkloadSapHanaDBInstanceProtectedItem` was modified

* `protectedItemType()` was added

#### `models.IaaSvmProtectableItem` was modified

* `protectableItemType()` was added

#### `models.AzureBackupServerContainer` was modified

* `containerType()` was added

#### `models.AzureBackupServerEngine` was modified

* `backupEngineType()` was added

#### `models.AzureIaaSClassicComputeVMProtectableItem` was modified

* `protectableItemType()` was added

#### `models.ExportJobsOperationResultInfo` was modified

* `objectType()` was added

#### `models.AzureFileShareRecoveryPoint` was modified

* `objectType()` was added

#### `models.OperationStatusJobExtendedInfo` was modified

* `objectType()` was added

#### `models.AzureWorkloadBackupRequest` was modified

* `objectType()` was added

#### `models.AzureWorkloadContainer` was modified

* `containerType()` was added

#### `models.FeatureSupportRequest` was modified

* `featureType()` was added

#### `models.ValidateRestoreOperationRequest` was modified

* `objectType()` was added

#### `models.AzureWorkloadAutoProtectionIntent` was modified

* `protectionIntentItemType()` was added

#### `models.FetchTieringCostInfoRequest` was modified

* `objectType()` was added

#### `models.DpmJob` was modified

* `jobType()` was added

#### `models.AzureVMResourceFeatureSupportRequest` was modified

* `featureType()` was added

#### `models.AzureIaaSClassicComputeVMProtectedItem` was modified

* `protectedItemType()` was added

#### `models.GenericProtectedItem` was modified

* `protectedItemType()` was added

#### `models.AzureWorkloadSapHanaRecoveryPoint` was modified

* `objectType()` was added

#### `models.OperationStatusJobsExtendedInfo` was modified

* `objectType()` was added

#### `models.RecoveryPoint` was modified

* `objectType()` was added

#### `models.AzureBackupGoalFeatureSupportRequest` was modified

* `featureType()` was added

#### `models.AzureVmWorkloadSqlDatabaseProtectableItem` was modified

* `protectableItemType()` was added

#### `models.SimpleSchedulePolicy` was modified

* `schedulePolicyType()` was added

#### `models.AzureVmWorkloadSapAseSystemProtectableItem` was modified

* `protectableItemType()` was added

#### `models.MabProtectionPolicy` was modified

* `backupManagementType()` was added

#### `models.AzureFileshareProtectedItem` was modified

* `protectedItemType()` was added

#### `models.Job` was modified

* `jobType()` was added

#### `models.AzureRecoveryServiceVaultProtectionIntent` was modified

* `protectionIntentItemType()` was added

#### `models.AzureFileShareProtectionPolicy` was modified

* `backupManagementType()` was added

#### `models.FetchTieringCostSavingsInfoForProtectedItemRequest` was modified

* `objectType()` was added

#### `models.AzureSqlProtectedItem` was modified

* `protectedItemType()` was added

#### `models.OperationResultInfo` was modified

* `objectType()` was added

#### `models.AzureWorkloadSapHanaRestoreRequest` was modified

* `withResourceGuardOperationRequests(java.util.List)` was added
* `objectType()` was added

#### `models.LogSchedulePolicy` was modified

* `schedulePolicyType()` was added

#### `models.AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest` was modified

* `objectType()` was added
* `withResourceGuardOperationRequests(java.util.List)` was added

#### `models.VaultStorageConfigOperationResultResponse` was modified

* `objectType()` was added

#### `models.AzureWorkloadPointInTimeRestoreRequest` was modified

* `objectType()` was added
* `withResourceGuardOperationRequests(java.util.List)` was added

#### `models.AzureWorkloadSqlRestoreRequest` was modified

* `objectType()` was added
* `withResourceGuardOperationRequests(java.util.List)` was added

#### `models.AzureIaaSvmJobV2` was modified

* `jobType()` was added

#### `models.PrepareDataMoveResponse` was modified

* `objectType()` was added

#### `models.AzureStorageContainer` was modified

* `containerType()` was added

#### `models.TieringCostSavingInfo` was modified

* `objectType()` was added

#### `models.FetchTieringCostSavingsInfoForPolicyRequest` was modified

* `objectType()` was added

#### `models.AzureIaaSComputeVMContainer` was modified

* `containerType()` was added

#### `models.DpmContainer` was modified

* `containerType()` was added

#### `models.DpmProtectedItem` was modified

* `protectedItemType()` was added

#### `models.AzureVmWorkloadSapHanaDatabaseProtectableItem` was modified

* `protectableItemType()` was added

## 1.3.0 (2024-01-24)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2023-06. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.ValidateOperations` was modified

* `trigger(java.lang.String,java.lang.String,models.ValidateOperationRequest)` was removed
* `trigger(java.lang.String,java.lang.String,models.ValidateOperationRequest,com.azure.core.util.Context)` was removed

#### `models.OperationOperations` was modified

* `validate(java.lang.String,java.lang.String,models.ValidateOperationRequest)` was removed
* `validateWithResponse(java.lang.String,java.lang.String,models.ValidateOperationRequest,com.azure.core.util.Context)` was removed

### Features Added

* `models.TieringCostOperationStatus` was added

* `models.FetchTieringCostInfoForRehydrationRequest` was added

* `models.UserAssignedIdentityProperties` was added

* `models.TieringCostInfo` was added

* `models.GetTieringCostOperationResults` was added

* `models.FetchTieringCostSavingsInfoForVaultRequest` was added

* `models.UserAssignedManagedIdentityDetails` was added

* `models.VaultRetentionPolicy` was added

* `models.FetchTieringCosts` was added

* `models.TieringCostRehydrationInfo` was added

* `models.ValidateOperationRequestResource` was added

* `models.FetchTieringCostInfoRequest` was added

* `models.SnapshotRestoreParameters` was added

* `models.SnapshotBackupAdditionalDetails` was added

* `models.FetchTieringCostSavingsInfoForProtectedItemRequest` was added

* `models.TieringCostSavingInfo` was added

* `models.FetchTieringCostSavingsInfoForPolicyRequest` was added

#### `models.AzureWorkloadSapHanaPointInTimeRestoreWithRehydrateRequest` was modified

* `withUserAssignedManagedIdentityDetails(models.UserAssignedManagedIdentityDetails)` was added
* `withTargetResourceGroupName(java.lang.String)` was added
* `withSnapshotRestoreParameters(models.SnapshotRestoreParameters)` was added

#### `models.AzureWorkloadSqlRestoreWithRehydrateRequest` was modified

* `withSnapshotRestoreParameters(models.SnapshotRestoreParameters)` was added
* `withTargetResourceGroupName(java.lang.String)` was added
* `withUserAssignedManagedIdentityDetails(models.UserAssignedManagedIdentityDetails)` was added

#### `models.AzureWorkloadSapHanaPointInTimeRestoreRequest` was modified

* `withUserAssignedManagedIdentityDetails(models.UserAssignedManagedIdentityDetails)` was added
* `withSnapshotRestoreParameters(models.SnapshotRestoreParameters)` was added
* `withTargetResourceGroupName(java.lang.String)` was added

#### `models.AzureWorkloadSqlPointInTimeRestoreRequest` was modified

* `withUserAssignedManagedIdentityDetails(models.UserAssignedManagedIdentityDetails)` was added
* `withSnapshotRestoreParameters(models.SnapshotRestoreParameters)` was added
* `withTargetResourceGroupName(java.lang.String)` was added

#### `models.SubProtectionPolicy` was modified

* `withSnapshotBackupAdditionalDetails(models.SnapshotBackupAdditionalDetails)` was added
* `snapshotBackupAdditionalDetails()` was added

#### `models.AzureWorkloadSapHanaRestoreWithRehydrateRequest` was modified

* `withUserAssignedManagedIdentityDetails(models.UserAssignedManagedIdentityDetails)` was added
* `withSnapshotRestoreParameters(models.SnapshotRestoreParameters)` was added
* `withTargetResourceGroupName(java.lang.String)` was added

#### `models.ProtectedItem` was modified

* `vaultId()` was added

#### `models.AzureWorkloadRestoreRequest` was modified

* `snapshotRestoreParameters()` was added
* `targetResourceGroupName()` was added
* `withTargetResourceGroupName(java.lang.String)` was added
* `withUserAssignedManagedIdentityDetails(models.UserAssignedManagedIdentityDetails)` was added
* `userAssignedManagedIdentityDetails()` was added
* `withSnapshotRestoreParameters(models.SnapshotRestoreParameters)` was added

#### `models.ValidateOperations` was modified

* `trigger(java.lang.String,java.lang.String,models.ValidateOperationRequestResource,com.azure.core.util.Context)` was added
* `trigger(java.lang.String,java.lang.String,models.ValidateOperationRequestResource)` was added

#### `RecoveryServicesBackupManager` was modified

* `fetchTieringCosts()` was added
* `tieringCostOperationStatus()` was added
* `getTieringCostOperationResults()` was added

#### `models.AzureFileShareProtectionPolicy` was modified

* `vaultRetentionPolicy()` was added
* `withVaultRetentionPolicy(models.VaultRetentionPolicy)` was added

#### `models.AzureWorkloadSapHanaRestoreRequest` was modified

* `withUserAssignedManagedIdentityDetails(models.UserAssignedManagedIdentityDetails)` was added
* `withSnapshotRestoreParameters(models.SnapshotRestoreParameters)` was added
* `withTargetResourceGroupName(java.lang.String)` was added

#### `models.AzureWorkloadSqlPointInTimeRestoreWithRehydrateRequest` was modified

* `withUserAssignedManagedIdentityDetails(models.UserAssignedManagedIdentityDetails)` was added
* `withTargetResourceGroupName(java.lang.String)` was added
* `withSnapshotRestoreParameters(models.SnapshotRestoreParameters)` was added

#### `models.AzureWorkloadPointInTimeRestoreRequest` was modified

* `withUserAssignedManagedIdentityDetails(models.UserAssignedManagedIdentityDetails)` was added
* `withTargetResourceGroupName(java.lang.String)` was added
* `withSnapshotRestoreParameters(models.SnapshotRestoreParameters)` was added

#### `models.AzureWorkloadSqlRestoreRequest` was modified

* `withSnapshotRestoreParameters(models.SnapshotRestoreParameters)` was added
* `withUserAssignedManagedIdentityDetails(models.UserAssignedManagedIdentityDetails)` was added
* `withTargetResourceGroupName(java.lang.String)` was added

#### `models.OperationOperations` was modified

* `validate(java.lang.String,java.lang.String,models.ValidateOperationRequestResource)` was added
* `validateWithResponse(java.lang.String,java.lang.String,models.ValidateOperationRequestResource,com.azure.core.util.Context)` was added

## 1.2.0 (2023-10-12)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2023-04. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.VaultSubResourceType` was added

#### `models.AzureVmWorkloadSapHanaHsr` was modified

* `withIsProtectable(java.lang.Boolean)` was added

#### `models.AzureVmWorkloadSapHanaDBInstance` was modified

* `withIsProtectable(java.lang.Boolean)` was added

#### `models.AzureVmWorkloadSapHanaDatabaseProtectedItem` was modified

* `withNodesList(java.util.List)` was added

#### `models.AzureVmWorkloadSqlInstanceProtectableItem` was modified

* `withIsProtectable(java.lang.Boolean)` was added

#### `models.AzureVmWorkloadSqlAvailabilityGroupProtectableItem` was modified

* `withNodesList(java.util.List)` was added
* `withIsProtectable(java.lang.Boolean)` was added
* `nodesList()` was added

#### `models.AzureVmWorkloadSapAseDatabaseProtectedItem` was modified

* `withNodesList(java.util.List)` was added

#### `models.BackupStatusResponse` was modified

* `protectedItemsCount()` was added
* `acquireStorageAccountLock()` was added

#### `models.BackupResourceVaultConfig` was modified

* `softDeleteRetentionPeriodInDays()` was added
* `withSoftDeleteRetentionPeriodInDays(java.lang.Integer)` was added

#### `models.InquiryValidation` was modified

* `protectableItemCount()` was added

#### `models.AzureVmWorkloadSqlDatabaseProtectedItem` was modified

* `withNodesList(java.util.List)` was added

#### `models.AzureVmWorkloadProtectedItem` was modified

* `withNodesList(java.util.List)` was added
* `nodesList()` was added

#### `models.AzureVmWorkloadSapHanaSystemProtectableItem` was modified

* `withIsProtectable(java.lang.Boolean)` was added

#### `models.AzureVmWorkloadProtectableItem` was modified

* `isProtectable()` was added
* `withIsProtectable(java.lang.Boolean)` was added

#### `models.IaasVMRecoveryPoint` was modified

* `extendedLocation()` was added
* `withExtendedLocation(models.ExtendedLocation)` was added

#### `models.AzureVmWorkloadSapHanaDBInstanceProtectedItem` was modified

* `withNodesList(java.util.List)` was added

#### `models.PrivateEndpointConnection` was modified

* `withGroupIds(java.util.List)` was added
* `groupIds()` was added

#### `models.AzureVmWorkloadSqlDatabaseProtectableItem` was modified

* `withIsProtectable(java.lang.Boolean)` was added

#### `models.AzureVmWorkloadSapAseSystemProtectableItem` was modified

* `withIsProtectable(java.lang.Boolean)` was added

#### `models.DistributedNodesInfo` was modified

* `withSourceResourceId(java.lang.String)` was added
* `sourceResourceId()` was added

#### `models.AzureVmWorkloadSapHanaDatabaseProtectableItem` was modified

* `withIsProtectable(java.lang.Boolean)` was added

## 1.1.0 (2023-03-16)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2023-02. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.TargetDiskNetworkAccessSettings` was added

* `models.TargetDiskNetworkAccessOption` was added

* `models.SecuredVMDetails` was added

* `models.ExtendedLocation` was added

#### `models.IaasVMRestoreRequest` was modified

* `withExtendedLocation(models.ExtendedLocation)` was added
* `withTargetDiskNetworkAccessSettings(models.TargetDiskNetworkAccessSettings)` was added
* `targetDiskNetworkAccessSettings()` was added
* `securedVMDetails()` was added
* `withSecuredVMDetails(models.SecuredVMDetails)` was added
* `extendedLocation()` was added

#### `models.IaasVMRestoreWithRehydrationRequest` was modified

* `withSecuredVMDetails(models.SecuredVMDetails)` was added
* `withTargetDiskNetworkAccessSettings(models.TargetDiskNetworkAccessSettings)` was added
* `withExtendedLocation(models.ExtendedLocation)` was added

#### `models.RecoveryPointProperties` was modified

* `withIsSoftDeleted(java.lang.Boolean)` was added
* `isSoftDeleted()` was added

#### `models.IaasVMRecoveryPoint` was modified

* `withSecurityType(java.lang.String)` was added
* `isPrivateAccessEnabledOnAnyDisk()` was added
* `withIsPrivateAccessEnabledOnAnyDisk(java.lang.Boolean)` was added
* `securityType()` was added

## 1.0.0 (2023-02-27)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2023-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.7 (2023-01-19)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2023-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.RecoveryPointProperties` was added

#### `models.AzureWorkloadSqlPointInTimeRecoveryPoint` was modified

* `withRecoveryPointProperties(models.RecoveryPointProperties)` was added

#### `models.AzureWorkloadPointInTimeRecoveryPoint` was modified

* `withRecoveryPointProperties(models.RecoveryPointProperties)` was added

#### `models.AzureWorkloadRecoveryPoint` was modified

* `recoveryPointProperties()` was added
* `withRecoveryPointProperties(models.RecoveryPointProperties)` was added

#### `models.GenericRecoveryPoint` was modified

* `recoveryPointProperties()` was added
* `withRecoveryPointProperties(models.RecoveryPointProperties)` was added

#### `models.AzureWorkloadSqlRecoveryPoint` was modified

* `withRecoveryPointProperties(models.RecoveryPointProperties)` was added

#### `models.AzureWorkloadSapHanaPointInTimeRecoveryPoint` was modified

* `withRecoveryPointProperties(models.RecoveryPointProperties)` was added

#### `models.IaasVMRecoveryPoint` was modified

* `withRecoveryPointProperties(models.RecoveryPointProperties)` was added
* `recoveryPointProperties()` was added

#### `models.AzureFileShareRecoveryPoint` was modified

* `withRecoveryPointProperties(models.RecoveryPointProperties)` was added
* `recoveryPointProperties()` was added

#### `models.AzureWorkloadSapHanaRecoveryPoint` was modified

* `withRecoveryPointProperties(models.RecoveryPointProperties)` was added

## 1.0.0-beta.6 (2022-10-24)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2022-09-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.ContainerType` was removed

#### `models.AzureIaaSComputeVMProtectedItem` was modified

* `withHealthStatus(models.HealthStatus)` was removed
* `withWorkloadType(models.DataSourceType)` was removed
* `withVirtualMachineId(java.lang.String)` was removed
* `withBackupManagementType(models.BackupManagementType)` was removed
* `withHealthStatus(models.HealthStatus)` was removed
* `withProtectedItemDataId(java.lang.String)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withLastBackupTime(java.time.OffsetDateTime)` was removed

#### `models.MabFileFolderProtectedItem` was modified

* `withWorkloadType(models.DataSourceType)` was removed
* `withBackupManagementType(models.BackupManagementType)` was removed

#### `models.AzureVmWorkloadSapHanaDatabaseProtectedItem` was modified

* `withWorkloadType(models.DataSourceType)` was removed
* `withBackupManagementType(models.BackupManagementType)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withProtectionStatus(java.lang.String)` was removed

#### `models.AzureVmWorkloadSapAseDatabaseProtectedItem` was modified

* `withBackupManagementType(models.BackupManagementType)` was removed
* `withProtectionStatus(java.lang.String)` was removed
* `withWorkloadType(models.DataSourceType)` was removed
* `withFriendlyName(java.lang.String)` was removed

#### `models.AzureIaaSvmProtectedItem` was modified

* `withWorkloadType(models.DataSourceType)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withLastBackupTime(java.time.OffsetDateTime)` was removed
* `withHealthStatus(models.HealthStatus)` was removed
* `withBackupManagementType(models.BackupManagementType)` was removed
* `withProtectedItemDataId(java.lang.String)` was removed
* `withVirtualMachineId(java.lang.String)` was removed

#### `models.AzureVmWorkloadSqlDatabaseProtectedItem` was modified

* `withBackupManagementType(models.BackupManagementType)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withProtectionStatus(java.lang.String)` was removed
* `withWorkloadType(models.DataSourceType)` was removed
* `withProtectionStatus(java.lang.String)` was removed

#### `models.AzureVmWorkloadProtectedItem` was modified

* `withFriendlyName(java.lang.String)` was removed
* `withProtectionStatus(java.lang.String)` was removed
* `withBackupManagementType(models.BackupManagementType)` was removed
* `withWorkloadType(models.DataSourceType)` was removed

#### `models.ProtectedItem` was modified

* `withWorkloadType(models.DataSourceType)` was removed
* `withBackupManagementType(models.BackupManagementType)` was removed

#### `models.AzureIaaSClassicComputeVMProtectedItem` was modified

* `withLastBackupTime(java.time.OffsetDateTime)` was removed
* `withHealthStatus(models.HealthStatus)` was removed
* `withBackupManagementType(models.BackupManagementType)` was removed
* `withProtectedItemDataId(java.lang.String)` was removed
* `withWorkloadType(models.DataSourceType)` was removed
* `withHealthStatus(models.HealthStatus)` was removed
* `withVirtualMachineId(java.lang.String)` was removed
* `withFriendlyName(java.lang.String)` was removed

#### `models.GenericProtectedItem` was modified

* `withBackupManagementType(models.BackupManagementType)` was removed
* `withWorkloadType(models.DataSourceType)` was removed

#### `models.AzureFileshareProtectedItem` was modified

* `withWorkloadType(models.DataSourceType)` was removed
* `withBackupManagementType(models.BackupManagementType)` was removed

#### `models.AzureSqlProtectedItem` was modified

* `withWorkloadType(models.DataSourceType)` was removed
* `withBackupManagementType(models.BackupManagementType)` was removed

#### `models.DpmProtectedItem` was modified

* `withBackupManagementType(models.BackupManagementType)` was removed
* `withWorkloadType(models.DataSourceType)` was removed

### Features Added

* `models.AzureVmWorkloadSapHanaHsr` was added

* `models.AzureVmWorkloadSapHanaDBInstance` was added

* `models.DeletedProtectionContainers` was added

* `models.AzureVmWorkloadSapHanaDBInstanceProtectedItem` was added

* `models.ProtectableContainerType` was added

* `models.TieringPolicy` was added

* `models.TieringMode` was added

#### `models.AzureIaaSComputeVMProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `models.MabFileFolderProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `models.AzureVmWorkloadSapHanaDatabaseProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `models.AzureVmWorkloadSapAseDatabaseProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `models.SubProtectionPolicy` was modified

* `withTieringPolicy(java.util.Map)` was added
* `tieringPolicy()` was added

#### `models.AzureIaaSvmProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `models.AzureIaaSvmProtectionPolicy` was modified

* `tieringPolicy()` was added
* `withTieringPolicy(java.util.Map)` was added

#### `models.AzureVmWorkloadSqlDatabaseProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `models.AzureVmWorkloadProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `models.ProtectedItem` was modified

* `softDeleteRetentionPeriod()` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `models.AzureIaaSClassicComputeVMProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `RecoveryServicesBackupManager` was modified

* `deletedProtectionContainers()` was added

#### `models.GenericProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `models.AzureVmWorkloadProtectedItemExtendedInfo` was modified

* `withOldestRecoveryPointInArchive(java.time.OffsetDateTime)` was added
* `newestRecoveryPointInArchive()` was added
* `withOldestRecoveryPointInVault(java.time.OffsetDateTime)` was added
* `oldestRecoveryPointInVault()` was added
* `withNewestRecoveryPointInArchive(java.time.OffsetDateTime)` was added
* `oldestRecoveryPointInArchive()` was added

#### `models.AzureFileshareProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `models.AzureSqlProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

#### `models.AzureIaaSvmProtectedItemExtendedInfo` was modified

* `newestRecoveryPointInArchive()` was added
* `oldestRecoveryPointInArchive()` was added
* `oldestRecoveryPointInVault()` was added
* `withNewestRecoveryPointInArchive(java.time.OffsetDateTime)` was added
* `withOldestRecoveryPointInArchive(java.time.OffsetDateTime)` was added
* `withOldestRecoveryPointInVault(java.time.OffsetDateTime)` was added

#### `models.DpmProtectedItem` was modified

* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added
* `withSoftDeleteRetentionPeriod(java.lang.Integer)` was added

## 1.0.0-beta.5 (2022-05-16)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2022-02. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.TieringPolicy` was removed

* `models.TieringMode` was removed

#### `models.SubProtectionPolicy` was modified

* `tieringPolicy()` was removed
* `withTieringPolicy(java.util.Map)` was removed

#### `models.AzureIaaSvmProtectionPolicy` was modified

* `tieringPolicy()` was removed
* `withTieringPolicy(java.util.Map)` was removed

#### `models.AzureVmWorkloadProtectedItemExtendedInfo` was modified

* `withNewestRecoveryPointInArchive(java.time.OffsetDateTime)` was removed
* `newestRecoveryPointInArchive()` was removed
* `withOldestRecoveryPointInVault(java.time.OffsetDateTime)` was removed
* `oldestRecoveryPointInVault()` was removed
* `oldestRecoveryPointInArchive()` was removed
* `withOldestRecoveryPointInArchive(java.time.OffsetDateTime)` was removed

#### `models.AzureIaaSvmProtectedItemExtendedInfo` was modified

* `withOldestRecoveryPointInVault(java.time.OffsetDateTime)` was removed
* `oldestRecoveryPointInVault()` was removed
* `withNewestRecoveryPointInArchive(java.time.OffsetDateTime)` was removed
* `newestRecoveryPointInArchive()` was removed
* `withOldestRecoveryPointInArchive(java.time.OffsetDateTime)` was removed
* `oldestRecoveryPointInArchive()` was removed

#### `models.ResourceGuardProxyOperations` was modified

* `put(java.lang.String,java.lang.String,java.lang.String)` was removed
* `putWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

### Features Added

* `models.ResourceGuardProxyBaseResource$DefinitionStages` was added

* `models.ResourceGuardProxyBaseResource$Definition` was added

* `models.ResourceGuardProxyBaseResource$UpdateStages` was added

* `models.ResourceGuardProxyBaseResource$Update` was added

#### `models.ProtectedItemResource` was modified

* `resourceGroupName()` was added

#### `models.PrivateEndpointConnectionResource` was modified

* `resourceGroupName()` was added

#### `models.ResourceGuardProxyBaseResource` was modified

* `refresh(com.azure.core.util.Context)` was added
* `regionName()` was added
* `unlockDelete(models.UnlockDeleteRequest)` was added
* `refresh()` was added
* `update()` was added
* `resourceGroupName()` was added
* `region()` was added
* `unlockDeleteWithResponse(models.UnlockDeleteRequest,com.azure.core.util.Context)` was added

#### `models.ProtectionIntentResource` was modified

* `resourceGroupName()` was added

#### `models.ProtectionContainerResource` was modified

* `resourceGroupName()` was added

#### `models.ProtectionPolicyResource` was modified

* `resourceGroupName()` was added

#### `models.ResourceGuardProxyOperations` was modified

* `deleteById(java.lang.String)` was added
* `getById(java.lang.String)` was added
* `define(java.lang.String)` was added
* `deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `getByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was added

## 1.0.0-beta.4 (2022-04-29)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2021-12. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.TieringPolicy` was added

* `models.TieringMode` was added

#### `models.SubProtectionPolicy` was modified

* `withTieringPolicy(java.util.Map)` was added
* `tieringPolicy()` was added

#### `RecoveryServicesBackupManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

#### `models.AzureIaaSvmProtectionPolicy` was modified

* `tieringPolicy()` was added
* `withTieringPolicy(java.util.Map)` was added

#### `RecoveryServicesBackupManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

#### `models.AzureVmWorkloadProtectedItemExtendedInfo` was modified

* `newestRecoveryPointInArchive()` was added
* `oldestRecoveryPointInArchive()` was added
* `withOldestRecoveryPointInArchive(java.time.OffsetDateTime)` was added
* `oldestRecoveryPointInVault()` was added
* `withNewestRecoveryPointInArchive(java.time.OffsetDateTime)` was added
* `withOldestRecoveryPointInVault(java.time.OffsetDateTime)` was added

#### `models.AzureIaaSvmProtectedItemExtendedInfo` was modified

* `oldestRecoveryPointInArchive()` was added
* `withOldestRecoveryPointInVault(java.time.OffsetDateTime)` was added
* `oldestRecoveryPointInVault()` was added
* `newestRecoveryPointInArchive()` was added
* `withOldestRecoveryPointInArchive(java.time.OffsetDateTime)` was added
* `withNewestRecoveryPointInArchive(java.time.OffsetDateTime)` was added

## 1.0.0-beta.3 (2022-02-15)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2021-12. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.OperationStatusValidateOperationExtendedInfo` was added

* `models.ValidateOperationStatuses` was added

* `models.AcquireStorageAccountLock` was added

* `models.ProtectionIntentItemType` was added

* `models.DedupState` was added

* `models.AzureWorkloadContainerAutoProtectionIntent` was added

* `models.XcoolState` was added

* `models.HourlySchedule` was added

* `models.ValidateOperationResults` was added

* `models.WeeklySchedule` was added

* `models.SimpleSchedulePolicyV2` was added

* `models.RecoveryPointTierInformationV2` was added

* `models.DailySchedule` was added

* `models.ValidateOperations` was added

* `models.IaasvmPolicyType` was added

* `models.AzureIaaSvmJobV2` was added

#### `models.BackupResourceVaultConfig` was modified

* `isSoftDeleteFeatureStateEditable()` was added
* `withIsSoftDeleteFeatureStateEditable(java.lang.Boolean)` was added

#### `models.ProtectionContainer` was modified

* `protectableObjectType()` was added
* `withProtectableObjectType(java.lang.String)` was added

#### `models.AzureIaaSvmJob` was modified

* `containerName()` was added
* `withIsUserTriggered(java.lang.Boolean)` was added
* `isUserTriggered()` was added
* `withContainerName(java.lang.String)` was added

#### `models.ExtendedProperties` was modified

* `linuxVmApplicationName()` was added
* `withLinuxVmApplicationName(java.lang.String)` was added

#### `models.AzureIaaSvmProtectionPolicy` was modified

* `policyType()` was added
* `withPolicyType(models.IaasvmPolicyType)` was added

#### `models.AzureStorageJob` was modified

* `isUserTriggered()` was added
* `withIsUserTriggered(java.lang.Boolean)` was added

#### `models.ProtectedItem` was modified

* `isArchiveEnabled()` was added
* `withIsArchiveEnabled(java.lang.Boolean)` was added
* `policyName()` was added
* `withPolicyName(java.lang.String)` was added

#### `models.IaaSvmProtectableItem` was modified

* `resourceGroup()` was added
* `withVirtualMachineVersion(java.lang.String)` was added
* `withResourceGroup(java.lang.String)` was added
* `virtualMachineVersion()` was added

#### `RecoveryServicesBackupManager` was modified

* `validateOperationResults()` was added
* `validateOperations()` was added
* `validateOperationStatuses()` was added

#### `models.AzureVmWorkloadProtectedItemExtendedInfo` was modified

* `recoveryModel()` was added
* `withRecoveryModel(java.lang.String)` was added

#### `models.SimpleSchedulePolicy` was modified

* `hourlySchedule()` was added
* `withHourlySchedule(models.HourlySchedule)` was added

#### `models.AzureStorageContainer` was modified

* `acquireStorageAccountLock()` was added
* `withAcquireStorageAccountLock(models.AcquireStorageAccountLock)` was added

#### `models.BackupResourceConfig` was modified

* `withDedupState(models.DedupState)` was added
* `xcoolState()` was added
* `dedupState()` was added
* `withXcoolState(models.XcoolState)` was added

## 1.0.0-beta.2 (2021-11-29)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2021-07. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.1 (2021-05-24)

- Azure Resource Manager RecoveryServicesBackup client library for Java. This package contains Microsoft Azure SDK for RecoveryServicesBackup Management SDK. Open API 2.0 Specs for Azure RecoveryServices Backup service. Package tag package-2021-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
