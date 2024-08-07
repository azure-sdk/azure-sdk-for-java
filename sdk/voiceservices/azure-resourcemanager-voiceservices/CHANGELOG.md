# Release History

## 1.0.0-beta.1 (2024-08-07)

- Azure Resource Manager Voice Services client library for Java. This package contains Microsoft Azure SDK for Voice Services Management SDK.  Package tag package-2023-09-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.TestLine$Definition` was removed

* `models.TestLineUpdate` was removed

* `models.TestLine$Update` was removed

* `models.TestLine$UpdateStages` was removed

* `models.TestLine$DefinitionStages` was removed

#### `models.TestLines` was modified

* `getByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `deleteByIdWithResponse(java.lang.String,com.azure.core.util.Context)` was removed
* `deleteById(java.lang.String)` was removed
* `getById(java.lang.String)` was removed
* `get(java.lang.String,java.lang.String,java.lang.String)` was removed
* `define(java.lang.String)` was removed
* `delete(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `delete(java.lang.String,java.lang.String,java.lang.String)` was removed

#### `models.TestLine` was modified

* `refresh(com.azure.core.util.Context)` was removed
* `regionName()` was removed
* `resourceGroupName()` was removed
* `update()` was removed
* `region()` was removed
* `refresh()` was removed

#### `models.CommunicationsGateway$Definition` was modified

* `withApiBridge(java.lang.Object)` was removed

#### `models.CommunicationsGateway` was modified

* `java.lang.Object apiBridge()` -> `models.ApiBridgeProperties apiBridge()`

### Features Added

* `models.DnsDelegationProperties` was added

* `models.DnsDelegationsProperties` was added

* `models.UserAssignedIdentity` was added

* `models.ApiBridgeActivationState` was added

* `models.SkuTier` was added

* `models.CustomSipHeader` was added

* `models.ApiBridgeProperties` was added

* `models.Sku` was added

* `models.ManagedServiceIdentity` was added

* `models.CustomSipHeadersProperties` was added

* `models.ManagedServiceIdentityType` was added

#### `models.CheckNameAvailabilityRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CommunicationsGatewayUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `withSku(models.Sku)` was added
* `sku()` was added
* `identity()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added

#### `models.PrimaryRegionProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CommunicationsGateway$Update` was modified

* `withSku(models.Sku)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added

#### `models.OperationDisplay` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CommunicationsGatewayListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ServiceRegionProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CommunicationsGateway$Definition` was modified

* `withIntegratedMcpEnabled(java.lang.Boolean)` was added
* `withCustomSipHeaders(models.CustomSipHeadersProperties)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added
* `withApiBridge(models.ApiBridgeProperties)` was added
* `withSku(models.Sku)` was added
* `withDnsDelegations(models.DnsDelegationsProperties)` was added

#### `models.TestLineListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CommunicationsGateway` was modified

* `dnsDelegations()` was added
* `integratedMcpEnabled()` was added
* `sku()` was added
* `allocatedSignalingAddressPrefixes()` was added
* `customSipHeaders()` was added
* `allocatedMediaAddressPrefixes()` was added
* `identity()` was added

## 1.0.0 (2023-04-25)

- Azure Resource Manager Voice Services client library for Java. This package contains Microsoft Azure SDK for Voice Services Management SDK.  Package tag package-2023-01-31. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `VoiceservicesManager$Configurable` was removed

* `VoiceservicesManager` was removed

### Features Added

* `VoiceServicesManager$Configurable` was added

* `VoiceServicesManager` was added

## 1.0.0-beta.1 (2023-02-20)

- Azure Resource Manager voiceservices client library for Java. This package contains Microsoft Azure SDK for voiceservices Management SDK.  Package tag package-2023-01-31. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
