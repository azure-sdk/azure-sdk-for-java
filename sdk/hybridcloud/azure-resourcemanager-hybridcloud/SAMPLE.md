# Code snippets and samples


## CloudConnections

- [CreateOrUpdate](#cloudconnections_createorupdate)
- [Delete](#cloudconnections_delete)
- [GetByResourceGroup](#cloudconnections_getbyresourcegroup)
- [UpdateTags](#cloudconnections_updatetags)

## CloudConnectionsByResourceGroup

- [ListByResourceGroup](#cloudconnectionsbyresourcegroup_listbyresourcegroup)

## CloudConnectionsBySubscription

- [List](#cloudconnectionsbysubscription_list)

## CloudConnectors

- [CreateOrUpdate](#cloudconnectors_createorupdate)
- [Delete](#cloudconnectors_delete)
- [DiscoverResources](#cloudconnectors_discoverresources)
- [GetByResourceGroup](#cloudconnectors_getbyresourcegroup)
- [UpdateTags](#cloudconnectors_updatetags)

## CloudConnectorsByResourceGroup

- [ListByResourceGroup](#cloudconnectorsbyresourcegroup_listbyresourcegroup)

## CloudConnectorsBySubscription

- [List](#cloudconnectorsbysubscription_list)

## Operations

- [List](#operations_list)
### CloudConnections_CreateOrUpdate

```java
/** Samples for CloudConnections CreateOrUpdate. */
public final class CloudConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectionCreate.json
     */
    /**
     * Sample code: Create a Cloud Connection.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void createACloudConnection(com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager
            .cloudConnections()
            .define("cloudconnection1")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .create();
    }
}
```

### CloudConnections_Delete

```java
import com.azure.core.util.Context;

/** Samples for CloudConnections Delete. */
public final class CloudConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectionDelete.json
     */
    /**
     * Sample code: Delete Cloud Connection.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void deleteCloudConnection(com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager.cloudConnections().delete("rg1", "cloudconnection1", Context.NONE);
    }
}
```

### CloudConnections_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for CloudConnections GetByResourceGroup. */
public final class CloudConnectionsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectionGet.json
     */
    /**
     * Sample code: Get Cloud Connection.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void getCloudConnection(com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager.cloudConnections().getByResourceGroupWithResponse("rg1", "cloudconnection1", Context.NONE);
    }
}
```

### CloudConnections_UpdateTags

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcloud.models.CloudConnection;
import java.util.HashMap;
import java.util.Map;

/** Samples for CloudConnections UpdateTags. */
public final class CloudConnectionsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectionUpdateTags.json
     */
    /**
     * Sample code: Update Cloud Connections tags.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void updateCloudConnectionsTags(com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        CloudConnection resource =
            manager
                .cloudConnections()
                .getByResourceGroupWithResponse("rg1", "cloudConnection1", Context.NONE)
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

### CloudConnectionsByResourceGroup_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for CloudConnectionsByResourceGroup ListByResourceGroup. */
public final class CloudConnectionsByResourceGroupListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectionsByResourceGroupList.json
     */
    /**
     * Sample code: List of Cloud Connectors by ResourceGroup.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void listOfCloudConnectorsByResourceGroup(
        com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager.cloudConnectionsByResourceGroups().listByResourceGroup("rg1", Context.NONE);
    }
}
```

### CloudConnectionsBySubscription_List

```java
import com.azure.core.util.Context;

/** Samples for CloudConnectionsBySubscription List. */
public final class CloudConnectionsBySubscriptionListSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectionsBySubscriptionList.json
     */
    /**
     * Sample code: List of Cloud Connections by Subscription.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void listOfCloudConnectionsBySubscription(
        com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager.cloudConnectionsBySubscriptions().list(Context.NONE);
    }
}
```

### CloudConnectors_CreateOrUpdate

```java
/** Samples for CloudConnectors CreateOrUpdate. */
public final class CloudConnectorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectorCreate.json
     */
    /**
     * Sample code: Create a Cloud Connector.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void createACloudConnector(com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager
            .cloudConnectors()
            .define("cloudconnector10")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .create();
    }
}
```

### CloudConnectors_Delete

```java
import com.azure.core.util.Context;

/** Samples for CloudConnectors Delete. */
public final class CloudConnectorsDeleteSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectorDelete.json
     */
    /**
     * Sample code: Delete Cloud Connector.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void deleteCloudConnector(com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager.cloudConnectors().delete("rg1", "cloudConnectorName", Context.NONE);
    }
}
```

### CloudConnectors_DiscoverResources

```java
import com.azure.core.util.Context;

/** Samples for CloudConnectors DiscoverResources. */
public final class CloudConnectorsDiscoverResourcesSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectorDiscoverResources.json
     */
    /**
     * Sample code: Get remote cloud resources by cloud connector name.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void getRemoteCloudResourcesByCloudConnectorName(
        com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager.cloudConnectors().discoverResourcesWithResponse("rg1", "cloudconnector10", Context.NONE);
    }
}
```

### CloudConnectors_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for CloudConnectors GetByResourceGroup. */
public final class CloudConnectorsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectorGet.json
     */
    /**
     * Sample code: Get Cloud Connector.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void getCloudConnector(com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager.cloudConnectors().getByResourceGroupWithResponse("rg1", "cloudconnector9", Context.NONE);
    }
}
```

### CloudConnectors_UpdateTags

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcloud.models.CloudConnector;
import java.util.HashMap;
import java.util.Map;

/** Samples for CloudConnectors UpdateTags. */
public final class CloudConnectorsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectorUpdateTags.json
     */
    /**
     * Sample code: Update Cloud Connectors tags.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void updateCloudConnectorsTags(com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        CloudConnector resource =
            manager.cloudConnectors().getByResourceGroupWithResponse("rg1", "cloudConnector", Context.NONE).getValue();
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

### CloudConnectorsByResourceGroup_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for CloudConnectorsByResourceGroup ListByResourceGroup. */
public final class CloudConnectorsByResourceGroupListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectorsByResourceGroupList.json
     */
    /**
     * Sample code: List of Cloud Connectors by ResourceGroup.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void listOfCloudConnectorsByResourceGroup(
        com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager.cloudConnectorsByResourceGroups().listByResourceGroup("rg1", Context.NONE);
    }
}
```

### CloudConnectorsBySubscription_List

```java
import com.azure.core.util.Context;

/** Samples for CloudConnectorsBySubscription List. */
public final class CloudConnectorsBySubscriptionListSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/CloudConnectorsBySubscriptionList.json
     */
    /**
     * Sample code: List of Cloud Connectors by Subscription.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void listOfCloudConnectorsBySubscription(
        com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager.cloudConnectorsBySubscriptions().list(Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/hybridcloud/resource-manager/Microsoft.HybridCloud/preview/2022-11-01-preview/examples/OperationGroupGet.json
     */
    /**
     * Sample code: BatchAccountDelete.
     *
     * @param manager Entry point to HybridcloudManager.
     */
    public static void batchAccountDelete(com.azure.resourcemanager.hybridcloud.HybridcloudManager manager) {
        manager.operations().listWithResponse(Context.NONE);
    }
}
```

