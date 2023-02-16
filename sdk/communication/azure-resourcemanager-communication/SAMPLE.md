# Code snippets and samples


## CommunicationServices

- [CheckNameAvailability](#communicationservices_checknameavailability)
- [CreateOrUpdate](#communicationservices_createorupdate)
- [Delete](#communicationservices_delete)
- [GetByResourceGroup](#communicationservices_getbyresourcegroup)
- [LinkNotificationHub](#communicationservices_linknotificationhub)
- [List](#communicationservices_list)
- [ListByResourceGroup](#communicationservices_listbyresourcegroup)
- [ListKeys](#communicationservices_listkeys)
- [RegenerateKey](#communicationservices_regeneratekey)
- [Update](#communicationservices_update)

## Domains

- [AddSuppressedEmailAddresses](#domains_addsuppressedemailaddresses)
- [AddValidSenderUsernames](#domains_addvalidsenderusernames)
- [CancelVerification](#domains_cancelverification)
- [CreateOrUpdate](#domains_createorupdate)
- [Delete](#domains_delete)
- [Get](#domains_get)
- [InitiateVerification](#domains_initiateverification)
- [ListByEmailServiceResource](#domains_listbyemailserviceresource)
- [ListSuppressedEmailAddresses](#domains_listsuppressedemailaddresses)
- [ListValidSenderUsernames](#domains_listvalidsenderusernames)
- [RemoveSuppressedEmailAddresses](#domains_removesuppressedemailaddresses)
- [RemoveValidSenderUsernames](#domains_removevalidsenderusernames)
- [Update](#domains_update)

## EmailServices

- [CreateOrUpdate](#emailservices_createorupdate)
- [Delete](#emailservices_delete)
- [GetByResourceGroup](#emailservices_getbyresourcegroup)
- [List](#emailservices_list)
- [ListByResourceGroup](#emailservices_listbyresourcegroup)
- [ListVerifiedExchangeOnlineDomains](#emailservices_listverifiedexchangeonlinedomains)
- [Update](#emailservices_update)

## Operations

- [List](#operations_list)
### CommunicationServices_CheckNameAvailability

```java
import com.azure.resourcemanager.communication.models.NameAvailabilityParameters;

/** Samples for CommunicationServices CheckNameAvailability. */
public final class CommunicationServicesCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/checkNameAvailabilityAvailable.json
     */
    /**
     * Sample code: Check name availability available.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void checkNameAvailabilityAvailable(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .communicationServices()
            .checkNameAvailabilityWithResponse(
                new NameAvailabilityParameters()
                    .withName("MyCommunicationService")
                    .withType("Microsoft.Communication/CommunicationServices"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/checkNameAvailabilityUnavailable.json
     */
    /**
     * Sample code: Check name availability unavailable.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void checkNameAvailabilityUnavailable(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .communicationServices()
            .checkNameAvailabilityWithResponse(
                new NameAvailabilityParameters()
                    .withName("MyCommunicationService")
                    .withType("Microsoft.Communication/CommunicationServices"),
                com.azure.core.util.Context.NONE);
    }
}
```

### CommunicationServices_CreateOrUpdate

```java
/** Samples for CommunicationServices CreateOrUpdate. */
public final class CommunicationServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/createOrUpdate.json
     */
    /**
     * Sample code: Create or update resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void createOrUpdateResource(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .communicationServices()
            .define("MyCommunicationResource")
            .withRegion("Global")
            .withExistingResourceGroup("MyResourceGroup")
            .withDataLocation("United States")
            .create();
    }
}
```

### CommunicationServices_Delete

```java
/** Samples for CommunicationServices Delete. */
public final class CommunicationServicesDeleteSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/delete.json
     */
    /**
     * Sample code: Delete resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void deleteResource(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .communicationServices()
            .delete("MyResourceGroup", "MyCommunicationResource", com.azure.core.util.Context.NONE);
    }
}
```

### CommunicationServices_GetByResourceGroup

```java
/** Samples for CommunicationServices GetByResourceGroup. */
public final class CommunicationServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/get.json
     */
    /**
     * Sample code: Get resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void getResource(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .communicationServices()
            .getByResourceGroupWithResponse(
                "MyResourceGroup", "MyCommunicationResource", com.azure.core.util.Context.NONE);
    }
}
```

### CommunicationServices_LinkNotificationHub

```java
import com.azure.resourcemanager.communication.models.LinkNotificationHubParameters;

/** Samples for CommunicationServices LinkNotificationHub. */
public final class CommunicationServicesLinkNotificationHubSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/linkNotificationHub.json
     */
    /**
     * Sample code: Link notification hub.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void linkNotificationHub(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .communicationServices()
            .linkNotificationHubWithResponse(
                "MyResourceGroup",
                "MyCommunicationResource",
                new LinkNotificationHubParameters()
                    .withResourceId(
                        "/subscriptions/12345/resourceGroups/MyOtherResourceGroup/providers/Microsoft.NotificationHubs/namespaces/MyNamespace/notificationHubs/MyHub")
                    .withConnectionString("Endpoint=sb://MyNamespace.servicebus.windows.net/;SharedAccessKey=abcd1234"),
                com.azure.core.util.Context.NONE);
    }
}
```

### CommunicationServices_List

```java
/** Samples for CommunicationServices List. */
public final class CommunicationServicesListSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/listBySubscription.json
     */
    /**
     * Sample code: List by subscription.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listBySubscription(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.communicationServices().list(com.azure.core.util.Context.NONE);
    }
}
```

### CommunicationServices_ListByResourceGroup

```java
/** Samples for CommunicationServices ListByResourceGroup. */
public final class CommunicationServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/listByResourceGroup.json
     */
    /**
     * Sample code: List by resource group.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listByResourceGroup(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.communicationServices().listByResourceGroup("MyResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### CommunicationServices_ListKeys

```java
/** Samples for CommunicationServices ListKeys. */
public final class CommunicationServicesListKeysSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/listKeys.json
     */
    /**
     * Sample code: List keys.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listKeys(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .communicationServices()
            .listKeysWithResponse("MyResourceGroup", "MyCommunicationResource", com.azure.core.util.Context.NONE);
    }
}
```

### CommunicationServices_RegenerateKey

```java
import com.azure.resourcemanager.communication.models.KeyType;
import com.azure.resourcemanager.communication.models.RegenerateKeyParameters;

/** Samples for CommunicationServices RegenerateKey. */
public final class CommunicationServicesRegenerateKeySamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/regenerateKey.json
     */
    /**
     * Sample code: Regenerate key.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void regenerateKey(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .communicationServices()
            .regenerateKey(
                "MyResourceGroup",
                "MyCommunicationResource",
                new RegenerateKeyParameters().withKeyType(KeyType.PRIMARY),
                com.azure.core.util.Context.NONE);
    }
}
```

### CommunicationServices_Update

```java
import com.azure.resourcemanager.communication.models.CommunicationServiceResource;
import java.util.HashMap;
import java.util.Map;

/** Samples for CommunicationServices Update. */
public final class CommunicationServicesUpdateSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/update.json
     */
    /**
     * Sample code: Update resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void updateResource(com.azure.resourcemanager.communication.CommunicationManager manager) {
        CommunicationServiceResource resource =
            manager
                .communicationServices()
                .getByResourceGroupWithResponse(
                    "MyResourceGroup", "MyCommunicationResource", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("newTag", "newVal")).apply();
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

### Domains_AddSuppressedEmailAddresses

```java
import com.azure.resourcemanager.communication.models.SuppressionListAddRequest;
import com.azure.resourcemanager.communication.models.SuppressionListAddressInfo;
import java.util.Arrays;

/** Samples for Domains AddSuppressedEmailAddresses. */
public final class DomainsAddSuppressedEmailAddressesSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/addSuppressedEmailAddressesByUsername.json
     */
    /**
     * Sample code: Add suppressed email addresses by valid sender user name.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void addSuppressedEmailAddressesByValidSenderUserName(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .addSuppressedEmailAddressesWithResponse(
                "MyResourceGroup",
                "MyEmailServiceResource",
                "mydomain.com",
                new SuppressionListAddRequest()
                    .withValidSenderUsername("test")
                    .withAddressInfoList(
                        Arrays
                            .asList(
                                new SuppressionListAddressInfo()
                                    .withEmail("abc@xyz.com")
                                    .withFirstName("FirstName")
                                    .withLastName("LastName")
                                    .withNotes("Notes from C1 customer."),
                                new SuppressionListAddressInfo()
                                    .withEmail("defg@xyz.com")
                                    .withFirstName("FirstName")
                                    .withLastName("LastName")
                                    .withNotes("Notes from C1 customer."))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/addSuppressedEmailAddresses.json
     */
    /**
     * Sample code: Add suppressed email addresses.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void addSuppressedEmailAddresses(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .addSuppressedEmailAddressesWithResponse(
                "MyResourceGroup",
                "MyEmailServiceResource",
                "mydomain.com",
                new SuppressionListAddRequest()
                    .withAddressInfoList(
                        Arrays
                            .asList(
                                new SuppressionListAddressInfo()
                                    .withEmail("abc@xyz.com")
                                    .withFirstName("FirstName")
                                    .withLastName("LastName")
                                    .withNotes("Notes from C1 customer."),
                                new SuppressionListAddressInfo()
                                    .withEmail("defg@xyz.com")
                                    .withFirstName("FirstName")
                                    .withLastName("LastName")
                                    .withNotes("Notes from C1 customer."))),
                com.azure.core.util.Context.NONE);
    }
}
```

### Domains_AddValidSenderUsernames

```java
import com.azure.resourcemanager.communication.fluent.models.ValidSenderUsernameCollectionInner;
import com.azure.resourcemanager.communication.models.ValidSenderUsername;
import java.util.Arrays;

/** Samples for Domains AddValidSenderUsernames. */
public final class DomainsAddValidSenderUsernamesSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/addValidSenderUsernames.json
     */
    /**
     * Sample code: Add valid sender user names.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void addValidSenderUserNames(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .addValidSenderUsernamesWithResponse(
                "MyResourceGroup",
                "MyEmailServiceResource",
                "mydomain.com",
                new ValidSenderUsernameCollectionInner()
                    .withValue(Arrays.asList(new ValidSenderUsername().withName("test").withDisplayName("Test"))),
                com.azure.core.util.Context.NONE);
    }
}
```

### Domains_CancelVerification

```java
import com.azure.resourcemanager.communication.models.VerificationParameter;
import com.azure.resourcemanager.communication.models.VerificationType;

/** Samples for Domains CancelVerification. */
public final class DomainsCancelVerificationSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/cancelVerification.json
     */
    /**
     * Sample code: Cancel verification.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void cancelVerification(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .cancelVerification(
                "MyResourceGroup",
                "MyEmailServiceResource",
                "mydomain.com",
                new VerificationParameter().withVerificationType(VerificationType.SPF),
                com.azure.core.util.Context.NONE);
    }
}
```

### Domains_CreateOrUpdate

```java
import com.azure.resourcemanager.communication.models.DomainManagement;

/** Samples for Domains CreateOrUpdate. */
public final class DomainsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/createOrUpdate.json
     */
    /**
     * Sample code: Create or update Domains resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void createOrUpdateDomainsResource(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .define("mydomain.com")
            .withRegion("Global")
            .withExistingEmailService("MyResourceGroup", "MyEmailServiceResource")
            .withDomainManagement(DomainManagement.CUSTOMER_MANAGED)
            .create();
    }
}
```

### Domains_Delete

```java
/** Samples for Domains Delete. */
public final class DomainsDeleteSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/delete.json
     */
    /**
     * Sample code: Delete Domains resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void deleteDomainsResource(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .delete("MyResourceGroup", "MyEmailServiceResource", "mydomain.com", com.azure.core.util.Context.NONE);
    }
}
```

### Domains_Get

```java
/** Samples for Domains Get. */
public final class DomainsGetSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/get.json
     */
    /**
     * Sample code: Get Domains resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void getDomainsResource(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .getWithResponse(
                "MyResourceGroup", "MyEmailServiceResource", "mydomain.com", com.azure.core.util.Context.NONE);
    }
}
```

### Domains_InitiateVerification

```java
import com.azure.resourcemanager.communication.models.VerificationParameter;
import com.azure.resourcemanager.communication.models.VerificationType;

/** Samples for Domains InitiateVerification. */
public final class DomainsInitiateVerificationSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/initiateVerification.json
     */
    /**
     * Sample code: Initiate verification.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void initiateVerification(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .initiateVerification(
                "MyResourceGroup",
                "MyEmailServiceResource",
                "mydomain.com",
                new VerificationParameter().withVerificationType(VerificationType.SPF),
                com.azure.core.util.Context.NONE);
    }
}
```

### Domains_ListByEmailServiceResource

```java
/** Samples for Domains ListByEmailServiceResource. */
public final class DomainsListByEmailServiceResourceSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/listByEmailService.json
     */
    /**
     * Sample code: List Domains resources by EmailServiceName.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listDomainsResourcesByEmailServiceName(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .listByEmailServiceResource("MyResourceGroup", "MyEmailServiceResource", com.azure.core.util.Context.NONE);
    }
}
```

### Domains_ListSuppressedEmailAddresses

```java
import com.azure.resourcemanager.communication.models.SuppressionListRequest;

/** Samples for Domains ListSuppressedEmailAddresses. */
public final class DomainsListSuppressedEmailAddressesSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/listSuppressedEmailAddresses.json
     */
    /**
     * Sample code: List suppressed email addresses.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listSuppressedEmailAddresses(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .listSuppressedEmailAddresses(
                "MyResourceGroup",
                "MyEmailServiceResource",
                "mydomain.com",
                null,
                null,
                new SuppressionListRequest().withValidSenderUsername(""),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/listSuppressedEmailAddressesByUsername.json
     */
    /**
     * Sample code: List suppressed email addresses by valid sender user name.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listSuppressedEmailAddressesByValidSenderUserName(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .listSuppressedEmailAddresses(
                "MyResourceGroup",
                "MyEmailServiceResource",
                "mydomain.com",
                null,
                null,
                new SuppressionListRequest().withValidSenderUsername("test"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/listSuppressedEmailAddressesWithOptionalQueryParameters.json
     */
    /**
     * Sample code: List suppressed email addresses with optional query parameters.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listSuppressedEmailAddressesWithOptionalQueryParameters(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .listSuppressedEmailAddresses(
                "MyResourceGroup",
                "MyEmailServiceResource",
                "mydomain.com",
                5,
                null,
                new SuppressionListRequest().withValidSenderUsername("test"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Domains_ListValidSenderUsernames

```java
/** Samples for Domains ListValidSenderUsernames. */
public final class DomainsListValidSenderUsernamesSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/listValidSenderUsernames.json
     */
    /**
     * Sample code: List valid sender user names.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listValidSenderUserNames(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .listValidSenderUsernamesWithResponse(
                "MyResourceGroup", "MyEmailServiceResource", "mydomain.com", com.azure.core.util.Context.NONE);
    }
}
```

### Domains_RemoveSuppressedEmailAddresses

```java
import com.azure.resourcemanager.communication.models.SuppressionListRemoveRequest;
import java.util.Arrays;

/** Samples for Domains RemoveSuppressedEmailAddresses. */
public final class DomainsRemoveSuppressedEmailAddressesSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/removeSuppressedEmailAddresses.json
     */
    /**
     * Sample code: Remove suppressed email addresses.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void removeSuppressedEmailAddresses(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .removeSuppressedEmailAddressesWithResponse(
                "MyResourceGroup",
                "MyEmailServiceResource",
                "mydomain.com",
                new SuppressionListRemoveRequest().withAddresses(Arrays.asList("abc@xyz.com", "defg@xyz.com")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/removeSuppressedEmailAddressesByUsername.json
     */
    /**
     * Sample code: Remove suppressed email addresses by valid sender user name.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void removeSuppressedEmailAddressesByValidSenderUserName(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .removeSuppressedEmailAddressesWithResponse(
                "MyResourceGroup",
                "MyEmailServiceResource",
                "mydomain.com",
                new SuppressionListRemoveRequest()
                    .withValidSenderUsername("test")
                    .withAddresses(Arrays.asList("abc@xyz.com", "defg@xyz.com")),
                com.azure.core.util.Context.NONE);
    }
}
```

### Domains_RemoveValidSenderUsernames

```java
import com.azure.resourcemanager.communication.models.RemoveValidSenderUsernameParameters;
import java.util.Arrays;

/** Samples for Domains RemoveValidSenderUsernames. */
public final class DomainsRemoveValidSenderUsernamesSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/removeValidSenderUsernames.json
     */
    /**
     * Sample code: Remove valid sender user names.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void removeValidSenderUserNames(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .domains()
            .removeValidSenderUsernamesWithResponse(
                "MyResourceGroup",
                "MyEmailServiceResource",
                "mydomain.com",
                new RemoveValidSenderUsernameParameters()
                    .withValidSenderUsernameList(Arrays.asList("username1", "username2", "username3")),
                com.azure.core.util.Context.NONE);
    }
}
```

### Domains_Update

```java
import com.azure.resourcemanager.communication.models.DomainResource;
import com.azure.resourcemanager.communication.models.UserEngagementTracking;

/** Samples for Domains Update. */
public final class DomainsUpdateSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/domains/update.json
     */
    /**
     * Sample code: Update Domains resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void updateDomainsResource(com.azure.resourcemanager.communication.CommunicationManager manager) {
        DomainResource resource =
            manager
                .domains()
                .getWithResponse(
                    "MyResourceGroup", "MyEmailServiceResource", "mydomain.com", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withUserEngagementTracking(UserEngagementTracking.ENABLED).apply();
    }
}
```

### EmailServices_CreateOrUpdate

```java
/** Samples for EmailServices CreateOrUpdate. */
public final class EmailServicesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/emailServices/createOrUpdate.json
     */
    /**
     * Sample code: Create or update EmailService resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void createOrUpdateEmailServiceResource(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .emailServices()
            .define("MyEmailServiceResource")
            .withRegion("Global")
            .withExistingResourceGroup("MyResourceGroup")
            .withDataLocation("United States")
            .create();
    }
}
```

### EmailServices_Delete

```java
/** Samples for EmailServices Delete. */
public final class EmailServicesDeleteSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/emailServices/delete.json
     */
    /**
     * Sample code: Delete EmailService resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void deleteEmailServiceResource(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.emailServices().delete("MyResourceGroup", "MyEmailServiceResource", com.azure.core.util.Context.NONE);
    }
}
```

### EmailServices_GetByResourceGroup

```java
/** Samples for EmailServices GetByResourceGroup. */
public final class EmailServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/emailServices/get.json
     */
    /**
     * Sample code: Get EmailService resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void getEmailServiceResource(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager
            .emailServices()
            .getByResourceGroupWithResponse(
                "MyResourceGroup", "MyEmailServiceResource", com.azure.core.util.Context.NONE);
    }
}
```

### EmailServices_List

```java
/** Samples for EmailServices List. */
public final class EmailServicesListSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/emailServices/listBySubscription.json
     */
    /**
     * Sample code: List EmailService resources by subscription.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listEmailServiceResourcesBySubscription(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.emailServices().list(com.azure.core.util.Context.NONE);
    }
}
```

### EmailServices_ListByResourceGroup

```java
/** Samples for EmailServices ListByResourceGroup. */
public final class EmailServicesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/emailServices/listByResourceGroup.json
     */
    /**
     * Sample code: List EmailService resources by resource group.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void listEmailServiceResourcesByResourceGroup(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.emailServices().listByResourceGroup("MyResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### EmailServices_ListVerifiedExchangeOnlineDomains

```java
/** Samples for EmailServices ListVerifiedExchangeOnlineDomains. */
public final class EmailServicesListVerifiedExchangeOnlineDomainsSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/emailServices/getVerifiedExchangeOnlineDomains.json
     */
    /**
     * Sample code: Get verified Exchange Online domains.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void getVerifiedExchangeOnlineDomains(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.emailServices().listVerifiedExchangeOnlineDomainsWithResponse(com.azure.core.util.Context.NONE);
    }
}
```

### EmailServices_Update

```java
import com.azure.resourcemanager.communication.models.EmailServiceResource;
import java.util.HashMap;
import java.util.Map;

/** Samples for EmailServices Update. */
public final class EmailServicesUpdateSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/emailServices/update.json
     */
    /**
     * Sample code: Update EmailService resource.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void updateEmailServiceResource(
        com.azure.resourcemanager.communication.CommunicationManager manager) {
        EmailServiceResource resource =
            manager
                .emailServices()
                .getByResourceGroupWithResponse(
                    "MyResourceGroup", "MyEmailServiceResource", com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("newTag", "newVal")).apply();
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
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/communication/resource-manager/Microsoft.Communication/preview/2022-10-01-preview/examples/communicationServices/operationsList.json
     */
    /**
     * Sample code: Operations_List.
     *
     * @param manager Entry point to CommunicationManager.
     */
    public static void operationsList(com.azure.resourcemanager.communication.CommunicationManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

