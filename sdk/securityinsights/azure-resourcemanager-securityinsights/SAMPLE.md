# Code snippets and samples


## Operations

- [List](#operations_list)

## PackageOperation

- [Install](#packageoperation_install)
- [Uninstall](#packageoperation_uninstall)

## Packages

- [Get](#packages_get)
- [List](#packages_list)

## Templates

- [Get](#templates_get)
- [List](#templates_list)
### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/operations/ListOperations.json
     */
    /**
     * Sample code: Get all operations.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAllOperations(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

### PackageOperation_Install

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.models.PackageInstallationProperties;
import com.azure.resourcemanager.securityinsights.models.PackageKind;

/** Samples for PackageOperation Install. */
public final class PackageOperationInstallSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/packages/InstallPackage.json
     */
    /**
     * Sample code: Install a package to the workspace.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void installAPackageToTheWorkspace(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .packageOperations()
            .installWithResponse(
                "myRg",
                "Microsoft.OperationalInsights",
                "myWorkspace",
                "azuresentinel.azure-sentinel-solution-ciscoumbrella",
                new PackageInstallationProperties().withPackageKind(PackageKind.SOLUTION).withVersion("2.0.0"),
                Context.NONE);
    }
}
```

### PackageOperation_Uninstall

```java
import com.azure.core.util.Context;

/** Samples for PackageOperation Uninstall. */
public final class PackageOperationUninstallSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/packages/UninstallPackage.json
     */
    /**
     * Sample code: Uninstall a package from the workspace.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void uninstallAPackageFromTheWorkspace(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .packageOperations()
            .uninstallWithResponse(
                "myRg",
                "Microsoft.OperationalInsights",
                "myWorkspace",
                "azuresentinel.azure-sentinel-solution-ciscoumbrella",
                Context.NONE);
    }
}
```

### Packages_Get

```java
import com.azure.core.util.Context;

/** Samples for Packages Get. */
public final class PackagesGetSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/packages/GetPackageById.json
     */
    /**
     * Sample code: Get a package.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAPackage(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .packages()
            .getWithResponse(
                "myRg",
                "Microsoft.OperationalInsights",
                "myWorkspace",
                "azuresentinel.azure-sentinel-solution-ciscoumbrella",
                Context.NONE);
    }
}
```

### Packages_List

```java
import com.azure.core.util.Context;

/** Samples for Packages List. */
public final class PackagesListSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/packages/GetPackages.json
     */
    /**
     * Sample code: Get all available packages.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAllAvailablePackages(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .packages()
            .list("myRg", "Microsoft.OperationalInsights", "myWorkspace", null, null, null, null, Context.NONE);
    }
}
```

### Templates_Get

```java
import com.azure.core.util.Context;

/** Samples for Templates Get. */
public final class TemplatesGetSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/templates/GetTemplateById.json
     */
    /**
     * Sample code: Get a template.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getATemplate(com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .templates()
            .getWithResponse(
                "myRg",
                "Microsoft.OperationalInsights",
                "myWorkspace",
                "789e0c1f-4a3d-43ad-809c-e713b677b04a",
                Context.NONE);
    }
}
```

### Templates_List

```java
import com.azure.core.util.Context;

/** Samples for Templates List. */
public final class TemplatesListSamples {
    /*
     * x-ms-original-file: specification/securityinsights/resource-manager/Microsoft.SecurityInsights/preview/2022-11-01-preview/examples/templates/GetTemplates.json
     */
    /**
     * Sample code: Get all installed templates.
     *
     * @param manager Entry point to SecurityInsightsManager.
     */
    public static void getAllInstalledTemplates(
        com.azure.resourcemanager.securityinsights.SecurityInsightsManager manager) {
        manager
            .templates()
            .list("myRg", "Microsoft.OperationalInsights", "myWorkspace", null, null, null, null, Context.NONE);
    }
}
```

