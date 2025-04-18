# Code snippets and samples


## PlaywrightWorkspaces

- [CheckNameAvailability](#playwrightworkspaces_checknameavailability)
- [CreateOrUpdate](#playwrightworkspaces_createorupdate)
- [Delete](#playwrightworkspaces_delete)
- [GetByResourceGroup](#playwrightworkspaces_getbyresourcegroup)
- [List](#playwrightworkspaces_list)
- [ListByResourceGroup](#playwrightworkspaces_listbyresourcegroup)
- [Update](#playwrightworkspaces_update)
### PlaywrightWorkspaces_CheckNameAvailability

```java
import com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywright.models.EnablementStatus;
import com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywright.models.PlaywrightWorkspace;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PlaywrightWorkspaces Update.
 */
public final class PlaywrightWorkspacesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/playwright/preview/2025-07-01-preview/
     * examples/PlaywrightWorkspaces_Update.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_Update.
     * 
     * @param manager Entry point to PlaywrightServiceManager.
     */
    public static void playwrightWorkspacesUpdate(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywright.PlaywrightServiceManager manager) {
        PlaywrightWorkspace resource = manager.playwrightWorkspaces()
            .getByResourceGroupWithResponse("dummyrg", "myWorkspace", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("Division", "LT", "Team", "Dev Exp"))
            .withRegionalAffinity(EnablementStatus.DISABLED)
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

### PlaywrightWorkspaces_CreateOrUpdate

```java
import com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywright.models.CheckNameAvailabilityRequest;

/**
 * Samples for PlaywrightWorkspaces CheckNameAvailability.
 */
public final class PlaywrightWorkspacesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/playwright/preview/2025-07-01-preview/
     * examples/PlaywrightWorkspaces_CheckNameAvailability.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_CheckNameAvailability.
     * 
     * @param manager Entry point to PlaywrightServiceManager.
     */
    public static void playwrightWorkspacesCheckNameAvailability(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywright.PlaywrightServiceManager manager) {
        manager.playwrightWorkspaces()
            .checkNameAvailabilityWithResponse(new CheckNameAvailabilityRequest().withName("dummyName")
                .withType("Microsoft.LoadTestService/PlaywrightWorkspaces"), com.azure.core.util.Context.NONE);
    }
}
```

### PlaywrightWorkspaces_Delete

```java
/**
 * Samples for PlaywrightWorkspaces GetByResourceGroup.
 */
public final class PlaywrightWorkspacesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/playwright/preview/2025-07-01-preview/
     * examples/PlaywrightWorkspaces_Get.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_Get.
     * 
     * @param manager Entry point to PlaywrightServiceManager.
     */
    public static void playwrightWorkspacesGet(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywright.PlaywrightServiceManager manager) {
        manager.playwrightWorkspaces()
            .getByResourceGroupWithResponse("dummyrg", "myWorkspace", com.azure.core.util.Context.NONE);
    }
}
```

### PlaywrightWorkspaces_GetByResourceGroup

```java
/**
 * Samples for PlaywrightWorkspaces Delete.
 */
public final class PlaywrightWorkspacesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/playwright/preview/2025-07-01-preview/
     * examples/PlaywrightWorkspaces_Delete.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_Delete.
     * 
     * @param manager Entry point to PlaywrightServiceManager.
     */
    public static void playwrightWorkspacesDelete(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywright.PlaywrightServiceManager manager) {
        manager.playwrightWorkspaces().delete("dummyrg", "myWorkspace", com.azure.core.util.Context.NONE);
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
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/playwright/preview/2025-07-01-preview/
     * examples/PlaywrightWorkspaces_ListBySubscription.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_ListBySubscription.
     * 
     * @param manager Entry point to PlaywrightServiceManager.
     */
    public static void playwrightWorkspacesListBySubscription(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywright.PlaywrightServiceManager manager) {
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
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/playwright/preview/2025-07-01-preview/
     * examples/PlaywrightWorkspaces_ListByResourceGroup.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_ListByResourceGroup.
     * 
     * @param manager Entry point to PlaywrightServiceManager.
     */
    public static void playwrightWorkspacesListByResourceGroup(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywright.PlaywrightServiceManager manager) {
        manager.playwrightWorkspaces().listByResourceGroup("dummyrg", com.azure.core.util.Context.NONE);
    }
}
```

### PlaywrightWorkspaces_Update

```java
import com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywright.models.EnablementStatus;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PlaywrightWorkspaces CreateOrUpdate.
 */
public final class PlaywrightWorkspacesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/loadtestservice/resource-manager/Microsoft.LoadTestService/playwright/preview/2025-07-01-preview/
     * examples/PlaywrightWorkspaces_CreateOrUpdate.json
     */
    /**
     * Sample code: PlaywrightWorkspaces_CreateOrUpdate.
     * 
     * @param manager Entry point to PlaywrightServiceManager.
     */
    public static void playwrightWorkspacesCreateOrUpdate(
        com.azure.resourcemanager.loadtestservicemicrosoftloadtestserviceplaywright.PlaywrightServiceManager manager) {
        manager.playwrightWorkspaces()
            .define("myWorkspace")
            .withRegion("westus3")
            .withExistingResourceGroup("dummyrg")
            .withTags(mapOf("Team", "Dev Exp"))
            .withRegionalAffinity(EnablementStatus.ENABLED)
            .withLocalAuth(EnablementStatus.ENABLED)
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

