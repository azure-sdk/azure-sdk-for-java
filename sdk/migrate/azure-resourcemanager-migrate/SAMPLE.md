# Code snippets and samples


## CompoundAssessmentOperations

- [Create](#compoundassessmentoperations_create)
- [Delete](#compoundassessmentoperations_delete)
- [DownloadUrl](#compoundassessmentoperations_downloadurl)
- [Get](#compoundassessmentoperations_get)
- [ListByParent](#compoundassessmentoperations_listbyparent)

## CompoundAssessmentSummaryOperations

- [Get](#compoundassessmentsummaryoperations_get)
- [ListByParent](#compoundassessmentsummaryoperations_listbyparent)

## Operations

- [List](#operations_list)
### CompoundAssessmentOperations_Create

```java
import com.azure.resourcemanager.migrate.models.CompoundAssessmentProperties;
import com.azure.resourcemanager.migrate.models.TargetAssessmentArmIds;

/**
 * Samples for CompoundAssessmentOperations Create.
 */
public final class CompoundAssessmentOperationsCreateSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/CompoundAssessmentOperations_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: CompoundAssessmentOperations_Create.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void compoundAssessmentOperationsCreate(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.compoundAssessmentOperations()
            .define("assessmentName")
            .withExistingAssessmentProject("rgwebAppCompoundAssessments", "contosoProject")
            .withProperties(new CompoundAssessmentProperties().withTargetAssessmentArmIds(new TargetAssessmentArmIds()
                .withAks(
                    "/subscriptions/6898488D-BBF0-40FC-A5E3-3DF2C00C5F21/resourceGroups/rgwebAppCompoundAssessments/providers/Microsoft.Migrate/assessmentprojects/contosoProject/aksAssessments/nameOfAssessment")
                .withAzureAppService(
                    "/subscriptions/6898488D-BBF0-40FC-A5E3-3DF2C00C5F21/resourceGroups/rgwebAppCompoundAssessments/providers/Microsoft.Migrate/assessmentprojects/contosoProject/webAppAssessments/nameOfAssessment")
                .withAzureAppServiceContainer(
                    "/subscriptions/6898488D-BBF0-40FC-A5E3-3DF2C00C5F21/resourceGroups/rgwebAppCompoundAssessments/providers/Microsoft.Migrate/assessmentprojects/contosoProject/webAppAssessments/nameOfAssessment"))
                .withFallbackMachineAssessmentArmId(
                    "/subscriptions/6898488D-BBF0-40FC-A5E3-3DF2C00C5F21/resourceGroups/rgwebAppCompoundAssessments/providers/Microsoft.Migrate/assessmentprojects/contosoProject/assessments/nameOfAssessment"))
            .create();
    }
}
```

### CompoundAssessmentOperations_Delete

```java
import com.azure.resourcemanager.migrate.models.DownloadUrlRequest;

/**
 * Samples for CompoundAssessmentOperations DownloadUrl.
 */
public final class CompoundAssessmentOperationsDownloadUrlSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/CompoundAssessmentOperations_DownloadUrl_MaximumSet_Gen.json
     */
    /**
     * Sample code: CompoundAssessmentOperations_DownloadUrl.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        compoundAssessmentOperationsDownloadUrl(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.compoundAssessmentOperations()
            .downloadUrl("rgwebAppCompoundAssessments", "contosoProject", "assessmentName", new DownloadUrlRequest(),
                com.azure.core.util.Context.NONE);
    }
}
```

### CompoundAssessmentOperations_DownloadUrl

```java
/**
 * Samples for CompoundAssessmentOperations ListByParent.
 */
public final class CompoundAssessmentOperationsListByParentSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/CompoundAssessmentOperations_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: CompoundAssessmentOperations_ListByParent.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        compoundAssessmentOperationsListByParent(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.compoundAssessmentOperations()
            .listByParent("rgwebAppCompoundAssessments", "contosoProject", com.azure.core.util.Context.NONE);
    }
}
```

### CompoundAssessmentOperations_Get

```java
/**
 * Samples for CompoundAssessmentSummaryOperations ListByParent.
 */
public final class CompoundAssessmentSummaryOperationsListByParentSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/CompoundAssessmentSummaryOperations_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: CompoundAssessmentSummaryOperations_ListByParent.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        compoundAssessmentSummaryOperationsListByParent(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.compoundAssessmentSummaryOperations()
            .listByParent("rgwebAppCompoundAssessments", "contosoProject", "assessmentName",
                com.azure.core.util.Context.NONE);
    }
}
```

### CompoundAssessmentOperations_ListByParent

```java
/**
 * Samples for CompoundAssessmentOperations Get.
 */
public final class CompoundAssessmentOperationsGetSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/CompoundAssessmentOperations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: CompoundAssessmentOperations_Get.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void compoundAssessmentOperationsGet(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.compoundAssessmentOperations()
            .getWithResponse("rgwebAppCompoundAssessments", "contosoProject", "assessmentName",
                com.azure.core.util.Context.NONE);
    }
}
```

### CompoundAssessmentSummaryOperations_Get

```java
/**
 * Samples for CompoundAssessmentSummaryOperations Get.
 */
public final class CompoundAssessmentSummaryOperationsGetSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/CompoundAssessmentSummaryOperations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: CompoundAssessmentSummaryOperations_Get.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void
        compoundAssessmentSummaryOperationsGet(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.compoundAssessmentSummaryOperations()
            .getWithResponse("rgwebAppCompoundAssessments", "contosoProject", "assessmentName", "Modernize",
                com.azure.core.util.Context.NONE);
    }
}
```

### CompoundAssessmentSummaryOperations_ListByParent

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

### Operations_List

```java
/**
 * Samples for CompoundAssessmentOperations Delete.
 */
public final class CompoundAssessmentOperationsDeleteSamples {
    /*
     * x-ms-original-file: 2024-03-03-preview/CompoundAssessmentOperations_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: CompoundAssessmentOperations_Delete.
     * 
     * @param manager Entry point to MigrateManager.
     */
    public static void compoundAssessmentOperationsDelete(com.azure.resourcemanager.migrate.MigrateManager manager) {
        manager.compoundAssessmentOperations()
            .deleteWithResponse("rgwebAppCompoundAssessments", "contosoProject", "assessmentName",
                com.azure.core.util.Context.NONE);
    }
}
```

