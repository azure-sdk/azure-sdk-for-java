# Code snippets and samples


## FederatedIdentityCredentials

- [CreateOrUpdate](#federatedidentitycredentials_createorupdate)
- [Delete](#federatedidentitycredentials_delete)
- [Get](#federatedidentitycredentials_get)
- [List](#federatedidentitycredentials_list)

## Operations

- [List](#operations_list)

## SystemAssignedIdentities

- [GetByScope](#systemassignedidentities_getbyscope)

## UserAssignedIdentities

- [CreateOrUpdate](#userassignedidentities_createorupdate)
- [Delete](#userassignedidentities_delete)
- [GetByResourceGroup](#userassignedidentities_getbyresourcegroup)
- [List](#userassignedidentities_list)
- [ListByResourceGroup](#userassignedidentities_listbyresourcegroup)
- [Update](#userassignedidentities_update)
### FederatedIdentityCredentials_CreateOrUpdate

```java
import java.util.Arrays;

/** Samples for FederatedIdentityCredentials CreateOrUpdate. */
public final class FederatedIdentityCredentialsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/FederatedIdentityCredentialCreate.json
     */
    /**
     * Sample code: FederatedIdentityCredentialCreate.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void federatedIdentityCredentialCreate(
        com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager
            .federatedIdentityCredentials()
            .define("ficResourceName")
            .withExistingUserAssignedIdentity("rgName", "resourceName")
            .withIssuer("https://oidc.prod-aks.azure.com/TenantGUID/IssuerGUID")
            .withSubject("system:serviceaccount:ns:svcaccount")
            .withAudiences(Arrays.asList("api://AzureADTokenExchange"))
            .create();
    }
}
```

### FederatedIdentityCredentials_Delete

```java
/** Samples for FederatedIdentityCredentials Delete. */
public final class FederatedIdentityCredentialsDeleteSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/FederatedIdentityCredentialDelete.json
     */
    /**
     * Sample code: FederatedIdentityCredentialDelete.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void federatedIdentityCredentialDelete(
        com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager
            .federatedIdentityCredentials()
            .deleteWithResponse("rgName", "resourceName", "ficResourceName", com.azure.core.util.Context.NONE);
    }
}
```

### FederatedIdentityCredentials_Get

```java
/** Samples for FederatedIdentityCredentials Get. */
public final class FederatedIdentityCredentialsGetSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/FederatedIdentityCredentialGet.json
     */
    /**
     * Sample code: FederatedIdentityCredentialGet.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void federatedIdentityCredentialGet(
        com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager
            .federatedIdentityCredentials()
            .getWithResponse("rgName", "resourceName", "ficResourceName", com.azure.core.util.Context.NONE);
    }
}
```

### FederatedIdentityCredentials_List

```java
/** Samples for FederatedIdentityCredentials List. */
public final class FederatedIdentityCredentialsListSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/FederatedIdentityCredentialList.json
     */
    /**
     * Sample code: FederatedIdentityCredentialList.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void federatedIdentityCredentialList(
        com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager
            .federatedIdentityCredentials()
            .list("rgName", "resourceName", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/MsiOperationsList.json
     */
    /**
     * Sample code: MsiOperationsList.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void msiOperationsList(
        com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### SystemAssignedIdentities_GetByScope

```java
/** Samples for SystemAssignedIdentities GetByScope. */
public final class SystemAssignedIdentitiesGetByScopeSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/SystemAssignedIdentityGet.json
     */
    /**
     * Sample code: MsiOperationsList.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void msiOperationsList(
        com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager.systemAssignedIdentities().getByScopeWithResponse("scope", com.azure.core.util.Context.NONE);
    }
}
```

### UserAssignedIdentities_CreateOrUpdate

```java
import java.util.HashMap;
import java.util.Map;

/** Samples for UserAssignedIdentities CreateOrUpdate. */
public final class UserAssignedIdentitiesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/IdentityCreate.json
     */
    /**
     * Sample code: IdentityCreate.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void identityCreate(com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager
            .userAssignedIdentities()
            .define("resourceName")
            .withRegion("eastus")
            .withExistingResourceGroup("rgName")
            .withTags(mapOf("key1", "value1", "key2", "value2"))
            .create();
    }

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

### UserAssignedIdentities_Delete

```java
/** Samples for UserAssignedIdentities Delete. */
public final class UserAssignedIdentitiesDeleteSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/IdentityDelete.json
     */
    /**
     * Sample code: IdentityDelete.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void identityDelete(com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager
            .userAssignedIdentities()
            .deleteByResourceGroupWithResponse("rgName", "resourceName", com.azure.core.util.Context.NONE);
    }
}
```

### UserAssignedIdentities_GetByResourceGroup

```java
/** Samples for UserAssignedIdentities GetByResourceGroup. */
public final class UserAssignedIdentitiesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/IdentityGet.json
     */
    /**
     * Sample code: IdentityGet.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void identityGet(com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager
            .userAssignedIdentities()
            .getByResourceGroupWithResponse("rgName", "resourceName", com.azure.core.util.Context.NONE);
    }
}
```

### UserAssignedIdentities_List

```java
/** Samples for UserAssignedIdentities List. */
public final class UserAssignedIdentitiesListSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/IdentityListBySubscription.json
     */
    /**
     * Sample code: IdentityListBySubscription.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void identityListBySubscription(
        com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager.userAssignedIdentities().list(com.azure.core.util.Context.NONE);
    }
}
```

### UserAssignedIdentities_ListByResourceGroup

```java
/** Samples for UserAssignedIdentities ListByResourceGroup. */
public final class UserAssignedIdentitiesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/IdentityListByResourceGroup.json
     */
    /**
     * Sample code: IdentityListByResourceGroup.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void identityListByResourceGroup(
        com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        manager.userAssignedIdentities().listByResourceGroup("rgName", com.azure.core.util.Context.NONE);
    }
}
```

### UserAssignedIdentities_Update

```java
import com.azure.resourcemanager.msi.generated.models.Identity;
import java.util.HashMap;
import java.util.Map;

/** Samples for UserAssignedIdentities Update. */
public final class UserAssignedIdentitiesUpdateSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/stable/2023-01-31/examples/IdentityUpdate.json
     */
    /**
     * Sample code: IdentityUpdate.
     *
     * @param manager Entry point to ManagedServiceIdentityManager.
     */
    public static void identityUpdate(com.azure.resourcemanager.msi.generated.ManagedServiceIdentityManager manager) {
        Identity resource =
            manager
                .userAssignedIdentities()
                .getByResourceGroupWithResponse("rgName", "resourceName", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key1", "value1", "key2", "value2")).apply();
    }

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

