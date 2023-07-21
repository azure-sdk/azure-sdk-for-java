# Code snippets and samples


## Dra

- [Create](#dra_create)
- [Delete](#dra_delete)
- [Get](#dra_get)
- [List](#dra_list)

## DraOperationStatus

- [Get](#draoperationstatus_get)

## EmailConfiguration

- [Create](#emailconfiguration_create)
- [Get](#emailconfiguration_get)
- [List](#emailconfiguration_list)

## Event

- [Get](#event_get)
- [List](#event_list)

## Fabric

- [Create](#fabric_create)
- [Delete](#fabric_delete)
- [GetByResourceGroup](#fabric_getbyresourcegroup)
- [List](#fabric_list)
- [ListByResourceGroup](#fabric_listbyresourcegroup)
- [Update](#fabric_update)

## FabricOperationsStatus

- [Get](#fabricoperationsstatus_get)

## Operations

- [List](#operations_list)

## Policy

- [Create](#policy_create)
- [Delete](#policy_delete)
- [Get](#policy_get)
- [List](#policy_list)

## PolicyOperationStatus

- [Get](#policyoperationstatus_get)

## ProtectedItem

- [Create](#protecteditem_create)
- [Delete](#protecteditem_delete)
- [Get](#protecteditem_get)
- [List](#protecteditem_list)
- [PlannedFailover](#protecteditem_plannedfailover)

## ProtectedItemOperationStatus

- [Get](#protecteditemoperationstatus_get)

## RecoveryPoints

- [Get](#recoverypoints_get)
- [List](#recoverypoints_list)

## ReplicationExtension

- [Create](#replicationextension_create)
- [Delete](#replicationextension_delete)
- [Get](#replicationextension_get)
- [List](#replicationextension_list)

## ReplicationExtensionOperationStatus

- [Get](#replicationextensionoperationstatus_get)

## ResourceProvider

- [CheckNameAvailability](#resourceprovider_checknameavailability)
- [DeploymentPreflight](#resourceprovider_deploymentpreflight)

## Vault

- [Create](#vault_create)
- [Delete](#vault_delete)
- [GetByResourceGroup](#vault_getbyresourcegroup)
- [List](#vault_list)
- [ListByResourceGroup](#vault_listbyresourcegroup)
- [Update](#vault_update)

## VaultOperationStatus

- [Get](#vaultoperationstatus_get)

## Workflow

- [Get](#workflow_get)
- [List](#workflow_list)

## WorkflowOperationStatus

- [Get](#workflowoperationstatus_get)
### Dra_Create

```java
import com.azure.resourcemanager.azuresiterecovery.models.DraModelCustomProperties;
import com.azure.resourcemanager.azuresiterecovery.models.DraModelProperties;
import com.azure.resourcemanager.azuresiterecovery.models.IdentityModel;
import java.util.HashMap;
import java.util.Map;

/** Samples for Dra Create. */
public final class DraCreateSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Dra_Create.json
     */
    /**
     * Sample code: Dra_Create.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void draCreate(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .dras()
            .define("sadawf")
            .withExistingReplicationFabric("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "v8oR")
            .withProperties(
                new DraModelProperties()
                    .withMachineId("qqbo")
                    .withMachineName("nd")
                    .withAuthenticationIdentity(
                        new IdentityModel()
                            .withTenantId("isxfkwqslysiuvtmimrthgqjs")
                            .withApplicationId("ituidojcyyqmbdpts")
                            .withObjectId("wcbtacnvxbdpravrezuckanp")
                            .withAudience("ojobrkdozzjiukkbshaacxyw")
                            .withAadAuthority("dlddohzrwa"))
                    .withResourceAccessIdentity(
                        new IdentityModel()
                            .withTenantId("isxfkwqslysiuvtmimrthgqjs")
                            .withApplicationId("ituidojcyyqmbdpts")
                            .withObjectId("wcbtacnvxbdpravrezuckanp")
                            .withAudience("ojobrkdozzjiukkbshaacxyw")
                            .withAadAuthority("dlddohzrwa"))
                    .withCustomProperties(new DraModelCustomProperties()))
            .withTags(mapOf("key6615", "fakeTokenPlaceholder"))
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

### Dra_Delete

```java
/** Samples for Dra Delete. */
public final class DraDeleteSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Dra_Delete.json
     */
    /**
     * Sample code: Dra_Delete.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void draDelete(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .dras()
            .delete("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "8", "mLn", com.azure.core.util.Context.NONE);
    }
}
```

### Dra_Get

```java
/** Samples for Dra Get. */
public final class DraGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Dra_Get.json
     */
    /**
     * Sample code: Dra_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void draGet(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .dras()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "n5k", "hu", com.azure.core.util.Context.NONE);
    }
}
```

### Dra_List

```java
/** Samples for Dra List. */
public final class DraListSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Dra_List.json
     */
    /**
     * Sample code: Dra_List.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void draList(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager.dras().list("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "r", com.azure.core.util.Context.NONE);
    }
}
```

### DraOperationStatus_Get

```java
/** Samples for DraOperationStatus Get. */
public final class DraOperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/DraOperationStatus_Get.json
     */
    /**
     * Sample code: DraOperationStatus_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void draOperationStatusGet(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .draOperationStatus()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "asdaf",
                "5Mx",
                "dnhsoeduafruapvlhmrpv",
                com.azure.core.util.Context.NONE);
    }
}
```

### EmailConfiguration_Create

```java
import com.azure.resourcemanager.azuresiterecovery.models.EmailConfigurationModelProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for EmailConfiguration Create. */
public final class EmailConfigurationCreateSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/EmailConfiguration_Create.json
     */
    /**
     * Sample code: EmailConfiguration_Create.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void emailConfigurationCreate(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .emailConfigurations()
            .define("2gh1")
            .withExistingReplicationVault("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "Q3")
            .withProperties(
                new EmailConfigurationModelProperties()
                    .withSendToOwners(true)
                    .withCustomEmailAddresses(Arrays.asList("fbohqgyk"))
                    .withLocale("etpujjkmy"))
            .withTags(mapOf("key9048", "fakeTokenPlaceholder"))
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

### EmailConfiguration_Get

```java
/** Samples for EmailConfiguration Get. */
public final class EmailConfigurationGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/EmailConfiguration_Get.json
     */
    /**
     * Sample code: EmailConfiguration_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void emailConfigurationGet(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .emailConfigurations()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "DF", "SB", com.azure.core.util.Context.NONE);
    }
}
```

### EmailConfiguration_List

```java
/** Samples for EmailConfiguration List. */
public final class EmailConfigurationListSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/EmailConfiguration_List.json
     */
    /**
     * Sample code: EmailConfiguration_List.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void emailConfigurationList(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .emailConfigurations()
            .list("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "ud4B", com.azure.core.util.Context.NONE);
    }
}
```

### Event_Get

```java
/** Samples for Event Get. */
public final class EventGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Event_Get.json
     */
    /**
     * Sample code: Event_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void eventGet(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .events()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "PJm2J", "ZC", com.azure.core.util.Context.NONE);
    }
}
```

### Event_List

```java
/** Samples for Event List. */
public final class EventListSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Event_List.json
     */
    /**
     * Sample code: Event_List.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void eventList(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .events()
            .list(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "grere",
                "xkwyxkbg",
                "ugozgayljveditcymceeg",
                com.azure.core.util.Context.NONE);
    }
}
```

### Fabric_Create

```java
import com.azure.resourcemanager.azuresiterecovery.models.FabricModelCustomProperties;
import com.azure.resourcemanager.azuresiterecovery.models.FabricModelProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for Fabric Create. */
public final class FabricCreateSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Fabric_Create.json
     */
    /**
     * Sample code: Fabric_Create.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void fabricCreate(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .fabrics()
            .define("W7M")
            .withRegion("uwaciaycylrtlyjvzmjhks")
            .withExistingResourceGroup("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger")
            .withProperties(new FabricModelProperties().withCustomProperties(new FabricModelCustomProperties()))
            .withTags(mapOf("key7525", "fakeTokenPlaceholder"))
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

### Fabric_Delete

```java
/** Samples for Fabric Delete. */
public final class FabricDeleteSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Fabric_Delete.json
     */
    /**
     * Sample code: Fabric_Delete.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void fabricDelete(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .fabrics()
            .delete("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "u", com.azure.core.util.Context.NONE);
    }
}
```

### Fabric_GetByResourceGroup

```java
/** Samples for Fabric GetByResourceGroup. */
public final class FabricGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Fabric_Get.json
     */
    /**
     * Sample code: Fabric_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void fabricGet(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .fabrics()
            .getByResourceGroupWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "F7y", com.azure.core.util.Context.NONE);
    }
}
```

### Fabric_List

```java
/** Samples for Fabric List. */
public final class FabricListSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Fabric_ListBySubscription.json
     */
    /**
     * Sample code: Fabric_ListBySubscription.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void fabricListBySubscription(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .fabrics()
            .list(
                "F54CB756-7975-47ED-801D-13022DECC2C4", "mafbtnakyeplzevlofspoomzok", com.azure.core.util.Context.NONE);
    }
}
```

### Fabric_ListByResourceGroup

```java
/** Samples for Fabric ListByResourceGroup. */
public final class FabricListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Fabric_List.json
     */
    /**
     * Sample code: Fabric_List.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void fabricList(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .fabrics()
            .listByResourceGroup(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "pviznrezcqtxcvmlnoeafqzvzrtq",
                com.azure.core.util.Context.NONE);
    }
}
```

### Fabric_Update

```java
import com.azure.resourcemanager.azuresiterecovery.models.FabricModel;
import com.azure.resourcemanager.azuresiterecovery.models.FabricModelCustomProperties;
import com.azure.resourcemanager.azuresiterecovery.models.FabricModelProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for Fabric Update. */
public final class FabricUpdateSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Fabric_Update.json
     */
    /**
     * Sample code: Fabric_Update.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void fabricUpdate(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        FabricModel resource =
            manager
                .fabrics()
                .getByResourceGroupWithResponse(
                    "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "7J3", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key3608", "fakeTokenPlaceholder"))
            .withProperties(new FabricModelProperties().withCustomProperties(new FabricModelCustomProperties()))
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

### FabricOperationsStatus_Get

```java
/** Samples for FabricOperationsStatus Get. */
public final class FabricOperationsStatusGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/FabricOperationsStatus_Get.json
     */
    /**
     * Sample code: FabricOperationsStatus_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void fabricOperationsStatusGet(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .fabricOperationsStatus()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "62",
                "moblapxwhgwqzdvbhfrhwplrufyhh",
                com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void operationsList(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager.operations().listWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### Policy_Create

```java
import com.azure.resourcemanager.azuresiterecovery.models.PolicyModelCustomProperties;
import com.azure.resourcemanager.azuresiterecovery.models.PolicyModelProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for Policy Create. */
public final class PolicyCreateSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Policy_Create.json
     */
    /**
     * Sample code: Policy_Create.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void policyCreate(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .policies()
            .define("8I5")
            .withExistingReplicationVault("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "2l")
            .withProperties(new PolicyModelProperties().withCustomProperties(new PolicyModelCustomProperties()))
            .withTags(mapOf("key2293", "fakeTokenPlaceholder"))
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

### Policy_Delete

```java
/** Samples for Policy Delete. */
public final class PolicyDeleteSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Policy_Delete.json
     */
    /**
     * Sample code: Policy_Delete.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void policyDelete(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .policies()
            .delete(
                "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "3", "JuN2S", com.azure.core.util.Context.NONE);
    }
}
```

### Policy_Get

```java
/** Samples for Policy Get. */
public final class PolicyGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Policy_Get.json
     */
    /**
     * Sample code: Policy_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void policyGet(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .policies()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "n", "wgewg", com.azure.core.util.Context.NONE);
    }
}
```

### Policy_List

```java
/** Samples for Policy List. */
public final class PolicyListSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Policy_List.json
     */
    /**
     * Sample code: Policy_List.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void policyList(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .policies()
            .list("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "gregv", com.azure.core.util.Context.NONE);
    }
}
```

### PolicyOperationStatus_Get

```java
/** Samples for PolicyOperationStatus Get. */
public final class PolicyOperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/PolicyOperationStatus_Get.json
     */
    /**
     * Sample code: PolicyOperationStatus_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void policyOperationStatusGet(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .policyOperationStatus()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "OIS",
                "l",
                "mgyprzdshtrfeciw",
                com.azure.core.util.Context.NONE);
    }
}
```

### ProtectedItem_Create

```java
import com.azure.resourcemanager.azuresiterecovery.models.ProtectedItemModelCustomProperties;
import com.azure.resourcemanager.azuresiterecovery.models.ProtectedItemModelProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for ProtectedItem Create. */
public final class ProtectedItemCreateSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/ProtectedItem_Create.json
     */
    /**
     * Sample code: ProtectedItem_Create.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void protectedItemCreate(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .protectedItems()
            .define("LWP")
            .withExistingReplicationVault("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "BhJ")
            .withProperties(
                new ProtectedItemModelProperties()
                    .withPolicyName("wkersxyscsdgzeqbwoukend")
                    .withReplicationExtensionName("bgmmup")
                    .withCustomProperties(new ProtectedItemModelCustomProperties()))
            .withTags(mapOf("key3715", "fakeTokenPlaceholder"))
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

### ProtectedItem_Delete

```java
/** Samples for ProtectedItem Delete. */
public final class ProtectedItemDeleteSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/ProtectedItem_Delete.json
     */
    /**
     * Sample code: ProtectedItem_Delete.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void protectedItemDelete(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .protectedItems()
            .delete(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "nQHH",
                "Wo",
                true,
                com.azure.core.util.Context.NONE);
    }
}
```

### ProtectedItem_Get

```java
/** Samples for ProtectedItem Get. */
public final class ProtectedItemGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/ProtectedItem_Get.json
     */
    /**
     * Sample code: ProtectedItem_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void protectedItemGet(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .protectedItems()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "pUS", "1nn", com.azure.core.util.Context.NONE);
    }
}
```

### ProtectedItem_List

```java
/** Samples for ProtectedItem List. */
public final class ProtectedItemListSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/ProtectedItem_List.json
     */
    /**
     * Sample code: ProtectedItem_List.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void protectedItemList(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .protectedItems()
            .list("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "6", com.azure.core.util.Context.NONE);
    }
}
```

### ProtectedItem_PlannedFailover

```java
import com.azure.resourcemanager.azuresiterecovery.fluent.models.PlannedFailoverModelInner;
import com.azure.resourcemanager.azuresiterecovery.models.PlannedFailoverModelCustomProperties;
import com.azure.resourcemanager.azuresiterecovery.models.PlannedFailoverModelProperties;

/** Samples for ProtectedItem PlannedFailover. */
public final class ProtectedItemPlannedFailoverSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/ProtectedItem_PlannedFailover.json
     */
    /**
     * Sample code: ProtectedItem_PlannedFailover.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void protectedItemPlannedFailover(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .protectedItems()
            .plannedFailover(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "wefhs",
                "B",
                new PlannedFailoverModelInner()
                    .withProperties(
                        new PlannedFailoverModelProperties()
                            .withCustomProperties(new PlannedFailoverModelCustomProperties())),
                com.azure.core.util.Context.NONE);
    }
}
```

### ProtectedItemOperationStatus_Get

```java
/** Samples for ProtectedItemOperationStatus Get. */
public final class ProtectedItemOperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/ProtectedItemOperationStatus_Get.json
     */
    /**
     * Sample code: ProtectedItemOperationStatus_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void protectedItemOperationStatusGet(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .protectedItemOperationStatus()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "Qb0o5",
                "NO",
                "ryjiwtlbkzbmxutomlkmhyq",
                com.azure.core.util.Context.NONE);
    }
}
```

### RecoveryPoints_Get

```java
/** Samples for RecoveryPoints Get. */
public final class RecoveryPointsGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/RecoveryPoints_Get.json
     */
    /**
     * Sample code: RecoveryPoints_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void recoveryPointsGet(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .recoveryPoints()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "y0",
                "Q",
                "7gc4X3",
                com.azure.core.util.Context.NONE);
    }
}
```

### RecoveryPoints_List

```java
/** Samples for RecoveryPoints List. */
public final class RecoveryPointsListSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/RecoveryPoints_List.json
     */
    /**
     * Sample code: RecoveryPoints_List.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void recoveryPointsList(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .recoveryPoints()
            .list("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "OUy", "JOW", com.azure.core.util.Context.NONE);
    }
}
```

### ReplicationExtension_Create

```java
import com.azure.resourcemanager.azuresiterecovery.models.ReplicationExtensionModelCustomProperties;
import com.azure.resourcemanager.azuresiterecovery.models.ReplicationExtensionModelProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for ReplicationExtension Create. */
public final class ReplicationExtensionCreateSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/ReplicationExtension_Create.json
     */
    /**
     * Sample code: ReplicationExtension_Create.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void replicationExtensionCreate(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .replicationExtensions()
            .define("VXP")
            .withExistingReplicationVault("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "h")
            .withProperties(
                new ReplicationExtensionModelProperties()
                    .withCustomProperties(new ReplicationExtensionModelCustomProperties()))
            .withTags(mapOf("key2930", "fakeTokenPlaceholder"))
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

### ReplicationExtension_Delete

```java
/** Samples for ReplicationExtension Delete. */
public final class ReplicationExtensionDeleteSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/ReplicationExtension_Delete.json
     */
    /**
     * Sample code: ReplicationExtension_Delete.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void replicationExtensionDelete(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .replicationExtensions()
            .delete("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "NT", "t", com.azure.core.util.Context.NONE);
    }
}
```

### ReplicationExtension_Get

```java
/** Samples for ReplicationExtension Get. */
public final class ReplicationExtensionGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/ReplicationExtension_Get.json
     */
    /**
     * Sample code: ReplicationExtension_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void replicationExtensionGet(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .replicationExtensions()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "CFG", "gewgsv", com.azure.core.util.Context.NONE);
    }
}
```

### ReplicationExtension_List

```java
/** Samples for ReplicationExtension List. */
public final class ReplicationExtensionListSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/ReplicationExtension_List.json
     */
    /**
     * Sample code: ReplicationExtension_List.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void replicationExtensionList(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .replicationExtensions()
            .list("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "V4", com.azure.core.util.Context.NONE);
    }
}
```

### ReplicationExtensionOperationStatus_Get

```java
/** Samples for ReplicationExtensionOperationStatus Get. */
public final class ReplicationExtensionOperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/ReplicationExtensionOperationStatus_Get.json
     */
    /**
     * Sample code: ReplicationExtensionOperationStatus_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void replicationExtensionOperationStatusGet(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .replicationExtensionOperationStatus()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "vY4S",
                "LRZ6D",
                "agvkhcmqbhygtefyjewgnjer",
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_CheckNameAvailability

```java
import com.azure.resourcemanager.azuresiterecovery.models.CheckNameAvailabilityModel;

/** Samples for ResourceProvider CheckNameAvailability. */
public final class ResourceProviderCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/CheckNameAvailability.json
     */
    /**
     * Sample code: CheckNameAvailability.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void checkNameAvailability(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .resourceProviders()
            .checkNameAvailabilityWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rhphzrlthljfyepihivbbh",
                new CheckNameAvailabilityModel().withName("spxiqxsnkothc").withType("msvmjolsdiixfohtrhvtrsyitqmhu"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_DeploymentPreflight

```java
import com.azure.resourcemanager.azuresiterecovery.fluent.models.DeploymentPreflightModelInner;
import com.azure.resourcemanager.azuresiterecovery.models.DeploymentPreflightResource;
import java.util.Arrays;

/** Samples for ResourceProvider DeploymentPreflight. */
public final class ResourceProviderDeploymentPreflightSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/DeploymentPreflight.json
     */
    /**
     * Sample code: DeploymentPreflight.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void deploymentPreflight(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .resourceProviders()
            .deploymentPreflightWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "jxwoikmyckylbbg",
                new DeploymentPreflightModelInner()
                    .withResources(
                        Arrays
                            .asList(
                                new DeploymentPreflightResource()
                                    .withName("xmoagfsudwmcptehyxmyjlcfztqxn")
                                    .withType("ajyzszxgmxrsguznwmdbperbsn")
                                    .withLocation("oqnvkoi")
                                    .withApiVersion("xpwcnotkujocfkom"))),
                com.azure.core.util.Context.NONE);
    }
}
```

### Vault_Create

```java
import com.azure.resourcemanager.azuresiterecovery.models.ReplicationVaultType;
import com.azure.resourcemanager.azuresiterecovery.models.VaultModelProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for Vault Create. */
public final class VaultCreateSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Vault_Create.json
     */
    /**
     * Sample code: Vault_Create.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void vaultCreate(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .vaults()
            .define("3tD5L")
            .withRegion("zozkmgrbwqnhfoeugrerkutff")
            .withExistingResourceGroup("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger")
            .withTags(mapOf("key3404", "fakeTokenPlaceholder"))
            .withProperties(new VaultModelProperties().withVaultType(ReplicationVaultType.DISASTER_RECOVERY))
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

### Vault_Delete

```java
/** Samples for Vault Delete. */
public final class VaultDeleteSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Vault_Delete.json
     */
    /**
     * Sample code: Vault_Delete.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void vaultDelete(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .vaults()
            .delete("F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "QC", com.azure.core.util.Context.NONE);
    }
}
```

### Vault_GetByResourceGroup

```java
/** Samples for Vault GetByResourceGroup. */
public final class VaultGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Vault_Get.json
     */
    /**
     * Sample code: Vault_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void vaultGet(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .vaults()
            .getByResourceGroupWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "myRN", com.azure.core.util.Context.NONE);
    }
}
```

### Vault_List

```java
/** Samples for Vault List. */
public final class VaultListSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Vault_ListBySubscription.json
     */
    /**
     * Sample code: Vault_ListBySubscription.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void vaultListBySubscription(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .vaults()
            .list("F54CB756-7975-47ED-801D-13022DECC2C4", "zrlojqdscbslgbdtu", com.azure.core.util.Context.NONE);
    }
}
```

### Vault_ListByResourceGroup

```java
/** Samples for Vault ListByResourceGroup. */
public final class VaultListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Vault_List.json
     */
    /**
     * Sample code: Vault_List.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void vaultList(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .vaults()
            .listByResourceGroup(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "psjauvutqupvflsgopjcwbdmxcxiou",
                com.azure.core.util.Context.NONE);
    }
}
```

### Vault_Update

```java
import com.azure.resourcemanager.azuresiterecovery.models.ReplicationVaultType;
import com.azure.resourcemanager.azuresiterecovery.models.VaultModel;
import com.azure.resourcemanager.azuresiterecovery.models.VaultModelProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for Vault Update. */
public final class VaultUpdateSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Vault_Update.json
     */
    /**
     * Sample code: Vault_Update.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void vaultUpdate(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        VaultModel resource =
            manager
                .vaults()
                .getByResourceGroupWithResponse(
                    "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "rC", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key1542", "fakeTokenPlaceholder"))
            .withProperties(new VaultModelProperties().withVaultType(ReplicationVaultType.DISASTER_RECOVERY))
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

### VaultOperationStatus_Get

```java
/** Samples for VaultOperationStatus Get. */
public final class VaultOperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/VaultOperationStatus_Get.json
     */
    /**
     * Sample code: VaultOperationStatus_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void vaultOperationStatusGet(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .vaultOperationStatus()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "fwefw",
                "daupxaufefhdhhukh",
                com.azure.core.util.Context.NONE);
    }
}
```

### Workflow_Get

```java
/** Samples for Workflow Get. */
public final class WorkflowGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Workflow_Get.json
     */
    /**
     * Sample code: Workflow_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void workflowGet(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .workflows()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4", "rgswagger", "BXN", "Sw6", com.azure.core.util.Context.NONE);
    }
}
```

### Workflow_List

```java
/** Samples for Workflow List. */
public final class WorkflowListSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Workflow_List.json
     */
    /**
     * Sample code: Workflow_List.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void workflowList(com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .workflows()
            .list(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "a",
                "dqzvfzgkbsxgrgbtkghinmwuedozwg",
                "uwxenmgzjzdpbtghaemvsif",
                com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowOperationStatus_Get

```java
/** Samples for WorkflowOperationStatus Get. */
public final class WorkflowOperationStatusGetSamples {
    /*
     * x-ms-original-file: specification/azuresiterecovery/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/WorkflowOperationStatus_Get.json
     */
    /**
     * Sample code: WorkflowOperationStatus_Get.
     *
     * @param manager Entry point to AzureSiteRecoveryManager.
     */
    public static void workflowOperationStatusGet(
        com.azure.resourcemanager.azuresiterecovery.AzureSiteRecoveryManager manager) {
        manager
            .workflowOperationStatus()
            .getWithResponse(
                "F54CB756-7975-47ED-801D-13022DECC2C4",
                "rgswagger",
                "VXx",
                "mZspe",
                "jdebmev",
                com.azure.core.util.Context.NONE);
    }
}
```

