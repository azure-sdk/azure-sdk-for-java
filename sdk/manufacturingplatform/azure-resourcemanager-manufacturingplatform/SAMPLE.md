# Code snippets and samples


## ManufacturingDataServices

- [CreateOrUpdate](#manufacturingdataservices_createorupdate)
- [Delete](#manufacturingdataservices_delete)
- [GetByResourceGroup](#manufacturingdataservices_getbyresourcegroup)
- [List](#manufacturingdataservices_list)
- [ListAvailableVersions](#manufacturingdataservices_listavailableversions)
- [ListByResourceGroup](#manufacturingdataservices_listbyresourcegroup)
- [Update](#manufacturingdataservices_update)

## Operations

- [List](#operations_list)
### ManufacturingDataServices_CreateOrUpdate

```java
import com.azure.resourcemanager.manufacturingplatform.models.CmkProfile;
import com.azure.resourcemanager.manufacturingplatform.models.DenyAssignmentExclusion;
import com.azure.resourcemanager.manufacturingplatform.models.FabricProfile;
import com.azure.resourcemanager.manufacturingplatform.models.ManagedServiceIdentity;
import com.azure.resourcemanager.manufacturingplatform.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.manufacturingplatform.models.MdsResourceProperties;
import com.azure.resourcemanager.manufacturingplatform.models.OpenAIProfile;
import com.azure.resourcemanager.manufacturingplatform.models.RedundancyState;
import com.azure.resourcemanager.manufacturingplatform.models.ResourceState;
import com.azure.resourcemanager.manufacturingplatform.models.Sku;
import com.azure.resourcemanager.manufacturingplatform.models.SkuTier;
import com.azure.resourcemanager.manufacturingplatform.models.UserAssignedIdentity;
import com.azure.resourcemanager.manufacturingplatform.models.UserManagedOpenAIProfile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ManufacturingDataServices CreateOrUpdate.
 */
public final class ManufacturingDataServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/manufacturingplatform/resource-manager/Microsoft.ManufacturingPlatform/stable/2025-03-01/examples/
     * ManufacturingDataServices_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ManufacturingDataServices_CreateOrUpdate_MaximumSet.
     * 
     * @param manager Entry point to ManufacturingplatformManager.
     */
    public static void manufacturingDataServicesCreateOrUpdateMaximumSet(
        com.azure.resourcemanager.manufacturingplatform.ManufacturingplatformManager manager) {
        manager.manufacturingDataServices()
            .define("-JC180-G53HQ-DV45--2")
            .withRegion("tehys")
            .withExistingResourceGroup("rgmanufacturingplatform")
            .withTags(mapOf("key9958", "fakeTokenPlaceholder"))
            .withProperties(new MdsResourceProperties().withVersion("edudfrrjbywcurasjbnjwtdkflk")
                .withEnableCopilot(true)
                .withEnableDiagnosticSettings(true)
                .withAadApplicationId("cBaEC5DF-CEaB-Ddae-ecbD-1Afabbd6DAe3")
                .withAksAdminGroupId("dccAbeC7-84Eb-cbde-02Bd-B2cdfcaebb0D")
                .withOpenAIProfile(new OpenAIProfile().withGptModelName("dsbzdlz")
                    .withGptModelVersion("zvhjpcupzpgcwfooqynjsnexzb")
                    .withGptModelCapacity(17)
                    .withGptModelSkuName("okujmvpatodobzxiagptxmcmzlfu")
                    .withEmbeddingModelName("gvmbmegz")
                    .withEmbeddingModelVersion("jcywywrzkspz")
                    .withEmbeddingModelSkuName("ptrebrxvcytfvutzysjbsiepenjkbz")
                    .withEmbeddingModelCapacity(16))
                .withCmkProfile(new CmkProfile().withKeyUri("fakeTokenPlaceholder"))
                .withFabricProfile(
                    new FabricProfile().withKeyUri("fakeTokenPlaceholder").withOneLakeUri("wir").withOneLakePath("yy"))
                .withUserManagedOpenAIProfile(new UserManagedOpenAIProfile().withId("debpgpsj")
                    .withGptModelDeploymentName("vtflduhntrh")
                    .withEmbeddingModelDeploymentName("kvrtq"))
                .withDenyAssignmentExclusions(Arrays
                    .asList(new DenyAssignmentExclusion().withId("jgkmcnaiascxqner").withType("pkwxzngyovmeunimdk")))
                .withResourceState(ResourceState.ACTIVE)
                .withRedundancyState(RedundancyState.ZONAL))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE)
                .withUserAssignedIdentities(mapOf("key3165", new UserAssignedIdentity())))
            .withSku(new Sku().withName("fdspjymsjulumvnbml")
                .withTier(SkuTier.FREE)
                .withSize("loyqckvl")
                .withFamily("rjuwebwtvuivyjypcee")
                .withCapacity(2))
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

### ManufacturingDataServices_Delete

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/manufacturingplatform/resource-manager/Microsoft.ManufacturingPlatform/stable/2025-03-01/examples/
     * Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MinimumSet.
     * 
     * @param manager Entry point to ManufacturingplatformManager.
     */
    public static void
        operationsListMinimumSet(com.azure.resourcemanager.manufacturingplatform.ManufacturingplatformManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/manufacturingplatform/resource-manager/Microsoft.ManufacturingPlatform/stable/2025-03-01/examples/
     * Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_MaximumSet.
     * 
     * @param manager Entry point to ManufacturingplatformManager.
     */
    public static void
        operationsListMaximumSet(com.azure.resourcemanager.manufacturingplatform.ManufacturingplatformManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ManufacturingDataServices_GetByResourceGroup

```java
/**
 * Samples for ManufacturingDataServices Delete.
 */
public final class ManufacturingDataServicesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/manufacturingplatform/resource-manager/Microsoft.ManufacturingPlatform/stable/2025-03-01/examples/
     * ManufacturingDataServices_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: ManufacturingDataServices_Delete_MaximumSet.
     * 
     * @param manager Entry point to ManufacturingplatformManager.
     */
    public static void manufacturingDataServicesDeleteMaximumSet(
        com.azure.resourcemanager.manufacturingplatform.ManufacturingplatformManager manager) {
        manager.manufacturingDataServices()
            .delete("rgmanufacturingplatform", "-JC180-G53HQ-DV45--2", com.azure.core.util.Context.NONE);
    }
}
```

### ManufacturingDataServices_List

```java
/**
 * Samples for ManufacturingDataServices List.
 */
public final class ManufacturingDataServicesListSamples {
    /*
     * x-ms-original-file:
     * specification/manufacturingplatform/resource-manager/Microsoft.ManufacturingPlatform/stable/2025-03-01/examples/
     * ManufacturingDataServices_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: ManufacturingDataServices_ListBySubscription_MaximumSet.
     * 
     * @param manager Entry point to ManufacturingplatformManager.
     */
    public static void manufacturingDataServicesListBySubscriptionMaximumSet(
        com.azure.resourcemanager.manufacturingplatform.ManufacturingplatformManager manager) {
        manager.manufacturingDataServices().list(com.azure.core.util.Context.NONE);
    }
}
```

### ManufacturingDataServices_ListAvailableVersions

```java
/**
 * Samples for ManufacturingDataServices ListAvailableVersions.
 */
public final class ManufacturingDataServicesListAvailableVersionsSamples {
    /*
     * x-ms-original-file:
     * specification/manufacturingplatform/resource-manager/Microsoft.ManufacturingPlatform/stable/2025-03-01/examples/
     * ManufacturingDataServices_ListAvailableVersions_MaximumSet_Gen.json
     */
    /**
     * Sample code: ManufacturingDataServices_ListAvailableVersions_MaximumSet.
     * 
     * @param manager Entry point to ManufacturingplatformManager.
     */
    public static void manufacturingDataServicesListAvailableVersionsMaximumSet(
        com.azure.resourcemanager.manufacturingplatform.ManufacturingplatformManager manager) {
        manager.manufacturingDataServices()
            .listAvailableVersionsWithResponse("rgmanufacturingplatform", "-JC180-G53HQ-DV45--2",
                com.azure.core.util.Context.NONE);
    }
}
```

### ManufacturingDataServices_ListByResourceGroup

```java
/**
 * Samples for ManufacturingDataServices GetByResourceGroup.
 */
public final class ManufacturingDataServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/manufacturingplatform/resource-manager/Microsoft.ManufacturingPlatform/stable/2025-03-01/examples/
     * ManufacturingDataServices_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: ManufacturingDataServices_Get_MaximumSet.
     * 
     * @param manager Entry point to ManufacturingplatformManager.
     */
    public static void manufacturingDataServicesGetMaximumSet(
        com.azure.resourcemanager.manufacturingplatform.ManufacturingplatformManager manager) {
        manager.manufacturingDataServices()
            .getByResourceGroupWithResponse("rgmanufacturingplatform", "-JC180-G53HQ-DV45--2",
                com.azure.core.util.Context.NONE);
    }
}
```

### ManufacturingDataServices_Update

```java
import com.azure.resourcemanager.manufacturingplatform.models.AzureResourceManagerCommonTypesManagedServiceIdentityUpdate;
import com.azure.resourcemanager.manufacturingplatform.models.AzureResourceManagerCommonTypesSkuUpdate;
import com.azure.resourcemanager.manufacturingplatform.models.DenyAssignmentExclusion;
import com.azure.resourcemanager.manufacturingplatform.models.FabricProfileUpdate;
import com.azure.resourcemanager.manufacturingplatform.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.manufacturingplatform.models.MdsResource;
import com.azure.resourcemanager.manufacturingplatform.models.MdsResourceUpdateProperties;
import com.azure.resourcemanager.manufacturingplatform.models.OpenAIProfile;
import com.azure.resourcemanager.manufacturingplatform.models.ResourceState;
import com.azure.resourcemanager.manufacturingplatform.models.SkuTier;
import com.azure.resourcemanager.manufacturingplatform.models.UserAssignedIdentity;
import com.azure.resourcemanager.manufacturingplatform.models.UserManagedOpenAIProfileUpdate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ManufacturingDataServices Update.
 */
public final class ManufacturingDataServicesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/manufacturingplatform/resource-manager/Microsoft.ManufacturingPlatform/stable/2025-03-01/examples/
     * ManufacturingDataServices_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: ManufacturingDataServices_Update_MaximumSet.
     * 
     * @param manager Entry point to ManufacturingplatformManager.
     */
    public static void manufacturingDataServicesUpdateMaximumSet(
        com.azure.resourcemanager.manufacturingplatform.ManufacturingplatformManager manager) {
        MdsResource resource = manager.manufacturingDataServices()
            .getByResourceGroupWithResponse("rgmanufacturingplatform", "-JC180-G53HQ-DV45--2",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key686", "fakeTokenPlaceholder"))
            .withIdentity(new AzureResourceManagerCommonTypesManagedServiceIdentityUpdate()
                .withType(ManagedServiceIdentityType.NONE)
                .withUserAssignedIdentities(mapOf("key1454", new UserAssignedIdentity())))
            .withSku(new AzureResourceManagerCommonTypesSkuUpdate().withName("qxvzffcwcfranfrtxop")
                .withTier(SkuTier.FREE)
                .withSize("iuwoiucktfykgl")
                .withFamily("espbydeqhwpv")
                .withCapacity(10))
            .withProperties(new MdsResourceUpdateProperties().withVersion("nantvrbu")
                .withEnableCopilot(true)
                .withEnableDiagnosticSettings(true)
                .withOpenAIProfile(new OpenAIProfile().withGptModelName("dsbzdlz")
                    .withGptModelVersion("zvhjpcupzpgcwfooqynjsnexzb")
                    .withGptModelCapacity(17)
                    .withGptModelSkuName("okujmvpatodobzxiagptxmcmzlfu")
                    .withEmbeddingModelName("gvmbmegz")
                    .withEmbeddingModelVersion("jcywywrzkspz")
                    .withEmbeddingModelSkuName("ptrebrxvcytfvutzysjbsiepenjkbz")
                    .withEmbeddingModelCapacity(16))
                .withFabricProfile(new FabricProfileUpdate().withKeyUri("fakeTokenPlaceholder")
                    .withOneLakeUri("creuqapiyocerabsdfamjlhxgxsmq")
                    .withOneLakePath("pkwu"))
                .withUserManagedOpenAIProfile(new UserManagedOpenAIProfileUpdate().withId("pjgxutmesugsym")
                    .withGptModelDeploymentName("xbja")
                    .withEmbeddingModelDeploymentName("jxajth"))
                .withDenyAssignmentExclusions(Arrays
                    .asList(new DenyAssignmentExclusion().withId("jgkmcnaiascxqner").withType("pkwxzngyovmeunimdk")))
                .withResourceState(ResourceState.ACTIVE))
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

### Operations_List

```java
/**
 * Samples for ManufacturingDataServices ListByResourceGroup.
 */
public final class ManufacturingDataServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/manufacturingplatform/resource-manager/Microsoft.ManufacturingPlatform/stable/2025-03-01/examples/
     * ManufacturingDataServices_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: ManufacturingDataServices_ListByResourceGroup_MaximumSet.
     * 
     * @param manager Entry point to ManufacturingplatformManager.
     */
    public static void manufacturingDataServicesListByResourceGroupMaximumSet(
        com.azure.resourcemanager.manufacturingplatform.ManufacturingplatformManager manager) {
        manager.manufacturingDataServices()
            .listByResourceGroup("rgmanufacturingplatform", com.azure.core.util.Context.NONE);
    }
}
```

