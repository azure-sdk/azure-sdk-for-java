# Code snippets and samples


## Ledger

- [Create](#ledger_create)
- [Delete](#ledger_delete)
- [GetByResourceGroup](#ledger_getbyresourcegroup)
- [List](#ledger_list)
- [ListByResourceGroup](#ledger_listbyresourcegroup)
- [Update](#ledger_update)

## Operations

- [List](#operations_list)

## ResourceProvider

- [CheckNameAvailability](#resourceprovider_checknameavailability)
### Ledger_Create

```java
import com.azure.resourcemanager.confidentialledger.models.AadBasedSecurityPrincipal;
import com.azure.resourcemanager.confidentialledger.models.CertBasedSecurityPrincipal;
import com.azure.resourcemanager.confidentialledger.models.LedgerProperties;
import com.azure.resourcemanager.confidentialledger.models.LedgerRoleName;
import com.azure.resourcemanager.confidentialledger.models.LedgerType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Ledger Create. */
public final class LedgerCreateSamples {
    /*
     * x-ms-original-file: specification/confidentialledger/resource-manager/Microsoft.ConfidentialLedger/preview/2021-05-13-preview/examples/ConfidentialLedger_Create.json
     */
    /**
     * Sample code: ConfidentialLedgerCreate.
     *
     * @param manager Entry point to ConfidentialLedgerManager.
     */
    public static void confidentialLedgerCreate(
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager) {
        manager
            .ledgers()
            .define("DummyLedgerName")
            .withExistingResourceGroup("DummyResourceGroupName")
            .withRegion("EastUS")
            .withTags(mapOf("additionalProps1", "additional properties"))
            .withProperties(
                new LedgerProperties()
                    .withLedgerType(LedgerType.PUBLIC)
                    .withAadBasedSecurityPrincipals(
                        Arrays
                            .asList(
                                new AadBasedSecurityPrincipal()
                                    .withPrincipalId("34621747-6fc8-4771-a2eb-72f31c461f2e")
                                    .withTenantId("bce123b9-2b7b-4975-8360-5ca0b9b1cd08")
                                    .withLedgerRoleName(LedgerRoleName.ADMINISTRATOR)))
                    .withCertBasedSecurityPrincipals(
                        Arrays
                            .asList(
                                new CertBasedSecurityPrincipal()
                                    .withCert(
                                        "MIIDBTCCAe2gAwIBAgIQXVogj9BAf49IpuOSIvztNDANBgkqhkiG9w0BAQsFADAtMSswKQYDVQQDEyJhY2NvdW50cy5hY2Nlc3Njb250cm9sLndpbmRvd3MubmV0MB4XDTIwMDMxNzAwMDAwMFoXDTI1MDMxNzAwMDAwMFowLTErMCkGA1UEAxMiYWNjb3VudHMuYWNjZXNzY29udHJvbC53aW5kb3dzLm5ldDCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBANfLmdz9yIDskpZzrMXiDeVlCs75ZunrzwzBW5lz7UxdBjHu7Q9iT32otlBp++LOwBcKsVjuQ0GUbulX0FLsfLjEeCe58ZtSn//+6VRFSScg7i+WvDwEUWELR+vMPtCGcXBTpILEnYbSMz0No4+Jpkc1lyMIfDP/KSeqojo74xfW4RKtAgv39uwZ5Yz2hZ/IcWOvaQqMXp1lqhXLFIRWbwjLYYUbmwGwYpQ6++Cml0ucQoMkgYT88HpA/fzXQlLgrHamr3eE/lVp26ZWwfGLAvkdNBabQRSrk8k/c6BmY1mYpUFZo+795PI16mAdp1ioEwH8I5osis+/BR5GhPpwiA8CAwEAAaMhMB8wHQYDVR0OBBYEFF8MDGklOGhGNVJvsHHRCaqtzexcMA0GCSqGSIb3DQEBCwUAA4IBAQCKkegw/mdpCVl1lOpgU4G9RT+1gtcPqZK9kpimuDggSJju6KUQlOCi5/lIH5DCzpjFdmG17TjWVBNve5kowmrhLzovY0Ykk7+6hYTBK8dNNSmd4SK7zY++0aDIuOzHP2Cur+kgFC0gez50tPzotLDtMmp40gknXuzltwJfezNSw3gLgljDsGGcDIXK3qLSYh44qSuRGwulcN2EJUZBI9tIxoODpaWHIN8+z2uZvf8JBYFjA3+n9FRQn51X16CTcjq4QRTbNVpgVuQuyaYnEtx0ZnDvguB3RjGSPIXTRBkLl2x7e8/6uAZ6tchw8rhcOtPsFgJuoJokGjvcUSR/6Eqd")
                                    .withLedgerRoleName(LedgerRoleName.READER))))
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

### Ledger_Delete

```java
import com.azure.core.util.Context;

/** Samples for Ledger Delete. */
public final class LedgerDeleteSamples {
    /*
     * x-ms-original-file: specification/confidentialledger/resource-manager/Microsoft.ConfidentialLedger/preview/2021-05-13-preview/examples/ConfidentialLedger_Delete.json
     */
    /**
     * Sample code: ConfidentialLedgerDelete.
     *
     * @param manager Entry point to ConfidentialLedgerManager.
     */
    public static void confidentialLedgerDelete(
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager) {
        manager.ledgers().delete("DummyResourceGroupName", "DummyLedgerName", Context.NONE);
    }
}
```

### Ledger_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Ledger GetByResourceGroup. */
public final class LedgerGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/confidentialledger/resource-manager/Microsoft.ConfidentialLedger/preview/2021-05-13-preview/examples/ConfidentialLedger_Get.json
     */
    /**
     * Sample code: ConfidentialLedgerGet.
     *
     * @param manager Entry point to ConfidentialLedgerManager.
     */
    public static void confidentialLedgerGet(
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager) {
        manager.ledgers().getByResourceGroupWithResponse("DummyResourceGroupName", "DummyLedgerName", Context.NONE);
    }
}
```

### Ledger_List

```java
import com.azure.core.util.Context;

/** Samples for Ledger List. */
public final class LedgerListSamples {
    /*
     * x-ms-original-file: specification/confidentialledger/resource-manager/Microsoft.ConfidentialLedger/preview/2021-05-13-preview/examples/ConfidentialLedger_ListBySub.json
     */
    /**
     * Sample code: ConfidentialLedgerListBySub.
     *
     * @param manager Entry point to ConfidentialLedgerManager.
     */
    public static void confidentialLedgerListBySub(
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager) {
        manager.ledgers().list(null, Context.NONE);
    }
}
```

### Ledger_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Ledger ListByResourceGroup. */
public final class LedgerListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/confidentialledger/resource-manager/Microsoft.ConfidentialLedger/preview/2021-05-13-preview/examples/ConfidentialLedger_List.json
     */
    /**
     * Sample code: ConfidentialLedgerList.
     *
     * @param manager Entry point to ConfidentialLedgerManager.
     */
    public static void confidentialLedgerList(
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager) {
        manager.ledgers().listByResourceGroup("DummyResourceGroupName", null, Context.NONE);
    }
}
```

### Ledger_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.confidentialledger.models.ConfidentialLedger;
import com.azure.resourcemanager.confidentialledger.models.LedgerProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for Ledger Update. */
public final class LedgerUpdateSamples {
    /*
     * x-ms-original-file: specification/confidentialledger/resource-manager/Microsoft.ConfidentialLedger/preview/2021-05-13-preview/examples/ConfidentialLedger_Update.json
     */
    /**
     * Sample code: ConfidentialLedgerUpdate.
     *
     * @param manager Entry point to ConfidentialLedgerManager.
     */
    public static void confidentialLedgerUpdate(
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager) {
        ConfidentialLedger resource =
            manager
                .ledgers()
                .getByResourceGroupWithResponse("DummyResourceGroupName", "DummyLedgerName", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("additionProps2", "additional property value", "additionalProps1", "additional properties"))
            .withProperties(new LedgerProperties())
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

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/confidentialledger/resource-manager/Microsoft.ConfidentialLedger/preview/2021-05-13-preview/examples/Operations_Get.json
     */
    /**
     * Sample code: OperationsGet.
     *
     * @param manager Entry point to ConfidentialLedgerManager.
     */
    public static void operationsGet(com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

### ResourceProvider_CheckNameAvailability

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.confidentialledger.models.CheckNameAvailabilityRequest;

/** Samples for ResourceProvider CheckNameAvailability. */
public final class ResourceProviderCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/confidentialledger/resource-manager/Microsoft.ConfidentialLedger/preview/2021-05-13-preview/examples/CheckNameAvailability.json
     */
    /**
     * Sample code: CheckNameAvailability.
     *
     * @param manager Entry point to ConfidentialLedgerManager.
     */
    public static void checkNameAvailability(
        com.azure.resourcemanager.confidentialledger.ConfidentialLedgerManager manager) {
        manager
            .resourceProviders()
            .checkNameAvailabilityWithResponse(
                new CheckNameAvailabilityRequest()
                    .withName("sample-name")
                    .withType("Microsoft.ConfidentialLedger/ledgers"),
                Context.NONE);
    }
}
```

