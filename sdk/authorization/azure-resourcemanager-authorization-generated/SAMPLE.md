# Code snippets and samples


## RoleManagementPolicies

- [Delete](#rolemanagementpolicies_delete)
- [Get](#rolemanagementpolicies_get)
- [ListForScope](#rolemanagementpolicies_listforscope)
- [Update](#rolemanagementpolicies_update)

## RoleManagementPolicyAssignments

- [Create](#rolemanagementpolicyassignments_create)
- [Delete](#rolemanagementpolicyassignments_delete)
- [Get](#rolemanagementpolicyassignments_get)
- [ListForScope](#rolemanagementpolicyassignments_listforscope)
### RoleManagementPolicies_Delete

```java
/**
 * Samples for RoleManagementPolicies Delete.
 */
public final class RoleManagementPoliciesDeleteSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2024-02-01-preview/examples/DeleteRoleManagementPolicy.json
     */
    /**
     * Sample code: DeleteRoleManagementPolicy.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteRoleManagementPolicy(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleManagementPolicies().deleteByResourceGroupWithResponse("providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368", "570c3619-7688-4b34-b290-2b8bb3ccab2a", com.azure.core.util.Context.NONE);
    }
}
```

### RoleManagementPolicies_Get

```java
/**
 * Samples for RoleManagementPolicies Get.
 */
public final class RoleManagementPoliciesGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2024-02-01-preview/examples/GetRoleManagementPolicyByName.json
     */
    /**
     * Sample code: GetRoleManagementPolicyByName.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleManagementPolicyByName(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleManagementPolicies().getWithResponse("providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368", "570c3619-7688-4b34-b290-2b8bb3ccab2a", com.azure.core.util.Context.NONE);
    }
}
```

### RoleManagementPolicies_ListForScope

```java
/**
 * Samples for RoleManagementPolicies ListForScope.
 */
public final class RoleManagementPoliciesListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2024-02-01-preview/examples/GetRoleManagementPolicyByScope.json
     */
    /**
     * Sample code: GetRoleManagementPolicyByRoleDefinitionFilter.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleManagementPolicyByRoleDefinitionFilter(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleManagementPolicies().listForScope("providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368", com.azure.core.util.Context.NONE);
    }
}
```

### RoleManagementPolicies_Update

```java
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleManagementPolicyInner;
import com.azure.resourcemanager.authorization.generated.models.ApprovalMode;
import com.azure.resourcemanager.authorization.generated.models.ApprovalSettings;
import com.azure.resourcemanager.authorization.generated.models.ApprovalStage;
import com.azure.resourcemanager.authorization.generated.models.EnablementRules;
import com.azure.resourcemanager.authorization.generated.models.NotificationDeliveryMechanism;
import com.azure.resourcemanager.authorization.generated.models.NotificationLevel;
import com.azure.resourcemanager.authorization.generated.models.RecipientType;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyApprovalRule;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyAuthenticationContextRule;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyEnablementRule;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyExpirationRule;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyNotificationRule;
import com.azure.resourcemanager.authorization.generated.models.RoleManagementPolicyRuleTarget;
import com.azure.resourcemanager.authorization.generated.models.UserSet;
import com.azure.resourcemanager.authorization.generated.models.UserType;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Samples for RoleManagementPolicies Update.
 */
public final class RoleManagementPoliciesUpdateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2024-02-01-preview/examples/PatchPartialRoleManagementPolicy.json
     */
    /**
     * Sample code: PatchPartialRoleManagementPolicy.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void patchPartialRoleManagementPolicy(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleManagementPolicies().updateWithResponse("providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368", "570c3619-7688-4b34-b290-2b8bb3ccab2a", new RoleManagementPolicyInner().withRules(Arrays.asList(new RoleManagementPolicyExpirationRule().withId("Expiration_Admin_Eligibility").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Eligibility")).withIsExpirationRequired(false).withMaximumDuration("P180D"), new RoleManagementPolicyNotificationRule().withId("Notification_Admin_Admin_Eligibility").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Eligibility")).withNotificationType(NotificationDeliveryMechanism.EMAIL).withNotificationLevel(NotificationLevel.CRITICAL).withRecipientType(RecipientType.ADMIN).withNotificationRecipients(Arrays.asList("admin_admin_eligible@test.com")).withIsDefaultRecipientsEnabled(false))), com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2024-02-01-preview/examples/PatchRoleManagementPolicy.json
     */
    /**
     * Sample code: PatchRoleManagementPolicy.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void patchRoleManagementPolicy(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleManagementPolicies().updateWithResponse("providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368", "570c3619-7688-4b34-b290-2b8bb3ccab2a", new RoleManagementPolicyInner().withRules(Arrays.asList(new RoleManagementPolicyExpirationRule().withId("Expiration_Admin_Eligibility").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Eligibility")).withIsExpirationRequired(false).withMaximumDuration("P180D"), new RoleManagementPolicyNotificationRule().withId("Notification_Admin_Admin_Eligibility").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Eligibility")).withNotificationType(NotificationDeliveryMechanism.EMAIL).withNotificationLevel(NotificationLevel.CRITICAL).withRecipientType(RecipientType.ADMIN).withNotificationRecipients(Arrays.asList("admin_admin_eligible@test.com")).withIsDefaultRecipientsEnabled(false), new RoleManagementPolicyNotificationRule().withId("Notification_Requestor_Admin_Eligibility").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Eligibility")).withNotificationType(NotificationDeliveryMechanism.EMAIL).withNotificationLevel(NotificationLevel.CRITICAL).withRecipientType(RecipientType.REQUESTOR).withNotificationRecipients(Arrays.asList("requestor_admin_eligible@test.com")).withIsDefaultRecipientsEnabled(false), new RoleManagementPolicyNotificationRule().withId("Notification_Approver_Admin_Eligibility").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Eligibility")).withNotificationType(NotificationDeliveryMechanism.EMAIL).withNotificationLevel(NotificationLevel.CRITICAL).withRecipientType(RecipientType.APPROVER).withNotificationRecipients(Arrays.asList("approver_admin_eligible@test.com")).withIsDefaultRecipientsEnabled(false), new RoleManagementPolicyEnablementRule().withId("Enablement_Admin_Eligibility").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Eligibility")).withEnabledRules(Arrays.asList()), new RoleManagementPolicyExpirationRule().withId("Expiration_Admin_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Assignment")).withIsExpirationRequired(false).withMaximumDuration("P90D"), new RoleManagementPolicyEnablementRule().withId("Enablement_Admin_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Assignment")).withEnabledRules(Arrays.asList(EnablementRules.JUSTIFICATION, EnablementRules.MULTI_FACTOR_AUTHENTICATION)), new RoleManagementPolicyNotificationRule().withId("Notification_Admin_Admin_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Assignment")).withNotificationType(NotificationDeliveryMechanism.EMAIL).withNotificationLevel(NotificationLevel.CRITICAL).withRecipientType(RecipientType.ADMIN).withNotificationRecipients(Arrays.asList("admin_admin_member@test.com")).withIsDefaultRecipientsEnabled(false), new RoleManagementPolicyNotificationRule().withId("Notification_Requestor_Admin_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Assignment")).withNotificationType(NotificationDeliveryMechanism.EMAIL).withNotificationLevel(NotificationLevel.CRITICAL).withRecipientType(RecipientType.REQUESTOR).withNotificationRecipients(Arrays.asList("requestor_admin_member@test.com")).withIsDefaultRecipientsEnabled(false), new RoleManagementPolicyNotificationRule().withId("Notification_Approver_Admin_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("Admin").withOperations(Arrays.asList("All")).withLevel("Assignment")).withNotificationType(NotificationDeliveryMechanism.EMAIL).withNotificationLevel(NotificationLevel.CRITICAL).withRecipientType(RecipientType.APPROVER).withNotificationRecipients(Arrays.asList("approver_admin_member@test.com")).withIsDefaultRecipientsEnabled(false), new RoleManagementPolicyExpirationRule().withId("Expiration_EndUser_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("EndUser").withOperations(Arrays.asList("All")).withLevel("Assignment")).withIsExpirationRequired(true).withMaximumDuration("PT7H"), new RoleManagementPolicyEnablementRule().withId("Enablement_EndUser_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("EndUser").withOperations(Arrays.asList("All")).withLevel("Assignment")).withEnabledRules(Arrays.asList(EnablementRules.JUSTIFICATION, EnablementRules.MULTI_FACTOR_AUTHENTICATION, EnablementRules.TICKETING)), new RoleManagementPolicyApprovalRule().withId("Approval_EndUser_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("EndUser").withOperations(Arrays.asList("All")).withLevel("Assignment")).withSetting(new ApprovalSettings().withIsApprovalRequired(true).withIsApprovalRequiredForExtension(false).withIsRequestorJustificationRequired(true).withApprovalMode(ApprovalMode.SINGLE_STAGE).withApprovalStages(Arrays.asList(new ApprovalStage().withApprovalStageTimeOutInDays(1).withIsApproverJustificationRequired(true).withEscalationTimeInMinutes(0).withPrimaryApprovers(Arrays.asList(new UserSet().withUserType(UserType.GROUP).withIsBackup(false).withId("2385b0f3-5fa9-43cf-8ca4-b01dc97298cd").withDescription("amansw_new_group"), new UserSet().withUserType(UserType.GROUP).withIsBackup(false).withId("2f4913c9-d15b-406a-9946-1d66a28f2690").withDescription("amansw_group"))).withIsEscalationEnabled(false)))), new RoleManagementPolicyAuthenticationContextRule().withId("AuthenticationContext_EndUser_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("EndUser").withOperations(Arrays.asList("All")).withLevel("Assignment")).withIsEnabled(false).withClaimValue(""), new RoleManagementPolicyNotificationRule().withId("Notification_Admin_EndUser_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("EndUser").withOperations(Arrays.asList("All")).withLevel("Assignment")).withNotificationType(NotificationDeliveryMechanism.EMAIL).withNotificationLevel(NotificationLevel.CRITICAL).withRecipientType(RecipientType.ADMIN).withNotificationRecipients(Arrays.asList("admin_enduser_member@test.com")).withIsDefaultRecipientsEnabled(false), new RoleManagementPolicyNotificationRule().withId("Notification_Requestor_EndUser_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("EndUser").withOperations(Arrays.asList("All")).withLevel("Assignment")).withNotificationType(NotificationDeliveryMechanism.EMAIL).withNotificationLevel(NotificationLevel.CRITICAL).withRecipientType(RecipientType.REQUESTOR).withNotificationRecipients(Arrays.asList("requestor_enduser_member@test.com")).withIsDefaultRecipientsEnabled(false), new RoleManagementPolicyNotificationRule().withId("Notification_Approver_EndUser_Assignment").withTarget(new RoleManagementPolicyRuleTarget().withCaller("EndUser").withOperations(Arrays.asList("All")).withLevel("Assignment")).withNotificationType(NotificationDeliveryMechanism.EMAIL).withNotificationLevel(NotificationLevel.CRITICAL).withRecipientType(RecipientType.APPROVER).withIsDefaultRecipientsEnabled(true))), com.azure.core.util.Context.NONE);
    }
}
```

### RoleManagementPolicyAssignments_Create

```java
/**
 * Samples for RoleManagementPolicyAssignments Create.
 */
public final class RoleManagementPolicyAssignmentsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2024-02-01-preview/examples/PutRoleManagementPolicyAssignment.json
     */
    /**
     * Sample code: PutRoleManagementPolicyAssignment.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void putRoleManagementPolicyAssignment(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleManagementPolicyAssignments().define("b959d571-f0b5-4042-88a7-01be6cb22db9_a1705bd2-3a8f-45a5-8683-466fcfd5cc24").withExistingScope("providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368").withScope("/subscriptions/129ff972-28f8-46b8-a726-e497be039368").withRoleDefinitionId("/subscriptions/129ff972-28f8-46b8-a726-e497be039368/providers/Microsoft.Authorization/roleDefinitions/a1705bd2-3a8f-45a5-8683-466fcfd5cc24").withPolicyId("/subscriptions/129ff972-28f8-46b8-a726-e497be039368/providers/Microsoft.Authorization/roleManagementPolicies/b959d571-f0b5-4042-88a7-01be6cb22db9").create();
    }
}
```

### RoleManagementPolicyAssignments_Delete

```java
/**
 * Samples for RoleManagementPolicyAssignments Delete.
 */
public final class RoleManagementPolicyAssignmentsDeleteSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2024-02-01-preview/examples/DeleteRoleManagementPolicyAssignment.json
     */
    /**
     * Sample code: DeleteRoleManagementPolicyAssignment.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void deleteRoleManagementPolicyAssignment(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleManagementPolicyAssignments().deleteByResourceGroupWithResponse("providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368", "b959d571-f0b5-4042-88a7-01be6cb22db9_a1705bd2-3a8f-45a5-8683-466fcfd5cc24", com.azure.core.util.Context.NONE);
    }
}
```

### RoleManagementPolicyAssignments_Get

```java
/**
 * Samples for RoleManagementPolicyAssignments Get.
 */
public final class RoleManagementPolicyAssignmentsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2024-02-01-preview/examples/GetRoleManagementPolicyAssignmentByName.json
     */
    /**
     * Sample code: GetConfigurations.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getConfigurations(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleManagementPolicyAssignments().getWithResponse("providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368", "b959d571-f0b5-4042-88a7-01be6cb22db9_a1705bd2-3a8f-45a5-8683-466fcfd5cc24", com.azure.core.util.Context.NONE);
    }
}
```

### RoleManagementPolicyAssignments_ListForScope

```java
/**
 * Samples for RoleManagementPolicyAssignments ListForScope.
 */
public final class RoleManagementPolicyAssignmentsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2024-02-01-preview/examples/GetRoleManagementPolicyAssignmentByScope.json
     */
    /**
     * Sample code: GetRoleManagementPolicyAssignmentByScope.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleManagementPolicyAssignmentByScope(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleManagementPolicyAssignments().listForScope("providers/Microsoft.Subscription/subscriptions/129ff972-28f8-46b8-a726-e497be039368", com.azure.core.util.Context.NONE);
    }
}
```

