# Code snippets and samples


## Discounts

- [Cancel](#discounts_cancel)
- [Create](#discounts_create)
- [Delete](#discounts_delete)
- [GetByResourceGroup](#discounts_getbyresourcegroup)
- [List](#discounts_list)
- [ListByResourceGroup](#discounts_listbyresourcegroup)
- [Update](#discounts_update)

## DiscountsOperationGroup

- [ScopeList](#discountsoperationgroup_scopelist)

## Operations

- [List](#operations_list)

## ReservationOrderAliasResponses

- [Create](#reservationorderaliasresponses_create)
- [Get](#reservationorderaliasresponses_get)

## SavingsPlanModels

- [Get](#savingsplanmodels_get)
- [List](#savingsplanmodels_list)
- [Update](#savingsplanmodels_update)
- [ValidateUpdate](#savingsplanmodels_validateupdate)

## SavingsPlanOperationGroup

- [ListAll](#savingsplanoperationgroup_listall)
- [ValidatePurchase](#savingsplanoperationgroup_validatepurchase)

## SavingsPlanOrderAliasModels

- [Create](#savingsplanorderaliasmodels_create)
- [Get](#savingsplanorderaliasmodels_get)

## SavingsPlanOrderModels

- [Elevate](#savingsplanordermodels_elevate)
- [Get](#savingsplanordermodels_get)
- [List](#savingsplanordermodels_list)
### Discounts_Cancel

```java
/**
 * Samples for SavingsPlanOrderModels Elevate.
 */
public final class SavingsPlanOrderModelsElevateSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanOrderElevate.json
     */
    /**
     * Sample code: SavingsPlanOrderElevate.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        savingsPlanOrderElevate(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanOrderModels()
            .elevateWithResponse("20000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
```

### Discounts_Create

```java
/**
 * Samples for SavingsPlanModels List.
 */
public final class SavingsPlanModelsListSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlansInOrderList.json
     */
    /**
     * Sample code: SavingsPlansInOrderList.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        savingsPlansInOrderList(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanModels().list("20000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
```

### Discounts_Delete

```java
/**
 * Samples for Discounts GetByResourceGroup.
 */
public final class DiscountsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountGet.json
     */
    /**
     * Sample code: DiscountGet.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void discountGet(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discounts()
            .getByResourceGroupWithResponse("testrg", "testprimarydiscount", com.azure.core.util.Context.NONE);
    }
}
```

### Discounts_GetByResourceGroup

```java
/**
 * Samples for Discounts List.
 */
public final class DiscountsListSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountList.json
     */
    /**
     * Sample code: DiscountSubscriptionList.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        discountSubscriptionList(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discounts().list(com.azure.core.util.Context.NONE);
    }
}
```

### Discounts_List

```java
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanUpdateRequestProperties;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanUpdateValidateRequest;
import java.util.Arrays;

/**
 * Samples for SavingsPlanModels ValidateUpdate.
 */
public final class SavingsPlanModelsValidateUpdateSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanValidateUpdate.json
     */
    /**
     * Sample code: SavingsPlanValidateUpdate.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        savingsPlanValidateUpdate(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanModels()
            .validateUpdateWithResponse("20000000-0000-0000-0000-000000000000", "30000000-0000-0000-0000-000000000000",
                new SavingsPlanUpdateValidateRequest().withBenefits(Arrays.asList(
                    new SavingsPlanUpdateRequestProperties().withAppliedScopeType(AppliedScopeType.MANAGEMENT_GROUP)
                        .withAppliedScopeProperties(new AppliedScopeProperties()
                            .withTenantId("30000000-0000-0000-0000-000000000100")
                            .withManagementGroupId(
                                "/providers/Microsoft.Management/managementGroups/30000000-0000-0000-0000-000000000100")),
                    new SavingsPlanUpdateRequestProperties().withAppliedScopeType(AppliedScopeType.MANAGEMENT_GROUP)
                        .withAppliedScopeProperties(
                            new AppliedScopeProperties().withTenantId("30000000-0000-0000-0000-000000000100")
                                .withManagementGroupId("/providers/Microsoft.Management/managementGroups/MockMG")))),
                com.azure.core.util.Context.NONE);
    }
}
```

### Discounts_ListByResourceGroup

```java
import com.azure.resourcemanager.billingbenefits.models.ApplyDiscountOn;
import com.azure.resourcemanager.billingbenefits.models.ConditionsItem;
import com.azure.resourcemanager.billingbenefits.models.DiscountAppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.DiscountCombinationRule;
import com.azure.resourcemanager.billingbenefits.models.DiscountTypeProductFamily;
import com.azure.resourcemanager.billingbenefits.models.DiscountTypeProductSku;
import com.azure.resourcemanager.billingbenefits.models.DiscountTypeProperties;
import com.azure.resourcemanager.billingbenefits.models.EntityTypeAffiliateDiscount;
import com.azure.resourcemanager.billingbenefits.models.EntityTypePrimaryDiscount;
import com.azure.resourcemanager.billingbenefits.models.PriceGuaranteeProperties;
import com.azure.resourcemanager.billingbenefits.models.PricingPolicy;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Discounts Create.
 */
public final class DiscountsCreateSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountsCreatePrimaryBackfill.json
     */
    /**
     * Sample code: DiscountsCreatePrimaryBackfill.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        discountsCreatePrimaryBackfill(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discounts()
            .define("testprimarydiscount")
            .withRegion("global")
            .withExistingResourceGroup("testrg")
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withProperties(new EntityTypePrimaryDiscount().withProductCode("fakeTokenPlaceholder")
                .withStartAt(OffsetDateTime.parse("2023-07-01T00:00:00Z"))
                .withSystemId("13810867107109237")
                .withDisplayName("Virtual Machines D Series")
                .withAppliedScopeType(DiscountAppliedScopeType.BILLING_ACCOUNT)
                .withDiscountTypeProperties(
                    new DiscountTypeProductFamily().withApplyDiscountOn(ApplyDiscountOn.PURCHASE)
                        .withDiscountPercentage(14.0D)
                        .withDiscountCombinationRule(DiscountCombinationRule.BEST_OF)
                        .withConditions(Arrays.asList(new ConditionsItem().withConditionName("Cloud")
                            .withValue(Arrays.asList("US-Sec"))
                            .withType("equalAny")))
                        .withProductFamilyName("Azure"))
                .withEndAt(OffsetDateTime.parse("2024-07-01T23:59:59Z")))
            .create();
    }

    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountsCreatePrimaryWithCustomPrice.json
     */
    /**
     * Sample code: DiscountsCreatePrimaryWithCustomPrice.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void discountsCreatePrimaryWithCustomPrice(
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discounts()
            .define("testprimarydiscount")
            .withRegion("global")
            .withExistingResourceGroup("testrg")
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withProperties(new EntityTypePrimaryDiscount().withProductCode("fakeTokenPlaceholder")
                .withStartAt(OffsetDateTime.parse("2023-07-01T00:00:00Z"))
                .withDisplayName("Virtual Machines D Series")
                .withAppliedScopeType(DiscountAppliedScopeType.BILLING_ACCOUNT)
                .withDiscountTypeProperties(new DiscountTypeProperties().withApplyDiscountOn(ApplyDiscountOn.PURCHASE)
                    .withDiscountPercentage(14.0D)
                    .withDiscountCombinationRule(DiscountCombinationRule.BEST_OF)
                    .withConditions(Arrays.asList(new ConditionsItem().withConditionName("Cloud")
                        .withValue(Arrays.asList("US-Sec"))
                        .withType("equalAny"))))
                .withEndAt(OffsetDateTime.parse("2024-07-01T23:59:59Z")))
            .create();
    }

    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountsCreatePrimaryWithPriceGuarantee.json
     */
    /**
     * Sample code: DiscountsCreatePrimaryWithPriceGuarantee.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void discountsCreatePrimaryWithPriceGuarantee(
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discounts()
            .define("testprimarydiscount")
            .withRegion("global")
            .withExistingResourceGroup("testrg")
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withProperties(new EntityTypePrimaryDiscount().withProductCode("fakeTokenPlaceholder")
                .withStartAt(OffsetDateTime.parse("2023-07-01T00:00:00Z"))
                .withDisplayName("Virtual Machines D Series")
                .withAppliedScopeType(DiscountAppliedScopeType.BILLING_ACCOUNT)
                .withDiscountTypeProperties(new DiscountTypeProductSku().withApplyDiscountOn(ApplyDiscountOn.PURCHASE)
                    .withDiscountCombinationRule(DiscountCombinationRule.BEST_OF)
                    .withPriceGuaranteeProperties(
                        new PriceGuaranteeProperties().withPricingPolicy(PricingPolicy.PROTECTED)
                            .withPriceGuaranteeDate(OffsetDateTime.parse("2024-11-01T00:00:00")))
                    .withConditions(Arrays.asList(new ConditionsItem().withConditionName("Cloud")
                        .withValue(Arrays.asList("US-Sec"))
                        .withType("equalAny")))
                    .withProductFamilyName("Azure")
                    .withProductId("DZH318Z0BQ35")
                    .withSkuId("0001"))
                .withEndAt(OffsetDateTime.parse("2024-07-01T23:59:59Z")))
            .create();
    }

    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountsCreateAffiliate.json
     */
    /**
     * Sample code: DiscountsCreateAffiliate.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        discountsCreateAffiliate(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discounts()
            .define("testaffiliatediscount")
            .withRegion("global")
            .withExistingResourceGroup("testrg")
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withProperties(new EntityTypeAffiliateDiscount().withProductCode("fakeTokenPlaceholder")
                .withStartAt(OffsetDateTime.parse("2023-07-01T00:00:00Z"))
                .withSystemId("13810867107109237")
                .withDisplayName("Virtual Machines D Series"))
            .create();
    }

    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountsCreatePrimary.json
     */
    /**
     * Sample code: DiscountsCreatePrimary.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        discountsCreatePrimary(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discounts()
            .define("testprimarydiscount")
            .withRegion("global")
            .withExistingResourceGroup("testrg")
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withProperties(new EntityTypePrimaryDiscount().withProductCode("fakeTokenPlaceholder")
                .withStartAt(OffsetDateTime.parse("2023-07-01T00:00:00Z"))
                .withDisplayName("Virtual Machines D Series")
                .withAppliedScopeType(DiscountAppliedScopeType.BILLING_ACCOUNT)
                .withDiscountTypeProperties(new DiscountTypeProductSku().withApplyDiscountOn(ApplyDiscountOn.PURCHASE)
                    .withDiscountPercentage(14.0D)
                    .withDiscountCombinationRule(DiscountCombinationRule.BEST_OF)
                    .withConditions(Arrays.asList(new ConditionsItem().withConditionName("Cloud")
                        .withValue(Arrays.asList("US-Sec"))
                        .withType("equalAny")))
                    .withProductFamilyName("Azure")
                    .withProductId("DZH318Z0BQ35")
                    .withSkuId("0001"))
                .withEndAt(OffsetDateTime.parse("2024-07-01T23:59:59Z")))
            .create();
    }

    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountsCreatePrimaryWithCustomPriceMultiCurrency.json
     */
    /**
     * Sample code: DiscountsCreatePrimaryWithCustomPriceMultiCurrency.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void discountsCreatePrimaryWithCustomPriceMultiCurrency(
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discounts()
            .define("testprimarydiscount")
            .withRegion("global")
            .withExistingResourceGroup("testrg")
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withProperties(new EntityTypePrimaryDiscount().withProductCode("fakeTokenPlaceholder")
                .withStartAt(OffsetDateTime.parse("2023-07-01T00:00:00Z"))
                .withDisplayName("Virtual Machines D Series")
                .withAppliedScopeType(DiscountAppliedScopeType.BILLING_ACCOUNT)
                .withDiscountTypeProperties(new DiscountTypeProperties().withApplyDiscountOn(ApplyDiscountOn.PURCHASE)
                    .withDiscountPercentage(14.0D)
                    .withDiscountCombinationRule(DiscountCombinationRule.BEST_OF)
                    .withConditions(Arrays.asList(new ConditionsItem().withConditionName("Cloud")
                        .withValue(Arrays.asList("US-Sec"))
                        .withType("equalAny"))))
                .withEndAt(OffsetDateTime.parse("2024-07-01T23:59:59Z")))
            .create();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### Discounts_Update

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/OperationsGet.json
     */
    /**
     * Sample code: OperationsGet.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void operationsGet(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### DiscountsOperationGroup_ScopeList

```java
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanOrderAliasModelInner;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.Commitment;
import com.azure.resourcemanager.billingbenefits.models.CommitmentGrain;
import com.azure.resourcemanager.billingbenefits.models.ResourceSku;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanPurchaseValidateRequest;
import com.azure.resourcemanager.billingbenefits.models.Term;
import java.util.Arrays;

/**
 * Samples for SavingsPlanOperationGroup ValidatePurchase.
 */
public final class SavingsPlanOperationGroupValidatePurchaseSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanValidatePurchase.json
     */
    /**
     * Sample code: SavingsPlanValidatePurchase.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        savingsPlanValidatePurchase(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanOperationGroups()
            .validatePurchaseWithResponse(new SavingsPlanPurchaseValidateRequest().withBenefits(Arrays.asList(
                new SavingsPlanOrderAliasModelInner().withSku(new ResourceSku().withName("Compute_Savings_Plan"))
                    .withDisplayName("ComputeSavingsPlan_2021-07-01")
                    .withBillingScopeId("/subscriptions/10000000-0000-0000-0000-000000000000")
                    .withTerm(Term.P1Y)
                    .withAppliedScopeType(AppliedScopeType.SINGLE)
                    .withAppliedScopeProperties(new AppliedScopeProperties().withResourceGroupId(
                        "/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/testrg"))
                    .withCommitment(new Commitment().withCurrencyCode("fakeTokenPlaceholder")
                        .withAmount(15.23D)
                        .withGrain(CommitmentGrain.HOURLY)),
                new SavingsPlanOrderAliasModelInner().withSku(new ResourceSku().withName("Compute_Savings_Plan"))
                    .withDisplayName("ComputeSavingsPlan_2021-07-01")
                    .withBillingScopeId("/subscriptions/10000000-0000-0000-0000-000000000000")
                    .withTerm(Term.P1Y)
                    .withAppliedScopeType(AppliedScopeType.SINGLE)
                    .withAppliedScopeProperties(new AppliedScopeProperties()
                        .withResourceGroupId("/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/RG"))
                    .withCommitment(new Commitment().withCurrencyCode("fakeTokenPlaceholder")
                        .withAmount(20.0D)
                        .withGrain(CommitmentGrain.HOURLY)))),
                com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.Commitment;
import com.azure.resourcemanager.billingbenefits.models.CommitmentGrain;
import com.azure.resourcemanager.billingbenefits.models.PurchaseRequest;
import com.azure.resourcemanager.billingbenefits.models.RenewProperties;
import com.azure.resourcemanager.billingbenefits.models.ResourceSku;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanUpdateRequest;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanUpdateRequestProperties;
import com.azure.resourcemanager.billingbenefits.models.Term;

/**
 * Samples for SavingsPlanModels Update.
 */
public final class SavingsPlanModelsUpdateSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanUpdate.json
     */
    /**
     * Sample code: SavingsPlanUpdate.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void savingsPlanUpdate(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanModels()
            .update("20000000-0000-0000-0000-000000000000", "30000000-0000-0000-0000-000000000000",
                new SavingsPlanUpdateRequest()
                    .withProperties(
                        new SavingsPlanUpdateRequestProperties().withDisplayName("TestDisplayName")
                            .withAppliedScopeType(AppliedScopeType.SINGLE)
                            .withAppliedScopeProperties(new AppliedScopeProperties().withResourceGroupId(
                                "/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/testrg"))
                            .withRenew(true)
                            .withRenewProperties(new RenewProperties().withPurchaseProperties(new PurchaseRequest()
                                .withSku(new ResourceSku().withName("Compute_Savings_Plan"))
                                .withDisplayName("TestDisplayName_renewed")
                                .withBillingScopeId("/subscriptions/10000000-0000-0000-0000-000000000000")
                                .withTerm(Term.P1Y)
                                .withBillingPlan(BillingPlan.P1M)
                                .withAppliedScopeType(AppliedScopeType.SINGLE)
                                .withCommitment(new Commitment().withCurrencyCode("fakeTokenPlaceholder")
                                    .withAmount(15.23D)
                                    .withGrain(CommitmentGrain.HOURLY))
                                .withRenew(false)
                                .withAppliedScopeProperties(new AppliedScopeProperties().withResourceGroupId(
                                    "/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/testrg"))))),
                com.azure.core.util.Context.NONE);
    }
}
```

### ReservationOrderAliasResponses_Create

```java
/**
 * Samples for SavingsPlanModels Get.
 */
public final class SavingsPlanModelsGetSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanItemExpandedGet.json
     */
    /**
     * Sample code: SavingsPlanItemWithExpandedRenewPropertiesGet.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void savingsPlanItemWithExpandedRenewPropertiesGet(
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanModels()
            .getWithResponse("20000000-0000-0000-0000-000000000000", "30000000-0000-0000-0000-000000000000",
                "renewProperties", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanItemGet.json
     */
    /**
     * Sample code: SavingsPlanItemGet.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void savingsPlanItemGet(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanModels()
            .getWithResponse("20000000-0000-0000-0000-000000000000", "30000000-0000-0000-0000-000000000000", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### ReservationOrderAliasResponses_Get

```java
/**
 * Samples for SavingsPlanOperationGroup ListAll.
 */
public final class SavingsPlanOperationGroupListAllSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlansList.json
     */
    /**
     * Sample code: SavingsPlansList.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void savingsPlansList(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanOperationGroups()
            .listAll("(properties/archived eq false)", "properties/displayName asc", "true", 50.0D, null, 1.0D,
                com.azure.core.util.Context.NONE);
    }
}
```

### SavingsPlanModels_Get

```java
/**
 * Samples for Discounts Cancel.
 */
public final class DiscountsCancelSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountCancel.json
     */
    /**
     * Sample code: DiscountCancel.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void discountCancel(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discounts().cancel("testrg", "testdiscount", com.azure.core.util.Context.NONE);
    }
}
```

### SavingsPlanModels_List

```java
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanOrderAliasModelInner;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.Commitment;
import com.azure.resourcemanager.billingbenefits.models.CommitmentGrain;
import com.azure.resourcemanager.billingbenefits.models.ResourceSku;
import com.azure.resourcemanager.billingbenefits.models.Term;

/**
 * Samples for SavingsPlanOrderAliasModels Create.
 */
public final class SavingsPlanOrderAliasModelsCreateSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanOrderAliasCreate.json
     */
    /**
     * Sample code: SavingsPlanOrderAliasCreate.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        savingsPlanOrderAliasCreate(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanOrderAliasModels()
            .create("spAlias123",
                new SavingsPlanOrderAliasModelInner().withSku(new ResourceSku().withName("Compute_Savings_Plan"))
                    .withDisplayName("Compute_SavingsPlan_10-28-2022_16-38")
                    .withBillingScopeId("/subscriptions/30000000-0000-0000-0000-000000000000")
                    .withTerm(Term.P3Y)
                    .withBillingPlan(BillingPlan.P1M)
                    .withAppliedScopeType(AppliedScopeType.SHARED)
                    .withCommitment(new Commitment().withCurrencyCode("fakeTokenPlaceholder")
                        .withAmount(0.001D)
                        .withGrain(CommitmentGrain.HOURLY)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanOrderAliasCreateSingleScope.json
     */
    /**
     * Sample code: SavingsPlanOrderAliasCreateSingleScope.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void savingsPlanOrderAliasCreateSingleScope(
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanOrderAliasModels()
            .create("spAlias123", new SavingsPlanOrderAliasModelInner()
                .withSku(new ResourceSku().withName("Compute_Savings_Plan"))
                .withDisplayName("Compute_SavingsPlan_10-28-2022_16-38")
                .withBillingScopeId(
                    "/providers/Microsoft.Billing/billingAccounts/1234567/billingSubscriptions/30000000-0000-0000-0000-000000000000")
                .withTerm(Term.P3Y)
                .withBillingPlan(BillingPlan.P1M)
                .withAppliedScopeType(AppliedScopeType.SINGLE)
                .withAppliedScopeProperties(new AppliedScopeProperties()
                    .withSubscriptionId("/subscriptions/30000000-0000-0000-0000-000000000000"))
                .withCommitment(new Commitment().withCurrencyCode("fakeTokenPlaceholder")
                    .withAmount(0.001D)
                    .withGrain(CommitmentGrain.HOURLY)),
                com.azure.core.util.Context.NONE);
    }
}
```

### SavingsPlanModels_Update

```java
/**
 * Samples for SavingsPlanOrderModels List.
 */
public final class SavingsPlanOrderModelsListSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanOrderList.json
     */
    /**
     * Sample code: SavingsPlanOrderList.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void savingsPlanOrderList(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanOrderModels().list(com.azure.core.util.Context.NONE);
    }
}
```

### SavingsPlanModels_ValidateUpdate

```java
/**
 * Samples for SavingsPlanOrderAliasModels Get.
 */
public final class SavingsPlanOrderAliasModelsGetSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanOrderAliasGet.json
     */
    /**
     * Sample code: SavingsPlanOrderAliasGet.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        savingsPlanOrderAliasGet(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanOrderAliasModels().getWithResponse("spAlias123", com.azure.core.util.Context.NONE);
    }
}
```

### SavingsPlanOperationGroup_ListAll

```java
/**
 * Samples for Discounts Delete.
 */
public final class DiscountsDeleteSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountsDelete.json
     */
    /**
     * Sample code: ReservationOrderAliasCreate.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        reservationOrderAliasCreate(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discounts().delete("testrg", "testdiscount", com.azure.core.util.Context.NONE);
    }
}
```

### SavingsPlanOperationGroup_ValidatePurchase

```java
/**
 * Samples for DiscountsOperationGroup ScopeList.
 */
public final class DiscountsOperationGroupScopeListSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/ApplicableDiscountsList.json
     */
    /**
     * Sample code: DiscountScopeList.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void discountScopeList(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discountsOperationGroups()
            .scopeList("providers/Microsoft.Billing/billingAccounts/{acctId}", com.azure.core.util.Context.NONE);
    }
}
```

### SavingsPlanOrderAliasModels_Create

```java
/**
 * Samples for Discounts ListByResourceGroup.
 */
public final class DiscountsListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountListResourceGroup.json
     */
    /**
     * Sample code: DiscountSubscriptionList.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        discountSubscriptionList(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.discounts().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
    }
}
```

### SavingsPlanOrderAliasModels_Get

```java
import com.azure.resourcemanager.billingbenefits.models.Discount;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Discounts Update.
 */
public final class DiscountsUpdateSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/DiscountsUpdate.json
     */
    /**
     * Sample code: DiscountGet.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void discountGet(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        Discount resource = manager.discounts()
            .getByResourceGroupWithResponse("testrg", "testprimarydiscount", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withDisplayName("Virtual Machines D Series")
            .apply();
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
```

### SavingsPlanOrderModels_Elevate

```java
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.InstanceFlexibility;
import com.azure.resourcemanager.billingbenefits.models.ReservationOrderAliasRequest;
import com.azure.resourcemanager.billingbenefits.models.ReservationOrderAliasRequestPropertiesReservedResourceProperties;
import com.azure.resourcemanager.billingbenefits.models.ReservedResourceType;
import com.azure.resourcemanager.billingbenefits.models.ResourceSku;
import com.azure.resourcemanager.billingbenefits.models.Term;

/**
 * Samples for ReservationOrderAliasResponses Create.
 */
public final class ReservationOrderAliasResponsesCreateSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/ReservationOrderAliasCreate.json
     */
    /**
     * Sample code: ReservationOrderAliasCreate.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        reservationOrderAliasCreate(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.reservationOrderAliasResponses()
            .create("reservationOrderAlias123", new ReservationOrderAliasRequest()
                .withSku(new ResourceSku().withName("Standard_M64s_v2"))
                .withLocation("eastus")
                .withDisplayName("ReservationOrder_2022-06-02")
                .withBillingScopeId("/subscriptions/10000000-0000-0000-0000-000000000000")
                .withTerm(Term.P1Y)
                .withBillingPlan(BillingPlan.P1M)
                .withAppliedScopeType(AppliedScopeType.SINGLE)
                .withAppliedScopeProperties(new AppliedScopeProperties()
                    .withResourceGroupId("/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/testrg"))
                .withQuantity(5)
                .withRenew(true)
                .withReservedResourceType(ReservedResourceType.VIRTUAL_MACHINES)
                .withReservedResourceProperties(new ReservationOrderAliasRequestPropertiesReservedResourceProperties()
                    .withInstanceFlexibility(InstanceFlexibility.ON)),
                com.azure.core.util.Context.NONE);
    }
}
```

### SavingsPlanOrderModels_Get

```java
/**
 * Samples for ReservationOrderAliasResponses Get.
 */
public final class ReservationOrderAliasResponsesGetSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/ReservationOrderAliasGet.json
     */
    /**
     * Sample code: ReservationOrderAliasGet.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void
        reservationOrderAliasGet(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.reservationOrderAliasResponses()
            .getWithResponse("reservationOrderAlias123", com.azure.core.util.Context.NONE);
    }
}
```

### SavingsPlanOrderModels_List

```java
/**
 * Samples for SavingsPlanOrderModels Get.
 */
public final class SavingsPlanOrderModelsGetSamples {
    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanOrderGet.json
     */
    /**
     * Sample code: SavingsPlanOrderGet.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void savingsPlanOrderGet(com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanOrderModels()
            .getWithResponse("20000000-0000-0000-0000-000000000000", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-11-01-preview/SavingsPlanOrderExpandedGet.json
     */
    /**
     * Sample code: SavingsPlanOrderWithExpandedPaymentsGet.
     * 
     * @param manager Entry point to BillingBenefitsManager.
     */
    public static void savingsPlanOrderWithExpandedPaymentsGet(
        com.azure.resourcemanager.billingbenefits.BillingBenefitsManager manager) {
        manager.savingsPlanOrderModels()
            .getWithResponse("20000000-0000-0000-0000-000000000000", "schedule", com.azure.core.util.Context.NONE);
    }
}
```

