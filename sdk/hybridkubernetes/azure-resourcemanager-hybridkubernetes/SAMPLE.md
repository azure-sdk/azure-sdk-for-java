# Code snippets and samples


## ConnectedClusters

- [CreateOrReplace](#connectedclusters_createorreplace)
- [Delete](#connectedclusters_delete)
- [GetByResourceGroup](#connectedclusters_getbyresourcegroup)
- [List](#connectedclusters_list)
- [ListByResourceGroup](#connectedclusters_listbyresourcegroup)
- [ListClusterUserCredential](#connectedclusters_listclusterusercredential)
- [Update](#connectedclusters_update)

## Operations

- [List](#operations_list)
### ConnectedClusters_CreateOrReplace

```java
/**
 * Samples for ConnectedClusters Delete.
 */
public final class ConnectedClustersDeleteSamples {
    /*
     * x-ms-original-file: 2024-12-01-preview/DeleteClusterExample.json
     */
    /**
     * Sample code: DeleteClusterExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void
        deleteClusterExample(com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters().delete("k8sc-rg", "testCluster", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectedClusters_Delete

```java
/**
 * Samples for ConnectedClusters List.
 */
public final class ConnectedClustersListSamples {
    /*
     * x-ms-original-file: 2024-12-01-preview/GetClustersBySubscriptionExample.json
     */
    /**
     * Sample code: GetClustersBySubscriptionExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void
        getClustersBySubscriptionExample(com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters().list(com.azure.core.util.Context.NONE);
    }
}
```

### ConnectedClusters_GetByResourceGroup

```java
/**
 * Samples for ConnectedClusters ListByResourceGroup.
 */
public final class ConnectedClustersListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-12-01-preview/GetClustersByResourceGroupExample.json
     */
    /**
     * Sample code: GetClustersExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void getClustersExample(com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters().listByResourceGroup("k8sc-rg", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectedClusters_List

```java
import com.azure.resourcemanager.hybridkubernetes.models.AuthenticationMethod;
import com.azure.resourcemanager.hybridkubernetes.models.ListClusterUserCredentialProperties;

/**
 * Samples for ConnectedClusters ListClusterUserCredential.
 */
public final class ConnectedClustersListClusterUserCredentialSamples {
    /*
     * x-ms-original-file: 2024-12-01-preview/ConnectedClustersListClusterCredentialResultCSPAAD.json
     */
    /**
     * Sample code: ListClusterUserCredentialExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void
        listClusterUserCredentialExample(com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters()
            .listClusterUserCredentialWithResponse("k8sc-rg", "testCluster",
                new ListClusterUserCredentialProperties().withAuthenticationMethod(AuthenticationMethod.AAD)
                    .withClientProxy(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-12-01-preview/ConnectedClustersListClusterCredentialResultHPAAD.json
     */
    /**
     * Sample code: ListClusterUserCredentialCSPExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void listClusterUserCredentialCSPExample(
        com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters()
            .listClusterUserCredentialWithResponse("k8sc-rg", "testCluster",
                new ListClusterUserCredentialProperties().withAuthenticationMethod(AuthenticationMethod.AAD)
                    .withClientProxy(false),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-12-01-preview/ConnectedClustersListClusterCredentialResultCSPToken.json
     */
    /**
     * Sample code: ListClusterUserCredentialNonAadExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void listClusterUserCredentialNonAadExample(
        com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters()
            .listClusterUserCredentialWithResponse("k8sc-rg", "testCluster",
                new ListClusterUserCredentialProperties().withAuthenticationMethod(AuthenticationMethod.TOKEN)
                    .withClientProxy(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-12-01-preview/ConnectedClustersListClusterCredentialResultHPToken.json
     */
    /**
     * Sample code: ListClusterUserCredentialNonAadCSPExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void listClusterUserCredentialNonAadCSPExample(
        com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters()
            .listClusterUserCredentialWithResponse("k8sc-rg", "testCluster",
                new ListClusterUserCredentialProperties().withAuthenticationMethod(AuthenticationMethod.TOKEN)
                    .withClientProxy(false),
                com.azure.core.util.Context.NONE);
    }
}
```

### ConnectedClusters_ListByResourceGroup

```java
/**
 * Samples for ConnectedClusters GetByResourceGroup.
 */
public final class ConnectedClustersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-12-01-preview/GetProvisionedClusterExample.json
     */
    /**
     * Sample code: GetProvisionedClusterExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void
        getProvisionedClusterExample(com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters()
            .getByResourceGroupWithResponse("k8sc-rg", "testCluster", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2024-12-01-preview/GetClusterExample.json
     */
    /**
     * Sample code: GetClusterExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void getClusterExample(com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters()
            .getByResourceGroupWithResponse("k8sc-rg", "testCluster", com.azure.core.util.Context.NONE);
    }
}
```

### ConnectedClusters_ListClusterUserCredential

```java
/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: 2024-12-01-preview/ListConnectedClusterOperationsExample.json
     */
    /**
     * Sample code: ListConnectedClusterOperationsExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void listConnectedClusterOperationsExample(
        com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### ConnectedClusters_Update

```java
import com.azure.resourcemanager.hybridkubernetes.models.AadProfile;
import com.azure.resourcemanager.hybridkubernetes.models.ArcAgentProfile;
import com.azure.resourcemanager.hybridkubernetes.models.AutoUpgradeOptions;
import com.azure.resourcemanager.hybridkubernetes.models.AzureHybridBenefit;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedClusterIdentity;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedClusterKind;
import com.azure.resourcemanager.hybridkubernetes.models.Gateway;
import com.azure.resourcemanager.hybridkubernetes.models.OidcIssuerProfile;
import com.azure.resourcemanager.hybridkubernetes.models.PrivateLinkState;
import com.azure.resourcemanager.hybridkubernetes.models.ResourceIdentityType;
import com.azure.resourcemanager.hybridkubernetes.models.SystemComponent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ConnectedClusters CreateOrReplace.
 */
public final class ConnectedClustersCreateOrReplaceSamples {
    /*
     * x-ms-original-file: 2024-12-01-preview/UpdateClusterByPutExample.json
     */
    /**
     * Sample code: UpdateClusterByPutExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void
        updateClusterByPutExample(com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters()
            .define("testCluster")
            .withRegion("East US")
            .withExistingResourceGroup("k8sc-rg")
            .withIdentity(new ConnectedClusterIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withAgentPublicKeyCertificate(
                "MIICYzCCAcygAwIBAgIBADANBgkqhkiG9w0BAQUFADAuMQswCQYDVQQGEwJVUzEMMAoGA1UEChMDSUJNMREwDwYDVQQLEwhMb2NhbCBDQTAeFw05OTEyMjIwNTAwMDBaFw0wMDEyMjMwNDU5NTlaMC4xCzAJBgNVBAYTAlVTMQwwCgYDVQQKEwNJQk0xETAPBgNVBAsTCExvY2FsIENBMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQD2bZEo7xGaX2/0GHkrNFZvlxBou9v1Jmt/PDiTMPve8r9FeJAQ0QdvFST/0JPQYD20rH0bimdDLgNdNynmyRoS2S/IInfpmf69iyc2G0TPyRvmHIiOZbdCd+YBHQi1adkj17NDcWj6S14tVurFX73zx0sNoMS79q3tuXKrDsxeuwIDAQABo4GQMIGNMEsGCVUdDwGG+EIBDQQ+EzxHZW5lcmF0ZWQgYnkgdGhlIFNlY3VyZVdheSBTZWN1cml0eSBTZXJ2ZXIgZm9yIE9TLzM5MCAoUkFDRikwDgYDVR0PAQH/BAQDAgAGMA8GA1UdEwEB/wQFMAMBAf8wHQYDVR0OBBYEFJ3+ocRyCTJw067dLSwr/nalx6YMMA0GCSqGSIb3DQEBBQUAA4GBAMaQzt+zaj1GU77yzlr8iiMBXgdQrwsZZWJo5exnAucJAEYQZmOfyLiM D6oYq+ZnfvM0n8G/Y79q8nhwvuxpYOnRSAXFp6xSkrIOeZtJMY1h00LKp/JX3Ng1svZ2agE126JHsQ0bhzN5TKsYfbwfTwfjdWAGy6Vf1nYi/rO+ryMO")
            .withTags(mapOf())
            .withDistribution("AKS")
            .withDistributionVersion("1.0")
            .withAzureHybridBenefit(AzureHybridBenefit.NOT_APPLICABLE)
            .withGateway(new Gateway().withEnabled(true)
                .withResourceId(
                    "/subscriptions/1bfbb5d0-917e-4346-9026-1d3b344417f5/resourceGroups/akkeshar/providers/Microsoft.HybridCompute/gateways/gateway1"))
            .create();
    }

    /*
     * x-ms-original-file: 2024-12-01-preview/CreateCluster_KindExample.json
     */
    /**
     * Sample code: CreateCluster_KindExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void
        createClusterKindExample(com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters()
            .define("testCluster")
            .withRegion("East US")
            .withExistingResourceGroup("k8sc-rg")
            .withIdentity(new ConnectedClusterIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withAgentPublicKeyCertificate("")
            .withTags(mapOf())
            .withKind(ConnectedClusterKind.PROVISIONED_CLUSTER)
            .withDistribution("AKS")
            .withDistributionVersion("1.0")
            .withAzureHybridBenefit(AzureHybridBenefit.NOT_APPLICABLE)
            .withAadProfile(new AadProfile().withEnableAzureRBAC(true)
                .withAdminGroupObjectIDs(Arrays.asList("56f988bf-86f1-41af-91ab-2d7cd011db47"))
                .withTenantID("82f988bf-86f1-41af-91ab-2d7cd011db47"))
            .withArcAgentProfile(new ArcAgentProfile().withDesiredAgentVersion("0.1.0")
                .withAgentAutoUpgrade(AutoUpgradeOptions.ENABLED)
                .withSystemComponents(Arrays.asList(
                    new SystemComponent().withType("Strato").withUserSpecifiedVersion("0.1.1").withMajorVersion(0))))
            .withOidcIssuerProfile(new OidcIssuerProfile().withEnabled(true))
            .create();
    }

    /*
     * x-ms-original-file: 2024-12-01-preview/CreateClusterExample.json
     */
    /**
     * Sample code: CreateClusterExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void
        createClusterExample(com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters()
            .define("testCluster")
            .withRegion("East US")
            .withExistingResourceGroup("k8sc-rg")
            .withIdentity(new ConnectedClusterIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withAgentPublicKeyCertificate(
                "MIICYzCCAcygAwIBAgIBADANBgkqhkiG9w0BAQUFADAuMQswCQYDVQQGEwJVUzEMMAoGA1UEChMDSUJNMREwDwYDVQQLEwhMb2NhbCBDQTAeFw05OTEyMjIwNTAwMDBaFw0wMDEyMjMwNDU5NTlaMC4xCzAJBgNVBAYTAlVTMQwwCgYDVQQKEwNJQk0xETAPBgNVBAsTCExvY2FsIENBMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQD2bZEo7xGaX2/0GHkrNFZvlxBou9v1Jmt/PDiTMPve8r9FeJAQ0QdvFST/0JPQYD20rH0bimdDLgNdNynmyRoS2S/IInfpmf69iyc2G0TPyRvmHIiOZbdCd+YBHQi1adkj17NDcWj6S14tVurFX73zx0sNoMS79q3tuXKrDsxeuwIDAQABo4GQMIGNMEsGCVUdDwGG+EIBDQQ+EzxHZW5lcmF0ZWQgYnkgdGhlIFNlY3VyZVdheSBTZWN1cml0eSBTZXJ2ZXIgZm9yIE9TLzM5MCAoUkFDRikwDgYDVR0PAQH/BAQDAgAGMA8GA1UdEwEB/wQFMAMBAf8wHQYDVR0OBBYEFJ3+ocRyCTJw067dLSwr/nalx6YMMA0GCSqGSIb3DQEBBQUAA4GBAMaQzt+zaj1GU77yzlr8iiMBXgdQrwsZZWJo5exnAucJAEYQZmOfyLiM D6oYq+ZnfvM0n8G/Y79q8nhwvuxpYOnRSAXFp6xSkrIOeZtJMY1h00LKp/JX3Ng1svZ2agE126JHsQ0bhzN5TKsYfbwfTwfjdWAGy6Vf1nYi/rO+ryMO")
            .withTags(mapOf())
            .withDistribution("AKS")
            .withDistributionVersion("1.0")
            .withAzureHybridBenefit(AzureHybridBenefit.NOT_APPLICABLE)
            .create();
    }

    /*
     * x-ms-original-file: 2024-12-01-preview/CreateClusterPrivateLinkExample.json
     */
    /**
     * Sample code: CreateClusterPrivateLinkExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void
        createClusterPrivateLinkExample(com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters()
            .define("testCluster")
            .withRegion("East US")
            .withExistingResourceGroup("k8sc-rg")
            .withIdentity(new ConnectedClusterIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
            .withAgentPublicKeyCertificate(
                "MIICYzCCAcygAwIBAgIBADANBgkqhkiG9w0BAQUFADAuMQswCQYDVQQGEwJVUzEMMAoGA1UEChMDSUJNMREwDwYDVQQLEwhMb2NhbCBDQTAeFw05OTEyMjIwNTAwMDBaFw0wMDEyMjMwNDU5NTlaMC4xCzAJBgNVBAYTAlVTMQwwCgYDVQQKEwNJQk0xETAPBgNVBAsTCExvY2FsIENBMIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQD2bZEo7xGaX2/0GHkrNFZvlxBou9v1Jmt/PDiTMPve8r9FeJAQ0QdvFST/0JPQYD20rH0bimdDLgNdNynmyRoS2S/IInfpmf69iyc2G0TPyRvmHIiOZbdCd+YBHQi1adkj17NDcWj6S14tVurFX73zx0sNoMS79q3tuXKrDsxeuwIDAQABo4GQMIGNMEsGCVUdDwGG+EIBDQQ+EzxHZW5lcmF0ZWQgYnkgdGhlIFNlY3VyZVdheSBTZWN1cml0eSBTZXJ2ZXIgZm9yIE9TLzM5MCAoUkFDRikwDgYDVR0PAQH/BAQDAgAGMA8GA1UdEwEB/wQFMAMBAf8wHQYDVR0OBBYEFJ3+ocRyCTJw067dLSwr/nalx6YMMA0GCSqGSIb3DQEBBQUAA4GBAMaQzt+zaj1GU77yzlr8iiMBXgdQrwsZZWJo5exnAucJAEYQZmOfyLiM D6oYq+ZnfvM0n8G/Y79q8nhwvuxpYOnRSAXFp6xSkrIOeZtJMY1h00LKp/JX3Ng1svZ2agE126JHsQ0bhzN5TKsYfbwfTwfjdWAGy6Vf1nYi/rO+ryMO")
            .withTags(mapOf())
            .withDistribution("AKS")
            .withDistributionVersion("1.0")
            .withPrivateLinkState(PrivateLinkState.ENABLED)
            .withPrivateLinkScopeResourceId(
                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.HybridCompute/privateLinkScopes/privateLinkScopeName")
            .withAzureHybridBenefit(AzureHybridBenefit.NOT_APPLICABLE)
            .create();
    }

    /*
     * x-ms-original-file: 2024-12-01-preview/CreateClusterAgentless_KindAWSExample.json
     */
    /**
     * Sample code: CreateClusterAgentless_KindAWSExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void createClusterAgentlessKindAWSExample(
        com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        manager.connectedClusters()
            .define("testCluster")
            .withRegion("East US")
            .withExistingResourceGroup("k8sc-rg")
            .withIdentity(new ConnectedClusterIdentity().withType(ResourceIdentityType.NONE))
            .withAgentPublicKeyCertificate("")
            .withTags(mapOf())
            .withKind(ConnectedClusterKind.AWS)
            .withDistribution("eks")
            .withInfrastructure("aws")
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

### Operations_List

```java
import com.azure.resourcemanager.hybridkubernetes.models.AzureHybridBenefit;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectedCluster;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for ConnectedClusters Update.
 */
public final class ConnectedClustersUpdateSamples {
    /*
     * x-ms-original-file: 2024-12-01-preview/UpdateClusterByPatchExample.json
     */
    /**
     * Sample code: UpdateClusterExample.
     * 
     * @param manager Entry point to HybridkubernetesManager.
     */
    public static void
        updateClusterExample(com.azure.resourcemanager.hybridkubernetes.HybridkubernetesManager manager) {
        ConnectedCluster resource = manager.connectedClusters()
            .getByResourceGroupWithResponse("k8sc-rg", "testCluster", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withDistribution("AKS")
            .withDistributionVersion("1.0")
            .withAzureHybridBenefit(AzureHybridBenefit.NOT_APPLICABLE)
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

