# Release History

## 1.0.0-beta.1 (2025-04-16)

- Azure Resource Manager OracleDatabase client library for Java. This package contains Microsoft Azure SDK for OracleDatabase Management SDK.  Package tag package-2025-03-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.AutonomousDatabaseBackupUpdateProperties` was removed

#### `models.DbNodes` was modified

* `listByCloudVmCluster(java.lang.String,java.lang.String)` was removed
* `listByCloudVmCluster(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.DbSystemShapeProperties` was modified

* `java.lang.Integer availableCoreCount()` -> `int availableCoreCount()`

#### `models.DbServers` was modified

* `listByCloudExadataInfrastructure(java.lang.String,java.lang.String)` was removed
* `listByCloudExadataInfrastructure(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.VirtualNetworkAddresses` was modified

* `listByCloudVmCluster(java.lang.String,java.lang.String)` was removed
* `listByCloudVmCluster(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.AutonomousDatabaseBackupUpdate` was modified

* `models.AutonomousDatabaseBackupUpdateProperties properties()` -> `models.AutonomousDatabaseBackupProperties properties()`
* `withProperties(models.AutonomousDatabaseBackupUpdateProperties)` was removed

#### `models.DbSystemShapes` was modified

* `listByLocation(java.lang.String,com.azure.core.util.Context)` was removed

#### `models.AutonomousDatabaseCloneProperties` was modified

* `localStandbyDb()` was removed
* `timeMaintenanceEnd()` was removed
* `privateEndpoint()` was removed
* `provisionableCpus()` was removed
* `connectionStrings()` was removed
* `timeMaintenanceBegin()` was removed
* `ocid()` was removed
* `isPreview()` was removed
* `localDisasterRecoveryType()` was removed
* `supportedRegionsToCloneTo()` was removed
* `availableUpgradeVersions()` was removed
* `timeDataGuardRoleChanged()` was removed
* `sqlWebDeveloperUrl()` was removed
* `timeLocalDataGuardEnabled()` was removed
* `timeReclamationOfFreeAutonomousDatabase()` was removed
* `timeOfLastRefreshPoint()` was removed
* `nextLongTermBackupTimestamp()` was removed
* `connectionUrls()` was removed
* `failedDataRecoveryInSeconds()` was removed
* `ociUrl()` was removed
* `operationsInsightsStatus()` was removed
* `apexDetails()` was removed
* `allocatedStorageSizeInTbs()` was removed
* `lifecycleDetails()` was removed
* `inMemoryAreaInGbs()` was removed
* `usedDataStorageSizeInTbs()` was removed
* `timeCreated()` was removed
* `dataSafeStatus()` was removed
* `actualUsedDataStorageSizeInTbs()` was removed
* `peerDbIds()` was removed
* `isRemoteDataGuardEnabled()` was removed
* `lifecycleState()` was removed
* `usedDataStorageSizeInGbs()` was removed
* `timeOfLastSwitchover()` was removed
* `timeDeletionOfFreeAutonomousDatabase()` was removed
* `serviceConsoleUrl()` was removed
* `provisioningState()` was removed
* `timeOfLastRefresh()` was removed
* `memoryPerOracleComputeUnitInGbs()` was removed
* `timeOfLastFailover()` was removed

#### `models.AutonomousDatabaseBackups` was modified

* `listByAutonomousDatabase(java.lang.String,java.lang.String)` was removed
* `listByAutonomousDatabase(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.DnsPrivateZoneProperties` was modified

* `java.lang.Integer serial()` -> `int serial()`
* `java.lang.Boolean isProtected()` -> `boolean isProtected()`

#### `models.GiVersions` was modified

* `listByLocation(java.lang.String,com.azure.core.util.Context)` was removed

#### `models.AutonomousDatabaseProperties` was modified

* `memoryPerOracleComputeUnitInGbs()` was removed
* `provisionableCpus()` was removed
* `availableUpgradeVersions()` was removed
* `inMemoryAreaInGbs()` was removed
* `sqlWebDeveloperUrl()` was removed
* `timeDeletionOfFreeAutonomousDatabase()` was removed
* `timeOfLastRefreshPoint()` was removed
* `timeMaintenanceEnd()` was removed
* `supportedRegionsToCloneTo()` was removed
* `privateEndpoint()` was removed
* `nextLongTermBackupTimestamp()` was removed
* `operationsInsightsStatus()` was removed
* `usedDataStorageSizeInGbs()` was removed
* `connectionUrls()` was removed
* `lifecycleState()` was removed
* `dataSafeStatus()` was removed
* `usedDataStorageSizeInTbs()` was removed
* `provisioningState()` was removed
* `connectionStrings()` was removed
* `timeMaintenanceBegin()` was removed
* `ociUrl()` was removed
* `serviceConsoleUrl()` was removed
* `timeCreated()` was removed
* `timeLocalDataGuardEnabled()` was removed
* `lifecycleDetails()` was removed
* `apexDetails()` was removed
* `allocatedStorageSizeInTbs()` was removed
* `timeDataGuardRoleChanged()` was removed
* `actualUsedDataStorageSizeInTbs()` was removed
* `peerDbIds()` was removed
* `localDisasterRecoveryType()` was removed
* `timeReclamationOfFreeAutonomousDatabase()` was removed
* `failedDataRecoveryInSeconds()` was removed
* `localStandbyDb()` was removed
* `isRemoteDataGuardEnabled()` was removed
* `isPreview()` was removed
* `timeOfLastFailover()` was removed
* `timeOfLastSwitchover()` was removed
* `ocid()` was removed
* `timeOfLastRefresh()` was removed

#### `models.DnsPrivateViewProperties` was modified

* `java.lang.Boolean isProtected()` -> `boolean isProtected()`

#### `models.AutonomousDatabaseBackup$Update` was modified

* `withProperties(models.AutonomousDatabaseBackupUpdateProperties)` was removed

### Features Added

* `models.DefinedFileSystemConfiguration` was added

* `models.ExadbVmClusterProperties` was added

* `models.ExascaleDbStorageVaultListResult` was added

* `models.GridImageType` was added

* `models.ExascaleDbStorageVault` was added

* `models.DbNodeDetails` was added

* `models.ExascaleDbStorageVault$UpdateStages` was added

* `models.FlexComponent` was added

* `models.FlexComponentListResult` was added

* `models.ExascaleDbStorageVaults` was added

* `models.ExascaleDbStorageDetails` was added

* `models.ExadbVmClusters` was added

* `models.AutonomousDatabaseCrossRegionDisasterRecoveryProperties` was added

* `models.RemoveVirtualMachineFromExadbVmClusterDetails` was added

* `models.FlexComponents` was added

* `models.AutonomousDatabaseFromBackupTimestampProperties` was added

* `models.AzureSubscriptions` was added

* `models.ExadbVmClusterUpdate` was added

* `models.ExascaleDbStorageVaultLifecycleState` was added

* `models.DisasterRecoveryConfigurationDetails` was added

* `models.ShapeFamily` was added

* `models.ExadbVmClusterUpdateProperties` was added

* `models.ExadbVmClusterListResult` was added

* `models.ExadbVmCluster` was added

* `models.ExadbVmCluster$UpdateStages` was added

* `models.GiMinorVersions` was added

* `models.GiMinorVersionListResult` was added

* `models.ExascaleDbStorageVault$DefinitionStages` was added

* `models.ExadbVmCluster$Definition` was added

* `models.FileSystemConfigurationDetails` was added

* `models.ExascaleDbNodeProperties` was added

* `models.SystemShapes` was added

* `models.AddSubscriptionOperationState` was added

* `models.ExadbVmClusterLifecycleState` was added

* `models.ExadbVmCluster$DefinitionStages` was added

* `models.FlexComponentProperties` was added

* `models.ExascaleDbNodes` was added

* `models.HardwareType` was added

* `models.ExascaleDbStorageVault$Definition` was added

* `models.GiMinorVersionProperties` was added

* `models.ExadbVmClusterStorageDetails` was added

* `models.ExascaleDbStorageVaultProperties` was added

* `models.ExascaleDbStorageVaultTagsUpdate` was added

* `models.DbActionResponse` was added

* `models.ExascaleDbStorageInputDetails` was added

* `models.GiMinorVersion` was added

* `models.ExascaleDbStorageVault$Update` was added

* `models.ExascaleDbNode` was added

* `models.ExascaleDbNodeListResult` was added

* `models.ExadbVmCluster$Update` was added

#### `models.DbNodeProperties` was modified

* `withBackupVnic2Id(java.lang.String)` was added
* `withAdditionalDetails(java.lang.String)` was added
* `withHostname(java.lang.String)` was added
* `withBackupIpId(java.lang.String)` was added
* `withLifecycleDetails(java.lang.String)` was added
* `withSoftwareStorageSizeInGb(java.lang.Integer)` was added
* `withVnic2Id(java.lang.String)` was added
* `withLifecycleState(models.DbNodeProvisioningState)` was added
* `withDbSystemId(java.lang.String)` was added
* `withBackupVnicId(java.lang.String)` was added
* `withHostIpId(java.lang.String)` was added
* `withCpuCoreCount(java.lang.Integer)` was added
* `withFaultDomain(java.lang.String)` was added
* `withMemorySizeInGbs(java.lang.Integer)` was added
* `withOcid(java.lang.String)` was added
* `withTimeMaintenanceWindowEnd(java.time.OffsetDateTime)` was added
* `withMaintenanceType(models.DbNodeMaintenanceType)` was added
* `withDbNodeStorageSizeInGbs(java.lang.Integer)` was added
* `withTimeCreated(java.time.OffsetDateTime)` was added
* `withTimeMaintenanceWindowStart(java.time.OffsetDateTime)` was added
* `withVnicId(java.lang.String)` was added
* `withDbServerId(java.lang.String)` was added

#### `models.CloudVmClusterProperties` was modified

* `fileSystemConfigurationDetails()` was added
* `computeModel()` was added
* `withFileSystemConfigurationDetails(java.util.List)` was added

#### `models.DbServerProperties` was modified

* `computeModel()` was added

#### `models.OracleSubscriptions` was modified

* `addAzureSubscriptions(models.AzureSubscriptions,com.azure.core.util.Context)` was added
* `addAzureSubscriptions(models.AzureSubscriptions)` was added

#### `models.SystemVersionProperties` was modified

* `withSystemVersion(java.lang.String)` was added

#### `models.DbNodes` was modified

* `listByParent(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listByParent(java.lang.String,java.lang.String)` was added

#### `models.PeerDbDetails` was modified

* `withPeerDbLocation(java.lang.String)` was added
* `peerDbLocation()` was added
* `peerDbOcid()` was added
* `withPeerDbOcid(java.lang.String)` was added

#### `models.DbSystemShapeProperties` was modified

* `withMinMemoryPerNodeInGbs(java.lang.Integer)` was added
* `withRuntimeMinimumCoreCount(java.lang.Integer)` was added
* `withMinCoreCountPerNode(java.lang.Integer)` was added
* `computeModel()` was added
* `withMinDbNodeStoragePerNodeInGbs(java.lang.Integer)` was added
* `withCoreCountIncrement(java.lang.Integer)` was added
* `withAvailableDbNodeStorageInGbs(java.lang.Integer)` was added
* `withMinDataStorageInTbs(java.lang.Integer)` was added
* `withAvailableDataStorageInTbs(java.lang.Integer)` was added
* `shapeName()` was added
* `withMaxStorageCount(java.lang.Integer)` was added
* `withAvailableCoreCount(int)` was added
* `withAvailableMemoryInGbs(java.lang.Integer)` was added
* `withAvailableCoreCountPerNode(java.lang.Integer)` was added
* `withComputeModel(models.ComputeModel)` was added
* `withMinimumNodeCount(java.lang.Integer)` was added
* `withMaximumNodeCount(java.lang.Integer)` was added
* `withAvailableMemoryPerNodeInGbs(java.lang.Integer)` was added
* `withMinStorageCount(java.lang.Integer)` was added
* `withMinimumCoreCount(java.lang.Integer)` was added
* `displayName()` was added
* `withDisplayName(java.lang.String)` was added
* `areServerTypesSupported()` was added
* `withShapeName(java.lang.String)` was added
* `withAvailableDbNodePerNodeInGbs(java.lang.Integer)` was added
* `withAreServerTypesSupported(java.lang.Boolean)` was added
* `withAvailableDataStoragePerServerInTbs(java.lang.Double)` was added
* `withShapeFamily(java.lang.String)` was added

#### `models.DbServers` was modified

* `listByParent(java.lang.String,java.lang.String)` was added
* `listByParent(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.AutonomousDatabase` was modified

* `changeDisasterRecoveryConfiguration(models.DisasterRecoveryConfigurationDetails)` was added
* `changeDisasterRecoveryConfiguration(models.DisasterRecoveryConfigurationDetails,com.azure.core.util.Context)` was added

#### `models.VirtualNetworkAddresses` was modified

* `listByParent(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listByParent(java.lang.String,java.lang.String)` was added

#### `models.AutonomousDatabaseBackupUpdate` was modified

* `id()` was added
* `systemData()` was added
* `withProperties(models.AutonomousDatabaseBackupProperties)` was added
* `type()` was added
* `name()` was added

#### `models.DbSystemShapes` was modified

* `listByLocation(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.AutonomousDatabaseBackups` was modified

* `listByParent(java.lang.String,java.lang.String)` was added
* `listByParent(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.DnsPrivateZoneProperties` was modified

* `withSerial(int)` was added
* `withViewId(java.lang.String)` was added
* `withLifecycleState(models.DnsPrivateZonesLifecycleState)` was added
* `withTimeCreated(java.time.OffsetDateTime)` was added
* `withZoneType(models.ZoneType)` was added
* `withOcid(java.lang.String)` was added
* `withVersion(java.lang.String)` was added
* `withSelf(java.lang.String)` was added
* `withIsProtected(boolean)` was added

#### `models.GiVersions` was modified

* `listByLocation(java.lang.String,models.SystemShapes,java.lang.String,com.azure.core.util.Context)` was added

#### `OracleDatabaseManager` was modified

* `giMinorVersions()` was added
* `flexComponents()` was added
* `exascaleDbNodes()` was added
* `exadbVmClusters()` was added
* `exascaleDbStorageVaults()` was added

#### `models.OracleSubscriptionProperties` was modified

* `addSubscriptionOperationState()` was added
* `azureSubscriptionIds()` was added
* `lastOperationStatusDetail()` was added

#### `models.CloudExadataInfrastructureProperties` was modified

* `databaseServerType()` was added
* `withStorageServerType(java.lang.String)` was added
* `computeModel()` was added
* `definedFileSystemConfiguration()` was added
* `storageServerType()` was added
* `withDatabaseServerType(java.lang.String)` was added

#### `models.AutonomousDbVersionProperties` was modified

* `withIsDefaultForPaid(java.lang.Boolean)` was added
* `withIsFreeTierEnabled(java.lang.Boolean)` was added
* `withVersion(java.lang.String)` was added
* `withIsPaidEnabled(java.lang.Boolean)` was added
* `withDbWorkload(models.WorkloadType)` was added
* `withIsDefaultForFree(java.lang.Boolean)` was added

#### `models.AutonomousDatabases` was modified

* `changeDisasterRecoveryConfiguration(java.lang.String,java.lang.String,models.DisasterRecoveryConfigurationDetails,com.azure.core.util.Context)` was added
* `changeDisasterRecoveryConfiguration(java.lang.String,java.lang.String,models.DisasterRecoveryConfigurationDetails)` was added

#### `models.AutonomousDatabaseCharacterSetProperties` was modified

* `withCharacterSet(java.lang.String)` was added

#### `models.AutonomousDatabaseNationalCharacterSetProperties` was modified

* `withCharacterSet(java.lang.String)` was added

#### `models.AutonomousDatabaseBaseProperties` was modified

* `remoteDisasterRecoveryConfiguration()` was added
* `timeDisasterRecoveryRoleChanged()` was added

#### `models.DnsPrivateViewProperties` was modified

* `withIsProtected(boolean)` was added
* `withTimeUpdated(java.time.OffsetDateTime)` was added
* `withLifecycleState(models.DnsPrivateViewsLifecycleState)` was added
* `withSelf(java.lang.String)` was added
* `withDisplayName(java.lang.String)` was added
* `withOcid(java.lang.String)` was added
* `withTimeCreated(java.time.OffsetDateTime)` was added

#### `models.CloudVmClusterUpdateProperties` was modified

* `fileSystemConfigurationDetails()` was added
* `withFileSystemConfigurationDetails(java.util.List)` was added

#### `models.AutonomousDatabaseBackup$Update` was modified

* `withProperties(models.AutonomousDatabaseBackupProperties)` was added

#### `models.GiVersionProperties` was modified

* `withVersion(java.lang.String)` was added

## 1.0.0 (2024-07-04)

- Azure Resource Manager OracleDatabase client library for Java. This package contains Microsoft Azure SDK for OracleDatabase Management SDK.  Package tag package-2023-09-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.DbSystemShapeProperties` was modified

* `int availableCoreCount()` -> `java.lang.Integer availableCoreCount()`

#### `models.DnsPrivateZoneProperties` was modified

* `boolean isProtected()` -> `java.lang.Boolean isProtected()`
* `int serial()` -> `java.lang.Integer serial()`

#### `models.DnsPrivateViewProperties` was modified

* `boolean isProtected()` -> `java.lang.Boolean isProtected()`

## 1.0.0-beta.2 (2024-06-26)

- Azure Resource Manager OracleDatabase client library for Java. This package contains Microsoft Azure SDK for OracleDatabase Management SDK.  Package tag package-2023-09-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.ResourcePlanTypeUpdate` was removed

#### `models.DnsPrivateZoneListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.GiVersionListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.VirtualNetworkAddressListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.DbServerListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.AutonomousDbVersionListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.AutonomousDatabaseListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.OracleSubscriptionUpdate` was modified

* `withPlan(models.ResourcePlanTypeUpdate)` was removed
* `models.ResourcePlanTypeUpdate plan()` -> `models.PlanUpdate plan()`

#### `models.DbNodeListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.DnsPrivateViewListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.AutonomousDatabaseCharacterSetListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.CloudExadataInfrastructureProperties` was modified

* `java.lang.Integer dataStorageSizeInTbs()` -> `java.lang.Double dataStorageSizeInTbs()`

#### `models.AutonomousDatabaseBackupListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.DbSystemShapeListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.CloudVmClusterListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.AutonomousDatabaseNationalCharacterSetListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.OracleSubscriptionListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.CloudExadataInfrastructureListResult` was modified

* `withValue(java.util.List)` was removed

#### `models.AutonomousDatabaseBackupProperties` was modified

* `databaseSizeInTBs()` was removed
* `sizeInTBs()` was removed
* `type()` was removed
* `autonomousDatabaseId()` was removed

### Features Added

* `models.PlanUpdate` was added

* `models.SystemVersionProperties` was added

* `models.LongTermBackUpScheduleDetails` was added

* `models.SystemVersions` was added

* `models.SystemVersionListResult` was added

* `models.RepeatCadenceType` was added

* `models.SystemVersion` was added

* `models.RestoreAutonomousDatabaseDetails` was added

#### `models.OracleSubscriptionUpdateProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AllConnectionStringType` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DbNodeProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CloudVmClusterProperties` was modified

* `withSystemVersion(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DayOfWeek` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Month` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DbServerProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProfileType` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DnsPrivateZoneListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.GiVersionListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VirtualNetworkAddressListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NsgCidr` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AddRemoveDbNode` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeerDbDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DbSystemShapeProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApexDetailsType` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AutonomousDatabase` was modified

* `restore(models.RestoreAutonomousDatabaseDetails,com.azure.core.util.Context)` was added
* `restore(models.RestoreAutonomousDatabaseDetails)` was added
* `shrink()` was added
* `shrink(com.azure.core.util.Context)` was added

#### `models.DbServerListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDbVersionListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CloudExadataInfrastructureUpdateProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.GenerateAutonomousDatabaseWalletDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDatabaseBackupUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VirtualNetworkAddressProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CloudVmClusterUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PortRange` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AutonomousDatabaseCloneProperties` was modified

* `peerDbIds()` was added
* `connectionUrls()` was added
* `provisionableCpus()` was added
* `failedDataRecoveryInSeconds()` was added
* `ocid()` was added
* `allocatedStorageSizeInTbs()` was added
* `isRemoteDataGuardEnabled()` was added
* `timeReclamationOfFreeAutonomousDatabase()` was added
* `withLongTermBackupSchedule(models.LongTermBackUpScheduleDetails)` was added
* `memoryPerOracleComputeUnitInGbs()` was added
* `inMemoryAreaInGbs()` was added
* `actualUsedDataStorageSizeInTbs()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `ociUrl()` was added
* `timeMaintenanceBegin()` was added
* `lifecycleState()` was added
* `nextLongTermBackupTimestamp()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `dataSafeStatus()` was added
* `sqlWebDeveloperUrl()` was added
* `timeCreated()` was added
* `timeOfLastRefresh()` was added
* `apexDetails()` was added
* `operationsInsightsStatus()` was added
* `serviceConsoleUrl()` was added
* `timeLocalDataGuardEnabled()` was added
* `usedDataStorageSizeInGbs()` was added
* `usedDataStorageSizeInTbs()` was added
* `localStandbyDb()` was added
* `timeDeletionOfFreeAutonomousDatabase()` was added
* `privateEndpoint()` was added
* `isPreview()` was added
* `timeOfLastSwitchover()` was added
* `timeOfLastRefreshPoint()` was added
* `timeDataGuardRoleChanged()` was added
* `connectionStrings()` was added
* `timeOfLastFailover()` was added
* `localDisasterRecoveryType()` was added
* `timeMaintenanceEnd()` was added
* `provisioningState()` was added
* `supportedRegionsToCloneTo()` was added
* `availableUpgradeVersions()` was added
* `lifecycleDetails()` was added

#### `models.AutonomousDatabaseListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OracleSubscriptionUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withPlan(models.PlanUpdate)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExadataIormConfig` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DbNodeListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DnsPrivateZoneProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AutonomousDatabaseUpdateProperties` was modified

* `withLongTermBackupSchedule(models.LongTermBackUpScheduleDetails)` was added
* `longTermBackupSchedule()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDatabaseBackupUpdateProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EstimatedPatchingTime` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDatabaseUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DnsPrivateViewListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CloudExadataInfrastructureUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AutonomousDatabaseCharacterSetListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `OracleDatabaseManager` was modified

* `systemVersions()` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ScheduledOperationsType` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DbNodeAction` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OracleSubscriptionProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CloudExadataInfrastructureProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDbVersionProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DayOfWeekUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDatabases` was modified

* `shrink(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `shrink(java.lang.String,java.lang.String)` was added
* `restore(java.lang.String,java.lang.String,models.RestoreAutonomousDatabaseDetails,com.azure.core.util.Context)` was added
* `restore(java.lang.String,java.lang.String,models.RestoreAutonomousDatabaseDetails)` was added

#### `models.AutonomousDatabaseCharacterSetProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDatabaseNationalCharacterSetProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDatabaseBackupListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DbSystemShapeListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Plan` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AutonomousDatabaseBaseProperties` was modified

* `longTermBackupSchedule()` was added
* `nextLongTermBackupTimestamp()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withLongTermBackupSchedule(models.LongTermBackUpScheduleDetails)` was added

#### `models.DbIormConfig` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CloudVmClusterListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ConnectionUrlType` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DbServerPatchingDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CustomerContact` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDatabaseProperties` was modified

* `memoryPerOracleComputeUnitInGbs()` was added
* `failedDataRecoveryInSeconds()` was added
* `connectionStrings()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `timeOfLastFailover()` was added
* `allocatedStorageSizeInTbs()` was added
* `provisioningState()` was added
* `peerDbIds()` was added
* `timeOfLastRefreshPoint()` was added
* `isPreview()` was added
* `timeReclamationOfFreeAutonomousDatabase()` was added
* `provisionableCpus()` was added
* `usedDataStorageSizeInGbs()` was added
* `lifecycleState()` was added
* `serviceConsoleUrl()` was added
* `operationsInsightsStatus()` was added
* `ociUrl()` was added
* `timeMaintenanceEnd()` was added
* `actualUsedDataStorageSizeInTbs()` was added
* `localDisasterRecoveryType()` was added
* `timeCreated()` was added
* `timeDataGuardRoleChanged()` was added
* `lifecycleDetails()` was added
* `nextLongTermBackupTimestamp()` was added
* `timeMaintenanceBegin()` was added
* `sqlWebDeveloperUrl()` was added
* `connectionUrls()` was added
* `timeLocalDataGuardEnabled()` was added
* `apexDetails()` was added
* `timeDeletionOfFreeAutonomousDatabase()` was added
* `timeOfLastSwitchover()` was added
* `ocid()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withLongTermBackupSchedule(models.LongTermBackUpScheduleDetails)` was added
* `isRemoteDataGuardEnabled()` was added
* `availableUpgradeVersions()` was added
* `privateEndpoint()` was added
* `inMemoryAreaInGbs()` was added
* `dataSafeStatus()` was added
* `timeOfLastRefresh()` was added
* `usedDataStorageSizeInTbs()` was added
* `supportedRegionsToCloneTo()` was added
* `localStandbyDb()` was added

#### `models.DnsPrivateViewProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDatabaseStandbySummary` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ConnectionStringType` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDatabaseNationalCharacterSetListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CloudVmClusterUpdateProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OracleSubscriptionListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrivateIpAddressesFilter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VirtualNetworkAddress$Update` was modified

* `withProperties(models.VirtualNetworkAddressProperties)` was added

#### `models.DataCollectionOptions` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MaintenanceWindow` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CloudExadataInfrastructureListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutonomousDatabaseBackupProperties` was modified

* `databaseSizeInTbs()` was added
* `timeStarted()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `autonomousDatabaseOcid()` was added
* `sizeInTbs()` was added
* `backupType()` was added

#### `models.ScheduledOperationsTypeUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.GiVersionProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0-beta.1 (2024-05-28)

- Azure Resource Manager OracleDatabase client library for Java. This package contains Microsoft Azure SDK for OracleDatabase Management SDK.  Package tag package-2023-09-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
