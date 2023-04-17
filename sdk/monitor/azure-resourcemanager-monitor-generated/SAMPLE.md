# Code snippets and samples


## ResourceProvider

- [CreateNotificationsAtTenantActionGroupResourceLevel](#resourceprovider_createnotificationsattenantactiongroupresourcelevel)
- [GetTestNotificationsAtTenantActionGroupResourceLevel](#resourceprovider_gettestnotificationsattenantactiongroupresourcelevel)

## TenantActionGroups

- [CreateOrUpdate](#tenantactiongroups_createorupdate)
- [Delete](#tenantactiongroups_delete)
- [Get](#tenantactiongroups_get)
- [ListByManagementGroupId](#tenantactiongroups_listbymanagementgroupid)
- [Update](#tenantactiongroups_update)
### ResourceProvider_CreateNotificationsAtTenantActionGroupResourceLevel

```java
import com.azure.resourcemanager.monitor.generated.models.AzureAppPushReceiver;
import com.azure.resourcemanager.monitor.generated.models.EmailReceiver;
import com.azure.resourcemanager.monitor.generated.models.SmsReceiver;
import com.azure.resourcemanager.monitor.generated.models.TenantNotificationRequestBody;
import com.azure.resourcemanager.monitor.generated.models.VoiceReceiver;
import com.azure.resourcemanager.monitor.generated.models.WebhookReceiver;
import java.util.Arrays;

/** Samples for ResourceProvider CreateNotificationsAtTenantActionGroupResourceLevel. */
public final class ResourceProviderCreateNotificationsAtTenantActionGroupResourceLevelSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2023-05-01-preview/examples/postTestNotificationsAtTenantActionGroupResourceLevel.json
     */
    /**
     * Sample code: Create notifications at tenant action group level.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void createNotificationsAtTenantActionGroupLevel(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .resourceProviders()
            .createNotificationsAtTenantActionGroupResourceLevel(
                "11111111-1111-1111-1111-111111111111",
                "testTenantActionGroup",
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                new TenantNotificationRequestBody()
                    .withAlertType("servicehealth")
                    .withEmailReceivers(
                        Arrays
                            .asList(
                                new EmailReceiver()
                                    .withName("John Doe's email")
                                    .withEmailAddress("johndoe@email.com")
                                    .withUseCommonAlertSchema(false),
                                new EmailReceiver()
                                    .withName("Jane Smith's email")
                                    .withEmailAddress("janesmith@email.com")
                                    .withUseCommonAlertSchema(true)))
                    .withSmsReceivers(
                        Arrays
                            .asList(
                                new SmsReceiver()
                                    .withName("John Doe's mobile")
                                    .withCountryCode("fakeTokenPlaceholder")
                                    .withPhoneNumber("1234567890"),
                                new SmsReceiver()
                                    .withName("Jane Smith's mobile")
                                    .withCountryCode("fakeTokenPlaceholder")
                                    .withPhoneNumber("0987654321")))
                    .withWebhookReceivers(
                        Arrays
                            .asList(
                                new WebhookReceiver()
                                    .withName("Sample webhook 1")
                                    .withServiceUri("http://www.example.com/webhook1")
                                    .withUseCommonAlertSchema(true),
                                new WebhookReceiver()
                                    .withName("Sample webhook 2")
                                    .withServiceUri("http://www.example.com/webhook2")
                                    .withUseCommonAlertSchema(true)
                                    .withUseAadAuth(true)
                                    .withObjectId("d3bb868c-fe44-452c-aa26-769a6538c808")
                                    .withIdentifierUri("http://someidentifier/d7811ba3-7996-4a93-99b6-6b2f3f355f8a")
                                    .withTenantId("68a4459a-ccb8-493c-b9da-dd30457d1b84")))
                    .withAzureAppPushReceivers(
                        Arrays
                            .asList(
                                new AzureAppPushReceiver()
                                    .withName("Sample azureAppPush")
                                    .withEmailAddress("johndoe@email.com")))
                    .withVoiceReceivers(
                        Arrays
                            .asList(
                                new VoiceReceiver()
                                    .withName("Sample voice")
                                    .withCountryCode("fakeTokenPlaceholder")
                                    .withPhoneNumber("1234567890"))),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_GetTestNotificationsAtTenantActionGroupResourceLevel

```java
/** Samples for ResourceProvider GetTestNotificationsAtTenantActionGroupResourceLevel. */
public final class ResourceProviderGetTestNotificationsAtTenantActionGroupResourceLevelSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2023-05-01-preview/examples/getTestNotificationsAtTenantActionGroupResourceLevel.json
     */
    /**
     * Sample code: Get notification details at tenant action group level.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void getNotificationDetailsAtTenantActionGroupLevel(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .resourceProviders()
            .getTestNotificationsAtTenantActionGroupResourceLevelWithResponse(
                "11111111-1111-1111-1111-111111111111",
                "testTenantActionGroup",
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                "11000222191287",
                com.azure.core.util.Context.NONE);
    }
}
```

### TenantActionGroups_CreateOrUpdate

```java
import com.azure.resourcemanager.monitor.generated.fluent.models.TenantActionGroupResourceInner;
import com.azure.resourcemanager.monitor.generated.models.AzureAppPushReceiver;
import com.azure.resourcemanager.monitor.generated.models.EmailReceiver;
import com.azure.resourcemanager.monitor.generated.models.SmsReceiver;
import com.azure.resourcemanager.monitor.generated.models.VoiceReceiver;
import com.azure.resourcemanager.monitor.generated.models.WebhookReceiver;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for TenantActionGroups CreateOrUpdate. */
public final class TenantActionGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2023-05-01-preview/examples/createOrUpdateTenantActionGroup.json
     */
    /**
     * Sample code: Create or update a tenant action group.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void createOrUpdateATenantActionGroup(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .tenantActionGroups()
            .createOrUpdateWithResponse(
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                "testTenantActionGroup",
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                new TenantActionGroupResourceInner()
                    .withLocation("Global")
                    .withTags(mapOf())
                    .withGroupShortName("sample")
                    .withEnabled(true)
                    .withEmailReceivers(
                        Arrays
                            .asList(
                                new EmailReceiver()
                                    .withName("John Doe's email")
                                    .withEmailAddress("johndoe@email.com")
                                    .withUseCommonAlertSchema(false),
                                new EmailReceiver()
                                    .withName("Jane Smith's email")
                                    .withEmailAddress("janesmith@email.com")
                                    .withUseCommonAlertSchema(true)))
                    .withSmsReceivers(
                        Arrays
                            .asList(
                                new SmsReceiver()
                                    .withName("John Doe's mobile")
                                    .withCountryCode("fakeTokenPlaceholder")
                                    .withPhoneNumber("2062022299"),
                                new SmsReceiver()
                                    .withName("Jane Smith's mobile")
                                    .withCountryCode("fakeTokenPlaceholder")
                                    .withPhoneNumber("0987654321")))
                    .withWebhookReceivers(
                        Arrays
                            .asList(
                                new WebhookReceiver()
                                    .withName("Sample webhook 1")
                                    .withServiceUri("http://www.example.com/webhook1")
                                    .withUseCommonAlertSchema(true),
                                new WebhookReceiver()
                                    .withName("Sample webhook 2")
                                    .withServiceUri("http://www.example.com/webhook2")
                                    .withUseCommonAlertSchema(true)
                                    .withUseAadAuth(true)
                                    .withObjectId("d3bb868c-fe44-452c-aa26-769a6538c808")
                                    .withIdentifierUri("http://someidentifier/d7811ba3-7996-4a93-99b6-6b2f3f355f8a")
                                    .withTenantId("68a4459a-ccb8-493c-b9da-dd30457d1b84")))
                    .withAzureAppPushReceivers(
                        Arrays
                            .asList(
                                new AzureAppPushReceiver()
                                    .withName("Sample azureAppPush")
                                    .withEmailAddress("johndoe@email.com")))
                    .withVoiceReceivers(
                        Arrays
                            .asList(
                                new VoiceReceiver()
                                    .withName("Sample voice")
                                    .withCountryCode("fakeTokenPlaceholder")
                                    .withPhoneNumber("2062022299"))),
                com.azure.core.util.Context.NONE);
    }

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

### TenantActionGroups_Delete

```java
/** Samples for TenantActionGroups Delete. */
public final class TenantActionGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2023-05-01-preview/examples/deleteTenantActionGroup.json
     */
    /**
     * Sample code: Delete a tenant action group.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void deleteATenantActionGroup(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .tenantActionGroups()
            .deleteWithResponse(
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                "testTenantActionGroup",
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                com.azure.core.util.Context.NONE);
    }
}
```

### TenantActionGroups_Get

```java
/** Samples for TenantActionGroups Get. */
public final class TenantActionGroupsGetSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2023-05-01-preview/examples/getTenantActionGroup.json
     */
    /**
     * Sample code: Get an action group.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void getAnActionGroup(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .tenantActionGroups()
            .getWithResponse(
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                "testTenantActionGroup",
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                com.azure.core.util.Context.NONE);
    }
}
```

### TenantActionGroups_ListByManagementGroupId

```java
/** Samples for TenantActionGroups ListByManagementGroupId. */
public final class TenantActionGroupsListByManagementGroupIdSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2023-05-01-preview/examples/listTenantActionGroups.json
     */
    /**
     * Sample code: List tenant action groups at management group level.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void listTenantActionGroupsAtManagementGroupLevel(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .tenantActionGroups()
            .listByManagementGroupId(
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                com.azure.core.util.Context.NONE);
    }
}
```

### TenantActionGroups_Update

```java
import com.azure.resourcemanager.monitor.generated.models.ActionGroupPatchBody;
import java.util.HashMap;
import java.util.Map;

/** Samples for TenantActionGroups Update. */
public final class TenantActionGroupsUpdateSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/preview/2023-05-01-preview/examples/patchTenantActionGroup.json
     */
    /**
     * Sample code: Patch a tenant action group.
     *
     * @param manager Entry point to MonitorManager.
     */
    public static void patchATenantActionGroup(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager
            .tenantActionGroups()
            .updateWithResponse(
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                "testTenantActionGroup",
                "72f988bf-86f1-41af-91ab-2d7cd011db47",
                new ActionGroupPatchBody().withTags(mapOf("key1", "value1", "key2", "value2")).withEnabled(false),
                com.azure.core.util.Context.NONE);
    }

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

