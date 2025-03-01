# Release History

## 1.0.0-beta.1 (2025-03-01)

- Azure Resource Manager Voice Services client library for Java. This package contains Microsoft Azure SDK for Voice Services Management SDK.  Package tag package-2023-09-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

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

#### `models.CommunicationsGatewayUpdate` was modified

* `withIdentity(models.ManagedServiceIdentity)` was added
* `identity()` was added
* `sku()` was added
* `withSku(models.Sku)` was added

#### `models.CommunicationsGateway$Update` was modified

* `withSku(models.Sku)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added

#### `models.CommunicationsGateway$Definition` was modified

* `withSku(models.Sku)` was added
* `withApiBridge(models.ApiBridgeProperties)` was added
* `withDnsDelegations(models.DnsDelegationsProperties)` was added
* `withIntegratedMcpEnabled(java.lang.Boolean)` was added
* `withCustomSipHeaders(models.CustomSipHeadersProperties)` was added
* `withIdentity(models.ManagedServiceIdentity)` was added

#### `models.CommunicationsGateway` was modified

* `allocatedSignalingAddressPrefixes()` was added
* `customSipHeaders()` was added
* `integratedMcpEnabled()` was added
* `identity()` was added
* `allocatedMediaAddressPrefixes()` was added
* `sku()` was added
* `dnsDelegations()` was added

## 1.1.0 (2024-12-06)

- Azure Resource Manager Voice Services client library for Java. This package contains Microsoft Azure SDK for Voice Services Management SDK.  Package tag package-2023-01-31. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

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
