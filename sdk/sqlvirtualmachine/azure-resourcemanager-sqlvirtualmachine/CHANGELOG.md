# Release History

## 1.0.0-beta.6 (2025-05-09)

- Azure Resource Manager SqlVirtualMachine client library for Java. This package contains Microsoft Azure SDK for SqlVirtualMachine Management SDK. The SQL virtual machine management API provides a RESTful set of web APIs that interact with Azure Compute, Network & Storage services to manage your SQL Server virtual machine. The API enables users to create, delete and retrieve a SQL virtual machine, SQL virtual machine group or availability group listener. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.SqlVirtualMachineGroupListResult` was removed

#### `models.SqlVirtualMachineListResult` was removed

#### `models.PrivateIpAddress` was removed

#### `models.SqlStorageSettings` was removed

#### `models.SqlTempDbSettings` was removed

#### `models.OperationListResult` was removed

#### `models.SqlVirtualMachineTroubleshoots` was removed

#### `models.AadAuthenticationSettings` was removed

#### `models.SqlInstanceSettings` was removed

#### `models.AvailabilityGroupListenerListResult` was removed

#### `models.StorageConfigurationSettings` was modified

* `withSqlLogSettings(models.SqlStorageSettings)` was removed
* `withSqlDataSettings(models.SqlStorageSettings)` was removed
* `models.SqlStorageSettings sqlDataSettings()` -> `models.SQLStorageSettings sqlDataSettings()`
* `models.SqlTempDbSettings sqlTempDbSettings()` -> `models.SQLTempDbSettings sqlTempDbSettings()`
* `models.SqlStorageSettings sqlLogSettings()` -> `models.SQLStorageSettings sqlLogSettings()`
* `withSqlTempDbSettings(models.SqlTempDbSettings)` was removed

#### `models.SqlVirtualMachines` was modified

* `listBySqlVmGroup(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listBySqlVmGroup(java.lang.String,java.lang.String)` was removed

#### `models.SqlConnectivityUpdateSettings` was modified

* `withSqlAuthUpdateUsername(java.lang.String)` was removed
* `sqlAuthUpdateUsername()` was removed

#### `SqlVirtualMachineManager` was modified

* `sqlVirtualMachineTroubleshoots()` was removed
* `fluent.SqlVirtualMachineManagementClient serviceClient()` -> `fluent.SqlVirtualMachineClient serviceClient()`

#### `models.MultiSubnetIpConfiguration` was modified

* `models.PrivateIpAddress privateIpAddress()` -> `models.PrivateIPAddress privateIpAddress()`
* `withPrivateIpAddress(models.PrivateIpAddress)` was removed

#### `models.ServerConfigurationsManagementSettings` was modified

* `withAzureAdAuthenticationSettings(models.AadAuthenticationSettings)` was removed
* `withSqlInstanceSettings(models.SqlInstanceSettings)` was removed
* `models.SqlInstanceSettings sqlInstanceSettings()` -> `models.SQLInstanceSettings sqlInstanceSettings()`
* `models.AadAuthenticationSettings azureAdAuthenticationSettings()` -> `models.AADAuthenticationSettings azureAdAuthenticationSettings()`

#### `models.ResourceIdentity` was modified

* `java.util.UUID principalId()` -> `java.lang.String principalId()`
* `java.util.UUID tenantId()` -> `java.lang.String tenantId()`

#### `models.LoadBalancerConfiguration` was modified

* `models.PrivateIpAddress privateIpAddress()` -> `models.PrivateIPAddress privateIpAddress()`
* `withPrivateIpAddress(models.PrivateIpAddress)` was removed

### Features Added

* `models.AADAuthenticationSettings` was added

* `models.VirtualMachineIdentity` was added

* `models.SQLInstanceSettings` was added

* `models.PrivateIPAddress` was added

* `models.DiskConfigAssessmentRequest` was added

* `implementation.models.SqlVirtualMachineListResult` was added

* `models.OperationProperty` was added

* `models.SQLTempDbSettings` was added

* `implementation.models.OperationListResult` was added

* `models.OsType` was added

* `models.VmIdentityType` was added

* `models.AdditionalVmPatch` was added

* `implementation.models.AvailabilityGroupListenerListResult` was added

* `models.SQLStorageSettings` was added

* `implementation.models.SqlVirtualMachineGroupListResult` was added

* `models.AdditionalOsPatch` was added

#### `models.StorageConfigurationSettings` was modified

* `withSqlDataSettings(models.SQLStorageSettings)` was added
* `withSqlTempDbSettings(models.SQLTempDbSettings)` was added
* `enableStorageConfigBlade()` was added
* `withSqlLogSettings(models.SQLStorageSettings)` was added
* `withEnableStorageConfigBlade(java.lang.Boolean)` was added

#### `models.SqlVirtualMachines` was modified

* `troubleshoot(java.lang.String,java.lang.String,fluent.models.SqlVmTroubleshootingInner)` was added
* `fetchDCAssessment(java.lang.String,java.lang.String,models.DiskConfigAssessmentRequest)` was added
* `fetchDCAssessment(java.lang.String,java.lang.String,models.DiskConfigAssessmentRequest,com.azure.core.util.Context)` was added
* `troubleshoot(java.lang.String,java.lang.String,fluent.models.SqlVmTroubleshootingInner,com.azure.core.util.Context)` was added

#### `models.SqlVirtualMachine$Definition` was modified

* `withVirtualMachineIdentitySettings(models.VirtualMachineIdentity)` was added

#### `models.SqlConnectivityUpdateSettings` was modified

* `sqlAuthUpdateUserName()` was added
* `withSqlAuthUpdateUserName(java.lang.String)` was added

#### `models.MultiSubnetIpConfiguration` was modified

* `withPrivateIpAddress(models.PrivateIPAddress)` was added

#### `models.AutoPatchingSettings` was modified

* `additionalVmPatch()` was added
* `withAdditionalVmPatch(models.AdditionalVmPatch)` was added

#### `models.ServerConfigurationsManagementSettings` was modified

* `withAzureAdAuthenticationSettings(models.AADAuthenticationSettings)` was added
* `withSqlInstanceSettings(models.SQLInstanceSettings)` was added

#### `models.WsfcDomainProfile` was modified

* `withIsSqlServiceAccountGmsa(java.lang.Boolean)` was added
* `isSqlServiceAccountGmsa()` was added

#### `models.SqlVirtualMachineGroups` was modified

* `listBySqlVmGroup(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `listBySqlVmGroup(java.lang.String,java.lang.String)` was added

#### `models.LoadBalancerConfiguration` was modified

* `withPrivateIpAddress(models.PrivateIPAddress)` was added

#### `models.SqlVirtualMachine` was modified

* `fetchDCAssessment(models.DiskConfigAssessmentRequest,com.azure.core.util.Context)` was added
* `additionalVmPatch()` was added
* `fetchDCAssessment(models.DiskConfigAssessmentRequest)` was added
* `troubleshoot(fluent.models.SqlVmTroubleshootingInner,com.azure.core.util.Context)` was added
* `virtualMachineIdentitySettings()` was added
* `osType()` was added
* `troubleshoot(fluent.models.SqlVmTroubleshootingInner)` was added

## 1.0.0-beta.5 (2024-10-31)

- Azure Resource Manager SqlVirtualMachine client library for Java. This package contains Microsoft Azure SDK for SqlVirtualMachine Management SDK. The SQL virtual machine management API provides a RESTful set of web APIs that interact with Azure Compute, Network & Storage services to manage your SQL Server virtual machine. The API enables users to create, delete and retrieve a SQL virtual machine, SQL virtual machine group or availability group listener. Package tag package-preview-2022-08. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.SqlVirtualMachineGroupListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.WsfcDomainCredentials` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.StorageConfigurationSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SqlVirtualMachineListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Schedule` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrivateIpAddress` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SqlStorageSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SqlTempDbSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SqlConnectivityUpdateSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.KeyVaultCredentialSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MultiSubnetIpConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AssessmentSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SqlWorkloadTypeUpdateSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.TroubleshootingStatus` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutoPatchingSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AgConfiguration` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ServerConfigurationsManagementSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UnhealthyReplicaInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AutoBackupSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.WsfcDomainProfile` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AadAuthenticationSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SqlInstanceSettings` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.TroubleshootingAdditionalProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SqlStorageUpdateSettings` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AgReplica` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SqlVirtualMachineGroupUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.LoadBalancerConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SqlVirtualMachineUpdate` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AvailabilityGroupListenerListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AdditionalFeaturesServerConfigurations` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

## 1.0.0-beta.4 (2023-06-13)

- Azure Resource Manager SqlVirtualMachine client library for Java. This package contains Microsoft Azure SDK for SqlVirtualMachine Management SDK. The SQL virtual machine management API provides a RESTful set of web APIs that interact with Azure Compute, Network & Storage services to manage your SQL Server virtual machine. The API enables users to create, delete and retrieve a SQL virtual machine, SQL virtual machine group or availability group listener. Package tag package-preview-2022-08. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.TroubleshootingScenario` was added

* `models.TroubleshootingStatus` was added

* `models.UnhealthyReplicaInfo` was added

* `models.SqlVirtualMachineTroubleshoots` was added

* `models.SqlVmTroubleshooting` was added

* `models.AadAuthenticationSettings` was added

* `models.TroubleshootingAdditionalProperties` was added

#### `SqlVirtualMachineManager` was modified

* `sqlVirtualMachineTroubleshoots()` was added

#### `models.ServerConfigurationsManagementSettings` was modified

* `azureAdAuthenticationSettings()` was added
* `withAzureAdAuthenticationSettings(models.AadAuthenticationSettings)` was added

#### `models.SqlVirtualMachine` was modified

* `troubleshootingStatus()` was added

## 1.0.0-beta.3 (2022-09-20)

- Azure Resource Manager SqlVirtualMachine client library for Java. This package contains Microsoft Azure SDK for SqlVirtualMachine Management SDK. The SQL virtual machine management API provides a RESTful set of web APIs that interact with Azure Compute, Network & Storage services to manage your SQL Server virtual machine. The API enables users to create, delete and retrieve a SQL virtual machine, SQL virtual machine group or availability group listener. Package tag package-preview-2022-07. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.DaysOfWeek` was removed

#### `models.Schedule` was modified

* `withDayOfWeek(models.DayOfWeek)` was removed
* `models.DayOfWeek dayOfWeek()` -> `models.AssessmentDayOfWeek dayOfWeek()`

### Features Added

* `models.AutoBackupDaysOfWeek` was added

* `models.MultiSubnetIpConfiguration` was added

* `models.LeastPrivilegeMode` was added

* `models.AssessmentDayOfWeek` was added

* `models.ClusterSubnetType` was added

#### `models.Schedule` was modified

* `withDayOfWeek(models.AssessmentDayOfWeek)` was added

#### `models.SqlVirtualMachine$Definition` was modified

* `withEnableAutomaticUpgrade(java.lang.Boolean)` was added
* `withWsfcStaticIp(java.lang.String)` was added
* `withLeastPrivilegeMode(models.LeastPrivilegeMode)` was added

#### `models.SqlTempDbSettings` was modified

* `persistFolder()` was added
* `withPersistFolderPath(java.lang.String)` was added
* `persistFolderPath()` was added
* `withPersistFolder(java.lang.Boolean)` was added

#### `models.AvailabilityGroupListener` was modified

* `resourceGroupName()` was added
* `multiSubnetIpConfigurations()` was added

#### `SqlVirtualMachineManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

#### `models.AgConfiguration` was modified

* `withReplicas(java.util.List)` was added

#### `models.WsfcDomainProfile` was modified

* `clusterSubnetType()` was added
* `withClusterSubnetType(models.ClusterSubnetType)` was added

#### `SqlVirtualMachineManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

#### `models.SqlInstanceSettings` was modified

* `withIsIfiEnabled(java.lang.Boolean)` was added
* `withIsLpimEnabled(java.lang.Boolean)` was added
* `isIfiEnabled()` was added
* `isLpimEnabled()` was added

#### `models.SqlVirtualMachineGroup` was modified

* `resourceGroupName()` was added

#### `models.AvailabilityGroupListener$Update` was modified

* `withMultiSubnetIpConfigurations(java.util.List)` was added

#### `models.AvailabilityGroupListener$Definition` was modified

* `withMultiSubnetIpConfigurations(java.util.List)` was added

#### `models.SqlVirtualMachine` was modified

* `leastPrivilegeMode()` was added
* `resourceGroupName()` was added
* `wsfcStaticIp()` was added
* `enableAutomaticUpgrade()` was added

## 1.0.0-beta.2 (2022-02-24)

- Azure Resource Manager SqlVirtualMachine client library for Java. This package contains Microsoft Azure SDK for SqlVirtualMachine Management SDK. The SQL virtual machine management API provides a RESTful set of web APIs that interact with Azure Compute, Network & Storage services to manage your SQL Server virtual machine. The API enables users to create, delete and retrieve a SQL virtual machine, SQL virtual machine group or availability group listener. Package tag package-preview-2021-11. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.StorageConfigurationSettings` was modified

* `models.SqlStorageSettings sqlTempDbSettings()` -> `models.SqlTempDbSettings sqlTempDbSettings()`
* `withSqlTempDbSettings(models.SqlStorageSettings)` was removed

#### `models.SqlVirtualMachine$Definition` was modified

* `withSqlVirtualMachineGroupResourceId(java.lang.String)` was removed

#### `models.AvailabilityGroupListeners` was modified

* `getByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

### Features Added

* `models.Role` was added

* `models.Commit` was added

* `models.Schedule` was added

* `models.ReadableSecondary` was added

* `models.SqlTempDbSettings` was added

* `models.Failover` was added

* `models.AssessmentSettings` was added

* `models.AgConfiguration` was added

* `models.SqlInstanceSettings` was added

* `models.DaysOfWeek` was added

* `models.AgReplica` was added

#### `models.StorageConfigurationSettings` was modified

* `withSqlTempDbSettings(models.SqlTempDbSettings)` was added
* `sqlSystemDbOnDataDisk()` was added
* `withSqlSystemDbOnDataDisk(java.lang.Boolean)` was added

#### `models.SqlVirtualMachines` was modified

* `startAssessment(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `redeploy(java.lang.String,java.lang.String)` was added
* `redeploy(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `startAssessment(java.lang.String,java.lang.String)` was added

#### `models.SqlVirtualMachine$Definition` was modified

* `withAssessmentSettings(models.AssessmentSettings)` was added

#### `models.AvailabilityGroupListener` was modified

* `availabilityGroupConfiguration()` was added
* `systemData()` was added

#### `models.ServerConfigurationsManagementSettings` was modified

* `withSqlInstanceSettings(models.SqlInstanceSettings)` was added
* `sqlInstanceSettings()` was added

#### `models.AutoBackupSettings` was modified

* `daysOfWeek()` was added
* `storageContainerName()` was added
* `withDaysOfWeek(java.util.List)` was added
* `withStorageContainerName(java.lang.String)` was added

#### `SqlVirtualMachineManager$Configurable` was modified

* `withScope(java.lang.String)` was added

#### `models.AvailabilityGroupListeners` was modified

* `getByIdWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.SqlVirtualMachineGroup` was modified

* `systemData()` was added

#### `models.AvailabilityGroupListener$Update` was modified

* `withAvailabilityGroupConfiguration(models.AgConfiguration)` was added

#### `models.AvailabilityGroupListener$Definition` was modified

* `withAvailabilityGroupConfiguration(models.AgConfiguration)` was added

#### `models.SqlVirtualMachine` was modified

* `redeploy()` was added
* `assessmentSettings()` was added
* `startAssessment()` was added
* `systemData()` was added
* `redeploy(com.azure.core.util.Context)` was added
* `startAssessment(com.azure.core.util.Context)` was added

## 1.0.0-beta.1 (2020-12-18)

- Azure Resource Manager SqlVirtualMachine client library for Java. This package contains Microsoft Azure SDK for SqlVirtualMachine Management SDK. The SQL virtual machine management API provides a RESTful set of web APIs that interact with Azure Compute, Network & Storage services to manage your SQL Server virtual machine. The API enables users to create, delete and retrieve a SQL virtual machine, SQL virtual machine group or availability group listener. Package tag package-2017-03-01-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
