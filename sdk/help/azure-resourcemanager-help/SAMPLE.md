# Code snippets and samples


## CheckNameAvailabilityOperationGroup

- [CheckAvailability](#checknameavailabilityoperationgroup_checkavailability)

## DiagnosticResources

- [Create](#diagnosticresources_create)
- [Get](#diagnosticresources_get)

## DiscoverySolutionNLPOperationGroup

- [DiscoverSolutions](#discoverysolutionnlpoperationgroup_discoversolutions)
- [DiscoverSolutionsBySubscription](#discoverysolutionnlpoperationgroup_discoversolutionsbysubscription)

## DiscoverySolutionOperationGroup

- [List](#discoverysolutionoperationgroup_list)

## Operations

- [List](#operations_list)

## SimplifiedSolutionsResources

- [Create](#simplifiedsolutionsresources_create)
- [Get](#simplifiedsolutionsresources_get)

## SolutionResourceSelfHelps

- [Get](#solutionresourceselfhelps_get)

## SolutionResources

- [Create](#solutionresources_create)
- [Get](#solutionresources_get)
- [Update](#solutionresources_update)
- [WarmUp](#solutionresources_warmup)

## TroubleshooterResources

- [ContinueMethod](#troubleshooterresources_continuemethod)
- [Create](#troubleshooterresources_create)
- [End](#troubleshooterresources_end)
- [Get](#troubleshooterresources_get)
- [Restart](#troubleshooterresources_restart)
### CheckNameAvailabilityOperationGroup_CheckAvailability

```java
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SimplifiedSolutionsResources Create.
 */
public final class SimplifiedSolutionsResourcesCreateSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/SimplifiedSolutions_Create.json
     */
    /**
     * Sample code: Solution_Create.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void solutionCreate(com.azure.resourcemanager.help.HelpManager manager) {
        manager.simplifiedSolutionsResources()
            .define("simplifiedSolutionsResourceName1")
            .withExistingScope(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp")
            .withSolutionId("sampleSolutionId")
            .withParameters(mapOf("resourceUri",
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp"))
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

### DiagnosticResources_Create

```java

/**
 * Samples for SolutionResources WarmUp.
 */
public final class SolutionResourcesWarmUpSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/Solution_WarmUp.json
     */
    /**
     * Sample code: Solution_WarmUp.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void solutionWarmUp(com.azure.resourcemanager.help.HelpManager manager) {
        manager.solutionResources()
            .warmUpWithResponse(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp",
                "SolutionResourceName1", null, com.azure.core.util.Context.NONE);
    }
}
```

### DiagnosticResources_Get

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/ListOperations.json
     */
    /**
     * Sample code: List All Operations.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void listAllOperations(com.azure.resourcemanager.help.HelpManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### DiscoverySolutionNLPOperationGroup_DiscoverSolutions

```java
import com.azure.resourcemanager.help.models.ContinueRequestBody;
import com.azure.resourcemanager.help.models.QuestionType;
import com.azure.resourcemanager.help.models.TroubleshooterResponse;
import java.util.Arrays;

/**
 * Samples for TroubleshooterResources ContinueMethod.
 */
public final class TroubleshooterResourcesContinueMethodSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/Troubleshooter_Continue.json
     */
    /**
     * Sample code: Troubleshooter_Continue.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void troubleshooterContinue(com.azure.resourcemanager.help.HelpManager manager) {
        manager.troubleshooterResources()
            .continueMethodWithResponse(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp",
                "abf168ed-1b54-454a-86f6-e4b62253d3b1",
                new ContinueRequestBody().withStepId("SampleStepId")
                    .withResponses(Arrays.asList(new TroubleshooterResponse().withQuestionId("SampleQuestionId")
                        .withQuestionType(QuestionType.fromString("Text"))
                        .withResponse("Connection exception"))),
                com.azure.core.util.Context.NONE);
    }
}
```

### DiscoverySolutionNLPOperationGroup_DiscoverSolutionsBySubscription

```java
/**
 * Samples for DiagnosticResources Create.
 */
public final class DiagnosticResourcesCreateSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/CreateDiagnosticForKeyVaultResource.json
     */
    /**
     * Sample code: Creates a Diagnostic for a KeyVault resource.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void createsADiagnosticForAKeyVaultResource(com.azure.resourcemanager.help.HelpManager manager) {
        manager.diagnosticResources()
            .define("VMNotWorkingInsight")
            .withExistingScope(
                "subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourceGroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read")
            .create();
    }
}
```

### DiscoverySolutionOperationGroup_List

```java
/**
 * Samples for TroubleshooterResources Restart.
 */
public final class TroubleshooterResourcesRestartSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/Troubleshooter_Restart.json
     */
    /**
     * Sample code: Troubleshooters_Restart.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void troubleshootersRestart(com.azure.resourcemanager.help.HelpManager manager) {
        manager.troubleshooterResources()
            .restartWithResponse(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp",
                "abf168ed-1b54-454a-86f6-e4b62253d3b1", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.resourcemanager.help.models.DiscoveryNlpRequest;

/**
 * Samples for DiscoverySolutionNLPOperationGroup DiscoverSolutions.
 */
public final class DiscoverySolutionNLPOperationGroupDiscoverSolutionsSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/DiscoverSolutionsAtTenantScope.json
     */
    /**
     * Sample code: Discovery Solutions using issue summary and service id.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void
        discoverySolutionsUsingIssueSummaryAndServiceId(com.azure.resourcemanager.help.HelpManager manager) {
        manager.discoverySolutionNLPOperationGroups()
            .discoverSolutionsWithResponse(
                new DiscoveryNlpRequest().withIssueSummary("how to retrieve certs from deleted keyvault.")
                    .withServiceId("0d0fcd2e-c4fd-4349-8497-200edb39s3ca"),
                com.azure.core.util.Context.NONE);
    }
}
```

### SimplifiedSolutionsResources_Create

```java
import com.azure.resourcemanager.help.models.CheckNameAvailabilityRequest;

/**
 * Samples for CheckNameAvailabilityOperationGroup CheckAvailability.
 */
public final class CheckNameAvailabilityOperationGroupCheckAvailabilitySamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/CheckNameAvailabilityForDiagnosticWhenNameIsNotAvailable.json
     */
    /**
     * Sample code: Example when name is not available for a Diagnostic resource.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void
        exampleWhenNameIsNotAvailableForADiagnosticResource(com.azure.resourcemanager.help.HelpManager manager) {
        manager.checkNameAvailabilityOperationGroups()
            .checkAvailabilityWithResponse("subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6",
                new CheckNameAvailabilityRequest().withName("sampleName").withType("Microsoft.Help/diagnostics"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-03-01-preview/CheckNameAvailabilityForDiagnosticWhenNameIsAvailable.json
     */
    /**
     * Sample code: Example when name is available for a Diagnostic resource.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void
        exampleWhenNameIsAvailableForADiagnosticResource(com.azure.resourcemanager.help.HelpManager manager) {
        manager.checkNameAvailabilityOperationGroups()
            .checkAvailabilityWithResponse("subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6",
                new CheckNameAvailabilityRequest().withName("sampleName").withType("Microsoft.Help/diagnostics"),
                com.azure.core.util.Context.NONE);
    }
}
```

### SimplifiedSolutionsResources_Get

```java
/**
 * Samples for DiagnosticResources Get.
 */
public final class DiagnosticResourcesGetSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/GetDiagnosticForKeyVaultResource.json
     */
    /**
     * Sample code: Gets a Diagnostic for a KeyVault resource.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void getsADiagnosticForAKeyVaultResource(com.azure.resourcemanager.help.HelpManager manager) {
        manager.diagnosticResources()
            .getWithResponse(
                "subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourceGroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read",
                "VMNotWorkingInsight", com.azure.core.util.Context.NONE);
    }
}
```

### SolutionResourceSelfHelps_Get

```java
/**
 * Samples for DiscoverySolutionOperationGroup List.
 */
public final class DiscoverySolutionOperationGroupListSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/ListDiscoverySolutionsAtTenantScope.json
     */
    /**
     * Sample code: List DiscoverySolutions at resource scope.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void listDiscoverySolutionsAtResourceScope(com.azure.resourcemanager.help.HelpManager manager) {
        manager.discoverySolutionOperationGroups()
            .list("ProblemClassificationId eq 'SampleProblemClassificationId1'", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### SolutionResources_Create

```java
import com.azure.resourcemanager.help.models.SolutionResource;

/**
 * Samples for SolutionResources Update.
 */
public final class SolutionResourcesUpdateSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/Solution_Update.json
     */
    /**
     * Sample code: Solution_Update.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void solutionUpdate(com.azure.resourcemanager.help.HelpManager manager) {
        SolutionResource resource = manager.solutionResources()
            .getWithResponse(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp",
                "SolutionResourceName1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### SolutionResources_Get

```java
/**
 * Samples for SimplifiedSolutionsResources Get.
 */
public final class SimplifiedSolutionsResourcesGetSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/SimplifiedSolutions_Get.json
     */
    /**
     * Sample code: Solution_Get.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void solutionGet(com.azure.resourcemanager.help.HelpManager manager) {
        manager.simplifiedSolutionsResources()
            .getWithResponse(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp",
                "simplifiedSolutionsResourceName1", com.azure.core.util.Context.NONE);
    }
}
```

### SolutionResources_Update

```java
import com.azure.resourcemanager.help.models.Name;
import com.azure.resourcemanager.help.models.TriggerCriterion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SolutionResources Create.
 */
public final class SolutionResourcesCreateSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/Solution_Create.json
     */
    /**
     * Sample code: Solution_Create.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void solutionCreate(com.azure.resourcemanager.help.HelpManager manager) {
        manager.solutionResources()
            .define("SolutionResourceName1")
            .withExistingScope(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp")
            .withTriggerCriteria(
                Arrays.asList(new TriggerCriterion().withName(Name.SOLUTION_ID).withValue("SolutionId1")))
            .withParameters(mapOf("resourceUri",
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp"))
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

### SolutionResources_WarmUp

```java
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for TroubleshooterResources Create.
 */
public final class TroubleshooterResourcesCreateSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/Troubleshooter_Create.json
     */
    /**
     * Sample code: Troubleshooters_Create.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void troubleshootersCreate(com.azure.resourcemanager.help.HelpManager manager) {
        manager.troubleshooterResources()
            .define("abf168ed-1b54-454a-86f6-e4b62253d3b1")
            .withExistingScope(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp")
            .withSolutionId("SampleTroubleshooterSolutionId")
            .withParameters(mapOf("ResourceURI",
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp"))
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

### TroubleshooterResources_ContinueMethod

```java
/**
 * Samples for TroubleshooterResources Get.
 */
public final class TroubleshooterResourcesGetSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/Troubleshooter_Get.json
     */
    /**
     * Sample code: Troubleshooters_Get.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void troubleshootersGet(com.azure.resourcemanager.help.HelpManager manager) {
        manager.troubleshooterResources()
            .getWithResponse(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp",
                "abf168ed-1b54-454a-86f6-e4b62253d3b1", com.azure.core.util.Context.NONE);
    }
}
```

### TroubleshooterResources_Create

```java
/**
 * Samples for TroubleshooterResources End.
 */
public final class TroubleshooterResourcesEndSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/Troubleshooter_End.json
     */
    /**
     * Sample code: Troubleshooters_End.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void troubleshootersEnd(com.azure.resourcemanager.help.HelpManager manager) {
        manager.troubleshooterResources()
            .endWithResponse(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp",
                "abf168ed-1b54-454a-86f6-e4b62253d3b1", com.azure.core.util.Context.NONE);
    }
}
```

### TroubleshooterResources_End

```java
import com.azure.resourcemanager.help.models.DiscoveryNlpRequest;

/**
 * Samples for DiscoverySolutionNLPOperationGroup DiscoverSolutionsBySubscription.
 */
public final class DiscoverySolutionNLPOperationGroupDiscoverSolutionsBySubscriptionSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/DiscoverSolutionsAtSubscriptionScope.json
     */
    /**
     * Sample code: Discovery Solutions using issue summary and service id.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void
        discoverySolutionsUsingIssueSummaryAndServiceId(com.azure.resourcemanager.help.HelpManager manager) {
        manager.discoverySolutionNLPOperationGroups()
            .discoverSolutionsBySubscriptionWithResponse(new DiscoveryNlpRequest()
                .withIssueSummary("how to retrieve certs from deleted keyvault.")
                .withResourceId(
                    "subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourceGroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read")
                .withServiceId("0d0fcd2e-c4fd-4349-8497-200edb39s3ca"), com.azure.core.util.Context.NONE);
    }
}
```

### TroubleshooterResources_Get

```java
/**
 * Samples for SolutionResources Get.
 */
public final class SolutionResourcesGetSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/Solution_Get.json
     */
    /**
     * Sample code: Solution_Get.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void solutionGet(com.azure.resourcemanager.help.HelpManager manager) {
        manager.solutionResources()
            .getWithResponse(
                "subscriptions/mySubscription/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-rp",
                "SolutionResource1", com.azure.core.util.Context.NONE);
    }
}
```

### TroubleshooterResources_Restart

```java
/**
 * Samples for SolutionResourceSelfHelps Get.
 */
public final class SolutionResourceSelfHelpsGetSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/SelfHelpSolution_Get.json
     */
    /**
     * Sample code: Solution_Get.
     * 
     * @param manager Entry point to HelpManager.
     */
    public static void solutionGet(com.azure.resourcemanager.help.HelpManager manager) {
        manager.solutionResourceSelfHelps().getWithResponse("SolutionId1", com.azure.core.util.Context.NONE);
    }
}
```

