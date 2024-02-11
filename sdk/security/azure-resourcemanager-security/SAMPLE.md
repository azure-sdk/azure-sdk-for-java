# Code snippets and samples


## SecurityConnectors

- [CreateOrUpdate](#securityconnectors_createorupdate)
- [Delete](#securityconnectors_delete)
- [GetByResourceGroup](#securityconnectors_getbyresourcegroup)
- [List](#securityconnectors_list)
- [ListByResourceGroup](#securityconnectors_listbyresourcegroup)
- [Update](#securityconnectors_update)
### SecurityConnectors_CreateOrUpdate

```java
import com.azure.resourcemanager.security.models.AwsEnvironmentData;
import com.azure.resourcemanager.security.models.CloudName;
import com.azure.resourcemanager.security.models.CspmMonitorAwsOffering;
import com.azure.resourcemanager.security.models.CspmMonitorAwsOfferingNativeCloudConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SecurityConnectors CreateOrUpdate.
 */
public final class SecurityConnectorsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2024-03-01-preview/examples/SecurityConnectors
     * /PutSecurityConnector_example.json
     */
    /**
     * Sample code: Create or update a security connector.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void createOrUpdateASecurityConnector(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securityConnectors().define("exampleSecurityConnectorName").withRegion("Central US")
            .withExistingResourceGroup("exampleResourceGroup").withTags(mapOf())
            .withHierarchyIdentifier("exampleHierarchyId").withEnvironmentName(CloudName.AWS)
            .withOfferings(Arrays.asList(
                new CspmMonitorAwsOffering().withNativeCloudConnection(new CspmMonitorAwsOfferingNativeCloudConnection()
                    .withCloudRoleArn("arn:aws:iam::00000000:role/ASCMonitor"))))
            .withEnvironmentData(new AwsEnvironmentData().withScanInterval(4L)).create();
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

### SecurityConnectors_Delete

```java
/**
 * Samples for SecurityConnectors Delete.
 */
public final class SecurityConnectorsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2024-03-01-preview/examples/SecurityConnectors
     * /DeleteSecurityConnector_example.json
     */
    /**
     * Sample code: Delete a security connector.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void deleteASecurityConnector(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securityConnectors().deleteByResourceGroupWithResponse("myRg", "mySecurityConnectorName",
            com.azure.core.util.Context.NONE);
    }
}
```

### SecurityConnectors_GetByResourceGroup

```java
/**
 * Samples for SecurityConnectors GetByResourceGroup.
 */
public final class SecurityConnectorsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2024-03-01-preview/examples/SecurityConnectors
     * /GetSecurityConnectorSingleResource_example.json
     */
    /**
     * Sample code: Retrieve a security connector.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void retrieveASecurityConnector(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securityConnectors().getByResourceGroupWithResponse("exampleResourceGroup",
            "exampleSecurityConnectorName", com.azure.core.util.Context.NONE);
    }
}
```

### SecurityConnectors_List

```java
/**
 * Samples for SecurityConnectors List.
 */
public final class SecurityConnectorsListSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2024-03-01-preview/examples/SecurityConnectors
     * /GetSecurityConnectorsSubscription_example.json
     */
    /**
     * Sample code: List all security connectors of a specified subscription.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        listAllSecurityConnectorsOfASpecifiedSubscription(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securityConnectors().list(com.azure.core.util.Context.NONE);
    }
}
```

### SecurityConnectors_ListByResourceGroup

```java
/**
 * Samples for SecurityConnectors ListByResourceGroup.
 */
public final class SecurityConnectorsListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2024-03-01-preview/examples/SecurityConnectors
     * /GetSecurityConnectorsResourceGroup_example.json
     */
    /**
     * Sample code: List all security connectors of a specified resource group.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void
        listAllSecurityConnectorsOfASpecifiedResourceGroup(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.securityConnectors().listByResourceGroup("exampleResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### SecurityConnectors_Update

```java
import com.azure.resourcemanager.security.models.AwsEnvironmentData;
import com.azure.resourcemanager.security.models.CloudName;
import com.azure.resourcemanager.security.models.CspmMonitorAwsOffering;
import com.azure.resourcemanager.security.models.CspmMonitorAwsOfferingNativeCloudConnection;
import com.azure.resourcemanager.security.models.SecurityConnector;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SecurityConnectors Update.
 */
public final class SecurityConnectorsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/security/resource-manager/Microsoft.Security/preview/2024-03-01-preview/examples/SecurityConnectors
     * /PatchSecurityConnector_example.json
     */
    /**
     * Sample code: Update a security connector.
     * 
     * @param manager Entry point to SecurityManager.
     */
    public static void updateASecurityConnector(com.azure.resourcemanager.security.SecurityManager manager) {
        SecurityConnector resource = manager.securityConnectors().getByResourceGroupWithResponse("exampleResourceGroup",
            "exampleSecurityConnectorName", com.azure.core.util.Context.NONE).getValue();
        resource.update().withTags(mapOf()).withHierarchyIdentifier("exampleHierarchyId")
            .withEnvironmentName(CloudName.AWS)
            .withOfferings(Arrays.asList(
                new CspmMonitorAwsOffering().withNativeCloudConnection(new CspmMonitorAwsOfferingNativeCloudConnection()
                    .withCloudRoleArn("arn:aws:iam::00000000:role/ASCMonitor"))))
            .withEnvironmentData(new AwsEnvironmentData()).apply();
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

