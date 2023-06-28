# Code snippets and samples


## DiagnosticSettings

- [CreateOrUpdate](#diagnosticsettings_createorupdate)
- [Delete](#diagnosticsettings_delete)
- [Get](#diagnosticsettings_get)
- [List](#diagnosticsettings_list)

## DiagnosticSettingsCategory

- [List](#diagnosticsettingscategory_list)

## Operations

- [List](#operations_list)
### DiagnosticSettings_CreateOrUpdate

```java
import com.azure.resourcemanager.intelligentdataexperiences.fluent.models.DiagnosticSettingsResourceInner;
import com.azure.resourcemanager.intelligentdataexperiences.models.Category;
import com.azure.resourcemanager.intelligentdataexperiences.models.LogSettings;
import com.azure.resourcemanager.intelligentdataexperiences.models.RetentionPolicy;
import java.util.Arrays;

/** Samples for DiagnosticSettings CreateOrUpdate. */
public final class DiagnosticSettingsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/intelligentdataexperiences/resource-manager/Microsoft.AadCustomSecurityAttributesDiagnosticSettings/preview/2017-04-01-preview/examples/createOrUpdateDiagnosticSetting.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to IntelligentdataexperiencesManager.
     */
    public static void batchAccountDelete(
        com.azure.resourcemanager.intelligentdataexperiences.IntelligentdataexperiencesManager manager) {
        manager
            .diagnosticSettings()
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
                                    .withCategory(Category.fromString("CustomSecurityAuditLogs"))
                                    .withEnabled(true)
                                    .withRetentionPolicy(new RetentionPolicy().withEnabled(false).withDays(0)))),
                com.azure.core.util.Context.NONE);
    }
}
```

### DiagnosticSettings_Delete

```java
/** Samples for DiagnosticSettings Delete. */
public final class DiagnosticSettingsDeleteSamples {
    /*
     * x-ms-original-file: specification/intelligentdataexperiences/resource-manager/Microsoft.AadCustomSecurityAttributesDiagnosticSettings/preview/2017-04-01-preview/examples/deleteDiagnosticSetting.json
     */
    /**
     * Sample code: Deletes the diagnostic setting.
     *
     * @param manager Entry point to IntelligentdataexperiencesManager.
     */
    public static void deletesTheDiagnosticSetting(
        com.azure.resourcemanager.intelligentdataexperiences.IntelligentdataexperiencesManager manager) {
        manager.diagnosticSettings().deleteWithResponse("mysetting", com.azure.core.util.Context.NONE);
    }
}
```

### DiagnosticSettings_Get

```java
/** Samples for DiagnosticSettings Get. */
public final class DiagnosticSettingsGetSamples {
    /*
     * x-ms-original-file: specification/intelligentdataexperiences/resource-manager/Microsoft.AadCustomSecurityAttributesDiagnosticSettings/preview/2017-04-01-preview/examples/getDiagnosticSetting.json
     */
    /**
     * Sample code: Gets the diagnostic setting.
     *
     * @param manager Entry point to IntelligentdataexperiencesManager.
     */
    public static void getsTheDiagnosticSetting(
        com.azure.resourcemanager.intelligentdataexperiences.IntelligentdataexperiencesManager manager) {
        manager.diagnosticSettings().getWithResponse("mysetting", com.azure.core.util.Context.NONE);
    }
}
```

### DiagnosticSettings_List

```java
/** Samples for DiagnosticSettings List. */
public final class DiagnosticSettingsListSamples {
    /*
     * x-ms-original-file: specification/intelligentdataexperiences/resource-manager/Microsoft.AadCustomSecurityAttributesDiagnosticSettings/preview/2017-04-01-preview/examples/listDiagnosticSettings.json
     */
    /**
     * Sample code: Gets the diagnostic settings.
     *
     * @param manager Entry point to IntelligentdataexperiencesManager.
     */
    public static void getsTheDiagnosticSettings(
        com.azure.resourcemanager.intelligentdataexperiences.IntelligentdataexperiencesManager manager) {
        manager.diagnosticSettings().listWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### DiagnosticSettingsCategory_List

```java
/** Samples for DiagnosticSettingsCategory List. */
public final class DiagnosticSettingsCategoryListSamples {
    /*
     * x-ms-original-file: specification/intelligentdataexperiences/resource-manager/Microsoft.AadCustomSecurityAttributesDiagnosticSettings/preview/2017-04-01-preview/examples/listDiagnosticSettingsCategories.json
     */
    /**
     * Sample code: Gets the diagnostic setting categories.
     *
     * @param manager Entry point to IntelligentdataexperiencesManager.
     */
    public static void getsTheDiagnosticSettingCategories(
        com.azure.resourcemanager.intelligentdataexperiences.IntelligentdataexperiencesManager manager) {
        manager.diagnosticSettingsCategories().listWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/intelligentdataexperiences/resource-manager/Microsoft.AadCustomSecurityAttributesDiagnosticSettings/preview/2017-04-01-preview/examples/listOperations.json
     */
    /**
     * Sample code: Gets the operations.
     *
     * @param manager Entry point to IntelligentdataexperiencesManager.
     */
    public static void getsTheOperations(
        com.azure.resourcemanager.intelligentdataexperiences.IntelligentdataexperiencesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

