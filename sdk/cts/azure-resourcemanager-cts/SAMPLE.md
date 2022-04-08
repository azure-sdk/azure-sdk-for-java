# Code snippets and samples


## Connections

- [CreateOrUpdate](#connections_createorupdate)
- [Delete](#connections_delete)
- [GetByResourceGroup](#connections_getbyresourcegroup)
- [List](#connections_list)
- [ListByResourceGroup](#connections_listbyresourcegroup)
- [Update](#connections_update)

## Flows

- [CreateOrUpdate](#flows_createorupdate)
- [Delete](#flows_delete)
- [Disable](#flows_disable)
- [Enable](#flows_enable)
- [GetByResourceGroup](#flows_getbyresourcegroup)
- [List](#flows_list)
- [ListByResourceGroup](#flows_listbyresourcegroup)
- [Update](#flows_update)

## Operations

- [List](#operations_list)

## Pipelines

- [ApproveConnection](#pipelines_approveconnection)
- [CreateOrUpdate](#pipelines_createorupdate)
- [Delete](#pipelines_delete)
- [GetByResourceGroup](#pipelines_getbyresourcegroup)
- [List](#pipelines_list)
- [ListByResourceGroup](#pipelines_listbyresourcegroup)
- [RejectConnection](#pipelines_rejectconnection)
- [Update](#pipelines_update)
### Connections_CreateOrUpdate

```java
import com.azure.resourcemanager.cts.models.ConnectionProperties;

/** Samples for Connections CreateOrUpdate. */
public final class ConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/createOrUpdateConnection.json
     */
    /**
     * Sample code: Creates or updates the connection resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void createsOrUpdatesTheConnectionResource(com.azure.resourcemanager.cts.CtsManager manager) {
        manager
            .connections()
            .define("testConnection")
            .withRegion("East US")
            .withExistingResourceGroup("testRG")
            .withProperties(new ConnectionProperties().withRemoteCloud("testdc"))
            .create();
    }
}
```

### Connections_Delete

```java
import com.azure.core.util.Context;

/** Samples for Connections Delete. */
public final class ConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/deleteConnection.json
     */
    /**
     * Sample code: Deletes the connection resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void deletesTheConnectionResource(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.connections().delete("testRG", "testConnection", Context.NONE);
    }
}
```

### Connections_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Connections GetByResourceGroup. */
public final class ConnectionsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/getConnection.json
     */
    /**
     * Sample code: Gets connection resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void getsConnectionResource(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.connections().getByResourceGroupWithResponse("testRG", "testConnection", Context.NONE);
    }
}
```

### Connections_List

```java
import com.azure.core.util.Context;

/** Samples for Connections List. */
public final class ConnectionsListSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/listConnectionsBySubscription.json
     */
    /**
     * Sample code: Gets connections in a subscription.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void getsConnectionsInASubscription(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.connections().list(Context.NONE);
    }
}
```

### Connections_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Connections ListByResourceGroup. */
public final class ConnectionsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/listConnectionsByResourceGroup.json
     */
    /**
     * Sample code: Gets connections in a resource group.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void getsConnectionsInAResourceGroup(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.connections().listByResourceGroup("testRG", Context.NONE);
    }
}
```

### Connections_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.cts.models.Connection;

/** Samples for Connections Update. */
public final class ConnectionsUpdateSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/patchConnection.json
     */
    /**
     * Sample code: Updates the connection resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void updatesTheConnectionResource(com.azure.resourcemanager.cts.CtsManager manager) {
        Connection resource =
            manager.connections().getByResourceGroupWithResponse("testRG", "testConnection", Context.NONE).getValue();
        resource.update().apply();
    }
}
```

### Flows_CreateOrUpdate

```java
import com.azure.resourcemanager.cts.models.FlowProperties;
import com.azure.resourcemanager.cts.models.SelectedResource;
import com.azure.resourcemanager.cts.models.StorageContainerType;

/** Samples for Flows CreateOrUpdate. */
public final class FlowsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/createOrUpdateFlow.json
     */
    /**
     * Sample code: Creates or updates the flow resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void createsOrUpdatesTheFlowResource(com.azure.resourcemanager.cts.CtsManager manager) {
        manager
            .flows()
            .define("testFlow")
            .withRegion("East US")
            .withExistingResourceGroup("testRG")
            .withProperties(
                new FlowProperties()
                    .withConnection(
                        new SelectedResource()
                            .withId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRG/providers/Microsoft.Cts/connections/testFlow"))
                    .withStorageAccountName("testsa")
                    .withStorageContainerName("testcontainer")
                    .withStorageContainerType(StorageContainerType.BLOB))
            .create();
    }
}
```

### Flows_Delete

```java
import com.azure.core.util.Context;

/** Samples for Flows Delete. */
public final class FlowsDeleteSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/deleteFlow.json
     */
    /**
     * Sample code: Deletes the flow resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void deletesTheFlowResource(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.flows().delete("testRG", "testFlow", Context.NONE);
    }
}
```

### Flows_Disable

```java
import com.azure.core.util.Context;

/** Samples for Flows Disable. */
public final class FlowsDisableSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/enableOrDisableFlow.json
     */
    /**
     * Sample code: Disables the specified flow.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void disablesTheSpecifiedFlow(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.flows().disable("testRG", "testFlow", Context.NONE);
    }
}
```

### Flows_Enable

```java
import com.azure.core.util.Context;

/** Samples for Flows Enable. */
public final class FlowsEnableSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/enableOrDisableFlow.json
     */
    /**
     * Sample code: Enables the specified flow.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void enablesTheSpecifiedFlow(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.flows().enable("testRG", "testFlow", Context.NONE);
    }
}
```

### Flows_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Flows GetByResourceGroup. */
public final class FlowsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/getFlow.json
     */
    /**
     * Sample code: Gets flow resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void getsFlowResource(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.flows().getByResourceGroupWithResponse("testRG", "testFlow", Context.NONE);
    }
}
```

### Flows_List

```java
import com.azure.core.util.Context;

/** Samples for Flows List. */
public final class FlowsListSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/listFlowsBySubscription.json
     */
    /**
     * Sample code: Gets flows in a subscription.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void getsFlowsInASubscription(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.flows().list(Context.NONE);
    }
}
```

### Flows_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Flows ListByResourceGroup. */
public final class FlowsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/listFlowsByResourceGroup.json
     */
    /**
     * Sample code: Gets flows in a resource group.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void getsFlowsInAResourceGroup(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.flows().listByResourceGroup("testRG", Context.NONE);
    }
}
```

### Flows_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.cts.models.Flow;

/** Samples for Flows Update. */
public final class FlowsUpdateSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/patchFlow.json
     */
    /**
     * Sample code: Updates the flow resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void updatesTheFlowResource(com.azure.resourcemanager.cts.CtsManager manager) {
        Flow resource = manager.flows().getByResourceGroupWithResponse("testRG", "testFlow", Context.NONE).getValue();
        resource.update().apply();
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/listOperations.json
     */
    /**
     * Sample code: List operations.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void listOperations(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

### Pipelines_ApproveConnection

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.cts.models.ConnectionBody;

/** Samples for Pipelines ApproveConnection. */
public final class PipelinesApproveConnectionSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/approveOrRejectConnection.json
     */
    /**
     * Sample code: Approves the specified connection in a pipeline.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void approvesTheSpecifiedConnectionInAPipeline(com.azure.resourcemanager.cts.CtsManager manager) {
        manager
            .pipelines()
            .approveConnection(
                "testRG",
                "testPipeline",
                new ConnectionBody()
                    .withId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRG/providers/Microsoft.Cts/connections/testConnection")
                    .withStatusReason("Example reason"),
                Context.NONE);
    }
}
```

### Pipelines_CreateOrUpdate

```java
import com.azure.resourcemanager.cts.models.PipelineProperties;

/** Samples for Pipelines CreateOrUpdate. */
public final class PipelinesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/createOrUpdatePipeline.json
     */
    /**
     * Sample code: Creates or updates the pipeline resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void createsOrUpdatesThePipelineResource(com.azure.resourcemanager.cts.CtsManager manager) {
        manager
            .pipelines()
            .define("testPipeline")
            .withRegion("East US")
            .withExistingResourceGroup("testRG")
            .withProperties(new PipelineProperties().withRemoteCloud("testdc"))
            .create();
    }
}
```

### Pipelines_Delete

```java
import com.azure.core.util.Context;

/** Samples for Pipelines Delete. */
public final class PipelinesDeleteSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/deletePipeline.json
     */
    /**
     * Sample code: Deletes the pipeline resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void deletesThePipelineResource(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.pipelines().delete("testRG", "testPipeline", Context.NONE);
    }
}
```

### Pipelines_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Pipelines GetByResourceGroup. */
public final class PipelinesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/getPipeline.json
     */
    /**
     * Sample code: Gets pipeline resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void getsPipelineResource(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.pipelines().getByResourceGroupWithResponse("testRG", "testPipeline", Context.NONE);
    }
}
```

### Pipelines_List

```java
import com.azure.core.util.Context;

/** Samples for Pipelines List. */
public final class PipelinesListSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/listPipelinesBySubscription.json
     */
    /**
     * Sample code: Gets pipelines in a subscription.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void getsPipelinesInASubscription(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.pipelines().list(Context.NONE);
    }
}
```

### Pipelines_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Pipelines ListByResourceGroup. */
public final class PipelinesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/listPipelinesByResourceGroup.json
     */
    /**
     * Sample code: Gets pipelines in a resource group.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void getsPipelinesInAResourceGroup(com.azure.resourcemanager.cts.CtsManager manager) {
        manager.pipelines().listByResourceGroup("testRG", Context.NONE);
    }
}
```

### Pipelines_RejectConnection

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.cts.models.ConnectionBody;

/** Samples for Pipelines RejectConnection. */
public final class PipelinesRejectConnectionSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/approveOrRejectConnection.json
     */
    /**
     * Sample code: Rejects the specified connection in a pipeline.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void rejectsTheSpecifiedConnectionInAPipeline(com.azure.resourcemanager.cts.CtsManager manager) {
        manager
            .pipelines()
            .rejectConnection(
                "testRG",
                "testPipeline",
                new ConnectionBody()
                    .withId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRG/providers/Microsoft.Cts/connections/testConnection")
                    .withStatusReason("Example reason"),
                Context.NONE);
    }
}
```

### Pipelines_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.cts.models.Pipeline;

/** Samples for Pipelines Update. */
public final class PipelinesUpdateSamples {
    /*
     * x-ms-original-file: specification/cts/resource-manager/Microsoft.Cts/preview/2022-03-09-preview/examples/patchPipeline.json
     */
    /**
     * Sample code: Updates the pipeline resource.
     *
     * @param manager Entry point to CtsManager.
     */
    public static void updatesThePipelineResource(com.azure.resourcemanager.cts.CtsManager manager) {
        Pipeline resource =
            manager.pipelines().getByResourceGroupWithResponse("testRG", "testPipeline", Context.NONE).getValue();
        resource.update().apply();
    }
}
```

