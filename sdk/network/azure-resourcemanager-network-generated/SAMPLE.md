# Code snippets and samples


## ConnectionMonitors

- [CreateOrUpdate](#connectionmonitors_createorupdate)
- [Delete](#connectionmonitors_delete)
- [Get](#connectionmonitors_get)
- [List](#connectionmonitors_list)
- [Query](#connectionmonitors_query)
- [Start](#connectionmonitors_start)
- [Stop](#connectionmonitors_stop)
- [UpdateTags](#connectionmonitors_updatetags)

## FlowLogs

- [CreateOrUpdate](#flowlogs_createorupdate)
- [Delete](#flowlogs_delete)
- [Get](#flowlogs_get)
- [List](#flowlogs_list)
- [UpdateTags](#flowlogs_updatetags)

## NetworkWatchers

- [CheckConnectivity](#networkwatchers_checkconnectivity)
- [CreateOrUpdate](#networkwatchers_createorupdate)
- [Delete](#networkwatchers_delete)
- [GetAzureReachabilityReport](#networkwatchers_getazurereachabilityreport)
- [GetByResourceGroup](#networkwatchers_getbyresourcegroup)
- [GetFlowLogStatus](#networkwatchers_getflowlogstatus)
- [GetNetworkConfigurationDiagnostic](#networkwatchers_getnetworkconfigurationdiagnostic)
- [GetNextHop](#networkwatchers_getnexthop)
- [GetTopology](#networkwatchers_gettopology)
- [GetTroubleshooting](#networkwatchers_gettroubleshooting)
- [GetTroubleshootingResult](#networkwatchers_gettroubleshootingresult)
- [GetVMSecurityRules](#networkwatchers_getvmsecurityrules)
- [List](#networkwatchers_list)
- [ListAvailableProviders](#networkwatchers_listavailableproviders)
- [ListByResourceGroup](#networkwatchers_listbyresourcegroup)
- [SetFlowLogConfiguration](#networkwatchers_setflowlogconfiguration)
- [UpdateTags](#networkwatchers_updatetags)
- [VerifyIpFlow](#networkwatchers_verifyipflow)

## PacketCaptures

- [Create](#packetcaptures_create)
- [Delete](#packetcaptures_delete)
- [Get](#packetcaptures_get)
- [GetStatus](#packetcaptures_getstatus)
- [List](#packetcaptures_list)
- [Stop](#packetcaptures_stop)
### ConnectionMonitors_CreateOrUpdate

```java
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpoint;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpointFilter;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpointFilterItem;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpointFilterItemType;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorEndpointFilterType;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTcpConfiguration;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestConfiguration;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestConfigurationProtocol;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorTestGroup;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Samples for ConnectionMonitors CreateOrUpdate.
 */
public final class ConnectionMonitorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherConnectionMonitorCreate.json
     */
    /**
     * Sample code: Create connection monitor V1.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void createConnectionMonitorV1(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.connectionMonitors().define("cm1").withExistingNetworkWatcher("rg1", "nw1").withRegion("eastus").withEndpoints(Arrays.asList(new ConnectionMonitorEndpoint().withName("source").withResourceId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Compute/virtualMachines/ct1"), new ConnectionMonitorEndpoint().withName("destination").withAddress("bing.com"))).withTestConfigurations(Arrays.asList(new ConnectionMonitorTestConfiguration().withName("tcp").withTestFrequencySec(60).withProtocol(ConnectionMonitorTestConfigurationProtocol.TCP).withTcpConfiguration(new ConnectionMonitorTcpConfiguration().withPort(80)))).withTestGroups(Arrays.asList(new ConnectionMonitorTestGroup().withName("tg").withTestConfigurations(Arrays.asList("tcp")).withSources(Arrays.asList("source")).withDestinations(Arrays.asList("destination")))).create();
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherConnectionMonitorV2Create.json
     */
    /**
     * Sample code: Create connection monitor V2.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void createConnectionMonitorV2(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.connectionMonitors().define("cm1").withExistingNetworkWatcher("rg1", "nw1").withEndpoints(Arrays.asList(new ConnectionMonitorEndpoint().withName("vm1").withResourceId("/subscriptions/96e68903-0a56-4819-9987-8d08ad6a1f99/resourceGroups/NwRgIrinaCentralUSEUAP/providers/Microsoft.Compute/virtualMachines/vm1"), new ConnectionMonitorEndpoint().withName("CanaryWorkspaceVamshi").withResourceId("/subscriptions/96e68903-0a56-4819-9987-8d08ad6a1f99/resourceGroups/vasamudrRG/providers/Microsoft.OperationalInsights/workspaces/vasamudrWorkspace").withFilter(new ConnectionMonitorEndpointFilter().withType(ConnectionMonitorEndpointFilterType.INCLUDE).withItems(Arrays.asList(new ConnectionMonitorEndpointFilterItem().withType(ConnectionMonitorEndpointFilterItemType.AGENT_ADDRESS).withAddress("npmuser")))), new ConnectionMonitorEndpoint().withName("bing").withAddress("bing.com"), new ConnectionMonitorEndpoint().withName("google").withAddress("google.com"))).withTestConfigurations(Arrays.asList(new ConnectionMonitorTestConfiguration().withName("testConfig1").withTestFrequencySec(60).withProtocol(ConnectionMonitorTestConfigurationProtocol.TCP).withTcpConfiguration(new ConnectionMonitorTcpConfiguration().withPort(80).withDisableTraceRoute(false)))).withTestGroups(Arrays.asList(new ConnectionMonitorTestGroup().withName("test1").withDisable(false).withTestConfigurations(Arrays.asList("testConfig1")).withSources(Arrays.asList("vm1", "CanaryWorkspaceVamshi")).withDestinations(Arrays.asList("bing", "google")))).withOutputs(Arrays.asList()).create();
    }
}
```

### ConnectionMonitors_Delete

```java
/**
 * Samples for ConnectionMonitors Delete.
 */
public final class ConnectionMonitorsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherConnectionMonitorDelete.json
     */
    /**
     * Sample code: Delete connection monitor.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteConnectionMonitor(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.connectionMonitors().delete("rg1", "nw1", "cm1", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectionMonitors_Get

```java
/**
 * Samples for ConnectionMonitors Get.
 */
public final class ConnectionMonitorsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherConnectionMonitorGet.json
     */
    /**
     * Sample code: Get connection monitor.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getConnectionMonitor(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.connectionMonitors().getWithResponse("rg1", "nw1", "cm1", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectionMonitors_List

```java
/**
 * Samples for ConnectionMonitors List.
 */
public final class ConnectionMonitorsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherConnectionMonitorList.json
     */
    /**
     * Sample code: List connection monitors.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void listConnectionMonitors(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.connectionMonitors().list("rg1", "nw1", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectionMonitors_Query

```java
/**
 * Samples for ConnectionMonitors Query.
 */
public final class ConnectionMonitorsQuerySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherConnectionMonitorQuery.json
     */
    /**
     * Sample code: Query connection monitor.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void queryConnectionMonitor(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.connectionMonitors().query("rg1", "nw1", "cm1", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectionMonitors_Start

```java
/**
 * Samples for ConnectionMonitors Start.
 */
public final class ConnectionMonitorsStartSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherConnectionMonitorStart.json
     */
    /**
     * Sample code: Start connection monitor.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void startConnectionMonitor(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.connectionMonitors().start("rg1", "nw1", "cm1", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectionMonitors_Stop

```java
/**
 * Samples for ConnectionMonitors Stop.
 */
public final class ConnectionMonitorsStopSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherConnectionMonitorStop.json
     */
    /**
     * Sample code: Stop connection monitor.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void stopConnectionMonitor(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.connectionMonitors().stop("rg1", "nw1", "cm1", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectionMonitors_UpdateTags

```java
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorResult;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ConnectionMonitors UpdateTags.
 */
public final class ConnectionMonitorsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherConnectionMonitorUpdateTags.json
     */
    /**
     * Sample code: Update connection monitor tags.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void updateConnectionMonitorTags(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        ConnectionMonitorResult resource = manager.connectionMonitors().getWithResponse("rg1", "nw1", "cm1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### FlowLogs_CreateOrUpdate

```java
import com.azure.resourcemanager.network.generated.models.FlowLogFormatParameters;
import com.azure.resourcemanager.network.generated.models.FlowLogFormatType;
import java.util.stream.Collectors;

/**
 * Samples for FlowLogs CreateOrUpdate.
 */
public final class FlowLogsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherFlowLogCreate.json
     */
    /**
     * Sample code: Create or update flow log.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void createOrUpdateFlowLog(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.flowLogs().define("fl").withRegion("centraluseuap").withExistingNetworkWatcher("rg1", "nw1").withTargetResourceId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkSecurityGroups/desmondcentral-nsg").withStorageId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Storage/storageAccounts/nwtest1mgvbfmqsigdxe").withEnabled(true).withFormat(new FlowLogFormatParameters().withType(FlowLogFormatType.JSON).withVersion(1)).create();
    }
}
```

### FlowLogs_Delete

```java
/**
 * Samples for FlowLogs Delete.
 */
public final class FlowLogsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherFlowLogDelete.json
     */
    /**
     * Sample code: Delete flow log.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteFlowLog(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.flowLogs().delete("rg1", "nw1", "fl", com.azure.core.util.Context.NONE);
    }
}
```

### FlowLogs_Get

```java
/**
 * Samples for FlowLogs Get.
 */
public final class FlowLogsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherFlowLogGet.json
     */
    /**
     * Sample code: Get flow log.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getFlowLog(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.flowLogs().getWithResponse("rg1", "nw1", "flowLog1", com.azure.core.util.Context.NONE);
    }
}
```

### FlowLogs_List

```java
/**
 * Samples for FlowLogs List.
 */
public final class FlowLogsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherFlowLogList.json
     */
    /**
     * Sample code: List connection monitors.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void listConnectionMonitors(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.flowLogs().list("rg1", "nw1", com.azure.core.util.Context.NONE);
    }
}
```

### FlowLogs_UpdateTags

```java
import com.azure.resourcemanager.network.generated.models.FlowLog;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for FlowLogs UpdateTags.
 */
public final class FlowLogsUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherFlowLogUpdateTags.json
     */
    /**
     * Sample code: Update flow log tags.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void updateFlowLogTags(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        FlowLog resource = manager.flowLogs().getWithResponse("rg1", "nw", "fl", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### NetworkWatchers_CheckConnectivity

```java
import com.azure.resourcemanager.network.generated.models.ConnectivityDestination;
import com.azure.resourcemanager.network.generated.models.ConnectivityParameters;
import com.azure.resourcemanager.network.generated.models.ConnectivitySource;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import java.util.stream.Collectors;

/**
 * Samples for NetworkWatchers CheckConnectivity.
 */
public final class NetworkWatchersCheckConnectivitySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherConnectivityCheck.json
     */
    /**
     * Sample code: Check connectivity.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void checkConnectivity(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().checkConnectivity("rg1", "nw1", new ConnectivityParameters().withSource(new ConnectivitySource().withResourceId("/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1")).withDestination(new ConnectivityDestination().withAddress("192.168.100.4").withPort(3389)).withPreferredIpVersion(IpVersion.IPV4), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_CreateOrUpdate

```java
/**
 * Samples for NetworkWatchers CreateOrUpdate.
 */
public final class NetworkWatchersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherCreate.json
     */
    /**
     * Sample code: Create network watcher.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void createNetworkWatcher(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().define("nw1").withRegion("eastus").withExistingResourceGroup("rg1").create();
    }
}
```

### NetworkWatchers_Delete

```java
/**
 * Samples for NetworkWatchers Delete.
 */
public final class NetworkWatchersDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherDelete.json
     */
    /**
     * Sample code: Delete network watcher.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void deleteNetworkWatcher(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().delete("rg1", "nw1", com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_GetAzureReachabilityReport

```java
import com.azure.resourcemanager.network.generated.models.AzureReachabilityReportLocation;
import com.azure.resourcemanager.network.generated.models.AzureReachabilityReportParameters;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for NetworkWatchers GetAzureReachabilityReport.
 */
public final class NetworkWatchersGetAzureReachabilityReportSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherAzureReachabilityReportGet.json
     */
    /**
     * Sample code: Get Azure Reachability Report.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getAzureReachabilityReport(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().getAzureReachabilityReport("rg1", "nw1", new AzureReachabilityReportParameters().withProviderLocation(new AzureReachabilityReportLocation().withCountry("United States").withState("washington")).withProviders(Arrays.asList("Frontier Communications of America, Inc. - ASN 5650")).withAzureLocations(Arrays.asList("West US")).withStartTime(OffsetDateTime.parse("2017-09-07T00:00:00Z")).withEndTime(OffsetDateTime.parse("2017-09-10T00:00:00Z")), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_GetByResourceGroup

```java
/**
 * Samples for NetworkWatchers GetByResourceGroup.
 */
public final class NetworkWatchersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherGet.json
     */
    /**
     * Sample code: Get network watcher.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getNetworkWatcher(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().getByResourceGroupWithResponse("rg1", "nw1", com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_GetFlowLogStatus

```java
import com.azure.resourcemanager.network.generated.models.FlowLogStatusParameters;

/**
 * Samples for NetworkWatchers GetFlowLogStatus.
 */
public final class NetworkWatchersGetFlowLogStatusSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherFlowLogStatusQuery.json
     */
    /**
     * Sample code: Get flow log status.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getFlowLogStatus(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().getFlowLogStatus("rg1", "nw1", new FlowLogStatusParameters().withTargetResourceId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkSecurityGroups/nsg1"), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_GetNetworkConfigurationDiagnostic

```java
import com.azure.resourcemanager.network.generated.models.Direction;
import com.azure.resourcemanager.network.generated.models.NetworkConfigurationDiagnosticParameters;
import com.azure.resourcemanager.network.generated.models.NetworkConfigurationDiagnosticProfile;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Samples for NetworkWatchers GetNetworkConfigurationDiagnostic.
 */
public final class NetworkWatchersGetNetworkConfigurationDiagnosticSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherNetworkConfigurationDiagnostic.json
     */
    /**
     * Sample code: Network configuration diagnostic.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void networkConfigurationDiagnostic(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().getNetworkConfigurationDiagnostic("rg1", "nw1", new NetworkConfigurationDiagnosticParameters().withTargetResourceId("/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1").withProfiles(Arrays.asList(new NetworkConfigurationDiagnosticProfile().withDirection(Direction.INBOUND).withProtocol("TCP").withSource("10.1.0.4").withDestination("12.11.12.14").withDestinationPort("12100"))), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_GetNextHop

```java
import com.azure.resourcemanager.network.generated.models.NextHopParameters;

/**
 * Samples for NetworkWatchers GetNextHop.
 */
public final class NetworkWatchersGetNextHopSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherNextHopGet.json
     */
    /**
     * Sample code: Get next hop.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getNextHop(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().getNextHop("rg1", "nw1", new NextHopParameters().withTargetResourceId("/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1").withSourceIpAddress("10.0.0.5").withDestinationIpAddress("10.0.0.10").withTargetNicResourceId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkInterfaces/nic1"), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_GetTopology

```java
import com.azure.resourcemanager.network.generated.models.TopologyParameters;

/**
 * Samples for NetworkWatchers GetTopology.
 */
public final class NetworkWatchersGetTopologySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherTopologyGet.json
     */
    /**
     * Sample code: Get Topology.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getTopology(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().getTopologyWithResponse("rg1", "nw1", new TopologyParameters().withTargetResourceGroupName("rg2"), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_GetTroubleshooting

```java
import com.azure.resourcemanager.network.generated.models.TroubleshootingParameters;

/**
 * Samples for NetworkWatchers GetTroubleshooting.
 */
public final class NetworkWatchersGetTroubleshootingSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherTroubleshootGet.json
     */
    /**
     * Sample code: Get troubleshooting.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getTroubleshooting(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().getTroubleshooting("rg1", "nw1", new TroubleshootingParameters().withTargetResourceId("/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1").withStorageId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Storage/storageAccounts/st1").withStoragePath("https://st1.blob.core.windows.net/cn1"), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_GetTroubleshootingResult

```java
import com.azure.resourcemanager.network.generated.models.QueryTroubleshootingParameters;

/**
 * Samples for NetworkWatchers GetTroubleshootingResult.
 */
public final class NetworkWatchersGetTroubleshootingResultSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherTroubleshootResultQuery.json
     */
    /**
     * Sample code: Get troubleshoot result.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getTroubleshootResult(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().getTroubleshootingResult("rg1", "nw1", new QueryTroubleshootingParameters().withTargetResourceId("/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1"), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_GetVMSecurityRules

```java
import com.azure.resourcemanager.network.generated.models.SecurityGroupViewParameters;

/**
 * Samples for NetworkWatchers GetVMSecurityRules.
 */
public final class NetworkWatchersGetVMSecurityRulesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherSecurityGroupViewGet.json
     */
    /**
     * Sample code: Get security group view.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getSecurityGroupView(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().getVMSecurityRules("rg1", "nw1", new SecurityGroupViewParameters().withTargetResourceId("/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1"), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_List

```java
/**
 * Samples for NetworkWatchers List.
 */
public final class NetworkWatchersListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherListAll.json
     */
    /**
     * Sample code: List all network watchers.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void listAllNetworkWatchers(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().list(com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_ListAvailableProviders

```java
import com.azure.resourcemanager.network.generated.models.AvailableProvidersListParameters;
import java.util.Arrays;

/**
 * Samples for NetworkWatchers ListAvailableProviders.
 */
public final class NetworkWatchersListAvailableProvidersSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherAvailableProvidersListGet.json
     */
    /**
     * Sample code: Get Available Providers List.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getAvailableProvidersList(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().listAvailableProviders("rg1", "nw1", new AvailableProvidersListParameters().withAzureLocations(Arrays.asList("West US")).withCountry("United States").withState("washington").withCity("seattle"), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_ListByResourceGroup

```java
/**
 * Samples for NetworkWatchers ListByResourceGroup.
 */
public final class NetworkWatchersListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherList.json
     */
    /**
     * Sample code: List network watchers.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void listNetworkWatchers(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_SetFlowLogConfiguration

```java
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInformationInner;

/**
 * Samples for NetworkWatchers SetFlowLogConfiguration.
 */
public final class NetworkWatchersSetFlowLogConfigurationSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherFlowLogConfigure.json
     */
    /**
     * Sample code: Configure flow log.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void configureFlowLog(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().setFlowLogConfiguration("rg1", "nw1", new FlowLogInformationInner().withTargetResourceId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkSecurityGroups/nsg1").withStorageId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Storage/storageAccounts/st1").withEnabled(true), com.azure.core.util.Context.NONE);
    }
}
```

### NetworkWatchers_UpdateTags

```java
import com.azure.resourcemanager.network.generated.models.NetworkWatcher;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for NetworkWatchers UpdateTags.
 */
public final class NetworkWatchersUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherUpdateTags.json
     */
    /**
     * Sample code: Update network watcher tags.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void updateNetworkWatcherTags(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        NetworkWatcher resource = manager.networkWatchers().getByResourceGroupWithResponse("rg1", "nw1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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

### NetworkWatchers_VerifyIpFlow

```java
import com.azure.resourcemanager.network.generated.models.Direction;
import com.azure.resourcemanager.network.generated.models.IpFlowProtocol;
import com.azure.resourcemanager.network.generated.models.VerificationIpFlowParameters;
import java.util.stream.Collectors;

/**
 * Samples for NetworkWatchers VerifyIpFlow.
 */
public final class NetworkWatchersVerifyIpFlowSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherIpFlowVerify.json
     */
    /**
     * Sample code: Ip flow verify.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void ipFlowVerify(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.networkWatchers().verifyIpFlow("rg1", "nw1", new VerificationIpFlowParameters().withTargetResourceId("/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1").withDirection(Direction.OUTBOUND).withProtocol(IpFlowProtocol.TCP).withLocalPort("80").withRemotePort("80").withLocalIpAddress("10.2.0.4").withRemoteIpAddress("121.10.1.1"), com.azure.core.util.Context.NONE);
    }
}
```

### PacketCaptures_Create

```java
import com.azure.resourcemanager.network.generated.models.PacketCapture;
import com.azure.resourcemanager.network.generated.models.PacketCaptureFilter;
import com.azure.resourcemanager.network.generated.models.PacketCaptureStorageLocation;
import com.azure.resourcemanager.network.generated.models.PcProtocol;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Samples for PacketCaptures Create.
 */
public final class PacketCapturesCreateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherPacketCaptureCreate.json
     */
    /**
     * Sample code: Create packet capture.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void createPacketCapture(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.packetCaptures().create("rg1", "nw1", "pc1", new PacketCapture().withTarget("/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1").withBytesToCapturePerPacket(10000L).withTotalBytesPerSession(100000L).withTimeLimitInSeconds(100).withStorageLocation(new PacketCaptureStorageLocation().withStorageId("/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Storage/storageAccounts/pcstore").withStoragePath("https://mytestaccountname.blob.core.windows.net/capture/pc1.cap").withFilePath("D:\\capture\\pc1.cap")).withFilters(Arrays.asList(new PacketCaptureFilter().withProtocol(PcProtocol.TCP).withLocalIpAddress("10.0.0.4").withLocalPort("80"))), com.azure.core.util.Context.NONE);
    }
}
```

### PacketCaptures_Delete

```java
/**
 * Samples for PacketCaptures Delete.
 */
public final class PacketCapturesDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherPacketCaptureDelete.json
     */
    /**
     * Sample code: Delete packet capture.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void deletePacketCapture(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.packetCaptures().delete("rg1", "nw1", "pc1", com.azure.core.util.Context.NONE);
    }
}
```

### PacketCaptures_Get

```java
/**
 * Samples for PacketCaptures Get.
 */
public final class PacketCapturesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherPacketCaptureGet.json
     */
    /**
     * Sample code: Get packet capture.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void getPacketCapture(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.packetCaptures().getWithResponse("rg1", "nw1", "pc1", com.azure.core.util.Context.NONE);
    }
}
```

### PacketCaptures_GetStatus

```java
/**
 * Samples for PacketCaptures GetStatus.
 */
public final class PacketCapturesGetStatusSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherPacketCaptureQueryStatus.json
     */
    /**
     * Sample code: Query packet capture status.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void queryPacketCaptureStatus(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.packetCaptures().getStatus("rg1", "nw1", "pc1", com.azure.core.util.Context.NONE);
    }
}
```

### PacketCaptures_List

```java
/**
 * Samples for PacketCaptures List.
 */
public final class PacketCapturesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherPacketCapturesList.json
     */
    /**
     * Sample code: List packet captures.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void listPacketCaptures(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.packetCaptures().list("rg1", "nw1", com.azure.core.util.Context.NONE);
    }
}
```

### PacketCaptures_Stop

```java
/**
 * Samples for PacketCaptures Stop.
 */
public final class PacketCapturesStopSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/preview/2023-09-01-preview/examples/NetworkWatcherPacketCaptureStop.json
     */
    /**
     * Sample code: Stop packet capture.
     * 
     * @param manager Entry point to NetworkManager.
     */
    public static void stopPacketCapture(com.azure.resourcemanager.network.generated.NetworkManager manager) {
        manager.packetCaptures().stop("rg1", "nw1", "pc1", com.azure.core.util.Context.NONE);
    }
}
```

