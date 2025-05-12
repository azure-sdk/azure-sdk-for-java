# Release History

## 1.0.0-beta.1 (2025-05-12)

- Azure Resource Manager Peering client library for Java. This package contains Microsoft Azure SDK for Peering Management SDK. Peering Client. Package tag package-2025-05-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.PeerAsn$Update` was modified

* `withValidationState(models.ValidationState)` was removed

#### `models.LegacyPeerings` was modified

* `list(java.lang.String,models.LegacyPeeringsKind,java.lang.Integer,com.azure.core.util.Context)` was removed

#### `models.PeeringSku` was modified

* `withTier(models.Tier)` was removed
* `withFamily(models.Family)` was removed
* `withSize(models.Size)` was removed

#### `models.PeerAsn$Definition` was modified

* `withValidationState(models.ValidationState)` was removed

### Features Added

* `models.ServiceSpecification` was added

* `models.Protocol` was added

* `models.ConnectionMonitorTest$Update` was added

* `models.LogAnalyticsWorkspaceProperties` was added

* `models.RpUnbilledPrefixes` was added

* `models.ConnectionMonitorTest` was added

* `models.ConnectionMonitorTest$UpdateStages` was added

* `models.ConnectivityProbe` was added

* `models.Command` was added

* `models.ConnectionMonitorTest$DefinitionStages` was added

* `models.LookingGlassOutput` was added

* `models.PreviousConnectionProvisioningState` was added

* `models.ConnectionMonitorTestListResult` was added

* `models.LookingGlass` was added

* `models.Enum11` was added

* `models.ConnectionMonitorTest$Definition` was added

* `models.Enum13` was added

* `models.LookingGlassCommand` was added

* `models.ConnectionMonitorTests` was added

* `models.RpUnbilledPrefix` was added

* `models.LookingGlassSourceType` was added

* `models.MetricDimension` was added

* `models.RpUnbilledPrefixListResult` was added

* `models.MetricSpecification` was added

#### `models.Operation` was modified

* `serviceSpecification()` was added

#### `models.PeeringRegisteredPrefix` was modified

* `validateWithResponse(com.azure.core.util.Context)` was added
* `validate()` was added

#### `models.Peering` was modified

* `connectivityProbes()` was added

#### `models.LegacyPeerings` was modified

* `list(java.lang.String,models.LegacyPeeringsKind,java.lang.Integer,models.DirectPeeringType,com.azure.core.util.Context)` was added

#### `models.PeeringServices` was modified

* `initializeConnectionMonitor()` was added
* `initializeConnectionMonitorWithResponse(com.azure.core.util.Context)` was added

#### `models.PeeringService$Definition` was modified

* `withLogAnalyticsWorkspaceProperties(models.LogAnalyticsWorkspaceProperties)` was added

#### `models.PeeringService` was modified

* `logAnalyticsWorkspaceProperties()` was added

#### `PeeringManager` was modified

* `connectionMonitorTests()` was added
* `rpUnbilledPrefixes()` was added
* `lookingGlass()` was added

#### `models.Peering$Definition` was modified

* `withConnectivityProbes(java.util.List)` was added

#### `models.ExchangeConnection` was modified

* `migrationWorkWindowTracker()` was added
* `withMigrationWorkWindowBgpSessionSameDevice(java.util.Map)` was added
* `migrationWorkWindowBgpSessionSameDevice()` was added
* `withPreviousConnectionProvisioningState(models.PreviousConnectionProvisioningState)` was added
* `previousConnectionProvisioningState()` was added
* `withLastFailureTimeUtc(java.time.OffsetDateTime)` was added
* `withMigrationWorkWindowTracker(java.lang.String)` was added
* `lastFailureTimeUtc()` was added

#### `models.RegisteredPrefixes` was modified

* `validate(java.lang.String,java.lang.String,java.lang.String)` was added
* `validateWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.DirectConnection` was modified

* `withLastFailureTimeUtc(java.time.OffsetDateTime)` was added
* `lastFailureTimeUtc()` was added
* `migrationWorkWindowTracker()` was added
* `withPreviousConnectionProvisioningState(models.PreviousConnectionProvisioningState)` was added
* `previousConnectionProvisioningState()` was added
* `migrationWorkWindowBgpSessionSameDevice()` was added
* `withMigrationWorkWindowBgpSessionSameDevice(java.util.Map)` was added
* `withMigrationWorkWindowTracker(java.lang.String)` was added

## 1.0.0 (2024-12-25)

- Azure Resource Manager Peering client library for Java. This package contains Microsoft Azure SDK for Peering Management SDK. Peering Client. Package tag package-2021-01-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Other Changes

- Release for Azure Resource Manager Peering client library for Java.

## 1.0.0-beta.3 (2024-10-17)

- Azure Resource Manager Peering client library for Java. This package contains Microsoft Azure SDK for Peering Management SDK. Peering Client. Package tag package-2021-01-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.PeeringListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ContactDetail` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PeeringRegisteredAsnListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationDisplayInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeeringLocationPropertiesExchange` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceTags` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PeeringServiceSku` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeeringPropertiesDirect` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeeringRegisteredPrefixListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PeeringServiceProviderListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BgpSession` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeeringLocationListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeeringPropertiesExchange` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CdnPeeringPrefixListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeeringReceivedRouteListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PeeringServiceListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PeeringBandwidthOffer` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeeringServicePrefixListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExchangePeeringFacility` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CheckServiceProviderAvailabilityInput` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeeringSku` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PeeringServicePrefixEvent` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PeerAsnListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ExchangeConnection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeeringServiceLocationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DirectConnection` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeeringServiceCountryListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DirectPeeringFacility` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationListResult` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PeeringLocationPropertiesDirect` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0-beta.2 (2023-01-18)

- Azure Resource Manager Peering client library for Java. This package contains Microsoft Azure SDK for Peering Management SDK. Peering Client. Package tag package-2021-01-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.Peerings` was modified

* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `models.PeeringServices` was modified

* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

### Features Added

#### `models.PeeringServicePrefix` was modified

* `resourceGroupName()` was added

#### `models.PeeringRegisteredPrefix` was modified

* `resourceGroupName()` was added

#### `models.Peering` was modified

* `resourceGroupName()` was added

#### `models.Peerings` was modified

* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `models.PeeringServices` was modified

* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added

#### `PeeringManager$Configurable` was modified

* `withScope(java.lang.String)` was added
* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

#### `models.PeeringService` was modified

* `resourceGroupName()` was added

#### `PeeringManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

#### `models.PeeringRegisteredAsn` was modified

* `resourceGroupName()` was added

## 1.0.0-beta.1 (2021-04-19)

- Azure Resource Manager Peering client library for Java. This package contains Microsoft Azure SDK for Peering Management SDK. Peering Client. Package tag package-2021-01-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
