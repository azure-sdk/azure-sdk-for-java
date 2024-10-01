# Release History

## 1.0.0-beta.1 (2024-10-01)

- Azure Resource Manager CosmosDBForPostgreSql client library for Java. This package contains Microsoft Azure SDK for CosmosDBForPostgreSql Management SDK. Azure Cosmos DB for PostgreSQL database service resource provider REST APIs. Package tag package-preview-2023-03. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.Clusters` was modified

* `promoteReadReplica(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.Cluster` was modified

* `promoteReadReplica(com.azure.core.util.Context)` was removed

### Features Added

* `models.PrincipalType` was added

* `models.UserAssignedIdentity` was added

* `models.RoleType` was added

* `models.AuthConfig` was added

* `models.DataEncryption` was added

* `models.IdentityType` was added

* `models.PasswordEnabledEnum` was added

* `models.IdentityProperties` was added

* `models.PasswordAuth` was added

* `models.PromoteRequest` was added

* `models.DataEncryptionType` was added

* `models.ActiveDirectoryAuth` was added

* `models.AadEnabledEnum` was added

#### `models.PrivateLinkServiceConnectionState` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ClusterListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SimplePrivateEndpointConnection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `name()` was added
* `type()` was added
* `id()` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ServerConfigurationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Cluster$Update` was modified

* `withIdentity(models.IdentityProperties)` was added

#### `models.ClusterForUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withIdentity(models.IdentityProperties)` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `identity()` was added

#### `models.MaintenanceWindow` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ClusterServerListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NameAvailabilityRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PrivateEndpointConnectionListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ServerProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrivateEndpoint` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RoleListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ClusterConfigurationListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrivateEndpointProperty` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ServerNameItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Cluster$Definition` was modified

* `withDataEncryption(models.DataEncryption)` was added
* `withDatabaseName(java.lang.String)` was added
* `withEnableGeoBackup(java.lang.Boolean)` was added
* `withIdentity(models.IdentityProperties)` was added
* `withAuthConfig(models.AuthConfig)` was added

#### `models.FirewallRuleListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PrivateLinkResourceListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Clusters` was modified

* `promoteReadReplica(java.lang.String,java.lang.String,models.PromoteRequest,com.azure.core.util.Context)` was added

#### `models.Cluster` was modified

* `aadAuthEnabled()` was added
* `authConfig()` was added
* `identity()` was added
* `passwordEnabled()` was added
* `databaseName()` was added
* `dataEncryption()` was added
* `enableGeoBackup()` was added
* `promoteReadReplica(models.PromoteRequest,com.azure.core.util.Context)` was added

#### `models.Role$Definition` was modified

* `withObjectId(java.lang.String)` was added
* `withRoleType(models.RoleType)` was added
* `withTenantId(java.lang.String)` was added
* `withPrincipalType(models.PrincipalType)` was added

#### `models.Role` was modified

* `tenantId()` was added
* `objectId()` was added
* `roleType()` was added
* `principalType()` was added

#### `models.ServerRoleGroupConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

## 1.1.0-beta.1 (2024-03-15)

- Azure Resource Manager CosmosDBForPostgreSql client library for Java. This package contains Microsoft Azure SDK for CosmosDBForPostgreSql Management SDK. Azure Cosmos DB for PostgreSQL database service resource provider REST APIs. Package tag package-preview-2023-03. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.Clusters` was modified

* `promoteReadReplica(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.Cluster` was modified

* `promoteReadReplica(com.azure.core.util.Context)` was removed

### Features Added

* `models.PrincipalType` was added

* `models.RoleType` was added

* `models.AuthConfig` was added

* `models.PasswordAuth` was added

* `models.PromoteRequest` was added

* `models.ActiveDirectoryAuth` was added

#### `models.Cluster$Definition` was modified

* `withAuthConfig(models.AuthConfig)` was added
* `withEnableGeoBackup(java.lang.Boolean)` was added
* `withDatabaseName(java.lang.String)` was added

#### `models.Clusters` was modified

* `promoteReadReplica(java.lang.String,java.lang.String,models.PromoteRequest,com.azure.core.util.Context)` was added

#### `models.Cluster` was modified

* `promoteReadReplica(models.PromoteRequest,com.azure.core.util.Context)` was added
* `enableGeoBackup()` was added
* `databaseName()` was added
* `authConfig()` was added

#### `models.Role$Definition` was modified

* `withPrincipalType(models.PrincipalType)` was added
* `withObjectId(java.lang.String)` was added
* `withTenantId(java.lang.String)` was added
* `withRoleType(models.RoleType)` was added

#### `models.Role` was modified

* `principalType()` was added
* `roleType()` was added
* `objectId()` was added
* `tenantId()` was added

## 1.0.0 (2023-09-22)

- Azure Resource Manager CosmosDBForPostgreSql client library for Java. This package contains Microsoft Azure SDK for CosmosDBForPostgreSql Management SDK. Azure Cosmos DB for PostgreSQL database service resource provider REST APIs. Package tag package-2022-11-08. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.1 (2023-06-13)

- Azure Resource Manager CosmosDBForPostgreSql client library for Java. This package contains Microsoft Azure SDK for CosmosDBForPostgreSql Management SDK. Azure Cosmos DB for PostgreSQL database service resource provider REST APIs. Package tag package-2022-11-08. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
