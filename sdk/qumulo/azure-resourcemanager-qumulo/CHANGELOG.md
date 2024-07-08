# Release History

## 1.0.0-beta.1 (2024-07-08)

- Azure Resource Manager Qumulo client library for Java. This package contains Microsoft Azure SDK for Qumulo Management SDK.  Package tag package-2024-06-19. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.FileSystemResource` was removed

* `models.FileSystemResource$DefinitionStages` was removed

* `models.FileSystemResource$UpdateStages` was removed

* `models.UserDetails` was removed

* `models.FileSystemResourceUpdate` was removed

* `models.FileSystemResourceUpdateProperties` was removed

* `models.MarketplaceDetails` was removed

* `models.FileSystemResource$Definition` was removed

* `models.FileSystemResource$Update` was removed

* `models.StorageSku` was removed

#### `models.ProvisioningState` was modified

* `models.ProvisioningState[] values()` -> `java.util.Collection values()`
* `valueOf(java.lang.String)` was removed
* `toString()` was removed

#### `models.FileSystems` was modified

* `models.FileSystemResource getByResourceGroup(java.lang.String,java.lang.String)` -> `models.LiftrBaseStorageFileSystemResource getByResourceGroup(java.lang.String,java.lang.String)`
* `models.FileSystemResource getById(java.lang.String)` -> `models.LiftrBaseStorageFileSystemResource getById(java.lang.String)`
* `models.FileSystemResource$DefinitionStages$Blank define(java.lang.String)` -> `models.LiftrBaseStorageFileSystemResource$DefinitionStages$Blank define(java.lang.String)`

#### `models.MarketplaceSubscriptionStatus` was modified

* `models.MarketplaceSubscriptionStatus[] values()` -> `java.util.Collection values()`
* `valueOf(java.lang.String)` was removed
* `toString()` was removed

### Features Added

* `models.LiftrBaseUserDetails` was added

* `models.LiftrBaseStorageFileSystemResource$UpdateStages` was added

* `models.LiftrBaseStorageFileSystemResource$Definition` was added

* `models.LiftrBaseStorageFileSystemResourceUpdateProperties` was added

* `models.LiftrBaseMarketplaceDetails` was added

* `models.LiftrBaseStorageFileSystemResource$Update` was added

* `models.LiftrBaseStorageFileSystemResource$DefinitionStages` was added

* `models.LiftrBaseStorageFileSystemResource` was added

* `models.LiftrBaseStorageFileSystemResourceUpdate` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.UserAssignedIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ManagedServiceIdentity` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FileSystemResourceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0 (2023-05-25)

- Azure Resource Manager Qumulo client library for Java. This package contains Microsoft Azure SDK for Qumulo Management SDK.  Package tag package-2022-10. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.2 (2023-05-22)

- Azure Resource Manager Qumulo client library for Java. This package contains Microsoft Azure SDK for Qumulo Management SDK.  Package tag package-2022-10. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

## 1.0.0-beta.1 (2023-04-18)

- Azure Resource Manager Qumulo client library for Java. This package contains Microsoft Azure SDK for Qumulo Management SDK.  Package tag package-2022-10-12-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
