# Code snippets and samples


## Operations

- [List](#operations_list)

## PlaywrightWorkspaces

- [CheckNameAvailability](#playwrightworkspaces_checknameavailability)
### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2025-07-01-preview/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to MicrosoftPlaywrightServiceManager.
     */
    public static void
        operationsList(com.azure.resourcemanager.playwrightservice.MicrosoftPlaywrightServiceManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### PlaywrightWorkspaces_CheckNameAvailability

```java
import com.azure.resourcemanager.playwrightservice.models.CheckNameAvailabilityRequest;

/**
 * Samples for PlaywrightWorkspaces CheckNameAvailability.
 */
public final class PlaywrightWorkspacesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: 2025-07-01-preview/PlaywrightWorkspaces_CheckNameAvailability.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_CheckNameAvailability.
     * 
     * @param manager Entry point to MicrosoftPlaywrightServiceManager.
     */
    public static void playwrightWorkspacesCheckNameAvailability(
        com.azure.resourcemanager.playwrightservice.MicrosoftPlaywrightServiceManager manager) {
        manager.playwrightWorkspaces()
            .checkNameAvailabilityWithResponse(new CheckNameAvailabilityRequest().withName("dummyName")
                .withType("Microsoft.LoadTestService/PlaywrightWorkspaces"), com.azure.core.util.Context.NONE);
    }
}
```

