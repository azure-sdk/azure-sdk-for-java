# Code snippets and samples


## Diagnostics

- [CheckNameAvailability](#diagnostics_checknameavailability)
- [Create](#diagnostics_create)
- [Get](#diagnostics_get)

## DiscoverySolution

- [List](#discoverysolution_list)

## Operations

- [List](#operations_list)
### Diagnostics_CheckNameAvailability

```java
import com.azure.resourcemanager.selfhelp.models.CheckNameAvailabilityRequest;

/** Samples for Diagnostics CheckNameAvailability. */
public final class DiagnosticsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/help/resource-manager/Microsoft.Help/stable/2023-06-01/examples/CheckNameAvailabilityForDiagnosticWhenNameIsNotAvailable.json
     */
    /**
     * Sample code: Example when name is not available for a Diagnostic resource.
     *
     * @param manager Entry point to SelfHelpManager.
     */
    public static void exampleWhenNameIsNotAvailableForADiagnosticResource(
        com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager
            .diagnostics()
            .checkNameAvailabilityWithResponse(
                "subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6",
                new CheckNameAvailabilityRequest().withName("sampleName").withType("Microsoft.Help/diagnostics"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/help/resource-manager/Microsoft.Help/stable/2023-06-01/examples/CheckNameAvailabilityForDiagnosticWhenNameIsAvailable.json
     */
    /**
     * Sample code: Example when name is available for a Diagnostic resource.
     *
     * @param manager Entry point to SelfHelpManager.
     */
    public static void exampleWhenNameIsAvailableForADiagnosticResource(
        com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager
            .diagnostics()
            .checkNameAvailabilityWithResponse(
                "subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6",
                new CheckNameAvailabilityRequest().withName("sampleName").withType("Microsoft.Help/diagnostics"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Diagnostics_Create

```java
import com.azure.resourcemanager.selfhelp.models.DiagnosticInvocation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Diagnostics Create. */
public final class DiagnosticsCreateSamples {
    /*
     * x-ms-original-file: specification/help/resource-manager/Microsoft.Help/stable/2023-06-01/examples/CreateDiagnosticForKeyVaultResource.json
     */
    /**
     * Sample code: Creates a Diagnostic for a KeyVault resource.
     *
     * @param manager Entry point to SelfHelpManager.
     */
    public static void createsADiagnosticForAKeyVaultResource(
        com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager
            .diagnostics()
            .define("VMNotWorkingInsight")
            .withExistingScope(
                "subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read")
            .withGlobalParameters(mapOf("startTime", "2020-07-01"))
            .withInsights(
                Arrays
                    .asList(
                        new DiagnosticInvocation()
                            .withSolutionId("SampleSolutionId")
                            .withAdditionalParameters(mapOf("serverName", "testServer"))))
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

### Diagnostics_Get

```java
/** Samples for Diagnostics Get. */
public final class DiagnosticsGetSamples {
    /*
     * x-ms-original-file: specification/help/resource-manager/Microsoft.Help/stable/2023-06-01/examples/GetDiagnosticForKeyVaultResource.json
     */
    /**
     * Sample code: Gets a Diagnostic for a KeyVault resource.
     *
     * @param manager Entry point to SelfHelpManager.
     */
    public static void getsADiagnosticForAKeyVaultResource(com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager
            .diagnostics()
            .getWithResponse(
                "subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read",
                "VMNotWorkingInsight",
                com.azure.core.util.Context.NONE);
    }
}
```

### DiscoverySolution_List

```java
/** Samples for DiscoverySolution List. */
public final class DiscoverySolutionListSamples {
    /*
     * x-ms-original-file: specification/help/resource-manager/Microsoft.Help/stable/2023-06-01/examples/ListDiscoverySolutionsForKeyVaultResource.json
     */
    /**
     * Sample code: List DiscoverySolutions for a KeyVault resource.
     *
     * @param manager Entry point to SelfHelpManager.
     */
    public static void listDiscoverySolutionsForAKeyVaultResource(
        com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager
            .discoverySolutions()
            .list(
                "subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read",
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/help/resource-manager/Microsoft.Help/stable/2023-06-01/examples/ListOperations.json
     */
    /**
     * Sample code: List All Operations.
     *
     * @param manager Entry point to SelfHelpManager.
     */
    public static void listAllOperations(com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

