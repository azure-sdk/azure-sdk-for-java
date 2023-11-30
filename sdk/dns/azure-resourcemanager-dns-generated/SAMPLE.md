# Code snippets and samples


## DnsResourceReference

- [GetByTargetResources](#dnsresourcereference_getbytargetresources)

## DnssecConfigs

- [CreateOrUpdate](#dnssecconfigs_createorupdate)
- [Delete](#dnssecconfigs_delete)
- [Get](#dnssecconfigs_get)
- [ListByDnsZone](#dnssecconfigs_listbydnszone)

## RecordSets

- [CreateOrUpdate](#recordsets_createorupdate)
- [Delete](#recordsets_delete)
- [Get](#recordsets_get)
- [ListAllByDnsZone](#recordsets_listallbydnszone)
- [ListByDnsZone](#recordsets_listbydnszone)
- [ListByType](#recordsets_listbytype)
- [Update](#recordsets_update)

## Zones

- [CreateOrUpdate](#zones_createorupdate)
- [Delete](#zones_delete)
- [GetByResourceGroup](#zones_getbyresourcegroup)
- [List](#zones_list)
- [ListByResourceGroup](#zones_listbyresourcegroup)
- [Update](#zones_update)
### DnsResourceReference_GetByTargetResources

```java
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.dns.generated.models.DnsResourceReferenceRequest;
import java.util.Arrays;

/**
 * Samples for DnsResourceReference GetByTargetResources.
 */
public final class DnsResourceReferenceGetByTargetResourcesSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetDnsResourceReference.json
     */
    /**
     * Sample code: Get DNS resource reference.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getDNSResourceReference(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.dnsResourceReferences().getByTargetResourcesWithResponse(new DnsResourceReferenceRequest().withTargetResources(Arrays.asList(new SubResource().withId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/trafficManagerProfiles/testpp2"))), com.azure.core.util.Context.NONE);
    }
}
```

### DnssecConfigs_CreateOrUpdate

```java
/**
 * Samples for DnssecConfigs CreateOrUpdate.
 */
public final class DnssecConfigsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateDnssecConfig.json
     */
    /**
     * Sample code: Create DnssecConfig.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createDnssecConfig(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.dnssecConfigs().createOrUpdate("rg1", "zone1", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### DnssecConfigs_Delete

```java
/**
 * Samples for DnssecConfigs Delete.
 */
public final class DnssecConfigsDeleteSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteDnssecConfig.json
     */
    /**
     * Sample code: Delete DnssecConfig.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteDnssecConfig(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.dnssecConfigs().delete("rg1", "zone1", null, com.azure.core.util.Context.NONE);
    }
}
```

### DnssecConfigs_Get

```java
/**
 * Samples for DnssecConfigs Get.
 */
public final class DnssecConfigsGetSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetDnssecConfig.json
     */
    /**
     * Sample code: Get DnssecConfig.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getDnssecConfig(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.dnssecConfigs().getWithResponse("rg1", "zone1", com.azure.core.util.Context.NONE);
    }
}
```

### DnssecConfigs_ListByDnsZone

```java
/**
 * Samples for DnssecConfigs ListByDnsZone.
 */
public final class DnssecConfigsListByDnsZoneSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListDnssecConfigsByZone.json
     */
    /**
     * Sample code: List DnssecConfigs.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listDnssecConfigs(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.dnssecConfigs().listByDnsZone("rg1", "zone1", com.azure.core.util.Context.NONE);
    }
}
```

### RecordSets_CreateOrUpdate

```java
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.dns.generated.fluent.models.RecordSetInner;
import com.azure.resourcemanager.dns.generated.models.AaaaRecord;
import com.azure.resourcemanager.dns.generated.models.ARecord;
import com.azure.resourcemanager.dns.generated.models.CaaRecord;
import com.azure.resourcemanager.dns.generated.models.CnameRecord;
import com.azure.resourcemanager.dns.generated.models.Digest;
import com.azure.resourcemanager.dns.generated.models.DsRecord;
import com.azure.resourcemanager.dns.generated.models.MxRecord;
import com.azure.resourcemanager.dns.generated.models.NaptrRecord;
import com.azure.resourcemanager.dns.generated.models.NsRecord;
import com.azure.resourcemanager.dns.generated.models.PtrRecord;
import com.azure.resourcemanager.dns.generated.models.RecordType;
import com.azure.resourcemanager.dns.generated.models.SoaRecord;
import com.azure.resourcemanager.dns.generated.models.SrvRecord;
import com.azure.resourcemanager.dns.generated.models.TlsaRecord;
import com.azure.resourcemanager.dns.generated.models.TxtRecord;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for RecordSets CreateOrUpdate.
 */
public final class RecordSetsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateSRVRecordset.json
     */
    /**
     * Sample code: Create SRV recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createSRVRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.SRV, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withSrvRecords(Arrays.asList(new SrvRecord().withPriority(0).withWeight(10).withPort(80).withTarget("contoso.com"))), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateCNAMERecordset.json
     */
    /**
     * Sample code: Create CNAME recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createCNAMERecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.CNAME, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withCnameRecord(new CnameRecord().withCname("contoso.com")), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateAAAARecordset.json
     */
    /**
     * Sample code: Create AAAA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createAAAARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.AAAA, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withAaaaRecords(Arrays.asList(new AaaaRecord().withIpv6Address("::1"))), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateDSRecordset.json
     */
    /**
     * Sample code: Create DS recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createDSRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.DS, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withDsRecords(Arrays.asList(new DsRecord().withKeyTag(60485).withAlgorithm(5).withDigest(new Digest().withAlgorithmType(1).withValue("2BB183AF5F22588179A53B0A98631FAD1A292118")))), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateNAPTRRecordset.json
     */
    /**
     * Sample code: Create NAPTR recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createNAPTRRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.NAPTR, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withNaptrRecords(Arrays.asList(new NaptrRecord().withOrder(100).withPreference(10).withFlags("U").withServices("E2U+sip").withRegexp("!^.*$!sip:user@example.com!").withReplacement(""))), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateNSRecordset.json
     */
    /**
     * Sample code: Create NS recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createNSRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.NS, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withNsRecords(Arrays.asList(new NsRecord().withNsdname("ns1.contoso.com"))), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateARecordsetAlias.json
     */
    /**
     * Sample code: Create A recordset with alias target resource.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createARecordsetWithAliasTargetResource(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.A, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withTargetResource(new SubResource().withId("/subscriptions/726f8cd6-6459-4db4-8e6d-2cd2716904e2/resourceGroups/test/providers/Microsoft.Network/trafficManagerProfiles/testpp2")), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateARecordset.json
     */
    /**
     * Sample code: Create A recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.A, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withARecords(Arrays.asList(new ARecord().withIpv4Address("127.0.0.1"))), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateTLSARecordset.json
     */
    /**
     * Sample code: Create TLSA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createTLSARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.TLSA, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withTlsaRecords(Arrays.asList(new TlsaRecord().withUsage(3).withSelector(1).withMatchingType(1).withCertAssociationData("6EC8A4B7F511454D84DCC055213B8D195E8ADA751FE14300AFE32D54B162438B"))), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateTXTRecordset.json
     */
    /**
     * Sample code: Create TXT recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createTXTRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.TXT, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withTxtRecords(Arrays.asList(new TxtRecord().withValue(Arrays.asList("string1", "string2")))), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateCaaRecordset.json
     */
    /**
     * Sample code: Create CAA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createCAARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.CAA, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withCaaRecords(Arrays.asList(new CaaRecord().withFlags(0).withTag("issue").withValue("ca.contoso.com"))), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdatePTRRecordset.json
     */
    /**
     * Sample code: Create PTR recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createPTRRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "0.0.127.in-addr.arpa", "1", RecordType.PTR, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withPtrRecords(Arrays.asList(new PtrRecord().withPtrdname("localhost"))), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateMXRecordset.json
     */
    /**
     * Sample code: Create MX recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createMXRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "record1", RecordType.MX, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withMxRecords(Arrays.asList(new MxRecord().withPreference(0).withExchange("mail.contoso.com"))), null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateSOARecordset.json
     */
    /**
     * Sample code: Create SOA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createSOARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().createOrUpdateWithResponse("rg1", "zone1", "@", RecordType.SOA, new RecordSetInner().withMetadata(mapOf("key1", "fakeTokenPlaceholder")).withTtl(3600L).withSoaRecord(new SoaRecord().withHost("ns1.contoso.com").withEmail("hostmaster.contoso.com").withSerialNumber(1L).withRefreshTime(3600L).withRetryTime(300L).withExpireTime(2419200L).withMinimumTtl(300L)), null, null, com.azure.core.util.Context.NONE);
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

### RecordSets_Delete

```java
import com.azure.resourcemanager.dns.generated.models.RecordType;
import java.util.stream.Collectors;

/**
 * Samples for RecordSets Delete.
 */
public final class RecordSetsDeleteSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteNAPTRRecordset.json
     */
    /**
     * Sample code: Delete NAPTR recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteNAPTRRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "zone1", "record1", RecordType.NAPTR, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteARecordset.json
     */
    /**
     * Sample code: Delete A recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "zone1", "record1", RecordType.A, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteAAAARecordset.json
     */
    /**
     * Sample code: Delete AAAA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteAAAARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "zone1", "record1", RecordType.AAAA, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteTXTRecordset.json
     */
    /**
     * Sample code: Delete TXT recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteTXTRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "zone1", "record1", RecordType.TXT, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteDSRecordset.json
     */
    /**
     * Sample code: Delete DS recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteDSRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "zone1", "record1", RecordType.DS, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteTLSARecordset.json
     */
    /**
     * Sample code: Delete TLSA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteTLSARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "zone1", "record1", RecordType.TLSA, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeletePTRRecordset.json
     */
    /**
     * Sample code: Delete PTR recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deletePTRRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "0.0.127.in-addr.arpa", "1", RecordType.PTR, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteSRVRecordset.json
     */
    /**
     * Sample code: Delete SRV recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteSRVRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "zone1", "record1", RecordType.SRV, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteMXRecordset.json
     */
    /**
     * Sample code: Delete MX recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteMXRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "zone1", "record1", RecordType.MX, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteCaaRecordset.json
     */
    /**
     * Sample code: Delete CAA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteCAARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "zone1", "record1", RecordType.CAA, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteNSRecordset.json
     */
    /**
     * Sample code: Delete NS recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteNSRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "zone1", "record1", RecordType.NS, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteCNAMERecordset.json
     */
    /**
     * Sample code: Delete CNAME recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteCNAMERecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().deleteWithResponse("rg1", "zone1", "record1", RecordType.CNAME, null, com.azure.core.util.Context.NONE);
    }
}
```

### RecordSets_Get

```java
import com.azure.resourcemanager.dns.generated.models.RecordType;
import java.util.stream.Collectors;

/**
 * Samples for RecordSets Get.
 */
public final class RecordSetsGetSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetCaaRecordset.json
     */
    /**
     * Sample code: Get CAA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getCAARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "record1", RecordType.CAA, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetPTRRecordset.json
     */
    /**
     * Sample code: Get PTR recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getPTRRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "0.0.127.in-addr.arpa", "1", RecordType.PTR, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetDSRecordset.json
     */
    /**
     * Sample code: Get DS recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getDSRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "record1", RecordType.DS, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetARecordset.json
     */
    /**
     * Sample code: Get A recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "record1", RecordType.A, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetNAPTRRecordset.json
     */
    /**
     * Sample code: Get NAPTR recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getNAPTRRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "record1", RecordType.NAPTR, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetNSRecordset.json
     */
    /**
     * Sample code: Get NS recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getNSRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "record1", RecordType.NS, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetAAAARecordset.json
     */
    /**
     * Sample code: Get AAAA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getAAAARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "record1", RecordType.AAAA, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetSRVRecordset.json
     */
    /**
     * Sample code: Get SRV recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getSRVRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "record1", RecordType.SRV, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetCNAMERecordset.json
     */
    /**
     * Sample code: Get CNAME recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getCNAMERecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "record1", RecordType.CNAME, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetTXTRecordset.json
     */
    /**
     * Sample code: Get TXT recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getTXTRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "record1", RecordType.TXT, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetTLSARecordset.json
     */
    /**
     * Sample code: Get TLSA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getTLSARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "record1", RecordType.TLSA, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetMXRecordset.json
     */
    /**
     * Sample code: Get MX recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getMXRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "record1", RecordType.MX, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetSOARecordset.json
     */
    /**
     * Sample code: Get SOA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getSOARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().getWithResponse("rg1", "zone1", "@", RecordType.SOA, com.azure.core.util.Context.NONE);
    }
}
```

### RecordSets_ListAllByDnsZone

```java
/**
 * Samples for RecordSets ListAllByDnsZone.
 */
public final class RecordSetsListAllByDnsZoneSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListRecordSetsByZone.json
     */
    /**
     * Sample code: List all recordsets by zone.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listAllRecordsetsByZone(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listAllByDnsZone("rg1", "zone1", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### RecordSets_ListByDnsZone

```java
/**
 * Samples for RecordSets ListByDnsZone.
 */
public final class RecordSetsListByDnsZoneSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListRecordSetsByZone.json
     */
    /**
     * Sample code: List recordsets by zone.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listRecordsetsByZone(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByDnsZone("rg1", "zone1", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### RecordSets_ListByType

```java
import com.azure.resourcemanager.dns.generated.models.RecordType;
import java.util.stream.Collectors;

/**
 * Samples for RecordSets ListByType.
 */
public final class RecordSetsListByTypeSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListAAAARecordset.json
     */
    /**
     * Sample code: List AAAA recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listAAAARecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.AAAA, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListMXRecordset.json
     */
    /**
     * Sample code: List MX recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listMXRecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.MX, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListNSRecordset.json
     */
    /**
     * Sample code: List NS recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listNSRecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.NS, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListCNAMERecordset.json
     */
    /**
     * Sample code: List CNAME recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listCNAMERecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.CNAME, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListDSRecordset.json
     */
    /**
     * Sample code: List DS recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listDSRecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.DS, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListSRVRecordset.json
     */
    /**
     * Sample code: List SRV recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listSRVRecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.SRV, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListPTRRecordset.json
     */
    /**
     * Sample code: List PTR recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listPTRRecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "0.0.127.in-addr.arpa", RecordType.PTR, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListTLSARecordset.json
     */
    /**
     * Sample code: List TLSA recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listTLSARecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.TLSA, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListARecordset.json
     */
    /**
     * Sample code: List A recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listARecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.A, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListSOARecordset.json
     */
    /**
     * Sample code: List SOA recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listSOARecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.SOA, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListCaaRecordset.json
     */
    /**
     * Sample code: List CAA recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listCAARecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.CAA, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListNAPTRRecordset.json
     */
    /**
     * Sample code: List NAPTR recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listNAPTRRecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.NAPTR, null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListTXTRecordset.json
     */
    /**
     * Sample code: List TXT recordsets.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listTXTRecordsets(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().listByType("rg1", "zone1", RecordType.TXT, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### RecordSets_Update

```java
import com.azure.resourcemanager.dns.generated.fluent.models.RecordSetInner;
import com.azure.resourcemanager.dns.generated.models.RecordType;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Samples for RecordSets Update.
 */
public final class RecordSetsUpdateSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchMXRecordset.json
     */
    /**
     * Sample code: Patch MX recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchMXRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "record1", RecordType.MX, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchNSRecordset.json
     */
    /**
     * Sample code: Patch NS recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchNSRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "record1", RecordType.NS, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchPTRRecordset.json
     */
    /**
     * Sample code: Patch PTR recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchPTRRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "0.0.127.in-addr.arpa", "1", RecordType.PTR, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchDSRecordset.json
     */
    /**
     * Sample code: Patch DS recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchDSRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "record1", RecordType.DS, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchARecordset.json
     */
    /**
     * Sample code: Patch A recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "record1", RecordType.A, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchTXTRecordset.json
     */
    /**
     * Sample code: Patch TXT recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchTXTRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "record1", RecordType.TXT, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchAAAARecordset.json
     */
    /**
     * Sample code: Patch AAAA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchAAAARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "record1", RecordType.AAAA, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchSRVRecordset.json
     */
    /**
     * Sample code: Patch SRV recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchSRVRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "record1", RecordType.SRV, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchSOARecordset.json
     */
    /**
     * Sample code: Patch SOA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchSOARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "@", RecordType.SOA, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchTLSARecordset.json
     */
    /**
     * Sample code: Patch TLSA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchTLSARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "record1", RecordType.TLSA, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchCaaRecordset.json
     */
    /**
     * Sample code: Patch CAA recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchCAARecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "record1", RecordType.CAA, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchCNAMERecordset.json
     */
    /**
     * Sample code: Patch CNAME recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchCNAMERecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "record1", RecordType.CNAME, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchNAPTRRecordset.json
     */
    /**
     * Sample code: Patch NAPTR recordset.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchNAPTRRecordset(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.recordSets().updateWithResponse("rg1", "zone1", "record1", RecordType.NAPTR, new RecordSetInner().withMetadata(mapOf("key2", "fakeTokenPlaceholder")), null, com.azure.core.util.Context.NONE);
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

### Zones_CreateOrUpdate

```java
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Zones CreateOrUpdate.
 */
public final class ZonesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/CreateOrUpdateZone.json
     */
    /**
     * Sample code: Create zone.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void createZone(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.zones().define("zone1").withRegion("Global").withExistingResourceGroup("rg1").withTags(mapOf("key1", "fakeTokenPlaceholder")).create();
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

### Zones_Delete

```java
/**
 * Samples for Zones Delete.
 */
public final class ZonesDeleteSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/DeleteZone.json
     */
    /**
     * Sample code: Delete zone.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void deleteZone(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.zones().delete("rg1", "zone1", null, com.azure.core.util.Context.NONE);
    }
}
```

### Zones_GetByResourceGroup

```java
/**
 * Samples for Zones GetByResourceGroup.
 */
public final class ZonesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/GetZone.json
     */
    /**
     * Sample code: Get zone.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void getZone(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.zones().getByResourceGroupWithResponse("rg1", "zone1", com.azure.core.util.Context.NONE);
    }
}
```

### Zones_List

```java
/**
 * Samples for Zones List.
 */
public final class ZonesListSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListZonesBySubscription.json
     */
    /**
     * Sample code: List zones by subscription.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listZonesBySubscription(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.zones().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### Zones_ListByResourceGroup

```java
/**
 * Samples for Zones ListByResourceGroup.
 */
public final class ZonesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/ListZonesByResourceGroup.json
     */
    /**
     * Sample code: List zones by resource group.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void listZonesByResourceGroup(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        manager.zones().listByResourceGroup("rg1", null, com.azure.core.util.Context.NONE);
    }
}
```

### Zones_Update

```java
import com.azure.resourcemanager.dns.generated.models.Zone;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Zones Update.
 */
public final class ZonesUpdateSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/preview/2023-07-01-preview/examples/PatchZone.json
     */
    /**
     * Sample code: Patch zone.
     * 
     * @param manager Entry point to DnsManager.
     */
    public static void patchZone(com.azure.resourcemanager.dns.generated.DnsManager manager) {
        Zone resource = manager.zones().getByResourceGroupWithResponse("rg1", "zone1", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("key2", "fakeTokenPlaceholder")).apply();
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

