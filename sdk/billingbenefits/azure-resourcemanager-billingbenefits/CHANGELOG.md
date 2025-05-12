# Release History

## 1.0.0-beta.3 (2025-05-12)

- Azure Resource Manager BillingBenefits client library for Java. This package contains Microsoft Azure SDK for BillingBenefits Management SDK. Azure Benefits RP let users create and manage benefits like savings plan. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.SavingsPlansUpdateHeaders` was removed

#### `models.ReservationOrderAlias` was removed

#### `models.ResourceProviders` was removed

#### `models.SavingsPlanOrderAlias` was removed

#### `models.SavingsPlanOrderModelList` was removed

#### `models.SavingsPlansUpdateResponse` was removed

#### `models.PricingCurrencyTotal` was removed

#### `models.PricingCurrencyDuration` was removed

#### `models.SavingsPlanOrders` was removed

#### `models.SavingsPlanModelListResult` was removed

#### `models.OperationListResult` was removed

#### `models.SavingsPlans` was removed

#### `models.Sku` was removed

#### `models.SavingsPlanModelList` was removed

#### `models.SavingsPlanOrderAliasModel` was modified

* `models.Sku sku()` -> `models.ResourceSku sku()`

#### `models.Utilization` was modified

* `withAggregates(java.util.List)` was removed

#### `models.PurchaseRequest` was modified

* `withSku(models.Sku)` was removed
* `models.Sku sku()` -> `models.ResourceSku sku()`

#### `models.ReservationOrderAliasResponse` was modified

* `models.Sku sku()` -> `models.ResourceSku sku()`

#### `models.ReservationOrderAliasResponsePropertiesReservedResourceProperties` was modified

* `withInstanceFlexibility(models.InstanceFlexibility)` was removed

#### `models.SavingsPlanSummaryCount` was modified

* `java.lang.Float expiredCount()` -> `java.lang.Double expiredCount()`
* `java.lang.Float succeededCount()` -> `java.lang.Double succeededCount()`
* `java.lang.Float warningCount()` -> `java.lang.Double warningCount()`
* `java.lang.Float noBenefitCount()` -> `java.lang.Double noBenefitCount()`
* `java.lang.Float failedCount()` -> `java.lang.Double failedCount()`
* `java.lang.Float cancelledCount()` -> `java.lang.Double cancelledCount()`
* `java.lang.Float processingCount()` -> `java.lang.Double processingCount()`
* `java.lang.Float pendingCount()` -> `java.lang.Double pendingCount()`
* `java.lang.Float expiringCount()` -> `java.lang.Double expiringCount()`

#### `BillingBenefitsManager` was modified

* `fluent.BillingBenefitsRP serviceClient()` -> `fluent.BillingBenefitsClient serviceClient()`
* `savingsPlans()` was removed
* `reservationOrderAlias()` was removed
* `savingsPlanOrders()` was removed
* `savingsPlanOrderAlias()` was removed
* `resourceProviders()` was removed

#### `models.ExtendedStatusInfo` was modified

* `withMessage(java.lang.String)` was removed
* `withStatusCode(java.lang.String)` was removed

#### `models.SavingsPlanSummary` was modified

* `withValue(models.SavingsPlanSummaryCount)` was removed

#### `models.ReservationOrderAliasRequest` was modified

* `withSku(models.Sku)` was removed
* `models.Sku sku()` -> `models.ResourceSku sku()`

#### `models.SavingsPlanValidResponseProperty` was modified

* `withReasonCode(java.lang.String)` was removed
* `withReason(java.lang.String)` was removed
* `withValid(java.lang.Boolean)` was removed

#### `models.SavingsPlanOrderModel` was modified

* `models.Sku sku()` -> `models.ResourceSku sku()`

#### `models.BillingPlanInformation` was modified

* `withPricingCurrencyTotal(models.Price)` was removed
* `withNextPaymentDueDate(java.time.LocalDate)` was removed
* `withTransactions(java.util.List)` was removed
* `withStartDate(java.time.LocalDate)` was removed

#### `models.UtilizationAggregates` was modified

* `java.lang.Float value()` -> `java.lang.Double value()`
* `java.lang.Float grain()` -> `java.lang.Double grain()`

#### `models.SavingsPlanModel` was modified

* `models.Sku sku()` -> `models.ResourceSku sku()`

#### `models.PaymentDetail` was modified

* `withDueDate(java.time.LocalDate)` was removed
* `withPaymentDate(java.time.LocalDate)` was removed
* `withBillingAccount(java.lang.String)` was removed
* `withBillingCurrencyTotal(models.Price)` was removed
* `withPricingCurrencyTotal(models.Price)` was removed
* `withStatus(models.PaymentStatus)` was removed

### Features Added

* `models.Discount$UpdateStages` was added

* `implementation.models.OperationListResult` was added

* `models.DiscountProperties` was added

* `models.DiscountType` was added

* `implementation.models.SavingsPlanOrderModelList` was added

* `models.DiscountTypeProductSku` was added

* `models.DiscountTypeProductFamily` was added

* `models.Discounts` was added

* `models.Discount` was added

* `models.DiscountTypeProduct` was added

* `models.EntityTypeAffiliateDiscount` was added

* `models.DiscountAppliedScopeType` was added

* `models.ReservationOrderAliasResponses` was added

* `models.ConditionsItem` was added

* `models.ResourceSku` was added

* `models.DiscountsOperationGroups` was added

* `models.SavingsPlanModels` was added

* `models.Discount$Update` was added

* `models.PricingPolicy` was added

* `models.PriceGuaranteeProperties` was added

* `implementation.models.SavingsPlanModelList` was added

* `models.DiscountCombinationRule` was added

* `implementation.models.SavingsPlanModelListResult` was added

* `models.DiscountProvisioningState` was added

* `models.DiscountTypeProperties` was added

* `models.DiscountEntityType` was added

* `models.ApplyDiscountOn` was added

* `models.Discount$DefinitionStages` was added

* `models.SavingsPlanOrderModels` was added

* `implementation.models.DiscountList` was added

* `models.Discount$Definition` was added

* `models.DiscountStatus` was added

* `models.DiscountPatchRequest` was added

* `models.EntityTypePrimaryDiscount` was added

* `models.SavingsPlanOrderAliasModels` was added

* `models.SavingsPlanOperationGroups` was added

#### `models.PurchaseRequest` was modified

* `withSku(models.ResourceSku)` was added

#### `BillingBenefitsManager` was modified

* `savingsPlanModels()` was added
* `savingsPlanOrderModels()` was added
* `discountsOperationGroups()` was added
* `discounts()` was added
* `savingsPlanOrderAliasModels()` was added
* `reservationOrderAliasResponses()` was added
* `savingsPlanOperationGroups()` was added

#### `models.ReservationOrderAliasRequest` was modified

* `withSku(models.ResourceSku)` was added

## 1.0.0-beta.2 (2024-10-14)

- Azure Resource Manager BillingBenefits client library for Java. This package contains Microsoft Azure SDK for BillingBenefits Management SDK. Azure Benefits RP let users create and manage benefits like savings plan. Package tag package-2022-11-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.SavingsPlanOrderAliasModel` was modified

* `renew()` was added

#### `models.Utilization` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SavingsPlanSummary` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PurchaseRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SavingsPlanUpdateRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReservationOrderAliasRequest` was modified

* `type()` was added
* `name()` was added
* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added
* `id()` was added

#### `models.SavingsPlanOrderModelList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.PricingCurrencyTotal` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReservationOrderAliasRequestPropertiesReservedResourceProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SavingsPlanPurchaseValidateRequest` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SavingsPlanValidResponseProperty` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.BillingPlanInformation` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ReservationOrderAliasResponsePropertiesReservedResourceProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SavingsPlanSummaryCount` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Commitment` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.OperationDisplay` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.UtilizationAggregates` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SavingsPlanUpdateRequestProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Sku` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SavingsPlanModelList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Price` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.SavingsPlanUpdateValidateRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ExtendedStatusInfo` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.PaymentDetail` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.AppliedScopeProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RenewProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.SavingsPlanModelListResult` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0-beta.1 (2023-01-11)

- Azure Resource Manager BillingBenefits client library for Java. This package contains Microsoft Azure SDK for BillingBenefits Management SDK. Azure Benefits RP let users create and manage benefits like savings plan. Package tag package-2022-11-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
