# Code snippets and samples


## EnergyServices

- [AddPartition](#energyservices_addpartition)
- [Create](#energyservices_create)
- [Delete](#energyservices_delete)
- [GetByResourceGroup](#energyservices_getbyresourcegroup)
- [List](#energyservices_list)
- [ListByResourceGroup](#energyservices_listbyresourcegroup)
- [ListPartitions](#energyservices_listpartitions)
- [RemovePartition](#energyservices_removepartition)
- [Update](#energyservices_update)

## Locations

- [CheckNameAvailability](#locations_checknameavailability)

## Operations

- [List](#operations_list)

## PrivateEndpointConnectionProxies

- [CreateOrUpdate](#privateendpointconnectionproxies_createorupdate)
- [Delete](#privateendpointconnectionproxies_delete)
- [Get](#privateendpointconnectionproxies_get)
- [ListByOakInstance](#privateendpointconnectionproxies_listbyoakinstance)
- [Validate](#privateendpointconnectionproxies_validate)

## PrivateEndpointConnections

- [CreateOrUpdate](#privateendpointconnections_createorupdate)
- [Delete](#privateendpointconnections_delete)
- [Get](#privateendpointconnections_get)
- [ListByOakInstance](#privateendpointconnections_listbyoakinstance)

## PrivateLinkResources

- [Get](#privatelinkresources_get)
- [ListByOakInstance](#privatelinkresources_listbyoakinstance)
### EnergyServices_AddPartition

```java
import com.azure.resourcemanager.oep.fluent.models.DataPartitionAddOrRemoveRequestInner;
import com.azure.resourcemanager.oep.models.DataPartitionNames;

/** Samples for EnergyServices AddPartition. */
public final class EnergyServicesAddPartitionSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_AddPartition_MaximumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_AddPartition_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesAddPartitionMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .energyServices()
            .addPartition(
                "SampleResourceGroupName",
                "sampleResourceName",
                new DataPartitionAddOrRemoveRequestInner().withName(new DataPartitionNames().withName("sample-name")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_AddPartition_MinimumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_AddPartition_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesAddPartitionMinimumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .energyServices()
            .addPartition("SampleResourceGroupName", "kwwiakkggk", null, com.azure.core.util.Context.NONE);
    }
}
```

### EnergyServices_Create

```java
import com.azure.resourcemanager.oep.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.oep.models.AllowedMethods;
import com.azure.resourcemanager.oep.models.CorsRulesList;
import com.azure.resourcemanager.oep.models.DataPartitionNames;
import com.azure.resourcemanager.oep.models.Encryption;
import com.azure.resourcemanager.oep.models.EnergyServiceProperties;
import com.azure.resourcemanager.oep.models.KeySource;
import com.azure.resourcemanager.oep.models.KeyVaultProperties;
import com.azure.resourcemanager.oep.models.ManagedServiceIdentity;
import com.azure.resourcemanager.oep.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.oep.models.PrivateEndpoint;
import com.azure.resourcemanager.oep.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.oep.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.oep.models.PublicNetworkAccess;
import com.azure.resourcemanager.oep.models.Sku;
import com.azure.resourcemanager.oep.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for EnergyServices Create. */
public final class EnergyServicesCreateSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_Create_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesCreateMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .energyServices()
            .define("flfdlfw")
            .withRegion("us west2")
            .withExistingResourceGroup("SampleResourceGroupName")
            .withTags(mapOf("key7957", "fwqdvx"))
            .withProperties(
                new EnergyServiceProperties()
                    .withAuthAppId("00000000-0000-0000-0000-000000000009")
                    .withDataPartitionNames(Arrays.asList(new DataPartitionNames().withName("sample-dp1")))
                    .withEncryption(
                        new Encryption()
                            .withKeyVaultProperties(
                                new KeyVaultProperties()
                                    .withKeyName("fakeTokenPlaceholder")
                                    .withKeyVersion("fakeTokenPlaceholder")
                                    .withKeyVaultUri("fakeTokenPlaceholder")
                                    .withUserIdentity("syzvgkqssocaftbsebtbesdsawi"))
                            .withKeySource(KeySource.MICROSOFT_KEYVAULT))
                    .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                    .withPrivateEndpointConnections(
                        Arrays
                            .asList(
                                new PrivateEndpointConnectionInner()
                                    .withPrivateEndpoint(new PrivateEndpoint())
                                    .withPrivateLinkServiceConnectionState(
                                        new PrivateLinkServiceConnectionState()
                                            .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                                            .withDescription("sample-description")
                                            .withActionsRequired("rjdoqbgocxanqzjrhligy"))))
                    .withCorsRules(
                        Arrays
                            .asList(
                                new CorsRulesList()
                                    .withAllowedHeaders(Arrays.asList("eiaktpaiivsenfpzgmx"))
                                    .withAllowedMethods(Arrays.asList(AllowedMethods.DELETE))
                                    .withAllowedOrigins(Arrays.asList("yigdbqiyddet"))
                                    .withExposedHeaders(Arrays.asList("bhgcsgafeyej"))
                                    .withMaxAgeInSeconds(0)))
                    .withSku(new Sku().withName("samplesku")))
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.NONE)
                    .withUserAssignedIdentities(mapOf("key9753", new UserAssignedIdentity())))
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

### EnergyServices_Delete

```java
/** Samples for EnergyServices Delete. */
public final class EnergyServicesDeleteSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesDeleteMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager.energyServices().delete("SampleResourceGroupName", "mvvwqx", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesDeleteMinimumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .energyServices()
            .delete("SampleResourceGroupName", "iejsdomjuircytyhxsr", com.azure.core.util.Context.NONE);
    }
}
```

### EnergyServices_GetByResourceGroup

```java
/** Samples for EnergyServices GetByResourceGroup. */
public final class EnergyServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesGetMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .energyServices()
            .getByResourceGroupWithResponse("SampleResourceGroupName", "m", com.azure.core.util.Context.NONE);
    }
}
```

### EnergyServices_List

```java
/** Samples for EnergyServices List. */
public final class EnergyServicesListSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_ListBySubscription_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesListBySubscriptionMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager.energyServices().list(com.azure.core.util.Context.NONE);
    }
}
```

### EnergyServices_ListByResourceGroup

```java
/** Samples for EnergyServices ListByResourceGroup. */
public final class EnergyServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager.energyServices().listByResourceGroup("SampleResourceGroupName", com.azure.core.util.Context.NONE);
    }
}
```

### EnergyServices_ListPartitions

```java
/** Samples for EnergyServices ListPartitions. */
public final class EnergyServicesListPartitionsSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_ListPartitions_MinimumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_ListPartitions_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesListPartitionsMinimumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .energyServices()
            .listPartitionsWithResponse("SampleResourceGroupName", "tuvhh", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_ListPartitions_MaximumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_ListPartitions_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesListPartitionsMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .energyServices()
            .listPartitionsWithResponse("SampleResourceGroupName", "vxoaoyejrlp", com.azure.core.util.Context.NONE);
    }
}
```

### EnergyServices_RemovePartition

```java
import com.azure.resourcemanager.oep.fluent.models.DataPartitionAddOrRemoveRequestInner;
import com.azure.resourcemanager.oep.models.DataPartitionNames;

/** Samples for EnergyServices RemovePartition. */
public final class EnergyServicesRemovePartitionSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_RemovePartition_MaximumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_RemovePartition_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesRemovePartitionMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .energyServices()
            .removePartition(
                "SampleResourceGroupName",
                "esvlmuepbyizqjvswarqgocedjvdi",
                new DataPartitionAddOrRemoveRequestInner().withName(new DataPartitionNames().withName("sample-name")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_RemovePartition_MinimumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_RemovePartition_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesRemovePartitionMinimumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .energyServices()
            .removePartition("SampleResourceGroupName", "dklugyuv", null, com.azure.core.util.Context.NONE);
    }
}
```

### EnergyServices_Update

```java
import com.azure.resourcemanager.oep.models.EnergyService;
import java.util.HashMap;
import java.util.Map;

/** Samples for EnergyServices Update. */
public final class EnergyServicesUpdateSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/EnergyServices_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: EnergyServices_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void energyServicesUpdateMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        EnergyService resource =
            manager
                .energyServices()
                .getByResourceGroupWithResponse(
                    "SampleResourceGroupName", "ozxrnhcbqohcevhnjxvmo", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key9048", "amp")).apply();
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

### Locations_CheckNameAvailability

```java
import com.azure.resourcemanager.oep.models.CheckNameAvailabilityRequest;

/** Samples for Locations CheckNameAvailability. */
public final class LocationsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/Locations_CheckNameAvailability_MaximumSet_Gen.json
     */
    /**
     * Sample code: Locations_CheckNameAvailability_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void locationsCheckNameAvailabilityMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .locations()
            .checkNameAvailabilityWithResponse(
                new CheckNameAvailabilityRequest()
                    .withName("qytbxhilipmtgntssjdfjfmzvhvve")
                    .withType("kfnfnrintouvwgzlhhr"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/Locations_CheckNameAvailability_MinimumSet_Gen.json
     */
    /**
     * Sample code: Locations_CheckNameAvailability_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void locationsCheckNameAvailabilityMinimumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .locations()
            .checkNameAvailabilityWithResponse(new CheckNameAvailabilityRequest(), com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void operationsListMinimumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager.operations().listWithResponse(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void operationsListMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager.operations().listWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnectionProxies_CreateOrUpdate

```java
import com.azure.resourcemanager.oep.models.ConnectionDetails;
import com.azure.resourcemanager.oep.models.GroupConnectivityInformation;
import com.azure.resourcemanager.oep.models.PrivateEndpointConnectionProxyProvisioningState;
import com.azure.resourcemanager.oep.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.oep.models.PrivateLinkServiceConnection;
import com.azure.resourcemanager.oep.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.oep.models.PrivateLinkServiceProxy;
import com.azure.resourcemanager.oep.models.PrivateLinkServiceProxyRemotePrivateEndpointConnection;
import com.azure.resourcemanager.oep.models.RemotePrivateEndpoint;
import java.util.Arrays;

/** Samples for PrivateEndpointConnectionProxies CreateOrUpdate. */
public final class PrivateEndpointConnectionProxiesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnectionProxies_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxies_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionProxiesCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnectionProxies()
            .define("wktlkgpaqpaqwo")
            .withExistingEnergyService("SampleResourceGroupName", "fwfnkwnvtnelpkpvdxdgkcdi")
            .withEtag("alsdtq")
            .withRemotePrivateEndpoint(
                new RemotePrivateEndpoint()
                    .withId("edaqixtleksexhuuwa")
                    .withLocation("nppcovceppoyaqygnjvlfy")
                    .withImmutableSubscriptionId("skjdsabkxpskhxlflo")
                    .withImmutableResourceId("zbbomhmpyxqepmhkmfmuenpv")
                    .withVnetTrafficTag("cgnsacctmfdyxms")
                    .withManualPrivateLinkServiceConnections(
                        Arrays
                            .asList(
                                new PrivateLinkServiceConnection()
                                    .withName("z")
                                    .withGroupIds(Arrays.asList("cyorbzzdrgrjcmtguhlvkhesghtdpv"))
                                    .withRequestMessage("ewzogyffb")))
                    .withPrivateLinkServiceConnections(
                        Arrays
                            .asList(
                                new PrivateLinkServiceConnection()
                                    .withName("z")
                                    .withGroupIds(Arrays.asList("cyorbzzdrgrjcmtguhlvkhesghtdpv"))
                                    .withRequestMessage("ewzogyffb")))
                    .withPrivateLinkServiceProxies(
                        Arrays
                            .asList(
                                new PrivateLinkServiceProxy()
                                    .withId("meyzogdpvqbuwlwzmfkqwe")
                                    .withRemotePrivateLinkServiceConnectionState(
                                        new PrivateLinkServiceConnectionState()
                                            .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                                            .withDescription("sample-description")
                                            .withActionsRequired("rjdoqbgocxanqzjrhligy"))
                                    .withRemotePrivateEndpointConnection(
                                        new PrivateLinkServiceProxyRemotePrivateEndpointConnection()
                                            .withId("hasmouswrdaukifmoibbh"))
                                    .withGroupConnectivityInformation(
                                        Arrays
                                            .asList(
                                                new GroupConnectivityInformation()
                                                    .withGroupId("vpkrvrwqcld")
                                                    .withMemberName("kohoybrjimihpobgsowuruatue")
                                                    .withCustomerVisibleFqdns(Arrays.asList("nywbrldlalyheot"))
                                                    .withInternalFqdn("r")
                                                    .withRedirectMapId("asktymoadhcyz")
                                                    .withPrivateLinkServiceArmRegion("nhn")))))
                    .withConnectionDetails(
                        Arrays
                            .asList(
                                new ConnectionDetails()
                                    .withId("vuttpkufycdaxvaugao")
                                    .withPrivateIpAddress("yzajkmpmsgmi")
                                    .withLinkIdentifier("ncixxzqkpvrxnzibfmfoymaiwstj")
                                    .withGroupId("ibyztivzanxcvrhzxugekifkyinw")
                                    .withMemberName("mvq"))))
            .withStatus("qeukovbzykwihaobznxfkbyrmejhw")
            .withProvisioningState(PrivateEndpointConnectionProxyProvisioningState.SUCCEEDED)
            .create();
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnectionProxies_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxies_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionProxiesCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnectionProxies()
            .define("wktlkgpaqpaqwo")
            .withExistingEnergyService("SampleResourceGroupName", "q")
            .create();
    }
}
```

### PrivateEndpointConnectionProxies_Delete

```java
/** Samples for PrivateEndpointConnectionProxies Delete. */
public final class PrivateEndpointConnectionProxiesDeleteSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnectionProxies_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxies_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionProxiesDeleteMaximumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnectionProxies()
            .delete(
                "SampleResourceGroupName", "usowymfppvlkcllvhqjj", "wktlkgpaqpaqwo", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnectionProxies_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxies_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionProxiesDeleteMinimumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnectionProxies()
            .delete(
                "SampleResourceGroupName", "dcppkkfamelvxnfbzejg", "wktlkgpaqpaqwo", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnectionProxies_Get

```java
/** Samples for PrivateEndpointConnectionProxies Get. */
public final class PrivateEndpointConnectionProxiesGetSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnectionProxies_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxies_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionProxiesGetMaximumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnectionProxies()
            .getWithResponse(
                "SampleResourceGroupName",
                "muyjafkyuulxoxxhsvsqehqadwilf",
                "wktlkgpaqpaqwo",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnectionProxies_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxies_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionProxiesGetMinimumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnectionProxies()
            .getWithResponse(
                "SampleResourceGroupName", "ijcxhzegpqrikxdegjw", "wktlkgpaqpaqwo", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnectionProxies_ListByOakInstance

```java
/** Samples for PrivateEndpointConnectionProxies ListByOakInstance. */
public final class PrivateEndpointConnectionProxiesListByOakInstanceSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnectionProxies_ListByOAKInstance_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxies_ListByOAKInstance_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionProxiesListByOAKInstanceMinimumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnectionProxies()
            .listByOakInstance(
                "SampleResourceGroupName", "ybyivhiuifvsxuvqqxkkitwkslaxk", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnectionProxies_ListByOAKInstance_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxies_ListByOAKInstance_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionProxiesListByOAKInstanceMaximumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnectionProxies()
            .listByOakInstance("SampleResourceGroupName", "qrhi", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnectionProxies_Validate

```java
import com.azure.resourcemanager.oep.fluent.models.PrivateEndpointConnectionProxyInner;
import com.azure.resourcemanager.oep.models.ConnectionDetails;
import com.azure.resourcemanager.oep.models.GroupConnectivityInformation;
import com.azure.resourcemanager.oep.models.PrivateEndpointConnectionProxyProvisioningState;
import com.azure.resourcemanager.oep.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.oep.models.PrivateLinkServiceConnection;
import com.azure.resourcemanager.oep.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.oep.models.PrivateLinkServiceProxy;
import com.azure.resourcemanager.oep.models.PrivateLinkServiceProxyRemotePrivateEndpointConnection;
import com.azure.resourcemanager.oep.models.RemotePrivateEndpoint;
import java.util.Arrays;

/** Samples for PrivateEndpointConnectionProxies Validate. */
public final class PrivateEndpointConnectionProxiesValidateSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnectionProxies_Validate_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxies_Validate_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionProxiesValidateMinimumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnectionProxies()
            .validateWithResponse(
                "SampleResourceGroupName",
                "bmprpj",
                "wktlkgpaqpaqwo",
                new PrivateEndpointConnectionProxyInner(),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnectionProxies_Validate_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxies_Validate_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionProxiesValidateMaximumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnectionProxies()
            .validateWithResponse(
                "SampleResourceGroupName",
                "ubetehk",
                "wktlkgpaqpaqwo",
                new PrivateEndpointConnectionProxyInner()
                    .withEtag("alsdtq")
                    .withRemotePrivateEndpoint(
                        new RemotePrivateEndpoint()
                            .withId("edaqixtleksexhuuwa")
                            .withLocation("nppcovceppoyaqygnjvlfy")
                            .withImmutableSubscriptionId("skjdsabkxpskhxlflo")
                            .withImmutableResourceId("zbbomhmpyxqepmhkmfmuenpv")
                            .withVnetTrafficTag("cgnsacctmfdyxms")
                            .withManualPrivateLinkServiceConnections(
                                Arrays
                                    .asList(
                                        new PrivateLinkServiceConnection()
                                            .withName("z")
                                            .withGroupIds(Arrays.asList("cyorbzzdrgrjcmtguhlvkhesghtdpv"))
                                            .withRequestMessage("ewzogyffb")))
                            .withPrivateLinkServiceConnections(
                                Arrays
                                    .asList(
                                        new PrivateLinkServiceConnection()
                                            .withName("z")
                                            .withGroupIds(Arrays.asList("cyorbzzdrgrjcmtguhlvkhesghtdpv"))
                                            .withRequestMessage("ewzogyffb")))
                            .withPrivateLinkServiceProxies(
                                Arrays
                                    .asList(
                                        new PrivateLinkServiceProxy()
                                            .withId("meyzogdpvqbuwlwzmfkqwe")
                                            .withRemotePrivateLinkServiceConnectionState(
                                                new PrivateLinkServiceConnectionState()
                                                    .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                                                    .withDescription("sample-description")
                                                    .withActionsRequired("rjdoqbgocxanqzjrhligy"))
                                            .withRemotePrivateEndpointConnection(
                                                new PrivateLinkServiceProxyRemotePrivateEndpointConnection()
                                                    .withId("hasmouswrdaukifmoibbh"))
                                            .withGroupConnectivityInformation(
                                                Arrays
                                                    .asList(
                                                        new GroupConnectivityInformation()
                                                            .withGroupId("vpkrvrwqcld")
                                                            .withMemberName("kohoybrjimihpobgsowuruatue")
                                                            .withCustomerVisibleFqdns(Arrays.asList("nywbrldlalyheot"))
                                                            .withInternalFqdn("r")
                                                            .withRedirectMapId("asktymoadhcyz")
                                                            .withPrivateLinkServiceArmRegion("nhn")))))
                            .withConnectionDetails(
                                Arrays
                                    .asList(
                                        new ConnectionDetails()
                                            .withId("vuttpkufycdaxvaugao")
                                            .withPrivateIpAddress("yzajkmpmsgmi")
                                            .withLinkIdentifier("ncixxzqkpvrxnzibfmfoymaiwstj")
                                            .withGroupId("ibyztivzanxcvrhzxugekifkyinw")
                                            .withMemberName("mvq"))))
                    .withStatus("qeukovbzykwihaobznxfkbyrmejhw")
                    .withProvisioningState(PrivateEndpointConnectionProxyProvisioningState.SUCCEEDED),
                com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_CreateOrUpdate

```java
import com.azure.resourcemanager.oep.models.PrivateEndpoint;
import com.azure.resourcemanager.oep.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.oep.models.PrivateLinkServiceConnectionState;

/** Samples for PrivateEndpointConnections CreateOrUpdate. */
public final class PrivateEndpointConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnections_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnections_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionsCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnections()
            .define("rytifznqx")
            .withExistingEnergyService("SampleResourceGroupName", "jbkkokzmxbcw")
            .withPrivateEndpoint(new PrivateEndpoint())
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState()
                    .withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                    .withDescription("sample-description")
                    .withActionsRequired("rjdoqbgocxanqzjrhligy"))
            .create();
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnections_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnections_CreateOrUpdate_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionsCreateOrUpdateMinimumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnections()
            .define("rytifznqx")
            .withExistingEnergyService("SampleResourceGroupName", "jefzeklvzhtonflciwerhhn")
            .create();
    }
}
```

### PrivateEndpointConnections_Delete

```java
/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnections_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionsDeleteMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnections()
            .delete("SampleResourceGroupName", "wyqf", "rytifznqx", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnections_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionsDeleteMinimumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnections()
            .delete("SampleResourceGroupName", "qmfthknvepqvjxduvqh", "rytifznqx", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_Get

```java
/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnections_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionsGetMinimumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse("SampleResourceGroupName", "p", "rytifznqx", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnections_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionsGetMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse("SampleResourceGroupName", "pgg", "rytifznqx", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_ListByOakInstance

```java
/** Samples for PrivateEndpointConnections ListByOakInstance. */
public final class PrivateEndpointConnectionsListByOakInstanceSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnections_ListByOAKInstance_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnections_ListByOAKInstance_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionsListByOAKInstanceMaximumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnections()
            .listByOakInstance("SampleResourceGroupName", "cmq", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateEndpointConnections_ListByOAKInstance_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateEndpointConnections_ListByOAKInstance_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateEndpointConnectionsListByOAKInstanceMinimumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateEndpointConnections()
            .listByOakInstance("SampleResourceGroupName", "u", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_Get

```java
/** Samples for PrivateLinkResources Get. */
public final class PrivateLinkResourcesGetSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateLinkResources_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateLinkResources_Get_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateLinkResourcesGetMinimumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateLinkResources()
            .getWithResponse(
                "SampleResourceGroupName",
                "sxbprnohcwqxlskr",
                "ksvwyvgxtkcjjiucgzgpxipezwccvq",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateLinkResources_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateLinkResources_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateLinkResourcesGetMaximumSetGen(com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateLinkResources()
            .getWithResponse(
                "SampleResourceGroupName",
                "ngdafjqhugrbvfzrnwznj",
                "ksvwyvgxtkcjjiucgzgpxipezwccvq",
                com.azure.core.util.Context.NONE);
    }
}
```

### PrivateLinkResources_ListByOakInstance

```java
/** Samples for PrivateLinkResources ListByOakInstance. */
public final class PrivateLinkResourcesListByOakInstanceSamples {
    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateLinkResources_ListByOAKInstance_MaximumSet_Gen.json
     */
    /**
     * Sample code: PrivateLinkResources_ListByOAKInstance_MaximumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateLinkResourcesListByOAKInstanceMaximumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateLinkResources()
            .listByOakInstance("SampleResourceGroupName", "ojmvnowqyn", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/oep/resource-manager/Microsoft.OpenEnergyPlatform/stable/2023-06-12/examples/PrivateLinkResources_ListByOAKInstance_MinimumSet_Gen.json
     */
    /**
     * Sample code: PrivateLinkResources_ListByOAKInstance_MinimumSet_Gen.
     *
     * @param manager Entry point to OepManager.
     */
    public static void privateLinkResourcesListByOAKInstanceMinimumSetGen(
        com.azure.resourcemanager.oep.OepManager manager) {
        manager
            .privateLinkResources()
            .listByOakInstance("SampleResourceGroupName", "lusicrgwozrvb", com.azure.core.util.Context.NONE);
    }
}
```

