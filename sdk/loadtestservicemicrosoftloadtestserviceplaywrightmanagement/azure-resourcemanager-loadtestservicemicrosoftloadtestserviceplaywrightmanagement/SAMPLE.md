# Code snippets and samples


## Operations

- [List](#operations_list)

## PlaywrightWorkspaces

- [CheckNameAvailability](#playwrightworkspaces_checknameavailability)
- [CreateOrUpdate](#playwrightworkspaces_createorupdate)
- [Delete](#playwrightworkspaces_delete)
- [GetByResourceGroup](#playwrightworkspaces_getbyresourcegroup)
- [List](#playwrightworkspaces_list)
- [ListByResourceGroup](#playwrightworkspaces_listbyresourcegroup)
- [Update](#playwrightworkspaces_update)
### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/Playwright.Management/preview/2025-07-01
     * -preview/examples/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to MicrosoftPlaywrightServiceManager.
     */
    public static void operationsList(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.MicrosoftPlaywrightServiceManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### PlaywrightWorkspaces_CheckNameAvailability

```java
import com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.models.CheckNameAvailabilityRequest;

/**
 * Samples for PlaywrightWorkspaces CheckNameAvailability.
 */
public final class PlaywrightWorkspacesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/Playwright.Management/preview/2025-07-01
     * -preview/examples/PlaywrightWorkspaces_CheckNameAvailability.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_CheckNameAvailability.
     * 
     * @param manager Entry point to MicrosoftPlaywrightServiceManager.
     */
    public static void playwrightWorkspacesCheckNameAvailability(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.MicrosoftPlaywrightServiceManager manager) {
        manager.playwrightWorkspaces()
            .checkNameAvailabilityWithResponse(new CheckNameAvailabilityRequest().withName("dummyName")
                .withType("Microsoft.LoadTestService/PlaywrightWorkspaces"), com.azure.core.util.Context.NONE);
    }
}
```

### PlaywrightWorkspaces_CreateOrUpdate

```java
import com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.models.EnablementStatus;
import com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.models.PlaywrightWorkspaceProperties;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PlaywrightWorkspaces CreateOrUpdate.
 */
public final class PlaywrightWorkspacesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/Playwright.Management/preview/2025-07-01
     * -preview/examples/PlaywrightWorkspaces_CreateOrUpdate.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_CreateOrUpdate.
     * 
     * @param manager Entry point to MicrosoftPlaywrightServiceManager.
     */
    public static void playwrightWorkspacesCreateOrUpdate(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.MicrosoftPlaywrightServiceManager manager) {
        manager.playwrightWorkspaces()
            .define("myWorkspace")
            .withRegion("westus3")
            .withExistingResourceGroup("dummyrg")
            .withTags(mapOf("Team", "Dev Exp"))
            .withProperties(new PlaywrightWorkspaceProperties().withRegionalAffinity(EnablementStatus.ENABLED)
                .withLocalAuth(EnablementStatus.ENABLED))
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

### PlaywrightWorkspaces_Delete

```java
/**
 * Samples for PlaywrightWorkspaces Delete.
 */
public final class PlaywrightWorkspacesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/Playwright.Management/preview/2025-07-01
     * -preview/examples/PlaywrightWorkspaces_Delete.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_Delete.
     * 
     * @param manager Entry point to MicrosoftPlaywrightServiceManager.
     */
    public static void playwrightWorkspacesDelete(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.MicrosoftPlaywrightServiceManager manager) {
        manager.playwrightWorkspaces().delete("dummyrg", "myWorkspace", com.azure.core.util.Context.NONE);
    }
}
```

### PlaywrightWorkspaces_GetByResourceGroup

```java
/**
 * Samples for PlaywrightWorkspaces GetByResourceGroup.
 */
public final class PlaywrightWorkspacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/Playwright.Management/preview/2025-07-01
     * -preview/examples/PlaywrightWorkspaces_Get.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_Get.
     * 
     * @param manager Entry point to MicrosoftPlaywrightServiceManager.
     */
    public static void playwrightWorkspacesGet(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.MicrosoftPlaywrightServiceManager manager) {
        manager.playwrightWorkspaces()
            .getByResourceGroupWithResponse("dummyrg", "myWorkspace", com.azure.core.util.Context.NONE);
    }
}
```

### PlaywrightWorkspaces_List

```java
/**
 * Samples for PlaywrightWorkspaces List.
 */
public final class PlaywrightWorkspacesListSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/Playwright.Management/preview/2025-07-01
     * -preview/examples/PlaywrightWorkspaces_ListBySubscription.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_ListBySubscription.
     * 
     * @param manager Entry point to MicrosoftPlaywrightServiceManager.
     */
    public static void playwrightWorkspacesListBySubscription(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.MicrosoftPlaywrightServiceManager manager) {
        manager.playwrightWorkspaces().list(com.azure.core.util.Context.NONE);
    }
}
```

### PlaywrightWorkspaces_ListByResourceGroup

```java
/**
 * Samples for PlaywrightWorkspaces ListByResourceGroup.
 */
public final class PlaywrightWorkspacesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/Playwright.Management/preview/2025-07-01
     * -preview/examples/PlaywrightWorkspaces_ListByResourceGroup.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_ListByResourceGroup.
     * 
     * @param manager Entry point to MicrosoftPlaywrightServiceManager.
     */
    public static void playwrightWorkspacesListByResourceGroup(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.MicrosoftPlaywrightServiceManager manager) {
        manager.playwrightWorkspaces().listByResourceGroup("dummyrg", com.azure.core.util.Context.NONE);
    }
}
```

### PlaywrightWorkspaces_Update

```java
import com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.models.EnablementStatus;
import com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.models.PlaywrightWorkspace;
import com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.models.PlaywrightWorkspaceUpdateProperties;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PlaywrightWorkspaces Update.
 */
public final class PlaywrightWorkspacesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/Playwright.Management/preview/2025-07-01
     * -preview/examples/PlaywrightWorkspaces_Update.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_Update.
     * 
     * @param manager Entry point to MicrosoftPlaywrightServiceManager.
     */
    public static void playwrightWorkspacesUpdate(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywrightmanagement.MicrosoftPlaywrightServiceManager manager) {
        PlaywrightWorkspace resource = manager.playwrightWorkspaces()
            .getByResourceGroupWithResponse("dummyrg", "myWorkspace", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("Division", "LT", "Team", "Dev Exp"))
            .withProperties(new PlaywrightWorkspaceUpdateProperties().withRegionalAffinity(EnablementStatus.DISABLED))
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

