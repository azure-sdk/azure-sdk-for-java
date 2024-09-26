# Code snippets and samples


## Remediations

- [CancelAtManagementGroup](#remediations_cancelatmanagementgroup)
- [CancelAtResource](#remediations_cancelatresource)
- [CancelAtResourceGroup](#remediations_cancelatresourcegroup)
- [CancelAtSubscription](#remediations_cancelatsubscription)
- [CreateOrUpdateAtManagementGroup](#remediations_createorupdateatmanagementgroup)
- [CreateOrUpdateAtResource](#remediations_createorupdateatresource)
- [CreateOrUpdateAtResourceGroup](#remediations_createorupdateatresourcegroup)
- [CreateOrUpdateAtSubscription](#remediations_createorupdateatsubscription)
- [Delete](#remediations_delete)
- [DeleteAtManagementGroup](#remediations_deleteatmanagementgroup)
- [DeleteAtResource](#remediations_deleteatresource)
- [DeleteAtSubscription](#remediations_deleteatsubscription)
- [GetAtManagementGroup](#remediations_getatmanagementgroup)
- [GetAtResource](#remediations_getatresource)
- [GetAtSubscription](#remediations_getatsubscription)
- [GetByResourceGroup](#remediations_getbyresourcegroup)
- [List](#remediations_list)
- [ListByResourceGroup](#remediations_listbyresourcegroup)
- [ListDeploymentsAtManagementGroup](#remediations_listdeploymentsatmanagementgroup)
- [ListDeploymentsAtResource](#remediations_listdeploymentsatresource)
- [ListDeploymentsAtResourceGroup](#remediations_listdeploymentsatresourcegroup)
- [ListDeploymentsAtSubscription](#remediations_listdeploymentsatsubscription)
- [ListForManagementGroup](#remediations_listformanagementgroup)
- [ListForResource](#remediations_listforresource)
### Remediations_CancelAtManagementGroup

```java
/**
 * Samples for Remediations CancelAtManagementGroup.
 */
public final class RemediationsCancelAtManagementGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_CancelManagementGroupScope.json
     */
    /**
     * Sample code: Cancel a remediation at management group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void cancelARemediationAtManagementGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .cancelAtManagementGroupWithResponse("financeMg", "myRemediation", com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_CancelAtResource

```java
/**
 * Samples for Remediations CancelAtResource.
 */
public final class RemediationsCancelAtResourceSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_CancelResourceScope.json
     */
    /**
     * Sample code: Cancel a remediation at individual resource scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void cancelARemediationAtIndividualResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .cancelAtResourceWithResponse(
                "subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourcegroups/myResourceGroup/providers/microsoft.storage/storageaccounts/storAc1",
                "myRemediation", com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_CancelAtResourceGroup

```java
/**
 * Samples for Remediations CancelAtResourceGroup.
 */
public final class RemediationsCancelAtResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_CancelResourceGroupScope.json
     */
    /**
     * Sample code: Cancel a remediation at resource group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        cancelARemediationAtResourceGroupScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .cancelAtResourceGroupWithResponse("myResourceGroup", "myRemediation", com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_CancelAtSubscription

```java
/**
 * Samples for Remediations CancelAtSubscription.
 */
public final class RemediationsCancelAtSubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_CancelSubscriptionScope.json
     */
    /**
     * Sample code: Cancel a remediation at subscription scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        cancelARemediationAtSubscriptionScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations().cancelAtSubscriptionWithResponse("myRemediation", com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_CreateOrUpdateAtManagementGroup

```java
import com.azure.resourcemanager.policyinsights.fluent.models.RemediationInner;

/**
 * Samples for Remediations CreateOrUpdateAtManagementGroup.
 */
public final class RemediationsCreateOrUpdateAtManagementGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_CreateManagementGroupScope.json
     */
    /**
     * Sample code: Create remediation at management group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void createRemediationAtManagementGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .createOrUpdateAtManagementGroupWithResponse("financeMg", "storageRemediation",
                new RemediationInner().withPolicyAssignmentId(
                    "/providers/microsoft.management/managementGroups/financeMg/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_CreateOrUpdateAtResource

```java
import com.azure.resourcemanager.policyinsights.fluent.models.RemediationInner;

/**
 * Samples for Remediations CreateOrUpdateAtResource.
 */
public final class RemediationsCreateOrUpdateAtResourceSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_CreateResourceScope.json
     */
    /**
     * Sample code: Create remediation at individual resource scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void createRemediationAtIndividualResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .createOrUpdateAtResourceWithResponse(
                "subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourcegroups/myResourceGroup/providers/microsoft.storage/storageaccounts/storAc1",
                "storageRemediation",
                new RemediationInner().withPolicyAssignmentId(
                    "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourceGroups/myResourceGroup/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_CreateOrUpdateAtResourceGroup

```java
/**
 * Samples for Remediations CreateOrUpdateAtResourceGroup.
 */
public final class RemediationsCreateOrUpdateAtResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_CreateResourceGroupScope.json
     */
    /**
     * Sample code: Create remediation at resource group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        createRemediationAtResourceGroupScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .define("storageRemediation")
            .withExistingResourceGroup("myResourceGroup")
            .withPolicyAssignmentId(
                "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourceGroups/myResourceGroup/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5")
            .create();
    }
}
```

### Remediations_CreateOrUpdateAtSubscription

```java
import com.azure.resourcemanager.policyinsights.fluent.models.RemediationInner;
import com.azure.resourcemanager.policyinsights.models.RemediationFilters;
import com.azure.resourcemanager.policyinsights.models.RemediationPropertiesFailureThreshold;
import com.azure.resourcemanager.policyinsights.models.ResourceDiscoveryMode;
import java.util.Arrays;

/**
 * Samples for Remediations CreateOrUpdateAtSubscription.
 */
public final class RemediationsCreateOrUpdateAtSubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_CreateSubscriptionScope.json
     */
    /**
     * Sample code: Create remediation at subscription scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        createRemediationAtSubscriptionScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .createOrUpdateAtSubscriptionWithResponse("storageRemediation",
                new RemediationInner().withPolicyAssignmentId(
                    "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_CreateSubscriptionScope_AllProperties.json
     */
    /**
     * Sample code: Create remediation at subscription scope with all properties.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void createRemediationAtSubscriptionScopeWithAllProperties(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .createOrUpdateAtSubscriptionWithResponse("storageRemediation",
                new RemediationInner().withPolicyAssignmentId(
                    "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5")
                    .withPolicyDefinitionReferenceId("8c8fa9e4")
                    .withResourceDiscoveryMode(ResourceDiscoveryMode.RE_EVALUATE_COMPLIANCE)
                    .withFilters(new RemediationFilters().withLocations(Arrays.asList("eastus", "westus")))
                    .withResourceCount(42)
                    .withParallelDeployments(6)
                    .withFailureThreshold(new RemediationPropertiesFailureThreshold().withPercentage(0.1F)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_CreateSubscriptionScope_ResourceIdsFilter.json
     */
    /**
     * Sample code: Create remediation at subscription scope with resourceIds filter.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void createRemediationAtSubscriptionScopeWithResourceIdsFilter(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .createOrUpdateAtSubscriptionWithResponse("storageRemediation", new RemediationInner()
                .withPolicyAssignmentId(
                    "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5")
                .withPolicyDefinitionReferenceId("8c8fa9e4")
                .withResourceDiscoveryMode(ResourceDiscoveryMode.EXISTING_NON_COMPLIANT)
                .withFilters(new RemediationFilters().withLocations(Arrays.asList("eastus", "westus"))
                    .withResourceIds(Arrays.asList(
                        "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourceGroups/res2627/providers/Microsoft.Storage/storageAccounts/sto1125",
                        "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourceGroups/testcmk3/providers/Microsoft.Storage/storageAccounts/sto3699",
                        "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourceGroups/res9407/providers/Microsoft.Storage/storageAccounts/sto8596",
                        "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourceGroups/testcmk3/providers/Microsoft.Storage/storageAccounts/sto6637",
                        "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourceGroups/res8186/providers/Microsoft.Storage/storageAccounts/sto834",
                        "/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourceGroups/testcmk3/providers/Microsoft.Storage/storageAccounts/sto9174")))
                .withResourceCount(42)
                .withParallelDeployments(6)
                .withFailureThreshold(new RemediationPropertiesFailureThreshold().withPercentage(0.1F)),
                com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_Delete

```java
/**
 * Samples for Remediations Delete.
 */
public final class RemediationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_DeleteResourceGroupScope.json
     */
    /**
     * Sample code: Delete remediation at resource group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        deleteRemediationAtResourceGroupScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .deleteByResourceGroupWithResponse("myResourceGroup", "storageRemediation",
                com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_DeleteAtManagementGroup

```java
/**
 * Samples for Remediations DeleteAtManagementGroup.
 */
public final class RemediationsDeleteAtManagementGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_DeleteManagementGroupScope.json
     */
    /**
     * Sample code: Delete remediation at management group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void deleteRemediationAtManagementGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .deleteAtManagementGroupWithResponse("financeMg", "storageRemediation", com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_DeleteAtResource

```java
/**
 * Samples for Remediations DeleteAtResource.
 */
public final class RemediationsDeleteAtResourceSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_DeleteResourceScope.json
     */
    /**
     * Sample code: Delete remediation at individual resource scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void deleteRemediationAtIndividualResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .deleteAtResourceWithResponse(
                "subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourcegroups/myResourceGroup/providers/microsoft.storage/storageaccounts/storAc1",
                "storageRemediation", com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_DeleteAtSubscription

```java
/**
 * Samples for Remediations DeleteAtSubscription.
 */
public final class RemediationsDeleteAtSubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_DeleteSubscriptionScope.json
     */
    /**
     * Sample code: Delete remediation at subscription scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        deleteRemediationAtSubscriptionScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations().deleteAtSubscriptionWithResponse("storageRemediation", com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_GetAtManagementGroup

```java
/**
 * Samples for Remediations GetAtManagementGroup.
 */
public final class RemediationsGetAtManagementGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_GetManagementGroupScope.json
     */
    /**
     * Sample code: Get remediation at management group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        getRemediationAtManagementGroupScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .getAtManagementGroupWithResponse("financeMg", "storageRemediation", com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_GetAtResource

```java
/**
 * Samples for Remediations GetAtResource.
 */
public final class RemediationsGetAtResourceSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_GetResourceScope.json
     */
    /**
     * Sample code: Get remediation at individual resource scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void getRemediationAtIndividualResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .getAtResourceWithResponse(
                "subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourcegroups/myResourceGroup/providers/microsoft.storage/storageaccounts/storAc1",
                "storageRemediation", com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_GetAtSubscription

```java
/**
 * Samples for Remediations GetAtSubscription.
 */
public final class RemediationsGetAtSubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_GetSubscriptionScope.json
     */
    /**
     * Sample code: Get remediation at subscription scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        getRemediationAtSubscriptionScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations().getAtSubscriptionWithResponse("storageRemediation", com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_GetByResourceGroup

```java
/**
 * Samples for Remediations GetByResourceGroup.
 */
public final class RemediationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_GetResourceGroupScope.json
     */
    /**
     * Sample code: Get remediation at resource group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        getRemediationAtResourceGroupScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .getByResourceGroupWithResponse("myResourceGroup", "storageRemediation", com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_List

```java
/**
 * Samples for Remediations List.
 */
public final class RemediationsListSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListSubscriptionScope_WithQuery.json
     */
    /**
     * Sample code: List remediations at subscription scope with query parameters.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listRemediationsAtSubscriptionScopeWithQueryParameters(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .list(1,
                "PolicyAssignmentId eq '/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5' AND PolicyDefinitionReferenceId eq 'storageSkuDef'",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListSubscriptionScope.json
     */
    /**
     * Sample code: List remediations at subscription scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        listRemediationsAtSubscriptionScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations().list(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_ListByResourceGroup

```java
/**
 * Samples for Remediations ListByResourceGroup.
 */
public final class RemediationsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListResourceGroupScope_WithQuery.json
     */
    /**
     * Sample code: List remediations at resource group scope with query parameters.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listRemediationsAtResourceGroupScopeWithQueryParameters(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .listByResourceGroup("myResourceGroup", 1,
                "PolicyAssignmentId eq '/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourceGroups/myResourceGroup/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5'",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListResourceGroupScope.json
     */
    /**
     * Sample code: List remediations at resource group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        listRemediationsAtResourceGroupScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations().listByResourceGroup("myResourceGroup", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_ListDeploymentsAtManagementGroup

```java
/**
 * Samples for Remediations ListDeploymentsAtManagementGroup.
 */
public final class RemediationsListDeploymentsAtManagementGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListDeploymentsManagementGroupScope.json
     */
    /**
     * Sample code: List deployments for a remediation at management group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listDeploymentsForARemediationAtManagementGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .listDeploymentsAtManagementGroup("financeMg", "myRemediation", null, com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_ListDeploymentsAtResource

```java
/**
 * Samples for Remediations ListDeploymentsAtResource.
 */
public final class RemediationsListDeploymentsAtResourceSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListDeploymentsResourceScope.json
     */
    /**
     * Sample code: List deployments for a remediation at individual resource scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listDeploymentsForARemediationAtIndividualResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .listDeploymentsAtResource(
                "subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourcegroups/myResourceGroup/providers/microsoft.storage/storageaccounts/storAc1",
                "myRemediation", null, com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_ListDeploymentsAtResourceGroup

```java
/**
 * Samples for Remediations ListDeploymentsAtResourceGroup.
 */
public final class RemediationsListDeploymentsAtResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListDeploymentsResourceGroupScope.json
     */
    /**
     * Sample code: List deployments for a remediation at resource group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listDeploymentsForARemediationAtResourceGroupScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .listDeploymentsAtResourceGroup("myResourceGroup", "myRemediation", null, com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_ListDeploymentsAtSubscription

```java
/**
 * Samples for Remediations ListDeploymentsAtSubscription.
 */
public final class RemediationsListDeploymentsAtSubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListDeploymentsSubscriptionScope.json
     */
    /**
     * Sample code: List deployments for a remediation at subscription scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listDeploymentsForARemediationAtSubscriptionScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations().listDeploymentsAtSubscription("myRemediation", null, com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_ListForManagementGroup

```java
/**
 * Samples for Remediations ListForManagementGroup.
 */
public final class RemediationsListForManagementGroupSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListManagementGroupScope.json
     */
    /**
     * Sample code: List remediations at management group scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void
        listRemediationsAtManagementGroupScope(com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations().listForManagementGroup("financeMg", null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListManagementGroupScope_WithQuery.json
     */
    /**
     * Sample code: List remediations at management group scope with query parameters.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listRemediationsAtManagementGroupScopeWithQueryParameters(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .listForManagementGroup("financeMg", 1,
                "PolicyAssignmentId eq '/providers/microsoft.management/managementGroups/financeMg/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5'",
                com.azure.core.util.Context.NONE);
    }
}
```

### Remediations_ListForResource

```java
/**
 * Samples for Remediations ListForResource.
 */
public final class RemediationsListForResourceSamples {
    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListResourceScope.json
     */
    /**
     * Sample code: List remediations at individual resource scope.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listRemediationsAtIndividualResourceScope(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .listForResource(
                "subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourcegroups/myResourceGroup/providers/microsoft.storage/storageaccounts/storAc1",
                null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/policyinsights/resource-manager/Microsoft.PolicyInsights/stable/2024-10-01/examples/
     * Remediations_ListResourceScope_WithQuery.json
     */
    /**
     * Sample code: List remediations at individual resource scope with query parameters.
     * 
     * @param manager Entry point to PolicyInsightsManager.
     */
    public static void listRemediationsAtIndividualResourceScopeWithQueryParameters(
        com.azure.resourcemanager.policyinsights.PolicyInsightsManager manager) {
        manager.remediations()
            .listForResource(
                "subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/resourcegroups/myResourceGroup/providers/microsoft.storage/storageaccounts/storAc1",
                1,
                "PolicyAssignmentId eq '/subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/providers/microsoft.authorization/policyassignments/b101830944f246d8a14088c5'",
                com.azure.core.util.Context.NONE);
    }
}
```

