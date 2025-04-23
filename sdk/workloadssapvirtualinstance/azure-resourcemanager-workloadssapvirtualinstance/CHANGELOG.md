# Release History

## 1.0.0-beta.1 (2025-04-23)

- Azure Resource Manager Workloads Sap Virtual Instance client library for Java. This package contains Microsoft Azure SDK for Workloads Sap Virtual Instance Management SDK. Workloads client provides access to various workload operations. Package tag package-2024-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `implementation.models.SAPDatabaseInstanceListResult` was removed

#### `implementation.models.SAPApplicationServerInstanceListResult` was removed

#### `models.SAPVirtualInstanceIdentity` was removed

#### `implementation.models.OperationListResult` was removed

#### `models.SAPVirtualInstanceIdentityType` was removed

#### `implementation.models.SAPCentralServerInstanceListResult` was removed

#### `implementation.models.SAPVirtualInstanceListResult` was removed

#### `models.SapVirtualInstance` was modified

* `models.SAPVirtualInstanceIdentity identity()` -> `models.SapVirtualInstanceIdentity identity()`

#### `models.OperationStatusResult` was modified

* `java.lang.Double percentComplete()` -> `java.lang.Float percentComplete()`

#### `models.SapVirtualInstance$Definition` was modified

* `withIdentity(models.SAPVirtualInstanceIdentity)` was removed

#### `models.SapVirtualInstances` was modified

* `getSizingRecommendationsWithResponse(java.lang.String,models.SapSizingRecommendationRequest,com.azure.core.util.Context)` was removed
* `getSizingRecommendations(java.lang.String,models.SapSizingRecommendationRequest)` was removed
* `getDiskConfigurationsWithResponse(java.lang.String,models.SapDiskConfigurationsRequest,com.azure.core.util.Context)` was removed
* `getSapSupportedSku(java.lang.String,models.SapSupportedSkusRequest)` was removed
* `getAvailabilityZoneDetails(java.lang.String,models.SapAvailabilityZoneDetailsRequest)` was removed
* `getSapSupportedSkuWithResponse(java.lang.String,models.SapSupportedSkusRequest,com.azure.core.util.Context)` was removed
* `getAvailabilityZoneDetailsWithResponse(java.lang.String,models.SapAvailabilityZoneDetailsRequest,com.azure.core.util.Context)` was removed
* `getDiskConfigurations(java.lang.String,models.SapDiskConfigurationsRequest)` was removed

#### `models.SapVirtualInstance$Update` was modified

* `withIdentity(models.SAPVirtualInstanceIdentity)` was removed

#### `models.UserAssignedIdentity` was modified

* `java.lang.String clientId()` -> `java.util.UUID clientId()`
* `java.lang.String principalId()` -> `java.util.UUID principalId()`

#### `models.UpdateSapVirtualInstanceRequest` was modified

* `models.SAPVirtualInstanceIdentity identity()` -> `models.SapVirtualInstanceIdentity identity()`
* `withIdentity(models.SAPVirtualInstanceIdentity)` was removed

#### `models.VirtualMachineResourceNames` was modified

* `hostName()` was removed
* `withHostName(java.lang.String)` was removed

#### `WorkloadsSapVirtualInstanceManager` was modified

* `fluent.WorkloadsSapVirtualInstanceMgmtClient serviceClient()` -> `fluent.WorkloadsClient serviceClient()`

### Features Added

* `models.SapCentralServerInstanceListResult` was added

* `models.SapApplicationServerInstanceListResult` was added

* `models.OperationListResult` was added

* `models.SapVirtualInstanceIdentityType` was added

* `models.SapVirtualInstanceIdentity` was added

* `models.SapDatabaseInstanceListResult` was added

* `models.SapVirtualInstanceListResult` was added

* `models.SapVirtualInstanceIdentityUserAssignedIdentities` was added

#### `models.SingleServerRecommendationResult` was modified

* `withVmSku(java.lang.String)` was added

#### `models.DiskDetails` was modified

* `withSizeGB(java.lang.Long)` was added
* `withDiskTier(java.lang.String)` was added
* `withIopsReadWrite(java.lang.Long)` was added
* `withMaximumSupportedDiskCount(java.lang.Long)` was added
* `withMbpsReadWrite(java.lang.Long)` was added
* `withMinimumSupportedDiskCount(java.lang.Long)` was added
* `withSku(models.DiskSku)` was added

#### `models.SapSupportedSku` was modified

* `withIsAppServerCertified(java.lang.Boolean)` was added
* `withIsDatabaseCertified(java.lang.Boolean)` was added
* `withVmSku(java.lang.String)` was added

#### `models.SapVirtualInstance$Definition` was modified

* `withIdentity(models.SapVirtualInstanceIdentity)` was added

#### `models.SapVirtualInstances` was modified

* `invokeAvailabilityZoneDetails(java.lang.String,models.SapAvailabilityZoneDetailsRequest)` was added
* `invokeAvailabilityZoneDetailsWithResponse(java.lang.String,models.SapAvailabilityZoneDetailsRequest,com.azure.core.util.Context)` was added
* `invokeSizingRecommendations(java.lang.String,models.SapSizingRecommendationRequest)` was added
* `invokeDiskConfigurations(java.lang.String,models.SapDiskConfigurationsRequest)` was added
* `invokeDiskConfigurationsWithResponse(java.lang.String,models.SapDiskConfigurationsRequest,com.azure.core.util.Context)` was added
* `invokeSapSupportedSku(java.lang.String,models.SapSupportedSkusRequest)` was added
* `invokeSizingRecommendationsWithResponse(java.lang.String,models.SapSizingRecommendationRequest,com.azure.core.util.Context)` was added
* `invokeSapSupportedSkuWithResponse(java.lang.String,models.SapSupportedSkusRequest,com.azure.core.util.Context)` was added

#### `models.SapVirtualInstanceError` was modified

* `withProperties(models.ErrorDefinition)` was added

#### `models.SapVirtualInstance$Update` was modified

* `withIdentity(models.SapVirtualInstanceIdentity)` was added

#### `models.UpdateSapVirtualInstanceRequest` was modified

* `withIdentity(models.SapVirtualInstanceIdentity)` was added

#### `models.ThreeTierRecommendationResult` was modified

* `withApplicationServerInstanceCount(java.lang.Long)` was added
* `withApplicationServerVmSku(java.lang.String)` was added
* `withDatabaseInstanceCount(java.lang.Long)` was added
* `withCentralServerVmSku(java.lang.String)` was added
* `withDbVmSku(java.lang.String)` was added
* `withCentralServerInstanceCount(java.lang.Long)` was added

#### `models.VirtualMachineResourceNames` was modified

* `hostname()` was added
* `withHostname(java.lang.String)` was added

#### `models.SapAvailabilityZonePair` was modified

* `withZoneA(java.lang.Long)` was added
* `withZoneB(java.lang.Long)` was added

#### `models.SapDiskConfiguration` was modified

* `withRecommendedConfiguration(models.DiskVolumeConfiguration)` was added
* `withSupportedConfigurations(java.util.List)` was added

## 1.0.0 (2025-04-18)

- Azure Resource Manager Workloads Sap Virtual Instance client library for Java. This package contains Microsoft Azure SDK for Workloads Sap Virtual Instance Management SDK. Workloads client provides access to various workload operations. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.SapCentralInstances` was removed

#### `models.ConfigurationType` was removed

#### `models.ResourceProviders` was removed

#### `models.SapVirtualInstanceList` was removed

#### `models.OperationListResult` was removed

#### `models.SapDatabaseInstanceList` was removed

#### `models.UserAssignedServiceIdentity` was removed

#### `models.SapApplicationServerInstanceList` was removed

#### `models.ManagedServiceIdentityType` was removed

#### `models.SapCentralInstanceList` was removed

#### `models.SapCentralServerInstance` was modified

* `startInstance(models.StartRequest,com.azure.core.util.Context)` was removed
* `stopInstance()` was removed
* `startInstance()` was removed
* `stopInstance(models.StopRequest,com.azure.core.util.Context)` was removed

#### `models.SingleServerRecommendationResult` was modified

* `withVmSku(java.lang.String)` was removed

#### `models.SapVirtualInstance` was modified

* `models.UserAssignedServiceIdentity identity()` -> `models.SAPVirtualInstanceIdentity identity()`

#### `models.DiskDetails` was modified

* `withSizeGB(java.lang.Long)` was removed
* `withIopsReadWrite(java.lang.Long)` was removed
* `withMinimumSupportedDiskCount(java.lang.Long)` was removed
* `withSku(models.DiskSku)` was removed
* `withMaximumSupportedDiskCount(java.lang.Long)` was removed
* `withDiskTier(java.lang.String)` was removed
* `withMbpsReadWrite(java.lang.Long)` was removed

#### `models.SapApplicationServerInstances` was modified

* `stopInstance(java.lang.String,java.lang.String,java.lang.String,models.StopRequest,com.azure.core.util.Context)` was removed
* `startInstance(java.lang.String,java.lang.String,java.lang.String,models.StartRequest,com.azure.core.util.Context)` was removed
* `stopInstance(java.lang.String,java.lang.String,java.lang.String)` was removed
* `startInstance(java.lang.String,java.lang.String,java.lang.String)` was removed

#### `models.OperationStatusResult` was modified

* `java.lang.Float percentComplete()` -> `java.lang.Double percentComplete()`

#### `models.SapSupportedSku` was modified

* `withIsAppServerCertified(java.lang.Boolean)` was removed
* `withVmSku(java.lang.String)` was removed
* `withIsDatabaseCertified(java.lang.Boolean)` was removed

#### `models.SapApplicationServerInstance` was modified

* `startInstance(models.StartRequest,com.azure.core.util.Context)` was removed
* `startInstance()` was removed
* `stopInstance(models.StopRequest,com.azure.core.util.Context)` was removed
* `stopInstance()` was removed

#### `models.SapVirtualInstance$Definition` was modified

* `withIdentity(models.UserAssignedServiceIdentity)` was removed

#### `models.SapVirtualInstanceError` was modified

* `withProperties(models.ErrorDefinition)` was removed

#### `models.SapVirtualInstance$Update` was modified

* `withIdentity(models.UserAssignedServiceIdentity)` was removed

#### `models.UserAssignedIdentity` was modified

* `java.util.UUID principalId()` -> `java.lang.String principalId()`
* `java.util.UUID clientId()` -> `java.lang.String clientId()`

#### `models.SapDatabaseInstance` was modified

* `startInstance()` was removed
* `startInstance(models.StartRequest,com.azure.core.util.Context)` was removed
* `stopInstance()` was removed
* `stopInstance(models.StopRequest,com.azure.core.util.Context)` was removed

#### `models.UpdateSapVirtualInstanceRequest` was modified

* `withIdentity(models.UserAssignedServiceIdentity)` was removed
* `models.UserAssignedServiceIdentity identity()` -> `models.SAPVirtualInstanceIdentity identity()`

#### `models.ThreeTierRecommendationResult` was modified

* `withDatabaseInstanceCount(java.lang.Long)` was removed
* `withApplicationServerInstanceCount(java.lang.Long)` was removed
* `withDbVmSku(java.lang.String)` was removed
* `withApplicationServerVmSku(java.lang.String)` was removed
* `withCentralServerInstanceCount(java.lang.Long)` was removed
* `withCentralServerVmSku(java.lang.String)` was removed

#### `models.VirtualMachineResourceNames` was modified

* `hostname()` was removed
* `withHostname(java.lang.String)` was removed

#### `WorkloadsSapVirtualInstanceManager` was modified

* `resourceProviders()` was removed
* `sapCentralInstances()` was removed
* `fluent.WorkloadsClient serviceClient()` -> `fluent.WorkloadsSapVirtualInstanceMgmtClient serviceClient()`

#### `models.SapAvailabilityZonePair` was modified

* `withZoneB(java.lang.Long)` was removed
* `withZoneA(java.lang.Long)` was removed

#### `models.SapDatabaseInstances` was modified

* `stopInstance(java.lang.String,java.lang.String,java.lang.String,models.StopRequest,com.azure.core.util.Context)` was removed
* `startInstance(java.lang.String,java.lang.String,java.lang.String,models.StartRequest,com.azure.core.util.Context)` was removed
* `startInstance(java.lang.String,java.lang.String,java.lang.String)` was removed
* `stopInstance(java.lang.String,java.lang.String,java.lang.String)` was removed

#### `models.SapDiskConfiguration` was modified

* `withRecommendedConfiguration(models.DiskVolumeConfiguration)` was removed
* `withSupportedConfigurations(java.util.List)` was removed

### Features Added

* `implementation.models.SAPDatabaseInstanceListResult` was added

* `implementation.models.SAPApplicationServerInstanceListResult` was added

* `models.SAPVirtualInstanceIdentity` was added

* `implementation.models.OperationListResult` was added

* `models.SAPVirtualInstanceIdentityType` was added

* `models.FileShareConfigurationType` was added

* `models.SapCentralServerInstances` was added

* `implementation.models.SAPCentralServerInstanceListResult` was added

* `implementation.models.SAPVirtualInstanceListResult` was added

#### `models.SapConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `configurationType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ImageReference` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SapCentralServerInstance` was modified

* `start()` was added
* `start(models.StartRequest,com.azure.core.util.Context)` was added
* `stop(models.StopRequest,com.azure.core.util.Context)` was added
* `stop()` was added

#### `models.SapApplicationServerProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ThreeTierFullResourceNames` was modified

* `namingPatternType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiscoveryConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `configurationType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MountFileShareConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `configurationType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VirtualMachineConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WindowsConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `osType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DeployerVmPackages` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapSupportedSkusRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ApplicationServerVmDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiskConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SingleServerRecommendationResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `deploymentType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateSapApplicationInstanceRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HighAvailabilitySoftwareConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapAvailabilityZoneDetailsRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SoftwareConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `softwareInstallationType()` was added

#### `models.CentralServerConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StorageConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CentralServerVmDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapDatabaseProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.FileShareConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `configurationType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DatabaseConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiskDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.InfrastructureConfiguration` was modified

* `deploymentType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SapSizingRecommendationResult` was modified

* `deploymentType()` was added

#### `models.SapApplicationServerInstances` was modified

* `stop(java.lang.String,java.lang.String,java.lang.String,models.StopRequest,com.azure.core.util.Context)` was added
* `start(java.lang.String,java.lang.String,java.lang.String)` was added
* `start(java.lang.String,java.lang.String,java.lang.String,models.StartRequest,com.azure.core.util.Context)` was added
* `stop(java.lang.String,java.lang.String,java.lang.String)` was added

#### `models.EnqueueReplicationServerProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.GatewayServerProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationStatusResult` was modified

* `resourceId()` was added

#### `models.SharedStorageResourceNames` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StartRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.LoadBalancerResourceNames` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SshPublicKey` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SshConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ErrorDefinition` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DiskSku` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapSupportedSku` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DiskVolumeConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapApplicationServerInstance` was modified

* `start()` was added
* `stop(models.StopRequest,com.azure.core.util.Context)` was added
* `stop()` was added
* `start(models.StartRequest,com.azure.core.util.Context)` was added

#### `models.CentralServerFullResourceNames` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApplicationServerFullResourceNames` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SapVirtualInstanceProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapInstallWithoutOSConfigSoftwareConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `softwareInstallationType()` was added

#### `models.ThreeTierCustomResourceNames` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `namingPatternType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NetworkInterfaceResourceNames` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OSConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `osType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateSapVirtualInstanceProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LinuxConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `osType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ServiceInitiatedSoftwareConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `softwareInstallationType()` was added

#### `models.DeploymentWithOSConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `configurationType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapVirtualInstance$Definition` was modified

* `withIdentity(models.SAPVirtualInstanceIdentity)` was added

#### `models.CreateAndMountFileShareConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `configurationType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SshKeyPair` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SapVirtualInstances` was modified

* `getDiskConfigurations(java.lang.String,models.SapDiskConfigurationsRequest)` was added
* `getSapSupportedSku(java.lang.String,models.SapSupportedSkusRequest)` was added
* `getSapSupportedSkuWithResponse(java.lang.String,models.SapSupportedSkusRequest,com.azure.core.util.Context)` was added
* `getSizingRecommendations(java.lang.String,models.SapSizingRecommendationRequest)` was added
* `getAvailabilityZoneDetailsWithResponse(java.lang.String,models.SapAvailabilityZoneDetailsRequest,com.azure.core.util.Context)` was added
* `getDiskConfigurationsWithResponse(java.lang.String,models.SapDiskConfigurationsRequest,com.azure.core.util.Context)` was added
* `getSizingRecommendationsWithResponse(java.lang.String,models.SapSizingRecommendationRequest,com.azure.core.util.Context)` was added
* `getAvailabilityZoneDetails(java.lang.String,models.SapAvailabilityZoneDetailsRequest)` was added

#### `models.OSProfile` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OsSapConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapVirtualInstanceError` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MessageServerProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapVirtualInstance$Update` was modified

* `withIdentity(models.SAPVirtualInstanceIdentity)` was added

#### `models.DatabaseServerFullResourceNames` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UserAssignedIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SapDatabaseInstance` was modified

* `start()` was added
* `stop()` was added
* `stop(models.StopRequest,com.azure.core.util.Context)` was added
* `start(models.StartRequest,com.azure.core.util.Context)` was added

#### `models.ExternalInstallationSoftwareConfiguration` was modified

* `softwareInstallationType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UpdateSapVirtualInstanceRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withIdentity(models.SAPVirtualInstanceIdentity)` was added

#### `models.SapDiskConfigurationsRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EnqueueServerProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ThreeTierRecommendationResult` was modified

* `deploymentType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VirtualMachineResourceNames` was modified

* `withHostName(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `hostName()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SingleServerConfiguration` was modified

* `deploymentType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StorageInformation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `WorkloadsSapVirtualInstanceManager` was modified

* `sapCentralServerInstances()` was added

#### `models.SapAvailabilityZonePair` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapDatabaseInstances` was modified

* `start(java.lang.String,java.lang.String,java.lang.String)` was added
* `start(java.lang.String,java.lang.String,java.lang.String,models.StartRequest,com.azure.core.util.Context)` was added
* `stop(java.lang.String,java.lang.String,java.lang.String,models.StopRequest,com.azure.core.util.Context)` was added
* `stop(java.lang.String,java.lang.String,java.lang.String)` was added

#### `models.ManagedRGConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SingleServerFullResourceNames` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `namingPatternType()` was added

#### `models.SapCentralServerProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DeploymentConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `configurationType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.StopRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateSapDatabaseInstanceRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApplicationServerConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LoadBalancerDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SapSizingRecommendationRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateSapCentralInstanceRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SapDiskConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DatabaseVmDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HighAvailabilityConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SingleServerCustomResourceNames` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `namingPatternType()` was added

#### `models.NetworkConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SkipFileShareConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `configurationType()` was added

#### `models.ThreeTierConfiguration` was modified

* `deploymentType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0-beta.1 (2024-03-22)

- Azure Resource Manager Workloads Sap Virtual Instance client library for Java. This package contains Microsoft Azure SDK for Workloads Sap Virtual Instance Management SDK. Workloads client provides access to various workload operations. Package tag package-preview-2023-10. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

