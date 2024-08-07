# Code snippets and samples


## AnalysisOperations

- [Create](#analysisoperations_create)
- [Delete](#analysisoperations_delete)
- [Get](#analysisoperations_get)
- [ListByParent](#analysisoperations_listbyparent)
- [Update](#analysisoperations_update)

## LibraryOperations

- [Create](#libraryoperations_create)
- [Delete](#libraryoperations_delete)
- [GetByResourceGroup](#libraryoperations_getbyresourcegroup)
- [List](#libraryoperations_list)
- [ListByResourceGroup](#libraryoperations_listbyresourcegroup)
- [Update](#libraryoperations_update)

## Operations

- [List](#operations_list)

## SampleOperations

- [Create](#sampleoperations_create)
- [Delete](#sampleoperations_delete)
- [Get](#sampleoperations_get)
- [Identify](#sampleoperations_identify)
- [ListByParent](#sampleoperations_listbyparent)
- [Update](#sampleoperations_update)
### AnalysisOperations_Create

```java
import com.azure.resourcemanager.premonition.models.AnalysisProperties;
import com.azure.resourcemanager.premonition.models.MetagenomicsAnalysisSettings;
import com.azure.resourcemanager.premonition.models.TaxonomyVersion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AnalysisOperations Create.
 */
public final class AnalysisOperationsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * AnalysisOperations_Create.json
     */
    /**
     * Sample code: AnalysisOperations_Create.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void analysisOperationsCreate(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.analysisOperations()
            .define("metagenomic-analysis")
            .withRegion("uswest2")
            .withExistingLibrary("default-rg", "fastlib")
            .withTags(mapOf())
            .withProperties(new AnalysisProperties().withSamples(Arrays.asList("fastsample"))
                .withSettings(new MetagenomicsAnalysisSettings().withTaxonomyVersion(TaxonomyVersion.V2020_07_06)))
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

### AnalysisOperations_Delete

```java
/**
 * Samples for AnalysisOperations Delete.
 */
public final class AnalysisOperationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * AnalysisOperations_Delete.json
     */
    /**
     * Sample code: AnalysisOperations_Delete.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void analysisOperationsDelete(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.analysisOperations()
            .delete("default-rg", "fastlib", "metagenomic-analysis", com.azure.core.util.Context.NONE);
    }
}
```

### AnalysisOperations_Get

```java
/**
 * Samples for AnalysisOperations Get.
 */
public final class AnalysisOperationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * AnalysisOperations_Get.json
     */
    /**
     * Sample code: AnalysisOperations_Get.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void analysisOperationsGet(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.analysisOperations()
            .getWithResponse("default-rg", "fastlib", "metagenomic-analysis", com.azure.core.util.Context.NONE);
    }
}
```

### AnalysisOperations_ListByParent

```java
/**
 * Samples for AnalysisOperations ListByParent.
 */
public final class AnalysisOperationsListByParentSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * AnalysisOperations_ListByParent.json
     */
    /**
     * Sample code: AnalysisOperations_ListByParent.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void
        analysisOperationsListByParent(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.analysisOperations().listByParent("default-rg", "fastlib", com.azure.core.util.Context.NONE);
    }
}
```

### AnalysisOperations_Update

```java
import com.azure.resourcemanager.premonition.models.Analysis;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for AnalysisOperations Update.
 */
public final class AnalysisOperationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * AnalysisOperations_Update.json
     */
    /**
     * Sample code: AnalysisOperations_Update.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void analysisOperationsUpdate(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        Analysis resource = manager.analysisOperations()
            .getWithResponse("default-rg", "fastlib", "metageonic-analysis", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("key1", "fakeTokenPlaceholder")).apply();
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

### LibraryOperations_Create

```java
import com.azure.resourcemanager.premonition.models.LibraryProperties;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for LibraryOperations Create.
 */
public final class LibraryOperationsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * LibraryOperations_Create.json
     */
    /**
     * Sample code: LibraryOperations_Create.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void libraryOperationsCreate(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.libraryOperations()
            .define("fastlib")
            .withRegion("uswest2")
            .withExistingResourceGroup("default-rg")
            .withTags(mapOf())
            .withProperties(
                new LibraryProperties().withContainer("https://accountName.blob.core.windows.net/container"))
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

### LibraryOperations_Delete

```java
/**
 * Samples for LibraryOperations Delete.
 */
public final class LibraryOperationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * LibraryOperations_Delete.json
     */
    /**
     * Sample code: LibraryOperations_Delete.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void libraryOperationsDelete(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.libraryOperations()
            .deleteByResourceGroupWithResponse("default-rg", "fastlib", com.azure.core.util.Context.NONE);
    }
}
```

### LibraryOperations_GetByResourceGroup

```java
/**
 * Samples for LibraryOperations GetByResourceGroup.
 */
public final class LibraryOperationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * LibraryOperations_Get.json
     */
    /**
     * Sample code: LibraryOperations_Get.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void libraryOperationsGet(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.libraryOperations()
            .getByResourceGroupWithResponse("default-rg", "fastlib", com.azure.core.util.Context.NONE);
    }
}
```

### LibraryOperations_List

```java
/**
 * Samples for LibraryOperations List.
 */
public final class LibraryOperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * LibraryOperations_ListBySubscription.json
     */
    /**
     * Sample code: LibraryOperations_ListBySubscription.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void
        libraryOperationsListBySubscription(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.libraryOperations().list(com.azure.core.util.Context.NONE);
    }
}
```

### LibraryOperations_ListByResourceGroup

```java
/**
 * Samples for LibraryOperations ListByResourceGroup.
 */
public final class LibraryOperationsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * LibraryOperations_ListByResourceGroup.json
     */
    /**
     * Sample code: LibraryOperations_ListByResourceGroup.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void
        libraryOperationsListByResourceGroup(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.libraryOperations().listByResourceGroup("default-rg", com.azure.core.util.Context.NONE);
    }
}
```

### LibraryOperations_Update

```java
import com.azure.resourcemanager.premonition.models.Library;
import com.azure.resourcemanager.premonition.models.LibraryPropertiesUpdate;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for LibraryOperations Update.
 */
public final class LibraryOperationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * LibraryOperations_Update.json
     */
    /**
     * Sample code: LibraryOperations_Update.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void libraryOperationsUpdate(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        Library resource = manager.libraryOperations()
            .getByResourceGroupWithResponse("default-rg", "fastlib", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf())
            .withProperties(
                new LibraryPropertiesUpdate().withContainer("https://accountName.blob.core.windows.net/container"))
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
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void operationsList(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### SampleOperations_Create

```java
import com.azure.resourcemanager.premonition.models.SampleProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SampleOperations Create.
 */
public final class SampleOperationsCreateSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * SampleOperations_Create.json
     */
    /**
     * Sample code: SampleOperations_Create.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void sampleOperationsCreate(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.sampleOperations()
            .define("fastsample")
            .withRegion("uswest2")
            .withExistingLibrary("default-rg", "fastlib")
            .withTags(mapOf())
            .withProperties(
                new SampleProperties().withDescription("N/A").withPaths(Arrays.asList("fastlib/fastsample/fast5.zip")))
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

### SampleOperations_Delete

```java
/**
 * Samples for SampleOperations Delete.
 */
public final class SampleOperationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * SampleOperations_Delete.json
     */
    /**
     * Sample code: SampleOperations_Delete.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void sampleOperationsDelete(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.sampleOperations()
            .deleteWithResponse("default-rg", "fastlib", "sample0001", com.azure.core.util.Context.NONE);
    }
}
```

### SampleOperations_Get

```java
/**
 * Samples for SampleOperations Get.
 */
public final class SampleOperationsGetSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * SampleOperations_Get.json
     */
    /**
     * Sample code: SampleOperations_Get.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void sampleOperationsGet(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.sampleOperations()
            .getWithResponse("default-rg", "fastlib", "sample0001", com.azure.core.util.Context.NONE);
    }
}
```

### SampleOperations_Identify

```java
import com.azure.resourcemanager.premonition.models.IdentifyRequest;
import com.azure.resourcemanager.premonition.models.MetagenomicsAnalysisSettings;
import com.azure.resourcemanager.premonition.models.TaxonomyVersion;

/**
 * Samples for SampleOperations Identify.
 */
public final class SampleOperationsIdentifySamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * SampleOperations_Identify.json
     */
    /**
     * Sample code: SampleOperations_Identify.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void sampleOperationsIdentify(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.sampleOperations()
            .identify("default-rg", "fastlib", "fastsample",
                new IdentifyRequest().withName("metagenomic-analysis")
                    .withSettings(new MetagenomicsAnalysisSettings().withTaxonomyVersion(TaxonomyVersion.V2020_07_06)),
                com.azure.core.util.Context.NONE);
    }
}
```

### SampleOperations_ListByParent

```java
/**
 * Samples for SampleOperations ListByParent.
 */
public final class SampleOperationsListByParentSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * SampleOperations_ListByParent.json
     */
    /**
     * Sample code: SampleOperations_ListByParent.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void sampleOperationsListByParent(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        manager.sampleOperations().listByParent("default-rg", "fastlib", com.azure.core.util.Context.NONE);
    }
}
```

### SampleOperations_Update

```java
import com.azure.resourcemanager.premonition.models.Sample;
import com.azure.resourcemanager.premonition.models.SamplePropertiesUpdate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SampleOperations Update.
 */
public final class SampleOperationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/premonition/resource-manager/Microsoft.Premonition/preview/2024-09-01-preview/examples/
     * SampleOperations_Update.json
     */
    /**
     * Sample code: SampleOperations_Update.
     * 
     * @param manager Entry point to PremonitionManager.
     */
    public static void sampleOperationsUpdate(com.azure.resourcemanager.premonition.PremonitionManager manager) {
        Sample resource = manager.sampleOperations()
            .getWithResponse("default-rg", "fastlib", "sample0001", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf())
            .withProperties(new SamplePropertiesUpdate().withDescription("N/A")
                .withPaths(Arrays.asList("fastlib/fastsample/fast5.zip")))
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

