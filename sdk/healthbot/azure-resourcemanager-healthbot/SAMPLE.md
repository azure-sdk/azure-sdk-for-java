# Code snippets and samples


## Bots

- [List](#bots_list)
- [ListByResourceGroup](#bots_listbyresourcegroup)
- [ListSecrets](#bots_listsecrets)
- [RegenerateApiJwtSecret](#bots_regenerateapijwtsecret)

## Operations

- [List](#operations_list)
### Bots_List

```java
/**
 * Samples for Bots List.
 */
public final class BotsListSamples {
    /*
     * x-ms-original-file: specification/healthbot/resource-manager/Microsoft.HealthBot/stable/2023-05-01/examples/ListBotsBySubscription.json
     */
    /**
     * Sample code: List Bots by Subscription.
     * 
     * @param manager Entry point to HealthbotManager.
     */
    public static void listBotsBySubscription(com.azure.resourcemanager.healthbot.HealthbotManager manager) {
        manager.bots().list(com.azure.core.util.Context.NONE);
    }
}
```

### Bots_ListByResourceGroup

```java
/**
 * Samples for Bots ListByResourceGroup.
 */
public final class BotsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/healthbot/resource-manager/Microsoft.HealthBot/stable/2023-05-01/examples/ListBotsByResourceGroup.json
     */
    /**
     * Sample code: List Bots by Resource Group.
     * 
     * @param manager Entry point to HealthbotManager.
     */
    public static void listBotsByResourceGroup(com.azure.resourcemanager.healthbot.HealthbotManager manager) {
        manager.bots().listByResourceGroup("OneResourceGroupName", com.azure.core.util.Context.NONE);
    }
}
```

### Bots_ListSecrets

```java
/**
 * Samples for Bots ListSecrets.
 */
public final class BotsListSecretsSamples {
    /*
     * x-ms-original-file: specification/healthbot/resource-manager/Microsoft.HealthBot/stable/2023-05-01/examples/ListSecrets.json
     */
    /**
     * Sample code: Bot List Secrets.
     * 
     * @param manager Entry point to HealthbotManager.
     */
    public static void botListSecrets(com.azure.resourcemanager.healthbot.HealthbotManager manager) {
        manager.bots().listSecretsWithResponse("healthbotClient", "samplebotname", com.azure.core.util.Context.NONE);
    }
}
```

### Bots_RegenerateApiJwtSecret

```java
/**
 * Samples for Bots RegenerateApiJwtSecret.
 */
public final class BotsRegenerateApiJwtSecretSamples {
    /*
     * x-ms-original-file: specification/healthbot/resource-manager/Microsoft.HealthBot/stable/2023-05-01/examples/RegenerateApiJwtSecret.json
     */
    /**
     * Sample code: Bot Regenerate API JWT Secret.
     * 
     * @param manager Entry point to HealthbotManager.
     */
    public static void botRegenerateAPIJWTSecret(com.azure.resourcemanager.healthbot.HealthbotManager manager) {
        manager.bots()
            .regenerateApiJwtSecretWithResponse("healthbotClient", "samplebotname", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/healthbot/resource-manager/Microsoft.HealthBot/stable/2023-05-01/examples/GetOperations.json
     */
    /**
     * Sample code: Get Operations.
     * 
     * @param manager Entry point to HealthbotManager.
     */
    public static void getOperations(com.azure.resourcemanager.healthbot.HealthbotManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

