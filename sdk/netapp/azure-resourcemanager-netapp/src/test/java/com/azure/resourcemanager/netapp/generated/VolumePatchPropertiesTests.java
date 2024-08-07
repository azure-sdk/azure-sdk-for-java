// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.VolumePatchProperties;
import com.azure.resourcemanager.netapp.models.ChownMode;
import com.azure.resourcemanager.netapp.models.CoolAccessRetrievalPolicy;
import com.azure.resourcemanager.netapp.models.ExportPolicyRule;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.azure.resourcemanager.netapp.models.SmbAccessBasedEnumeration;
import com.azure.resourcemanager.netapp.models.SmbNonBrowsable;
import com.azure.resourcemanager.netapp.models.VolumeBackupProperties;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesDataProtection;
import com.azure.resourcemanager.netapp.models.VolumePatchPropertiesExportPolicy;
import com.azure.resourcemanager.netapp.models.VolumeSnapshotProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class VolumePatchPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumePatchProperties model = BinaryData.fromString(
            "{\"serviceLevel\":\"StandardZRS\",\"usageThreshold\":822687425279743867,\"exportPolicy\":{\"rules\":[{\"ruleIndex\":1806634279,\"unixReadOnly\":true,\"unixReadWrite\":true,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":false,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":false,\"cifs\":false,\"nfsv3\":false,\"nfsv41\":true,\"allowedClients\":\"vseotgqrl\",\"hasRootAccess\":true,\"chownMode\":\"Unrestricted\"},{\"ruleIndex\":883294723,\"unixReadOnly\":true,\"unixReadWrite\":true,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":false,\"kerberos5iReadWrite\":true,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":true,\"cifs\":false,\"nfsv3\":false,\"nfsv41\":true,\"allowedClients\":\"d\",\"hasRootAccess\":true,\"chownMode\":\"Restricted\"},{\"ruleIndex\":360418478,\"unixReadOnly\":true,\"unixReadWrite\":false,\"kerberos5ReadOnly\":true,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":false,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":true,\"cifs\":true,\"nfsv3\":true,\"nfsv41\":false,\"allowedClients\":\"lfphsdyhtozfikd\",\"hasRootAccess\":false,\"chownMode\":\"Restricted\"},{\"ruleIndex\":180318621,\"unixReadOnly\":false,\"unixReadWrite\":false,\"kerberos5ReadOnly\":false,\"kerberos5ReadWrite\":true,\"kerberos5iReadOnly\":true,\"kerberos5iReadWrite\":false,\"kerberos5pReadOnly\":true,\"kerberos5pReadWrite\":false,\"cifs\":true,\"nfsv3\":true,\"nfsv41\":false,\"allowedClients\":\"fwdsj\",\"hasRootAccess\":true,\"chownMode\":\"Unrestricted\"}]},\"protocolTypes\":[\"iiswacffgdkzze\",\"kfvhqcrailvpn\",\"pfuflrw\"],\"throughputMibps\":90.98357,\"dataProtection\":{\"backup\":{\"backupPolicyId\":\"yjrxsagafcnih\",\"policyEnforced\":true,\"backupVaultId\":\"pnedgf\"},\"snapshot\":{\"snapshotPolicyId\":\"kcvqvpke\"}},\"isDefaultQuotaEnabled\":true,\"defaultUserQuotaInKiBs\":4200682603661238799,\"defaultGroupQuotaInKiBs\":1691075680469925447,\"unixPermissions\":\"dsotbobzd\",\"coolAccess\":false,\"coolnessPeriod\":542490098,\"coolAccessRetrievalPolicy\":\"OnRead\",\"snapshotDirectoryVisible\":false,\"smbAccessBasedEnumeration\":\"Disabled\",\"smbNonBrowsable\":\"Enabled\"}")
            .toObject(VolumePatchProperties.class);
        Assertions.assertEquals(ServiceLevel.STANDARD_ZRS, model.serviceLevel());
        Assertions.assertEquals(822687425279743867L, model.usageThreshold());
        Assertions.assertEquals(1806634279, model.exportPolicy().rules().get(0).ruleIndex());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).unixReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).unixReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).cifs());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).nfsv3());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv41());
        Assertions.assertEquals("vseotgqrl", model.exportPolicy().rules().get(0).allowedClients());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.exportPolicy().rules().get(0).chownMode());
        Assertions.assertEquals("iiswacffgdkzze", model.protocolTypes().get(0));
        Assertions.assertEquals(90.98357F, model.throughputMibps());
        Assertions.assertEquals("yjrxsagafcnih", model.dataProtection().backup().backupPolicyId());
        Assertions.assertEquals(true, model.dataProtection().backup().policyEnforced());
        Assertions.assertEquals("pnedgf", model.dataProtection().backup().backupVaultId());
        Assertions.assertEquals("kcvqvpke", model.dataProtection().snapshot().snapshotPolicyId());
        Assertions.assertEquals(true, model.isDefaultQuotaEnabled());
        Assertions.assertEquals(4200682603661238799L, model.defaultUserQuotaInKiBs());
        Assertions.assertEquals(1691075680469925447L, model.defaultGroupQuotaInKiBs());
        Assertions.assertEquals("dsotbobzd", model.unixPermissions());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(542490098, model.coolnessPeriod());
        Assertions.assertEquals(CoolAccessRetrievalPolicy.ON_READ, model.coolAccessRetrievalPolicy());
        Assertions.assertEquals(false, model.snapshotDirectoryVisible());
        Assertions.assertEquals(SmbAccessBasedEnumeration.DISABLED, model.smbAccessBasedEnumeration());
        Assertions.assertEquals(SmbNonBrowsable.ENABLED, model.smbNonBrowsable());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumePatchProperties model = new VolumePatchProperties().withServiceLevel(ServiceLevel.STANDARD_ZRS)
            .withUsageThreshold(822687425279743867L)
            .withExportPolicy(new VolumePatchPropertiesExportPolicy().withRules(Arrays.asList(
                new ExportPolicyRule().withRuleIndex(1806634279)
                    .withUnixReadOnly(true)
                    .withUnixReadWrite(true)
                    .withKerberos5ReadOnly(true)
                    .withKerberos5ReadWrite(false)
                    .withKerberos5IReadOnly(false)
                    .withKerberos5IReadWrite(true)
                    .withKerberos5PReadOnly(true)
                    .withKerberos5PReadWrite(false)
                    .withCifs(false)
                    .withNfsv3(false)
                    .withNfsv41(true)
                    .withAllowedClients("vseotgqrl")
                    .withHasRootAccess(true)
                    .withChownMode(ChownMode.UNRESTRICTED),
                new ExportPolicyRule().withRuleIndex(883294723)
                    .withUnixReadOnly(true)
                    .withUnixReadWrite(true)
                    .withKerberos5ReadOnly(false)
                    .withKerberos5ReadWrite(true)
                    .withKerberos5IReadOnly(false)
                    .withKerberos5IReadWrite(true)
                    .withKerberos5PReadOnly(true)
                    .withKerberos5PReadWrite(true)
                    .withCifs(false)
                    .withNfsv3(false)
                    .withNfsv41(true)
                    .withAllowedClients("d")
                    .withHasRootAccess(true)
                    .withChownMode(ChownMode.RESTRICTED),
                new ExportPolicyRule().withRuleIndex(360418478)
                    .withUnixReadOnly(true)
                    .withUnixReadWrite(false)
                    .withKerberos5ReadOnly(true)
                    .withKerberos5ReadWrite(true)
                    .withKerberos5IReadOnly(true)
                    .withKerberos5IReadWrite(false)
                    .withKerberos5PReadOnly(true)
                    .withKerberos5PReadWrite(true)
                    .withCifs(true)
                    .withNfsv3(true)
                    .withNfsv41(false)
                    .withAllowedClients("lfphsdyhtozfikd")
                    .withHasRootAccess(false)
                    .withChownMode(ChownMode.RESTRICTED),
                new ExportPolicyRule().withRuleIndex(180318621)
                    .withUnixReadOnly(false)
                    .withUnixReadWrite(false)
                    .withKerberos5ReadOnly(false)
                    .withKerberos5ReadWrite(true)
                    .withKerberos5IReadOnly(true)
                    .withKerberos5IReadWrite(false)
                    .withKerberos5PReadOnly(true)
                    .withKerberos5PReadWrite(false)
                    .withCifs(true)
                    .withNfsv3(true)
                    .withNfsv41(false)
                    .withAllowedClients("fwdsj")
                    .withHasRootAccess(true)
                    .withChownMode(ChownMode.UNRESTRICTED))))
            .withProtocolTypes(Arrays.asList("iiswacffgdkzze", "kfvhqcrailvpn", "pfuflrw"))
            .withThroughputMibps(90.98357F)
            .withDataProtection(new VolumePatchPropertiesDataProtection()
                .withBackup(new VolumeBackupProperties().withBackupPolicyId("yjrxsagafcnih")
                    .withPolicyEnforced(true)
                    .withBackupVaultId("pnedgf"))
                .withSnapshot(new VolumeSnapshotProperties().withSnapshotPolicyId("kcvqvpke")))
            .withIsDefaultQuotaEnabled(true)
            .withDefaultUserQuotaInKiBs(4200682603661238799L)
            .withDefaultGroupQuotaInKiBs(1691075680469925447L)
            .withUnixPermissions("dsotbobzd")
            .withCoolAccess(false)
            .withCoolnessPeriod(542490098)
            .withCoolAccessRetrievalPolicy(CoolAccessRetrievalPolicy.ON_READ)
            .withSnapshotDirectoryVisible(false)
            .withSmbAccessBasedEnumeration(SmbAccessBasedEnumeration.DISABLED)
            .withSmbNonBrowsable(SmbNonBrowsable.ENABLED);
        model = BinaryData.fromObject(model).toObject(VolumePatchProperties.class);
        Assertions.assertEquals(ServiceLevel.STANDARD_ZRS, model.serviceLevel());
        Assertions.assertEquals(822687425279743867L, model.usageThreshold());
        Assertions.assertEquals(1806634279, model.exportPolicy().rules().get(0).ruleIndex());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).unixReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).unixReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5ReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5ReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5IReadOnly());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5IReadWrite());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).kerberos5PReadOnly());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).kerberos5PReadWrite());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).cifs());
        Assertions.assertEquals(false, model.exportPolicy().rules().get(0).nfsv3());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).nfsv41());
        Assertions.assertEquals("vseotgqrl", model.exportPolicy().rules().get(0).allowedClients());
        Assertions.assertEquals(true, model.exportPolicy().rules().get(0).hasRootAccess());
        Assertions.assertEquals(ChownMode.UNRESTRICTED, model.exportPolicy().rules().get(0).chownMode());
        Assertions.assertEquals("iiswacffgdkzze", model.protocolTypes().get(0));
        Assertions.assertEquals(90.98357F, model.throughputMibps());
        Assertions.assertEquals("yjrxsagafcnih", model.dataProtection().backup().backupPolicyId());
        Assertions.assertEquals(true, model.dataProtection().backup().policyEnforced());
        Assertions.assertEquals("pnedgf", model.dataProtection().backup().backupVaultId());
        Assertions.assertEquals("kcvqvpke", model.dataProtection().snapshot().snapshotPolicyId());
        Assertions.assertEquals(true, model.isDefaultQuotaEnabled());
        Assertions.assertEquals(4200682603661238799L, model.defaultUserQuotaInKiBs());
        Assertions.assertEquals(1691075680469925447L, model.defaultGroupQuotaInKiBs());
        Assertions.assertEquals("dsotbobzd", model.unixPermissions());
        Assertions.assertEquals(false, model.coolAccess());
        Assertions.assertEquals(542490098, model.coolnessPeriod());
        Assertions.assertEquals(CoolAccessRetrievalPolicy.ON_READ, model.coolAccessRetrievalPolicy());
        Assertions.assertEquals(false, model.snapshotDirectoryVisible());
        Assertions.assertEquals(SmbAccessBasedEnumeration.DISABLED, model.smbAccessBasedEnumeration());
        Assertions.assertEquals(SmbNonBrowsable.ENABLED, model.smbNonBrowsable());
    }
}
