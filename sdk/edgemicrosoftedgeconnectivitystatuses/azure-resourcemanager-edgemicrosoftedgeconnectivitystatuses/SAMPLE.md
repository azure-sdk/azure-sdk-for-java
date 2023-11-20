# Code snippets and samples


## ConnectivityStatuses

- [CreateOrUpdate](#connectivitystatuses_createorupdate)
- [Delete](#connectivitystatuses_delete)
- [Get](#connectivitystatuses_get)
- [List](#connectivitystatuses_list)
- [Update](#connectivitystatuses_update)
### ConnectivityStatuses_CreateOrUpdate

```java
import com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.models.ConnectivityStatusEnum;
import java.util.stream.Collectors;

/**
 * Samples for ConnectivityStatuses CreateOrUpdate.
 */
public final class ConnectivityStatuses {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/connectivityStatuses/preview/2023-07-01-preview/examples/ConnectivityStatuses_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: ConnectivityStatuses_CreateOrUpdate_MinimumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeconnectivitystatusesManager.
     */
    public static void connectivityStatusesCreateOrUpdateMinimumSetGen(com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.EdgemicrosoftedgeconnectivitystatusesManager manager) {
        manager.connectivityStatuses().define("string").withExistingResourceUri("string").withStatus(ConnectivityStatusEnum.fromString("string")).create();
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/connectivityStatuses/preview/2023-07-01-preview/examples/ConnectivityStatuses_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ConnectivityStatuses_CreateOrUpdate_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeconnectivitystatusesManager.
     */
    public static void connectivityStatusesCreateOrUpdateMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.EdgemicrosoftedgeconnectivitystatusesManager manager) {
        manager.connectivityStatuses().define("string").withExistingResourceUri("string").withStatus(ConnectivityStatusEnum.fromString("string")).create();
    }
}
```

### ConnectivityStatuses_Delete

```java
/**
 * Samples for ConnectivityStatuses Delete.
 */
public final class ConnectivityStatuses {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/connectivityStatuses/preview/2023-07-01-preview/examples/ConnectivityStatuses_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: ConnectivityStatuses_Delete_MinimumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeconnectivitystatusesManager.
     */
    public static void connectivityStatusesDeleteMinimumSetGen(com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.EdgemicrosoftedgeconnectivitystatusesManager manager) {
        manager.connectivityStatuses().deleteByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/connectivityStatuses/preview/2023-07-01-preview/examples/ConnectivityStatuses_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: ConnectivityStatuses_Delete_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeconnectivitystatusesManager.
     */
    public static void connectivityStatusesDeleteMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.EdgemicrosoftedgeconnectivitystatusesManager manager) {
        manager.connectivityStatuses().deleteByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectivityStatuses_Get

```java
/**
 * Samples for ConnectivityStatuses Get.
 */
public final class ConnectivityStatuses {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/connectivityStatuses/preview/2023-07-01-preview/examples/ConnectivityStatuses_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: ConnectivityStatuses_Get_MinimumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeconnectivitystatusesManager.
     */
    public static void connectivityStatusesGetMinimumSetGen(com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.EdgemicrosoftedgeconnectivitystatusesManager manager) {
        manager.connectivityStatuses().getWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/connectivityStatuses/preview/2023-07-01-preview/examples/ConnectivityStatuses_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: ConnectivityStatuses_Get_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeconnectivitystatusesManager.
     */
    public static void connectivityStatusesGetMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.EdgemicrosoftedgeconnectivitystatusesManager manager) {
        manager.connectivityStatuses().getWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectivityStatuses_List

```java
/**
 * Samples for ConnectivityStatuses List.
 */
public final class ConnectivityStatuses {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/connectivityStatuses/preview/2023-07-01-preview/examples/ConnectivityStatuses_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: ConnectivityStatuses_List_MinimumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeconnectivitystatusesManager.
     */
    public static void connectivityStatusesListMinimumSetGen(com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.EdgemicrosoftedgeconnectivitystatusesManager manager) {
        manager.connectivityStatuses().list("string", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/connectivityStatuses/preview/2023-07-01-preview/examples/ConnectivityStatuses_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: ConnectivityStatuses_List_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeconnectivitystatusesManager.
     */
    public static void connectivityStatusesListMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.EdgemicrosoftedgeconnectivitystatusesManager manager) {
        manager.connectivityStatuses().list("string", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectivityStatuses_Update

```java
import com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.models.ConnectivityStatus;
import com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.models.ConnectivityStatusEnumForUpdate;
import java.util.stream.Collectors;

/**
 * Samples for ConnectivityStatuses Update.
 */
public final class ConnectivityStatuses {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/connectivityStatuses/preview/2023-07-01-preview/examples/ConnectivityStatuses_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: ConnectivityStatuses_Update_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeconnectivitystatusesManager.
     */
    public static void connectivityStatusesUpdateMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.EdgemicrosoftedgeconnectivitystatusesManager manager) {
        ConnectivityStatus resource = manager.connectivityStatuses().getWithResponse("string", "string", com.azure.core.util.Context.NONE).getValue();
        resource.update().withStatus(ConnectivityStatusEnumForUpdate.CONNECTED).apply();
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/connectivityStatuses/preview/2023-07-01-preview/examples/ConnectivityStatuses_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: ConnectivityStatuses_Update_MinimumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeconnectivitystatusesManager.
     */
    public static void connectivityStatusesUpdateMinimumSetGen(com.azure.resourcemanager.edgemicrosoftedgeconnectivitystatuses.EdgemicrosoftedgeconnectivitystatusesManager manager) {
        ConnectivityStatus resource = manager.connectivityStatuses().getWithResponse("string", "string", com.azure.core.util.Context.NONE).getValue();
        resource.update().withStatus(ConnectivityStatusEnumForUpdate.CONNECTED).apply();
    }
}
```

