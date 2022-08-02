# Code snippets and samples


## Apps

- [CreateOrUpdate](#apps_createorupdate)
- [Delete](#apps_delete)
- [Get](#apps_get)
- [GetResourceUploadUrl](#apps_getresourceuploadurl)
- [List](#apps_list)
- [Update](#apps_update)
- [ValidateDomain](#apps_validatedomain)

## Bindings

- [CreateOrUpdate](#bindings_createorupdate)
- [Delete](#bindings_delete)
- [Get](#bindings_get)
- [List](#bindings_list)
- [Update](#bindings_update)

## Certificates

- [CreateOrUpdate](#certificates_createorupdate)
- [Delete](#certificates_delete)
- [Get](#certificates_get)
- [List](#certificates_list)

## ConfigServers

- [Get](#configservers_get)
- [UpdatePatch](#configservers_updatepatch)
- [UpdatePut](#configservers_updateput)
- [Validate](#configservers_validate)

## CustomDomains

- [CreateOrUpdate](#customdomains_createorupdate)
- [Delete](#customdomains_delete)
- [Get](#customdomains_get)
- [List](#customdomains_list)
- [Update](#customdomains_update)

## Deployments

- [CreateOrUpdate](#deployments_createorupdate)
- [Delete](#deployments_delete)
- [GenerateHeapDump](#deployments_generateheapdump)
- [GenerateThreadDump](#deployments_generatethreaddump)
- [Get](#deployments_get)
- [GetLogFileUrl](#deployments_getlogfileurl)
- [List](#deployments_list)
- [ListForCluster](#deployments_listforcluster)
- [Restart](#deployments_restart)
- [Start](#deployments_start)
- [StartJfr](#deployments_startjfr)
- [Stop](#deployments_stop)
- [Update](#deployments_update)

## MonitoringSettings

- [Get](#monitoringsettings_get)
- [UpdatePatch](#monitoringsettings_updatepatch)
- [UpdatePut](#monitoringsettings_updateput)

## Operations

- [List](#operations_list)

## RuntimeVersions

- [ListRuntimeVersions](#runtimeversions_listruntimeversions)

## Services

- [CheckNameAvailability](#services_checknameavailability)
- [CreateOrUpdate](#services_createorupdate)
- [Delete](#services_delete)
- [DisableTestEndpoint](#services_disabletestendpoint)
- [EnableTestEndpoint](#services_enabletestendpoint)
- [GetByResourceGroup](#services_getbyresourcegroup)
- [List](#services_list)
- [ListByResourceGroup](#services_listbyresourcegroup)
- [ListTestKeys](#services_listtestkeys)
- [RegenerateTestKey](#services_regeneratetestkey)
- [Start](#services_start)
- [Stop](#services_stop)
- [Update](#services_update)

## Skus

- [List](#skus_list)

## Storages

- [CreateOrUpdate](#storages_createorupdate)
- [Delete](#storages_delete)
- [Get](#storages_get)
- [List](#storages_list)
### Apps_CreateOrUpdate

```java
import com.azure.resourcemanager.appplatform.generated.models.AppResourceProperties;
import com.azure.resourcemanager.appplatform.generated.models.AzureFileVolume;
import com.azure.resourcemanager.appplatform.generated.models.CustomPersistentDiskResource;
import com.azure.resourcemanager.appplatform.generated.models.LoadedCertificate;
import com.azure.resourcemanager.appplatform.generated.models.PersistentDisk;
import com.azure.resourcemanager.appplatform.generated.models.TemporaryDisk;
import java.util.Arrays;

/** Samples for Apps CreateOrUpdate. */
public final class AppsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Apps_CreateOrUpdate.json
     */
    /**
     * Sample code: Apps_CreateOrUpdate.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void appsCreateOrUpdate(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .apps()
            .define("myapp")
            .withExistingSpring("myResourceGroup", "myservice")
            .withRegion("eastus")
            .withProperties(
                new AppResourceProperties()
                    .withPublicProperty(true)
                    .withActiveDeploymentName("mydeployment1")
                    .withFqdn("myapp.mydomain.com")
                    .withHttpsOnly(false)
                    .withTemporaryDisk(new TemporaryDisk().withSizeInGB(2).withMountPath("/mytemporarydisk"))
                    .withPersistentDisk(new PersistentDisk().withSizeInGB(2).withMountPath("/mypersistentdisk"))
                    .withCustomPersistentDisks(
                        Arrays
                            .asList(
                                new CustomPersistentDiskResource()
                                    .withCustomPersistentDiskProperties(
                                        new AzureFileVolume()
                                            .withMountPath("/mypath1/mypath2")
                                            .withMountOptions(
                                                Arrays.asList("uid=0", "gid=0", "dir_mode=0777", "file_mode=0777"))
                                            .withShareName("myFileShare"))
                                    .withStorageId("myASCStorageID")))
                    .withEnableEndToEndTls(false)
                    .withLoadedCertificates(
                        Arrays
                            .asList(
                                new LoadedCertificate()
                                    .withResourceId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/certificates/mycert1")
                                    .withLoadTrustStore(false),
                                new LoadedCertificate()
                                    .withResourceId(
                                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.AppPlatform/Spring/myservice/certificates/mycert2")
                                    .withLoadTrustStore(true))))
            .create();
    }
}
```

### Apps_Delete

```java
import com.azure.core.util.Context;

/** Samples for Apps Delete. */
public final class AppsDeleteSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Apps_Delete.json
     */
    /**
     * Sample code: Apps_Delete.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void appsDelete(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.apps().delete("myResourceGroup", "myservice", "myapp", Context.NONE);
    }
}
```

### Apps_Get

```java
import com.azure.core.util.Context;

/** Samples for Apps Get. */
public final class AppsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Apps_Get.json
     */
    /**
     * Sample code: Apps_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void appsGet(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.apps().getWithResponse("myResourceGroup", "myservice", "myapp", null, Context.NONE);
    }
}
```

### Apps_GetResourceUploadUrl

```java
import com.azure.core.util.Context;

/** Samples for Apps GetResourceUploadUrl. */
public final class AppsGetResourceUploadUrlSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Apps_GetResourceUploadUrl.json
     */
    /**
     * Sample code: Apps_GetResourceUploadUrl.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void appsGetResourceUploadUrl(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.apps().getResourceUploadUrlWithResponse("myResourceGroup", "myservice", "myapp", Context.NONE);
    }
}
```

### Apps_List

```java
import com.azure.core.util.Context;

/** Samples for Apps List. */
public final class AppsListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Apps_List.json
     */
    /**
     * Sample code: Apps_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void appsList(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.apps().list("myResourceGroup", "myservice", Context.NONE);
    }
}
```

### Apps_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.AppResource;
import com.azure.resourcemanager.appplatform.generated.models.AppResourceProperties;
import com.azure.resourcemanager.appplatform.generated.models.AzureFileVolume;
import com.azure.resourcemanager.appplatform.generated.models.CustomPersistentDiskResource;
import com.azure.resourcemanager.appplatform.generated.models.ManagedIdentityProperties;
import com.azure.resourcemanager.appplatform.generated.models.ManagedIdentityType;
import com.azure.resourcemanager.appplatform.generated.models.PersistentDisk;
import com.azure.resourcemanager.appplatform.generated.models.TemporaryDisk;
import java.util.Arrays;

/** Samples for Apps Update. */
public final class AppsUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Apps_Update.json
     */
    /**
     * Sample code: Apps_Update.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void appsUpdate(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        AppResource resource =
            manager.apps().getWithResponse("myResourceGroup", "myservice", "myapp", null, Context.NONE).getValue();
        resource
            .update()
            .withProperties(
                new AppResourceProperties()
                    .withPublicProperty(true)
                    .withActiveDeploymentName("mydeployment1")
                    .withFqdn("myapp.mydomain.com")
                    .withHttpsOnly(false)
                    .withTemporaryDisk(new TemporaryDisk().withSizeInGB(2).withMountPath("/mytemporarydisk"))
                    .withPersistentDisk(new PersistentDisk().withSizeInGB(2).withMountPath("/mypersistentdisk"))
                    .withCustomPersistentDisks(
                        Arrays
                            .asList(
                                new CustomPersistentDiskResource()
                                    .withCustomPersistentDiskProperties(
                                        new AzureFileVolume()
                                            .withMountPath("/mypath1/mypath2")
                                            .withMountOptions(Arrays.asList())
                                            .withShareName("myFileShare"))
                                    .withStorageId("myASCStorageID")))
                    .withEnableEndToEndTls(false))
            .withIdentity(new ManagedIdentityProperties().withType(ManagedIdentityType.SYSTEM_ASSIGNED))
            .apply();
    }
}
```

### Apps_ValidateDomain

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.CustomDomainValidatePayload;

/** Samples for Apps ValidateDomain. */
public final class AppsValidateDomainSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Apps_ValidateDomain.json
     */
    /**
     * Sample code: Apps_ValidateDomain.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void appsValidateDomain(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .apps()
            .validateDomainWithResponse(
                "myResourceGroup",
                "myservice",
                "myapp",
                new CustomDomainValidatePayload().withName("mydomain.io"),
                Context.NONE);
    }
}
```

### Bindings_CreateOrUpdate

```java
import com.azure.resourcemanager.appplatform.generated.models.BindingResourceProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for Bindings CreateOrUpdate. */
public final class BindingsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Bindings_CreateOrUpdate.json
     */
    /**
     * Sample code: Bindings_CreateOrUpdate.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void bindingsCreateOrUpdate(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .bindings()
            .define("mybinding")
            .withExistingApp("myResourceGroup", "myservice", "myapp")
            .withProperties(
                new BindingResourceProperties()
                    .withResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.DocumentDB/databaseAccounts/my-cosmosdb-1")
                    .withKey("xxxx")
                    .withBindingParameters(mapOf("apiType", "SQL", "databaseName", "db1")))
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

### Bindings_Delete

```java
import com.azure.core.util.Context;

/** Samples for Bindings Delete. */
public final class BindingsDeleteSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Bindings_Delete.json
     */
    /**
     * Sample code: Bindings_Delete.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void bindingsDelete(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.bindings().delete("myResourceGroup", "myservice", "myapp", "mybinding", Context.NONE);
    }
}
```

### Bindings_Get

```java
import com.azure.core.util.Context;

/** Samples for Bindings Get. */
public final class BindingsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Bindings_Get.json
     */
    /**
     * Sample code: Bindings_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void bindingsGet(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.bindings().getWithResponse("myResourceGroup", "myservice", "myapp", "mybinding", Context.NONE);
    }
}
```

### Bindings_List

```java
import com.azure.core.util.Context;

/** Samples for Bindings List. */
public final class BindingsListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Bindings_List.json
     */
    /**
     * Sample code: Bindings_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void bindingsList(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.bindings().list("myResourceGroup", "myservice", "myapp", Context.NONE);
    }
}
```

### Bindings_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.BindingResource;
import com.azure.resourcemanager.appplatform.generated.models.BindingResourceProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for Bindings Update. */
public final class BindingsUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Bindings_Update.json
     */
    /**
     * Sample code: Bindings_Update.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void bindingsUpdate(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        BindingResource resource =
            manager
                .bindings()
                .getWithResponse("myResourceGroup", "myservice", "myapp", "mybinding", Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new BindingResourceProperties()
                    .withKey("xxxx")
                    .withBindingParameters(mapOf("apiType", "SQL", "databaseName", "db1")))
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

### Certificates_CreateOrUpdate

```java
import com.azure.resourcemanager.appplatform.generated.models.KeyVaultCertificateProperties;

/** Samples for Certificates CreateOrUpdate. */
public final class CertificatesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Certificates_CreateOrUpdate.json
     */
    /**
     * Sample code: Certificates_CreateOrUpdate.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void certificatesCreateOrUpdate(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .certificates()
            .define("mycertificate")
            .withExistingSpring("myResourceGroup", "myservice")
            .withProperties(
                new KeyVaultCertificateProperties()
                    .withVaultUri("https://myvault.vault.azure.net")
                    .withKeyVaultCertName("mycert")
                    .withCertVersion("08a219d06d874795a96db47e06fbb01e"))
            .create();
    }
}
```

### Certificates_Delete

```java
import com.azure.core.util.Context;

/** Samples for Certificates Delete. */
public final class CertificatesDeleteSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Certificates_Delete.json
     */
    /**
     * Sample code: Certificates_Delete.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void certificatesDelete(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.certificates().delete("myResourceGroup", "myservice", "mycertificate", Context.NONE);
    }
}
```

### Certificates_Get

```java
import com.azure.core.util.Context;

/** Samples for Certificates Get. */
public final class CertificatesGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Certificates_Get.json
     */
    /**
     * Sample code: Certificates_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void certificatesGet(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.certificates().getWithResponse("myResourceGroup", "myservice", "mycertificate", Context.NONE);
    }
}
```

### Certificates_List

```java
import com.azure.core.util.Context;

/** Samples for Certificates List. */
public final class CertificatesListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Certificates_List.json
     */
    /**
     * Sample code: Certificates_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void certificatesList(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.certificates().list("myResourceGroup", "myService", Context.NONE);
    }
}
```

### ConfigServers_Get

```java
import com.azure.core.util.Context;

/** Samples for ConfigServers Get. */
public final class ConfigServersGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/ConfigServers_Get.json
     */
    /**
     * Sample code: ConfigServers_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void configServersGet(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.configServers().getWithResponse("myResourceGroup", "myservice", Context.NONE);
    }
}
```

### ConfigServers_UpdatePatch

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.fluent.models.ConfigServerResourceInner;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServerGitProperty;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServerProperties;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServerSettings;
import java.util.Arrays;

/** Samples for ConfigServers UpdatePatch. */
public final class ConfigServersUpdatePatchSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/ConfigServers_UpdatePatch.json
     */
    /**
     * Sample code: ConfigServers_UpdatePatch.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void configServersUpdatePatch(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .configServers()
            .updatePatch(
                "myResourceGroup",
                "myservice",
                new ConfigServerResourceInner()
                    .withProperties(
                        new ConfigServerProperties()
                            .withConfigServer(
                                new ConfigServerSettings()
                                    .withGitProperty(
                                        new ConfigServerGitProperty()
                                            .withUri("https://github.com/fake-user/fake-repository.git")
                                            .withLabel("master")
                                            .withSearchPaths(Arrays.asList("/"))))),
                Context.NONE);
    }
}
```

### ConfigServers_UpdatePut

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.fluent.models.ConfigServerResourceInner;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServerGitProperty;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServerProperties;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServerSettings;
import java.util.Arrays;

/** Samples for ConfigServers UpdatePut. */
public final class ConfigServersUpdatePutSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/ConfigServers_UpdatePut.json
     */
    /**
     * Sample code: ConfigServers_UpdatePut.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void configServersUpdatePut(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .configServers()
            .updatePut(
                "myResourceGroup",
                "myservice",
                new ConfigServerResourceInner()
                    .withProperties(
                        new ConfigServerProperties()
                            .withConfigServer(
                                new ConfigServerSettings()
                                    .withGitProperty(
                                        new ConfigServerGitProperty()
                                            .withUri("https://github.com/fake-user/fake-repository.git")
                                            .withLabel("master")
                                            .withSearchPaths(Arrays.asList("/"))))),
                Context.NONE);
    }
}
```

### ConfigServers_Validate

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServerGitProperty;
import com.azure.resourcemanager.appplatform.generated.models.ConfigServerSettings;
import java.util.Arrays;

/** Samples for ConfigServers Validate. */
public final class ConfigServersValidateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/ConfigServers_Validate.json
     */
    /**
     * Sample code: ConfigServers_Validate.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void configServersValidate(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .configServers()
            .validate(
                "myResourceGroup",
                "myservice",
                new ConfigServerSettings()
                    .withGitProperty(
                        new ConfigServerGitProperty()
                            .withUri("https://github.com/fake-user/fake-repository.git")
                            .withLabel("master")
                            .withSearchPaths(Arrays.asList("/"))),
                Context.NONE);
    }
}
```

### CustomDomains_CreateOrUpdate

```java
import com.azure.resourcemanager.appplatform.generated.models.CustomDomainProperties;

/** Samples for CustomDomains CreateOrUpdate. */
public final class CustomDomainsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/CustomDomains_CreateOrUpdate.json
     */
    /**
     * Sample code: CustomDomains_CreateOrUpdate.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void customDomainsCreateOrUpdate(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .customDomains()
            .define("mydomain.com")
            .withExistingApp("myResourceGroup", "myservice", "myapp")
            .withProperties(
                new CustomDomainProperties()
                    .withThumbprint("934367bf1c97033f877db0f15cb1b586957d3133")
                    .withCertName("mycert"))
            .create();
    }
}
```

### CustomDomains_Delete

```java
import com.azure.core.util.Context;

/** Samples for CustomDomains Delete. */
public final class CustomDomainsDeleteSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/CustomDomains_Delete.json
     */
    /**
     * Sample code: CustomDomains_Delete.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void customDomainsDelete(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.customDomains().delete("myResourceGroup", "myservice", "myapp", "mydomain.com", Context.NONE);
    }
}
```

### CustomDomains_Get

```java
import com.azure.core.util.Context;

/** Samples for CustomDomains Get. */
public final class CustomDomainsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/CustomDomains_Get.json
     */
    /**
     * Sample code: CustomDomains_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void customDomainsGet(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.customDomains().getWithResponse("myResourceGroup", "myservice", "myapp", "mydomain.com", Context.NONE);
    }
}
```

### CustomDomains_List

```java
import com.azure.core.util.Context;

/** Samples for CustomDomains List. */
public final class CustomDomainsListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/CustomDomains_List.json
     */
    /**
     * Sample code: CustomDomains_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void customDomainsList(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.customDomains().list("myResourceGroup", "myservice", "myapp", Context.NONE);
    }
}
```

### CustomDomains_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.CustomDomainProperties;
import com.azure.resourcemanager.appplatform.generated.models.CustomDomainResource;

/** Samples for CustomDomains Update. */
public final class CustomDomainsUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/CustomDomains_Update.json
     */
    /**
     * Sample code: CustomDomains_Update.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void customDomainsUpdate(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        CustomDomainResource resource =
            manager
                .customDomains()
                .getWithResponse("myResourceGroup", "myservice", "myapp", "mydomain.com", Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new CustomDomainProperties()
                    .withThumbprint("934367bf1c97033f877db0f15cb1b586957d3133")
                    .withCertName("mycert"))
            .apply();
    }
}
```

### Deployments_CreateOrUpdate

```java
import com.azure.resourcemanager.appplatform.generated.models.CustomContainer;
import com.azure.resourcemanager.appplatform.generated.models.DeploymentResourceProperties;
import com.azure.resourcemanager.appplatform.generated.models.DeploymentSettings;
import com.azure.resourcemanager.appplatform.generated.models.ImageRegistryCredential;
import com.azure.resourcemanager.appplatform.generated.models.ResourceRequests;
import com.azure.resourcemanager.appplatform.generated.models.RuntimeVersion;
import com.azure.resourcemanager.appplatform.generated.models.UserSourceInfo;
import com.azure.resourcemanager.appplatform.generated.models.UserSourceType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Deployments CreateOrUpdate. */
public final class DeploymentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_CreateOrUpdate.json
     */
    /**
     * Sample code: Deployments_CreateOrUpdate.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsCreateOrUpdate(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .deployments()
            .define("mydeployment")
            .withExistingApp("myResourceGroup", "myservice", "myapp")
            .withProperties(
                new DeploymentResourceProperties()
                    .withSource(
                        new UserSourceInfo()
                            .withType(UserSourceType.SOURCE)
                            .withRelativePath(
                                "resources/a172cedcae47474b615c54d510a5d84a8dea3032e958587430b413538be3f333-2019082605-e3095339-1723-44b7-8b5e-31b1003978bc")
                            .withVersion("1.0")
                            .withArtifactSelector("sub-module-1"))
                    .withDeploymentSettings(
                        new DeploymentSettings()
                            .withResourceRequests(new ResourceRequests().withCpu("1000m").withMemory("3Gi"))
                            .withJvmOptions("-Xms1G -Xmx3G")
                            .withEnvironmentVariables(mapOf("env", "test"))
                            .withRuntimeVersion(RuntimeVersion.JAVA_8)))
            .create();
    }

    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_CreateOrUpdate_CustomContainer.json
     */
    /**
     * Sample code: Deployments_CreateOrUpdate_CustomContainer.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsCreateOrUpdateCustomContainer(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .deployments()
            .define("mydeployment")
            .withExistingApp("myResourceGroup", "myservice", "myapp")
            .withProperties(
                new DeploymentResourceProperties()
                    .withSource(
                        new UserSourceInfo()
                            .withType(UserSourceType.CONTAINER)
                            .withCustomContainer(
                                new CustomContainer()
                                    .withServer("myacr.azurecr.io")
                                    .withContainerImage("myContainerImage:v1")
                                    .withCommand(Arrays.asList("/bin/sh"))
                                    .withArgs(Arrays.asList("-c", "while true; do echo hello; sleep 10;done"))
                                    .withImageRegistryCredential(
                                        new ImageRegistryCredential()
                                            .withUsername("myUsername")
                                            .withPassword("myPassword"))))
                    .withDeploymentSettings(
                        new DeploymentSettings()
                            .withResourceRequests(new ResourceRequests().withCpu("1000m").withMemory("3Gi"))
                            .withEnvironmentVariables(mapOf("env", "test"))))
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

### Deployments_Delete

```java
import com.azure.core.util.Context;

/** Samples for Deployments Delete. */
public final class DeploymentsDeleteSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_Delete.json
     */
    /**
     * Sample code: Deployments_Delete.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsDelete(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.deployments().delete("myResourceGroup", "myservice", "myapp", "mydeployment", Context.NONE);
    }
}
```

### Deployments_GenerateHeapDump

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.DiagnosticParameters;

/** Samples for Deployments GenerateHeapDump. */
public final class DeploymentsGenerateHeapDumpSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_GenerateHeapDump.json
     */
    /**
     * Sample code: Deployments_GenerateHeapDump.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsGenerateHeapDump(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .deployments()
            .generateHeapDump(
                "myResourceGroup",
                "myservice",
                "myapp",
                "mydeployment",
                new DiagnosticParameters().withAppInstance("myappinstance").withFilePath("/byos/diagnose"),
                Context.NONE);
    }
}
```

### Deployments_GenerateThreadDump

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.DiagnosticParameters;

/** Samples for Deployments GenerateThreadDump. */
public final class DeploymentsGenerateThreadDumpSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_GenerateThreadDump.json
     */
    /**
     * Sample code: Deployments_GenerateHeapDump.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsGenerateHeapDump(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .deployments()
            .generateThreadDump(
                "myResourceGroup",
                "myservice",
                "myapp",
                "mydeployment",
                new DiagnosticParameters().withAppInstance("myappinstance").withFilePath("/byos/diagnose"),
                Context.NONE);
    }
}
```

### Deployments_Get

```java
import com.azure.core.util.Context;

/** Samples for Deployments Get. */
public final class DeploymentsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_Get.json
     */
    /**
     * Sample code: Deployments_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsGet(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.deployments().getWithResponse("myResourceGroup", "myservice", "myapp", "mydeployment", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_Get_CustomContainer.json
     */
    /**
     * Sample code: Deployments_Get_CustomContainer.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsGetCustomContainer(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.deployments().getWithResponse("myResourceGroup", "myservice", "myapp", "mydeployment", Context.NONE);
    }
}
```

### Deployments_GetLogFileUrl

```java
import com.azure.core.util.Context;

/** Samples for Deployments GetLogFileUrl. */
public final class DeploymentsGetLogFileUrlSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_GetLogFileUrl.json
     */
    /**
     * Sample code: Deployments_GetLogFileUrl.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsGetLogFileUrl(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .deployments()
            .getLogFileUrlWithResponse("myResourceGroup", "myservice", "myapp", "mydeployment", Context.NONE);
    }
}
```

### Deployments_List

```java
import com.azure.core.util.Context;

/** Samples for Deployments List. */
public final class DeploymentsListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_List.json
     */
    /**
     * Sample code: Deployments_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsList(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.deployments().list("myResourceGroup", "myservice", "myapp", null, Context.NONE);
    }
}
```

### Deployments_ListForCluster

```java
import com.azure.core.util.Context;

/** Samples for Deployments ListForCluster. */
public final class DeploymentsListForClusterSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_ListForCluster.json
     */
    /**
     * Sample code: Deployments_ListForCluster.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsListForCluster(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.deployments().listForCluster("myResourceGroup", "myservice", null, Context.NONE);
    }
}
```

### Deployments_Restart

```java
import com.azure.core.util.Context;

/** Samples for Deployments Restart. */
public final class DeploymentsRestartSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_Restart.json
     */
    /**
     * Sample code: Deployments_Restart.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsRestart(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.deployments().restart("myResourceGroup", "myservice", "myapp", "mydeployment", Context.NONE);
    }
}
```

### Deployments_Start

```java
import com.azure.core.util.Context;

/** Samples for Deployments Start. */
public final class DeploymentsStartSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_Start.json
     */
    /**
     * Sample code: Deployments_Start.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsStart(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.deployments().start("myResourceGroup", "myservice", "myapp", "mydeployment", Context.NONE);
    }
}
```

### Deployments_StartJfr

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.DiagnosticParameters;

/** Samples for Deployments StartJfr. */
public final class DeploymentsStartJfrSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_StartJFR.json
     */
    /**
     * Sample code: Deployments_StartJFR.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsStartJFR(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .deployments()
            .startJfr(
                "myResourceGroup",
                "myservice",
                "myapp",
                "mydeployment",
                new DiagnosticParameters()
                    .withAppInstance("myappinstance")
                    .withFilePath("/byos/diagnose")
                    .withDuration("60s"),
                Context.NONE);
    }
}
```

### Deployments_Stop

```java
import com.azure.core.util.Context;

/** Samples for Deployments Stop. */
public final class DeploymentsStopSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_Stop.json
     */
    /**
     * Sample code: Deployments_Stop.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsStop(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.deployments().stop("myResourceGroup", "myservice", "myapp", "mydeployment", Context.NONE);
    }
}
```

### Deployments_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.CustomContainer;
import com.azure.resourcemanager.appplatform.generated.models.DeploymentResource;
import com.azure.resourcemanager.appplatform.generated.models.DeploymentResourceProperties;
import com.azure.resourcemanager.appplatform.generated.models.ImageRegistryCredential;
import com.azure.resourcemanager.appplatform.generated.models.UserSourceInfo;
import com.azure.resourcemanager.appplatform.generated.models.UserSourceType;
import java.util.Arrays;

/** Samples for Deployments Update. */
public final class DeploymentsUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_Update.json
     */
    /**
     * Sample code: Deployments_Update.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsUpdate(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        DeploymentResource resource =
            manager
                .deployments()
                .getWithResponse("myResourceGroup", "myservice", "myapp", "mydeployment", Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new DeploymentResourceProperties()
                    .withSource(
                        new UserSourceInfo()
                            .withType(UserSourceType.SOURCE)
                            .withRelativePath(
                                "resources/a172cedcae47474b615c54d510a5d84a8dea3032e958587430b413538be3f333-2019082605-e3095339-1723-44b7-8b5e-31b1003978bc")
                            .withVersion("1.0")
                            .withArtifactSelector("sub-module-1")))
            .apply();
    }

    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Deployments_Update_CustomContainer.json
     */
    /**
     * Sample code: Deployments_Update_CustomContainer.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void deploymentsUpdateCustomContainer(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        DeploymentResource resource =
            manager
                .deployments()
                .getWithResponse("myResourceGroup", "myservice", "myapp", "mydeployment", Context.NONE)
                .getValue();
        resource
            .update()
            .withProperties(
                new DeploymentResourceProperties()
                    .withSource(
                        new UserSourceInfo()
                            .withType(UserSourceType.CONTAINER)
                            .withCustomContainer(
                                new CustomContainer()
                                    .withServer("mynewacr.azurecr.io")
                                    .withContainerImage("myNewContainerImage:v1")
                                    .withCommand(Arrays.asList("/bin/sh"))
                                    .withArgs(Arrays.asList("-c", "while true; do echo hello; sleep 10;done"))
                                    .withImageRegistryCredential(
                                        new ImageRegistryCredential()
                                            .withUsername("myNewUsername")
                                            .withPassword("<myNewPassword>")))))
            .apply();
    }
}
```

### MonitoringSettings_Get

```java
import com.azure.core.util.Context;

/** Samples for MonitoringSettings Get. */
public final class MonitoringSettingsGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/MonitoringSettings_Get.json
     */
    /**
     * Sample code: MonitoringSettings_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void monitoringSettingsGet(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.monitoringSettings().getWithResponse("myResourceGroup", "myservice", Context.NONE);
    }
}
```

### MonitoringSettings_UpdatePatch

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.fluent.models.MonitoringSettingResourceInner;
import com.azure.resourcemanager.appplatform.generated.models.MonitoringSettingProperties;

/** Samples for MonitoringSettings UpdatePatch. */
public final class MonitoringSettingsUpdatePatchSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/MonitoringSettings_UpdatePatch.json
     */
    /**
     * Sample code: MonitoringSettings_UpdatePatch.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void monitoringSettingsUpdatePatch(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .monitoringSettings()
            .updatePatch(
                "myResourceGroup",
                "myservice",
                new MonitoringSettingResourceInner()
                    .withProperties(
                        new MonitoringSettingProperties()
                            .withTraceEnabled(true)
                            .withAppInsightsInstrumentationKey("00000000-0000-0000-0000-000000000000")
                            .withAppInsightsSamplingRate(10.0D)),
                Context.NONE);
    }
}
```

### MonitoringSettings_UpdatePut

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.fluent.models.MonitoringSettingResourceInner;
import com.azure.resourcemanager.appplatform.generated.models.MonitoringSettingProperties;

/** Samples for MonitoringSettings UpdatePut. */
public final class MonitoringSettingsUpdatePutSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/MonitoringSettings_UpdatePut.json
     */
    /**
     * Sample code: MonitoringSettings_UpdatePut.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void monitoringSettingsUpdatePut(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .monitoringSettings()
            .updatePut(
                "myResourceGroup",
                "myservice",
                new MonitoringSettingResourceInner()
                    .withProperties(
                        new MonitoringSettingProperties()
                            .withTraceEnabled(true)
                            .withAppInsightsInstrumentationKey("00000000-0000-0000-0000-000000000000")
                            .withAppInsightsSamplingRate(10.0D)),
                Context.NONE);
    }
}
```

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void operationsList(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

### RuntimeVersions_ListRuntimeVersions

```java
import com.azure.core.util.Context;

/** Samples for RuntimeVersions ListRuntimeVersions. */
public final class RuntimeVersionsListRuntimeVersionsSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/RuntimeVersions_ListRuntimeVersions.json
     */
    /**
     * Sample code: RuntimeVersions_ListRuntimeVersions.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void runtimeVersionsListRuntimeVersions(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.runtimeVersions().listRuntimeVersionsWithResponse(Context.NONE);
    }
}
```

### Services_CheckNameAvailability

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.NameAvailabilityParameters;

/** Samples for Services CheckNameAvailability. */
public final class ServicesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_CheckNameAvailability.json
     */
    /**
     * Sample code: Services_CheckNameAvailability.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesCheckNameAvailability(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .services()
            .checkNameAvailabilityWithResponse(
                "eastus",
                new NameAvailabilityParameters().withType("Microsoft.AppPlatform/Spring").withName("myservice"),
                Context.NONE);
    }
}
```

### Services_CreateOrUpdate

```java
import com.azure.resourcemanager.appplatform.generated.models.ClusterResourceProperties;
import com.azure.resourcemanager.appplatform.generated.models.NetworkProfile;
import com.azure.resourcemanager.appplatform.generated.models.Sku;
import java.util.HashMap;
import java.util.Map;

/** Samples for Services CreateOrUpdate. */
public final class ServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_CreateOrUpdate_VNetInjection.json
     */
    /**
     * Sample code: Services_CreateOrUpdate_VNetInjection.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesCreateOrUpdateVNetInjection(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .services()
            .define("myservice")
            .withRegion("eastus")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("key1", "value1"))
            .withProperties(
                new ClusterResourceProperties()
                    .withNetworkProfile(
                        new NetworkProfile()
                            .withServiceRuntimeSubnetId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/myVirtualNetwork/subnets/serviceRuntime")
                            .withAppSubnetId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Network/virtualNetworks/myVirtualNetwork/subnets/apps")
                            .withServiceCidr("10.8.0.0/16,10.244.0.0/16,10.245.0.1/16")
                            .withServiceRuntimeNetworkResourceGroup("my-service-runtime-network-rg")
                            .withAppNetworkResourceGroup("my-app-network-rg")))
            .withSku(new Sku().withName("S0").withTier("Standard"))
            .create();
    }

    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_CreateOrUpdate.json
     */
    /**
     * Sample code: Services_CreateOrUpdate.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesCreateOrUpdate(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .services()
            .define("myservice")
            .withRegion("eastus")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("key1", "value1"))
            .withProperties(new ClusterResourceProperties())
            .withSku(new Sku().withName("S0").withTier("Standard"))
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

### Services_Delete

```java
import com.azure.core.util.Context;

/** Samples for Services Delete. */
public final class ServicesDeleteSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_Delete.json
     */
    /**
     * Sample code: Services_Delete.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesDelete(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.services().delete("myResourceGroup", "myservice", Context.NONE);
    }
}
```

### Services_DisableTestEndpoint

```java
import com.azure.core.util.Context;

/** Samples for Services DisableTestEndpoint. */
public final class ServicesDisableTestEndpointSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_DisableTestEndpoint.json
     */
    /**
     * Sample code: Services_DisableTestEndpoint.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesDisableTestEndpoint(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.services().disableTestEndpointWithResponse("myResourceGroup", "myservice", Context.NONE);
    }
}
```

### Services_EnableTestEndpoint

```java
import com.azure.core.util.Context;

/** Samples for Services EnableTestEndpoint. */
public final class ServicesEnableTestEndpointSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_EnableTestEndpoint.json
     */
    /**
     * Sample code: Services_EnableTestEndpoint.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesEnableTestEndpoint(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.services().enableTestEndpointWithResponse("myResourceGroup", "myservice", Context.NONE);
    }
}
```

### Services_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Services GetByResourceGroup. */
public final class ServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_Get.json
     */
    /**
     * Sample code: Services_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesGet(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.services().getByResourceGroupWithResponse("myResourceGroup", "myservice", Context.NONE);
    }
}
```

### Services_List

```java
import com.azure.core.util.Context;

/** Samples for Services List. */
public final class ServicesListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_ListBySubscription.json
     */
    /**
     * Sample code: Services_ListBySubscription.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesListBySubscription(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.services().list(Context.NONE);
    }
}
```

### Services_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for Services ListByResourceGroup. */
public final class ServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_List.json
     */
    /**
     * Sample code: Services_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesList(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.services().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
```

### Services_ListTestKeys

```java
import com.azure.core.util.Context;

/** Samples for Services ListTestKeys. */
public final class ServicesListTestKeysSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_ListTestKeys.json
     */
    /**
     * Sample code: Services_ListTestKeys.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesListTestKeys(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.services().listTestKeysWithResponse("myResourceGroup", "myservice", Context.NONE);
    }
}
```

### Services_RegenerateTestKey

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.RegenerateTestKeyRequestPayload;
import com.azure.resourcemanager.appplatform.generated.models.TestKeyType;

/** Samples for Services RegenerateTestKey. */
public final class ServicesRegenerateTestKeySamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_RegenerateTestKey.json
     */
    /**
     * Sample code: Services_RegenerateTestKey.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesRegenerateTestKey(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .services()
            .regenerateTestKeyWithResponse(
                "myResourceGroup",
                "myservice",
                new RegenerateTestKeyRequestPayload().withKeyType(TestKeyType.PRIMARY),
                Context.NONE);
    }
}
```

### Services_Start

```java
import com.azure.core.util.Context;

/** Samples for Services Start. */
public final class ServicesStartSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_Start.json
     */
    /**
     * Sample code: Services_Start.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesStart(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.services().start("myResourceGroup", "myservice", Context.NONE);
    }
}
```

### Services_Stop

```java
import com.azure.core.util.Context;

/** Samples for Services Stop. */
public final class ServicesStopSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_Stop.json
     */
    /**
     * Sample code: Services_Stop.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesStop(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.services().stop("myResourceGroup", "myservice", Context.NONE);
    }
}
```

### Services_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.appplatform.generated.models.ClusterResourceProperties;
import com.azure.resourcemanager.appplatform.generated.models.ServiceResource;
import com.azure.resourcemanager.appplatform.generated.models.Sku;
import java.util.HashMap;
import java.util.Map;

/** Samples for Services Update. */
public final class ServicesUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Services_Update.json
     */
    /**
     * Sample code: Services_Update.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void servicesUpdate(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        ServiceResource resource =
            manager.services().getByResourceGroupWithResponse("myResourceGroup", "myservice", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("key1", "value1"))
            .withProperties(new ClusterResourceProperties())
            .withSku(new Sku().withName("S0").withTier("Standard"))
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

### Skus_List

```java
import com.azure.core.util.Context;

/** Samples for Skus List. */
public final class SkusListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Skus_List.json
     */
    /**
     * Sample code: Skus_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void skusList(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.skus().list(Context.NONE);
    }
}
```

### Storages_CreateOrUpdate

```java
import com.azure.resourcemanager.appplatform.generated.models.StorageAccount;

/** Samples for Storages CreateOrUpdate. */
public final class StoragesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Storages_CreateOrUpdate.json
     */
    /**
     * Sample code: Storages_CreateOrUpdate.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void storagesCreateOrUpdate(
        com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager
            .storages()
            .define("mystorage")
            .withExistingSpring("myResourceGroup", "myservice")
            .withProperties(
                new StorageAccount()
                    .withAccountName("storage-account-name")
                    .withAccountKey("account-key-of-storage-account"))
            .create();
    }
}
```

### Storages_Delete

```java
import com.azure.core.util.Context;

/** Samples for Storages Delete. */
public final class StoragesDeleteSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Storages_Delete.json
     */
    /**
     * Sample code: Storages_Delete.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void storagesDelete(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.storages().delete("myResourceGroup", "myservice", "mystorage", Context.NONE);
    }
}
```

### Storages_Get

```java
import com.azure.core.util.Context;

/** Samples for Storages Get. */
public final class StoragesGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Storages_Get.json
     */
    /**
     * Sample code: Storages_Get.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void storagesGet(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.storages().getWithResponse("myResourceGroup", "myservice", "mystorage", Context.NONE);
    }
}
```

### Storages_List

```java
import com.azure.core.util.Context;

/** Samples for Storages List. */
public final class StoragesListSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2021-09-01-preview/examples/Storages_List.json
     */
    /**
     * Sample code: Storages_List.
     *
     * @param manager Entry point to AppPlatformManager.
     */
    public static void storagesList(com.azure.resourcemanager.appplatform.generated.AppPlatformManager manager) {
        manager.storages().list("myResourceGroup", "myService", Context.NONE);
    }
}
```

