# Code snippets and samples


## OperationsResult

- [List](#operationsresult_list)

## PriceSheets

- [Get](#pricesheets_get)
- [GetByBillingPeriod](#pricesheets_getbybillingperiod)
### OperationsResult_List

```java
/** Samples for OperationsResult List. */
public final class OperationsResultListSamples {
    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2023-03-01/examples/OperationList.json
     */
    /**
     * Sample code: OperationList.
     *
     * @param manager Entry point to ConsumptionManager.
     */
    public static void operationList(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager.operationsResults().list(com.azure.core.util.Context.NONE);
    }
}
```

### PriceSheets_Get

```java
/** Samples for PriceSheets Get. */
public final class PriceSheetsGetSamples {
    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2023-03-01/examples/PriceSheet.json
     */
    /**
     * Sample code: PriceSheet.
     *
     * @param manager Entry point to ConsumptionManager.
     */
    public static void priceSheet(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager
            .priceSheets()
            .getWithResponse(
                "00000000-0000-0000-0000-000000000000", null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### PriceSheets_GetByBillingPeriod

```java
/** Samples for PriceSheets GetByBillingPeriod. */
public final class PriceSheetsGetByBillingPeriodSamples {
    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2023-03-01/examples/PriceSheetForBillingPeriod.json
     */
    /**
     * Sample code: PriceSheetForBillingPeriod.
     *
     * @param manager Entry point to ConsumptionManager.
     */
    public static void priceSheetForBillingPeriod(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager
            .priceSheets()
            .getByBillingPeriodWithResponse(
                "00000000-0000-0000-0000-000000000000", "201801", null, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/consumption/resource-manager/Microsoft.Consumption/stable/2023-03-01/examples/PriceSheetExpand.json
     */
    /**
     * Sample code: PriceSheetExpand.
     *
     * @param manager Entry point to ConsumptionManager.
     */
    public static void priceSheetExpand(com.azure.resourcemanager.consumption.ConsumptionManager manager) {
        manager
            .priceSheets()
            .getByBillingPeriodWithResponse(
                "00000000-0000-0000-0000-000000000000",
                "201801",
                "meterDetails",
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
```

