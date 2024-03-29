# Code snippets and samples


## ExtensionManagers

- [AddCustomLocation](#extensionmanagers_addcustomlocation)
- [CreateOrUpdate](#extensionmanagers_createorupdate)
- [Delete](#extensionmanagers_delete)
- [DisableExtensions](#extensionmanagers_disableextensions)
- [EnableExtensions](#extensionmanagers_enableextensions)
- [GetByResourceGroup](#extensionmanagers_getbyresourcegroup)
- [List](#extensionmanagers_list)
- [ListByResourceGroup](#extensionmanagers_listbyresourcegroup)
- [RemoveCustomLocation](#extensionmanagers_removecustomlocation)
- [Update](#extensionmanagers_update)

## Operations

- [List](#operations_list)
### ExtensionManagers_AddCustomLocation

```java
import com.azure.resourcemanager.hybridonboarding.models.AddCustomLocationDetails;
import java.util.Arrays;

/**
 * Samples for ExtensionManagers AddCustomLocation.
 */
public final class ExtensionManagersAddCustomLocationSamples {
    /*
     * x-ms-original-file:
     * specification/hybridonboarding/resource-manager/Microsoft.HybridOnboarding/preview/2024-06-01-preview/examples/
     * ExtensionManagers_AddCustomLocation_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExtensionManagers_AddCustomLocation.
     * 
     * @param manager Entry point to HybridonboardingManager.
     */
    public static void
        extensionManagersAddCustomLocation(com.azure.resourcemanager.hybridonboarding.HybridonboardingManager manager) {
        manager.extensionManagers().addCustomLocation("rgopenapi",
            "3_-E_--O_T_q-O_HH_C_E2cN-_j_4_KuMNj_5fPs_Bp-Ca-__tj__2R104",
            Arrays.asList(new AddCustomLocationDetails().withName("ndevecxlpfctiqeimgi")),
            com.azure.core.util.Context.NONE);
    }
}
```

### ExtensionManagers_CreateOrUpdate

```java
import com.azure.resourcemanager.hybridonboarding.models.ManagedIdentity;
import com.azure.resourcemanager.hybridonboarding.models.ManagedIdentityType;
import com.azure.resourcemanager.hybridonboarding.models.ScenarioProfileObject;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ExtensionManagers CreateOrUpdate.
 */
public final class ExtensionManagersCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/hybridonboarding/resource-manager/Microsoft.HybridOnboarding/preview/2024-06-01-preview/examples/
     * ExtensionManagers_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExtensionManagers_CreateOrUpdate.
     * 
     * @param manager Entry point to HybridonboardingManager.
     */
    public static void
        extensionManagersCreateOrUpdate(com.azure.resourcemanager.hybridonboarding.HybridonboardingManager manager) {
        manager.extensionManagers().define("d").withRegion("noztvjlnfxuxigrtyrcfryujkcccqg")
            .withExistingResourceGroup("rgopenapi")
            .withIdentity(new ManagedIdentity().withType(ManagedIdentityType.SYSTEM_ASSIGNED))
            .withTags(mapOf("key3761", "fakeTokenPlaceholder")).withExtendedLocation("cnzmvlmivyn")
            .withScenarioProfile(Arrays.asList(new ScenarioProfileObject().withInfrastructure("mfgocft")
                .withScenario("dwqgnkneskwhozheayskrrvlclzkr")))
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

### ExtensionManagers_Delete

```java
/**
 * Samples for ExtensionManagers Delete.
 */
public final class ExtensionManagersDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/hybridonboarding/resource-manager/Microsoft.HybridOnboarding/preview/2024-06-01-preview/examples/
     * ExtensionManagers_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExtensionManagers_Delete.
     * 
     * @param manager Entry point to HybridonboardingManager.
     */
    public static void
        extensionManagersDelete(com.azure.resourcemanager.hybridonboarding.HybridonboardingManager manager) {
        manager.extensionManagers().delete("rgopenapi", "E", com.azure.core.util.Context.NONE);
    }
}
```

### ExtensionManagers_DisableExtensions

```java
import com.azure.resourcemanager.hybridonboarding.models.DisableExtensionsRequestDetails;
import java.util.Arrays;

/**
 * Samples for ExtensionManagers DisableExtensions.
 */
public final class ExtensionManagersDisableExtensionsSamples {
    /*
     * x-ms-original-file:
     * specification/hybridonboarding/resource-manager/Microsoft.HybridOnboarding/preview/2024-06-01-preview/examples/
     * ExtensionManagers_DisableExtensions_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExtensionManagers_DisableExtensions.
     * 
     * @param manager Entry point to HybridonboardingManager.
     */
    public static void
        extensionManagersDisableExtensions(com.azure.resourcemanager.hybridonboarding.HybridonboardingManager manager) {
        manager.extensionManagers().disableExtensions("rgopenapi", "CcP__6Rw__vM-c6e-_4h",
            Arrays.asList(new DisableExtensionsRequestDetails().withName("utgfqbmsixwdizyqvmznl")),
            com.azure.core.util.Context.NONE);
    }
}
```

### ExtensionManagers_EnableExtensions

```java
import com.azure.resourcemanager.hybridonboarding.models.EnableExtensionsRequestDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ExtensionManagers EnableExtensions.
 */
public final class ExtensionManagersEnableExtensionsSamples {
    /*
     * x-ms-original-file:
     * specification/hybridonboarding/resource-manager/Microsoft.HybridOnboarding/preview/2024-06-01-preview/examples/
     * ExtensionManagers_EnableExtensions_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExtensionManagers_EnableExtensions.
     * 
     * @param manager Entry point to HybridonboardingManager.
     */
    public static void
        extensionManagersEnableExtensions(com.azure.resourcemanager.hybridonboarding.HybridonboardingManager manager) {
        manager.extensionManagers().enableExtensions("rgopenapi", "3_i_f_s____G_-W-__U__s-I_hmYGs4-_KRian-wD1bn_-u__D",
            Arrays.asList(new EnableExtensionsRequestDetails().withName("wjkxpmgaubnhkhpxtapwknpxns")
                .withConfigurationSettings(mapOf("key1121", "fakeTokenPlaceholder"))
                .withConfigurationProtectedSettings(mapOf("key8624", "fakeTokenPlaceholder"))),
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

### ExtensionManagers_GetByResourceGroup

```java
/**
 * Samples for ExtensionManagers GetByResourceGroup.
 */
public final class ExtensionManagersGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/hybridonboarding/resource-manager/Microsoft.HybridOnboarding/preview/2024-06-01-preview/examples/
     * ExtensionManagers_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExtensionManagers_Get.
     * 
     * @param manager Entry point to HybridonboardingManager.
     */
    public static void
        extensionManagersGet(com.azure.resourcemanager.hybridonboarding.HybridonboardingManager manager) {
        manager.extensionManagers().getByResourceGroupWithResponse("rgopenapi", "0", com.azure.core.util.Context.NONE);
    }
}
```

### ExtensionManagers_List

```java
/**
 * Samples for ExtensionManagers List.
 */
public final class ExtensionManagersListSamples {
    /*
     * x-ms-original-file:
     * specification/hybridonboarding/resource-manager/Microsoft.HybridOnboarding/preview/2024-06-01-preview/examples/
     * ExtensionManagers_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExtensionManagers_ListBySubscription.
     * 
     * @param manager Entry point to HybridonboardingManager.
     */
    public static void extensionManagersListBySubscription(
        com.azure.resourcemanager.hybridonboarding.HybridonboardingManager manager) {
        manager.extensionManagers().list(com.azure.core.util.Context.NONE);
    }
}
```

### ExtensionManagers_ListByResourceGroup

```java
/**
 * Samples for ExtensionManagers ListByResourceGroup.
 */
public final class ExtensionManagersListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/hybridonboarding/resource-manager/Microsoft.HybridOnboarding/preview/2024-06-01-preview/examples/
     * ExtensionManagers_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExtensionManagers_ListByResourceGroup.
     * 
     * @param manager Entry point to HybridonboardingManager.
     */
    public static void extensionManagersListByResourceGroup(
        com.azure.resourcemanager.hybridonboarding.HybridonboardingManager manager) {
        manager.extensionManagers().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### ExtensionManagers_RemoveCustomLocation

```java
import com.azure.resourcemanager.hybridonboarding.models.RemoveCustomLocationDetails;
import java.util.Arrays;

/**
 * Samples for ExtensionManagers RemoveCustomLocation.
 */
public final class ExtensionManagersRemoveCustomLocationSamples {
    /*
     * x-ms-original-file:
     * specification/hybridonboarding/resource-manager/Microsoft.HybridOnboarding/preview/2024-06-01-preview/examples/
     * ExtensionManagers_RemoveCustomLocation_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExtensionManagers_RemoveCustomLocation.
     * 
     * @param manager Entry point to HybridonboardingManager.
     */
    public static void extensionManagersRemoveCustomLocation(
        com.azure.resourcemanager.hybridonboarding.HybridonboardingManager manager) {
        manager.extensionManagers().removeCustomLocation("rgopenapi",
            "2KFo4k-fNv4j_V85j-B3H_P_m_R__KPi8--D__-__ht74CF-cp_H_N",
            Arrays
                .asList(new RemoveCustomLocationDetails().withName("qrkuixbbrbazhy").withCustomLocationId("gerwgnnj")),
            com.azure.core.util.Context.NONE);
    }
}
```

### ExtensionManagers_Update

```java
import com.azure.resourcemanager.hybridonboarding.models.ExtensionManager;
import com.azure.resourcemanager.hybridonboarding.models.ManagedIdentityType;
import com.azure.resourcemanager.hybridonboarding.models.ManagedIdentityUpdate;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ExtensionManagers Update.
 */
public final class ExtensionManagersUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/hybridonboarding/resource-manager/Microsoft.HybridOnboarding/preview/2024-06-01-preview/examples/
     * ExtensionManagers_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: ExtensionManagers_Update.
     * 
     * @param manager Entry point to HybridonboardingManager.
     */
    public static void
        extensionManagersUpdate(com.azure.resourcemanager.hybridonboarding.HybridonboardingManager manager) {
        ExtensionManager resource = manager.extensionManagers()
            .getByResourceGroupWithResponse("rgopenapi", "I", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf("key4031", "fakeTokenPlaceholder"))
            .withIdentity(new ManagedIdentityUpdate().withType(ManagedIdentityType.SYSTEM_ASSIGNED)).apply();
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
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/hybridonboarding/resource-manager/Microsoft.HybridOnboarding/preview/2024-06-01-preview/examples/
     * Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to HybridonboardingManager.
     */
    public static void operationsList(com.azure.resourcemanager.hybridonboarding.HybridonboardingManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

