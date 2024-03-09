# Code snippets and samples


## CarbonService

- [ListCarbonEmissionReports](#carbonservice_listcarbonemissionreports)
- [QueryCarbonEmissionDataAvailableDateRange](#carbonservice_querycarbonemissiondataavailabledaterange)

## Operations

- [List](#operations_list)
### CarbonService_ListCarbonEmissionReports

```java
import com.azure.resourcemanager.carbon.models.DateRange;
import com.azure.resourcemanager.carbon.models.EmissionScopeEnum;
import com.azure.resourcemanager.carbon.models.OverallSummaryReportQueryFilter;
import java.time.LocalDate;
import java.util.Arrays;

/**
 * Samples for CarbonService ListCarbonEmissionReports.
 */
public final class CarbonServiceListCarbonEmissionReportsSamples {
    /*
     * x-ms-original-file:
     * specification/carbon/resource-manager/Microsoft.Carbon/preview/2024-02-01-preview/examples/carbonEmissionsReport.
     * json
     */
    /**
     * Sample code: CarbonService_ListCarbonEmissionReports.
     * 
     * @param manager Entry point to CarbonManager.
     */
    public static void carbonServiceListCarbonEmissionReports(com.azure.resourcemanager.carbon.CarbonManager manager) {
        manager.carbonServices()
            .listCarbonEmissionReports(new OverallSummaryReportQueryFilter()
                .withDateRange(
                    new DateRange().withStart(LocalDate.parse("2023-06-01")).withEnd(LocalDate.parse("2023-06-15")))
                .withSubscriptionList(Arrays.asList("00000000-0000-0000-0000-000000000000"))
                .withCarbonScopeList(Arrays.asList(EmissionScopeEnum.SCOPE1)), com.azure.core.util.Context.NONE);
    }
}
```

### CarbonService_QueryCarbonEmissionDataAvailableDateRange

```java
/**
 * Samples for CarbonService QueryCarbonEmissionDataAvailableDateRange.
 */
public final class CarbonServiceQueryCarbonEmissionDataAvailableDateRangeSamples {
    /*
     * x-ms-original-file: specification/carbon/resource-manager/Microsoft.Carbon/preview/2024-02-01-preview/examples/
     * carbonEmissionsDataAvailableDateRange.json
     */
    /**
     * Sample code: CarbonService_QueryCarbonEmissionDataAvailableDateRange.
     * 
     * @param manager Entry point to CarbonManager.
     */
    public static void
        carbonServiceQueryCarbonEmissionDataAvailableDateRange(com.azure.resourcemanager.carbon.CarbonManager manager) {
        manager.carbonServices()
            .queryCarbonEmissionDataAvailableDateRangeWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/carbon/resource-manager/Microsoft.Carbon/preview/2024-02-01-preview/examples/listOperations.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to CarbonManager.
     */
    public static void operationsList(com.azure.resourcemanager.carbon.CarbonManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

