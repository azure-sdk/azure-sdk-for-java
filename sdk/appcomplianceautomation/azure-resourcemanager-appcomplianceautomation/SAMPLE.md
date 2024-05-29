# Code snippets and samples


## Evidences

- [CreateOrUpdate](#evidences_createorupdate)
- [Delete](#evidences_delete)
- [Download](#evidences_download)
- [Get](#evidences_get)
- [ListByReport](#evidences_listbyreport)

## Operations

- [List](#operations_list)

## ProviderActions

- [CheckNameAvailability](#provideractions_checknameavailability)
- [GetCollectionCount](#provideractions_getcollectioncount)
- [GetOverviewStatus](#provideractions_getoverviewstatus)
- [ListInUseStorageAccounts](#provideractions_listinusestorageaccounts)
- [Onboard](#provideractions_onboard)
- [TriggerEvaluation](#provideractions_triggerevaluation)

## ReportOperation

- [Verify](#reportoperation_verify)

## Reports

- [CreateOrUpdate](#reports_createorupdate)
- [Delete](#reports_delete)
- [Fix](#reports_fix)
- [Get](#reports_get)
- [List](#reports_list)
- [NestedResourceCheckNameAvailability](#reports_nestedresourcechecknameavailability)
- [SyncCertRecord](#reports_synccertrecord)
- [Update](#reports_update)

## ResourceProvider

- [GetScopingQuestions](#resourceprovider_getscopingquestions)

## ScopingConfigurationOperation

- [CreateOrUpdate](#scopingconfigurationoperation_createorupdate)
- [Delete](#scopingconfigurationoperation_delete)
- [Get](#scopingconfigurationoperation_get)

## ScopingConfigurations

- [List](#scopingconfigurations_list)

## Snapshots

- [Download](#snapshots_download)
- [Get](#snapshots_get)
- [List](#snapshots_list)

## Webhooks

- [CreateOrUpdate](#webhooks_createorupdate)
- [Delete](#webhooks_delete)
- [Get](#webhooks_get)
- [List](#webhooks_list)
- [Update](#webhooks_update)
### Evidences_CreateOrUpdate

```java

/**
 * Samples for Evidences CreateOrUpdate.
 */
public final class EvidencesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Evidences_CreateOrUpdate.json
     */
    /**
     * Sample code: Evidences_CreateOrUpdate.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void evidencesCreateOrUpdate(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.evidences()
            .createOrUpdateWithResponse("testReportName", "evidence1", null, null, null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Evidences_Delete

```java
/**
 * Samples for Evidences Delete.
 */
public final class EvidencesDeleteSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Evidences_Delete.json
     */
    /**
     * Sample code: Evidences_Delete.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        evidencesDelete(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.evidences()
            .deleteByResourceGroupWithResponse("testReportName", "evidence1", com.azure.core.util.Context.NONE);
    }
}
```

### Evidences_Download

```java
import com.azure.resourcemanager.appcomplianceautomation.models.EvidenceFileDownloadRequest;

/**
 * Samples for Evidences Download.
 */
public final class EvidencesDownloadSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Evidences_Download.json
     */
    /**
     * Sample code: Evidences_Download.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        evidencesDownload(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.evidences()
            .downloadWithResponse("testReportName", "evidence1",
                new EvidenceFileDownloadRequest().withReportCreatorTenantId("00000000-0000-0000-0000-000000000000")
                    .withOfferGuid("00000000-0000-0000-0000-000000000000"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Evidences_Get

```java
/**
 * Samples for Evidences Get.
 */
public final class EvidencesGetSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Evidences_Get.json
     */
    /**
     * Sample code: Evidences_Get.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        evidencesGet(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.evidences().getWithResponse("testReportName", "evidence1", com.azure.core.util.Context.NONE);
    }
}
```

### Evidences_ListByReport

```java
/**
 * Samples for Evidences ListByReport.
 */
public final class EvidencesListByReportSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Evidences_ListByReport.json
     */
    /**
     * Sample code: Evidences_ListByReport.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void evidencesListByReport(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.evidences()
            .listByReport("reportName", null, null, null, null, null, null, null, com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        operationsList(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ProviderActions_CheckNameAvailability

```java

/**
 * Samples for ProviderActions CheckNameAvailability.
 */
public final class ProviderActionsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Reports_CheckNameAvailability.json
     */
    /**
     * Sample code: Reports_CheckNameAvailability.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void reportsCheckNameAvailability(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.providerActions().checkNameAvailabilityWithResponse(null, com.azure.core.util.Context.NONE);
    }
}
```

### ProviderActions_GetCollectionCount

```java

/**
 * Samples for ProviderActions GetCollectionCount.
 */
public final class ProviderActionsGetCollectionCountSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Reports_GetCollectionCount.json
     */
    /**
     * Sample code: Reports_GetCollectionCount.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void reportsGetCollectionCount(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.providerActions().getCollectionCountWithResponse(null, com.azure.core.util.Context.NONE);
    }
}
```

### ProviderActions_GetOverviewStatus

```java

/**
 * Samples for ProviderActions GetOverviewStatus.
 */
public final class ProviderActionsGetOverviewStatusSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Reports_GetOverviewStatus.json
     */
    /**
     * Sample code: Reports_GetOverviewStatus.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void reportsGetOverviewStatus(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.providerActions().getOverviewStatusWithResponse(null, com.azure.core.util.Context.NONE);
    }
}
```

### ProviderActions_ListInUseStorageAccounts

```java

/**
 * Samples for ProviderActions ListInUseStorageAccounts.
 */
public final class ProviderActionsListInUseStorageAccountsSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/ListInUseStorageAccountsWithSubscriptions.json
     */
    /**
     * Sample code: ListInUseStorageAccountsWithSubscriptions.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void listInUseStorageAccountsWithSubscriptions(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.providerActions().listInUseStorageAccountsWithResponse(null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/ListInUseStorageAccountsWithoutSubscriptions.json
     */
    /**
     * Sample code: ListInUseStorageAccountsWithoutSubscriptions.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void listInUseStorageAccountsWithoutSubscriptions(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.providerActions().listInUseStorageAccountsWithResponse(null, com.azure.core.util.Context.NONE);
    }
}
```

### ProviderActions_Onboard

```java

/**
 * Samples for ProviderActions Onboard.
 */
public final class ProviderActionsOnboardSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Onboard.json
     */
    /**
     * Sample code: Onboard.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        onboard(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.providerActions().onboard(null, com.azure.core.util.Context.NONE);
    }
}
```

### ProviderActions_TriggerEvaluation

```java

/**
 * Samples for ProviderActions TriggerEvaluation.
 */
public final class ProviderActionsTriggerEvaluationSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/TriggerEvaluation.json
     */
    /**
     * Sample code: TriggerEvaluation.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        triggerEvaluation(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.providerActions().triggerEvaluation(null, com.azure.core.util.Context.NONE);
    }
}
```

### ReportOperation_Verify

```java
/**
 * Samples for ReportOperation Verify.
 */
public final class ReportOperationVerifySamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Report_Verify.json
     */
    /**
     * Sample code: Report_Verify.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        reportVerify(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reportOperations().verify("testReport", com.azure.core.util.Context.NONE);
    }
}
```

### Reports_CreateOrUpdate

```java

/**
 * Samples for Reports CreateOrUpdate.
 */
public final class ReportsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Report_CreateOrUpdate.json
     */
    /**
     * Sample code: Report_CreateOrUpdate.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        reportCreateOrUpdate(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports().createOrUpdate("testReportName", null, com.azure.core.util.Context.NONE);
    }
}
```

### Reports_Delete

```java
/**
 * Samples for Reports Delete.
 */
public final class ReportsDeleteSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Report_Delete.json
     */
    /**
     * Sample code: Report_Delete.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        reportDelete(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports().delete("testReportName", com.azure.core.util.Context.NONE);
    }
}
```

### Reports_Fix

```java
/**
 * Samples for Reports Fix.
 */
public final class ReportsFixSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Report_Fix.json
     */
    /**
     * Sample code: Report_Fix.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        reportFix(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports().fix("testReport", com.azure.core.util.Context.NONE);
    }
}
```

### Reports_Get

```java
/**
 * Samples for Reports Get.
 */
public final class ReportsGetSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Report_Get.json
     */
    /**
     * Sample code: Report_Get.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        reportGet(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports().getWithResponse("testReport", com.azure.core.util.Context.NONE);
    }
}
```

### Reports_List

```java
/**
 * Samples for Reports List.
 */
public final class ReportsListSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Reports_List.json
     */
    /**
     * Sample code: Reports_List.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        reportsList(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports()
            .list("1", 100, null, null, null, "00000000-0000-0000-0000-000000000000",
                "00000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
```

### Reports_NestedResourceCheckNameAvailability

```java

/**
 * Samples for Reports NestedResourceCheckNameAvailability.
 */
public final class ReportsNestedResourceCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Reports_NestedResourceCheckNameAvailability_Reports_Webhook_Check_Name_Availability.json
     */
    /**
     * Sample code: Reports_WebhookCheckNameAvailability.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void reportsWebhookCheckNameAvailability(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports()
            .nestedResourceCheckNameAvailabilityWithResponse("reportABC", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Reports_NestedResourceCheckNameAvailability_Reports_Snapshot_Check_Name_Availability.json
     */
    /**
     * Sample code: Reports_SnapshotCheckNameAvailability.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void reportsSnapshotCheckNameAvailability(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports()
            .nestedResourceCheckNameAvailabilityWithResponse("reportABC", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Reports_NestedResourceCheckNameAvailability_Reports_Evidence_Check_Name_Availability.json
     */
    /**
     * Sample code: Reports_EvidenceCheckNameAvailability.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void reportsEvidenceCheckNameAvailability(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports()
            .nestedResourceCheckNameAvailabilityWithResponse("reportABC", null, com.azure.core.util.Context.NONE);
    }
}
```

### Reports_SyncCertRecord

```java

/**
 * Samples for Reports SyncCertRecord.
 */
public final class ReportsSyncCertRecordSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Reports_SyncCertRecord.json
     */
    /**
     * Sample code: Reports_SyncCertRecord.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void reportsSyncCertRecord(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports().syncCertRecord("testReportName", null, com.azure.core.util.Context.NONE);
    }
}
```

### Reports_Update

```java

/**
 * Samples for Reports Update.
 */
public final class ReportsUpdateSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Report_Update.json
     */
    /**
     * Sample code: Report_Update.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        reportUpdate(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.reports().update("testReportName", null, com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_GetScopingQuestions

```java
/**
 * Samples for ResourceProvider GetScopingQuestions.
 */
public final class ResourceProviderGetScopingQuestionsSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/ScopingQuestions.json
     */
    /**
     * Sample code: GetScopingQuestions.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        getScopingQuestions(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.resourceProviders().getScopingQuestionsWithResponse("testReportName", com.azure.core.util.Context.NONE);
    }
}
```

### ScopingConfigurationOperation_CreateOrUpdate

```java

/**
 * Samples for ScopingConfigurationOperation CreateOrUpdate.
 */
public final class ScopingConfigurationOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/ScopingConfiguration_CreateOrUpdate.json
     */
    /**
     * Sample code: ScopingConfiguration_CreateOrUpdate.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void scopingConfigurationCreateOrUpdate(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.scopingConfigurationOperations()
            .createOrUpdateWithResponse("testReportName", "default", null, com.azure.core.util.Context.NONE);
    }
}
```

### ScopingConfigurationOperation_Delete

```java
/**
 * Samples for ScopingConfigurationOperation Delete.
 */
public final class ScopingConfigurationOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/ScopingConfiguration_Delete.json
     */
    /**
     * Sample code: ScopingConfiguration_Delete.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void scopingConfigurationDelete(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.scopingConfigurationOperations()
            .deleteByResourceGroupWithResponse("testReportName", "default", com.azure.core.util.Context.NONE);
    }
}
```

### ScopingConfigurationOperation_Get

```java
/**
 * Samples for ScopingConfigurationOperation Get.
 */
public final class ScopingConfigurationOperationGetSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/ScopingConfiguration_Get.json
     */
    /**
     * Sample code: ScopingConfiguration.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        scopingConfiguration(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.scopingConfigurationOperations()
            .getWithResponse("testReportName", "default", com.azure.core.util.Context.NONE);
    }
}
```

### ScopingConfigurations_List

```java
/**
 * Samples for ScopingConfigurations List.
 */
public final class ScopingConfigurationsListSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/ScopingConfigurations_List.json
     */
    /**
     * Sample code: ScopingConfigurations_List.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void scopingConfigurationsList(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.scopingConfigurations().list("testReportName", com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_Download

```java

/**
 * Samples for Snapshots Download.
 */
public final class SnapshotsDownloadSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Snapshots_Download_Snapshot_Download_Compliance_Report.json
     */
    /**
     * Sample code: Snapshot_Download_ComplianceReport.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void snapshotDownloadComplianceReport(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.snapshots().download("testReportName", "testSnapshotName", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Snapshots_Download_Snapshot_Download_Resource_List.json
     */
    /**
     * Sample code: Snapshot_Download_ResourceList.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void snapshotDownloadResourceList(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.snapshots().download("testReportName", "testSnapshotName", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Snapshots_Download_Snapshot_Download_Compliance_Detailed_Pdf_Report.json
     */
    /**
     * Sample code: Snapshot_Download_ComplianceDetailedPdfReport.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void snapshotDownloadComplianceDetailedPdfReport(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.snapshots().download("testReportName", "testSnapshotName", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Snapshots_Download_Snapshot_Download_Compliance_Pdf_Report.json
     */
    /**
     * Sample code: Snapshot_Download_CompliancePdfReport.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void snapshotDownloadCompliancePdfReport(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.snapshots().download("testReportName", "testSnapshotName", null, com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_Get

```java
/**
 * Samples for Snapshots Get.
 */
public final class SnapshotsGetSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Snapshots_Get.json
     */
    /**
     * Sample code: Snapshot_Get.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        snapshotGet(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.snapshots().getWithResponse("testReportName", "testSnapshot", com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_List

```java
/**
 * Samples for Snapshots List.
 */
public final class SnapshotsListSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Snapshots_List.json
     */
    /**
     * Sample code: Snapshots_List.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        snapshotsList(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.snapshots()
            .list("testReportName", "1", 100, null, null, null, "00000000-0000-0000-0000-000000000001",
                "00000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
```

### Webhooks_CreateOrUpdate

```java

/**
 * Samples for Webhooks CreateOrUpdate.
 */
public final class WebhooksCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Webhooks_CreateOrUpdate.json
     */
    /**
     * Sample code: Webhook_CreateOrUpdate.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void webhookCreateOrUpdate(
        com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.webhooks()
            .createOrUpdateWithResponse("testReportName", "testWebhookName", null, com.azure.core.util.Context.NONE);
    }
}
```

### Webhooks_Delete

```java
/**
 * Samples for Webhooks Delete.
 */
public final class WebhooksDeleteSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Webhooks_Delete.json
     */
    /**
     * Sample code: Webhook_Delete.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        webhookDelete(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.webhooks()
            .deleteByResourceGroupWithResponse("testReportName", "testWebhookName", com.azure.core.util.Context.NONE);
    }
}
```

### Webhooks_Get

```java
/**
 * Samples for Webhooks Get.
 */
public final class WebhooksGetSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Webhooks_Get.json
     */
    /**
     * Sample code: Webhook_Get.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        webhookGet(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.webhooks().getWithResponse("testReportName", "testWebhookName", com.azure.core.util.Context.NONE);
    }
}
```

### Webhooks_List

```java
/**
 * Samples for Webhooks List.
 */
public final class WebhooksListSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Webhooks_List.json
     */
    /**
     * Sample code: Webhooks_List.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        webhooksList(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.webhooks()
            .list("testReportName", "1", 100, null, null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Webhooks_Update

```java

/**
 * Samples for Webhooks Update.
 */
public final class WebhooksUpdateSamples {
    /*
     * x-ms-original-file: specification/appcomplianceautomation/resource-manager/Microsoft.AppComplianceAutomation/stable/2024-06-27/examples/Webhooks_Update.json
     */
    /**
     * Sample code: Webhook_Update.
     * 
     * @param manager Entry point to AppComplianceAutomationManager.
     */
    public static void
        webhookUpdate(com.azure.resourcemanager.appcomplianceautomation.AppComplianceAutomationManager manager) {
        manager.webhooks()
            .updateWithResponse("testReportName", "testWebhookName", null, com.azure.core.util.Context.NONE);
    }
}
```

