// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.AzureKeyCredentialTrait;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.EndpointTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.client.traits.TokenCredentialTrait;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.HttpClientOptions;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JsonSerializer;
import com.azure.core.util.serializer.JsonSerializerProviders;
import com.azure.core.util.serializer.TypeReference;
import com.azure.search.documents.implementation.util.Constants;
import com.azure.search.documents.implementation.util.Utility;
import com.azure.search.documents.models.IndexAction;
import com.azure.search.documents.models.SearchAudience;
import com.azure.search.documents.options.OnActionAddedOptions;
import com.azure.search.documents.options.OnActionErrorOptions;
import com.azure.search.documents.options.OnActionSentOptions;
import com.azure.search.documents.options.OnActionSucceededOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

import static com.azure.search.documents.implementation.util.Utility.buildRestClient;

/**
 * This class provides a fluent builder API to help aid the configuration and instantiation of {@link SearchClient
 * SearchClients} and {@link SearchAsyncClient SearchAsyncClients}.
 *
 * <h2>
 *     Overview
 * </h2>
 *
 * <p>
 *     This client allows you to create instances of {@link SearchClient} and {@link SearchAsyncClient} to
 *     utilize synchronous and asynchronous APIs respectively to interact with Azure AI Search.
 * </p>
 *
 * <h2>
 *     Getting Started
 * </h2>
 *
 * <h3>
 *     Authentication
 * </h3>
 *
 * <p>
 *     Azure AI Search supports <a href="https://learn.microsoft.com/azure/search/search-security-rbac?tabs=config-svc-portal%2Croles-portal%2Ctest-portal%2Ccustom-role-portal%2Cdisable-keys-portal">
 *         Microsoft Entra ID (role-based) authentication </a> and <a href="https://learn.microsoft.com/azure/search/search-security-api-keys?tabs=portal-use%2Cportal-find%2Cportal-query">API keys</a> for authentication.
 * </p>
 *
 * <p>
 *     For more information about the scopes of authorization, see the <a href="https://learn.microsoft.com/azure/search/search-security-overview#authentication">Azure AI Search Security Overview</a> documentation.
 * </p>
 *
 * <h4>
 *     Building and Authenticating a {@link SearchClient} or {@link SearchAsyncClient} using API keys
 * </h4>
 *
 * <p>
 *     To build an instance of {@link SearchClient} or {@link SearchAsyncClient} using API keys, call
 *     {@link #buildClient() buildClient} and {@link #buildAsyncClient() buildAsyncClient} respectively from the
 *     {@link SearchClientBuilder}.
 * </p>
 *
 * <p>
 *     The following must be provided to construct a client instance.
 * </p>
 *
 * <ul>
 *     <li>
 *         The Azure AI Search service URL.
 *     </li>
 *     <li>
 *         An {@link AzureKeyCredential API Key} that grants access to the Azure AI Search service.
 *     </li>
 * </ul>
 *
 * <p><strong>Instantiating a synchronous Search Client</strong></p>
 *
 * <!-- src_embed com.azure.search.documents.SearchClientBuilder-classLevelJavaDoc.instantiation.SearchClient -->
 * <pre>
 * SearchClient searchClient = new SearchClientBuilder&#40;&#41;
 *     .credential&#40;new AzureKeyCredential&#40;&quot;&#123;key&#125;&quot;&#41;&#41;
 *     .endpoint&#40;&quot;&#123;endpoint&#125;&quot;&#41;
 *     .indexName&#40;&quot;&#123;indexName&#125;&quot;&#41;
 *     .buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.search.documents.SearchClientBuilder-classLevelJavaDoc.instantiation.SearchClient -->
 *
 * <p><strong>Instantiating an asynchronous Search Client</strong></p>
 *
 * <!-- src_embed com.azure.search.documents.SearchClientBuilder-classLevelJavaDoc.instantiation.SearchAsyncClient -->
 * <pre>
 * SearchAsyncClient searchAsyncClient = new SearchClientBuilder&#40;&#41;
 *     .credential&#40;new AzureKeyCredential&#40;&quot;&#123;key&#125;&quot;&#41;&#41;
 *     .endpoint&#40;&quot;&#123;endpoint&#125;&quot;&#41;
 *     .indexName&#40;&quot;&#123;indexName&#125;&quot;&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.search.documents.SearchClientBuilder-classLevelJavaDoc.instantiation.SearchAsyncClient -->
 *
 * <h4>
 *     Building and Authenticating a {@link SearchClient} or {@link SearchAsyncClient} using Microsoft Entra ID
 * </h4>
 *
 * <p>
 *   You can also create a {@link SearchClient} or {@link SearchAsyncClient} using Microsoft Entra ID
 *   authentication. Your user or service principal must be assigned the "Search Index Data Reader" role. Using the
 *   DefaultAzureCredential you can authenticate a service using Managed Identity or a service principal, authenticate
 *   as a developer working on an application, and more all without changing code. Please refer the <a href="https://learn.microsoft.com/azure/search/search-security-rbac?tabs=config-svc-portal,roles-portal,test-portal,custom-role-portal,disable-keys-portal">documentation</a> for
 *   instructions on how to connect to Azure AI Search using Azure role-based access control (Azure RBAC).
 * </p>
 *
 * <p>
 *     Before you can use the `DefaultAzureCredential`, or any credential type from Azure.Identity, you'll first need to install the Azure.Identity package.
 * </p>
 *
 * <p>
 *     To use DefaultAzureCredential with a client ID and secret, you'll need to set the `AZURE_TENANT_ID`, `AZURE_CLIENT_ID`,
 *     and `AZURE_CLIENT_SECRET` environment variables; alternatively, you can pass those values to the
 *     `ClientSecretCredential` also in azure-identity.
 * </p>
 *
 * <p>
 *     Make sure you use the right namespace for DefaultAzureCredential at the top of your source file:
 * </p>
 *
 * <!-- src_embed DefaultAzureCredentialImports -->
 * <pre>
 * import com.azure.identity.DefaultAzureCredential;
 * import com.azure.identity.DefaultAzureCredentialBuilder;
 * </pre>
 * <!-- end DefaultAzureCredentialImports -->
 *
 * <p>
 *     Then you can create an instance of DefaultAzureCredential and pass it to a new instance of your client:
 * </p>
 *
 * <p>The following sample builds a SearchClient using DefaultAzureCredential.</p>
 *
 * <p><strong>Instantiating a synchronous Search Client</strong></p>
 *
 * <!-- src_embed com.azure.search.documents.SearchClientBuilder-classLevelJavaDoc.credential -->
 * <pre>
 * DefaultAzureCredential credential = new DefaultAzureCredentialBuilder&#40;&#41;.build&#40;&#41;;
 *
 * SearchClient searchClient = new SearchClientBuilder&#40;&#41;
 *     .credential&#40;credential&#41;
 *     .endpoint&#40;&quot;&#123;endpoint&#125;&quot;&#41;
 *     .indexName&#40;&quot;&#123;indexName&#125;&quot;&#41;
 *     .buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.search.documents.SearchClientBuilder-classLevelJavaDoc.credential -->
 *
 * <p><strong>Instantiating an asynchronous Search Client</strong></p>
 *
 * <!-- src_embed com.azure.search.documents.SearchClientBuilder-classLevelJavaDoc.async.credential -->
 * <pre>
 * DefaultAzureCredential credential = new DefaultAzureCredentialBuilder&#40;&#41;.build&#40;&#41;;
 *
 * SearchAsyncClient searchAsyncClient = new SearchClientBuilder&#40;&#41;
 *     .credential&#40;credential&#41;
 *     .endpoint&#40;&quot;&#123;endpoint&#125;&quot;&#41;
 *     .indexName&#40;&quot;&#123;indexName&#125;&quot;&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.search.documents.SearchClientBuilder-classLevelJavaDoc.async.credential -->
 *
 * @see SearchClient
 * @see SearchAsyncClient
 * @see com.azure.search.documents
 */
@ServiceClientBuilder(serviceClients = { SearchClient.class, SearchAsyncClient.class })
public final class SearchClientBuilder
    implements AzureKeyCredentialTrait<SearchClientBuilder>, ConfigurationTrait<SearchClientBuilder>,
    EndpointTrait<SearchClientBuilder>, HttpTrait<SearchClientBuilder>, TokenCredentialTrait<SearchClientBuilder> {
    private static final boolean DEFAULT_AUTO_FLUSH = true;
    private static final int DEFAULT_INITIAL_BATCH_ACTION_COUNT = 512;
    private static final Duration DEFAULT_FLUSH_INTERVAL = Duration.ofSeconds(60);
    private static final int DEFAULT_MAX_RETRIES_PER_ACTION = 3;
    private static final Duration DEFAULT_THROTTLING_DELAY = Duration.ofMillis(800);
    private static final Duration DEFAULT_MAX_THROTTLING_DELAY = Duration.ofMinutes(1);
    // Retaining this commented out code as it may be added back in a future release.
    //    private static final Function<Integer, Integer> DEFAULT_SCALE_DOWN_FUNCTION = oldBatchCount -> {
    //        if (oldBatchCount == 1) {
    //            return 1;
    //        } else {
    //            return Math.max(1, oldBatchCount / 2);
    //        }
    //    };

    private static final ClientLogger LOGGER = new ClientLogger(SearchClientBuilder.class);

    private final List<HttpPipelinePolicy> perCallPolicies = new ArrayList<>();
    private final List<HttpPipelinePolicy> perRetryPolicies = new ArrayList<>();

    private AzureKeyCredential azureKeyCredential;
    private TokenCredential tokenCredential;
    private SearchAudience audience;

    private SearchServiceVersion serviceVersion;
    private String endpoint;
    private HttpClient httpClient;
    private HttpPipeline httpPipeline;
    private ClientOptions clientOptions;
    private HttpLogOptions httpLogOptions;
    private Configuration configuration;
    private String indexName;
    private RetryPolicy retryPolicy;
    private RetryOptions retryOptions;
    private JsonSerializer jsonSerializer;

    /**
     * Creates a builder instance that is able to configure and construct {@link SearchClient SearchClients} and {@link
     * SearchAsyncClient SearchAsyncClients}.
     */
    public SearchClientBuilder() {
    }

    /**
     * Creates a {@link SearchClient} based on options set in the builder. Every time {@code buildClient()} is called a
     * new instance of {@link SearchClient} is created.
     * <p>
     * If {@link #pipeline(HttpPipeline) pipeline} is set, then only the {@code pipeline}, {@link #endpoint(String)
     * endpoint}, and {@link #indexName(String) indexName} are used to create the {@link SearchClient client}. All other
     * builder settings are ignored.
     *
     * @return A SearchClient with the options set from the builder.
     * @throws NullPointerException If {@code indexName} or {@code endpoint} are null.
     * @throws IllegalStateException If both {@link #retryOptions(RetryOptions)}
     * and {@link #retryPolicy(RetryPolicy)} have been set.
     */
    public SearchClient buildClient() {
        validateIndexNameAndEndpoint();
        SearchServiceVersion buildVersion
            = (serviceVersion == null) ? SearchServiceVersion.getLatest() : serviceVersion;

        HttpPipeline pipeline = getHttpPipeline();
        JsonSerializer serializer
            = (jsonSerializer == null) ? JsonSerializerProviders.createInstance(true) : jsonSerializer;
        return new SearchClient(endpoint, indexName, buildVersion, pipeline, serializer,
            Utility.buildRestClient(buildVersion, endpoint, indexName, pipeline));
    }

    /**
     * Creates a {@link SearchAsyncClient} based on options set in the builder. Every time {@code buildAsyncClient()} is
     * called a new instance of {@link SearchAsyncClient} is created.
     * <p>
     * If {@link #pipeline(HttpPipeline) pipeline} is set, then only the {@code pipeline}, {@link #endpoint(String)
     * endpoint}, and {@link #indexName(String) indexName} are used to create the {@link SearchAsyncClient client}. All
     * other builder settings are ignored.
     *
     * @return A SearchClient with the options set from the builder.
     * @throws NullPointerException If {@code indexName} or {@code endpoint} are null.
     * @throws IllegalStateException If both {@link #retryOptions(RetryOptions)}
     * and {@link #retryPolicy(RetryPolicy)} have been set.
     */
    public SearchAsyncClient buildAsyncClient() {
        validateIndexNameAndEndpoint();
        SearchServiceVersion buildVersion
            = (serviceVersion == null) ? SearchServiceVersion.getLatest() : serviceVersion;

        HttpPipeline pipeline = getHttpPipeline();
        JsonSerializer serializer
            = (jsonSerializer == null) ? JsonSerializerProviders.createInstance(true) : jsonSerializer;
        return new SearchAsyncClient(endpoint, indexName, buildVersion, pipeline, serializer,
            Utility.buildRestClient(buildVersion, endpoint, indexName, pipeline));
    }

    /**
     * Create a new instance of {@link SearchIndexingBufferedSenderBuilder} used to configure {@link
     * SearchIndexingBufferedSender SearchIndexingBufferedSenders} and {@link SearchIndexingBufferedAsyncSender
     * SearchIndexingBufferedAsyncSenders}.
     *
     * @param documentType The {@link TypeReference} representing the document type associated with the sender.
     * @param <T> The type of the document that the buffered sender will use.
     * @return A new instance of {@link SearchIndexingBufferedSenderBuilder}.
     */
    public <T> SearchIndexingBufferedSenderBuilder<T> bufferedSender(TypeReference<T> documentType) {
        return new SearchIndexingBufferedSenderBuilder<>();
    }

    private void validateIndexNameAndEndpoint() {
        Objects.requireNonNull(indexName, "'indexName' cannot be null.");
        Objects.requireNonNull(endpoint, "'endpoint' cannot be null.");
    }

    private HttpPipeline getHttpPipeline() {
        if (httpPipeline != null) {
            return httpPipeline;
        }

        return Utility.buildHttpPipeline(clientOptions, httpLogOptions, configuration, retryPolicy, retryOptions,
            azureKeyCredential, tokenCredential, audience, perCallPolicies, perRetryPolicies, httpClient, LOGGER);
    }

    /**
     * Sets the service endpoint for the Azure AI Search instance.
     *
     * @param endpoint The URL of the Azure AI Search instance.
     * @return The updated SearchClientBuilder object.0ed into a valid URL.
     */
    @Override
    public SearchClientBuilder endpoint(String endpoint) {
        try {
            new URL(endpoint);
        } catch (MalformedURLException ex) {
            throw LOGGER.logExceptionAsWarning(new IllegalArgumentException("'endpoint' must be a valid URL", ex));
        }
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Sets the {@link AzureKeyCredential} used to authenticate HTTP requests.
     *
     * @param credential The {@link AzureKeyCredential} used to authenticate HTTP requests.
     * @return The updated SearchClientBuilder object.
     */
    @Override
    public SearchClientBuilder credential(AzureKeyCredential credential) {
        this.azureKeyCredential = credential;
        return this;
    }

    /**
     * Sets the {@link TokenCredential} used to authorize requests sent to the service. Refer to the Azure SDK for Java
     * <a href="https://aka.ms/azsdk/java/docs/identity">identity and authentication</a>
     * documentation for more details on proper usage of the {@link TokenCredential} type.
     *
     * @param credential {@link TokenCredential} used to authorize requests sent to the service.
     * @return The updated SearchClientBuilder object.
     */
    @Override
    public SearchClientBuilder credential(TokenCredential credential) {
        this.tokenCredential = credential;
        return this;
    }

    /**
     * Sets the Audience to use for authentication with Microsoft Entra ID.
     * <p>
     * The audience is not considered when using a {@link #credential(AzureKeyCredential) shared key}.
     * <p>
     * If {@code audience} is null the public cloud audience will be assumed.
     *
     * @param audience The Audience to use for authentication with Microsoft Entra ID.
     * @return The updated SearchClientBuilder object.
     */
    public SearchClientBuilder audience(SearchAudience audience) {
        this.audience = audience;
        return this;
    }

    /**
     * Sets the name of the index.
     *
     * @param indexName Name of the index.
     * @return The updated SearchClientBuilder object.
     * @throws IllegalArgumentException If {@code indexName} is null or empty.
     */
    public SearchClientBuilder indexName(String indexName) {
        if (CoreUtils.isNullOrEmpty(indexName)) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("'indexName' cannot be null or empty."));
        }
        this.indexName = indexName;
        return this;
    }

    /**
     * Sets the {@link HttpLogOptions logging configuration} to use when sending and receiving requests to and from
     * the service. If a {@code logLevel} is not provided, default value of {@link HttpLogDetailLevel#NONE} is set.
     *
     * <p><strong>Note:</strong> It is important to understand the precedence order of the HttpTrait APIs. In
     * particular, if a {@link HttpPipeline} is specified, this takes precedence over all other APIs in the trait, and
     * they will be ignored. If no {@link HttpPipeline} is specified, a HTTP pipeline will be constructed internally
     * based on the settings provided to this trait. Additionally, there may be other APIs in types that implement this
     * trait that are also ignored if an {@link HttpPipeline} is specified, so please be sure to refer to the
     * documentation of types that implement this trait to understand the full set of implications.</p>
     *
     * @param logOptions The {@link HttpLogOptions logging configuration} to use when sending and receiving requests to
     * and from the service.
     * @return The updated SearchClientBuilder object.
     */
    @Override
    public SearchClientBuilder httpLogOptions(HttpLogOptions logOptions) {
        httpLogOptions = logOptions;
        return this;
    }

    /**
     * Gets the default Azure Search headers and query parameters allow list.
     *
     * @return The default {@link HttpLogOptions} allow list.
     */
    public static HttpLogOptions getDefaultLogOptions() {
        return Constants.DEFAULT_LOG_OPTIONS_SUPPLIER.get();
    }

    /**
     * Allows for setting common properties such as application ID, headers, proxy configuration, etc. Note that it is
     * recommended that this method be called with an instance of the {@link HttpClientOptions}
     * class (a subclass of the {@link ClientOptions} base class). The HttpClientOptions subclass provides more
     * configuration options suitable for HTTP clients, which is applicable for any class that implements this HttpTrait
     * interface.
     *
     * <p><strong>Note:</strong> It is important to understand the precedence order of the HttpTrait APIs. In
     * particular, if a {@link HttpPipeline} is specified, this takes precedence over all other APIs in the trait, and
     * they will be ignored. If no {@link HttpPipeline} is specified, a HTTP pipeline will be constructed internally
     * based on the settings provided to this trait. Additionally, there may be other APIs in types that implement this
     * trait that are also ignored if an {@link HttpPipeline} is specified, so please be sure to refer to the
     * documentation of types that implement this trait to understand the full set of implications.</p>
     *
     * @param clientOptions A configured instance of {@link HttpClientOptions}.
     * @return The updated SearchClientBuilder object.
     * @see HttpClientOptions
     */
    @Override
    public SearchClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /**
     * Adds a {@link HttpPipelinePolicy pipeline policy} to apply on each request sent.
     *
     * <p><strong>Note:</strong> It is important to understand the precedence order of the HttpTrait APIs. In
     * particular, if a {@link HttpPipeline} is specified, this takes precedence over all other APIs in the trait, and
     * they will be ignored. If no {@link HttpPipeline} is specified, a HTTP pipeline will be constructed internally
     * based on the settings provided to this trait. Additionally, there may be other APIs in types that implement this
     * trait that are also ignored if an {@link HttpPipeline} is specified, so please be sure to refer to the
     * documentation of types that implement this trait to understand the full set of implications.</p>
     *
     * @param policy A {@link HttpPipelinePolicy pipeline policy}.
     * @return The updated SearchClientBuilder object.
     * @throws NullPointerException If {@code policy} is null.
     */
    @Override
    public SearchClientBuilder addPolicy(HttpPipelinePolicy policy) {
        Objects.requireNonNull(policy, "'policy' cannot be null.");

        if (policy.getPipelinePosition() == HttpPipelinePosition.PER_CALL) {
            perCallPolicies.add(policy);
        } else {
            perRetryPolicies.add(policy);
        }

        return this;
    }

    /**
     * Custom JSON serializer that is used to handle model types that are not contained in the Azure Search Documents
     * library.
     *
     * @param jsonSerializer The serializer to serialize user defined models.
     * @return The updated SearchClientBuilder object.
     */
    public SearchClientBuilder serializer(JsonSerializer jsonSerializer) {
        this.jsonSerializer = jsonSerializer;
        return this;
    }

    /**
     * Sets the {@link HttpClient} to use for sending and receiving requests to and from the service.
     *
     * <p><strong>Note:</strong> It is important to understand the precedence order of the HttpTrait APIs. In
     * particular, if a {@link HttpPipeline} is specified, this takes precedence over all other APIs in the trait, and
     * they will be ignored. If no {@link HttpPipeline} is specified, a HTTP pipeline will be constructed internally
     * based on the settings provided to this trait. Additionally, there may be other APIs in types that implement this
     * trait that are also ignored if an {@link HttpPipeline} is specified, so please be sure to refer to the
     * documentation of types that implement this trait to understand the full set of implications.</p>
     *
     * @param client The {@link HttpClient} to use for requests.
     * @return The updated SearchClientBuilder object.
     */
    @Override
    public SearchClientBuilder httpClient(HttpClient client) {
        if (this.httpClient != null && client == null) {
            LOGGER.info("HttpClient is being set to 'null' when it was previously configured.");
        }

        this.httpClient = client;
        return this;
    }

    /**
     * Sets the {@link HttpPipeline} to use for the service client.
     *
     * <p><strong>Note:</strong> It is important to understand the precedence order of the HttpTrait APIs. In
     * particular, if a {@link HttpPipeline} is specified, this takes precedence over all other APIs in the trait, and
     * they will be ignored. If no {@link HttpPipeline} is specified, a HTTP pipeline will be constructed internally
     * based on the settings provided to this trait. Additionally, there may be other APIs in types that implement this
     * trait that are also ignored if an {@link HttpPipeline} is specified, so please be sure to refer to the
     * documentation of types that implement this trait to understand the full set of implications.</p>
     * <p>
     * If {@code pipeline} is set, all other settings are ignored, aside from {@link #endpoint(String) endpoint} and
     * {@link #indexName(String) index} when building a {@link SearchClient} or {@link SearchAsyncClient}.
     *
     * @param httpPipeline {@link HttpPipeline} to use for sending service requests and receiving responses.
     * @return The updated SearchClientBuilder object.
     */
    @Override
    public SearchClientBuilder pipeline(HttpPipeline httpPipeline) {
        if (this.httpPipeline != null && httpPipeline == null) {
            LOGGER.info("HttpPipeline is being set to 'null' when it was previously configured.");
        }

        this.httpPipeline = httpPipeline;
        return this;
    }

    /**
     * Sets the configuration store that is used during construction of the service client.
     * <p>
     * The default configuration store is a clone of the {@link Configuration#getGlobalConfiguration() global
     * configuration store}, use {@link Configuration#NONE} to bypass using configuration settings during construction.
     *
     * @param configuration The configuration store that will be used.
     * @return The updated SearchClientBuilder object.
     */
    @Override
    public SearchClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Sets the {@link HttpPipelinePolicy} that will attempt to retry requests when needed.
     * <p>
     * A default retry policy will be supplied if one isn't provided.
     * <p>
     * Setting this is mutually exclusive with using {@link #retryOptions(RetryOptions)}.
     *
     * @param retryPolicy The {@link RetryPolicy} that will attempt to retry requests when needed.
     * @return The updated SearchClientBuilder object.
     */
    public SearchClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Sets the {@link RetryOptions} for all the requests made through the client.
     *
     * <p><strong>Note:</strong> It is important to understand the precedence order of the HttpTrait APIs. In
     * particular, if a {@link HttpPipeline} is specified, this takes precedence over all other APIs in the trait, and
     * they will be ignored. If no {@link HttpPipeline} is specified, a HTTP pipeline will be constructed internally
     * based on the settings provided to this trait. Additionally, there may be other APIs in types that implement this
     * trait that are also ignored if an {@link HttpPipeline} is specified, so please be sure to refer to the
     * documentation of types that implement this trait to understand the full set of implications.</p>
     * <p>
     * Setting this is mutually exclusive with using {@link #retryPolicy(RetryPolicy)}.
     *
     * @param retryOptions The {@link RetryOptions} to use for all the requests made through the client.
     * @return The updated SearchClientBuilder object.
     */
    @Override
    public SearchClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * Sets the {@link SearchServiceVersion} that is used when making API requests.
     * <p>
     * If a service version is not provided, {@link SearchServiceVersion#getLatest()} will be used as a default. When
     * the default is used, updating to a newer client library may implicitly use a newer version of the service.
     *
     * @param serviceVersion The version of the service to be used when making requests.
     * @return The updated SearchClientBuilder object.
     */
    public SearchClientBuilder serviceVersion(SearchServiceVersion serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }

    /**
     * This class provides a fluent builder API to help aid the configuration and instantiation of {@link
     * SearchIndexingBufferedSender SearchIndexingBufferedSenders} and {@link SearchIndexingBufferedAsyncSender
     * SearchIndexingBufferedAsyncSenders}. Call {@link #buildSender()} and {@link #buildAsyncSender()} respectively to
     * construct an instance of the desired sender.
     *
     * @param <T> The type of the document that the buffered sender will use.
     * @see SearchIndexingBufferedSender
     * @see SearchIndexingBufferedAsyncSender
     */
    @ServiceClientBuilder(
        serviceClients = { SearchIndexingBufferedSender.class, SearchIndexingBufferedAsyncSender.class })
    public final class SearchIndexingBufferedSenderBuilder<T> {
        private final ClientLogger logger = new ClientLogger(SearchIndexingBufferedSenderBuilder.class);

        private Function<T, String> documentKeyRetriever;

        private boolean autoFlush = DEFAULT_AUTO_FLUSH;
        private Duration autoFlushInterval = DEFAULT_FLUSH_INTERVAL;
        private int initialBatchActionCount = DEFAULT_INITIAL_BATCH_ACTION_COUNT;
        //    private Function<Integer, Integer> scaleDownFunction = DEFAULT_SCALE_DOWN_FUNCTION;
        private int maxRetriesPerAction = DEFAULT_MAX_RETRIES_PER_ACTION;
        private Duration throttlingDelay = DEFAULT_THROTTLING_DELAY;
        private Duration maxThrottlingDelay = DEFAULT_MAX_THROTTLING_DELAY;

        private Consumer<OnActionAddedOptions<T>> onActionAddedConsumer;
        private Consumer<OnActionSucceededOptions<T>> onActionSucceededConsumer;
        private Consumer<OnActionErrorOptions<T>> onActionErrorConsumer;
        private Consumer<OnActionSentOptions<T>> onActionSentConsumer;

        private SearchIndexingBufferedSenderBuilder() {
        }

        /**
         * Creates a {@link SearchIndexingBufferedSender} based on options set in the builder. Every time this is called
         * a new instance of {@link SearchIndexingBufferedSender} is created.
         *
         * @return A SearchIndexingBufferedSender with the options set from the builder.
         * @throws NullPointerException If {@code indexName}, {@code endpoint}, or {@code documentKeyRetriever} are
         * null.
         * @throws IllegalStateException If both {@link #retryOptions(RetryOptions)}
         * and {@link #retryPolicy(RetryPolicy)} have been set.
         */
        public SearchIndexingBufferedSender<T> buildSender() {
            validateIndexNameAndEndpoint();
            Objects.requireNonNull(documentKeyRetriever, "'documentKeyRetriever' cannot be null");

            SearchServiceVersion buildVersion
                = (serviceVersion == null) ? SearchServiceVersion.getLatest() : serviceVersion;

            JsonSerializer serializer
                = (jsonSerializer == null) ? JsonSerializerProviders.createInstance(true) : jsonSerializer;
            return new SearchIndexingBufferedSender<>(
                buildRestClient(buildVersion, endpoint, indexName, getHttpPipeline()), serializer, documentKeyRetriever,
                autoFlush, autoFlushInterval, initialBatchActionCount, maxRetriesPerAction, throttlingDelay,
                maxThrottlingDelay, onActionAddedConsumer, onActionSucceededConsumer, onActionErrorConsumer,
                onActionSentConsumer);
        }

        /**
         * Creates a {@link SearchIndexingBufferedAsyncSender} based on options set in the builder. Every time this is
         * called a new instance of {@link SearchIndexingBufferedAsyncSender} is created.
         *
         * @return A SearchIndexingBufferedAsyncSender with the options set from the builder.
         * @throws NullPointerException If {@code indexName}, {@code endpoint}, or {@code documentKeyRetriever} are
         * null.
         * @throws IllegalStateException If both {@link #retryOptions(RetryOptions)}
         * and {@link #retryPolicy(RetryPolicy)} have been set.
         */
        public SearchIndexingBufferedAsyncSender<T> buildAsyncSender() {
            validateIndexNameAndEndpoint();
            Objects.requireNonNull(documentKeyRetriever, "'documentKeyRetriever' cannot be null");

            SearchServiceVersion buildVersion
                = (serviceVersion == null) ? SearchServiceVersion.getLatest() : serviceVersion;

            JsonSerializer serializer
                = (jsonSerializer == null) ? JsonSerializerProviders.createInstance(true) : jsonSerializer;
            return new SearchIndexingBufferedAsyncSender<>(
                buildRestClient(buildVersion, endpoint, indexName, getHttpPipeline()), serializer, documentKeyRetriever,
                autoFlush, autoFlushInterval, initialBatchActionCount, maxRetriesPerAction, throttlingDelay,
                maxThrottlingDelay, onActionAddedConsumer, onActionSucceededConsumer, onActionErrorConsumer,
                onActionSentConsumer);
        }

        /**
         * Sets the flag determining whether a buffered sender will automatically flush its document batch based on the
         * configurations of {@link #autoFlushInterval(Duration)} and {@link #initialBatchActionCount(int)}.
         *
         * @param autoFlush Flag determining whether a buffered sender will automatically flush.
         * @return The updated SearchIndexingBufferedSenderBuilder object.
         */
        public SearchIndexingBufferedSenderBuilder<T> autoFlush(boolean autoFlush) {
            this.autoFlush = autoFlush;
            return this;
        }

        /**
         * Sets the duration between a buffered sender sending documents to be indexed.
         * <p>
         * The buffered sender will reset the duration when documents are sent for indexing, either by reaching {@link
         * #initialBatchActionCount(int)} or by a manual trigger.
         * <p>
         * If {@code autoFlushInterval} is negative or zero and {@link #autoFlush(boolean)} is enabled the buffered
         * sender will only flush when {@link #initialBatchActionCount(int)} is met.
         *
         * @param autoFlushInterval Duration between document batches being sent for indexing.
         * @return The updated SearchIndexingBufferedSenderBuilder object.
         * @throws NullPointerException If {@code autoFlushInterval} is null.
         */
        public SearchIndexingBufferedSenderBuilder<T> autoFlushInterval(Duration autoFlushInterval) {
            Objects.requireNonNull(autoFlushInterval, "'autoFlushInterval' cannot be null.");

            this.autoFlushInterval = autoFlushInterval;
            return this;
        }

        /**
         * Sets the number of documents before a buffered sender will send the batch to be indexed.
         * <p>
         * This will only trigger a batch to be sent automatically if {@link #autoFlushInterval} is configured. Default
         * value is {@code 512}.
         *
         * @param initialBatchActionCount The number of documents in a batch that will trigger it to be indexed.
         * @return The updated SearchIndexingBufferedSenderBuilder object.
         * @throws IllegalArgumentException If {@code batchSize} is less than one.
         */
        public SearchIndexingBufferedSenderBuilder<T> initialBatchActionCount(int initialBatchActionCount) {
            if (initialBatchActionCount < 1) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'batchSize' cannot be less than one."));
            }

            this.initialBatchActionCount = initialBatchActionCount;
            return this;
        }

        // Retaining this commented out code as it may be added back in a future release.
        //    /**
        //     * Sets the function that handles scaling down the batch size when a 413 (Payload too large) response is returned
        //     * by the service.
        //     * <p>
        //     * By default the batch size will halve when a 413 is returned with a minimum allowed value of one.
        //     *
        //     * @param scaleDownFunction The batch size scale down function.
        //     * @return The updated SearchIndexingBufferedSenderOptions object.
        //     * @throws NullPointerException If {@code scaleDownFunction} is null.
        //     */
        //    public SearchIndexingBufferedSenderOptions<T> setPayloadTooLargeScaleDown(
        //        Function<Integer, Integer> scaleDownFunction) {
        //        this.scaleDownFunction = Objects.requireNonNull(scaleDownFunction, "'scaleDownFunction' cannot be null.");
        //        return this;
        //    }

        // Retaining this commented out code as it may be added back in a future release.
        //    /**
        //     * Gets the function that handles scaling down the batch size when a 413 (Payload too large) response is returned
        //     * by the service.
        //     * <p>
        //     * By default the batch size will halve when a 413 is returned with a minimum allowed value of one.
        //     *
        //     * @return The batch size scale down function.
        //     */
        //    public Function<Integer, Integer> getPayloadTooLargeScaleDown() {
        //        return scaleDownFunction;
        //    }

        /**
         * Sets the number of times an action will retry indexing before it is considered failed.
         * <p>
         * Documents are only retried on retryable status codes.
         * <p>
         * Default value is {@code 3}.
         *
         * @param maxRetriesPerAction The number of times a document will retry indexing before it is considered
         * failed.
         * @return The updated SearchIndexingBufferedSenderBuilder object.
         * @throws IllegalArgumentException If {@code maxRetriesPerAction} is less than one.
         */
        public SearchIndexingBufferedSenderBuilder<T> maxRetriesPerAction(int maxRetriesPerAction) {
            if (maxRetriesPerAction < 1) {
                throw logger.logExceptionAsError(new IllegalArgumentException("'maxRetries' cannot be less than one."));
            }

            this.maxRetriesPerAction = maxRetriesPerAction;
            return this;
        }

        /**
         * Sets the initial duration that requests will be delayed when the service is throttling.
         * <p>
         * Default value is {@code Duration.ofMillis(800)}.
         *
         * @param throttlingDelay The initial duration requests will delay when the service is throttling.
         * @return The updated SearchIndexingBufferedSenderBuilder object.
         * @throws IllegalArgumentException If {@code throttlingDelay.isNegative()} or {@code throttlingDelay.isZero()}
         * is true.
         * @throws NullPointerException If {@code throttlingDelay} is null.
         */
        public SearchIndexingBufferedSenderBuilder<T> throttlingDelay(Duration throttlingDelay) {
            Objects.requireNonNull(throttlingDelay, "'throttlingDelay' cannot be null.");

            if (throttlingDelay.isNegative() || throttlingDelay.isZero()) {
                throw logger
                    .logExceptionAsError(new IllegalArgumentException("'throttlingDelay' cannot be negative or zero."));
            }

            this.throttlingDelay = throttlingDelay;
            return this;
        }

        /**
         * Sets the maximum duration that requests will be delayed when the service is throttling.
         * <p>
         * If {@code maxThrottlingDelay} is less than {@link #throttlingDelay(Duration)} then {@link
         * #throttlingDelay(Duration)} will be used as the maximum delay.
         * <p>
         * Default value is {@code Duration.ofMinutes(1)}.
         *
         * @param maxThrottlingDelay The maximum duration requests will delay when the service is throttling.
         * @return The updated SearchIndexingBufferedSenderBuilder object.
         * @throws IllegalArgumentException If {@code maxThrottlingDelay.isNegative()} or {@code
         * maxThrottlingDelay.isZero()} is true.
         * @throws NullPointerException If {@code maxThrottlingDelay} is null.
         */
        public SearchIndexingBufferedSenderBuilder<T> maxThrottlingDelay(Duration maxThrottlingDelay) {
            Objects.requireNonNull(maxThrottlingDelay, "'maxThrottlingDelay' cannot be null.");

            if (maxThrottlingDelay.isNegative() || maxThrottlingDelay.isZero()) {
                throw logger.logExceptionAsError(
                    new IllegalArgumentException("'maxThrottlingDelay' cannot be negative or zero."));
            }

            this.maxThrottlingDelay = maxThrottlingDelay;
            return this;
        }

        /**
         * Callback hook for when a document indexing action has been added to a batch queued.
         *
         * @param onActionAddedConsumer The {@link Consumer} that is called when a document has been added to a batch
         * queue.
         * @return The updated SearchIndexingBufferedSenderBuilder object.
         */
        public SearchIndexingBufferedSenderBuilder<T>
            onActionAdded(Consumer<OnActionAddedOptions<T>> onActionAddedConsumer) {
            this.onActionAddedConsumer = onActionAddedConsumer;
            return this;
        }

        /**
         * Sets the callback hook for when a document indexing action has successfully completed indexing.
         *
         * @param onActionSucceededConsumer The {@link Consumer} that is called when a document has been successfully
         * indexing.
         * @return The updated SearchIndexingBufferedSenderBuilder object.
         */
        public SearchIndexingBufferedSenderBuilder<T>
            onActionSucceeded(Consumer<OnActionSucceededOptions<T>> onActionSucceededConsumer) {
            this.onActionSucceededConsumer = onActionSucceededConsumer;
            return this;
        }

        /**
         * Sets the callback hook for when a document indexing action has failed to index and isn't retryable.
         *
         * @param onActionErrorConsumer The {@link Consumer} that is called when a document has failed to index and
         * isn't retryable.
         * @return The updated SearchIndexingBufferedSenderBuilder object.
         */
        public SearchIndexingBufferedSenderBuilder<T>
            onActionError(Consumer<OnActionErrorOptions<T>> onActionErrorConsumer) {
            this.onActionErrorConsumer = onActionErrorConsumer;
            return this;
        }

        /**
         * Sets the callback hook for when a document indexing has been sent in a batching request.
         *
         * @param onActionSentConsumer The {@link Consumer} that is called when a document has been sent in a batch
         * request.
         * @return The updated SearchIndexingBufferedSenderBuilder object.
         */
        public SearchIndexingBufferedSenderBuilder<T>
            onActionSent(Consumer<OnActionSentOptions<T>> onActionSentConsumer) {
            this.onActionSentConsumer = onActionSentConsumer;
            return this;
        }

        /**
         * Sets the function that retrieves the key value from a document.
         *
         * @param documentKeyRetriever Function that retrieves the key from an {@link IndexAction}.
         * @return The updated SearchIndexingBufferedSenderBuilder object.
         * @throws NullPointerException If {@code documentKeyRetriever} is null.
         */
        public SearchIndexingBufferedSenderBuilder<T> documentKeyRetriever(Function<T, String> documentKeyRetriever) {
            this.documentKeyRetriever
                = Objects.requireNonNull(documentKeyRetriever, "'documentKeyRetriever' cannot be null");
            return this;
        }
    }
}
