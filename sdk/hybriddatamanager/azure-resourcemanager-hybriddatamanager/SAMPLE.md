# Code snippets and samples


## DataManagers

- [Create](#datamanagers_create)
- [Delete](#datamanagers_delete)
- [GetByResourceGroup](#datamanagers_getbyresourcegroup)
- [List](#datamanagers_list)
- [ListByResourceGroup](#datamanagers_listbyresourcegroup)
- [Update](#datamanagers_update)

## DataServices

- [Get](#dataservices_get)
- [ListByDataManager](#dataservices_listbydatamanager)

## DataStoreTypes

- [Get](#datastoretypes_get)
- [ListByDataManager](#datastoretypes_listbydatamanager)

## DataStores

- [CreateOrUpdate](#datastores_createorupdate)
- [Delete](#datastores_delete)
- [Get](#datastores_get)
- [ListByDataManager](#datastores_listbydatamanager)

## JobDefinitions

- [Cancel](#jobdefinitions_cancel)
- [CreateOrUpdate](#jobdefinitions_createorupdate)
- [Delete](#jobdefinitions_delete)
- [Get](#jobdefinitions_get)
- [ListByDataManager](#jobdefinitions_listbydatamanager)
- [ListByDataService](#jobdefinitions_listbydataservice)
- [RetryJob](#jobdefinitions_retryjob)
- [Run](#jobdefinitions_run)
- [SkipJob](#jobdefinitions_skipjob)

## Jobs

- [Cancel](#jobs_cancel)
- [Get](#jobs_get)
- [ListByDataManager](#jobs_listbydatamanager)
- [ListByDataService](#jobs_listbydataservice)
- [ListByJobDefinition](#jobs_listbyjobdefinition)
- [Resume](#jobs_resume)

## Operations

- [List](#operations_list)

## PublicKeys

- [Get](#publickeys_get)
- [ListByDataManager](#publickeys_listbydatamanager)
### DataManagers_Create

```java
/** Samples for DataManagers Create. */
public final class DataManagersCreateSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataManagers_Create-PUT-example-41.json
     */
    /**
     * Sample code: SessionRecords\DataManagersTest\DataManagers_CreatePUT41.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataManagersTestDataManagersCreatePUT41(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataManagers()
            .define("Microsoft.HybridData")
            .withRegion("eastus")
            .withExistingResourceGroup("6e0219f5-327a-4365-904f-05eed4227ad7")
            .create();
    }
}
```

### DataManagers_Delete

```java
import com.azure.core.util.Context;

/** Samples for DataManagers Delete. */
public final class DataManagersDeleteSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataManagers_Delete-DELETE-example-41.json
     */
    /**
     * Sample code: SessionRecords\DataManagersTest\DataManagers_DeleteDELETE41.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataManagersTestDataManagersDeleteDELETE41(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager.dataManagers().delete("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", Context.NONE);
    }
}
```

### DataManagers_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for DataManagers GetByResourceGroup. */
public final class DataManagersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataManagers_Get-GET-example-41.json
     */
    /**
     * Sample code: SessionRecords\DataManagersTest\DataManagers_GetGET41.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataManagersTestDataManagersGetGET41(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataManagers()
            .getByResourceGroupWithResponse(
                "6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", Context.NONE);
    }
}
```

### DataManagers_List

```java
import com.azure.core.util.Context;

/** Samples for DataManagers List. */
public final class DataManagersListSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataManagers_List-GET-example-21.json
     */
    /**
     * Sample code: SessionRecords\DataManagersTest\DataManagers_ListGET21.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataManagersTestDataManagersListGET21(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager.dataManagers().list(Context.NONE);
    }
}
```

### DataManagers_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for DataManagers ListByResourceGroup. */
public final class DataManagersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataManagers_ListByResourceGroup-GET-example-31.json
     */
    /**
     * Sample code: SessionRecords\DataManagersTest\DataManagers_ListByResourceGroupGET31.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataManagersTestDataManagersListByResourceGroupGET31(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager.dataManagers().listByResourceGroup("6e0219f5-327a-4365-904f-05eed4227ad7", Context.NONE);
    }
}
```

### DataManagers_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybriddatamanager.models.DataManager;
import com.azure.resourcemanager.hybriddatamanager.models.Sku;
import java.util.HashMap;
import java.util.Map;

/** Samples for DataManagers Update. */
public final class DataManagersUpdateSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataManagers_Update-PATCH-example-43.json
     */
    /**
     * Sample code: SessionRecords\DataManagersTest\DataManagers_UpdatePATCH43.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataManagersTestDataManagersUpdatePATCH43(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        DataManager resource =
            manager
                .dataManagers()
                .getByResourceGroupWithResponse(
                    "6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("UpdateDateTime", "21-07-2022 13:25:02"))
            .withSku(new Sku().withName("DS0").withTier("Standard"))
            .apply();
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

### DataServices_Get

```java
import com.azure.core.util.Context;

/** Samples for DataServices Get. */
public final class DataServicesGetSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataServices_Get-GET-example-62.json
     */
    /**
     * Sample code: SessionRecords\DataServicesTest\DataServices_GetGET62.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataServicesTestDataServicesGetGET62(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataServices()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataServices_Get-GET-example-64.json
     */
    /**
     * Sample code: SessionRecords\DataServicesTest\DataServices_GetGET64.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataServicesTestDataServicesGetGET64(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataServices()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataServices_Get-GET-example-63.json
     */
    /**
     * Sample code: SessionRecords\DataServicesTest\DataServices_GetGET63.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataServicesTestDataServicesGetGET63(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataServices()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataServices_Get-GET-example-66.json
     */
    /**
     * Sample code: SessionRecords\DataServicesTest\DataServices_GetGET66.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataServicesTestDataServicesGetGET66(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataServices()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataServices_Get-GET-example-65.json
     */
    /**
     * Sample code: SessionRecords\DataServicesTest\DataServices_GetGET65.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataServicesTestDataServicesGetGET65(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataServices()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataServices_Get-GET-example-68.json
     */
    /**
     * Sample code: SessionRecords\DataServicesTest\DataServices_GetGET68.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataServicesTestDataServicesGetGET68(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataServices()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataServices_Get-GET-example-67.json
     */
    /**
     * Sample code: SessionRecords\DataServicesTest\DataServices_GetGET67.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataServicesTestDataServicesGetGET67(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataServices()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### DataServices_ListByDataManager

```java
import com.azure.core.util.Context;

/** Samples for DataServices ListByDataManager. */
public final class DataServicesListByDataManagerSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataServices_Get-GET-example-51.json
     */
    /**
     * Sample code: SessionRecords\DataServicesTest\DataServices_GetGET51.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataServicesTestDataServicesGetGET51(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataServices()
            .listByDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataServices_ListByDataManager-GET-example-51.json
     */
    /**
     * Sample code: SessionRecords\DataServicesTest\DataServices_ListByDataManagerGET51.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataServicesTestDataServicesListByDataManagerGET51(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataServices()
            .listByDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", Context.NONE);
    }
}
```

### DataStoreTypes_Get

```java
import com.azure.core.util.Context;

/** Samples for DataStoreTypes Get. */
public final class DataStoreTypesGetSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStoreTypes_Get-GET-example-222.json
     */
    /**
     * Sample code: SessionRecords\DataStoreTypesTest\DataStoreTypes_GetGET222.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoreTypesTestDataStoreTypesGetGET222(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStoreTypes()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStoreTypes_Get-GET-example-224.json
     */
    /**
     * Sample code: SessionRecords\DataStoreTypesTest\DataStoreTypes_GetGET224.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoreTypesTestDataStoreTypesGetGET224(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStoreTypes()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStoreTypes_Get-GET-example-223.json
     */
    /**
     * Sample code: SessionRecords\DataStoreTypesTest\DataStoreTypes_GetGET223.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoreTypesTestDataStoreTypesGetGET223(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStoreTypes()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStoreTypes_Get-GET-example-226.json
     */
    /**
     * Sample code: SessionRecords\DataStoreTypesTest\DataStoreTypes_GetGET226.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoreTypesTestDataStoreTypesGetGET226(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStoreTypes()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStoreTypes_Get-GET-example-225.json
     */
    /**
     * Sample code: SessionRecords\DataStoreTypesTest\DataStoreTypes_GetGET225.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoreTypesTestDataStoreTypesGetGET225(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStoreTypes()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStoreTypes_Get-GET-example-227.json
     */
    /**
     * Sample code: SessionRecords\DataStoreTypesTest\DataStoreTypes_GetGET227.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoreTypesTestDataStoreTypesGetGET227(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStoreTypes()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### DataStoreTypes_ListByDataManager

```java
import com.azure.core.util.Context;

/** Samples for DataStoreTypes ListByDataManager. */
public final class DataStoreTypesListByDataManagerSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStoreTypes_Get-GET-example-211.json
     */
    /**
     * Sample code: SessionRecords\DataStoreTypesTest\DataStoreTypes_GetGET211.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoreTypesTestDataStoreTypesGetGET211(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStoreTypes()
            .listByDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStoreTypes_ListByDataManager-GET-example-211.json
     */
    /**
     * Sample code: SessionRecords\DataStoreTypesTest\DataStoreTypes_ListByDataManagerGET211.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoreTypesTestDataStoreTypesListByDataManagerGET211(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStoreTypes()
            .listByDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", Context.NONE);
    }
}
```

### DataStores_CreateOrUpdate

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.hybriddatamanager.models.CustomerSecret;
import com.azure.resourcemanager.hybriddatamanager.models.State;
import com.azure.resourcemanager.hybriddatamanager.models.SupportedAlgorithm;
import java.io.IOException;
import java.util.Arrays;

/** Samples for DataStores CreateOrUpdate. */
public final class DataStoresCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_CreateOrUpdate_DataSink-PUT-example-202.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_CreateOrUpdate_DataSinkPUT202.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresCreateOrUpdateDataSinkPUT202(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) throws IOException {
        manager
            .dataStores()
            .define("TestAzureSDKOperations1")
            .withExistingDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData")
            .withState(State.ENABLED)
            .withDataStoreTypeId(
                "/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations1/dataStoreTypes/AzureStorageAccount")
            .withRepositoryId(
                "/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.Storage/storageAccounts/dmsdatasink")
            .withExtendedProperties(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize(
                        "{\"extendedSaKey\":null,\"extendedSaName\":\"/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.Storage/storageAccounts/dmsdatasink\",\"storageAccountNameForQueue\":\"/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.Storage/storageAccounts/dmsdatasink\"}",
                        Object.class,
                        SerializerEncoding.JSON))
            .withCustomerSecrets(
                Arrays
                    .asList(
                        new CustomerSecret()
                            .withKeyIdentifier("StorageAccountAccessKey")
                            .withKeyValue(
                                "gqSiQXk0v/30+HEf2iSuW/7bOJtHd0XMZ+H4kPZE0k2AOy+rHIR58ufp+AnVFzLlKg8PHdjuF9ED1UfyzmgCX9OjgACK52Td6JB4/lLz2PWZtcgykiiEhKRzuOTWgPNFtAQxvFIKHp7mKNhBfW0o52KaCNHqz4bLiKK72OT0AFOZGvNKBPHXU8fwNU6JqhYxa7gMes3nJ3YqG46MIcxsQa9EQZnANs7GtYlgC2Rxk8kvpwygG05tx6fm3FYMokZ/yAoqH741KcFOi6h5oFX1XWAGNpXPz9NlVYcMt7aDJv4bGLaAuuBa+5LKLkEUaNaUJrgfQwBp6ypguwfdGkYKhw==:hv2nd0bFcZBnLpnPY0P1hzGN8t8ogCUgSo1R/c7AL+v2E8jJiJK3PqTLn4DC9PQRpQ21J7/wS4Uj79uguCFIB8KJTlKtemV/aMGOJkH33fRK7NSvsmmTXyH+EHEnjdo73HR5DVooYQ+JrIDICBYUcWCUu9osA0tB/fCVe8fGHXoPCfPtf24x8VLwU6Vpt2OodaPowsNjYbNPAXVNfDGDlzjBWJvUux9OD08jmZN8R+R2p+Y/QiipzKUNnrBOqTVNGILwP8AIuu5rBGFfsIjG3lKS3t1k8finSfFd0kYj6PTZcX/d9ZKOaeIdinZMZ7fEx5qQ5O3N1qUlMW9FFiJM1g==")
                            .withAlgorithm(SupportedAlgorithm.RSA1_5),
                        new CustomerSecret()
                            .withKeyIdentifier("StorageAccountAccessKeyForQueue")
                            .withKeyValue(
                                "gqSiQXk0v/30+HEf2iSuW/7bOJtHd0XMZ+H4kPZE0k2AOy+rHIR58ufp+AnVFzLlKg8PHdjuF9ED1UfyzmgCX9OjgACK52Td6JB4/lLz2PWZtcgykiiEhKRzuOTWgPNFtAQxvFIKHp7mKNhBfW0o52KaCNHqz4bLiKK72OT0AFOZGvNKBPHXU8fwNU6JqhYxa7gMes3nJ3YqG46MIcxsQa9EQZnANs7GtYlgC2Rxk8kvpwygG05tx6fm3FYMokZ/yAoqH741KcFOi6h5oFX1XWAGNpXPz9NlVYcMt7aDJv4bGLaAuuBa+5LKLkEUaNaUJrgfQwBp6ypguwfdGkYKhw==:hv2nd0bFcZBnLpnPY0P1hzGN8t8ogCUgSo1R/c7AL+v2E8jJiJK3PqTLn4DC9PQRpQ21J7/wS4Uj79uguCFIB8KJTlKtemV/aMGOJkH33fRK7NSvsmmTXyH+EHEnjdo73HR5DVooYQ+JrIDICBYUcWCUu9osA0tB/fCVe8fGHXoPCfPtf24x8VLwU6Vpt2OodaPowsNjYbNPAXVNfDGDlzjBWJvUux9OD08jmZN8R+R2p+Y/QiipzKUNnrBOqTVNGILwP8AIuu5rBGFfsIjG3lKS3t1k8finSfFd0kYj6PTZcX/d9ZKOaeIdinZMZ7fEx5qQ5O3N1qUlMW9FFiJM1g==")
                            .withAlgorithm(SupportedAlgorithm.RSA1_5)))
            .create();
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_CreateOrUpdate_DataSource-PUT-example-202.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_CreateOrUpdate_DataSourcePUT202.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresCreateOrUpdateDataSourcePUT202(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) throws IOException {
        manager
            .dataStores()
            .define("TestAzureSDKOperations1")
            .withExistingDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData")
            .withState(State.ENABLED)
            .withDataStoreTypeId(
                "/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations1/dataStoreTypes/StorSimple8000Series")
            .withRepositoryId(
                "/subscriptions/c5fc377d-0085-41b9-86b7-cc96dc56d1e9/resourceGroups/ForDMS/providers/Microsoft.StorSimple/managers/BLR8600")
            .withExtendedProperties(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize(
                        "{\"extendedSaKey\":null,\"resourceId\":\"/subscriptions/c5fc377d-0085-41b9-86b7-cc96dc56d1e9/resourceGroups/ForDMS/providers/Microsoft.StorSimple/managers/BLR8600\"}",
                        Object.class,
                        SerializerEncoding.JSON))
            .withCustomerSecrets(
                Arrays
                    .asList(
                        new CustomerSecret()
                            .withKeyIdentifier("ServiceEncryptionKey")
                            .withKeyValue(
                                "Hn+hdTpg/8Nt6jSlUw5DdRAM9MU5u6go8K6LiC6VzXO2PVjV8EkRI0dA0JmOk0rdww53jrcBHrAxU78ZfOG+AmBI8NFjqrIrSP10Dl4kB0OK33Tm+Bx3US1B8kXqsb6QrK43+cEr6l7NQ3kb4Wqhg34Prllx+4sIA/jqOJoTPliGIlSl7JrzLjRfq7mBktU/12i/clRPwSfjvZqg9moeDqpQZjz9ykhvE522Zo6JAhpuGhMMenQg61Z60VFkmoMWiXTOvv0vWh4CD3XlzlY+cYXmJCPCkAwG1cYdE+ujrg/0eSIYRcyTxZf+fLDIxFXE/z2GwqBWbMAitB5UYOsl0Q==:MZN1fpfkZP0XxsIYHcAe2fHx5oP4iXq2BIlIBPWRNdrYCPevshZYGuiGLGDUjIXF53qODT/JZqdPn12kt6pLD1KzIgVUKRA5z2C+LoDgOHpmnIMT3EA5emRhSjfmlt56DC73ShzdztCQGe0AnQBwdev1aDEQsPdzf0VQ4CaDw8Zr043ZuPAd8ALxZmQTVMQFanEBqe0gcbDAbKXKrmmEVpGuGcSz6qEIrS46Y1LxUKdwBtTBK5v8KWLnrpDIJ3LsQSQOMGaCzdN+AieF3A/XLoeIEsMD4bJS9pTPVtYkxfOA0wiJigSVPHEi9V0YhIimcMPv0h5wDJixpT3y/L8P+w==")
                            .withAlgorithm(SupportedAlgorithm.RSA1_5)))
            .create();
    }
}
```

### DataStores_Delete

```java
import com.azure.core.util.Context;

/** Samples for DataStores Delete. */
public final class DataStoresDeleteSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_Delete_DataSource-DELETE-example-201.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_Delete_DataSourceDELETE201.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresDeleteDataSourceDELETE201(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStores()
            .delete(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_Delete_DataSink-DELETE-example-201.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_Delete_DataSinkDELETE201.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresDeleteDataSinkDELETE201(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStores()
            .delete(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### DataStores_Get

```java
import com.azure.core.util.Context;

/** Samples for DataStores Get. */
public final class DataStoresGetSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_CreateOrUpdate_DataSink-GET-example-204.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_CreateOrUpdate_DataSinkGET204.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresCreateOrUpdateDataSinkGET204(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStores()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_CreateOrUpdate_DataSource-GET-example-204.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_CreateOrUpdate_DataSourceGET204.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresCreateOrUpdateDataSourceGET204(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStores()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_Get-GET-example-201.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_GetGET201.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresGetGET201(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStores()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_CreateOrUpdate-GET-example-201.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_CreateOrUpdateGET201.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsCreateOrUpdateGET201(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStores()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_Get-GET-example-202.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_GetGET202.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresGetGET202(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStores()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_CreateOrUpdate-GET-example-202.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_CreateOrUpdateGET202.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsCreateOrUpdateGET202(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStores()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_CreateOrUpdate_DataSink-GET-example-205.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_CreateOrUpdate_DataSinkGET205.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresCreateOrUpdateDataSinkGET205(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStores()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_CreateOrUpdate_DataSource-GET-example-205.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_CreateOrUpdate_DataSourceGET205.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresCreateOrUpdateDataSourceGET205(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStores()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### DataStores_ListByDataManager

```java
import com.azure.core.util.Context;

/** Samples for DataStores ListByDataManager. */
public final class DataStoresListByDataManagerSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_ListByDataManager-GET-example-191.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_ListByDataManagerGET191.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresListByDataManagerGET191(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .dataStores()
            .listByDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", null, Context.NONE);
    }
}
```

### JobDefinitions_Cancel

```java
import com.azure.core.util.Context;

/** Samples for JobDefinitions Cancel. */
public final class JobDefinitionsCancelSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_CancelJob-POST-example-91.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_CancelJobPOST91.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsCancelJobPOST91(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobDefinitions()
            .cancelWithResponse(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### JobDefinitions_CreateOrUpdate

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.hybriddatamanager.models.RunLocation;
import com.azure.resourcemanager.hybriddatamanager.models.State;
import com.azure.resourcemanager.hybriddatamanager.models.UserConfirmation;
import java.io.IOException;

/** Samples for JobDefinitions CreateOrUpdate. */
public final class JobDefinitionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_CreateOrUpdate-PUT-example-83.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_CreateOrUpdatePUT83.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsCreateOrUpdatePUT83(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) throws IOException {
        manager
            .jobDefinitions()
            .define("DataTransformation")
            .withExistingDataService(
                "TestAzureSDKOperations1", "6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData")
            .withDataSourceId(
                "/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations1/dataStores/TestStorSimpleSource3")
            .withDataSinkId(
                "/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations1/dataStores/TestAzureStorage1")
            .withState(State.ENABLED)
            .withRunLocation(RunLocation.EASTUS)
            .withUserConfirmation(UserConfirmation.REQUIRED)
            .withDataServiceInput(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize(
                        "{\"AzureStorageType\":\"Blob\",\"BackupChoice\":\"UseExistingLatest\",\"ContainerName\":\"containerfromtest\",\"DeviceName\":\"8600-SHG0997877L71FC\",\"FileNameFilter\":\"*\",\"IsDirectoryMode\":false,\"RootDirectories\":[\"\\\\\"],\"VolumeNames\":[\"TestAutomation\"]}",
                        Object.class,
                        SerializerEncoding.JSON))
            .create();
    }
}
```

### JobDefinitions_Delete

```java
import com.azure.core.util.Context;

/** Samples for JobDefinitions Delete. */
public final class JobDefinitionsDeleteSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_Delete-DELETE-example-81.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_DeleteDELETE81.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsDeleteDELETE81(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobDefinitions()
            .delete(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### JobDefinitions_Get

```java
import com.azure.core.util.Context;

/** Samples for JobDefinitions Get. */
public final class JobDefinitionsGetSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_Get-GET-example-81.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_GetGET81.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsGetGET81(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobDefinitions()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_CreateOrUpdate-GET-example-85.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_CreateOrUpdateGET85.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsCreateOrUpdateGET85(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobDefinitions()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_Run-GET-example-81.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_RunGET81.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsRunGET81(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobDefinitions()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### JobDefinitions_ListByDataManager

```java
import com.azure.core.util.Context;

/** Samples for JobDefinitions ListByDataManager. */
public final class JobDefinitionsListByDataManagerSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_ListByDataManager-GET-example-231.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_ListByDataManagerGET231.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsListByDataManagerGET231(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobDefinitions()
            .listByDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", null, Context.NONE);
    }
}
```

### JobDefinitions_ListByDataService

```java
import com.azure.core.util.Context;

/** Samples for JobDefinitions ListByDataService. */
public final class JobDefinitionsListByDataServiceSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_ListByDataService-GET-example-71.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_ListByDataServiceGET71.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsListByDataServiceGET71(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobDefinitions()
            .listByDataService(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                null,
                Context.NONE);
    }
}
```

### JobDefinitions_RetryJob

```java
import com.azure.core.util.Context;

/** Samples for JobDefinitions RetryJob. */
public final class JobDefinitionsRetryJobSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_RetryJob-POST-example-151.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_RetryJobPOST151.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsRetryJobPOST151(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobDefinitions()
            .retryJobWithResponse(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### JobDefinitions_Run

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.hybriddatamanager.models.RunParameters;
import com.azure.resourcemanager.hybriddatamanager.models.UserConfirmation;
import java.io.IOException;
import java.util.Arrays;

/** Samples for JobDefinitions Run. */
public final class JobDefinitionsRunSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_Run-POST-example-162.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_RunPOST162.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsRunPOST162(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) throws IOException {
        manager
            .jobDefinitions()
            .run(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                new RunParameters()
                    .withUserConfirmation(UserConfirmation.NOT_REQUIRED)
                    .withDataServiceInput(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize(
                                "{\"AzureStorageType\":\"Blob\",\"BackupChoice\":\"UseExistingLatest\",\"ContainerName\":\"containerfromtest\",\"DeviceName\":\"8600-SHG0997877L71FC\",\"FileNameFilter\":\"*\",\"IsDirectoryMode\":false,\"RootDirectories\":[\"\\\\\"],\"VolumeNames\":[\"TestAutomation\"]}",
                                Object.class,
                                SerializerEncoding.JSON))
                    .withCustomerSecrets(Arrays.asList()),
                Context.NONE);
    }
}
```

### JobDefinitions_SkipJob

```java
import com.azure.core.util.Context;

/** Samples for JobDefinitions SkipJob. */
public final class JobDefinitionsSkipJobSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/JobDefinitions_SkipJob-POST-example-171.json
     */
    /**
     * Sample code: SessionRecords\JobDefinitionsTest\JobDefinitions_SkipJobPOST171.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobDefinitionsTestJobDefinitionsSkipJobPOST171(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobDefinitions()
            .skipJobWithResponse(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### Jobs_Cancel

```java
import com.azure.core.util.Context;

/** Samples for Jobs Cancel. */
public final class JobsCancelSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/Jobs_Cancel-POST-example-131.json
     */
    /**
     * Sample code: SessionRecords\JobsTest\Jobs_CancelPOST131.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobsTestJobsCancelPOST131(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobs()
            .cancel(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "jobdeffromtestcode1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### Jobs_Get

```java
import com.azure.core.util.Context;

/** Samples for Jobs Get. */
public final class JobsGetSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/Jobs_Get-GET-example-121.json
     */
    /**
     * Sample code: SessionRecords\JobsTest\Jobs_GetGET121.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobsTestJobsGetGET121(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobs()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "jobdeffromtestcode1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                null,
                Context.NONE);
    }
}
```

### Jobs_ListByDataManager

```java
import com.azure.core.util.Context;

/** Samples for Jobs ListByDataManager. */
public final class JobsListByDataManagerSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/Jobs_ListByDataManager-GET-example-241.json
     */
    /**
     * Sample code: SessionRecords\JobsTest\Jobs_ListByDataManagerGET241.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobsTestJobsListByDataManagerGET241(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobs()
            .listByDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", null, Context.NONE);
    }
}
```

### Jobs_ListByDataService

```java
import com.azure.core.util.Context;

/** Samples for Jobs ListByDataService. */
public final class JobsListByDataServiceSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/Jobs_ListByDataService-GET-example-181.json
     */
    /**
     * Sample code: SessionRecords\JobsTest\Jobs_ListByDataServiceGET181.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobsTestJobsListByDataServiceGET181(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobs()
            .listByDataService(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                null,
                Context.NONE);
    }
}
```

### Jobs_ListByJobDefinition

```java
import com.azure.core.util.Context;

/** Samples for Jobs ListByJobDefinition. */
public final class JobsListByJobDefinitionSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/Jobs_ListByJobDefinition-GET-example-111.json
     */
    /**
     * Sample code: SessionRecords\JobsTest\Jobs_ListByJobDefinitionGET111.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobsTestJobsListByJobDefinitionGET111(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobs()
            .listByJobDefinition(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                null,
                Context.NONE);
    }
}
```

### Jobs_Resume

```java
import com.azure.core.util.Context;

/** Samples for Jobs Resume. */
public final class JobsResumeSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/Jobs_Resume-POST-example-141.json
     */
    /**
     * Sample code: SessionRecords\JobsTest\Jobs_ResumePOST141.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsJobsTestJobsResumePOST141(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .jobs()
            .resume(
                "TestAzureSDKOperations1",
                "DataTransformation",
                "jobdeffromtestcode2",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/Operations_List-GET-example-11.json
     */
    /**
     * Sample code: SessionRecords\OperationsTest\Operations_ListGET11.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsOperationsTestOperationsListGET11(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

### PublicKeys_Get

```java
import com.azure.core.util.Context;

/** Samples for PublicKeys Get. */
public final class PublicKeysGetSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/PublicKeys_Get-GET-example-262.json
     */
    /**
     * Sample code: SessionRecords\PublicKeysTest\PublicKeys_GetGET262.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsPublicKeysTestPublicKeysGetGET262(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .publicKeys()
            .getWithResponse(
                "TestAzureSDKOperations1",
                "6e0219f5-327a-4365-904f-05eed4227ad7",
                "Microsoft.HybridData",
                Context.NONE);
    }
}
```

### PublicKeys_ListByDataManager

```java
import com.azure.core.util.Context;

/** Samples for PublicKeys ListByDataManager. */
public final class PublicKeysListByDataManagerSamples {
    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/PublicKeys_ListByDataManager-GET-example-251.json
     */
    /**
     * Sample code: SessionRecords\PublicKeysTest\PublicKeys_ListByDataManagerGET251.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsPublicKeysTestPublicKeysListByDataManagerGET251(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .publicKeys()
            .listByDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_CreateOrUpdate_DataSink-GET-example-251.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_CreateOrUpdate_DataSinkGET251.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresCreateOrUpdateDataSinkGET251(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .publicKeys()
            .listByDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/DataStores_CreateOrUpdate_DataSource-GET-example-251.json
     */
    /**
     * Sample code: SessionRecords\DataStoresTest\DataStores_CreateOrUpdate_DataSourceGET251.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsDataStoresTestDataStoresCreateOrUpdateDataSourceGET251(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .publicKeys()
            .listByDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/hybriddatamanager/resource-manager/Microsoft.HybridData/stable/2021-05-01/examples/PublicKeys_Get-GET-example-251.json
     */
    /**
     * Sample code: SessionRecords\PublicKeysTest\PublicKeys_GetGET251.
     *
     * @param manager Entry point to HybridDataManager.
     */
    public static void sessionRecordsPublicKeysTestPublicKeysGetGET251(
        com.azure.resourcemanager.hybriddatamanager.HybridDataManager manager) {
        manager
            .publicKeys()
            .listByDataManager("6e0219f5-327a-4365-904f-05eed4227ad7", "Microsoft.HybridData", Context.NONE);
    }
}
```

