# Code snippets and samples


## ManagedHsms

- [CheckMhsmNameAvailability](#managedhsms_checkmhsmnameavailability)
- [CreateOrUpdate](#managedhsms_createorupdate)
- [Delete](#managedhsms_delete)
- [GetByResourceGroup](#managedhsms_getbyresourcegroup)
- [GetDeleted](#managedhsms_getdeleted)
- [List](#managedhsms_list)
- [ListByResourceGroup](#managedhsms_listbyresourcegroup)
- [ListBySubscription](#managedhsms_listbysubscription)
- [PurgeDeleted](#managedhsms_purgedeleted)
- [Update](#managedhsms_update)

## MhsmPrivateEndpointConnections

- [Delete](#mhsmprivateendpointconnections_delete)
- [Get](#mhsmprivateendpointconnections_get)
- [ListByResource](#mhsmprivateendpointconnections_listbyresource)
- [Put](#mhsmprivateendpointconnections_put)

## MhsmPrivateLinkResources

- [ListByMhsmResource](#mhsmprivatelinkresources_listbymhsmresource)

## MhsmRegions

- [ListByResource](#mhsmregions_listbyresource)

## PrivateEndpointConnections

- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [ListByResource](#privateendpointconnections_listbyresource)
- [Put](#privateendpointconnections_put)

## PrivateLinkResources

- [ListByVault](#privatelinkresources_listbyvault)

## Secrets

- [CreateOrUpdate](#secrets_createorupdate)
- [Get](#secrets_get)
- [List](#secrets_list)
- [Update](#secrets_update)

## Vaults

- [CheckNameAvailability](#vaults_checknameavailability)
- [CreateOrUpdate](#vaults_createorupdate)
- [Delete](#vaults_delete)
- [GetByResourceGroup](#vaults_getbyresourcegroup)
- [GetDeleted](#vaults_getdeleted)
- [List](#vaults_list)
- [ListByResourceGroup](#vaults_listbyresourcegroup)
- [ListBySubscription](#vaults_listbysubscription)
- [PurgeDeleted](#vaults_purgedeleted)
- [Update](#vaults_update)
- [UpdateAccessPolicy](#vaults_updateaccesspolicy)
### ManagedHsms_CheckMhsmNameAvailability

```java

/**
 * Samples for ManagedHsms CheckMhsmNameAvailability.
 */
public final class ManagedHsmsCheckMhsmNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * ManagedHsm_checkMhsmNameAvailability.json
     */
    /**
     * Sample code: Validate a managed hsm name.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void validateAManagedHsmName(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.managedHsms().checkMhsmNameAvailabilityWithResponse(null, com.azure.core.util.Context.NONE);
    }
}
```

### ManagedHsms_CreateOrUpdate

```java
/**
 * Samples for ManagedHsms CreateOrUpdate.
 */
public final class ManagedHsmsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/ManagedHsm_CreateOrUpdate.
     * json
     */
    /**
     * Sample code: Create a new managed HSM Pool or update an existing managed HSM Pool.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void createANewManagedHSMPoolOrUpdateAnExistingManagedHSMPool(
        com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.managedHsms().define("hsm1").withRegion((String) null).withExistingResourceGroup("hsm-group").create();
    }
}
```

### ManagedHsms_Delete

```java
/**
 * Samples for ManagedHsms Delete.
 */
public final class ManagedHsmsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/ManagedHsm_Delete.json
     */
    /**
     * Sample code: Delete a managed HSM Pool.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void deleteAManagedHSMPool(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.managedHsms().delete("hsm-group", "hsm1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedHsms_GetByResourceGroup

```java
/**
 * Samples for ManagedHsms GetByResourceGroup.
 */
public final class ManagedHsmsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/ManagedHsm_Get.json
     */
    /**
     * Sample code: Retrieve a managed HSM Pool.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void retrieveAManagedHSMPool(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.managedHsms().getByResourceGroupWithResponse("hsm-group", "hsm1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedHsms_GetDeleted

```java
/**
 * Samples for ManagedHsms GetDeleted.
 */
public final class ManagedHsmsGetDeletedSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/DeletedManagedHsm_Get.json
     */
    /**
     * Sample code: Retrieve a deleted managed HSM.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        retrieveADeletedManagedHSM(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.managedHsms().getDeletedWithResponse("westus", "hsm1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedHsms_List

```java
/**
 * Samples for ManagedHsms List.
 */
public final class ManagedHsmsListSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/DeletedManagedHsm_List.json
     */
    /**
     * Sample code: List deleted managed HSMs in the specified subscription.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void listDeletedManagedHSMsInTheSpecifiedSubscription(
        com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.managedHsms().list(com.azure.core.util.Context.NONE);
    }
}
```

### ManagedHsms_ListByResourceGroup

```java
/**
 * Samples for ManagedHsms ListByResourceGroup.
 */
public final class ManagedHsmsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * ManagedHsm_ListByResourceGroup.json
     */
    /**
     * Sample code: List managed HSM Pools in a resource group.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        listManagedHSMPoolsInAResourceGroup(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.managedHsms().listByResourceGroup("hsm-group", null, com.azure.core.util.Context.NONE);
    }
}
```

### ManagedHsms_ListBySubscription

```java
/**
 * Samples for ManagedHsms ListBySubscription.
 */
public final class ManagedHsmsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * ManagedHsm_ListBySubscription.json
     */
    /**
     * Sample code: List managed HSM Pools in a subscription.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        listManagedHSMPoolsInASubscription(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.managedHsms().listBySubscription(null, com.azure.core.util.Context.NONE);
    }
}
```

### ManagedHsms_PurgeDeleted

```java
/**
 * Samples for ManagedHsms PurgeDeleted.
 */
public final class ManagedHsmsPurgeDeletedSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/DeletedManagedHsm_Purge.
     * json
     */
    /**
     * Sample code: Purge a managed HSM Pool.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void purgeAManagedHSMPool(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.managedHsms().purgeDeleted("westus", "hsm1", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedHsms_Update

```java
import com.azure.resourcemanager.keyvault.generated.models.ManagedHsm;

/**
 * Samples for ManagedHsms Update.
 */
public final class ManagedHsmsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/ManagedHsm_Update.json
     */
    /**
     * Sample code: Update an existing managed HSM Pool.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        updateAnExistingManagedHSMPool(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        ManagedHsm resource = manager.managedHsms()
            .getByResourceGroupWithResponse("hsm-group", "hsm1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### MhsmPrivateEndpointConnections_Delete

```java
/**
 * Samples for MhsmPrivateEndpointConnections Delete.
 */
public final class MhsmPrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * ManagedHsm_deletePrivateEndpointConnection.json
     */
    /**
     * Sample code: ManagedHsmDeletePrivateEndpointConnection.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void managedHsmDeletePrivateEndpointConnection(
        com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.mhsmPrivateEndpointConnections()
            .delete("sample-group", "sample-mhsm", "sample-pec", com.azure.core.util.Context.NONE);
    }
}
```

### MhsmPrivateEndpointConnections_Get

```java
/**
 * Samples for MhsmPrivateEndpointConnections Get.
 */
public final class MhsmPrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * ManagedHsm_getPrivateEndpointConnection.json
     */
    /**
     * Sample code: ManagedHsmGetPrivateEndpointConnection.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        managedHsmGetPrivateEndpointConnection(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.mhsmPrivateEndpointConnections()
            .getWithResponse("sample-group", "sample-mhsm", "sample-pec", com.azure.core.util.Context.NONE);
    }
}
```

### MhsmPrivateEndpointConnections_ListByResource

```java
/**
 * Samples for MhsmPrivateEndpointConnections ListByResource.
 */
public final class MhsmPrivateEndpointConnectionsListByResourceSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * ManagedHsm_ListPrivateEndpointConnectionsByResource.json
     */
    /**
     * Sample code: List managed HSM Pools in a subscription.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        listManagedHSMPoolsInASubscription(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.mhsmPrivateEndpointConnections()
            .listByResource("sample-group", "sample-mhsm", com.azure.core.util.Context.NONE);
    }
}
```

### MhsmPrivateEndpointConnections_Put

```java
/**
 * Samples for MhsmPrivateEndpointConnections Put.
 */
public final class MhsmPrivateEndpointConnectionsPutSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * ManagedHsm_putPrivateEndpointConnection.json
     */
    /**
     * Sample code: ManagedHsmPutPrivateEndpointConnection.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        managedHsmPutPrivateEndpointConnection(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.mhsmPrivateEndpointConnections()
            .define("sample-pec")
            .withRegion((String) null)
            .withExistingManagedHSM("sample-group", "sample-mhsm")
            .create();
    }
}
```

### MhsmPrivateLinkResources_ListByMhsmResource

```java
/**
 * Samples for MhsmPrivateLinkResources ListByMhsmResource.
 */
public final class MhsmPrivateLinkResourcesListByMhsmResourceSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * ManagedHsm_listPrivateLinkResources.json
     */
    /**
     * Sample code: KeyVaultListPrivateLinkResources.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        keyVaultListPrivateLinkResources(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.mhsmPrivateLinkResources()
            .listByMhsmResourceWithResponse("sample-group", "sample-mhsm", com.azure.core.util.Context.NONE);
    }
}
```

### MhsmRegions_ListByResource

```java
/**
 * Samples for MhsmRegions ListByResource.
 */
public final class MhsmRegionsListByResourceSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * ManagedHsm_ListRegionsByResource.json
     */
    /**
     * Sample code: List managed HSM Pools in a subscription.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        listManagedHSMPoolsInASubscription(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.mhsmRegions().listByResource("sample-group", "sample-mhsm", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Delete

```java
/**
 * Samples for PrivateEndpointConnections Delete.
 */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * deletePrivateEndpointConnection.json
     */
    /**
     * Sample code: KeyVaultDeletePrivateEndpointConnection.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        keyVaultDeletePrivateEndpointConnection(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.privateEndpointConnections()
            .delete("sample-group", "sample-vault", "sample-pec", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
/**
 * Samples for PrivateEndpointConnections Get.
 */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * getPrivateEndpointConnection.json
     */
    /**
     * Sample code: KeyVaultGetPrivateEndpointConnection.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        keyVaultGetPrivateEndpointConnection(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.privateEndpointConnections()
            .getWithResponse("sample-group", "sample-vault", "sample-pec", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_ListByResource

```java
/**
 * Samples for PrivateEndpointConnections ListByResource.
 */
public final class PrivateEndpointConnectionsListByResourceSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * listPrivateEndpointConnection.json
     */
    /**
     * Sample code: KeyVaultListPrivateEndpointConnection.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        keyVaultListPrivateEndpointConnection(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.privateEndpointConnections()
            .listByResource("sample-group", "sample-vault", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Put

```java
/**
 * Samples for PrivateEndpointConnections Put.
 */
public final class PrivateEndpointConnectionsPutSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/
     * putPrivateEndpointConnection.json
     */
    /**
     * Sample code: KeyVaultPutPrivateEndpointConnection.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        keyVaultPutPrivateEndpointConnection(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.privateEndpointConnections()
            .define("sample-pec")
            .withRegion((String) null)
            .withExistingVault("sample-group", "sample-vault")
            .create();
    }
}
```

### PrivateLinkResources_ListByVault

```java
/**
 * Samples for PrivateLinkResources ListByVault.
 */
public final class PrivateLinkResourcesListByVaultSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/listPrivateLinkResources.
     * json
     */
    /**
     * Sample code: KeyVaultListPrivateLinkResources.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        keyVaultListPrivateLinkResources(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.privateLinkResources()
            .listByVaultWithResponse("sample-group", "sample-vault", com.azure.core.util.Context.NONE);
    }
}
```

### Secrets_CreateOrUpdate

```java
/**
 * Samples for Secrets CreateOrUpdate.
 */
public final class SecretsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/createSecret.json
     */
    /**
     * Sample code: Create a secret.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void createASecret(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.secrets()
            .define("secret-name")
            .withRegion((String) null)
            .withExistingVault("sample-group", "sample-vault")
            .create();
    }
}
```

### Secrets_Get

```java
/**
 * Samples for Secrets Get.
 */
public final class SecretsGetSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/getSecret.json
     */
    /**
     * Sample code: Get a secret.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void getASecret(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.secrets()
            .getWithResponse("sample-group", "sample-vault", "secret-name", com.azure.core.util.Context.NONE);
    }
}
```

### Secrets_List

```java
/**
 * Samples for Secrets List.
 */
public final class SecretsListSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/listSecrets.json
     */
    /**
     * Sample code: List secrets in the vault.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void listSecretsInTheVault(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.secrets().list("sample-group", "sample-vault", null, com.azure.core.util.Context.NONE);
    }
}
```

### Secrets_Update

```java
import com.azure.resourcemanager.keyvault.generated.models.Secret;

/**
 * Samples for Secrets Update.
 */
public final class SecretsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/updateSecret.json
     */
    /**
     * Sample code: Update a secret.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void updateASecret(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        Secret resource = manager.secrets()
            .getWithResponse("sample-group", "sample-vault", "secret-name", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### Vaults_CheckNameAvailability

```java

/**
 * Samples for Vaults CheckNameAvailability.
 */
public final class VaultsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/checkVaultNameAvailability.
     * json
     */
    /**
     * Sample code: Validate a vault name.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void validateAVaultName(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.vaults().checkNameAvailabilityWithResponse(null, com.azure.core.util.Context.NONE);
    }
}
```

### Vaults_CreateOrUpdate

```java
import com.azure.resourcemanager.keyvault.generated.models.Sku;
import java.util.UUID;

/**
 * Samples for Vaults CreateOrUpdate.
 */
public final class VaultsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/createVaultWithNetworkAcls.
     * json
     */
    /**
     * Sample code: Create or update a vault with network acls.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        createOrUpdateAVaultWithNetworkAcls(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.vaults()
            .define("sample-vault")
            .withRegion((String) null)
            .withExistingResourceGroup("sample-resource-group")
            .withTenantId((UUID) null)
            .withSku((Sku) null)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/createVault.json
     */
    /**
     * Sample code: Create a new vault or update an existing vault.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        createANewVaultOrUpdateAnExistingVault(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.vaults()
            .define("sample-vault")
            .withRegion((String) null)
            .withExistingResourceGroup("sample-resource-group")
            .withTenantId((UUID) null)
            .withSku((Sku) null)
            .create();
    }
}
```

### Vaults_Delete

```java
/**
 * Samples for Vaults Delete.
 */
public final class VaultsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/deleteVault.json
     */
    /**
     * Sample code: Delete a vault.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void deleteAVault(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.vaults()
            .deleteByResourceGroupWithResponse("sample-resource-group", "sample-vault",
                com.azure.core.util.Context.NONE);
    }
}
```

### Vaults_GetByResourceGroup

```java
/**
 * Samples for Vaults GetByResourceGroup.
 */
public final class VaultsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/getVault.json
     */
    /**
     * Sample code: Retrieve a vault.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void retrieveAVault(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.vaults()
            .getByResourceGroupWithResponse("sample-resource-group", "sample-vault", com.azure.core.util.Context.NONE);
    }
}
```

### Vaults_GetDeleted

```java
/**
 * Samples for Vaults GetDeleted.
 */
public final class VaultsGetDeletedSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/getDeletedVault.json
     */
    /**
     * Sample code: Retrieve a deleted vault.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void retrieveADeletedVault(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.vaults().getDeletedWithResponse("westus", "sample-vault", com.azure.core.util.Context.NONE);
    }
}
```

### Vaults_List

```java
/**
 * Samples for Vaults List.
 */
public final class VaultsListSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/listDeletedVaults.json
     */
    /**
     * Sample code: List deleted vaults in the specified subscription.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void listDeletedVaultsInTheSpecifiedSubscription(
        com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.vaults().list(com.azure.core.util.Context.NONE);
    }
}
```

### Vaults_ListByResourceGroup

```java
/**
 * Samples for Vaults ListByResourceGroup.
 */
public final class VaultsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/listVaultByResourceGroup.
     * json
     */
    /**
     * Sample code: List vaults in the specified resource group.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        listVaultsInTheSpecifiedResourceGroup(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.vaults().listByResourceGroup("sample-group", 1, com.azure.core.util.Context.NONE);
    }
}
```

### Vaults_ListBySubscription

```java
/**
 * Samples for Vaults ListBySubscription.
 */
public final class VaultsListBySubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/listVaultBySubscription.
     * json
     */
    /**
     * Sample code: List vaults in the specified subscription.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void
        listVaultsInTheSpecifiedSubscription(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.vaults().listBySubscription(1, com.azure.core.util.Context.NONE);
    }
}
```

### Vaults_PurgeDeleted

```java
/**
 * Samples for Vaults PurgeDeleted.
 */
public final class VaultsPurgeDeletedSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/purgeDeletedVault.json
     */
    /**
     * Sample code: Purge a deleted vault.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void purgeADeletedVault(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.vaults().purgeDeleted("westus", "sample-vault", com.azure.core.util.Context.NONE);
    }
}
```

### Vaults_Update

```java
import com.azure.resourcemanager.keyvault.generated.models.Vault;

/**
 * Samples for Vaults Update.
 */
public final class VaultsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/updateVault.json
     */
    /**
     * Sample code: Update an existing vault.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void updateAnExistingVault(com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        Vault resource = manager.vaults()
            .getByResourceGroupWithResponse("sample-resource-group", "sample-vault", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### Vaults_UpdateAccessPolicy

```java
import com.azure.resourcemanager.keyvault.generated.models.AccessPolicyUpdateKind;

/**
 * Samples for Vaults UpdateAccessPolicy.
 */
public final class VaultsUpdateAccessPolicySamples {
    /*
     * x-ms-original-file:
     * specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2024-11-01/examples/updateAccessPoliciesAdd.
     * json
     */
    /**
     * Sample code: Add an access policy, or update an access policy with new permissions.
     * 
     * @param manager Entry point to KeyvaultManager.
     */
    public static void addAnAccessPolicyOrUpdateAnAccessPolicyWithNewPermissions(
        com.azure.resourcemanager.keyvault.generated.KeyvaultManager manager) {
        manager.vaults()
            .updateAccessPolicyWithResponse("sample-group", "sample-vault", AccessPolicyUpdateKind.ADD, null,
                com.azure.core.util.Context.NONE);
    }
}
```

