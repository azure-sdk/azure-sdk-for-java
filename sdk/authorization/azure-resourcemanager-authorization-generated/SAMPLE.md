# Code snippets and samples


## RoleAssignmentScheduleRequests

- [Cancel](#roleassignmentschedulerequests_cancel)
- [Create](#roleassignmentschedulerequests_create)
- [Get](#roleassignmentschedulerequests_get)
- [ListForScope](#roleassignmentschedulerequests_listforscope)
- [Validate](#roleassignmentschedulerequests_validate)
### RoleAssignmentScheduleRequests_Cancel

```java
/**
 * Samples for RoleAssignmentScheduleRequests Cancel.
 */
public final class RoleAssignmentScheduleRequestsCancelSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2023-04-01-preview/examples/CancelRoleAssignmentScheduleRequestByName.json
     */
    /**
     * Sample code: CancelRoleAssignmentScheduleRequestByName.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void cancelRoleAssignmentScheduleRequestByName(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignmentScheduleRequests().cancelWithResponse("providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f", "fea7a502-9a96-4806-a26f-eee560e52045", com.azure.core.util.Context.NONE);
    }
}
```

### RoleAssignmentScheduleRequests_Create

```java
import com.azure.resourcemanager.authorization.generated.models.RequestType;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration;
import com.azure.resourcemanager.authorization.generated.models.Type;
import java.time.OffsetDateTime;
import java.util.stream.Collectors;

/**
 * Samples for RoleAssignmentScheduleRequests Create.
 */
public final class RoleAssignmentScheduleRequestsCreateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2023-04-01-preview/examples/PutRoleAssignmentScheduleRequest.json
     */
    /**
     * Sample code: PutRoleAssignmentScheduleRequest.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void putRoleAssignmentScheduleRequest(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignmentScheduleRequests().define("fea7a502-9a96-4806-a26f-eee560e52045").withExistingScope("providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f").withRoleDefinitionId("/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f/providers/Microsoft.Authorization/roleDefinitions/c8d4ff99-41c3-41a8-9f60-21dfdad59608").withPrincipalId("a3bb8764-cb92-4276-9d2a-ca1e895e55ea").withRequestType(RequestType.SELF_ACTIVATE).withScheduleInfo(new RoleAssignmentScheduleRequestPropertiesScheduleInfo().withStartDateTime(OffsetDateTime.parse("2020-09-09T21:35:27.91Z")).withExpiration(new RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration().withType(Type.AFTER_DURATION).withDuration("PT8H"))).withLinkedRoleEligibilityScheduleId("b1477448-2cc6-4ceb-93b4-54a202a89413").withCondition("@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName] StringEqualsIgnoreCase 'foo_storage_container'").withConditionVersion("1.0").create();
    }
}
```

### RoleAssignmentScheduleRequests_Get

```java
/**
 * Samples for RoleAssignmentScheduleRequests Get.
 */
public final class RoleAssignmentScheduleRequestsGetSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2023-04-01-preview/examples/GetRoleAssignmentScheduleRequestByName.json
     */
    /**
     * Sample code: GetRoleAssignmentScheduleRequestByName.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentScheduleRequestByName(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignmentScheduleRequests().getWithResponse("providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f", "fea7a502-9a96-4806-a26f-eee560e52045", com.azure.core.util.Context.NONE);
    }
}
```

### RoleAssignmentScheduleRequests_ListForScope

```java
/**
 * Samples for RoleAssignmentScheduleRequests ListForScope.
 */
public final class RoleAssignmentScheduleRequestsListForScopeSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2023-04-01-preview/examples/GetRoleAssignmentScheduleRequestByScope.json
     */
    /**
     * Sample code: GetRoleAssignmentScheduleRequestByScope.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void getRoleAssignmentScheduleRequestByScope(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignmentScheduleRequests().listForScope("providers/Microsoft.Subscription/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f", "assignedTo('A3BB8764-CB92-4276-9D2A-CA1E895E55EA')", com.azure.core.util.Context.NONE);
    }
}
```

### RoleAssignmentScheduleRequests_Validate

```java
import com.azure.resourcemanager.authorization.generated.fluent.models.RoleAssignmentScheduleRequestInner;
import com.azure.resourcemanager.authorization.generated.models.RequestType;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfo;
import com.azure.resourcemanager.authorization.generated.models.RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration;
import com.azure.resourcemanager.authorization.generated.models.Type;
import java.time.OffsetDateTime;
import java.util.stream.Collectors;

/**
 * Samples for RoleAssignmentScheduleRequests Validate.
 */
public final class RoleAssignmentScheduleRequestsValidateSamples {
    /*
     * x-ms-original-file: specification/authorization/resource-manager/Microsoft.Authorization/preview/2023-04-01-preview/examples/ValidateRoleAssignmentScheduleRequestByName.json
     */
    /**
     * Sample code: ValidateRoleAssignmentScheduleRequestByName.
     * 
     * @param manager Entry point to AuthorizationManager.
     */
    public static void validateRoleAssignmentScheduleRequestByName(com.azure.resourcemanager.authorization.generated.AuthorizationManager manager) {
        manager.roleAssignmentScheduleRequests().validateWithResponse("subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f", "fea7a502-9a96-4806-a26f-eee560e52045", new RoleAssignmentScheduleRequestInner().withRoleDefinitionId("/subscriptions/dfa2a084-766f-4003-8ae1-c4aeb893a99f/providers/Microsoft.Authorization/roleDefinitions/c8d4ff99-41c3-41a8-9f60-21dfdad59608").withPrincipalId("a3bb8764-cb92-4276-9d2a-ca1e895e55ea").withRequestType(RequestType.SELF_ACTIVATE).withScheduleInfo(new RoleAssignmentScheduleRequestPropertiesScheduleInfo().withStartDateTime(OffsetDateTime.parse("2020-09-09T21:35:27.91Z")).withExpiration(new RoleAssignmentScheduleRequestPropertiesScheduleInfoExpiration().withType(Type.AFTER_DURATION).withDuration("PT8H"))).withLinkedRoleEligibilityScheduleId("b1477448-2cc6-4ceb-93b4-54a202a89413").withCondition("@Resource[Microsoft.Storage/storageAccounts/blobServices/containers:ContainerName] StringEqualsIgnoreCase 'foo_storage_container'").withConditionVersion("1.0"), com.azure.core.util.Context.NONE);
    }
}
```

