# Code snippets and samples


## PrivateEndpointConnections

- [CreateOrUpdate](#privateendpointconnections_createorupdate)
- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [ListByServer](#privateendpointconnections_listbyserver)

## PrivateLinkResources

- [Get](#privatelinkresources_get)
- [ListByServer](#privatelinkresources_listbyserver)
### PrivateEndpointConnections_CreateOrUpdate

```java
import com.azure.resourcemanager.mysqlflexibleserver.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.mysqlflexibleserver.models.PrivateLinkServiceConnectionState;

/** Samples for PrivateEndpointConnections CreateOrUpdate. */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/PrivateLink/stable/2023-06-30/examples/PrivateEndpointConnectionUpdate.json
     */
    /**
     * Sample code: Approve or reject a private endpoint connection with a given name.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void approveOrRejectAPrivateEndpointConnectionWithAGivenName(
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager
            .privateEndpointConnections()
            .define("private-endpoint-connection-name")
            .withExistingFlexibleServer("Default", "test-svr")
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState()
                    .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                    .withDescription("Approved by johndoe@contoso.com"))
            .create();
    }
}
```

### PrivateEndpointConnections_Delete

```java
/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/PrivateLink/stable/2023-06-30/examples/PrivateEndpointConnectionDelete.json
     */
    /**
     * Sample code: Deletes a private endpoint connection with a given name.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void deletesAPrivateEndpointConnectionWithAGivenName(
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager
            .privateEndpointConnections()
            .delete("Default", "test-svr", "private-endpoint-connection-name", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/PrivateLink/stable/2023-06-30/examples/PrivateEndpointConnectionGet.json
     */
    /**
     * Sample code: Gets private endpoint connection.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void getsPrivateEndpointConnection(
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse(
                "Default", "test-svr", "private-endpoint-connection-name", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_ListByServer

```java
/** Samples for PrivateEndpointConnections ListByServer. */
public final class PrivateEndpointConnectionsListByServerSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/PrivateLink/stable/2023-06-30/examples/PrivateEndpointConnectionList.json
     */
    /**
     * Sample code: Gets list of private endpoint connections on a server.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void getsListOfPrivateEndpointConnectionsOnAServer(
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager
            .privateEndpointConnections()
            .listByServerWithResponse("Default", "test-svr", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_Get

```java
/** Samples for PrivateLinkResources Get. */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/PrivateLink/stable/2023-06-30/examples/PrivateLinkResourcesGet.json
     */
    /**
     * Sample code: Gets a private link resource for MySQL.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void getsAPrivateLinkResourceForMySQL(
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.privateLinkResources().getWithResponse("Default", "test-svr", "plr", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_ListByServer

```java
/** Samples for PrivateLinkResources ListByServer. */
public final class PrivateLinkResourcesListByServerSamples {
    /*
     * x-ms-original-file: specification/mysql/resource-manager/Microsoft.DBforMySQL/PrivateLink/stable/2023-06-30/examples/PrivateLinkResourcesList.json
     */
    /**
     * Sample code: Gets private link resources for MySQL.
     *
     * @param manager Entry point to MySqlManager.
     */
    public static void getsPrivateLinkResourcesForMySQL(
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager
            .privateLinkResources()
            .listByServerWithResponse("Default", "test-svr", com.azure.core.util.Context.NONE);
    }
}
```

