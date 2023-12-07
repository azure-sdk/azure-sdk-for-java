# Code snippets and samples


## Instances

- [CreateOrUpdate](#instances_createorupdate)
- [Delete](#instances_delete)
- [GetByResourceGroup](#instances_getbyresourcegroup)
- [LinkLogAnalytics](#instances_linkloganalytics)
- [List](#instances_list)
- [ListByResourceGroup](#instances_listbyresourcegroup)
- [PatchServers](#instances_patchservers)
- [Scale](#instances_scale)
- [UnlinkLogAnalytics](#instances_unlinkloganalytics)
- [Update](#instances_update)
- [UpdateLogAnalytics](#instances_updateloganalytics)

## ManagedGateways

- [CreateOrUpdate](#managedgateways_createorupdate)
- [Delete](#managedgateways_delete)
- [Get](#managedgateways_get)
- [ListByManagedInstance](#managedgateways_listbymanagedinstance)

## MonitoredResources

- [CreateOrUpdate](#monitoredresources_createorupdate)
- [Delete](#monitoredresources_delete)
- [Get](#monitoredresources_get)
- [ListByManagedInstance](#monitoredresources_listbymanagedinstance)

## Operations

- [ListByResourceGroup](#operations_listbyresourcegroup)
- [ListV2](#operations_listv2)
### Instances_CreateOrUpdate

```java
/**
 * Samples for Instances CreateOrUpdate.
 */
public final class InstancesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Instances_CreateOrUpdate.json
     */
    /**
     * Sample code: Instances_CreateOrUpdate.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesCreateOrUpdate(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().define("KQG").withRegion((String) null).withExistingResourceGroup("rgscom").withValidationMode(true).create();
    }
}
```

### Instances_Delete

```java
/**
 * Samples for Instances Delete.
 */
public final class InstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Instances_Delete.json
     */
    /**
     * Sample code: Instances_Delete.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesDelete(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().delete("rgscom", "Q-D-", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_GetByResourceGroup

```java
/**
 * Samples for Instances GetByResourceGroup.
 */
public final class InstancesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Instances_Get.json
     */
    /**
     * Sample code: Instances_Get.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesGet(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().getByResourceGroupWithResponse("rgscom", "DB-_Ro", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_LinkLogAnalytics

```java
import com.azure.resourcemanager.scom.fluent.models.LogAnalyticsConfigurationInner;
import com.azure.resourcemanager.scom.models.DataType;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Samples for Instances LinkLogAnalytics.
 */
public final class InstancesLinkLogAnalyticsSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Instances_LinkLogAnalytics.json
     */
    /**
     * Sample code: Instances_LinkLogAnalytics.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesLinkLogAnalytics(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().linkLogAnalytics("rgscom", "f-2_V", new LogAnalyticsConfigurationInner().withWorkspaceId("t").withDataTypes(Arrays.asList(DataType.STATE)).withImportData(true), com.azure.core.util.Context.NONE);
    }
}
```

### Instances_List

```java
/**
 * Samples for Instances List.
 */
public final class InstancesListSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Instances_ListBySubscription.json
     */
    /**
     * Sample code: Instances_ListBySubscription.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesListBySubscription(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().list(com.azure.core.util.Context.NONE);
    }
}
```

### Instances_ListByResourceGroup

```java
/**
 * Samples for Instances ListByResourceGroup.
 */
public final class InstancesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Instances_ListByResourceGroup.json
     */
    /**
     * Sample code: Instances_ListByResourceGroup.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesListByResourceGroup(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().listByResourceGroup("rgscom", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_PatchServers

```java
/**
 * Samples for Instances PatchServers.
 */
public final class InstancesPatchServersSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Instances_PatchServers.json
     */
    /**
     * Sample code: Instances_PatchServers.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesPatchServers(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().patchServers("rgscom", "V_", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_Scale

```java
import com.azure.resourcemanager.scom.models.ScalingProperties;

/**
 * Samples for Instances Scale.
 */
public final class InstancesScaleSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Instances_Scale.json
     */
    /**
     * Sample code: Instances_Scale.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesScale(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().scale("rgscom", "C7", new ScalingProperties().withServerCount(66), com.azure.core.util.Context.NONE);
    }
}
```

### Instances_UnlinkLogAnalytics

```java
/**
 * Samples for Instances UnlinkLogAnalytics.
 */
public final class InstancesUnlinkLogAnalyticsSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Instances_UnlinkLogAnalytics.json
     */
    /**
     * Sample code: Instances_UnlinkLogAnalytics.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesUnlinkLogAnalytics(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().unlinkLogAnalytics("rgscom", "k-5", com.azure.core.util.Context.NONE);
    }
}
```

### Instances_Update

```java
import com.azure.resourcemanager.scom.models.ManagedInstance;

/**
 * Samples for Instances Update.
 */
public final class InstancesUpdateSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Instances_Update.json
     */
    /**
     * Sample code: Instances_Update.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesUpdate(com.azure.resourcemanager.scom.ScomManager manager) {
        ManagedInstance resource = manager.instances().getByResourceGroupWithResponse("rgscom", "r9-j5", com.azure.core.util.Context.NONE).getValue();
        resource.update().apply();
    }
}
```

### Instances_UpdateLogAnalytics

```java
import com.azure.resourcemanager.scom.fluent.models.LogAnalyticsUpdateConfigurationInner;
import com.azure.resourcemanager.scom.models.DataType;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Samples for Instances UpdateLogAnalytics.
 */
public final class InstancesUpdateLogAnalyticsSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Instances_UpdateLogAnalytics.json
     */
    /**
     * Sample code: Instances_UpdateLogAnalytics.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void instancesUpdateLogAnalytics(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.instances().updateLogAnalytics("rgscom", "5t-1P", new LogAnalyticsUpdateConfigurationInner().withDataTypes(Arrays.asList(DataType.STATE)), com.azure.core.util.Context.NONE);
    }
}
```

### ManagedGateways_CreateOrUpdate

```java
/**
 * Samples for ManagedGateways CreateOrUpdate.
 */
public final class ManagedGatewaysCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/ManagedGateways_CreateOrUpdate.json
     */
    /**
     * Sample code: ManagedGateways_CreateOrUpdate.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void managedGatewaysCreateOrUpdate(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.managedGateways().define("r_8").withExistingManagedInstance("rgscom", "A5-3").withResourceId("hhrcietvczieddghbsmokjscbmvzd").withResourceLocation("jgk").withComputerName("kw").withDomainName("excbjnbuxkhzxjscvpoir").create();
    }
}
```

### ManagedGateways_Delete

```java
/**
 * Samples for ManagedGateways Delete.
 */
public final class ManagedGatewaysDeleteSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/ManagedGateways_Delete.json
     */
    /**
     * Sample code: ManagedGateways_Delete.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void managedGatewaysDelete(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.managedGateways().deleteWithResponse("rgscom", "8--Q", "F", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedGateways_Get

```java
/**
 * Samples for ManagedGateways Get.
 */
public final class ManagedGatewaysGetSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/ManagedGateways_Get.json
     */
    /**
     * Sample code: ManagedGateways_Get.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void managedGatewaysGet(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.managedGateways().getWithResponse("rgscom", "K-_5-", "MW", com.azure.core.util.Context.NONE);
    }
}
```

### ManagedGateways_ListByManagedInstance

```java
/**
 * Samples for ManagedGateways ListByManagedInstance.
 */
public final class ManagedGatewaysListByManagedInstanceSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/ManagedGateways_ListByManagedInstance.json
     */
    /**
     * Sample code: ManagedGateways_ListByManagedInstance.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void managedGatewaysListByManagedInstance(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.managedGateways().listByManagedInstance("rgscom", "fx", com.azure.core.util.Context.NONE);
    }
}
```

### MonitoredResources_CreateOrUpdate

```java
/**
 * Samples for MonitoredResources CreateOrUpdate.
 */
public final class MonitoredResourcesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/MonitoredResources_CreateOrUpdate.json
     */
    /**
     * Sample code: MonitoredResources_CreateOrUpdate.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void monitoredResourcesCreateOrUpdate(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.monitoredResources().define("H1__EC").withExistingManagedInstance("rgscom", "M7kA-").withResourceId("vmucwehgadl").withResourceLocation("zofncygindwdhveyuqfs").withComputerName("wqumxuyxlxpfaprdqmuyjfopwmlidj").withDomainName("dlwtmudblgaaohtatzdhmbccct").create();
    }
}
```

### MonitoredResources_Delete

```java
/**
 * Samples for MonitoredResources Delete.
 */
public final class MonitoredResourcesDeleteSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/MonitoredResources_Delete.json
     */
    /**
     * Sample code: MonitoredResources_Delete.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void monitoredResourcesDelete(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.monitoredResources().deleteWithResponse("rgscom", "9_-", "1s--JP", com.azure.core.util.Context.NONE);
    }
}
```

### MonitoredResources_Get

```java
/**
 * Samples for MonitoredResources Get.
 */
public final class MonitoredResourcesGetSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/MonitoredResources_Get.json
     */
    /**
     * Sample code: MonitoredResources_Get.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void monitoredResourcesGet(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.monitoredResources().getWithResponse("rgscom", "ws--", "J_Xg-f", com.azure.core.util.Context.NONE);
    }
}
```

### MonitoredResources_ListByManagedInstance

```java
/**
 * Samples for MonitoredResources ListByManagedInstance.
 */
public final class MonitoredResourcesListByManagedInstanceSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/MonitoredResources_ListByManagedInstance.json
     */
    /**
     * Sample code: MonitoredResources_ListByManagedInstance.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void monitoredResourcesListByManagedInstance(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.monitoredResources().listByManagedInstance("rgscom", "4A", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_ListByResourceGroup

```java
/**
 * Samples for Operations ListByResourceGroup.
 */
public final class OperationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void operationsList(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.operations().listByResourceGroup("rgscom", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_ListV2

```java
/**
 * Samples for Operations ListV2.
 */
public final class OperationsListV2Samples {
    /*
     * x-ms-original-file: specification/scom/resource-manager/Microsoft.Scom/preview/2023-07-07-preview/examples/Operations_ListV2.json
     */
    /**
     * Sample code: Operations_ListV2.
     * 
     * @param manager Entry point to ScomManager.
     */
    public static void operationsListV2(com.azure.resourcemanager.scom.ScomManager manager) {
        manager.operations().listV2(com.azure.core.util.Context.NONE);
    }
}
```

