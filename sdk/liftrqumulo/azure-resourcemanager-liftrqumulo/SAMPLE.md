# Code snippets and samples


## FileSystems

- [CreateOrUpdate](#filesystems_createorupdate)
- [Delete](#filesystems_delete)
- [GetByResourceGroup](#filesystems_getbyresourcegroup)
- [List](#filesystems_list)
- [ListByResourceGroup](#filesystems_listbyresourcegroup)
- [Update](#filesystems_update)

## Operations

- [List](#operations_list)
### FileSystems_CreateOrUpdate

```java
import com.azure.resourcemanager.liftrqumulo.models.CompanyDetails;
import com.azure.resourcemanager.liftrqumulo.models.ManagedServiceIdentity;
import com.azure.resourcemanager.liftrqumulo.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.liftrqumulo.models.MarketplaceDetails;
import com.azure.resourcemanager.liftrqumulo.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.liftrqumulo.models.ProvisioningState;
import com.azure.resourcemanager.liftrqumulo.models.StorageSku;
import com.azure.resourcemanager.liftrqumulo.models.UserAssignedIdentity;
import com.azure.resourcemanager.liftrqumulo.models.UserDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for FileSystems CreateOrUpdate. */
public final class FileSystemsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/liftrqumulo/resource-manager/Qumulo.Storage/preview/2022-10-12-preview/examples/FileSystems_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: FileSystems_CreateOrUpdate.
     *
     * @param manager Entry point to LiftrqumuloManager.
     */
    public static void fileSystemsCreateOrUpdate(com.azure.resourcemanager.liftrqumulo.LiftrqumuloManager manager) {
        manager
            .fileSystems()
            .define("ijosiuxfhkqtswgsjiilcbyraqrp")
            .withRegion("od")
            .withExistingResourceGroup("rgQumulo")
            .withTags(mapOf("key2901", "bmzbihobnlbtafhwnpryicdsbwfmf"))
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.NONE)
                    .withUserAssignedIdentities(mapOf("key2756", new UserAssignedIdentity())))
            .withSubscriptionId("smnqbzudwydzudyqurzum")
            .withMarketplaceDetails(
                new MarketplaceDetails()
                    .withMarketplaceSubscriptionId("ikghltucwsxnr")
                    .withPlanId("xtzclejvlyxmsaildd")
                    .withOfferId("lo")
                    .withPublisherId("djjmggyxisvitqhhmcmhfn")
                    .withMarketplaceSubscriptionStatus(MarketplaceSubscriptionStatus.PENDING_FULFILLMENT_START))
            .withProvisioningState(ProvisioningState.ACCEPTED)
            .withUserDetails(
                new UserDetails()
                    .withFirstName("cilpifwcfpblpetscouvqsvbcu")
                    .withLastName("aquxvkp")
                    .withEmail("ynfwsgxfasiwrijwhihviiisolml")
                    .withAlternateEmail("qbcednrlrdadhbyfqer")
                    .withUpn("azhdvxcnxtxlffnvgdezoqaaubbjs")
                    .withAddress("ejpoelmtcsurftxomz")
                    .withContactPhoneNumber("jpvopjdokqpa"))
            .withCompanyDetails(
                new CompanyDetails()
                    .withCompanyName("dvwtrpcj")
                    .withOfficeAddress("dfexlqjp")
                    .withCountry("isvjcoxcfehppmokvbfwwsepfna")
                    .withDomain("ruxunoatndj")
                    .withBusiness("qbjsixscgcfexmquofdbxhdjh")
                    .withNumberOfEmployees(12))
            .withDelegatedSubnetId("capcwnggttgpprwfmzqundh")
            .withClusterLoginUrl("mgujvlhdlhoejfkhaq")
            .withPrivateIPs(Arrays.asList("gblgqxeeshzxodifjofoubnk"))
            .withAdminPassword("xxjmjkugnimtajejftdqauhphfjhg")
            .withInitialCapacity(11)
            .withAvailabilityZone("tkjirtjhr")
            .withStorageSku(StorageSku.STANDARD)
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

### FileSystems_Delete

```java
import com.azure.core.util.Context;

/** Samples for FileSystems Delete. */
public final class FileSystemsDeleteSamples {
    /*
     * x-ms-original-file: specification/liftrqumulo/resource-manager/Qumulo.Storage/preview/2022-10-12-preview/examples/FileSystems_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: FileSystems_Delete.
     *
     * @param manager Entry point to LiftrqumuloManager.
     */
    public static void fileSystemsDelete(com.azure.resourcemanager.liftrqumulo.LiftrqumuloManager manager) {
        manager.fileSystems().delete("rgQumulo", "yiykazmrsjsdryfgh", Context.NONE);
    }
}
```

### FileSystems_GetByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for FileSystems GetByResourceGroup. */
public final class FileSystemsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/liftrqumulo/resource-manager/Qumulo.Storage/preview/2022-10-12-preview/examples/FileSystems_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: FileSystems_Get.
     *
     * @param manager Entry point to LiftrqumuloManager.
     */
    public static void fileSystemsGet(com.azure.resourcemanager.liftrqumulo.LiftrqumuloManager manager) {
        manager.fileSystems().getByResourceGroupWithResponse("rgQumulo", "mefyftyxcftmkfbckscgvjnqzj", Context.NONE);
    }
}
```

### FileSystems_List

```java
import com.azure.core.util.Context;

/** Samples for FileSystems List. */
public final class FileSystemsListSamples {
    /*
     * x-ms-original-file: specification/liftrqumulo/resource-manager/Qumulo.Storage/preview/2022-10-12-preview/examples/FileSystems_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: FileSystems_ListBySubscription.
     *
     * @param manager Entry point to LiftrqumuloManager.
     */
    public static void fileSystemsListBySubscription(com.azure.resourcemanager.liftrqumulo.LiftrqumuloManager manager) {
        manager.fileSystems().list(Context.NONE);
    }
}
```

### FileSystems_ListByResourceGroup

```java
import com.azure.core.util.Context;

/** Samples for FileSystems ListByResourceGroup. */
public final class FileSystemsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/liftrqumulo/resource-manager/Qumulo.Storage/preview/2022-10-12-preview/examples/FileSystems_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: FileSystems_ListByResourceGroup.
     *
     * @param manager Entry point to LiftrqumuloManager.
     */
    public static void fileSystemsListByResourceGroup(
        com.azure.resourcemanager.liftrqumulo.LiftrqumuloManager manager) {
        manager.fileSystems().listByResourceGroup("rgQumulo", Context.NONE);
    }
}
```

### FileSystems_Update

```java
import com.azure.core.util.Context;
import com.azure.resourcemanager.liftrqumulo.models.CompanyDetails;
import com.azure.resourcemanager.liftrqumulo.models.FileSystemResource;
import com.azure.resourcemanager.liftrqumulo.models.FileSystemResourceUpdateProperties;
import com.azure.resourcemanager.liftrqumulo.models.ManagedServiceIdentity;
import com.azure.resourcemanager.liftrqumulo.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.liftrqumulo.models.MarketplaceDetails;
import com.azure.resourcemanager.liftrqumulo.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.liftrqumulo.models.ProvisioningState;
import com.azure.resourcemanager.liftrqumulo.models.StorageSku;
import com.azure.resourcemanager.liftrqumulo.models.UserAssignedIdentity;
import com.azure.resourcemanager.liftrqumulo.models.UserDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for FileSystems Update. */
public final class FileSystemsUpdateSamples {
    /*
     * x-ms-original-file: specification/liftrqumulo/resource-manager/Qumulo.Storage/preview/2022-10-12-preview/examples/FileSystems_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: FileSystems_Update.
     *
     * @param manager Entry point to LiftrqumuloManager.
     */
    public static void fileSystemsUpdate(com.azure.resourcemanager.liftrqumulo.LiftrqumuloManager manager) {
        FileSystemResource resource =
            manager
                .fileSystems()
                .getByResourceGroupWithResponse("rgQumulo", "yrlsyapdaqzbgepkr", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key8143", "ydwrbn"))
            .withIdentity(
                new ManagedServiceIdentity()
                    .withType(ManagedServiceIdentityType.NONE)
                    .withUserAssignedIdentities(mapOf("key2756", new UserAssignedIdentity())))
            .withProperties(
                new FileSystemResourceUpdateProperties()
                    .withSubscriptionId("vrsd")
                    .withMarketplaceDetails(
                        new MarketplaceDetails()
                            .withMarketplaceSubscriptionId("ikghltucwsxnr")
                            .withPlanId("xtzclejvlyxmsaildd")
                            .withOfferId("lo")
                            .withPublisherId("djjmggyxisvitqhhmcmhfn")
                            .withMarketplaceSubscriptionStatus(MarketplaceSubscriptionStatus.PENDING_FULFILLMENT_START))
                    .withProvisioningState(ProvisioningState.ACCEPTED)
                    .withUserDetails(
                        new UserDetails()
                            .withFirstName("cilpifwcfpblpetscouvqsvbcu")
                            .withLastName("aquxvkp")
                            .withEmail("ynfwsgxfasiwrijwhihviiisolml")
                            .withAlternateEmail("qbcednrlrdadhbyfqer")
                            .withUpn("azhdvxcnxtxlffnvgdezoqaaubbjs")
                            .withAddress("ejpoelmtcsurftxomz")
                            .withContactPhoneNumber("jpvopjdokqpa"))
                    .withCompanyDetails(
                        new CompanyDetails()
                            .withCompanyName("dvwtrpcj")
                            .withOfficeAddress("dfexlqjp")
                            .withCountry("isvjcoxcfehppmokvbfwwsepfna")
                            .withDomain("ruxunoatndj")
                            .withBusiness("qbjsixscgcfexmquofdbxhdjh")
                            .withNumberOfEmployees(12))
                    .withDelegatedSubnetId("soigfvd")
                    .withClusterLoginUrl("uyhifadtmdioqazhncrtnxbiwl")
                    .withPrivateIPs(Arrays.asList("ewwulpsykyubjvq"))
                    .withAdminPassword("fakeTokenPlaceholder")
                    .withInitialCapacity(24)
                    .withAvailabilityZone("pwypryyqxjrobmkgggyzuhgqty")
                    .withStorageSku(StorageSku.STANDARD))
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

### Operations_List

```java
import com.azure.core.util.Context;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/liftrqumulo/resource-manager/Qumulo.Storage/preview/2022-10-12-preview/examples/Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List.
     *
     * @param manager Entry point to LiftrqumuloManager.
     */
    public static void operationsList(com.azure.resourcemanager.liftrqumulo.LiftrqumuloManager manager) {
        manager.operations().list(Context.NONE);
    }
}
```

