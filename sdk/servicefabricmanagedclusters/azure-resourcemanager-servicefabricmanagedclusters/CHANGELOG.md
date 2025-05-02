# Release History

## 1.1.0-beta.1 (2025-05-02)

- Azure Resource Manager servicefabricmanagedclusters client library for Java. This package contains Microsoft Azure SDK for servicefabricmanagedclusters Management SDK. Service Fabric Managed Clusters Management Client. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.ManagedProxyResource` was removed

#### `models.NodeTypeListSkuResult` was removed

#### `ServiceFabricManagedClustersManager$Configurable` was removed

#### `models.PublicIpAddressVersion` was removed

#### `ServiceFabricManagedClustersManager` was removed

#### `models.NodeTypeListResult` was removed

#### `models.PrivateIpAddressVersion` was removed

#### `models.ApplicationTypeResourceList` was removed

#### `models.ServiceResourceList` was removed

#### `models.ApplicationResourceList` was removed

#### `models.OperationResultsGetResponse` was removed

#### `models.ManagedVMSizesResult` was removed

#### `models.ApplicationTypeVersionResourceList` was removed

#### `models.OperationResultsGetHeaders` was removed

#### `models.ManagedClusterListResult` was removed

#### `models.OperationListResult` was removed

#### `models.VmssExtension` was removed

#### `models.IpConfigurationPublicIpAddressConfiguration` was removed

#### `models.IpAddressType` was removed

#### `models.ApplicationTypeResource$DefinitionStages` was modified

* `withExistingManagedcluster(java.lang.String,java.lang.String)` was removed in stage 1

#### `models.ApplicationResource$DefinitionStages` was modified

* `withExistingManagedcluster(java.lang.String,java.lang.String)` was removed in stage 1

#### `models.ManagedCluster$Definition` was modified

* `withEnableServicePublicIp(java.lang.Boolean)` was removed
* `withPublicIpPrefixId(java.lang.String)` was removed
* `withAdminUsername(java.lang.String)` was removed

#### `models.IpConfiguration` was modified

* `privateIpAddressVersion()` was removed
* `withPublicIpAddressConfiguration(models.IpConfigurationPublicIpAddressConfiguration)` was removed
* `publicIpAddressConfiguration()` was removed
* `withPrivateIpAddressVersion(models.PrivateIpAddressVersion)` was removed

#### `models.NodeType$Definition` was modified

* `withEnableNodePublicIp(java.lang.Boolean)` was removed

#### `models.AvailableOperationDisplay` was modified

* `withDescription(java.lang.String)` was removed
* `withProvider(java.lang.String)` was removed
* `withResource(java.lang.String)` was removed
* `withOperation(java.lang.String)` was removed

#### `models.OperationResults` was modified

* `getWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.ManagedClusterCodeVersionResult` was modified

* `java.lang.String supportExpiryUtc()` -> `java.time.OffsetDateTime supportExpiryUtc()`

#### `models.NodeType` was modified

* `enableNodePublicIp()` was removed

#### `models.ManagedMaintenanceWindowStatus` was modified

* `lastWindowStartTimeUtc()` was removed
* `lastWindowStatusUpdateAtUtc()` was removed
* `lastWindowEndTimeUtc()` was removed

#### `models.ApplicationTypeResource$Definition` was modified

* `withExistingManagedcluster(java.lang.String,java.lang.String)` was removed

#### `models.FrontendConfiguration` was modified

* `models.IpAddressType ipAddressType()` -> `models.IPAddressType ipAddressType()`
* `withIpAddressType(models.IpAddressType)` was removed

#### `models.ManagedCluster` was modified

* `adminUsername()` was removed
* `publicIpPrefixId()` was removed
* `enableServicePublicIp()` was removed

#### `models.LongRunningOperationResult` was modified

* `com.azure.core.management.exception.ManagementError error()` -> `models.ErrorModelError error()`

#### `models.ApplicationResource$Definition` was modified

* `withExistingManagedcluster(java.lang.String,java.lang.String)` was removed

### Features Added

* `implementation.models.NodeTypeListSkuResult` was added

* `implementation.models.ApplicationTypeVersionResourceList` was added

* `models.SfmcOperationStatus` was added

* `models.FaultSimulationContentWrapper` was added

* `implementation.models.NodeTypeListResult` was added

* `implementation.models.ApplicationResourceList` was added

* `ServicefabricmanagedclustersManager` was added

* `models.FaultSimulationStatus` was added

* `models.ZoneFaultSimulationContent` was added

* `implementation.models.FaultSimulationListResult` was added

* `implementation.models.OperationListResult` was added

* `models.FaultSimulationDetails` was added

* `models.VmApplication` was added

* `models.FaultSimulation` was added

* `models.VMSSExtensionPropertiesSettings` was added

* `models.PrivateIPAddressVersion` was added

* `models.VMSSExtensionPropertiesProtectedSettings` was added

* `implementation.models.ManagedVMSizesResult` was added

* `models.SecurityEncryptionType` was added

* `models.PublicIPAddressVersion` was added

* `models.NodeTypeFaultSimulation` was added

* `models.AutoGeneratedDomainNameLabelScope` was added

* `implementation.models.ApplicationTypeResourceList` was added

* `ServicefabricmanagedclustersManager$Configurable` was added

* `implementation.models.ServiceResourceList` was added

* `models.ErrorModelError` was added

* `models.FaultKind` was added

* `models.FaultSimulationContent` was added

* `models.FaultSimulationIdContent` was added

* `implementation.models.ManagedClusterListResult` was added

* `models.IPAddressType` was added

* `models.FaultSimulationConstraints` was added

* `models.VMSSExtension` was added

* `models.IPConfigurationPublicIPAddressConfiguration` was added

#### `models.ManagedCluster$Definition` was modified

* `withVMImage(java.lang.String)` was added
* `withAutoGeneratedDomainNameLabelScope(models.AutoGeneratedDomainNameLabelScope)` was added
* `withAdminUserName(java.lang.String)` was added
* `withAllocatedOutboundPorts(java.lang.Integer)` was added
* `withPublicIPPrefixId(java.lang.String)` was added
* `withEnableServicePublicIP(java.lang.Boolean)` was added

#### `models.IpConfiguration` was modified

* `withPrivateIPAddressVersion(models.PrivateIPAddressVersion)` was added
* `publicIPAddressConfiguration()` was added
* `privateIPAddressVersion()` was added
* `withPublicIPAddressConfiguration(models.IPConfigurationPublicIPAddressConfiguration)` was added

#### `models.NodeType$Definition` was modified

* `withZoneBalance(java.lang.Boolean)` was added
* `withEnableNodePublicIP(java.lang.Boolean)` was added
* `withSecurityEncryptionType(models.SecurityEncryptionType)` was added
* `withVmApplications(java.util.List)` was added

#### `models.ApplicationResource` was modified

* `readUpgrade()` was added
* `startRollback()` was added
* `readUpgrade(com.azure.core.util.Context)` was added
* `resumeUpgrade(models.RuntimeResumeApplicationUpgradeParameters,com.azure.core.util.Context)` was added
* `startRollback(com.azure.core.util.Context)` was added
* `resumeUpgrade(models.RuntimeResumeApplicationUpgradeParameters)` was added

#### `models.NodeTypes` was modified

* `redeploy(java.lang.String,java.lang.String,java.lang.String,models.NodeTypeActionParameters,com.azure.core.util.Context)` was added
* `stopFaultSimulation(java.lang.String,java.lang.String,java.lang.String,models.FaultSimulationIdContent,com.azure.core.util.Context)` was added
* `listFaultSimulation(java.lang.String,java.lang.String,java.lang.String)` was added
* `listFaultSimulation(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getFaultSimulation(java.lang.String,java.lang.String,java.lang.String,models.FaultSimulationIdContent)` was added
* `redeploy(java.lang.String,java.lang.String,java.lang.String,models.NodeTypeActionParameters)` was added
* `start(java.lang.String,java.lang.String,java.lang.String,models.NodeTypeActionParameters,com.azure.core.util.Context)` was added
* `deallocate(java.lang.String,java.lang.String,java.lang.String,models.NodeTypeActionParameters,com.azure.core.util.Context)` was added
* `startFaultSimulation(java.lang.String,java.lang.String,java.lang.String,models.FaultSimulationContentWrapper)` was added
* `deallocate(java.lang.String,java.lang.String,java.lang.String,models.NodeTypeActionParameters)` was added
* `getFaultSimulationWithResponse(java.lang.String,java.lang.String,java.lang.String,models.FaultSimulationIdContent,com.azure.core.util.Context)` was added
* `start(java.lang.String,java.lang.String,java.lang.String,models.NodeTypeActionParameters)` was added
* `stopFaultSimulation(java.lang.String,java.lang.String,java.lang.String,models.FaultSimulationIdContent)` was added
* `startFaultSimulation(java.lang.String,java.lang.String,java.lang.String,models.FaultSimulationContentWrapper,com.azure.core.util.Context)` was added

#### `models.OperationResults` was modified

* `get(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.ManagedClusters` was modified

* `getFaultSimulationWithResponse(java.lang.String,java.lang.String,models.FaultSimulationIdContent,com.azure.core.util.Context)` was added
* `stopFaultSimulation(java.lang.String,java.lang.String,models.FaultSimulationIdContent)` was added
* `stopFaultSimulation(java.lang.String,java.lang.String,models.FaultSimulationIdContent,com.azure.core.util.Context)` was added
* `startFaultSimulation(java.lang.String,java.lang.String,models.FaultSimulationContentWrapper)` was added
* `listFaultSimulation(java.lang.String,java.lang.String)` was added
* `getFaultSimulation(java.lang.String,java.lang.String,models.FaultSimulationIdContent)` was added
* `listFaultSimulation(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `startFaultSimulation(java.lang.String,java.lang.String,models.FaultSimulationContentWrapper,com.azure.core.util.Context)` was added

#### `models.NodeType` was modified

* `start(models.NodeTypeActionParameters)` was added
* `startFaultSimulation(models.FaultSimulationContentWrapper)` was added
* `startFaultSimulation(models.FaultSimulationContentWrapper,com.azure.core.util.Context)` was added
* `zoneBalance()` was added
* `redeploy(models.NodeTypeActionParameters)` was added
* `stopFaultSimulation(models.FaultSimulationIdContent)` was added
* `start(models.NodeTypeActionParameters,com.azure.core.util.Context)` was added
* `stopFaultSimulation(models.FaultSimulationIdContent,com.azure.core.util.Context)` was added
* `listFaultSimulation()` was added
* `securityEncryptionType()` was added
* `listFaultSimulation(com.azure.core.util.Context)` was added
* `getFaultSimulation(models.FaultSimulationIdContent)` was added
* `enableNodePublicIP()` was added
* `redeploy(models.NodeTypeActionParameters,com.azure.core.util.Context)` was added
* `deallocate(models.NodeTypeActionParameters,com.azure.core.util.Context)` was added
* `vmApplications()` was added
* `getFaultSimulationWithResponse(models.FaultSimulationIdContent,com.azure.core.util.Context)` was added
* `deallocate(models.NodeTypeActionParameters)` was added

#### `models.ManagedMaintenanceWindowStatus` was modified

* `lastWindowStartTimeUTC()` was added
* `lastWindowEndTimeUTC()` was added
* `lastWindowStatusUpdateAtUTC()` was added

#### `models.ApplicationTypeResource$Definition` was modified

* `withExistingManagedCluster(java.lang.String,java.lang.String)` was added

#### `models.FrontendConfiguration` was modified

* `withIpAddressType(models.IPAddressType)` was added

#### `models.ManagedCluster` was modified

* `stopFaultSimulation(models.FaultSimulationIdContent,com.azure.core.util.Context)` was added
* `allocatedOutboundPorts()` was added
* `listFaultSimulation()` was added
* `adminUserName()` was added
* `startFaultSimulation(models.FaultSimulationContentWrapper,com.azure.core.util.Context)` was added
* `startFaultSimulation(models.FaultSimulationContentWrapper)` was added
* `getFaultSimulation(models.FaultSimulationIdContent)` was added
* `listFaultSimulation(com.azure.core.util.Context)` was added
* `vMImage()` was added
* `publicIPPrefixId()` was added
* `stopFaultSimulation(models.FaultSimulationIdContent)` was added
* `getFaultSimulationWithResponse(models.FaultSimulationIdContent,com.azure.core.util.Context)` was added
* `enableServicePublicIP()` was added
* `autoGeneratedDomainNameLabelScope()` was added

#### `models.ApplicationResource$Definition` was modified

* `withExistingManagedCluster(java.lang.String,java.lang.String)` was added

## 1.0.0 (2024-12-25)

- Azure Resource Manager Service Fabric Managed Clusters client library for Java. This package contains Microsoft Azure SDK for Service Fabric Managed Clusters Management SDK. Service Fabric Managed Clusters Management Client. Package tag package-2024-04. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Other Changes

- Release for Azure Resource Manager Service Fabric Managed Clusters client library for Java.

## 1.0.0-beta.3 (2024-12-16)

- Azure Resource Manager Service Fabric Managed Clusters client library for Java. This package contains Microsoft Azure SDK for Service Fabric Managed Clusters Management SDK. Service Fabric Managed Clusters Management Client. Package tag package-2024-09-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.ManagedCluster$Definition` was modified

* `withCustomFqdn(java.lang.String)` was removed

#### `models.StatefulServiceProperties` was modified

* `provisioningState()` was removed

#### `models.StatelessServiceProperties` was modified

* `provisioningState()` was removed

#### `models.ManagedCluster` was modified

* `customFqdn()` was removed

### Features Added

#### `models.ManagedCluster$Definition` was modified

* `withAllocatedOutboundPorts(java.lang.Integer)` was added

#### `models.ManagedCluster` was modified

* `allocatedOutboundPorts()` was added

## 1.0.0-beta.2 (2024-10-18)

- Azure Resource Manager Service Fabric Managed Clusters client library for Java. This package contains Microsoft Azure SDK for Service Fabric Managed Clusters Management SDK. Service Fabric Managed Clusters Management Client. Package tag package-2024-06-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.VmApplication` was added

* `models.AutoGeneratedDomainNameLabelScope` was added

#### `models.ManagedCluster$Definition` was modified

* `withCustomFqdn(java.lang.String)` was added
* `withAutoGeneratedDomainNameLabelScope(models.AutoGeneratedDomainNameLabelScope)` was added

#### `models.NodeType$Definition` was modified

* `withVmApplications(java.util.List)` was added

#### `models.NodeType` was modified

* `vmApplications()` was added

#### `models.ManagedCluster` was modified

* `autoGeneratedDomainNameLabelScope()` was added
* `customFqdn()` was added

## 1.0.0-beta.1 (2024-07-31)

- Azure Resource Manager Service Fabric Managed Clusters client library for Java. This package contains Microsoft Azure SDK for Service Fabric Managed Clusters Management SDK. Service Fabric Managed Clusters Management Client. Package tag package-2024-04. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
- Azure Resource Manager ServiceFabricManagedClusters client library for Java. This package contains Microsoft Azure SDK for ServiceFabricManagedClusters Management SDK. Service Fabric Managed Clusters Management Client. Package tag package-2024-04. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
### Features Added

- Initial release for the azure-resourcemanager-servicefabricmanagedclusters Java SDK.

