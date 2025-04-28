# Code snippets and samples


## DeploymentScripts

- [Create](#deploymentscripts_create)
- [Delete](#deploymentscripts_delete)
- [GetByResourceGroup](#deploymentscripts_getbyresourcegroup)
- [GetLogs](#deploymentscripts_getlogs)
- [GetLogsDefault](#deploymentscripts_getlogsdefault)
- [List](#deploymentscripts_list)
- [ListByResourceGroup](#deploymentscripts_listbyresourcegroup)
- [Update](#deploymentscripts_update)
### DeploymentScripts_Create

```java
import com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.models.AzurePowerShellScript;
import com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.models.CleanupOptions;
import com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.models.ContainerConfiguration;
import com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.models.ContainerGroupSubnetId;
import com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.models.ManagedServiceIdentity;
import com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.models.StorageAccountConfiguration;
import com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.models.UserAssignedIdentity;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DeploymentScripts Create.
 */
public final class DeploymentScriptsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_Create_Using_Custom_Aci_Name.json
     */
    /**
     * Sample code: DeploymentScriptsCreate_UsingCustomACIName.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsCreateUsingCustomACIName(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .create("script-rg", "MyDeploymentScript", new AzurePowerShellScript()
                .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scriptRG/providers/Microsoft.ManagedIdentity/userAssignedIdentities/uai",
                        new UserAssignedIdentity())))
                .withLocation("westus")
                .withAzPowerShellVersion("1.7.0")
                .withSupportingScriptUris(
                    Arrays.asList("https://uri1.to.supporting.script", "https://uri2.to.supporting.script"))
                .withScriptContent(
                    "Param([string]$Location,[string]$Name) $deploymentScriptOutputs['test'] = 'value' Get-AzResourceGroup -Location $Location -Name $Name")
                .withArguments("-Location 'westus' -Name \"*rg2\"")
                .withRetentionInterval(Duration.parse("P7D"))
                .withTimeout(Duration.parse("PT1H"))
                .withContainerSettings(new ContainerConfiguration().withContainerGroupName("contoso-aci"))
                .withCleanupPreference(CleanupOptions.ALWAYS), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_Create_Using_Custom_Aci_Name_With_SubnetIds.json
     */
    /**
     * Sample code: DeploymentScriptsCreate_UsingAciWithSubnets.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsCreateUsingAciWithSubnets(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .create("script-rg", "MyDeploymentScript", new AzurePowerShellScript()
                .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scriptRG/providers/Microsoft.ManagedIdentity/userAssignedIdentities/uai",
                        new UserAssignedIdentity())))
                .withLocation("westus")
                .withAzPowerShellVersion("1.7.0")
                .withSupportingScriptUris(
                    Arrays.asList("https://uri1.to.supporting.script", "https://uri2.to.supporting.script"))
                .withScriptContent(
                    "Param([string]$Location,[string]$Name) $deploymentScriptOutputs['test'] = 'value' Get-AzResourceGroup -Location $Location -Name $Name")
                .withArguments("-Location 'westus' -Name \"*rg2\"")
                .withRetentionInterval(Duration.parse("P7D"))
                .withTimeout(Duration.parse("PT1H"))
                .withContainerSettings(new ContainerConfiguration().withContainerGroupName("contoso-aci")
                    .withSubnetIds(Arrays.asList(new ContainerGroupSubnetId().withId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scriptRG/providers/Microsoft.Network/virtualNetworks/scriptSubnet/subnets/subnetwork1"),
                        new ContainerGroupSubnetId().withId(
                            "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scriptRG/providers/Microsoft.Network/virtualNetworks/scriptSubnet/subnets/subnetwork2"))))
                .withCleanupPreference(CleanupOptions.ALWAYS), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_Create_Using_Existing_StorageAccount.json
     */
    /**
     * Sample code: DeploymentScriptsCreate_UsingExistingStorageAccount.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsCreateUsingExistingStorageAccount(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .create("script-rg", "MyDeploymentScript", new AzurePowerShellScript()
                .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scriptRG/providers/Microsoft.ManagedIdentity/userAssignedIdentities/uai",
                        new UserAssignedIdentity())))
                .withLocation("westus")
                .withAzPowerShellVersion("1.7.0")
                .withSupportingScriptUris(
                    Arrays.asList("https://uri1.to.supporting.script", "https://uri2.to.supporting.script"))
                .withScriptContent(
                    "Param([string]$Location,[string]$Name) $deploymentScriptOutputs['test'] = 'value' Get-AzResourceGroup -Location $Location -Name $Name")
                .withArguments("-Location 'westus' -Name \"*rg2\"")
                .withRetentionInterval(Duration.parse("P7D"))
                .withTimeout(Duration.parse("PT1H"))
                .withStorageAccountSettings(new StorageAccountConfiguration().withStorageAccountName("contosostorage")
                    .withStorageAccountKey("fakeTokenPlaceholder"))
                .withCleanupPreference(CleanupOptions.ALWAYS), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_Min_Create.json
     */
    /**
     * Sample code: DeploymentScriptsCreate_MinCreate.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsCreateMinCreate(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .create("script-rg", "MyDeploymentScript", new AzurePowerShellScript()
                .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scriptRG/providers/Microsoft.ManagedIdentity/userAssignedIdentities/uai",
                        new UserAssignedIdentity())))
                .withLocation("westus")
                .withAzPowerShellVersion("1.7.0")
                .withScriptContent(
                    "Param([string]$Location,[string]$Name) $deploymentScriptOutputs['test'] = 'value' Get-AzResourceGroup -Location $Location -Name $Name")
                .withArguments("-Location 'westus' -Name \"*rg2\"")
                .withRetentionInterval(Duration.parse("P7D")), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_Create.json
     */
    /**
     * Sample code: DeploymentScriptsCreate.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsCreate(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .create("script-rg", "MyDeploymentScript", new AzurePowerShellScript()
                .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                    .withUserAssignedIdentities(mapOf(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/scriptRG/providers/Microsoft.ManagedIdentity/userAssignedIdentities/uai",
                        new UserAssignedIdentity())))
                .withLocation("westus")
                .withAzPowerShellVersion("1.7.0")
                .withSupportingScriptUris(
                    Arrays.asList("https://uri1.to.supporting.script", "https://uri2.to.supporting.script"))
                .withScriptContent(
                    "Param([string]$Location,[string]$Name) $deploymentScriptOutputs['test'] = 'value' Get-AzResourceGroup -Location $Location -Name $Name")
                .withArguments("-Location 'westus' -Name \"*rg2\"")
                .withRetentionInterval(Duration.parse("P7D"))
                .withTimeout(Duration.parse("PT1H"))
                .withCleanupPreference(CleanupOptions.ALWAYS), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_Create_No_UserManagedIdentity.json
     */
    /**
     * Sample code: DeploymentScriptsCreateNoUserManagedIdentity.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsCreateNoUserManagedIdentity(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .create("script-rg", "MyDeploymentScript", new AzurePowerShellScript().withLocation("westus")
                .withAzPowerShellVersion("1.7.0")
                .withSupportingScriptUris(
                    Arrays.asList("https://uri1.to.supporting.script", "https://uri2.to.supporting.script"))
                .withScriptContent(
                    "Param([string]$Location,[string]$Name) $deploymentScriptOutputs['test'] = 'value' Get-AzResourceGroup -Location $Location -Name $Name")
                .withArguments("-Location 'westus' -Name \"*rg2\"")
                .withRetentionInterval(Duration.parse("P7D"))
                .withTimeout(Duration.parse("PT1H"))
                .withCleanupPreference(CleanupOptions.ALWAYS), com.azure.core.util.Context.NONE);
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

### DeploymentScripts_Delete

```java
import com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.models.DeploymentScriptUpdateParameter;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DeploymentScripts Update.
 */
public final class DeploymentScriptsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_Update.json
     */
    /**
     * Sample code: DeploymentScriptsUpdate.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsUpdate(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .updateWithResponse("script-rg", "MyDeploymentScript",
                new DeploymentScriptUpdateParameter().withTags(mapOf()), com.azure.core.util.Context.NONE);
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

### DeploymentScripts_GetByResourceGroup

```java
/**
 * Samples for DeploymentScripts Delete.
 */
public final class DeploymentScriptsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_Delete.json
     */
    /**
     * Sample code: DeploymentScriptsDelete.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsDelete(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .deleteByResourceGroupWithResponse("script-rg", "MyDeploymentScript", com.azure.core.util.Context.NONE);
    }
}
```

### DeploymentScripts_GetLogs

```java
/**
 * Samples for DeploymentScripts List.
 */
public final class DeploymentScriptsListSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_ListBySubscription.json
     */
    /**
     * Sample code: DeploymentScriptsListBySubscription.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsListBySubscription(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts().list(com.azure.core.util.Context.NONE);
    }
}
```

### DeploymentScripts_GetLogsDefault

```java
/**
 * Samples for DeploymentScripts GetLogs.
 */
public final class DeploymentScriptsGetLogsSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_GetLogs.json
     */
    /**
     * Sample code: DeploymentScriptsGetLogs.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsGetLogs(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .getLogsWithResponse("script-rg", "MyDeploymentScript", com.azure.core.util.Context.NONE);
    }
}
```

### DeploymentScripts_List

```java
/**
 * Samples for DeploymentScripts GetLogsDefault.
 */
public final class DeploymentScriptsGetLogsDefaultSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_GetLogsDefault.json
     */
    /**
     * Sample code: DeploymentScriptsGetLogs.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsGetLogs(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .getLogsDefaultWithResponse("script-rg", "MyDeploymentScript", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_GetLogsDefaultWithTail.json
     */
    /**
     * Sample code: DeploymentScriptsGetLogsWithTail.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsGetLogsWithTail(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .getLogsDefaultWithResponse("script-rg", "MyDeploymentScript", 5, com.azure.core.util.Context.NONE);
    }
}
```

### DeploymentScripts_ListByResourceGroup

```java
/**
 * Samples for DeploymentScripts ListByResourceGroup.
 */
public final class DeploymentScriptsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_ListByResourceGroup.json
     */
    /**
     * Sample code: DeploymentScriptsList.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsList(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts().listByResourceGroup("script-rg", com.azure.core.util.Context.NONE);
    }
}
```

### DeploymentScripts_Update

```java
/**
 * Samples for DeploymentScripts GetByResourceGroup.
 */
public final class DeploymentScriptsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/deploymentScripts/stable/2023-08-01/examples/
     * DeploymentScripts_Get.json
     */
    /**
     * Sample code: DeploymentScriptsGet.
     * 
     * @param manager Entry point to DeploymentScriptsManager.
     */
    public static void deploymentScriptsGet(
        com.azure.resourcemanager.resourcesmicrosoftresourcesdeploymentscripts.DeploymentScriptsManager manager) {
        manager.deploymentScripts()
            .getByResourceGroupWithResponse("script-rg", "MyDeploymentScript", com.azure.core.util.Context.NONE);
    }
}
```

