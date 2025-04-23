# Code snippets and samples


## Authorities

- [CreateOrUpdate](#authorities_createorupdate)
- [Delete](#authorities_delete)
- [GetByResourceGroup](#authorities_getbyresourcegroup)
- [List](#authorities_list)
- [ListByResourceGroup](#authorities_listbyresourcegroup)
- [Update](#authorities_update)

## Operations

- [List](#operations_list)
### Authorities_CreateOrUpdate

```java
/**
 * Samples for Authorities CreateOrUpdate.
 */
public final class AuthoritiesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/verifiedid/resource-manager/Microsoft.VerifiedId/preview/2024-01-26-preview/examples/
     * Authorities_CreateOrUpdate.json
     */
    /**
     * Sample code: CreateAuthority.
     * 
     * @param manager Entry point to VerifiedIdManager.
     */
    public static void createAuthority(com.azure.resourcemanager.verifiedid.VerifiedIdManager manager) {
        manager.authorities()
            .define("00000000-0000-0000-0000-000000000111")
            .withRegion("westus")
            .withExistingResourceGroup("testrg")
            .create();
    }
}
```

### Authorities_Delete

```java
/**
 * Samples for Authorities List.
 */
public final class AuthoritiesListSamples {
    /*
     * x-ms-original-file:
     * specification/verifiedid/resource-manager/Microsoft.VerifiedId/preview/2024-01-26-preview/examples/
     * Authorities_ListBySubscription.json
     */
    /**
     * Sample code: Authorities_ListBySubscription.
     * 
     * @param manager Entry point to VerifiedIdManager.
     */
    public static void authoritiesListBySubscription(com.azure.resourcemanager.verifiedid.VerifiedIdManager manager) {
        manager.authorities().list(com.azure.core.util.Context.NONE);
    }
}
```

### Authorities_GetByResourceGroup

```java
/**
 * Samples for Authorities Delete.
 */
public final class AuthoritiesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/verifiedid/resource-manager/Microsoft.VerifiedId/preview/2024-01-26-preview/examples/
     * Authorities_Delete.json
     */
    /**
     * Sample code: DeleteAuthority.
     * 
     * @param manager Entry point to VerifiedIdManager.
     */
    public static void deleteAuthority(com.azure.resourcemanager.verifiedid.VerifiedIdManager manager) {
        manager.authorities()
            .deleteByResourceGroupWithResponse("testrg", "00000000-0000-0000-0000-000000000111",
                com.azure.core.util.Context.NONE);
    }
}
```

### Authorities_List

```java
import com.azure.resourcemanager.verifiedid.models.Authority;

/**
 * Samples for Authorities Update.
 */
public final class AuthoritiesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/verifiedid/resource-manager/Microsoft.VerifiedId/preview/2024-01-26-preview/examples/
     * Authorities_Update.json
     */
    /**
     * Sample code: UpdateAuthority.
     * 
     * @param manager Entry point to VerifiedIdManager.
     */
    public static void updateAuthority(com.azure.resourcemanager.verifiedid.VerifiedIdManager manager) {
        Authority resource = manager.authorities()
            .getByResourceGroupWithResponse("testrg", "00000000-0000-0000-0000-000000000111",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### Authorities_ListByResourceGroup

```java
/**
 * Samples for Authorities GetByResourceGroup.
 */
public final class AuthoritiesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/verifiedid/resource-manager/Microsoft.VerifiedId/preview/2024-01-26-preview/examples/
     * Authorities_Get.json
     */
    /**
     * Sample code: GetAuthority.
     * 
     * @param manager Entry point to VerifiedIdManager.
     */
    public static void getAuthority(com.azure.resourcemanager.verifiedid.VerifiedIdManager manager) {
        manager.authorities()
            .getByResourceGroupWithResponse("testrg", "00000000-0000-0000-0000-000000000111",
                com.azure.core.util.Context.NONE);
    }
}
```

### Authorities_Update

```java
/**
 * Samples for Authorities ListByResourceGroup.
 */
public final class AuthoritiesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/verifiedid/resource-manager/Microsoft.VerifiedId/preview/2024-01-26-preview/examples/
     * Authorities_ListByResourceGroup.json
     */
    /**
     * Sample code: Authorities_ListByResourceGroup.
     * 
     * @param manager Entry point to VerifiedIdManager.
     */
    public static void authoritiesListByResourceGroup(com.azure.resourcemanager.verifiedid.VerifiedIdManager manager) {
        manager.authorities().listByResourceGroup("testrg", com.azure.core.util.Context.NONE);
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
     * specification/verifiedid/resource-manager/Microsoft.VerifiedId/preview/2024-01-26-preview/examples/
     * Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to VerifiedIdManager.
     */
    public static void operationsList(com.azure.resourcemanager.verifiedid.VerifiedIdManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

