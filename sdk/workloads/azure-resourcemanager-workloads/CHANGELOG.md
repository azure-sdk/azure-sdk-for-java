# Release History

## 1.0.0-beta.1 (2024-11-03)

- Azure Resource Manager Workloads client library for Java. This package contains Microsoft Azure SDK for Workloads Management SDK. Workloads client provides access to various workload operations. Package tag package-2023-04. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.VirtualMachineResourceNames` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ServiceInitiatedSoftwareConfiguration` was modified

* `softwareInstallationType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProviderSpecificProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `providerType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DatabaseServerFullResourceNames` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DeployerVmPackages` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DiscoveryConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `configurationType()` was added

#### `models.SshPublicKey` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationsDisplayDefinition` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SoftwareConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `softwareInstallationType()` was added

#### `models.ProviderInstancePropertiesErrors` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `message()` was added
* `target()` was added
* `innerError()` was added
* `details()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `code()` was added

#### `models.UserAssignedServiceIdentity` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiskVolumeConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SshKeyPair` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OSConfiguration` was modified

* `osType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapVirtualInstanceError` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Error` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DeploymentWithOSConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `configurationType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateSapCentralInstanceRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapVirtualInstanceList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SingleServerCustomResourceNames` was modified

* `namingPatternType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.StopRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MessageServerProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapCentralInstanceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateSapDatabaseInstanceRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SingleServerRecommendationResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `deploymentType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapDatabaseInstanceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapDiskConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SkipFileShareConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `configurationType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OsSapConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EnqueueServerProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LoadBalancerDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ThreeTierConfiguration` was modified

* `deploymentType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.EnqueueReplicationServerProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapLandscapeMonitorPropertiesGrouping` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExternalInstallationSoftwareConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `softwareInstallationType()` was added

#### `models.SapNetWeaverProviderInstanceProperties` was modified

* `providerType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SapLandscapeMonitorSidMapping` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HighAvailabilitySoftwareConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HighAvailabilityConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CentralServerVmDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApplicationServerFullResourceNames` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CentralServerFullResourceNames` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SapAvailabilityZoneDetailsRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.LinuxConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `osType()` was added

#### `models.MonitorPropertiesErrors` was modified

* `message()` was added
* `code()` was added
* `details()` was added
* `innerError()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `target()` was added

#### `models.DeploymentConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `configurationType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProviderInstanceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateMonitorRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NetworkConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DB2ProviderInstanceProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `providerType()` was added

#### `models.SapDiskConfigurationsRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SapApplicationServerInstanceList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SingleServerConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `deploymentType()` was added

#### `models.ImageReference` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateSapVirtualInstanceRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrometheusHaClusterProviderInstanceProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `providerType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CreateAndMountFileShareConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `configurationType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.GatewayServerProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OSProfile` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MsSqlServerProviderInstanceProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `providerType()` was added

#### `models.SapSupportedSku` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NetworkInterfaceResourceNames` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ErrorInnerError` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationDisplay` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SshConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SapSizingRecommendationRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DatabaseVmDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WindowsConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `osType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StorageInformation` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ThreeTierCustomResourceNames` was modified

* `namingPatternType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateSapApplicationInstanceRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MonitorListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApplicationServerConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DiskSku` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SharedStorageResourceNames` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LoadBalancerResourceNames` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ErrorDefinition` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrometheusOSProviderInstanceProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `providerType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.StorageConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CentralServerConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapLandscapeMonitorMetricThresholds` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationsDefinitionDisplay` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ThreeTierRecommendationResult` was modified

* `deploymentType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HanaDbProviderInstanceProperties` was modified

* `providerType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ThreeTierFullResourceNames` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `namingPatternType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.InfrastructureConfiguration` was modified

* `deploymentType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiskConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `configurationType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ManagedRGConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MountFileShareConfiguration` was modified

* `configurationType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VirtualMachineConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FileShareConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `configurationType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SapAvailabilityZonePair` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApplicationServerVmDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SingleServerFullResourceNames` was modified

* `namingPatternType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapSizingRecommendationResult` was modified

* `deploymentType()` was added

#### `models.UserAssignedIdentity` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapSupportedSkusRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DatabaseConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapInstallWithoutOSConfigSoftwareConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `softwareInstallationType()` was added

## 1.0.0 (2023-04-17)

- Azure Resource Manager Workloads client library for Java. This package contains Microsoft Azure SDK for Workloads Management SDK. Workloads client provides access to various workload operations.<br>Azure Center for SAP solutions is currently in PREVIEW. See the [Azure Center for SAP solutions - Legal Terms](https://learn.microsoft.com/legal/azure-center-for-sap-solutions/azure-center-for-sap-solutions-legal-terms) for legal notices applicable to Azure Center for SAP solutions. Package tag package-2023-04. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.ImageReference` was modified

* `withSharedGalleryImageId(java.lang.String)` was removed
* `sharedGalleryImageId()` was removed
* `exactVersion()` was removed

## 1.0.0-beta.2 (2023-02-07)

- Azure Resource Manager Workloads client library for Java. This package contains Microsoft Azure SDK for Workloads Management SDK. Workloads client provides access to various workload operations. Package tag package-preview-2022-11. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.UserProfile` was removed

* `models.NodeProfile` was removed

* `models.NetworkProfile` was removed

* `models.PhpWorkloadProvisioningState` was removed

* `models.SkuCost` was removed

* `models.WordpressVersions` was removed

* `models.DatabaseTier` was removed

* `models.OSImagePublisher` was removed

* `models.RedisCacheFamily` was removed

* `models.PhpWorkloads` was removed

* `models.OSImageSku` was removed

* `models.SearchType` was removed

* `models.PhpWorkloadResource$DefinitionStages` was removed

* `models.SiteProfile` was removed

* `models.VmssNodesProfile` was removed

* `models.WorkloadKind` was removed

* `models.LoadBalancerType` was removed

* `models.SkuRestrictionReasonCode` was removed

* `models.EnableSslEnforcement` was removed

* `models.BackupProfile` was removed

* `models.ApplicationProvisioningState` was removed

* `models.PhpWorkloadResource$Definition` was removed

* `models.HAEnabled` was removed

* `models.SkuRestriction` was removed

* `models.DatabaseProfile` was removed

* `models.WordpressInstances` was removed

* `models.SkusListResult` was removed

* `models.DiskInfo` was removed

* `models.WordpressInstanceResourceList` was removed

* `models.SkuZoneDetail` was removed

* `models.LocationType` was removed

* `models.SkuLocationAndZones` was removed

* `models.FileshareProfile` was removed

* `models.PhpProfile` was removed

* `models.FileShareType` was removed

* `models.Sku` was removed

* `models.OSImageVersion` was removed

* `models.OsImageProfile` was removed

* `models.DiskStorageType` was removed

* `models.CacheProfile` was removed

* `models.PhpWorkloadResource` was removed

* `models.AzureFrontDoorEnabled` was removed

* `models.PhpWorkloadResource$UpdateStages` was removed

* `models.DatabaseType` was removed

* `models.PhpWorkloadResource$Update` was removed

* `models.PatchResourceRequestBodyIdentity` was removed

* `models.OSImageOffer` was removed

* `models.SkuDefinition` was removed

* `models.PhpVersion` was removed

* `models.PhpWorkloadResourceList` was removed

* `models.PhpWorkloadResourceIdentity` was removed

* `models.SkuCapability` was removed

* `models.SkuTier` was removed

* `models.PatchResourceRequestBody` was removed

* `models.SearchProfile` was removed

* `models.SkuRestrictionType` was removed

* `models.FileShareStorageType` was removed

* `models.WordpressInstanceResource` was removed

* `models.EnableBackup` was removed

* `models.Skus` was removed

#### `models.SapApplicationServerInstance` was modified

* `virtualMachineId()` was removed

#### `models.StopRequest` was modified

* `hardStop()` was removed
* `withHardStop(java.lang.Boolean)` was removed

#### `models.SapDiskConfiguration` was modified

* `withDiskSizeGB(java.lang.Long)` was removed
* `diskCount()` was removed
* `diskType()` was removed
* `volume()` was removed
* `withDiskIopsReadWrite(java.lang.Long)` was removed
* `diskIopsReadWrite()` was removed
* `diskMBpsReadWrite()` was removed
* `withDiskType(java.lang.String)` was removed
* `diskStorageType()` was removed
* `withVolume(java.lang.String)` was removed
* `diskSizeGB()` was removed
* `withDiskStorageType(java.lang.String)` was removed
* `withDiskCount(java.lang.Long)` was removed
* `withDiskMBpsReadWrite(java.lang.Long)` was removed

#### `WorkloadsManager` was modified

* `wordpressInstances()` was removed
* `skus()` was removed
* `phpWorkloads()` was removed

#### `models.SapNetWeaverProviderInstanceProperties` was modified

* `sapSslCertificateUri()` was removed
* `withSapSslCertificateUri(java.lang.String)` was removed

#### `models.SapDiskConfigurationsResult` was modified

* `diskConfigurations()` was removed

#### `models.SapVirtualInstances` was modified

* `stop(java.lang.String,java.lang.String,models.StopRequest)` was removed

#### `models.SapVirtualInstance` was modified

* `stop(models.StopRequest)` was removed

#### `models.HanaDbProviderInstanceProperties` was modified

* `dbSslCertificateUri()` was removed
* `withDbSslCertificateUri(java.lang.String)` was removed

### Features Added

* `models.DiskSkuName` was added

* `models.SapLandscapeMonitorListResult` was added

* `models.VirtualMachineResourceNames` was added

* `models.DatabaseServerFullResourceNames` was added

* `models.SapLandscapeMonitors` was added

* `models.DiskVolumeConfiguration` was added

* `models.SingleServerCustomResourceNames` was added

* `models.ConfigurationType` was added

* `models.ApplicationServerVirtualMachineType` was added

* `models.SkipFileShareConfiguration` was added

* `models.LoadBalancerDetails` was added

* `models.SapLandscapeMonitorPropertiesGrouping` was added

* `models.ExternalInstallationSoftwareConfiguration` was added

* `models.SapLandscapeMonitorSidMapping` was added

* `models.ApplicationServerFullResourceNames` was added

* `models.DiskDetails` was added

* `models.CentralServerFullResourceNames` was added

* `models.SslPreference` was added

* `models.NamingPatternType` was added

* `models.CreateAndMountFileShareConfiguration` was added

* `models.NetworkInterfaceResourceNames` was added

* `models.StorageInformation` was added

* `models.ThreeTierCustomResourceNames` was added

* `models.DiskSku` was added

* `models.SharedStorageResourceNames` was added

* `models.LoadBalancerResourceNames` was added

* `models.StorageConfiguration` was added

* `models.SapLandscapeMonitorMetricThresholds` was added

* `models.SapLandscapeMonitorProvisioningState` was added

* `models.ThreeTierFullResourceNames` was added

* `models.DiskConfiguration` was added

* `models.MountFileShareConfiguration` was added

* `models.FileShareConfiguration` was added

* `models.ApplicationServerVmDetails` was added

* `models.SingleServerFullResourceNames` was added

* `models.SapLandscapeMonitor` was added

#### `models.SapCentralServerInstance` was modified

* `stopInstance(models.StopRequest,com.azure.core.util.Context)` was added
* `loadBalancerDetails()` was added
* `stopInstance()` was added
* `startInstance(com.azure.core.util.Context)` was added
* `startInstance()` was added

#### `models.Monitor` was modified

* `storageAccountArmId()` was added
* `zoneRedundancyPreference()` was added

#### `models.DiscoveryConfiguration` was modified

* `managedRgStorageAccountName()` was added
* `withManagedRgStorageAccountName(java.lang.String)` was added

#### `models.SapApplicationServerInstance` was modified

* `vmDetails()` was added
* `stopInstance(models.StopRequest,com.azure.core.util.Context)` was added
* `startInstance(com.azure.core.util.Context)` was added
* `stopInstance()` was added
* `startInstance()` was added
* `loadBalancerDetails()` was added

#### `models.StopRequest` was modified

* `softStopTimeoutSeconds()` was added
* `withSoftStopTimeoutSeconds(java.lang.Long)` was added

#### `models.SapDiskConfiguration` was modified

* `recommendedConfiguration()` was added
* `withRecommendedConfiguration(models.DiskVolumeConfiguration)` was added
* `withSupportedConfigurations(java.util.List)` was added
* `supportedConfigurations()` was added

#### `models.ThreeTierConfiguration` was modified

* `customResourceNames()` was added
* `withStorageConfiguration(models.StorageConfiguration)` was added
* `withCustomResourceNames(models.ThreeTierCustomResourceNames)` was added
* `storageConfiguration()` was added

#### `WorkloadsManager` was modified

* `sapLandscapeMonitors()` was added

#### `models.SapDatabaseInstances` was modified

* `stopInstance(java.lang.String,java.lang.String,java.lang.String,models.StopRequest,com.azure.core.util.Context)` was added
* `stopInstance(java.lang.String,java.lang.String,java.lang.String)` was added
* `startInstance(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `startInstance(java.lang.String,java.lang.String,java.lang.String)` was added

#### `models.SapNetWeaverProviderInstanceProperties` was modified

* `withSslPreference(models.SslPreference)` was added
* `withSslCertificateUri(java.lang.String)` was added
* `sslCertificateUri()` was added
* `sslPreference()` was added

#### `models.CentralServerVmDetails` was modified

* `storageDetails()` was added

#### `models.SapDiskConfigurationsResult` was modified

* `volumeConfigurations()` was added

#### `models.DB2ProviderInstanceProperties` was modified

* `withSslPreference(models.SslPreference)` was added
* `sslPreference()` was added
* `sslCertificateUri()` was added
* `withSslCertificateUri(java.lang.String)` was added

#### `models.SingleServerConfiguration` was modified

* `withCustomResourceNames(models.SingleServerCustomResourceNames)` was added
* `dbDiskConfiguration()` was added
* `withDbDiskConfiguration(models.DiskConfiguration)` was added
* `customResourceNames()` was added

#### `models.PrometheusHaClusterProviderInstanceProperties` was modified

* `withSslPreference(models.SslPreference)` was added
* `sslPreference()` was added
* `withSslCertificateUri(java.lang.String)` was added
* `sslCertificateUri()` was added

#### `models.MsSqlServerProviderInstanceProperties` was modified

* `sslPreference()` was added
* `withSslPreference(models.SslPreference)` was added
* `sslCertificateUri()` was added
* `withSslCertificateUri(java.lang.String)` was added

#### `models.DatabaseVmDetails` was modified

* `storageDetails()` was added

#### `models.SapApplicationServerInstances` was modified

* `startInstance(java.lang.String,java.lang.String,java.lang.String)` was added
* `stopInstance(java.lang.String,java.lang.String,java.lang.String,models.StopRequest,com.azure.core.util.Context)` was added
* `stopInstance(java.lang.String,java.lang.String,java.lang.String)` was added
* `startInstance(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.PrometheusOSProviderInstanceProperties` was modified

* `sapSid()` was added
* `sslCertificateUri()` was added
* `sslPreference()` was added
* `withSslPreference(models.SslPreference)` was added
* `withSapSid(java.lang.String)` was added
* `withSslCertificateUri(java.lang.String)` was added

#### `models.HanaDbProviderInstanceProperties` was modified

* `sslPreference()` was added
* `withSapSid(java.lang.String)` was added
* `withSslPreference(models.SslPreference)` was added
* `sslCertificateUri()` was added
* `withSslCertificateUri(java.lang.String)` was added
* `sapSid()` was added

#### `models.SapDatabaseInstance` was modified

* `loadBalancerDetails()` was added
* `startInstance()` was added
* `stopInstance(models.StopRequest,com.azure.core.util.Context)` was added
* `stopInstance()` was added
* `startInstance(com.azure.core.util.Context)` was added

#### `models.Monitor$Definition` was modified

* `withZoneRedundancyPreference(java.lang.String)` was added

#### `models.SapCentralInstances` was modified

* `startInstance(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `stopInstance(java.lang.String,java.lang.String,java.lang.String)` was added
* `stopInstance(java.lang.String,java.lang.String,java.lang.String,models.StopRequest,com.azure.core.util.Context)` was added
* `startInstance(java.lang.String,java.lang.String,java.lang.String)` was added

#### `models.DatabaseConfiguration` was modified

* `diskConfiguration()` was added
* `withDiskConfiguration(models.DiskConfiguration)` was added

## 1.0.0-beta.1 (2022-06-30)

- Azure Resource Manager Workloads client library for Java. This package contains Microsoft Azure SDK for Workloads Management SDK. Workloads client provides access to various workload operations. Package tag package-2021-12-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

