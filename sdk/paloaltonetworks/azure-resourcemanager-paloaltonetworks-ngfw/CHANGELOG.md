# Release History

## 1.0.0-beta.1 (2025-02-04)

- Azure Resource Manager PaloAlto Networks Ngfw client library for Java. This package contains Microsoft Azure SDK for PaloAlto Networks Ngfw Management SDK.  Package tag package-preview-2025-02-06-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.CloudManagerTenantList` was added

* `models.EnableStatus` was added

* `models.SupportInfoModel` was added

* `models.RegistrationStatus` was added

* `models.ProductSerialStatusValues` was added

* `models.StrataCloudManagerConfig` was added

* `models.ProductSerialNumberStatus` was added

* `models.ProductSerialNumberRequestStatus` was added

* `models.PaloAltoNetworksCloudngfws` was added

* `models.StrataCloudManagerInfo` was added

#### `models.SupportInfo` was modified

* `accountIdForBilling()` was added
* `associationType()` was added

#### `models.FirewallResource$Definition` was modified

* `withStrataCloudManagerConfig(models.StrataCloudManagerConfig)` was added
* `withIsStrataCloudManaged(models.BooleanEnum)` was added

#### `PaloAltoNetworksNgfwManager` was modified

* `paloAltoNetworksCloudngfws()` was added

#### `models.FirewallStatusResource` was modified

* `strataCloudManagerInfo()` was added
* `isStrataCloudManaged()` was added

#### `models.FirewallResource` was modified

* `strataCloudManagerConfig()` was added
* `isStrataCloudManaged()` was added

#### `models.FirewallResourceUpdateProperties` was modified

* `isStrataCloudManaged()` was added
* `withStrataCloudManagerConfig(models.StrataCloudManagerConfig)` was added
* `withIsStrataCloudManaged(models.BooleanEnum)` was added
* `strataCloudManagerConfig()` was added

#### `models.NetworkProfile` was modified

* `privateSourceNatRulesDestination()` was added
* `withPrivateSourceNatRulesDestination(java.util.List)` was added

## 1.2.0 (2025-01-06)

- Azure Resource Manager PaloAlto Networks Ngfw client library for Java. This package contains Microsoft Azure SDK for PaloAlto Networks Ngfw Management SDK.  Package tag package-2023-09-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### Serialization/Deserialization change

- `Jackson` is removed from dependency and no longer supported.

##### Migration Guide

If you are using `Jackson`/`ObjectMapper` for manual serialization/deserialization, configure your `ObjectMapper` for backward compatibility:
```java
objectMapper.registerModule(com.azure.core.serializer.json.jackson.JacksonJsonProvider.getJsonSerializableDatabindModule());
```

## 1.1.0 (2023-11-15)

- Azure Resource Manager PaloAlto Networks Ngfw client library for Java. This package contains Microsoft Azure SDK for PaloAlto Networks Ngfw Management SDK.  Package tag package-2023-09-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.NetworkProfile` was modified

* `trustedRanges()` was added
* `withTrustedRanges(java.util.List)` was added

## 1.0.0 (2023-07-14)

- Azure Resource Manager PaloAlto Networks Ngfw client library for Java. This package contains Microsoft Azure SDK for PaloAlto Networks Ngfw Management SDK.  Package tag package-2022-08-29. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.1 (2023-05-04)

- Azure Resource Manager PaloAlto Networks Ngfw client library for Java. This package contains Microsoft Azure SDK for PaloAlto Networks Ngfw Management SDK.  Package tag package-2022-08-29-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
