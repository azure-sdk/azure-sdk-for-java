# Release History

## 1.0.0-beta.1 (2024-11-18)

- Azure Resource Manager DesktopVirtualization client library for Java. This package contains Microsoft Azure SDK for DesktopVirtualization Management SDK.  Package tag package-preview-2024-08. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.ResourceIdentityType` was removed

#### `models.ResourceModelWithAllowedPropertySetPlan` was removed

#### `models.Identity` was removed

#### `models.ScalingScheduleDaysOfWeekItem` was removed

#### `models.ResourceModelWithAllowedPropertySetIdentity` was removed

#### `models.ResourceModelWithAllowedPropertySetSku` was removed

#### `models.ScalingPlanPersonalSchedule$DefinitionStages` was modified

* Required stage 2, 3, 4, 5, 6 was added

#### `models.ScalingPlanPooledSchedule$DefinitionStages` was modified

* Required stage 2, 3, 4, 5, 6, 7, 8 was added

#### `models.ScalingPlanPooledSchedule$Definition` was modified

* `withRampDownCapacityThresholdPct(java.lang.Integer)` was removed
* `withRampUpCapacityThresholdPct(java.lang.Integer)` was removed

#### `models.Workspace` was modified

* `models.ResourceModelWithAllowedPropertySetSku sku()` -> `models.Sku sku()`
* `models.ResourceModelWithAllowedPropertySetIdentity identity()` -> `models.ManagedServiceIdentity identity()`
* `models.ResourceModelWithAllowedPropertySetPlan plan()` -> `models.Plan plan()`

#### `models.ApplicationGroup` was modified

* `models.ResourceModelWithAllowedPropertySetPlan plan()` -> `models.Plan plan()`
* `models.ResourceModelWithAllowedPropertySetSku sku()` -> `models.Sku sku()`
* `models.ResourceModelWithAllowedPropertySetIdentity identity()` -> `models.ManagedServiceIdentity identity()`

#### `models.HostPool` was modified

* `models.ResourceModelWithAllowedPropertySetIdentity identity()` -> `models.ManagedServiceIdentity identity()`
* `models.ResourceModelWithAllowedPropertySetPlan plan()` -> `models.Plan plan()`
* `models.ResourceModelWithAllowedPropertySetSku sku()` -> `models.Sku sku()`

#### `models.ResourceModelWithAllowedPropertySet` was modified

* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed
* `models.ResourceModelWithAllowedPropertySetSku sku()` -> `models.Sku sku()`
* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed
* `models.ResourceModelWithAllowedPropertySetIdentity identity()` -> `models.ManagedServiceIdentity identity()`
* `models.ResourceModelWithAllowedPropertySetPlan plan()` -> `models.Plan plan()`

#### `models.AppAttachPackages` was modified

* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `deleteByResourceGroup(java.lang.String,java.lang.String)` was removed

#### `models.ApplicationGroup$Definition` was modified

* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed
* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed

#### `models.HostPool$Definition` was modified

* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed
* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed

#### `models.ScalingPlanPooledSchedule` was modified

* `java.lang.Integer rampUpCapacityThresholdPct()` -> `int rampUpCapacityThresholdPct()`
* `java.lang.Integer rampDownCapacityThresholdPct()` -> `int rampDownCapacityThresholdPct()`

#### `models.SessionHosts` was modified

* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was removed

#### `models.ScalingPlan` was modified

* `models.ResourceModelWithAllowedPropertySetSku sku()` -> `models.Sku sku()`
* `models.ResourceModelWithAllowedPropertySetPlan plan()` -> `models.Plan plan()`
* `models.ResourceModelWithAllowedPropertySetIdentity identity()` -> `models.ManagedServiceIdentity identity()`

#### `models.ScalingPlan$Definition` was modified

* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed
* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed

#### `models.Workspace$Definition` was modified

* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed

### Features Added

* `models.SessionHostManagementList` was added

* `models.VirtualMachineDiskType` was added

* `models.MarketplaceInfoPatchProperties` was added

* `models.ActiveDirectoryInfoProperties` was added

* `models.DiskInfoProperties` was added

* `models.SessionHostConfigurations` was added

* `models.UserAssignedIdentity` was added

* `models.AzureActiveDirectoryInfoProperties` was added

* `models.SessionHostConfigurationList` was added

* `models.SessionHostManagementsUpdateStatus` was added

* `models.SessionHostManagementUpdateStatus` was added

* `models.PublicUdp` was added

* `models.DomainInfoPatchProperties` was added

* `models.ImageInfoPatchProperties` was added

* `models.SessionHostManagementOperationProgress` was added

* `models.KeyVaultCredentialsProperties` was added

* `models.ManagedServiceIdentity` was added

* `models.KeyVaultCredentialsPatchProperties` was added

* `models.SessionHostConfiguration` was added

* `models.SecurityInfoPatchProperties` was added

* `models.BootDiagnosticsInfoProperties` was added

* `models.ActiveSessionHostConfiguration` was added

* `models.ControlSessionHostUpdates` was added

* `models.DomainInfoProperties` was added

* `models.ActiveSessionHostConfigurationList` was added

* `models.CustomInfoPatchProperties` was added

* `models.ManagedServiceIdentityType` was added

* `models.ActiveSessionHostConfigurations` was added

* `models.SessionHostConfigurationPatch` was added

* `models.SessionHostManagementPatch` was added

* `models.BootDiagnosticsInfoPatchProperties` was added

* `models.DirectUdp` was added

* `models.NetworkInfoPatchProperties` was added

* `models.SessionHostManagement` was added

* `models.MarketplaceInfoProperties` was added

* `models.SecurityInfoProperties` was added

* `models.SessionHostOperations` was added

* `models.HostPoolUpdateAction` was added

* `models.ManagedPrivateUdp` was added

* `models.UpdateSessionHostsRequestBody` was added

* `models.InitiateSessionHostUpdates` was added

* `models.ProvisioningStateShc` was added

* `models.HostPoolUpdateControlParameter` was added

* `models.ImageInfoProperties` was added

* `models.DiskInfoPatchProperties` was added

* `models.HostPoolUpdateConfigurationProperties` was added

* `models.NetworkInfoProperties` was added

* `models.VirtualMachineSecurityType` was added

* `models.ManagementType` was added

* `models.SessionHostManagementUpdateStatusProperties` was added

* `models.RelayUdp` was added

* `models.ActiveDirectoryInfoPatchProperties` was added

* `models.DomainJoinType` was added

* `models.HostPoolUpdateConfigurationPatchProperties` was added

* `models.CustomInfoProperties` was added

* `models.SessionHostManagements` was added

* `models.Type` was added

#### `models.ScalingPlanPooledSchedule$Definition` was modified

* `withRampUpCapacityThresholdPct(int)` was added
* `withRampDownCapacityThresholdPct(int)` was added

#### `models.HostPool$Update` was modified

* `withManagedPrivateUdp(models.ManagedPrivateUdp)` was added
* `withRelayUdp(models.RelayUdp)` was added
* `withDirectUdp(models.DirectUdp)` was added
* `withPublicUdp(models.PublicUdp)` was added

#### `models.AppAttachPackagePatch` was modified

* `withTags(java.util.Map)` was added
* `tags()` was added

#### `models.AppAttachPackagePatchProperties` was modified

* `withCustomData(java.lang.String)` was added
* `withPackageLookbackUrl(java.lang.String)` was added
* `customData()` was added
* `packageLookbackUrl()` was added

#### `models.HostPool` was modified

* `relayUdp()` was added
* `directUdp()` was added
* `managementType()` was added
* `publicUdp()` was added
* `managedPrivateUdp()` was added

#### `models.HostPoolPatch` was modified

* `publicUdp()` was added
* `relayUdp()` was added
* `withRelayUdp(models.RelayUdp)` was added
* `withDirectUdp(models.DirectUdp)` was added
* `withManagedPrivateUdp(models.ManagedPrivateUdp)` was added
* `withPublicUdp(models.PublicUdp)` was added
* `managedPrivateUdp()` was added
* `directUdp()` was added

#### `models.ResourceModelWithAllowedPropertySet` was modified

* `withSku(models.Sku)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added
* `withPlan(models.Plan)` was added

#### `models.HostPoolProperties` was modified

* `publicUdp()` was added
* `relayUdp()` was added
* `managedPrivateUdp()` was added
* `directUdp()` was added
* `managementType()` was added

#### `DesktopVirtualizationManager` was modified

* `sessionHostManagementsUpdateStatus()` was added
* `sessionHostOperations()` was added
* `initiateSessionHostUpdates()` was added
* `controlSessionHostUpdates()` was added
* `sessionHostConfigurations()` was added
* `activeSessionHostConfigurations()` was added
* `sessionHostManagements()` was added

#### `models.AppAttachPackages` was modified

* `delete(java.lang.String,java.lang.String)` was added
* `deleteByIdWithResponse(java.lang.String,java.lang.Boolean,com.azure.core.util.Context)` was added
* `deleteWithResponse(java.lang.String,java.lang.String,java.lang.Boolean,com.azure.core.util.Context)` was added

#### `models.AppAttachPackage$Update` was modified

* `withTags(java.util.Map)` was added

#### `models.AppAttachPackageProperties` was modified

* `customData()` was added
* `packageLookbackUrl()` was added
* `withCustomData(java.lang.String)` was added
* `withPackageLookbackUrl(java.lang.String)` was added
* `withPackageOwnerName(java.lang.String)` was added
* `packageOwnerName()` was added

#### `models.ScalingPlanPooledSchedulePatch` was modified

* `namePropertiesName()` was added

#### `models.ApplicationGroup$Definition` was modified

* `withPlan(models.Plan)` was added
* `withSku(models.Sku)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added

#### `models.HostPool$Definition` was modified

* `withManagedPrivateUdp(models.ManagedPrivateUdp)` was added
* `withRelayUdp(models.RelayUdp)` was added
* `withPublicUdp(models.PublicUdp)` was added
* `withPlan(models.Plan)` was added
* `withSku(models.Sku)` was added
* `withManagementType(models.ManagementType)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added
* `withDirectUdp(models.DirectUdp)` was added

#### `models.ScalingPlanPooledSchedule` was modified

* `namePropertiesName()` was added

#### `models.SessionHost` was modified

* `sessionHostConfiguration()` was added
* `lastSessionHostUpdateTime()` was added

#### `models.SessionHosts` was modified

* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,java.lang.String,com.azure.core.util.Context)` was added

#### `models.ScalingPlan$Definition` was modified

* `withPlan(models.Plan)` was added
* `withSku(models.Sku)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added

#### `models.Workspace$Definition` was modified

* `withPlan(models.Plan)` was added
* `withSku(models.Sku)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added

## 1.2.0 (2024-09-25)

- Azure Resource Manager DesktopVirtualization client library for Java. This package contains Microsoft Azure SDK for DesktopVirtualization Management SDK.  Package tag package-2024-04. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.AppAttachPackage$UpdateStages` was added

* `models.ImportPackageInfoRequest` was added

* `models.FailHealthCheckOnStagingFailure` was added

* `models.AppAttachPackagePatch` was added

* `models.AppAttachPackagePatchProperties` was added

* `models.ProvisioningState` was added

* `models.AppAttachPackageInfoProperties` was added

* `models.AppAttachPackage$Definition` was added

* `models.RegistrationTokenList` was added

* `models.AppAttachPackages` was added

* `models.AppAttachPackage$Update` was added

* `models.AppAttachPackageProperties` was added

* `models.AppAttachPackageList` was added

* `models.AppAttachPackage` was added

* `models.AppAttachPackageInfoes` was added

* `models.PackageTimestamped` was added

* `models.AppAttachPackageArchitectures` was added

* `models.RegistrationTokenMinimal` was added

* `models.AppAttachPackage$DefinitionStages` was added

#### `models.PrivateEndpointConnectionWithSystemData` was modified

* `groupIds()` was added

#### `models.ExpandMsixImageList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HostPoolList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SessionHostList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StartMenuItemList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SessionHostHealthCheckReport` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RegistrationInfoPatch` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StartMenuItem` was modified

* `systemData()` was added

#### `models.OperationProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkspacePatch` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ScalingHostPoolReference` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DesktopPatch` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrivateEndpoint` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ScalingSchedule` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MsixPackageApplications` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ScalingPlanPersonalScheduleList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResourceModelWithAllowedPropertySetPlan` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MsixPackageList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HostPool` was modified

* `listRegistrationTokens()` was added
* `listRegistrationTokensWithResponse(com.azure.core.util.Context)` was added
* `appAttachPackageReferences()` was added

#### `models.ResourceProviderOperationList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HostPoolPatch` was modified

* `type()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `id()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `systemData()` was added
* `name()` was added

#### `models.ResourceModelWithAllowedPropertySet` was modified

* `type()` was added
* `id()` was added
* `name()` was added
* `systemData()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceProviderOperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SessionHostHealthCheckFailureDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrivateLinkResource` was modified

* `systemData()` was added

#### `models.WorkspaceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HostPoolProperties` was modified

* `appAttachPackageReferences()` was added

#### `DesktopVirtualizationManager` was modified

* `appAttachPackages()` was added
* `appAttachPackageInfoes()` was added

#### `models.ApplicationList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrivateEndpointConnection` was modified

* `id()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `systemData()` was added
* `name()` was added
* `groupIds()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `type()` was added

#### `models.ApplicationGroupList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Sku` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AgentUpdateProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LogSpecification` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SendMessage` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AgentUpdatePatchProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ScalingPlanPooledSchedulePatch` was modified

* `id()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `name()` was added
* `type()` was added
* `systemData()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Identity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SessionHostPatch` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `id()` was added
* `name()` was added
* `type()` was added
* `systemData()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MsixPackagePatch` was modified

* `name()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `id()` was added
* `type()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `systemData()` was added

#### `models.MsixImageUri` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ScalingPlanPooledScheduleList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApplicationGroupPatch` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `systemData()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `name()` was added
* `type()` was added
* `id()` was added

#### `models.PrivateLinkServiceConnectionState` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MaintenanceWindowProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MaintenanceWindowPatchProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ScalingPlanPatch` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrivateLinkResourceListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExpandMsixImage` was modified

* `certificateName()` was added
* `certificateExpiry()` was added
* `systemData()` was added

#### `models.ServiceSpecification` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Time` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrivateEndpointConnectionListResultWithSystemData` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ScalingPlanList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ScalingPlanPersonalSchedulePatch` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceModelWithAllowedPropertySetIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `tenantId()` was added
* `principalId()` was added

#### `models.MsixPackageDependencies` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UserSessionList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HostPools` was modified

* `listRegistrationTokens(java.lang.String,java.lang.String)` was added
* `listRegistrationTokensWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.DesktopList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ApplicationPatch` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Plan` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceModelWithAllowedPropertySetSku` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

## 1.1.0 (2023-10-16)

- Azure Resource Manager DesktopVirtualization client library for Java. This package contains Microsoft Azure SDK for DesktopVirtualization Management SDK.  Package tag package-2023-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.PrivateEndpointConnectionWithSystemData` was added

* `models.PrivateEndpointConnectionProvisioningState` was added

* `models.ScalingPlanPersonalSchedule$UpdateStages` was added

* `models.ScalingPlanPersonalSchedule` was added

* `models.ScalingPlanPersonalSchedule$Definition` was added

* `models.SetStartVMOnConnect` was added

* `models.PrivateEndpoint` was added

* `models.ScalingPlanPersonalScheduleList` was added

* `models.PrivateLinkResources` was added

* `models.SessionHandlingOperation` was added

* `models.ScalingPlanPersonalSchedule$DefinitionStages` was added

* `models.PrivateEndpointConnections` was added

* `models.ScalingPlanPersonalSchedule$Update` was added

* `models.PrivateLinkResource` was added

* `models.PrivateEndpointConnection` was added

* `models.HostpoolPublicNetworkAccess` was added

* `models.ScalingPlanPersonalSchedules` was added

* `models.StartupBehavior` was added

* `models.PrivateLinkServiceConnectionState` was added

* `models.PrivateLinkResourceListResult` was added

* `models.PrivateEndpointServiceConnectionStatus` was added

* `models.PrivateEndpointConnectionListResultWithSystemData` was added

* `models.ScalingPlanPersonalSchedulePatch` was added

* `models.PublicNetworkAccess` was added

#### `models.HostPool$Update` was modified

* `withPublicNetworkAccess(models.HostpoolPublicNetworkAccess)` was added

#### `models.WorkspacePatch` was modified

* `publicNetworkAccess()` was added
* `withPublicNetworkAccess(models.PublicNetworkAccess)` was added

#### `models.Workspace` was modified

* `publicNetworkAccess()` was added
* `privateEndpointConnections()` was added

#### `models.ApplicationGroup` was modified

* `showInFeed()` was added

#### `models.HostPool` was modified

* `publicNetworkAccess()` was added
* `privateEndpointConnections()` was added

#### `models.HostPoolPatch` was modified

* `withPublicNetworkAccess(models.HostpoolPublicNetworkAccess)` was added
* `publicNetworkAccess()` was added

#### `models.HostPoolProperties` was modified

* `privateEndpointConnections()` was added
* `publicNetworkAccess()` was added

#### `DesktopVirtualizationManager` was modified

* `scalingPlanPersonalSchedules()` was added
* `privateEndpointConnections()` was added
* `privateLinkResources()` was added

#### `models.ApplicationGroup$Definition` was modified

* `withShowInFeed(java.lang.Boolean)` was added

#### `models.ApplicationGroupPatch` was modified

* `withShowInFeed(java.lang.Boolean)` was added
* `showInFeed()` was added

#### `models.HostPool$Definition` was modified

* `withPublicNetworkAccess(models.HostpoolPublicNetworkAccess)` was added

#### `models.Workspace$Update` was modified

* `withPublicNetworkAccess(models.PublicNetworkAccess)` was added

#### `models.Workspace$Definition` was modified

* `withPublicNetworkAccess(models.PublicNetworkAccess)` was added

#### `models.ApplicationGroup$Update` was modified

* `withShowInFeed(java.lang.Boolean)` was added

## 1.0.0 (2023-03-20)

- Azure Resource Manager DesktopVirtualization client library for Java. This package contains Microsoft Azure SDK for DesktopVirtualization Management SDK.  Package tag package-2022-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.3 (2023-03-16)

- Azure Resource Manager DesktopVirtualization client library for Java. This package contains Microsoft Azure SDK for DesktopVirtualization Management SDK.  Package tag package-2022-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.PrivateEndpointConnectionWithSystemData` was removed

* `models.PrivateEndpointConnectionProvisioningState` was removed

* `models.PrivateEndpointConnection` was removed

* `models.MigrationRequestProperties` was removed

* `models.PrivateLinkServiceConnectionState` was removed

* `models.PrivateEndpoint` was removed

* `models.Operation` was removed

* `models.PrivateLinkResourceListResult` was removed

* `models.PrivateEndpointServiceConnectionStatus` was removed

* `models.PrivateEndpointConnectionListResultWithSystemData` was removed

* `models.PrivateLinkResources` was removed

* `models.PrivateEndpointConnections` was removed

* `models.PublicNetworkAccess` was removed

* `models.PrivateLinkResource` was removed

#### `models.ScalingPlan$DefinitionStages` was modified

* Stage 3 was added

#### `models.HostPoolProperties` was modified

* `migrationRequest()` was removed
* `publicNetworkAccess()` was removed

#### `models.StartMenuItems` was modified

* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `DesktopVirtualizationManager` was modified

* `privateLinkResources()` was removed
* `privateEndpointConnections()` was removed

#### `models.HostPool$Update` was modified

* `withPublicNetworkAccess(models.PublicNetworkAccess)` was removed

#### `models.ApplicationGroup$Definition` was modified

* `withMigrationRequest(models.MigrationRequestProperties)` was removed

#### `models.Desktops` was modified

* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.WorkspacePatch` was modified

* `withPublicNetworkAccess(models.PublicNetworkAccess)` was removed
* `publicNetworkAccess()` was removed

#### `models.HostPool$Definition` was modified

* `withPublicNetworkAccess(models.PublicNetworkAccess)` was removed
* `withMigrationRequest(models.MigrationRequestProperties)` was removed

#### `models.Workspace` was modified

* `publicNetworkAccess()` was removed

#### `models.Workspace$Update` was modified

* `withPublicNetworkAccess(models.PublicNetworkAccess)` was removed

#### `models.ApplicationGroups` was modified

* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listByResourceGroup(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.SessionHosts` was modified

* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.ApplicationGroup` was modified

* `migrationRequest()` was removed

#### `models.ScalingPlans` was modified

* `list(com.azure.core.util.Context)` was removed
* `listByHostPool(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listByResourceGroup(java.lang.String,com.azure.core.util.Context)` was removed

#### `models.HostPool` was modified

* `migrationRequest()` was removed
* `publicNetworkAccess()` was removed

#### `models.MsixPackages` was modified

* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.Workspaces` was modified

* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listByResourceGroup(java.lang.String,com.azure.core.util.Context)` was removed

#### `models.HostPoolPatch` was modified

* `withPublicNetworkAccess(models.PublicNetworkAccess)` was removed
* `publicNetworkAccess()` was removed

#### `models.Applications` was modified

* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.HostPools` was modified

* `listByResourceGroup(java.lang.String,com.azure.core.util.Context)` was removed
* `list(com.azure.core.util.Context)` was removed

#### `models.UserSessions` was modified

* `listByHostPool(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `list(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.Workspace$Definition` was modified

* `withPublicNetworkAccess(models.PublicNetworkAccess)` was removed

### Features Added

* `models.ScalingPlanPooledSchedule$Definition` was added

* `models.ScalingPlanPooledSchedule$Update` was added

* `models.AgentUpdateProperties` was added

* `models.AgentUpdatePatchProperties` was added

* `models.ScalingPlanPooledSchedulePatch` was added

* `models.ScalingPlanPooledScheduleList` was added

* `models.SessionHostComponentUpdateType` was added

* `models.MaintenanceWindowProperties` was added

* `models.MaintenanceWindowPatchProperties` was added

* `models.ScalingPlanPooledSchedule` was added

* `models.ScalingPlanPooledSchedule$UpdateStages` was added

* `models.DayOfWeek` was added

* `models.ScalingPlanPooledSchedule$DefinitionStages` was added

* `models.ScalingPlanPooledSchedules` was added

#### `models.HostPoolProperties` was modified

* `agentUpdate()` was added

#### `models.StartMenuItems` was modified

* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added

#### `DesktopVirtualizationManager` was modified

* `scalingPlanPooledSchedules()` was added

#### `models.HostPool$Update` was modified

* `withAgentUpdate(models.AgentUpdatePatchProperties)` was added

#### `models.SessionHostPatch` was modified

* `withFriendlyName(java.lang.String)` was added
* `friendlyName()` was added

#### `models.Desktops` was modified

* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added

#### `models.HostPool$Definition` was modified

* `withAgentUpdate(models.AgentUpdateProperties)` was added

#### `models.SessionHost` was modified

* `friendlyName()` was added

#### `models.ApplicationGroups` was modified

* `listByResourceGroup(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added
* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.SessionHosts` was modified

* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added

#### `models.ScalingPlans` was modified

* `list(java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added
* `listByHostPool(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added
* `listByResourceGroup(java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added
* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.HostPool` was modified

* `agentUpdate()` was added

#### `models.MsixPackages` was modified

* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added

#### `models.Workspaces` was modified

* `listByResourceGroup(java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added
* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.HostPoolPatch` was modified

* `withAgentUpdate(models.AgentUpdatePatchProperties)` was added
* `agentUpdate()` was added

#### `models.Applications` was modified

* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added

#### `models.HostPools` was modified

* `listByResourceGroup(java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added
* `list(java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added

#### `models.UserSessions` was modified

* `list(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added
* `listByHostPool(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added

## 1.0.0-beta.2 (2022-06-21)

- Azure Resource Manager DesktopVirtualization client library for Java. This package contains Microsoft Azure SDK for DesktopVirtualization Management SDK.  Package tag package-preview-2021-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `DesktopVirtualizationManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

#### `DesktopVirtualizationManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

#### `models.MsixPackage` was modified

* `resourceGroupName()` was added

#### `models.Workspace` was modified

* `resourceGroupName()` was added

#### `models.Application` was modified

* `resourceGroupName()` was added

#### `models.ApplicationGroup` was modified

* `resourceGroupName()` was added

#### `models.HostPool` was modified

* `resourceGroupName()` was added

#### `models.ScalingPlan` was modified

* `resourceGroupName()` was added

## 1.0.0-beta.1 (2021-11-10)

- Azure Resource Manager DesktopVirtualization client library for Java. This package contains Microsoft Azure SDK for DesktopVirtualization Management SDK.  Package tag package-preview-2021-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
