# Code snippets and samples


## Operations

- [List](#operations_list)

## Query

- [GenerateQuery](#query_generatequery)

## ResourceProvider

- [ResourceChangeDetails](#resourceprovider_resourcechangedetails)
- [ResourceChanges](#resourceprovider_resourcechanges)
- [Resources](#resourceprovider_resources)
- [ResourcesHistory](#resourceprovider_resourceshistory)
### Operations_List

```java
/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/OperationsList.json
     */
    /**
     * Sample code: OperationsList.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void operationsList(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
```

### Query_GenerateQuery

```java
import com.azure.resourcemanager.resourcegraph.models.HistoryContext;
import com.azure.resourcemanager.resourcegraph.models.QueryGenerationRequest;
import com.azure.resourcemanager.resourcegraph.models.Role;
import java.util.Arrays;

/** Samples for Query GenerateQuery. */
public final class QueryGenerateQuerySamples {
    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesGenerateQuery.json
     */
    /**
     * Sample code: Succeeded ARG Query Generation.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void succeededARGQueryGeneration(
        com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .queries()
            .generateQueryWithResponse(
                new QueryGenerationRequest().withPrompt("I want to see my virtual machines"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesGenerateQueryNoGeneration.json
     */
    /**
     * Sample code: Failed ARG Query Generation.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void failedARGQueryGeneration(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .queries()
            .generateQueryWithResponse(
                new QueryGenerationRequest().withPrompt("What is the weather today?"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesGenerateQueryWithHistory.json
     */
    /**
     * Sample code: ARG Query Generation with history.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void aRGQueryGenerationWithHistory(
        com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .queries()
            .generateQueryWithResponse(
                new QueryGenerationRequest()
                    .withHistory(
                        Arrays
                            .asList(
                                new HistoryContext().withContent("I want all my virtual machines").withRole(Role.USER),
                                new HistoryContext()
                                    .withContent("Resources | where type =~ 'Microsoft.Compute/virtualMachines'")
                                    .withRole(Role.ASSISTANT)))
                    .withPrompt("I want to see only 5 of my virtual machines"),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_ResourceChangeDetails

```java
import com.azure.resourcemanager.resourcegraph.models.ResourceChangeDetailsRequestParameters;
import java.util.Arrays;

/** Samples for ResourceProvider ResourceChangeDetails. */
public final class ResourceProviderResourceChangeDetailsSamples {
    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2020-09-01-preview/examples/ResourceChangeDetails.json
     */
    /**
     * Sample code: Basic query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void basicQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourceChangeDetailsWithResponse(
                new ResourceChangeDetailsRequestParameters()
                    .withResourceIds(
                        Arrays
                            .asList(
                                "/subscriptions/4d962866-1e3f-47f2-bd18-450c08f914c1/resourceGroups/MyResourceGroup/providers/Microsoft.Storage/storageAccounts/mystorageaccount"))
                    .withChangeIds(Arrays.asList("53dc0515-b86b-4bc2-979b-e4694ab4a556")),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_ResourceChanges

```java
import com.azure.resourcemanager.resourcegraph.models.ResourceChangesRequestParameters;
import com.azure.resourcemanager.resourcegraph.models.ResourceChangesRequestParametersInterval;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for ResourceProvider ResourceChanges. */
public final class ResourceProviderResourceChangesSamples {
    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2020-09-01-preview/examples/ResourceChanges.json
     */
    /**
     * Sample code: Basic query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void basicQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourceChangesWithResponse(
                new ResourceChangesRequestParameters()
                    .withResourceIds(
                        Arrays
                            .asList(
                                "/subscriptions/4d962866-1e3f-47f2-bd18-450c08f914c1/resourceGroups/MyResourceGroup/providers/Microsoft.Storage/storageAccounts/mystorageaccount"))
                    .withInterval(
                        new ResourceChangesRequestParametersInterval()
                            .withStart(OffsetDateTime.parse("2018-10-30T12:09:03.141Z"))
                            .withEnd(OffsetDateTime.parse("2018-10-31T12:09:03.141Z"))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2020-09-01-preview/examples/ResourceChangesNextPage.json
     */
    /**
     * Sample code: Next page query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void nextPageQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourceChangesWithResponse(
                new ResourceChangesRequestParameters()
                    .withResourceIds(
                        Arrays
                            .asList(
                                "/subscriptions/4d962866-1e3f-47f2-bd18-450c08f914c1/resourceGroups/MyResourceGroup/providers/Microsoft.Storage/storageAccounts/mystorageaccount"))
                    .withInterval(
                        new ResourceChangesRequestParametersInterval()
                            .withStart(OffsetDateTime.parse("2018-10-30T12:09:03.141Z"))
                            .withEnd(OffsetDateTime.parse("2018-10-31T12:09:03.141Z")))
                    .withSkipToken("fakeTokenPlaceholder")
                    .withTop(2),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2020-09-01-preview/examples/ResourceChangesFirstPage.json
     */
    /**
     * Sample code: First page query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void firstPageQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourceChangesWithResponse(
                new ResourceChangesRequestParameters()
                    .withResourceIds(
                        Arrays
                            .asList(
                                "/subscriptions/4d962866-1e3f-47f2-bd18-450c08f914c1/resourceGroups/MyResourceGroup/providers/Microsoft.Storage/storageAccounts/mystorageaccount"))
                    .withInterval(
                        new ResourceChangesRequestParametersInterval()
                            .withStart(OffsetDateTime.parse("2018-10-30T12:09:03.141Z"))
                            .withEnd(OffsetDateTime.parse("2018-10-31T12:09:03.141Z")))
                    .withTop(2),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_Resources

```java
import com.azure.resourcemanager.resourcegraph.models.FacetRequest;
import com.azure.resourcemanager.resourcegraph.models.FacetRequestOptions;
import com.azure.resourcemanager.resourcegraph.models.FacetSortOrder;
import com.azure.resourcemanager.resourcegraph.models.QueryRequest;
import com.azure.resourcemanager.resourcegraph.models.QueryRequestOptions;
import java.util.Arrays;

/** Samples for ResourceProvider Resources. */
public final class ResourceProviderResourcesSamples {
    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesMgBasicQuery.json
     */
    /**
     * Sample code: Basic management group query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void basicManagementGroupQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesWithResponse(
                new QueryRequest()
                    .withManagementGroups(Arrays.asList("e927f598-c1d4-4f72-8541-95d83a6a4ac8", "ProductionMG"))
                    .withQuery("Resources | project id, name, type, location, tags | limit 3"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesBasicQuery.json
     */
    /**
     * Sample code: Basic query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void basicQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesWithResponse(
                new QueryRequest()
                    .withSubscriptions(Arrays.asList("cfbbd179-59d2-4052-aa06-9270a38aa9d6"))
                    .withQuery("Resources | project id, name, type, location, tags | limit 3"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesFacetQuery.json
     */
    /**
     * Sample code: Query with a facet request.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void queryWithAFacetRequest(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesWithResponse(
                new QueryRequest()
                    .withSubscriptions(Arrays.asList("cfbbd179-59d2-4052-aa06-9270a38aa9d6"))
                    .withQuery(
                        "Resources | where type =~ 'Microsoft.Compute/virtualMachines' | project id, name, location,"
                            + " resourceGroup, properties.storageProfile.osDisk.osType | limit 5")
                    .withFacets(
                        Arrays
                            .asList(
                                new FacetRequest()
                                    .withExpression("location")
                                    .withOptions(
                                        new FacetRequestOptions().withSortOrder(FacetSortOrder.DESC).withTop(3)),
                                new FacetRequest()
                                    .withExpression("properties.storageProfile.osDisk.osType")
                                    .withOptions(
                                        new FacetRequestOptions().withSortOrder(FacetSortOrder.DESC).withTop(3)),
                                new FacetRequest()
                                    .withExpression("nonExistingColumn")
                                    .withOptions(
                                        new FacetRequestOptions().withSortOrder(FacetSortOrder.DESC).withTop(3)),
                                new FacetRequest()
                                    .withExpression("resourceGroup")
                                    .withOptions(
                                        new FacetRequestOptions()
                                            .withSortBy("tolower(resourceGroup)")
                                            .withSortOrder(FacetSortOrder.ASC)
                                            .withTop(3)),
                                new FacetRequest()
                                    .withExpression("resourceGroup")
                                    .withOptions(
                                        new FacetRequestOptions()
                                            .withFilter("resourceGroup contains 'test'")
                                            .withTop(3)))),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesFilterQuery.json
     */
    /**
     * Sample code: Filter resources.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void filterResources(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesWithResponse(
                new QueryRequest()
                    .withSubscriptions(Arrays.asList("cfbbd179-59d2-4052-aa06-9270a38aa9d6"))
                    .withQuery(
                        "Resources | project id, name, type, location | where type =~"
                            + " 'Microsoft.Compute/virtualMachines' | limit 3"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesSummarizeQuery.json
     */
    /**
     * Sample code: Summarize resources by location.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void summarizeResourcesByLocation(
        com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesWithResponse(
                new QueryRequest()
                    .withSubscriptions(Arrays.asList("cfbbd179-59d2-4052-aa06-9270a38aa9d6"))
                    .withQuery("Resources | project id, name, type, location | summarize by location"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesPropertiesQuery.json
     */
    /**
     * Sample code: Access a properties field.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void accessAPropertiesField(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesWithResponse(
                new QueryRequest()
                    .withSubscriptions(Arrays.asList("cfbbd179-59d2-4052-aa06-9270a38aa9d6"))
                    .withQuery(
                        "Resources | where type =~ 'Microsoft.Compute/virtualMachines' | summarize count() by"
                            + " tostring(properties.storageProfile.osDisk.osType)"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesComplexQuery.json
     */
    /**
     * Sample code: Complex query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void complexQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesWithResponse(
                new QueryRequest()
                    .withSubscriptions(Arrays.asList("cfbbd179-59d2-4052-aa06-9270a38aa9d6"))
                    .withQuery(
                        "Resources | project id, name, type, location | where type =~"
                            + " 'Microsoft.Compute/virtualMachines' | summarize count() by location | top 3 by count_"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesNextPageQuery.json
     */
    /**
     * Sample code: Next page query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void nextPageQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesWithResponse(
                new QueryRequest()
                    .withSubscriptions(Arrays.asList("cfbbd179-59d2-4052-aa06-9270a38aa9d6"))
                    .withQuery("Resources | where name contains 'test' | project id, name, type, location")
                    .withOptions(new QueryRequestOptions().withSkipToken("fakeTokenPlaceholder")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesFirstPageQuery.json
     */
    /**
     * Sample code: First page query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void firstPageQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesWithResponse(
                new QueryRequest()
                    .withSubscriptions(Arrays.asList("cfbbd179-59d2-4052-aa06-9270a38aa9d6"))
                    .withQuery("Resources | where name contains 'test' | project id, name, type, location")
                    .withOptions(new QueryRequestOptions().withTop(3).withSkip(0)),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesTenantBasicQuery.json
     */
    /**
     * Sample code: Basic tenant query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void basicTenantQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesWithResponse(
                new QueryRequest().withQuery("Resources | project id, name, type, location, tags | limit 3"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2023-09-01-preview/examples/ResourcesRandomPageQuery.json
     */
    /**
     * Sample code: Random page query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void randomPageQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesWithResponse(
                new QueryRequest()
                    .withSubscriptions(Arrays.asList("cfbbd179-59d2-4052-aa06-9270a38aa9d6"))
                    .withQuery("Resources | where name contains 'test' | project id, name, type, location")
                    .withOptions(new QueryRequestOptions().withTop(2).withSkip(10)),
                com.azure.core.util.Context.NONE);
    }
}
```

### ResourceProvider_ResourcesHistory

```java
import com.azure.resourcemanager.resourcegraph.models.DateTimeInterval;
import com.azure.resourcemanager.resourcegraph.models.ResourcesHistoryRequest;
import com.azure.resourcemanager.resourcegraph.models.ResourcesHistoryRequestOptions;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for ResourceProvider ResourcesHistory. */
public final class ResourceProviderResourcesHistorySamples {
    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2021-06-01-preview/examples/ResourcesHistoryMgsGet.json
     */
    /**
     * Sample code: Resource History Management Group scope Query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void resourceHistoryManagementGroupScopeQuery(
        com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesHistoryWithResponse(
                new ResourcesHistoryRequest()
                    .withQuery("where name =~ 'cpu-utilization' | project id, name, properties")
                    .withOptions(
                        new ResourcesHistoryRequestOptions()
                            .withInterval(
                                new DateTimeInterval()
                                    .withStart(OffsetDateTime.parse("2020-11-12T01:00:00.0000000Z"))
                                    .withEnd(OffsetDateTime.parse("2020-11-12T01:25:00.0000000Z"))))
                    .withManagementGroups(Arrays.asList("e927f598-c1d4-4f72-8541-95d83a6a4ac8", "ProductionMG")),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resourcegraph/resource-manager/Microsoft.ResourceGraph/preview/2021-06-01-preview/examples/ResourcesHistoryGet.json
     */
    /**
     * Sample code: Resource History Query.
     *
     * @param manager Entry point to ResourceGraphManager.
     */
    public static void resourceHistoryQuery(com.azure.resourcemanager.resourcegraph.ResourceGraphManager manager) {
        manager
            .resourceProviders()
            .resourcesHistoryWithResponse(
                new ResourcesHistoryRequest()
                    .withSubscriptions(Arrays.asList("a7f33fdb-e646-4f15-89aa-3a360210861e"))
                    .withQuery("where name =~ 'cpu-utilization' | project id, name, properties")
                    .withOptions(
                        new ResourcesHistoryRequestOptions()
                            .withInterval(
                                new DateTimeInterval()
                                    .withStart(OffsetDateTime.parse("2020-11-12T01:00:00.0000000Z"))
                                    .withEnd(OffsetDateTime.parse("2020-11-12T01:25:00.0000000Z")))),
                com.azure.core.util.Context.NONE);
    }
}
```

