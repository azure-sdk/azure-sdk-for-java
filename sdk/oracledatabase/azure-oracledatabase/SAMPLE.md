# Code snippets and samples


## AutonomousDatabaseBackups

- [Update](#autonomousdatabasebackups_update)

## AutonomousDatabases

- [ChangeDisasterRecoveryConfiguration](#autonomousdatabases_changedisasterrecoveryconfiguration)
- [Failover](#autonomousdatabases_failover)
- [GenerateWallet](#autonomousdatabases_generatewallet)
- [Restore](#autonomousdatabases_restore)
- [Switchover](#autonomousdatabases_switchover)

## CloudExadataInfrastructures

- [AddStorageCapacity](#cloudexadatainfrastructures_addstoragecapacity)

## CloudVmClusters

- [AddVms](#cloudvmclusters_addvms)
- [ListPrivateIpAddresses](#cloudvmclusters_listprivateipaddresses)
- [RemoveVms](#cloudvmclusters_removevms)

## DbNodes

- [Action](#dbnodes_action)

## DbSystemShapes

- [ListByLocation](#dbsystemshapes_listbylocation)

## ExadbVmClusters

- [RemoveVms](#exadbvmclusters_removevms)

## ExascaleDbNodes

- [Action](#exascaledbnodes_action)
- [ListByParent](#exascaledbnodes_listbyparent)

## ExascaleDbStorageVaults

- [Create](#exascaledbstoragevaults_create)
- [Delete](#exascaledbstoragevaults_delete)
- [GetByResourceGroup](#exascaledbstoragevaults_getbyresourcegroup)
- [List](#exascaledbstoragevaults_list)
- [ListByResourceGroup](#exascaledbstoragevaults_listbyresourcegroup)
- [Update](#exascaledbstoragevaults_update)

## FlexComponents

- [Get](#flexcomponents_get)
- [ListByParent](#flexcomponents_listbyparent)

## GiMinorVersions

- [Get](#giminorversions_get)
- [ListByParent](#giminorversions_listbyparent)

## GiVersions

- [ListByLocation](#giversions_listbylocation)

## Operations

- [List](#operations_list)

## OracleSubscriptions

- [AddAzureSubscriptions](#oraclesubscriptions_addazuresubscriptions)
- [ListActivationLinks](#oraclesubscriptions_listactivationlinks)
- [ListCloudAccountDetails](#oraclesubscriptions_listcloudaccountdetails)
- [ListSaasSubscriptionDetails](#oraclesubscriptions_listsaassubscriptiondetails)
- [Update](#oraclesubscriptions_update)
### AutonomousDatabaseBackups_Update

```java
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import oracle.database.models.ExascaleDbStorageInputDetails;
import oracle.database.models.ExascaleDbStorageVaultProperties;

/**
 * Samples for ExascaleDbStorageVaults Create.
 */
public final class ExascaleDbStorageVaultsCreateSamples {
    /*
     * x-ms-original-file: 2025-03-01/ExascaleDbStorageVaults_Create_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExascaleDbStorageVaults_Create_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void exascaleDbStorageVaultsCreateMaximumSet(oracle.database.DatabaseManager manager) {
        manager.exascaleDbStorageVaults()
            .define("vmClusterName")
            .withRegion("ltguhzffucaytqg")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf("key7827", "fakeTokenPlaceholder"))
            .withProperties(new ExascaleDbStorageVaultProperties().withAdditionalFlashCacheInPercent(0)
                .withDescription("dmnvnnduldfmrmkkvvsdtuvmsmruxzzpsfdydgytlckutfozephjygjetrauvbdfcwmti")
                .withDisplayName(
                    "hbsybtelyvhpalemszcvartlhwvskrnpiveqfblvkdihoytqaotdgsgauvgivzaftfgeiwlyeqzssicwrrnlxtsmeakbcsxabjlt")
                .withHighCapacityDatabaseStorageInput(new ExascaleDbStorageInputDetails().withTotalSizeInGbs(21))
                .withTimeZone(
                    "ltrbozwxjunncicrtzjrpqnqrcjgghohztrdlbfjrbkpenopyldwolslwgrgumjfkyovvkzcuxjujuxtjjzubvqvnhrswnbdgcbslopeofmtepbrrlymqwwszvsglmyuvlcuejshtpokirwklnwpcykhyinjmlqvxtyixlthtdishhmtipbygsayvgqzfrprgppylydlcskbmvwctxifdltippfvsxiughqbojqpqrekxsotnqsk"))
            .withZones(Arrays.asList("qk"))
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

### AutonomousDatabases_ChangeDisasterRecoveryConfiguration

```java
/**
 * Samples for ExascaleDbStorageVaults GetByResourceGroup.
 */
public final class ExascaleDbStorageVaultsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-03-01/ExascaleDbStorageVaults_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExascaleDbStorageVaults_Get_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void exascaleDbStorageVaultsGetMaximumSet(oracle.database.DatabaseManager manager) {
        manager.exascaleDbStorageVaults()
            .getByResourceGroupWithResponse("rgopenapi", "vmClusterName", com.azure.core.util.Context.NONE);
    }
}
```

### AutonomousDatabases_Failover

```java
/**
 * Samples for ExascaleDbStorageVaults ListByResourceGroup.
 */
public final class ExascaleDbStorageVaultsListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-03-01/ExascaleDbStorageVaults_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExascaleDbStorageVaults_ListByResourceGroup_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void exascaleDbStorageVaultsListByResourceGroupMaximumSet(oracle.database.DatabaseManager manager) {
        manager.exascaleDbStorageVaults().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### AutonomousDatabases_GenerateWallet

```java
/**
 * Samples for OracleSubscriptions ListSaasSubscriptionDetails.
 */
public final class OracleSubscriptionsListSaasSubscriptionDetailsSamples {
    /*
     * x-ms-original-file: 2025-03-01/oracleSubscriptions_listSaasSubscriptionDetails.json
     */
    /**
     * Sample code: OracleSubscriptions_listSaasSubscriptionDetails.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void oracleSubscriptionsListSaasSubscriptionDetails(oracle.database.DatabaseManager manager) {
        manager.oracleSubscriptions().listSaasSubscriptionDetails(com.azure.core.util.Context.NONE);
    }
}
```

### AutonomousDatabases_Restore

```java
import oracle.database.models.DisasterRecoveryConfigurationDetails;
import oracle.database.models.DisasterRecoveryType;

/**
 * Samples for AutonomousDatabases ChangeDisasterRecoveryConfiguration.
 */
public final class AutonomousDatabasesChangeDisasterRecoveryConfigurationSamples {
    /*
     * x-ms-original-file: 2025-03-01/autonomousDatabase_changeDisasterRecoveryConfiguration.json
     */
    /**
     * Sample code: AutonomousDatabases_ChangeDisasterRecoveryConfiguration.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void autonomousDatabasesChangeDisasterRecoveryConfiguration(oracle.database.DatabaseManager manager) {
        manager.autonomousDatabases()
            .changeDisasterRecoveryConfiguration("rg000", "databasedb1",
                new DisasterRecoveryConfigurationDetails().withDisasterRecoveryType(DisasterRecoveryType.ADG)
                    .withIsReplicateAutomaticBackups(false),
                com.azure.core.util.Context.NONE);
    }
}
```

### AutonomousDatabases_Switchover

```java
import oracle.database.models.PrivateIpAddressesFilter;

/**
 * Samples for CloudVmClusters ListPrivateIpAddresses.
 */
public final class CloudVmClustersListPrivateIpAddressesSamples {
    /*
     * x-ms-original-file: 2025-03-01/vmClusters_listPrivateIpAddresses.json
     */
    /**
     * Sample code: CloudVmClusters_listPrivateIpAddresses.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void cloudVmClustersListPrivateIpAddresses(oracle.database.DatabaseManager manager) {
        manager.cloudVmClusters()
            .listPrivateIpAddressesWithResponse("rg000", "cluster1",
                new PrivateIpAddressesFilter().withSubnetId("ocid1..aaaaaa").withVnicId("ocid1..aaaaa"),
                com.azure.core.util.Context.NONE);
    }
}
```

### CloudExadataInfrastructures_AddStorageCapacity

```java
import java.time.OffsetDateTime;
import oracle.database.models.RestoreAutonomousDatabaseDetails;

/**
 * Samples for AutonomousDatabases Restore.
 */
public final class AutonomousDatabasesRestoreSamples {
    /*
     * x-ms-original-file: 2025-03-01/autonomousDatabase_restore.json
     */
    /**
     * Sample code: AutonomousDatabases_Restore.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void autonomousDatabasesRestore(oracle.database.DatabaseManager manager) {
        manager.autonomousDatabases()
            .restore("rg000", "databasedb1",
                new RestoreAutonomousDatabaseDetails().withTimestamp(OffsetDateTime.parse("2024-04-23T00:00:00.000Z")),
                com.azure.core.util.Context.NONE);
    }
}
```

### CloudVmClusters_AddVms

```java
/**
 * Samples for DbSystemShapes ListByLocation.
 */
public final class DbSystemShapesListByLocationSamples {
    /*
     * x-ms-original-file: 2025-03-01/dbSystemShapes_listByLocation.json
     */
    /**
     * Sample code: DbSystemShapes_listByLocation.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void dbSystemShapesListByLocation(oracle.database.DatabaseManager manager) {
        manager.dbSystemShapes().listByLocation("eastus", null, com.azure.core.util.Context.NONE);
    }
}
```

### CloudVmClusters_ListPrivateIpAddresses

```java
import java.util.Arrays;
import oracle.database.models.AddRemoveDbNode;

/**
 * Samples for CloudVmClusters RemoveVms.
 */
public final class CloudVmClustersRemoveVmsSamples {
    /*
     * x-ms-original-file: 2025-03-01/vmClusters_removeVms.json
     */
    /**
     * Sample code: CloudVmClusters_removeVms.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void cloudVmClustersRemoveVms(oracle.database.DatabaseManager manager) {
        manager.cloudVmClusters()
            .removeVms("rg000", "cluster1", new AddRemoveDbNode().withDbServers(Arrays.asList("ocid1..aaaa")),
                com.azure.core.util.Context.NONE);
    }
}
```

### CloudVmClusters_RemoveVms

```java
import oracle.database.models.SystemShapes;

/**
 * Samples for FlexComponents ListByParent.
 */
public final class FlexComponentsListByParentSamples {
    /*
     * x-ms-original-file: 2025-03-01/FlexComponents_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: FlexComponents_ListByParent_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void flexComponentsListByParentMaximumSet(oracle.database.DatabaseManager manager) {
        manager.flexComponents().listByParent("eastus", SystemShapes.EXADATA_X11M, com.azure.core.util.Context.NONE);
    }
}
```

### DbNodes_Action

```java
/**
 * Samples for OracleSubscriptions ListActivationLinks.
 */
public final class OracleSubscriptionsListActivationLinksSamples {
    /*
     * x-ms-original-file: 2025-03-01/oracleSubscriptions_listActivationLinks.json
     */
    /**
     * Sample code: OracleSubscriptions_listActivationLinks.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void oracleSubscriptionsListActivationLinks(oracle.database.DatabaseManager manager) {
        manager.oracleSubscriptions().listActivationLinks(com.azure.core.util.Context.NONE);
    }
}
```

### DbSystemShapes_ListByLocation

```java
import oracle.database.models.DbNodeAction;
import oracle.database.models.DbNodeActionEnum;

/**
 * Samples for DbNodes Action.
 */
public final class DbNodesActionSamples {
    /*
     * x-ms-original-file: 2025-03-01/dbNodes_action.json
     */
    /**
     * Sample code: DbNodes_Action.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void dbNodesAction(oracle.database.DatabaseManager manager) {
        manager.dbNodes()
            .action("rg000", "cluster1", "ocid1....aaaaaa", new DbNodeAction().withAction(DbNodeActionEnum.START),
                com.azure.core.util.Context.NONE);
    }
}
```

### ExadbVmClusters_RemoveVms

```java
/**
 * Samples for ExascaleDbStorageVaults Delete.
 */
public final class ExascaleDbStorageVaultsDeleteSamples {
    /*
     * x-ms-original-file: 2025-03-01/ExascaleDbStorageVaults_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExascaleDbStorageVaults_Delete_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void exascaleDbStorageVaultsDeleteMaximumSet(oracle.database.DatabaseManager manager) {
        manager.exascaleDbStorageVaults().delete("rgopenapi", "vmClusterName", com.azure.core.util.Context.NONE);
    }
}
```

### ExascaleDbNodes_Action

```java
import oracle.database.models.SystemShapes;

/**
 * Samples for GiVersions ListByLocation.
 */
public final class GiVersionsListByLocationSamples {
    /*
     * x-ms-original-file: 2025-03-01/GiVersions_ListByLocation_MaximumSet_Gen.json
     */
    /**
     * Sample code: List GiVersions by location - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void listGiVersionsByLocationGeneratedByMaximumSetRule(oracle.database.DatabaseManager manager) {
        manager.giVersions()
            .listByLocation("eastus", SystemShapes.fromString(
                "osixsklyaauhoqnkxvnvsqeqenhzogntqnpubldrrfvqncwetdtwqwjjcvspwhgecbimdlulwcubikebrdzmidrucgtsuqvytkqutmbyrvvyioxpocpmuwiivyanjzucaegihztluuvpznzaoakfsselumhhsvrtrbzwpjhcihsvyouonlxdluwhqfxoqvgthkaxppbydtqjntscgzbivfdcaobbkthrbdjwpejirqmbly"),
                null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2025-03-01/GiVersions_ListByLocation_MinimumSet_Gen.json
     */
    /**
     * Sample code: List GiVersions by location - generated by [MinimumSet] rule.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void listGiVersionsByLocationGeneratedByMinimumSetRule(oracle.database.DatabaseManager manager) {
        manager.giVersions().listByLocation("eastus", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### ExascaleDbNodes_ListByParent

```java
import oracle.database.models.ShapeFamily;

/**
 * Samples for GiMinorVersions ListByParent.
 */
public final class GiMinorVersionsListByParentSamples {
    /*
     * x-ms-original-file: 2025-03-01/GiMinorVersions_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: GiMinorVersions_ListByParent_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void giMinorVersionsListByParentMaximumSet(oracle.database.DatabaseManager manager) {
        manager.giMinorVersions()
            .listByParent("eastus", "giVersionName", ShapeFamily.fromString("rtfcosvtlpeeqoicsjqggtgc"), null,
                com.azure.core.util.Context.NONE);
    }
}
```

### ExascaleDbStorageVaults_Create

```java
import oracle.database.models.PeerDbDetails;

/**
 * Samples for AutonomousDatabases Failover.
 */
public final class AutonomousDatabasesFailoverSamples {
    /*
     * x-ms-original-file: 2025-03-01/autonomousDatabase_failover.json
     */
    /**
     * Sample code: AutonomousDatabases_Failover.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void autonomousDatabasesFailover(oracle.database.DatabaseManager manager) {
        manager.autonomousDatabases()
            .failover("rg000", "databasedb1", new PeerDbDetails().withPeerDbId("peerDbId"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ExascaleDbStorageVaults_Delete

```java
import oracle.database.models.AutonomousDatabaseBackup;

/**
 * Samples for AutonomousDatabaseBackups Update.
 */
public final class AutonomousDatabaseBackupsUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01/autonomousDatabaseBackup_patch.json
     */
    /**
     * Sample code: AutonomousDatabaseBackups_Update.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void autonomousDatabaseBackupsUpdate(oracle.database.DatabaseManager manager) {
        AutonomousDatabaseBackup resource = manager.autonomousDatabaseBackups()
            .getWithResponse("rg000", "databasedb1", "1711644130", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### ExascaleDbStorageVaults_GetByResourceGroup

```java
import java.util.Arrays;
import oracle.database.models.AzureSubscriptions;

/**
 * Samples for OracleSubscriptions AddAzureSubscriptions.
 */
public final class OracleSubscriptionsAddAzureSubscriptionsSamples {
    /*
     * x-ms-original-file: 2025-03-01/oracleSubscriptions_addAzureSubscriptions.json
     */
    /**
     * Sample code: OracleSubscriptions_addAzureSubscriptions.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void oracleSubscriptionsAddAzureSubscriptions(oracle.database.DatabaseManager manager) {
        manager.oracleSubscriptions()
            .addAzureSubscriptions(new AzureSubscriptions().withAzureSubscriptionIds(
                Arrays.asList("00000000-0000-0000-0000-000000000001")), com.azure.core.util.Context.NONE);
    }
}
```

### ExascaleDbStorageVaults_List

```java
import oracle.database.models.PeerDbDetails;

/**
 * Samples for AutonomousDatabases Switchover.
 */
public final class AutonomousDatabasesSwitchoverSamples {
    /*
     * x-ms-original-file: 2025-03-01/autonomousDatabase_switchover.json
     */
    /**
     * Sample code: AutonomousDatabases_Switchover.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void autonomousDatabasesSwitchover(oracle.database.DatabaseManager manager) {
        manager.autonomousDatabases()
            .switchover("rg000", "databasedb1", new PeerDbDetails().withPeerDbId("peerDbId"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ExascaleDbStorageVaults_ListByResourceGroup

```java
import java.util.Arrays;
import oracle.database.models.DbNodeDetails;
import oracle.database.models.RemoveVirtualMachineFromExadbVmClusterDetails;

/**
 * Samples for ExadbVmClusters RemoveVms.
 */
public final class ExadbVmClustersRemoveVmsSamples {
    /*
     * x-ms-original-file: 2025-03-01/ExadbVmClusters_RemoveVms_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExadbVmClusters_RemoveVms_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void exadbVmClustersRemoveVmsMaximumSet(oracle.database.DatabaseManager manager) {
        manager.exadbVmClusters()
            .removeVms("rgopenapi", "vmClusterName", new RemoveVirtualMachineFromExadbVmClusterDetails()
                .withDbNodes(Arrays.asList(new DbNodeDetails().withDbNodeId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Oracle.Database/exadbVmClusters/vmCluster/dbNodes/dbNodeName"))),
                com.azure.core.util.Context.NONE);
    }
}
```

### ExascaleDbStorageVaults_Update

```java
import oracle.database.models.DbNodeAction;
import oracle.database.models.DbNodeActionEnum;

/**
 * Samples for ExascaleDbNodes Action.
 */
public final class ExascaleDbNodesActionSamples {
    /*
     * x-ms-original-file: 2025-03-01/ExascaleDbNodes_Action_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExascaleDbNodes_Action_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void exascaleDbNodesActionMaximumSet(oracle.database.DatabaseManager manager) {
        manager.exascaleDbNodes()
            .action("rgopenapi", "vmClusterName", "dbNodeName", new DbNodeAction().withAction(DbNodeActionEnum.START),
                com.azure.core.util.Context.NONE);
    }
}
```

### FlexComponents_Get

```java
import oracle.database.models.OracleSubscriptionUpdate;

/**
 * Samples for OracleSubscriptions Update.
 */
public final class OracleSubscriptionsUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01/oracleSubscriptions_patch.json
     */
    /**
     * Sample code: OracleSubscriptions_update.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void oracleSubscriptionsUpdate(oracle.database.DatabaseManager manager) {
        manager.oracleSubscriptions().update(new OracleSubscriptionUpdate(), com.azure.core.util.Context.NONE);
    }
}
```

### FlexComponents_ListByParent

```java
/**
 * Samples for OracleSubscriptions ListCloudAccountDetails.
 */
public final class OracleSubscriptionsListCloudAccountDetailsSamples {
    /*
     * x-ms-original-file: 2025-03-01/oracleSubscriptions_listCloudAccountDetails.json
     */
    /**
     * Sample code: OracleSubscriptions_listCloudAccountDetails.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void oracleSubscriptionsListCloudAccountDetails(oracle.database.DatabaseManager manager) {
        manager.oracleSubscriptions().listCloudAccountDetails(com.azure.core.util.Context.NONE);
    }
}
```

### GiMinorVersions_Get

```java
/**
 * Samples for ExascaleDbStorageVaults List.
 */
public final class ExascaleDbStorageVaultsListSamples {
    /*
     * x-ms-original-file: 2025-03-01/ExascaleDbStorageVaults_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExascaleDbStorageVaults_ListBySubscription_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void exascaleDbStorageVaultsListBySubscriptionMaximumSet(oracle.database.DatabaseManager manager) {
        manager.exascaleDbStorageVaults().list(com.azure.core.util.Context.NONE);
    }
}
```

### GiMinorVersions_ListByParent

```java
/**
 * Samples for CloudExadataInfrastructures AddStorageCapacity.
 */
public final class CloudExadataInfrastructuresAddStorageCapacitySamples {
    /*
     * x-ms-original-file: 2025-03-01/exaInfra_addStorageCapacity.json
     */
    /**
     * Sample code: CloudExadataInfrastructures_addStorageCapacity.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void cloudExadataInfrastructuresAddStorageCapacity(oracle.database.DatabaseManager manager) {
        manager.cloudExadataInfrastructures().addStorageCapacity("rg000", "infra1", com.azure.core.util.Context.NONE);
    }
}
```

### GiVersions_ListByLocation

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2025-03-01/operations_list.json
     */
    /**
     * Sample code: Operations_list.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void operationsList(oracle.database.DatabaseManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
import oracle.database.models.GenerateAutonomousDatabaseWalletDetails;
import oracle.database.models.GenerateType;

/**
 * Samples for AutonomousDatabases GenerateWallet.
 */
public final class AutonomousDatabasesGenerateWalletSamples {
    /*
     * x-ms-original-file: 2025-03-01/autonomousDatabase_generateWallet.json
     */
    /**
     * Sample code: AutonomousDatabases_generateWallet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void autonomousDatabasesGenerateWallet(oracle.database.DatabaseManager manager) {
        manager.autonomousDatabases()
            .generateWalletWithResponse("rg000", "databasedb1",
                new GenerateAutonomousDatabaseWalletDetails().withGenerateType(GenerateType.SINGLE)
                    .withIsRegional(false)
                    .withPassword("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
```

### OracleSubscriptions_AddAzureSubscriptions

```java
import java.util.Arrays;
import oracle.database.models.AddRemoveDbNode;

/**
 * Samples for CloudVmClusters AddVms.
 */
public final class CloudVmClustersAddVmsSamples {
    /*
     * x-ms-original-file: 2025-03-01/vmClusters_addVms.json
     */
    /**
     * Sample code: CloudVmClusters_addVms.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void cloudVmClustersAddVms(oracle.database.DatabaseManager manager) {
        manager.cloudVmClusters()
            .addVms("rg000", "cluster1",
                new AddRemoveDbNode().withDbServers(Arrays.asList("ocid1..aaaa", "ocid1..aaaaaa")),
                com.azure.core.util.Context.NONE);
    }
}
```

### OracleSubscriptions_ListActivationLinks

```java
import java.util.HashMap;
import java.util.Map;
import oracle.database.models.ExascaleDbStorageVault;

/**
 * Samples for ExascaleDbStorageVaults Update.
 */
public final class ExascaleDbStorageVaultsUpdateSamples {
    /*
     * x-ms-original-file: 2025-03-01/ExascaleDbStorageVaults_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExascaleDbStorageVaults_Update_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void exascaleDbStorageVaultsUpdateMaximumSet(oracle.database.DatabaseManager manager) {
        ExascaleDbStorageVault resource = manager.exascaleDbStorageVaults()
            .getByResourceGroupWithResponse("rgopenapi", "vmClusterName", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("key6179", "fakeTokenPlaceholder")).apply();
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

### OracleSubscriptions_ListCloudAccountDetails

```java
/**
 * Samples for FlexComponents Get.
 */
public final class FlexComponentsGetSamples {
    /*
     * x-ms-original-file: 2025-03-01/FlexComponents_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: FlexComponents_Get_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void flexComponentsGetMaximumSet(oracle.database.DatabaseManager manager) {
        manager.flexComponents().getWithResponse("eastus", "flexComponent", com.azure.core.util.Context.NONE);
    }
}
```

### OracleSubscriptions_ListSaasSubscriptionDetails

```java
/**
 * Samples for GiMinorVersions Get.
 */
public final class GiMinorVersionsGetSamples {
    /*
     * x-ms-original-file: 2025-03-01/GiMinorVersions_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: GiMinorVersions_Get_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void giMinorVersionsGetMaximumSet(oracle.database.DatabaseManager manager) {
        manager.giMinorVersions()
            .getWithResponse("eastus", "giVersionName", "giMinorVersionName", com.azure.core.util.Context.NONE);
    }
}
```

### OracleSubscriptions_Update

```java
/**
 * Samples for ExascaleDbNodes ListByParent.
 */
public final class ExascaleDbNodesListByParentSamples {
    /*
     * x-ms-original-file: 2025-03-01/ExascaleDbNodes_ListByParent_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExascaleDbNodes_ListByParent_MaximumSet.
     * 
     * @param manager Entry point to DatabaseManager.
     */
    public static void exascaleDbNodesListByParentMaximumSet(oracle.database.DatabaseManager manager) {
        manager.exascaleDbNodes().listByParent("rgopenapi", "vmClusterName", com.azure.core.util.Context.NONE);
    }
}
```

