# Code snippets and samples


## Operations

- [List](#operations_list)

## PolicyEvents

- [ListQueryResultsForManagementGroup](#policyevents_listqueryresultsformanagementgroup)
- [ListQueryResultsForPolicyDefinition](#policyevents_listqueryresultsforpolicydefinition)
- [ListQueryResultsForPolicySetDefinition](#policyevents_listqueryresultsforpolicysetdefinition)
- [ListQueryResultsForResource](#policyevents_listqueryresultsforresource)
- [ListQueryResultsForResourceGroup](#policyevents_listqueryresultsforresourcegroup)
- [ListQueryResultsForResourceGroupLevelPolicyAssignment](#policyevents_listqueryresultsforresourcegrouplevelpolicyassignment)
- [ListQueryResultsForSubscription](#policyevents_listqueryresultsforsubscription)
- [ListQueryResultsForSubscriptionLevelPolicyAssignment](#policyevents_listqueryresultsforsubscriptionlevelpolicyassignment)

## PolicyStates

- [ListQueryResultsForManagementGroup](#policystates_listqueryresultsformanagementgroup)
- [ListQueryResultsForPolicyDefinition](#policystates_listqueryresultsforpolicydefinition)
- [ListQueryResultsForPolicySetDefinition](#policystates_listqueryresultsforpolicysetdefinition)
- [ListQueryResultsForResource](#policystates_listqueryresultsforresource)
- [ListQueryResultsForResourceGroup](#policystates_listqueryresultsforresourcegroup)
- [ListQueryResultsForResourceGroupLevelPolicyAssignment](#policystates_listqueryresultsforresourcegrouplevelpolicyassignment)
- [ListQueryResultsForSubscription](#policystates_listqueryresultsforsubscription)
- [ListQueryResultsForSubscriptionLevelPolicyAssignment](#policystates_listqueryresultsforsubscriptionlevelpolicyassignment)
- [SummarizeForManagementGroup](#policystates_summarizeformanagementgroup)
- [SummarizeForPolicyDefinition](#policystates_summarizeforpolicydefinition)
- [SummarizeForPolicySetDefinition](#policystates_summarizeforpolicysetdefinition)
- [SummarizeForResource](#policystates_summarizeforresource)
- [SummarizeForResourceGroup](#policystates_summarizeforresourcegroup)
- [SummarizeForResourceGroupLevelPolicyAssignment](#policystates_summarizeforresourcegrouplevelpolicyassignment)
- [SummarizeForSubscription](#policystates_summarizeforsubscription)
- [SummarizeForSubscriptionLevelPolicyAssignment](#policystates_summarizeforsubscriptionlevelpolicyassignment)
- [TriggerResourceGroupEvaluation](#policystates_triggerresourcegroupevaluation)
- [TriggerSubscriptionEvaluation](#policystates_triggersubscriptionevaluation)
### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_ListOperations.json
     */
    /**
     * Sample code: List operations.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listOperations(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.operations().listWithResponse(Context.NONE);
    }
}
```

### PolicyEvents_ListQueryResultsForManagementGroup

```java
import com.azure.core.util.Context;

/** Samples for PolicyEvents ListQueryResultsForManagementGroup. */
public final class PolicyEventsListQueryResultsForManagementGroupSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QueryManagementGroupScopeNextLink.json
     */
    /**
     * Sample code: Query at management group scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtManagementGroupScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForManagementGroup(
                "myManagementGroup", null, null, null, null, null, null, null, "WpmWfBSvPhkAK6QD", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QueryManagementGroupScope.json
     */
    /**
     * Sample code: Query at management group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtManagementGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForManagementGroup(
                "myManagementGroup", null, null, null, null, null, null, null, null, Context.NONE);
    }
}
```

### PolicyEvents_ListQueryResultsForPolicyDefinition

```java
import com.azure.core.util.Context;

/** Samples for PolicyEvents ListQueryResultsForPolicyDefinition. */
public final class PolicyEventsListQueryResultsForPolicyDefinitionSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QuerySubscriptionLevelPolicyDefinitionScope.json
     */
    /**
     * Sample code: Query at subscription level policy definition scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionLevelPolicyDefinitionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForPolicyDefinition(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "24813039-7534-408a-9842-eb99f45721b1",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QuerySubscriptionLevelPolicyDefinitionScopeNextLink.json
     */
    /**
     * Sample code: Query at subscription level policy definition scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionLevelPolicyDefinitionScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForPolicyDefinition(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "24813039-7534-408a-9842-eb99f45721b1",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }
}
```

### PolicyEvents_ListQueryResultsForPolicySetDefinition

```java
import com.azure.core.util.Context;

/** Samples for PolicyEvents ListQueryResultsForPolicySetDefinition. */
public final class PolicyEventsListQueryResultsForPolicySetDefinitionSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QuerySubscriptionLevelPolicySetDefinitionScope.json
     */
    /**
     * Sample code: Query at subscription level policy set definition scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionLevelPolicySetDefinitionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForPolicySetDefinition(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "3e3807c1-65c9-49e0-a406-82d8ae3e338c",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QuerySubscriptionLevelPolicySetDefinitionScopeNextLink.json
     */
    /**
     * Sample code: Query at subscription level policy set definition scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionLevelPolicySetDefinitionScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForPolicySetDefinition(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "3e3807c1-65c9-49e0-a406-82d8ae3e338c",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }
}
```

### PolicyEvents_ListQueryResultsForResource

```java
import com.azure.core.util.Context;

/** Samples for PolicyEvents ListQueryResultsForResource. */
public final class PolicyEventsListQueryResultsForResourceSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QuerySubscriptionLevelResourceScope.json
     */
    /**
     * Sample code: Query at subscription level resource scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionLevelResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForResource(
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/providers/Microsoft.SomeNamespace/someResourceType/someResourceName",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QueryNestedResourceScope.json
     */
    /**
     * Sample code: Query at nested resource scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtNestedResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForResource(
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/resourceGroups/myResourceGroup/providers/Microsoft.ServiceFabric/clusters/myCluster/applications/myApplication",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QuerySubscriptionLevelNestedResourceScope.json
     */
    /**
     * Sample code: Query at subscription level nested resource scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionLevelNestedResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForResource(
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/providers/Microsoft.SomeNamespace/someResourceType/someResource/someNestedResourceType/someNestedResource",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QueryResourceScope.json
     */
    /**
     * Sample code: Query at resource scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtResourceScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForResource(
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/resourceGroups/myResourceGroup/providers/Microsoft.ClassicCompute/domainNames/myDomainName",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QueryResourceScopeExpandComponents.json
     */
    /**
     * Sample code: Query components policy events for resource scope filtered by given assignment.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryComponentsPolicyEventsForResourceScopeFilteredByGivenAssignment(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForResource(
                "subscriptions/e78961ba-36fe-4739-9212-e3031b4c8db7/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/Vaults/myKVName",
                null,
                null,
                null,
                null,
                null,
                "policyAssignmentId eq"
                    + " '/subscriptions/e78961ba-36fe-4739-9212-e3031b4c8db7/providers/microsoft.authorization/policyassignments/560050f83dbb4a24974323f8'",
                null,
                "components",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QueryResourceScopeExpandComponentsGroupByWithAggregate.json
     */
    /**
     * Sample code: Query components policy events count grouped by user and action type for resource scope filtered by
     * given assignment.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        queryComponentsPolicyEventsCountGroupedByUserAndActionTypeForResourceScopeFilteredByGivenAssignment(
            com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForResource(
                "subscriptions/e78961ba-36fe-4739-9212-e3031b4c8db7/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/Vaults/myKVName",
                null,
                null,
                null,
                null,
                null,
                "policyAssignmentId eq"
                    + " '/subscriptions/e78961ba-36fe-4739-9212-e3031b4c8db7/providers/microsoft.authorization/policyassignments/560050f83dbb4a24974323f8'",
                null,
                "components($apply=groupby((tenantId, principalOid, policyDefinitionAction), aggregate($count as"
                    + " totalActions)))",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QueryResourceScopeNextLink.json
     */
    /**
     * Sample code: Query at resource scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtResourceScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForResource(
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/resourceGroups/myResourceGroup/providers/Microsoft.ClassicCompute/domainNames/myDomainName",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }
}
```

### PolicyEvents_ListQueryResultsForResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for PolicyEvents ListQueryResultsForResourceGroup. */
public final class PolicyEventsListQueryResultsForResourceGroupSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QueryResourceGroupScope.json
     */
    /**
     * Sample code: Query at resource group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtResourceGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForResourceGroup(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "myResourceGroup",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QueryResourceGroupScopeNextLink.json
     */
    /**
     * Sample code: Query at resource group scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtResourceGroupScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForResourceGroup(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "myResourceGroup",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }
}
```

### PolicyEvents_ListQueryResultsForResourceGroupLevelPolicyAssignment

```java
import com.azure.core.util.Context;

/** Samples for PolicyEvents ListQueryResultsForResourceGroupLevelPolicyAssignment. */
public final class PolicyEventsListQueryResultsForResourceGroupLevelPolicyAssignmentSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QueryResourceGroupLevelPolicyAssignmentScope.json
     */
    /**
     * Sample code: Query at resource group level policy assignment scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtResourceGroupLevelPolicyAssignmentScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForResourceGroupLevelPolicyAssignment(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "myResourceGroup",
                "myPolicyAssignment",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QueryResourceGroupLevelPolicyAssignmentScopeNextLink.json
     */
    /**
     * Sample code: Query at resource group level policy assignment scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtResourceGroupLevelPolicyAssignmentScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForResourceGroupLevelPolicyAssignment(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "myResourceGroup",
                "myPolicyAssignment",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }
}
```

### PolicyEvents_ListQueryResultsForSubscription

```java
import com.azure.core.util.Context;
import java.time.OffsetDateTime;

/** Samples for PolicyEvents ListQueryResultsForSubscription. */
public final class PolicyEventsListQueryResultsForSubscriptionSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_TimeRangeSortSelectTop.json
     */
    /**
     * Sample code: Time range; sort, select and limit.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void timeRangeSortSelectAndLimit(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForSubscription(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                2,
                "Timestamp desc, PolicyAssignmentId asc, SubscriptionId asc, ResourceGroup asc, ResourceId",
                "Timestamp, PolicyAssignmentId, PolicyDefinitionId, SubscriptionId, ResourceGroup, ResourceId",
                OffsetDateTime.parse("2018-02-05T18:00:00Z"),
                OffsetDateTime.parse("2018-02-06T18:00:00Z"),
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_FilterAndAggregateOnly.json
     */
    /**
     * Sample code: Filter and aggregate only.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void filterAndAggregateOnly(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForSubscription(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                null,
                null,
                null,
                OffsetDateTime.parse("2018-02-05T18:00:00Z"),
                null,
                "PolicyDefinitionAction eq 'deny'",
                "aggregate($count as NumDenyEvents)",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_FilterAndGroupByWithoutAggregate.json
     */
    /**
     * Sample code: Filter and group without aggregate.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void filterAndGroupWithoutAggregate(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForSubscription(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                2,
                null,
                null,
                OffsetDateTime.parse("2018-01-05T18:00:00Z"),
                null,
                "PolicyDefinitionAction ne 'audit' and PolicyDefinitionAction ne 'append'",
                "groupby((PolicyAssignmentId, PolicyDefinitionId, PolicyDefinitionAction, ResourceId))",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QuerySubscriptionScopeNextLink.json
     */
    /**
     * Sample code: Query at subscription scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForSubscription(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_FilterAndMultipleGroups.json
     */
    /**
     * Sample code: Filter and multiple groups.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void filterAndMultipleGroups(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForSubscription(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                10,
                "NumDeniedResources desc",
                null,
                OffsetDateTime.parse("2018-01-01T00:00:00Z"),
                null,
                "PolicyDefinitionAction eq 'deny'",
                "groupby((PolicyAssignmentId, PolicyDefinitionId, ResourceId))/groupby((PolicyAssignmentId,"
                    + " PolicyDefinitionId), aggregate($count as NumDeniedResources))",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_FilterAndGroupByWithAggregate.json
     */
    /**
     * Sample code: Filter and group with aggregate.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void filterAndGroupWithAggregate(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForSubscription(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                2,
                null,
                null,
                OffsetDateTime.parse("2018-02-05T18:00:00Z"),
                null,
                "PolicyDefinitionAction eq 'audit' or PolicyDefinitionAction eq 'deny'",
                "groupby((PolicyAssignmentId, PolicyDefinitionId, PolicyDefinitionAction, ResourceId), aggregate($count"
                    + " as NumEvents))",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QuerySubscriptionScope.json
     */
    /**
     * Sample code: Query at subscription scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForSubscription(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852", null, null, null, null, null, null, null, null, Context.NONE);
    }
}
```

### PolicyEvents_ListQueryResultsForSubscriptionLevelPolicyAssignment

```java
import com.azure.core.util.Context;

/** Samples for PolicyEvents ListQueryResultsForSubscriptionLevelPolicyAssignment. */
public final class PolicyEventsListQueryResultsForSubscriptionLevelPolicyAssignmentSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QuerySubscriptionLevelPolicyAssignmentScope.json
     */
    /**
     * Sample code: Query at subscription level policy assignment scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionLevelPolicyAssignmentScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForSubscriptionLevelPolicyAssignment(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "ec8f9645-8ecb-4abb-9c0b-5292f19d4003",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyEvents_QuerySubscriptionLevelPolicyAssignmentScopeNextLink.json
     */
    /**
     * Sample code: Query at subscription level policy assignment scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAtSubscriptionLevelPolicyAssignmentScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyEvents()
            .listQueryResultsForSubscriptionLevelPolicyAssignment(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "ec8f9645-8ecb-4abb-9c0b-5292f19d4003",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }
}
```

### PolicyStates_ListQueryResultsForManagementGroup

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.models.PolicyStatesResource;

/** Samples for PolicyStates ListQueryResultsForManagementGroup. */
public final class PolicyStatesListQueryResultsForManagementGroupSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryManagementGroupScope.json
     */
    /**
     * Sample code: Query latest at management group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtManagementGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForManagementGroup(
                PolicyStatesResource.LATEST,
                "myManagementGroup",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryManagementGroupScopeNextLink.json
     */
    /**
     * Sample code: Query latest at management group scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtManagementGroupScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForManagementGroup(
                PolicyStatesResource.LATEST,
                "myManagementGroup",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }
}
```

### PolicyStates_ListQueryResultsForPolicyDefinition

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.models.PolicyStatesResource;

/** Samples for PolicyStates ListQueryResultsForPolicyDefinition. */
public final class PolicyStatesListQueryResultsForPolicyDefinitionSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QuerySubscriptionLevelPolicyDefinitionScope.json
     */
    /**
     * Sample code: Query latest at subscription level policy definition scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtSubscriptionLevelPolicyDefinitionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForPolicyDefinition(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "24813039-7534-408a-9842-eb99f45721b1",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QuerySubscriptionLevelPolicyDefinitionScopeNextLink.json
     */
    /**
     * Sample code: Query latest at subscription level policy definition scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtSubscriptionLevelPolicyDefinitionScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForPolicyDefinition(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "24813039-7534-408a-9842-eb99f45721b1",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }
}
```

### PolicyStates_ListQueryResultsForPolicySetDefinition

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.models.PolicyStatesResource;

/** Samples for PolicyStates ListQueryResultsForPolicySetDefinition. */
public final class PolicyStatesListQueryResultsForPolicySetDefinitionSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QuerySubscriptionLevelPolicySetDefinitionScopeNextLink.json
     */
    /**
     * Sample code: Query latest at subscription level policy set definition scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtSubscriptionLevelPolicySetDefinitionScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForPolicySetDefinition(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "3e3807c1-65c9-49e0-a406-82d8ae3e338c",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QuerySubscriptionLevelPolicySetDefinitionScope.json
     */
    /**
     * Sample code: Query latest at subscription level policy set definition scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtSubscriptionLevelPolicySetDefinitionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForPolicySetDefinition(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "3e3807c1-65c9-49e0-a406-82d8ae3e338c",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }
}
```

### PolicyStates_ListQueryResultsForResource

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.models.PolicyStatesResource;

/** Samples for PolicyStates ListQueryResultsForResource. */
public final class PolicyStatesListQueryResultsForResourceSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryResourceScopeExpandPolicyEvaluationDetails.json
     */
    /**
     * Sample code: Query all policy states at resource scope and expand policyEvaluationDetails.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAllPolicyStatesAtResourceScopeAndExpandPolicyEvaluationDetails(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResource(
                PolicyStatesResource.LATEST,
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/resourceGroups/myResourceGroup/providers/Microsoft.ClassicCompute/domainNames/myDomainName",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "PolicyEvaluationDetails",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryResourceScopeNextLink.json
     */
    /**
     * Sample code: Query all policy states at resource scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAllPolicyStatesAtResourceScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResource(
                PolicyStatesResource.DEFAULT,
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/resourceGroups/myResourceGroup/providers/Microsoft.ClassicCompute/domainNames/myDomainName",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QuerySubscriptionLevelNestedResourceScope.json
     */
    /**
     * Sample code: Query all policy states at subscription level nested resource scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAllPolicyStatesAtSubscriptionLevelNestedResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResource(
                PolicyStatesResource.DEFAULT,
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/providers/Microsoft.SomeNamespace/someResourceType/someResource/someNestedResourceType/someNestedResource",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryResourceScopeExpandComponents.json
     */
    /**
     * Sample code: Query component policy compliance state at resource scope filtered by given assignment.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryComponentPolicyComplianceStateAtResourceScopeFilteredByGivenAssignment(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResource(
                PolicyStatesResource.LATEST,
                "subscriptions/e78961ba-36fe-4739-9212-e3031b4c8db7/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/Vaults/myKVName",
                null,
                null,
                null,
                null,
                null,
                "policyAssignmentId eq"
                    + " '/subscriptions/e78961ba-36fe-4739-9212-e3031b4c8db7/providers/microsoft.authorization/policyassignments/560050f83dbb4a24974323f8'",
                null,
                "components($filter=ComplianceState eq 'NonCompliant' or ComplianceState eq 'Compliant')",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryResourceScopeExpandComponentsGroupByWithAggregate.json
     */
    /**
     * Sample code: Query component policy compliance state count grouped by state type at resource scope filtered by
     * given assignment.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        queryComponentPolicyComplianceStateCountGroupedByStateTypeAtResourceScopeFilteredByGivenAssignment(
            com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResource(
                PolicyStatesResource.LATEST,
                "subscriptions/e78961ba-36fe-4739-9212-e3031b4c8db7/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/Vaults/myKVName",
                null,
                null,
                null,
                null,
                null,
                "policyAssignmentId eq"
                    + " '/subscriptions/e78961ba-36fe-4739-9212-e3031b4c8db7/providers/microsoft.authorization/policyassignments/560050f83dbb4a24974323f8'",
                null,
                "components($filter=ComplianceState eq 'NonCompliant' or ComplianceState eq"
                    + " 'Compliant';$apply=groupby((complianceState),aggregate($count as count)))",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QuerySubscriptionLevelResourceScope.json
     */
    /**
     * Sample code: Query all policy states at subscription level resource scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAllPolicyStatesAtSubscriptionLevelResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResource(
                PolicyStatesResource.DEFAULT,
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/providers/Microsoft.SomeNamespace/someResourceType/someResourceName",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryResourceScope.json
     */
    /**
     * Sample code: Query all policy states at resource scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAllPolicyStatesAtResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResource(
                PolicyStatesResource.DEFAULT,
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/resourceGroups/myResourceGroup/providers/Microsoft.ClassicCompute/domainNames/myDomainName",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryNestedResourceScope.json
     */
    /**
     * Sample code: Query all policy states at nested resource scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryAllPolicyStatesAtNestedResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResource(
                PolicyStatesResource.DEFAULT,
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/resourceGroups/myResourceGroup/providers/Microsoft.ServiceFabric/clusters/myCluster/applications/myApplication",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }
}
```

### PolicyStates_ListQueryResultsForResourceGroup

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.models.PolicyStatesResource;

/** Samples for PolicyStates ListQueryResultsForResourceGroup. */
public final class PolicyStatesListQueryResultsForResourceGroupSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryResourceGroupScopeNextLink.json
     */
    /**
     * Sample code: Query latest at resource group scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtResourceGroupScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResourceGroup(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "myResourceGroup",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryResourceGroupScope.json
     */
    /**
     * Sample code: Query latest at resource group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtResourceGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResourceGroup(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "myResourceGroup",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }
}
```

### PolicyStates_ListQueryResultsForResourceGroupLevelPolicyAssignment

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.models.PolicyStatesResource;

/** Samples for PolicyStates ListQueryResultsForResourceGroupLevelPolicyAssignment. */
public final class PolicyStatesListQueryResultsForResourceGroupLevelPolicyAssignmentSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryResourceGroupLevelPolicyAssignmentScopeNextLink.json
     */
    /**
     * Sample code: Query latest at resource group level policy assignment scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtResourceGroupLevelPolicyAssignmentScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResourceGroupLevelPolicyAssignment(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "myResourceGroup",
                "myPolicyAssignment",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QueryResourceGroupLevelPolicyAssignmentScope.json
     */
    /**
     * Sample code: Query latest at resource group level policy assignment scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtResourceGroupLevelPolicyAssignmentScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForResourceGroupLevelPolicyAssignment(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "myResourceGroup",
                "myPolicyAssignment",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }
}
```

### PolicyStates_ListQueryResultsForSubscription

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.models.PolicyStatesResource;
import java.time.OffsetDateTime;

/** Samples for PolicyStates ListQueryResultsForSubscription. */
public final class PolicyStatesListQueryResultsForSubscriptionSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QuerySubscriptionScope.json
     */
    /**
     * Sample code: Query latest at subscription scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtSubscriptionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForSubscription(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QuerySubscriptionScopeNextLink.json
     */
    /**
     * Sample code: Query latest at subscription scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtSubscriptionScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForSubscription(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_TimeRangeSortSelectTop.json
     */
    /**
     * Sample code: Time range; sort, select and limit.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void timeRangeSortSelectAndLimit(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForSubscription(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                2,
                "Timestamp desc, PolicyAssignmentId asc, SubscriptionId asc, ResourceGroup asc, ResourceId",
                "Timestamp, PolicyAssignmentId, PolicyDefinitionId, SubscriptionId, ResourceGroup, ResourceId,"
                    + " policyDefinitionGroupNames",
                OffsetDateTime.parse("2022-06-05T18:00:00Z"),
                OffsetDateTime.parse("2022-06-06T18:00:00Z"),
                null,
                null,
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_FilterAndAggregateOnly.json
     */
    /**
     * Sample code: Filter and aggregate only.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void filterAndAggregateOnly(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForSubscription(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                null,
                null,
                null,
                OffsetDateTime.parse("2022-06-05T18:00:00Z"),
                null,
                "PolicyDefinitionAction eq 'deny'",
                "aggregate($count as NumDenyStates)",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_FilterAndGroupByWithoutAggregate.json
     */
    /**
     * Sample code: Filter and group without aggregate.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void filterAndGroupWithoutAggregate(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForSubscription(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                2,
                null,
                null,
                OffsetDateTime.parse("2022-06-05T18:00:00Z"),
                null,
                "IsCompliant eq false and (PolicyDefinitionAction ne 'audit' and PolicyDefinitionAction ne 'append')",
                "groupby((PolicyAssignmentId, PolicyDefinitionId, PolicyDefinitionAction, ResourceId))",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_FilterAndMultipleGroups.json
     */
    /**
     * Sample code: Filter and multiple groups.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void filterAndMultipleGroups(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForSubscription(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                10,
                "NumNonCompliantResources desc",
                null,
                null,
                null,
                "IsCompliant eq false",
                "groupby((PolicyAssignmentId, PolicySetDefinitionId, PolicyDefinitionId, PolicyDefinitionReferenceId,"
                    + " ResourceId))/groupby((PolicyAssignmentId, PolicySetDefinitionId, PolicyDefinitionId,"
                    + " PolicyDefinitionReferenceId), aggregate($count as NumNonCompliantResources))",
                null,
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_FilterAndGroupByWithAggregate.json
     */
    /**
     * Sample code: Filter and group with aggregate.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void filterAndGroupWithAggregate(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForSubscription(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                2,
                "NumAuditDenyNonComplianceRecords desc",
                null,
                OffsetDateTime.parse("2022-06-05T18:00:00Z"),
                null,
                "IsCompliant eq false and (PolicyDefinitionAction eq 'audit' or PolicyDefinitionAction eq 'deny')",
                "groupby((PolicyAssignmentId, PolicyDefinitionId, PolicyDefinitionAction, ResourceId), aggregate($count"
                    + " as NumAuditDenyNonComplianceRecords))",
                null,
                Context.NONE);
    }
}
```

### PolicyStates_ListQueryResultsForSubscriptionLevelPolicyAssignment

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.models.PolicyStatesResource;

/** Samples for PolicyStates ListQueryResultsForSubscriptionLevelPolicyAssignment. */
public final class PolicyStatesListQueryResultsForSubscriptionLevelPolicyAssignmentSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QuerySubscriptionLevelPolicyAssignmentScopeNextLink.json
     */
    /**
     * Sample code: Query latest at subscription level policy assignment scope with next link.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtSubscriptionLevelPolicyAssignmentScopeWithNextLink(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForSubscriptionLevelPolicyAssignment(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "ec8f9645-8ecb-4abb-9c0b-5292f19d4003",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "WpmWfBSvPhkAK6QD",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_QuerySubscriptionLevelPolicyAssignmentScope.json
     */
    /**
     * Sample code: Query latest at subscription level policy assignment scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void queryLatestAtSubscriptionLevelPolicyAssignmentScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .listQueryResultsForSubscriptionLevelPolicyAssignment(
                PolicyStatesResource.LATEST,
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "ec8f9645-8ecb-4abb-9c0b-5292f19d4003",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                Context.NONE);
    }
}
```

### PolicyStates_SummarizeForManagementGroup

```java
import com.azure.core.util.Context;
import java.time.OffsetDateTime;

/** Samples for PolicyStates SummarizeForManagementGroup. */
public final class PolicyStatesSummarizeForManagementGroupSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_SummarizeManagementGroupScope.json
     */
    /**
     * Sample code: Summarize at management group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void summarizeAtManagementGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .summarizeForManagementGroupWithResponse(
                "myManagementGroup",
                0,
                OffsetDateTime.parse("2022-06-05T18:00:00Z"),
                OffsetDateTime.parse("2022-06-06T18:00:00Z"),
                "PolicyDefinitionAction eq 'deny' or PolicyDefinitionAction eq 'audit'",
                Context.NONE);
    }
}
```

### PolicyStates_SummarizeForPolicyDefinition

```java
import com.azure.core.util.Context;

/** Samples for PolicyStates SummarizeForPolicyDefinition. */
public final class PolicyStatesSummarizeForPolicyDefinitionSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_SummarizeSubscriptionLevelPolicyDefinitionScope.json
     */
    /**
     * Sample code: Summarize at policy definition scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void summarizeAtPolicyDefinitionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .summarizeForPolicyDefinitionWithResponse(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "24813039-7534-408a-9842-eb99f45721b1",
                null,
                null,
                null,
                null,
                Context.NONE);
    }
}
```

### PolicyStates_SummarizeForPolicySetDefinition

```java
import com.azure.core.util.Context;
import java.time.OffsetDateTime;

/** Samples for PolicyStates SummarizeForPolicySetDefinition. */
public final class PolicyStatesSummarizeForPolicySetDefinitionSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_SummarizeSubscriptionLevelPolicySetDefinitionScope.json
     */
    /**
     * Sample code: Summarize at policy set definition scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void summarizeAtPolicySetDefinitionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .summarizeForPolicySetDefinitionWithResponse(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "3e3807c1-65c9-49e0-a406-82d8ae3e338c",
                1,
                OffsetDateTime.parse("2022-06-05T18:00:00Z"),
                OffsetDateTime.parse("2022-06-06T18:00:00Z"),
                "PolicyDefinitionAction eq 'deny'",
                Context.NONE);
    }
}
```

### PolicyStates_SummarizeForResource

```java
import com.azure.core.util.Context;

/** Samples for PolicyStates SummarizeForResource. */
public final class PolicyStatesSummarizeForResourceSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_SummarizeResourceScope.json
     */
    /**
     * Sample code: Summarize at resource scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void summarizeAtResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .summarizeForResourceWithResponse(
                "subscriptions/fff10b27-fff3-fff5-fff8-fffbe01e86a5/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/vaults/my-vault",
                2,
                null,
                null,
                null,
                Context.NONE);
    }
}
```

### PolicyStates_SummarizeForResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for PolicyStates SummarizeForResourceGroup. */
public final class PolicyStatesSummarizeForResourceGroupSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_SummarizeResourceGroupScope.json
     */
    /**
     * Sample code: Summarize at resource group scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void summarizeAtResourceGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .summarizeForResourceGroupWithResponse(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852", "myResourceGroup", null, null, null, null, Context.NONE);
    }
}
```

### PolicyStates_SummarizeForResourceGroupLevelPolicyAssignment

```java
import com.azure.core.util.Context;

/** Samples for PolicyStates SummarizeForResourceGroupLevelPolicyAssignment. */
public final class PolicyStatesSummarizeForResourceGroupLevelPolicyAssignmentSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_SummarizeResourceGroupLevelPolicyAssignmentScope.json
     */
    /**
     * Sample code: Summarize at policy assignment scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void summarizeAtPolicyAssignmentScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .summarizeForResourceGroupLevelPolicyAssignmentWithResponse(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "myResourceGroup",
                "b7a1ca2596524e3ab19597f2",
                null,
                null,
                null,
                null,
                Context.NONE);
    }
}
```

### PolicyStates_SummarizeForSubscription

```java
import com.azure.core.util.Context;

/** Samples for PolicyStates SummarizeForSubscription. */
public final class PolicyStatesSummarizeForSubscriptionSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_SummarizeSubscriptionScopeForPolicyGroup.json
     */
    /**
     * Sample code: Summarize at subscription scope for a policy definition group.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void summarizeAtSubscriptionScopeForAPolicyDefinitionGroup(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .summarizeForSubscriptionWithResponse(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                1,
                null,
                null,
                "'group1' IN PolicyDefinitionGroupNames",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_SummarizeSubscriptionScope.json
     */
    /**
     * Sample code: Summarize at subscription scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void summarizeAtSubscriptionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .summarizeForSubscriptionWithResponse(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852", 5, null, null, null, Context.NONE);
    }
}
```

### PolicyStates_SummarizeForSubscriptionLevelPolicyAssignment

```java
import com.azure.core.util.Context;

/** Samples for PolicyStates SummarizeForSubscriptionLevelPolicyAssignment. */
public final class PolicyStatesSummarizeForSubscriptionLevelPolicyAssignmentSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_SummarizeSubscriptionLevelPolicyAssignmentScope.json
     */
    /**
     * Sample code: Summarize at policy assignment scope.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void summarizeAtPolicyAssignmentScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .summarizeForSubscriptionLevelPolicyAssignmentWithResponse(
                "fffedd8f-ffff-fffd-fffd-fffed2f84852",
                "ec8f9645-8ecb-4abb-9c0b-5292f19d4003",
                null,
                null,
                null,
                null,
                Context.NONE);
    }
}
```

### PolicyStates_TriggerResourceGroupEvaluation

```java
import com.azure.core.util.Context;

/** Samples for PolicyStates TriggerResourceGroupEvaluation. */
public final class PolicyStatesTriggerResourceGroupEvaluationSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_TriggerResourceGroupEvaluation.json
     */
    /**
     * Sample code: Trigger evaluations for all resources in a resource group.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void triggerEvaluationsForAllResourcesInAResourceGroup(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager
            .policyStates()
            .triggerResourceGroupEvaluation("fffedd8f-ffff-fffd-fffd-fffed2f84852", "myResourceGroup", Context.NONE);
    }
}
```

### PolicyStates_TriggerSubscriptionEvaluation

```java
import com.azure.core.util.Context;

/** Samples for PolicyStates TriggerSubscriptionEvaluation. */
public final class PolicyStatesTriggerSubscriptionEvaluationSamples {
    /*
     * x-ms-original-file: specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2022-06-01/examples/PolicyStates_TriggerSubscriptionEvaluation.json
     */
    /**
     * Sample code: Trigger evaluations for all resources in a subscription.
     *
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void triggerEvaluationsForAllResourcesInASubscription(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.policyStates().triggerSubscriptionEvaluation("fffedd8f-ffff-fffd-fffd-fffed2f84852", Context.NONE);
    }
}
```

