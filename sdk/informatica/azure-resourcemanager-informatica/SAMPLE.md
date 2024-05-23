# Code snippets and samples


## Operations

- [List](#operations_list)

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
### Operations_List

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Operations_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void operationsList(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Operations_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Operations_List_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void operationsListMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_CreateOrUpdate

```java
import com.azure.resourcemanager.informatica.models.CompanyDetails;
import com.azure.resourcemanager.informatica.models.InformaticaProperties;
import com.azure.resourcemanager.informatica.models.LinkOrganization;
import com.azure.resourcemanager.informatica.models.MarketplaceDetails;
import com.azure.resourcemanager.informatica.models.OfferDetails;
import com.azure.resourcemanager.informatica.models.UserDetails;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations CreateOrUpdate.
 */
public final class OrganizationsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_CreateOrUpdate.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void organizationsCreateOrUpdate(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.organizations()
            .define("C")
            .withRegion("pamjoudtssthlbhrnfjidr")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf("key8430", "fakeTokenPlaceholder"))
            .withInformaticaProperties(new InformaticaProperties().withOrganizationId("wtdmhlwhkvgqdumaehgfgiqcxgnqpx")
                .withOrganizationName("nomzbvwe")
                .withInformaticaRegion("zfqodqpbeflhedypiijdkc")
                .withSingleSignOnUrl("espcbzjhtmgwfdkckhqk"))
            .withMarketplaceDetails(new MarketplaceDetails().withMarketplaceSubscriptionId("ovenlecocg")
                .withOfferDetails(new OfferDetails()
                    .withPublisherId(
                        "zajxpfacudwongxjvnnuhhpygmnydchgowjccyuzsjonegmqxcqqpnzafanggowfqdixnnutyfvmvwrkx")
                    .withOfferId("cwswcfwmzhjcoksmueukegwaptvpcmbfyvixfhvgwnjyblqivqdkkwkunkgimiopwwkvgnwclmajhuty")
                    .withPlanId("jfnemevyivtlxhectiutdavdgfyidolivuojumdzckp")
                    .withPlanName(
                        "iaoxgaitteuoqgujkgxbdgryaobtkjjecuvchwutntrvmuorikrbqqegmelenbewhakiysprrnovjixyxrikscaptrbapbdspu")
                    .withTermUnit("gjwmgevrblbosuogsvfspsgspetbnxaygkbelvadpgwiywl")
                    .withTermId(
                        "tcvvsxdjnjlfmjhmvwklptdmxetnzydxyuhfqchoubmtoeqbchnfxoxqzezlgpxdnzyvzgkynjxzzgetkqccxvpzahxattluqdipvbdktqmndfefitzuifqjpschzlbvixnvznkmmgjwvkplfhemnapsewgqxggdzdokryhv")))
            .withUserDetails(new UserDetails().withFirstName("appvdclawzfjntdfdftjevlhvzropnxqtnypid")
                .withLastName("nzirbvzmkxtbrlamyatlcszebxgcyncxoascojsmacwvjsjvn")
                .withEmailAddress("7_-46@13D--3.m-4x-.11.c-9-.DHLYFc")
                .withUpn("undljch")
                .withPhoneNumber("fvcjylxlmhdnshsgywnzlyvshu"))
            .withCompanyDetails(new CompanyDetails().withCompanyName("xszcggknokhw")
                .withOfficeAddress("sbttzwyajgdbsvipuiclbzvkcvwyil")
                .withCountry("gwkcpnwyaqc")
                .withDomain("utcxetzzpmbvwmjrvphqngvp")
                .withBusiness("pucosrtjv")
                .withNumberOfEmployees(25))
            .withLinkOrganization(new LinkOrganization().withToken("fakeTokenPlaceholder"))
            .create();
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_CreateOrUpdate_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        organizationsCreateOrUpdateMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
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
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Delete.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void organizationsDelete(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.organizations().delete("rgopenapi", "_", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Delete_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void organizationsDeleteMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
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
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_GetAllServerlessRuntimes_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetAllServerlessRuntimes_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        organizationsGetAllServerlessRuntimesMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.organizations()
            .getAllServerlessRuntimesWithResponse("rgopenapi", "0", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_GetAllServerlessRuntimes_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetAllServerlessRuntimes.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        organizationsGetAllServerlessRuntimes(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.organizations()
            .getAllServerlessRuntimesWithResponse("rgopenapi", "t", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Get_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void organizationsGetMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.organizations().getByResourceGroupWithResponse("rgopenapi", "q", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Get.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void organizationsGet(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.organizations().getByResourceGroupWithResponse("rgopenapi", "Sg", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_GetServerlessMetadata_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetServerlessMetadata_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        organizationsGetServerlessMetadataMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.organizations().getServerlessMetadataWithResponse("rgopenapi", "A", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_GetServerlessMetadata_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_GetServerlessMetadata.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        organizationsGetServerlessMetadata(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.organizations()
            .getServerlessMetadataWithResponse("rgopenapi", "3_UC", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_ListBySubscription_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListBySubscription.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        organizationsListBySubscription(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.organizations().list(com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_ListBySubscription_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListBySubscription_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        organizationsListBySubscriptionMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
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
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_ListByResourceGroup_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListByResourceGroup_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        organizationsListByResourceGroupMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.organizations().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_ListByResourceGroup.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        organizationsListByResourceGroup(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.organizations().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### Organizations_Update

```java
import com.azure.resourcemanager.informatica.models.CompanyDetailsUpdate;
import com.azure.resourcemanager.informatica.models.InformaticaOrganizationResource;
import com.azure.resourcemanager.informatica.models.MarketplaceDetailsUpdate;
import com.azure.resourcemanager.informatica.models.OfferDetailsUpdate;
import com.azure.resourcemanager.informatica.models.OrganizationPropertiesCustomUpdate;
import com.azure.resourcemanager.informatica.models.UserDetailsUpdate;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Organizations Update.
 */
public final class OrganizationsUpdateSamples {
    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Update.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void organizationsUpdate(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        InformaticaOrganizationResource resource = manager.organizations()
            .getByResourceGroupWithResponse("rgopenapi", "_-", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key1918", "fakeTokenPlaceholder"))
            .withProperties(new OrganizationPropertiesCustomUpdate()
                .withMarketplaceDetails(new MarketplaceDetailsUpdate()
                    .withMarketplaceSubscriptionId("szhyxzgjtssjmlguivepc")
                    .withOfferDetails(new OfferDetailsUpdate().withPublisherId(
                        "ktzfghsyjqbsswhltoaemgotmnorhdogvkaxplutbjjqzuepxizliynyakersobagvpwvpzwjtjjxigsqgcyqaahaxdijghnexliofhfjlqzjmmbvrhcvjxdodnexxizbgfhjopbwzjojxsluasnwwsgcajefglbcvzpaeblanhmurcculndtfwnfjyxol")
                        .withOfferId("idaxbflabvjsippplyenvrpgeydsjxcmyubgukffkcdvlvrtwpdhnvdblxjsldiuswrchsibk")
                        .withPlanId("giihvvnwdwzkfqrhkpqzbgfotzyixnsvmxzauseebillhslauglzfxzvzvts")
                        .withPlanName(
                            "tfqjenotaewzdeerliteqxdawuqxhwdzbtiiimsaedrlsnbdoonnloakjtvnwhhrcyxxsgoachguthqvlahpjyofpoqpfacfmiaauawazkmxkjgvktbptojknzojtjrfzvbbjjkvstabqyaczxinijhoxrjukftsagpwgsvpmczopztmplipyufhuaumfx")
                        .withTermUnit("nykqoplazujcwmfldntifjqrnx")
                        .withTermId("eolmwogtgpdncqoigqcdomupwummaicwvdxgbskpdsmjizdfbdgbxbuekcpwmenqzbhqxpdnjtup")))
                .withUserDetails(new UserDetailsUpdate().withFirstName("qguqrmanyupoi")
                    .withLastName("ugzg")
                    .withEmailAddress("7_-46@13D--3.m-4x-.11.c-9-.DHLYFc")
                    .withUpn("viwjrkn")
                    .withPhoneNumber("uxa"))
                .withCompanyDetails(new CompanyDetailsUpdate().withCompanyName("xkrvbozrjcvappqeeyt")
                    .withOfficeAddress("sfcx")
                    .withCountry("rvlzppgvopcw")
                    .withDomain("dponvwnrdrnzahcurqssesukbsokdd")
                    .withBusiness("mwqblnruflwpolgbxpqbqneve")
                    .withNumberOfEmployees(22))
                .withExistingResourceId("uvwlcphdfkqnhrtddpsiacbowcxxo"))
            .apply();
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/Organizations_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: Organizations_Update_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void organizationsUpdateMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
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
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_CheckDependencies_MinimumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_CheckDependencies_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        serverlessRuntimesCheckDependenciesMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.serverlessRuntimes()
            .checkDependenciesWithResponse("rgopenapi", "_-", "_2_", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_CheckDependencies_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_CheckDependencies.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        serverlessRuntimesCheckDependencies(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.serverlessRuntimes()
            .checkDependenciesWithResponse("rgopenapi", "3P", "M", com.azure.core.util.Context.NONE);
    }
}
```

### ServerlessRuntimes_CreateOrUpdate

```java
import com.azure.resourcemanager.informatica.models.AdvancedCustomProperties;
import com.azure.resourcemanager.informatica.models.ApplicationConfigs;
import com.azure.resourcemanager.informatica.models.ApplicationType;
import com.azure.resourcemanager.informatica.models.CdiConfigProps;
import com.azure.resourcemanager.informatica.models.NetworkInterfaceConfiguration;
import com.azure.resourcemanager.informatica.models.PlatformType;
import com.azure.resourcemanager.informatica.models.ServerlessRuntimeConfigProperties;
import com.azure.resourcemanager.informatica.models.ServerlessRuntimeNetworkProfile;
import com.azure.resourcemanager.informatica.models.ServerlessRuntimeTag;
import com.azure.resourcemanager.informatica.models.ServerlessRuntimeUserContextProperties;
import java.util.Arrays;

/**
 * Samples for ServerlessRuntimes CreateOrUpdate.
 */
public final class ServerlessRuntimesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_CreateOrUpdate_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_CreateOrUpdate.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        serverlessRuntimesCreateOrUpdate(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.serverlessRuntimes()
            .define("0j-__")
            .withExistingOrganization("rgopenapi", "__C")
            .withDescription("mqkaenjmxakvzrwmirelmhgiedto")
            .withPlatform(PlatformType.AZURE)
            .withApplicationType(ApplicationType.CDI)
            .withComputeUnits("bsctukmndvowse")
            .withExecutionTimeout("ruiougpypny")
            .withServerlessAccountLocation("bkxdfopapbqucyhduewrubjpaei")
            .withServerlessRuntimeNetworkProfile(new ServerlessRuntimeNetworkProfile()
                .withNetworkInterfaceConfiguration(new NetworkInterfaceConfiguration().withVnetId("uaqjvtubxccjs")
                    .withSubnetId("s")
                    .withVnetResourceGuid("5328d299-1462-4be0-bef1-303a28e556a0")))
            .withAdvancedCustomProperties(Arrays
                .asList(new AdvancedCustomProperties().withKey("fakeTokenPlaceholder").withValue("unraxmnohdmvutt")))
            .withSupplementaryFileLocation("zmlqtkncwgqhhupsnqluumz")
            .withServerlessRuntimeConfig(new ServerlessRuntimeConfigProperties()
                .withCdiConfigProps(Arrays.asList(new CdiConfigProps().withEngineName("hngsdqvtjdhwqlbqfotipaiwjuys")
                    .withEngineVersion("zlrlbg")
                    .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("lw")
                        .withName("upfvjrqcrwwedfujkmsodeinw")
                        .withValue("mozgsetpwjmtyl")
                        .withPlatform("dixfyeobngivyvf")
                        .withCustomized("j")
                        .withDefaultValue("zvgkqwmi")))))
                .withCdieConfigProps(Arrays.asList(new CdiConfigProps().withEngineName("hngsdqvtjdhwqlbqfotipaiwjuys")
                    .withEngineVersion("zlrlbg")
                    .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("lw")
                        .withName("upfvjrqcrwwedfujkmsodeinw")
                        .withValue("mozgsetpwjmtyl")
                        .withPlatform("dixfyeobngivyvf")
                        .withCustomized("j")
                        .withDefaultValue("zvgkqwmi"))))))
            .withServerlessRuntimeTags(
                Arrays.asList(new ServerlessRuntimeTag().withName("korveuycuwhs").withValue("uyiuegxnkgp")))
            .withServerlessRuntimeUserContextProperties(
                new ServerlessRuntimeUserContextProperties().withUserContextToken("fakeTokenPlaceholder"))
            .create();
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_CreateOrUpdate_MinimumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_CreateOrUpdate_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        serverlessRuntimesCreateOrUpdateMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
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
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_Delete.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void serverlessRuntimesDelete(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.serverlessRuntimes()
            .delete("rgopenapi", "orgName", "serverlessRuntimeName", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_Get.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void serverlessRuntimesGet(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.serverlessRuntimes().getWithResponse("rgopenapi", "e3Y", "48-", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_Get_MinimumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_Get_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void serverlessRuntimesGetMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.serverlessRuntimes().getWithResponse("rgopenapi", "YC", "___", com.azure.core.util.Context.NONE);
    }
}
```

### ServerlessRuntimes_ListByInformaticaOrganizationResource

```java
/**
 * Samples for ServerlessRuntimes ListByInformaticaOrganizationResource.
 */
public final class ServerlessRuntimesListByInformaticaOrganizationResourceSamples {
    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_ListByInformaticaOrganizationResource_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_ListByInformaticaOrganizationResource.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void serverlessRuntimesListByInformaticaOrganizationResource(
        com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.serverlessRuntimes()
            .listByInformaticaOrganizationResource("rgopenapi", "orgName", com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_ServerlessResourceById_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_ServerlessResourceById.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void
        serverlessRuntimesServerlessResourceById(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.serverlessRuntimes()
            .serverlessResourceByIdWithResponse("rgopenapi", "_RD_R", "serverlessRuntimeName159",
                com.azure.core.util.Context.NONE);
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
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_StartFailedServerlessRuntime_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_StartFailedServerlessRuntime.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void serverlessRuntimesStartFailedServerlessRuntime(
        com.azure.resourcemanager.informatica.InformaticaManager manager) {
        manager.serverlessRuntimes()
            .startFailedServerlessRuntimeWithResponse("rgopenapi", "9M4", "-25-G_", com.azure.core.util.Context.NONE);
    }
}
```

### ServerlessRuntimes_Update

```java
import com.azure.resourcemanager.informatica.models.AdvancedCustomProperties;
import com.azure.resourcemanager.informatica.models.ApplicationConfigs;
import com.azure.resourcemanager.informatica.models.ApplicationType;
import com.azure.resourcemanager.informatica.models.CdiConfigProps;
import com.azure.resourcemanager.informatica.models.InformaticaServerlessRuntimeResource;
import com.azure.resourcemanager.informatica.models.NetworkInterfaceConfigurationUpdate;
import com.azure.resourcemanager.informatica.models.PlatformType;
import com.azure.resourcemanager.informatica.models.ServerlessRuntimeConfigPropertiesUpdate;
import com.azure.resourcemanager.informatica.models.ServerlessRuntimeNetworkProfileUpdate;
import com.azure.resourcemanager.informatica.models.ServerlessRuntimePropertiesCustomUpdate;
import com.azure.resourcemanager.informatica.models.ServerlessRuntimeTag;
import com.azure.resourcemanager.informatica.models.ServerlessRuntimeUserContextPropertiesUpdate;
import java.util.Arrays;

/**
 * Samples for ServerlessRuntimes Update.
 */
public final class ServerlessRuntimesUpdateSamples {
    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_Update_Min.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void serverlessRuntimesUpdateMin(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        InformaticaServerlessRuntimeResource resource = manager.serverlessRuntimes()
            .getWithResponse("rgopenapi", "_f--", "8Zr__", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file: specification/informatica/resource-manager/Informatica.DataManagement/stable/2024-05-08/examples/ServerlessRuntimes_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: ServerlessRuntimes_Update.
     * 
     * @param manager Entry point to InformaticaManager.
     */
    public static void serverlessRuntimesUpdate(com.azure.resourcemanager.informatica.InformaticaManager manager) {
        InformaticaServerlessRuntimeResource resource = manager.serverlessRuntimes()
            .getWithResponse("rgopenapi", "W5", "t_", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withProperties(
                new ServerlessRuntimePropertiesCustomUpdate().withDescription("ocprslpljoikxyduackzqnkuhyzrh")
                    .withPlatform(PlatformType.AZURE)
                    .withApplicationType(ApplicationType.CDI)
                    .withComputeUnits("uncwbpu")
                    .withExecutionTimeout("tjyfytuywriabt")
                    .withServerlessAccountLocation("goaugkyfanqfnvcmntreibqrswfpis")
                    .withServerlessRuntimeNetworkProfile(
                        new ServerlessRuntimeNetworkProfileUpdate().withNetworkInterfaceConfiguration(
                            new NetworkInterfaceConfigurationUpdate().withVnetId("tnsqwwoxydeqqffumdnxlkkb")
                                .withSubnetId("dctcuhgttxhcarwcrgdmsfwksyrzj")
                                .withVnetResourceGuid("5328d299-1462-4be0-bef1-303a28e556a0")))
                    .withAdvancedCustomProperties(Arrays.asList(
                        new AdvancedCustomProperties().withKey("fakeTokenPlaceholder").withValue("unraxmnohdmvutt")))
                    .withSupplementaryFileLocation("csxaqzpxu")
                    .withServerlessRuntimeConfig(new ServerlessRuntimeConfigPropertiesUpdate()
                        .withCdiConfigProps(
                            Arrays.asList(new CdiConfigProps().withEngineName("hngsdqvtjdhwqlbqfotipaiwjuys")
                                .withEngineVersion("zlrlbg")
                                .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("lw")
                                    .withName("upfvjrqcrwwedfujkmsodeinw")
                                    .withValue("mozgsetpwjmtyl")
                                    .withPlatform("dixfyeobngivyvf")
                                    .withCustomized("j")
                                    .withDefaultValue("zvgkqwmi")))))
                        .withCdieConfigProps(
                            Arrays.asList(new CdiConfigProps().withEngineName("hngsdqvtjdhwqlbqfotipaiwjuys")
                                .withEngineVersion("zlrlbg")
                                .withApplicationConfigs(Arrays.asList(new ApplicationConfigs().withType("lw")
                                    .withName("upfvjrqcrwwedfujkmsodeinw")
                                    .withValue("mozgsetpwjmtyl")
                                    .withPlatform("dixfyeobngivyvf")
                                    .withCustomized("j")
                                    .withDefaultValue("zvgkqwmi"))))))
                    .withServerlessRuntimeTags(
                        Arrays.asList(new ServerlessRuntimeTag().withName("korveuycuwhs").withValue("uyiuegxnkgp")))
                    .withServerlessRuntimeUserContextProperties(new ServerlessRuntimeUserContextPropertiesUpdate()
                        .withUserContextToken("fakeTokenPlaceholder")))
            .apply();
    }
}
```

