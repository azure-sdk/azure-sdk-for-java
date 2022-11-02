# Code snippets and samples


## CalculateMigrationCost

- [Post](#calculatemigrationcost_post)

## Operations

- [List](#operations_list)

## ReservationOrderAlias

- [Create](#reservationorderalias_create)
- [Get](#reservationorderalias_get)

## SavingsPlanOperation

- [Get](#savingsplanoperation_get)
- [Update](#savingsplanoperation_update)

## SavingsPlanOrder

- [Elevate](#savingsplanorder_elevate)
- [Get](#savingsplanorder_get)
- [List](#savingsplanorder_list)

## SavingsPlanOrderAlias

- [Create](#savingsplanorderalias_create)
- [Get](#savingsplanorderalias_get)

## SavingsPlanPurchase

- [Validate](#savingsplanpurchase_validate)

## SavingsPlanUpdate

- [Validate](#savingsplanupdate_validate)

## SavingsPlans

- [List](#savingsplans_list)

## SavingsPlansInOrder

- [List](#savingsplansinorder_list)
### CalculateMigrationCost_Post

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.billingbenefits.models.CalculateMigrationCostRequest;

/** Samples for CalculateMigrationCost Post. */
public final class CalculateMigrationCostPostSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/CalculateMigrationCost.json
     */
    /**
     * Sample code: CalculateMigrationCost.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void calculateMigrationCost(
        com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager
            .calculateMigrationCosts()
            .post(
                new CalculateMigrationCostRequest()
                    .withSourceBillingAccountId("/providers/Microsoft.Billing/billingAccounts/0000000")
                    .withDestinationBillingProfileId(
                        "/providers/Microsoft.Billing/billingAccounts/20000000-1000-0000-0000-000000000000:20000000-0000-3000-0000-000000000000_2019-05-31/billingProfiles/KPSV-DWNE-BG7-TGB"),
                Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/OperationsGet.json
     */
    /**
     * Sample code: OperationsGet.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void operationsGet(com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

### ReservationOrderAlias_Create

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.InstanceFlexibility;
import com.azure.resourcemanager.billingbenefits.models.ReservationOrderAliasRequest;
import com.azure.resourcemanager.billingbenefits.models.ReservationOrderAliasRequestPropertiesReservedResourceProperties;
import com.azure.resourcemanager.billingbenefits.models.ReservedResourceType;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanTerm;
import com.azure.resourcemanager.billingbenefits.models.Sku;

/** Samples for ReservationOrderAlias Create. */
public final class ReservationOrderAliasCreateSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/ReservationOrderAliasCreate.json
     */
    /**
     * Sample code: ReservationOrderAliasCreate.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void reservationOrderAliasCreate(
        com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager
            .reservationOrderAlias()
            .create(
                "reservationOrderAlias123",
                new ReservationOrderAliasRequest()
                    .withSku(new Sku().withName("Standard_M64s_v2"))
                    .withDisplayName("ReservationOrder_2022-06-02")
                    .withBillingScopeId("/subscriptions/10000000-0000-0000-0000-000000000000")
                    .withTerm(SavingsPlanTerm.P1Y)
                    .withBillingPlan(BillingPlan.P1M)
                    .withAppliedScopeType(AppliedScopeType.SINGLE)
                    .withAppliedScopeProperties(
                        new AppliedScopeProperties()
                            .withResourceGroupId(
                                "/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/testrg"))
                    .withQuantity(5)
                    .withRenew(true)
                    .withReservedResourceType(ReservedResourceType.VIRTUAL_MACHINES)
                    .withReservedResourceProperties(
                        new ReservationOrderAliasRequestPropertiesReservedResourceProperties()
                            .withInstanceFlexibility(InstanceFlexibility.ON)),
                Context.NONE);
    }
}
```

### ReservationOrderAlias_Get

```java
import com.azure.core.util.Context;

/** Samples for ReservationOrderAlias Get. */
public final class ReservationOrderAliasGetSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/ReservationOrderAliasGet.json
     */
    /**
     * Sample code: ReservationOrderAliasGet.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void reservationOrderAliasGet(
        com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager.reservationOrderAlias().getWithResponse("reservationOrderAlias123", Context.NONE);
    }
}
```

### SavingsPlanOperation_Get

```java
import com.azure.core.util.Context;

/** Samples for SavingsPlanOperation Get. */
public final class SavingsPlanOperationGetSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanItemGet.json
     */
    /**
     * Sample code: SavingsPlanItemGet.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlanItemGet(com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager
            .savingsPlanOperations()
            .getWithResponse(
                "20000000-0000-0000-0000-000000000000", "30000000-0000-0000-0000-000000000000", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanItemExpandedGet.json
     */
    /**
     * Sample code: SavingsPlanItemWithExpandedRenewPropertiesGet.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlanItemWithExpandedRenewPropertiesGet(
        com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager
            .savingsPlanOperations()
            .getWithResponse(
                "20000000-0000-0000-0000-000000000000",
                "30000000-0000-0000-0000-000000000000",
                "renewProperties",
                Context.NONE);
    }
}
```

### SavingsPlanOperation_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.billingbenefits.fluent.models.RenewPropertiesInner;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanModelInner;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanUpdateRequestInner;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanUpdateRequestPropertiesInner;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.Commitment;
import com.azure.resourcemanager.billingbenefits.models.CommitmentGrain;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanTerm;
import com.azure.resourcemanager.billingbenefits.models.Sku;

/** Samples for SavingsPlanOperation Update. */
public final class SavingsPlanOperationUpdateSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanUpdate.json
     */
    /**
     * Sample code: SavingsPlanUpdate.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlanUpdate(com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager
            .savingsPlanOperations()
            .updateWithResponse(
                "20000000-0000-0000-0000-000000000000",
                "30000000-0000-0000-0000-000000000000",
                new SavingsPlanUpdateRequestInner()
                    .withProperties(
                        new SavingsPlanUpdateRequestPropertiesInner()
                            .withDisplayName("TestDisplayName")
                            .withAppliedScopeType(AppliedScopeType.SINGLE)
                            .withAppliedScopeProperties(
                                new AppliedScopeProperties()
                                    .withResourceGroupId(
                                        "/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/testrg"))
                            .withRenew(true)
                            .withRenewProperties(
                                new RenewPropertiesInner()
                                    .withPurchaseProperties(
                                        new SavingsPlanModelInner()
                                            .withSku(new Sku().withName("Compute_Savings_Plan"))
                                            .withDisplayName("TestDisplayName_renewed")
                                            .withBillingScopeId("/subscriptions/10000000-0000-0000-0000-000000000000")
                                            .withTerm(SavingsPlanTerm.P1Y)
                                            .withBillingPlan(BillingPlan.P1M)
                                            .withAppliedScopeType(AppliedScopeType.SINGLE)
                                            .withAppliedScopeProperties(
                                                new AppliedScopeProperties()
                                                    .withResourceGroupId(
                                                        "/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/testrg"))
                                            .withCommitment(
                                                new Commitment()
                                                    .withCurrencyCode("USD")
                                                    .withAmount(15.23D)
                                                    .withGrain(CommitmentGrain.HOURLY))
                                            .withRenew(false)))),
                Context.NONE);
    }
}
```

### SavingsPlanOrder_Elevate

```java
import com.azure.core.util.Context;

/** Samples for SavingsPlanOrder Elevate. */
public final class SavingsPlanOrderElevateSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanOrderElevate.json
     */
    /**
     * Sample code: SavingsPlanOrderElevate.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlanOrderElevate(
        com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager.savingsPlanOrders().elevateWithResponse("20000000-0000-0000-0000-000000000000", Context.NONE);
    }
}
```

### SavingsPlanOrder_Get

```java
import com.azure.core.util.Context;

/** Samples for SavingsPlanOrder Get. */
public final class SavingsPlanOrderGetSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanOrderGet.json
     */
    /**
     * Sample code: SavingsPlanOrderGet.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlanOrderGet(com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager.savingsPlanOrders().getWithResponse("20000000-0000-0000-0000-000000000000", null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanOrderExpandedGet.json
     */
    /**
     * Sample code: SavingsPlanOrderWithExpandedPaymentsGet.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlanOrderWithExpandedPaymentsGet(
        com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager.savingsPlanOrders().getWithResponse("20000000-0000-0000-0000-000000000000", "schedule", Context.NONE);
    }
}
```

### SavingsPlanOrder_List

```java
import com.azure.core.util.Context;

/** Samples for SavingsPlanOrder List. */
public final class SavingsPlanOrderListSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanOrderList.json
     */
    /**
     * Sample code: SavingsPlanOrderList.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlanOrderList(com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager.savingsPlanOrders().list(Context.NONE);
    }
}
```

### SavingsPlanOrderAlias_Create

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanOrderAliasModelInner;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.Commitment;
import com.azure.resourcemanager.billingbenefits.models.CommitmentGrain;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanTerm;
import com.azure.resourcemanager.billingbenefits.models.Sku;

/** Samples for SavingsPlanOrderAlias Create. */
public final class SavingsPlanOrderAliasCreateSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanOrderAliasCreate.json
     */
    /**
     * Sample code: SavingsPlanOrderAliasCreate.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlanOrderAliasCreate(
        com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager
            .savingsPlanOrderAlias()
            .create(
                "spAlias123",
                new SavingsPlanOrderAliasModelInner()
                    .withSku(new Sku().withName("Compute_Savings_Plan"))
                    .withDisplayName("Compute_SavingsPlan_10-28-2022_16-38")
                    .withBillingScopeId("/subscriptions/30000000-0000-0000-0000-000000000000")
                    .withTerm(SavingsPlanTerm.P3Y)
                    .withBillingPlan(BillingPlan.P1M)
                    .withAppliedScopeType(AppliedScopeType.SHARED)
                    .withCommitment(
                        new Commitment().withCurrencyCode("USD").withAmount(0.001D).withGrain(CommitmentGrain.HOURLY)),
                Context.NONE);
    }
}
```

### SavingsPlanOrderAlias_Get

```java
import com.azure.core.util.Context;

/** Samples for SavingsPlanOrderAlias Get. */
public final class SavingsPlanOrderAliasGetSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanOrderAliasGet.json
     */
    /**
     * Sample code: SavingsPlanOrderAliasGet.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlanOrderAliasGet(
        com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager.savingsPlanOrderAlias().getWithResponse("spAlias123", Context.NONE);
    }
}
```

### SavingsPlanPurchase_Validate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanOrderAliasModelInner;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.Commitment;
import com.azure.resourcemanager.billingbenefits.models.CommitmentGrain;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanPurchaseValidateRequest;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanTerm;
import com.azure.resourcemanager.billingbenefits.models.Sku;
import java.util.Arrays;

/** Samples for SavingsPlanPurchase Validate. */
public final class SavingsPlanPurchaseValidateSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanValidatePurchase.json
     */
    /**
     * Sample code: SavingsPlanValidatePurchase.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlanValidatePurchase(
        com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager
            .savingsPlanPurchases()
            .validateWithResponse(
                new SavingsPlanPurchaseValidateRequest()
                    .withBenefits(
                        Arrays
                            .asList(
                                new SavingsPlanOrderAliasModelInner()
                                    .withSku(new Sku().withName("Compute_Savings_Plan"))
                                    .withDisplayName("ComputeSavingsPlan_2021-07-01")
                                    .withBillingScopeId("/subscriptions/10000000-0000-0000-0000-000000000000")
                                    .withTerm(SavingsPlanTerm.P1Y)
                                    .withAppliedScopeType(AppliedScopeType.SINGLE)
                                    .withAppliedScopeProperties(
                                        new AppliedScopeProperties()
                                            .withResourceGroupId(
                                                "/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/testrg"))
                                    .withCommitment(
                                        new Commitment()
                                            .withCurrencyCode("USD")
                                            .withAmount(15.23D)
                                            .withGrain(CommitmentGrain.HOURLY)),
                                new SavingsPlanOrderAliasModelInner()
                                    .withSku(new Sku().withName("Compute_Savings_Plan"))
                                    .withDisplayName("ComputeSavingsPlan_2021-07-01")
                                    .withBillingScopeId("/subscriptions/10000000-0000-0000-0000-000000000000")
                                    .withTerm(SavingsPlanTerm.P1Y)
                                    .withAppliedScopeType(AppliedScopeType.SINGLE)
                                    .withAppliedScopeProperties(
                                        new AppliedScopeProperties()
                                            .withResourceGroupId(
                                                "/subscriptions/10000000-0000-0000-0000-000000000000/resourceGroups/RG"))
                                    .withCommitment(
                                        new Commitment()
                                            .withCurrencyCode("USD")
                                            .withAmount(20.0D)
                                            .withGrain(CommitmentGrain.HOURLY)))),
                Context.NONE);
    }
}
```

### SavingsPlanUpdate_Validate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.billingbenefits.fluent.models.SavingsPlanUpdateRequestPropertiesInner;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.SavingsPlanUpdateValidateRequest;
import java.util.Arrays;

/** Samples for SavingsPlanUpdate Validate. */
public final class SavingsPlanUpdateValidateSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlanValidateUpdate.json
     */
    /**
     * Sample code: SavingsPlanValidateUpdate.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlanValidateUpdate(
        com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager
            .savingsPlanUpdates()
            .validateWithResponse(
                "20000000-0000-0000-0000-000000000000",
                "30000000-0000-0000-0000-000000000000",
                new SavingsPlanUpdateValidateRequest()
                    .withBenefits(
                        Arrays
                            .asList(
                                new SavingsPlanUpdateRequestPropertiesInner()
                                    .withAppliedScopeType(AppliedScopeType.MANAGEMENT_GROUP)
                                    .withAppliedScopeProperties(
                                        new AppliedScopeProperties()
                                            .withTenantId("30000000-0000-0000-0000-000000000100")
                                            .withManagementGroupId(
                                                "/providers/Microsoft.Management/managementGroups/30000000-0000-0000-0000-000000000100")),
                                new SavingsPlanUpdateRequestPropertiesInner()
                                    .withAppliedScopeType(AppliedScopeType.MANAGEMENT_GROUP)
                                    .withAppliedScopeProperties(
                                        new AppliedScopeProperties()
                                            .withTenantId("30000000-0000-0000-0000-000000000100")
                                            .withManagementGroupId(
                                                "/providers/Microsoft.Management/managementGroups/MockMG")))),
                Context.NONE);
    }
}
```

### SavingsPlans_List

```java
import com.azure.core.util.Context;

/** Samples for SavingsPlans List. */
public final class SavingsPlansListSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlansList.json
     */
    /**
     * Sample code: SavingsPlansList.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlansList(com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager
            .savingsPlans()
            .list(
                "(properties/archived eq false)",
                "properties/displayName asc",
                "true",
                50.0F,
                null,
                1.0F,
                Context.NONE);
    }
}
```

### SavingsPlansInOrder_List

```java
import com.azure.core.util.Context;

/** Samples for SavingsPlansInOrder List. */
public final class SavingsPlansInOrderListSamples {
    /*
     * x-ms-original-file: specification/billingbenefits/resource-manager/Microsoft.BillingBenefits/stable/2022-11-01/examples/SavingsPlansInOrderList.json
     */
    /**
     * Sample code: SavingsPlansInOrderList.
     *
     * @param manager Entry point to BillingbenefitsManager.
     */
    public static void savingsPlansInOrderList(
        com.azure.resourcemanager.billingbenefits.BillingbenefitsManager manager) {
        manager.savingsPlansInOrders().list("20000000-0000-0000-0000-000000000000", Context.NONE);
    }
}
```

