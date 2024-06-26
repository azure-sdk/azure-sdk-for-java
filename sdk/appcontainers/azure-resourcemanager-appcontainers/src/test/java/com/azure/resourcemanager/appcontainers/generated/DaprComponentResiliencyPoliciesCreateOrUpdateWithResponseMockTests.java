// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.appcontainers.ContainerAppsApiManager;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicy;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicyTimeoutPolicyConfiguration;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class DaprComponentResiliencyPoliciesCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"inboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":2061685284,\"retryBackOff\":{\"initialDelayInMilliseconds\":76340315,\"maxIntervalInMilliseconds\":1313860717}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":1186020907},\"circuitBreakerPolicy\":{\"consecutiveErrors\":1701022036,\"timeoutInSeconds\":2062030350,\"intervalInSeconds\":700693046}},\"outboundPolicy\":{\"httpRetryPolicy\":{\"maxRetries\":562282561,\"retryBackOff\":{\"initialDelayInMilliseconds\":644167930,\"maxIntervalInMilliseconds\":1581599883}},\"timeoutPolicy\":{\"responseTimeoutInSeconds\":285262475},\"circuitBreakerPolicy\":{\"consecutiveErrors\":620670470,\"timeoutInSeconds\":1906572737,\"intervalInSeconds\":445835887}}},\"id\":\"jod\",\"name\":\"cbjqqwmtqsm\",\"type\":\"xsazuxejgw\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        ContainerAppsApiManager manager = ContainerAppsApiManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        DaprComponentResiliencyPolicy response = manager.daprComponentResiliencyPolicies().define("vctkbbx")
            .withExistingDaprComponent("wetjtdrhutf", "oadtxopgehpadkmd", "gssz")
            .withInboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                .withHttpRetryPolicy(
                    new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(989359747)
                        .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()
                            .withInitialDelayInMilliseconds(1895023582).withMaxIntervalInMilliseconds(1275197408)))
                .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                    .withResponseTimeoutInSeconds(1486832256))
                .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                    .withConsecutiveErrors(18849329).withTimeoutInSeconds(946198346).withIntervalInSeconds(758730321)))
            .withOutboundPolicy(new DaprComponentResiliencyPolicyConfiguration()
                .withHttpRetryPolicy(
                    new DaprComponentResiliencyPolicyHttpRetryPolicyConfiguration().withMaxRetries(380797824)
                        .withRetryBackOff(new DaprComponentResiliencyPolicyHttpRetryBackOffConfiguration()
                            .withInitialDelayInMilliseconds(187800600).withMaxIntervalInMilliseconds(1759604216)))
                .withTimeoutPolicy(new DaprComponentResiliencyPolicyTimeoutPolicyConfiguration()
                    .withResponseTimeoutInSeconds(1843031385))
                .withCircuitBreakerPolicy(new DaprComponentResiliencyPolicyCircuitBreakerPolicyConfiguration()
                    .withConsecutiveErrors(221407560).withTimeoutInSeconds(2145155757).withIntervalInSeconds(20348867)))
            .create();

        Assertions.assertEquals(2061685284, response.inboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(76340315,
            response.inboundPolicy().httpRetryPolicy().retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(1313860717,
            response.inboundPolicy().httpRetryPolicy().retryBackOff().maxIntervalInMilliseconds());
        Assertions.assertEquals(1186020907, response.inboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(1701022036, response.inboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(2062030350, response.inboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(700693046, response.inboundPolicy().circuitBreakerPolicy().intervalInSeconds());
        Assertions.assertEquals(562282561, response.outboundPolicy().httpRetryPolicy().maxRetries());
        Assertions.assertEquals(644167930,
            response.outboundPolicy().httpRetryPolicy().retryBackOff().initialDelayInMilliseconds());
        Assertions.assertEquals(1581599883,
            response.outboundPolicy().httpRetryPolicy().retryBackOff().maxIntervalInMilliseconds());
        Assertions.assertEquals(285262475, response.outboundPolicy().timeoutPolicy().responseTimeoutInSeconds());
        Assertions.assertEquals(620670470, response.outboundPolicy().circuitBreakerPolicy().consecutiveErrors());
        Assertions.assertEquals(1906572737, response.outboundPolicy().circuitBreakerPolicy().timeoutInSeconds());
        Assertions.assertEquals(445835887, response.outboundPolicy().circuitBreakerPolicy().intervalInSeconds());
    }
}
