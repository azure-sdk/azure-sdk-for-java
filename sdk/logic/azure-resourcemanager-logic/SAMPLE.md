# Code snippets and samples


## IntegrationAccountAgreements

- [CreateOrUpdate](#integrationaccountagreements_createorupdate)
- [Delete](#integrationaccountagreements_delete)
- [Get](#integrationaccountagreements_get)
- [List](#integrationaccountagreements_list)
- [ListContentCallbackUrl](#integrationaccountagreements_listcontentcallbackurl)

## IntegrationAccountCertificates

- [CreateOrUpdate](#integrationaccountcertificates_createorupdate)
- [Delete](#integrationaccountcertificates_delete)
- [Get](#integrationaccountcertificates_get)
- [List](#integrationaccountcertificates_list)

## IntegrationAccountMaps

- [CreateOrUpdate](#integrationaccountmaps_createorupdate)
- [Delete](#integrationaccountmaps_delete)
- [Get](#integrationaccountmaps_get)
- [List](#integrationaccountmaps_list)
- [ListContentCallbackUrl](#integrationaccountmaps_listcontentcallbackurl)

## IntegrationAccountPartners

- [CreateOrUpdate](#integrationaccountpartners_createorupdate)
- [Delete](#integrationaccountpartners_delete)
- [Get](#integrationaccountpartners_get)
- [List](#integrationaccountpartners_list)
- [ListContentCallbackUrl](#integrationaccountpartners_listcontentcallbackurl)

## IntegrationAccountSchemas

- [CreateOrUpdate](#integrationaccountschemas_createorupdate)
- [Delete](#integrationaccountschemas_delete)
- [Get](#integrationaccountschemas_get)
- [List](#integrationaccountschemas_list)
- [ListContentCallbackUrl](#integrationaccountschemas_listcontentcallbackurl)

## IntegrationAccountSessions

- [CreateOrUpdate](#integrationaccountsessions_createorupdate)
- [Delete](#integrationaccountsessions_delete)
- [Get](#integrationaccountsessions_get)
- [List](#integrationaccountsessions_list)

## IntegrationAccounts

- [CreateOrUpdate](#integrationaccounts_createorupdate)
- [Delete](#integrationaccounts_delete)
- [GetByResourceGroup](#integrationaccounts_getbyresourcegroup)
- [List](#integrationaccounts_list)
- [ListByResourceGroup](#integrationaccounts_listbyresourcegroup)
- [ListCallbackUrl](#integrationaccounts_listcallbackurl)
- [ListKeyVaultKeys](#integrationaccounts_listkeyvaultkeys)
- [LogTrackingEvents](#integrationaccounts_logtrackingevents)
- [RegenerateAccessKey](#integrationaccounts_regenerateaccesskey)
- [Update](#integrationaccounts_update)

## IntegrationServiceEnvironmentManagedApis

- [Delete](#integrationserviceenvironmentmanagedapis_delete)
- [Get](#integrationserviceenvironmentmanagedapis_get)
- [List](#integrationserviceenvironmentmanagedapis_list)
- [Put](#integrationserviceenvironmentmanagedapis_put)

## IntegrationServiceEnvironments

- [CreateOrUpdate](#integrationserviceenvironments_createorupdate)
- [Delete](#integrationserviceenvironments_delete)
- [Get](#integrationserviceenvironments_get)
- [ListByResourceGroup](#integrationserviceenvironments_listbyresourcegroup)
- [ListBySubscription](#integrationserviceenvironments_listbysubscription)
- [Restart](#integrationserviceenvironments_restart)
- [Update](#integrationserviceenvironments_update)

## Operations

- [List](#operations_list)

## WorkflowRunActions

- [Get](#workflowrunactions_get)
- [List](#workflowrunactions_list)
- [ListExpressionTraces](#workflowrunactions_listexpressiontraces)

## WorkflowRuns

- [Cancel](#workflowruns_cancel)
- [Get](#workflowruns_get)

## WorkflowTriggerHistories

- [Get](#workflowtriggerhistories_get)
- [List](#workflowtriggerhistories_list)
- [Resubmit](#workflowtriggerhistories_resubmit)

## WorkflowTriggers

- [Get](#workflowtriggers_get)
- [GetSchemaJson](#workflowtriggers_getschemajson)
- [List](#workflowtriggers_list)
- [ListCallbackUrl](#workflowtriggers_listcallbackurl)
- [Reset](#workflowtriggers_reset)
- [Run](#workflowtriggers_run)
- [SetState](#workflowtriggers_setstate)

## WorkflowVersions

- [Get](#workflowversions_get)
- [List](#workflowversions_list)

## Workflows

- [CreateOrUpdate](#workflows_createorupdate)
- [Delete](#workflows_delete)
- [Disable](#workflows_disable)
- [Enable](#workflows_enable)
- [GenerateUpgradedDefinition](#workflows_generateupgradeddefinition)
- [GetByResourceGroup](#workflows_getbyresourcegroup)
- [List](#workflows_list)
- [ListByResourceGroup](#workflows_listbyresourcegroup)
- [ListCallbackUrl](#workflows_listcallbackurl)
- [ListSwagger](#workflows_listswagger)
- [Move](#workflows_move)
- [RegenerateAccessKey](#workflows_regenerateaccesskey)
- [Update](#workflows_update)
- [ValidateByResourceGroup](#workflows_validatebyresourcegroup)
### IntegrationAccountAgreements_CreateOrUpdate

```java
import com.azure.resourcemanager.logic.models.IntegrationAccountAgreementProperties;

/**
 * Samples for IntegrationAccountAgreements CreateOrUpdate.
 */
public final class IntegrationAccountAgreementsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountAgreements_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update an agreement.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateAnAgreement(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountAgreements()
            .define("testAgreement")
            .withExistingIntegrationAccount("testResourceGroup", "testIntegrationAccount")
            .withProperties((IntegrationAccountAgreementProperties) null)
            .create();
    }
}
```

### IntegrationAccountAgreements_Delete

```java
/**
 * Samples for IntegrationAccountAgreements Delete.
 */
public final class IntegrationAccountAgreementsDeleteSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountAgreements_Delete.json
     */
    /**
     * Sample code: Delete an agreement.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void deleteAnAgreement(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountAgreements()
            .deleteWithResponse("testResourceGroup", "testIntegrationAccount", "testAgreement",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountAgreements_Get

```java
/**
 * Samples for IntegrationAccountAgreements Get.
 */
public final class IntegrationAccountAgreementsGetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountAgreements_Get.
     * json
     */
    /**
     * Sample code: Get agreement by name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getAgreementByName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountAgreements()
            .getWithResponse("testResourceGroup", "testIntegrationAccount", "testAgreement",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountAgreements_List

```java
/**
 * Samples for IntegrationAccountAgreements List.
 */
public final class IntegrationAccountAgreementsListSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountAgreements_List
     * .json
     */
    /**
     * Sample code: Get agreements by integration account name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getAgreementsByIntegrationAccountName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountAgreements()
            .list("testResourceGroup", "testIntegrationAccount", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountAgreements_ListContentCallbackUrl

```java

/**
 * Samples for IntegrationAccountAgreements ListContentCallbackUrl.
 */
public final class IntegrationAccountAgreementsListContentCallbackUrlSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountAgreements_ListContentCallbackUrl.json
     */
    /**
     * Sample code: Get the content callback url.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getTheContentCallbackUrl(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountAgreements()
            .listContentCallbackUrlWithResponse("testResourceGroup", "testIntegrationAccount", "testAgreement", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountCertificates_CreateOrUpdate

```java
import com.azure.resourcemanager.logic.models.IntegrationAccountCertificateProperties;

/**
 * Samples for IntegrationAccountCertificates CreateOrUpdate.
 */
public final class IntegrationAccountCertificatesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountCertificates_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a certificate.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateACertificate(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountCertificates()
            .define("testCertificate")
            .withExistingIntegrationAccount("testResourceGroup", "testIntegrationAccount")
            .withProperties((IntegrationAccountCertificateProperties) null)
            .create();
    }
}
```

### IntegrationAccountCertificates_Delete

```java
/**
 * Samples for IntegrationAccountCertificates Delete.
 */
public final class IntegrationAccountCertificatesDeleteSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountCertificates_Delete.json
     */
    /**
     * Sample code: Delete a certificate.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void deleteACertificate(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountCertificates()
            .deleteWithResponse("testResourceGroup", "testIntegrationAccount", "testCertificate",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountCertificates_Get

```java
/**
 * Samples for IntegrationAccountCertificates Get.
 */
public final class IntegrationAccountCertificatesGetSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountCertificates_Get.json
     */
    /**
     * Sample code: Get certificate by name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getCertificateByName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountCertificates()
            .getWithResponse("testResourceGroup", "testIntegrationAccount", "testCertificate",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountCertificates_List

```java
/**
 * Samples for IntegrationAccountCertificates List.
 */
public final class IntegrationAccountCertificatesListSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountCertificates_List.json
     */
    /**
     * Sample code: Get certificates by integration account name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getCertificatesByIntegrationAccountName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountCertificates()
            .list("testResourceGroup", "testIntegrationAccount", null, com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountMaps_CreateOrUpdate

```java
import com.azure.resourcemanager.logic.models.IntegrationAccountMapProperties;

/**
 * Samples for IntegrationAccountMaps CreateOrUpdate.
 */
public final class IntegrationAccountMapsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountLargeMaps_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a map larger than 4 MB.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateAMapLargerThan4MB(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountMaps()
            .define("testMap")
            .withExistingIntegrationAccount("testResourceGroup", "testIntegrationAccount")
            .withProperties((IntegrationAccountMapProperties) null)
            .create();
    }

    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountMaps_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a map.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateAMap(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountMaps()
            .define("testMap")
            .withExistingIntegrationAccount("testResourceGroup", "testIntegrationAccount")
            .withProperties((IntegrationAccountMapProperties) null)
            .create();
    }
}
```

### IntegrationAccountMaps_Delete

```java
/**
 * Samples for IntegrationAccountMaps Delete.
 */
public final class IntegrationAccountMapsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountMaps_Delete.
     * json
     */
    /**
     * Sample code: Delete a map.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void deleteAMap(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountMaps()
            .deleteWithResponse("testResourceGroup", "testIntegrationAccount", "testMap",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountMaps_Get

```java
/**
 * Samples for IntegrationAccountMaps Get.
 */
public final class IntegrationAccountMapsGetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountMaps_Get.json
     */
    /**
     * Sample code: Get map by name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getMapByName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountMaps()
            .getWithResponse("testResourceGroup", "testIntegrationAccount", "testMap",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountMaps_List

```java
/**
 * Samples for IntegrationAccountMaps List.
 */
public final class IntegrationAccountMapsListSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountMaps_List.json
     */
    /**
     * Sample code: Get maps by integration account name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getMapsByIntegrationAccountName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountMaps()
            .list("testResourceGroup", "testIntegrationAccount", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountMaps_ListContentCallbackUrl

```java

/**
 * Samples for IntegrationAccountMaps ListContentCallbackUrl.
 */
public final class IntegrationAccountMapsListContentCallbackUrlSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountMaps_ListContentCallbackUrl.json
     */
    /**
     * Sample code: Get the content callback url.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getTheContentCallbackUrl(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountMaps()
            .listContentCallbackUrlWithResponse("testResourceGroup", "testIntegrationAccount", "testMap", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountPartners_CreateOrUpdate

```java
import com.azure.resourcemanager.logic.models.IntegrationAccountPartnerProperties;

/**
 * Samples for IntegrationAccountPartners CreateOrUpdate.
 */
public final class IntegrationAccountPartnersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountPartners_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a partner.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateAPartner(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountPartners()
            .define("testPartner")
            .withExistingIntegrationAccount("testResourceGroup", "testIntegrationAccount")
            .withProperties((IntegrationAccountPartnerProperties) null)
            .create();
    }
}
```

### IntegrationAccountPartners_Delete

```java
/**
 * Samples for IntegrationAccountPartners Delete.
 */
public final class IntegrationAccountPartnersDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountPartners_Delete
     * .json
     */
    /**
     * Sample code: Delete a partner.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void deleteAPartner(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountPartners()
            .deleteWithResponse("testResourceGroup", "testIntegrationAccount", "testPartner",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountPartners_Get

```java
/**
 * Samples for IntegrationAccountPartners Get.
 */
public final class IntegrationAccountPartnersGetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountPartners_Get.
     * json
     */
    /**
     * Sample code: Get partner by name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getPartnerByName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountPartners()
            .getWithResponse("testResourceGroup", "testIntegrationAccount", "testPartner",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountPartners_List

```java
/**
 * Samples for IntegrationAccountPartners List.
 */
public final class IntegrationAccountPartnersListSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountPartners_List.
     * json
     */
    /**
     * Sample code: Get partners by integration account name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getPartnersByIntegrationAccountName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountPartners()
            .list("testResourceGroup", "testIntegrationAccount", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountPartners_ListContentCallbackUrl

```java

/**
 * Samples for IntegrationAccountPartners ListContentCallbackUrl.
 */
public final class IntegrationAccountPartnersListContentCallbackUrlSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountPartners_ListContentCallbackUrl.json
     */
    /**
     * Sample code: Get the content callback url.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getTheContentCallbackUrl(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountPartners()
            .listContentCallbackUrlWithResponse("testResourceGroup", "testIntegrationAccount", "testPartner", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountSchemas_CreateOrUpdate

```java
import com.azure.resourcemanager.logic.models.IntegrationAccountSchemaProperties;

/**
 * Samples for IntegrationAccountSchemas CreateOrUpdate.
 */
public final class IntegrationAccountSchemasCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountSchemas_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update schema.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateSchema(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountSchemas()
            .define("testSchema")
            .withExistingIntegrationAccount("testResourceGroup", "testIntegrationAccount")
            .withProperties((IntegrationAccountSchemaProperties) null)
            .create();
    }
}
```

### IntegrationAccountSchemas_Delete

```java
/**
 * Samples for IntegrationAccountSchemas Delete.
 */
public final class IntegrationAccountSchemasDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountSchemas_Delete.
     * json
     */
    /**
     * Sample code: Delete a schema by name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void deleteASchemaByName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountSchemas()
            .deleteWithResponse("testResourceGroup", "testIntegrationAccount", "testSchema",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountSchemas_Get

```java
/**
 * Samples for IntegrationAccountSchemas Get.
 */
public final class IntegrationAccountSchemasGetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountSchemas_Get.
     * json
     */
    /**
     * Sample code: Get schema by name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getSchemaByName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountSchemas()
            .getWithResponse("testResourceGroup", "testIntegrationAccount", "testSchema",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountSchemas_List

```java
/**
 * Samples for IntegrationAccountSchemas List.
 */
public final class IntegrationAccountSchemasListSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountSchemas_List.
     * json
     */
    /**
     * Sample code: Get schemas by integration account name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getSchemasByIntegrationAccountName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountSchemas()
            .list("testResourceGroup", "<integrationAccountName>", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountSchemas_ListContentCallbackUrl

```java

/**
 * Samples for IntegrationAccountSchemas ListContentCallbackUrl.
 */
public final class IntegrationAccountSchemasListContentCallbackUrlSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountSchemas_ListContentCallbackUrl.json
     */
    /**
     * Sample code: Get the content callback url.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getTheContentCallbackUrl(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountSchemas()
            .listContentCallbackUrlWithResponse("testResourceGroup", "testIntegrationAccount", "testSchema", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountSessions_CreateOrUpdate

```java
import com.azure.resourcemanager.logic.models.IntegrationAccountSessionProperties;

/**
 * Samples for IntegrationAccountSessions CreateOrUpdate.
 */
public final class IntegrationAccountSessionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccountSessions_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update an integration account session.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateAnIntegrationAccountSession(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountSessions()
            .define("testsession123-ICN")
            .withExistingIntegrationAccount("testrg123", "testia123")
            .withProperties((IntegrationAccountSessionProperties) null)
            .create();
    }
}
```

### IntegrationAccountSessions_Delete

```java
/**
 * Samples for IntegrationAccountSessions Delete.
 */
public final class IntegrationAccountSessionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountSessions_Delete
     * .json
     */
    /**
     * Sample code: Delete an integration account session.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void deleteAnIntegrationAccountSession(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountSessions()
            .deleteWithResponse("testrg123", "testia123", "testsession123-ICN", com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountSessions_Get

```java
/**
 * Samples for IntegrationAccountSessions Get.
 */
public final class IntegrationAccountSessionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountSessions_Get.
     * json
     */
    /**
     * Sample code: Get an integration account session.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getAnIntegrationAccountSession(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountSessions()
            .getWithResponse("testrg123", "testia123", "testsession123-ICN", com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccountSessions_List

```java
/**
 * Samples for IntegrationAccountSessions List.
 */
public final class IntegrationAccountSessionsListSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccountSessions_List.
     * json
     */
    /**
     * Sample code: Get a list of integration account sessions.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getAListOfIntegrationAccountSessions(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccountSessions()
            .list("testrg123", "testia123", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccounts_CreateOrUpdate

```java
/**
 * Samples for IntegrationAccounts CreateOrUpdate.
 */
public final class IntegrationAccountsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccounts_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update an integration account.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateAnIntegrationAccount(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccounts()
            .define("testIntegrationAccount")
            .withRegion((String) null)
            .withExistingResourceGroup("testResourceGroup")
            .create();
    }
}
```

### IntegrationAccounts_Delete

```java
/**
 * Samples for IntegrationAccounts Delete.
 */
public final class IntegrationAccountsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccounts_Delete.json
     */
    /**
     * Sample code: Delete an integration account.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void deleteAnIntegrationAccount(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccounts()
            .deleteByResourceGroupWithResponse("testResourceGroup", "testIntegrationAccount",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccounts_GetByResourceGroup

```java
/**
 * Samples for IntegrationAccounts GetByResourceGroup.
 */
public final class IntegrationAccountsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccounts_Get.json
     */
    /**
     * Sample code: Get integration account by name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getIntegrationAccountByName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccounts()
            .getByResourceGroupWithResponse("testResourceGroup", "testIntegrationAccount",
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccounts_List

```java
/**
 * Samples for IntegrationAccounts List.
 */
public final class IntegrationAccountsListSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccounts_ListBySubscription.json
     */
    /**
     * Sample code: List integration accounts by subscription.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void listIntegrationAccountsBySubscription(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccounts().list(null, com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccounts_ListByResourceGroup

```java
/**
 * Samples for IntegrationAccounts ListByResourceGroup.
 */
public final class IntegrationAccountsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccounts_ListByResourceGroup.json
     */
    /**
     * Sample code: List integration accounts by resource group name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void
        listIntegrationAccountsByResourceGroupName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccounts().listByResourceGroup("testResourceGroup", null, com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccounts_ListCallbackUrl

```java

/**
 * Samples for IntegrationAccounts ListCallbackUrl.
 */
public final class IntegrationAccountsListCallbackUrlSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccounts_ListCallbackUrl.json
     */
    /**
     * Sample code: List IntegrationAccount callback URL.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void listIntegrationAccountCallbackURL(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccounts()
            .listCallbackUrlWithResponse("testResourceGroup", "testIntegrationAccount", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccounts_ListKeyVaultKeys

```java

/**
 * Samples for IntegrationAccounts ListKeyVaultKeys.
 */
public final class IntegrationAccountsListKeyVaultKeysSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccounts_ListKeyVaultKeys.json
     */
    /**
     * Sample code: Get Integration Account callback URL.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getIntegrationAccountCallbackURL(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccounts()
            .listKeyVaultKeysWithResponse("testResourceGroup", "testIntegrationAccount", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccounts_LogTrackingEvents

```java

/**
 * Samples for IntegrationAccounts LogTrackingEvents.
 */
public final class IntegrationAccountsLogTrackingEventsSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccounts_LogTrackingEvents.json
     */
    /**
     * Sample code: Log a tracked event.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void logATrackedEvent(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccounts()
            .logTrackingEventsWithResponse("testResourceGroup", "testIntegrationAccount", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccounts_RegenerateAccessKey

```java

/**
 * Samples for IntegrationAccounts RegenerateAccessKey.
 */
public final class IntegrationAccountsRegenerateAccessKeySamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationAccounts_RegenerateAccessKey.json
     */
    /**
     * Sample code: Regenerate access key.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void regenerateAccessKey(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationAccounts()
            .regenerateAccessKeyWithResponse("testResourceGroup", "testIntegrationAccount", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationAccounts_Update

```java
import com.azure.resourcemanager.logic.models.IntegrationAccount;

/**
 * Samples for IntegrationAccounts Update.
 */
public final class IntegrationAccountsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/IntegrationAccounts_Update.json
     */
    /**
     * Sample code: Patch an integration account.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void patchAnIntegrationAccount(com.azure.resourcemanager.logic.LogicManager manager) {
        IntegrationAccount resource = manager.integrationAccounts()
            .getByResourceGroupWithResponse("testResourceGroup", "testIntegrationAccount",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### IntegrationServiceEnvironmentManagedApis_Delete

```java
/**
 * Samples for IntegrationServiceEnvironmentManagedApis Delete.
 */
public final class IntegrationServiceEnvironmentManagedApisDeleteSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationServiceEnvironments_ManagedApis_Delete.json
     */
    /**
     * Sample code: Deletes the integration service environment managed Apis.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void
        deletesTheIntegrationServiceEnvironmentManagedApis(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationServiceEnvironmentManagedApis()
            .delete("testIntegrationServiceEnvironment", "servicebus", com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationServiceEnvironmentManagedApis_Get

```java
/**
 * Samples for IntegrationServiceEnvironmentManagedApis Get.
 */
public final class IntegrationServiceEnvironmentManagedApisGetSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationServiceEnvironments_ManagedApis_Get.json
     */
    /**
     * Sample code: Gets the integration service environment managed Apis.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void
        getsTheIntegrationServiceEnvironmentManagedApis(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationServiceEnvironmentManagedApis()
            .getWithResponse("testIntegrationServiceEnvironment", "servicebus", com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationServiceEnvironmentManagedApis_List

```java
/**
 * Samples for IntegrationServiceEnvironmentManagedApis List.
 */
public final class IntegrationServiceEnvironmentManagedApisListSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationServiceEnvironments_ManagedApis_List.json
     */
    /**
     * Sample code: Gets the integration service environment managed Apis.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void
        getsTheIntegrationServiceEnvironmentManagedApis(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationServiceEnvironmentManagedApis()
            .list("testIntegrationServiceEnvironment", com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationServiceEnvironmentManagedApis_Put

```java
/**
 * Samples for IntegrationServiceEnvironmentManagedApis Put.
 */
public final class IntegrationServiceEnvironmentManagedApisPutSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationServiceEnvironments_ManagedApis_Put.json
     */
    /**
     * Sample code: Gets the integration service environment managed Apis.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void
        getsTheIntegrationServiceEnvironmentManagedApis(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationServiceEnvironmentManagedApis()
            .define("servicebus")
            .withRegion((String) null)
            .withExistingIntegrationServiceEnvironment("testIntegrationServiceEnvironment")
            .create();
    }
}
```

### IntegrationServiceEnvironments_CreateOrUpdate

```java
/**
 * Samples for IntegrationServiceEnvironments CreateOrUpdate.
 */
public final class IntegrationServiceEnvironmentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationServiceEnvironments_Put.json
     */
    /**
     * Sample code: Create or update an integration service environment.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void
        createOrUpdateAnIntegrationServiceEnvironment(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationServiceEnvironments()
            .define("testIntegrationServiceEnvironment")
            .withRegion((String) null)
            .create();
    }
}
```

### IntegrationServiceEnvironments_Delete

```java
/**
 * Samples for IntegrationServiceEnvironments Delete.
 */
public final class IntegrationServiceEnvironmentsDeleteSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationServiceEnvironments_Delete.json
     */
    /**
     * Sample code: Delete an integration account.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void deleteAnIntegrationAccount(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationServiceEnvironments()
            .deleteWithResponse("testIntegrationServiceEnvironment", com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationServiceEnvironments_Get

```java
/**
 * Samples for IntegrationServiceEnvironments Get.
 */
public final class IntegrationServiceEnvironmentsGetSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationServiceEnvironments_Get.json
     */
    /**
     * Sample code: Get integration service environment by name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getIntegrationServiceEnvironmentByName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationServiceEnvironments()
            .getWithResponse("testIntegrationServiceEnvironment", com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationServiceEnvironments_ListByResourceGroup

```java
/**
 * Samples for IntegrationServiceEnvironments ListByResourceGroup.
 */
public final class IntegrationServiceEnvironmentsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationServiceEnvironments_ListByResourceGroup.json
     */
    /**
     * Sample code: List integration service environments by resource group name.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void
        listIntegrationServiceEnvironmentsByResourceGroupName(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationServiceEnvironments().listByResourceGroup(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationServiceEnvironments_ListBySubscription

```java
/**
 * Samples for IntegrationServiceEnvironments ListBySubscription.
 */
public final class IntegrationServiceEnvironmentsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationServiceEnvironments_ListBySubscription.json
     */
    /**
     * Sample code: List integration service environments by subscription.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void
        listIntegrationServiceEnvironmentsBySubscription(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationServiceEnvironments().listBySubscription(null, com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationServiceEnvironments_Restart

```java
/**
 * Samples for IntegrationServiceEnvironments Restart.
 */
public final class IntegrationServiceEnvironmentsRestartSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationServiceEnvironments_Restart.json
     */
    /**
     * Sample code: Restarts an integration service environment.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void restartsAnIntegrationServiceEnvironment(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.integrationServiceEnvironments()
            .restartWithResponse("testIntegrationServiceEnvironment", com.azure.core.util.Context.NONE);
    }
}
```

### IntegrationServiceEnvironments_Update

```java
import com.azure.resourcemanager.logic.models.IntegrationServiceEnvironment;

/**
 * Samples for IntegrationServiceEnvironments Update.
 */
public final class IntegrationServiceEnvironmentsUpdateSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * IntegrationServiceEnvironments_Patch.json
     */
    /**
     * Sample code: Patch an integration service environment.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void patchAnIntegrationServiceEnvironment(com.azure.resourcemanager.logic.LogicManager manager) {
        IntegrationServiceEnvironment resource = manager.integrationServiceEnvironments()
            .getWithResponse("testIntegrationServiceEnvironment", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
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
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Operations_List.json
     */
    /**
     * Sample code: List Microsoft.Logic operations.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void listMicrosoftLogicOperations(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowRunActions_Get

```java
/**
 * Samples for WorkflowRunActions Get.
 */
public final class WorkflowRunActionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowRunActions_Get.json
     */
    /**
     * Sample code: Get a workflow run action.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getAWorkflowRunAction(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowRunActions()
            .getWithResponse("test-resource-group", "test-workflow", "08586676746934337772206998657CU22", "HTTP",
                com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowRunActions_List

```java
/**
 * Samples for WorkflowRunActions List.
 */
public final class WorkflowRunActionsListSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowRunActions_List.json
     */
    /**
     * Sample code: List a workflow run actions.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void listAWorkflowRunActions(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowRunActions()
            .list("test-resource-group", "test-workflow", "08586676746934337772206998657CU22", null, null,
                com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowRunActions_ListExpressionTraces

```java
/**
 * Samples for WorkflowRunActions ListExpressionTraces.
 */
public final class WorkflowRunActionsListExpressionTracesSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * WorkflowRunActions_ListExpressionTraces.json
     */
    /**
     * Sample code: List expression traces.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void listExpressionTraces(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowRunActions()
            .listExpressionTracesWithResponse("testResourceGroup", "testFlow", "08586776228332053161046300351",
                "testAction", com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowRuns_Cancel

```java
/**
 * Samples for WorkflowRuns Cancel.
 */
public final class WorkflowRunsCancelSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowRuns_Cancel.json
     */
    /**
     * Sample code: Cancel a workflow run.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void cancelAWorkflowRun(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowRuns()
            .cancelWithResponse("test-resource-group", "test-workflow", "08586676746934337772206998657CU22",
                com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowRuns_Get

```java
/**
 * Samples for WorkflowRuns Get.
 */
public final class WorkflowRunsGetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowRuns_Get.json
     */
    /**
     * Sample code: Get a run for a workflow.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getARunForAWorkflow(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowRuns()
            .getWithResponse("test-resource-group", "test-workflow", "08586676746934337772206998657CU22",
                com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowTriggerHistories_Get

```java
/**
 * Samples for WorkflowTriggerHistories Get.
 */
public final class WorkflowTriggerHistoriesGetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggerHistories_Get.json
     */
    /**
     * Sample code: Get a workflow trigger history.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getAWorkflowTriggerHistory(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowTriggerHistories()
            .getWithResponse("testResourceGroup", "testWorkflowName", "testTriggerName",
                "08586676746934337772206998657CU22", com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowTriggerHistories_List

```java
/**
 * Samples for WorkflowTriggerHistories List.
 */
public final class WorkflowTriggerHistoriesListSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggerHistories_List.
     * json
     */
    /**
     * Sample code: List a workflow trigger history.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void listAWorkflowTriggerHistory(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowTriggerHistories()
            .list("testResourceGroup", "testWorkflowName", "testTriggerName", null, null,
                com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowTriggerHistories_Resubmit

```java
/**
 * Samples for WorkflowTriggerHistories Resubmit.
 */
public final class WorkflowTriggerHistoriesResubmitSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggerHistories_Resubmit
     * .json
     */
    /**
     * Sample code: Resubmit a workflow run based on the trigger history.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void
        resubmitAWorkflowRunBasedOnTheTriggerHistory(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowTriggerHistories()
            .resubmit("testResourceGroup", "testWorkflowName", "testTriggerName", "testHistoryName",
                com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowTriggers_Get

```java
/**
 * Samples for WorkflowTriggers Get.
 */
public final class WorkflowTriggersGetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggers_Get.json
     */
    /**
     * Sample code: Get a workflow trigger.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getAWorkflowTrigger(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowTriggers()
            .getWithResponse("test-resource-group", "test-workflow", "manual", com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowTriggers_GetSchemaJson

```java
/**
 * Samples for WorkflowTriggers GetSchemaJson.
 */
public final class WorkflowTriggersGetSchemaJsonSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggers_GetSchemaJson.
     * json
     */
    /**
     * Sample code: Get trigger schema.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getTriggerSchema(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowTriggers()
            .getSchemaJsonWithResponse("testResourceGroup", "testWorkflow", "testTrigger",
                com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowTriggers_List

```java
/**
 * Samples for WorkflowTriggers List.
 */
public final class WorkflowTriggersListSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggers_List.json
     */
    /**
     * Sample code: List workflow triggers.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void listWorkflowTriggers(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowTriggers()
            .list("test-resource-group", "test-workflow", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowTriggers_ListCallbackUrl

```java
/**
 * Samples for WorkflowTriggers ListCallbackUrl.
 */
public final class WorkflowTriggersListCallbackUrlSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggers_ListCallbackUrl.
     * json
     */
    /**
     * Sample code: Get the callback URL for a trigger.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getTheCallbackURLForATrigger(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowTriggers()
            .listCallbackUrlWithResponse("test-resource-group", "test-workflow", "manual",
                com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowTriggers_Reset

```java
/**
 * Samples for WorkflowTriggers Reset.
 */
public final class WorkflowTriggersResetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggers_Reset.json
     */
    /**
     * Sample code: Reset trigger.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void resetTrigger(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowTriggers()
            .resetWithResponse("testResourceGroup", "testWorkflow", "testTrigger", com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowTriggers_Run

```java
/**
 * Samples for WorkflowTriggers Run.
 */
public final class WorkflowTriggersRunSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggers_Run.json
     */
    /**
     * Sample code: Run a workflow trigger.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void runAWorkflowTrigger(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowTriggers()
            .run("test-resource-group", "test-workflow", "manual", com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowTriggers_SetState

```java

/**
 * Samples for WorkflowTriggers SetState.
 */
public final class WorkflowTriggersSetStateSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowTriggers_SetState.json
     */
    /**
     * Sample code: Set trigger state.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void setTriggerState(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowTriggers()
            .setStateWithResponse("testResourceGroup", "testWorkflow", "testTrigger", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowVersions_Get

```java
/**
 * Samples for WorkflowVersions Get.
 */
public final class WorkflowVersionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowVersions_Get.json
     */
    /**
     * Sample code: Get a workflow version.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getAWorkflowVersion(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowVersions()
            .getWithResponse("test-resource-group", "test-workflow", "08586676824806722526",
                com.azure.core.util.Context.NONE);
    }
}
```

### WorkflowVersions_List

```java
/**
 * Samples for WorkflowVersions List.
 */
public final class WorkflowVersionsListSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/WorkflowVersions_List.json
     */
    /**
     * Sample code: List a workflows versions.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void listAWorkflowsVersions(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflowVersions().list("test-resource-group", "test-workflow", null, com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_CreateOrUpdate

```java
/**
 * Samples for Workflows CreateOrUpdate.
 */
public final class WorkflowsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_CreateOrUpdate.json
     */
    /**
     * Sample code: Create or update a workflow.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void createOrUpdateAWorkflow(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows()
            .define("test-workflow")
            .withRegion((String) null)
            .withExistingResourceGroup("test-resource-group")
            .create();
    }
}
```

### Workflows_Delete

```java
/**
 * Samples for Workflows Delete.
 */
public final class WorkflowsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_Delete.json
     */
    /**
     * Sample code: Delete a workflow.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void deleteAWorkflow(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows()
            .deleteByResourceGroupWithResponse("test-resource-group", "test-workflow",
                com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_Disable

```java
/**
 * Samples for Workflows Disable.
 */
public final class WorkflowsDisableSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_Disable.json
     */
    /**
     * Sample code: Disable a workflow.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void disableAWorkflow(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows()
            .disableWithResponse("test-resource-group", "test-workflow", com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_Enable

```java
/**
 * Samples for Workflows Enable.
 */
public final class WorkflowsEnableSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_Enable.json
     */
    /**
     * Sample code: Enable a workflow.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void enableAWorkflow(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows()
            .enableWithResponse("test-resource-group", "test-workflow", com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_GenerateUpgradedDefinition

```java

/**
 * Samples for Workflows GenerateUpgradedDefinition.
 */
public final class WorkflowsGenerateUpgradedDefinitionSamples {
    /*
     * x-ms-original-file: specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/
     * Workflows_GenerateUpgradedDefinition.json
     */
    /**
     * Sample code: Generate an upgraded definition.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void generateAnUpgradedDefinition(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows()
            .generateUpgradedDefinitionWithResponse("test-resource-group", "test-workflow", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_GetByResourceGroup

```java
/**
 * Samples for Workflows GetByResourceGroup.
 */
public final class WorkflowsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_Get.json
     */
    /**
     * Sample code: Get a workflow.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getAWorkflow(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows()
            .getByResourceGroupWithResponse("test-resource-group", "test-workflow", com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_List

```java
/**
 * Samples for Workflows List.
 */
public final class WorkflowsListSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_ListBySubscription.json
     */
    /**
     * Sample code: List all workflows in a subscription.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void listAllWorkflowsInASubscription(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows().list(null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_ListByResourceGroup

```java
/**
 * Samples for Workflows ListByResourceGroup.
 */
public final class WorkflowsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_ListByResourceGroup.
     * json
     */
    /**
     * Sample code: List all workflows in a resource group.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void listAllWorkflowsInAResourceGroup(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows().listByResourceGroup("test-resource-group", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_ListCallbackUrl

```java

/**
 * Samples for Workflows ListCallbackUrl.
 */
public final class WorkflowsListCallbackUrlSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_ListCallbackUrl.json
     */
    /**
     * Sample code: Get callback url.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getCallbackUrl(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows()
            .listCallbackUrlWithResponse("testResourceGroup", "testWorkflow", null, com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_ListSwagger

```java
/**
 * Samples for Workflows ListSwagger.
 */
public final class WorkflowsListSwaggerSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_ListSwagger.json
     */
    /**
     * Sample code: Get the swagger for a workflow.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void getTheSwaggerForAWorkflow(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows()
            .listSwaggerWithResponse("testResourceGroup", "testWorkflowName", com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_Move

```java

/**
 * Samples for Workflows Move.
 */
public final class WorkflowsMoveSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_Move.json
     */
    /**
     * Sample code: Move a workflow.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void moveAWorkflow(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows().move("testResourceGroup", "testWorkflow", null, com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_RegenerateAccessKey

```java

/**
 * Samples for Workflows RegenerateAccessKey.
 */
public final class WorkflowsRegenerateAccessKeySamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_RegenerateAccessKey.
     * json
     */
    /**
     * Sample code: Regenerate the callback URL access key for request triggers.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void
        regenerateTheCallbackURLAccessKeyForRequestTriggers(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows()
            .regenerateAccessKeyWithResponse("testResourceGroup", "testWorkflowName", null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Workflows_Update

```java
import com.azure.resourcemanager.logic.models.Workflow;

/**
 * Samples for Workflows Update.
 */
public final class WorkflowsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_Update.json
     */
    /**
     * Sample code: Patch a workflow.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void patchAWorkflow(com.azure.resourcemanager.logic.LogicManager manager) {
        Workflow resource = manager.workflows()
            .getByResourceGroupWithResponse("test-resource-group", "test-workflow", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().apply();
    }
}
```

### Workflows_ValidateByResourceGroup

```java

/**
 * Samples for Workflows ValidateByResourceGroup.
 */
public final class WorkflowsValidateByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/logic/resource-manager/Microsoft.Logic/stable/2019-05-01/examples/Workflows_ValidateByResourceGroup
     * .json
     */
    /**
     * Sample code: Validate a workflow.
     * 
     * @param manager Entry point to LogicManager.
     */
    public static void validateAWorkflow(com.azure.resourcemanager.logic.LogicManager manager) {
        manager.workflows()
            .validateByResourceGroupWithResponse("test-resource-group", "test-workflow", null,
                com.azure.core.util.Context.NONE);
    }
}
```

