# Code snippets and samples


## CloudHsmClusterPrivateEndpointConnections

- [Create](#cloudhsmclusterprivateendpointconnections_create)
- [Delete](#cloudhsmclusterprivateendpointconnections_delete)
- [Get](#cloudhsmclusterprivateendpointconnections_get)

## CloudHsmClusterPrivateLinkResources

- [ListByCloudHsmCluster](#cloudhsmclusterprivatelinkresources_listbycloudhsmcluster)

## CloudHsmClusters

- [CreateOrUpdate](#cloudhsmclusters_createorupdate)
- [Delete](#cloudhsmclusters_delete)
- [GetByResourceGroup](#cloudhsmclusters_getbyresourcegroup)
- [List](#cloudhsmclusters_list)
- [ListByResourceGroup](#cloudhsmclusters_listbyresourcegroup)
- [Update](#cloudhsmclusters_update)

## PrivateEndpointConnections

- [ListByCloudHsmCluster](#privateendpointconnections_listbycloudhsmcluster)
### CloudHsmClusterPrivateEndpointConnections_Create

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.hardwaresecuritymodules.models.PrivateLinkServiceConnectionState;

/** Samples for CloudHsmClusterPrivateEndpointConnections Create. */
public final class CloudHsmClusterPrivateEndpointConnectionsCreateSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2023-12-10-preview/examples/CloudHsmClusterPrivateEndpointConnection_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmClusterPrivateEndpointConnection_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void cloudHsmClusterPrivateEndpointConnectionCreateMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager
            .cloudHsmClusterPrivateEndpointConnections()
            .define("sample-pec")
            .withExistingCloudHsmCluster("rgcloudhsm", "chsm1")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState()
                    .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                    .withDescription("My name is Joe and I'm approving this."))
            .create();
    }
}
```

### CloudHsmClusterPrivateEndpointConnections_Delete

```java
/** Samples for CloudHsmClusterPrivateEndpointConnections Delete. */
public final class CloudHsmClusterPrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2023-12-10-preview/examples/CloudHsmClusterPrivateEndpointConnection_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmClusterPrivateEndpointConnection_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void cloudHsmClusterPrivateEndpointConnectionDeleteMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager
            .cloudHsmClusterPrivateEndpointConnections()
            .delete("rgcloudhsm", "chsm1", "sample-pec", com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusterPrivateEndpointConnections_Get

```java
/** Samples for CloudHsmClusterPrivateEndpointConnections Get. */
public final class CloudHsmClusterPrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2023-12-10-preview/examples/CloudHsmClusterPrivateEndpointConnection_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmClusterPrivateEndpointConnection_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void cloudHsmClusterPrivateEndpointConnectionGetMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager
            .cloudHsmClusterPrivateEndpointConnections()
            .getWithResponse("rgcloudhsm", "chsm1", "sample-pec", com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusterPrivateLinkResources_ListByCloudHsmCluster

```java
/** Samples for CloudHsmClusterPrivateLinkResources ListByCloudHsmCluster. */
public final class CloudHsmClusterPrivateLinkResourcesListByCloudHsmClusterSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2023-12-10-preview/examples/CloudHsmClusterPrivateLinkResource_ListByCloudHsmCluster_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmClusterPrivateLinkResources_ListByResource_MaximumSet_Gen.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void cloudHsmClusterPrivateLinkResourcesListByResourceMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager
            .cloudHsmClusterPrivateLinkResources()
            .listByCloudHsmClusterWithResponse("rgcloudhsm", "chsm1", com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_CreateOrUpdate

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSecurityDomainProperties;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSku;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSkuFamily;
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmClusterSkuName;
import java.util.HashMap;
import java.util.Map;

/** Samples for CloudHsmClusters CreateOrUpdate. */
public final class CloudHsmClustersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2023-12-10-preview/examples/CloudHsmCluster_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void cloudHsmClusterCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager
            .cloudHsmClusters()
            .define("chsm1")
            .withRegion("eastus2")
            .withExistingResourceGroup("rgcloudhsm")
            .withTags(mapOf("Dept", "hsm", "Environment", "dogfood"))
            .withSku(
                new CloudHsmClusterSku()
                    .withFamily(CloudHsmClusterSkuFamily.B)
                    .withName(CloudHsmClusterSkuName.STANDARD_B1))
            .withSecurityDomain(new CloudHsmClusterSecurityDomainProperties().withFipsState(2))
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

### CloudHsmClusters_Delete

```java
/** Samples for CloudHsmClusters Delete. */
public final class CloudHsmClustersDeleteSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2023-12-10-preview/examples/CloudHsmCluster_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void cloudHsmClusterDeleteMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager.cloudHsmClusters().delete("rgcloudhsm", "chsm1", com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_GetByResourceGroup

```java
/** Samples for CloudHsmClusters GetByResourceGroup. */
public final class CloudHsmClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2023-12-10-preview/examples/CloudHsmCluster_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void cloudHsmClusterGetMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager
            .cloudHsmClusters()
            .getByResourceGroupWithResponse("rgcloudhsm", "chsm1", com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_List

```java
/** Samples for CloudHsmClusters List. */
public final class CloudHsmClustersListSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2023-12-10-preview/examples/CloudHsmCluster_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_ListBySubscription_MaximumSet_Gen.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void cloudHsmClusterListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager.cloudHsmClusters().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_ListByResourceGroup

```java
/** Samples for CloudHsmClusters ListByResourceGroup. */
public final class CloudHsmClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2023-12-10-preview/examples/CloudHsmCluster_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void cloudHsmClusterListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager.cloudHsmClusters().listByResourceGroup("rgcloudhsm", null, com.azure.core.util.Context.NONE);
    }
}
```

### CloudHsmClusters_Update

```java
import com.azure.resourcemanager.hardwaresecuritymodules.models.CloudHsmCluster;
import java.util.HashMap;
import java.util.Map;

/** Samples for CloudHsmClusters Update. */
public final class CloudHsmClustersUpdateSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2023-12-10-preview/examples/CloudHsmCluster_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmCluster_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void cloudHsmClusterUpdateMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        CloudHsmCluster resource =
            manager
                .cloudHsmClusters()
                .getByResourceGroupWithResponse("rgcloudhsm", "chsm1", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("Dept", "hsm", "Environment", "dogfood", "Slice", "A")).apply();
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

### PrivateEndpointConnections_ListByCloudHsmCluster

```java
/** Samples for PrivateEndpointConnections ListByCloudHsmCluster. */
public final class PrivateEndpointConnectionsListByCloudHsmClusterSamples {
    /*
     * x-ms-original-file: specification/hardwaresecuritymodules/resource-manager/Microsoft.HardwareSecurityModules/preview/2023-12-10-preview/examples/CloudHsmClusterPrivateEndpointConnection_ListByCloudHsmCluster_MaximumSet_Gen.json
     */
    /**
     * Sample code: CloudHsmClusterPrivateEndpointConnection_ListByResource_MaximumSet_Gen.
     *
     * @param manager Entry point to HardwareSecurityModulesManager.
     */
    public static void cloudHsmClusterPrivateEndpointConnectionListByResourceMaximumSetGen(
        com.azure.resourcemanager.hardwaresecuritymodules.HardwareSecurityModulesManager manager) {
        manager
            .privateEndpointConnections()
            .listByCloudHsmCluster("rgcloudhsm", "chsm1", com.azure.core.util.Context.NONE);
    }
}
```

