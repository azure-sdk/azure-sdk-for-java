# Code snippets and samples


## Address

- [Validate](#address_validate)

## Agreements

- [Get](#agreements_get)
- [ListByBillingAccount](#agreements_listbybillingaccount)

## AvailableBalances

- [Get](#availablebalances_get)

## BillingAccounts

- [Get](#billingaccounts_get)
- [List](#billingaccounts_list)
- [ListInvoiceSectionsByCreateSubscriptionPermission](#billingaccounts_listinvoicesectionsbycreatesubscriptionpermission)
- [Update](#billingaccounts_update)

## BillingPermissions

- [ListByBillingAccount](#billingpermissions_listbybillingaccount)
- [ListByBillingProfile](#billingpermissions_listbybillingprofile)
- [ListByCustomer](#billingpermissions_listbycustomer)
- [ListByInvoiceSections](#billingpermissions_listbyinvoicesections)

## BillingProfiles

- [CreateOrUpdate](#billingprofiles_createorupdate)
- [Get](#billingprofiles_get)
- [ListByBillingAccount](#billingprofiles_listbybillingaccount)

## BillingProperty

- [Get](#billingproperty_get)
- [Update](#billingproperty_update)

## BillingRoleAssignments

- [DeleteByBillingAccount](#billingroleassignments_deletebybillingaccount)
- [DeleteByBillingProfile](#billingroleassignments_deletebybillingprofile)
- [DeleteByInvoiceSection](#billingroleassignments_deletebyinvoicesection)
- [GetByBillingAccount](#billingroleassignments_getbybillingaccount)
- [GetByBillingProfile](#billingroleassignments_getbybillingprofile)
- [GetByInvoiceSection](#billingroleassignments_getbyinvoicesection)
- [ListByBillingAccount](#billingroleassignments_listbybillingaccount)
- [ListByBillingProfile](#billingroleassignments_listbybillingprofile)
- [ListByInvoiceSection](#billingroleassignments_listbyinvoicesection)

## BillingRoleDefinitions

- [GetByBillingAccount](#billingroledefinitions_getbybillingaccount)
- [GetByBillingProfile](#billingroledefinitions_getbybillingprofile)
- [GetByInvoiceSection](#billingroledefinitions_getbyinvoicesection)
- [ListByBillingAccount](#billingroledefinitions_listbybillingaccount)
- [ListByBillingProfile](#billingroledefinitions_listbybillingprofile)
- [ListByInvoiceSection](#billingroledefinitions_listbyinvoicesection)

## BillingSubscriptions

- [Get](#billingsubscriptions_get)
- [ListByBillingAccount](#billingsubscriptions_listbybillingaccount)
- [ListByBillingProfile](#billingsubscriptions_listbybillingprofile)
- [ListByCustomer](#billingsubscriptions_listbycustomer)
- [ListByInvoiceSection](#billingsubscriptions_listbyinvoicesection)
- [Move](#billingsubscriptions_move)
- [Update](#billingsubscriptions_update)
- [ValidateMove](#billingsubscriptions_validatemove)

## Customers

- [Get](#customers_get)
- [ListByBillingAccount](#customers_listbybillingaccount)
- [ListByBillingProfile](#customers_listbybillingprofile)

## Departments

- [Get](#departments_get)
- [ListByBillingAccount](#departments_listbybillingaccount)

## Instructions

- [Get](#instructions_get)
- [ListByBillingProfile](#instructions_listbybillingprofile)
- [Put](#instructions_put)

## InvoiceSections

- [CreateOrUpdate](#invoicesections_createorupdate)
- [Get](#invoicesections_get)
- [ListByBillingProfile](#invoicesections_listbybillingprofile)

## Invoices

- [DownloadBillingSubscriptionInvoice](#invoices_downloadbillingsubscriptioninvoice)
- [DownloadInvoice](#invoices_downloadinvoice)
- [DownloadMultipleBillingProfileInvoices](#invoices_downloadmultiplebillingprofileinvoices)
- [DownloadMultipleBillingSubscriptionInvoices](#invoices_downloadmultiplebillingsubscriptioninvoices)
- [Get](#invoices_get)
- [GetById](#invoices_getbyid)
- [GetBySubscriptionAndInvoiceId](#invoices_getbysubscriptionandinvoiceid)
- [ListByBillingAccount](#invoices_listbybillingaccount)
- [ListByBillingProfile](#invoices_listbybillingprofile)
- [ListByBillingSubscription](#invoices_listbybillingsubscription)

## Operations

- [List](#operations_list)

## PaymentMethods

- [DeleteByUser](#paymentmethods_deletebyuser)
- [GetByBillingAccount](#paymentmethods_getbybillingaccount)
- [GetByBillingProfile](#paymentmethods_getbybillingprofile)
- [GetByUser](#paymentmethods_getbyuser)
- [ListByBillingAccount](#paymentmethods_listbybillingaccount)
- [ListByBillingProfile](#paymentmethods_listbybillingprofile)
- [ListByUser](#paymentmethods_listbyuser)

## Policies

- [GetByBillingProfile](#policies_getbybillingprofile)
- [GetByCustomer](#policies_getbycustomer)
- [Update](#policies_update)
- [UpdateCustomer](#policies_updatecustomer)

## Products

- [Get](#products_get)
- [ListByBillingAccount](#products_listbybillingaccount)
- [ListByBillingProfile](#products_listbybillingprofile)
- [ListByCustomer](#products_listbycustomer)
- [ListByInvoiceSection](#products_listbyinvoicesection)
- [Move](#products_move)
- [Update](#products_update)
- [ValidateMove](#products_validatemove)

## Reservations

- [ListByBillingAccount](#reservations_listbybillingaccount)
- [ListByBillingProfile](#reservations_listbybillingprofile)

## Transactions

- [ListByInvoice](#transactions_listbyinvoice)
### Address_Validate

```java
import com.azure.resourcemanager.billing.models.AddressDetails;

/** Samples for Address Validate. */
public final class AddressValidateSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/addressValidateValid.json
     */
    /**
     * Sample code: addressValidateValid.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void addressValidateValid(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .address()
            .validateWithResponse(
                new AddressDetails()
                    .withAddressLine1("1 Test Address")
                    .withCity("bellevue")
                    .withCountry("us")
                    .withPostalCode("fakeTokenPlaceholder")
                    .withRegion("wa"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/addressValidateInvalid.json
     */
    /**
     * Sample code: addressValidateInvalid.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void addressValidateInvalid(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .address()
            .validateWithResponse(
                new AddressDetails()
                    .withAddressLine1("1 Test")
                    .withCity("bellevue")
                    .withCountry("us")
                    .withPostalCode("fakeTokenPlaceholder")
                    .withRegion("wa"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Agreements_Get

```java
/** Samples for Agreements Get. */
public final class AgreementsGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/agreementsGet.json
     */
    /**
     * Sample code: agreementsGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void agreementsGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .agreements()
            .getWithResponse("{billingAccountName}", "{agreementName}", null, com.azure.core.util.Context.NONE);
    }
}
```

### Agreements_ListByBillingAccount

```java
/** Samples for Agreements ListByBillingAccount. */
public final class AgreementsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/agreementsListByBillingAccount.json
     */
    /**
     * Sample code: agreementsListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void agreementsListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.agreements().listByBillingAccount("{billingAccountName}", null, com.azure.core.util.Context.NONE);
    }
}
```

### AvailableBalances_Get

```java
/** Samples for AvailableBalances Get. */
public final class AvailableBalancesGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/availableBalancesGetByBillingProfile.json
     */
    /**
     * Sample code: availableBalancesGetByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void availableBalancesGetByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .availableBalances()
            .getWithResponse("{billingAccountName}", "{billingProfileName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingAccounts_Get

```java
/** Samples for BillingAccounts Get. */
public final class BillingAccountsGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingAccountsGet.json
     */
    /**
     * Sample code: billingAccountsGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountsGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingAccounts()
            .getWithResponse(
                "00000000-0000-0000-0000-000000000000:11111111-1111-1111-1111-111111111111_2019-05-31",
                null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingAccountsGetWithExpand.json
     */
    /**
     * Sample code: billingAccountsGetWithExpand.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountsGetWithExpand(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingAccounts()
            .getWithResponse(
                "00000000-0000-0000-0000-000000000000:11111111-1111-1111-1111-111111111111_2019-05-31",
                "soldTo,billingProfiles,billingProfiles/invoiceSections",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingAccounts_List

```java
/** Samples for BillingAccounts List. */
public final class BillingAccountsListSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingAccountsListWithExpandForEnrollmentDetails.json
     */
    /**
     * Sample code: billingAccountsListWithExpandForEnrollmentDetails.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountsListWithExpandForEnrollmentDetails(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingAccounts()
            .list("enrollmentDetails,departments,enrollmentAccounts", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingAccountsList.json
     */
    /**
     * Sample code: billingAccountsList.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountsList(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingAccounts().list(null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingAccountsListWithExpand.json
     */
    /**
     * Sample code: billingAccountsListWithExpand.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountsListWithExpand(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingAccounts()
            .list("soldTo,billingProfiles,billingProfiles/invoiceSections", com.azure.core.util.Context.NONE);
    }
}
```

### BillingAccounts_ListInvoiceSectionsByCreateSubscriptionPermission

```java
/** Samples for BillingAccounts ListInvoiceSectionsByCreateSubscriptionPermission. */
public final class BillingAccountsListInvoiceSectionsByCreateSubscriptionPermissionSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoiceSectionsListWithCreateSubPermission.json
     */
    /**
     * Sample code: invoiceSectionsListWithCreateSubPermission.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoiceSectionsListWithCreateSubPermission(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingAccounts()
            .listInvoiceSectionsByCreateSubscriptionPermission(
                "00000000-0000-0000-0000-000000000000:11111111-1111-1111-1111-111111111111_2019-05-31",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingAccounts_Update

```java
import com.azure.resourcemanager.billing.models.AddressDetails;
import com.azure.resourcemanager.billing.models.BillingAccountUpdateRequest;

/** Samples for BillingAccounts Update. */
public final class BillingAccountsUpdateSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingAccountsPatch.json
     */
    /**
     * Sample code: billingAccountsPatch.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountsPatch(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingAccounts()
            .update(
                "00000000-0000-0000-0000-000000000000:11111111-1111-1111-1111-111111111111_2019-05-31",
                new BillingAccountUpdateRequest()
                    .withDisplayName("Test Account")
                    .withSoldTo(
                        new AddressDetails()
                            .withAddressLine1("Test Address 1")
                            .withCity("Redmond")
                            .withCompanyName("Contoso")
                            .withCountry("US")
                            .withFirstName("Test")
                            .withLastName("User")
                            .withPostalCode("fakeTokenPlaceholder")
                            .withRegion("WA")),
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingPermissions_ListByBillingAccount

```java
/** Samples for BillingPermissions ListByBillingAccount. */
public final class BillingPermissionsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingPermissionsListByBillingAccount.json
     */
    /**
     * Sample code: billingPermissionsListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingPermissionsListByBillingAccount(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingPermissions().listByBillingAccount("{billingAccountName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingPermissions_ListByBillingProfile

```java
/** Samples for BillingPermissions ListByBillingProfile. */
public final class BillingPermissionsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingPermissionsListByBillingProfile.json
     */
    /**
     * Sample code: billingPermissionsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingPermissionsListByBillingProfile(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingPermissions()
            .listByBillingProfile("{billingAccountName}", "{billingProfileName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingPermissions_ListByCustomer

```java
/** Samples for BillingPermissions ListByCustomer. */
public final class BillingPermissionsListByCustomerSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingPermissionsListByCustomer.json
     */
    /**
     * Sample code: billingPermissionsListByCustomer.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingPermissionsListByCustomer(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingPermissions()
            .listByCustomer("{billingAccountName}", "{customerName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingPermissions_ListByInvoiceSections

```java
/** Samples for BillingPermissions ListByInvoiceSections. */
public final class BillingPermissionsListByInvoiceSectionsSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingPermissionsListByInvoiceSection.json
     */
    /**
     * Sample code: billingPermissionsListByInvoiceSection.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingPermissionsListByInvoiceSection(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingPermissions()
            .listByInvoiceSections(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingProfiles_CreateOrUpdate

```java
import com.azure.resourcemanager.billing.fluent.models.BillingProfileAutoGeneratedInner;
import com.azure.resourcemanager.billing.models.AddressDetails;
import com.azure.resourcemanager.billing.models.AzurePlan;
import java.util.Arrays;

/** Samples for BillingProfiles CreateOrUpdate. */
public final class BillingProfilesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingProfilesPut.json
     */
    /**
     * Sample code: billingProfilesPut.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingProfilesPut(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingProfiles()
            .createOrUpdate(
                "{billingAccountName}",
                "{billingProfileName}",
                new BillingProfileAutoGeneratedInner()
                    .withBillTo(
                        new AddressDetails()
                            .withAddressLine1("Test Address 1")
                            .withCity("Redmond")
                            .withCountry("US")
                            .withFirstName("Test")
                            .withLastName("User")
                            .withPostalCode("fakeTokenPlaceholder")
                            .withRegion("WA"))
                    .withDisplayName("Finance")
                    .withEnabledAzurePlans(Arrays.asList(new AzurePlan(), new AzurePlan()))
                    .withInvoiceEmailOptIn(true)
                    .withPoNumber("ABC12345"),
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingProfiles_Get

```java
/** Samples for BillingProfiles Get. */
public final class BillingProfilesGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingProfilesGet.json
     */
    /**
     * Sample code: billingProfilesGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingProfilesGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingProfiles()
            .getWithResponse("{billingAccountName}", "{billingProfileName}", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingProfilesGetWithExpand.json
     */
    /**
     * Sample code: billingProfilesGetWithExpand.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingProfilesGetWithExpand(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingProfiles()
            .getWithResponse(
                "{billingAccountName}", "{billingProfileName}", "invoiceSections", com.azure.core.util.Context.NONE);
    }
}
```

### BillingProfiles_ListByBillingAccount

```java
/** Samples for BillingProfiles ListByBillingAccount. */
public final class BillingProfilesListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingProfilesListByBillingAccountWithExpand.json
     */
    /**
     * Sample code: billingProfilesListByBillingAccountWithExpand.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingProfilesListByBillingAccountWithExpand(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingProfiles()
            .listByBillingAccount("{billingAccountName}", "invoiceSections", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingProfilesListByBillingAccount.json
     */
    /**
     * Sample code: billingProfilesListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingProfilesListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingProfiles().listByBillingAccount("{billingAccountName}", null, com.azure.core.util.Context.NONE);
    }
}
```

### BillingProperty_Get

```java
/** Samples for BillingProperty Get. */
public final class BillingPropertyGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingPropertiesGet.json
     */
    /**
     * Sample code: billingPropertiesGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingPropertiesGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingProperties().getWithResponse("{subscriptionId}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingProperty_Update

```java
import com.azure.resourcemanager.billing.fluent.models.BillingPropertyInner;

/** Samples for BillingProperty Update. */
public final class BillingPropertyUpdateSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingPropertiesPatch.json
     */
    /**
     * Sample code: billingPropertiesPatch.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingPropertiesPatch(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingProperties()
            .updateWithResponse(
                "{subscriptionId}",
                new BillingPropertyInner().withCostCenter("1010"),
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleAssignments_DeleteByBillingAccount

```java
/** Samples for BillingRoleAssignments DeleteByBillingAccount. */
public final class BillingRoleAssignmentsDeleteByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleAssignmentsDeleteByBillingAccount.json
     */
    /**
     * Sample code: billingRoleAssignmentsDeleteByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleAssignmentsDeleteByBillingAccount(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleAssignments()
            .deleteByBillingAccountWithResponse(
                "{billingAccountName}", "{billingRoleAssignmentName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleAssignments_DeleteByBillingProfile

```java
/** Samples for BillingRoleAssignments DeleteByBillingProfile. */
public final class BillingRoleAssignmentsDeleteByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleAssignmentsDeleteByBillingProfile.json
     */
    /**
     * Sample code: billingRoleAssignmentsDeleteByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleAssignmentsDeleteByBillingProfile(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleAssignments()
            .deleteByBillingProfileWithResponse(
                "{billingAccountName}",
                "{billingProfileName}",
                "{billingRoleAssignmentName}",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleAssignments_DeleteByInvoiceSection

```java
/** Samples for BillingRoleAssignments DeleteByInvoiceSection. */
public final class BillingRoleAssignmentsDeleteByInvoiceSectionSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleAssignmentsDeleteByInvoiceSection.json
     */
    /**
     * Sample code: billingRoleAssignmentsDeleteByInvoiceSection.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleAssignmentsDeleteByInvoiceSection(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleAssignments()
            .deleteByInvoiceSectionWithResponse(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                "{billingRoleAssignmentName}",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleAssignments_GetByBillingAccount

```java
/** Samples for BillingRoleAssignments GetByBillingAccount. */
public final class BillingRoleAssignmentsGetByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleAssignmentsGetByBillingAccount.json
     */
    /**
     * Sample code: billingRoleAssignmentsGetByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleAssignmentsGetByBillingAccount(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleAssignments()
            .getByBillingAccountWithResponse(
                "{billingAccountName}", "{billingRoleAssignmentId}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleAssignments_GetByBillingProfile

```java
/** Samples for BillingRoleAssignments GetByBillingProfile. */
public final class BillingRoleAssignmentsGetByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleAssignmentsGetByBillingProfile.json
     */
    /**
     * Sample code: billingRoleAssignmentsGetByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleAssignmentsGetByBillingProfile(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleAssignments()
            .getByBillingProfileWithResponse(
                "{billingAccountName}",
                "{billingProfileName}",
                "{billingRoleAssignmentName}",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleAssignments_GetByInvoiceSection

```java
/** Samples for BillingRoleAssignments GetByInvoiceSection. */
public final class BillingRoleAssignmentsGetByInvoiceSectionSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleAssignmentsGetByInvoiceSection.json
     */
    /**
     * Sample code: billingRoleAssignmentsGetByInvoiceSection.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleAssignmentsGetByInvoiceSection(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleAssignments()
            .getByInvoiceSectionWithResponse(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                "{billingRoleAssignmentName}",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleAssignments_ListByBillingAccount

```java
/** Samples for BillingRoleAssignments ListByBillingAccount. */
public final class BillingRoleAssignmentsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleAssignmentsListByBillingAccount.json
     */
    /**
     * Sample code: billingRoleAssignmentsListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleAssignmentsListByBillingAccount(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingRoleAssignments().listByBillingAccount("{billingAccountName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleAssignments_ListByBillingProfile

```java
/** Samples for BillingRoleAssignments ListByBillingProfile. */
public final class BillingRoleAssignmentsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleAssignmentsListByBillingProfile.json
     */
    /**
     * Sample code: billingRoleAssignmentsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleAssignmentsListByBillingProfile(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleAssignments()
            .listByBillingProfile("{billingAccountName}", "{billingProfileName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleAssignments_ListByInvoiceSection

```java
/** Samples for BillingRoleAssignments ListByInvoiceSection. */
public final class BillingRoleAssignmentsListByInvoiceSectionSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleAssignmentsListByInvoiceSection.json
     */
    /**
     * Sample code: billingRoleAssignmentsListByInvoiceSection.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleAssignmentsListByInvoiceSection(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleAssignments()
            .listByInvoiceSection(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleDefinitions_GetByBillingAccount

```java
/** Samples for BillingRoleDefinitions GetByBillingAccount. */
public final class BillingRoleDefinitionsGetByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleDefinitionsGetByBillingAccount.json
     */
    /**
     * Sample code: billingRoleDefinitionsGetByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleDefinitionsGetByBillingAccount(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleDefinitions()
            .getByBillingAccountWithResponse(
                "{billingAccountName}", "{billingRoleDefinitionName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleDefinitions_GetByBillingProfile

```java
/** Samples for BillingRoleDefinitions GetByBillingProfile. */
public final class BillingRoleDefinitionsGetByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleDefinitionsGetByBillingProfile.json
     */
    /**
     * Sample code: billingRoleDefinitionsGetByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleDefinitionsGetByBillingProfile(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleDefinitions()
            .getByBillingProfileWithResponse(
                "{billingAccountName}",
                "{billingProfileName}",
                "{billingRoleDefinitionName}",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleDefinitions_GetByInvoiceSection

```java
/** Samples for BillingRoleDefinitions GetByInvoiceSection. */
public final class BillingRoleDefinitionsGetByInvoiceSectionSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleDefinitionsGetByInvoiceSection.json
     */
    /**
     * Sample code: billingRoleDefinitionsGetByInvoiceSection.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleDefinitionsGetByInvoiceSection(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleDefinitions()
            .getByInvoiceSectionWithResponse(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                "{billingRoleDefinitionName}",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleDefinitions_ListByBillingAccount

```java
/** Samples for BillingRoleDefinitions ListByBillingAccount. */
public final class BillingRoleDefinitionsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleDefinitionsListByBillingAccount.json
     */
    /**
     * Sample code: billingRoleDefinitionsListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleDefinitionsListByBillingAccount(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingRoleDefinitions().listByBillingAccount("{billingAccountName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleDefinitions_ListByBillingProfile

```java
/** Samples for BillingRoleDefinitions ListByBillingProfile. */
public final class BillingRoleDefinitionsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleDefinitionsListByBillingProfile.json
     */
    /**
     * Sample code: billingRoleDefinitionsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleDefinitionsListByBillingProfile(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleDefinitions()
            .listByBillingProfile("{billingAccountName}", "{billingProfileName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingRoleDefinitions_ListByInvoiceSection

```java
/** Samples for BillingRoleDefinitions ListByInvoiceSection. */
public final class BillingRoleDefinitionsListByInvoiceSectionSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingRoleDefinitionsListByInvoiceSection.json
     */
    /**
     * Sample code: billingRoleDefinitionsListByInvoiceSection.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingRoleDefinitionsListByInvoiceSection(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingRoleDefinitions()
            .listByInvoiceSection(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingSubscriptions_Get

```java
/** Samples for BillingSubscriptions Get. */
public final class BillingSubscriptionsGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingSubscriptionsGet.json
     */
    /**
     * Sample code: billingSubscriptionsGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingSubscriptionsGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingSubscriptions()
            .getWithResponse("{billingAccountName}", "{subscriptionId}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingSubscriptions_ListByBillingAccount

```java
/** Samples for BillingSubscriptions ListByBillingAccount. */
public final class BillingSubscriptionsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingSubscriptionsListByBillingAccount.json
     */
    /**
     * Sample code: billingSubscriptionsListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingSubscriptionsListByBillingAccount(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingSubscriptions().listByBillingAccount("{billingAccountName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingSubscriptions_ListByBillingProfile

```java
/** Samples for BillingSubscriptions ListByBillingProfile. */
public final class BillingSubscriptionsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingSubscriptionsListByBillingProfile.json
     */
    /**
     * Sample code: billingSubscriptionsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingSubscriptionsListByBillingProfile(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingSubscriptions()
            .listByBillingProfile("{billingAccountName}", "{billingProfileName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingSubscriptions_ListByCustomer

```java
/** Samples for BillingSubscriptions ListByCustomer. */
public final class BillingSubscriptionsListByCustomerSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingSubscriptionsListByCustomer.json
     */
    /**
     * Sample code: billingSubscriptionsListByCustomer.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingSubscriptionsListByCustomer(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingSubscriptions()
            .listByCustomer("{billingAccountName}", "{customerName}", com.azure.core.util.Context.NONE);
    }
}
```

### BillingSubscriptions_ListByInvoiceSection

```java
/** Samples for BillingSubscriptions ListByInvoiceSection. */
public final class BillingSubscriptionsListByInvoiceSectionSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingSubscriptionsListByInvoiceSection.json
     */
    /**
     * Sample code: billingSubscriptionsListByInvoiceSection.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingSubscriptionsListByInvoiceSection(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingSubscriptions()
            .listByInvoiceSection(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingSubscriptions_Move

```java
import com.azure.resourcemanager.billing.models.TransferBillingSubscriptionRequestProperties;

/** Samples for BillingSubscriptions Move. */
public final class BillingSubscriptionsMoveSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingSubscriptionsMove.json
     */
    /**
     * Sample code: billingSubscriptionsMove.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingSubscriptionsMove(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingSubscriptions()
            .move(
                "{billingAccountName}",
                "{subscriptionId}",
                new TransferBillingSubscriptionRequestProperties()
                    .withDestinationInvoiceSectionId(
                        "/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{newInvoiceSectionName}"),
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingSubscriptions_Update

```java
import com.azure.resourcemanager.billing.fluent.models.BillingSubscriptionInner;

/** Samples for BillingSubscriptions Update. */
public final class BillingSubscriptionsUpdateSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingSubscriptionsPatch.json
     */
    /**
     * Sample code: billingSubscriptionsPatch.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingSubscriptionsPatch(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingSubscriptions()
            .updateWithResponse(
                "{billingAccountName}",
                "{subscriptionId}",
                new BillingSubscriptionInner().withCostCenter("ABC1234"),
                com.azure.core.util.Context.NONE);
    }
}
```

### BillingSubscriptions_ValidateMove

```java
import com.azure.resourcemanager.billing.models.TransferBillingSubscriptionRequestProperties;

/** Samples for BillingSubscriptions ValidateMove. */
public final class BillingSubscriptionsValidateMoveSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingSubscriptionsValidateMoveFailure.json
     */
    /**
     * Sample code: billingSubscriptionsValidateMoveFailure.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingSubscriptionsValidateMoveFailure(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingSubscriptions()
            .validateMoveWithResponse(
                "{billingAccountName}",
                "{subscriptionId}",
                new TransferBillingSubscriptionRequestProperties()
                    .withDestinationInvoiceSectionId(
                        "/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{newInvoiceSectionName}"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/billingSubscriptionsValidateMoveSuccess.json
     */
    /**
     * Sample code: billingSubscriptionsValidateMoveSuccess.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void billingSubscriptionsValidateMoveSuccess(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .billingSubscriptions()
            .validateMoveWithResponse(
                "{billingAccountName}",
                "{subscriptionId}",
                new TransferBillingSubscriptionRequestProperties()
                    .withDestinationInvoiceSectionId(
                        "/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{newInvoiceSectionName}"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Customers_Get

```java
/** Samples for Customers Get. */
public final class CustomersGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/customersGetWithExpand.json
     */
    /**
     * Sample code: customersGetWithExpand.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void customersGetWithExpand(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .customers()
            .getWithResponse(
                "{billingAccountName}",
                "{customerName}",
                "enabledAzurePlans,resellers",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/customersGet.json
     */
    /**
     * Sample code: customersGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void customersGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .customers()
            .getWithResponse("{billingAccountName}", "{customerName}", null, com.azure.core.util.Context.NONE);
    }
}
```

### Customers_ListByBillingAccount

```java
/** Samples for Customers ListByBillingAccount. */
public final class CustomersListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/customersListByBillingAccount.json
     */
    /**
     * Sample code: customersListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void customersListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.customers().listByBillingAccount("{billingAccountName}", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Customers_ListByBillingProfile

```java
/** Samples for Customers ListByBillingProfile. */
public final class CustomersListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/customersListByBillingProfile.json
     */
    /**
     * Sample code: customersListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void customersListByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .customers()
            .listByBillingProfile(
                "{billingAccountName}", "{billingProfileName}", null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Departments_Get

```java
/** Samples for Departments Get. */
public final class DepartmentsGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/departmentGet.json
     */
    /**
     * Sample code: DepartmentGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void departmentGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.departments().getWithResponse("456598", "164821", com.azure.core.util.Context.NONE);
    }
}
```

### Departments_ListByBillingAccount

```java
/** Samples for Departments ListByBillingAccount. */
public final class DepartmentsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/departmentsListByBillingAccount.json
     */
    /**
     * Sample code: DepartmentsListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void departmentsListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .departments()
            .listByBillingAccount("456598", null, null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
```

### Instructions_Get

```java
/** Samples for Instructions Get. */
public final class InstructionsGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/instructionsGet.json
     */
    /**
     * Sample code: instructionsGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void instructionsGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .instructions()
            .getWithResponse(
                "{billingAccountName}", "{billingProfileName}", "{instructionName}", com.azure.core.util.Context.NONE);
    }
}
```

### Instructions_ListByBillingProfile

```java
/** Samples for Instructions ListByBillingProfile. */
public final class InstructionsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/instructionsListByBillingProfile.json
     */
    /**
     * Sample code: instructionsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void instructionsListByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .instructions()
            .listByBillingProfile("{billingAccountName}", "{billingProfileName}", com.azure.core.util.Context.NONE);
    }
}
```

### Instructions_Put

```java
import com.azure.resourcemanager.billing.fluent.models.InstructionInner;
import java.time.OffsetDateTime;

/** Samples for Instructions Put. */
public final class InstructionsPutSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/instructionsPut.json
     */
    /**
     * Sample code: instructionsPut.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void instructionsPut(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .instructions()
            .putWithResponse(
                "{billingAccountName}",
                "{billingProfileName}",
                "{instructionName}",
                new InstructionInner()
                    .withAmount(5000f)
                    .withEndDate(OffsetDateTime.parse("2020-12-30T21:26:47.997Z"))
                    .withStartDate(OffsetDateTime.parse("2019-12-30T21:26:47.997Z")),
                com.azure.core.util.Context.NONE);
    }
}
```

### InvoiceSections_CreateOrUpdate

```java
import com.azure.resourcemanager.billing.fluent.models.InvoiceSectionInner;
import java.util.HashMap;
import java.util.Map;

/** Samples for InvoiceSections CreateOrUpdate. */
public final class InvoiceSectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoiceSectionsPut.json
     */
    /**
     * Sample code: invoiceSectionsPut.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoiceSectionsPut(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoiceSections()
            .createOrUpdate(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                new InvoiceSectionInner()
                    .withDisplayName("invoiceSection1")
                    .withLabels(mapOf("costCategory", "Support", "pcCode", "A123456")),
                com.azure.core.util.Context.NONE);
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

### InvoiceSections_Get

```java
/** Samples for InvoiceSections Get. */
public final class InvoiceSectionsGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoiceSectionsGet.json
     */
    /**
     * Sample code: invoiceSectionsGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoiceSectionsGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoiceSections()
            .getWithResponse(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                com.azure.core.util.Context.NONE);
    }
}
```

### InvoiceSections_ListByBillingProfile

```java
/** Samples for InvoiceSections ListByBillingProfile. */
public final class InvoiceSectionsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoiceSectionsListByBillingProfile.json
     */
    /**
     * Sample code: invoiceSectionsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoiceSectionsListByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoiceSections()
            .listByBillingProfile("{billingAccountName}", "{billingProfileName}", com.azure.core.util.Context.NONE);
    }
}
```

### Invoices_DownloadBillingSubscriptionInvoice

```java
/** Samples for Invoices DownloadBillingSubscriptionInvoice. */
public final class InvoicesDownloadBillingSubscriptionInvoiceSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesDownloadByBillingSubscription.json
     */
    /**
     * Sample code: invoicesDownloadByBillingSubscription.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesDownloadByBillingSubscription(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .downloadBillingSubscriptionInvoice(
                "{subscriptionId}", "{invoiceName}", "DRS_12345", com.azure.core.util.Context.NONE);
    }
}
```

### Invoices_DownloadInvoice

```java
/** Samples for Invoices DownloadInvoice. */
public final class InvoicesDownloadInvoiceSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesDownloadByBillingAccount.json
     */
    /**
     * Sample code: invoicesDownloadByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesDownloadByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .downloadInvoice("{billingAccountName}", "{invoiceName}", "DRS_12345", com.azure.core.util.Context.NONE);
    }
}
```

### Invoices_DownloadMultipleBillingProfileInvoices

```java
import java.util.Arrays;

/** Samples for Invoices DownloadMultipleBillingProfileInvoices. */
public final class InvoicesDownloadMultipleBillingProfileInvoicesSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesDownloadBatchByBillingAccount.json
     */
    /**
     * Sample code: invoicesDownloadBatchByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesDownloadBatchByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .downloadMultipleBillingProfileInvoices(
                "{billingAccountName}",
                Arrays
                    .asList(
                        "https://management.azure.com/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/invoices/{invoiceName}/download?downloadToken={downloadToken}&useCache=True&api-version=2023-04-01",
                        "https://management.azure.com/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/invoices/{invoiceName}/download?downloadToken={downloadToken}&useCache=True&api-version=2023-04-01",
                        "https://management.azure.com/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/invoices/{invoiceName}/download?downloadToken={downloadToken}&useCache=True&api-version=2023-04-01"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Invoices_DownloadMultipleBillingSubscriptionInvoices

```java
import java.util.Arrays;

/** Samples for Invoices DownloadMultipleBillingSubscriptionInvoices. */
public final class InvoicesDownloadMultipleBillingSubscriptionInvoicesSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesDownloadBatchByBillingSubscription.json
     */
    /**
     * Sample code: invoicesDownloadBatchByBillingSubscription.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesDownloadBatchByBillingSubscription(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .downloadMultipleBillingSubscriptionInvoices(
                "{subscriptionId}",
                Arrays
                    .asList(
                        "https://management.azure.com/providers/Microsoft.Billing/billingAccounts/default/billingSubscriptions/{subscriptionId}/invoices/{invoiceName}/download?downloadToken={downloadToken}&useCache=True&api-version=2023-04-01",
                        "https://management.azure.com/providers/Microsoft.Billing/billingAccounts/default/billingSubscriptions/{subscriptionId}/invoices/{invoiceName}/download?downloadToken={downloadToken}&useCache=True&api-version=2023-04-01",
                        "https://management.azure.com/providers/Microsoft.Billing/billingAccounts/default/billingSubscriptions/{subscriptionId}/invoices/{invoiceName}/download?downloadToken={downloadToken}&useCache=True&api-version=2023-04-01"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Invoices_Get

```java
/** Samples for Invoices Get. */
public final class InvoicesGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesGetByBillingAccount.json
     */
    /**
     * Sample code: invoicesGetByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesGetByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.invoices().getWithResponse("{billingAccountName}", "{invoiceName}", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesGetVoid.json
     */
    /**
     * Sample code: invoicesGetVoid.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesGetVoid(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.invoices().getWithResponse("{billingAccountName}", "{invoiceName}", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesGetCreditNote.json
     */
    /**
     * Sample code: invoicesGetCreditNote.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesGetCreditNote(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.invoices().getWithResponse("{billingAccountName}", "{invoiceName}", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesGetWithRebillDetails.json
     */
    /**
     * Sample code: invoicesGetWithRebillDetails.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesGetWithRebillDetails(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.invoices().getWithResponse("{billingAccountName}", "{invoiceName}", com.azure.core.util.Context.NONE);
    }
}
```

### Invoices_GetById

```java
/** Samples for Invoices GetById. */
public final class InvoicesGetByIdSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesGet.json
     */
    /**
     * Sample code: invoicesGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.invoices().getByIdWithResponse("{invoiceName}", com.azure.core.util.Context.NONE);
    }
}
```

### Invoices_GetBySubscriptionAndInvoiceId

```java
/** Samples for Invoices GetBySubscriptionAndInvoiceId. */
public final class InvoicesGetBySubscriptionAndInvoiceIdSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesGetByBillingSubscription.json
     */
    /**
     * Sample code: invoicesGetByBillingSubscription.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesGetByBillingSubscription(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .getBySubscriptionAndInvoiceIdWithResponse(
                "{subscriptionId}", "{invoiceName}", com.azure.core.util.Context.NONE);
    }
}
```

### Invoices_ListByBillingAccount

```java
/** Samples for Invoices ListByBillingAccount. */
public final class InvoicesListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesListByBillingAccount.json
     */
    /**
     * Sample code: invoicesListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .listByBillingAccount("{billingAccountName}", "2018-01-01", "2018-06-30", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesListByBillingAccountWithRebillDetails.json
     */
    /**
     * Sample code: invoicesListByBillingAccountWithRebillDetails.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesListByBillingAccountWithRebillDetails(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .listByBillingAccount("{billingAccountName}", "2018-01-01", "2018-06-30", com.azure.core.util.Context.NONE);
    }
}
```

### Invoices_ListByBillingProfile

```java
/** Samples for Invoices ListByBillingProfile. */
public final class InvoicesListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesListByBillingProfile.json
     */
    /**
     * Sample code: invoicesListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesListByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .listByBillingProfile(
                "{billingAccountName}",
                "{billingProfileName}",
                "2018-01-01",
                "2018-06-30",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesListByBillingProfileWithRebillDetails.json
     */
    /**
     * Sample code: invoicesListByBillingProfileWithRebillDetails.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesListByBillingProfileWithRebillDetails(
        com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .listByBillingProfile(
                "{billingAccountName}",
                "{billingProfileName}",
                "2018-01-01",
                "2018-06-30",
                com.azure.core.util.Context.NONE);
    }
}
```

### Invoices_ListByBillingSubscription

```java
/** Samples for Invoices ListByBillingSubscription. */
public final class InvoicesListByBillingSubscriptionSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/invoicesListByBillingSubscription.json
     */
    /**
     * Sample code: invoicesListByBillingSubscription.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void invoicesListByBillingSubscription(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .invoices()
            .listByBillingSubscription(
                "{subscriptionId}", "2022-01-01", "2022-06-30", com.azure.core.util.Context.NONE);
    }
}
```

### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/operationsGet.json
     */
    /**
     * Sample code: operationsGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void operationsGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### PaymentMethods_DeleteByUser

```java
/** Samples for PaymentMethods DeleteByUser. */
public final class PaymentMethodsDeleteByUserSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/PaymentMethodOwnedByUser_Delete.json
     */
    /**
     * Sample code: DeletePaymentMethodOwnedByUser.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void deletePaymentMethodOwnedByUser(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.paymentMethods().deleteByUserWithResponse("ABCDABCDABC0", com.azure.core.util.Context.NONE);
    }
}
```

### PaymentMethods_GetByBillingAccount

```java
/** Samples for PaymentMethods GetByBillingAccount. */
public final class PaymentMethodsGetByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/PaymentMethodAtBillingAccount_Get.json
     */
    /**
     * Sample code: PaymentMethodGetAtBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void paymentMethodGetAtBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .paymentMethods()
            .getByBillingAccountWithResponse(
                "00000000-0000-0000-0000-000000000032:00000000-0000-0000-0000-000000000099_2019-05-31",
                "21dd9edc-af71-4d62-80ce-37151d475326",
                com.azure.core.util.Context.NONE);
    }
}
```

### PaymentMethods_GetByBillingProfile

```java
/** Samples for PaymentMethods GetByBillingProfile. */
public final class PaymentMethodsGetByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/PaymentMethodAtBillingProfile_Get.json
     */
    /**
     * Sample code: PaymentMethodsGetByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void paymentMethodsGetByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .paymentMethods()
            .getByBillingProfileWithResponse(
                "00000000-0000-0000-0000-000000000032:00000000-0000-0000-0000-000000000099_2019-05-31",
                "ABC1-A1CD-AB1-BP1",
                "ABCDABCDABC0",
                com.azure.core.util.Context.NONE);
    }
}
```

### PaymentMethods_GetByUser

```java
/** Samples for PaymentMethods GetByUser. */
public final class PaymentMethodsGetByUserSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/PaymentMethodOwnedByUser_Get.json
     */
    /**
     * Sample code: GetPaymentMethodOwnedByUser.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void getPaymentMethodOwnedByUser(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.paymentMethods().getByUserWithResponse("ABCDABCDABC0", com.azure.core.util.Context.NONE);
    }
}
```

### PaymentMethods_ListByBillingAccount

```java
/** Samples for PaymentMethods ListByBillingAccount. */
public final class PaymentMethodsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/PaymentMethodAtBillingAccount_List.json
     */
    /**
     * Sample code: PaymentMethodsListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void paymentMethodsListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .paymentMethods()
            .listByBillingAccount(
                "00000000-0000-0000-0000-000000000032:00000000-0000-0000-0000-000000000099_2019-05-31",
                com.azure.core.util.Context.NONE);
    }
}
```

### PaymentMethods_ListByBillingProfile

```java
/** Samples for PaymentMethods ListByBillingProfile. */
public final class PaymentMethodsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/PaymentMethodAtBillingProfile_List.json
     */
    /**
     * Sample code: PaymentMethodsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void paymentMethodsListByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .paymentMethods()
            .listByBillingProfile(
                "00000000-0000-0000-0000-000000000032:00000000-0000-0000-0000-000000000099_2019-05-31",
                "ABC1-A1CD-AB1-BP1",
                com.azure.core.util.Context.NONE);
    }
}
```

### PaymentMethods_ListByUser

```java
/** Samples for PaymentMethods ListByUser. */
public final class PaymentMethodsListByUserSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/PaymentMethodOwnedByUser_List.json
     */
    /**
     * Sample code: ListPaymentMethodOwnedByUser.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void listPaymentMethodOwnedByUser(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.paymentMethods().listByUser(com.azure.core.util.Context.NONE);
    }
}
```

### Policies_GetByBillingProfile

```java
/** Samples for Policies GetByBillingProfile. */
public final class PoliciesGetByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/policiesGetByBillingProfile.json
     */
    /**
     * Sample code: policiesGetByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void policiesGetByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .policies()
            .getByBillingProfileWithResponse(
                "{billingAccountName}", "{billingProfileName}", com.azure.core.util.Context.NONE);
    }
}
```

### Policies_GetByCustomer

```java
/** Samples for Policies GetByCustomer. */
public final class PoliciesGetByCustomerSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/policiesGetByCustomer.json
     */
    /**
     * Sample code: policiesGetByCustomer.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void policiesGetByCustomer(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .policies()
            .getByCustomerWithResponse("{billingAccountName}", "{customerName}", com.azure.core.util.Context.NONE);
    }
}
```

### Policies_Update

```java
import com.azure.resourcemanager.billing.fluent.models.PolicyInner;
import com.azure.resourcemanager.billing.models.MarketplacePurchasesPolicy;
import com.azure.resourcemanager.billing.models.ReservationPurchasesPolicy;
import com.azure.resourcemanager.billing.models.ViewChargesPolicy;

/** Samples for Policies Update. */
public final class PoliciesUpdateSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/policiesPutByBillingProfile.json
     */
    /**
     * Sample code: policiesPutByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void policiesPutByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .policies()
            .updateWithResponse(
                "{billingAccountName}",
                "{billingProfileName}",
                new PolicyInner()
                    .withMarketplacePurchases(MarketplacePurchasesPolicy.ONLY_FREE_ALLOWED)
                    .withReservationPurchases(ReservationPurchasesPolicy.NOT_ALLOWED)
                    .withViewCharges(ViewChargesPolicy.ALLOWED),
                com.azure.core.util.Context.NONE);
    }
}
```

### Policies_UpdateCustomer

```java
import com.azure.resourcemanager.billing.fluent.models.CustomerPolicyInner;
import com.azure.resourcemanager.billing.models.ViewCharges;

/** Samples for Policies UpdateCustomer. */
public final class PoliciesUpdateCustomerSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/policiesPutByCustomer.json
     */
    /**
     * Sample code: policiesPutByCustomer.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void policiesPutByCustomer(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .policies()
            .updateCustomerWithResponse(
                "{billingAccountName}",
                "{customerName}",
                new CustomerPolicyInner().withViewCharges(ViewCharges.NOT_ALLOWED),
                com.azure.core.util.Context.NONE);
    }
}
```

### Products_Get

```java
/** Samples for Products Get. */
public final class ProductsGetSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/productsGet.json
     */
    /**
     * Sample code: productsGet.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsGet(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.products().getWithResponse("{billingAccountName}", "{productName}", com.azure.core.util.Context.NONE);
    }
}
```

### Products_ListByBillingAccount

```java
/** Samples for Products ListByBillingAccount. */
public final class ProductsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/productsListByBillingAccount.json
     */
    /**
     * Sample code: productsListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.products().listByBillingAccount("{billingAccountName}", null, com.azure.core.util.Context.NONE);
    }
}
```

### Products_ListByBillingProfile

```java
/** Samples for Products ListByBillingProfile. */
public final class ProductsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/productsListByBillingProfile.json
     */
    /**
     * Sample code: productsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsListByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .products()
            .listByBillingProfile(
                "{billingAccountName}", "{billingProfileName}", null, com.azure.core.util.Context.NONE);
    }
}
```

### Products_ListByCustomer

```java
/** Samples for Products ListByCustomer. */
public final class ProductsListByCustomerSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/productsListByCustomer.json
     */
    /**
     * Sample code: productsListByCustomer.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsListByCustomer(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.products().listByCustomer("{billingAccountName}", "{customerName}", com.azure.core.util.Context.NONE);
    }
}
```

### Products_ListByInvoiceSection

```java
/** Samples for Products ListByInvoiceSection. */
public final class ProductsListByInvoiceSectionSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/productsListByInvoiceSection.json
     */
    /**
     * Sample code: productsListByInvoiceSection.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsListByInvoiceSection(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .products()
            .listByInvoiceSection(
                "{billingAccountName}",
                "{billingProfileName}",
                "{invoiceSectionName}",
                null,
                com.azure.core.util.Context.NONE);
    }
}
```

### Products_Move

```java
import com.azure.resourcemanager.billing.models.TransferProductRequestProperties;

/** Samples for Products Move. */
public final class ProductsMoveSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/productsMove.json
     */
    /**
     * Sample code: productsMove.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsMove(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .products()
            .moveWithResponse(
                "{billingAccountName}",
                "{productName}",
                new TransferProductRequestProperties()
                    .withDestinationInvoiceSectionId(
                        "/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{newInvoiceSectionName}"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Products_Update

```java
import com.azure.resourcemanager.billing.fluent.models.ProductInner;
import com.azure.resourcemanager.billing.models.AutoRenew;

/** Samples for Products Update. */
public final class ProductsUpdateSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/productsPatch.json
     */
    /**
     * Sample code: productsPatch.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsPatch(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .products()
            .updateWithResponse(
                "{billingAccountName}",
                "{productName}",
                new ProductInner().withAutoRenew(AutoRenew.OFF),
                com.azure.core.util.Context.NONE);
    }
}
```

### Products_ValidateMove

```java
import com.azure.resourcemanager.billing.models.TransferProductRequestProperties;

/** Samples for Products ValidateMove. */
public final class ProductsValidateMoveSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/productsValidateMoveFailure.json
     */
    /**
     * Sample code: productsValidateMoveFailure.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsValidateMoveFailure(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .products()
            .validateMoveWithResponse(
                "{billingAccountName}",
                "{productName}",
                new TransferProductRequestProperties()
                    .withDestinationInvoiceSectionId(
                        "/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{newInvoiceSectionName}"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/productsValidateMoveSuccess.json
     */
    /**
     * Sample code: productsValidateMoveSuccess.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void productsValidateMoveSuccess(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .products()
            .validateMoveWithResponse(
                "{billingAccountName}",
                "{productName}",
                new TransferProductRequestProperties()
                    .withDestinationInvoiceSectionId(
                        "/providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{newInvoiceSectionName}"),
                com.azure.core.util.Context.NONE);
    }
}
```

### Reservations_ListByBillingAccount

```java
/** Samples for Reservations ListByBillingAccount. */
public final class ReservationsListByBillingAccountSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/reservationsListByBillingAccount.json
     */
    /**
     * Sample code: reservationsListByBillingAccount.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void reservationsListByBillingAccount(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .reservations()
            .listByBillingAccount(
                "{billingAccountName}",
                "properties/reservedResourceType eq 'VirtualMachines'",
                "properties/userFriendlyAppliedScopeType asc",
                "true",
                "Succeeded",
                com.azure.core.util.Context.NONE);
    }
}
```

### Reservations_ListByBillingProfile

```java
/** Samples for Reservations ListByBillingProfile. */
public final class ReservationsListByBillingProfileSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/reservationsListByBillingProfile.json
     */
    /**
     * Sample code: reservationsListByBillingProfile.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void reservationsListByBillingProfile(com.azure.resourcemanager.billing.BillingManager manager) {
        manager
            .reservations()
            .listByBillingProfile(
                "{billingAccountName}",
                "{billingProfileName}",
                "properties/reservedResourceType eq 'VirtualMachines'",
                "properties/userFriendlyAppliedScopeType asc",
                "true",
                "Succeeded",
                com.azure.core.util.Context.NONE);
    }
}
```

### Transactions_ListByInvoice

```java
/** Samples for Transactions ListByInvoice. */
public final class TransactionsListByInvoiceSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2023-04-01/examples/transactionsListByInvoice.json
     */
    /**
     * Sample code: transactionsListByInvoice.
     *
     * @param manager Entry point to BillingManager.
     */
    public static void transactionsListByInvoice(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.transactions().listByInvoice("{billingAccountName}", "{invoiceName}", com.azure.core.util.Context.NONE);
    }
}
```

