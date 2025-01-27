# Code snippets and samples


## Approval

- [CreateOrUpdate](#approval_createorupdate)
- [Delete](#approval_delete)
- [Get](#approval_get)
- [InitiatorCallback](#approval_initiatorcallback)
- [ListByParent](#approval_listbyparent)
- [Update](#approval_update)

## Community

- [CheckAddressSpaceAvailability](#community_checkaddressspaceavailability)
- [CreateOrUpdate](#community_createorupdate)
- [Delete](#community_delete)
- [GetByResourceGroup](#community_getbyresourcegroup)
- [List](#community_list)
- [ListByResourceGroup](#community_listbyresourcegroup)
- [Update](#community_update)

## CommunityEndpoints

- [ApprovalCallback](#communityendpoints_approvalcallback)
- [ApprovalDeletionCallback](#communityendpoints_approvaldeletioncallback)
- [CreateOrUpdate](#communityendpoints_createorupdate)
- [Delete](#communityendpoints_delete)
- [Get](#communityendpoints_get)
- [ListByCommunityResource](#communityendpoints_listbycommunityresource)
- [ListBySubscription](#communityendpoints_listbysubscription)
- [Update](#communityendpoints_update)

## EnclaveConnection

- [ApprovalCallback](#enclaveconnection_approvalcallback)
- [ApprovalDeletionCallback](#enclaveconnection_approvaldeletioncallback)
- [CreateOrUpdate](#enclaveconnection_createorupdate)
- [Delete](#enclaveconnection_delete)
- [GetByResourceGroup](#enclaveconnection_getbyresourcegroup)
- [List](#enclaveconnection_list)
- [ListByResourceGroup](#enclaveconnection_listbyresourcegroup)
- [Update](#enclaveconnection_update)

## EnclaveEndpoints

- [ApprovalCallback](#enclaveendpoints_approvalcallback)
- [ApprovalDeletionCallback](#enclaveendpoints_approvaldeletioncallback)
- [CreateOrUpdate](#enclaveendpoints_createorupdate)
- [Delete](#enclaveendpoints_delete)
- [Get](#enclaveendpoints_get)
- [ListByEnclaveResource](#enclaveendpoints_listbyenclaveresource)
- [ListBySubscription](#enclaveendpoints_listbysubscription)
- [Update](#enclaveendpoints_update)

## Endpoint

- [CreateOrUpdate](#endpoint_createorupdate)
- [Delete](#endpoint_delete)
- [Get](#endpoint_get)
- [ListByEnclaveResource](#endpoint_listbyenclaveresource)
- [ListBySubscription](#endpoint_listbysubscription)
- [Update](#endpoint_update)

## ExternalConnections

- [CreateOrUpdate](#externalconnections_createorupdate)
- [Delete](#externalconnections_delete)
- [GetByResourceGroup](#externalconnections_getbyresourcegroup)
- [List](#externalconnections_list)
- [ListByResourceGroup](#externalconnections_listbyresourcegroup)
- [Update](#externalconnections_update)

## InternalConnections

- [CreateOrUpdate](#internalconnections_createorupdate)
- [Delete](#internalconnections_delete)
- [GetByResourceGroup](#internalconnections_getbyresourcegroup)
- [List](#internalconnections_list)
- [ListByResourceGroup](#internalconnections_listbyresourcegroup)
- [Update](#internalconnections_update)

## Operations

- [List](#operations_list)

## TransitHub

- [CreateOrUpdate](#transithub_createorupdate)
- [Delete](#transithub_delete)
- [Get](#transithub_get)
- [ListByCommunityResource](#transithub_listbycommunityresource)
- [ListBySubscription](#transithub_listbysubscription)
- [Update](#transithub_update)

## VirtualEnclave

- [ApprovalCallback](#virtualenclave_approvalcallback)
- [ApprovalDeletionCallback](#virtualenclave_approvaldeletioncallback)
- [CreateOrUpdate](#virtualenclave_createorupdate)
- [Delete](#virtualenclave_delete)
- [GetByResourceGroup](#virtualenclave_getbyresourcegroup)
- [List](#virtualenclave_list)
- [ListByResourceGroup](#virtualenclave_listbyresourcegroup)
- [Update](#virtualenclave_update)

## Workload

- [CreateOrUpdate](#workload_createorupdate)
- [Delete](#workload_delete)
- [Get](#workload_get)
- [ListByEnclaveResource](#workload_listbyenclaveresource)
- [ListBySubscription](#workload_listbysubscription)
- [Update](#workload_update)
### Approval_CreateOrUpdate

```java
import com.azure.resourcemanager.mission.models.ActionPerformed;
import com.azure.resourcemanager.mission.models.ApprovalStatus;
import com.azure.resourcemanager.mission.models.Approvers;
import com.azure.resourcemanager.mission.models.RequestMetadata;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for Approval CreateOrUpdate.
 */
public final class ApprovalCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Approvals_CreateOrUpdate.json
     */
    /**
     * Sample code: Approval_CreateOrUpdate.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void approvalCreateOrUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.approvals()
            .define("TestApprovals")
            .withExistingResourceUri(
                "subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/enclaveconnections/TestMyEnclaveConnection")
            .withParent1("string")
            .withParent2("string")
            .withRequestMetadata(new RequestMetadata().withResourceAction("string")
                .withApprovalStatus(ApprovalStatus.APPROVED)
                .withApprovalCallbackRoute("approvalCallback")
                .withApprovalCallbackPayload("{\n  \"key1\": \"value1\",\n  \"key2\": \"value2\"\n}"))
            .withApprovers(Arrays.asList(new Approvers().withApproverEntraId("string")
                .withActionPerformed(ActionPerformed.APPROVED)
                .withLastUpdatedAt(OffsetDateTime.parse("2023-03-17T20:43:17.760Z"))))
            .withMandatoryApprovers(Arrays.asList(new Approvers().withApproverEntraId("string")
                .withActionPerformed(ActionPerformed.APPROVED)
                .withLastUpdatedAt(OffsetDateTime.parse("2023-03-17T20:43:17.760Z"))))
            .withMinimumApproversRequired(0L)
            .create();
    }
}
```

### Approval_Delete

```java
/**
 * Samples for Approval Delete.
 */
public final class ApprovalDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Approvals_Delete.
     * json
     */
    /**
     * Sample code: Approval_Delete.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void approvalDelete(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.approvals()
            .delete(
                "subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/enclaveconnections/TestMyEnclaveConnection",
                "TestApprovals", com.azure.core.util.Context.NONE);
    }
}
```

### Approval_Get

```java
/**
 * Samples for Approval Get.
 */
public final class ApprovalGetSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Approvals_Get.json
     */
    /**
     * Sample code: Approval_Get.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void approvalGet(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.approvals()
            .getWithResponse(
                "subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/enclaveconnections/TestMyEnclaveConnection",
                "TestApprovals", com.azure.core.util.Context.NONE);
    }
}
```

### Approval_InitiatorCallback

```java
import com.azure.resourcemanager.mission.models.InitiatorCallbackRequest;
import com.azure.resourcemanager.mission.models.InitiatorCallbackRequestApprovalStatus;

/**
 * Samples for Approval InitiatorCallback.
 */
public final class ApprovalInitiatorCallbackSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Approvals_InitiatorCallback.json
     */
    /**
     * Sample code: Approval_InitiatorCallback.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void approvalInitiatorCallback(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.approvals()
            .initiatorCallback(
                "subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/enclaveconnections/TestMyEnclaveConnection",
                "TestApprovals",
                new InitiatorCallbackRequest().withApprovalStatus(InitiatorCallbackRequestApprovalStatus.APPROVED),
                com.azure.core.util.Context.NONE);
    }
}
```

### Approval_ListByParent

```java
/**
 * Samples for Approval ListByParent.
 */
public final class ApprovalListByParentSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Approvals_ListByParent.json
     */
    /**
     * Sample code: Approval_ListByParent.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void approvalListByParent(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.approvals()
            .listByParent(
                "subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/enclaveconnections/TestMyEnclaveConnection",
                com.azure.core.util.Context.NONE);
    }
}
```

### Approval_Update

```java
import com.azure.resourcemanager.mission.models.ActionPerformed;
import com.azure.resourcemanager.mission.models.ApprovalResource;
import com.azure.resourcemanager.mission.models.ApprovalStatus;
import com.azure.resourcemanager.mission.models.Approvers;
import com.azure.resourcemanager.mission.models.RequestMetadataUpdate;
import java.time.OffsetDateTime;
import java.util.Arrays;

/**
 * Samples for Approval Update.
 */
public final class ApprovalUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Approvals_Update.
     * json
     */
    /**
     * Sample code: Approval_Update.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void approvalUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        ApprovalResource resource = manager.approvals()
            .getWithResponse(
                "subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/enclaveconnections/TestMyEnclaveConnection",
                "TestApprovals", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withParent1("string")
            .withParent2("string")
            .withRequestMetadata(new RequestMetadataUpdate().withResourceAction("string")
                .withApprovalStatus(ApprovalStatus.APPROVED)
                .withApprovalCallbackRoute("approvalCallback")
                .withApprovalCallbackPayload("{\n  \"key1\": \"value1\",\n  \"key2\": \"value2\"\n}"))
            .withApprovers(Arrays.asList(new Approvers().withApproverEntraId("string")
                .withActionPerformed(ActionPerformed.APPROVED)
                .withLastUpdatedAt(OffsetDateTime.parse("2023-03-17T20:43:17.760Z"))))
            .withMandatoryApprovers(Arrays.asList(new Approvers().withApproverEntraId("string")
                .withActionPerformed(ActionPerformed.APPROVED)
                .withLastUpdatedAt(OffsetDateTime.parse("2023-03-17T20:43:17.760Z"))))
            .withMinimumApproversRequired(0L)
            .apply();
    }
}
```

### Community_CheckAddressSpaceAvailability

```java
import com.azure.resourcemanager.mission.models.CheckAddressSpaceAvailabilityRequest;
import com.azure.resourcemanager.mission.models.EnclaveVirtualNetwork;
import com.azure.resourcemanager.mission.models.SubnetConfiguration;
import java.util.Arrays;

/**
 * Samples for Community CheckAddressSpaceAvailability.
 */
public final class CommunityCheckAddressSpaceAvailabilitySamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Community_PostCheckAddressSpaceAvailability.json
     */
    /**
     * Sample code: Community_CheckAddressSpaceAvailability.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void
        communityCheckAddressSpaceAvailability(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communities()
            .checkAddressSpaceAvailabilityWithResponse("rgopenapi", "TestMyCommunity",
                new CheckAddressSpaceAvailabilityRequest().withCommunityResourceId(
                    "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/communities/TestMyCommunity")
                    .withEnclaveVirtualNetwork(new EnclaveVirtualNetwork().withNetworkSize("small")
                        .withCustomCidrRange("10.0.0.0/24")
                        .withSubnetConfigurations(
                            Arrays.asList(new SubnetConfiguration().withName("test").withNetworkPrefixSize(26)))
                        .withAllowSubnetCommunication(true)
                        .withConnectToAzureServices(true)),
                com.azure.core.util.Context.NONE);
    }
}
```

### Community_CreateOrUpdate

```java
import com.azure.resourcemanager.mission.models.ApprovalPolicy;
import com.azure.resourcemanager.mission.models.ApprovalSettings;
import com.azure.resourcemanager.mission.models.ApprovalSettingsConnectionUpdateMode;
import com.azure.resourcemanager.mission.models.GovernedServiceItem;
import com.azure.resourcemanager.mission.models.GovernedServiceItemEnforcement;
import com.azure.resourcemanager.mission.models.GovernedServiceItemOption;
import com.azure.resourcemanager.mission.models.MaintenanceModeConfiguration;
import com.azure.resourcemanager.mission.models.MaintenanceModeConfigurationJustification;
import com.azure.resourcemanager.mission.models.MaintenanceModeConfigurationMode;
import com.azure.resourcemanager.mission.models.ManagedServiceIdentity;
import com.azure.resourcemanager.mission.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.mission.models.Principal;
import com.azure.resourcemanager.mission.models.PrincipalType;
import com.azure.resourcemanager.mission.models.RoleAssignmentItem;
import com.azure.resourcemanager.mission.models.ServiceIdentifier;
import com.azure.resourcemanager.mission.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Community CreateOrUpdate.
 */
public final class CommunityCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Community_CreateOrUpdate.json
     */
    /**
     * Sample code: Community_CreateOrUpdate.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityCreateOrUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communities()
            .define("TestMyCommunity")
            .withRegion("westcentralus")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf("sampletag", "samplevalue"))
            .withIdentity(new ManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/subid/resourceGroups/default-azurebatch-japaneast/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id1",
                    new UserAssignedIdentity())))
            .withAddressSpace("10.0.0.0/24")
            .withDnsServers(Arrays.asList("azure.net"))
            .withResourceCollection(Arrays.asList("resCollection"))
            .withGovernedServiceList(Arrays.asList(
                new GovernedServiceItem().withId(ServiceIdentifier.AKS)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.APP_SERVICE)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.CONTAINER_REGISTRY)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.COSMOS_DB)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.KEY_VAULT)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.MICROSOFT_SQL)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.MONITORING)
                    .withOption(GovernedServiceItemOption.fromString("Not Applicable"))
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.POSTGRE_SQL)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.SERVICE_BUS)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.STORAGE)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.AZURE_FIREWALLS)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.INSIGHTS)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.LOGIC)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.PRIVATE_DNSZONES)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.DATA_CONNECTORS)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false)))
            .withCommunityRoleAssignments(Arrays.asList(
                new RoleAssignmentItem().withId("b24988ac-6180-42a0-ab88-20f7382dd24c")
                    .withPrincipals(Arrays.asList(
                        new Principal().withId("01234567-89ab-ef01-2345-0123456789ab").withType(PrincipalType.GROUP),
                        new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c0").withType(PrincipalType.USER))),
                new RoleAssignmentItem().withId("18d7d88d-d35e-4fb5-a5c3-7773c20a72d9")
                    .withPrincipals(Arrays.asList(
                        new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c9").withType(PrincipalType.USER)))))
            .withApprovalSettings(new ApprovalSettings().withEndpointCreation(ApprovalPolicy.NOT_REQUIRED)
                .withEndpointUpdate(ApprovalPolicy.REQUIRED)
                .withEndpointDeletion(ApprovalPolicy.NOT_REQUIRED)
                .withConnectionCreation(ApprovalPolicy.REQUIRED)
                .withConnectionUpdate(ApprovalPolicy.REQUIRED)
                .withConnectionUpdateMode(ApprovalSettingsConnectionUpdateMode.MANUAL)
                .withConnectionDeletion(ApprovalPolicy.NOT_REQUIRED)
                .withEnclaveCreation(ApprovalPolicy.NOT_REQUIRED)
                .withEnclaveDeletion(ApprovalPolicy.NOT_REQUIRED)
                .withMaintenanceMode(ApprovalPolicy.NOT_REQUIRED)
                .withServiceCatalogDeployment(ApprovalPolicy.NOT_REQUIRED))
            .withMaintenanceModeConfiguration(
                new MaintenanceModeConfiguration().withMode(MaintenanceModeConfigurationMode.OFF)
                    .withPrincipals(Arrays.asList(
                        new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c9").withType(PrincipalType.USER)))
                    .withJustification(MaintenanceModeConfigurationJustification.OFF))
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

### Community_Delete

```java
/**
 * Samples for Community Delete.
 */
public final class CommunityDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Community_Delete.
     * json
     */
    /**
     * Sample code: Community_Delete.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityDelete(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communities().delete("rgopenapi", "TestMyCommunity", com.azure.core.util.Context.NONE);
    }
}
```

### Community_GetByResourceGroup

```java
/**
 * Samples for Community GetByResourceGroup.
 */
public final class CommunityGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Community_Get.json
     */
    /**
     * Sample code: Community_Get.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityGet(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communities()
            .getByResourceGroupWithResponse("rgopenapi", "TestMyCommunity", com.azure.core.util.Context.NONE);
    }
}
```

### Community_List

```java
/**
 * Samples for Community List.
 */
public final class CommunityListSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Community_ListBySubscription.json
     */
    /**
     * Sample code: Community_ListBySubscription.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityListBySubscription(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communities().list(com.azure.core.util.Context.NONE);
    }
}
```

### Community_ListByResourceGroup

```java
/**
 * Samples for Community ListByResourceGroup.
 */
public final class CommunityListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Community_ListByResourceGroup.json
     */
    /**
     * Sample code: Community_ListByResourceGroup.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityListByResourceGroup(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communities().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### Community_Update

```java
import com.azure.resourcemanager.mission.models.CommunityResource;
import com.azure.resourcemanager.mission.models.GovernedServiceItem;
import com.azure.resourcemanager.mission.models.GovernedServiceItemEnforcement;
import com.azure.resourcemanager.mission.models.GovernedServiceItemOption;
import com.azure.resourcemanager.mission.models.Principal;
import com.azure.resourcemanager.mission.models.PrincipalType;
import com.azure.resourcemanager.mission.models.RoleAssignmentItem;
import com.azure.resourcemanager.mission.models.ServiceIdentifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Community Update.
 */
public final class CommunityUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Community_Update.
     * json
     */
    /**
     * Sample code: Community_Update.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        CommunityResource resource = manager.communities()
            .getByResourceGroupWithResponse("rgopenapi", "TestMyCommunity", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("sampletag", "samplevalue"))
            .withAddressSpace("10.0.0.0/24")
            .withDnsServers(Arrays.asList("azure.net"))
            .withResourceCollection(Arrays.asList("resCollection"))
            .withGovernedServiceList(Arrays.asList(
                new GovernedServiceItem().withId(ServiceIdentifier.AKS)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.APP_SERVICE)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.CONTAINER_REGISTRY)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.COSMOS_DB)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.KEY_VAULT)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.MICROSOFT_SQL)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.MONITORING)
                    .withOption(GovernedServiceItemOption.fromString("Not Applicable"))
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.POSTGRE_SQL)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.SERVICE_BUS)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.STORAGE)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.AZURE_FIREWALLS)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.INSIGHTS)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.LOGIC)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.PRIVATE_DNSZONES)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false),
                new GovernedServiceItem().withId(ServiceIdentifier.DATA_CONNECTORS)
                    .withOption(GovernedServiceItemOption.ALLOW)
                    .withEnforcement(GovernedServiceItemEnforcement.ENABLED)
                    .withAuditOnly(false)))
            .withCommunityRoleAssignments(Arrays.asList(
                new RoleAssignmentItem().withId("b24988ac-6180-42a0-ab88-20f7382dd24c")
                    .withPrincipals(Arrays.asList(
                        new Principal().withId("01234567-89ab-ef01-2345-0123456789ab").withType(PrincipalType.GROUP),
                        new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c0").withType(PrincipalType.USER))),
                new RoleAssignmentItem().withId("18d7d88d-d35e-4fb5-a5c3-7773c20a72d9")
                    .withPrincipals(Arrays.asList(
                        new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c9").withType(PrincipalType.USER)))))
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

### CommunityEndpoints_ApprovalCallback

```java
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequest;
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequestApprovalStatus;
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequestResourceRequestAction;

/**
 * Samples for CommunityEndpoints ApprovalCallback.
 */
public final class CommunityEndpointsApprovalCallbackSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * CommunityEndpoints_PostApprovalCallback.json
     */
    /**
     * Sample code: CommunityEndpoints_ApprovalCallback.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityEndpointsApprovalCallback(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communityEndpoints()
            .approvalCallback("rgopenapi", "TestMyCommunity", "TestMyCommunityEndpoint",
                new ApprovalCallbackRequest()
                    .withResourceRequestAction(ApprovalCallbackRequestResourceRequestAction.CREATE)
                    .withApprovalStatus(ApprovalCallbackRequestApprovalStatus.APPROVED),
                com.azure.core.util.Context.NONE);
    }
}
```

### CommunityEndpoints_ApprovalDeletionCallback

```java
import com.azure.resourcemanager.mission.models.ApprovalDeletionCallbackRequest;
import com.azure.resourcemanager.mission.models.ApprovalDeletionCallbackRequestResourceRequestAction;

/**
 * Samples for CommunityEndpoints ApprovalDeletionCallback.
 */
public final class CommunityEndpointsApprovalDeletionCallbackSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * CommunityEndpoints_ApprovalDeletionCallback.json
     */
    /**
     * Sample code: CommunityEndpoints_ApprovalDeletionCallback.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void
        communityEndpointsApprovalDeletionCallback(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communityEndpoints()
            .approvalDeletionCallback(
                "rgopenapi", "TestMyCommunity", "TestMyCommunityEndpoint", new ApprovalDeletionCallbackRequest()
                    .withResourceRequestAction(ApprovalDeletionCallbackRequestResourceRequestAction.CREATE),
                com.azure.core.util.Context.NONE);
    }
}
```

### CommunityEndpoints_CreateOrUpdate

```java
import com.azure.resourcemanager.mission.models.CommunityEndpointDestinationRule;
import com.azure.resourcemanager.mission.models.CommunityEndpointProtocol;
import com.azure.resourcemanager.mission.models.DestinationType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for CommunityEndpoints CreateOrUpdate.
 */
public final class CommunityEndpointsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * CommunityEndpoints_CreateOrUpdate.json
     */
    /**
     * Sample code: CommunityEndpoints_CreateOrUpdate.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityEndpointsCreateOrUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communityEndpoints()
            .define("TestMyCommunityEndpoint")
            .withRegion("West US")
            .withExistingCommunity("rgopenapi", "TestMyCommunity")
            .withTags(mapOf("sampletag", "samplevalue"))
            .withRuleCollection(Arrays.asList(new CommunityEndpointDestinationRule().withDestination("foo.example.com")
                .withPort("443")
                .withDestinationType(DestinationType.FQDNTAG)
                .withProtocols(Arrays.asList(CommunityEndpointProtocol.TCP))
                .withTransitHubResourceId(
                    "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/testrg/providers/Microsoft.Mission/communities/TestMyCommunity/transitHubs/TestThName")))
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

### CommunityEndpoints_Delete

```java
/**
 * Samples for CommunityEndpoints Delete.
 */
public final class CommunityEndpointsDeleteSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * CommunityEndpoints_Delete.json
     */
    /**
     * Sample code: CommunityEndpoints_Delete.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityEndpointsDelete(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communityEndpoints()
            .delete("rgopenapi", "TestMyCommunity", "TestMyCommunityEndpoint", com.azure.core.util.Context.NONE);
    }
}
```

### CommunityEndpoints_Get

```java
/**
 * Samples for CommunityEndpoints Get.
 */
public final class CommunityEndpointsGetSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * CommunityEndpoints_Get.json
     */
    /**
     * Sample code: CommunityEndpoints_Get.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityEndpointsGet(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communityEndpoints()
            .getWithResponse("rgopenapi", "TestMyCommunity", "TestMyCommunityEndpoint",
                com.azure.core.util.Context.NONE);
    }
}
```

### CommunityEndpoints_ListByCommunityResource

```java
/**
 * Samples for CommunityEndpoints ListByCommunityResource.
 */
public final class CommunityEndpointsListByCommunityResourceSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * CommunityEndpoints_ListByCommunityResource.json
     */
    /**
     * Sample code: CommunityEndpoints_ListByCommunityResource.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void
        communityEndpointsListByCommunityResource(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communityEndpoints()
            .listByCommunityResource("rgopenapi", "TestMyCommunity", com.azure.core.util.Context.NONE);
    }
}
```

### CommunityEndpoints_ListBySubscription

```java
/**
 * Samples for CommunityEndpoints ListBySubscription.
 */
public final class CommunityEndpointsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * CommunityEndpoints_ListBySubscription.json
     */
    /**
     * Sample code: CommunityEndpoints_ListBySubscription.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityEndpointsListBySubscription(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.communityEndpoints().listBySubscription("TestMyCommunity", com.azure.core.util.Context.NONE);
    }
}
```

### CommunityEndpoints_Update

```java
import com.azure.resourcemanager.mission.models.CommunityEndpointDestinationRule;
import com.azure.resourcemanager.mission.models.CommunityEndpointProtocol;
import com.azure.resourcemanager.mission.models.CommunityEndpointResource;
import com.azure.resourcemanager.mission.models.DestinationType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for CommunityEndpoints Update.
 */
public final class CommunityEndpointsUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * CommunityEndpoints_Update.json
     */
    /**
     * Sample code: CommunityEndpoints_Update.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void communityEndpointsUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        CommunityEndpointResource resource = manager.communityEndpoints()
            .getWithResponse("rgopenapi", "TestMyCommunity", "TestMyCommunityEndpoint",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("sampletag", "samplevalue"))
            .withRuleCollection(Arrays.asList(new CommunityEndpointDestinationRule().withDestination("foo.example.com")
                .withPort("443")
                .withDestinationType(DestinationType.FQDN)
                .withProtocols(Arrays.asList(CommunityEndpointProtocol.TCP))
                .withTransitHubResourceId(
                    "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/testrg/providers/Microsoft.Mission/communities/TestMyCommunity/transitHubs/TestThName")))
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

### EnclaveConnection_ApprovalCallback

```java
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequest;
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequestApprovalStatus;
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequestResourceRequestAction;

/**
 * Samples for EnclaveConnection ApprovalCallback.
 */
public final class EnclaveConnectionApprovalCallbackSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveConnection_PostApprovalCallback.json
     */
    /**
     * Sample code: EnclaveConnection_ApprovalCallback.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveConnectionApprovalCallback(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveConnections()
            .approvalCallback("rgopenapi", "TestMyEnclaveConnection",
                new ApprovalCallbackRequest()
                    .withResourceRequestAction(ApprovalCallbackRequestResourceRequestAction.CREATE)
                    .withApprovalStatus(ApprovalCallbackRequestApprovalStatus.APPROVED)
                    .withApprovalCallbackPayload("{\n  \"key1\": \"value1\",\n  \"key2\": \"value2\"\n}"),
                com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveConnection_ApprovalDeletionCallback

```java
import com.azure.resourcemanager.mission.models.ApprovalDeletionCallbackRequest;
import com.azure.resourcemanager.mission.models.ApprovalDeletionCallbackRequestResourceRequestAction;

/**
 * Samples for EnclaveConnection ApprovalDeletionCallback.
 */
public final class EnclaveConnectionApprovalDeletionCallbackSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveConnection_ApprovalDeletionCallback.json
     */
    /**
     * Sample code: EnclaveConnection_ApprovalDeletionCallback.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void
        enclaveConnectionApprovalDeletionCallback(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveConnections()
            .approvalDeletionCallback("rgopenapi", "TestMyEnclaveConnection", new ApprovalDeletionCallbackRequest()
                .withResourceRequestAction(ApprovalDeletionCallbackRequestResourceRequestAction.CREATE),
                com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveConnection_CreateOrUpdate

```java
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for EnclaveConnection CreateOrUpdate.
 */
public final class EnclaveConnectionCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveConnection_CreateOrUpdate.json
     */
    /**
     * Sample code: EnclaveConnection_CreateOrUpdate.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveConnectionCreateOrUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveConnections()
            .define("TestMyEnclaveConnection")
            .withRegion("West US")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf("sampletag", "samplevalue"))
            .withCommunityResourceId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/testrg/providers/Microsoft.Mission/communities/TestMyCommunity")
            .withSourceResourceId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/microsoft.mission/virtualenclaves/TestMyEnclave")
            .withSourceCidr("10.0.0.0/24")
            .withDestinationEndpointId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualenclaves/TestMyEnclave/enclaveendpoints/TestMyEnclaveEndpoint")
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

### EnclaveConnection_Delete

```java
/**
 * Samples for EnclaveConnection Delete.
 */
public final class EnclaveConnectionDeleteSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveConnection_Delete.json
     */
    /**
     * Sample code: EnclaveConnection_Delete.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveConnectionDelete(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveConnections().delete("rgopenapi", "TestMyEnclaveConnection", com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveConnection_GetByResourceGroup

```java
/**
 * Samples for EnclaveConnection GetByResourceGroup.
 */
public final class EnclaveConnectionGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveConnection_Get.json
     */
    /**
     * Sample code: EnclaveConnection_Get.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveConnectionGet(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveConnections()
            .getByResourceGroupWithResponse("rgopenapi", "TestMyEnclaveConnection", com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveConnection_List

```java
/**
 * Samples for EnclaveConnection List.
 */
public final class EnclaveConnectionListSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveConnection_ListBySubscription.json
     */
    /**
     * Sample code: EnclaveConnection_ListBySubscription.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveConnectionListBySubscription(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveConnections().list(com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveConnection_ListByResourceGroup

```java
/**
 * Samples for EnclaveConnection ListByResourceGroup.
 */
public final class EnclaveConnectionListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveConnection_ListByResourceGroup.json
     */
    /**
     * Sample code: EnclaveConnection_ListByResourceGroup.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveConnectionListByResourceGroup(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveConnections().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveConnection_Update

```java
import com.azure.resourcemanager.mission.models.EnclaveConnectionResource;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for EnclaveConnection Update.
 */
public final class EnclaveConnectionUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveConnection_Update.json
     */
    /**
     * Sample code: EnclaveConnection_Update.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveConnectionUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        EnclaveConnectionResource resource = manager.enclaveConnections()
            .getByResourceGroupWithResponse("rgopenapi", "TestMyEnclaveConnection", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("sampletag", "samplevalue"))
            .withCommunityResourceId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/testrg/providers/Microsoft.Mission/communities/TestMyCommunity")
            .withSourceResourceId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/microsoft.mission/virtualenclaves/TestMyEnclave")
            .withSourceCidr("10.0.0.0/24")
            .withDestinationEndpointId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualenclaves/TestMyEnclave/enclaveendpoints/TestMyEnclaveEndpoint")
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

### EnclaveEndpoints_ApprovalCallback

```java
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequest;
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequestApprovalStatus;
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequestResourceRequestAction;

/**
 * Samples for EnclaveEndpoints ApprovalCallback.
 */
public final class EnclaveEndpointsApprovalCallbackSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveEndpoints_PostApprovalCallback.json
     */
    /**
     * Sample code: EnclaveEndpoints_ApprovalCallback.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveEndpointsApprovalCallback(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveEndpoints()
            .approvalCallback("rgopenapi", "TestMyEnclave", "TestMyEnclaveEndpoint",
                new ApprovalCallbackRequest()
                    .withResourceRequestAction(ApprovalCallbackRequestResourceRequestAction.CREATE)
                    .withApprovalStatus(ApprovalCallbackRequestApprovalStatus.APPROVED),
                com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveEndpoints_ApprovalDeletionCallback

```java
import com.azure.resourcemanager.mission.models.ApprovalDeletionCallbackRequest;
import com.azure.resourcemanager.mission.models.ApprovalDeletionCallbackRequestResourceRequestAction;

/**
 * Samples for EnclaveEndpoints ApprovalDeletionCallback.
 */
public final class EnclaveEndpointsApprovalDeletionCallbackSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveEndpoints_ApprovalDeletionCallback.json
     */
    /**
     * Sample code: EnclaveEndpoints_ApprovalDeletionCallback.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void
        enclaveEndpointsApprovalDeletionCallback(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveEndpoints()
            .approvalDeletionCallback(
                "rgopenapi", "TestMyEnclave", "TestMyEnclaveEndpoint", new ApprovalDeletionCallbackRequest()
                    .withResourceRequestAction(ApprovalDeletionCallbackRequestResourceRequestAction.CREATE),
                com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveEndpoints_CreateOrUpdate

```java
import com.azure.resourcemanager.mission.models.EnclaveEndpointDestinationRule;
import com.azure.resourcemanager.mission.models.EnclaveEndpointProtocol;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for EnclaveEndpoints CreateOrUpdate.
 */
public final class EnclaveEndpointsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveEndpoints_CreateOrUpdate.json
     */
    /**
     * Sample code: EnclaveEndpoints_CreateOrUpdate.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveEndpointsCreateOrUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveEndpoints()
            .define("TestMyEnclaveEndpoint")
            .withRegion("West US")
            .withExistingVirtualEnclave("rgopenapi", "TestMyEnclave")
            .withTags(mapOf("sampletag", "samplevalue"))
            .withRuleCollection(
                Arrays.asList(new EnclaveEndpointDestinationRule().withName("54CEECEF-2C30-488E-946F-D20F414D99BA")
                    .withDestination("10.0.0.0/24")
                    .withPort("443")
                    .withProtocols(Arrays.asList(EnclaveEndpointProtocol.TCP))))
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

### EnclaveEndpoints_Delete

```java
/**
 * Samples for EnclaveEndpoints Delete.
 */
public final class EnclaveEndpointsDeleteSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveEndpoints_Delete.json
     */
    /**
     * Sample code: EnclaveEndpoints_Delete.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveEndpointsDelete(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveEndpoints()
            .delete("rgopenapi", "TestMyEnclave", "TestMyEnclaveEndpoint", com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveEndpoints_Get

```java
/**
 * Samples for EnclaveEndpoints Get.
 */
public final class EnclaveEndpointsGetSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/EnclaveEndpoints_Get
     * .json
     */
    /**
     * Sample code: EnclaveEndpoints_Get.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveEndpointsGet(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveEndpoints()
            .getWithResponse("rgopenapi", "TestMyEnclave", "TestMyEnclaveEndpoint", com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveEndpoints_ListByEnclaveResource

```java
/**
 * Samples for EnclaveEndpoints ListByEnclaveResource.
 */
public final class EnclaveEndpointsListByEnclaveResourceSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveEndpoints_ListByEnclaveResource.json
     */
    /**
     * Sample code: EnclaveEndpoints_ListByEnclaveResource.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveEndpointsListByEnclaveResource(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveEndpoints()
            .listByEnclaveResource("rgopenapi", "TestMyEnclave", com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveEndpoints_ListBySubscription

```java
/**
 * Samples for EnclaveEndpoints ListBySubscription.
 */
public final class EnclaveEndpointsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveEndpoints_ListBySubscription.json
     */
    /**
     * Sample code: EnclaveEndpoints_ListBySubscription.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveEndpointsListBySubscription(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.enclaveEndpoints().listBySubscription("TestMyEnclave", com.azure.core.util.Context.NONE);
    }
}
```

### EnclaveEndpoints_Update

```java
import com.azure.resourcemanager.mission.models.EnclaveEndpointDestinationRule;
import com.azure.resourcemanager.mission.models.EnclaveEndpointProtocol;
import com.azure.resourcemanager.mission.models.EnclaveEndpointResource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for EnclaveEndpoints Update.
 */
public final class EnclaveEndpointsUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * EnclaveEndpoints_Update.json
     */
    /**
     * Sample code: EnclaveEndpoints_Update.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void enclaveEndpointsUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        EnclaveEndpointResource resource = manager.enclaveEndpoints()
            .getWithResponse("rgopenapi", "TestMyEnclave", "TestMyEnclaveEndpoint", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("sampletag", "samplevalue"))
            .withRuleCollection(
                Arrays.asList(new EnclaveEndpointDestinationRule().withName("54CEECEF-2C30-488E-946F-D20F414D99BA")
                    .withDestination("10.0.0.0/24")
                    .withPort("443")
                    .withProtocols(Arrays.asList(EnclaveEndpointProtocol.TCP))))
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

### Endpoint_CreateOrUpdate

```java
import com.azure.resourcemanager.mission.models.EndpointProtocol;
import com.azure.resourcemanager.mission.models.EndpointRule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Endpoint CreateOrUpdate.
 */
public final class EndpointCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Endpoint_CreateOrUpdate.json
     */
    /**
     * Sample code: Endpoint_CreateOrUpdate.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void endpointCreateOrUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.endpoints()
            .define("TestMyEndpoint")
            .withRegion("West US")
            .withExistingVirtualEnclave("rgopenapi", "TestMyEnclave")
            .withTags(mapOf("sampletag", "samplevalue"))
            .withEndpointRuleCollection(Arrays.asList(new EndpointRule().withName("MyTestEndpointRule")
                .withAddress("10.0.0.0/24")
                .withPort("443")
                .withProtocol(EndpointProtocol.TCP)))
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

### Endpoint_Delete

```java
/**
 * Samples for Endpoint Delete.
 */
public final class EndpointDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Endpoint_Delete.json
     */
    /**
     * Sample code: Endpoint_Delete.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void endpointDelete(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.endpoints().delete("rgopenapi", "TestMyEnclave", "TestMyEndpoint", com.azure.core.util.Context.NONE);
    }
}
```

### Endpoint_Get

```java
/**
 * Samples for Endpoint Get.
 */
public final class EndpointGetSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Endpoint_Get.json
     */
    /**
     * Sample code: Endpoint_Get.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void endpointGet(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.endpoints()
            .getWithResponse("rgopenapi", "TestMyEnclave", "TestMyEndpoint", com.azure.core.util.Context.NONE);
    }
}
```

### Endpoint_ListByEnclaveResource

```java
/**
 * Samples for Endpoint ListByEnclaveResource.
 */
public final class EndpointListByEnclaveResourceSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Endpoint_ListByEnclaveResource.json
     */
    /**
     * Sample code: Endpoint_ListByEnclaveResource.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void endpointListByEnclaveResource(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.endpoints().listByEnclaveResource("rgopenapi", "TestMyEnclave", com.azure.core.util.Context.NONE);
    }
}
```

### Endpoint_ListBySubscription

```java
/**
 * Samples for Endpoint ListBySubscription.
 */
public final class EndpointListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Endpoint_ListBySubscription.json
     */
    /**
     * Sample code: Endpoint_ListBySubscription.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void endpointListBySubscription(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.endpoints().listBySubscription("TestMyEnclave", com.azure.core.util.Context.NONE);
    }
}
```

### Endpoint_Update

```java
import com.azure.resourcemanager.mission.models.EndpointProtocol;
import com.azure.resourcemanager.mission.models.EndpointResource;
import com.azure.resourcemanager.mission.models.EndpointRule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Endpoint Update.
 */
public final class EndpointUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Endpoint_Update.json
     */
    /**
     * Sample code: Endpoint_Update.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void endpointUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        EndpointResource resource = manager.endpoints()
            .getWithResponse("rgopenapi", "TestMyEnclave", "TestMyEndpoint", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("sampletag", "samplevalue"))
            .withEndpointRuleCollection(Arrays.asList(new EndpointRule().withName("MyTestEndpointRule")
                .withAddress("10.0.0.0/24")
                .withPort("443")
                .withProtocol(EndpointProtocol.TCP)))
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

### ExternalConnections_CreateOrUpdate

```java
import com.azure.resourcemanager.mission.models.ExternalConnectionState;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ExternalConnections CreateOrUpdate.
 */
public final class ExternalConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * ExternalConnections_CreateOrUpdate.json
     */
    /**
     * Sample code: ExternalConnections_CreateOrUpdate.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void externalConnectionsCreateOrUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.externalConnections()
            .define("TestEcName")
            .withRegion("westcentralus")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf("Tag1", "Value1"))
            .withState(ExternalConnectionState.PENDING)
            .withCommunityResourceId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/microsoft.mission/communities/TestMyCommunity")
            .withEnclaveIds(Arrays.asList(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualEnclaves/TestSrcMyEnclave",
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualEnclaves/TestDestMyEnclave"))
            .withExternalCidrs(Arrays.asList("192.168.0.1/24"))
            .withResourceCollection(Arrays.asList("resCollection"))
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

### ExternalConnections_Delete

```java
/**
 * Samples for ExternalConnections Delete.
 */
public final class ExternalConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * ExternalConnections_Delete.json
     */
    /**
     * Sample code: ExternalConnections_Delete.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void externalConnectionsDelete(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.externalConnections().delete("rgopenapi", "TestEcName", com.azure.core.util.Context.NONE);
    }
}
```

### ExternalConnections_GetByResourceGroup

```java
/**
 * Samples for ExternalConnections GetByResourceGroup.
 */
public final class ExternalConnectionsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * ExternalConnections_Get.json
     */
    /**
     * Sample code: ExternalConnections_Get.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void externalConnectionsGet(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.externalConnections()
            .getByResourceGroupWithResponse("rgopenapi", "TestEcName", com.azure.core.util.Context.NONE);
    }
}
```

### ExternalConnections_List

```java
/**
 * Samples for ExternalConnections List.
 */
public final class ExternalConnectionsListSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * ExternalConnections_ListBySubscription.json
     */
    /**
     * Sample code: ExternalConnections_ListBySubscription.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void externalConnectionsListBySubscription(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.externalConnections().list(com.azure.core.util.Context.NONE);
    }
}
```

### ExternalConnections_ListByResourceGroup

```java
/**
 * Samples for ExternalConnections ListByResourceGroup.
 */
public final class ExternalConnectionsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * ExternalConnections_ListByResourceGroup.json
     */
    /**
     * Sample code: ExternalConnections_ListByResourceGroup.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void
        externalConnectionsListByResourceGroup(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.externalConnections().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### ExternalConnections_Update

```java
import com.azure.resourcemanager.mission.models.ExternalConnection;
import com.azure.resourcemanager.mission.models.ExternalConnectionState;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ExternalConnections Update.
 */
public final class ExternalConnectionsUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * ExternalConnections_Update.json
     */
    /**
     * Sample code: ExternalConnections_Update.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void externalConnectionsUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        ExternalConnection resource = manager.externalConnections()
            .getByResourceGroupWithResponse("rgopenapi", "TestEcName", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key4278", "fakeTokenPlaceholder"))
            .withState(ExternalConnectionState.PENDING)
            .withCommunityResourceId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/microsoft.mission/communities/TestMyCommunity")
            .withEnclaveIds(Arrays.asList(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualEnclaves/TestSrcMyEnclave",
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualEnclaves/TestDestMyEnclave"))
            .withExternalCidrs(Arrays.asList("192.168.0.1/24"))
            .withResourceCollection(Arrays.asList("resCollection"))
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

### InternalConnections_CreateOrUpdate

```java
import com.azure.resourcemanager.mission.models.InternalConnectionState;
import com.azure.resourcemanager.mission.models.InternalConnectionType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for InternalConnections CreateOrUpdate.
 */
public final class InternalConnectionsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * InternalConnections_CreateOrUpdate.json
     */
    /**
     * Sample code: InternalConnections_CreateOrUpdate.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void internalConnectionsCreateOrUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.internalConnections()
            .define("TestIcName")
            .withRegion("westcentralus")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf("Tag1", "Value1"))
            .withConnectionType(InternalConnectionType.PRIVATE_LINK)
            .withState(InternalConnectionState.PENDING_APPROVAL)
            .withCommunityResourceId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/microsoft.mission/communities/TestMyCommunity")
            .withDestinationEnclaveId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualEnclaves/TestDestMyEnclave")
            .withDestinationEndpointId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualEnclaves/TestSrcMyEnclave/endpoints/TestMyDestEndpoint")
            .withSourceEnclaveId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualEnclaves/TestSrcMyEnclave")
            .withSourceCidrs(Arrays.asList("192.168.0.1/24"))
            .withResourceCollection(Arrays.asList("resCollection"))
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

### InternalConnections_Delete

```java
/**
 * Samples for InternalConnections Delete.
 */
public final class InternalConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * InternalConnections_Delete.json
     */
    /**
     * Sample code: InternalConnections_Delete.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void internalConnectionsDelete(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.internalConnections().delete("rgopenapi", "TestIcName", com.azure.core.util.Context.NONE);
    }
}
```

### InternalConnections_GetByResourceGroup

```java
/**
 * Samples for InternalConnections GetByResourceGroup.
 */
public final class InternalConnectionsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * InternalConnections_Get.json
     */
    /**
     * Sample code: InternalConnections_Get.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void internalConnectionsGet(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.internalConnections()
            .getByResourceGroupWithResponse("rgopenapi", "TestIcName", com.azure.core.util.Context.NONE);
    }
}
```

### InternalConnections_List

```java
/**
 * Samples for InternalConnections List.
 */
public final class InternalConnectionsListSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * InternalConnections_ListBySubscription.json
     */
    /**
     * Sample code: InternalConnections_ListBySubscription.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void internalConnectionsListBySubscription(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.internalConnections().list(com.azure.core.util.Context.NONE);
    }
}
```

### InternalConnections_ListByResourceGroup

```java
/**
 * Samples for InternalConnections ListByResourceGroup.
 */
public final class InternalConnectionsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * InternalConnections_ListByResourceGroup.json
     */
    /**
     * Sample code: InternalConnections_ListByResourceGroup.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void
        internalConnectionsListByResourceGroup(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.internalConnections().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### InternalConnections_Update

```java
import com.azure.resourcemanager.mission.models.InternalConnection;
import com.azure.resourcemanager.mission.models.InternalConnectionState;
import com.azure.resourcemanager.mission.models.InternalConnectionType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for InternalConnections Update.
 */
public final class InternalConnectionsUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * InternalConnections_Update.json
     */
    /**
     * Sample code: InternalConnections_Update.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void internalConnectionsUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        InternalConnection resource = manager.internalConnections()
            .getByResourceGroupWithResponse("rgopenapi", "TestIcName", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key4278", "fakeTokenPlaceholder"))
            .withConnectionType(InternalConnectionType.PRIVATE_LINK)
            .withState(InternalConnectionState.PENDING_APPROVAL)
            .withCommunityResourceId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/microsoft.mission/communities/TestMyCommunity")
            .withDestinationEnclaveId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualEnclaves/TestDestMyEnclave")
            .withDestinationEndpointId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualEnclaves/TestSrcMyEnclave/endpoints/TestMyDestEndpoint")
            .withSourceEnclaveId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Mission/virtualEnclaves/TestSrcMyEnclave")
            .withSourceCidrs(Arrays.asList("192.168.0.1/24"))
            .withResourceCollection(Arrays.asList("resCollection"))
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
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Operations_List.json
     */
    /**
     * Sample code: Operations_List.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void operationsList(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### TransitHub_CreateOrUpdate

```java
import com.azure.resourcemanager.mission.models.TransitHubState;
import com.azure.resourcemanager.mission.models.TransitOption;
import com.azure.resourcemanager.mission.models.TransitOptionParams;
import com.azure.resourcemanager.mission.models.TransitOptionType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for TransitHub CreateOrUpdate.
 */
public final class TransitHubCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * TransitHub_CreateOrUpdate.json
     */
    /**
     * Sample code: TransitHub_CreateOrUpdate.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void transitHubCreateOrUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.transitHubs()
            .define("TestThName")
            .withRegion("westcentralus")
            .withExistingCommunity("rgopenapi", "TestMyCommunity")
            .withTags(mapOf("Tag1", "Value1"))
            .withState(TransitHubState.PENDING_APPROVAL)
            .withTransitOption(new TransitOption().withType(TransitOptionType.EXPRESS_ROUTE)
                .withParams(new TransitOptionParams().withScaleUnits(1L)))
            .withResourceCollection(Arrays.asList("resCollection"))
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

### TransitHub_Delete

```java
/**
 * Samples for TransitHub Delete.
 */
public final class TransitHubDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/TransitHub_Delete.
     * json
     */
    /**
     * Sample code: TransitHub_Delete.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void transitHubDelete(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.transitHubs().delete("rgopenapi", "TestMyCommunity", "TestThName", com.azure.core.util.Context.NONE);
    }
}
```

### TransitHub_Get

```java
/**
 * Samples for TransitHub Get.
 */
public final class TransitHubGetSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/TransitHub_Get.json
     */
    /**
     * Sample code: TransitHub_Get.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void transitHubGet(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.transitHubs()
            .getWithResponse("rgopenapi", "TestMyCommunity", "TestThName", com.azure.core.util.Context.NONE);
    }
}
```

### TransitHub_ListByCommunityResource

```java
/**
 * Samples for TransitHub ListByCommunityResource.
 */
public final class TransitHubListByCommunityResourceSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * TransitHub_ListByCommunityResource.json
     */
    /**
     * Sample code: TransitHub_ListByCommunityResource.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void transitHubListByCommunityResource(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.transitHubs().listByCommunityResource("rgopenapi", "TestMyCommunity", com.azure.core.util.Context.NONE);
    }
}
```

### TransitHub_ListBySubscription

```java
/**
 * Samples for TransitHub ListBySubscription.
 */
public final class TransitHubListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * TransitHub_ListBySubscription.json
     */
    /**
     * Sample code: TransitHub_ListBySubscription.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void transitHubListBySubscription(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.transitHubs().listBySubscription("TestMyCommunity", com.azure.core.util.Context.NONE);
    }
}
```

### TransitHub_Update

```java
import com.azure.resourcemanager.mission.models.TransitHubResource;
import com.azure.resourcemanager.mission.models.TransitHubState;
import com.azure.resourcemanager.mission.models.TransitOption;
import com.azure.resourcemanager.mission.models.TransitOptionParams;
import com.azure.resourcemanager.mission.models.TransitOptionType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for TransitHub Update.
 */
public final class TransitHubUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/TransitHub_Update.
     * json
     */
    /**
     * Sample code: TransitHub_Update.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void transitHubUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        TransitHubResource resource = manager.transitHubs()
            .getWithResponse("rgopenapi", "TestMyCommunity", "TestThName", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key4278", "fakeTokenPlaceholder"))
            .withState(TransitHubState.PENDING_APPROVAL)
            .withTransitOption(new TransitOption().withType(TransitOptionType.EXPRESS_ROUTE)
                .withParams(new TransitOptionParams().withScaleUnits(1L)))
            .withResourceCollection(Arrays.asList("resCollection"))
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

### VirtualEnclave_ApprovalCallback

```java
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequest;
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequestApprovalStatus;
import com.azure.resourcemanager.mission.models.ApprovalCallbackRequestResourceRequestAction;

/**
 * Samples for VirtualEnclave ApprovalCallback.
 */
public final class VirtualEnclaveApprovalCallbackSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * VirtualEnclave_PostApprovalCallback.json
     */
    /**
     * Sample code: VirtualEnclave_ApprovalCallback.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void virtualEnclaveApprovalCallback(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.virtualEnclaves()
            .approvalCallback("rgopenapi", "TestMyEnclave",
                new ApprovalCallbackRequest()
                    .withResourceRequestAction(ApprovalCallbackRequestResourceRequestAction.CREATE)
                    .withApprovalStatus(ApprovalCallbackRequestApprovalStatus.APPROVED)
                    .withApprovalCallbackPayload("{\n  \"key1\": \"value1\",\n  \"key2\": \"value2\"\n}"),
                com.azure.core.util.Context.NONE);
    }
}
```

### VirtualEnclave_ApprovalDeletionCallback

```java
import com.azure.resourcemanager.mission.models.ApprovalDeletionCallbackRequest;
import com.azure.resourcemanager.mission.models.ApprovalDeletionCallbackRequestResourceRequestAction;

/**
 * Samples for VirtualEnclave ApprovalDeletionCallback.
 */
public final class VirtualEnclaveApprovalDeletionCallbackSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * VirtualEnclave_PostApprovalDeletionCallback.json
     */
    /**
     * Sample code: VirtualEnclave_ApprovalDeletionCallback.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void
        virtualEnclaveApprovalDeletionCallback(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.virtualEnclaves()
            .approvalDeletionCallback("rgopenapi", "TestMyEnclave", new ApprovalDeletionCallbackRequest()
                .withResourceRequestAction(ApprovalDeletionCallbackRequestResourceRequestAction.CREATE),
                com.azure.core.util.Context.NONE);
    }
}
```

### VirtualEnclave_CreateOrUpdate

```java
import com.azure.resourcemanager.mission.models.DiagnosticDestination;
import com.azure.resourcemanager.mission.models.EnclaveDefaultSettings;
import com.azure.resourcemanager.mission.models.EnclaveVirtualNetwork;
import com.azure.resourcemanager.mission.models.MaintenanceModeConfiguration;
import com.azure.resourcemanager.mission.models.MaintenanceModeConfigurationJustification;
import com.azure.resourcemanager.mission.models.MaintenanceModeConfigurationMode;
import com.azure.resourcemanager.mission.models.ManagedServiceIdentity;
import com.azure.resourcemanager.mission.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.mission.models.Principal;
import com.azure.resourcemanager.mission.models.PrincipalType;
import com.azure.resourcemanager.mission.models.RoleAssignmentItem;
import com.azure.resourcemanager.mission.models.SubnetConfiguration;
import com.azure.resourcemanager.mission.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for VirtualEnclave CreateOrUpdate.
 */
public final class VirtualEnclaveCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * VirtualEnclave_CreateOrUpdate.json
     */
    /**
     * Sample code: VirtualEnclave_CreateOrUpdate.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void virtualEnclaveCreateOrUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.virtualEnclaves()
            .define("TestMyEnclave")
            .withRegion("westcentralus")
            .withExistingResourceGroup("rgopenapi")
            .withTags(mapOf("Tag1", "Value1"))
            .withIdentity(new ManagedServiceIdentity()
                .withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/subid/resourceGroups/default-azurebatch-japaneast/providers/Microsoft.ManagedIdentity/userAssignedIdentities/id1",
                    new UserAssignedIdentity())))
            .withEnclaveVirtualNetwork(new EnclaveVirtualNetwork().withNetworkSize("small")
                .withCustomCidrRange("10.0.0.0/24")
                .withSubnetConfigurations(
                    Arrays.asList(new SubnetConfiguration().withName("test").withNetworkPrefixSize(26)))
                .withAllowSubnetCommunication(true)
                .withConnectToAzureServices(true))
            .withCommunityResourceId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/microsoft.mission/communities/TestMyCommunity")
            .withEnclaveDefaultSettings(new EnclaveDefaultSettings().withKeyVaultResourceId("fakeTokenPlaceholder")
                .withStorageAccountResourceId(
                    "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Storage/storageAccounts/TestMyStorageAccount")
                .withLogAnalyticsResourceIdCollection(Arrays.asList(
                    "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.OperationalInsights/workspaces/TestMyLogA1",
                    "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.OperationalInsights/workspaces/TestMyLogA2"))
                .withDiagnosticDestination(DiagnosticDestination.BOTH))
            .withResourceCollection(Arrays.asList())
            .withMaintenanceModeConfiguration(
                new MaintenanceModeConfiguration().withMode(MaintenanceModeConfigurationMode.OFF)
                    .withPrincipals(Arrays.asList(
                        new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c9").withType(PrincipalType.USER)))
                    .withJustification(MaintenanceModeConfigurationJustification.OFF))
            .withBastionEnabled(true)
            .withEnclaveRoleAssignments(
                Arrays.asList(
                    new RoleAssignmentItem().withId("b24988ac-6180-42a0-ab88-20f7382dd24c")
                        .withPrincipals(Arrays.asList(
                            new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c9").withType(PrincipalType.USER),
                            new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c0")
                                .withType(PrincipalType.USER))),
                    new RoleAssignmentItem().withId("18d7d88d-d35e-4fb5-a5c3-7773c20a72d9")
                        .withPrincipals(Arrays.asList(new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c9")
                            .withType(PrincipalType.USER)))))
            .withWorkloadRoleAssignments(
                Arrays.asList(
                    new RoleAssignmentItem().withId("d73bb868-a0df-4d4d-bd69-98a00b01fccb")
                        .withPrincipals(Arrays.asList(new Principal().withId("01234567-89ab-ef01-2345-0123456789ab")
                            .withType(PrincipalType.GROUP))),
                    new RoleAssignmentItem().withId("fb879df8-f326-4884-b1cf-06f3ad86be52")
                        .withPrincipals(Arrays.asList(new Principal().withId("01234567-89ab-ef01-2345-0123456789ab")
                            .withType(PrincipalType.GROUP)))))
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

### VirtualEnclave_Delete

```java
/**
 * Samples for VirtualEnclave Delete.
 */
public final class VirtualEnclaveDeleteSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * VirtualEnclave_Delete.json
     */
    /**
     * Sample code: VirtualEnclave_Delete.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void virtualEnclaveDelete(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.virtualEnclaves().delete("rgopenapi", "TestMyEnclave", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualEnclave_GetByResourceGroup

```java
/**
 * Samples for VirtualEnclave GetByResourceGroup.
 */
public final class VirtualEnclaveGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/VirtualEnclave_Get.
     * json
     */
    /**
     * Sample code: VirtualEnclave_Get.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void virtualEnclaveGet(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.virtualEnclaves()
            .getByResourceGroupWithResponse("rgopenapi", "TestMyEnclave", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualEnclave_List

```java
/**
 * Samples for VirtualEnclave List.
 */
public final class VirtualEnclaveListSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * VirtualEnclave_ListBySubscription.json
     */
    /**
     * Sample code: VirtualEnclave_ListBySubscription.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void virtualEnclaveListBySubscription(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.virtualEnclaves().list(com.azure.core.util.Context.NONE);
    }
}
```

### VirtualEnclave_ListByResourceGroup

```java
/**
 * Samples for VirtualEnclave ListByResourceGroup.
 */
public final class VirtualEnclaveListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * VirtualEnclave_ListByResourceGroup.json
     */
    /**
     * Sample code: VirtualEnclave_ListByResourceGroup.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void virtualEnclaveListByResourceGroup(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.virtualEnclaves().listByResourceGroup("rgopenapi", com.azure.core.util.Context.NONE);
    }
}
```

### VirtualEnclave_Update

```java
import com.azure.resourcemanager.mission.models.DiagnosticDestination;
import com.azure.resourcemanager.mission.models.EnclaveDefaultSettings;
import com.azure.resourcemanager.mission.models.EnclaveResource;
import com.azure.resourcemanager.mission.models.EnclaveVirtualNetworkUpdate;
import com.azure.resourcemanager.mission.models.MaintenanceModeConfigurationUpdate;
import com.azure.resourcemanager.mission.models.MaintenanceModeConfigurationUpdateJustification;
import com.azure.resourcemanager.mission.models.MaintenanceModeConfigurationUpdateMode;
import com.azure.resourcemanager.mission.models.Principal;
import com.azure.resourcemanager.mission.models.PrincipalType;
import com.azure.resourcemanager.mission.models.RoleAssignmentItem;
import com.azure.resourcemanager.mission.models.SubnetConfiguration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for VirtualEnclave Update.
 */
public final class VirtualEnclaveUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * VirtualEnclave_Update.json
     */
    /**
     * Sample code: VirtualEnclave_Update.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void virtualEnclaveUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        EnclaveResource resource = manager.virtualEnclaves()
            .getByResourceGroupWithResponse("rgopenapi", "TestMyEnclave", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("Tag1", "Value1"))
            .withEnclaveVirtualNetwork(new EnclaveVirtualNetworkUpdate().withNetworkSize("small")
                .withCustomCidrRange("10.0.0.0/24")
                .withSubnetConfigurations(
                    Arrays.asList(new SubnetConfiguration().withName("test").withNetworkPrefixSize(26)))
                .withAllowSubnetCommunication(true)
                .withConnectToAzureServices(true))
            .withCommunityResourceId(
                "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/microsoft.mission/communities/TestMyCommunity")
            .withEnclaveDefaultSettings(new EnclaveDefaultSettings().withKeyVaultResourceId("fakeTokenPlaceholder")
                .withStorageAccountResourceId(
                    "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.Storage/storageAccounts/TestMyStorageAccount")
                .withLogAnalyticsResourceIdCollection(Arrays.asList(
                    "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.OperationalInsights/workspaces/TestMyLogA1",
                    "/subscriptions/c64f6eca-bdc5-4bc2-88d6-f8f1dc23f86c/resourceGroups/TestMyRg/providers/Microsoft.OperationalInsights/workspaces/TestMyLogA2"))
                .withDiagnosticDestination(DiagnosticDestination.BOTH))
            .withResourceCollection(Arrays.asList("g"))
            .withMaintenanceModeConfiguration(
                new MaintenanceModeConfigurationUpdate().withMode(MaintenanceModeConfigurationUpdateMode.OFF)
                    .withPrincipals(Arrays.asList(
                        new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c9").withType(PrincipalType.USER)))
                    .withJustification(MaintenanceModeConfigurationUpdateJustification.OFF))
            .withBastionEnabled(true)
            .withEnclaveRoleAssignments(
                Arrays.asList(
                    new RoleAssignmentItem().withId("b24988ac-6180-42a0-ab88-20f7382dd24c")
                        .withPrincipals(Arrays.asList(
                            new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c9").withType(PrincipalType.USER),
                            new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c0")
                                .withType(PrincipalType.USER))),
                    new RoleAssignmentItem().withId("18d7d88d-d35e-4fb5-a5c3-7773c20a72d9")
                        .withPrincipals(Arrays.asList(new Principal().withId("355a6bb0-abc0-4cba-000d-12a345b678c9")
                            .withType(PrincipalType.USER)))))
            .withWorkloadRoleAssignments(
                Arrays.asList(
                    new RoleAssignmentItem().withId("d73bb868-a0df-4d4d-bd69-98a00b01fccb")
                        .withPrincipals(Arrays.asList(new Principal().withId("01234567-89ab-ef01-2345-0123456789ab")
                            .withType(PrincipalType.GROUP))),
                    new RoleAssignmentItem().withId("fb879df8-f326-4884-b1cf-06f3ad86be52")
                        .withPrincipals(Arrays.asList(new Principal().withId("01234567-89ab-ef01-2345-0123456789ab")
                            .withType(PrincipalType.GROUP)))))
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

### Workload_CreateOrUpdate

```java
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Workload CreateOrUpdate.
 */
public final class WorkloadCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Workload_CreateOrUpdate.json
     */
    /**
     * Sample code: Workload_CreateOrUpdate.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void workloadCreateOrUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.workloads()
            .define("TestMyWorkload")
            .withRegion("westcentralus")
            .withExistingVirtualEnclave("rgopenapi", "TestMyEnclave")
            .withTags(mapOf("TestKey", "fakeTokenPlaceholder"))
            .withResourceGroupCollection(Arrays.asList())
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

### Workload_Delete

```java
/**
 * Samples for Workload Delete.
 */
public final class WorkloadDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Workload_Delete.json
     */
    /**
     * Sample code: Workload_Delete.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void workloadDelete(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.workloads().delete("rgopenapi", "TestMyEnclave", "TestMyWorkload", com.azure.core.util.Context.NONE);
    }
}
```

### Workload_Get

```java
/**
 * Samples for Workload Get.
 */
public final class WorkloadGetSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Workload_Get.json
     */
    /**
     * Sample code: Workload_Get.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void workloadGet(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.workloads()
            .getWithResponse("rgopenapi", "TestMyEnclave", "TestMyWorkload", com.azure.core.util.Context.NONE);
    }
}
```

### Workload_ListByEnclaveResource

```java
/**
 * Samples for Workload ListByEnclaveResource.
 */
public final class WorkloadListByEnclaveResourceSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Workload_ListByEnclaveResource.json
     */
    /**
     * Sample code: Workload_ListByEnclaveResource.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void workloadListByEnclaveResource(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.workloads().listByEnclaveResource("rgopenapi", "TestMyEnclave", com.azure.core.util.Context.NONE);
    }
}
```

### Workload_ListBySubscription

```java
/**
 * Samples for Workload ListBySubscription.
 */
public final class WorkloadListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/
     * Workload_ListBySubscription.json
     */
    /**
     * Sample code: Workload_ListBySubscription.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void workloadListBySubscription(com.azure.resourcemanager.mission.MissionManager manager) {
        manager.workloads().listBySubscription("TestMyEnclave", com.azure.core.util.Context.NONE);
    }
}
```

### Workload_Update

```java
import com.azure.resourcemanager.mission.models.WorkloadResource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Workload Update.
 */
public final class WorkloadUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mission/resource-manager/Microsoft.Mission/preview/2024-11-01-preview/examples/Workload_Update.json
     */
    /**
     * Sample code: Workload_Update.
     * 
     * @param manager Entry point to MissionManager.
     */
    public static void workloadUpdate(com.azure.resourcemanager.mission.MissionManager manager) {
        WorkloadResource resource = manager.workloads()
            .getWithResponse("rgopenapi", "TestMyEnclave", "TestMyWorkload", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("key9465", "fakeTokenPlaceholder"))
            .withResourceGroupCollection(Arrays.asList("g"))
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

