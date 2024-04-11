# Code snippets and samples


## Extensions

- [Create](#extensions_create)
- [Delete](#extensions_delete)
- [Get](#extensions_get)
- [ListByResourceGroup](#extensions_listbyresourcegroup)
- [Update](#extensions_update)

## FluxConfigurations

- [Create](#fluxconfigurations_create)
- [Get](#fluxconfigurations_get)
- [ListByResourceGroup](#fluxconfigurations_listbyresourcegroup)
- [Update](#fluxconfigurations_update)

## Operations

- [List](#operations_list)

## SourceControlConfigurations

- [Delete](#sourcecontrolconfigurations_delete)
- [GetByResourceGroup](#sourcecontrolconfigurations_getbyresourcegroup)
- [ListByResourceGroup](#sourcecontrolconfigurations_listbyresourcegroup)
### Extensions_Create

```java

/**
 * Samples for Extensions Create.
 */
public final class ExtensionsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/CreateExtensionWithPlan.json
     */
    /**
     * Sample code: Extensions_Create_Plan.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void extensionsCreatePlan(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.extensions().create("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1", "azureVote",
            null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/CreateExtension.json
     */
    /**
     * Sample code: Extensions_Create.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void
        extensionsCreate(com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.extensions().create("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            "ClusterMonitor", null, com.azure.core.util.Context.NONE);
    }
}
```

### Extensions_Delete

```java
/**
 * Samples for Extensions Delete.
 */
public final class ExtensionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/DeleteExtension.json
     */
    /**
     * Sample code: Extensions_Delete.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void
        extensionsDelete(com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.extensions().delete("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            "ClusterMonitor", null, com.azure.core.util.Context.NONE);
    }
}
```

### Extensions_Get

```java
/**
 * Samples for Extensions Get.
 */
public final class ExtensionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/GetExtension.json
     */
    /**
     * Sample code: Extensions_Get.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void
        extensionsGet(com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.extensions().getWithResponse("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            "ClusterMonitor", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/GetExtensionAsyncOperationStatus.json
     */
    /**
     * Sample code: Extensions_Get_Async.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void extensionsGetAsync(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.extensions().getWithResponse("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            "ClusterMonitor", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/GetExtensionWithPlan.json
     */
    /**
     * Sample code: Extensions_Get_Plan.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void
        extensionsGetPlan(com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.extensions().getWithResponse("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            "azureVote", com.azure.core.util.Context.NONE);
    }
}
```

### Extensions_ListByResourceGroup

```java
/**
 * Samples for Extensions ListByResourceGroup.
 */
public final class ExtensionsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/ListExtensions.json
     */
    /**
     * Sample code: Extensions_ListByResourceGroup.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void extensionsListByResourceGroup(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.extensions().listByResourceGroup("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            com.azure.core.util.Context.NONE);
    }
}
```

### Extensions_Update

```java

/**
 * Samples for Extensions Update.
 */
public final class ExtensionsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/PatchExtension.json
     */
    /**
     * Sample code: Extensions_Update.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void
        extensionsUpdate(com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.extensions().updateWithResponse("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            "ClusterMonitor", null, com.azure.core.util.Context.NONE);
    }
}
```

### FluxConfigurations_Create

```java

/**
 * Samples for FluxConfigurations Create.
 */
public final class FluxConfigurationsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/CreateFluxConfigurationWithAzureBlob.json
     */
    /**
     * Sample code: FluxConfigurations_Create_Azure_Blob.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void fluxConfigurationsCreateAzureBlob(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.fluxConfigurations().create("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            "srs-fluxconfig", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/CreateFluxConfigurationWithBucket.json
     */
    /**
     * Sample code: FluxConfigurations_Create_With_Bucket.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void fluxConfigurationsCreateWithBucket(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.fluxConfigurations().create("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            "srs-fluxconfig", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/CreateFluxConfiguration.json
     */
    /**
     * Sample code: FluxConfigurations_Create.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void fluxConfigurationsCreate(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.fluxConfigurations().create("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            "srs-fluxconfig", null, com.azure.core.util.Context.NONE);
    }
}
```

### FluxConfigurations_Get

```java
/**
 * Samples for FluxConfigurations Get.
 */
public final class FluxConfigurationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/GetFluxConfiguration.json
     */
    /**
     * Sample code: FluxConfigurations_Get.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void fluxConfigurationsGet(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.fluxConfigurations().getWithResponse("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            "srs-fluxconfig", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/GetFluxConfigurationAsyncOperationStatus.json
     */
    /**
     * Sample code: FluxConfigurations_Get_Async.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void fluxConfigurationsGetAsync(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.fluxConfigurations().getWithResponse("rg1", "Microsoft.Kubernetes", "connectedClusters", "clusterName1",
            "srs-fluxconfig", com.azure.core.util.Context.NONE);
    }
}
```

### FluxConfigurations_ListByResourceGroup

```java
/**
 * Samples for FluxConfigurations ListByResourceGroup.
 */
public final class FluxConfigurationsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/ListFluxConfigurations.json
     */
    /**
     * Sample code: FluxConfigurations_List.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void fluxConfigurationsList(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.fluxConfigurations().listByResourceGroup("rg1", "Microsoft.Kubernetes", "connectedClusters",
            "clusterName1", com.azure.core.util.Context.NONE);
    }
}
```

### FluxConfigurations_Update

```java

/**
 * Samples for FluxConfigurations Update.
 */
public final class FluxConfigurationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/PatchFluxConfiguration.json
     */
    /**
     * Sample code: FluxConfigurations_Update.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void fluxConfigurationsUpdate(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.fluxConfigurations().updateWithResponse("rg1", "Microsoft.Kubernetes", "connectedClusters",
            "clusterName1", "srs-fluxconfig", null, com.azure.core.util.Context.NONE);
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
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/OperationsList.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void
        operationsList(com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/ListAsyncOperationStatus.json
     */
    /**
     * Sample code: Operations_List_Async.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void operationsListAsync(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### SourceControlConfigurations_Delete

```java
/**
 * Samples for SourceControlConfigurations Delete.
 */
public final class SourceControlConfigurationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/DeleteSourceControlConfiguration.json
     */
    /**
     * Sample code: SourceControlConfigurations_Delete.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void sourceControlConfigurationsDelete(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.sourceControlConfigurations().delete("rg1", "SRS_GitHubConfig", com.azure.core.util.Context.NONE);
    }
}
```

### SourceControlConfigurations_GetByResourceGroup

```java
/**
 * Samples for SourceControlConfigurations GetByResourceGroup.
 */
public final class SourceControlConfigurationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/GetSourceControlConfiguration.json
     */
    /**
     * Sample code: SourceControlConfigurations_Get.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void sourceControlConfigurationsGet(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.sourceControlConfigurations().getByResourceGroupWithResponse("rg1", "SRS_GitHubConfig",
            com.azure.core.util.Context.NONE);
    }
}
```

### SourceControlConfigurations_ListByResourceGroup

```java
/**
 * Samples for SourceControlConfigurations ListByResourceGroup.
 */
public final class SourceControlConfigurationsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/kubernetesconfiguration/resource-manager/Microsoft.KubernetesConfiguration/preview/2024-06-01-
     * preview/examples/ListSourceControlConfiguration.json
     */
    /**
     * Sample code: SourceControlConfigurations_List.
     * 
     * @param manager Entry point to SourceControlConfigurationManager.
     */
    public static void sourceControlConfigurationsList(
        com.azure.resourcemanager.kubernetesconfiguration.SourceControlConfigurationManager manager) {
        manager.sourceControlConfigurations().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

