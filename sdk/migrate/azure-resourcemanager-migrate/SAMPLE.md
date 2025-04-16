# Code snippets and samples


## AssessedMachinesV2Operations

- [Get](#assessedmachinesv2operations_get)
- [ListByParent](#assessedmachinesv2operations_listbyparent)

## MachineAssessmentV2SummaryOperations

- [Get](#machineassessmentv2summaryoperations_get)
- [ListByParent](#machineassessmentv2summaryoperations_listbyparent)

## MachineAssessmentsV2Operations

- [Create](#machineassessmentsv2operations_create)
- [Delete](#machineassessmentsv2operations_delete)
- [DownloadUrl](#machineassessmentsv2operations_downloadurl)
- [Get](#machineassessmentsv2operations_get)
- [ListByParent](#machineassessmentsv2operations_listbyparent)

## MachineGraphAssessmentOptionsOperations

- [Get](#machinegraphassessmentoptionsoperations_get)
- [ListByParent](#machinegraphassessmentoptionsoperations_listbyparent)

## Operations

- [List](#operations_list)
### AssessedMachinesV2Operations_Get

```java
/**
 * Samples for MachineAssessmentsV2Operations ListByParent.
 */
public final class MachineAssessmentsV2OperationsListByParentSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/MachineAssessmentsV2Operations_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: MachineAssessmentsV2Operations_ListByParent_MaximumSet.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        machineAssessmentsV2OperationsListByParentMaximumSet(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.machineAssessmentsV2Operations()
            .listByParent("rgmachineAssessments", "contosoProject", com.azure.core.util.Context.NONE);
    }
}
```

### AssessedMachinesV2Operations_ListByParent

```java
/**
 * Samples for AssessedMachinesV2Operations Get.
 */
public final class AssessedMachinesV2OperationsGetSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/AssessedMachinesV2Operations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: AssessedMachinesV2Operations_Get_MaximumSet.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        assessedMachinesV2OperationsGetMaximumSet(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.assessedMachinesV2Operations()
            .getWithResponse("rgmachineAssessments", "contosoProject", "assessmentName", "machine1",
                com.azure.core.util.Context.NONE);
    }
}
```

### MachineAssessmentV2SummaryOperations_Get

```java
/**
 * Samples for AssessedMachinesV2Operations ListByParent.
 */
public final class AssessedMachinesV2OperationsListByParentSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/AssessedMachinesV2Operations_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: AssessedMachinesV2Operations_ListByParent_MaximumSet.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        assessedMachinesV2OperationsListByParentMaximumSet(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.assessedMachinesV2Operations()
            .listByParent("rgmachineAssessments", "contosoProject", "assessmentName", "eabpcsewhenpdfcsjck", 13,
                "lsuhpxtnundds", 28, com.azure.core.util.Context.NONE);
    }
}
```

### MachineAssessmentV2SummaryOperations_ListByParent

```java
/**
 * Samples for MachineAssessmentV2SummaryOperations Get.
 */
public final class MachineAssessmentV2SummaryOperationsGetSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/MachineAssessmentV2SummaryOperations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: MachineAssessmentV2SummaryOperations_Get_MaximumSet.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        machineAssessmentV2SummaryOperationsGetMaximumSet(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.machineAssessmentV2SummaryOperations()
            .getWithResponse("rgmachineAssessments", "contosoProject", "assessmentName", "PaaSPreferred",
                com.azure.core.util.Context.NONE);
    }
}
```

### MachineAssessmentsV2Operations_Create

```java
/**
 * Samples for MachineAssessmentV2SummaryOperations ListByParent.
 */
public final class MachineAssessmentV2SummaryOperationsListByParentSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/MachineAssessmentV2SummaryOperations_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: MachineAssessmentV2SummaryOperations_ListByParent_MaximumSet.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void machineAssessmentV2SummaryOperationsListByParentMaximumSet(
        com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.machineAssessmentV2SummaryOperations()
            .listByParent("rgmachineAssessments", "contosoProject", "assessmentName", com.azure.core.util.Context.NONE);
    }
}
```

### MachineAssessmentsV2Operations_Delete

```java
/**
 * Samples for MachineAssessmentsV2Operations Delete.
 */
public final class MachineAssessmentsV2OperationsDeleteSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/MachineAssessmentsV2Operations_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: MachineAssessmentsV2Operations_Delete_MaximumSet.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        machineAssessmentsV2OperationsDeleteMaximumSet(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.machineAssessmentsV2Operations()
            .deleteWithResponse("rgmachineAssessments", "contosoProject", "assessmentName",
                com.azure.core.util.Context.NONE);
    }
}
```

### MachineAssessmentsV2Operations_DownloadUrl

```java
/**
 * Samples for MachineGraphAssessmentOptionsOperations Get.
 */
public final class MachineGraphAssessmentOptionsOperationsGetSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/MachineGraphAssessmentOptionsOperations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: MachineGraphAssessmentOptionsOperations_Get_MaximumSet.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        machineGraphAssessmentOptionsOperationsGetMaximumSet(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.machineGraphAssessmentOptionsOperations()
            .getWithResponse("rgmachineAssessments", "contosoProject", com.azure.core.util.Context.NONE);
    }
}
```

### MachineAssessmentsV2Operations_Get

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void operationsList(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### MachineAssessmentsV2Operations_ListByParent

```java
import com.azure.resourcemanager.migrate.models.AssessmentDetails;
import com.azure.resourcemanager.migrate.models.AssessmentSizingCriterion;
import com.azure.resourcemanager.migrate.models.AzureCurrency;
import com.azure.resourcemanager.migrate.models.AzureDiskType;
import com.azure.resourcemanager.migrate.models.AzureHybridUseBenefit;
import com.azure.resourcemanager.migrate.models.AzureOffer;
import com.azure.resourcemanager.migrate.models.AzurePricingTier;
import com.azure.resourcemanager.migrate.models.AzureSecurityOfferingType;
import com.azure.resourcemanager.migrate.models.AzureStorageRedundancy;
import com.azure.resourcemanager.migrate.models.AzureVmFamily;
import com.azure.resourcemanager.migrate.models.AzureVmSecurityType;
import com.azure.resourcemanager.migrate.models.BillingSettings;
import com.azure.resourcemanager.migrate.models.EnvironmentType;
import com.azure.resourcemanager.migrate.models.LicensingProgram;
import com.azure.resourcemanager.migrate.models.MachineAssessmentSettings;
import com.azure.resourcemanager.migrate.models.MachineAssessmentV2Properties;
import com.azure.resourcemanager.migrate.models.Percentile;
import com.azure.resourcemanager.migrate.models.PerformanceData;
import com.azure.resourcemanager.migrate.models.SavingsOptions;
import com.azure.resourcemanager.migrate.models.SavingsSettings;
import com.azure.resourcemanager.migrate.models.Scope;
import com.azure.resourcemanager.migrate.models.ScopeType;
import com.azure.resourcemanager.migrate.models.TimeRange;
import com.azure.resourcemanager.migrate.models.VmUptime;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for MachineAssessmentsV2Operations Create.
 */
public final class MachineAssessmentsV2OperationsCreateSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/MachineAssessmentsV2Operations_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: MachineAssessmentsV2Operations_Create_MaximumSet.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        machineAssessmentsV2OperationsCreateMaximumSet(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.machineAssessmentsV2Operations()
            .define("assessmentName")
            .withExistingAssessmentProject("rgmachineAssessments", "contosoProject")
            .withProperties(new MachineAssessmentV2Properties()
                .withScope(new Scope().withScopeType(ScopeType.SERVER_GROUP_ID)
                    .withServerGroupId("f")
                    .withAzureResourceGraphQuery("hfhwuqalmenpcttboxvo"))
                .withSettings(new MachineAssessmentSettings().withAzureLocation("rsequlcso")
                    .withCurrency(AzureCurrency.UNKNOWN)
                    .withScalingFactor(9.0D)
                    .withDiscountPercentage(5.0D)
                    .withSizingCriterion(AssessmentSizingCriterion.PERFORMANCE_BASED)
                    .withPerformanceData(new PerformanceData().withPercentile(Percentile.fromString("Unknown"))
                        .withTimeRange(TimeRange.DAY)
                        .withPerfDataStartTime(OffsetDateTime.parse("2025-02-21T05:47:51.336Z"))
                        .withPerfDataEndTime(OffsetDateTime.parse("2025-02-21T05:47:51.336Z")))
                    .withSavingsSettings(new SavingsSettings().withSavingsOptions(SavingsOptions.NONE)
                        .withAzureOfferCode(AzureOffer.UNKNOWN))
                    .withBillingSettings(
                        new BillingSettings().withLicensingProgram(LicensingProgram.RETAIL).withSubscriptionId("lee"))
                    .withEnvironmentType(EnvironmentType.PRODUCTION)
                    .withAzureSecurityOfferingType(AzureSecurityOfferingType.NO)
                    .withAzureDiskTypes(Arrays.asList(AzureDiskType.UNKNOWN))
                    .withAzurePricingTier(AzurePricingTier.STANDARD)
                    .withAzureStorageRedundancy(AzureStorageRedundancy.UNKNOWN)
                    .withAzureHybridUseBenefit(AzureHybridUseBenefit.UNKNOWN)
                    .withLinuxAzureHybridUseBenefit(AzureHybridUseBenefit.UNKNOWN)
                    .withAzureVmFamilies(Arrays.asList(AzureVmFamily.UNKNOWN))
                    .withVmUptime(new VmUptime().withDaysPerMonth(9).withHoursPerDay(10))
                    .withAzureVmSecurityOptions(Arrays.asList(AzureVmSecurityType.TVM)))
                .withDetails(new AssessmentDetails()))
            .create();
    }
}
```

### MachineGraphAssessmentOptionsOperations_Get

```java
import com.azure.resourcemanager.migrate.models.DownloadUrlRequest;

/**
 * Samples for MachineAssessmentsV2Operations DownloadUrl.
 */
public final class MachineAssessmentsV2OperationsDownloadUrlSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/MachineAssessmentsV2Operations_DownloadUrl_MaximumSet_Gen.json
     */
    /**
     * Sample code: Get download URL for the assessment report.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void getDownloadURLForTheAssessmentReport(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.machineAssessmentsV2Operations()
            .downloadUrl("rgmachineAssessments", "contosoProject", "assessmentName", new DownloadUrlRequest(),
                com.azure.core.util.Context.NONE);
    }
}
```

### MachineGraphAssessmentOptionsOperations_ListByParent

```java
/**
 * Samples for MachineAssessmentsV2Operations Get.
 */
public final class MachineAssessmentsV2OperationsGetSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/MachineAssessmentsV2Operations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: MachineAssessmentsV2Operations_Get_MaximumSet.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        machineAssessmentsV2OperationsGetMaximumSet(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.machineAssessmentsV2Operations()
            .getWithResponse("rgmachineAssessments", "contosoProject", "assessmentName",
                com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for MachineGraphAssessmentOptionsOperations ListByParent.
 */
public final class MachineGraphAssessmentOptionsOperationsListByParentSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/MachineGraphAssessmentOptionsOperations_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: MachineGraphAssessmentOptionsOperations_ListByParent_MaximumSet.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void machineGraphAssessmentOptionsOperationsListByParentMaximumSet(
        com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.machineGraphAssessmentOptionsOperations()
            .listByParent("rgmachineAssessments", "contosoProject", com.azure.core.util.Context.NONE);
    }
}
```

