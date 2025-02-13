# Code snippets and samples


## ScheduledQueryRules

- [CreateOrUpdate](#scheduledqueryrules_createorupdate)
- [Delete](#scheduledqueryrules_delete)
- [GetByResourceGroup](#scheduledqueryrules_getbyresourcegroup)
- [List](#scheduledqueryrules_list)
- [ListByResourceGroup](#scheduledqueryrules_listbyresourcegroup)
- [Update](#scheduledqueryrules_update)
### ScheduledQueryRules_CreateOrUpdate

```java
import com.azure.resourcemanager.monitor.generated.models.Actions;
import com.azure.resourcemanager.monitor.generated.models.AlertSeverity;
import com.azure.resourcemanager.monitor.generated.models.Condition;
import com.azure.resourcemanager.monitor.generated.models.ConditionFailingPeriods;
import com.azure.resourcemanager.monitor.generated.models.ConditionOperator;
import com.azure.resourcemanager.monitor.generated.models.Dimension;
import com.azure.resourcemanager.monitor.generated.models.DimensionOperator;
import com.azure.resourcemanager.monitor.generated.models.RuleResolveConfiguration;
import com.azure.resourcemanager.monitor.generated.models.ScheduledQueryRuleCriteria;
import com.azure.resourcemanager.monitor.generated.models.TimeAggregation;
import java.time.Duration;
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

### ScheduledQueryRules_GetByResourceGroup

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

### ScheduledQueryRules_List

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

