# Code snippets and samples


## Deployments

- [CalculateTemplateHash](#deployments_calculatetemplatehash)
- [CreateOrUpdate](#deployments_createorupdate)
- [CreateOrUpdateAtManagementGroupScope](#deployments_createorupdateatmanagementgroupscope)
- [CreateOrUpdateAtScope](#deployments_createorupdateatscope)
- [CreateOrUpdateAtSubscriptionScope](#deployments_createorupdateatsubscriptionscope)
- [CreateOrUpdateAtTenantScope](#deployments_createorupdateattenantscope)
- [Validate](#deployments_validate)
- [ValidateAtManagementGroupScope](#deployments_validateatmanagementgroupscope)
- [ValidateAtScope](#deployments_validateatscope)
- [ValidateAtSubscriptionScope](#deployments_validateatsubscriptionscope)
- [ValidateAtTenantScope](#deployments_validateattenantscope)
- [WhatIf](#deployments_whatif)
- [WhatIfAtManagementGroupScope](#deployments_whatifatmanagementgroupscope)
- [WhatIfAtSubscriptionScope](#deployments_whatifatsubscriptionscope)
- [WhatIfAtTenantScope](#deployments_whatifattenantscope)

## ProviderResourceTypes

- [List](#providerresourcetypes_list)

## Providers

- [Get](#providers_get)
- [GetAtTenantScope](#providers_getattenantscope)
- [List](#providers_list)
- [ProviderPermissions](#providers_providerpermissions)

## ResourceGroups

- [CreateOrUpdate](#resourcegroups_createorupdate)
- [Delete](#resourcegroups_delete)
- [ExportTemplate](#resourcegroups_exporttemplate)

## TagOperations

- [CreateOrUpdateAtScope](#tagoperations_createorupdateatscope)
- [DeleteAtScope](#tagoperations_deleteatscope)
- [GetAtScope](#tagoperations_getatscope)
- [UpdateAtScope](#tagoperations_updateatscope)
### Deployments_CalculateTemplateHash

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;

/**
 * Samples for Deployments CalculateTemplateHash.
 */
public final class DeploymentsCalculateTemplateHashSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/CalculateTemplateHash.
     * json
     */
    /**
     * Sample code: Calculate template hash.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void calculateTemplateHash(com.azure.resourcemanager.resources.generated.ResourceManager manager)
        throws IOException {
        manager.deployments()
            .calculateTemplateHashWithResponse(SerializerFactory.createDefaultManagementSerializerAdapter()
                .deserialize(
                    "{\"$schema\":\"http://schemas.management.azure.com/deploymentTemplate?api-version=2014-04-01-preview\",\"contentVersion\":\"1.0.0.0\",\"outputs\":{\"string\":{\"type\":\"string\",\"value\":\"myvalue\"}},\"parameters\":{\"string\":{\"type\":\"string\"}},\"resources\":[],\"variables\":{\"array\":[1,2,3,4],\"bool\":true,\"int\":42,\"object\":{\"object\":{\"location\":\"West US\",\"vmSize\":\"Large\"}},\"string\":\"string\"}}",
                    Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_CreateOrUpdate

```java
import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.resources.generated.models.DeploymentExternalInput;
import com.azure.resourcemanager.resources.generated.models.DeploymentExternalInputDefinition;
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentParameter;
import com.azure.resourcemanager.resources.generated.models.DeploymentProperties;
import com.azure.resourcemanager.resources.generated.models.OnErrorDeployment;
import com.azure.resourcemanager.resources.generated.models.OnErrorDeploymentType;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments CreateOrUpdate.
 */
public final class DeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PutDeploymentWithExternalInputs.json
     */
    /**
     * Sample code: Create deployment using external inputs.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void createDeploymentUsingExternalInputs(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) throws IOException {
        manager.deployments()
            .define("my-deployment")
            .withExistingResourceGroup("my-resource-group")
            .withProperties(new DeploymentProperties().withTemplate(SerializerFactory
                .createDefaultManagementSerializerAdapter()
                .deserialize(
                    "{\"$schema\":\"https://schema.management.azure.com/schemas/2019-04-01/deploymentTemplate.json#\",\"contentVersion\":\"1.0.0.0\",\"outputs\":{\"inputObj\":{\"type\":\"object\",\"value\":\"[parameters('inputObj')]\"}},\"parameters\":{\"inputObj\":{\"type\":\"object\"}},\"resources\":[]}",
                    Object.class, SerializerEncoding.JSON))
                .withParameters(mapOf("inputObj",
                    new DeploymentParameter().withExpression("[createObject('foo', externalInputs('fooValue'))]")))
                .withExternalInputs(mapOf("fooValue", new DeploymentExternalInput().withValue("baz")))
                .withExternalInputDefinitions(mapOf("fooValue",
                    new DeploymentExternalInputDefinition().withKind("sys.envVar").withConfig("FOO_VALUE")))
                .withMode(DeploymentMode.INCREMENTAL))
            .create();
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PutDeploymentResourceGroup.json
     */
    /**
     * Sample code: Create a deployment that will deploy a template with a uri and queryString.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void createADeploymentThatWillDeployATemplateWithAUriAndQueryString(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .define("my-deployment")
            .withExistingResourceGroup("my-resource-group")
            .withProperties(new DeploymentProperties().withTemplateLink(new TemplateLink()
                .withUri("https://example.com/exampleTemplate.json")
                .withQueryString(
                    "sv=2019-02-02&st=2019-04-29T22%3A18%3A26Z&se=2019-04-30T02%3A23%3A26Z&sr=b&sp=rw&sip=168.1.5.60-168.1.5.70&spr=https&sig=xxxxxxxx0xxxxxxxxxxxxx%2bxxxxxxxxxxxxxxxxxxxx%3d"))
                .withParameters(mapOf())
                .withMode(DeploymentMode.INCREMENTAL))
            .create();
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PutDeploymentResourceGroupTemplateSpecsWithId.json
     */
    /**
     * Sample code: Create a deployment that will deploy a templateSpec with the given resourceId.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void createADeploymentThatWillDeployATemplateSpecWithTheGivenResourceId(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .define("my-deployment")
            .withExistingResourceGroup("my-resource-group")
            .withProperties(new DeploymentProperties().withTemplateLink(new TemplateLink().withId(
                "/subscriptions/00000000-0000-0000-0000-000000000001/resourceGroups/my-resource-group/providers/Microsoft.Resources/TemplateSpecs/TemplateSpec-Name/versions/v1"))
                .withParameters(mapOf())
                .withMode(DeploymentMode.INCREMENTAL))
            .create();
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PutDeploymentWithOnErrorDeploymentSpecificDeployment.json
     */
    /**
     * Sample code: Create a deployment that will redeploy another deployment on failure.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void createADeploymentThatWillRedeployAnotherDeploymentOnFailure(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .define("my-deployment")
            .withExistingResourceGroup("my-resource-group")
            .withProperties(new DeploymentProperties()
                .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                .withParameters(mapOf())
                .withMode(DeploymentMode.COMPLETE)
                .withOnErrorDeployment(new OnErrorDeployment().withType(OnErrorDeploymentType.SPECIFIC_DEPLOYMENT)
                    .withDeploymentName("name-of-deployment-to-use")))
            .create();
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PutDeploymentWithOnErrorDeploymentLastSuccessful.json
     */
    /**
     * Sample code: Create a deployment that will redeploy the last successful deployment on failure.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void createADeploymentThatWillRedeployTheLastSuccessfulDeploymentOnFailure(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .define("my-deployment")
            .withExistingResourceGroup("my-resource-group")
            .withProperties(new DeploymentProperties()
                .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                .withParameters(mapOf())
                .withMode(DeploymentMode.COMPLETE)
                .withOnErrorDeployment(new OnErrorDeployment().withType(OnErrorDeploymentType.LAST_SUCCESSFUL)))
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

### Deployments_CreateOrUpdateAtManagementGroupScope

```java
import com.azure.resourcemanager.resources.generated.models.Deployment;
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentProperties;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments CreateOrUpdateAtSubscriptionScope.
 */
public final class DeploymentsCreateOrUpdateAtSubscriptionScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PutDeploymentSubscriptionTemplateSpecsWithId.json
     */
    /**
     * Sample code: Create a deployment that will deploy a templateSpec with the given resourceId.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void createADeploymentThatWillDeployATemplateSpecWithTheGivenResourceId(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .createOrUpdateAtSubscriptionScope("my-deployment", new Deployment().withLocation("eastus")
                .withProperties(new DeploymentProperties().withTemplateLink(new TemplateLink().withId(
                    "/subscriptions/00000000-0000-0000-0000-000000000001/resourceGroups/my-resource-group/providers/Microsoft.Resources/TemplateSpecs/TemplateSpec-Name/versions/v1"))
                    .withParameters(mapOf())
                    .withMode(DeploymentMode.INCREMENTAL)),
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

### Deployments_CreateOrUpdateAtScope

```java
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentWhatIfProperties;
import com.azure.resourcemanager.resources.generated.models.ScopedDeploymentWhatIf;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments WhatIfAtTenantScope.
 */
public final class DeploymentsWhatIfAtTenantScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PostDeploymentWhatIfOnTenant.json
     */
    /**
     * Sample code: Predict template changes at management group scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void predictTemplateChangesAtManagementGroupScope(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .whatIfAtTenantScope("exampleDeploymentName",
                new ScopedDeploymentWhatIf().withLocation("eastus")
                    .withProperties(new DeploymentWhatIfProperties()
                        .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                        .withParameters(mapOf())
                        .withMode(DeploymentMode.INCREMENTAL)),
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

### Deployments_CreateOrUpdateAtSubscriptionScope

```java
/**
 * Samples for ResourceGroups Delete.
 */
public final class ResourceGroupsDeleteSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * ForceDeleteVMsInResourceGroup.json
     */
    /**
     * Sample code: Force delete all the Virtual Machines in a resource group.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void forceDeleteAllTheVirtualMachinesInAResourceGroup(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups()
            .delete("my-resource-group", "Microsoft.Compute/virtualMachines", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * ForceDeleteVMsAndVMSSInResourceGroup.json
     */
    /**
     * Sample code: Force delete all the Virtual Machines and Virtual Machine Scale Sets in a resource group.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void forceDeleteAllTheVirtualMachinesAndVirtualMachineScaleSetsInAResourceGroup(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups()
            .delete("my-resource-group", "Microsoft.Compute/virtualMachines,Microsoft.Compute/virtualMachineScaleSets",
                com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_CreateOrUpdateAtTenantScope

```java
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentWhatIf;
import com.azure.resourcemanager.resources.generated.models.DeploymentWhatIfProperties;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments WhatIf.
 */
public final class DeploymentsWhatIfSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PostDeploymentWhatIfOnResourceGroup.json
     */
    /**
     * Sample code: Predict template changes at resource group scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void predictTemplateChangesAtResourceGroupScope(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .whatIf("my-resource-group", "my-deployment",
                new DeploymentWhatIf().withProperties(new DeploymentWhatIfProperties()
                    .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                    .withParameters(mapOf())
                    .withMode(DeploymentMode.INCREMENTAL)),
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

### Deployments_Validate

```java
/**
 * Samples for Providers List.
 */
public final class ProvidersListSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetProviders.json
     */
    /**
     * Sample code: Get providers.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getProviders(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providers().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_ValidateAtManagementGroupScope

```java
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentWhatIf;
import com.azure.resourcemanager.resources.generated.models.DeploymentWhatIfProperties;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments WhatIfAtSubscriptionScope.
 */
public final class DeploymentsWhatIfAtSubscriptionScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PostDeploymentWhatIfOnSubscription.json
     */
    /**
     * Sample code: Predict template changes at subscription scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void predictTemplateChangesAtSubscriptionScope(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .whatIfAtSubscriptionScope("my-deployment",
                new DeploymentWhatIf().withLocation("westus")
                    .withProperties(new DeploymentWhatIfProperties()
                        .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                        .withParameters(mapOf())
                        .withMode(DeploymentMode.INCREMENTAL)),
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

### Deployments_ValidateAtScope

```java
/**
 * Samples for Providers Get.
 */
public final class ProvidersGetSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetProvider.json
     */
    /**
     * Sample code: Get provider.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getProvider(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providers().getWithResponse("Microsoft.TestRP1", null, com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_ValidateAtSubscriptionScope

```java
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentWhatIfProperties;
import com.azure.resourcemanager.resources.generated.models.ScopedDeploymentWhatIf;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments WhatIfAtManagementGroupScope.
 */
public final class DeploymentsWhatIfAtManagementGroupScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PostDeploymentWhatIfOnManagementGroup.json
     */
    /**
     * Sample code: Predict template changes at management group scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void predictTemplateChangesAtManagementGroupScope(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .whatIfAtManagementGroupScope("myManagementGruop", "exampleDeploymentName",
                new ScopedDeploymentWhatIf().withLocation("eastus")
                    .withProperties(new DeploymentWhatIfProperties()
                        .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                        .withParameters(mapOf())
                        .withMode(DeploymentMode.INCREMENTAL)),
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

### Deployments_ValidateAtTenantScope

```java
/**
 * Samples for ProviderResourceTypes List.
 */
public final class ProviderResourceTypesListSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetProviderResourceTypes.
     * json
     */
    /**
     * Sample code: Get provider resource types.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getProviderResourceTypes(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providerResourceTypes().listWithResponse("Microsoft.TestRP", null, com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_WhatIf

```java
import com.azure.resourcemanager.resources.generated.fluent.models.TagsResourceInner;
import com.azure.resourcemanager.resources.generated.models.Tags;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for TagOperations CreateOrUpdateAtScope.
 */
public final class TagOperationsCreateOrUpdateAtScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/PutTagsResource.json
     */
    /**
     * Sample code: Update tags on a resource.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void updateTagsOnAResource(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .createOrUpdateAtScope(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/my-resource-group/providers/myPRNameSpace/VM/myVm",
                new TagsResourceInner().withProperties(
                    new Tags().withTags(mapOf("tagKey1", "fakeTokenPlaceholder", "tagKey2", "fakeTokenPlaceholder"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/PutTagsSubscription.json
     */
    /**
     * Sample code: Update tags on a subscription.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        updateTagsOnASubscription(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .createOrUpdateAtScope("subscriptions/00000000-0000-0000-0000-000000000000",
                new TagsResourceInner().withProperties(
                    new Tags().withTags(mapOf("tagKey1", "fakeTokenPlaceholder", "tagKey2", "fakeTokenPlaceholder"))),
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

### Deployments_WhatIfAtManagementGroupScope

```java
/**
 * Samples for ResourceGroups CreateOrUpdate.
 */
public final class ResourceGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/CreateResourceGroup.json
     */
    /**
     * Sample code: Create or update a resource group.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        createOrUpdateAResourceGroup(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups().define("my-resource-group").withRegion("eastus").create();
    }
}
```

### Deployments_WhatIfAtSubscriptionScope

```java
/**
 * Samples for TagOperations DeleteAtScope.
 */
public final class TagOperationsDeleteAtScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/DeleteTagsResource.json
     */
    /**
     * Sample code: Update tags on a resource.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void updateTagsOnAResource(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .deleteAtScope(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/my-resource-group/providers/myPRNameSpace/VM/myVm",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/DeleteTagsSubscription.
     * json
     */
    /**
     * Sample code: Update tags on a subscription.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        updateTagsOnASubscription(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .deleteAtScope("subscriptions/00000000-0000-0000-0000-000000000000", com.azure.core.util.Context.NONE);
    }
}
```

### Deployments_WhatIfAtTenantScope

```java
import com.azure.resourcemanager.resources.generated.models.Tags;
import com.azure.resourcemanager.resources.generated.models.TagsPatchOperation;
import com.azure.resourcemanager.resources.generated.models.TagsPatchResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for TagOperations UpdateAtScope.
 */
public final class TagOperationsUpdateAtScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/PatchTagsResource.json
     */
    /**
     * Sample code: Update tags on a resource.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void updateTagsOnAResource(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .updateAtScope(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/my-resource-group/providers/myPRNameSpace/VM/myVm",
                new TagsPatchResource().withOperation(TagsPatchOperation.REPLACE)
                    .withProperties(new Tags()
                        .withTags(mapOf("tagKey1", "fakeTokenPlaceholder", "tagKey2", "fakeTokenPlaceholder"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/PatchTagsSubscription.
     * json
     */
    /**
     * Sample code: Update tags on a subscription.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        updateTagsOnASubscription(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .updateAtScope("subscriptions/00000000-0000-0000-0000-000000000000",
                new TagsPatchResource().withOperation(TagsPatchOperation.REPLACE)
                    .withProperties(new Tags()
                        .withTags(mapOf("tagKey1", "fakeTokenPlaceholder", "tagKey2", "fakeTokenPlaceholder"))),
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

### ProviderResourceTypes_List

```java
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentProperties;
import com.azure.resourcemanager.resources.generated.models.ScopedDeployment;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments ValidateAtManagementGroupScope.
 */
public final class DeploymentsValidateAtManagementGroupScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PostDeploymentValidateOnManagementGroup.json
     */
    /**
     * Sample code: Validates a template at management group scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void validatesATemplateAtManagementGroupScope(
        com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .validateAtManagementGroupScope("my-management-group-id", "my-deployment",
                new ScopedDeployment().withLocation("eastus")
                    .withProperties(new DeploymentProperties()
                        .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                        .withParameters(mapOf())
                        .withMode(DeploymentMode.INCREMENTAL)),
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

### Providers_Get

```java
/**
 * Samples for Providers GetAtTenantScope.
 */
public final class ProvidersGetAtTenantScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetNamedProviderAtTenant.
     * json
     */
    /**
     * Sample code: Get a resource provider at tenant scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        getAResourceProviderAtTenantScope(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providers()
            .getAtTenantScopeWithResponse("Microsoft.Storage", "resourceTypes/aliases",
                com.azure.core.util.Context.NONE);
    }
}
```

### Providers_GetAtTenantScope

```java
/**
 * Samples for Providers ProviderPermissions.
 */
public final class ProvidersProviderPermissionsSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetProviderPermissions.
     * json
     */
    /**
     * Sample code: Get provider resource types.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getProviderResourceTypes(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.providers().providerPermissionsWithResponse("Microsoft.TestRP", com.azure.core.util.Context.NONE);
    }
}
```

### Providers_List

```java
import com.azure.resourcemanager.resources.generated.models.ExportTemplateOutputFormat;
import com.azure.resourcemanager.resources.generated.models.ExportTemplateRequest;
import java.util.Arrays;

/**
 * Samples for ResourceGroups ExportTemplate.
 */
public final class ResourceGroupsExportTemplateSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * ExportResourceGroupAsBicep.json
     */
    /**
     * Sample code: Export a resource group as Bicep.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        exportAResourceGroupAsBicep(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups()
            .exportTemplate("my-resource-group",
                new ExportTemplateRequest().withResources(Arrays.asList("*"))
                    .withOptions("IncludeParameterDefaultValue,IncludeComments")
                    .withOutputFormat(ExportTemplateOutputFormat.BICEP),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/ExportResourceGroup.json
     */
    /**
     * Sample code: Export a resource group.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void exportAResourceGroup(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups()
            .exportTemplate("my-resource-group", new ExportTemplateRequest().withResources(Arrays.asList("*"))
                .withOptions("IncludeParameterDefaultValue,IncludeComments"), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * ExportResourceGroupWithFiltering.json
     */
    /**
     * Sample code: Export a resource group with filtering.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        exportAResourceGroupWithFiltering(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.resourceGroups()
            .exportTemplate("my-resource-group", new ExportTemplateRequest().withResources(Arrays.asList(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/my-resource-group/providers/My.RP/myResourceType/myFirstResource"))
                .withOptions("SkipResourceNameParameterization"), com.azure.core.util.Context.NONE);
    }
}
```

### Providers_ProviderPermissions

```java
import com.azure.resourcemanager.resources.generated.models.Deployment;
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentProperties;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments ValidateAtSubscriptionScope.
 */
public final class DeploymentsValidateAtSubscriptionScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PostDeploymentValidateOnSubscription.json
     */
    /**
     * Sample code: Validates a template at subscription scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        validatesATemplateAtSubscriptionScope(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .validateAtSubscriptionScope("my-deployment",
                new Deployment().withLocation("eastus")
                    .withProperties(new DeploymentProperties()
                        .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                        .withParameters(mapOf())
                        .withMode(DeploymentMode.INCREMENTAL)),
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

### ResourceGroups_CreateOrUpdate

```java
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentProperties;
import com.azure.resourcemanager.resources.generated.models.ScopedDeployment;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments ValidateAtTenantScope.
 */
public final class DeploymentsValidateAtTenantScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PostDeploymentValidateOnTenant.json
     */
    /**
     * Sample code: Validates a template at tenant scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        validatesATemplateAtTenantScope(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .validateAtTenantScope("my-deployment",
                new ScopedDeployment().withLocation("eastus")
                    .withProperties(new DeploymentProperties()
                        .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                        .withParameters(mapOf())
                        .withMode(DeploymentMode.INCREMENTAL)),
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

### ResourceGroups_Delete

```java
import com.azure.resourcemanager.resources.generated.models.Deployment;
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentProperties;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments Validate.
 */
public final class DeploymentsValidateSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PostDeploymentValidateOnResourceGroup.json
     */
    /**
     * Sample code: Validates a template at resource group scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        validatesATemplateAtResourceGroupScope(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .validate("my-resource-group", "my-deployment", new Deployment().withProperties(new DeploymentProperties()
                .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json")
                    .withQueryString(
                        "sv=2019-02-02&st=2019-04-29T22%3A18%3A26Z&se=2019-04-30T02%3A23%3A26Z&sr=b&sp=rw&sip=168.1.5.60-168.1.5.70&spr=https&sig=xxxxxxxx0xxxxxxxxxxxxx%2bxxxxxxxxxxxxxxxxxxxx%3d"))
                .withParameters(mapOf())
                .withMode(DeploymentMode.INCREMENTAL)), com.azure.core.util.Context.NONE);
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

### ResourceGroups_ExportTemplate

```java
/**
 * Samples for TagOperations GetAtScope.
 */
public final class TagOperationsGetAtScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetTagsResource.json
     */
    /**
     * Sample code: Get tags on a resource.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getTagsOnAResource(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .getAtScopeWithResponse(
                "subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/my-resource-group/providers/myPRNameSpace/VM/myVm",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/GetTagsSubscription.json
     */
    /**
     * Sample code: Get tags on a subscription.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void getTagsOnASubscription(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.tagOperations()
            .getAtScopeWithResponse("subscriptions/00000000-0000-0000-0000-000000000000",
                com.azure.core.util.Context.NONE);
    }
}
```

### TagOperations_CreateOrUpdateAtScope

```java
import com.azure.resourcemanager.resources.generated.models.Deployment;
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentProperties;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments ValidateAtScope.
 */
public final class DeploymentsValidateAtScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PostDeploymentValidateOnScope.json
     */
    /**
     * Sample code: Validates a template at scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        validatesATemplateAtScope(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .validateAtScope("subscriptions/00000000-0000-0000-0000-000000000001/resourceGroups/my-resource-group",
                "my-deployment",
                new Deployment().withProperties(new DeploymentProperties().withTemplateLink(new TemplateLink()
                    .withUri("https://example.com/exampleTemplate.json")
                    .withQueryString(
                        "sv=2019-02-02&st=2019-04-29T22%3A18%3A26Z&se=2019-04-30T02%3A23%3A26Z&sr=b&sp=rw&sip=168.1.5.60-168.1.5.70&spr=https&sig=xxxxxxxx0xxxxxxxxxxxxx%2bxxxxxxxxxxxxxxxxxxxx%3d"))
                    .withParameters(mapOf())
                    .withMode(DeploymentMode.INCREMENTAL)),
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

### TagOperations_DeleteAtScope

```java
import com.azure.resourcemanager.resources.generated.models.Deployment;
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentProperties;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments CreateOrUpdateAtScope.
 */
public final class DeploymentsCreateOrUpdateAtScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/PutDeploymentAtScope.json
     */
    /**
     * Sample code: Create deployment at a given scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        createDeploymentAtAGivenScope(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .createOrUpdateAtScope("providers/Microsoft.Management/managementGroups/my-management-group-id",
                "my-deployment",
                new Deployment().withLocation("eastus")
                    .withProperties(new DeploymentProperties()
                        .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                        .withParameters(mapOf())
                        .withMode(DeploymentMode.INCREMENTAL))
                    .withTags(mapOf("tagKey1", "fakeTokenPlaceholder", "tagKey2", "fakeTokenPlaceholder")),
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

### TagOperations_GetAtScope

```java
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentProperties;
import com.azure.resourcemanager.resources.generated.models.ScopedDeployment;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments CreateOrUpdateAtManagementGroupScope.
 */
public final class DeploymentsCreateOrUpdateAtManagementGroupScopeSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/
     * PutDeploymentAtManagementGroup.json
     */
    /**
     * Sample code: Create deployment at management group scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        createDeploymentAtManagementGroupScope(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .createOrUpdateAtManagementGroupScope("my-management-group-id", "my-deployment",
                new ScopedDeployment().withLocation("eastus")
                    .withProperties(new DeploymentProperties()
                        .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                        .withParameters(mapOf())
                        .withMode(DeploymentMode.INCREMENTAL)),
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

### TagOperations_UpdateAtScope

```java
import com.azure.resourcemanager.resources.generated.models.DeploymentMode;
import com.azure.resourcemanager.resources.generated.models.DeploymentProperties;
import com.azure.resourcemanager.resources.generated.models.ScopedDeployment;
import com.azure.resourcemanager.resources.generated.models.TemplateLink;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Deployments CreateOrUpdateAtTenantScope.
 */
public final class DeploymentsCreateOrUpdateAtTenantScopeSamples {
    /*
     * x-ms-original-file:
     * specification/resources/resource-manager/Microsoft.Resources/stable/2025-04-01/examples/PutDeploymentAtTenant.
     * json
     */
    /**
     * Sample code: Create deployment at tenant scope.
     * 
     * @param manager Entry point to ResourceManager.
     */
    public static void
        createDeploymentAtTenantScope(com.azure.resourcemanager.resources.generated.ResourceManager manager) {
        manager.deployments()
            .createOrUpdateAtTenantScope("tenant-dep01",
                new ScopedDeployment().withLocation("eastus")
                    .withProperties(new DeploymentProperties()
                        .withTemplateLink(new TemplateLink().withUri("https://example.com/exampleTemplate.json"))
                        .withParameters(mapOf())
                        .withMode(DeploymentMode.INCREMENTAL))
                    .withTags(mapOf("tagKey1", "fakeTokenPlaceholder", "tagKey2", "fakeTokenPlaceholder")),
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

