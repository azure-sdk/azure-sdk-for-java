// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager;
import com.azure.resourcemanager.newrelicobservability.models.ConfigurationName;
import com.azure.resourcemanager.newrelicobservability.models.MonitoredSubscriptionProperties;
import com.azure.resourcemanager.newrelicobservability.models.PatchOperation;
import com.azure.resourcemanager.newrelicobservability.models.Status;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class MonitoredSubscriptionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"patchOperation\":\"AddComplete\",\"monitoredSubscriptionList\":[{\"subscriptionId\":\"kfpagao\",\"status\":\"Deleting\",\"error\":\"pqblylsyxkqjnsj\",\"tagRules\":{\"provisioningState\":\"Updating\",\"logRules\":{},\"metricRules\":{}}},{\"subscriptionId\":\"xsdszuempsb\",\"status\":\"InProgress\",\"error\":\"beyvpnqicvinvkjj\",\"tagRules\":{\"provisioningState\":\"Canceled\",\"logRules\":{},\"metricRules\":{}}},{\"subscriptionId\":\"kzclewyh\",\"status\":\"InProgress\",\"error\":\"aztz\",\"tagRules\":{\"provisioningState\":\"Creating\",\"logRules\":{},\"metricRules\":{}}},{\"subscriptionId\":\"wyfzqwhxxbuyqa\",\"status\":\"Failed\",\"error\":\"qztpp\",\"tagRules\":{\"provisioningState\":\"Updating\",\"logRules\":{},\"metricRules\":{}}}],\"provisioningState\":\"NotSpecified\"},\"id\":\"altol\",\"name\":\"ncwsob\",\"type\":\"wcsdbnwdcfhucq\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NewRelicObservabilityManager manager = NewRelicObservabilityManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        MonitoredSubscriptionProperties response = manager.monitoredSubscriptions()
            .getWithResponse("vdkcrodtj", "nfwjlfltkacjvefk", ConfigurationName.DEFAULT,
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(PatchOperation.ADD_COMPLETE, response.properties().patchOperation());
        Assertions.assertEquals("kfpagao", response.properties().monitoredSubscriptionList().get(0).subscriptionId());
        Assertions.assertEquals(Status.DELETING, response.properties().monitoredSubscriptionList().get(0).status());
        Assertions.assertEquals("pqblylsyxkqjnsj", response.properties().monitoredSubscriptionList().get(0).error());
    }
}
