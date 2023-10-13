# Code snippets and samples


## Gateways

- [CreateOrUpdate](#gateways_createorupdate)
- [Delete](#gateways_delete)
- [GetByResourceGroup](#gateways_getbyresourcegroup)
- [List](#gateways_list)
- [ListByResourceGroup](#gateways_listbyresourcegroup)
- [ListKeys](#gateways_listkeys)
- [RegenerateKey](#gateways_regeneratekey)
- [Update](#gateways_update)

## OpenApiGatewayOfferings

- [Get](#openapigatewayofferings_get)
- [List](#openapigatewayofferings_list)
- [ListByTenant](#openapigatewayofferings_listbytenant)

## OpenApiGateways

- [CreateOrUpdate](#openapigateways_createorupdate)
- [Delete](#openapigateways_delete)
- [GetByResourceGroup](#openapigateways_getbyresourcegroup)
- [List](#openapigateways_list)
- [ListByResourceGroup](#openapigateways_listbyresourcegroup)
- [ResetConnection](#openapigateways_resetconnection)
- [Update](#openapigateways_update)
- [UpdateCredentials](#openapigateways_updatecredentials)

## Operations

- [List](#operations_list)
### Gateways_CreateOrUpdate

```java
import java.util.HashMap;
import java.util.Map;

/** Samples for Gateways CreateOrUpdate. */
public final class GatewaysCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Gateways_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Gateways_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void gatewaysCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager
            .gateways()
            .define("-9P4JZ-864")
            .withRegion("oldqfladfrffnytsfehbxtieomu")
            .withExistingResourceGroup("rgGateways")
            .withTags(mapOf("key8865", "fakeTokenPlaceholder"))
            .withSku("tx")
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

### Gateways_Delete

```java
/** Samples for Gateways Delete. */
public final class GatewaysDeleteSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Gateways_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Gateways_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void gatewaysDeleteMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.gateways().delete("rgGateways", "-V6OtHY8Q-7-H93-2593", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Gateways_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: Gateways_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void gatewaysDeleteMinimumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.gateways().delete("rgGateways", "1OS-tb1m-4-53lRd", com.azure.core.util.Context.NONE);
    }
}
```

### Gateways_GetByResourceGroup

```java
/** Samples for Gateways GetByResourceGroup. */
public final class GatewaysGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Gateways_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Gateways_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void gatewaysGetMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.gateways().getByResourceGroupWithResponse("rgGateways", "4V0--", com.azure.core.util.Context.NONE);
    }
}
```

### Gateways_List

```java
/** Samples for Gateways List. */
public final class GatewaysListSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Gateways_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: Gateways_ListBySubscription_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void gatewaysListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.gateways().list(com.azure.core.util.Context.NONE);
    }
}
```

### Gateways_ListByResourceGroup

```java
/** Samples for Gateways ListByResourceGroup. */
public final class GatewaysListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Gateways_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Gateways_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void gatewaysListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.gateways().listByResourceGroup("rgGateways", com.azure.core.util.Context.NONE);
    }
}
```

### Gateways_ListKeys

```java
import com.azure.resourcemanager.programmableconnectivity.models.GatewayRegenerateKeyRequest;
import com.azure.resourcemanager.programmableconnectivity.models.RegenerateKeyType;

/** Samples for Gateways ListKeys. */
public final class GatewaysListKeysSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Gateways_ListKeys_MaximumSet_Gen.json
     */
    /**
     * Sample code: Gateways_ListKeys_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void gatewaysListKeysMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager
            .gateways()
            .listKeysWithResponse(
                "rgGateways",
                "jyF431-9Sd12265-Z4",
                new GatewayRegenerateKeyRequest().withKeyType(RegenerateKeyType.PRIMARY),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Gateways_ListKeys_MinimumSet_Gen.json
     */
    /**
     * Sample code: Gateways_ListKeys_MinimumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void gatewaysListKeysMinimumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager
            .gateways()
            .listKeysWithResponse(
                "rgGateways",
                "3CdLI3Z8-y1---2",
                new GatewayRegenerateKeyRequest().withKeyType(RegenerateKeyType.PRIMARY),
                com.azure.core.util.Context.NONE);
    }
}
```

### Gateways_RegenerateKey

```java
import com.azure.resourcemanager.programmableconnectivity.models.GatewayRegenerateKeyRequest;
import com.azure.resourcemanager.programmableconnectivity.models.RegenerateKeyType;

/** Samples for Gateways RegenerateKey. */
public final class GatewaysRegenerateKeySamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Gateways_RegenerateKey_MinimumSet_Gen.json
     */
    /**
     * Sample code: Gateways_RegenerateKey_MinimumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void gatewaysRegenerateKeyMinimumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager
            .gateways()
            .regenerateKey(
                "rgGateways",
                "3Mol2CT-6--6-o1",
                new GatewayRegenerateKeyRequest().withKeyType(RegenerateKeyType.PRIMARY),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Gateways_RegenerateKey_MaximumSet_Gen.json
     */
    /**
     * Sample code: Gateways_RegenerateKey_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void gatewaysRegenerateKeyMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager
            .gateways()
            .regenerateKey(
                "rgGateways",
                "N34-3-",
                new GatewayRegenerateKeyRequest().withKeyType(RegenerateKeyType.PRIMARY),
                com.azure.core.util.Context.NONE);
    }
}
```

### Gateways_Update

```java
import com.azure.resourcemanager.programmableconnectivity.models.Gateway;
import java.util.HashMap;
import java.util.Map;

/** Samples for Gateways Update. */
public final class GatewaysUpdateSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Gateways_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Gateways_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void gatewaysUpdateMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        Gateway resource =
            manager
                .gateways()
                .getByResourceGroupWithResponse("rgGateways", "40bONX8-EI-", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key7927", "fakeTokenPlaceholder"))
            .withSku("bqyothyxcoagyiwpchkjnlzqxrfpng")
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

### OpenApiGatewayOfferings_Get

```java
/** Samples for OpenApiGatewayOfferings Get. */
public final class OpenApiGatewayOfferingsGetSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGatewayOfferings_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGatewayOfferings_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewayOfferingsGetMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.openApiGatewayOfferings().getWithResponse("n", com.azure.core.util.Context.NONE);
    }
}
```

### OpenApiGatewayOfferings_List

```java
/** Samples for OpenApiGatewayOfferings List. */
public final class OpenApiGatewayOfferingsListSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGatewayOfferings_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGatewayOfferings_ListBySubscription_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewayOfferingsListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.openApiGatewayOfferings().list(com.azure.core.util.Context.NONE);
    }
}
```

### OpenApiGatewayOfferings_ListByTenant

```java
/** Samples for OpenApiGatewayOfferings ListByTenant. */
public final class OpenApiGatewayOfferingsListByTenantSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGatewayOfferings_ListByTenant_MaximumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGatewayOfferings_ListByTenant_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewayOfferingsListByTenantMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.openApiGatewayOfferings().listByTenant(com.azure.core.util.Context.NONE);
    }
}
```

### OpenApiGateways_CreateOrUpdate

```java
import com.azure.resourcemanager.programmableconnectivity.models.AccountType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for OpenApiGateways CreateOrUpdate. */
public final class OpenApiGatewaysCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGateways_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGateways_CreateOrUpdate_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewaysCreateOrUpdateMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager
            .openApiGateways()
            .define("6-9S-7IwK-C-")
            .withRegion("vs")
            .withExistingResourceGroup("rgOpenApiGateways")
            .withTags(mapOf("key6336", "fakeTokenPlaceholder"))
            .withGatewayId("uxewfno")
            .withOpenApiGatewayOfferingId("cshaxdqwithzpnjrpfpdqsixsh")
            .withFeatures(Arrays.asList("easmfrekfz"))
            .withAccountType(AccountType.AZURE_MANAGED)
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

### OpenApiGateways_Delete

```java
/** Samples for OpenApiGateways Delete. */
public final class OpenApiGatewaysDeleteSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGateways_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGateways_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewaysDeleteMinimumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.openApiGateways().delete("rgOpenApiGateways", "BN80gfT6", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGateways_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGateways_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewaysDeleteMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.openApiGateways().delete("rgOpenApiGateways", "8M5e-Hx-H", com.azure.core.util.Context.NONE);
    }
}
```

### OpenApiGateways_GetByResourceGroup

```java
/** Samples for OpenApiGateways GetByResourceGroup. */
public final class OpenApiGatewaysGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGateways_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGateways_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewaysGetMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager
            .openApiGateways()
            .getByResourceGroupWithResponse("rgOpenApiGateways", "-cO--6U-Jg-4B7Y5u", com.azure.core.util.Context.NONE);
    }
}
```

### OpenApiGateways_List

```java
/** Samples for OpenApiGateways List. */
public final class OpenApiGatewaysListSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGateways_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGateways_ListBySubscription_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewaysListBySubscriptionMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.openApiGateways().list(com.azure.core.util.Context.NONE);
    }
}
```

### OpenApiGateways_ListByResourceGroup

```java
/** Samples for OpenApiGateways ListByResourceGroup. */
public final class OpenApiGatewaysListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGateways_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGateways_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewaysListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.openApiGateways().listByResourceGroup("rgOpenApiGateways", com.azure.core.util.Context.NONE);
    }
}
```

### OpenApiGateways_ResetConnection

```java
import com.azure.resourcemanager.programmableconnectivity.fluent.models.OpenApiGatewayInner;
import com.azure.resourcemanager.programmableconnectivity.models.AccountType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for OpenApiGateways ResetConnection. */
public final class OpenApiGatewaysResetConnectionSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGateways_ResetConnection_MaximumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGateways_ResetConnection_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewaysResetConnectionMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager
            .openApiGateways()
            .resetConnection(
                "rgOpenApiGateways",
                "dX-QBUG4EL861Dg84",
                new OpenApiGatewayInner()
                    .withLocation("vs")
                    .withTags(mapOf("key6336", "fakeTokenPlaceholder"))
                    .withGatewayId("uxewfno")
                    .withOpenApiGatewayOfferingId("cshaxdqwithzpnjrpfpdqsixsh")
                    .withFeatures(Arrays.asList("easmfrekfz"))
                    .withAccountType(AccountType.AZURE_MANAGED),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGateways_ResetConnection_MinimumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGateways_ResetConnection_MinimumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewaysResetConnectionMinimumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager
            .openApiGateways()
            .resetConnection(
                "rgOpenApiGateways",
                "FWEDF4--",
                new OpenApiGatewayInner().withLocation("vs"),
                com.azure.core.util.Context.NONE);
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

### OpenApiGateways_Update

```java
import com.azure.resourcemanager.programmableconnectivity.models.AccountType;
import com.azure.resourcemanager.programmableconnectivity.models.OpenApiGateway;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for OpenApiGateways Update. */
public final class OpenApiGatewaysUpdateSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGateways_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGateways_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewaysUpdateMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        OpenApiGateway resource =
            manager
                .openApiGateways()
                .getByResourceGroupWithResponse("rgOpenApiGateways", "-2f3-", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key1522", "fakeTokenPlaceholder"))
            .withGatewayId("gyoquqjndfgp")
            .withOpenApiGatewayOfferingId("iyzjsmnuixpgtjszzhhkngdzmi")
            .withFeatures(Arrays.asList("nn"))
            .withAccountType(AccountType.AZURE_MANAGED)
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

### OpenApiGateways_UpdateCredentials

```java
import com.azure.resourcemanager.programmableconnectivity.models.AppCredentials;

/** Samples for OpenApiGateways UpdateCredentials. */
public final class OpenApiGatewaysUpdateCredentialsSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGateways_UpdateCredentials_MinimumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGateways_UpdateCredentials_MinimumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewaysUpdateCredentialsMinimumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager
            .openApiGateways()
            .updateCredentials(
                "rgOpenApiGateways",
                "1dU7-7h7P-x",
                new AppCredentials().withAppId("cxbamkmmvrxhqnjkpjnzcwkif").withAppSecret("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/OpenApiGateways_UpdateCredentials_MaximumSet_Gen.json
     */
    /**
     * Sample code: OpenApiGateways_UpdateCredentials_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void openApiGatewaysUpdateCredentialsMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager
            .openApiGateways()
            .updateCredentials(
                "rgOpenApiGateways",
                "252-c93-A1",
                new AppCredentials().withAppId("cxbamkmmvrxhqnjkpjnzcwkif").withAppSecret("fakeTokenPlaceholder"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MinimumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void operationsListMinimumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/programmableconnectivity/resource-manager/Microsoft.ProgrammableConnectivity/preview/2023-11-01-preview/examples/Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MaximumSet_Gen.
     *
     * @param manager Entry point to ProgrammableConnectivityManager.
     */
    public static void operationsListMaximumSetGen(
        com.azure.resourcemanager.programmableconnectivity.ProgrammableConnectivityManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

