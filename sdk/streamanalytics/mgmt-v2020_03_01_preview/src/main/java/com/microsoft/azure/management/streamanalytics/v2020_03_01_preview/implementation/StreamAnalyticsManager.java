/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Functions;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Inputs;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Outputs;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.StreamingJobs;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Subscriptions;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Transformations;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Operations;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.Clusters;
import com.microsoft.azure.management.streamanalytics.v2020_03_01_preview.PrivateEndpoints;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure StreamAnalytics resource management.
 */
public final class StreamAnalyticsManager extends ManagerCore<StreamAnalyticsManager, StreamAnalyticsManagementClientImpl> {
    private Functions functions;
    private Inputs inputs;
    private Outputs outputs;
    private StreamingJobs streamingJobs;
    private Subscriptions subscriptions;
    private Transformations transformations;
    private Operations operations;
    private Clusters clusters;
    private PrivateEndpoints privateEndpoints;
    /**
    * Get a Configurable instance that can be used to create StreamAnalyticsManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new StreamAnalyticsManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of StreamAnalyticsManager that exposes StreamAnalytics resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the StreamAnalyticsManager
    */
    public static StreamAnalyticsManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new StreamAnalyticsManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of StreamAnalyticsManager that exposes StreamAnalytics resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the StreamAnalyticsManager
    */
    public static StreamAnalyticsManager authenticate(RestClient restClient, String subscriptionId) {
        return new StreamAnalyticsManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of StreamAnalyticsManager that exposes StreamAnalytics management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing StreamAnalytics management API entry points that work across subscriptions
        */
        StreamAnalyticsManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Functions.
     */
    public Functions functions() {
        if (this.functions == null) {
            this.functions = new FunctionsImpl(this);
        }
        return this.functions;
    }

    /**
     * @return Entry point to manage Inputs.
     */
    public Inputs inputs() {
        if (this.inputs == null) {
            this.inputs = new InputsImpl(this);
        }
        return this.inputs;
    }

    /**
     * @return Entry point to manage Outputs.
     */
    public Outputs outputs() {
        if (this.outputs == null) {
            this.outputs = new OutputsImpl(this);
        }
        return this.outputs;
    }

    /**
     * @return Entry point to manage StreamingJobs.
     */
    public StreamingJobs streamingJobs() {
        if (this.streamingJobs == null) {
            this.streamingJobs = new StreamingJobsImpl(this);
        }
        return this.streamingJobs;
    }

    /**
     * @return Entry point to manage Subscriptions.
     */
    public Subscriptions subscriptions() {
        if (this.subscriptions == null) {
            this.subscriptions = new SubscriptionsImpl(this);
        }
        return this.subscriptions;
    }

    /**
     * @return Entry point to manage Transformations.
     */
    public Transformations transformations() {
        if (this.transformations == null) {
            this.transformations = new TransformationsImpl(this);
        }
        return this.transformations;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Clusters.
     */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(this);
        }
        return this.clusters;
    }

    /**
     * @return Entry point to manage PrivateEndpoints.
     */
    public PrivateEndpoints privateEndpoints() {
        if (this.privateEndpoints == null) {
            this.privateEndpoints = new PrivateEndpointsImpl(this);
        }
        return this.privateEndpoints;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public StreamAnalyticsManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return StreamAnalyticsManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private StreamAnalyticsManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new StreamAnalyticsManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
