# Release History

## 1.3.0-beta.1 (2025-05-12)

- Azure Resource Manager avs client library for Java. This package contains Microsoft Azure SDK for avs Management SDK. Azure VMware Solution API. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.DatastoreList` was removed

#### `models.ClusterList` was removed

#### `models.GlobalReachConnectionList` was removed

#### `models.AddonList` was removed

#### `models.VirtualMachinesList` was removed

#### `models.WorkloadNetworkDhcpList` was removed

#### `models.ScriptCmdletsList` was removed

#### `models.CloudLinkList` was removed

#### `models.WorkloadNetworkVMGroupsList` was removed

#### `models.ScriptExecutionsList` was removed

#### `models.HcxEnterpriseSiteList` was removed

#### `models.WorkloadNetworkPortMirroringList` was removed

#### `models.WorkloadNetworkVirtualMachinesList` was removed

#### `models.ResourceIdentityType` was removed

#### `models.WorkloadNetworkList` was removed

#### `models.PlacementPoliciesList` was removed

#### `models.WorkloadNetworkPublicIPsList` was removed

#### `models.WorkloadNetworkSegmentsList` was removed

#### `models.OperationListResult` was removed

#### `models.WorkloadNetworkDnsServicesList` was removed

#### `models.PrivateCloudList` was removed

#### `models.ExpressRouteAuthorizationList` was removed

#### `models.WorkloadNetworkDnsZonesList` was removed

#### `models.WorkloadNetworkGatewayList` was removed

#### `models.ScriptPackagesList` was removed

#### `models.IscsiPathListResult` was removed

#### `models.WorkloadNetworkDnsService$DefinitionStages` was modified

* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed in stage 1

#### `models.WorkloadNetworkDhcp$DefinitionStages` was modified

* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed in stage 1

#### `models.WorkloadNetworkDnsZone$DefinitionStages` was modified

* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed in stage 1

#### `models.WorkloadNetworkPortMirroring$DefinitionStages` was modified

* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed in stage 1

#### `models.WorkloadNetworkSegment$DefinitionStages` was modified

* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed in stage 1

#### `models.WorkloadNetworkPublicIp$DefinitionStages` was modified

* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed in stage 1

#### `models.WorkloadNetworkVMGroup$DefinitionStages` was modified

* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed in stage 1

#### `models.CloudLink$Definition` was modified

* `withLinkedCloud(java.lang.String)` was removed

#### `models.Cluster$Definition` was modified

* `withClusterSize(java.lang.Integer)` was removed
* `withHosts(java.util.List)` was removed
* `withVsanDatastoreName(java.lang.String)` was removed

#### `models.ScriptExecution$Update` was modified

* `withRetention(java.lang.String)` was removed
* `withTimeout(java.lang.String)` was removed
* `withHiddenParameters(java.util.List)` was removed
* `withNamedOutputs(java.util.Map)` was removed
* `withParameters(java.util.List)` was removed
* `withOutput(java.util.List)` was removed
* `withFailureReason(java.lang.String)` was removed
* `withScriptCmdletId(java.lang.String)` was removed

#### `models.WorkloadNetworkSegmentPortVif` was modified

* `withPortName(java.lang.String)` was removed

#### `models.WorkloadNetworkDhcpRelay` was modified

* `provisioningState()` was removed
* `segments()` was removed

#### `models.ScriptCmdlet` was modified

* `provisioningState()` was removed
* `timeout()` was removed
* `parameters()` was removed
* `audience()` was removed
* `description()` was removed

#### `models.Cluster` was modified

* `clusterSize()` was removed
* `provisioningState()` was removed
* `vsanDatastoreName()` was removed
* `clusterId()` was removed
* `hosts()` was removed

#### `models.GlobalReachConnection` was modified

* `authorizationKey()` was removed
* `expressRouteId()` was removed
* `provisioningState()` was removed
* `circuitConnectionStatus()` was removed
* `addressPrefix()` was removed
* `peerExpressRouteCircuit()` was removed

#### `models.WorkloadNetworkDnsZone$Update` was modified

* `withDnsServices(java.lang.Long)` was removed
* `withDnsServerIps(java.util.List)` was removed
* `withDomain(java.util.List)` was removed
* `withRevision(java.lang.Long)` was removed
* `withSourceIp(java.lang.String)` was removed
* `withDisplayName(java.lang.String)` was removed

#### `models.IscsiPath` was modified

* `provisioningState()` was removed
* `networkBlock()` was removed

#### `models.WorkloadNetworks` was modified

* `getDnsZoneWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getGateway(java.lang.String,java.lang.String,java.lang.String)` was removed
* `defineSegments(java.lang.String)` was removed
* `listPublicIPs(java.lang.String,java.lang.String)` was removed
* `deleteDhcp(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listDnsZones(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getDhcpByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `getPortMirroringWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getDnsService(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getDnsZone(java.lang.String,java.lang.String,java.lang.String)` was removed
* `deleteSegment(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteSegment(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getPortMirroring(java.lang.String,java.lang.String,java.lang.String)` was removed
* `deleteVMGroupById(java.lang.String)` was removed
* `getPublicIpByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `listPortMirroring(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteDnsServiceByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `deleteDnsZoneById(java.lang.String)` was removed
* `getSegmentWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deletePublicIpByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `listVMGroups(java.lang.String,java.lang.String)` was removed
* `listSegments(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getVMGroup(java.lang.String,java.lang.String,java.lang.String)` was removed
* `definePublicIp(java.lang.String)` was removed
* `getPublicIpById(java.lang.String)` was removed
* `getVMGroupWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deletePublicIp(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getSegment(java.lang.String,java.lang.String,java.lang.String)` was removed
* `deleteDnsZoneByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `deleteDnsServiceById(java.lang.String)` was removed
* `deletePortMirroringByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `deleteVMGroupByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `listDhcp(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listVMGroups(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getPublicIp(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listDnsServices(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listGateways(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deletePublicIpById(java.lang.String)` was removed
* `deletePublicIp(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getDnsServiceWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getVirtualMachineWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listPublicIPs(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteDhcp(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getGatewayWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getPublicIpWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `get(java.lang.String,java.lang.String)` was removed
* `listDnsServices(java.lang.String,java.lang.String)` was removed
* `listVirtualMachines(java.lang.String,java.lang.String)` was removed
* `listVirtualMachines(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listSegments(java.lang.String,java.lang.String)` was removed
* `listPortMirroring(java.lang.String,java.lang.String)` was removed
* `getVirtualMachine(java.lang.String,java.lang.String,java.lang.String)` was removed
* `listGateways(java.lang.String,java.lang.String)` was removed
* `listDhcp(java.lang.String,java.lang.String)` was removed
* `listDnsZones(java.lang.String,java.lang.String)` was removed
* `deletePortMirroringById(java.lang.String)` was removed
* `getDhcpById(java.lang.String)` was removed
* `getWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.WorkloadNetworkDhcp$Definition` was modified

* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed

#### `models.AddonArcProperties` was modified

* `provisioningState()` was removed

#### `models.ExpressRouteAuthorization` was modified

* `expressRouteId()` was removed
* `expressRouteAuthorizationKey()` was removed
* `expressRouteAuthorizationId()` was removed
* `provisioningState()` was removed

#### `models.VmPlacementPolicyProperties` was modified

* `provisioningState()` was removed

#### `models.VirtualMachine` was modified

* `moRefId()` was removed
* `folderPath()` was removed
* `restrictMovement()` was removed
* `provisioningState()` was removed
* `displayName()` was removed

#### `models.WorkloadNetworkSegment$Definition` was modified

* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed
* `withDisplayName(java.lang.String)` was removed
* `withSubnet(models.WorkloadNetworkSegmentSubnet)` was removed
* `withConnectedGateway(java.lang.String)` was removed
* `withRevision(java.lang.Long)` was removed

#### `models.WorkloadNetworkPublicIp$Definition` was modified

* `withNumberOfPublicIPs(java.lang.Long)` was removed
* `withDisplayName(java.lang.String)` was removed
* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed

#### `models.IscsiPaths` was modified

* `get(java.lang.String,java.lang.String)` was removed
* `createOrUpdate(java.lang.String,java.lang.String,fluent.models.IscsiPathInner,com.azure.core.util.Context)` was removed
* `delete(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `createOrUpdate(java.lang.String,java.lang.String,fluent.models.IscsiPathInner)` was removed
* `getWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteByResourceGroup(java.lang.String,java.lang.String)` was removed

#### `models.WorkloadNetworkDnsZone` was modified

* `displayName()` was removed
* `provisioningState()` was removed
* `dnsServices()` was removed
* `revision()` was removed
* `domain()` was removed
* `sourceIp()` was removed
* `dnsServerIps()` was removed

#### `models.ScriptPackage` was modified

* `version()` was removed
* `provisioningState()` was removed
* `uri()` was removed
* `description()` was removed
* `company()` was removed

#### `models.WorkloadNetworkSegment$Update` was modified

* `withConnectedGateway(java.lang.String)` was removed
* `withRevision(java.lang.Long)` was removed
* `withSubnet(models.WorkloadNetworkSegmentSubnet)` was removed
* `withDisplayName(java.lang.String)` was removed

#### `models.Datastore` was modified

* `diskPoolVolume()` was removed
* `status()` was removed
* `netAppVolume()` was removed
* `elasticSanVolume()` was removed
* `provisioningState()` was removed

#### `models.WorkloadNetworkSegment` was modified

* `connectedGateway()` was removed
* `revision()` was removed
* `displayName()` was removed
* `subnet()` was removed
* `provisioningState()` was removed
* `status()` was removed
* `portVif()` was removed

#### `models.Datastore$Definition` was modified

* `withNetAppVolume(models.NetAppVolume)` was removed
* `withDiskPoolVolume(models.DiskPoolVolume)` was removed
* `withElasticSanVolume(models.ElasticSanVolume)` was removed

#### `models.WorkloadNetworkDnsService$Update` was modified

* `withDnsServiceIp(java.lang.String)` was removed
* `withDefaultDnsZone(java.lang.String)` was removed
* `withLogLevel(models.DnsServiceLogLevelEnum)` was removed
* `withFqdnZones(java.util.List)` was removed
* `withDisplayName(java.lang.String)` was removed
* `withRevision(java.lang.Long)` was removed

#### `models.AddonVrProperties` was modified

* `provisioningState()` was removed

#### `models.ScriptExecution$Definition` was modified

* `withParameters(java.util.List)` was removed
* `withHiddenParameters(java.util.List)` was removed
* `withOutput(java.util.List)` was removed
* `withFailureReason(java.lang.String)` was removed
* `withScriptCmdletId(java.lang.String)` was removed
* `withRetention(java.lang.String)` was removed
* `withNamedOutputs(java.util.Map)` was removed
* `withTimeout(java.lang.String)` was removed

#### `models.WorkloadNetworkVMGroup$Update` was modified

* `withMembers(java.util.List)` was removed
* `withDisplayName(java.lang.String)` was removed
* `withRevision(java.lang.Long)` was removed

#### `models.ScriptParameter` was modified

* `withName(java.lang.String)` was removed

#### `models.WorkloadNetworkVMGroup$Definition` was modified

* `withMembers(java.util.List)` was removed
* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed
* `withRevision(java.lang.Long)` was removed
* `withDisplayName(java.lang.String)` was removed

#### `models.GlobalReachConnection$Definition` was modified

* `withExpressRouteId(java.lang.String)` was removed
* `withAuthorizationKey(java.lang.String)` was removed
* `withPeerExpressRouteCircuit(java.lang.String)` was removed

#### `models.WorkloadNetworkVirtualMachine` was modified

* `displayName()` was removed
* `provisioningState()` was removed
* `vmType()` was removed

#### `models.WorkloadNetworkPortMirroring$Update` was modified

* `withRevision(java.lang.Long)` was removed
* `withDestination(java.lang.String)` was removed
* `withDirection(models.PortMirroringDirectionEnum)` was removed
* `withSource(java.lang.String)` was removed
* `withDisplayName(java.lang.String)` was removed

#### `models.CloudLink` was modified

* `status()` was removed
* `linkedCloud()` was removed
* `provisioningState()` was removed

#### `models.WorkloadNetwork` was modified

* `provisioningState()` was removed

#### `models.WorkloadNetworkDnsZone$Definition` was modified

* `withRevision(java.lang.Long)` was removed
* `withDomain(java.util.List)` was removed
* `withDnsServerIps(java.util.List)` was removed
* `withDnsServices(java.lang.Long)` was removed
* `withDisplayName(java.lang.String)` was removed
* `withSourceIp(java.lang.String)` was removed
* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed

#### `models.VmHostPlacementPolicyProperties` was modified

* `provisioningState()` was removed

#### `models.WorkloadNetworkPortMirroring` was modified

* `direction()` was removed
* `displayName()` was removed
* `status()` was removed
* `provisioningState()` was removed
* `revision()` was removed
* `source()` was removed
* `destination()` was removed

#### `models.ScriptExecution` was modified

* `information()` was removed
* `retention()` was removed
* `finishedAt()` was removed
* `provisioningState()` was removed
* `namedOutputs()` was removed
* `warnings()` was removed
* `parameters()` was removed
* `startedAt()` was removed
* `hiddenParameters()` was removed
* `errors()` was removed
* `failureReason()` was removed
* `scriptCmdletId()` was removed
* `timeout()` was removed
* `output()` was removed
* `submittedAt()` was removed

#### `models.WorkloadNetworkPublicIp` was modified

* `provisioningState()` was removed
* `numberOfPublicIPs()` was removed
* `displayName()` was removed
* `publicIpBlock()` was removed

#### `models.WorkloadNetworkPortMirroring$Definition` was modified

* `withDestination(java.lang.String)` was removed
* `withDirection(models.PortMirroringDirectionEnum)` was removed
* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed
* `withSource(java.lang.String)` was removed
* `withRevision(java.lang.Long)` was removed
* `withDisplayName(java.lang.String)` was removed

#### `models.PrivateCloud$Definition` was modified

* `withVcenterPassword(java.lang.String)` was removed
* `withVirtualNetworkId(java.lang.String)` was removed
* `withAvailability(models.AvailabilityProperties)` was removed
* `withDnsZoneType(models.DnsZoneType)` was removed
* `withNsxtPassword(java.lang.String)` was removed
* `withNetworkBlock(java.lang.String)` was removed
* `withExtendedNetworkBlocks(java.util.List)` was removed
* `withSecondaryCircuit(models.Circuit)` was removed
* `withManagementCluster(models.ManagementCluster)` was removed
* `withIdentitySources(java.util.List)` was removed
* `withCircuit(models.Circuit)` was removed
* `withEncryption(models.Encryption)` was removed
* `withInternet(models.InternetEnum)` was removed

#### `models.CloudLink$Update` was modified

* `withLinkedCloud(java.lang.String)` was removed

#### `models.WorkloadNetworkVMGroup` was modified

* `revision()` was removed
* `members()` was removed
* `status()` was removed
* `displayName()` was removed
* `provisioningState()` was removed

#### `models.ExpressRouteAuthorization$Definition` was modified

* `withExpressRouteId(java.lang.String)` was removed

#### `models.ExpressRouteAuthorization$Update` was modified

* `withExpressRouteId(java.lang.String)` was removed

#### `models.AddonHcxProperties` was modified

* `provisioningState()` was removed

#### `models.WorkloadNetworkDnsService$Definition` was modified

* `withFqdnZones(java.util.List)` was removed
* `withRevision(java.lang.Long)` was removed
* `withDisplayName(java.lang.String)` was removed
* `withDefaultDnsZone(java.lang.String)` was removed
* `withDnsServiceIp(java.lang.String)` was removed
* `withLogLevel(models.DnsServiceLogLevelEnum)` was removed
* `withExistingPrivateCloud(java.lang.String,java.lang.String)` was removed

#### `models.HcxEnterpriseSite` was modified

* `status()` was removed
* `provisioningState()` was removed
* `activationKey()` was removed

#### `models.Datastore$Update` was modified

* `withNetAppVolume(models.NetAppVolume)` was removed
* `withElasticSanVolume(models.ElasticSanVolume)` was removed
* `withDiskPoolVolume(models.DiskPoolVolume)` was removed

#### `models.PrivateCloudIdentity` was modified

* `models.ResourceIdentityType type()` -> `models.SystemAssignedServiceIdentityType type()`
* `withType(models.ResourceIdentityType)` was removed

#### `models.GlobalReachConnection$Update` was modified

* `withPeerExpressRouteCircuit(java.lang.String)` was removed
* `withExpressRouteId(java.lang.String)` was removed
* `withAuthorizationKey(java.lang.String)` was removed

#### `models.WorkloadNetworkGateway` was modified

* `displayName()` was removed
* `path()` was removed
* `provisioningState()` was removed

#### `models.PrivateCloud` was modified

* `circuit()` was removed
* `vcenterCertificateThumbprint()` was removed
* `identitySources()` was removed
* `managementCluster()` was removed
* `networkBlock()` was removed
* `dnsZoneType()` was removed
* `nsxtCertificateThumbprint()` was removed
* `externalCloudLinks()` was removed
* `encryption()` was removed
* `managementNetwork()` was removed
* `endpoints()` was removed
* `nsxtPassword()` was removed
* `secondaryCircuit()` was removed
* `extendedNetworkBlocks()` was removed
* `internet()` was removed
* `availability()` was removed
* `nsxPublicIpQuotaRaised()` was removed
* `provisioningNetwork()` was removed
* `virtualNetworkId()` was removed
* `vcenterPassword()` was removed
* `vmotionNetwork()` was removed
* `provisioningState()` was removed

#### `models.WorkloadNetworkDnsService` was modified

* `dnsServiceIp()` was removed
* `status()` was removed
* `logLevel()` was removed
* `displayName()` was removed
* `defaultDnsZone()` was removed
* `provisioningState()` was removed
* `revision()` was removed
* `fqdnZones()` was removed

#### `models.AddonSrmProperties` was modified

* `provisioningState()` was removed

#### `models.WorkloadNetworkDhcp` was modified

* `refresh()` was removed
* `refresh(com.azure.core.util.Context)` was removed

#### `models.WorkloadNetworkDhcpServer` was modified

* `segments()` was removed
* `provisioningState()` was removed

### Features Added

* `models.HostKind` was added

* `models.WorkloadNetworkDnsServiceProperties` was added

* `models.ProvisionedNetwork` was added

* `models.IscsiPath$UpdateStages` was added

* `models.ResourceSkuRestrictionInfo` was added

* `implementation.models.DatastoreList` was added

* `implementation.models.ScriptPackagesList` was added

* `models.SpecializedHostProperties` was added

* `models.VirtualMachineProperties` was added

* `models.ResourceSkuLocationInfo` was added

* `models.IscsiPath$Update` was added

* `models.IscsiPath$DefinitionStages` was added

* `models.WorkloadNetworkGatewayProperties` was added

* `models.HostProvisioningState` was added

* `models.GeneralHostProperties` was added

* `models.WorkloadNetworkVirtualMachineProperties` was added

* `models.HostMaintenance` was added

* `models.Skus` was added

* `implementation.models.VirtualMachinesList` was added

* `models.HostModel` was added

* `models.WorkloadNetworkVMGroupProperties` was added

* `models.WorkloadNetworkPublicIpProperties` was added

* `implementation.models.ExpressRouteAuthorizationList` was added

* `implementation.models.WorkloadNetworkList` was added

* `models.WorkloadNetworkProperties` was added

* `models.HostProperties` was added

* `models.ProvisionedNetworks` was added

* `models.SystemAssignedServiceIdentityType` was added

* `models.ResourceSku` was added

* `models.ResourceSkuRestrictionsReasonCode` was added

* `models.HcxEnterpriseSiteProperties` was added

* `models.ResourceSkuZoneDetails` was added

* `models.CloudLinkProperties` was added

* `models.IscsiPath$Definition` was added

* `models.ResourceSkuRestrictionsType` was added

* `implementation.models.PrivateCloudList` was added

* `implementation.models.ClusterList` was added

* `models.DatastoreProperties` was added

* `models.ResourceSkuResourceType` was added

* `models.ResourceSkuRestrictions` was added

* `implementation.models.CloudLinkList` was added

* `models.WorkloadNetworkDnsZoneProperties` was added

* `models.WorkloadNetworkPortMirroringProperties` was added

* `implementation.models.AddonList` was added

* `models.ScriptPackageProperties` was added

* `implementation.models.WorkloadNetworkDnsServicesList` was added

* `implementation.models.PagedResourceSku` was added

* `models.ProvisionedNetworkProvisioningState` was added

* `models.PrivateCloudProperties` was added

* `implementation.models.WorkloadNetworkGatewayList` was added

* `models.PureStorageVolume` was added

* `implementation.models.PlacementPoliciesList` was added

* `models.ResourceSkuCapabilities` was added

* `models.Hosts` was added

* `models.ScriptExecutionPropertiesNamedOutput` was added

* `models.WorkloadNetworkSegmentProperties` was added

* `implementation.models.WorkloadNetworkVMGroupsList` was added

* `models.ExpressRouteAuthorizationProperties` was added

* `implementation.models.WorkloadNetworkDhcpList` was added

* `models.ProvisionedNetworkProperties` was added

* `implementation.models.WorkloadNetworkVirtualMachinesList` was added

* `implementation.models.ScriptExecutionsList` was added

* `implementation.models.HostListResult` was added

* `implementation.models.WorkloadNetworkDnsZonesList` was added

* `models.ScriptExecutionProperties` was added

* `implementation.models.HcxEnterpriseSiteList` was added

* `models.IscsiPathProperties` was added

* `implementation.models.IscsiPathListResult` was added

* `models.ScriptCmdletProperties` was added

* `implementation.models.WorkloadNetworkSegmentsList` was added

* `implementation.models.WorkloadNetworkPublicIPsList` was added

* `models.ClusterProperties` was added

* `implementation.models.ScriptCmdletsList` was added

* `implementation.models.WorkloadNetworkPortMirroringList` was added

* `models.GlobalReachConnectionProperties` was added

* `implementation.models.ProvisionedNetworkListResult` was added

* `implementation.models.OperationListResult` was added

* `implementation.models.GlobalReachConnectionList` was added

* `models.ProvisionedNetworkTypes` was added

#### `models.CloudLink$Definition` was modified

* `withProperties(models.CloudLinkProperties)` was added

#### `models.Cluster$Definition` was modified

* `withProperties(models.ClusterProperties)` was added

#### `models.ScriptExecution$Update` was modified

* `withProperties(models.ScriptExecutionProperties)` was added

#### `models.ScriptCmdlet` was modified

* `properties()` was added

#### `models.Cluster` was modified

* `properties()` was added

#### `models.GlobalReachConnection` was modified

* `properties()` was added

#### `models.WorkloadNetworkDnsZone$Update` was modified

* `withProperties(models.WorkloadNetworkDnsZoneProperties)` was added

#### `models.IscsiPath` was modified

* `refresh(com.azure.core.util.Context)` was added
* `update()` was added
* `properties()` was added
* `refresh()` was added
* `resourceGroupName()` was added

#### `models.WorkloadNetworks` was modified

* `deleteDhcp(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `listDnsZones(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getSegment(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `getVirtualMachine(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `get(java.lang.String,java.lang.String,java.lang.String)` was added
* `getVirtualMachineWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getPublicIPByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `getPublicIP(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `getPortMirroring(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `listDhcp(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getVMGroupWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listVirtualMachines(java.lang.String,java.lang.String,java.lang.String)` was added
* `listDnsService(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getGatewayWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `deleteDhcp(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listPublicIPs(java.lang.String,java.lang.String,java.lang.String)` was added
* `getPublicIPById(java.lang.String)` was added
* `listPortMirroring(java.lang.String,java.lang.String,java.lang.String)` was added
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getDnsServiceWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listPublicIPs(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `deleteSegment(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `getPortMirroringWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getSegmentWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getDnsService(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `listDnsService(java.lang.String,java.lang.String,java.lang.String)` was added
* `listVMGroups(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getDnsZoneWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getDnsZone(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `listSegments(java.lang.String,java.lang.String,java.lang.String)` was added
* `listPortMirroring(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listSegments(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listDhcp(java.lang.String,java.lang.String,java.lang.String)` was added
* `getVMGroup(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `getGateway(java.lang.String,java.lang.String,java.lang.String,java.lang.String)` was added
* `definePublicIP(java.lang.String)` was added
* `listVMGroups(java.lang.String,java.lang.String,java.lang.String)` was added
* `listGateways(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `deleteSegment(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getPublicIPWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listVirtualMachines(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `deletePublicIP(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `deletePublicIP(java.lang.String,java.lang.String,java.lang.String)` was added
* `listDnsZones(java.lang.String,java.lang.String,java.lang.String)` was added
* `listGateways(java.lang.String,java.lang.String,java.lang.String)` was added
* `defineSegment(java.lang.String)` was added

#### `models.WorkloadNetworkDhcp$Definition` was modified

* `withExistingWorkloadNetwork(java.lang.String,java.lang.String,java.lang.String)` was added

#### `models.ExpressRouteAuthorization` was modified

* `properties()` was added

#### `models.VirtualMachine` was modified

* `properties()` was added

#### `models.WorkloadNetworkSegment$Definition` was modified

* `withExistingWorkloadNetwork(java.lang.String,java.lang.String,java.lang.String)` was added
* `withProperties(models.WorkloadNetworkSegmentProperties)` was added

#### `models.WorkloadNetworkPublicIp$Definition` was modified

* `withExistingWorkloadNetwork(java.lang.String,java.lang.String,java.lang.String)` was added
* `withProperties(models.WorkloadNetworkPublicIpProperties)` was added

#### `models.IscsiPaths` was modified

* `deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was added
* `deleteById(java.lang.String)` was added
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `define(java.lang.String)` was added
* `getById(java.lang.String)` was added
* `get(java.lang.String,java.lang.String,java.lang.String)` was added
* `delete(java.lang.String,java.lang.String,java.lang.String)` was added
* `delete(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was added

#### `models.WorkloadNetworkDnsZone` was modified

* `properties()` was added

#### `models.ScriptPackage` was modified

* `properties()` was added

#### `models.WorkloadNetworkSegment$Update` was modified

* `withProperties(models.WorkloadNetworkSegmentProperties)` was added

#### `models.Datastore` was modified

* `properties()` was added

#### `models.WorkloadNetworkSegment` was modified

* `properties()` was added

#### `models.Datastore$Definition` was modified

* `withProperties(models.DatastoreProperties)` was added

#### `models.WorkloadNetworkDnsService$Update` was modified

* `withProperties(models.WorkloadNetworkDnsServiceProperties)` was added

#### `models.ScriptExecution$Definition` was modified

* `withProperties(models.ScriptExecutionProperties)` was added

#### `models.WorkloadNetworkVMGroup$Update` was modified

* `withProperties(models.WorkloadNetworkVMGroupProperties)` was added

#### `models.HcxEnterpriseSite$Update` was modified

* `withProperties(models.HcxEnterpriseSiteProperties)` was added

#### `models.WorkloadNetworkVMGroup$Definition` was modified

* `withExistingWorkloadNetwork(java.lang.String,java.lang.String,java.lang.String)` was added
* `withProperties(models.WorkloadNetworkVMGroupProperties)` was added

#### `models.GlobalReachConnection$Definition` was modified

* `withProperties(models.GlobalReachConnectionProperties)` was added

#### `models.WorkloadNetworkVirtualMachine` was modified

* `properties()` was added

#### `AvsManager` was modified

* `hosts()` was added
* `skus()` was added
* `provisionedNetworks()` was added

#### `models.WorkloadNetworkPortMirroring$Update` was modified

* `withProperties(models.WorkloadNetworkPortMirroringProperties)` was added

#### `models.CloudLink` was modified

* `properties()` was added

#### `models.WorkloadNetwork` was modified

* `properties()` was added

#### `models.WorkloadNetworkDnsZone$Definition` was modified

* `withProperties(models.WorkloadNetworkDnsZoneProperties)` was added
* `withExistingWorkloadNetwork(java.lang.String,java.lang.String,java.lang.String)` was added

#### `models.HcxEnterpriseSite$Definition` was modified

* `withProperties(models.HcxEnterpriseSiteProperties)` was added

#### `models.WorkloadNetworkPortMirroring` was modified

* `properties()` was added

#### `models.ScriptExecution` was modified

* `properties()` was added

#### `models.WorkloadNetworkPublicIp` was modified

* `properties()` was added

#### `models.WorkloadNetworkPortMirroring$Definition` was modified

* `withExistingWorkloadNetwork(java.lang.String,java.lang.String,java.lang.String)` was added
* `withProperties(models.WorkloadNetworkPortMirroringProperties)` was added

#### `models.PrivateCloud$Definition` was modified

* `withZones(java.util.List)` was added
* `withProperties(models.PrivateCloudProperties)` was added

#### `models.CloudLink$Update` was modified

* `withProperties(models.CloudLinkProperties)` was added

#### `models.WorkloadNetworkVMGroup` was modified

* `properties()` was added

#### `models.ExpressRouteAuthorization$Definition` was modified

* `withProperties(models.ExpressRouteAuthorizationProperties)` was added

#### `models.ExpressRouteAuthorization$Update` was modified

* `withProperties(models.ExpressRouteAuthorizationProperties)` was added

#### `models.AddonHcxProperties` was modified

* `withUplinkNetwork(java.lang.String)` was added
* `withManagementNetwork(java.lang.String)` was added
* `managementNetwork()` was added
* `uplinkNetwork()` was added

#### `models.WorkloadNetworkDnsService$Definition` was modified

* `withExistingWorkloadNetwork(java.lang.String,java.lang.String,java.lang.String)` was added
* `withProperties(models.WorkloadNetworkDnsServiceProperties)` was added

#### `models.HcxEnterpriseSite` was modified

* `properties()` was added

#### `models.Datastore$Update` was modified

* `withProperties(models.DatastoreProperties)` was added

#### `models.PrivateCloudIdentity` was modified

* `withType(models.SystemAssignedServiceIdentityType)` was added

#### `models.GlobalReachConnection$Update` was modified

* `withProperties(models.GlobalReachConnectionProperties)` was added

#### `models.WorkloadNetworkGateway` was modified

* `properties()` was added

#### `models.PrivateCloud` was modified

* `properties()` was added
* `zones()` was added

#### `models.WorkloadNetworkDnsService` was modified

* `properties()` was added

## 1.2.0 (2024-09-11)

- Azure Resource Manager Avs client library for Java. This package contains Microsoft Azure SDK for Avs Management SDK. Azure VMware Solution API. Package tag package-2023-09-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.ServiceSpecification` was removed

* `models.MetricSpecification` was removed

* `models.WorkloadNetworkName` was removed

* `models.MetricDimension` was removed

* `models.OperationList` was removed

* `models.LogSpecification` was removed

* `models.OperationProperties` was removed

* `models.CommonClusterProperties` was removed

#### `models.WorkloadNetworks` was modified

* `getWithResponse(java.lang.String,java.lang.String,models.WorkloadNetworkName,com.azure.core.util.Context)` was removed
* `get(java.lang.String,java.lang.String,models.WorkloadNetworkName)` was removed

#### `models.Operation` was modified

* `java.lang.String origin()` -> `models.Origin origin()`
* `properties()` was removed

#### `models.ManagementCluster` was modified

* `withClusterSize(java.lang.Integer)` was removed
* `withHosts(java.util.List)` was removed

### Features Added

* `models.CloudLinkProvisioningState` was added

* `models.IscsiPath` was added

* `models.IscsiPaths` was added

* `models.ScriptCmdletAudience` was added

* `models.VirtualMachineProvisioningState` was added

* `models.HcxEnterpriseSiteProvisioningState` was added

* `models.ActionType` was added

* `models.WorkloadNetworkProvisioningState` was added

* `models.SkuTier` was added

* `models.ScriptCmdletProvisioningState` was added

* `models.DnsZoneType` was added

* `models.ElasticSanVolume` was added

* `models.IscsiPathProvisioningState` was added

* `models.ScriptPackageProvisioningState` was added

* `models.OperationListResult` was added

* `models.Origin` was added

* `models.IscsiPathListResult` was added

#### `models.Cluster$Definition` was modified

* `withVsanDatastoreName(java.lang.String)` was added

#### `models.DatastoreList` was modified

* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added

#### `models.ClusterList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkSegmentPortVif` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ScriptStringExecutionParameter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added

#### `models.WorkloadNetworkDhcpRelay` was modified

* `provisioningState()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `dhcpType()` was added
* `segments()` was added

#### `models.ScriptCmdlet` was modified

* `audience()` was added
* `provisioningState()` was added
* `systemData()` was added

#### `models.GlobalReachConnectionList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added

#### `models.Cluster` was modified

* `systemData()` was added
* `vsanDatastoreName()` was added

#### `models.WorkloadNetworkSegmentSubnet` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AvailabilityProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.GlobalReachConnection` was modified

* `systemData()` was added

#### `models.DiskPoolVolume` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkDhcpEntity` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `dhcpType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworks` was modified

* `getWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `get(java.lang.String,java.lang.String)` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Operation` was modified

* `actionType()` was added

#### `models.AddonList` was modified

* `withValue(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AddonArcProperties` was modified

* `addonType()` was added
* `provisioningState()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExpressRouteAuthorization` was modified

* `systemData()` was added

#### `models.VmPlacementPolicyProperties` was modified

* `type()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `provisioningState()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VirtualMachine` was modified

* `systemData()` was added
* `provisioningState()` was added

#### `models.VirtualMachinesList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added

#### `models.WorkloadNetworkDhcpList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added
* `withNextLink(java.lang.String)` was added

#### `models.EncryptionKeyVaultProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkDnsZone` was modified

* `systemData()` was added

#### `models.PlacementPolicy` was modified

* `systemData()` was added

#### `models.ScriptPackage` was modified

* `provisioningState()` was added
* `systemData()` was added

#### `models.Addon` was modified

* `systemData()` was added

#### `models.Datastore` was modified

* `elasticSanVolume()` was added
* `systemData()` was added

#### `models.ClusterZone` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkSegment` was modified

* `systemData()` was added

#### `models.Datastore$Definition` was modified

* `withElasticSanVolume(models.ElasticSanVolume)` was added

#### `models.PrivateCloud$Update` was modified

* `withDnsZoneType(models.DnsZoneType)` was added
* `withSku(models.Sku)` was added

#### `models.AddonVrProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `addonType()` was added
* `provisioningState()` was added

#### `models.ScriptParameter` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ScriptCmdletsList` was modified

* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IdentitySource` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadNetworkVirtualMachine` was modified

* `systemData()` was added
* `provisioningState()` was added

#### `models.PlacementPolicyUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `AvsManager` was modified

* `iscsiPaths()` was added

#### `models.CloudLinkList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AddonProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `addonType()` was added

#### `models.WorkloadNetworkVMGroupsList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added
* `withNextLink(java.lang.String)` was added

#### `models.Encryption` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NetAppVolume` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CloudLink` was modified

* `systemData()` was added
* `provisioningState()` was added

#### `models.ScriptExecutionsList` was modified

* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadNetwork` was modified

* `systemData()` was added
* `provisioningState()` was added

#### `models.HcxEnterpriseSiteList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withValue(java.util.List)` was added

#### `models.ManagementCluster` was modified

* `clusterId()` was added
* `vsanDatastoreName()` was added
* `withVsanDatastoreName(java.lang.String)` was added
* `hosts()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `clusterSize()` was added
* `provisioningState()` was added

#### `models.VmHostPlacementPolicyProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `provisioningState()` was added

#### `models.PrivateCloudUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withDnsZoneType(models.DnsZoneType)` was added
* `sku()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `dnsZoneType()` was added
* `withSku(models.Sku)` was added

#### `models.WorkloadNetworkPortMirroringList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withValue(java.util.List)` was added
* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ScriptSecureStringExecutionParameter` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `type()` was added

#### `models.WorkloadNetworkPortMirroring` was modified

* `systemData()` was added

#### `models.ScriptExecution` was modified

* `systemData()` was added

#### `models.WorkloadNetworkPublicIp` was modified

* `systemData()` was added

#### `models.WorkloadNetworkVirtualMachinesList` was modified

* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrivateCloud$Definition` was modified

* `withVirtualNetworkId(java.lang.String)` was added
* `withDnsZoneType(models.DnsZoneType)` was added

#### `models.WorkloadNetworkVMGroup` was modified

* `systemData()` was added

#### `models.ExpressRouteAuthorization$Definition` was modified

* `withExpressRouteId(java.lang.String)` was added

#### `models.ExpressRouteAuthorization$Update` was modified

* `withExpressRouteId(java.lang.String)` was added

#### `models.Cluster$Update` was modified

* `withSku(models.Sku)` was added

#### `models.AddonHcxProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `provisioningState()` was added
* `addonType()` was added

#### `models.Endpoints` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `nsxtManagerIp()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `vcenterIp()` was added
* `hcxCloudManagerIp()` was added

#### `models.PlacementPolicyProperties` was modified

* `type()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PSCredentialExecutionParameter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `type()` was added

#### `models.WorkloadNetworkList` was modified

* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.HcxEnterpriseSite` was modified

* `systemData()` was added
* `provisioningState()` was added

#### `models.Datastore$Update` was modified

* `withElasticSanVolume(models.ElasticSanVolume)` was added

#### `models.PlacementPoliciesList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrivateCloudIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ClusterUpdate` was modified

* `sku()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withSku(models.Sku)` was added

#### `models.WorkloadNetworkPublicIPsList` was modified

* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VirtualMachineRestrictMovement` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Sku` was modified

* `withTier(models.SkuTier)` was added
* `size()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withSize(java.lang.String)` was added
* `capacity()` was added
* `withFamily(java.lang.String)` was added
* `tier()` was added
* `family()` was added
* `withCapacity(java.lang.Integer)` was added

#### `models.WorkloadNetworkSegmentsList` was modified

* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ScriptExecutionParameter` was modified

* `type()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadNetworkGateway` was modified

* `provisioningState()` was added
* `systemData()` was added

#### `models.PrivateCloud` was modified

* `dnsZoneType()` was added
* `systemData()` was added
* `virtualNetworkId()` was added

#### `models.WorkloadNetworkDnsService` was modified

* `systemData()` was added

#### `models.WorkloadNetworkDnsServicesList` was modified

* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrivateCloudList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added

#### `models.ExpressRouteAuthorizationList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkDnsZonesList` was modified

* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added

#### `models.AddonSrmProperties` was modified

* `provisioningState()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `addonType()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadNetworkGatewayList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added

#### `models.WorkloadNetworkDhcp` was modified

* `systemData()` was added

#### `models.ScriptPackagesList` was modified

* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Circuit` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadNetworkDhcpServer` was modified

* `segments()` was added
* `dhcpType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `provisioningState()` was added

## 1.2.0-beta.1 (2024-06-25)

- Azure Resource Manager Avs client library for Java. This package contains Microsoft Azure SDK for Avs Management SDK. Azure VMware Solution API. Package tag package-2023-09-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.ServiceSpecification` was removed

* `models.MetricSpecification` was removed

* `models.WorkloadNetworkName` was removed

* `models.MetricDimension` was removed

* `models.OperationList` was removed

* `models.LogSpecification` was removed

* `models.OperationProperties` was removed

* `models.CommonClusterProperties` was removed

#### `models.WorkloadNetworks` was modified

* `getWithResponse(java.lang.String,java.lang.String,models.WorkloadNetworkName,com.azure.core.util.Context)` was removed
* `get(java.lang.String,java.lang.String,models.WorkloadNetworkName)` was removed

#### `models.Operation` was modified

* `java.lang.String origin()` -> `models.Origin origin()`
* `properties()` was removed

#### `models.ManagementCluster` was modified

* `withHosts(java.util.List)` was removed
* `withClusterSize(java.lang.Integer)` was removed

### Features Added

* `models.CloudLinkProvisioningState` was added

* `models.IscsiPath` was added

* `models.IscsiPaths` was added

* `models.ScriptCmdletAudience` was added

* `models.VirtualMachineProvisioningState` was added

* `models.HcxEnterpriseSiteProvisioningState` was added

* `models.ActionType` was added

* `models.WorkloadNetworkProvisioningState` was added

* `models.SkuTier` was added

* `models.ScriptCmdletProvisioningState` was added

* `models.DnsZoneType` was added

* `models.ElasticSanVolume` was added

* `models.IscsiPathProvisioningState` was added

* `models.ScriptPackageProvisioningState` was added

* `models.OperationListResult` was added

* `models.Origin` was added

* `models.IscsiPathListResult` was added

#### `models.Cluster$Definition` was modified

* `withVsanDatastoreName(java.lang.String)` was added

#### `models.DatastoreList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added

#### `models.ClusterList` was modified

* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkSegmentPortVif` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ScriptStringExecutionParameter` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `type()` was added

#### `models.WorkloadNetworkDhcpRelay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `segments()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `provisioningState()` was added
* `dhcpType()` was added

#### `models.ScriptCmdlet` was modified

* `audience()` was added
* `provisioningState()` was added
* `systemData()` was added

#### `models.GlobalReachConnectionList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added

#### `models.Cluster` was modified

* `systemData()` was added
* `vsanDatastoreName()` was added

#### `models.WorkloadNetworkSegmentSubnet` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AvailabilityProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.GlobalReachConnection` was modified

* `systemData()` was added

#### `models.DiskPoolVolume` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadNetworkDhcpEntity` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `dhcpType()` was added

#### `models.WorkloadNetworks` was modified

* `get(java.lang.String,java.lang.String)` was added
* `getWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Operation` was modified

* `actionType()` was added

#### `models.AddonList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withValue(java.util.List)` was added

#### `models.AddonArcProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `provisioningState()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `addonType()` was added

#### `models.ExpressRouteAuthorization` was modified

* `systemData()` was added

#### `models.VmPlacementPolicyProperties` was modified

* `type()` was added
* `provisioningState()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VirtualMachine` was modified

* `provisioningState()` was added
* `systemData()` was added

#### `models.VirtualMachinesList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadNetworkDhcpList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EncryptionKeyVaultProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadNetworkDnsZone` was modified

* `systemData()` was added

#### `models.PlacementPolicy` was modified

* `systemData()` was added

#### `models.ScriptPackage` was modified

* `provisioningState()` was added
* `systemData()` was added

#### `models.Addon` was modified

* `systemData()` was added

#### `models.Datastore` was modified

* `elasticSanVolume()` was added
* `systemData()` was added

#### `models.ClusterZone` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadNetworkSegment` was modified

* `systemData()` was added

#### `models.Datastore$Definition` was modified

* `withElasticSanVolume(models.ElasticSanVolume)` was added

#### `models.PrivateCloud$Update` was modified

* `withSku(models.Sku)` was added
* `withDnsZoneType(models.DnsZoneType)` was added

#### `models.AddonVrProperties` was modified

* `addonType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `provisioningState()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ScriptParameter` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ScriptCmdletsList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withValue(java.util.List)` was added
* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.IdentitySource` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkVirtualMachine` was modified

* `provisioningState()` was added
* `systemData()` was added

#### `models.PlacementPolicyUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `AvsManager` was modified

* `iscsiPaths()` was added

#### `models.CloudLinkList` was modified

* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AddonProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `addonType()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkVMGroupsList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added

#### `models.Encryption` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NetAppVolume` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CloudLink` was modified

* `provisioningState()` was added
* `systemData()` was added

#### `models.ScriptExecutionsList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added
* `withNextLink(java.lang.String)` was added

#### `models.WorkloadNetwork` was modified

* `provisioningState()` was added
* `systemData()` was added

#### `models.HcxEnterpriseSiteList` was modified

* `withValue(java.util.List)` was added
* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ManagementCluster` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `provisioningState()` was added
* `clusterSize()` was added
* `withVsanDatastoreName(java.lang.String)` was added
* `vsanDatastoreName()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `hosts()` was added
* `clusterId()` was added

#### `models.VmHostPlacementPolicyProperties` was modified

* `provisioningState()` was added
* `type()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrivateCloudUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `sku()` was added
* `withDnsZoneType(models.DnsZoneType)` was added
* `withSku(models.Sku)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `dnsZoneType()` was added

#### `models.WorkloadNetworkPortMirroringList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added

#### `models.ScriptSecureStringExecutionParameter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `type()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkPortMirroring` was modified

* `systemData()` was added

#### `models.ScriptExecution` was modified

* `systemData()` was added

#### `models.WorkloadNetworkPublicIp` was modified

* `systemData()` was added

#### `models.WorkloadNetworkVirtualMachinesList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added

#### `models.PrivateCloud$Definition` was modified

* `withVirtualNetworkId(java.lang.String)` was added
* `withDnsZoneType(models.DnsZoneType)` was added

#### `models.WorkloadNetworkVMGroup` was modified

* `systemData()` was added

#### `models.ExpressRouteAuthorization$Definition` was modified

* `withExpressRouteId(java.lang.String)` was added

#### `models.ExpressRouteAuthorization$Update` was modified

* `withExpressRouteId(java.lang.String)` was added

#### `models.Cluster$Update` was modified

* `withSku(models.Sku)` was added

#### `models.AddonHcxProperties` was modified

* `provisioningState()` was added
* `addonType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Endpoints` was modified

* `hcxCloudManagerIp()` was added
* `vcenterIp()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `nsxtManagerIp()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PlacementPolicyProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `type()` was added

#### `models.PSCredentialExecutionParameter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `type()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkList` was modified

* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HcxEnterpriseSite` was modified

* `provisioningState()` was added
* `systemData()` was added

#### `models.Datastore$Update` was modified

* `withElasticSanVolume(models.ElasticSanVolume)` was added

#### `models.PlacementPoliciesList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrivateCloudIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ClusterUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `sku()` was added
* `withSku(models.Sku)` was added

#### `models.WorkloadNetworkPublicIPsList` was modified

* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VirtualMachineRestrictMovement` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Sku` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `family()` was added
* `size()` was added
* `capacity()` was added
* `withSize(java.lang.String)` was added
* `withCapacity(java.lang.Integer)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `tier()` was added
* `withFamily(java.lang.String)` was added
* `withTier(models.SkuTier)` was added

#### `models.WorkloadNetworkSegmentsList` was modified

* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added

#### `models.ScriptExecutionParameter` was modified

* `type()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkGateway` was modified

* `systemData()` was added
* `provisioningState()` was added

#### `models.PrivateCloud` was modified

* `virtualNetworkId()` was added
* `dnsZoneType()` was added
* `systemData()` was added

#### `models.WorkloadNetworkDnsService` was modified

* `systemData()` was added

#### `models.WorkloadNetworkDnsServicesList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added
* `withValue(java.util.List)` was added

#### `models.PrivateCloudList` was modified

* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExpressRouteAuthorizationList` was modified

* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withValue(java.util.List)` was added

#### `models.WorkloadNetworkDnsZonesList` was modified

* `withValue(java.util.List)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withNextLink(java.lang.String)` was added

#### `models.AddonSrmProperties` was modified

* `addonType()` was added
* `provisioningState()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkGatewayList` was modified

* `withNextLink(java.lang.String)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `withValue(java.util.List)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WorkloadNetworkDhcp` was modified

* `systemData()` was added

#### `models.ScriptPackagesList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withNextLink(java.lang.String)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withValue(java.util.List)` was added

#### `models.Circuit` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WorkloadNetworkDhcpServer` was modified

* `dhcpType()` was added
* `provisioningState()` was added
* `segments()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

## 1.1.0 (2023-08-22)

- Azure Resource Manager Avs client library for Java. This package contains Microsoft Azure SDK for Avs Management SDK. Azure VMware Solution API. Package tag package-2023-03-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.PrivateCloud$Update` was modified

* `withExtendedNetworkBlocks(java.util.List)` was added

#### `models.PrivateCloudUpdate` was modified

* `extendedNetworkBlocks()` was added
* `withExtendedNetworkBlocks(java.util.List)` was added

#### `models.PrivateCloud$Definition` was modified

* `withExtendedNetworkBlocks(java.util.List)` was added

#### `models.PrivateCloud` was modified

* `extendedNetworkBlocks()` was added

## 1.0.0 (2023-02-24)

- Azure Resource Manager Avs client library for Java. This package contains Microsoft Azure SDK for Avs Management SDK. Azure VMware Solution API. Package tag package-2022-05-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.Cluster$Definition` was modified

* `withClusterSize(java.lang.Integer)` was added
* `withHosts(java.util.List)` was added

#### `models.Cluster` was modified

* `provisioningState()` was added
* `clusterId()` was added
* `hosts()` was added
* `clusterSize()` was added

## 1.0.0-beta.4 (2022-10-17)

- Azure Resource Manager Avs client library for Java. This package contains Microsoft Azure SDK for Avs Management SDK. Azure VMware Solution API. Package tag package-2022-05-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.Locations` was modified

* `checkTrialAvailabilityWithResponse(java.lang.String,com.azure.core.util.Context)` was removed

#### `models.PrivateCloud$Update` was modified

* `withAvailability(models.AvailabilityProperties)` was removed

### Features Added

* `models.AddonArcProperties` was added

* `models.WorkloadNetworkName` was added

* `models.NsxPublicIpQuotaRaisedEnum` was added

* `models.ClusterZone` was added

* `models.AzureHybridBenefitType` was added

* `models.WorkloadNetwork` was added

* `models.AffinityStrength` was added

* `models.WorkloadNetworkList` was added

* `models.ClusterZoneList` was added

#### `models.Locations` was modified

* `checkTrialAvailabilityWithResponse(java.lang.String,models.Sku,com.azure.core.util.Context)` was added

#### `models.Cluster` was modified

* `listZonesWithResponse(com.azure.core.util.Context)` was added
* `listZones()` was added
* `resourceGroupName()` was added

#### `models.GlobalReachConnection` was modified

* `resourceGroupName()` was added

#### `models.WorkloadNetworks` was modified

* `getWithResponse(java.lang.String,java.lang.String,models.WorkloadNetworkName,com.azure.core.util.Context)` was added
* `list(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `get(java.lang.String,java.lang.String,models.WorkloadNetworkName)` was added
* `list(java.lang.String,java.lang.String)` was added

#### `models.ExpressRouteAuthorization` was modified

* `resourceGroupName()` was added

#### `models.EncryptionKeyVaultProperties` was modified

* `autoDetectedKeyVersion()` was added

#### `models.WorkloadNetworkDnsZone` was modified

* `resourceGroupName()` was added

#### `models.PlacementPolicy` was modified

* `resourceGroupName()` was added

#### `models.ScriptPackage` was modified

* `company()` was added
* `uri()` was added

#### `models.Addon` was modified

* `resourceGroupName()` was added

#### `models.Datastore` was modified

* `resourceGroupName()` was added

#### `models.PlacementPolicy$Update` was modified

* `withAzureHybridBenefitType(models.AzureHybridBenefitType)` was added
* `withAffinityStrength(models.AffinityStrength)` was added

#### `models.WorkloadNetworkSegment` was modified

* `resourceGroupName()` was added

#### `models.PlacementPolicyUpdate` was modified

* `withAffinityStrength(models.AffinityStrength)` was added
* `azureHybridBenefitType()` was added
* `affinityStrength()` was added
* `withAzureHybridBenefitType(models.AzureHybridBenefitType)` was added

#### `AvsManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

#### `models.CloudLink` was modified

* `resourceGroupName()` was added

#### `AvsManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

#### `models.VmHostPlacementPolicyProperties` was modified

* `withAffinityStrength(models.AffinityStrength)` was added
* `azureHybridBenefitType()` was added
* `withAzureHybridBenefitType(models.AzureHybridBenefitType)` was added
* `affinityStrength()` was added

#### `models.WorkloadNetworkPortMirroring` was modified

* `resourceGroupName()` was added

#### `models.ScriptExecution` was modified

* `resourceGroupName()` was added

#### `models.WorkloadNetworkVMGroup` was modified

* `resourceGroupName()` was added

#### `models.HcxEnterpriseSite` was modified

* `resourceGroupName()` was added

#### `models.Clusters` was modified

* `listZones(java.lang.String,java.lang.String,java.lang.String)` was added
* `listZonesWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.PrivateCloud` was modified

* `resourceGroupName()` was added
* `nsxPublicIpQuotaRaised()` was added

#### `models.WorkloadNetworkDnsService` was modified

* `resourceGroupName()` was added

#### `models.WorkloadNetworkDhcp` was modified

* `resourceGroupName()` was added

## 1.0.0-beta.3 (2021-11-10)

- Azure Resource Manager Avs client library for Java. This package contains Microsoft Azure SDK for Avs Management SDK. Azure VMware Solution API. Package tag package-2021-12-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.PrivateCloudProperties` was removed

* `models.PrivateCloudUpdateProperties` was removed

* `models.ClusterProperties` was removed

#### `models.Cluster$Definition` was modified

* `withClusterSize(java.lang.Integer)` was removed

#### `models.Cluster` was modified

* `hosts()` was removed
* `clusterId()` was removed
* `clusterSize()` was removed
* `provisioningState()` was removed

### Features Added

* `models.EncryptionVersionType` was added

* `models.AvailabilityStrategy` was added

* `models.VmHostPlacementPolicyProperties` was added

* `models.AvailabilityProperties` was added

* `models.PlacementPolicy$UpdateStages` was added

* `models.PlacementPolicyState` was added

* `models.EncryptionState` was added

* `models.ResourceIdentityType` was added

* `models.AffinityType` was added

* `models.VmPlacementPolicyProperties` was added

* `models.PlacementPolicyProperties` was added

* `models.VirtualMachine` was added

* `models.DatastoreStatus` was added

* `models.VirtualMachineRestrictMovementState` was added

* `models.VirtualMachinesList` was added

* `models.EncryptionKeyVaultProperties` was added

* `models.PlacementPoliciesList` was added

* `models.PrivateCloudIdentity` was added

* `models.PlacementPolicy` was added

* `models.VirtualMachineRestrictMovement` was added

* `models.PlacementPolicy$Update` was added

* `models.EncryptionKeyStatus` was added

* `models.PlacementPolicy$Definition` was added

* `models.PlacementPolicyType` was added

* `models.PlacementPolicy$DefinitionStages` was added

* `models.PlacementPolicies` was added

* `models.PlacementPolicyUpdate` was added

* `models.VirtualMachines` was added

* `models.PlacementPolicyProvisioningState` was added

* `models.Encryption` was added

#### `models.ManagementCluster` was modified

* `withHosts(java.util.List)` was added
* `withHosts(java.util.List)` was added

#### `models.PrivateCloudUpdate` was modified

* `identity()` was added
* `encryption()` was added
* `withAvailability(models.AvailabilityProperties)` was added
* `withEncryption(models.Encryption)` was added
* `availability()` was added
* `withIdentity(models.PrivateCloudIdentity)` was added

#### `models.PrivateCloud$Definition` was modified

* `withEncryption(models.Encryption)` was added
* `withIdentity(models.PrivateCloudIdentity)` was added
* `withAvailability(models.AvailabilityProperties)` was added
* `withSecondaryCircuit(models.Circuit)` was added

#### `models.GlobalReachConnection` was modified

* `expressRouteId()` was added

#### `models.Cluster$Update` was modified

* `withHosts(java.util.List)` was added

#### `models.ExpressRouteAuthorization` was modified

* `expressRouteId()` was added

#### `models.ClusterUpdate` was modified

* `withHosts(java.util.List)` was added
* `hosts()` was added

#### `models.GlobalReachConnection$Update` was modified

* `withExpressRouteId(java.lang.String)` was added

#### `models.Datastore` was modified

* `status()` was added

#### `models.PrivateCloud$Update` was modified

* `withAvailability(models.AvailabilityProperties)` was added
* `withEncryption(models.Encryption)` was added
* `withIdentity(models.PrivateCloudIdentity)` was added

#### `models.PrivateCloud` was modified

* `availability()` was added
* `secondaryCircuit()` was added
* `encryption()` was added
* `identity()` was added

#### `models.GlobalReachConnection$Definition` was modified

* `withExpressRouteId(java.lang.String)` was added

#### `AvsManager` was modified

* `placementPolicies()` was added
* `virtualMachines()` was added

#### `models.CommonClusterProperties` was modified

* `withHosts(java.util.List)` was added

## 1.0.0-beta.2 (2021-07-15)

- Azure Resource Manager Avs client library for Java. This package contains Microsoft Azure SDK for Avs Management SDK. Azure VMware Solution API. Package tag package-2021-06-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.ClusterUpdateProperties` was removed

#### `models.ManagementCluster` was modified

* `models.ClusterUpdateProperties withClusterSize(java.lang.Integer)` -> `models.CommonClusterProperties withClusterSize(java.lang.Integer)`
* `provisioningState()` was removed
* `hosts()` was removed
* `clusterId()` was removed

#### `models.ClusterProperties` was modified

* `models.ManagementCluster withClusterSize(java.lang.Integer)` -> `models.CommonClusterProperties withClusterSize(java.lang.Integer)`
* `withClusterSize(java.lang.Integer)` was removed

### Features Added

* `models.WorkloadNetworkPublicIpProvisioningState` was added

* `models.Addon$DefinitionStages` was added

* `models.Addon$Definition` was added

* `models.CloudLink$Definition` was added

* `models.WorkloadNetworkDhcpProvisioningState` was added

* `models.NetAppVolume` was added

* `models.ScriptExecution$DefinitionStages` was added

* `models.CloudLinks` was added

* `models.CloudLink` was added

* `models.CloudLinkStatus` was added

* `models.MountOptionEnum` was added

* `models.WorkloadNetworkDnsZone$UpdateStages` was added

* `models.WorkloadNetworkPortMirroring$DefinitionStages` was added

* `models.ScriptExecutionsList` was added

* `models.GlobalReachConnections` was added

* `models.ScriptExecutions` was added

* `models.WorkloadNetworkDhcp$Update` was added

* `models.DatastoreList` was added

* `models.WorkloadNetworkDnsZone$Definition` was added

* `models.Addon$UpdateStages` was added

* `models.ScriptExecution$Update` was added

* `models.WorkloadNetworkSegmentProvisioningState` was added

* `models.GlobalReachConnection$DefinitionStages` was added

* `models.CloudLink$DefinitionStages` was added

* `models.WorkloadNetworkSegmentPortVif` was added

* `models.WorkloadNetworkPortMirroringList` was added

* `models.DhcpTypeEnum` was added

* `models.PortMirroringStatusEnum` was added

* `models.ScriptStringExecutionParameter` was added

* `models.ScriptSecureStringExecutionParameter` was added

* `models.WorkloadNetworkPortMirroring` was added

* `models.ScriptExecution` was added

* `models.WorkloadNetworkDhcpRelay` was added

* `models.WorkloadNetworkPublicIp` was added

* `models.ScriptPackages` was added

* `models.ScriptExecutionProvisioningState` was added

* `models.ScriptCmdlet` was added

* `models.WorkloadNetworkVirtualMachinesList` was added

* `models.GlobalReachConnectionList` was added

* `models.WorkloadNetworkPortMirroring$Definition` was added

* `models.ScriptExecutionParameterType` was added

* `models.WorkloadNetworkSegmentSubnet` was added

* `models.CloudLink$Update` was added

* `models.WorkloadNetworkVMGroup` was added

* `models.GlobalReachConnection` was added

* `models.DiskPoolVolume` was added

* `models.WorkloadNetworkDnsZone$DefinitionStages` was added

* `models.WorkloadNetworkDnsZone$Update` was added

* `models.GlobalReachConnection$UpdateStages` was added

* `models.WorkloadNetworkSegment$UpdateStages` was added

* `models.AddonHcxProperties` was added

* `models.WorkloadNetworkPortMirroringProvisioningState` was added

* `models.WorkloadNetworkDhcpEntity` was added

* `models.WorkloadNetworks` was added

* `models.WorkloadNetworkDhcp$UpdateStages` was added

* `models.WorkloadNetworkVMGroup$UpdateStages` was added

* `models.Datastore$UpdateStages` was added

* `models.WorkloadNetworkDnsService$Definition` was added

* `models.WorkloadNetworkDhcp$Definition` was added

* `models.AddonList` was added

* `models.SegmentStatusEnum` was added

* `models.WorkloadNetworkPortMirroring$UpdateStages` was added

* `models.WorkloadNetworkPublicIp$DefinitionStages` was added

* `models.PSCredentialExecutionParameter` was added

* `models.AddonType` was added

* `models.WorkloadNetworkSegment$Definition` was added

* `models.WorkloadNetworkDnsServiceProvisioningState` was added

* `models.WorkloadNetworkDhcpList` was added

* `models.WorkloadNetworkDnsZoneProvisioningState` was added

* `models.Datastore$DefinitionStages` was added

* `models.Datastore$Update` was added

* `models.VMTypeEnum` was added

* `models.Datastores` was added

* `models.WorkloadNetworkPublicIp$Definition` was added

* `models.OptionalParamEnum` was added

* `models.PortMirroringDirectionEnum` was added

* `models.WorkloadNetworkDnsZone` was added

* `models.VMGroupStatusEnum` was added

* `models.WorkloadNetworkSegment$DefinitionStages` was added

* `models.WorkloadNetworkPublicIPsList` was added

* `models.ScriptPackage` was added

* `models.Addon` was added

* `models.GlobalReachConnection$Update` was added

* `models.ScriptParameterTypes` was added

* `models.WorkloadNetworkSegment$Update` was added

* `models.Datastore` was added

* `models.WorkloadNetworkVMGroupProvisioningState` was added

* `models.GlobalReachConnectionProvisioningState` was added

* `models.WorkloadNetworkVMGroup$DefinitionStages` was added

* `models.Addons` was added

* `models.WorkloadNetworkDnsService$DefinitionStages` was added

* `models.WorkloadNetworkDhcp$DefinitionStages` was added

* `models.ScriptCmdlets` was added

* `models.WorkloadNetworkSegment` was added

* `models.Datastore$Definition` was added

* `models.WorkloadNetworkSegmentsList` was added

* `models.ScriptExecution$UpdateStages` was added

* `models.ScriptExecutionParameter` was added

* `models.WorkloadNetworkGateway` was added

* `models.WorkloadNetworkDnsService$Update` was added

* `models.AddonVrProperties` was added

* `models.AddonProvisioningState` was added

* `models.ScriptExecution$Definition` was added

* `models.WorkloadNetworkVMGroup$Update` was added

* `models.ScriptParameter` was added

* `models.Addon$Update` was added

* `models.ScriptCmdletsList` was added

* `models.WorkloadNetworkDnsService` was added

* `models.DnsServiceLogLevelEnum` was added

* `models.WorkloadNetworkVMGroup$Definition` was added

* `models.WorkloadNetworkDnsService$UpdateStages` was added

* `models.GlobalReachConnection$Definition` was added

* `models.DatastoreProvisioningState` was added

* `models.ScriptOutputStreamType` was added

* `models.WorkloadNetworkDnsServicesList` was added

* `models.GlobalReachConnectionStatus` was added

* `models.DnsServiceStatusEnum` was added

* `models.VisibilityParameterEnum` was added

* `models.WorkloadNetworkDnsZonesList` was added

* `models.WorkloadNetworkVirtualMachine` was added

* `models.CloudLinkList` was added

* `models.AddonSrmProperties` was added

* `models.AddonProperties` was added

* `models.WorkloadNetworkVMGroupsList` was added

* `models.WorkloadNetworkGatewayList` was added

* `models.CloudLink$UpdateStages` was added

* `models.WorkloadNetworkDhcp` was added

* `models.ScriptPackagesList` was added

* `models.WorkloadNetworkPortMirroring$Update` was added

* `models.WorkloadNetworkDhcpServer` was added

* `models.CommonClusterProperties` was added

#### `AvsManager$Configurable` was modified

* `withScope(java.lang.String)` was added

#### `models.PrivateCloudProperties` was modified

* `externalCloudLinks()` was added

#### `models.PrivateClouds` was modified

* `rotateNsxtPassword(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `rotateNsxtPassword(java.lang.String,java.lang.String)` was added
* `rotateVcenterPassword(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `rotateVcenterPassword(java.lang.String,java.lang.String)` was added

#### `models.PrivateCloud` was modified

* `rotateNsxtPassword(com.azure.core.util.Context)` was added
* `externalCloudLinks()` was added
* `rotateNsxtPassword()` was added
* `rotateVcenterPassword(com.azure.core.util.Context)` was added
* `rotateVcenterPassword()` was added

#### `AvsManager` was modified

* `addons()` was added
* `globalReachConnections()` was added
* `cloudLinks()` was added
* `datastores()` was added
* `workloadNetworks()` was added
* `scriptCmdlets()` was added
* `scriptPackages()` was added
* `scriptExecutions()` was added

## 1.0.0-beta.1 (2021-04-13)

- Azure Resource Manager Avs client library for Java. This package contains Microsoft Azure SDK for Avs Management SDK. Azure VMware Solution API. Package tag package-2020-03-20. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
