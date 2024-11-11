# Release History

## 1.0.0-beta.1 (2024-11-11)

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

* `resourceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OSDetails` was modified

* `userSelectedOSName()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withUserSelectedOSName(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RetentionVolume` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TestFailoverJobDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmDiskInput` was modified

* `sectorSizeInBytes()` was added
* `withSectorSizeInBytes(java.lang.Integer)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageProtectedDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IpConfigInputDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SupportedOSProperty` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageAzureV2ReplicationDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2ARecoveryPointDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CreateNetworkMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CreatePolicyInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateVCenterRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationApplianceProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryProximityPlacementGroupCustomDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `resourceType()` was added

#### `models.InMageRcmEventDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IpConfigDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanInMageFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.FabricReplicationGroupTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageDiskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureFabricCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AzureToAzureNetworkMappingSettings` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageVolumeExclusionOptions` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VmmToAzureCreateNetworkMappingInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `SiteRecoveryManager` was modified

* `replicationProtectionClusters()` was added
* `clusterRecoveryPoints()` was added
* `clusterRecoveryPointOperations()` was added

#### `models.VmmDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NetworkProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EventProviderSpecificDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RenewCertificateInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtUpdateMigrationItemInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `userSelectedOSName()` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `linuxLicenseType()` was added
* `withUserSelectedOSName(java.lang.String)` was added

#### `models.MarsAgentDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AProtectionContainerMappingDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanA2AFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmDiscoveredProtectedVmDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareVirtualMachineDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.LogicalNetworkProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryResourceGroupCustomDetails` was modified

* `resourceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateMobilityServiceRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2ReprotectInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanPlannedFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IdentityProviderInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DisableProtectionInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiskEncryptionInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResolveHealthInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryServicesProviderCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AgentDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TestMigrateInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TestMigrateCleanupInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MobilityServiceUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

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

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2EventDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

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

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzurePolicyInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
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

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanInMageRcmFailbackFailoverInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReverseReplicationInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RemoveDisksInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmPolicyCreationInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CreateProtectionContainerMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AddVCenterRequestProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureToAzureVmSyncedConfigDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzureReplicationDetails` was modified

* `withTargetVmSecurityProfile(models.SecurityProfileProperties)` was added
* `instanceType()` was added
* `targetVmSecurityProfile()` was added
* `linuxLicenseType()` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVVirtualMachineDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PolicyCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResourceHealthSummary` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmRecoveryPointDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationProtectedItemCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmFailbackPolicyCreationInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VmwareCbtPolicyDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

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
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReverseReplicationProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2SwitchProviderInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmProtectedDiskDetails` was modified

* `sectorSizeInBytes()` was added
* `withSectorSizeInBytes(java.lang.Integer)` was added
* `withCustomTargetDiskName(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `customTargetDiskName()` was added
* `diskState()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ServiceError` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.GatewayOperationDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PolicyProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.SwitchProviderInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VCenterProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AReprotectInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.DiskVolumeDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationsDiscoveryCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TargetComputeSizeProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AContainerCreationInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.InMageRcmUpdateApplianceForReplicationProtectedItemInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ConsistencyCheckTaskDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AExtendedLocationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateDiskInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmNicDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withTargetNicName(java.lang.String)` was added
* `targetNicName()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2SwitchProviderBlockingErrorDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmUpdateReplicationProtectedItemInput` was modified

* `linuxLicenseType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withSqlServerLicenseType(models.SqlServerLicenseType)` was added
* `withTargetManagedDiskTags(java.util.List)` was added
* `withTargetNicTags(java.util.List)` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `targetVmTags()` was added
* `sqlServerLicenseType()` was added
* `withUserSelectedOSName(java.lang.String)` was added
* `withTargetVmTags(java.util.List)` was added
* `targetManagedDiskTags()` was added
* `targetNicTags()` was added
* `userSelectedOSName()` was added
* `instanceType()` was added

#### `models.PolicyProviderSpecificDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmMobilityAgentDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationProtectionIntentProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProtectionContainer` was modified

* `switchClusterProtection(models.SwitchClusterProtectionInput)` was added
* `switchClusterProtection(models.SwitchClusterProtectionInput,com.azure.core.util.Context)` was added

#### `models.EnableProtectionInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtResyncInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanHyperVReplicaAzureFailbackInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AsrTask` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtSecurityProfileProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaBluePolicyDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VaultSettingCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DisableProtectionProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.RecoveryPlanProviderSpecificInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AUnplannedFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.VersionDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.JobProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateApplianceForReplicationProtectedItemInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaBasePolicyDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
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

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RcmProxyDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2ACrossClusterMigrationContainerCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationEligibilityResultsProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationProviderContainerUnmappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AReplicationIntentDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExportJobDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DisableProtectionInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FabricCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzureFailbackProviderInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.A2AUpdateContainerMappingInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReprotectAgentDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AlertCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwitchProtectionInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateReplicationProtectedItemProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2ProtectedDiskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureToAzureUpdateNetworkMappingInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaBlueReplicationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TestFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RemoveDisksInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AReplicationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `protectionClusterId()` was added
* `instanceType()` was added
* `isClusterInfraReady()` was added
* `withProtectionClusterId(java.lang.String)` was added
* `withIsClusterInfraReady(java.lang.Boolean)` was added

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

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFailbackSyncDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.JobTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFabricCreationInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.FabricSpecificCreationInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanPlannedFailoverInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VmmToVmmUpdateNetworkMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.JobEntity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtDiskInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withSectorSizeInBytes(java.lang.Integer)` was added
* `sectorSizeInBytes()` was added

#### `models.CreateProtectionContainerInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2APolicyCreationInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateReplicationProtectedItemInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ManualActionTaskDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmReprotectInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RunAsAccount` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationProviderSpecificContainerMappingInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateMobilityServiceRequestProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2PolicyInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageReplicationDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectableItemProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MigrationProviderSpecificSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureToAzureCreateNetworkMappingInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanGroupTaskDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtProtectedDiskDetails` was modified

* `withSectorSizeInBytes(java.lang.Integer)` was added
* `sectorSizeInBytes()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MigrationRecoveryPointCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.StorageClassificationCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.StorageClassificationMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AsrJobDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StorageClassificationMappingProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApplianceMonitoringDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageFabricSwitchProviderBlockingErrorDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanAutomationRunbookActionDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.Subnet` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageDiskExclusionInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NetworkMappingProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VmmToVmmCreateNetworkMappingInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OSDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanUnplannedFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanTestFailoverInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtTestMigrateInput` was modified

* `withPostMigrationSteps(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `postMigrationSteps()` was added

#### `models.HyperVReplicaPolicyInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FailoverReplicationProtectedItemDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResolveHealthInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2TestFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.RecoveryPlanInMageAzureV2FailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateApplianceForReplicationProtectedItemInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtEnableMigrationInput` was modified

* `userSelectedOSName()` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `linuxLicenseType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `withUserSelectedOSName(java.lang.String)` was added

#### `models.ApplyRecoveryPointProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.UnplannedFailoverProviderSpecificInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DataStore` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResumeReplicationInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtUpdateDiskInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2ARemoveDisksInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FabricProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ConfigureAlertRequestProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExistingRecoveryVirtualNetwork` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `resourceType()` was added

#### `models.CreateProtectionIntentInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExistingRecoveryAvailabilitySet` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `resourceType()` was added

#### `models.InMageRcmFailbackPolicyDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.StorageClassificationProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationProtectionIntentProviderSpecificSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.InMageUnplannedFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanTestFailoverCleanupInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SwitchProviderSpecificInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.ProviderError` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMNicInputDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmTestFailoverInput` was modified

* `withOsUpgradeVersion(java.lang.String)` was added
* `osUpgradeVersion()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanProtectedItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FabricCreationInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NetworkMappingFabricSpecificSettings` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionContainerMappingProviderSpecificDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaAzurePolicyDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanProviderSpecificDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.AddRecoveryServicesProviderInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmApplianceSpecificDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProtectionContainerFabricSpecificDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateRecoveryPlanInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationProviderSpecificSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AddDisksInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CreateProtectionIntentProviderSpecificDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmFailbackEventDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.ReplicationProtectedItemProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFailbackReprotectInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.HealthErrorSummary` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PolicyProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmPolicyDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VmmToAzureUpdateNetworkMappingInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CurrentScenarioDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExistingStorageAccount` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `resourceType()` was added

#### `models.RecoveryPlanGroup` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VirtualMachineTaskDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFailbackReplicationDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NewProtectionProfile` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `resourceType()` was added

#### `models.A2AAddDisksInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.InMageRcmReplicationDetails` was modified

* `withSqlServerLicenseType(java.lang.String)` was added
* `withTargetNicTags(java.util.List)` was added
* `withSupportedOSVersions(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `sqlServerLicenseType()` was added
* `withUnprotectedDisks(java.util.List)` was added
* `withOsName(java.lang.String)` was added
* `unprotectedDisks()` was added
* `withTargetVmTags(java.util.List)` was added
* `withTargetVmSecurityProfile(models.SecurityProfileProperties)` was added
* `targetVmTags()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withSeedManagedDiskTags(java.util.List)` was added
* `instanceType()` was added
* `seedManagedDiskTags()` was added
* `targetVmSecurityProfile()` was added
* `supportedOSVersions()` was added
* `targetManagedDiskTags()` was added
* `targetNicTags()` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `linuxLicenseType()` was added
* `withTargetManagedDiskTags(java.util.List)` was added
* `osName()` was added

#### `models.InMageAzureV2ManagedDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtEventDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AProtectionIntentDiskInputDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExistingRecoveryResourceGroup` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `resourceType()` was added

#### `models.MigrateInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationEligibilityResultsErrorInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AutomationRunbookTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageRcmDisksDefaultInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `sectorSizeInBytes()` was added
* `withSectorSizeInBytes(java.lang.Integer)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtContainerMappingInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

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

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.TestMigrateCleanupInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtMigrateInput` was modified

* `withPostMigrationSteps(java.util.List)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `postMigrationSteps()` was added

#### `models.HyperVReplicaAzureTestFailoverInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

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
* `resourceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FailoverJobDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.A2ASwitchProtectionInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureVmDiskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageAzureV2RecoveryPointDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareV2FabricCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
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

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ScriptActionTaskDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ConfigurationSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzureEventDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.ExtendedLocation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProcessServer` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VCenterCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EnableMigrationInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.JobQueryParameter` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateNetworkMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2ACrossClusterMigrationEnableProtectionInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageDisableProtectionProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateVCenterRequestProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EnableMigrationProviderSpecificInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AApplyRecoveryPointInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProtectionContainerMappingProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NetworkCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AFabricSpecificLocationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AddVCenterRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReplicationProviderSpecificUpdateContainerMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.LogicalNetworkCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2ATestFailoverInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FabricSpecificDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FailoverProcessServerRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateReplicationProtectedItemInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtResumeReplicationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2ACrossClusterMigrationApplyRecoveryPointInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.SwitchProtectionInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RenewCertificateInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResumeReplicationProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageBasePolicyDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.ResumeJobParamsProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HealthError` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaAzureEnableProtectionInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `targetVmSecurityProfile()` was added
* `userSelectedOSName()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `withUserSelectedOSName(java.lang.String)` was added
* `linuxLicenseType()` was added
* `withTargetVmSecurityProfile(models.SecurityProfileProperties)` was added

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
* `toJson(com.azure.json.JsonWriter)` was added
* `resourceType()` was added

#### `models.ApplianceSpecificDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MigrationItemProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageAzureV2UnplannedFailoverInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryServicesProviderProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EventCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IdentityProviderDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanA2ADetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RemoveDisksProviderSpecificInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmSyncDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DataStoreUtilizationDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DraDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FabricCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TestFailoverCleanupInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanScriptActionDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.VmmToAzureNetworkMappingSettings` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaBaseEventDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EnableMigrationInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResyncInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExistingProtectionProfile` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `resourceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EventSpecificDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.GroupTaskDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SupportedOSProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2EnableProtectionInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApplyRecoveryPointInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RemoveProtectionContainerMappingInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FailoverProcessServerRequestProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplica2012R2EventDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageRcmProtectionContainerMappingDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.MigrateInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProcessServerDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AProtectedManagedDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageReprotectInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.AddDisksInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VaultSettingCreationInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtNicDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AZoneDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResumeReplicationInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TestMigrateInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PlannedFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TestFailoverCleanupInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateMigrationItemInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AContainerMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationProtectionContainers` was modified

* `switchClusterProtection(java.lang.String,java.lang.String,java.lang.String,java.lang.String,models.SwitchClusterProtectionInput,com.azure.core.util.Context)` was added
* `switchClusterProtection(java.lang.String,java.lang.String,java.lang.String,java.lang.String,models.SwitchClusterProtectionInput)` was added

#### `models.VaultHealthProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareV2FabricSpecificDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMagePolicyInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.InMageEnableProtectionInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
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

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.A2AEnableProtectionInput` was modified

* `withProtectionClusterId(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `protectionClusterId()` was added

#### `models.UpdateReplicationProtectedItemProviderInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationGroupDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.ResyncInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMNicDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResolveHealthError` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AlertProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiscoverProtectableItemRequestProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.JobCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationAgentDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MigrateProviderSpecificInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.RecoveryPlanTestFailoverCleanupInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AVmManagedDiskInputDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AProtectedDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AUpdateReplicationProtectedItemInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.PlannedFailoverProviderSpecificFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SupportedOSDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaAzureApplyRecoveryPointInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.HyperVReplicaAzureUpdateReplicationProtectedItemInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `linuxLicenseType()` was added
* `withUserSelectedOSName(java.lang.String)` was added
* `userSelectedOSName()` was added

#### `models.ConfigureAlertRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmApplyRecoveryPointInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.CreateProtectionContainerMappingInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResyncProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.TestFailoverProviderSpecificInput` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FabricSpecificUpdateNetworkMappingInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NetworkMappingCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVHostDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TestMigrateProviderSpecificInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AUnprotectedDiskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaAzureDiskInputDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withSectorSizeInBytes(java.lang.Integer)` was added
* `sectorSizeInBytes()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CreateRecoveryPlanInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFailbackProtectedDiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtProtectionContainerMappingDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProviderSpecificRecoveryPointDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageAzureV2SwitchProviderDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EnableProtectionInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanA2AInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MigrationRecoveryPointProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateRecoveryPlanInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VmmVirtualMachineDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AProtectionIntentManagedDiskInputDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProtectableItemCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UnplannedFailoverInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationProtectionIntentCollection` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateProtectionContainerMappingInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ComputeSizeErrorDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzureManagedDiskDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `sectorSizeInBytes()` was added
* `withTargetDiskAccountType(models.DiskAccountType)` was added
* `targetDiskAccountType()` was added
* `withSectorSizeInBytes(java.lang.Integer)` was added

#### `models.ResumeJobParams` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InitialReplicationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdatePolicyInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RecoveryPlanTestFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaAzureReprotectInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InputEndpoint` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.JobErrorDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReplicationProviderSpecificContainerCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.RecoveryVirtualNetworkCustomDetails` was modified

* `resourceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CriticalJobHistoryDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVReplicaReplicationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmFailbackDiscoveredProtectedVmDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.JobStatusEventDetails` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPointProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2UpdateReplicationProtectedItemInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FabricSpecificCreateNetworkMappingInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CreateRecoveryPlanInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Display` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AddDisksProviderSpecificInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HyperVSiteDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.UpdateProtectionContainerMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2ACrossClusterMigrationPolicyCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageDiskSignatureExclusionOptions` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TargetComputeSizeCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmFabricSwitchProviderBlockingErrorDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2ACreateProtectionIntentInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PushInstallerDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InlineWorkflowTaskDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VmmToVmmNetworkMappingSettings` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmLastAgentUpgradeErrorDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

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

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.RecoveryPlanProviderSpecificFailoverInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApplianceResourceDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AVmDiskInputDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2AEventDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CreateProtectionIntentProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DiscoverProtectableItemRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RecoveryPlanHyperVReplicaAzureFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.SwitchProviderInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmEnableProtectionInput` was modified

* `withUserSelectedOSName(java.lang.String)` was added
* `withTargetVmTags(java.util.List)` was added
* `withSqlServerLicenseType(models.SqlServerLicenseType)` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `targetNicTags()` was added
* `withSeedManagedDiskTags(java.util.List)` was added
* `userSelectedOSName()` was added
* `linuxLicenseType()` was added
* `withTargetNicTags(java.util.List)` was added
* `targetVmTags()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withTargetVmSecurityProfile(models.SecurityProfileProperties)` was added
* `sqlServerLicenseType()` was added
* `targetManagedDiskTags()` was added
* `instanceType()` was added
* `targetVmSecurityProfile()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `seedManagedDiskTags()` was added
* `withTargetManagedDiskTags(java.util.List)` was added

#### `models.RecoveryPlanUnplannedFailoverInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageAzureV2ApplyRecoveryPointInput` was modified

* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmFabricSpecificDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.TestFailoverInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.A2AVmManagedDiskUpdateDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InMageRcmNicInput` was modified

* `targetNicName()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withTargetNicName(java.lang.String)` was added

#### `models.VMwareCbtNicInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExistingRecoveryProximityPlacementGroup` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `resourceType()` was added

#### `models.RecoveryPlanInMageRcmFailoverInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.RecoveryPlanManualActionDetails` was modified

* `instanceType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MasterTargetServer` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CreatePolicyInputProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmApplianceDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MigrationItemCollection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzureUnplannedFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `instanceType()` was added

#### `models.InMageRcmFailbackNicDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageRcmUnplannedFailoverInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `withOsUpgradeVersion(java.lang.String)` was added
* `osUpgradeVersion()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VMwareCbtContainerCreationInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EventProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InMageAgentDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReverseReplicationInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VmNicUpdatesTaskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.KeyEncryptionKeyInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HyperVReplicaAzurePlannedFailoverProviderInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.RemoveProtectionContainerMappingInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EnableProtectionProviderSpecificInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PauseReplicationInputProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.A2ACrossClusterMigrationReplicationDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `instanceType()` was added

#### `models.OSVersionWrapper` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateMigrationItemInput` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VMwareCbtMigrationDetails` was modified

* `linuxLicenseType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withLinuxLicenseType(models.LinuxLicenseType)` was added
* `instanceType()` was added

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

