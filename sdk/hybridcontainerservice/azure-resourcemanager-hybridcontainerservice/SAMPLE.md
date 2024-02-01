# Code snippets and samples


## AgentPool

- [CreateOrUpdate](#agentpool_createorupdate)
- [Delete](#agentpool_delete)
- [Get](#agentpool_get)
- [ListByProvisionedCluster](#agentpool_listbyprovisionedcluster)

## HybridIdentityMetadata

- [Delete](#hybrididentitymetadata_delete)
- [Get](#hybrididentitymetadata_get)
- [Put](#hybrididentitymetadata_put)

## KubernetesVersions

- [List](#kubernetesversions_list)

## ProvisionedClusterInstances

- [CreateOrUpdate](#provisionedclusterinstances_createorupdate)
- [Delete](#provisionedclusterinstances_delete)
- [Get](#provisionedclusterinstances_get)
- [GetUpgradeProfile](#provisionedclusterinstances_getupgradeprofile)
- [List](#provisionedclusterinstances_list)
- [ListAdminKubeconfig](#provisionedclusterinstances_listadminkubeconfig)
- [ListUserKubeconfig](#provisionedclusterinstances_listuserkubeconfig)

## ResourceProvider

- [DeleteKubernetesVersions](#resourceprovider_deletekubernetesversions)
- [DeleteVMSkus](#resourceprovider_deletevmskus)
- [GetKubernetesVersions](#resourceprovider_getkubernetesversions)
- [GetVMSkus](#resourceprovider_getvmskus)
- [PutKubernetesVersions](#resourceprovider_putkubernetesversions)
- [PutVMSkus](#resourceprovider_putvmskus)

## VMSkus

- [List](#vmskus_list)

## VirtualNetworks

- [CreateOrUpdate](#virtualnetworks_createorupdate)
- [Delete](#virtualnetworks_delete)
- [GetByResourceGroup](#virtualnetworks_getbyresourcegroup)
- [List](#virtualnetworks_list)
- [ListByResourceGroup](#virtualnetworks_listbyresourcegroup)
- [Update](#virtualnetworks_update)
### AgentPool_CreateOrUpdate

```java
/**
 * Samples for AgentPool CreateOrUpdate.
 */
public final class AgentPoolCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/agentPool_CreateOrUpdate.json
     */
    /**
     * Sample code: PutAgentPool.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void putAgentPool(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.agentPools().define("testnodepool").withExistingResourceUri((String) null).create();
    }
}
```

### AgentPool_Delete

```java
/**
 * Samples for AgentPool Delete.
 */
public final class AgentPoolDeleteSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/agentPool_Delete.json
     */
    /**
     * Sample code: DeleteAgentPool.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void deleteAgentPool(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.agentPools().delete(null, "testnodepool", com.azure.core.util.Context.NONE);
    }
}
```

### AgentPool_Get

```java
/**
 * Samples for AgentPool Get.
 */
public final class AgentPoolGetSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/agentPool_Get.json
     */
    /**
     * Sample code: GetAgentPool.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void getAgentPool(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.agentPools().getWithResponse(null, "testnodepool", com.azure.core.util.Context.NONE);
    }
}
```

### AgentPool_ListByProvisionedCluster

```java
/**
 * Samples for AgentPool ListByProvisionedCluster.
 */
public final class AgentPoolListByProvisionedClusterSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/agentPool_ListByProvisionedCluster.json
     */
    /**
     * Sample code: ListAgentPoolByProvisionedClusterInstance.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listAgentPoolByProvisionedClusterInstance(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.agentPools().listByProvisionedCluster(null, com.azure.core.util.Context.NONE);
    }
}
```

### HybridIdentityMetadata_Delete

```java
/**
 * Samples for HybridIdentityMetadata Delete.
 */
public final class HybridIdentityMetadataDeleteSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/HybridIdentityMetadata_Delete.json
     */
    /**
     * Sample code: DeleteHybridIdentityMetadata.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void deleteHybridIdentityMetadata(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.hybridIdentityMetadatas().delete(null, com.azure.core.util.Context.NONE);
    }
}
```

### HybridIdentityMetadata_Get

```java
/**
 * Samples for HybridIdentityMetadata Get.
 */
public final class HybridIdentityMetadataGetSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/HybridIdentityMetadata_Get.json
     */
    /**
     * Sample code: GetHybridIdentityMetadata.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void getHybridIdentityMetadata(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.hybridIdentityMetadatas().getWithResponse(null, com.azure.core.util.Context.NONE);
    }
}
```

### HybridIdentityMetadata_Put

```java
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.HybridIdentityMetadataInner;
import com.azure.resourcemanager.hybridcontainerservice.models.HybridIdentityMetadataProperties;

/**
 * Samples for HybridIdentityMetadata Put.
 */
public final class HybridIdentityMetadataPutSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/HybridIdentityMetadata_Put.json
     */
    /**
     * Sample code: CreateHybridIdentityMetadata.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void createHybridIdentityMetadata(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.hybridIdentityMetadatas().putWithResponse(null, new HybridIdentityMetadataInner().withProperties(new HybridIdentityMetadataProperties().withResourceUid("f8b82dff-38ef-4220-99ef-d3a3f86ddc6c").withPublicKey("fakeTokenPlaceholder")), com.azure.core.util.Context.NONE);
    }
}
```

### KubernetesVersions_List

```java
/**
 * Samples for KubernetesVersions List.
 */
public final class KubernetesVersionsListSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/KubernetesVersions_List.json
     */
    /**
     * Sample code: ListKubernetesVersions.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listKubernetesVersions(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.kubernetesVersions().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### ProvisionedClusterInstances_CreateOrUpdate

```java
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ProvisionedClusterInner;

/**
 * Samples for ProvisionedClusterInstances CreateOrUpdate.
 */
public final class ProvisionedClusterInstancesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/provisionedClusterInstances_CreateOrUpdate.json
     */
    /**
     * Sample code: PutProvisionedClusterInstance.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void putProvisionedClusterInstance(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.provisionedClusterInstances().createOrUpdate(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### ProvisionedClusterInstances_Delete

```java
/**
 * Samples for ProvisionedClusterInstances Delete.
 */
public final class ProvisionedClusterInstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/provisionedClusterInstances_Delete.json
     */
    /**
     * Sample code: DeleteProvisionedClusterInstance.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void deleteProvisionedClusterInstance(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.provisionedClusterInstances().delete(null, com.azure.core.util.Context.NONE);
    }
}
```

### ProvisionedClusterInstances_Get

```java
/**
 * Samples for ProvisionedClusterInstances Get.
 */
public final class ProvisionedClusterInstancesGetSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/provisionedClusterInstances_Get.json
     */
    /**
     * Sample code: GetProvisionedClusterInstance.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void getProvisionedClusterInstance(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.provisionedClusterInstances().getWithResponse(null, com.azure.core.util.Context.NONE);
    }
}
```

### ProvisionedClusterInstances_GetUpgradeProfile

```java
/**
 * Samples for ProvisionedClusterInstances GetUpgradeProfile.
 */
public final class ProvisionedClusterInstancesGetUpgradeProfileSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/provisionedClusterInstances_GetUpgradeProfile.json
     */
    /**
     * Sample code: GetUpgradeProfileForProvisionedClusterInstance.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void getUpgradeProfileForProvisionedClusterInstance(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.provisionedClusterInstances().getUpgradeProfileWithResponse(null, com.azure.core.util.Context.NONE);
    }
}
```

### ProvisionedClusterInstances_List

```java
/**
 * Samples for ProvisionedClusterInstances List.
 */
public final class ProvisionedClusterInstancesListSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/provisionedClusterInstances_List.json
     */
    /**
     * Sample code: ListProvisionedClusterInstances.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listProvisionedClusterInstances(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.provisionedClusterInstances().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### ProvisionedClusterInstances_ListAdminKubeconfig

```java
/**
 * Samples for ProvisionedClusterInstances ListAdminKubeconfig.
 */
public final class ProvisionedClusterInstancesListAdminKubeconfigSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/provisionedClusterInstances_ListAdminKubeconfig.json
     */
    /**
     * Sample code: ListClusterAdminCredentials.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listClusterAdminCredentials(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.provisionedClusterInstances().listAdminKubeconfig(null, com.azure.core.util.Context.NONE);
    }
}
```

### ProvisionedClusterInstances_ListUserKubeconfig

```java
/**
 * Samples for ProvisionedClusterInstances ListUserKubeconfig.
 */
public final class ProvisionedClusterInstancesListUserKubeconfigSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/provisionedClusterInstances_ListUserKubeconfig.json
     */
    /**
     * Sample code: ListClusterUserCredentials.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listClusterUserCredentials(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.provisionedClusterInstances().listUserKubeconfig(null, com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_DeleteKubernetesVersions

```java
/**
 * Samples for ResourceProvider DeleteKubernetesVersions.
 */
public final class ResourceProviderDeleteKubernetesVersionsSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/DeleteKubernetesVersions.json
     */
    /**
     * Sample code: DeleteKubernetesVersions.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void deleteKubernetesVersions(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.resourceProviders().deleteKubernetesVersions(null, com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_DeleteVMSkus

```java
/**
 * Samples for ResourceProvider DeleteVMSkus.
 */
public final class ResourceProviderDeleteVMSkusSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/DeleteVmSkus.json
     */
    /**
     * Sample code: DeleteVMSkus.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void deleteVMSkus(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.resourceProviders().deleteVMSkus(null, com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_GetKubernetesVersions

```java
/**
 * Samples for ResourceProvider GetKubernetesVersions.
 */
public final class ResourceProviderGetKubernetesVersionsSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/GetKubernetesVersions.json
     */
    /**
     * Sample code: GetKubernetesVersions.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void getKubernetesVersions(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.resourceProviders().getKubernetesVersionsWithResponse(null, com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_GetVMSkus

```java
/**
 * Samples for ResourceProvider GetVMSkus.
 */
public final class ResourceProviderGetVMSkusSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/GetVmSkus.json
     */
    /**
     * Sample code: GetVMSkus.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void getVMSkus(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.resourceProviders().getVMSkusWithResponse(null, com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_PutKubernetesVersions

```java
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.KubernetesVersionProfileInner;

/**
 * Samples for ResourceProvider PutKubernetesVersions.
 */
public final class ResourceProviderPutKubernetesVersionsSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/PutKubernetesVersions.json
     */
    /**
     * Sample code: PutKubernetesVersions.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void putKubernetesVersions(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.resourceProviders().putKubernetesVersions(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_PutVMSkus

```java
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.VmSkuProfileInner;

/**
 * Samples for ResourceProvider PutVMSkus.
 */
public final class ResourceProviderPutVMSkusSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/PutVmSkus.json
     */
    /**
     * Sample code: PutVMSkus.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void putVMSkus(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.resourceProviders().putVMSkus(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### VMSkus_List

```java
/**
 * Samples for VMSkus List.
 */
public final class VMSkusListSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/VMSkus_List.json
     */
    /**
     * Sample code: ListVmSkus.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listVmSkus(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.vMSkus().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworks_CreateOrUpdate

```java
/**
 * Samples for VirtualNetworks CreateOrUpdate.
 */
public final class VirtualNetworksCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/virtualNetworks_CreateOrUpdate.json
     */
    /**
     * Sample code: PutVirtualNetwork.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void putVirtualNetwork(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.virtualNetworks().define("test-vnet-static").withRegion((String) null).withExistingResourceGroup("test-arcappliance-resgrp").create();
    }
}
```

### VirtualNetworks_Delete

```java
/**
 * Samples for VirtualNetworks Delete.
 */
public final class VirtualNetworksDeleteSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/virtualNetworks_Delete.json
     */
    /**
     * Sample code: DeleteVirtualNetwork.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void deleteVirtualNetwork(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.virtualNetworks().delete("test-arcappliance-resgrp", "test-vnet-static", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworks_GetByResourceGroup

```java
/**
 * Samples for VirtualNetworks GetByResourceGroup.
 */
public final class VirtualNetworksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/virtualNetworks_Retrieve.json
     */
    /**
     * Sample code: GetVirtualNetwork.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void getVirtualNetwork(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.virtualNetworks().getByResourceGroupWithResponse("test-arcappliance-resgrp", "test-vnet-static", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworks_List

```java
/**
 * Samples for VirtualNetworks List.
 */
public final class VirtualNetworksListSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/virtualNetworks_ListBySubscription.json
     */
    /**
     * Sample code: ListVirtualNetworkBySubscription.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listVirtualNetworkBySubscription(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.virtualNetworks().list(com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworks_ListByResourceGroup

```java
/**
 * Samples for VirtualNetworks ListByResourceGroup.
 */
public final class VirtualNetworksListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/virtualNetworks_ListByResourceGroup.json
     */
    /**
     * Sample code: ListVirtualNetworkByResourceGroup.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listVirtualNetworkByResourceGroup(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.virtualNetworks().listByResourceGroup("test-arcappliance-resgrp", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualNetworks_Update

```java
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetwork;

/**
 * Samples for VirtualNetworks Update.
 */
public final class VirtualNetworksUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/stable/2024-01-01/examples/virtualNetworks_Update.json
     */
    /**
     * Sample code: UpdateVirtualNetwork.
     * 
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void updateVirtualNetwork(com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        VirtualNetwork resource = manager.virtualNetworks().getByResourceGroupWithResponse("test-arcappliance-resgrp", "test-vnet-static", com.azure.core.util.Context.NONE).getValue();
        resource.update().apply();
    }
}
```

