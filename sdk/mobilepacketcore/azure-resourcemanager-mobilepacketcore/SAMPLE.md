# Code snippets and samples


## AmfDeployments

- [CreateOrUpdate](#amfdeployments_createorupdate)
- [Delete](#amfdeployments_delete)
- [GetByResourceGroup](#amfdeployments_getbyresourcegroup)
- [List](#amfdeployments_list)
- [ListByResourceGroup](#amfdeployments_listbyresourcegroup)
- [UpdateTags](#amfdeployments_updatetags)

## ClusterServices

- [CreateOrUpdate](#clusterservices_createorupdate)
- [Delete](#clusterservices_delete)
- [GetByResourceGroup](#clusterservices_getbyresourcegroup)
- [List](#clusterservices_list)
- [ListByResourceGroup](#clusterservices_listbyresourcegroup)
- [UpdateTags](#clusterservices_updatetags)

## NrfDeployments

- [CreateOrUpdate](#nrfdeployments_createorupdate)
- [Delete](#nrfdeployments_delete)
- [GetByResourceGroup](#nrfdeployments_getbyresourcegroup)
- [List](#nrfdeployments_list)
- [ListByResourceGroup](#nrfdeployments_listbyresourcegroup)
- [UpdateTags](#nrfdeployments_updatetags)

## NssfDeployments

- [CreateOrUpdate](#nssfdeployments_createorupdate)
- [Delete](#nssfdeployments_delete)
- [GetByResourceGroup](#nssfdeployments_getbyresourcegroup)
- [List](#nssfdeployments_list)
- [ListByResourceGroup](#nssfdeployments_listbyresourcegroup)
- [UpdateTags](#nssfdeployments_updatetags)

## ObservabilityServices

- [CreateOrUpdate](#observabilityservices_createorupdate)
- [Delete](#observabilityservices_delete)
- [GetByResourceGroup](#observabilityservices_getbyresourcegroup)
- [List](#observabilityservices_list)
- [ListByResourceGroup](#observabilityservices_listbyresourcegroup)
- [UpdateTags](#observabilityservices_updatetags)

## Operations

- [List](#operations_list)

## SmfDeployments

- [CreateOrUpdate](#smfdeployments_createorupdate)
- [Delete](#smfdeployments_delete)
- [GetByResourceGroup](#smfdeployments_getbyresourcegroup)
- [List](#smfdeployments_list)
- [ListByResourceGroup](#smfdeployments_listbyresourcegroup)
- [UpdateTags](#smfdeployments_updatetags)

## UpfDeployments

- [CreateOrUpdate](#upfdeployments_createorupdate)
- [Delete](#upfdeployments_delete)
- [GetByResourceGroup](#upfdeployments_getbyresourcegroup)
- [List](#upfdeployments_list)
- [ListByResourceGroup](#upfdeployments_listbyresourcegroup)
- [UpdateTags](#upfdeployments_updatetags)
### AmfDeployments_CreateOrUpdate

```java
/**
 * Samples for AmfDeployments CreateOrUpdate.
 */
public final class AmfDeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * AmfDeployment_CreateOrUpdate.json
     */
    /**
     * Sample code: AmfDeployments_CreateOrUpdate.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        amfDeploymentsCreateOrUpdate(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.amfDeployments().define("amfDeployment1").withRegion("eastus").withExistingResourceGroup("rg1")
            .withComponentParameters("{\"global\": {\"registry\": {\"docker\": []}}}")
            .withSecretsParameters("{\"global\": {\"secret\": {\"secretValue\": []}}}")
            .withClusterService(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.MobilePacketCore/clusterServices/byoCluster")
            .create();
    }
}
```

### AmfDeployments_Delete

```java
/**
 * Samples for AmfDeployments Delete.
 */
public final class AmfDeploymentsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * AmfDeployment_Delete.json
     */
    /**
     * Sample code: AmfDeployments_Delete.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        amfDeploymentsDelete(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.amfDeployments().delete("rg1", "amfDeployment1", com.azure.core.util.Context.NONE);
    }
}
```

### AmfDeployments_GetByResourceGroup

```java
/**
 * Samples for AmfDeployments GetByResourceGroup.
 */
public final class AmfDeploymentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * AmfDeployment_Get.json
     */
    /**
     * Sample code: AmfDeployments_Get.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void amfDeploymentsGet(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.amfDeployments().getByResourceGroupWithResponse("rg1", "amfDeployment1",
            com.azure.core.util.Context.NONE);
    }
}
```

### AmfDeployments_List

```java
/**
 * Samples for AmfDeployments List.
 */
public final class AmfDeploymentsListSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * AmfDeployment_ListBySubscription.json
     */
    /**
     * Sample code: AmfDeployments_ListBySubscription.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        amfDeploymentsListBySubscription(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.amfDeployments().list(com.azure.core.util.Context.NONE);
    }
}
```

### AmfDeployments_ListByResourceGroup

```java
/**
 * Samples for AmfDeployments ListByResourceGroup.
 */
public final class AmfDeploymentsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * AmfDeployment_ListByResourceGroup.json
     */
    /**
     * Sample code: AmfDeployments_ListByResourceGroup.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        amfDeploymentsListByResourceGroup(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.amfDeployments().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### AmfDeployments_UpdateTags

```java
import com.azure.resourcemanager.mobilepacketcore.models.AmfDeploymentResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AmfDeployments UpdateTags.
 */
public final class AmfDeploymentsUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * AmfDeployment_UpdateTags.json
     */
    /**
     * Sample code: AmfDeployments_UpdateTags.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        amfDeploymentsUpdateTags(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        AmfDeploymentResource resource = manager.amfDeployments()
            .getByResourceGroupWithResponse("rg1", "amfDeployment1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### ClusterServices_CreateOrUpdate

```java
import com.azure.resourcemanager.mobilepacketcore.models.ClusterServiceNexusAksClusterData;
import com.azure.resourcemanager.mobilepacketcore.models.QualifiedComponentDeploymentParameters;
import com.azure.resourcemanager.mobilepacketcore.models.SkuDeploymentType;
import java.util.Arrays;

/**
 * Samples for ClusterServices CreateOrUpdate.
 */
public final class ClusterServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ClusterService_CreateOrUpdate.json
     */
    /**
     * Sample code: ClusterServices_CreateOrUpdate.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        clusterServicesCreateOrUpdate(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.clusterServices().define("clusterService1").withRegion("eastus").withExistingResourceGroup("rg1")
            .withDeploymentType(SkuDeploymentType.PRODUCTION).withReleaseVersion("4.3.0-alpha")
            .withClusterTypeSpecificData(new ClusterServiceNexusAksClusterData().withCustomLocationId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.ExtendedLocation/customLocations/cluster124Location"))
            .withComponentParameters(Arrays.asList(new QualifiedComponentDeploymentParameters().withType("fed-crds")
                .withParameters("{\"global\": {\"registry\": {\"docker\": []}}}").withSecrets("fakeTokenPlaceholder")))
            .create();
    }
}
```

### ClusterServices_Delete

```java
/**
 * Samples for ClusterServices Delete.
 */
public final class ClusterServicesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ClusterService_Delete.json
     */
    /**
     * Sample code: ClusterServices_Delete.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        clusterServicesDelete(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.clusterServices().delete("rg1", "clusterService1", com.azure.core.util.Context.NONE);
    }
}
```

### ClusterServices_GetByResourceGroup

```java
/**
 * Samples for ClusterServices GetByResourceGroup.
 */
public final class ClusterServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ClusterService_Get.json
     */
    /**
     * Sample code: ClusterServices_Get.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void clusterServicesGet(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.clusterServices().getByResourceGroupWithResponse("rg1", "clusterService1",
            com.azure.core.util.Context.NONE);
    }
}
```

### ClusterServices_List

```java
/**
 * Samples for ClusterServices List.
 */
public final class ClusterServicesListSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ClusterService_ListBySubscription.json
     */
    /**
     * Sample code: ClusterServices_ListBySubscription.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        clusterServicesListBySubscription(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.clusterServices().list(com.azure.core.util.Context.NONE);
    }
}
```

### ClusterServices_ListByResourceGroup

```java
/**
 * Samples for ClusterServices ListByResourceGroup.
 */
public final class ClusterServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ClusterService_ListByResourceGroup.json
     */
    /**
     * Sample code: ClusterServices_ListByResourceGroup.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        clusterServicesListByResourceGroup(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.clusterServices().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### ClusterServices_UpdateTags

```java
import com.azure.resourcemanager.mobilepacketcore.models.ClusterServiceResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ClusterServices UpdateTags.
 */
public final class ClusterServicesUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ClusterService_UpdateTags.json
     */
    /**
     * Sample code: ClusterServices_UpdateTags.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        clusterServicesUpdateTags(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        ClusterServiceResource resource = manager.clusterServices()
            .getByResourceGroupWithResponse("rg1", "clusterService1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### NrfDeployments_CreateOrUpdate

```java
/**
 * Samples for NrfDeployments CreateOrUpdate.
 */
public final class NrfDeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NrfDeployment_CreateOrUpdate.json
     */
    /**
     * Sample code: NrfDeployments_CreateOrUpdate.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        nrfDeploymentsCreateOrUpdate(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.nrfDeployments().define("nrfDeployment1").withRegion("eastus").withExistingResourceGroup("rg1")
            .withComponentParameters("{\"global\": {\"registry\": {\"docker\": []}}}")
            .withSecretsParameters("{\"global\": {\"secret\": {\"secretValue\": []}}}")
            .withClusterService(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.MobilePacketCore/clusterServices/byoCluster")
            .create();
    }
}
```

### NrfDeployments_Delete

```java
/**
 * Samples for NrfDeployments Delete.
 */
public final class NrfDeploymentsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NrfDeployment_Delete.json
     */
    /**
     * Sample code: NrfDeployments_Delete.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        nrfDeploymentsDelete(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.nrfDeployments().delete("rg1", "nrfDeployment1", com.azure.core.util.Context.NONE);
    }
}
```

### NrfDeployments_GetByResourceGroup

```java
/**
 * Samples for NrfDeployments GetByResourceGroup.
 */
public final class NrfDeploymentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NrfDeployment_Get.json
     */
    /**
     * Sample code: NrfDeployments_Get.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void nrfDeploymentsGet(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.nrfDeployments().getByResourceGroupWithResponse("rg1", "nrfDeployment1",
            com.azure.core.util.Context.NONE);
    }
}
```

### NrfDeployments_List

```java
/**
 * Samples for NrfDeployments List.
 */
public final class NrfDeploymentsListSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NrfDeployment_ListBySubscription.json
     */
    /**
     * Sample code: NrfDeployments_ListBySubscription.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        nrfDeploymentsListBySubscription(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.nrfDeployments().list(com.azure.core.util.Context.NONE);
    }
}
```

### NrfDeployments_ListByResourceGroup

```java
/**
 * Samples for NrfDeployments ListByResourceGroup.
 */
public final class NrfDeploymentsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NrfDeployment_ListByResourceGroup.json
     */
    /**
     * Sample code: NrfDeployments_ListByResourceGroup.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        nrfDeploymentsListByResourceGroup(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.nrfDeployments().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### NrfDeployments_UpdateTags

```java
import com.azure.resourcemanager.mobilepacketcore.models.NrfDeploymentResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for NrfDeployments UpdateTags.
 */
public final class NrfDeploymentsUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NrfDeployment_UpdateTags.json
     */
    /**
     * Sample code: NrfDeployments_UpdateTags.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        nrfDeploymentsUpdateTags(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        NrfDeploymentResource resource = manager.nrfDeployments()
            .getByResourceGroupWithResponse("rg1", "nrfDeployment1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### NssfDeployments_CreateOrUpdate

```java
/**
 * Samples for NssfDeployments CreateOrUpdate.
 */
public final class NssfDeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NssfDeployment_CreateOrUpdate.json
     */
    /**
     * Sample code: NssfDeployments_CreateOrUpdate.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        nssfDeploymentsCreateOrUpdate(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.nssfDeployments().define("nssfDeployment1").withRegion("eastus").withExistingResourceGroup("rg1")
            .withComponentParameters("{\"global\": {\"registry\": {\"docker\": []}}}")
            .withSecretsParameters("{\"global\": {\"secret\": {\"secretValue\": []}}}")
            .withClusterService(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.MobilePacketCore/clusterServices/byoCluster")
            .create();
    }
}
```

### NssfDeployments_Delete

```java
/**
 * Samples for NssfDeployments Delete.
 */
public final class NssfDeploymentsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NssfDeployment_Delete.json
     */
    /**
     * Sample code: NssfDeployments_Delete.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        nssfDeploymentsDelete(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.nssfDeployments().delete("rg1", "nssfDeployment1", com.azure.core.util.Context.NONE);
    }
}
```

### NssfDeployments_GetByResourceGroup

```java
/**
 * Samples for NssfDeployments GetByResourceGroup.
 */
public final class NssfDeploymentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NssfDeployment_Get.json
     */
    /**
     * Sample code: NssfDeployments_Get.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void nssfDeploymentsGet(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.nssfDeployments().getByResourceGroupWithResponse("rg1", "nssfDeployment1",
            com.azure.core.util.Context.NONE);
    }
}
```

### NssfDeployments_List

```java
/**
 * Samples for NssfDeployments List.
 */
public final class NssfDeploymentsListSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NssfDeployment_ListBySubscription.json
     */
    /**
     * Sample code: NssfDeployments_ListBySubscription.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        nssfDeploymentsListBySubscription(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.nssfDeployments().list(com.azure.core.util.Context.NONE);
    }
}
```

### NssfDeployments_ListByResourceGroup

```java
/**
 * Samples for NssfDeployments ListByResourceGroup.
 */
public final class NssfDeploymentsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NssfDeployment_ListByResourceGroup.json
     */
    /**
     * Sample code: NssfDeployments_ListByResourceGroup.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        nssfDeploymentsListByResourceGroup(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.nssfDeployments().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### NssfDeployments_UpdateTags

```java
import com.azure.resourcemanager.mobilepacketcore.models.NssfDeploymentResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for NssfDeployments UpdateTags.
 */
public final class NssfDeploymentsUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * NssfDeployment_UpdateTags.json
     */
    /**
     * Sample code: NssfDeployments_UpdateTags.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        nssfDeploymentsUpdateTags(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        NssfDeploymentResource resource = manager.nssfDeployments()
            .getByResourceGroupWithResponse("rg1", "nssfDeployment1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### ObservabilityServices_CreateOrUpdate

```java
import com.azure.resourcemanager.mobilepacketcore.models.QualifiedComponentDeploymentParameters;
import java.util.Arrays;

/**
 * Samples for ObservabilityServices CreateOrUpdate.
 */
public final class ObservabilityServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ObservabilityService_CreateOrUpdate.json
     */
    /**
     * Sample code: ObservabilityServices_CreateOrUpdate.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void observabilityServicesCreateOrUpdate(
        com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.observabilityServices().define("observabilityService1").withRegion("eastus")
            .withExistingResourceGroup("rg1")
            .withComponentParameters(Arrays.asList(new QualifiedComponentDeploymentParameters().withType("fed-crds")
                .withParameters("{\"global\": {\"registry\": {\"docker\": []}}}").withSecrets("fakeTokenPlaceholder")))
            .withClusterService(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.MobilePacketCore/clusterServices/byoCluster")
            .create();
    }
}
```

### ObservabilityServices_Delete

```java
/**
 * Samples for ObservabilityServices Delete.
 */
public final class ObservabilityServicesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ObservabilityService_Delete.json
     */
    /**
     * Sample code: ObservabilityServices_Delete.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        observabilityServicesDelete(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.observabilityServices().delete("rg1", "observabilityService1", com.azure.core.util.Context.NONE);
    }
}
```

### ObservabilityServices_GetByResourceGroup

```java
/**
 * Samples for ObservabilityServices GetByResourceGroup.
 */
public final class ObservabilityServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ObservabilityService_Get.json
     */
    /**
     * Sample code: ObservabilityServices_Get.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        observabilityServicesGet(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.observabilityServices().getByResourceGroupWithResponse("rg1", "observabilityService1",
            com.azure.core.util.Context.NONE);
    }
}
```

### ObservabilityServices_List

```java
/**
 * Samples for ObservabilityServices List.
 */
public final class ObservabilityServicesListSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ObservabilityService_ListBySubscription.json
     */
    /**
     * Sample code: ObservabilityServices_ListBySubscription.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void observabilityServicesListBySubscription(
        com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.observabilityServices().list(com.azure.core.util.Context.NONE);
    }
}
```

### ObservabilityServices_ListByResourceGroup

```java
/**
 * Samples for ObservabilityServices ListByResourceGroup.
 */
public final class ObservabilityServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ObservabilityService_ListByResourceGroup.json
     */
    /**
     * Sample code: ObservabilityServices_ListByResourceGroup.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void observabilityServicesListByResourceGroup(
        com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.observabilityServices().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### ObservabilityServices_UpdateTags

```java
import com.azure.resourcemanager.mobilepacketcore.models.ObservabilityServiceResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ObservabilityServices UpdateTags.
 */
public final class ObservabilityServicesUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * ObservabilityService_UpdateTags.json
     */
    /**
     * Sample code: ObservabilityServices_UpdateTags.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        observabilityServicesUpdateTags(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        ObservabilityServiceResource resource = manager.observabilityServices()
            .getByResourceGroupWithResponse("rg1", "observabilityService1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * OperationList.json
     */
    /**
     * Sample code: OperationsList.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void operationsList(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### SmfDeployments_CreateOrUpdate

```java
/**
 * Samples for SmfDeployments CreateOrUpdate.
 */
public final class SmfDeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * SmfDeployment_CreateOrUpdate.json
     */
    /**
     * Sample code: SmfDeployments_CreateOrUpdate.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        smfDeploymentsCreateOrUpdate(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.smfDeployments().define("smfDeployment1").withRegion("eastus").withExistingResourceGroup("rg1")
            .withComponentParameters("{\"global\": {\"registry\": {\"docker\": []}}}")
            .withSecretsParameters("{\"global\": {\"secret\": {\"secretValue\": []}}}")
            .withClusterService(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.MobilePacketCore/clusterServices/byoCluster")
            .create();
    }
}
```

### SmfDeployments_Delete

```java
/**
 * Samples for SmfDeployments Delete.
 */
public final class SmfDeploymentsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * SmfDeployment_Delete.json
     */
    /**
     * Sample code: SmfDeployments_Delete.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        smfDeploymentsDelete(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.smfDeployments().delete("rg1", "smfDeployment1", com.azure.core.util.Context.NONE);
    }
}
```

### SmfDeployments_GetByResourceGroup

```java
/**
 * Samples for SmfDeployments GetByResourceGroup.
 */
public final class SmfDeploymentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * SmfDeployment_Get.json
     */
    /**
     * Sample code: SmfDeployments_Get.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void smfDeploymentsGet(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.smfDeployments().getByResourceGroupWithResponse("rg1", "smfDeployment1",
            com.azure.core.util.Context.NONE);
    }
}
```

### SmfDeployments_List

```java
/**
 * Samples for SmfDeployments List.
 */
public final class SmfDeploymentsListSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * SmfDeployment_ListBySubscription.json
     */
    /**
     * Sample code: SmfDeployments_ListBySubscription.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        smfDeploymentsListBySubscription(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.smfDeployments().list(com.azure.core.util.Context.NONE);
    }
}
```

### SmfDeployments_ListByResourceGroup

```java
/**
 * Samples for SmfDeployments ListByResourceGroup.
 */
public final class SmfDeploymentsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * SmfDeployment_ListByResourceGroup.json
     */
    /**
     * Sample code: SmfDeployments_ListByResourceGroup.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        smfDeploymentsListByResourceGroup(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.smfDeployments().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### SmfDeployments_UpdateTags

```java
import com.azure.resourcemanager.mobilepacketcore.models.SmfDeploymentResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SmfDeployments UpdateTags.
 */
public final class SmfDeploymentsUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * SmfDeployment_UpdateTags.json
     */
    /**
     * Sample code: SmfDeployments_UpdateTags.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        smfDeploymentsUpdateTags(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        SmfDeploymentResource resource = manager.smfDeployments()
            .getByResourceGroupWithResponse("rg1", "smfDeployment1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### UpfDeployments_CreateOrUpdate

```java
/**
 * Samples for UpfDeployments CreateOrUpdate.
 */
public final class UpfDeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * UpfDeployment_CreateOrUpdate.json
     */
    /**
     * Sample code: UpfDeployments_CreateOrUpdate.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        upfDeploymentsCreateOrUpdate(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.upfDeployments().define("upfDeployment1").withRegion("eastus").withExistingResourceGroup("rg1")
            .withComponentParameters("{\"global\": {\"registry\": {\"docker\": []}}}")
            .withSecretsParameters("{\"global\": {\"secret\": {\"secretValue\": []}}}")
            .withClusterService(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.MobilePacketCore/clusterServices/byoCluster")
            .create();
    }
}
```

### UpfDeployments_Delete

```java
/**
 * Samples for UpfDeployments Delete.
 */
public final class UpfDeploymentsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * UpfDeployment_Delete.json
     */
    /**
     * Sample code: UpfDeployments_Delete.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        upfDeploymentsDelete(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.upfDeployments().delete("rg1", "upfDeployment1", com.azure.core.util.Context.NONE);
    }
}
```

### UpfDeployments_GetByResourceGroup

```java
/**
 * Samples for UpfDeployments GetByResourceGroup.
 */
public final class UpfDeploymentsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * UpfDeployment_Get.json
     */
    /**
     * Sample code: UpfDeployments_Get.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void upfDeploymentsGet(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.upfDeployments().getByResourceGroupWithResponse("rg1", "upfDeployment1",
            com.azure.core.util.Context.NONE);
    }
}
```

### UpfDeployments_List

```java
/**
 * Samples for UpfDeployments List.
 */
public final class UpfDeploymentsListSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * UpfDeployment_ListBySubscription.json
     */
    /**
     * Sample code: UpfDeployments_ListBySubscription.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        upfDeploymentsListBySubscription(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.upfDeployments().list(com.azure.core.util.Context.NONE);
    }
}
```

### UpfDeployments_ListByResourceGroup

```java
/**
 * Samples for UpfDeployments ListByResourceGroup.
 */
public final class UpfDeploymentsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * UpfDeployment_ListByResourceGroup.json
     */
    /**
     * Sample code: UpfDeployments_ListByResourceGroup.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        upfDeploymentsListByResourceGroup(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        manager.upfDeployments().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### UpfDeployments_UpdateTags

```java
import com.azure.resourcemanager.mobilepacketcore.models.UpfDeploymentResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for UpfDeployments UpdateTags.
 */
public final class UpfDeploymentsUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/mobilepacketcore/resource-manager/Microsoft.MobilePacketCore/preview/2023-10-15-preview/examples/
     * UpfDeployment_UpdateTags.json
     */
    /**
     * Sample code: UpfDeployments_UpdateTags.
     * 
     * @param manager Entry point to MobilepacketcoreManager.
     */
    public static void
        upfDeploymentsUpdateTags(com.azure.resourcemanager.mobilepacketcore.MobilepacketcoreManager manager) {
        UpfDeploymentResource resource = manager.upfDeployments()
            .getByResourceGroupWithResponse("rg1", "upfDeployment1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

