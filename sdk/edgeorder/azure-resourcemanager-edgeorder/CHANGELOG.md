# Release History

## 1.1.0-beta.1 (2025-05-12)

- Azure Resource Manager edgeorder client library for Java. This package contains Microsoft Azure SDK for edgeorder Management SDK. Edge Order API's. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `EdgeOrderManager$Configurable` was removed

#### `models.OperationListResult` was removed

#### `models.AddressResourceList` was removed

#### `models.OrderItemResourceList` was removed

#### `models.ProductFamiliesMetadata` was removed

#### `models.ConfigurationFilters` was removed

#### `EdgeOrderManager` was removed

#### `models.ResourceProviders` was removed

#### `models.ProductFamilies` was removed

#### `models.OrderResourceList` was removed

#### `models.Configurations` was removed

#### `models.OrderItemResource$DefinitionStages` was modified

* `withAddressDetails(models.AddressDetails)` was removed in stage 4

#### `models.ProductDetails` was modified

* `deviceDetails()` was removed
* `count()` was removed

#### `models.OrderItemDetails` was modified

* `managementRpDetails()` was removed

#### `models.OrderItemResource` was modified

* `cancelOrderItem(models.CancellationReason)` was removed
* `cancelOrderItemWithResponse(models.CancellationReason,com.azure.core.util.Context)` was removed

#### `models.ConfigurationsRequest` was modified

* `configurationFilters()` was removed
* `withConfigurationFilters(java.util.List)` was removed

### Features Added

* `models.OrderResources` was added

* `models.OrderItemDetailsUpdateParameter` was added

* `EdgeorderManager$Configurable` was added

* `implementation.models.OrderResourceList` was added

* `models.OrderMode` was added

* `models.SiteDetails` was added

* `EdgeorderManager` was added

* `models.ChildConfigurationType` was added

* `models.ProductDetailsUpdateParameter` was added

* `models.ConfigurationFilter` was added

* `models.DevicePresenceVerificationDetails` was added

* `models.TermTypeDetails` was added

* `implementation.models.ProductFamilies` was added

* `models.ProductsAndConfigurationsOperationGroups` was added

* `models.AutoProvisioningStatus` was added

* `models.ProvisioningState` was added

* `models.ConfigurationDeviceDetails` was added

* `implementation.models.OrderItemResourceList` was added

* `models.TermCommitmentType` was added

* `implementation.models.Configurations` was added

* `models.DevicePresenceVerificationStatus` was added

* `models.IdentificationType` was added

* `models.ProvisioningDetails` was added

* `models.GroupedChildConfigurations` was added

* `models.AdditionalConfiguration` was added

* `models.ProvisioningSupport` was added

* `models.OrderItemResources` was added

* `models.Operations` was added

* `models.UserAssignedIdentity` was added

* `models.TermCommitmentInformation` was added

* `models.AddressResources` was added

* `models.CategoryInformation` was added

* `models.FulfillmentType` was added

* `implementation.models.ProductFamiliesMetadata` was added

* `models.ChildConfigurationFilter` was added

* `models.ResourceIdentity` was added

* `models.OrdersOperationGroups` was added

* `implementation.models.AddressResourceList` was added

* `models.ChildConfiguration` was added

* `implementation.models.OperationListResult` was added

* `models.AddressClassification` was added

* `models.TermCommitmentPreferences` was added

#### `models.Configuration` was modified

* `provisioningSupport()` was added
* `childConfigurationTypes()` was added
* `groupedChildConfigurations()` was added
* `supportedTermCommitmentDurations()` was added
* `fulfilledBy()` was added

#### `models.ProductDetails` was modified

* `childConfigurationDeviceDetails()` was added
* `parentDeviceDetails()` was added
* `optInAdditionalConfigurations()` was added
* `withOptInAdditionalConfigurations(java.util.List)` was added
* `identificationType()` was added
* `withParentProvisioningDetails(models.ProvisioningDetails)` was added
* `termCommitmentInformation()` was added
* `parentProvisioningDetails()` was added

#### `models.HierarchyInformation` was modified

* `withConfigurationIdDisplayName(java.lang.String)` was added
* `configurationIdDisplayName()` was added

#### `models.Preferences` was modified

* `termCommitmentPreferences()` was added
* `withTermCommitmentPreferences(models.TermCommitmentPreferences)` was added

#### `models.CommonProperties` was modified

* `fulfilledBy()` was added

#### `models.Product` was modified

* `fulfilledBy()` was added

#### `models.ProductLine` was modified

* `fulfilledBy()` was added

#### `models.OrderItemDetails` was modified

* `withOrderItemMode(models.OrderMode)` was added
* `orderItemMode()` was added
* `withSiteDetails(models.SiteDetails)` was added
* `siteDetails()` was added

#### `models.OrderItemUpdateParameter` was modified

* `orderItemDetails()` was added
* `identity()` was added
* `withOrderItemDetails(models.OrderItemDetailsUpdateParameter)` was added
* `withIdentity(models.ResourceIdentity)` was added

#### `models.ProductFamiliesMetadataDetails` was modified

* `fulfilledBy()` was added

#### `models.OrderItemResource` was modified

* `provisioningState()` was added
* `identity()` was added
* `cancel(models.CancellationReason)` was added
* `cancelWithResponse(models.CancellationReason,com.azure.core.util.Context)` was added

#### `models.ProductFamily` was modified

* `fulfilledBy()` was added

#### `models.OrderResource` was modified

* `orderMode()` was added

#### `models.AddressResource` was modified

* `provisioningState()` was added
* `addressClassification()` was added

#### `models.ConfigurationsRequest` was modified

* `configurationFilter()` was added
* `withConfigurationFilter(models.ConfigurationFilter)` was added

#### `models.BillingMeterDetails` was modified

* `termTypeDetails()` was added

#### `models.OrderItemResource$Update` was modified

* `withOrderItemDetails(models.OrderItemDetailsUpdateParameter)` was added
* `withIdentity(models.ResourceIdentity)` was added

#### `models.OrderItemResource$Definition` was modified

* `withIdentity(models.ResourceIdentity)` was added

#### `models.DeviceDetails` was modified

* `provisioningDetails()` was added
* `displaySerialNumber()` was added
* `provisioningSupport()` was added

#### `models.AddressResource$Definition` was modified

* `withAddressClassification(models.AddressClassification)` was added

#### `models.BasicInformation` was modified

* `fulfilledBy()` was added

## 1.0.0 (2025-01-02)

- Azure Resource Manager EdgeOrder client library for Java. This package contains Microsoft Azure SDK for EdgeOrder Management SDK. Edge Order API's. Package tag package-2021-12. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.Pav2MeterDetails` was modified

* `chargingType()` was removed
* `multiplier()` was removed

#### `models.PurchaseMeterDetails` was modified

* `chargingType()` was removed
* `multiplier()` was removed

## 1.0.0-beta.2 (2024-10-06)

- Azure Resource Manager EdgeOrder client library for Java. This package contains Microsoft Azure SDK for EdgeOrder Management SDK. Edge Order API's. Package tag package-2021-12. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.StageDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ResourceProviderDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `EdgeOrderManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added

#### `models.ProductDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AvailabilityInformation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.HierarchyInformation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationDisplay` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ShippingAddress` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Dimensions` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProductFamiliesRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Preferences` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CommonProperties` was modified

* `availabilityInformation()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `description()` was added
* `costInformation()` was added
* `hierarchyInformation()` was added
* `imageInformation()` was added
* `displayName()` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.AddressUpdateParameter` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ImageInformation` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Product` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProductLine` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Pav2MeterDetails` was modified

* `multiplier()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `chargingType()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `billingType()` was added

#### `models.TransportPreferences` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AddressResourceList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.FilterableProperty` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OrderItemDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CostInformation` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Specification` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ReverseShippingDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OrderItemUpdateParameter` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OrderItemResourceList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ContactDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ForwardShippingDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AddressDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.NotificationPreference` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ProductFamiliesMetadata` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Link` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OrderItemResource` was modified

* `resourceGroupName()` was added

#### `models.PurchaseMeterDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `chargingType()` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `billingType()` was added
* `multiplier()` was added

#### `models.ConfigurationFilters` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Description` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CancellationReason` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReturnOrderItemDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AddressResource` was modified

* `resourceGroupName()` was added

#### `models.ManagementResourcePreferences` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.ConfigurationsRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `EdgeOrderManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added

#### `models.CustomerSubscriptionRegisteredFeatures` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.BillingMeterDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.MeterDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `billingType()` was added

#### `models.EncryptionPreferences` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DisplayInfo` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProductFamilies` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DeviceDetails` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OrderResourceList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Configurations` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CustomerSubscriptionDetails` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BasicInformation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0-beta.1 (2021-12-22)

- Azure Resource Manager EdgeOrder client library for Java. This package contains Microsoft Azure SDK for EdgeOrder Management SDK. Edge Order API's. Package tag package-2021-12. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
