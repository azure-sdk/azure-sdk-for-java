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
- [List](#landingzoneconfigurationoperations_list)
- [Update](#landingzoneconfigurationoperations_update)
- [UpdateAuthoringStatus](#landingzoneconfigurationoperations_updateauthoringstatus)

## LandingZoneRegistrationOperations

- [Create](#landingzoneregistrationoperations_create)
- [Delete](#landingzoneregistrationoperations_delete)
- [Get](#landingzoneregistrationoperations_get)
- [List](#landingzoneregistrationoperations_list)
- [Update](#landingzoneregistrationoperations_update)

## Operations

- [List](#operations_list)
### LandingZoneAccountOperations_Create

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
            .updateAuthoringStatus("rg-RemApiExample", "lza-RemApiExample", "lzc-RemApiExample",
                new UpdateAuthoringStatusRequest().withAuthoringStatus(AuthoringStatus.READY_FOR_USE),
                com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneAccountOperations_Delete

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
     * Sample code: LandingZoneConfigurationOperations_Get.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneConfigurationOperationsGet(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneConfigurationOperations()
            .getWithResponse("rg-RemApiExample", "lza-RemApiExample", "lzc-RemApiExample",
                com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneAccountOperations_GetByResourceGroup

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
            .generateLandingZone("rg-RemApiExample", "lza-RemApiExample", "lzc-RemApiExample",
                new GenerateLandingZoneRequest()
                    .withInfrastructureAsCodeOutputOptions(InfrastructureAsCodeOutputOptions.BICEP)
                    .withExistingManagementSubscriptionId("/subscriptions/00000000-0000-0000-0000-000000000000")
                    .withExistingIdentitySubscriptionId("/subscriptions/00000000-0000-0000-0000-000000000000")
                    .withExistingConnectivitySubscriptionId("/subscriptions/00000000-0000-0000-0000-000000000000")
                    .withDeploymentPrefix("ex")
                    .withDeploymentSuffix("ex")
                    .withTopLevelMgDisplayName("ExampleMG")
                    .withDeploymentLocation("eastus")
                    .withOrganization("example")
                    .withEnvironment("QA"),
                com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneAccountOperations_List

```java
/**
 * Samples for LandingZoneConfigurationOperations List.
 */
public final class LandingZoneConfigurationOperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneConfigurationOperations_List.json
     */
    /**
     * Sample code: LandingZoneConfigurationOperations_List.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneConfigurationOperationsList(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneConfigurationOperations()
            .list("rg-RemApiExample", "lza-RemApiExample", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneAccountOperations_ListByResourceGroup

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
            .createCopy("rg-RemApiExample", "lza-RemApiExample", "lzc-RemApiExample",
                new CreateLandingZoneConfigurationCopyRequest().withName("lzc-RemApiExampleCopy"),
                com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneAccountOperations_Update

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
            .define("lzr-RemApiExample")
            .withExistingLandingZoneAccount("rg-RemApiExample", "lza-RemApiExample")
            .withProperties(new LandingZoneRegistrationResourceProperties()
                .withExistingTopLevelMgId("/providers/Microsoft.Management/managementGroups/mg-example")
                .withExistingLandingZoneConfigurationId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-RemApiExample/providers/Microsoft.Sovereign/landingZoneAccounts/lza-RemApiExample/landingZoneConfigurations/lzc-RemApiExample")
                .withManagedIdentity(new ManagedIdentityProperties().withType(ManagedIdentityResourceType.USER_ASSIGNED)
                    .withUserAssignedIdentityResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-RemApiExample/providers/Microsoft.ManagedIdentity/userAssignedIdentities/mi-RemApiExample")))
            .create();
    }
}
```

### LandingZoneConfigurationOperations_Create

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
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
import java.io.IOException;
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
    public static void landingZoneConfigurationOperationsCreate(
        com.azure.resourcemanager.sovereign.SovereignManager manager) throws IOException {
        manager.landingZoneConfigurationOperations()
            .define("lzc-RemApiExample")
            .withExistingLandingZoneAccount("rg-RemApiExample", "lza-RemApiExample")
            .withProperties(new LandingZoneConfigurationResourceProperties()
                .withDdosProtectionCreationOption(ResourceCreationOptions.USE_EXISTING)
                .withExistingDdosProtectionId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-RemApiExample/providers/Microsoft.Network/ddosProtectionPlans/ddos-RemApiExample")
                .withLogAnalyticsWorkspaceCreationOption(ResourceCreationOptions.USE_EXISTING)
                .withExistingLogAnalyticsWorkspaceId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-RemApiExample/providers/Microsoft.OperationalInsights/workspaces/log-RemApiExample")
                .withTags(Arrays.asList(new Tags().withName("tag1").withValue("Lorem"),
                    new Tags().withName("tag2").withValue("Ipsum")))
                .withFirewallCreationOption(FirewallCreationOptions.PREMIUM)
                .withFirewallSubnetCidrBlock("10.20.254.0/24")
                .withGatewaySubnetCidrBlock("10.20.252.0/24")
                .withLogRetentionInDays(540L)
                .withHubNetworkCidrBlock("10.20.0.0/16")
                .withAzureBastionCreationOption(ResourceCreationOptions.USE_EXISTING)
                .withExistingAzureBastionId(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-RemApiExample/providers/Microsoft.Network/bastionHosts/bas-RemApiExample")
                .withLandingZonesMgChildren(Arrays.asList(
                    new LandingZoneManagementGroupProperties()
                        .withPolicyInitiativesAssignmentProperties(Arrays.asList())
                        .withName("Corp"),
                    new LandingZoneManagementGroupProperties()
                        .withPolicyInitiativesAssignmentProperties(Arrays.asList())
                        .withName("Online"),
                    new LandingZoneManagementGroupProperties().withPolicyInitiativesAssignmentProperties(
                        Arrays.asList(new PolicyInitiativeAssignmentProperties().withPolicyInitiativeId(
                            "/providers/Microsoft.Authorization/policySetDefinitions/03de05a4-c324-4ccd-882f-a814ea8ab9ea")
                            .withAssignmentParameters(mapOf())))
                        .withName("Confidential Corp"),
                    new LandingZoneManagementGroupProperties().withPolicyInitiativesAssignmentProperties(
                        Arrays.asList(new PolicyInitiativeAssignmentProperties().withPolicyInitiativeId(
                            "/providers/Microsoft.Authorization/policySetDefinitions/03de05a4-c324-4ccd-882f-a814ea8ab9ea")
                            .withAssignmentParameters(mapOf())))
                        .withName("Confidential Online")))
                .withTopLevelMgMetadata(new ManagementGroupProperties().withPolicyInitiativesAssignmentProperties(
                    Arrays.asList(new PolicyInitiativeAssignmentProperties().withPolicyInitiativeId(
                        "/providers/Microsoft.Authorization/policySetDefinitions/c1cbff38-87c0-4b9f-9f70-035c7a3b5523")
                        .withAssignmentParameters(mapOf("listOfAllowedLocations",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("[\"swedencentral\",\"eastus2\",\"uksouth\"]", Object.class,
                                    SerializerEncoding.JSON))))))
                .withLandingZonesMgMetadata(new ManagementGroupProperties().withPolicyInitiativesAssignmentProperties(
                    Arrays.asList(new PolicyInitiativeAssignmentProperties().withPolicyInitiativeId(
                        "/providers/Microsoft.Authorization/policySetDefinitions/c1cbff38-87c0-4b9f-9f70-035c7a3b5523")
                        .withAssignmentParameters(mapOf("listOfAllowedLocations",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("[\"swedencentral\"]", Object.class, SerializerEncoding.JSON))))))
                .withPlatformMgMetadata(new ManagementGroupProperties().withPolicyInitiativesAssignmentProperties(
                    Arrays.asList(new PolicyInitiativeAssignmentProperties().withPolicyInitiativeId(
                        "/providers/Microsoft.Authorization/policySetDefinitions/c1cbff38-87c0-4b9f-9f70-035c7a3b5523")
                        .withAssignmentParameters(mapOf("listOfAllowedLocations",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("[\"swedencentral\"]", Object.class, SerializerEncoding.JSON))))))
                .withPlatformManagementMgMetadata(new ManagementGroupProperties()
                    .withPolicyInitiativesAssignmentProperties(Arrays.asList(new PolicyInitiativeAssignmentProperties()
                        .withPolicyInitiativeId(
                            "/providers/Microsoft.Authorization/policySetDefinitions/c1cbff38-87c0-4b9f-9f70-035c7a3b5523")
                        .withAssignmentParameters(mapOf("listOfAllowedLocations",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("[\"swedencentral\"]", Object.class, SerializerEncoding.JSON))))))
                .withPlatformConnectivityMgMetadata(new ManagementGroupProperties()
                    .withPolicyInitiativesAssignmentProperties(Arrays.asList(new PolicyInitiativeAssignmentProperties()
                        .withPolicyInitiativeId(
                            "/providers/Microsoft.Authorization/policySetDefinitions/c1cbff38-87c0-4b9f-9f70-035c7a3b5523")
                        .withAssignmentParameters(mapOf("listOfAllowedLocations",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("[\"swedencentral\"]", Object.class, SerializerEncoding.JSON))))))
                .withPlatformIdentityMgMetadata(new ManagementGroupProperties()
                    .withPolicyInitiativesAssignmentProperties(Arrays.asList(new PolicyInitiativeAssignmentProperties()
                        .withPolicyInitiativeId(
                            "/providers/Microsoft.Authorization/policySetDefinitions/c1cbff38-87c0-4b9f-9f70-035c7a3b5523")
                        .withAssignmentParameters(mapOf("listOfAllowedLocations",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("[\"swedencentral\"]", Object.class, SerializerEncoding.JSON))))))
                .withDecommissionedMgMetadata(new DecommissionedManagementGroupProperties()
                    .withPolicyInitiativesAssignmentProperties(Arrays.asList(new PolicyInitiativeAssignmentProperties()
                        .withPolicyInitiativeId(
                            "/providers/Microsoft.Authorization/policySetDefinitions/c1cbff38-87c0-4b9f-9f70-035c7a3b5523")
                        .withAssignmentParameters(mapOf("listOfAllowedLocations",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("[\"swedencentral\"]", Object.class, SerializerEncoding.JSON)))))
                    .withCreate(true))
                .withSandboxMgMetadata(new SandboxManagementGroupProperties().withPolicyInitiativesAssignmentProperties(
                    Arrays.asList(new PolicyInitiativeAssignmentProperties().withPolicyInitiativeId(
                        "/providers/Microsoft.Authorization/policySetDefinitions/c1cbff38-87c0-4b9f-9f70-035c7a3b5523")
                        .withAssignmentParameters(mapOf("listOfAllowedLocations",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("[\"swedencentral\"]", Object.class, SerializerEncoding.JSON)))))
                    .withCreate(true))
                .withManagedIdentity(new ManagedIdentityProperties().withType(ManagedIdentityResourceType.USER_ASSIGNED)
                    .withUserAssignedIdentityResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-RemApiExample/providers/Microsoft.ManagedIdentity/userAssignedIdentities/mi-RemApiExample"))
                .withPlatformMgChildren(Arrays.asList(new PlatformManagementGroupProperties()
                    .withPolicyInitiativesAssignmentProperties(Arrays.asList(new PolicyInitiativeAssignmentProperties()
                        .withPolicyInitiativeId(
                            "/providers/Microsoft.Authorization/policySetDefinitions/c1cbff38-87c0-4b9f-9f70-035c7a3b5523")
                        .withAssignmentParameters(mapOf("listOfAllowedLocations",
                            SerializerFactory.createDefaultManagementSerializerAdapter()
                                .deserialize("[\"swedencentral\"]", Object.class, SerializerEncoding.JSON)))))
                    .withName("Telemetry"),
                    new PlatformManagementGroupProperties().withPolicyInitiativesAssignmentProperties(
                        Arrays.asList(new PolicyInitiativeAssignmentProperties().withPolicyInitiativeId(
                            "/providers/Microsoft.Authorization/policySetDefinitions/c1cbff38-87c0-4b9f-9f70-035c7a3b5523")
                            .withAssignmentParameters(mapOf("listOfAllowedLocations",
                                SerializerFactory.createDefaultManagementSerializerAdapter()
                                    .deserialize("[\"swedencentral\"]", Object.class, SerializerEncoding.JSON)))))
                        .withName("Security")))
                .withNamingConventionFormula(
                    "{ResourceTypeAbbreviation}-{DeploymentPrefix}-Contoso-{DeploymentSuffix}-{Environment}")
                .withCustomNamingConvention(
                    Arrays.asList(new CustomNamingConvention().withResourceType(ResourceType.DDOS_PROTECTION_PLANS)
                        .withFormula("{ResourceTypeAbbreviation}-{DeploymentPrefix}-Contoso-{DeploymentSuffix}"))))
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
            .getByResourceGroupWithResponse("rg-RemApiExample", "lza-RemApiExample", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneConfigurationOperations_Delete

```java
import com.azure.resourcemanager.sovereign.models.LandingZoneAccountResource;
import com.azure.resourcemanager.sovereign.models.LandingZoneAccountResourcePropertiesUpdate;

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
            .getByResourceGroupWithResponse("rg-RemApiExample", "lza-RemApiExample", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new LandingZoneAccountResourcePropertiesUpdate().withStorageAccount(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/TestStorageAccount/providers/Microsoft.Storage/storageAccounts/saremapiexample2"))
            .apply();
    }
}
```

### LandingZoneConfigurationOperations_GenerateLandingZone

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

### LandingZoneConfigurationOperations_Get

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

### LandingZoneConfigurationOperations_List

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
            .delete("rg-RemApiExample", "lza-RemApiExample", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneConfigurationOperations_Update

```java
import com.azure.resourcemanager.sovereign.models.LandingZoneConfigurationResource;
import com.azure.resourcemanager.sovereign.models.LandingZoneConfigurationResourcePropertiesUpdate;

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
            .getWithResponse("rg-RemApiExample", "lza-RemApiExample", "lzc-RemApiExample",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new LandingZoneConfigurationResourcePropertiesUpdate().withLogRetentionInDays(300L))
            .apply();
    }
}
```

### LandingZoneConfigurationOperations_UpdateAuthoringStatus

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
            .delete("rg-RemApiExample", "lza-RemApiExample", "lzc-RemApiExample", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneRegistrationOperations_Create

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
            .deleteWithResponse("rg-RemApiExample", "lza-RemApiExample", "lzr-RemApiExample",
                com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneRegistrationOperations_Delete

```java
/**
 * Samples for LandingZoneRegistrationOperations List.
 */
public final class LandingZoneRegistrationOperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/sovereign/resource-manager/Microsoft.Sovereign/preview/2025-02-27-preview/examples/
     * LandingZoneRegistrationOperations_List.json
     */
    /**
     * Sample code: LandingZoneRegistrationOperations_List.
     * 
     * @param manager Entry point to SovereignManager.
     */
    public static void
        landingZoneRegistrationOperationsList(com.azure.resourcemanager.sovereign.SovereignManager manager) {
        manager.landingZoneRegistrationOperations()
            .list("rg-RemApiExample", "lza-RemApiExample", com.azure.core.util.Context.NONE);
    }
}
```

### LandingZoneRegistrationOperations_Get

```java
import com.azure.resourcemanager.sovereign.models.LandingZoneRegistrationResource;
import com.azure.resourcemanager.sovereign.models.LandingZoneRegistrationResourcePropertiesUpdate;

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
            .getWithResponse("rg-RemApiExample", "lza-RemApiExample", "lzr-RemApiExample",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new LandingZoneRegistrationResourcePropertiesUpdate()
                .withExistingTopLevelMgId("/providers/Microsoft.Management/managementGroups/mg-example2"))
            .apply();
    }
}
```

### LandingZoneRegistrationOperations_List

```java
import com.azure.resourcemanager.sovereign.models.LandingZoneAccountResourceProperties;
import com.azure.resourcemanager.sovereign.models.ManagedServiceIdentity;
import com.azure.resourcemanager.sovereign.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.sovereign.models.UserAssignedIdentity;
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
            .define("lza-RemApiExample")
            .withRegion("northeurope")
            .withExistingResourceGroup("rg-RemApiExample")
            .withTags(mapOf("tag1", "MCFS"))
            .withProperties(new LandingZoneAccountResourceProperties().withStorageAccount(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-RemApiExample/providers/Microsoft.Storage/storageAccounts/saremapiexample"))
            .withIdentity(new ManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.fromString("SystemAssigned, UserAssigned"))
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-RemApiExample/providers/Microsoft.ManagedIdentity/userAssignedIdentities/mi-RemApiExample",
                    new UserAssignedIdentity())))
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

### LandingZoneRegistrationOperations_Update

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
        manager.landingZoneAccountOperations()
            .listByResourceGroup("rg-RemApiExample", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

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
            .getWithResponse("rg-RemApiExample", "lza-RemApiExample", "lzr-RemApiExample",
                com.azure.core.util.Context.NONE);
    }
}
```

