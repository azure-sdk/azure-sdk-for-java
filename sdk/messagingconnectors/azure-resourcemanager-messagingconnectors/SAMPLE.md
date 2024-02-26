# Code snippets and samples


## ConnectorOperations

- [CreateOrUpdate](#connectoroperations_createorupdate)
- [Delete](#connectoroperations_delete)
- [GetByResourceGroup](#connectoroperations_getbyresourcegroup)
- [List](#connectoroperations_list)
- [ListByResourceGroup](#connectoroperations_listbyresourcegroup)
- [Pause](#connectoroperations_pause)
- [Resume](#connectoroperations_resume)
- [UpdateTags](#connectoroperations_updatetags)

## Operations

- [List](#operations_list)
### ConnectorOperations_CreateOrUpdate

```java
import com.azure.resourcemanager.messagingconnectors.models.BitCoinSourceConnectorProperties;
import com.azure.resourcemanager.messagingconnectors.models.ConfluentSourceConnectorProperties;
import com.azure.resourcemanager.messagingconnectors.models.ConverterType;
import com.azure.resourcemanager.messagingconnectors.models.CosmosDbSourceConnectorProperties;
import com.azure.resourcemanager.messagingconnectors.models.EventHubConfig;
import com.azure.resourcemanager.messagingconnectors.models.GooglePubSubSourceConnectorProperties;
import com.azure.resourcemanager.messagingconnectors.models.KinesisSourceConnectorProperties;
import com.azure.resourcemanager.messagingconnectors.models.OffsetPolicyForCosmosDB;
import com.azure.resourcemanager.messagingconnectors.models.PostgreSqlSourceConnectorProperties;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ConnectorOperations CreateOrUpdate.
 */
public final class ConnectorOperationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/GooglePubSubSourceConnector_CreateOrUpdate.json
     */
    /**
     * Sample code: GooglePubSubSourceConnector CreateOrUpdate.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void googlePubSubSourceConnectorCreateOrUpdate(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().define("googlePubSubSourceConnector1").withRegion("East US")
            .withExistingResourceGroup("abcd").withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withProperties(new GooglePubSubSourceConnectorProperties().withMaxTasks(1)
                .withValueConverter(ConverterType.JSON_CONVERTER)
                .withEventHubConfig(new EventHubConfig().withNamespaceHostname("ns").withEventHubName("eh")
                    .withConnectionString("connectionString1"))
                .withProjectId("projectId1").withSubscriptionName("subscriptionName1")
                .withAccountKey("fakeTokenPlaceholder"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/ConfluentSourceConnector_CreateOrUpdate.json
     */
    /**
     * Sample code: ConfluentSourceConnector CreateOrUpdate.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void confluentSourceConnectorCreateOrUpdate(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().define("confluentSourceConnector1").withRegion("East US")
            .withExistingResourceGroup("abcd").withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withProperties(new ConfluentSourceConnectorProperties().withMaxTasks(1)
                .withValueConverter(ConverterType.JSON_CONVERTER)
                .withEventHubConfig(new EventHubConfig().withNamespaceHostname("ns").withEventHubName("eh")
                    .withConnectionString("connectionString1"))
                .withBootstrapServers("bootstrapServers.confluent.com").withTopic("topic1")
                .withConsumerGroup("consumerGroup1").withAutoOffsetReset("autoOffsetReset").withUser("user1")
                .withPassword("fakeTokenPlaceholder"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/CosmosDbSourceConnector_CreateOrUpdate.json
     */
    /**
     * Sample code: CosmosDbSourceConnector CreateOrUpdate.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void cosmosDbSourceConnectorCreateOrUpdate(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().define("cosmosDbSourceConnector1").withRegion("East US")
            .withExistingResourceGroup("abcd").withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withProperties(
                new CosmosDbSourceConnectorProperties().withMaxTasks(1).withValueConverter(ConverterType.JSON_CONVERTER)
                    .withEventHubConfig(new EventHubConfig().withNamespaceHostname("ns").withEventHubName("eh")
                        .withConnectionString("connectionString1"))
                    .withPollIntervalInMs(2000).withCosmosEndpoint("endpoint.cosmos.com")
                    .withDatabaseName("databaseName1").withContainer("container1").withMasterKey("fakeTokenPlaceholder")
                    .withOffsetPolicy(OffsetPolicyForCosmosDB.USE_LATEST_SOURCE_OFFSET))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/BitCoinSourceConnector_CreateOrUpdate.json
     */
    /**
     * Sample code: BitCoinSourceConnector CreateOrUpdate.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void bitCoinSourceConnectorCreateOrUpdate(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().define("bitCoin1").withRegion("West US").withExistingResourceGroup("abcd")
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withProperties(new BitCoinSourceConnectorProperties().withMaxTasks(1)
                .withValueConverter(ConverterType.BYTE_ARRAY_CONVERTER).withEventHubConfig(new EventHubConfig()
                    .withNamespaceHostname("ns").withEventHubName("eh").withConnectionString("connectionString1")))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/PostgreSqlSourceConnector_CreateOrUpdate.json
     */
    /**
     * Sample code: PostgreSqlSourceConnector CreateOrUpdate.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void postgreSqlSourceConnectorCreateOrUpdate(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().define("postgreSqlSourceConnector1").withRegion("East US")
            .withExistingResourceGroup("abcd").withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withProperties(new PostgreSqlSourceConnectorProperties().withMaxTasks(1)
                .withValueConverter(ConverterType.JSON_CONVERTER)
                .withEventHubConfig(new EventHubConfig().withNamespaceHostname("ns").withEventHubName("eh")
                    .withConnectionString("connectionString1"))
                .withHostname("hostName.postgresql.com").withPort(8080).withDatabaseName("databaseName1")
                .withUsername("username1").withPassword("fakeTokenPlaceholder").withReplicationSlotName("slotA"))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/KinesisSourceConnector_CreateOrUpdate.json
     */
    /**
     * Sample code: KinesisSourceConnector CreateOrUpdate.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void kinesisSourceConnectorCreateOrUpdate(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().define("kinesisSourceConnector1").withRegion("East US")
            .withExistingResourceGroup("abcd").withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withProperties(
                new KinesisSourceConnectorProperties().withMaxTasks(1).withValueConverter(ConverterType.JSON_CONVERTER)
                    .withEventHubConfig(new EventHubConfig().withNamespaceHostname("ns").withEventHubName("eh")
                        .withConnectionString("connectionString1"))
                    .withAwsAccessKeyId("fakeTokenPlaceholder").withAwsSecretAccessKey("fakeTokenPlaceholder")
                    .withAwsKinesisRegion("global").withAwsKinesisStreamName("streamName1"))
            .create();
    }

    // Use "Map.of" if available
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

### ConnectorOperations_Delete

```java
/**
 * Samples for ConnectorOperations Delete.
 */
public final class ConnectorOperationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/BitCoinSourceConnector_Delete.json
     */
    /**
     * Sample code: BitCoinSourceConnector Delete.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void
        bitCoinSourceConnectorDelete(com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().deleteByResourceGroupWithResponse("abcd", "bitCoin1",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/PostgreSqlSourceConnector_Delete.json
     */
    /**
     * Sample code: PostgreSqlSourceConnector Delete.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void postgreSqlSourceConnectorDelete(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().deleteByResourceGroupWithResponse("abcd", "postgreSqlSourceConnector1",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/KinesisSourceConnector_Delete.json
     */
    /**
     * Sample code: KinesisSourceConnector Delete.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void
        kinesisSourceConnectorDelete(com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().deleteByResourceGroupWithResponse("abcd", "kinesisSourceConnector1",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/CosmosDbSourceConnector_Delete.json
     */
    /**
     * Sample code: CosmosDbSourceConnector Delete.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void cosmosDbSourceConnectorDelete(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().deleteByResourceGroupWithResponse("abcd", "cosmosDbSourceConnector1",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/ConfluentSourceConnector_Delete.json
     */
    /**
     * Sample code: ConfluentSourceConnector Delete.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void confluentSourceConnectorDelete(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().deleteByResourceGroupWithResponse("abcd", "confluentSourceConnector1",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/GooglePubSubSourceConnector_Delete.json
     */
    /**
     * Sample code: GooglePubSubSourceConnector Delete.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void googlePubSubSourceConnectorDelete(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().deleteByResourceGroupWithResponse("abcd", "googlePubSubSourceConnector1",
            com.azure.core.util.Context.NONE);
    }
}
```

### ConnectorOperations_GetByResourceGroup

```java
/**
 * Samples for ConnectorOperations GetByResourceGroup.
 */
public final class ConnectorOperationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/GooglePubSubSourceConnector_Get.json
     */
    /**
     * Sample code: GooglePubSubSourceConnector Get.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void googlePubSubSourceConnectorGet(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().getByResourceGroupWithResponse("abcd", "googlePubSubSourceConnector1",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/CosmosDbSourceConnector_Get.json
     */
    /**
     * Sample code: CosmosDbSourceConnector Get.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void
        cosmosDbSourceConnectorGet(com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().getByResourceGroupWithResponse("abcd", "cosmosDbSourceConnector1",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/ConfluentSourceConnector_Get.json
     */
    /**
     * Sample code: ConfluentSourceConnector Get.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void
        confluentSourceConnectorGet(com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().getByResourceGroupWithResponse("abcd", "confluentSourceConnector1",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/PostgreSqlSourceConnector_Get.json
     */
    /**
     * Sample code: PostgreSqlSourceConnector Get.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void
        postgreSqlSourceConnectorGet(com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().getByResourceGroupWithResponse("abcd", "postgreSqlSourceConnector1",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/KinesisSourceConnector_Get.json
     */
    /**
     * Sample code: KinesisSourceConnector Get.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void
        kinesisSourceConnectorGet(com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().getByResourceGroupWithResponse("abcd", "kinesisSourceConnector1",
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/BitCoinSourceConnector_Get.json
     */
    /**
     * Sample code: BitCoinSourceConnector Get.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void
        bitCoinSourceConnectorGet(com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().getByResourceGroupWithResponse("abcd", "bitCoin1",
            com.azure.core.util.Context.NONE);
    }
}
```

### ConnectorOperations_List

```java
/**
 * Samples for ConnectorOperations List.
 */
public final class ConnectorOperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/BitCoinSourceConnector_ListBySubscription.json
     */
    /**
     * Sample code: BitCoinSourceConnector ListBySubscription.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void bitCoinSourceConnectorListBySubscription(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ConnectorOperations_ListByResourceGroup

```java
/**
 * Samples for ConnectorOperations ListByResourceGroup.
 */
public final class ConnectorOperationsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/BitCoinSourceConnector_ListByResourceGroup.json
     */
    /**
     * Sample code: BitCoinSourceConnector ListByResourceGroup.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void bitCoinSourceConnectorListByResourceGroup(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.connectorOperations().listByResourceGroup("abcd", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectorOperations_Pause

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;

/**
 * Samples for ConnectorOperations Pause.
 */
public final class ConnectorOperationsPauseSamples {
    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/BitCoinSourceConnector_Pause.json
     */
    /**
     * Sample code: BitCoinSourceConnector Pause.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void bitCoinSourceConnectorPause(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations().pauseWithResponse("abcd", "bitCoin1", SerializerFactory
            .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/PostgreSqlSourceConnector_Pause.json
     */
    /**
     * Sample code: PostgreSqlSourceConnector Pause.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void postgreSqlSourceConnectorPause(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations()
            .pauseWithResponse("abcd", "postgreSqlSourceConnector1", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/KinesisSourceConnector_Pause.json
     */
    /**
     * Sample code: KinesisSourceConnector Pause.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void kinesisSourceConnectorPause(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations()
            .pauseWithResponse("abcd", "kinesisSourceConnector1", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/GooglePubSubSourceConnector_Pause.json
     */
    /**
     * Sample code: GooglePubSubSourceConnector Pause.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void googlePubSubSourceConnectorPause(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations()
            .pauseWithResponse("abcd", "googlePubSubSourceConnector1", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/ConfluentSourceConnector_Pause.json
     */
    /**
     * Sample code: ConfluentSourceConnector Pause.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void confluentSourceConnectorPause(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations()
            .pauseWithResponse("abcd", "confluentSourceConnector1", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/CosmosDbSourceConnector_Pause.json
     */
    /**
     * Sample code: CosmosDbSourceConnector Pause.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void cosmosDbSourceConnectorPause(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations()
            .pauseWithResponse("abcd", "cosmosDbSourceConnector1", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }
}
```

### ConnectorOperations_Resume

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;

/**
 * Samples for ConnectorOperations Resume.
 */
public final class ConnectorOperationsResumeSamples {
    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/ConfluentSourceConnector_Resume.json
     */
    /**
     * Sample code: ConfluentSourceConnector Resume.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void confluentSourceConnectorResume(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations()
            .resumeWithResponse("abcd", "confluentSourceConnector1", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/BitCoinSourceConnector_Resume.json
     */
    /**
     * Sample code: BitCoinSourceConnector Resume.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void bitCoinSourceConnectorResume(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations().resumeWithResponse("abcd", "bitCoin1", SerializerFactory
            .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/GooglePubSubSourceConnector_Resume.json
     */
    /**
     * Sample code: GooglePubSubSourceConnector Resume.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void googlePubSubSourceConnectorResume(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations()
            .resumeWithResponse("abcd", "googlePubSubSourceConnector1", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/CosmosDbSourceConnector_Resume.json
     */
    /**
     * Sample code: CosmosDbSourceConnector Resume.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void cosmosDbSourceConnectorResume(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations()
            .resumeWithResponse("abcd", "cosmosDbSourceConnector1", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/PostgreSqlSourceConnector_Resume.json
     */
    /**
     * Sample code: PostgreSqlSourceConnector Resume.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void postgreSqlSourceConnectorResume(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations()
            .resumeWithResponse("abcd", "postgreSqlSourceConnector1", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/KinesisSourceConnector_Resume.json
     */
    /**
     * Sample code: KinesisSourceConnector Resume.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void kinesisSourceConnectorResume(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) throws IOException {
        manager.connectorOperations()
            .resumeWithResponse("abcd", "kinesisSourceConnector1", SerializerFactory
                .createDefaultManagementSerializerAdapter().deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }
}
```

### ConnectorOperations_UpdateTags

```java
import com.azure.resourcemanager.messagingconnectors.models.ConnectorInstance;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ConnectorOperations UpdateTags.
 */
public final class ConnectorOperationsUpdateTagsSamples {
    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/ConfluentSourceConnector_UpdateTags.json
     */
    /**
     * Sample code: ConfluentSourceConnector UpdateTags.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void confluentSourceConnectorUpdateTags(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        ConnectorInstance resource = manager.connectorOperations()
            .getByResourceGroupWithResponse("abcd", "confluentSourceConnector1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3")).apply();
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/PostgreSqlSourceConnector_UpdateTags.json
     */
    /**
     * Sample code: PostgreSqlSourceConnector UpdateTags.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void postgreSqlSourceConnectorUpdateTags(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        ConnectorInstance resource = manager.connectorOperations()
            .getByResourceGroupWithResponse("abcd", "postgreSqlSourceConnector1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3")).apply();
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/BitCoinSourceConnector_UpdateTags.json
     */
    /**
     * Sample code: BitCoinSourceConnector UpdateTags.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void bitCoinSourceConnectorUpdateTags(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        ConnectorInstance resource = manager.connectorOperations()
            .getByResourceGroupWithResponse("abcd", "bitCoin1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/GooglePubSubSourceConnector_UpdateTags.json
     */
    /**
     * Sample code: GooglePubSubSourceConnector UpdateTags.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void googlePubSubSourceConnectorUpdateTags(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        ConnectorInstance resource = manager.connectorOperations()
            .getByResourceGroupWithResponse("abcd", "googlePubSubSourceConnector1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3")).apply();
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/KinesisSourceConnector_UpdateTags.json
     */
    /**
     * Sample code: KinesisSourceConnector UpdateTags.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void kinesisSourceConnectorUpdateTags(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        ConnectorInstance resource = manager.connectorOperations()
            .getByResourceGroupWithResponse("abcd", "kinesisSourceConnector1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3")).apply();
    }

    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/CosmosDbSourceConnector_UpdateTags.json
     */
    /**
     * Sample code: CosmosDbSourceConnector UpdateTags.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void cosmosDbSourceConnectorUpdateTags(
        com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        ConnectorInstance resource = manager.connectorOperations()
            .getByResourceGroupWithResponse("abcd", "cosmosDbSourceConnector1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2", "tag3", "value3")).apply();
    }

    // Use "Map.of" if available
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

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/messagingconnectors/resource-manager/Microsoft.MessagingConnectors/preview/2024-01-20-preview/
     * examples/Operation_List.json
     */
    /**
     * Sample code: Operations List.
     * 
     * @param manager Entry point to MessagingconnectorsManager.
     */
    public static void
        operationsList(com.azure.resourcemanager.messagingconnectors.MessagingconnectorsManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

