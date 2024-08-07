# Code snippets and samples


## Organizations

- [CreateOrUpdate](#organizations_createorupdate)
- [Delete](#organizations_delete)
- [GetAllServerlessRuntimes](#organizations_getallserverlessruntimes)
- [GetByResourceGroup](#organizations_getbyresourcegroup)
- [GetServerlessMetadata](#organizations_getserverlessmetadata)
- [List](#organizations_list)
- [ListByResourceGroup](#organizations_listbyresourcegroup)
- [Update](#organizations_update)

## ServerlessRuntimes

- [CheckDependencies](#serverlessruntimes_checkdependencies)
- [CreateOrUpdate](#serverlessruntimes_createorupdate)
- [Delete](#serverlessruntimes_delete)
- [Get](#serverlessruntimes_get)
- [ListByInformaticaOrganizationResource](#serverlessruntimes_listbyinformaticaorganizationresource)
- [ServerlessResourceById](#serverlessruntimes_serverlessresourcebyid)
- [StartFailedServerlessRuntime](#serverlessruntimes_startfailedserverlessruntime)
- [Update](#serverlessruntimes_update)
### Organizations_CreateOrUpdate

```java
import com.azure.resourcemanager.informaticadatamanagement.models.CompanyDetails;
import com.azure.resourcemanager.informaticadatamanagement.models.InformaticaProperties;
import com.azure.resourcemanager.informaticadatamanagement.models.LinkOrganization;
import com.azure.resourcemanager.informaticadatamanagement.models.MarketplaceDetails;
import com.azure.resourcemanager.informaticadatamanagement.models.OfferDetails;
import com.azure.resourcemanager.informaticadatamanagement.models.OrganizationProperties;
import com.azure.resourcemanager.informaticadatamanagement.models.UserDetails;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations CreateOrUpdate.
 */
public final class OrganizationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_CreateOrUpdate.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsCreateOrUpdate(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations()
            .define("Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$")
            .withRegion("oshycicpqnwfzuzhhmjlzg")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf("key5447", "fakeTokenPlaceholder"))
            .withProperties(new OrganizationProperties()
                .withInformaticaProperties(
                    new InformaticaProperties().withOrganizationId("yypuxswqwvhuewxpziryohcfmfhyd")
                        .withOrganizationName("naolgujbmloxrdftitalynk")
                        .withInformaticaRegion("qzvcghaveycaampweyutgxbglpj")
                        .withSingleSignOnUrl("https://microsoft.com/a"))
                .withMarketplaceDetails(new MarketplaceDetails()
                    .withMarketplaceSubscriptionId("xitahjgustmypfbiluzzdkhpsa")
                    .withOfferDetails(new OfferDetails().withPublisherId("gqngfoomtwiurhdkitdnwnjhsgepkkncgjqq")
                        .withOfferId("trjuaazcx")
                        .withPlanId(
                            "xxnopfopgrwtdzvdcwmidfbzhdjhbgkptbzefkahwepktgwprxoskcmejqtpjjdxrvlcwfwlsdqqbucyxogfkpdxezasfmxeeemoxnbxnqdgpoudsdrnsuvldtuerqpdxjkiqihdtzfgfeusansdqkmjtbbltvgptzpswvgfxtesncsdokgggrvdxtktfz")
                        .withPlanName("dduuzxdngmfydpem")
                        .withTermUnit("zjrrtswweftikanwlgecv")
                        .withTermId(
                            "tqsdznrymcnjtvldjbmgvgiekqebgkwowthlyxvjvdjnfuwtxzcjbnusekcmzwcatcejinwpvpkkiacbweisf")))
                .withUserDetails(new UserDetails().withFirstName("rkminenlovyel")
                    .withLastName("ncmhqnygcmw")
                    .withEmailAddress(
                        "Replace this value with a string matching RegExp ^[A-Za-z0-9._%+-]+@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$")
                    .withUpn("igbsynwvqfzrcqlowbipdzzc")
                    .withPhoneNumber("mgyfiugmtyqfylr"))
                .withCompanyDetails(new CompanyDetails().withCompanyName("hdyxipmwkkylsum")
                    .withOfficeAddress("qifygbvzldkhohkkjphb")
                    .withCountry("ixdxnrene")
                    .withDomain("whkuacwuu")
                    .withBusiness("v")
                    .withNumberOfEmployees(22))
                .withLinkOrganization(new LinkOrganization().withToken("fakeTokenPlaceholder")))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_CreateOrUpdate_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsCreateOrUpdateMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations()
            .define("n6v")
            .withRegion("pamjoudtssthlbhrnfjidr")
            .withExistingResourceGroup("rgopenapi")
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

### Organizations_Delete

```java
/**
 * Samples for Organizations Delete.
 */
public final class OrganizationsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Delete.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsDelete(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations()
            .delete("rgopenapi", "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Delete_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsDeleteMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations().delete("rgopenapi", "_-", com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_GetAllServerlessRuntimes

```java
/**
 * Samples for Organizations GetAllServerlessRuntimes.
 */
public final class OrganizationsGetAllServerlessRuntimesSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_GetAllServerlessRuntimes_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetAllServerlessRuntimes_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsGetAllServerlessRuntimesMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations()
            .getAllServerlessRuntimesWithResponse("rgopenapi", "0", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_GetAllServerlessRuntimes_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetAllServerlessRuntimes.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsGetAllServerlessRuntimes(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations()
            .getAllServerlessRuntimesWithResponse("rgopenapi",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$", com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_GetByResourceGroup

```java
/**
 * Samples for Organizations GetByResourceGroup.
 */
public final class OrganizationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Get_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsGetMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations().getByResourceGroupWithResponse("rgopenapi", "q", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Get.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void
        organizationsGet(com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations()
            .getByResourceGroupWithResponse("rgopenapi",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$", com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_GetServerlessMetadata

```java
/**
 * Samples for Organizations GetServerlessMetadata.
 */
public final class OrganizationsGetServerlessMetadataSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_GetServerlessMetadata_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetServerlessMetadata_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsGetServerlessMetadataMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations().getServerlessMetadataWithResponse("rgopenapi", "A", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_GetServerlessMetadata_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetServerlessMetadata.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsGetServerlessMetadata(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations()
            .getServerlessMetadataWithResponse("rgopenapi",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$", com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_List

```java
/**
 * Samples for Organizations List.
 */
public final class OrganizationsListSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListBySubscription.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsListBySubscription(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListBySubscription_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsListBySubscriptionMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_ListByResourceGroup

```java
/**
 * Samples for Organizations ListByResourceGroup.
 */
public final class OrganizationsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListByResourceGroup_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsListByResourceGroupMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListByResourceGroup.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsListByResourceGroup(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.organizations().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_Update

```java
import com.azure.resourcemanager.informaticadatamanagement.models.CompanyDetailsUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.InformaticaOrganizationResource;
import com.azure.resourcemanager.informaticadatamanagement.models.MarketplaceDetailsUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.OfferDetailsUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.OrganizationPropertiesCustomUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.UserDetailsUpdate;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations Update.
 */
public final class OrganizationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Update.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsUpdate(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        InformaticaOrganizationResource resource = manager.organizations()
            .getByResourceGroupWithResponse("rgopenapi",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key7635", "fakeTokenPlaceholder"))
            .withProperties(new OrganizationPropertiesCustomUpdate()
                .withMarketplaceDetails(new MarketplaceDetailsUpdate()
                    .withMarketplaceSubscriptionId("jtdcainfglxsdgcxujqx")
                    .withOfferDetails(new OfferDetailsUpdate().withPublisherId("wehewpeiarivfyuszfxihzifsol")
                        .withOfferId("spfkayqchinvbjvjordwiccmjlqlmzydpnoc")
                        .withPlanId(
                            "gkxxszqcbbjgeuhhkyhzoxblintfonwtstlmhznxjmrnbkgmqgecoyghyrgfvfnisydjtpplckoreyercglhwnxotzxieoujudwzwdjaeczsjmcupfukkiaqcecfbjbzvauxkfvycgtpxxafeoslyjhkjeglaphplbtupzsksylut")
                        .withPlanName(
                            "hojezrhbwkurkiqfgnmseidyfqzphlydtjbmairtbjlokbwauuydmagrkxebilnjwiehkfkqbdtnipaabnakmrenaizgbkoctxdfxixkqxkrjutoinniwnzdmwzgiuagmorcqbplfucebhurxuttvalqfwqdqxntyyehjvmmtnlaccvzfwpjncgzpypkiyjphyesjmbpeyterbenxqd")
                        .withTermUnit("hkppskqgpjcmdhwtbzmqsdtzeimtfehftfas")
                        .withTermId("pmliemwwcvpdybqqqglvjrgpuirulcrhljaptuoejaramacnemrtgbfql")))
                .withUserDetails(new UserDetailsUpdate().withFirstName("iqhylcdxdddweblzlo")
                    .withLastName("niejierxdxkhtprappvyouhmq")
                    .withEmailAddress(
                        "Replace this value with a string matching RegExp ^[A-Za-z0-9._%+-]+@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$")
                    .withUpn("qmosxykp")
                    .withPhoneNumber("uqytos"))
                .withCompanyDetails(new CompanyDetailsUpdate().withCompanyName("rcbluovcofnaayzbharx")
                    .withOfficeAddress("abwtuqnqnikrvp")
                    .withCountry("oitw")
                    .withDomain("igbwijvqbzxinceeq")
                    .withBusiness("orrm")
                    .withNumberOfEmployees(7))
                .withExistingResourceId("doaf"))
            .apply();
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * Organizations_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Update_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void organizationsUpdateMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        InformaticaOrganizationResource resource = manager.organizations()
            .getByResourceGroupWithResponse("rgopenapi", "-", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
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

### ServerlessRuntimes_CheckDependencies

```java
/**
 * Samples for ServerlessRuntimes CheckDependencies.
 */
public final class ServerlessRuntimesCheckDependenciesSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_CheckDependencies_MinimumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_CheckDependencies_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesCheckDependenciesMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.serverlessRuntimes()
            .checkDependenciesWithResponse("rgopenapi", "_-", "_2_", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_CheckDependencies_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_CheckDependencies.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesCheckDependencies(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.serverlessRuntimes()
            .checkDependenciesWithResponse("rgopenapi",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$", com.azure.core.util.Context.NONE);
    }
}
```

### ServerlessRuntimes_CreateOrUpdate

```java
import com.azure.resourcemanager.informaticadatamanagement.models.AdvancedCustomProperties;
import com.azure.resourcemanager.informaticadatamanagement.models.ApplicationConfigs;
import com.azure.resourcemanager.informaticadatamanagement.models.ApplicationType;
import com.azure.resourcemanager.informaticadatamanagement.models.CdiConfigProps;
import com.azure.resourcemanager.informaticadatamanagement.models.InformaticaServerlessRuntimeProperties;
import com.azure.resourcemanager.informaticadatamanagement.models.NetworkInterfaceConfiguration;
import com.azure.resourcemanager.informaticadatamanagement.models.PlatformType;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeConfigProperties;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeDataDisk;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeNetworkProfile;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeTag;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeUserContextProperties;
import java.util.Arrays;

/**
 * Samples for ServerlessRuntimes CreateOrUpdate.
 */
public final class ServerlessRuntimesCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_CreateOrUpdate.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesCreateOrUpdate(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.serverlessRuntimes()
            .define("Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$")
            .withExistingOrganization("rgopenapi", "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$")
            .withProperties(new InformaticaServerlessRuntimeProperties().withDescription("vzkpdxpgh")
                .withPlatform(PlatformType.AZURE)
                .withApplicationType(ApplicationType.CDI)
                .withComputeUnits("kxxrwvutswbdekrnhvqceb")
                .withExecutionTimeout("iuybdbhdvkbgskj")
                .withServerlessAccountLocation("bpqpxwgfyyjukopineaobvgmoi")
                .withServerlessRuntimeNetworkProfile(new ServerlessRuntimeNetworkProfile()
                    .withNetworkInterfaceConfiguration(new NetworkInterfaceConfiguration().withVnetId("cdmpydsq")
                        .withSubnetId("ehskvhy")
                        .withVnetResourceGuid("uafkcfy")))
                .withAdvancedCustomProperties(
                    Arrays.asList(new AdvancedCustomProperties().withKey("fakeTokenPlaceholder").withValue("xzkgo")))
                .withSupplementaryFileLocation("fzhmre")
                .withServerlessRuntimeDataDisks(
                    Arrays.asList(new ServerlessRuntimeDataDisk().withType("rphytrclmmpywtaxoevezqxpzndi")
                        .withServerHostOrIpAddress("nhrqlx")
                        .withSourceMount("dvekzq")
                        .withTargetMount("kbkzoeibgqsswvnwatsu")
                        .withMountOptions("brmqwmjdsfquphudxtruhxn")))
                .withServerlessRuntimeConfig(new ServerlessRuntimeConfigProperties()
                    .withCdiConfigProps(Arrays.asList(new CdiConfigProps().withEngineName("vl")
                        .withEngineVersion("uwtovwbq")
                        .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("vzdrepvhg")
                            .withName("aqmadlcjumssrvekk")
                            .withValue("pcwzkv")
                            .withPlatform("rsixjfovnm")
                            .withCustomized("lbqdroeh")
                            .withDefaultValue("dnhjcdvczfvjqiuqwvnzf")))))
                    .withCdieConfigProps(Arrays.asList(new CdiConfigProps().withEngineName("vl")
                        .withEngineVersion("uwtovwbq")
                        .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("vzdrepvhg")
                            .withName("aqmadlcjumssrvekk")
                            .withValue("pcwzkv")
                            .withPlatform("rsixjfovnm")
                            .withCustomized("lbqdroeh")
                            .withDefaultValue("dnhjcdvczfvjqiuqwvnzf"))))))
                .withServerlessRuntimeTags(
                    Arrays.asList(new ServerlessRuntimeTag().withName("kantckpejioqas").withValue("micxm")))
                .withServerlessRuntimeUserContextProperties(
                    new ServerlessRuntimeUserContextProperties().withUserContextToken("fakeTokenPlaceholder")))
            .create();
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_CreateOrUpdate_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesCreateOrUpdateMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.serverlessRuntimes().define("J").withExistingOrganization("rgopenapi", "-4Z__7").create();
    }
}
```

### ServerlessRuntimes_Delete

```java
/**
 * Samples for ServerlessRuntimes Delete.
 */
public final class ServerlessRuntimesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_Delete.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesDelete(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.serverlessRuntimes()
            .delete("rgopenapi", "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$", com.azure.core.util.Context.NONE);
    }
}
```

### ServerlessRuntimes_Get

```java
/**
 * Samples for ServerlessRuntimes Get.
 */
public final class ServerlessRuntimesGetSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_Get.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesGet(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.serverlessRuntimes()
            .getWithResponse("rgopenapi", "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_Get_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesGetMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.serverlessRuntimes().getWithResponse("rgopenapi", "YC", "___", com.azure.core.util.Context.NONE);
    }
}
```

### ServerlessRuntimes_ListByInformaticaOrganizationResource

```java
/**
 * Samples for ServerlessRuntimes ListByInformaticaOrganizationResource.
 */
public final class ServerlessRuntimesListByInformaticaOrganizationResourceS {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_ListByInformaticaOrganizationResource_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_ListByInformaticaOrganizationResource.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesListByInformaticaOrganizationResource(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.serverlessRuntimes()
            .listByInformaticaOrganizationResource("rgopenapi",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$", com.azure.core.util.Context.NONE);
    }
}
```

### ServerlessRuntimes_ServerlessResourceById

```java
/**
 * Samples for ServerlessRuntimes ServerlessResourceById.
 */
public final class ServerlessRuntimesServerlessResourceByIdSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_ServerlessResourceById_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_ServerlessResourceById.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesServerlessResourceById(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.serverlessRuntimes()
            .serverlessResourceByIdWithResponse("rgopenapi",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$", com.azure.core.util.Context.NONE);
    }
}
```

### ServerlessRuntimes_StartFailedServerlessRuntime

```java
/**
 * Samples for ServerlessRuntimes StartFailedServerlessRuntime.
 */
public final class ServerlessRuntimesStartFailedServerlessRuntimeSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_StartFailedServerlessRuntime_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_StartFailedServerlessRuntime.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesStartFailedServerlessRuntime(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        manager.serverlessRuntimes()
            .startFailedServerlessRuntimeWithResponse("rgopenapi",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$", com.azure.core.util.Context.NONE);
    }
}
```

### ServerlessRuntimes_Update

```java
import com.azure.resourcemanager.informaticadatamanagement.models.AdvancedCustomProperties;
import com.azure.resourcemanager.informaticadatamanagement.models.ApplicationConfigs;
import com.azure.resourcemanager.informaticadatamanagement.models.ApplicationType;
import com.azure.resourcemanager.informaticadatamanagement.models.CdiConfigProps;
import com.azure.resourcemanager.informaticadatamanagement.models.InformaticaServerlessRuntimeResource;
import com.azure.resourcemanager.informaticadatamanagement.models.NetworkInterfaceConfigurationUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.PlatformType;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeConfigPropertiesUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeDataDisk;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeNetworkProfileUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimePropertiesCustomUpdate;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeTag;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeUserContextPropertiesUpdate;
import java.util.Arrays;

/**
 * Samples for ServerlessRuntimes Update.
 */
public final class ServerlessRuntimesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_Update_Min.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesUpdateMin(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        InformaticaServerlessRuntimeResource resource = manager.serverlessRuntimes()
            .getWithResponse("rgopenapi", "_f--", "8Zr__", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file:
     * specification/informatica/resource-manager/Informatica.DataManagement/preview/2024-07-22/examples/
     * ServerlessRuntimes_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_Update.
     * 
     * @param manager Entry point to InformaticaDataManagementManager.
     */
    public static void serverlessRuntimesUpdate(
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager) {
        InformaticaServerlessRuntimeResource resource = manager.serverlessRuntimes()
            .getWithResponse("rgopenapi", "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$",
                "Replace this value with a string matching RegExp ^[a-zA-Z0-9_-]*$", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(new ServerlessRuntimePropertiesCustomUpdate().withDescription("xecmsqsgyrnvhikjsbonpo")
                .withPlatform(PlatformType.AZURE)
                .withApplicationType(ApplicationType.CDI)
                .withComputeUnits("xkdjz")
                .withExecutionTimeout("yhuojjpgbyjorkasepklgwttua")
                .withServerlessAccountLocation("patvfndjzeyflumzvskjdbjve")
                .withServerlessRuntimeNetworkProfile(
                    new ServerlessRuntimeNetworkProfileUpdate().withNetworkInterfaceConfiguration(
                        new NetworkInterfaceConfigurationUpdate().withVnetId("idgmvcwxteetoai")
                            .withSubnetId("bauxrifioknw")
                            .withVnetResourceGuid("kaqd")))
                .withAdvancedCustomProperties(
                    Arrays.asList(new AdvancedCustomProperties().withKey("fakeTokenPlaceholder").withValue("xzkgo")))
                .withSupplementaryFileLocation("soexqtehxrdxwckysaxmydvqu")
                .withServerlessRuntimeDataDisks(
                    Arrays.asList(new ServerlessRuntimeDataDisk().withType("rphytrclmmpywtaxoevezqxpzndi")
                        .withServerHostOrIpAddress("nhrqlx")
                        .withSourceMount("dvekzq")
                        .withTargetMount("kbkzoeibgqsswvnwatsu")
                        .withMountOptions("brmqwmjdsfquphudxtruhxn")))
                .withServerlessRuntimeConfig(new ServerlessRuntimeConfigPropertiesUpdate()
                    .withCdiConfigProps(Arrays.asList(new CdiConfigProps().withEngineName("vl")
                        .withEngineVersion("uwtovwbq")
                        .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("vzdrepvhg")
                            .withName("aqmadlcjumssrvekk")
                            .withValue("pcwzkv")
                            .withPlatform("rsixjfovnm")
                            .withCustomized("lbqdroeh")
                            .withDefaultValue("dnhjcdvczfvjqiuqwvnzf")))))
                    .withCdieConfigProps(Arrays.asList(new CdiConfigProps().withEngineName("vl")
                        .withEngineVersion("uwtovwbq")
                        .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("vzdrepvhg")
                            .withName("aqmadlcjumssrvekk")
                            .withValue("pcwzkv")
                            .withPlatform("rsixjfovnm")
                            .withCustomized("lbqdroeh")
                            .withDefaultValue("dnhjcdvczfvjqiuqwvnzf"))))))
                .withServerlessRuntimeTags(
                    Arrays.asList(new ServerlessRuntimeTag().withName("kantckpejioqas").withValue("micxm")))
                .withServerlessRuntimeUserContextProperties(
                    new ServerlessRuntimeUserContextPropertiesUpdate().withUserContextToken("fakeTokenPlaceholder")))
            .apply();
    }
}
```

