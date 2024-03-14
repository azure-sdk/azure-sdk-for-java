# Code snippets and samples


## Linker

- [Delete](#linker_delete)
- [Get](#linker_get)
- [ListConfigurations](#linker_listconfigurations)
- [Update](#linker_update)
- [Validate](#linker_validate)

## Operations

- [List](#operations_list)
### Linker_Delete

```java
/**
 * Samples for Linker Delete.
 */
public final class LinkerDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/DeleteLink.json
     */
    /**
     * Sample code: DeleteLink.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void deleteLink(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.linkers().delete(
            "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
            "linkName", com.azure.core.util.Context.NONE);
    }
}
```

### Linker_Get

```java
/**
 * Samples for Linker Get.
 */
public final class LinkerGetSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/Link.json
     */
    /**
     * Sample code: Link.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void link(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.linkers().getWithResponse(
            "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
            "linkName", com.azure.core.util.Context.NONE);
    }
}
```

### Linker_ListConfigurations

```java
/**
 * Samples for Linker ListConfigurations.
 */
public final class LinkerListConfigurationsSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/GetConfigurations
     * .json
     */
    /**
     * Sample code: GetConfiguration.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void getConfiguration(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.linkers().listConfigurationsWithResponse(
            "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
            "linkName", com.azure.core.util.Context.NONE);
    }
}
```

### Linker_Update

```java
import com.azure.resourcemanager.servicelinker.models.AzureResource;
import com.azure.resourcemanager.servicelinker.models.LinkerPatch;
import com.azure.resourcemanager.servicelinker.models.ServicePrincipalSecretAuthInfo;

/**
 * Samples for Linker Update.
 */
public final class LinkerUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/PatchLink.json
     */
    /**
     * Sample code: PatchLink.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void patchLink(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.linkers().update(
            "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
            "linkName",
            new LinkerPatch().withTargetService(new AzureResource().withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.DocumentDb/databaseAccounts/test-acc/mongodbDatabases/test-db"))
                .withAuthInfo(new ServicePrincipalSecretAuthInfo().withClientId("name").withPrincipalId("id")
                    .withSecret("fakeTokenPlaceholder")),
            com.azure.core.util.Context.NONE);
    }
}
```

### Linker_Validate

```java
/**
 * Samples for Linker Validate.
 */
public final class LinkerValidateSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/
     * ValidateLinkSuccess.json
     */
    /**
     * Sample code: ValidateLinkSuccess.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void validateLinkSuccess(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.linkers().validate(
            "subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Web/sites/test-app",
            "linkName", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/servicelinker/resource-manager/Microsoft.ServiceLinker/stable/2022-05-01/examples/OperationsList.
     * json
     */
    /**
     * Sample code: GetConfiguration.
     * 
     * @param manager Entry point to ServiceLinkerManager.
     */
    public static void getConfiguration(com.azure.resourcemanager.servicelinker.ServiceLinkerManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

