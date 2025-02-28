# Code snippets and samples


## PipelineGroups

- [CreateOrUpdate](#pipelinegroups_createorupdate)
- [Delete](#pipelinegroups_delete)
- [GetByResourceGroup](#pipelinegroups_getbyresourcegroup)
- [List](#pipelinegroups_list)
- [ListByResourceGroup](#pipelinegroups_listbyresourcegroup)
- [Update](#pipelinegroups_update)
### PipelineGroups_CreateOrUpdate

```java
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.AzureMonitorWorkspaceLogsApiConfig;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.AzureMonitorWorkspaceLogsExporter;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.AzureResourceManagerCommonTypesExtendedLocation;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.CacheConfiguration;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.ConcurrencyConfiguration;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.Exporter;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.ExporterType;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.ExtendedLocationType;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.ExternalNetworkingMode;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.JsonArrayMapper;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.JsonMapperDestinationField;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.JsonMapperElement;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.JsonMapperSourceField;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.NetworkingConfiguration;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.NetworkingRoute;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.Pipeline;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.PipelineGroupProperties;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.PipelineType;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.Processor;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.ProcessorType;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.Receiver;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.ReceiverType;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.RecordMap;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.SchemaMap;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.Service;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.StreamEncodingType;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.SyslogReceiver;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.UdpReceiver;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PipelineGroups CreateOrUpdate.
 */
public final class PipelineGroupsCreate {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Monitor/PipelineGroups/preview/2024-10-01-preview/examples/
     * PipelineGroupCreateSyslogsWithNetworking.json
     */
    /**
     * Sample code: Create a PipelineGroup instance using a syslog receiver and networking configurations.
     * 
     * @param manager Entry point to AzureMonitorPipelinesManager.
     */
    public static void createAPipelineGroupInstanceUsingASyslogReceiverAndNetworkingConfigurations(
        com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.AzureMonitorPipelinesManager manager) {
        manager.pipelineGroups()
            .define("plGroup1")
            .withRegion("eastus2")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("tag1", "A", "tag2", "B"))
            .withProperties(new PipelineGroupProperties()
                .withReceivers(Arrays.asList(new Receiver().withType(ReceiverType.SYSLOG)
                    .withName("syslog-receiver1")
                    .withSyslog(new SyslogReceiver().withEndpoint("0.0.0.0:514"))))
                .withProcessors(Arrays.asList())
                .withExporters(Arrays.asList(new Exporter().withType(ExporterType.AZURE_MONITOR_WORKSPACE_LOGS)
                    .withName("my-workspace-logs-exporter1")
                    .withAzureMonitorWorkspaceLogs(new AzureMonitorWorkspaceLogsExporter()
                        .withApi(new AzureMonitorWorkspaceLogsApiConfig()
                            .withDataCollectionEndpointUrl(
                                "https://logs-myingestion-eb0s.eastus-1.ingest.monitor.azure.com")
                            .withStream("Custom-MyTableRawData_CL")
                            .withDataCollectionRule("dcr-00000000000000000000000000000000")
                            .withSchema(new SchemaMap()
                                .withRecordMap(Arrays.asList(new RecordMap().withFrom("body").withTo("Body"),
                                    new RecordMap().withFrom("severity_text").withTo("SeverityText"),
                                    new RecordMap().withFrom("time_unix_nano").withTo("TimeGenerated")))))
                        .withConcurrency(new ConcurrencyConfiguration().withWorkerCount(4).withBatchQueueSize(100)))))
                .withService(new Service().withPipelines(Arrays.asList(new Pipeline().withName("MyPipelineForLogs1")
                    .withType(PipelineType.LOGS)
                    .withReceivers(Arrays.asList("syslog-receiver1"))
                    .withProcessors(Arrays.asList())
                    .withExporters(Arrays.asList("my-workspace-logs-exporter1")))))
                .withNetworkingConfigurations(Arrays.asList(
                    new NetworkingConfiguration().withExternalNetworkingMode(ExternalNetworkingMode.LOAD_BALANCER_ONLY)
                        .withHost("azuremonitorpipeline.contoso.com")
                        .withRoutes(Arrays.asList(new NetworkingRoute().withReceiver("syslog-receiver1"))))))
            .withExtendedLocation(new AzureResourceManagerCommonTypesExtendedLocation().withName(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/microsoft.extendedlocation/customlocations/myTestCustomLocation")
                .withType(ExtendedLocationType.CUSTOM_LOCATION))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Monitor/PipelineGroups/preview/2024-10-01-preview/examples/
     * PipelineGroupCreateSyslogs.json
     */
    /**
     * Sample code: Create a PipelineGroup instance using a syslog receiver.
     * 
     * @param manager Entry point to AzureMonitorPipelinesManager.
     */
    public static void createAPipelineGroupInstanceUsingASyslogReceiver(
        com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.AzureMonitorPipelinesManager manager) {
        manager.pipelineGroups()
            .define("plGroup1")
            .withRegion("eastus2")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("tag1", "A", "tag2", "B"))
            .withProperties(new PipelineGroupProperties()
                .withReceivers(Arrays.asList(new Receiver().withType(ReceiverType.SYSLOG)
                    .withName("syslog-receiver1")
                    .withSyslog(new SyslogReceiver().withEndpoint("0.0.0.0:514"))))
                .withProcessors(
                    Arrays.asList(new Processor().withType(ProcessorType.BATCH).withName("batch-processor1")))
                .withExporters(Arrays.asList(new Exporter().withType(ExporterType.AZURE_MONITOR_WORKSPACE_LOGS)
                    .withName("my-workspace-logs-exporter1")
                    .withAzureMonitorWorkspaceLogs(new AzureMonitorWorkspaceLogsExporter()
                        .withApi(new AzureMonitorWorkspaceLogsApiConfig()
                            .withDataCollectionEndpointUrl(
                                "https://logs-myingestion-eb0s.eastus-1.ingest.monitor.azure.com")
                            .withStream("Custom-MyTableRawData_CL")
                            .withDataCollectionRule("dcr-00000000000000000000000000000000")
                            .withSchema(new SchemaMap()
                                .withRecordMap(Arrays.asList(new RecordMap().withFrom("body").withTo("Body"),
                                    new RecordMap().withFrom("severity_text").withTo("SeverityText"),
                                    new RecordMap().withFrom("time_unix_nano").withTo("TimeGenerated")))))
                        .withConcurrency(new ConcurrencyConfiguration().withWorkerCount(4).withBatchQueueSize(100)))))
                .withService(new Service().withPipelines(Arrays.asList(new Pipeline().withName("MyPipelineForLogs1")
                    .withType(PipelineType.LOGS)
                    .withReceivers(Arrays.asList("syslog-receiver1"))
                    .withProcessors(Arrays.asList("batch-processor1"))
                    .withExporters(Arrays.asList("my-workspace-logs-exporter1"))))))
            .withExtendedLocation(new AzureResourceManagerCommonTypesExtendedLocation().withName(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/microsoft.extendedlocation/customlocations/myTestCustomLocation")
                .withType(ExtendedLocationType.CUSTOM_LOCATION))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Monitor/PipelineGroups/preview/2024-10-01-preview/examples/
     * PipelineGroupCreateUdpWithJsonArrayMapper.json
     */
    /**
     * Sample code: Create a PipelineGroup instance using a UDP receiver with json array mapper.
     * 
     * @param manager Entry point to AzureMonitorPipelinesManager.
     */
    public static void createAPipelineGroupInstanceUsingAUDPReceiverWithJsonArrayMapper(
        com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.AzureMonitorPipelinesManager manager) {
        manager.pipelineGroups()
            .define("plGroup1")
            .withRegion("eastus2")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("tag1", "A", "tag2", "B"))
            .withProperties(
                new PipelineGroupProperties()
                    .withReceivers(Arrays.asList(new Receiver().withType(ReceiverType.UDP)
                        .withName("udp-receiver1")
                        .withUdp(new UdpReceiver().withEndpoint("0.0.0.0:518")
                            .withEncoding(StreamEncodingType.UTF_8)
                            .withJsonArrayMapper(new JsonArrayMapper()
                                .withSourceField(new JsonMapperSourceField().withFieldName("field1"))
                                .withDestinationField(
                                    new JsonMapperDestinationField().withDestination(JsonMapperElement.ATTRIBUTES))
                                .withKeys(Arrays.asList("key1", "key2", "key3"))))))
                    .withProcessors(Arrays.asList())
                    .withExporters(Arrays.asList(new Exporter().withType(ExporterType.AZURE_MONITOR_WORKSPACE_LOGS)
                        .withName("my-workspace-logs-exporter1")
                        .withAzureMonitorWorkspaceLogs(new AzureMonitorWorkspaceLogsExporter()
                            .withApi(new AzureMonitorWorkspaceLogsApiConfig()
                                .withDataCollectionEndpointUrl(
                                    "https://logs-myingestion-eb0s.eastus-1.ingest.monitor.azure.com")
                                .withStream("Custom-MyTableRawData_CL")
                                .withDataCollectionRule("dcr-00000000000000000000000000000000")
                                .withSchema(new SchemaMap()
                                    .withRecordMap(Arrays.asList(new RecordMap().withFrom("body").withTo("Body"),
                                        new RecordMap().withFrom("severity_text").withTo("SeverityText"),
                                        new RecordMap().withFrom("time_unix_nano").withTo("TimeGenerated")))))
                            .withConcurrency(
                                new ConcurrencyConfiguration().withWorkerCount(4).withBatchQueueSize(100)))))
                    .withService(new Service().withPipelines(Arrays.asList(new Pipeline().withName("MyPipelineForLogs1")
                        .withType(PipelineType.LOGS)
                        .withReceivers(Arrays.asList("udp-receiver1"))
                        .withProcessors(Arrays.asList())
                        .withExporters(Arrays.asList("my-workspace-logs-exporter1"))))))
            .withExtendedLocation(new AzureResourceManagerCommonTypesExtendedLocation().withName(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/microsoft.extendedlocation/customlocations/myTestCustomLocation")
                .withType(ExtendedLocationType.CUSTOM_LOCATION))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Monitor/PipelineGroups/preview/2024-10-01-preview/examples/
     * PipelineGroupCreateUdp.json
     */
    /**
     * Sample code: Create a PipelineGroup instance using UDP receiver.
     * 
     * @param manager Entry point to AzureMonitorPipelinesManager.
     */
    public static void createAPipelineGroupInstanceUsingUDPReceiver(
        com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.AzureMonitorPipelinesManager manager) {
        manager.pipelineGroups()
            .define("plGroup1")
            .withRegion("eastus2")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("tag1", "A", "tag2", "B"))
            .withProperties(new PipelineGroupProperties()
                .withReceivers(Arrays.asList(new Receiver().withType(ReceiverType.UDP)
                    .withName("udp-receiver1")
                    .withUdp(new UdpReceiver().withEndpoint("0.0.0.0:518").withEncoding(StreamEncodingType.UTF_8))))
                .withProcessors(Arrays.asList())
                .withExporters(Arrays.asList(new Exporter().withType(ExporterType.AZURE_MONITOR_WORKSPACE_LOGS)
                    .withName("my-workspace-logs-exporter1")
                    .withAzureMonitorWorkspaceLogs(new AzureMonitorWorkspaceLogsExporter()
                        .withApi(new AzureMonitorWorkspaceLogsApiConfig()
                            .withDataCollectionEndpointUrl(
                                "https://logs-myingestion-eb0s.eastus-1.ingest.monitor.azure.com")
                            .withStream("Custom-MyTableRawData_CL")
                            .withDataCollectionRule("dcr-00000000000000000000000000000000")
                            .withSchema(new SchemaMap()
                                .withRecordMap(Arrays.asList(new RecordMap().withFrom("body").withTo("Body"),
                                    new RecordMap().withFrom("severity_text").withTo("SeverityText"),
                                    new RecordMap().withFrom("time_unix_nano").withTo("TimeGenerated")))))
                        .withConcurrency(new ConcurrencyConfiguration().withWorkerCount(4).withBatchQueueSize(100)))))
                .withService(new Service().withPipelines(Arrays.asList(new Pipeline().withName("MyPipelineForLogs1")
                    .withType(PipelineType.LOGS)
                    .withReceivers(Arrays.asList("udp-receiver1"))
                    .withProcessors(Arrays.asList())
                    .withExporters(Arrays.asList("my-workspace-logs-exporter1"))))))
            .withExtendedLocation(new AzureResourceManagerCommonTypesExtendedLocation().withName(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/microsoft.extendedlocation/customlocations/myTestCustomLocation")
                .withType(ExtendedLocationType.CUSTOM_LOCATION))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Monitor/PipelineGroups/preview/2024-10-01-preview/examples/
     * PipelineGroupCreateSyslogsWithCache.json
     */
    /**
     * Sample code: Create a PipelineGroup instance using a syslog receiver and cache.
     * 
     * @param manager Entry point to AzureMonitorPipelinesManager.
     */
    public static void createAPipelineGroupInstanceUsingASyslogReceiverAndCache(
        com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.AzureMonitorPipelinesManager manager) {
        manager.pipelineGroups()
            .define("plGroup1")
            .withRegion("eastus2")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("tag1", "A", "tag2", "B"))
            .withProperties(new PipelineGroupProperties()
                .withReceivers(Arrays.asList(new Receiver().withType(ReceiverType.SYSLOG)
                    .withName("syslog-receiver1")
                    .withSyslog(new SyslogReceiver().withEndpoint("0.0.0.0:514"))))
                .withProcessors(
                    Arrays.asList(new Processor().withType(ProcessorType.BATCH).withName("batch-processor1")))
                .withExporters(Arrays.asList(new Exporter().withType(ExporterType.AZURE_MONITOR_WORKSPACE_LOGS)
                    .withName("my-workspace-logs-exporter1")
                    .withAzureMonitorWorkspaceLogs(new AzureMonitorWorkspaceLogsExporter()
                        .withApi(new AzureMonitorWorkspaceLogsApiConfig()
                            .withDataCollectionEndpointUrl(
                                "https://logs-myingestion-eb0s.eastus-1.ingest.monitor.azure.com")
                            .withStream("Custom-MyTableRawData_CL")
                            .withDataCollectionRule("dcr-00000000000000000000000000000000")
                            .withSchema(new SchemaMap()
                                .withRecordMap(Arrays.asList(new RecordMap().withFrom("body").withTo("Body"),
                                    new RecordMap().withFrom("severity_text").withTo("SeverityText"),
                                    new RecordMap().withFrom("time_unix_nano").withTo("TimeGenerated")))))
                        .withConcurrency(new ConcurrencyConfiguration().withWorkerCount(4).withBatchQueueSize(100))
                        .withCache(new CacheConfiguration().withMaxStorageUsage(100).withRetentionPeriod(10)))))
                .withService(new Service().withPipelines(Arrays.asList(new Pipeline().withName("MyPipelineForLogs1")
                    .withType(PipelineType.LOGS)
                    .withReceivers(Arrays.asList("syslog-receiver1"))
                    .withProcessors(Arrays.asList("batch-processor1"))
                    .withExporters(Arrays.asList("my-workspace-logs-exporter1"))))))
            .withExtendedLocation(new AzureResourceManagerCommonTypesExtendedLocation().withName(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/microsoft.extendedlocation/customlocations/myTestCustomLocation")
                .withType(ExtendedLocationType.CUSTOM_LOCATION))
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

### PipelineGroups_Delete

```java
/**
 * Samples for PipelineGroups Delete.
 */
public final class PipelineGroupsDelete {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Monitor/PipelineGroups/preview/2024-10-01-preview/examples/
     * PipelineGroupDelete.json
     */
    /**
     * Sample code: Deletes a PipelineGroup instance.
     * 
     * @param manager Entry point to AzureMonitorPipelinesManager.
     */
    public static void deletesAPipelineGroupInstance(
        com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.AzureMonitorPipelinesManager manager) {
        manager.pipelineGroups().delete("myResourceGroup", "plGroup1", com.azure.core.util.Context.NONE);
    }
}
```

### PipelineGroups_GetByResourceGroup

```java
/**
 * Samples for PipelineGroups GetByResourceGroup.
 */
public final class PipelineGroupsGetByR {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Monitor/PipelineGroups/preview/2024-10-01-preview/examples/
     * PipelineGroupGet.json
     */
    /**
     * Sample code: Retrieves a PipelineGroup instance by name.
     * 
     * @param manager Entry point to AzureMonitorPipelinesManager.
     */
    public static void retrievesAPipelineGroupInstanceByName(
        com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.AzureMonitorPipelinesManager manager) {
        manager.pipelineGroups()
            .getByResourceGroupWithResponse("myResourceGroup", "plGroup1", com.azure.core.util.Context.NONE);
    }
}
```

### PipelineGroups_List

```java
/**
 * Samples for PipelineGroups List.
 */
public final class PipelineGroupsListSa {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Monitor/PipelineGroups/preview/2024-10-01-preview/examples/
     * PipelineGroupListBySubscription.json
     */
    /**
     * Sample code: List Pipeline groups by subscription.
     * 
     * @param manager Entry point to AzureMonitorPipelinesManager.
     */
    public static void listPipelineGroupsBySubscription(
        com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.AzureMonitorPipelinesManager manager) {
        manager.pipelineGroups().list(com.azure.core.util.Context.NONE);
    }
}
```

### PipelineGroups_ListByResourceGroup

```java
/**
 * Samples for PipelineGroups ListByResourceGroup.
 */
public final class PipelineGroupsListBy {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Monitor/PipelineGroups/preview/2024-10-01-preview/examples/
     * PipelineGroupListByResourceGroup.json
     */
    /**
     * Sample code: List Pipeline groups by resource group.
     * 
     * @param manager Entry point to AzureMonitorPipelinesManager.
     */
    public static void listPipelineGroupsByResourceGroup(
        com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.AzureMonitorPipelinesManager manager) {
        manager.pipelineGroups().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### PipelineGroups_Update

```java
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.AzureMonitorWorkspaceLogsApiConfig;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.AzureMonitorWorkspaceLogsExporter;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.ConcurrencyConfiguration;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.Exporter;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.ExporterType;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.Pipeline;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.PipelineGroup;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.PipelineGroupPropertiesUpdate;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.PipelineType;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.Receiver;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.ReceiverType;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.RecordMap;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.SchemaMap;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.ServiceUpdate;
import com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.models.SyslogReceiver;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for PipelineGroups Update.
 */
public final class PipelineGroupsUpdate {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Monitor/PipelineGroups/preview/2024-10-01-preview/examples/
     * PipelineGroupUpdate.json
     */
    /**
     * Sample code: Updates a PipelineGroup instance.
     * 
     * @param manager Entry point to AzureMonitorPipelinesManager.
     */
    public static void updatesAPipelineGroupInstance(
        com.azure.resourcemanager.monitormicrosoftmonitorpipelinegroups.AzureMonitorPipelinesManager manager) {
        PipelineGroup resource = manager.pipelineGroups()
            .getByResourceGroupWithResponse("myResourceGroup", "plGroup1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("tag1", "A", "tag2", "B"))
            .withProperties(new PipelineGroupPropertiesUpdate().withReplicas(3)
                .withReceivers(Arrays.asList(new Receiver().withType(ReceiverType.SYSLOG)
                    .withName("syslog-receiver1")
                    .withSyslog(new SyslogReceiver().withEndpoint("0.0.0.0:514"))))
                .withProcessors(Arrays.asList())
                .withExporters(Arrays.asList(new Exporter().withType(ExporterType.AZURE_MONITOR_WORKSPACE_LOGS)
                    .withName("my-workspace-logs-exporter1")
                    .withAzureMonitorWorkspaceLogs(new AzureMonitorWorkspaceLogsExporter()
                        .withApi(new AzureMonitorWorkspaceLogsApiConfig()
                            .withDataCollectionEndpointUrl(
                                "https://logs-myingestion-eb0s.eastus-1.ingest.monitor.azure.com")
                            .withStream("Custom-MyTableRawData_CL")
                            .withDataCollectionRule("dcr-00000000000000000000000000000000")
                            .withSchema(new SchemaMap()
                                .withRecordMap(Arrays.asList(new RecordMap().withFrom("body").withTo("Body"),
                                    new RecordMap().withFrom("severity_text").withTo("SeverityText"),
                                    new RecordMap().withFrom("time_unix_nano").withTo("TimeGenerated")))))
                        .withConcurrency(new ConcurrencyConfiguration().withWorkerCount(4).withBatchQueueSize(100)))))
                .withService(
                    new ServiceUpdate().withPipelines(Arrays.asList(new Pipeline().withName("MyPipelineForLogs1")
                        .withType(PipelineType.LOGS)
                        .withReceivers(Arrays.asList("syslog-receiver1"))
                        .withProcessors(Arrays.asList())
                        .withExporters(Arrays.asList("my-workspace-logs-exporter1"))))))
            .apply();
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

