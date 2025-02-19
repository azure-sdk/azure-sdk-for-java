# Release History

## 1.0.0-beta.1 (2025-02-19)

- Azure Resource Manager DataBoxEdge client library for Java. This package contains Microsoft Azure SDK for DataBoxEdge Management SDK.  Package tag package-2023-12-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.Skus` was removed

#### `models.SkuRestrictionInfo` was removed

#### `models.SkuInformationList` was removed

#### `models.SkuRestriction` was removed

#### `models.SkuRestrictionReasonCode` was removed

#### `models.ResourceTypeSku` was removed

#### `models.StorageAccount$DefinitionStages` was modified

* Required stage 2 was added

#### `models.User$Definition` was modified

* `withShareAccessRights(java.util.List)` was removed

#### `DataBoxEdgeManager` was modified

* `skus()` was removed

#### `models.DataBoxEdgeDevice$Definition` was modified

* `withFriendlyName(java.lang.String)` was removed
* `withDescription(java.lang.String)` was removed
* `withModelDescription(java.lang.String)` was removed
* `withDataBoxEdgeDeviceStatus(models.DataBoxEdgeDeviceStatus)` was removed

#### `models.User$Update` was modified

* `withShareAccessRights(java.util.List)` was removed

### Features Added

* `models.DiagnosticProactiveLogCollectionSettings` was added

* `models.MetricCounterSet` was added

* `models.DataResidency` was added

* `models.RemoteApplicationType` was added

* `models.ArcAddon` was added

* `models.UpdateStatus` was added

* `models.KubernetesIpConfiguration` was added

* `models.VmPlacementRequestResult` was added

* `models.SupportPackages` was added

* `models.UpdateDetails` was added

* `models.EdgeProfile` was added

* `models.TriggerSupportPackageRequest` was added

* `models.MetricDimension` was added

* `models.ShipmentType` was added

* `models.ClusterMemoryCapacity` was added

* `models.PosixComplianceStatus` was added

* `models.AvailableSkus` was added

* `models.CniConfig` was added

* `models.DeviceCapacityRequestInfo` was added

* `models.VmMemory` was added

* `models.SkuAvailability` was added

* `models.AddonList` was added

* `models.ResourceIdentity` was added

* `models.SkuVersion` was added

* `models.CloudEdgeManagementRole` was added

* `models.ResourceMoveDetails` was added

* `models.ClusterCapacityViewData` was added

* `models.UpdateType` was added

* `models.HostPlatformType` was added

* `models.GenerateCertResponse` was added

* `models.Secret` was added

* `models.KeyVaultSyncStatus` was added

* `models.RemoteSupportSettings` was added

* `models.KubernetesRoleStorage` was added

* `models.NumaNodeData` was added

* `models.KubernetesRoleNetwork` was added

* `models.EdgeProfileSubscription` was added

* `models.MountType` was added

* `models.MonitoringConfigs` was added

* `models.IoTEdgeAgentInfo` was added

* `models.DeviceCapacityInfo` was added

* `models.MetricCounter` was added

* `models.ProactiveDiagnosticsConsent` was added

* `models.DiagnosticRemoteSupportSettings` was added

* `models.AccessLevel` was added

* `models.LoadBalancerConfig` was added

* `models.ComputeResource` was added

* `models.DCAccessCode` was added

* `models.IoTAddon` was added

* `models.ClusterWitnessType` was added

* `models.ClusterGpuCapacity` was added

* `models.EdgeProfileSubscriptionPatch` was added

* `models.SubscriptionRegisteredFeatures` was added

* `models.InstallationImpact` was added

* `models.Addon` was added

* `models.EdgeProfilePatch` was added

* `models.MonitoringMetricConfiguration` was added

* `models.MsiIdentityType` was added

* `models.KubernetesState` was added

* `models.ImageRepositoryCredential` was added

* `models.MonitoringMetricConfigurationList` was added

* `models.SubscriptionState` was added

* `models.DiagnosticSettings` was added

* `models.ResourceMoveStatus` was added

* `models.KubernetesClusterInfo` was added

* `models.KubernetesRoleResources` was added

* `models.DataBoxEdgeSku` was added

* `models.DataBoxEdgeSkuList` was added

* `models.SkuSignupOption` was added

* `models.Addons` was added

* `models.KubernetesRoleCompute` was added

* `models.DataResidencyType` was added

* `models.MecRole` was added

* `models.KubernetesNodeType` was added

* `models.KubernetesRoleStorageClassInfo` was added

* `models.AddonState` was added

* `models.NodeInfo` was added

* `models.ClusterStorageViewData` was added

* `models.HostCapacity` was added

* `models.DeviceCapacityInfoes` was added

* `models.MetricConfiguration` was added

* `models.EtcdInfo` was added

* `models.DataBoxEdgeDeviceKind` was added

* `models.SkuCapability` was added

* `models.KubernetesRole` was added

* `models.AddonType` was added

* `models.DeviceCapacityChecks` was added

* `models.DataBoxEdgeDeviceExtendedInfoPatch` was added

#### `models.StorageAccountCredential` was modified

* `systemData()` was added

#### `models.Operation` was modified

* `isDataAction()` was added

#### `models.Alert` was modified

* `systemData()` was added

#### `models.DataBoxEdgeDeviceExtendedInfo` was modified

* `clientSecretStoreUrl()` was added
* `clusterWitnessType()` was added
* `fileShareWitnessUsername()` was added
* `cloudWitnessStorageAccountName()` was added
* `cloudWitnessContainerName()` was added
* `deviceSecrets()` was added
* `cloudWitnessStorageEndpoint()` was added
* `keyVaultSyncStatus()` was added
* `systemData()` was added
* `fileShareWitnessLocation()` was added
* `channelIntegrityKeyName()` was added
* `channelIntegrityKeyVersion()` was added
* `clientSecretStoreId()` was added

#### `models.Devices` was modified

* `updateExtendedInformationWithResponse(java.lang.String,java.lang.String,models.DataBoxEdgeDeviceExtendedInfoPatch,com.azure.core.util.Context)` was added
* `generateCertificateWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `updateExtendedInformation(java.lang.String,java.lang.String,models.DataBoxEdgeDeviceExtendedInfoPatch)` was added
* `generateCertificate(java.lang.String,java.lang.String)` was added

#### `models.Orders` was modified

* `listDCAccessCodeWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listDCAccessCode(java.lang.String,java.lang.String)` was added

#### `models.IoTRole` was modified

* `withComputeResource(models.ComputeResource)` was added
* `hostPlatformType()` was added
* `systemData()` was added
* `withIoTEdgeAgentInfo(models.IoTEdgeAgentInfo)` was added
* `ioTEdgeAgentInfo()` was added
* `computeResource()` was added

#### `models.Trigger` was modified

* `systemData()` was added

#### `models.Order` was modified

* `systemData()` was added
* `kind()` was added
* `shipmentType()` was added
* `orderId()` was added

#### `DataBoxEdgeManager` was modified

* `deviceCapacityInfoes()` was added
* `deviceCapacityChecks()` was added
* `diagnosticSettings()` was added
* `monitoringConfigs()` was added
* `availableSkus()` was added
* `addons()` was added
* `supportPackages()` was added

#### `models.UpdateSummary` was modified

* `lastSuccessfulInstallJobDateTime()` was added
* `lastSuccessfulScanJobTime()` was added
* `totalTimeInMinutes()` was added
* `systemData()` was added
* `updates()` was added
* `lastCompletedDownloadJobId()` was added
* `lastDownloadJobStatus()` was added
* `lastInstallJobStatus()` was added
* `lastCompletedInstallJobId()` was added

#### `models.FileEventTrigger` was modified

* `systemData()` was added

#### `models.DataBoxEdgeDevice` was modified

* `edgeProfile()` was added
* `systemData()` was added
* `generateCertificateWithResponse(com.azure.core.util.Context)` was added
* `generateCertificate()` was added
* `kind()` was added
* `identity()` was added
* `updateExtendedInformationWithResponse(models.DataBoxEdgeDeviceExtendedInfoPatch,com.azure.core.util.Context)` was added
* `kubernetesWorkloadProfile()` was added
* `updateExtendedInformation(models.DataBoxEdgeDeviceExtendedInfoPatch)` was added
* `dataResidency()` was added
* `resourceMoveDetails()` was added
* `systemDataPropertiesSystemData()` was added

#### `models.Container` was modified

* `systemData()` was added

#### `models.MountPointMap` was modified

* `mountType()` was added

#### `models.User` was modified

* `systemData()` was added

#### `models.NodeList` was modified

* `nextLink()` was added

#### `models.StorageAccount` was modified

* `systemData()` was added

#### `models.PeriodicTimerEventTrigger` was modified

* `systemData()` was added

#### `models.OrderStatus` was modified

* `trackingInformation()` was added

#### `models.Role` was modified

* `systemData()` was added

#### `models.DataBoxEdgeDevicePatch` was modified

* `identity()` was added
* `edgeProfile()` was added
* `withEdgeProfile(models.EdgeProfilePatch)` was added
* `withIdentity(models.ResourceIdentity)` was added

#### `models.DataBoxEdgeDevice$Definition` was modified

* `withIdentity(models.ResourceIdentity)` was added
* `withDataResidency(models.DataResidency)` was added

#### `models.DataBoxEdgeDevice$Update` was modified

* `withIdentity(models.ResourceIdentity)` was added
* `withEdgeProfile(models.EdgeProfilePatch)` was added

#### `models.NetworkSettings` was modified

* `systemData()` was added

#### `models.Share` was modified

* `systemData()` was added

#### `models.BandwidthSchedule` was modified

* `systemData()` was added

## 1.0.0 (2024-12-23)

- Azure Resource Manager DataBoxEdge client library for Java. This package contains Microsoft Azure SDK for DataBoxEdge Management SDK.  Package tag package-2019-08. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Other Changes

- Release for Azure Resource Manager DataBoxEdge client library for Java.

## 1.0.0-beta.3 (2024-10-17)

- Azure Resource Manager DataBoxEdge client library for Java. This package contains Microsoft Azure SDK for DataBoxEdge Management SDK.  Package tag package-2019-08. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.JobErrorItem` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Sku` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SkuRestrictionInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MetricDimensionV1` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SkuInformationList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Address` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateInstallProgress` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ContainerList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TrackingInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RefreshDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SkuRestriction` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BandwidthSchedulesList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OrderList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AlertErrorDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RoleSinkInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ClientAccessRight` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeriodicTimerSourceInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SecuritySettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `name()` was added
* `id()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `type()` was added

#### `models.IoTRole` was modified

* `kind()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `name()` was added
* `id()` was added
* `type()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RoleList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Trigger` was modified

* `kind()` was added

#### `models.JobErrorDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AzureContainerInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StorageAccountList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DataBoxEdgeDeviceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MetricSpecificationV1` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SkuLocationInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IoTDeviceInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FileEventTrigger` was modified

* `name()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `type()` was added
* `kind()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `id()` was added

#### `models.NetworkAdapter` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TriggerList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MountPointMap` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NetworkAdapterPosition` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ShareAccessRight` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AsymmetricEncryptedSecret` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationsList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UploadCertificateRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.NodeList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeriodicTimerEventTrigger` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `id()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added
* `name()` was added
* `kind()` was added

#### `models.ServiceSpecification` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Authentication` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OrderStatus` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Ipv4Config` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Role` was modified

* `kind()` was added

#### `models.DataBoxEdgeDevicePatch` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SkuCost` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ShareList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UserList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SymmetricKey` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AlertList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ContactDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.StorageAccountCredentialList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Ipv6Config` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FileSourceInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ArmBaseModel` was modified

* `id()` was added
* `type()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `name()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UserAccessRight` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UpdateDownloadProgress` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0-beta.2 (2023-01-13)

- Azure Resource Manager DataBoxEdge client library for Java. This package contains Microsoft Azure SDK for DataBoxEdge Management SDK.  Package tag package-2019-08. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.StorageAccountCredential` was modified

* `resourceGroupName()` was added

#### `DataBoxEdgeManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added
* `withScope(java.lang.String)` was added

#### `DataBoxEdgeManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

#### `models.DataBoxEdgeDevice` was modified

* `resourceGroupName()` was added

#### `models.Container` was modified

* `resourceGroupName()` was added

#### `models.User` was modified

* `resourceGroupName()` was added

#### `models.StorageAccount` was modified

* `resourceGroupName()` was added

#### `models.Share` was modified

* `resourceGroupName()` was added

#### `models.BandwidthSchedule` was modified

* `resourceGroupName()` was added

## 1.0.0-beta.1 (2021-04-09)

- Azure Resource Manager DataBoxEdge client library for Java. This package contains Microsoft Azure SDK for DataBoxEdge Management SDK.  Package tag package-2019-08. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
