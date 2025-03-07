# Release History

## 1.1.0-beta.1 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.0.0 (2025-01-03)

- Azure Resource Manager CustomLocations client library for Java. This package contains Microsoft Azure SDK for CustomLocations Management SDK. The customLocations Rest API spec. Package tag package-2021-08-15. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Other Changes

- Release for Azure Resource Manager CustomLocations client library for Java.

## 1.0.0-beta.3 (2024-10-10)

- Azure Resource Manager CustomLocations client library for Java. This package contains Microsoft Azure SDK for CustomLocations Management SDK. The customLocations Rest API spec. Package tag package-2021-08-31-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.ResourceSyncRuleListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EnabledResourceTypesListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CustomLocationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ResourceSyncRulePropertiesSelector` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.EnabledResourceTypePropertiesTypesMetadataItem` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CustomLocationPropertiesAuthentication` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PatchableCustomLocations` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MatchExpressionsProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CustomLocationOperationsList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Identity` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CustomLocationFindTargetResourceGroupProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PatchableResourceSyncRule` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

## 1.0.0-beta.2 (2022-06-23)

- Azure Resource Manager CustomLocations client library for Java. This package contains Microsoft Azure SDK for CustomLocations Management SDK. The customLocations Rest API spec. Package tag package-2021-08-31-preview. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

* `models.ResourceSyncRuleListResult` was added

* `models.ResourceSyncRule$DefinitionStages` was added

* `models.ResourceSyncRule` was added

* `models.ResourceSyncRulePropertiesSelector` was added

* `models.ResourceSyncRules` was added

* `models.ResourceSyncRule$Update` was added

* `models.MatchExpressionsProperties` was added

* `models.ResourceSyncRule$Definition` was added

* `models.CustomLocationFindTargetResourceGroupResult` was added

* `models.CustomLocationFindTargetResourceGroupProperties` was added

* `models.PatchableResourceSyncRule` was added

* `models.ResourceSyncRule$UpdateStages` was added

#### `models.CustomLocations` was modified

* `findTargetResourceGroupWithResponse(java.lang.String,java.lang.String,models.CustomLocationFindTargetResourceGroupProperties,com.azure.core.util.Context)` was added
* `findTargetResourceGroup(java.lang.String,java.lang.String,models.CustomLocationFindTargetResourceGroupProperties)` was added

#### `CustomLocationsManager` was modified

* `resourceSyncRules()` was added
* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

#### `CustomLocationsManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

#### `models.CustomLocation` was modified

* `resourceGroupName()` was added
* `findTargetResourceGroup(models.CustomLocationFindTargetResourceGroupProperties)` was added
* `findTargetResourceGroupWithResponse(models.CustomLocationFindTargetResourceGroupProperties,com.azure.core.util.Context)` was added

## 1.0.0-beta.1 (2021-09-24)

- Azure Resource Manager CustomLocations client library for Java. This package contains Microsoft Azure SDK for CustomLocations Management SDK. The customLocations Rest API spec. Package tag package-2021-08-15. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

