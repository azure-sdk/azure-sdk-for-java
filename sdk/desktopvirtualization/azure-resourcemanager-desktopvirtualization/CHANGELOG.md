# Release History

## 1.0.0-beta.1 (2024-12-03)

- Azure Resource Manager DesktopVirtualization client library for Java. This package contains Microsoft Azure SDK for DesktopVirtualization Management SDK. This Typespec represents the Desktop Virtualization API interfaces. Package tag package-2024-09. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.PrivateEndpointConnectionWithSystemData` was removed

#### `models.OperationProperties` was removed

#### `models.SkuTier` was removed

#### `models.ResourceProviderOperation` was removed

#### `models.ResourceIdentityType` was removed

#### `models.ResourceModelWithAllowedPropertySetPlan` was removed

#### `models.PrivateLinkResources` was removed

#### `models.ResourceProviderOperationList` was removed

#### `models.PrivateEndpointConnections` was removed

#### `models.ResourceModelWithAllowedPropertySet` was removed

#### `models.ResourceProviderOperationDisplay` was removed

#### `models.StartMenuItems` was removed

#### `models.MsixImages` was removed

#### `models.Sku` was removed

#### `models.LogSpecification` was removed

#### `models.Identity` was removed

#### `models.ServiceSpecification` was removed

#### `models.PrivateEndpointConnectionListResultWithSystemData` was removed

#### `models.AppAttachPackageInfoes` was removed

#### `models.ResourceModelWithAllowedPropertySetIdentity` was removed

#### `models.Plan` was removed

#### `models.ResourceModelWithAllowedPropertySetSku` was removed

#### `models.ScalingPlanPersonalSchedule$DefinitionStages` was modified

* Required stage 2 was added

#### `models.ScalingPlan$DefinitionStages` was modified

* `withTimeZone(java.lang.String)` was removed in stage 3

#### `models.ScalingPlanPooledSchedule$DefinitionStages` was modified

* Required stage 2 was added

#### `models.ApplicationGroup$DefinitionStages` was modified

* `withHostPoolArmPath(java.lang.String)` was removed in stage 3

#### `models.MsixPackage$DefinitionStages` was modified

* `withExistingHostPool(java.lang.String,java.lang.String)` was removed in stage 1

#### `models.HostPool$DefinitionStages` was modified

* `withHostPoolType(models.HostPoolType)` was removed in stage 3

#### `models.Application$DefinitionStages` was modified

* `withCommandLineSetting(models.CommandLineSetting)` was removed in stage 2

#### `models.ScalingPlanPooledSchedule$Definition` was modified

* `withRampDownMinimumHostsPct(java.lang.Integer)` was removed
* `withRampUpStartTime(models.Time)` was removed
* `withPeakStartTime(models.Time)` was removed
* `withOffPeakLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withDaysOfWeek(java.util.List)` was removed
* `withRampDownForceLogoffUsers(java.lang.Boolean)` was removed
* `withRampUpLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withRampDownLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withRampDownCapacityThresholdPct(java.lang.Integer)` was removed
* `withRampUpMinimumHostsPct(java.lang.Integer)` was removed
* `withRampDownStopHostsWhen(models.StopHostsWhen)` was removed
* `withRampDownNotificationMessage(java.lang.String)` was removed
* `withOffPeakStartTime(models.Time)` was removed
* `withPeakLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withRampUpCapacityThresholdPct(java.lang.Integer)` was removed
* `withRampDownStartTime(models.Time)` was removed
* `withRampDownWaitTimeMinutes(java.lang.Integer)` was removed

#### `models.UserSession` was modified

* `userPrincipalName()` was removed
* `applicationType()` was removed
* `createTime()` was removed
* `sessionState()` was removed
* `objectId()` was removed
* `activeDirectoryUsername()` was removed

#### `models.ScalingPlanPooledSchedule$Update` was modified

* `withRampDownCapacityThresholdPct(java.lang.Integer)` was removed
* `withRampDownStopHostsWhen(models.StopHostsWhen)` was removed
* `withRampDownMinimumHostsPct(java.lang.Integer)` was removed
* `withPeakStartTime(models.Time)` was removed
* `withRampUpMinimumHostsPct(java.lang.Integer)` was removed
* `withRampDownForceLogoffUsers(java.lang.Boolean)` was removed
* `withOffPeakStartTime(models.Time)` was removed
* `withPeakLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withRampDownWaitTimeMinutes(java.lang.Integer)` was removed
* `withRampUpLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withRampDownStartTime(models.Time)` was removed
* `withRampDownNotificationMessage(java.lang.String)` was removed
* `withRampUpStartTime(models.Time)` was removed
* `withOffPeakLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withDaysOfWeek(java.util.List)` was removed
* `withRampDownLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withRampUpCapacityThresholdPct(java.lang.Integer)` was removed

#### `models.HostPool$Update` was modified

* `withRing(java.lang.Integer)` was removed
* `withSsoClientId(java.lang.String)` was removed
* `withSsoClientSecretKeyVaultPath(java.lang.String)` was removed
* `withPersonalDesktopAssignmentType(models.PersonalDesktopAssignmentType)` was removed
* `withLoadBalancerType(models.LoadBalancerType)` was removed
* `withSsoadfsAuthority(java.lang.String)` was removed
* `withStartVMOnConnect(java.lang.Boolean)` was removed
* `withCustomRdpProperty(java.lang.String)` was removed
* `withMaxSessionLimit(java.lang.Integer)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withDescription(java.lang.String)` was removed
* `withRegistrationInfo(models.RegistrationInfoPatch)` was removed
* `withVmTemplate(java.lang.String)` was removed
* `withPublicNetworkAccess(models.HostpoolPublicNetworkAccess)` was removed
* `withSsoSecretType(models.SsoSecretType)` was removed
* `withValidationEnvironment(java.lang.Boolean)` was removed
* `withPreferredAppGroupType(models.PreferredAppGroupType)` was removed
* `withAgentUpdate(models.AgentUpdatePatchProperties)` was removed

#### `models.ScalingPlan$Update` was modified

* `withExclusionTag(java.lang.String)` was removed
* `withHostPoolReferences(java.util.List)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withDescription(java.lang.String)` was removed
* `withTimeZone(java.lang.String)` was removed
* `withSchedules(java.util.List)` was removed

#### `models.StartMenuItem` was modified

* `commandLineArguments()` was removed
* `filePath()` was removed
* `appAlias()` was removed
* `iconIndex()` was removed
* `iconPath()` was removed

#### `models.Desktops` was modified

* `update(java.lang.String,java.lang.String,java.lang.String)` was removed

#### `models.WorkspacePatch` was modified

* `withDescription(java.lang.String)` was removed
* `applicationGroupReferences()` was removed
* `withPublicNetworkAccess(models.PublicNetworkAccess)` was removed
* `friendlyName()` was removed
* `withApplicationGroupReferences(java.util.List)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `description()` was removed
* `publicNetworkAccess()` was removed

#### `models.ScalingPlanPersonalSchedule` was modified

* `rampUpStartTime()` was removed
* `rampUpAutoStartHosts()` was removed
* `rampUpActionOnDisconnect()` was removed
* `peakStartVMOnConnect()` was removed
* `offPeakMinutesToWaitOnLogoff()` was removed
* `peakMinutesToWaitOnLogoff()` was removed
* `rampDownStartVMOnConnect()` was removed
* `rampUpMinutesToWaitOnDisconnect()` was removed
* `daysOfWeek()` was removed
* `rampDownMinutesToWaitOnDisconnect()` was removed
* `rampUpMinutesToWaitOnLogoff()` was removed
* `peakActionOnLogoff()` was removed
* `peakStartTime()` was removed
* `offPeakActionOnLogoff()` was removed
* `offPeakMinutesToWaitOnDisconnect()` was removed
* `rampDownActionOnLogoff()` was removed
* `rampUpActionOnLogoff()` was removed
* `offPeakStartVMOnConnect()` was removed
* `rampUpStartVMOnConnect()` was removed
* `peakActionOnDisconnect()` was removed
* `rampDownMinutesToWaitOnLogoff()` was removed
* `rampDownActionOnDisconnect()` was removed
* `offPeakStartTime()` was removed
* `rampDownStartTime()` was removed
* `peakMinutesToWaitOnDisconnect()` was removed
* `offPeakActionOnDisconnect()` was removed

#### `models.ScalingPlanPersonalSchedule$Definition` was modified

* `withPeakStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withOffPeakActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withPeakActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withRampUpMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withRampDownStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withRampDownMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withOffPeakActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withDaysOfWeek(java.util.List)` was removed
* `withRampUpAutoStartHosts(models.StartupBehavior)` was removed
* `withPeakActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withRampUpStartTime(models.Time)` was removed
* `withOffPeakStartTime(models.Time)` was removed
* `withRampDownMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withPeakMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withOffPeakMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withRampUpActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withRampDownActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withRampUpStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withOffPeakStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withPeakMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withRampDownStartTime(models.Time)` was removed
* `withRampDownActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withRampUpMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withPeakStartTime(models.Time)` was removed
* `withOffPeakMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withRampUpActionOnDisconnect(models.SessionHandlingOperation)` was removed

#### `models.MsixPackage$Update` was modified

* `withDisplayName(java.lang.String)` was removed
* `withIsActive(java.lang.Boolean)` was removed
* `withIsRegularRegistration(java.lang.Boolean)` was removed

#### `models.Workspace` was modified

* `managedBy()` was removed
* `privateEndpointConnections()` was removed
* `sku()` was removed
* `identity()` was removed
* `plan()` was removed
* `friendlyName()` was removed
* `cloudPcResource()` was removed
* `objectId()` was removed
* `etag()` was removed
* `publicNetworkAccess()` was removed
* `description()` was removed
* `kind()` was removed
* `applicationGroupReferences()` was removed

#### `models.MsixPackage$Definition` was modified

* `withLastUpdated(java.time.OffsetDateTime)` was removed
* `withVersion(java.lang.String)` was removed
* `withPackageFamilyName(java.lang.String)` was removed
* `withPackageDependencies(java.util.List)` was removed
* `withIsRegularRegistration(java.lang.Boolean)` was removed
* `withIsActive(java.lang.Boolean)` was removed
* `withPackageApplications(java.util.List)` was removed
* `withExistingHostPool(java.lang.String,java.lang.String)` was removed
* `withDisplayName(java.lang.String)` was removed
* `withPackageRelativePath(java.lang.String)` was removed
* `withImagePath(java.lang.String)` was removed
* `withPackageName(java.lang.String)` was removed

#### `models.DesktopPatch` was modified

* `description()` was removed
* `friendlyName()` was removed
* `withDescription(java.lang.String)` was removed
* `withFriendlyName(java.lang.String)` was removed

#### `models.Application` was modified

* `iconIndex()` was removed
* `iconContent()` was removed
* `filePath()` was removed
* `objectId()` was removed
* `description()` was removed
* `iconPath()` was removed
* `commandLineSetting()` was removed
* `applicationType()` was removed
* `msixPackageApplicationId()` was removed
* `showInPortal()` was removed
* `commandLineArguments()` was removed
* `msixPackageFamilyName()` was removed
* `iconHash()` was removed
* `friendlyName()` was removed

#### `models.Application$Update` was modified

* `withApplicationType(models.RemoteApplicationType)` was removed
* `withCommandLineSetting(models.CommandLineSetting)` was removed
* `withFilePath(java.lang.String)` was removed
* `withDescription(java.lang.String)` was removed
* `withIconPath(java.lang.String)` was removed
* `withShowInPortal(java.lang.Boolean)` was removed
* `withMsixPackageApplicationId(java.lang.String)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withIconIndex(java.lang.Integer)` was removed
* `withCommandLineArguments(java.lang.String)` was removed
* `withMsixPackageFamilyName(java.lang.String)` was removed

#### `models.Application$Definition` was modified

* `withShowInPortal(java.lang.Boolean)` was removed
* `withDescription(java.lang.String)` was removed
* `withIconPath(java.lang.String)` was removed
* `withApplicationType(models.RemoteApplicationType)` was removed
* `withFilePath(java.lang.String)` was removed
* `withCommandLineArguments(java.lang.String)` was removed
* `withCommandLineSetting(models.CommandLineSetting)` was removed
* `withMsixPackageApplicationId(java.lang.String)` was removed
* `withMsixPackageFamilyName(java.lang.String)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withIconIndex(java.lang.Integer)` was removed

#### `models.ApplicationGroup` was modified

* `identity()` was removed
* `description()` was removed
* `hostPoolArmPath()` was removed
* `applicationGroupType()` was removed
* `objectId()` was removed
* `workspaceArmPath()` was removed
* `sku()` was removed
* `cloudPcResource()` was removed
* `kind()` was removed
* `showInFeed()` was removed
* `plan()` was removed
* `friendlyName()` was removed
* `managedBy()` was removed
* `etag()` was removed

#### `models.ScalingPlans` was modified

* `listByHostPool(java.lang.String,java.lang.String)` was removed
* `listByHostPool(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was removed

#### `models.HostPool` was modified

* `agentUpdate()` was removed
* `identity()` was removed
* `privateEndpointConnections()` was removed
* `sku()` was removed
* `maxSessionLimit()` was removed
* `validationEnvironment()` was removed
* `cloudPcResource()` was removed
* `registrationInfo()` was removed
* `ssoadfsAuthority()` was removed
* `managedBy()` was removed
* `customRdpProperty()` was removed
* `hostPoolType()` was removed
* `applicationGroupReferences()` was removed
* `personalDesktopAssignmentType()` was removed
* `etag()` was removed
* `description()` was removed
* `ssoClientSecretKeyVaultPath()` was removed
* `plan()` was removed
* `vmTemplate()` was removed
* `ring()` was removed
* `publicNetworkAccess()` was removed
* `preferredAppGroupType()` was removed
* `friendlyName()` was removed
* `kind()` was removed
* `ssoClientId()` was removed
* `appAttachPackageReferences()` was removed
* `startVMOnConnect()` was removed
* `objectId()` was removed
* `loadBalancerType()` was removed
* `ssoSecretType()` was removed

#### `models.HostPoolPatch` was modified

* `loadBalancerType()` was removed
* `ssoadfsAuthority()` was removed
* `ring()` was removed
* `withMaxSessionLimit(java.lang.Integer)` was removed
* `withPublicNetworkAccess(models.HostpoolPublicNetworkAccess)` was removed
* `withSsoClientId(java.lang.String)` was removed
* `withDescription(java.lang.String)` was removed
* `ssoSecretType()` was removed
* `friendlyName()` was removed
* `ssoClientSecretKeyVaultPath()` was removed
* `withRegistrationInfo(models.RegistrationInfoPatch)` was removed
* `withSsoadfsAuthority(java.lang.String)` was removed
* `startVMOnConnect()` was removed
* `withVmTemplate(java.lang.String)` was removed
* `withPersonalDesktopAssignmentType(models.PersonalDesktopAssignmentType)` was removed
* `agentUpdate()` was removed
* `withRing(java.lang.Integer)` was removed
* `withLoadBalancerType(models.LoadBalancerType)` was removed
* `withStartVMOnConnect(java.lang.Boolean)` was removed
* `withSsoClientSecretKeyVaultPath(java.lang.String)` was removed
* `withCustomRdpProperty(java.lang.String)` was removed
* `registrationInfo()` was removed
* `customRdpProperty()` was removed
* `personalDesktopAssignmentType()` was removed
* `withAgentUpdate(models.AgentUpdatePatchProperties)` was removed
* `ssoClientId()` was removed
* `maxSessionLimit()` was removed
* `withValidationEnvironment(java.lang.Boolean)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withPreferredAppGroupType(models.PreferredAppGroupType)` was removed
* `validationEnvironment()` was removed
* `withSsoSecretType(models.SsoSecretType)` was removed
* `preferredAppGroupType()` was removed
* `publicNetworkAccess()` was removed
* `vmTemplate()` was removed
* `description()` was removed

#### `models.ScalingPlanPersonalSchedule$Update` was modified

* `withPeakStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withPeakActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withOffPeakStartTime(models.Time)` was removed
* `withPeakMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withRampDownStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withOffPeakActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withRampUpMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withRampUpMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withRampUpAutoStartHosts(models.StartupBehavior)` was removed
* `withRampDownActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withOffPeakMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withOffPeakActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withPeakStartTime(models.Time)` was removed
* `withOffPeakStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withRampUpStartTime(models.Time)` was removed
* `withPeakMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withRampDownActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withPeakActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withRampUpStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withRampDownMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withDaysOfWeek(java.util.List)` was removed
* `withRampDownStartTime(models.Time)` was removed
* `withOffPeakMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withRampUpActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withRampUpActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withRampDownMinutesToWaitOnLogoff(java.lang.Integer)` was removed

#### `models.UserSessions` was modified

* `listByHostPool(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was removed
* `sendMessage(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was removed
* `listByHostPool(java.lang.String,java.lang.String)` was removed

#### `models.PrivateLinkResource` was modified

* `requiredZoneNames()` was removed
* `groupId()` was removed
* `requiredMembers()` was removed

#### `DesktopVirtualizationManager` was modified

* `privateEndpointConnections()` was removed
* `privateLinkResources()` was removed
* `appAttachPackageInfoes()` was removed
* `startMenuItems()` was removed
* `msixImages()` was removed

#### `models.PrivateEndpointConnection` was modified

* `withPrivateEndpoint(models.PrivateEndpoint)` was removed
* `privateLinkServiceConnectionState()` was removed
* `withPrivateLinkServiceConnectionState(models.PrivateLinkServiceConnectionState)` was removed
* `groupIds()` was removed
* `provisioningState()` was removed
* `privateEndpoint()` was removed

#### `models.ScalingPlanPooledSchedulePatch` was modified

* `offPeakStartTime()` was removed
* `withRampDownStartTime(models.Time)` was removed
* `withRampUpMinimumHostsPct(java.lang.Integer)` was removed
* `withRampDownCapacityThresholdPct(java.lang.Integer)` was removed
* `withRampUpCapacityThresholdPct(java.lang.Integer)` was removed
* `peakStartTime()` was removed
* `peakLoadBalancingAlgorithm()` was removed
* `withOffPeakLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withRampUpLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `rampUpMinimumHostsPct()` was removed
* `withRampDownMinimumHostsPct(java.lang.Integer)` was removed
* `rampUpLoadBalancingAlgorithm()` was removed
* `withRampDownLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed
* `withOffPeakStartTime(models.Time)` was removed
* `rampDownStartTime()` was removed
* `rampDownStopHostsWhen()` was removed
* `withRampUpStartTime(models.Time)` was removed
* `rampDownLoadBalancingAlgorithm()` was removed
* `rampUpStartTime()` was removed
* `rampUpCapacityThresholdPct()` was removed
* `rampDownNotificationMessage()` was removed
* `offPeakLoadBalancingAlgorithm()` was removed
* `rampDownCapacityThresholdPct()` was removed
* `withRampDownWaitTimeMinutes(java.lang.Integer)` was removed
* `withPeakStartTime(models.Time)` was removed
* `withRampDownStopHostsWhen(models.StopHostsWhen)` was removed
* `rampDownForceLogoffUsers()` was removed
* `rampDownMinimumHostsPct()` was removed
* `rampDownWaitTimeMinutes()` was removed
* `withRampDownForceLogoffUsers(java.lang.Boolean)` was removed
* `daysOfWeek()` was removed
* `withRampDownNotificationMessage(java.lang.String)` was removed
* `withDaysOfWeek(java.util.List)` was removed
* `withPeakLoadBalancingAlgorithm(models.SessionHostLoadBalancingAlgorithm)` was removed

#### `models.Desktop` was modified

* `objectId()` was removed
* `friendlyName()` was removed
* `iconHash()` was removed
* `description()` was removed
* `iconContent()` was removed

#### `models.SessionHostPatch` was modified

* `allowNewSession()` was removed
* `withAllowNewSession(java.lang.Boolean)` was removed
* `withAssignedUser(java.lang.String)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `assignedUser()` was removed
* `friendlyName()` was removed

#### `models.MsixPackagePatch` was modified

* `withIsActive(java.lang.Boolean)` was removed
* `withIsRegularRegistration(java.lang.Boolean)` was removed
* `isRegularRegistration()` was removed
* `withDisplayName(java.lang.String)` was removed
* `isActive()` was removed
* `displayName()` was removed

#### `models.ApplicationGroup$Definition` was modified

* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed
* `withApplicationGroupType(models.ApplicationGroupType)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withManagedBy(java.lang.String)` was removed
* `withDescription(java.lang.String)` was removed
* `withShowInFeed(java.lang.Boolean)` was removed
* `withKind(java.lang.String)` was removed
* `withHostPoolArmPath(java.lang.String)` was removed

#### `models.MsixPackage` was modified

* `packageDependencies()` was removed
* `imagePath()` was removed
* `packageName()` was removed
* `resourceGroupName()` was removed
* `packageRelativePath()` was removed
* `packageFamilyName()` was removed
* `isActive()` was removed
* `packageApplications()` was removed
* `version()` was removed
* `lastUpdated()` was removed
* `displayName()` was removed
* `isRegularRegistration()` was removed

#### `models.ApplicationGroupPatch` was modified

* `showInFeed()` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withDescription(java.lang.String)` was removed
* `withShowInFeed(java.lang.Boolean)` was removed
* `description()` was removed
* `friendlyName()` was removed

#### `models.HostPool$Definition` was modified

* `withRegistrationInfo(fluent.models.RegistrationInfoInner)` was removed
* `withDescription(java.lang.String)` was removed
* `withLoadBalancerType(models.LoadBalancerType)` was removed
* `withKind(java.lang.String)` was removed
* `withPreferredAppGroupType(models.PreferredAppGroupType)` was removed
* `withSsoSecretType(models.SsoSecretType)` was removed
* `withValidationEnvironment(java.lang.Boolean)` was removed
* `withHostPoolType(models.HostPoolType)` was removed
* `withRing(java.lang.Integer)` was removed
* `withAgentUpdate(models.AgentUpdateProperties)` was removed
* `withVmTemplate(java.lang.String)` was removed
* `withPersonalDesktopAssignmentType(models.PersonalDesktopAssignmentType)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withCustomRdpProperty(java.lang.String)` was removed
* `withMaxSessionLimit(java.lang.Integer)` was removed
* `withSsoadfsAuthority(java.lang.String)` was removed
* `withStartVMOnConnect(java.lang.Boolean)` was removed
* `withPublicNetworkAccess(models.HostpoolPublicNetworkAccess)` was removed
* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed
* `withSsoClientSecretKeyVaultPath(java.lang.String)` was removed
* `withManagedBy(java.lang.String)` was removed
* `withSsoClientId(java.lang.String)` was removed

#### `models.ScalingPlanPooledSchedule` was modified

* `offPeakLoadBalancingAlgorithm()` was removed
* `rampDownStopHostsWhen()` was removed
* `offPeakStartTime()` was removed
* `rampDownWaitTimeMinutes()` was removed
* `peakStartTime()` was removed
* `rampDownCapacityThresholdPct()` was removed
* `rampUpStartTime()` was removed
* `rampUpLoadBalancingAlgorithm()` was removed
* `rampDownForceLogoffUsers()` was removed
* `rampDownMinimumHostsPct()` was removed
* `rampUpCapacityThresholdPct()` was removed
* `rampDownStartTime()` was removed
* `rampDownLoadBalancingAlgorithm()` was removed
* `peakLoadBalancingAlgorithm()` was removed
* `rampUpMinimumHostsPct()` was removed
* `daysOfWeek()` was removed
* `rampDownNotificationMessage()` was removed

#### `models.ScalingPlanPatch` was modified

* `withSchedules(java.util.List)` was removed
* `friendlyName()` was removed
* `hostPoolReferences()` was removed
* `withDescription(java.lang.String)` was removed
* `schedules()` was removed
* `withHostPoolReferences(java.util.List)` was removed
* `withExclusionTag(java.lang.String)` was removed
* `withTimeZone(java.lang.String)` was removed
* `timeZone()` was removed
* `description()` was removed
* `exclusionTag()` was removed
* `withFriendlyName(java.lang.String)` was removed

#### `models.Workspace$Update` was modified

* `withDescription(java.lang.String)` was removed
* `withPublicNetworkAccess(models.PublicNetworkAccess)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withApplicationGroupReferences(java.util.List)` was removed

#### `models.SessionHost` was modified

* `sessionHostHealthCheckResults()` was removed
* `sxSStackVersion()` was removed
* `allowNewSession()` was removed
* `sessions()` was removed
* `assignedUser()` was removed
* `updateErrorMessage()` was removed
* `lastHeartBeat()` was removed
* `lastUpdateTime()` was removed
* `friendlyName()` was removed
* `resourceId()` was removed
* `osVersion()` was removed
* `status()` was removed
* `objectId()` was removed
* `statusTimestamp()` was removed
* `updateState()` was removed
* `virtualMachineId()` was removed
* `agentVersion()` was removed

#### `models.ApplicationGroups` was modified

* `list()` was removed
* `list(java.lang.String,com.azure.core.util.Context)` was removed

#### `models.ExpandMsixImage` was modified

* `isActive()` was removed
* `packageFamilyName()` was removed
* `version()` was removed
* `packageFullName()` was removed
* `packageRelativePath()` was removed
* `packageAlias()` was removed
* `certificateName()` was removed
* `packageDependencies()` was removed
* `lastUpdated()` was removed
* `displayName()` was removed
* `certificateExpiry()` was removed
* `isRegularRegistration()` was removed
* `imagePath()` was removed
* `packageApplications()` was removed
* `packageName()` was removed

#### `models.SessionHosts` was modified

* `updateWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.Boolean,models.SessionHostPatch,com.azure.core.util.Context)` was removed
* `update(java.lang.String,java.lang.String,java.lang.String)` was removed

#### `models.ScalingPlanPersonalSchedulePatch` was modified

* `withRampUpAutoStartHosts(models.StartupBehavior)` was removed
* `rampDownStartTime()` was removed
* `rampUpActionOnDisconnect()` was removed
* `withRampUpMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `rampUpActionOnLogoff()` was removed
* `rampUpStartVMOnConnect()` was removed
* `rampDownStartVMOnConnect()` was removed
* `rampDownMinutesToWaitOnDisconnect()` was removed
* `withOffPeakActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withOffPeakMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `offPeakActionOnLogoff()` was removed
* `rampUpStartTime()` was removed
* `peakActionOnDisconnect()` was removed
* `rampDownMinutesToWaitOnLogoff()` was removed
* `withPeakStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `rampUpAutoStartHosts()` was removed
* `withRampUpActionOnLogoff(models.SessionHandlingOperation)` was removed
* `peakStartVMOnConnect()` was removed
* `daysOfWeek()` was removed
* `peakMinutesToWaitOnDisconnect()` was removed
* `withRampDownActionOnLogoff(models.SessionHandlingOperation)` was removed
* `withPeakActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `rampUpMinutesToWaitOnDisconnect()` was removed
* `offPeakMinutesToWaitOnDisconnect()` was removed
* `withPeakMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withRampUpStartTime(models.Time)` was removed
* `offPeakActionOnDisconnect()` was removed
* `withDaysOfWeek(java.util.List)` was removed
* `withRampDownMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withPeakMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withRampDownStartTime(models.Time)` was removed
* `withPeakStartTime(models.Time)` was removed
* `peakMinutesToWaitOnLogoff()` was removed
* `withRampUpMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `withOffPeakActionOnLogoff(models.SessionHandlingOperation)` was removed
* `rampDownActionOnLogoff()` was removed
* `withOffPeakStartTime(models.Time)` was removed
* `withRampDownStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withRampDownMinutesToWaitOnDisconnect(java.lang.Integer)` was removed
* `withPeakActionOnLogoff(models.SessionHandlingOperation)` was removed
* `offPeakMinutesToWaitOnLogoff()` was removed
* `rampDownActionOnDisconnect()` was removed
* `withOffPeakStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `withRampUpStartVMOnConnect(models.SetStartVMOnConnect)` was removed
* `offPeakStartTime()` was removed
* `rampUpMinutesToWaitOnLogoff()` was removed
* `peakStartTime()` was removed
* `withRampDownActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withRampUpActionOnDisconnect(models.SessionHandlingOperation)` was removed
* `withOffPeakMinutesToWaitOnLogoff(java.lang.Integer)` was removed
* `offPeakStartVMOnConnect()` was removed
* `peakActionOnLogoff()` was removed

#### `models.MsixPackages` was modified

* `get(java.lang.String,java.lang.String,java.lang.String)` was removed
* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was removed
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `delete(java.lang.String,java.lang.String,java.lang.String)` was removed
* `list(java.lang.String,java.lang.String)` was removed

#### `models.ScalingPlan` was modified

* `objectId()` was removed
* `hostPoolReferences()` was removed
* `managedBy()` was removed
* `timeZone()` was removed
* `etag()` was removed
* `description()` was removed
* `kind()` was removed
* `friendlyName()` was removed
* `identity()` was removed
* `schedules()` was removed
* `hostPoolType()` was removed
* `sku()` was removed
* `exclusionTag()` was removed
* `plan()` was removed

#### `models.ScalingPlan$Definition` was modified

* `withManagedBy(java.lang.String)` was removed
* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed
* `withSchedules(java.util.List)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed
* `withHostPoolReferences(java.util.List)` was removed
* `withDescription(java.lang.String)` was removed
* `withTimeZone(java.lang.String)` was removed
* `withExclusionTag(java.lang.String)` was removed
* `withKind(java.lang.String)` was removed
* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withHostPoolType(models.ScalingHostPoolType)` was removed

#### `models.Workspace$Definition` was modified

* `withManagedBy(java.lang.String)` was removed
* `withSku(models.ResourceModelWithAllowedPropertySetSku)` was removed
* `withPlan(models.ResourceModelWithAllowedPropertySetPlan)` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withKind(java.lang.String)` was removed
* `withApplicationGroupReferences(java.util.List)` was removed
* `withIdentity(models.ResourceModelWithAllowedPropertySetIdentity)` was removed
* `withDescription(java.lang.String)` was removed
* `withPublicNetworkAccess(models.PublicNetworkAccess)` was removed

#### `models.ApplicationPatch` was modified

* `withFilePath(java.lang.String)` was removed
* `withIconPath(java.lang.String)` was removed
* `showInPortal()` was removed
* `filePath()` was removed
* `msixPackageFamilyName()` was removed
* `description()` was removed
* `iconIndex()` was removed
* `withIconIndex(java.lang.Integer)` was removed
* `msixPackageApplicationId()` was removed
* `withMsixPackageFamilyName(java.lang.String)` was removed
* `withShowInPortal(java.lang.Boolean)` was removed
* `iconPath()` was removed
* `applicationType()` was removed
* `commandLineArguments()` was removed
* `withCommandLineSetting(models.CommandLineSetting)` was removed
* `commandLineSetting()` was removed
* `withFriendlyName(java.lang.String)` was removed
* `withMsixPackageApplicationId(java.lang.String)` was removed
* `withDescription(java.lang.String)` was removed
* `withApplicationType(models.RemoteApplicationType)` was removed
* `friendlyName()` was removed
* `withCommandLineArguments(java.lang.String)` was removed

#### `models.ApplicationGroup$Update` was modified

* `withFriendlyName(java.lang.String)` was removed
* `withShowInFeed(java.lang.Boolean)` was removed
* `withDescription(java.lang.String)` was removed

### Features Added

* `models.MsixPackageProperties` was added

* `models.PrivateEndpointConnectionOnWorkspaceWithSystemData` was added

* `models.OperationDisplay` was added

* `models.ApplicationProperties` was added

* `models.MsixPackagePatchProperties` was added

* `models.PublicUdp` was added

* `models.ScalingPlanPersonalScheduleProperties` was added

* `models.PrivateEndpointConnectionOnHostPoolListResultWithSystemData` was added

* `models.ApplicationGroupProperties` was added

* `models.PrivateEndpointConnectionOnHostPoolWithSystemData` was added

* `models.DesktopProperties` was added

* `models.DesktopPatchProperties` was added

* `models.HostPoolPatchProperties` was added

* `models.ScalingPlanPooledScheduleProperties` was added

* `models.PrivateEndpointConnectionOnHostPoolWithSystemDataOperationGroups` was added

* `models.ApplicationGroupPatchProperties` was added

* `models.ExpandMsixImageProperties` was added

* `models.ActionType` was added

* `models.DirectUdp` was added

* `models.WorkspacePatchProperties` was added

* `models.ScalingPlanPatchProperties` was added

* `models.PrivateEndpointConnectionProperties` was added

* `models.PrivateLinkResourceProperties` was added

* `models.WorkspaceProperties` was added

* `models.Origin` was added

* `models.ManagedPrivateUdp` was added

* `models.PrivateEndpointConnectionOnWorkspaceWithSystemDataOperationGroups` was added

* `models.SessionHostPatchProperties` was added

* `models.OperationListResult` was added

* `models.SessionHostProperties` was added

* `models.Operation` was added

* `models.RelayUdp` was added

* `models.UserSessionProperties` was added

* `models.ApplicationPatchProperties` was added

* `models.ScalingPlanProperties` was added

* `models.StartMenuItemProperties` was added

* `models.PrivateEndpointConnectionOnWorkspaceListResultWithSystemData` was added

#### `models.ExpandMsixImageList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ScalingPlanPooledSchedule$Definition` was modified

* `withProperties(models.ScalingPlanPooledScheduleProperties)` was added

#### `models.HostPoolList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.SessionHostList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.UserSession` was modified

* `properties()` was added

#### `models.StartMenuItemList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ScalingPlanPooledSchedule$Update` was modified

* `withProperties(models.ScalingPlanPooledScheduleProperties)` was added

#### `models.HostPool$Update` was modified

* `withProperties(models.HostPoolPatchProperties)` was added

#### `models.ScalingPlan$Update` was modified

* `withProperties(models.ScalingPlanPatchProperties)` was added

#### `models.StartMenuItem` was modified

* `properties()` was added

#### `models.Desktops` was modified

* `update(java.lang.String,java.lang.String,java.lang.String,models.DesktopPatch)` was added

#### `models.WorkspacePatch` was modified

* `properties()` was added
* `withProperties(models.WorkspacePatchProperties)` was added

#### `models.ScalingPlanPersonalSchedule` was modified

* `properties()` was added

#### `models.ScalingPlanPersonalSchedule$Definition` was modified

* `withProperties(models.ScalingPlanPersonalScheduleProperties)` was added

#### `models.MsixPackage$Update` was modified

* `withProperties(models.MsixPackagePatchProperties)` was added

#### `models.Workspace` was modified

* `properties()` was added

#### `models.MsixPackage$Definition` was modified

* `withProperties(models.MsixPackageProperties)` was added

#### `models.DesktopPatch` was modified

* `properties()` was added
* `withProperties(models.DesktopPatchProperties)` was added

#### `models.Application` was modified

* `properties()` was added

#### `models.Application$Update` was modified

* `withProperties(models.ApplicationPatchProperties)` was added

#### `models.ScalingPlanPersonalScheduleList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.Application$Definition` was modified

* `withProperties(models.ApplicationProperties)` was added

#### `models.ApplicationGroup` was modified

* `properties()` was added

#### `models.MsixPackageList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.HostPool` was modified

* `expand(models.MsixImageUri,com.azure.core.util.Context)` was added
* `importAppAttachPackageInfo(models.ImportPackageInfoRequest,com.azure.core.util.Context)` was added
* `properties()` was added
* `expand(models.MsixImageUri)` was added
* `importAppAttachPackageInfo(models.ImportPackageInfoRequest)` was added

#### `models.HostPoolPatch` was modified

* `properties()` was added
* `withProperties(models.HostPoolPatchProperties)` was added

#### `models.ScalingPlanPersonalSchedule$Update` was modified

* `withProperties(models.ScalingPlanPersonalScheduleProperties)` was added

#### `models.UserSessions` was modified

* `sendMessage(java.lang.String,java.lang.String,java.lang.String,java.lang.String,models.SendMessage)` was added

#### `models.PrivateLinkResource` was modified

* `properties()` was added

#### `models.WorkspaceList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.HostPoolProperties` was modified

* `relayUdp()` was added
* `directUdp()` was added
* `managedPrivateUdp()` was added
* `publicUdp()` was added

#### `DesktopVirtualizationManager` was modified

* `privateEndpointConnectionOnWorkspaceWithSystemDataOperationGroups()` was added
* `privateEndpointConnectionOnHostPoolWithSystemDataOperationGroups()` was added

#### `models.ApplicationList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.PrivateEndpointConnection` was modified

* `properties()` was added
* `withProperties(models.PrivateEndpointConnectionProperties)` was added

#### `models.ApplicationGroupList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ScalingPlanPooledSchedulePatch` was modified

* `withProperties(models.ScalingPlanPooledScheduleProperties)` was added
* `properties()` was added

#### `models.Desktop` was modified

* `properties()` was added

#### `models.SessionHostPatch` was modified

* `withProperties(models.SessionHostPatchProperties)` was added
* `properties()` was added

#### `models.MsixPackagePatch` was modified

* `properties()` was added
* `withProperties(models.MsixPackagePatchProperties)` was added

#### `models.ApplicationGroup$Definition` was modified

* `withProperties(models.ApplicationGroupProperties)` was added

#### `models.MsixPackage` was modified

* `properties()` was added

#### `models.ScalingPlanPooledScheduleList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.AppAttachPackageList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ApplicationGroupPatch` was modified

* `properties()` was added
* `withProperties(models.ApplicationGroupPatchProperties)` was added

#### `models.HostPool$Definition` was modified

* `withProperties(fluent.models.HostPoolPropertiesInner)` was added

#### `models.ScalingPlanPooledSchedule` was modified

* `properties()` was added

#### `models.ScalingPlanPatch` was modified

* `properties()` was added
* `withProperties(models.ScalingPlanPatchProperties)` was added

#### `models.Workspace$Update` was modified

* `withProperties(models.WorkspacePatchProperties)` was added

#### `models.SessionHost` was modified

* `properties()` was added

#### `models.ApplicationGroups` was modified

* `list(java.lang.String,java.lang.String)` was added
* `listBySubscription()` was added
* `listBySubscription(java.lang.String,com.azure.core.util.Context)` was added
* `list(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added

#### `models.PrivateLinkResourceListResult` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ExpandMsixImage` was modified

* `properties()` was added

#### `models.SessionHosts` was modified

* `updateWithResponse(java.lang.String,java.lang.String,java.lang.String,models.SessionHostPatch,java.lang.Boolean,com.azure.core.util.Context)` was added
* `update(java.lang.String,java.lang.String,java.lang.String,models.SessionHostPatch)` was added

#### `models.ScalingPlanList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ScalingPlanPersonalSchedulePatch` was modified

* `properties()` was added
* `withProperties(models.ScalingPlanPersonalScheduleProperties)` was added

#### `models.MsixPackages` was modified

* `deleteWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `get(java.lang.String)` was added
* `delete(java.lang.String)` was added
* `list(java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added
* `list()` was added
* `getWithResponse(java.lang.String,com.azure.core.util.Context)` was added

#### `models.Workspaces` was modified

* `listByWorkspace(java.lang.String,java.lang.String)` was added
* `listByWorkspace(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added

#### `models.UserSessionList` was modified

* `withNextLink(java.lang.String)` was added

#### `models.ScalingPlan` was modified

* `properties()` was added

#### `models.HostPools` was modified

* `expand(java.lang.String,java.lang.String,models.MsixImageUri)` was added
* `importAppAttachPackageInfo(java.lang.String,java.lang.String,models.ImportPackageInfoRequest,com.azure.core.util.Context)` was added
* `userSessionsListByHostPool(java.lang.String,java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added
* `expand(java.lang.String,java.lang.String,models.MsixImageUri,com.azure.core.util.Context)` was added
* `privateLinkResourcesListByHostPool(java.lang.String,java.lang.String)` was added
* `listByHostPool(java.lang.String,java.lang.String)` was added
* `importAppAttachPackageInfo(java.lang.String,java.lang.String,models.ImportPackageInfoRequest)` was added
* `privateLinkResourcesListByHostPool(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added
* `listByHostPool(java.lang.String,java.lang.String,java.lang.Integer,java.lang.Boolean,java.lang.Integer,com.azure.core.util.Context)` was added
* `userSessionsListByHostPool(java.lang.String,java.lang.String)` was added

#### `models.ScalingPlan$Definition` was modified

* `withProperties(models.ScalingPlanProperties)` was added

#### `models.Workspace$Definition` was modified

* `withProperties(models.WorkspaceProperties)` was added

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
