# Code snippets and samples


## ActionGroups

- [CreateNotificationsAtActionGroupResourceLevel](#actiongroups_createnotificationsatactiongroupresourcelevel)
- [CreateOrUpdate](#actiongroups_createorupdate)
- [Delete](#actiongroups_delete)
- [EnableReceiver](#actiongroups_enablereceiver)
- [GetByResourceGroup](#actiongroups_getbyresourcegroup)
- [GetTestNotificationsAtActionGroupResourceLevel](#actiongroups_gettestnotificationsatactiongroupresourcelevel)
- [List](#actiongroups_list)
- [ListByResourceGroup](#actiongroups_listbyresourcegroup)
- [Update](#actiongroups_update)

## ScheduledQueryRules

- [CreateOrUpdate](#scheduledqueryrules_createorupdate)
- [Delete](#scheduledqueryrules_delete)
- [GetByResourceGroup](#scheduledqueryrules_getbyresourcegroup)
- [List](#scheduledqueryrules_list)
- [ListByResourceGroup](#scheduledqueryrules_listbyresourcegroup)
- [Update](#scheduledqueryrules_update)
### ActionGroups_CreateNotificationsAtActionGroupResourceLevel

```java
import com.azure.resourcemanager.monitor.generated.models.EnableRequest;

/**
 * Samples for ActionGroups EnableReceiver.
 */
public final class ActionGroupsEnableReceiverSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2024-10-01-preview/examples/enableReceiver.json
     */
    /**
     * Sample code: Enable the receiver.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void enableTheReceiver(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.actionGroups()
            .enableReceiverWithResponse("Default-NotificationRules", "SampleActionGroup",
                new EnableRequest().withReceiverName("John Doe's mobile"), com.azure.core.util.Context.NONE);
    }
}
```

### ActionGroups_CreateOrUpdate

```java
/**
 * Samples for ScheduledQueryRules GetByResourceGroup.
 */
public final class ScheduledQueryRulesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2025-01-01-preview/examples/
     * getScheduledQueryRule.json
     */
    /**
     * Sample code: Get a scheduled query rule for single resource.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void
        getAScheduledQueryRuleForSingleResource(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.scheduledQueryRules()
            .getByResourceGroupWithResponse("QueryResourceGroupName", "perf", com.azure.core.util.Context.NONE);
    }
}
```

### ActionGroups_Delete

```java
import com.azure.resourcemanager.monitor.generated.models.ScheduledQueryRuleResource;

/**
 * Samples for ScheduledQueryRules Update.
 */
public final class ScheduledQueryRulesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2025-01-01-preview/examples/
     * patchScheduledQueryRule.json
     */
    /**
     * Sample code: Create or update a scheduled query rule.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void
        createOrUpdateAScheduledQueryRule(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        ScheduledQueryRuleResource resource = manager.scheduledQueryRules()
            .getByResourceGroupWithResponse("QueryResourceGroupName", "heartbeat", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withEnabled(false).apply();
    }
}
```

### ActionGroups_EnableReceiver

```java
/**
 * Samples for ScheduledQueryRules Delete.
 */
public final class ScheduledQueryRulesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2025-01-01-preview/examples/
     * deleteScheduledQueryRule.json
     */
    /**
     * Sample code: Delete a scheduled query rule.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void deleteAScheduledQueryRule(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.scheduledQueryRules()
            .deleteByResourceGroupWithResponse("QueryResourceGroupName", "heartbeat", com.azure.core.util.Context.NONE);
    }
}
```

### ActionGroups_GetByResourceGroup

```java
/**
 * Samples for ActionGroups ListByResourceGroup.
 */
public final class ActionGroupsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2024-10-01-preview/examples/listActionGroups.
     * json
     */
    /**
     * Sample code: List action groups at resource group level.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void
        listActionGroupsAtResourceGroupLevel(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.actionGroups().listByResourceGroup("Default-NotificationRules", com.azure.core.util.Context.NONE);
    }
}
```

### ActionGroups_GetTestNotificationsAtActionGroupResourceLevel

```java
/**
 * Samples for ScheduledQueryRules List.
 */
public final class ScheduledQueryRulesListSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2025-01-01-preview/examples/
     * listScheduledQueryRulesBySubscription.json
     */
    /**
     * Sample code: List scheduled query rules by subscription.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void
        listScheduledQueryRulesBySubscription(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.scheduledQueryRules().list(com.azure.core.util.Context.NONE);
    }
}
```

### ActionGroups_List

```java
import com.azure.resourcemanager.monitor.generated.models.ArmRoleReceiver;
import com.azure.resourcemanager.monitor.generated.models.AutomationRunbookReceiver;
import com.azure.resourcemanager.monitor.generated.models.AzureAppPushReceiver;
import com.azure.resourcemanager.monitor.generated.models.AzureFunctionReceiver;
import com.azure.resourcemanager.monitor.generated.models.EmailReceiver;
import com.azure.resourcemanager.monitor.generated.models.EventHubReceiver;
import com.azure.resourcemanager.monitor.generated.models.IncidentManagementService;
import com.azure.resourcemanager.monitor.generated.models.IncidentReceiver;
import com.azure.resourcemanager.monitor.generated.models.IncidentServiceConnection;
import com.azure.resourcemanager.monitor.generated.models.ItsmReceiver;
import com.azure.resourcemanager.monitor.generated.models.LogicAppReceiver;
import com.azure.resourcemanager.monitor.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.monitor.generated.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.monitor.generated.models.SmsReceiver;
import com.azure.resourcemanager.monitor.generated.models.UserAssignedIdentity;
import com.azure.resourcemanager.monitor.generated.models.VoiceReceiver;
import com.azure.resourcemanager.monitor.generated.models.WebhookReceiver;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ActionGroups CreateOrUpdate.
 */
public final class ActionGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2024-10-01-preview/examples/
     * createOrUpdateActionGroup.json
     */
    /**
     * Sample code: Create or update an action group.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void createOrUpdateAnActionGroup(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.actionGroups()
            .define("SampleActionGroup")
            .withRegion("Global")
            .withExistingResourceGroup("Default-NotificationRules")
            .withTags(mapOf())
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/AzSecPackAutoConfigRG/providers/Microsoft.ManagedIdentity/userAssignedIdentities/ThomasTestManagedIdentity_123",
                    new UserAssignedIdentity(),
                    "/subscriptions/b67f7fec-69fc-4974-9099-a26bd6ffeda3/resourceGroups/AzSecPackAutoConfigRG/providers/Microsoft.ManagedIdentity/userAssignedIdentities/ThomasTestManagedIdentity_456",
                    new UserAssignedIdentity())))
            .withGroupShortName("sample")
            .withEnabled(true)
            .withEmailReceivers(Arrays.asList(
                new EmailReceiver().withName("John Doe's email")
                    .withEmailAddress("johndoe@email.com")
                    .withUseCommonAlertSchema(false),
                new EmailReceiver().withName("Jane Smith's email")
                    .withEmailAddress("janesmith@email.com")
                    .withUseCommonAlertSchema(true)))
            .withSmsReceivers(Arrays.asList(
                new SmsReceiver().withName("John Doe's mobile")
                    .withCountryCode("fakeTokenPlaceholder")
                    .withPhoneNumber("1234567890"),
                new SmsReceiver().withName("Jane Smith's mobile")
                    .withCountryCode("fakeTokenPlaceholder")
                    .withPhoneNumber("0987654321")))
            .withWebhookReceivers(Arrays.asList(
                new WebhookReceiver().withName("Sample webhook 1")
                    .withServiceUri("http://www.example.com/webhook1")
                    .withUseCommonAlertSchema(true),
                new WebhookReceiver().withName("Sample webhook 2")
                    .withServiceUri("http://www.example.com/webhook2")
                    .withUseCommonAlertSchema(true)
                    .withUseAadAuth(true)
                    .withObjectId("d3bb868c-fe44-452c-aa26-769a6538c808")
                    .withIdentifierUri("http://someidentifier/d7811ba3-7996-4a93-99b6-6b2f3f355f8a")
                    .withTenantId("68a4459a-ccb8-493c-b9da-dd30457d1b84")
                    .withManagedIdentity("30fe7a91-cd31-4edf-96ab-52883b3199cd")))
            .withItsmReceivers(Arrays.asList(new ItsmReceiver().withName("Sample itsm")
                .withWorkspaceId("5def922a-3ed4-49c1-b9fd-05ec533819a3|55dfd1f8-7e59-4f89-bf56-4c82f5ace23c")
                .withConnectionId("a3b9076c-ce8e-434e-85b4-aff10cb3c8f1")
                .withTicketConfiguration(
                    "{\"PayloadRevision\":0,\"WorkItemType\":\"Incident\",\"UseTemplate\":false,\"WorkItemData\":\"{}\",\"CreateOneWIPerCI\":false}")
                .withRegion("westcentralus")))
            .withAzureAppPushReceivers(Arrays.asList(
                new AzureAppPushReceiver().withName("Sample azureAppPush").withEmailAddress("johndoe@email.com")))
            .withAutomationRunbookReceivers(Arrays.asList(new AutomationRunbookReceiver().withAutomationAccountId(
                "/subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/runbookTest/providers/Microsoft.Automation/automationAccounts/runbooktest")
                .withRunbookName("Sample runbook")
                .withWebhookResourceId(
                    "/subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/runbookTest/providers/Microsoft.Automation/automationAccounts/runbooktest/webhooks/Alert1510184037084")
                .withIsGlobalRunbook(false)
                .withName("testRunbook")
                .withServiceUri("<serviceUri>")
                .withUseCommonAlertSchema(true)
                .withManagedIdentity("30fe7a91-cd31-4edf-96ab-52883b3199cd")))
            .withVoiceReceivers(Arrays.asList(new VoiceReceiver().withName("Sample voice")
                .withCountryCode("fakeTokenPlaceholder")
                .withPhoneNumber("1234567890")))
            .withLogicAppReceivers(Arrays.asList(new LogicAppReceiver().withName("Sample logicApp")
                .withResourceId(
                    "/subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/LogicApp/providers/Microsoft.Logic/workflows/testLogicApp")
                .withCallbackUrl(
                    "https://prod-27.northcentralus.logic.azure.com/workflows/68e572e818e5457ba898763b7db90877/triggers/manual/paths/invoke/azns/test?api-version=2016-10-01&sp=%2Ftriggers%2Fmanual%2Frun&sv=1.0&sig=Abpsb72UYJxPPvmDo937uzofupO5r_vIeWEx7KVHo7w")
                .withUseCommonAlertSchema(false)
                .withManagedIdentity("30fe7a91-cd31-4edf-96ab-52883b3199cd")))
            .withAzureFunctionReceivers(Arrays.asList(new AzureFunctionReceiver().withName("Sample azureFunction")
                .withFunctionAppResourceId(
                    "/subscriptions/5def922a-3ed4-49c1-b9fd-05ec533819a3/resourceGroups/aznsTest/providers/Microsoft.Web/sites/testFunctionApp")
                .withFunctionName("HttpTriggerCSharp1")
                .withHttpTriggerUrl("http://test.me")
                .withUseCommonAlertSchema(true)
                .withManagedIdentity("30fe7a91-cd31-4edf-96ab-52883b3199cd")))
            .withArmRoleReceivers(Arrays.asList(new ArmRoleReceiver().withName("Sample armRole")
                .withRoleId("8e3af657-a8ff-443c-a75c-2fe8c4bcb635")
                .withUseCommonAlertSchema(true)))
            .withEventHubReceivers(Arrays.asList(new EventHubReceiver().withName("Sample eventHub")
                .withEventHubNameSpace("testEventHubNameSpace")
                .withEventHubName("testEventHub")
                .withTenantId("68a4459a-ccb8-493c-b9da-dd30457d1b84")
                .withSubscriptionId("187f412d-1758-44d9-b052-169e2564721d")
                .withManagedIdentity("30fe7a91-cd31-4edf-96ab-52883b3199cd")))
            .withIncidentReceivers(Arrays.asList(new IncidentReceiver().withName("IncidentAction")
                .withConnection(new IncidentServiceConnection().withName("IncidentConnection")
                    .withId("8be638e7-1419-42d4-a059-437a5f4f4e4e"))
                .withIncidentManagementService(IncidentManagementService.ICM)
                .withMappings(mapOf("icm.automitigationenabled", "true", "icm.correlationid",
                    "${data.essentials.signalType}://${data.essentials.originAlertId}", "icm.monitorid",
                    "${data.essentials.alertRule}", "icm.occurringlocation.environment", "PROD", "icm.routingid",
                    "${data.essentials.monitoringService}://${data.essentials.signalType}", "icm.title",
                    "${data.essentials.severity}:${data.essentials.monitorCondition} ${data.essentials.monitoringService}:${data.essentials.signalType} ${data.essentials.alertTargetIds}",
                    "icm.tsgid", "https://microsoft.com"))))
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

### ActionGroups_ListByResourceGroup

```java
/**
 * Samples for ActionGroups GetTestNotificationsAtActionGroupResourceLevel.
 */
public final class ActionGroupsGetTestNotificationsAtActionGroupResourceLevelSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2024-10-01-preview/examples/
     * getTestNotificationsAtActionGroupResourceLevel.json
     */
    /**
     * Sample code: Get notification details at resource group level.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void
        getNotificationDetailsAtResourceGroupLevel(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.actionGroups()
            .getTestNotificationsAtActionGroupResourceLevelWithResponse("TestRgName", "TestAgName", "11000222191287",
                com.azure.core.util.Context.NONE);
    }
}
```

### ActionGroups_Update

```java
/**
 * Samples for ActionGroups List.
 */
public final class ActionGroupsListSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2024-10-01-preview/examples/listActionGroups.
     * json
     */
    /**
     * Sample code: List action groups at subscription level.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void
        listActionGroupsAtSubscriptionLevel(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.actionGroups().list(com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledQueryRules_CreateOrUpdate

```java
import com.azure.resourcemanager.monitor.generated.models.Actions;
import com.azure.resourcemanager.monitor.generated.models.AlertSeverity;
import com.azure.resourcemanager.monitor.generated.models.Condition;
import com.azure.resourcemanager.monitor.generated.models.ConditionFailingPeriods;
import com.azure.resourcemanager.monitor.generated.models.ConditionOperator;
import com.azure.resourcemanager.monitor.generated.models.CriterionType;
import com.azure.resourcemanager.monitor.generated.models.Dimension;
import com.azure.resourcemanager.monitor.generated.models.DimensionOperator;
import com.azure.resourcemanager.monitor.generated.models.Kind;
import com.azure.resourcemanager.monitor.generated.models.RuleResolveConfiguration;
import com.azure.resourcemanager.monitor.generated.models.ScheduledQueryRuleCriteria;
import com.azure.resourcemanager.monitor.generated.models.TimeAggregation;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ScheduledQueryRules CreateOrUpdate.
 */
public final class ScheduledQueryRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2025-01-01-preview/examples/
     * createOrUpdateSimpleLogAlertScheduledQueryRule.json
     */
    /**
     * Sample code: Create or update a simple log alert scheduled query rule on Subscription.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void createOrUpdateASimpleLogAlertScheduledQueryRuleOnSubscription(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.scheduledQueryRules()
            .define("perf")
            .withRegion("eastus")
            .withExistingResourceGroup("QueryResourceGroupName")
            .withKind(Kind.SIMPLE_LOG_ALERT)
            .withDescription("Performance rule")
            .withSeverity(AlertSeverity.FOUR)
            .withEnabled(true)
            .withScopes(Arrays.asList(
                "/subscriptions/aaf177ed-1330-a9f2-80ea-fd3d7783b147/resourceGroups/scopeResourceGroup1/providers/Microsoft.Compute/virtualMachines/vm1"))
            .withCriteria(new ScheduledQueryRuleCriteria()
                .withAllOf(Arrays.asList(new Condition().withQuery("Perf | where ObjectName == \"Processor\""))))
            .withActions(new Actions().withActionGroups(Arrays.asList(
                "/subscriptions/1cf177ed-1330-4692-80ea-fd3d7783b147/resourcegroups/sqrapi/providers/microsoft.insights/actiongroups/myactiongroup"))
                .withCustomProperties(mapOf("key11", "fakeTokenPlaceholder", "key12", "fakeTokenPlaceholder"))
                .withActionProperties(mapOf("Icm.Title", "Custom title in ICM", "Icm.TsgId", "https://tsg.url")))
            .withCheckWorkspaceAlertsStorageConfigured(true)
            .withSkipQueryValidation(true)
            .withAutoMitigate(false)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2025-01-01-preview/examples/
     * createOrUpdateScheduledQueryRuleSubscription.json
     */
    /**
     * Sample code: Create or update a scheduled query rule on Subscription.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void createOrUpdateAScheduledQueryRuleOnSubscription(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.scheduledQueryRules()
            .define("perf")
            .withRegion("eastus")
            .withExistingResourceGroup("QueryResourceGroupName")
            .withDescription("Performance rule")
            .withSeverity(AlertSeverity.FOUR)
            .withEnabled(true)
            .withScopes(Arrays.asList("/subscriptions/aaf177ed-1330-a9f2-80ea-fd3d7783b147"))
            .withEvaluationFrequency(Duration.parse("PT5M"))
            .withWindowSize(Duration.parse("PT10M"))
            .withTargetResourceTypes(Arrays.asList("Microsoft.Compute/virtualMachines"))
            .withCriteria(new ScheduledQueryRuleCriteria()
                .withAllOf(Arrays.asList(new Condition().withQuery("Perf | where ObjectName == \"Processor\"")
                    .withTimeAggregation(TimeAggregation.AVERAGE)
                    .withMetricMeasureColumn("% Processor Time")
                    .withResourceIdColumn("resourceId")
                    .withDimensions(Arrays.asList(
                        new Dimension().withName("ComputerIp")
                            .withOperator(DimensionOperator.EXCLUDE)
                            .withValues(Arrays.asList("192.168.1.1")),
                        new Dimension().withName("OSType")
                            .withOperator(DimensionOperator.INCLUDE)
                            .withValues(Arrays.asList("*"))))
                    .withOperator(ConditionOperator.GREATER_THAN)
                    .withThreshold(70.0D)
                    .withFailingPeriods(new ConditionFailingPeriods().withNumberOfEvaluationPeriods(1L)
                        .withMinFailingPeriodsToAlert(1L)))))
            .withMuteActionsDuration(Duration.parse("PT30M"))
            .withActions(new Actions().withActionGroups(Arrays.asList(
                "/subscriptions/1cf177ed-1330-4692-80ea-fd3d7783b147/resourcegroups/sqrapi/providers/microsoft.insights/actiongroups/myactiongroup"))
                .withCustomProperties(mapOf("key11", "fakeTokenPlaceholder", "key12", "fakeTokenPlaceholder"))
                .withActionProperties(mapOf("Icm.Title", "Custom title in ICM", "Icm.TsgId", "https://tsg.url")))
            .withCheckWorkspaceAlertsStorageConfigured(true)
            .withSkipQueryValidation(true)
            .withResolveConfiguration(
                new RuleResolveConfiguration().withAutoResolved(true).withTimeToResolve(Duration.parse("PT10M")))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2025-01-01-preview/examples/
     * createOrUpdateScheduledQueryRuleResourceGroup.json
     */
    /**
     * Sample code: Create or update a scheduled query rule on Resource group(s).
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void createOrUpdateAScheduledQueryRuleOnResourceGroupS(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.scheduledQueryRules()
            .define("heartbeat")
            .withRegion("eastus")
            .withExistingResourceGroup("QueryResourceGroupName")
            .withDescription("Health check rule")
            .withSeverity(AlertSeverity.FOUR)
            .withEnabled(true)
            .withScopes(
                Arrays.asList("/subscriptions/aaf177ed-1330-a9f2-80ea-fd3d7783b147/resourceGroups/scopeResourceGroup1"))
            .withEvaluationFrequency(Duration.parse("PT5M"))
            .withWindowSize(Duration.parse("PT10M"))
            .withTargetResourceTypes(Arrays.asList("Microsoft.Compute/virtualMachines"))
            .withCriteria(
                new ScheduledQueryRuleCriteria().withAllOf(Arrays.asList(new Condition().withQuery("Heartbeat")
                    .withTimeAggregation(TimeAggregation.COUNT)
                    .withDimensions(Arrays.asList())
                    .withOperator(ConditionOperator.GREATER_THAN)
                    .withThreshold(360.0D)
                    .withFailingPeriods(new ConditionFailingPeriods().withNumberOfEvaluationPeriods(1L)
                        .withMinFailingPeriodsToAlert(1L)))))
            .withMuteActionsDuration(Duration.parse("PT30M"))
            .withActions(new Actions().withActionGroups(Arrays.asList(
                "/subscriptions/1cf177ed-1330-4692-80ea-fd3d7783b147/resourcegroups/sqrapi/providers/microsoft.insights/actiongroups/myactiongroup"))
                .withCustomProperties(mapOf("key11", "fakeTokenPlaceholder", "key12", "fakeTokenPlaceholder"))
                .withActionProperties(mapOf("Icm.Title", "Custom title in ICM", "Icm.TsgId", "https://tsg.url")))
            .withCheckWorkspaceAlertsStorageConfigured(true)
            .withSkipQueryValidation(true)
            .withResolveConfiguration(
                new RuleResolveConfiguration().withAutoResolved(true).withTimeToResolve(Duration.parse("PT10M")))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2025-01-01-preview/examples/
     * createOrUpdateDynamicThresholdScheduledQueryRule.json
     */
    /**
     * Sample code: create or update dynamic threshold scheduled query rule on Subscription.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void createOrUpdateDynamicThresholdScheduledQueryRuleOnSubscription(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.scheduledQueryRules()
            .define("perf")
            .withRegion("eastus")
            .withExistingResourceGroup("QueryResourceGroupName")
            .withDescription("Performance rule")
            .withSeverity(AlertSeverity.FOUR)
            .withEnabled(true)
            .withScopes(Arrays.asList(
                "/subscriptions/aaf177ed-1330-a9f2-80ea-fd3d7783b147/resourceGroups/scopeResourceGroup1/providers/Microsoft.Compute/virtualMachines/vm1"))
            .withEvaluationFrequency(Duration.parse("PT5M"))
            .withWindowSize(Duration.parse("PT10M"))
            .withCriteria(new ScheduledQueryRuleCriteria()
                .withAllOf(Arrays.asList(new Condition().withCriterionType(CriterionType.DYNAMIC_THRESHOLD_CRITERION)
                    .withQuery("Perf | where ObjectName == \"Processor\"")
                    .withTimeAggregation(TimeAggregation.AVERAGE)
                    .withMetricMeasureColumn("% Processor Time")
                    .withResourceIdColumn("resourceId")
                    .withDimensions(Arrays.asList(
                        new Dimension().withName("ComputerIp")
                            .withOperator(DimensionOperator.EXCLUDE)
                            .withValues(Arrays.asList("192.168.1.1")),
                        new Dimension().withName("OSType")
                            .withOperator(DimensionOperator.INCLUDE)
                            .withValues(Arrays.asList("*"))))
                    .withOperator(ConditionOperator.GREATER_OR_LESS_THAN)
                    .withAlertSensitivity("Medium")
                    .withIgnoreDataBefore(OffsetDateTime.parse("2024-06-01T21:00:00.000Z")))))
            .withMuteActionsDuration(Duration.parse("PT30M"))
            .withActions(new Actions().withActionGroups(Arrays.asList(
                "/subscriptions/1cf177ed-1330-4692-80ea-fd3d7783b147/resourcegroups/sqrapi/providers/microsoft.insights/actiongroups/myactiongroup"))
                .withCustomProperties(mapOf("key11", "fakeTokenPlaceholder", "key12", "fakeTokenPlaceholder"))
                .withActionProperties(mapOf("Icm.Title", "Custom title in ICM", "Icm.TsgId", "https://tsg.url")))
            .withCheckWorkspaceAlertsStorageConfigured(true)
            .withSkipQueryValidation(true)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2025-01-01-preview/examples/
     * createOrUpdateScheduledQueryRule.json
     */
    /**
     * Sample code: Create or update a scheduled query rule for Single Resource.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void createOrUpdateAScheduledQueryRuleForSingleResource(
        com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.scheduledQueryRules()
            .define("perf")
            .withRegion("eastus")
            .withExistingResourceGroup("QueryResourceGroupName")
            .withDescription("Performance rule")
            .withSeverity(AlertSeverity.FOUR)
            .withEnabled(true)
            .withScopes(Arrays.asList(
                "/subscriptions/aaf177ed-1330-a9f2-80ea-fd3d7783b147/resourceGroups/scopeResourceGroup1/providers/Microsoft.Compute/virtualMachines/vm1"))
            .withEvaluationFrequency(Duration.parse("PT5M"))
            .withWindowSize(Duration.parse("PT10M"))
            .withCriteria(new ScheduledQueryRuleCriteria()
                .withAllOf(Arrays.asList(new Condition().withQuery("Perf | where ObjectName == \"Processor\"")
                    .withTimeAggregation(TimeAggregation.AVERAGE)
                    .withMetricMeasureColumn("% Processor Time")
                    .withResourceIdColumn("resourceId")
                    .withDimensions(Arrays.asList(
                        new Dimension().withName("ComputerIp")
                            .withOperator(DimensionOperator.EXCLUDE)
                            .withValues(Arrays.asList("192.168.1.1")),
                        new Dimension().withName("OSType")
                            .withOperator(DimensionOperator.INCLUDE)
                            .withValues(Arrays.asList("*"))))
                    .withOperator(ConditionOperator.GREATER_THAN)
                    .withThreshold(70.0D)
                    .withFailingPeriods(new ConditionFailingPeriods().withNumberOfEvaluationPeriods(1L)
                        .withMinFailingPeriodsToAlert(1L)))))
            .withMuteActionsDuration(Duration.parse("PT30M"))
            .withActions(new Actions().withActionGroups(Arrays.asList(
                "/subscriptions/1cf177ed-1330-4692-80ea-fd3d7783b147/resourcegroups/sqrapi/providers/microsoft.insights/actiongroups/myactiongroup"))
                .withCustomProperties(mapOf("key11", "fakeTokenPlaceholder", "key12", "fakeTokenPlaceholder"))
                .withActionProperties(mapOf("Icm.Title", "Custom title in ICM", "Icm.TsgId", "https://tsg.url")))
            .withCheckWorkspaceAlertsStorageConfigured(true)
            .withSkipQueryValidation(true)
            .withResolveConfiguration(
                new RuleResolveConfiguration().withAutoResolved(true).withTimeToResolve(Duration.parse("PT10M")))
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

### ScheduledQueryRules_Delete

```java
import com.azure.resourcemanager.monitor.generated.models.ActionGroupResource;
import com.azure.resourcemanager.monitor.generated.models.ManagedServiceIdentity;
import com.azure.resourcemanager.monitor.generated.models.ManagedServiceIdentityType;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ActionGroups Update.
 */
public final class ActionGroupsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2024-10-01-preview/examples/patchActionGroup.
     * json
     */
    /**
     * Sample code: Patch an action group.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void patchAnActionGroup(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        ActionGroupResource resource = manager.actionGroups()
            .getByResourceGroupWithResponse("Default-NotificationRules", "SampleActionGroup",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key1", "fakeTokenPlaceholder", "key2", "fakeTokenPlaceholder"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
            .withEnabled(false)
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

### ScheduledQueryRules_GetByResourceGroup

```java
/**
 * Samples for ActionGroups Delete.
 */
public final class ActionGroupsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2024-10-01-preview/examples/deleteActionGroup.
     * json
     */
    /**
     * Sample code: Delete an action group.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void deleteAnActionGroup(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.actionGroups()
            .deleteByResourceGroupWithResponse("Default-NotificationRules", "SampleActionGroup",
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledQueryRules_List

```java
import com.azure.resourcemanager.monitor.generated.models.ArmRoleReceiver;
import com.azure.resourcemanager.monitor.generated.models.AutomationRunbookReceiver;
import com.azure.resourcemanager.monitor.generated.models.AzureAppPushReceiver;
import com.azure.resourcemanager.monitor.generated.models.AzureFunctionReceiver;
import com.azure.resourcemanager.monitor.generated.models.EmailReceiver;
import com.azure.resourcemanager.monitor.generated.models.EventHubReceiver;
import com.azure.resourcemanager.monitor.generated.models.ItsmReceiver;
import com.azure.resourcemanager.monitor.generated.models.LogicAppReceiver;
import com.azure.resourcemanager.monitor.generated.models.NotificationRequestBody;
import com.azure.resourcemanager.monitor.generated.models.SmsReceiver;
import com.azure.resourcemanager.monitor.generated.models.VoiceReceiver;
import com.azure.resourcemanager.monitor.generated.models.WebhookReceiver;
import java.util.Arrays;

/**
 * Samples for ActionGroups CreateNotificationsAtActionGroupResourceLevel.
 */
public final class ActionGroupsCreateNotificationsAtActionGroupResourceLevelSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2024-10-01-preview/examples/
     * postTestNotificationsAtActionGroupResourceLevel.json
     */
    /**
     * Sample code: Create notifications at resource group level.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void
        createNotificationsAtResourceGroupLevel(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.actionGroups()
            .createNotificationsAtActionGroupResourceLevel("TestRgName", "TestAgName", new NotificationRequestBody()
                .withAlertType("budget")
                .withEmailReceivers(Arrays.asList(
                    new EmailReceiver().withName("John Doe's email")
                        .withEmailAddress("johndoe@email.com")
                        .withUseCommonAlertSchema(false),
                    new EmailReceiver().withName("Jane Smith's email")
                        .withEmailAddress("janesmith@email.com")
                        .withUseCommonAlertSchema(true)))
                .withSmsReceivers(Arrays.asList(
                    new SmsReceiver().withName("John Doe's mobile")
                        .withCountryCode("fakeTokenPlaceholder")
                        .withPhoneNumber("1234567890"),
                    new SmsReceiver().withName("Jane Smith's mobile")
                        .withCountryCode("fakeTokenPlaceholder")
                        .withPhoneNumber("0987654321")))
                .withWebhookReceivers(Arrays.asList(
                    new WebhookReceiver().withName("Sample webhook 1")
                        .withServiceUri("http://www.example.com/webhook1")
                        .withUseCommonAlertSchema(true),
                    new WebhookReceiver().withName("Sample webhook 2")
                        .withServiceUri("http://www.example.com/webhook2")
                        .withUseCommonAlertSchema(true)
                        .withUseAadAuth(true)
                        .withObjectId("d3bb868c-fe44-452c-aa26-769a6538c808")
                        .withIdentifierUri("http://someidentifier/d7811ba3-7996-4a93-99b6-6b2f3f355f8a")
                        .withTenantId("68a4459a-ccb8-493c-b9da-dd30457d1b84")))
                .withItsmReceivers(Arrays.asList(new ItsmReceiver().withName("Sample itsm")
                    .withWorkspaceId("5def922a-3ed4-49c1-b9fd-05ec533819a3|55dfd1f8-7e59-4f89-bf56-4c82f5ace23c")
                    .withConnectionId("a3b9076c-ce8e-434e-85b4-aff10cb3c8f1")
                    .withTicketConfiguration(
                        "{\"PayloadRevision\":0,\"WorkItemType\":\"Incident\",\"UseTemplate\":false,\"WorkItemData\":\"{}\",\"CreateOneWIPerCI\":false}")
                    .withRegion("westcentralus")))
                .withAzureAppPushReceivers(Arrays.asList(
                    new AzureAppPushReceiver().withName("Sample azureAppPush").withEmailAddress("johndoe@email.com")))
                .withAutomationRunbookReceivers(Arrays.asList(new AutomationRunbookReceiver().withAutomationAccountId(
                    "/subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/runbookTest/providers/Microsoft.Automation/automationAccounts/runbooktest")
                    .withRunbookName("Sample runbook")
                    .withWebhookResourceId(
                        "/subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/runbookTest/providers/Microsoft.Automation/automationAccounts/runbooktest/webhooks/Alert1510184037084")
                    .withIsGlobalRunbook(false)
                    .withName("testRunbook")
                    .withServiceUri("http://test.me")
                    .withUseCommonAlertSchema(true)))
                .withVoiceReceivers(Arrays.asList(new VoiceReceiver().withName("Sample voice")
                    .withCountryCode("fakeTokenPlaceholder")
                    .withPhoneNumber("1234567890")))
                .withLogicAppReceivers(Arrays.asList(new LogicAppReceiver().withName("Sample logicApp")
                    .withResourceId(
                        "/subscriptions/187f412d-1758-44d9-b052-169e2564721d/resourceGroups/LogicApp/providers/Microsoft.Logic/workflows/testLogicApp")
                    .withCallbackUrl(
                        "https://prod-27.northcentralus.logic.azure.com/workflows/68e572e818e5457ba898763b7db90877/triggers/manual/paths/invoke/azns/test?api-version=2016-10-01&sp=%2Ftriggers%2Fmanual%2Frun&sv=1.0&sig=Abpsb72UYJxPPvmDo937uzofupO5r_vIeWEx7KVHo7w")
                    .withUseCommonAlertSchema(false)
                    .withManagedIdentity("f11979a4-36d1-45d0-9097-a0da3c7e855d")))
                .withAzureFunctionReceivers(Arrays.asList(new AzureFunctionReceiver().withName("Sample azureFunction")
                    .withFunctionAppResourceId(
                        "/subscriptions/5def922a-3ed4-49c1-b9fd-05ec533819a3/resourceGroups/aznsTest/providers/Microsoft.Web/sites/testFunctionApp")
                    .withFunctionName("HttpTriggerCSharp1")
                    .withHttpTriggerUrl("http://test.me")
                    .withUseCommonAlertSchema(true)
                    .withManagedIdentity("f11979a4-36d1-45d0-9097-a0da3c7e855d")))
                .withArmRoleReceivers(Arrays.asList(
                    new ArmRoleReceiver().withName("ArmRole-Common")
                        .withRoleId("11111111-1111-1111-1111-111111111111")
                        .withUseCommonAlertSchema(true),
                    new ArmRoleReceiver().withName("ArmRole-nonCommon")
                        .withRoleId("11111111-1111-1111-1111-111111111111")
                        .withUseCommonAlertSchema(false)))
                .withEventHubReceivers(Arrays.asList(new EventHubReceiver().withName("Sample eventHub")
                    .withEventHubNameSpace("testEventHubNameSpace")
                    .withEventHubName("testEventHub")
                    .withTenantId("68a4459a-ccb8-493c-b9da-dd30457d1b84")
                    .withSubscriptionId("187f412d-1758-44d9-b052-169e2564721d"))),
                com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledQueryRules_ListByResourceGroup

```java
/**
 * Samples for ScheduledQueryRules ListByResourceGroup.
 */
public final class ScheduledQueryRulesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2025-01-01-preview/examples/
     * listScheduledQueryRulesByResourceGroup.json
     */
    /**
     * Sample code: List scheduled query rules by resource group.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void
        listScheduledQueryRulesByResourceGroup(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.scheduledQueryRules().listByResourceGroup("QueryResourceGroupName", com.azure.core.util.Context.NONE);
    }
}
```

### ScheduledQueryRules_Update

```java
/**
 * Samples for ActionGroups GetByResourceGroup.
 */
public final class ActionGroupsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2024-10-01-preview/examples/getActionGroup.json
     */
    /**
     * Sample code: Get an action group.
     * 
     * @param manager Entry point to MonitorManager.
     */
    public static void getAnActionGroup(com.azure.resourcemanager.monitor.generated.MonitorManager manager) {
        manager.actionGroups()
            .getByResourceGroupWithResponse("Default-NotificationRules", "SampleActionGroup",
                com.azure.core.util.Context.NONE);
    }
}
```

