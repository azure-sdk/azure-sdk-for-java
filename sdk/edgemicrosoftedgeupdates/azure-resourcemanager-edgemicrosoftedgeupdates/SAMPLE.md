# Code snippets and samples


## Updates

- [CreateOrModify](#updates_createormodify)
- [Delete](#updates_delete)
- [Get](#updates_get)
- [List](#updates_list)
- [Modify](#updates_modify)
### Updates_CreateOrModify

```java
import com.azure.resourcemanager.edgemicrosoftedgeupdates.models.UpdateStatus;
import java.util.stream.Collectors;

/**
 * Samples for Updates CreateOrModify.
 */
public final class UpdatesCreateOrModifySamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: Updates_CreateOrUpdate_MinimumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesCreateOrUpdateMinimumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        manager.updates().define("string").withExistingResourceUri("string").withStatus(UpdateStatus.UPTO_DATE).create();
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Updates_CreateOrUpdate_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesCreateOrUpdateMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        manager.updates().define("string").withExistingResourceUri("string").withStatus(UpdateStatus.UPTO_DATE).create();
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_CreateOrModify_MaximumSet_Gen.json
     */
    /**
     * Sample code: Updates_CreateOrModify_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesCreateOrModifyMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        manager.updates().define("string").withExistingResourceUri("string").withStatus(UpdateStatus.UPTO_DATE).create();
    }
}
```

### Updates_Delete

```java
/**
 * Samples for Updates Delete.
 */
public final class UpdatesDeleteSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: Updates_Delete_MinimumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesDeleteMinimumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        manager.updates().deleteByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Updates_Delete_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesDeleteMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        manager.updates().deleteByResourceGroupWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }
}
```

### Updates_Get

```java
/**
 * Samples for Updates Get.
 */
public final class UpdatesGetSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Updates_Get_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesGetMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        manager.updates().getWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: Updates_Get_MinimumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesGetMinimumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        manager.updates().getWithResponse("string", "string", com.azure.core.util.Context.NONE);
    }
}
```

### Updates_List

```java
/**
 * Samples for Updates List.
 */
public final class UpdatesListSamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Updates_List_MinimumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesListMinimumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        manager.updates().list("string", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Updates_List_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesListMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        manager.updates().list("string", com.azure.core.util.Context.NONE);
    }
}
```

### Updates_Modify

```java
import com.azure.resourcemanager.edgemicrosoftedgeupdates.models.Update;

/**
 * Samples for Updates Modify.
 */
public final class UpdatesModifySamples {
    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: Updates_Update_MinimumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesUpdateMinimumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        Update resource = manager.updates().getWithResponse("string", "string", com.azure.core.util.Context.NONE).getValue();
        resource.update().withStatus("UptoDate").apply();
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_Modify_MaximumSet_Gen.json
     */
    /**
     * Sample code: Updates_Modify_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesModifyMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        Update resource = manager.updates().getWithResponse("string", "string", com.azure.core.util.Context.NONE).getValue();
        resource.update().withStatus("UptoDate").apply();
    }

    /*
     * x-ms-original-file: specification/edge/resource-manager/Microsoft.Edge/updates/preview/2023-07-01-preview/examples/Updates_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Updates_Update_MaximumSet_Gen.
     * 
     * @param manager Entry point to EdgemicrosoftedgeupdatesManager.
     */
    public static void updatesUpdateMaximumSetGen(com.azure.resourcemanager.edgemicrosoftedgeupdates.EdgemicrosoftedgeupdatesManager manager) {
        Update resource = manager.updates().getWithResponse("string", "string", com.azure.core.util.Context.NONE).getValue();
        resource.update().withStatus("UptoDate").apply();
    }
}
```

