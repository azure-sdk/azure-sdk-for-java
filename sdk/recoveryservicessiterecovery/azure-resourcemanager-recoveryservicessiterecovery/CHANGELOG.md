# Release History

## 1.0.0-beta.1 (2024-10-16)

- Azure Resource Manager SiteRecovery client library for Java. This package contains Microsoft Azure SDK for SiteRecovery Management SDK.  Package tag package-2024-10. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.ClusterRecoveryPointCollection` was added

* `models.DiskState` was added

* `models.A2ASharedDiskReplicationDetails` was added

* `models.ApplyClusterRecoveryPointProviderSpecificInput` was added

* `models.SharedDiskReplicationProviderSpecificSettings` was added

* `models.InMageRcmAddDisksInput` was added

* `models.FailoverDirection` was added

* `models.RegisteredClusterNodes` was added

* `models.ClusterSwitchProtectionJobDetails` was added

* `models.SwitchClusterProtectionProviderSpecificInput` was added

* `models.A2AClusterRecoveryPointDetails` was added

* `models.ClusterRecoveryPoints` was added

* `models.ClusterTestFailoverProviderSpecificInput` was added

* `models.LinuxLicenseType` was added

* `models.ManagedRunCommandScriptInput` was added

* `models.ClusterProviderSpecificRecoveryPointDetails` was added

* `models.ReplicationProtectionCluster$Definition` was added

* `models.SecurityProfileProperties` was added

* `models.ClusterUnplannedFailoverInputProperties` was added

* `models.ClusterTestFailoverInputProperties` was added

* `models.SwitchClusterProtectionInputProperties` was added

* `models.ReplicationProtectionCluster$DefinitionStages` was added

* `models.A2AApplyClusterRecoveryPointInput` was added

* `models.ClusterRecoveryPointOperations` was added

* `models.ApplyClusterRecoveryPointInput` was added

* `models.ClusterRecoveryPointProperties` was added

* `models.A2AClusterUnplannedFailoverInput` was added

* `models.SwitchClusterProtectionInput` was added

* `models.ClusterTestFailoverCleanupInput` was added

* `models.A2AClusterTestFailoverInput` was added

* `models.ClusterRecoveryPointType` was added

* `models.SecurityConfiguration` was added

* `models.A2ASwitchClusterProtectionInput` was added

* `models.ClusterUnplannedFailoverProviderSpecificInput` was added

* `models.ReplicationClusterProviderSpecificSettings` was added

* `models.ReplicationProtectionCluster` was added

* `models.ClusterTestFailoverCleanupInputProperties` was added

* `models.A2ASharedDiskIRErrorDetails` was added

* `models.SharedDiskReplicationItemProperties` was added

* `models.ApplyClusterRecoveryPointInputProperties` was added

* `models.ClusterRecoveryPoint` was added

* `models.ReplicationProtectionClusterProperties` was added

* `models.ReplicationProtectionClusters` was added

* `models.A2AProtectedItemDetail` was added

* `models.UserCreatedResourceTag` was added

* `models.InMageRcmUnProtectedDiskDetails` was added

* `models.ReplicationProtectionClusterCollection` was added

* `models.ClusterTestFailoverInput` was added

* `models.ClusterUnplannedFailoverInput` was added

* `models.ClusterTestFailoverJobDetails` was added

* `models.A2AReplicationProtectionClusterDetails` was added

* `models.ClusterFailoverJobDetails` was added

#### `models.ProtectionProfileCustomDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `resourceType()` was added

#### `models.OSDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `userSelectedOSName()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withUserSelectedOSName(java.lang.String)` was added

#### `models.RetentionVolume` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TestFailoverJobDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageRcmDiskInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `sectorSizeInBytes()` was added
* `withSectorSizeInBytes(java.lang.Integer)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageProtectedDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IpConfigInputDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SupportedOSProperty` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2ReplicationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2ARecoveryPointDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CreateNetworkMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CreatePolicyInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateVCenterRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationApplianceProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryProximityPlacementGroupCustomDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `resourceType()` was added

#### `models.InMageRcmEventDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.IpConfigDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanInMageFailoverInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FabricReplicationGroupTaskDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureFabricCreationInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureToAzureNetworkMappingSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageVolumeExclusionOptions` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VmmToAzureCreateNetworkMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `SiteRecoveryManager` was modified

* `replicationProtectionClusters()` was added
* `clusterRecoveryPoints()` was added
* `clusterRecoveryPointOperations()` was added

#### `models.VmmDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NetworkProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EventProviderSpecificDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RenewCertificateInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtUpdateMigrationItemInput` was modified

* `userSelectedOSName()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `linuxLicenseType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withUserSelectedOSName(java.lang.String)` was added
* `instanceType()` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added

#### `models.MarsAgentDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AProtectionContainerMappingDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanA2AFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.InMageRcmDiscoveredProtectedVmDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareVirtualMachineDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LogicalNetworkProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryResourceGroupCustomDetails` was modified

* `resourceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateMobilityServiceRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageAzureV2ReprotectInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanPlannedFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IdentityProviderInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DisableProtectionInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DiskEncryptionInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResolveHealthInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryServicesProviderCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AgentDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TestMigrateInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TestMigrateCleanupInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MobilityServiceUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaBluePolicyInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwitchProtectionProviderSpecificInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaPolicyDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionContainerMappingCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwitchProtectionJobDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2EventDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CreateNetworkMappingInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2DiskInputDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionContainerProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DiskEncryptionKeyInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateMigrationItemProviderSpecificInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.HyperVReplicaAzurePolicyInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PlannedFailoverInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OSUpgradeSupportedVersions` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryAvailabilitySetCustomDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `resourceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateNetworkMappingInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApplyRecoveryPointInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanInMageRcmFailbackFailoverInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReverseReplicationInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RemoveDisksInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmPolicyCreationInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CreateProtectionContainerMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AddVCenterRequestProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureToAzureVmSyncedConfigDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzureReplicationDetails` was modified

* `instanceType()` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `withTargetVmSecurityProfile(models.SecurityProfileProperties)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `targetVmSecurityProfile()` was added
* `linuxLicenseType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVVirtualMachineDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.PolicyCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceHealthSummary` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmRecoveryPointDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationProtectedItemCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFailbackPolicyCreationInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.VmwareCbtPolicyDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.PauseReplicationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.JobDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CurrentJobDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2PolicyDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReverseReplicationProviderSpecificInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageAzureV2SwitchProviderInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageRcmProtectedDiskDetails` was modified

* `customTargetDiskName()` was added
* `withSectorSizeInBytes(java.lang.Integer)` was added
* `sectorSizeInBytes()` was added
* `diskState()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withCustomTargetDiskName(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ServiceError` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.GatewayOperationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PolicyProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SwitchProviderInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VCenterProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AReprotectInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiskVolumeDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationsDiscoveryCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TargetComputeSizeProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AContainerCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageRcmUpdateApplianceForReplicationProtectedItemInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ConsistencyCheckTaskDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AExtendedLocationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateDiskInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmNicDetails` was modified

* `targetNicName()` was added
* `withTargetNicName(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2SwitchProviderBlockingErrorDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmUpdateReplicationProtectedItemInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withUserSelectedOSName(java.lang.String)` was added
* `withTargetNicTags(java.util.List)` was added
* `withTargetVmTags(java.util.List)` was added
* `withSqlServerLicenseType(models.SqlServerLicenseType)` was added
* `targetVmTags()` was added
* `linuxLicenseType()` was added
* `userSelectedOSName()` was added
* `withTargetManagedDiskTags(java.util.List)` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `targetNicTags()` was added
* `instanceType()` was added
* `sqlServerLicenseType()` was added
* `targetManagedDiskTags()` was added

#### `models.PolicyProviderSpecificDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmMobilityAgentDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationProtectionIntentProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionContainer` was modified

* `switchClusterProtection(models.SwitchClusterProtectionInput)` was added
* `switchClusterProtection(models.SwitchClusterProtectionInput,com.azure.core.util.Context)` was added

#### `models.EnableProtectionInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtResyncInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.RecoveryPlanHyperVReplicaAzureFailbackInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AsrTask` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtSecurityProfileProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaBluePolicyDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VaultSettingCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DisableProtectionProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanProviderSpecificInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AUnplannedFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VersionDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.JobProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateApplianceForReplicationProtectedItemInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaBasePolicyDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.HyperVReplicaBaseReplicationDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureFabricSpecificDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFailbackPlannedFailoverProviderInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RcmProxyDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2ACrossClusterMigrationContainerCreationInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationEligibilityResultsProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationProviderContainerUnmappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AReplicationIntentDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.ExportJobDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DisableProtectionInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FabricCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzureFailbackProviderInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AUpdateContainerMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReprotectAgentDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AlertCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SwitchProtectionInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateReplicationProtectedItemProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageAzureV2ProtectedDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureToAzureUpdateNetworkMappingInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaBlueReplicationDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.TestFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RemoveDisksInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AReplicationDetails` was modified

* `instanceType()` was added
* `protectionClusterId()` was added
* `withIsClusterInfraReady(java.lang.Boolean)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `isClusterInfraReady()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withProtectionClusterId(java.lang.String)` was added

#### `models.RecoveryPlanAction` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StorageMappingInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPointCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StorageClassificationMappingCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApplianceCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmFailbackSyncDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.JobTaskDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFabricCreationInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FabricSpecificCreationInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanPlannedFailoverInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VmmToVmmUpdateNetworkMappingInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.JobEntity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtDiskInput` was modified

* `sectorSizeInBytes()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withSectorSizeInBytes(java.lang.Integer)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CreateProtectionContainerInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2APolicyCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.UpdateReplicationProtectedItemInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ManualActionTaskDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmReprotectInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RunAsAccount` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationProviderSpecificContainerMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateMobilityServiceRequestProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageAzureV2PolicyInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageReplicationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.ProtectableItemProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MigrationProviderSpecificSettings` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureToAzureCreateNetworkMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.RecoveryPlanGroupTaskDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtProtectedDiskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withSectorSizeInBytes(java.lang.Integer)` was added
* `sectorSizeInBytes()` was added

#### `models.MigrationRecoveryPointCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.StorageClassificationCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StorageClassificationMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AsrJobDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.StorageClassificationMappingProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApplianceMonitoringDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageFabricSwitchProviderBlockingErrorDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanAutomationRunbookActionDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.Subnet` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageDiskExclusionInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NetworkMappingProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VmmToVmmCreateNetworkMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OSDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanUnplannedFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanTestFailoverInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtTestMigrateInput` was modified

* `instanceType()` was added
* `postMigrationSteps()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withPostMigrationSteps(java.util.List)` was added

#### `models.HyperVReplicaPolicyInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FailoverReplicationProtectedItemDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResolveHealthInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageAzureV2TestFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.RecoveryPlanInMageAzureV2FailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.UpdateApplianceForReplicationProtectedItemInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtEnableMigrationInput` was modified

* `linuxLicenseType()` was added
* `instanceType()` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `userSelectedOSName()` was added
* `withUserSelectedOSName(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApplyRecoveryPointProviderSpecificInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.UnplannedFailoverProviderSpecificInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.DataStore` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResumeReplicationInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtUpdateDiskInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2ARemoveDisksInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FabricProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ConfigureAlertRequestProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExistingRecoveryVirtualNetwork` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `resourceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CreateProtectionIntentInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExistingRecoveryAvailabilitySet` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `resourceType()` was added

#### `models.InMageRcmFailbackPolicyDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.StorageClassificationProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationProtectionIntentProviderSpecificSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageUnplannedFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanTestFailoverCleanupInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwitchProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProviderError` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMNicInputDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmTestFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `osUpgradeVersion()` was added
* `withOsUpgradeVersion(java.lang.String)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanProtectedItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FabricCreationInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NetworkMappingFabricSpecificSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionContainerMappingProviderSpecificDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.HyperVReplicaAzurePolicyDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.RecoveryPlanProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanProviderSpecificDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.AddRecoveryServicesProviderInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmApplianceSpecificDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.ProtectionContainerFabricSpecificDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateRecoveryPlanInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationProviderSpecificSettings` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AddDisksInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CreateProtectionIntentProviderSpecificDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.InMageRcmFailbackEventDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationProtectedItemProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFailbackReprotectInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HealthErrorSummary` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PolicyProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmPolicyDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VmmToAzureUpdateNetworkMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.CurrentScenarioDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExistingStorageAccount` was modified

* `resourceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanGroup` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VirtualMachineTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageRcmFailbackReplicationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NewProtectionProfile` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `resourceType()` was added

#### `models.A2AAddDisksInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageRcmReplicationDetails` was modified

* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `withTargetManagedDiskTags(java.util.List)` was added
* `withOsName(java.lang.String)` was added
* `targetVmTags()` was added
* `withSupportedOSVersions(java.util.List)` was added
* `withUnprotectedDisks(java.util.List)` was added
* `withSeedManagedDiskTags(java.util.List)` was added
* `targetNicTags()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `sqlServerLicenseType()` was added
* `withSqlServerLicenseType(java.lang.String)` was added
* `targetManagedDiskTags()` was added
* `supportedOSVersions()` was added
* `withTargetVmSecurityProfile(models.SecurityProfileProperties)` was added
* `osName()` was added
* `seedManagedDiskTags()` was added
* `unprotectedDisks()` was added
* `instanceType()` was added
* `linuxLicenseType()` was added
* `withTargetNicTags(java.util.List)` was added
* `targetVmSecurityProfile()` was added
* `withTargetVmTags(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageAzureV2ManagedDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtEventDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AProtectionIntentDiskInputDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExistingRecoveryResourceGroup` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `resourceType()` was added

#### `models.MigrateInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationEligibilityResultsErrorInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AutomationRunbookTaskDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmDisksDefaultInput` was modified

* `withSectorSizeInBytes(java.lang.Integer)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `sectorSizeInBytes()` was added

#### `models.VMwareCbtContainerMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionContainerCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AddRecoveryServicesProviderInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmFailbackMobilityAgentDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtPolicyCreationInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TestMigrateCleanupInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtMigrateInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `postMigrationSteps()` was added
* `instanceType()` was added
* `withPostMigrationSteps(java.util.List)` was added

#### `models.HyperVReplicaAzureTestFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.InMageTestFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VaultSettingCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InnerHealthError` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.StorageAccountCustomDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `resourceType()` was added

#### `models.FailoverJobDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2ASwitchProtectionInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureVmDiskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageAzureV2RecoveryPointDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareV2FabricCreationInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TaskTypeDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.UpdatePolicyInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AgentDiskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CreateProtectionContainerInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ScriptActionTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ConfigurationSettings` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaAzureEventDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.ExtendedLocation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProcessServer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VCenterCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EnableMigrationInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.JobQueryParameter` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateNetworkMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2ACrossClusterMigrationEnableProtectionInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageDisableProtectionProviderSpecificInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateVCenterRequestProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EnableMigrationProviderSpecificInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AApplyRecoveryPointInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionContainerMappingProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NetworkCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AFabricSpecificLocationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AddVCenterRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationProviderSpecificUpdateContainerMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LogicalNetworkCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2ATestFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FabricSpecificDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.FailoverProcessServerRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateReplicationProtectedItemInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtResumeReplicationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.DiskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2ACrossClusterMigrationApplyRecoveryPointInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwitchProtectionInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RenewCertificateInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResumeReplicationProviderSpecificInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageBasePolicyDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.ResumeJobParamsProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HealthError` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzureEnableProtectionInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `linuxLicenseType()` was added
* `withTargetVmSecurityProfile(models.SecurityProfileProperties)` was added
* `userSelectedOSName()` was added
* `withUserSelectedOSName(java.lang.String)` was added
* `targetVmSecurityProfile()` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added

#### `models.A2APolicyDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.RecoveryPlanActionDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NewRecoveryVirtualNetwork` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `resourceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApplianceSpecificDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.MigrationItemProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2UnplannedFailoverInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryServicesProviderProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EventCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IdentityProviderDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanA2ADetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RemoveDisksProviderSpecificInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmSyncDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DataStoreUtilizationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DraDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FabricCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TestFailoverCleanupInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanScriptActionDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VmmToAzureNetworkMappingSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.HyperVReplicaBaseEventDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EnableMigrationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResyncInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExistingProtectionProfile` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `resourceType()` was added

#### `models.EventSpecificDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.GroupTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SupportedOSProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2EnableProtectionInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApplyRecoveryPointInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RemoveProtectionContainerMappingInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FailoverProcessServerRequestProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplica2012R2EventDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageRcmProtectionContainerMappingDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MigrateInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProcessServerDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AProtectedManagedDiskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageReprotectInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AddDisksInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VaultSettingCreationInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtNicDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AZoneDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResumeReplicationInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TestMigrateInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PlannedFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TestFailoverCleanupInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateMigrationItemInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AContainerMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.ReplicationProtectionContainers` was modified

* `switchClusterProtection(java.lang.String,java.lang.String,java.lang.String,java.lang.String,models.SwitchClusterProtectionInput)` was added
* `switchClusterProtection(java.lang.String,java.lang.String,java.lang.String,java.lang.String,models.SwitchClusterProtectionInput,com.azure.core.util.Context)` was added

#### `models.VaultHealthProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareV2FabricSpecificDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMagePolicyInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageEnableProtectionInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InconsistentVmDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmUpdateContainerMappingInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EncryptionDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMagePolicyDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AEnableProtectionInput` was modified

* `withProtectionClusterId(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `protectionClusterId()` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateReplicationProtectedItemProviderInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationGroupDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResyncInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMNicDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResolveHealthError` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AlertProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiscoverProtectableItemRequestProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.JobCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationAgentDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MigrateProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanTestFailoverCleanupInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AVmManagedDiskInputDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AProtectedDiskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AUpdateReplicationProtectedItemInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PlannedFailoverProviderSpecificFailoverInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SupportedOSDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaAzureApplyRecoveryPointInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.HyperVReplicaAzureUpdateReplicationProtectedItemInput` was modified

* `userSelectedOSName()` was added
* `withUserSelectedOSName(java.lang.String)` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `linuxLicenseType()` was added

#### `models.ConfigureAlertRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmApplyRecoveryPointInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.CreateProtectionContainerMappingInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResyncProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TestFailoverProviderSpecificInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FabricSpecificUpdateNetworkMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.NetworkMappingCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVHostDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TestMigrateProviderSpecificInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AUnprotectedDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzureDiskInputDetails` was modified

* `withSectorSizeInBytes(java.lang.Integer)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `sectorSizeInBytes()` was added

#### `models.CreateRecoveryPlanInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFailbackProtectedDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtProtectionContainerMappingDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.ProviderSpecificRecoveryPointDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageAzureV2SwitchProviderDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EnableProtectionInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanA2AInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MigrationRecoveryPointProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateRecoveryPlanInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VmmVirtualMachineDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.A2AProtectionIntentManagedDiskInputDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectableItemCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UnplannedFailoverInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationProtectionIntentCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateProtectionContainerMappingInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ComputeSizeErrorDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzureManagedDiskDetails` was modified

* `targetDiskAccountType()` was added
* `withSectorSizeInBytes(java.lang.Integer)` was added
* `sectorSizeInBytes()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withTargetDiskAccountType(models.DiskAccountType)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResumeJobParams` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InitialReplicationDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdatePolicyInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanTestFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaAzureReprotectInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InputEndpoint` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.JobErrorDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationProviderSpecificContainerCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryVirtualNetworkCustomDetails` was modified

* `resourceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CriticalJobHistoryDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaReplicationDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageRcmFailbackDiscoveredProtectedVmDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.JobStatusEventDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.RecoveryPointProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2UpdateReplicationProtectedItemInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FabricSpecificCreateNetworkMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.CreateRecoveryPlanInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Display` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AddDisksProviderSpecificInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVSiteDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.UpdateProtectionContainerMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2ACrossClusterMigrationPolicyCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageDiskSignatureExclusionOptions` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TargetComputeSizeCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmFabricSwitchProviderBlockingErrorDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2ACreateProtectionIntentInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.PushInstallerDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InlineWorkflowTaskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VmmToVmmNetworkMappingSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmLastAgentUpgradeErrorDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UnplannedFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplica2012EventDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.VaultSettingProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmAgentUpgradeBlockingErrorDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanShutdownGroupTaskDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanProviderSpecificFailoverInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApplianceResourceDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AVmDiskInputDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AEventDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.CreateProtectionIntentProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DiscoverProtectableItemRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanHyperVReplicaAzureFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.SwitchProviderInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmEnableProtectionInput` was modified

* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `withSeedManagedDiskTags(java.util.List)` was added
* `targetManagedDiskTags()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `seedManagedDiskTags()` was added
* `sqlServerLicenseType()` was added
* `instanceType()` was added
* `targetVmSecurityProfile()` was added
* `withTargetVmTags(java.util.List)` was added
* `targetVmTags()` was added
* `withUserSelectedOSName(java.lang.String)` was added
* `withTargetNicTags(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `linuxLicenseType()` was added
* `userSelectedOSName()` was added
* `withSqlServerLicenseType(models.SqlServerLicenseType)` was added
* `withTargetVmSecurityProfile(models.SecurityProfileProperties)` was added
* `withTargetManagedDiskTags(java.util.List)` was added
* `targetNicTags()` was added

#### `models.RecoveryPlanUnplannedFailoverInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2ApplyRecoveryPointInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFabricSpecificDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TestFailoverInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AVmManagedDiskUpdateDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmNicInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withTargetNicName(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `targetNicName()` was added

#### `models.VMwareCbtNicInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExistingRecoveryProximityPlacementGroup` was modified

* `resourceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanInMageRcmFailoverInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanManualActionDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MasterTargetServer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CreatePolicyInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmApplianceDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MigrationItemCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzureUnplannedFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.InMageRcmFailbackNicDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmUnplannedFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `osUpgradeVersion()` was added
* `withOsUpgradeVersion(java.lang.String)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtContainerCreationInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EventProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAgentDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReverseReplicationInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VmNicUpdatesTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.KeyEncryptionKeyInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaAzurePlannedFailoverProviderInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.RemoveProtectionContainerMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EnableProtectionProviderSpecificInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PauseReplicationInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2ACrossClusterMigrationReplicationDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OSVersionWrapper` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateMigrationItemInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtMigrationDetails` was modified

* `instanceType()` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `linuxLicenseType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

## 1.1.0 (2024-02-22)

- Azure Resource Manager SiteRecovery client library for Java. This package contains Microsoft Azure SDK for SiteRecovery Management SDK.  Package tag package-2023-08. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.ReplicationFabrics` was modified

* `removeInfra(java.lang.String,java.lang.String,java.lang.String)` was added
* `removeInfra(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.A2AEnableProtectionInput` was modified

* `autoProtectionOfDataDisk()` was added
* `withAutoProtectionOfDataDisk(models.AutoProtectionOfDataDisk)` was added

#### `models.Fabric` was modified

* `removeInfra()` was added
* `removeInfra(com.azure.core.util.Context)` was added

## 1.0.0 (2023-09-22)

- Azure Resource Manager SiteRecovery client library for Java. This package contains Microsoft Azure SDK for SiteRecovery Management SDK.  Package tag package-2023-06. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.OSUpgradeSupportedVersions` was added

* `models.ChurnOptionSelected` was added

* `models.GatewayOperationDetails` was added

* `models.VMwareCbtSecurityProfileProperties` was added

* `models.ApplianceMonitoringDetails` was added

* `models.A2AFabricSpecificLocationDetails` was added

* `models.SecurityType` was added

* `models.DataStoreUtilizationDetails` was added

* `models.ApplianceResourceDetails` was added

#### `models.InMageAzureV2ReplicationDetails` was modified

* `osName()` was added
* `allAvailableOSUpgradeConfigurations()` was added
* `withSupportedOSVersions(java.util.List)` was added
* `supportedOSVersions()` was added
* `withAllAvailableOSUpgradeConfigurations(java.util.List)` was added

#### `models.HyperVReplicaAzureReplicationDetails` was modified

* `withAllAvailableOSUpgradeConfigurations(java.util.List)` was added
* `allAvailableOSUpgradeConfigurations()` was added

#### `models.AzureFabricSpecificDetails` was modified

* `withLocationDetails(java.util.List)` was added
* `locationDetails()` was added

#### `models.A2AReplicationDetails` was modified

* `churnOptionSelected()` was added

#### `models.VMwareCbtProtectedDiskDetails` was modified

* `gatewayOperationDetails()` was added

#### `models.VMwareCbtTestMigrateInput` was modified

* `osUpgradeVersion()` was added
* `withOsUpgradeVersion(java.lang.String)` was added

#### `models.InMageAzureV2TestFailoverInput` was modified

* `osUpgradeVersion()` was added
* `withOsUpgradeVersion(java.lang.String)` was added

#### `models.VMwareCbtEnableMigrationInput` was modified

* `withTargetVmSecurityProfile(models.VMwareCbtSecurityProfileProperties)` was added
* `withConfidentialVmKeyVaultId(java.lang.String)` was added
* `targetVmSecurityProfile()` was added
* `confidentialVmKeyVaultId()` was added

#### `models.VMwareCbtMigrateInput` was modified

* `withOsUpgradeVersion(java.lang.String)` was added
* `osUpgradeVersion()` was added

#### `models.HyperVReplicaAzureTestFailoverInput` was modified

* `osUpgradeVersion()` was added
* `withOsUpgradeVersion(java.lang.String)` was added

#### `models.InMageAzureV2UnplannedFailoverInput` was modified

* `osUpgradeVersion()` was added
* `withOsUpgradeVersion(java.lang.String)` was added

#### `models.VMwareCbtProtectionContainerMappingDetails` was modified

* `withExcludedSkus(java.util.List)` was added
* `excludedSkus()` was added

#### `models.HyperVReplicaAzurePlannedFailoverProviderInput` was modified

* `withOsUpgradeVersion(java.lang.String)` was added
* `osUpgradeVersion()` was added

#### `models.VMwareCbtMigrationDetails` was modified

* `gatewayOperationDetails()` was added
* `isCheckSumResyncCycle()` was added
* `targetVmSecurityProfile()` was added
* `withTargetVmSecurityProfile(models.VMwareCbtSecurityProfileProperties)` was added
* `osName()` was added
* `operationName()` was added
* `applianceMonitoringDetails()` was added
* `confidentialVmKeyVaultId()` was added
* `withConfidentialVmKeyVaultId(java.lang.String)` was added
* `supportedOSVersions()` was added
* `deltaSyncProgressPercentage()` was added
* `withSupportedOSVersions(java.util.List)` was added
* `deltaSyncRetryCount()` was added

## 1.0.0-beta.1 (2023-01-11)

- Azure Resource Manager SiteRecovery client library for Java. This package contains Microsoft Azure SDK for SiteRecovery Management SDK.  Package tag package-2022-10. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

