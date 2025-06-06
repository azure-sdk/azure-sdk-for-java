// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.resourcemanager.postgresqlflexibleserver.models.ActiveDirectoryAuthEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ArmServerKeyType;
import com.azure.resourcemanager.postgresqlflexibleserver.models.AuthConfig;
import com.azure.resourcemanager.postgresqlflexibleserver.models.AzureManagedDiskPerformanceTiers;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Backup;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Cluster;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CreateMode;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DataEncryption;
import com.azure.resourcemanager.postgresqlflexibleserver.models.GeoRedundantBackupEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HighAvailability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.HighAvailabilityMode;
import com.azure.resourcemanager.postgresqlflexibleserver.models.IdentityType;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Network;
import com.azure.resourcemanager.postgresqlflexibleserver.models.PasswordAuthEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerPublicNetworkAccessState;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerVersion;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Sku;
import com.azure.resourcemanager.postgresqlflexibleserver.models.SkuTier;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Storage;
import com.azure.resourcemanager.postgresqlflexibleserver.models.StorageAutoGrow;
import com.azure.resourcemanager.postgresqlflexibleserver.models.UserAssignedIdentity;
import com.azure.resourcemanager.postgresqlflexibleserver.models.UserIdentity;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Servers Create.
 */
public final class ServersCreateSamples {
    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * ServerCreateWithDataEncryptionEnabled.json
     */
    /**
     * Sample code: ServerCreateWithDataEncryptionEnabled.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void serverCreateWithDataEncryptionEnabled(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.servers()
            .define("pgtestsvc4")
            .withRegion("westus")
            .withExistingResourceGroup("testrg")
            .withSku(new Sku().withName("Standard_D4ds_v5").withTier(SkuTier.GENERAL_PURPOSE))
            .withIdentity(new UserAssignedIdentity().withUserAssignedIdentities(mapOf(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testresourcegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-usermanagedidentity",
                new UserIdentity())).withType(IdentityType.USER_ASSIGNED))
            .withAdministratorLogin("login")
            .withAdministratorLoginPassword("Password1")
            .withVersion(ServerVersion.ONE_SIX)
            .withStorage(new Storage().withStorageSizeGB(512)
                .withAutoGrow(StorageAutoGrow.DISABLED)
                .withTier(AzureManagedDiskPerformanceTiers.P20))
            .withDataEncryption(new DataEncryption().withPrimaryKeyUri("fakeTokenPlaceholder")
                .withPrimaryUserAssignedIdentityId(
                    "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testresourcegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-usermanagedidentity")
                .withGeoBackupKeyUri("fakeTokenPlaceholder")
                .withGeoBackupUserAssignedIdentityId("")
                .withType(ArmServerKeyType.AZURE_KEY_VAULT))
            .withBackup(new Backup().withBackupRetentionDays(7).withGeoRedundantBackup(GeoRedundantBackupEnum.DISABLED))
            .withNetwork(new Network().withDelegatedSubnetResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/test-vnet-subnet")
                .withPrivateDnsZoneArmResourceId(
                    "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourcegroups/testrg/providers/Microsoft.Network/privateDnsZones/test-private-dns-zone.postgres.database.azure.com"))
            .withHighAvailability(new HighAvailability().withMode(HighAvailabilityMode.ZONE_REDUNDANT))
            .withAvailabilityZone("1")
            .withCreateMode(CreateMode.CREATE)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * ServerCreateReviveDropped.json
     */
    /**
     * Sample code: ServerCreateReviveDropped.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void
        serverCreateReviveDropped(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.servers()
            .define("pgtestsvc5-rev")
            .withRegion("westus")
            .withExistingResourceGroup("testrg")
            .withSourceServerResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.DBforPostgreSQL/flexibleServers/pgtestsvc5")
            .withPointInTimeUtc(OffsetDateTime.parse("2023-04-27T00:04:59.4078005+00:00"))
            .withCreateMode(CreateMode.REVIVE_DROPPED)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * ServerCreateGeoRestoreWithDataEncryptionEnabled.json
     */
    /**
     * Sample code: Create a database as a geo-restore in geo-paired location.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void createADatabaseAsAGeoRestoreInGeoPairedLocation(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.servers()
            .define("pgtestsvc5geo")
            .withRegion("eastus")
            .withExistingResourceGroup("testrg")
            .withIdentity(new UserAssignedIdentity().withUserAssignedIdentities(mapOf(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testresourcegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-geo-usermanagedidentity",
                new UserIdentity(),
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testresourcegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-usermanagedidentity",
                new UserIdentity())).withType(IdentityType.USER_ASSIGNED))
            .withDataEncryption(new DataEncryption().withPrimaryKeyUri("fakeTokenPlaceholder")
                .withPrimaryUserAssignedIdentityId(
                    "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testresourcegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-usermanagedidentity")
                .withGeoBackupKeyUri("fakeTokenPlaceholder")
                .withGeoBackupUserAssignedIdentityId(
                    "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testresourcegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-geo-usermanagedidentity")
                .withType(ArmServerKeyType.AZURE_KEY_VAULT))
            .withSourceServerResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.DBforPostgreSQL/flexibleServers/sourcepgservername")
            .withPointInTimeUtc(OffsetDateTime.parse("2021-06-27T00:04:59.4078005+00:00"))
            .withCreateMode(CreateMode.GEO_RESTORE)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * ServerCreate.json
     */
    /**
     * Sample code: Create a new server.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void createANewServer(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.servers()
            .define("testpgflex")
            .withRegion("eastus")
            .withExistingResourceGroup("testrg")
            .withTags(mapOf("VNetServer", "1"))
            .withSku(new Sku().withName("Standard_D4ds_v5").withTier(SkuTier.GENERAL_PURPOSE))
            .withAdministratorLogin("login")
            .withAdministratorLoginPassword("Password1")
            .withVersion(ServerVersion.ONE_SIX)
            .withStorage(new Storage().withStorageSizeGB(512)
                .withAutoGrow(StorageAutoGrow.DISABLED)
                .withTier(AzureManagedDiskPerformanceTiers.P20))
            .withBackup(new Backup().withBackupRetentionDays(7).withGeoRedundantBackup(GeoRedundantBackupEnum.ENABLED))
            .withNetwork(new Network().withDelegatedSubnetResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/test-subnet")
                .withPrivateDnsZoneArmResourceId(
                    "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.Network/privateDnsZones/testpgflex.private.postgres.database"))
            .withHighAvailability(new HighAvailability().withMode(HighAvailabilityMode.ZONE_REDUNDANT))
            .withAvailabilityZone("1")
            .withCreateMode(CreateMode.CREATE)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * ServerCreateWithMicrosoftEntraEnabled.json
     */
    /**
     * Sample code: Create a new server with Microsoft Entra authentication enabled.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void createANewServerWithMicrosoftEntraAuthenticationEnabled(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.servers()
            .define("pgtestsvc4")
            .withRegion("westus")
            .withExistingResourceGroup("testrg")
            .withTags(mapOf("ElasticServer", "1"))
            .withSku(new Sku().withName("Standard_D4ds_v5").withTier(SkuTier.GENERAL_PURPOSE))
            .withAdministratorLogin("login")
            .withAdministratorLoginPassword("Password1")
            .withVersion(ServerVersion.ONE_SIX)
            .withStorage(new Storage().withStorageSizeGB(512)
                .withAutoGrow(StorageAutoGrow.DISABLED)
                .withTier(AzureManagedDiskPerformanceTiers.P20))
            .withAuthConfig(new AuthConfig().withActiveDirectoryAuth(ActiveDirectoryAuthEnum.ENABLED)
                .withPasswordAuth(PasswordAuthEnum.ENABLED)
                .withTenantId("tttttt-tttt-tttt-tttt-tttttttttttt"))
            .withDataEncryption(new DataEncryption().withType(ArmServerKeyType.SYSTEM_MANAGED))
            .withBackup(new Backup().withBackupRetentionDays(7).withGeoRedundantBackup(GeoRedundantBackupEnum.DISABLED))
            .withNetwork(new Network().withDelegatedSubnetResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.Network/virtualNetworks/test-vnet/subnets/test-vnet-subnet")
                .withPrivateDnsZoneArmResourceId(
                    "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourcegroups/testrg/providers/Microsoft.Network/privateDnsZones/test-private-dns-zone.postgres.database.azure.com"))
            .withHighAvailability(new HighAvailability().withMode(HighAvailabilityMode.ZONE_REDUNDANT))
            .withAvailabilityZone("1")
            .withCreateMode(CreateMode.CREATE)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * ServerCreateReplica.json
     */
    /**
     * Sample code: ServerCreateReplica.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void
        serverCreateReplica(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.servers()
            .define("pgtestsvc5rep")
            .withRegion("westus")
            .withExistingResourceGroup("testrg")
            .withIdentity(new UserAssignedIdentity().withUserAssignedIdentities(mapOf(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testresourcegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-usermanagedidentity",
                new UserIdentity())).withType(IdentityType.USER_ASSIGNED))
            .withDataEncryption(new DataEncryption().withPrimaryKeyUri("fakeTokenPlaceholder")
                .withPrimaryUserAssignedIdentityId(
                    "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testresourcegroup/providers/Microsoft.ManagedIdentity/userAssignedIdentities/test-usermanagedidentity")
                .withGeoBackupKeyUri("fakeTokenPlaceholder")
                .withGeoBackupUserAssignedIdentityId("")
                .withType(ArmServerKeyType.AZURE_KEY_VAULT))
            .withSourceServerResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.DBforPostgreSQL/flexibleServers/sourcepgservername")
            .withPointInTimeUtc(OffsetDateTime.parse("2021-06-27T00:04:59.4078005+00:00"))
            .withCreateMode(CreateMode.REPLICA)
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * ClusterCreate.json
     */
    /**
     * Sample code: ClusterCreate.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void clusterCreate(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.servers()
            .define("pgtestcluster")
            .withRegion("westus")
            .withExistingResourceGroup("testrg")
            .withSku(new Sku().withName("Standard_D4ds_v5").withTier(SkuTier.GENERAL_PURPOSE))
            .withAdministratorLogin("login")
            .withAdministratorLoginPassword("Password1")
            .withVersion(ServerVersion.ONE_SIX)
            .withStorage(new Storage().withStorageSizeGB(256)
                .withAutoGrow(StorageAutoGrow.DISABLED)
                .withTier(AzureManagedDiskPerformanceTiers.P15))
            .withBackup(new Backup().withBackupRetentionDays(7).withGeoRedundantBackup(GeoRedundantBackupEnum.DISABLED))
            .withNetwork(new Network().withPublicNetworkAccess(ServerPublicNetworkAccessState.DISABLED))
            .withHighAvailability(new HighAvailability().withMode(HighAvailabilityMode.DISABLED))
            .withCreateMode(CreateMode.CREATE)
            .withCluster(new Cluster().withClusterSize(2))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2025-01-01-preview/examples/
     * ServerCreatePointInTimeRestore.json
     */
    /**
     * Sample code: Create a database as a point in time restore.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void createADatabaseAsAPointInTimeRestore(
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        manager.servers()
            .define("pgtestsvc5")
            .withRegion("westus")
            .withExistingResourceGroup("testrg")
            .withSourceServerResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/testrg/providers/Microsoft.DBforPostgreSQL/flexibleServers/sourcepgservername")
            .withPointInTimeUtc(OffsetDateTime.parse("2021-06-27T00:04:59.4078005+00:00"))
            .withCreateMode(CreateMode.POINT_IN_TIME_RESTORE)
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
