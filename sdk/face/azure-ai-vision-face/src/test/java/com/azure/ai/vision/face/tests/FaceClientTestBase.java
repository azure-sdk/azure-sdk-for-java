// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face.tests;

import com.azure.ai.vision.face.*;
import com.azure.ai.vision.face.samples.utils.ConfigurationHelper;
import com.azure.core.client.traits.EndpointTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.client.traits.KeyCredentialTrait;
import com.azure.core.client.traits.TokenCredentialTrait;
import com.azure.core.credential.KeyCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.test.http.AssertingHttpClientBuilder;
import com.azure.core.test.utils.MockTokenCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;

import java.util.HashMap;

public class FaceClientTestBase extends TestProxyTestBase {
    private static final HashMap<Class<?>, Function<FaceClientTestBase, HttpClient, FaceServiceVersion, Object>> TYPE_MAP = new HashMap<Class<?>, Function<FaceClientTestBase, HttpClient, FaceServiceVersion, Object>>() {{
            put(FaceClient.class, (testBase, httpClient, serviceVersion) ->
                testBase.getFaceClientBuilder(serviceVersion, httpClient).buildClient());
            put(FaceAsyncClient.class, (testBase, httpClient, serviceVersion) ->
                testBase.getFaceClientBuilder(serviceVersion, httpClient).buildAsyncClient());
            put(FaceAdministrationClient.class, (testBase, httpClient, serviceVersion)  ->
                testBase.getFaceAdministrationClientBuilder(serviceVersion, httpClient).buildClient());
            put(FaceAdministrationAsyncClient.class, (testBase, httpClient, serviceVersion)  ->
                testBase.getFaceAdministrationClientBuilder(serviceVersion, httpClient).buildAsyncClient());
            put(FaceSessionClient.class, (testBase, httpClient, serviceVersion) ->
                testBase.getFaceSessionClientBuilder(serviceVersion, httpClient).buildClient());
            put(FaceSessionAsyncClient.class, (testBase, httpClient, serviceVersion) ->
                testBase.getFaceSessionClientBuilder(serviceVersion, httpClient).buildAsyncClient());
        }};

    protected <T> T createClient(Class<T> clazz) {
        return createClient(clazz, null, null);
    }

    @SuppressWarnings("unchecked")
    protected <T> T createClient(Class<T> clazz, HttpClient httpClient, FaceServiceVersion serviceVersion) {
        Function<FaceClientTestBase, HttpClient, FaceServiceVersion, Object> creator = TYPE_MAP.get(clazz);
        if (null == creator) {
            throw new IllegalArgumentException("No such client type: " + clazz);
        }

        return (T) creator.apply(this, httpClient, serviceVersion);
    }

    protected HttpClient buildSyncAssertingClient(HttpClient httpClient) {
        return new AssertingHttpClientBuilder(interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient)
            .skipRequest((ignored1, ignored2) -> false)
            .assertSync()
            .build();
    }

    protected HttpClient buildAsyncAssertingClient(HttpClient httpClient) {
        return new AssertingHttpClientBuilder(interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient)
            .skipRequest((ignored1, ignored2) -> false)
            .assertAsync()
            .build();
    }

    private FaceClientBuilder getFaceClientBuilder(FaceServiceVersion serviceVersion, HttpClient httpClient) {
        return this.configureBuilder(new FaceClientBuilder().serviceVersion(serviceVersion), httpClient);
    }

    private FaceAdministrationClientBuilder getFaceAdministrationClientBuilder(FaceServiceVersion serviceVersion, HttpClient httpClient) {
        return this.configureBuilder(new FaceAdministrationClientBuilder().serviceVersion(serviceVersion), httpClient);
    }

    private FaceSessionClientBuilder getFaceSessionClientBuilder(FaceServiceVersion serviceVersion, HttpClient httpClient) {
        return this.configureBuilder(new FaceSessionClientBuilder().serviceVersion(serviceVersion), httpClient);
    }

    private <T extends HttpTrait<T> & TokenCredentialTrait<T> & KeyCredentialTrait<T> & EndpointTrait<T>> T configureBuilder(
        T clientBuilder, HttpClient httpClient) {
        clientBuilder.endpoint(ConfigurationHelper.getEndpoint())
            .httpClient(httpClient != null  ? httpClient : HttpClient.createDefault())
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));

        switch (getTestMode()) {
            case PLAYBACK:
                return configureForPlayBackMode(clientBuilder);
            case RECORD:
                return configureForRecordMode(clientBuilder);
            case LIVE:
                return configureForLiveMode(clientBuilder);
            default:
                throw new IllegalStateException("Incorrect test mode:" + getTestMode());
        }
    }

    private <T extends HttpTrait<T> & TokenCredentialTrait<T> & KeyCredentialTrait<T>> T configureCredential(T clientBuilder) {
        String accountKey = ConfigurationHelper.getAccountKey();
        if (accountKey != null && !accountKey.isEmpty()) {
            return clientBuilder.credential(new KeyCredential(accountKey));
        }

        return clientBuilder.credential(new DefaultAzureCredentialBuilder().build());
    }

    private <T extends HttpTrait<T> & TokenCredentialTrait<T> & KeyCredentialTrait<T>> T configureForPlayBackMode(T clientBuilder) {
        return clientBuilder
            .httpClient(interceptorManager.getPlaybackClient())
            .credential(new MockTokenCredential());
    }

    private <T extends HttpTrait<T> & TokenCredentialTrait<T> & KeyCredentialTrait<T>> T configureForRecordMode(T clientBuilder) {
        return configureCredential(clientBuilder)
            .addPolicy(interceptorManager.getRecordPolicy());
    }

    private <T extends HttpTrait<T> & TokenCredentialTrait<T> & KeyCredentialTrait<T>> T configureForLiveMode(T clientBuilder) {
        return configureCredential(clientBuilder);
    }

    @FunctionalInterface
    interface Function<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}

