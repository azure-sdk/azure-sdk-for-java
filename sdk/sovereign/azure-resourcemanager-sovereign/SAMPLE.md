# Code snippets and samples


## LandingZoneAccountOperations

- [Create](#landingzoneaccountoperations_create)
- [Delete](#landingzoneaccountoperations_delete)
- [GetByResourceGroup](#landingzoneaccountoperations_getbyresourcegroup)
- [List](#landingzoneaccountoperations_list)
- [ListByResourceGroup](#landingzoneaccountoperations_listbyresourcegroup)
- [Update](#landingzoneaccountoperations_update)

## LandingZoneConfigurationOperations

- [Create](#landingzoneconfigurationoperations_create)
- [CreateCopy](#landingzoneconfigurationoperations_createcopy)
- [Delete](#landingzoneconfigurationoperations_delete)
- [GenerateLandingZone](#landingzoneconfigurationoperations_generatelandingzone)
- [Get](#landingzoneconfigurationoperations_get)
- [ListByResourceGroup](#landingzoneconfigurationoperations_listbyresourcegroup)
- [ListBySubscription](#landingzoneconfigurationoperations_listbysubscription)
- [Update](#landingzoneconfigurationoperations_update)
- [UpdateAuthoringStatus](#landingzoneconfigurationoperations_updateauthoringstatus)

## LandingZoneRegistrationOperations

- [Create](#landingzoneregistrationoperations_create)
- [Delete](#landingzoneregistrationoperations_delete)
- [Get](#landingzoneregistrationoperations_get)
- [ListByResourceGroup](#landingzoneregistrationoperations_listbyresourcegroup)
- [ListBySubscription](#landingzoneregistrationoperations_listbysubscription)
- [Update](#landingzoneregistrationoperations_update)

## Operations

- [List](#operations_list)
### LandingZoneAccountOperations_Create

```java
import com.azure.resourcemanager.sovereign.models.LandingZoneAccountResourceProperties;
import com.azure.resourcemanager.sovereign.models.ManagedServiceIdentity;
import com.azure.resourcemanager.sovereign.models.ManagedServiceIdentityType;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for LandingZoneAccountOperations Create.
 */
public final class LandingZoneAccountOperationsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneAccountOperations_Create.json
     */
    /**
     * Sample code: LandingZoneAccountOperations_Create.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneAccountOperationsCreate(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneAccountOperations()
            .define("ExampleLZA")
            .withRegion("northeurope")
            .withExistingResourceGroup("ExampleResourceGroup")
            .withTags(mapOf("tag1", "MCFS"))
            .withProperties(new LandingZoneAccountResourceProperties().withStorageAccount(
                "/subscriptions/22b62f96-c8d5-4131-97f8-f820a5a3c55f/resourceGroups/TestStorageAccount/providers/Microsoft.Storage/storageAccounts/teststcontainer"))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
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

### LandingZoneAccountOperations_Delete

```java
/**
 * Samples for LandingZoneAccountOperations Delete.
 */
public final class LandingZoneAccountOperationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneAccountOperations_Delete.json
     */
    /**
     * Sample code: LandingZoneAccountOperations_Delete.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneAccountOperationsDelete(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneAccountOperations()
            .delete("ExampleResourceGroup", "ExampleLZA", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneAccountOperations_GetByResourceGroup

```java
/**
 * Samples for LandingZoneAccountOperations GetByResourceGroup.
 */
public final class LandingZoneAccountOperationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneAccountOperations_Get.json
     */
    /**
     * Sample code: LandingZoneAccountOperations_Get.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void landingZoneAccountOperationsGet(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneAccountOperations()
            .getByResourceGroupWithResponse("ExampleResourceGroup", "ExampleLZA", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneAccountOperations_List

```java
/**
 * Samples for LandingZoneAccountOperations List.
 */
public final class LandingZoneAccountOperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneAccountOperations_ListBySubscription.json
     */
    /**
     * Sample code: LandingZoneAccountOperations_ListBySubscription.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneAccountOperationsListBySubscription(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneAccountOperations().list(com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneAccountOperations_ListByResourceGroup

```java
/**
 * Samples for LandingZoneAccountOperations ListByResourceGroup.
 */
public final class LandingZoneAccountOperationsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneAccountOperations_ListByResourceGroup.json
     */
    /**
     * Sample code: LandingZoneAccountOperations_ListByResourceGroup_MaximumSet_Gen - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void landingZoneAccountOperationsListByResourceGroupMaximumSetGenGeneratedByMaximumSetRule(
        com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneAccountOperations().listByResourceGroup("rgsovereign", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneAccountOperations_Update

```java
import com.azure.resourcemanager.sovereign.models.AzureResourceManagerCommonTypesManagedServiceIdentityUpdate;
import com.azure.resourcemanager.sovereign.models.LandingZoneAccountResource;
import com.azure.resourcemanager.sovereign.models.LandingZoneAccountResourcePropertiesUpdate;
import com.azure.resourcemanager.sovereign.models.ManagedServiceIdentityType;

/**
 * Samples for LandingZoneAccountOperations Update.
 */
public final class LandingZoneAccountOperationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneAccountOperations_Update.json
     */
    /**
     * Sample code: LandingZoneAccountOperations_Update.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneAccountOperationsUpdate(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        LandingZoneAccountResource resource = manager.landingZoneAccountOperations()
            .getByResourceGroupWithResponse("ExampleResourceGroup", "ExampleLZA", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new LandingZoneAccountResourcePropertiesUpdate().withStorageAccount(
                "/subscriptions/22b62f96-c8d5-4131-97f8-f820a5a3c55f/resourceGroups/TestStorageAccount/providers/Microsoft.Storage/storageAccounts/teststcontainer"))
            .withIdentity(new AzureResourceManagerCommonTypesManagedServiceIdentityUpdate()
                .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED))
            .apply();
    }
}
```

### LandingZoneConfigurationOperations_Create

```java
import com.azure.resourcemanager.sovereign.models.CustomNamingConvention;
import com.azure.resourcemanager.sovereign.models.DecommissionedManagementGroupProperties;
import com.azure.resourcemanager.sovereign.models.FirewallCreationOptions;
import com.azure.resourcemanager.sovereign.models.LandingZoneConfigurationResourceProperties;
import com.azure.resourcemanager.sovereign.models.LandingZoneManagementGroupProperties;
import com.azure.resourcemanager.sovereign.models.ManagedIdentityProperties;
import com.azure.resourcemanager.sovereign.models.ManagedIdentityResourceType;
import com.azure.resourcemanager.sovereign.models.ManagementGroupProperties;
import com.azure.resourcemanager.sovereign.models.PlatformManagementGroupProperties;
import com.azure.resourcemanager.sovereign.models.PolicyInitiativeAssignmentProperties;
import com.azure.resourcemanager.sovereign.models.ResourceCreationOptions;
import com.azure.resourcemanager.sovereign.models.ResourceType;
import com.azure.resourcemanager.sovereign.models.SandboxManagementGroupProperties;
import com.azure.resourcemanager.sovereign.models.Tags;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for LandingZoneConfigurationOperations Create.
 */
public final class LandingZoneConfigurationOperationsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneConfigurationOperations_Create.json
     */
    /**
     * Sample code: LandingZoneConfigurationOperations_Create.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneConfigurationOperationsCreate(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneConfigurationOperations()
            .define("ExampleLZC")
            .withExistingLandingZoneAccount("ExampleResourceGroup", "ExampleLZA")
            .withProperties(new LandingZoneConfigurationResourceProperties()
                .withDdosProtectionCreationOption(ResourceCreationOptions.YES)
                .withLogAnalyticsWorkspaceCreationOption(ResourceCreationOptions.NO)
                .withTags(Arrays.asList(new Tags().withName("tag1").withValue("do"),
                    new Tags().withName("tag2").withValue("do")))
                .withFirewallCreationOption(FirewallCreationOptions.STANDARD)
                .withFirewallSubnetCidrBlock("10.20.255.0/24")
                .withGatewaySubnetCidrBlock("10.20.255.0/24")
                .withLogRetentionInDays(540L)
                .withHubNetworkCidrBlock("10.20.255.0/24")
                .withAzureBastionCreationOption(ResourceCreationOptions.YES)
                .withAzureBastionSubnetCidrBlock("10.20.255.0/24")
                .withLandingZonesMgChildren(Arrays.asList(new LandingZoneManagementGroupProperties()
                    .withPolicyInitiativesAssignmentProperties(Arrays.asList(new PolicyInitiativeAssignmentProperties()
                        .withPolicyInitiativeId("c138fd1a-e08f-4318-9490-d11ef2c2f9c1")
                        .withAssignmentParameters(mapOf())))
                    .withName("Corp")))
                .withTopLevelMgMetadata(new ManagementGroupProperties().withPolicyInitiativesAssignmentProperties(
                    Arrays.asList(new PolicyInitiativeAssignmentProperties().withPolicyInitiativeId(
                        "/providers/Microsoft.Authorization/policySetDefinitions/0a2ebd47-3fb9-4735-a006-b7f31ddadd9f")
                        .withAssignmentParameters(mapOf("Effect", "Audit")))))
                .withLandingZonesMgMetadata(
                    new ManagementGroupProperties().withPolicyInitiativesAssignmentProperties(Arrays.asList()))
                .withPlatformMgMetadata(
                    new ManagementGroupProperties().withPolicyInitiativesAssignmentProperties(Arrays.asList()))
                .withPlatformManagementMgMetadata(
                    new ManagementGroupProperties().withPolicyInitiativesAssignmentProperties(Arrays.asList()))
                .withPlatformConnectivityMgMetadata(
                    new ManagementGroupProperties().withPolicyInitiativesAssignmentProperties(Arrays.asList()))
                .withPlatformIdentityMgMetadata(
                    new ManagementGroupProperties().withPolicyInitiativesAssignmentProperties(Arrays.asList()))
                .withDecommissionedMgMetadata(new DecommissionedManagementGroupProperties()
                    .withPolicyInitiativesAssignmentProperties(Arrays.asList())
                    .withCreate(false))
                .withSandboxMgMetadata(
                    new SandboxManagementGroupProperties().withPolicyInitiativesAssignmentProperties(Arrays.asList())
                        .withCreate(true))
                .withManagedIdentity(
                    new ManagedIdentityProperties().withType(ManagedIdentityResourceType.SYSTEM_ASSIGNED))
                .withPlatformMgChildren(Arrays.asList(
                    new PlatformManagementGroupProperties().withPolicyInitiativesAssignmentProperties(Arrays.asList())
                        .withName("childmg1"),
                    new PlatformManagementGroupProperties().withPolicyInitiativesAssignmentProperties(Arrays.asList())
                        .withName("childmg2")))
                .withNamingConventionFormula("{ResourceTypeAbbreviation}")
                .withCustomNamingConvention(
                    Arrays.asList(new CustomNamingConvention().withResourceType(ResourceType.AZURE_FIREWALLS)
                        .withFormula("{DeploymentSuffix}"))))
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

### LandingZoneConfigurationOperations_CreateCopy

```java
import com.azure.resourcemanager.sovereign.models.CreateLandingZoneConfigurationCopyRequest;

/**
 * Samples for LandingZoneConfigurationOperations CreateCopy.
 */
public final class LandingZoneConfigurationOperationsCreateCopySamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneConfigurationOperations_CreateCopy.json
     */
    /**
     * Sample code: LandingZoneConfigurationOperations_CreateCopy.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneConfigurationOperationsCreateCopy(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneConfigurationOperations()
            .createCopy("ExampleResourceGroup", "ExampleLZA", "ExampleLZC",
                new CreateLandingZoneConfigurationCopyRequest().withName("LandingZoneConfiguration"),
                com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneConfigurationOperations_Delete

```java
/**
 * Samples for LandingZoneConfigurationOperations Delete.
 */
public final class LandingZoneConfigurationOperationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneConfigurationOperations_Delete.json
     */
    /**
     * Sample code: LandingZoneConfigurationOperations_Delete.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneConfigurationOperationsDelete(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneConfigurationOperations()
            .delete("ExampleResourceGroup", "ExampleLZA", "ExampleLZC", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneConfigurationOperations_GenerateLandingZone

```java
import com.azure.resourcemanager.sovereign.models.GenerateLandingZoneRequest;
import com.azure.resourcemanager.sovereign.models.InfrastructureAsCodeOutputOptions;

/**
 * Samples for LandingZoneConfigurationOperations GenerateLandingZone.
 */
public final class LandingZoneConfigurationOperationsGenerateLandingZoneSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneConfigurationOperations_GenerateLandingZone.json
     */
    /**
     * Sample code: LandingZoneConfigurationOperations_GenerateLandingZone.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void landingZoneConfigurationOperationsGenerateLandingZone(
        com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneConfigurationOperations()
            .generateLandingZone("ExampleResourceGroup", "ExampleLZA", "ExampleLZC",
                new GenerateLandingZoneRequest()
                    .withInfrastructureAsCodeOutputOptions(InfrastructureAsCodeOutputOptions.BICEP)
                    .withExistingManagementSubscriptionId("/subscriptions/49804ded-c8b8-43b2-8dba-bab9dd7d81e1")
                    .withExistingIdentitySubscriptionId("/subscriptions/26211934-4ed9-4c30-b139-13bd61286867")
                    .withExistingConnectivitySubscriptionId("/subscriptions/08a376df-4789-4920-9de8-cf6900b55968")
                    .withDeploymentPrefix("mcfs")
                    .withDeploymentSuffix("test")
                    .withTopLevelMgDisplayName("TestMG")
                    .withDeploymentLocation("eastus")
                    .withOrganization("test")
                    .withEnvironment("QA"),
                com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneConfigurationOperations_Get

```java
/**
 * Samples for LandingZoneConfigurationOperations Get.
 */
public final class LandingZoneConfigurationOperationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneConfigurationOperations_Get.json
     */
    /**
     * Sample code: LandingZoneConfigurationOperations_Get_MaximumSet_Gen - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void landingZoneConfigurationOperationsGetMaximumSetGenGeneratedByMaximumSetRule(
        com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneConfigurationOperations()
            .getWithResponse("rgsovereign", "a-K18-78P-2c-33WD3e47yNxD5iwJ3-gB1C-PqU-6748-y85-c-Wu8",
                "Sj4K5xH1SJ-Ym35--O5-c8WGV7", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneConfigurationOperations_ListByResourceGroup

```java
/**
 * Samples for LandingZoneConfigurationOperations ListByResourceGroup.
 */
public final class LandingZoneConfigurationOperationsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneConfigurationOperations_ListByResourceGroup.json
     */
    /**
     * Sample code: LandingZoneConfigurationOperations_ListByResourceGroup.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void landingZoneConfigurationOperationsListByResourceGroup(
        com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneConfigurationOperations()
            .listByResourceGroup("ExampleResourceGroup", "ExampleLZA", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneConfigurationOperations_ListBySubscription

```java
/**
 * Samples for LandingZoneConfigurationOperations ListBySubscription.
 */
public final class LandingZoneConfigurationOperationsListBySubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneConfigurationOperations_ListBySubscription.json
     */
    /**
     * Sample code: LandingZoneConfigurationOperations_ListBySubscription.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void landingZoneConfigurationOperationsListBySubscription(
        com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneConfigurationOperations().listBySubscription("ExampleLZA", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneConfigurationOperations_Update

```java
import com.azure.resourcemanager.sovereign.models.CustomNamingConvention;
import com.azure.resourcemanager.sovereign.models.DecommissionedManagementGroupPropertiesUpdate;
import com.azure.resourcemanager.sovereign.models.FirewallCreationOptions;
import com.azure.resourcemanager.sovereign.models.LandingZoneConfigurationResource;
import com.azure.resourcemanager.sovereign.models.LandingZoneConfigurationResourcePropertiesUpdate;
import com.azure.resourcemanager.sovereign.models.LandingZoneManagementGroupProperties;
import com.azure.resourcemanager.sovereign.models.ManagedIdentityPropertiesUpdate;
import com.azure.resourcemanager.sovereign.models.ManagedIdentityResourceType;
import com.azure.resourcemanager.sovereign.models.ManagementGroupPropertiesUpdate;
import com.azure.resourcemanager.sovereign.models.PlatformManagementGroupProperties;
import com.azure.resourcemanager.sovereign.models.PolicyInitiativeAssignmentProperties;
import com.azure.resourcemanager.sovereign.models.ResourceCreationOptions;
import com.azure.resourcemanager.sovereign.models.ResourceType;
import com.azure.resourcemanager.sovereign.models.SandboxManagementGroupPropertiesUpdate;
import com.azure.resourcemanager.sovereign.models.Tags;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for LandingZoneConfigurationOperations Update.
 */
public final class LandingZoneConfigurationOperationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneConfigurationOperations_Update.json
     */
    /**
     * Sample code: LandingZoneConfigurationOperations_Update.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneConfigurationOperationsUpdate(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        LandingZoneConfigurationResource resource = manager.landingZoneConfigurationOperations()
            .getWithResponse("ExampleResourceGroup", "ExampleLZA", "ExampleLZC", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new LandingZoneConfigurationResourcePropertiesUpdate()
                .withDdosProtectionCreationOption(ResourceCreationOptions.YES)
                .withLogAnalyticsWorkspaceCreationOption(ResourceCreationOptions.NO)
                .withTags(Arrays.asList(new Tags().withName("tag1").withValue("do"),
                    new Tags().withName("tag2").withValue("do")))
                .withFirewallCreationOption(FirewallCreationOptions.STANDARD)
                .withFirewallSubnetCidrBlock("10.20.255.0/24")
                .withGatewaySubnetCidrBlock("10.20.255.0/24")
                .withLogRetentionInDays(540L)
                .withHubNetworkCidrBlock("10.20.255.0/24")
                .withAzureBastionCreationOption(ResourceCreationOptions.YES)
                .withAzureBastionSubnetCidrBlock("10.20.255.0/24")
                .withLandingZonesMgChildren(Arrays.asList(new LandingZoneManagementGroupProperties()
                    .withPolicyInitiativesAssignmentProperties(Arrays.asList(new PolicyInitiativeAssignmentProperties()
                        .withPolicyInitiativeId("c138fd1a-e08f-4318-9490-d11ef2c2f9c1")
                        .withAssignmentParameters(mapOf())))
                    .withName("Corp")))
                .withTopLevelMgMetadata(new ManagementGroupPropertiesUpdate().withPolicyInitiativesAssignmentProperties(
                    Arrays.asList(new PolicyInitiativeAssignmentProperties().withPolicyInitiativeId(
                        "/providers/Microsoft.Authorization/policySetDefinitions/0a2ebd47-3fb9-4735-a006-b7f31ddadd9f")
                        .withAssignmentParameters(mapOf("Effect", "Audit")))))
                .withLandingZonesMgMetadata(
                    new ManagementGroupPropertiesUpdate().withPolicyInitiativesAssignmentProperties(Arrays.asList()))
                .withPlatformMgMetadata(
                    new ManagementGroupPropertiesUpdate().withPolicyInitiativesAssignmentProperties(Arrays.asList()))
                .withPlatformManagementMgMetadata(
                    new ManagementGroupPropertiesUpdate().withPolicyInitiativesAssignmentProperties(Arrays.asList()))
                .withPlatformConnectivityMgMetadata(
                    new ManagementGroupPropertiesUpdate().withPolicyInitiativesAssignmentProperties(Arrays.asList()))
                .withPlatformIdentityMgMetadata(
                    new ManagementGroupPropertiesUpdate().withPolicyInitiativesAssignmentProperties(Arrays.asList()))
                .withDecommissionedMgMetadata(new DecommissionedManagementGroupPropertiesUpdate()
                    .withPolicyInitiativesAssignmentProperties(Arrays.asList())
                    .withCreate(false))
                .withSandboxMgMetadata(new SandboxManagementGroupPropertiesUpdate()
                    .withPolicyInitiativesAssignmentProperties(Arrays.asList())
                    .withCreate(true))
                .withManagedIdentity(
                    new ManagedIdentityPropertiesUpdate().withType(ManagedIdentityResourceType.SYSTEM_ASSIGNED))
                .withPlatformMgChildren(Arrays.asList(
                    new PlatformManagementGroupProperties().withPolicyInitiativesAssignmentProperties(Arrays.asList())
                        .withName("childmg1"),
                    new PlatformManagementGroupProperties().withPolicyInitiativesAssignmentProperties(Arrays.asList())
                        .withName("childmg2")))
                .withNamingConventionFormula("{ResourceTypeAbbreviation}")
                .withCustomNamingConvention(
                    Arrays.asList(new CustomNamingConvention().withResourceType(ResourceType.AZURE_FIREWALLS)
                        .withFormula("{DeploymentSuffix}"))))
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

### LandingZoneConfigurationOperations_UpdateAuthoringStatus

```java
import com.azure.resourcemanager.sovereign.models.AuthoringStatus;
import com.azure.resourcemanager.sovereign.models.UpdateAuthoringStatusRequest;

/**
 * Samples for LandingZoneConfigurationOperations UpdateAuthoringStatus.
 */
public final class LandingZoneConfigurationOperationsUpdateAuthoringStatusSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneConfigurationOperations_UpdateAuthoringStatus.json
     */
    /**
     * Sample code: LandingZoneConfigurationOperations_UpdateAuthoringStatus.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void landingZoneConfigurationOperationsUpdateAuthoringStatus(
        com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneConfigurationOperations()
            .updateAuthoringStatus("ExampleResourceGroup", "ExampleLZA", "ExampleLZC",
                new UpdateAuthoringStatusRequest().withAuthoringStatus(AuthoringStatus.AUTHORING),
                com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneRegistrationOperations_Create

```java
import com.azure.resourcemanager.sovereign.models.LandingZoneRegistrationResourceProperties;
import com.azure.resourcemanager.sovereign.models.ManagedIdentityProperties;
import com.azure.resourcemanager.sovereign.models.ManagedIdentityResourceType;

/**
 * Samples for LandingZoneRegistrationOperations Create.
 */
public final class LandingZoneRegistrationOperationsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneRegistrationOperations_Create.json
     */
    /**
     * Sample code: LandingZoneRegistrationOperations_Create.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneRegistrationOperationsCreate(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneRegistrationOperations()
            .define("ExampleLZR")
            .withExistingLandingZoneAccount("ExampleResourceGroup", "ExampleLZA")
            .withProperties(new LandingZoneRegistrationResourceProperties()
                .withExistingTopLevelMgId("/providers/Microsoft.Management/managementGroups/mcfs")
                .withExistingLandingZoneConfigurationId(
                    "/subscriptions/22b62f96-c8d5-4131-97f8-f820a5a3c55f/resourceGroups/TestResourceGroup/providers/Microsoft.Sovereign/landingZoneAccounts/ExampleLZA/landingZoneConfigurations/ExampleLZC")
                .withManagedIdentity(
                    new ManagedIdentityProperties().withType(ManagedIdentityResourceType.SYSTEM_ASSIGNED)))
            .create();
    }
}
```

### LandingZoneRegistrationOperations_Delete

```java
/**
 * Samples for LandingZoneRegistrationOperations Delete.
 */
public final class LandingZoneRegistrationOperationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneRegistrationOperations_Delete.json
     */
    /**
     * Sample code: LandingZoneRegistrationOperations_Delete.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneRegistrationOperationsDelete(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneRegistrationOperations()
            .deleteWithResponse("ExampleResourceGroup", "ExampleLZA", "ExampleLZR", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneRegistrationOperations_Get

```java
/**
 * Samples for LandingZoneRegistrationOperations Get.
 */
public final class LandingZoneRegistrationOperationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneRegistrationOperations_Get.json
     */
    /**
     * Sample code: LandingZoneRegistrationOperations_Get.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneRegistrationOperationsGet(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneRegistrationOperations()
            .getWithResponse("ExampleResourceGroup", "ExampleLZA", "ExampleLZR", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneRegistrationOperations_ListByResourceGroup

```java
/**
 * Samples for LandingZoneRegistrationOperations ListByResourceGroup.
 */
public final class LandingZoneRegistrationOperationsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneRegistrationOperations_ListByResourceGroup.json
     */
    /**
     * Sample code: LandingZoneRegistrationOperations_ListByResourceGroup.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void landingZoneRegistrationOperationsListByResourceGroup(
        com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneRegistrationOperations()
            .listByResourceGroup("ExampleResourceGroup", "ExampleLZA", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneRegistrationOperations_ListBySubscription

```java
/**
 * Samples for LandingZoneRegistrationOperations ListBySubscription.
 */
public final class LandingZoneRegistrationOperationsListBySubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneRegistrationOperations_ListBySubscription.json
     */
    /**
     * Sample code: LandingZoneRegistrationOperations_ListBySubscription.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void landingZoneRegistrationOperationsListBySubscription(
        com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneRegistrationOperations().listBySubscription("ExampleLZA", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneRegistrationOperations_Update

```java
import com.azure.resourcemanager.sovereign.models.LandingZoneRegistrationResource;
import com.azure.resourcemanager.sovereign.models.LandingZoneRegistrationResourcePropertiesUpdate;
import com.azure.resourcemanager.sovereign.models.ManagedIdentityPropertiesUpdate;
import com.azure.resourcemanager.sovereign.models.ManagedIdentityResourceType;

/**
 * Samples for LandingZoneRegistrationOperations Update.
 */
public final class LandingZoneRegistrationOperationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneRegistrationOperations_Update.json
     */
    /**
     * Sample code: LandingZoneRegistrationOperations_Update.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneRegistrationOperationsUpdate(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        LandingZoneRegistrationResource resource = manager.landingZoneRegistrationOperations()
            .getWithResponse("ExampleResourceGroup", "ExampleLZA", "ExampleLZR", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new LandingZoneRegistrationResourcePropertiesUpdate()
                .withExistingTopLevelMgId("/providers/Microsoft.Management/managementGroups/mcfs")
                .withExistingLandingZoneConfigurationId(
                    "/subscriptions/22b62f96-c8d5-4131-97f8-f820a5a3c55f/resourceGroups/TestResourceGroup/providers/Microsoft.Sovereign/landingZoneAccounts/ExampleLZA/landingZoneConfigurations/ExampleLZC")
                .withManagedIdentity(
                    new ManagedIdentityPropertiesUpdate().withType(ManagedIdentityResourceType.SYSTEM_ASSIGNED)))
            .apply();
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
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/Operations_List.
     * json
     */
    /**
     * Sample code: Operations_List_MaximumSet_Gen - generated by [MaximumSet] rule.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void operationsListMaximumSetGenGeneratedByMaximumSetRule(
        com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

