# Code snippets and samples


## AzureDataTransfer

- [ListApprovedSchemas](#azuredatatransfer_listapprovedschemas)
- [ValidateSchema](#azuredatatransfer_validateschema)

## Connections

- [CreateOrUpdate](#connections_createorupdate)
- [Delete](#connections_delete)
- [GetByResourceGroup](#connections_getbyresourcegroup)
- [Link](#connections_link)
- [List](#connections_list)
- [ListByResourceGroup](#connections_listbyresourcegroup)
- [Update](#connections_update)

## Flows

- [CreateOrUpdate](#flows_createorupdate)
- [Delete](#flows_delete)
- [Disable](#flows_disable)
- [Enable](#flows_enable)
- [GeneratePassphrase](#flows_generatepassphrase)
- [Get](#flows_get)
- [GetDestinationEndpointPorts](#flows_getdestinationendpointports)
- [GetDestinationEndpoints](#flows_getdestinationendpoints)
- [GetSourceAddresses](#flows_getsourceaddresses)
- [GetStreamConnectionString](#flows_getstreamconnectionstring)
- [Link](#flows_link)
- [ListByConnection](#flows_listbyconnection)
- [SetDestinationEndpointPorts](#flows_setdestinationendpointports)
- [SetDestinationEndpoints](#flows_setdestinationendpoints)
- [SetPassphrase](#flows_setpassphrase)
- [SetSourceAddresses](#flows_setsourceaddresses)
- [Update](#flows_update)

## ListPendingConnections

- [List](#listpendingconnections_list)

## ListPendingFlows

- [List](#listpendingflows_list)

## ListSchemas

- [List](#listschemas_list)

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
### AzureDataTransfer_ListApprovedSchemas

```java
import com.azure.resourcemanager.azuredatatransfer.models.ListApprovedSchemasDirection;
import com.azure.resourcemanager.azuredatatransfer.models.ListApprovedSchemasRequest;

/**
 * Samples for AzureDataTransfer ListApprovedSchemas.
 */
public final class AzureDataTransferListApprovedSchemasSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * postListApprovedSchemas.json
     */
    /**
     * Sample code: Performs action request.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        performsActionRequest(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.azureDataTransfers()
            .listApprovedSchemasWithResponse(
                new ListApprovedSchemasRequest().withPipeline("test").withDirection(ListApprovedSchemasDirection.SEND),
                com.azure.core.util.Context.NONE);
    }
}
```

### AzureDataTransfer_ValidateSchema

```java
import com.azure.resourcemanager.azuredatatransfer.models.Schema;

/**
 * Samples for AzureDataTransfer ValidateSchema.
 */
public final class AzureDataTransferValidateSchemaSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * postValidateSchema.json
     */
    /**
     * Sample code: Performs action request.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        performsActionRequest(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.azureDataTransfers()
            .validateSchemaWithResponse(new Schema().withName("schema.xml"), com.azure.core.util.Context.NONE);
    }
}
```

### Connections_CreateOrUpdate

```java
import com.azure.resourcemanager.azuredatatransfer.models.ConnectionProperties;

/**
 * Samples for Connections CreateOrUpdate.
 */
public final class ConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * createOrUpdateConnection.json
     */
    /**
     * Sample code: Creates or updates the connection resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void createsOrUpdatesTheConnectionResource(
        com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.connections()
            .define("testConnection")
            .withRegion("East US")
            .withExistingResourceGroup("testRG")
            .withProperties(new ConnectionProperties().withPipeline("testdc")
                .withJustification("justification")
                .withRequirementId("id"))
            .create();
    }
}
```

### Connections_Delete

```java
/**
 * Samples for Connections Delete.
 */
public final class ConnectionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * deleteConnection.json
     */
    /**
     * Sample code: Deletes the connection resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        deletesTheConnectionResource(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.connections().delete("testRG", "testConnection", com.azure.core.util.Context.NONE);
    }
}
```

### Connections_GetByResourceGroup

```java
/**
 * Samples for Connections GetByResourceGroup.
 */
public final class ConnectionsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * getConnection.json
     */
    /**
     * Sample code: Gets connection resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        getsConnectionResource(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.connections()
            .getByResourceGroupWithResponse("testRG", "testConnection", com.azure.core.util.Context.NONE);
    }
}
```

### Connections_Link

```java
import com.azure.resourcemanager.azuredatatransfer.models.ResourceBody;

/**
 * Samples for Connections Link.
 */
public final class ConnectionsLinkSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * linkConnection.json
     */
    /**
     * Sample code: Links the specified connection.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        linksTheSpecifiedConnection(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.connections()
            .link("testRG", "testConnection", new ResourceBody().withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRG/providers/Microsoft.AzureDataTransfer/connections/testConnection"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Connections_List

```java
/**
 * Samples for Connections List.
 */
public final class ConnectionsListSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * listConnectionsBySubscription.json
     */
    /**
     * Sample code: Gets connections in a subscription.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        getsConnectionsInASubscription(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.connections().list(com.azure.core.util.Context.NONE);
    }
}
```

### Connections_ListByResourceGroup

```java
/**
 * Samples for Connections ListByResourceGroup.
 */
public final class ConnectionsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * listConnectionsByResourceGroup.json
     */
    /**
     * Sample code: Gets connections in a resource group.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        getsConnectionsInAResourceGroup(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.connections().listByResourceGroup("testRG", com.azure.core.util.Context.NONE);
    }
}
```

### Connections_Update

```java
import com.azure.resourcemanager.azuredatatransfer.models.Connection;

/**
 * Samples for Connections Update.
 */
public final class ConnectionsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * patchConnection.json
     */
    /**
     * Sample code: Updates the connection resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        updatesTheConnectionResource(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        Connection resource = manager.connections()
            .getByResourceGroupWithResponse("testRG", "testConnection", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### Flows_CreateOrUpdate

```java
import com.azure.resourcemanager.azuredatatransfer.fluent.models.FlowPropertiesInner;
import com.azure.resourcemanager.azuredatatransfer.models.FlowType;
import com.azure.resourcemanager.azuredatatransfer.models.SelectedResource;

/**
 * Samples for Flows CreateOrUpdate.
 */
public final class FlowsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * createOrUpdateFlow.json
     */
    /**
     * Sample code: Creates or updates the flow resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        createsOrUpdatesTheFlowResource(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows()
            .define("testFlow")
            .withRegion("East US")
            .withExistingConnection("testRG", "testConnection")
            .withProperties(new FlowPropertiesInner().withConnection(new SelectedResource().withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRG/providers/Microsoft.AzureDataTransfer/connections/testConnection"))
                .withStorageAccountName("testsa")
                .withStorageContainerName("testcontainer")
                .withFlowType(FlowType.STANDARD))
            .create();
    }
}
```

### Flows_Delete

```java
/**
 * Samples for Flows Delete.
 */
public final class FlowsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * deleteFlow.json
     */
    /**
     * Sample code: Deletes the flow resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        deletesTheFlowResource(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows().delete("testRG", "testConnection", "testFlow", com.azure.core.util.Context.NONE);
    }
}
```

### Flows_Disable

```java
/**
 * Samples for Flows Disable.
 */
public final class FlowsDisableSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * enableOrDisableFlow.json
     */
    /**
     * Sample code: Disables the specified flow.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        disablesTheSpecifiedFlow(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows().disable("testRG", "testConnection", "testFlow", com.azure.core.util.Context.NONE);
    }
}
```

### Flows_Enable

```java
/**
 * Samples for Flows Enable.
 */
public final class FlowsEnableSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * enableOrDisableFlow.json
     */
    /**
     * Sample code: Enables the specified flow.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        enablesTheSpecifiedFlow(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows().enable("testRG", "testConnection", "testFlow", com.azure.core.util.Context.NONE);
    }
}
```

### Flows_GeneratePassphrase

```java
/**
 * Samples for Flows GeneratePassphrase.
 */
public final class FlowsGeneratePassphraseSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * generateFlowPassphrase.json
     */
    /**
     * Sample code: Generate a new compliant streaming passphrase.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void generateANewCompliantStreamingPassphrase(
        com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows().generatePassphrase("testRG", "testConnection", "testFlow", com.azure.core.util.Context.NONE);
    }
}
```

### Flows_Get

```java
/**
 * Samples for Flows Get.
 */
public final class FlowsGetSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * getFlow.json
     */
    /**
     * Sample code: Gets flow resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void getsFlowResource(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows().getWithResponse("testRG", "testConnection", "testFlow", com.azure.core.util.Context.NONE);
    }
}
```

### Flows_GetDestinationEndpointPorts

```java
/**
 * Samples for Flows GetDestinationEndpointPorts.
 */
public final class FlowsGetDestinationEndpointPortsSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * getFlowDestinationEndpointPorts.json
     */
    /**
     * Sample code: Get the flow stream destination endpoint ports.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void getTheFlowStreamDestinationEndpointPorts(
        com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows()
            .getDestinationEndpointPortsWithResponse("testRG", "testConnection", "testFlow",
                com.azure.core.util.Context.NONE);
    }
}
```

### Flows_GetDestinationEndpoints

```java
/**
 * Samples for Flows GetDestinationEndpoints.
 */
public final class FlowsGetDestinationEndpointsSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * getFlowDestinationEndpoints.json
     */
    /**
     * Sample code: Get the flow stream destination endpoints.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void getTheFlowStreamDestinationEndpoints(
        com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows()
            .getDestinationEndpointsWithResponse("testRG", "testConnection", "testFlow",
                com.azure.core.util.Context.NONE);
    }
}
```

### Flows_GetSourceAddresses

```java
/**
 * Samples for Flows GetSourceAddresses.
 */
public final class FlowsGetSourceAddressesSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * getFlowSourceAddresses.json
     */
    /**
     * Sample code: Get the flow stream source addresses.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        getTheFlowStreamSourceAddresses(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows()
            .getSourceAddressesWithResponse("testRG", "testConnection", "testFlow", com.azure.core.util.Context.NONE);
    }
}
```

### Flows_GetStreamConnectionString

```java
/**
 * Samples for Flows GetStreamConnectionString.
 */
public final class FlowsGetStreamConnectionStringSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * getStreamConnectionString.json
     */
    /**
     * Sample code: Get the flow stream connection string.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        getTheFlowStreamConnectionString(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows()
            .getStreamConnectionStringWithResponse("testRG", "testConnection", "testFlow",
                com.azure.core.util.Context.NONE);
    }
}
```

### Flows_Link

```java
import com.azure.resourcemanager.azuredatatransfer.models.ResourceBody;

/**
 * Samples for Flows Link.
 */
public final class FlowsLinkSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * linkFlow.json
     */
    /**
     * Sample code: Links the specified flow.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        linksTheSpecifiedFlow(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows()
            .link("testRG", "testConnection", "testFlow", new ResourceBody().withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRG/providers/Microsoft.AzureDataTransfer/connections/testConnection/flows/testFlow"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Flows_ListByConnection

```java
/**
 * Samples for Flows ListByConnection.
 */
public final class FlowsListByConnectionSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * listFlowsByConnection.json
     */
    /**
     * Sample code: Gets flows in a connection.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        getsFlowsInAConnection(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows().listByConnection("testRG", "testConnection", com.azure.core.util.Context.NONE);
    }
}
```

### Flows_SetDestinationEndpointPorts

```java
import com.azure.resourcemanager.azuredatatransfer.models.SetDestinationEndpointPorts;
import java.util.Arrays;

/**
 * Samples for Flows SetDestinationEndpointPorts.
 */
public final class FlowsSetDestinationEndpointPortsSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * setFlowDestinationEndpointPorts.json
     */
    /**
     * Sample code: Set the flow stream destination endpoint ports.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void setTheFlowStreamDestinationEndpointPorts(
        com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows()
            .setDestinationEndpointPorts("testRG", "testConnection", "testFlow",
                new SetDestinationEndpointPorts().withPorts(Arrays.asList(1234L)), com.azure.core.util.Context.NONE);
    }
}
```

### Flows_SetDestinationEndpoints

```java
import com.azure.resourcemanager.azuredatatransfer.models.SetDestinationEndpoints;
import java.util.Arrays;

/**
 * Samples for Flows SetDestinationEndpoints.
 */
public final class FlowsSetDestinationEndpointsSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * setFlowDestinationEndpoints.json
     */
    /**
     * Sample code: Set the flow stream destination endpoints.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void setTheFlowStreamDestinationEndpoints(
        com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows()
            .setDestinationEndpoints("testRG", "testConnection", "testFlow",
                new SetDestinationEndpoints().withEndpoints(Arrays.asList("10.0.0.1")),
                com.azure.core.util.Context.NONE);
    }
}
```

### Flows_SetPassphrase

```java
import com.azure.resourcemanager.azuredatatransfer.models.SetStreamPassphrase;

/**
 * Samples for Flows SetPassphrase.
 */
public final class FlowsSetPassphraseSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * setFlowPassphrase.json
     */
    /**
     * Sample code: Set the flow stream passphrase.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        setTheFlowStreamPassphrase(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows()
            .setPassphrase("testRG", "testConnection", "testFlow", new SetStreamPassphrase().withValue("password123"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Flows_SetSourceAddresses

```java
import com.azure.resourcemanager.azuredatatransfer.models.SetSourceAddresses;
import java.util.Arrays;

/**
 * Samples for Flows SetSourceAddresses.
 */
public final class FlowsSetSourceAddressesSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * setFlowSourceAddresses.json
     */
    /**
     * Sample code: Set the flow stream source addresses.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        setTheFlowStreamSourceAddresses(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.flows()
            .setSourceAddresses("testRG", "testConnection", "testFlow",
                new SetSourceAddresses().withValues(Arrays.asList("0.0.0.0", "1.0.0.0/24")),
                com.azure.core.util.Context.NONE);
    }
}
```

### Flows_Update

```java
import com.azure.resourcemanager.azuredatatransfer.models.Flow;

/**
 * Samples for Flows Update.
 */
public final class FlowsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * patchFlow.json
     */
    /**
     * Sample code: Updates the flow resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        updatesTheFlowResource(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        Flow resource = manager.flows()
            .getWithResponse("testRG", "testConnection", "testFlow", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### ListPendingConnections_List

```java
/**
 * Samples for ListPendingConnections List.
 */
public final class ListPendingConnectionsListSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * listPendingConnections.json
     */
    /**
     * Sample code: Lists a list of pending connections.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        listsAListOfPendingConnections(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.listPendingConnections().list("testRG", "testConnection", com.azure.core.util.Context.NONE);
    }
}
```

### ListPendingFlows_List

```java
/**
 * Samples for ListPendingFlows List.
 */
public final class ListPendingFlowsListSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * listPendingFlows.json
     */
    /**
     * Sample code: Lists a list of pending flows.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        listsAListOfPendingFlows(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.listPendingFlows().list("testRG", "testConnection", com.azure.core.util.Context.NONE);
    }
}
```

### ListSchemas_List

```java
import com.azure.resourcemanager.azuredatatransfer.models.Schema;

/**
 * Samples for ListSchemas List.
 */
public final class ListSchemasListSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * listSchemas.json
     */
    /**
     * Sample code: Lists schemas for a pipeline.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        listsSchemasForAPipeline(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.listSchemas()
            .listWithResponse("testRG", "testPipeline", new Schema().withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRG/providers/Microsoft.AzureDataTransfer/connections/testConnection")
                .withName("test.xsd"), com.azure.core.util.Context.NONE);
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
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * listOperations.json
     */
    /**
     * Sample code: List operations.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void listOperations(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Pipelines_ApproveConnection

```java
import com.azure.resourcemanager.azuredatatransfer.models.ResourceBody;

/**
 * Samples for Pipelines ApproveConnection.
 */
public final class PipelinesApproveConnectionSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * approveOrRejectConnection.json
     */
    /**
     * Sample code: Approves the specified connection in a pipeline.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void approvesTheSpecifiedConnectionInAPipeline(
        com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.pipelines()
            .approveConnection("testRG", "testPipeline", new ResourceBody().withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRG/providers/Microsoft.AzureDataTransfer/connections/testConnection")
                .withStatusReason("Example reason"), com.azure.core.util.Context.NONE);
    }
}
```

### Pipelines_CreateOrUpdate

```java
import com.azure.resourcemanager.azuredatatransfer.models.PipelineProperties;

/**
 * Samples for Pipelines CreateOrUpdate.
 */
public final class PipelinesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * createOrUpdatePipeline.json
     */
    /**
     * Sample code: Creates or updates the pipeline resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void createsOrUpdatesThePipelineResource(
        com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.pipelines()
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
/**
 * Samples for Pipelines Delete.
 */
public final class PipelinesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * deletePipeline.json
     */
    /**
     * Sample code: Deletes the pipeline resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        deletesThePipelineResource(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.pipelines().delete("testRG", "testPipeline", com.azure.core.util.Context.NONE);
    }
}
```

### Pipelines_GetByResourceGroup

```java
/**
 * Samples for Pipelines GetByResourceGroup.
 */
public final class PipelinesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * getPipeline.json
     */
    /**
     * Sample code: Gets pipeline resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        getsPipelineResource(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.pipelines().getByResourceGroupWithResponse("testRG", "testPipeline", com.azure.core.util.Context.NONE);
    }
}
```

### Pipelines_List

```java
/**
 * Samples for Pipelines List.
 */
public final class PipelinesListSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * listPipelinesBySubscription.json
     */
    /**
     * Sample code: Gets pipelines in a subscription.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        getsPipelinesInASubscription(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.pipelines().list(com.azure.core.util.Context.NONE);
    }
}
```

### Pipelines_ListByResourceGroup

```java
/**
 * Samples for Pipelines ListByResourceGroup.
 */
public final class PipelinesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * listPipelinesByResourceGroup.json
     */
    /**
     * Sample code: Gets pipelines in a resource group.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        getsPipelinesInAResourceGroup(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.pipelines().listByResourceGroup("testRG", com.azure.core.util.Context.NONE);
    }
}
```

### Pipelines_RejectConnection

```java
import com.azure.resourcemanager.azuredatatransfer.models.ResourceBody;

/**
 * Samples for Pipelines RejectConnection.
 */
public final class PipelinesRejectConnectionSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * approveOrRejectConnection.json
     */
    /**
     * Sample code: Rejects the specified connection in a pipeline.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void rejectsTheSpecifiedConnectionInAPipeline(
        com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        manager.pipelines()
            .rejectConnection("testRG", "testPipeline", new ResourceBody().withId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRG/providers/Microsoft.AzureDataTransfer/connections/testConnection")
                .withStatusReason("Example reason"), com.azure.core.util.Context.NONE);
    }
}
```

### Pipelines_Update

```java
import com.azure.resourcemanager.azuredatatransfer.models.Pipeline;

/**
 * Samples for Pipelines Update.
 */
public final class PipelinesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/azuredatatransfer/resource-manager/Microsoft.AzureDataTransfer/preview/2025-03-01-preview/examples/
     * patchPipeline.json
     */
    /**
     * Sample code: Updates the pipeline resource.
     * 
     * @param manager Entry point to AzuredatatransferManager.
     */
    public static void
        updatesThePipelineResource(com.azure.resourcemanager.azuredatatransfer.AzuredatatransferManager manager) {
        Pipeline resource = manager.pipelines()
            .getByResourceGroupWithResponse("testRG", "testPipeline", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

