# Release History

## 1.0.0-beta.1 (2025-04-03)

- Azure Resource Manager DesktopVirtualization client library for Java. This package contains Microsoft Azure SDK for DesktopVirtualization Management SDK. This Typespec represents the Desktop Virtualization API interfaces. Package tag package-preview-2025-04-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.ResourceIdentityType` was removed

#### `models.ResourceModelWithAllowedPropertySetPlan` was removed

#### `models.ResourceProviderOperationList` was removed

#### `models.ResourceModelWithAllowedPropertySet` was removed

#### `models.AppAttachPackageProperties` was removed

#### `models.Identity` was removed

#### `models.ScalingScheduleDaysOfWeekItem` was removed

#### `models.ResourceModelWithAllowedPropertySetIdentity` was removed

#### `models.ResourceModelWithAllowedPropertySetSku` was removed

#### `models.ScalingPlanPersonalSchedule$DefinitionStages` was modified

* Required stage 2, 3, 4, 5, 6 was added

#### `models.ScalingPlanPooledSchedule$DefinitionStages` was modified

* Required stage 2, 3, 4, 5, 6, 7, 8 was added

#### `models.ScalingPlanPooledSchedule$Definition` was modified

* `withRampUpCapacityThresholdPct(java.lang.Integer)` was removed
* `withRampDownCapacityThresholdPct(java.lang.Integer)` was removed

#### `models.ScalingPlanPooledSchedule$Update` was modified

* `withRampUpMinimumHostsPct(java.lang.Integer)` was removed
* `withRampDownStartTime(models.Time)` was removed
* `withRampDownLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withRampDownMinimumHostsPct(java.lang.Integer)` was removed
* `withOffPeakStartTime(models.Time)` was removed
* `withPeakLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withRampDownStopHostsWhen(models.StopHostsWhen)` was removed
* `withOffPeakLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withRampDownNotificationMessage(java.lang.String)` was removed
* `withRampDownCapacityThresholdPct(java.lang.Integer)` was removed
* `withRampUpStartTime(models.Time)` was removed
* `withRampUpLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withDaysOfWeek(java.util.List)` was removed
* `withRampDownWaitTimeMinutes(java.lang.Integer)` was removed
* `withRampDownForceLogoffUsers(java.lang.Boolean)` was removed
* `withRampUpCapacityThresholdPct(java.lang.Integer)` was removed
* `withPeakStartTime(models.Time)` was removed

#### `models.HostPool$Update` was modified

* `withLoadBalancerType(models.LoadBalancerType)` was removed
* `withPersonalDesktopAssignmentType(models.PersonalDesktopAssignmentType)` was removed
* `withSsoSecretType(models.SsoSecretType)` was removed
* `withSsoClientId(java.lang.String)` was removed
* `withSsoClientSecretKeyVaultPath(java.lang.String)` was removed
* `withRegistrationInfo(models.RegistrationInfoPatch)` was removed
* `withCustomRdpProperty(java.lang.String)` was removed
* `withRing(java.lang.Integer)` was removed
* `withSsoadfsAuthority(java.lang.String)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withVmTemplate(java.lang.String)` was removed
* `withMaxSessionLimit(java.lang.Integer)` was removed
* `withAgentUpdate(models.AgentUpdatePatchProperties)` was removed
* `withValidationEnvironment(java.lang.Boolean)` was removed
* `withPreferredAppGroupType(models.PreferredAppGroupType)` was removed
* `withDescription(java.lang.String)` was removed
* `withStartVMOnConnect(java.lang.Boolean)` was removed
* `withPublicNetworkAccess(models.HostpoolPublicNetworkAccess)` was removed

#### `models.ScalingPlan$Update` was modified

* `withFriendlyName(java.lang.String)` was removed
* `withTimeZone(java.lang.String)` was removed
* `withSchedules(java.util.List)` was removed
* `withDescription(java.lang.String)` was removed
* `withExclusionTag(java.lang.String)` was removed
* `withHostPoolReferences(java.util.List)` was removed

#### `models.StartMenuItem` was modified

* `filePath()` was removed
* `iconIndex()` was removed
* `iconPath()` was removed
* `commandLineArguments()` was removed
* `appAlias()` was removed

#### `models.WorkspacePatch` was modified

* `withPublicNetworkAccess(models.PublicNetworkAccess)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `friendlyName()` was removed
* `applicationGroupReferences()` was removed
* `publicNetworkAccess()` was removed
* `withApplicationGroupReferences(java.util.List)` was removed
* `withDescription(java.lang.String)` was removed
* `description()` was removed

#### `models.MsixPackage$Update` was modified

* `withIsActive(java.lang.Boolean)` was removed
* `withIsRegularRegistration(java.lang.Boolean)` was removed
* `withDisplayName(java.lang.String)` was removed

#### `models.Workspace` was modified

* `models.ResourceModelWithAllowedPropertySetSku sku()` -> `models.Sku sku()`
* `models.ResourceModelWithAllowedPropertySetPlan plan()` -> `models.Plan plan()`
* `models.ResourceModelWithAllowedPropertySetIdentity identity()` -> `models.ManagedServiceIdentity identity()`

#### `models.DesktopPatch` was modified

* `friendlyName()` was removed
* `withTags(java.util.Map)` was removed
* `tags()` was removed
* `withFriendlyName(java.lang.String)` was removed
* `description()` was removed
* `withDescription(java.lang.String)` was removed

#### `models.Application$Update` was modified

* `withFilePath(java.lang.String)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withIconIndex(java.lang.Integer)` was removed
* `withMsixPackageFamilyName(java.lang.String)` was removed
* `withMsixPackageApplicationId(java.lang.String)` was removed
* `withApplicationType(models.RemoteApplicationType)` was removed
* `withCommandLineArguments(java.lang.String)` was removed
* `withTags(java.util.Map)` was removed
* `withIconPath(java.lang.String)` was removed
* `withShowInPortal(java.lang.Boolean)` was removed
* `withCommandLineSetting(models.CommandLineSetting)` was removed
* `withDescription(java.lang.String)` was removed

#### `models.ApplicationGroup` was modified

* `models.ResourceModelWithAllowedPropertySetPlan plan()` -> `models.Plan plan()`
* `models.ResourceModelWithAllowedPropertySetIdentity identity()` -> `models.ManagedServiceIdentity identity()`
* `models.ResourceModelWithAllowedPropertySetSku sku()` -> `models.Sku sku()`

#### `models.HostPool` was modified

* `models.ResourceModelWithAllowedPropertySetIdentity identity()` -> `models.ManagedServiceIdentity identity()`
* `models.ResourceModelWithAllowedPropertySetSku sku()` -> `models.Sku sku()`
* `models.ResourceModelWithAllowedPropertySetPlan plan()` -> `models.Plan plan()`

#### `models.HostPoolPatch` was modified

* `withRing(java.lang.Integer)` was removed
* `vmTemplate()` was removed
* `withPublicNetworkAccess(models.HostpoolPublicNetworkAccess)` was removed
* `withLoadBalancerType(models.LoadBalancerType)` was removed
* `friendlyName()` was removed
* `startVMOnConnect()` was removed
* `personalDesktopAssignmentType()` was removed
* `withSsoadfsAuthority(java.lang.String)` was removed
* `withDescription(java.lang.String)` was removed
* `withPreferredAppGroupType(models.PreferredAppGroupType)` was removed
* `publicNetworkAccess()` was removed
* `withVmTemplate(java.lang.String)` was removed
* `ssoClientId()` was removed
* `withRegistrationInfo(models.RegistrationInfoPatch)` was removed
* `validationEnvironment()` was removed
* `withStartVMOnConnect(java.lang.Boolean)` was removed
* `withSsoClientSecretKeyVaultPath(java.lang.String)` was removed
* `maxSessionLimit()` was removed
* `agentUpdate()` was removed
* `description()` was removed
* `withAgentUpdate(models.AgentUpdatePatchProperties)` was removed
* `withMaxSessionLimit(java.lang.Integer)` was removed
* `registrationInfo()` was removed
* `ssoadfsAuthority()` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withSsoClientId(java.lang.String)` was removed
* `ring()` was removed
* `withValidationEnvironment(java.lang.Boolean)` was removed
* `preferredAppGroupType()` was removed
* `withPersonalDesktopAssignmentType(models.PersonalDesktopAssignmentType)` was removed
* `withSsoSecretType(models.SsoSecretType)` was removed
* `ssoClientSecretKeyVaultPath()` was removed
* `loadBalancerType()` was removed
* `customRdpProperty()` was removed
* `withCustomRdpProperty(java.lang.String)` was removed
* `ssoSecretType()` was removed

#### `models.AppAttachPackage$Definition` was modified

* `withProperties(models.AppAttachPackageProperties)` was removed

#### `models.PrivateEndpointConnections` was modified

* `updateByWorkspaceWithResponse(java.lang.String,java.lang.String,java.lang.String,models.PrivateEndpointConnection,com.azure.core.util.Context)` was removed
* `updateByHostPoolWithResponse(java.lang.String,java.lang.String,java.lang.String,models.PrivateEndpointConnection,com.azure.core.util.Context)` was removed
* `updateByHostPool(java.lang.String,java.lang.String,java.lang.String,models.PrivateEndpointConnection)` was removed
* `updateByWorkspace(java.lang.String,java.lang.String,java.lang.String,models.PrivateEndpointConnection)` was removed

#### `models.ScalingPlanPersonalSchedule$Update` was modified

* `withOffPeakStartTime(models.Time)` was removed
* `withRampUpAutoStartHosts(models.StartupBehavior)` was removed
* `withRampUpStartTime(models.Time)` was removed
* `withRampUpActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withOffPeakStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withPeakStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withRampDownStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withRampDownMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withRampDownStartTime(models.Time)` was removed
* `withRampUpMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withOffPeakActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withRampDownActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withPeakStartTime(models.Time)` was removed
* `withOffPeakMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withOffPeakActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withRampDownActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withRampDownMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withRampUpStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withPeakMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withRampUpMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withPeakActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withPeakMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withDaysOfWeek(java.util.List)` was removed
* `withPeakActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withRampUpActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withOffPeakMinutesToWaitOnLogoff(java.lang.Integer)` was removed

#### `models.PrivateLinkResource` was modified

* `requiredZoneNames()` was removed
* `groupId()` was removed
* `requiredMembers()` was removed

#### `models.PrivateEndpointConnection` was modified

* `groupIds()` was removed
* `withPrivateLinkServiceConnectionState(models.PrivateLinkServiceConnectionState)` was removed
* `privateEndpoint()` was removed
* `provisioningState()` was removed
* `withPrivateEndpoint(models.PrivateEndpoint)` was removed
* `privateLinkServiceConnectionState()` was removed

#### `models.AppAttachPackages` was modified

* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `deleteByResourceGroup(java.lang.String,java.lang.String)` was removed

#### `models.ScalingPlanPooledSchedulePatch` was modified

* `peakLoadBalancingAlgorithm()` was removed
* `withRampDownStartTime(models.Time)` was removed
* `rampDownLoadBalancingAlgorithm()` was removed
* `rampDownStopHostsWhen()` was removed
* `withRampDownWaitTimeMinutes(java.lang.Integer)` was removed
* `offPeakLoadBalancingAlgorithm()` was removed
* `rampUpStartTime()` was removed
* `withRampUpCapacityThresholdPct(java.lang.Integer)` was removed
* `withPeakLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `rampDownStartTime()` was removed
* `withRampDownMinimumHostsPct(java.lang.Integer)` was removed
* `withRampDownForceLogoffUsers(java.lang.Boolean)` was removed
* `rampUpMinimumHostsPct()` was removed
* `withRampUpLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `rampDownWaitTimeMinutes()` was removed
* `withRampDownStopHostsWhen(models.StopHostsWhen)` was removed
* `rampDownForceLogoffUsers()` was removed
* `rampUpCapacityThresholdPct()` was removed
* `withRampDownNotificationMessage(java.lang.String)` was removed
* `withOffPeakStartTime(models.Time)` was removed
* `withRampDownCapacityThresholdPct(java.lang.Integer)` was removed
* `withRampDownLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `rampUpLoadBalancingAlgorithm()` was removed
* `rampDownMinimumHostsPct()` was removed
* `withPeakStartTime(models.Time)` was removed
* `peakStartTime()` was removed
* `withOffPeakLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withRampUpMinimumHostsPct(java.lang.Integer)` was removed
* `daysOfWeek()` was removed
* `withDaysOfWeek(java.util.List)` was removed
* `withRampUpStartTime(models.Time)` was removed
* `rampDownCapacityThresholdPct()` was removed
* `rampDownNotificationMessage()` was removed
* `offPeakStartTime()` was removed

#### `models.SessionHostPatch` was modified

* `friendlyName()` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withAllowNewSession(java.lang.Boolean)` was removed
* `allowNewSession()` was removed
* `assignedUser()` was removed
* `withAssignedUser(java.lang.String)` was removed

#### `models.MsixPackagePatch` was modified

* `isActive()` was removed
* `withDisplayName(java.lang.String)` was removed
* `withIsActive(java.lang.Boolean)` was removed
* `isRegularRegistration()` was removed
* `displayName()` was removed
* `withIsRegularRegistration(java.lang.Boolean)` was removed

#### `models.ApplicationGroup$Definition` was modified

* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed
* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed

#### `models.ApplicationGroupPatch` was modified

* `showInFeed()` was removed
* `friendlyName()` was removed
* `withShowInFeed(java.lang.Boolean)` was removed
* `withDescription(java.lang.String)` was removed
* `description()` was removed
* `withFriendlyName(java.lang.String)` was removed

#### `models.HostPool$Definition` was modified

* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed
* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed

#### `models.ScalingPlanPooledSchedule` was modified

* `java.lang.Integer rampUpCapacityThresholdPct()` -> `int rampUpCapacityThresholdPct()`
* `java.lang.Integer rampDownCapacityThresholdPct()` -> `int rampDownCapacityThresholdPct()`

#### `models.ScalingPlanPatch` was modified

* `withDescription(java.lang.String)` was removed
* `withSchedules(java.util.List)` was removed
* `exclusionTag()` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withHostPoolReferences(java.util.List)` was removed
* `timeZone()` was removed
* `schedules()` was removed
* `friendlyName()` was removed
* `description()` was removed
* `withExclusionTag(java.lang.String)` was removed
* `withTimeZone(java.lang.String)` was removed
* `hostPoolReferences()` was removed

#### `models.Workspace$Update` was modified

* `withFriendlyName(java.lang.String)` was removed
* `withApplicationGroupReferences(java.util.List)` was removed
* `withPublicNetworkAccess(models.PublicNetworkAccess)` was removed
* `withDescription(java.lang.String)` was removed

#### `models.AppAttachPackage` was modified

* `properties()` was removed

#### `models.ExpandMsixImage` was modified

* `lastUpdated()` was removed
* `packageFullName()` was removed
* `imagePath()` was removed
* `version()` was removed
* `packageAlias()` was removed
* `packageName()` was removed
* `certificateName()` was removed
* `certificateExpiry()` was removed
* `isActive()` was removed
* `packageApplications()` was removed
* `packageDependencies()` was removed
* `isRegularRegistration()` was removed
* `packageFamilyName()` was removed
* `packageRelativePath()` was removed
* `displayName()` was removed

#### `models.SessionHosts` was modified

* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was removed

#### `models.ScalingPlanPersonalSchedulePatch` was modified

* `rampDownActionOnLogoff()` was removed
* `peakActionOnLogoff()` was removed
* `peakActionOnDisconnect()` was removed
* `peakStartVMOnConnect()` was removed
* `withDaysOfWeek(java.util.List)` was removed
* `withOffPeakActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withRampDownStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `peakStartTime()` was removed
* `daysOfWeek()` was removed
* `withPeakMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withRampDownActionOnLogoff(models.SessionHandlingOperation)` was removed
* `rampDownStartVMOnConnect()` was removed
* `withRampUpMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `offPeakActionOnDisconnect()` was removed
* `rampDownActionOnDisconnect()` was removed
* `offPeakMinutesToWaitOnDisconnect()` was removed
* `rampDownMinutesToWaitOnLogoff()` was removed
* `rampDownMinutesToWaitOnDisconnect()` was removed
* `withOffPeakActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withOffPeakMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `rampDownStartTime()` was removed
* `withRampUpMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `peakMinutesToWaitOnDisconnect()` was removed
* `withRampUpStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `peakMinutesToWaitOnLogoff()` was removed
* `withPeakStartTime(models.Time)` was removed
* `withRampUpStartTime(models.Time)` was removed
* `withRampUpActionOnLogoff(models.SessionHandlingOperation)` was removed
* `offPeakStartTime()` was removed
* `rampUpActionOnDisconnect()` was removed
* `withPeakActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `rampUpMinutesToWaitOnLogoff()` was removed
* `withRampDownActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withRampUpAutoStartHosts(models.StartupBehavior)` was removed
* `withPeakMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withOffPeakMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `rampUpStartVMOnConnect()` was removed
* `rampUpActionOnLogoff()` was removed
* `withPeakStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `rampUpMinutesToWaitOnDisconnect()` was removed
* `offPeakStartVMOnConnect()` was removed
* `withRampUpActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withRampDownStartTime(models.Time)` was removed
* `offPeakMinutesToWaitOnLogoff()` was removed
* `withRampDownMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withOffPeakStartTime(models.Time)` was removed
* `withOffPeakStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `rampUpAutoStartHosts()` was removed
* `rampUpStartTime()` was removed
* `offPeakActionOnLogoff()` was removed
* `withRampDownMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withPeakActionOnLogoff(models.SessionHandlingOperation)` was removed

#### `models.ScalingPlan` was modified

* `models.ResourceModelWithAllowedPropertySetSku sku()` -> `models.Sku sku()`
* `models.ResourceModelWithAllowedPropertySetPlan plan()` -> `models.Plan plan()`
* `models.ResourceModelWithAllowedPropertySetIdentity identity()` -> `models.ManagedServiceIdentity identity()`

#### `models.ScalingPlan$Definition` was modified

* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed
* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed

#### `models.Workspace$Definition` was modified

* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed
* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed

#### `models.ApplicationPatch` was modified

* `description()` was removed
* `withCommandLineSetting(models.CommandLineSetting)` was removed
* `withDescription(java.lang.String)` was removed
* `commandLineSetting()` was removed
* `iconIndex()` was removed
* `withIconPath(java.lang.String)` was removed
* `friendlyName()` was removed
* `withCommandLineArguments(java.lang.String)` was removed
* `withFilePath(java.lang.String)` was removed
* `withShowInPortal(java.lang.Boolean)` was removed
* `withMsixPackageFamilyName(java.lang.String)` was removed
* `msixPackageFamilyName()` was removed
* `tags()` was removed
* `withFriendlyName(java.lang.String)` was removed
* `iconPath()` was removed
* `applicationType()` was removed
* `withMsixPackageApplicationId(java.lang.String)` was removed
* `commandLineArguments()` was removed
* `msixPackageApplicationId()` was removed
* `showInPortal()` was removed
* `withIconIndex(java.lang.Integer)` was removed
* `withApplicationType(models.RemoteApplicationType)` was removed
* `withTags(java.util.Map)` was removed
* `filePath()` was removed

#### `models.ApplicationGroup$Update` was modified

* `withShowInFeed(java.lang.Boolean)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withDescription(java.lang.String)` was removed

### Features Added

* `models.SessionHostManagementList` was added

* `models.VirtualMachineDiskType` was added

* `models.MarketplaceInfoPatchProperties` was added

* `models.ActiveDirectoryInfoProperties` was added

* `models.DiskInfoProperties` was added

* `models.SessionHostConfigurations` was added

* `models.UserAssignedIdentity` was added

* `models.AzureActiveDirectoryInfoProperties` was added

* `models.MsixPackagePatchProperties` was added

* `models.ScalingMethodType` was added

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

* `models.SessionHostManagementUpdateOperationStatus` was added

* `models.ScalingPlanPooledSchedulePatchProperties` was added

* `models.DesktopPatchProperties` was added

* `models.SecurityInfoPatchProperties` was added

* `models.HostPoolPatchProperties` was added

* `models.BootDiagnosticsInfoProperties` was added

* `models.ActiveSessionHostConfiguration` was added

* `models.ApplicationGroupPatchProperties` was added

* `models.ControlSessionHostUpdates` was added

* `models.DomainInfoProperties` was added

* `models.ActiveSessionHostConfigurationList` was added

* `models.CustomInfoPatchProperties` was added

* `models.ExpandMsixImageProperties` was added

* `models.ManagedServiceIdentityType` was added

* `models.ActiveSessionHostConfigurations` was added

* `models.SessionHostConfigurationPatch` was added

* `models.SessionHostManagementPatch` was added

* `models.BootDiagnosticsInfoPatchProperties` was added

* `models.DirectUdp` was added

* `models.WorkspacePatchProperties` was added

* `models.ScalingPlanPatchProperties` was added

* `models.NetworkInfoPatchProperties` was added

* `models.SessionHostManagement` was added

* `models.MarketplaceInfoProperties` was added

* `models.SecurityInfoProperties` was added

* `models.PrivateLinkResourceProperties` was added

* `models.HostPoolUpdateAction` was added

* `models.ManagedPrivateUdp` was added

* `models.UpdateSessionHostsRequestBody` was added

* `models.InitiateSessionHostUpdates` was added

* `models.ProvisioningStateShc` was added

* `models.HostPoolUpdateControlParameter` was added

* `models.ImageInfoProperties` was added

* `models.DiskInfoPatchProperties` was added

* `models.HostPoolUpdateConfigurationProperties` was added

* `models.SessionHostPatchProperties` was added

* `models.NetworkInfoProperties` was added

* `models.ResourceProviderOperationListResult` was added

* `models.SessionHostConfigurationPatchProperties` was added

* `models.VirtualMachineSecurityType` was added

* `models.ManagementType` was added

* `models.SessionHostManagementPatchProperties` was added

* `models.SessionHostManagementUpdateStatusProperties` was added

* `models.RelayUdp` was added

* `models.ActiveDirectoryInfoPatchProperties` was added

* `models.DomainJoinType` was added

* `models.ScalingPlanPersonalSchedulePatchProperties` was added

* `models.HostPoolUpdateConfigurationPatchProperties` was added

* `models.ApplicationPatchProperties` was added

* `models.CustomInfoProperties` was added

* `models.SessionHostManagements` was added

* `models.Type` was added

* `models.StartMenuItemProperties` was added

* `models.CreateDeleteProperties` was added

#### `models.ExpandMsixImageList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ScalingPlanPooledSchedule$Definition` was modified

* `withNamePropertiesName(java.lang.String)` was added
* `withRampDownCapacityThresholdPct(int)` was added
* `withRampUpCapacityThresholdPct(int)` was added
* `withCreateDelete(models.CreateDeleteProperties)` was added
* `withScalingMethod(models.ScalingMethodType)` was added

#### `models.HostPoolList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.SessionHostList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.StartMenuItemList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ScalingPlanPooledSchedule$Update` was modified

* `withProperties(models.ScalingPlanPooledSchedulePatchProperties)` was added

#### `models.HostPool$Update` was modified

* `withProperties(models.HostPoolPatchProperties)` was added

#### `models.ScalingPlan$Update` was modified

* `withProperties(models.ScalingPlanPatchProperties)` was added

#### `models.AppAttachPackagePatch` was modified

* `withTags(java.util.Map)` was added
* `tags()` was added

#### `models.StartMenuItem` was modified

* `properties()` was added

#### `models.AppAttachPackagePatchProperties` was modified

* `packageLookbackUrl()` was added
* `withCustomData(java.lang.String)` was added
* `withPackageLookbackUrl(java.lang.String)` was added
* `customData()` was added

#### `models.WorkspacePatch` was modified

* `properties()` was added
* `withProperties(models.WorkspacePatchProperties)` was added

#### `models.MsixPackage$Update` was modified

* `withProperties(models.MsixPackagePatchProperties)` was added

#### `models.DesktopPatch` was modified

* `properties()` was added
* `withProperties(models.DesktopPatchProperties)` was added

#### `models.ScalingSchedule` was modified

* `withCreateDelete(models.CreateDeleteProperties)` was added
* `scalingMethod()` was added
* `withScalingMethod(models.ScalingMethodType)` was added
* `createDelete()` was added

#### `models.Application$Update` was modified

* `withProperties(models.ApplicationPatchProperties)` was added

#### `models.ScalingPlanPersonalScheduleList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.MsixPackageList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.HostPool` was modified

* `relayUdp()` was added
* `managementType()` was added
* `managedPrivateUdp()` was added
* `directUdp()` was added
* `publicUdp()` was added

#### `models.HostPoolPatch` was modified

* `withProperties(models.HostPoolPatchProperties)` was added
* `properties()` was added

#### `models.AppAttachPackage$Definition` was modified

* `withPackageLookbackUrl(java.lang.String)` was added
* `withCustomData(java.lang.String)` was added
* `withKeyVaultUrl(java.lang.String)` was added
* `withHostPoolReferences(java.util.List)` was added
* `withImage(models.AppAttachPackageInfoProperties)` was added
* `withPackageOwnerName(java.lang.String)` was added
* `withFailHealthCheckOnStagingFailure(models.FailHealthCheckOnStagingFailure)` was added

#### `models.PrivateEndpointConnections` was modified

* `updateByWorkspaceWithResponse(java.lang.String,java.lang.String,java.lang.String,fluent.models.PrivateEndpointConnectionWithSystemDataInner,com.azure.core.util.Context)` was added
* `updateByWorkspace(java.lang.String,java.lang.String,java.lang.String,fluent.models.PrivateEndpointConnectionWithSystemDataInner)` was added
* `updateByHostPoolWithResponse(java.lang.String,java.lang.String,java.lang.String,fluent.models.PrivateEndpointConnectionWithSystemDataInner,com.azure.core.util.Context)` was added
* `updateByHostPool(java.lang.String,java.lang.String,java.lang.String,fluent.models.PrivateEndpointConnectionWithSystemDataInner)` was added

#### `models.ScalingPlanPersonalSchedule$Update` was modified

* `withProperties(models.ScalingPlanPersonalSchedulePatchProperties)` was added

#### `models.PrivateLinkResource` was modified

* `properties()` was added

#### `models.WorkspaceList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.HostPoolProperties` was modified

* `directUdp()` was added
* `managementType()` was added
* `relayUdp()` was added
* `managedPrivateUdp()` was added
* `publicUdp()` was added

#### `DesktopVirtualizationManager` was modified

* `sessionHostManagementsUpdateStatus()` was added
* `initiateSessionHostUpdates()` was added
* `sessionHostManagements()` was added
* `sessionHostConfigurations()` was added
* `controlSessionHostUpdates()` was added
* `activeSessionHostConfigurations()` was added

#### `models.ApplicationList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.PrivateEndpointConnection` was modified

* `properties()` was added
* `withProperties(fluent.models.PrivateEndpointConnectionProperties)` was added

#### `models.ApplicationGroupList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.AppAttachPackages` was modified

* `deleteByIdWithResponse(java.lang.String,java.lang.Boolean,com.azure.core.util.Context)` was added
* `deleteWithResponse(java.lang.String,java.lang.String,java.lang.Boolean,com.azure.core.util.Context)` was added
* `delete(java.lang.String,java.lang.String)` was added

#### `models.AppAttachPackage$Update` was modified

* `withTags(java.util.Map)` was added

#### `models.ScalingPlanPooledSchedulePatch` was modified

* `withProperties(models.ScalingPlanPooledSchedulePatchProperties)` was added
* `properties()` was added

#### `models.SessionHostPatch` was modified

* `withProperties(models.SessionHostPatchProperties)` was added
* `properties()` was added

#### `models.MsixPackagePatch` was modified

* `properties()` was added
* `withProperties(models.MsixPackagePatchProperties)` was added

#### `models.ApplicationGroup$Definition` was modified

* `withSku(models.Sku)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added
* `withPlan(models.Plan)` was added

#### `models.ScalingPlanPooledScheduleList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.AppAttachPackageList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ApplicationGroupPatch` was modified

* `properties()` was added
* `withProperties(models.ApplicationGroupPatchProperties)` was added

#### `models.HostPool$Definition` was modified

* `withDirectUdp(models.DirectUdp)` was added
* `withRelayUdp(models.RelayUdp)` was added
* `withPublicUdp(models.PublicUdp)` was added
* `withManagedPrivateUdp(models.ManagedPrivateUdp)` was added
* `withSku(models.Sku)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added
* `withManagementType(models.ManagementType)` was added
* `withPlan(models.Plan)` was added

#### `models.ScalingPlanPooledSchedule` was modified

* `namePropertiesName()` was added
* `scalingMethod()` was added
* `createDelete()` was added

#### `models.ScalingPlanPatch` was modified

* `withProperties(models.ScalingPlanPatchProperties)` was added
* `properties()` was added

#### `models.Workspace$Update` was modified

* `withProperties(models.WorkspacePatchProperties)` was added

#### `models.SessionHost` was modified

* `pendingSessions()` was added
* `activeSessions()` was added
* `disconnectedSessions()` was added
* `sessionHostConfiguration()` was added
* `lastSessionHostUpdateTime()` was added

#### `models.AppAttachPackage` was modified

* `packageOwnerName()` was added
* `failHealthCheckOnStagingFailure()` was added
* `keyVaultUrl()` was added
* `customData()` was added
* `image()` was added
* `packageLookbackUrl()` was added
* `hostPoolReferences()` was added
* `provisioningState()` was added

#### `models.PrivateLinkResourceListResult` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ExpandMsixImage` was modified

* `properties()` was added

#### `models.SessionHosts` was modified

* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,java.lang.String,com.azure.core.util.Context)` was added
* `retryProvisioning(java.lang.String,java.lang.String,java.lang.String)` was added
* `retryProvisioningWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.PrivateEndpointConnectionListResultWithSystemData` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ScalingPlanList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ScalingPlanPersonalSchedulePatch` was modified

* `properties()` was added
* `withProperties(models.ScalingPlanPersonalSchedulePatchProperties)` was added

#### `models.UserSessionList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ScalingPlan$Definition` was modified

* `withIdentity(models.ManagedServiceIdentity)` was added
* `withSku(models.Sku)` was added
* `withPlan(models.Plan)` was added

#### `models.Workspace$Definition` was modified

* `withSku(models.Sku)` was added
* `withPlan(models.Plan)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added

#### `models.DesktopList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ApplicationPatch` was modified

* `properties()` was added
* `withProperties(models.ApplicationPatchProperties)` was added

#### `models.ApplicationGroup$Update` was modified

* `withProperties(models.ApplicationGroupPatchProperties)` was added

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
