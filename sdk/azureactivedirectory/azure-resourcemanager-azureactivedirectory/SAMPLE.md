# Code snippets and samples


## DiagnosticSettingsCategory

- [List](#diagnosticsettingscategory_list)

## DiagnosticSettingsOperation

- [CreateOrUpdate](#diagnosticsettingsoperation_createorupdate)
- [Delete](#diagnosticsettingsoperation_delete)
- [Get](#diagnosticsettingsoperation_get)
- [List](#diagnosticsettingsoperation_list)

## Operations

- [List](#operations_list)
### DiagnosticSettingsCategory_List

```java
import com.azure.core.util.Context;

/** Samples for DiagnosticSettingsCategory List. */
public final class DiagnosticSettingsCategoryListSamples {
    /*
     * x-ms-original-file: specification/azureactivedirectory/resource-manager/Microsoft.Aadiam/preview/2017-04-01-preview/examples/listDiagnosticSettingsCategories.json
     */
    /**
     * Sample code: Gets the diagnostic setting categories.
     *
     * @param manager Entry point to AzureactivedirectoryManager.
     */
    public static void getsTheDiagnosticSettingCategories(
        com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager manager) {
        manager.diagnosticSettingsCategories().listWithResponse(Context.NONE);
    }
}
```

### DiagnosticSettingsOperation_CreateOrUpdate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.azureactivedirectory.fluent.models.DiagnosticSettingsResourceInner;
import com.azure.resourcemanager.azureactivedirectory.models.Category;
import com.azure.resourcemanager.azureactivedirectory.models.LogSettings;
import com.azure.resourcemanager.azureactivedirectory.models.RetentionPolicy;
import java.util.Arrays;

/** Samples for DiagnosticSettingsOperation CreateOrUpdate. */
public final class DiagnosticSettingsOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/azureactivedirectory/resource-manager/Microsoft.Aadiam/preview/2017-04-01-preview/examples/createOrUpdateDiagnosticSetting.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to AzureactivedirectoryManager.
     */
    public static void batchAccountDelete(
        com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager manager) {
        manager
            .diagnosticSettingsOperations()
            .createOrUpdateWithResponse(
                "mysetting",
                new DiagnosticSettingsResourceInner()
                    .withStorageAccountId(
                        "/subscriptions/df602c9c-7aa0-407d-a6fb-eb20c8bd1192/resourceGroups/apptest/providers/Microsoft.Storage/storageAccounts/appteststorage1")
                    .withWorkspaceId("")
                    .withEventHubAuthorizationRuleId(
                        "/subscriptions/1a66ce04-b633-4a0b-b2bc-a912ec8986a6/resourceGroups/montest/providers/microsoft.eventhub/namespaces/mynamespace/eventhubs/myeventhub/authorizationrules/myrule")
                    .withEventHubName("myeventhub")
                    .withLogs(
                        Arrays
                            .asList(
                                new LogSettings()
                                    .withCategory(Category.AUDIT_LOGS)
                                    .withEnabled(true)
                                    .withRetentionPolicy(new RetentionPolicy().withEnabled(false).withDays(0)))),
                Context.NONE);
    }
}
```

### DiagnosticSettingsOperation_Delete

```java
import com.azure.core.util.Context;

/** Samples for DiagnosticSettingsOperation Delete. */
public final class DiagnosticSettingsOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/azureactivedirectory/resource-manager/Microsoft.Aadiam/preview/2017-04-01-preview/examples/deleteDiagnosticSetting.json
     */
    /**
     * Sample code: Deletes the diagnostic setting.
     *
     * @param manager Entry point to AzureactivedirectoryManager.
     */
    public static void deletesTheDiagnosticSetting(
        com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager manager) {
        manager.diagnosticSettingsOperations().deleteWithResponse("mysetting", Context.NONE);
    }
}
```

### DiagnosticSettingsOperation_Get

```java
import com.azure.core.util.Context;

/** Samples for DiagnosticSettingsOperation Get. */
public final class DiagnosticSettingsOperationGetSamples {
    /*
     * x-ms-original-file: specification/azureactivedirectory/resource-manager/Microsoft.Aadiam/preview/2017-04-01-preview/examples/getDiagnosticSetting.json
     */
    /**
     * Sample code: Gets the diagnostic setting.
     *
     * @param manager Entry point to AzureactivedirectoryManager.
     */
    public static void getsTheDiagnosticSetting(
        com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager manager) {
        manager.diagnosticSettingsOperations().getWithResponse("mysetting", Context.NONE);
    }
}
```

### DiagnosticSettingsOperation_List

```java
import com.azure.core.util.Context;

/** Samples for DiagnosticSettingsOperation List. */
public final class DiagnosticSettingsOperationListSamples {
    /*
     * x-ms-original-file: specification/azureactivedirectory/resource-manager/Microsoft.Aadiam/preview/2017-04-01-preview/examples/listDiagnosticSettings.json
     */
    /**
     * Sample code: Gets the diagnostic settings.
     *
     * @param manager Entry point to AzureactivedirectoryManager.
     */
    public static void getsTheDiagnosticSettings(
        com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager manager) {
        manager.diagnosticSettingsOperations().listWithResponse(Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/azureactivedirectory/resource-manager/Microsoft.Aadiam/preview/2017-04-01-preview/examples/listOperations.json
     */
    /**
     * Sample code: Gets the operations.
     *
     * @param manager Entry point to AzureactivedirectoryManager.
     */
    public static void getsTheOperations(
        com.azure.resourcemanager.azureactivedirectory.AzureactivedirectoryManager manager) {
        manager.operations().listWithResponse(Context.NONE);
    }
}
```

