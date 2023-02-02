# Code snippets and samples


## DataConnectorOperation

- [CreateOrUpdate](#dataconnectoroperation_createorupdate)
- [Delete](#dataconnectoroperation_delete)
- [GetByResourceGroup](#dataconnectoroperation_getbyresourcegroup)
- [List](#dataconnectoroperation_list)
- [ListByResourceGroup](#dataconnectoroperation_listbyresourcegroup)
- [Update](#dataconnectoroperation_update)

## MetricsIngestionEndpoints

- [CreateOrUpdate](#metricsingestionendpoints_createorupdate)
- [Delete](#metricsingestionendpoints_delete)
- [Get](#metricsingestionendpoints_get)
- [List](#metricsingestionendpoints_list)
- [Update](#metricsingestionendpoints_update)

## NetworkAnalyticsProductOperation

- [CreateOrUpdate](#networkanalyticsproductoperation_createorupdate)
- [Delete](#networkanalyticsproductoperation_delete)
- [GetByResourceGroup](#networkanalyticsproductoperation_getbyresourcegroup)
- [List](#networkanalyticsproductoperation_list)
- [ListByResourceGroup](#networkanalyticsproductoperation_listbyresourcegroup)
- [Update](#networkanalyticsproductoperation_update)

## Operations

- [List](#operations_list)

## Storage

- [CreateOrUpdate](#storage_createorupdate)
- [Delete](#storage_delete)
- [GetByResourceGroup](#storage_getbyresourcegroup)
- [List](#storage_list)
- [ListByResourceGroup](#storage_listbyresourcegroup)
- [Update](#storage_update)
### DataConnectorOperation_CreateOrUpdate

```java
import com.azure.resourcemanager.networkanalytics.models.ComputeConfiguration;
import com.azure.resourcemanager.networkanalytics.models.DataConnectorConfiguration;
import com.azure.resourcemanager.networkanalytics.models.DataRetentionProperties;
import com.azure.resourcemanager.networkanalytics.models.DatasetConfiguration;
import com.azure.resourcemanager.networkanalytics.models.ManagedResourceGroupConfiguration;
import com.azure.resourcemanager.networkanalytics.models.RetentionProperties;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for DataConnectorOperation CreateOrUpdate. */
public final class DataConnectorOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_CreateOrUpdate_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorCreateOrUpdateMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .dataConnectorOperations()
            .define("rtjrnwmvydrsclcye")
            .withRegion("lkdprsvepnusozfvpkqqv")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf("key1835", "zatlpsdiibblpxqyxvnxrvk"))
            .withManagedResourceGroupConfiguration(
                new ManagedResourceGroupConfiguration()
                    .withName("flfqtliobufzhuxkhfhj")
                    .withLocation("ecafvspgcuuampnlsrihbgtujgouq"))
            .withProductName("dbdypish")
            .withProductVersion("yybjrksardkllouublivbduzjlwqjk")
            .withProductConnector("yrazxjkyicvx")
            .withProductConnectorDataset("dmlyvcshemlfhmyvofqofw")
            .withDataLakeHouses(Arrays.asList("advwikycmuguhupha"))
            .withDataConnectorConfiguration(
                new DataConnectorConfiguration()
                    .withDataRetentionProperties(
                        new DataRetentionProperties()
                            .withDataExplorer(new RetentionProperties().withRetentionDays(7))
                            .withBronzeStorageAccount(new RetentionProperties().withRetentionDays(7))
                            .withSilverStorageAccount(new RetentionProperties().withRetentionDays(7))
                            .withGoldStorageAccount(new RetentionProperties().withRetentionDays(7)))
                    .withDataset(
                        new DatasetConfiguration()
                            .withDatasetName("ptknewelhh")
                            .withTimestampKey(OffsetDateTime.parse("2023-01-30T18:13:09.337Z"))
                            .withColumnsToMask(Arrays.asList("gdjwh")))
                    .withCompute(new ComputeConfiguration().withFailureAlertEmail("pummjy").withThroughput(20)))
            .create();
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_CreateOrUpdate_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorCreateOrUpdateMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .dataConnectorOperations()
            .define("dndnibjbfuuhrkqhlofcjke")
            .withRegion("lkdprsvepnusozfvpkqqv")
            .withExistingResourceGroup("rgopenapi")
            .create();
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

### DataConnectorOperation_Delete

```java
/** Samples for DataConnectorOperation Delete. */
public final class DataConnectorOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_Delete_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorDeleteMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.dataConnectorOperations().delete("rgopenapi", "tqpdqptkngnlz", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_Delete_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorDeleteMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.dataConnectorOperations().delete("rgopenapi", "vqcxivaljzxyuyanosyf", com.azure.core.util.Context.NONE);
    }
}
```

### DataConnectorOperation_GetByResourceGroup

```java
/** Samples for DataConnectorOperation GetByResourceGroup. */
public final class DataConnectorOperationGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_Get_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorGetMin(com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .dataConnectorOperations()
            .getByResourceGroupWithResponse("rgopenapi", "czghteymeeuvs", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_Get_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorGetMax(com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .dataConnectorOperations()
            .getByResourceGroupWithResponse("rgopenapi", "gdoqhclsirtskithgh", com.azure.core.util.Context.NONE);
    }
}
```

### DataConnectorOperation_List

```java
/** Samples for DataConnectorOperation List. */
public final class DataConnectorOperationListSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_ListBySubscription_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorListBySubscriptionMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.dataConnectorOperations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_ListBySubscription_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorListBySubscriptionMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.dataConnectorOperations().list(com.azure.core.util.Context.NONE);
    }
}
```

### DataConnectorOperation_ListByResourceGroup

```java
/** Samples for DataConnectorOperation ListByResourceGroup. */
public final class DataConnectorOperationListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_ListByResourceGroup_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorListByResourceGroupMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.dataConnectorOperations().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_ListByResourceGroup_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorListByResourceGroupMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.dataConnectorOperations().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### DataConnectorOperation_Update

```java
import com.azure.resourcemanager.networkanalytics.models.DataConnectors;
import com.azure.resourcemanager.networkanalytics.models.ManagedResourceGroupConfiguration;
import java.util.HashMap;
import java.util.Map;

/** Samples for DataConnectorOperation Update. */
public final class DataConnectorOperationUpdateSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_Update_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorUpdateMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        DataConnectors resource =
            manager
                .dataConnectorOperations()
                .getByResourceGroupWithResponse(
                    "rgopenapi", "lhgdolhycyfphurejkwickn", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/DataConnector_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: DataConnector_Update_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void dataConnectorUpdateMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        DataConnectors resource =
            manager
                .dataConnectorOperations()
                .getByResourceGroupWithResponse("rgopenapi", "hs", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key8943", "u"))
            .withManagedResourceGroupConfiguration(
                new ManagedResourceGroupConfiguration()
                    .withName("flfqtliobufzhuxkhfhj")
                    .withLocation("ecafvspgcuuampnlsrihbgtujgouq"))
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

### MetricsIngestionEndpoints_CreateOrUpdate

```java
import com.azure.resourcemanager.networkanalytics.fluent.models.MetricsIngestionEndpointResourcesInner;
import com.azure.resourcemanager.networkanalytics.models.ManagedResourceGroupConfiguration;

/** Samples for MetricsIngestionEndpoints CreateOrUpdate. */
public final class MetricsIngestionEndpointsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/MetricsIngestionEndpoints_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: MetricsIngestionEndpoints_CreateOrUpdate_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void metricsIngestionEndpointsCreateOrUpdateMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .metricsIngestionEndpoints()
            .createOrUpdate(
                "ozrlousqyukjkqtvgmrk", new MetricsIngestionEndpointResourcesInner(), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/MetricsIngestionEndpoints_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: MetricsIngestionEndpoints_CreateOrUpdate_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void metricsIngestionEndpointsCreateOrUpdateMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .metricsIngestionEndpoints()
            .createOrUpdate(
                "ozrlousqyukjkqtvgmrk",
                new MetricsIngestionEndpointResourcesInner()
                    .withIngressRegionName("vehndmisl")
                    .withManagedResourceGroupConfiguration(
                        new ManagedResourceGroupConfiguration()
                            .withName("flfqtliobufzhuxkhfhj")
                            .withLocation("ecafvspgcuuampnlsrihbgtujgouq")),
                com.azure.core.util.Context.NONE);
    }
}
```

### MetricsIngestionEndpoints_Delete

```java
/** Samples for MetricsIngestionEndpoints Delete. */
public final class MetricsIngestionEndpointsDeleteSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/MetricsIngestionEndpoints_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: MetricsIngestionEndpoints_Delete_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void metricsIngestionEndpointsDeleteMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.metricsIngestionEndpoints().delete("ozrlousqyukjkqtvgmrk", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/MetricsIngestionEndpoints_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: MetricsIngestionEndpoints_Delete_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void metricsIngestionEndpointsDeleteMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.metricsIngestionEndpoints().delete("ozrlousqyukjkqtvgmrk", com.azure.core.util.Context.NONE);
    }
}
```

### MetricsIngestionEndpoints_Get

```java
/** Samples for MetricsIngestionEndpoints Get. */
public final class MetricsIngestionEndpointsGetSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/MetricsIngestionEndpoints_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: MetricsIngestionEndpoints_Get_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void metricsIngestionEndpointsGetMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.metricsIngestionEndpoints().getWithResponse("ozrlousqyukjkqtvgmrk", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/MetricsIngestionEndpoints_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: MetricsIngestionEndpoints_Get_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void metricsIngestionEndpointsGetMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.metricsIngestionEndpoints().getWithResponse("ozrlousqyukjkqtvgmrk", com.azure.core.util.Context.NONE);
    }
}
```

### MetricsIngestionEndpoints_List

```java
/** Samples for MetricsIngestionEndpoints List. */
public final class MetricsIngestionEndpointsListSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/MetricsIngestionEndpoints_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: MetricsIngestionEndpoints_List_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void metricsIngestionEndpointsListMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.metricsIngestionEndpoints().list("ozrlousqyukjkqtvgmrk", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/MetricsIngestionEndpoints_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: MetricsIngestionEndpoints_List_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void metricsIngestionEndpointsListMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.metricsIngestionEndpoints().list("ozrlousqyukjkqtvgmrk", com.azure.core.util.Context.NONE);
    }
}
```

### MetricsIngestionEndpoints_Update

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;

/** Samples for MetricsIngestionEndpoints Update. */
public final class MetricsIngestionEndpointsUpdateSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/MetricsIngestionEndpoints_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: MetricsIngestionEndpoints_Update_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void metricsIngestionEndpointsUpdateMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) throws IOException {
        manager
            .metricsIngestionEndpoints()
            .updateWithResponse(
                "ozrlousqyukjkqtvgmrk",
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/MetricsIngestionEndpoints_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: MetricsIngestionEndpoints_Update_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void metricsIngestionEndpointsUpdateMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) throws IOException {
        manager
            .metricsIngestionEndpoints()
            .updateWithResponse(
                "ozrlousqyukjkqtvgmrk",
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }
}
```

### NetworkAnalyticsProductOperation_CreateOrUpdate

```java
import com.azure.resourcemanager.networkanalytics.fluent.models.NetworkAnalyticsProductsInner;
import com.azure.resourcemanager.networkanalytics.models.NetworkAnalyticsProductConnectorInformation;
import com.azure.resourcemanager.networkanalytics.models.NetworkAnalyticsProductInformation;
import java.util.Arrays;

/** Samples for NetworkAnalyticsProductOperation CreateOrUpdate. */
public final class NetworkAnalyticsProductOperationCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_CreateOrUpdate_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductCreateOrUpdateMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .networkAnalyticsProductOperations()
            .createOrUpdate(
                "rgopenapi",
                new NetworkAnalyticsProductsInner()
                    .withNetworkAnalyticsProductInformation(
                        new NetworkAnalyticsProductInformation()
                            .withProductName("hknfsjhzhl")
                            .withProductVersions(Arrays.asList("wxpytpcolbhrictzmjognhmpcrbb"))
                            .withProductConnectors(
                                Arrays
                                    .asList(
                                        new NetworkAnalyticsProductConnectorInformation()
                                            .withConnectorName("ksaamsmnroclmiaebmhnypfeglpnpuqe")
                                            .withDatasets(Arrays.asList("ga"))))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_CreateOrUpdate_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductCreateOrUpdateMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .networkAnalyticsProductOperations()
            .createOrUpdate("rgopenapi", new NetworkAnalyticsProductsInner(), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkAnalyticsProductOperation_Delete

```java
/** Samples for NetworkAnalyticsProductOperation Delete. */
public final class NetworkAnalyticsProductOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_Delete_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductDeleteMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.networkAnalyticsProductOperations().delete("rgopenapi", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_Delete_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductDeleteMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.networkAnalyticsProductOperations().delete("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### NetworkAnalyticsProductOperation_GetByResourceGroup

```java
/** Samples for NetworkAnalyticsProductOperation GetByResourceGroup. */
public final class NetworkAnalyticsProductOperationGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_Get_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductGetMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .networkAnalyticsProductOperations()
            .getByResourceGroupWithResponse("rgopenapi", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_Get_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductGetMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .networkAnalyticsProductOperations()
            .getByResourceGroupWithResponse("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### NetworkAnalyticsProductOperation_List

```java
/** Samples for NetworkAnalyticsProductOperation List. */
public final class NetworkAnalyticsProductOperationListSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_ListBySubscription_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductListBySubscriptionMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.networkAnalyticsProductOperations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_ListBySubscription_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductListBySubscriptionMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.networkAnalyticsProductOperations().list(com.azure.core.util.Context.NONE);
    }
}
```

### NetworkAnalyticsProductOperation_ListByResourceGroup

```java
/** Samples for NetworkAnalyticsProductOperation ListByResourceGroup. */
public final class NetworkAnalyticsProductOperationListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_ListByResourceGroup_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductListByResourceGroupMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.networkAnalyticsProductOperations().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_ListByResourceGroup_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductListByResourceGroupMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.networkAnalyticsProductOperations().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### NetworkAnalyticsProductOperation_Update

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;

/** Samples for NetworkAnalyticsProductOperation Update. */
public final class NetworkAnalyticsProductOperationUpdateSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_Update_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductUpdateMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) throws IOException {
        manager
            .networkAnalyticsProductOperations()
            .updateWithResponse(
                "rgopenapi",
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/NetworkAnalyticsProduct_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: NetworkAnalyticsProduct_Update_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void networkAnalyticsProductUpdateMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) throws IOException {
        manager
            .networkAnalyticsProductOperations()
            .updateWithResponse(
                "rgopenapi",
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void operationsListMax(com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void operationsListMin(com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Storage_CreateOrUpdate

```java
import com.azure.resourcemanager.networkanalytics.models.AzureDataExplorerProperties;
import com.azure.resourcemanager.networkanalytics.models.BlobServices;
import com.azure.resourcemanager.networkanalytics.models.BronzeStorageAccountProperties;
import com.azure.resourcemanager.networkanalytics.models.Bypass;
import com.azure.resourcemanager.networkanalytics.models.CommonStorageAccountProperties;
import com.azure.resourcemanager.networkanalytics.models.DefaultAction;
import com.azure.resourcemanager.networkanalytics.models.IpRules;
import com.azure.resourcemanager.networkanalytics.models.KustoClusterPrincipalAssignments;
import com.azure.resourcemanager.networkanalytics.models.KustoRole;
import com.azure.resourcemanager.networkanalytics.models.ManagedResourceGroupConfiguration;
import com.azure.resourcemanager.networkanalytics.models.NetworkAcls;
import com.azure.resourcemanager.networkanalytics.models.PrincipalType;
import com.azure.resourcemanager.networkanalytics.models.PrivateEndPoint;
import com.azure.resourcemanager.networkanalytics.models.ResourceAccessRules;
import com.azure.resourcemanager.networkanalytics.models.RestorePolicy;
import com.azure.resourcemanager.networkanalytics.models.VirtualNetworkConfiguration;
import com.azure.resourcemanager.networkanalytics.models.VirtualNetworkRule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Storage CreateOrUpdate. */
public final class StorageCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Storage_CreateOrUpdate_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageCreateOrUpdateMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .storages()
            .define("jnnuodll")
            .withRegion("sybchhoambcfnzflnztjwgfu")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf("key2848", "kfzdswbuaip"))
            .withManagedResourceGroupConfiguration(
                new ManagedResourceGroupConfiguration()
                    .withName("flfqtliobufzhuxkhfhj")
                    .withLocation("ecafvspgcuuampnlsrihbgtujgouq"))
            .withUniqueIdentifierName("suoxyedxsghz")
            .withCommonStorageAccountProperties(
                new CommonStorageAccountProperties()
                    .withPublicNetworkAccess("azfwzowpeno")
                    .withNetworkacls(
                        new NetworkAcls()
                            .withBypass(Bypass.NONE)
                            .withVirtualNetworkRule(
                                Arrays
                                    .asList(
                                        new VirtualNetworkRule()
                                            .withId("xofnybcganrcfiimqreegaqouxfnlm")
                                            .withAction("zwzn")
                                            .withState("tnzqojumw")))
                            .withIpRules(
                                Arrays
                                    .asList(
                                        new IpRules().withValue("kzxsxagfrpdvkjzusofdxko").withAction("wgqxykwovhff")))
                            .withResourceAccessRules(
                                Arrays
                                    .asList(
                                        new ResourceAccessRules()
                                            .withTenantId("ho")
                                            .withResourceId("svitkayadlrrdxrjbzcemnaccoamqq")))
                            .withDefaultActionType(DefaultAction.ALLOW))
                    .withBlobServices(
                        new BlobServices().withRestorePolicy(new RestorePolicy().withEnabled(true).withDays(30)))
                    .withPrivateEndPoint(
                        new PrivateEndPoint()
                            .withSubnetId("qggeyzgrqodijtcutjelsizyxhd")
                            .withPrivateLinkServiceId("zqiirxmwqhakbabwneipctzxk")
                            .withGroupIds(Arrays.asList("itvtdkkpifhfiqhpjb"))
                            .withCustomDnsConfigs("cylmvnl")))
            .withBronzeStorageAccountProperties(new BronzeStorageAccountProperties().withIsSftpEnabled(true))
            .withAzureDataExplorerProperties(
                new AzureDataExplorerProperties()
                    .withVirtualNetworkConfiguration(
                        new VirtualNetworkConfiguration()
                            .withSubnetId("wybwuekeixatewpihdfww")
                            .withEnginePublicIpId("qesxpfxpgzusjhgrjhtbrziv")
                            .withDataManagementPublicIpId("yaunpigmlnsbzjyal"))
                    .withKustoClusterPrincipalAssignments(
                        new KustoClusterPrincipalAssignments()
                            .withSystemIdentityName("dpvrzrysnb")
                            .withRole(KustoRole.ALL_DATABASES_ADMIN)
                            .withPrincipalType(PrincipalType.APP)))
            .create();
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: Storage_CreateOrUpdate_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageCreateOrUpdateMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .storages()
            .define("wssafffmuepzooqsiormn")
            .withRegion("sybchhoambcfnzflnztjwgfu")
            .withExistingResourceGroup("rgopenapi")
            .create();
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

### Storage_Delete

```java
/** Samples for Storage Delete. */
public final class StorageDeleteSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: Storage_Delete_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageDeleteMin(com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.storages().delete("rgopenapi", "hokmuhdfqghei", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Storage_Delete_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageDeleteMax(com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.storages().delete("rgopenapi", "wlngxkftudslsecksjrxnfrtl", com.azure.core.util.Context.NONE);
    }
}
```

### Storage_GetByResourceGroup

```java
/** Samples for Storage GetByResourceGroup. */
public final class StorageGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: Storage_Get_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageGetMin(com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.storages().getByResourceGroupWithResponse("rgopenapi", "trwbfuc", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Storage_Get_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageGetMax(com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager
            .storages()
            .getByResourceGroupWithResponse(
                "rgopenapi", "afalahfsayijbtrzpjzrvukqmunyw", com.azure.core.util.Context.NONE);
    }
}
```

### Storage_List

```java
/** Samples for Storage List. */
public final class StorageListSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: Storage_ListBySubscription_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageListBySubscriptionMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.storages().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: Storage_ListBySubscription_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageListBySubscriptionMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.storages().list(com.azure.core.util.Context.NONE);
    }
}
```

### Storage_ListByResourceGroup

```java
/** Samples for Storage ListByResourceGroup. */
public final class StorageListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Storage_ListByResourceGroup_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageListByResourceGroupMax(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.storages().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: Storage_ListByResourceGroup_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageListByResourceGroupMin(
        com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        manager.storages().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### Storage_Update

```java
import com.azure.resourcemanager.networkanalytics.models.DataLakeHouseResources;
import com.azure.resourcemanager.networkanalytics.models.ManagedResourceGroupConfiguration;
import java.util.HashMap;
import java.util.Map;

/** Samples for Storage Update. */
public final class StorageUpdateSamples {
    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: Storage_Update_Min.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageUpdateMin(com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        DataLakeHouseResources resource =
            manager
                .storages()
                .getByResourceGroupWithResponse("rgopenapi", "xpyfslhorwbf", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file: specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-04-30/examples/Storage_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Storage_Update_Max.
     *
     * @param manager Entry point to NetworkanalyticsManager.
     */
    public static void storageUpdateMax(com.azure.resourcemanager.networkanalytics.NetworkanalyticsManager manager) {
        DataLakeHouseResources resource =
            manager
                .storages()
                .getByResourceGroupWithResponse("rgopenapi", "wkuqjmixiscljktf", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key9798", "pmpellthjljwbmpulnmobfodhjuq"))
            .withManagedResourceGroupConfiguration(
                new ManagedResourceGroupConfiguration()
                    .withName("flfqtliobufzhuxkhfhj")
                    .withLocation("ecafvspgcuuampnlsrihbgtujgouq"))
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

