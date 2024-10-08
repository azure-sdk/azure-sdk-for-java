// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.botservice.BotServiceManager;
import com.azure.resourcemanager.botservice.models.PrivateEndpoint;
import com.azure.resourcemanager.botservice.models.PrivateEndpointConnection;
import com.azure.resourcemanager.botservice.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.botservice.models.PrivateLinkServiceConnectionState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"privateEndpoint\":{\"id\":\"mcwaekrrjr\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"tsgumhj\",\"actionsRequired\":\"ikkx\"},\"provisioningState\":\"Succeeded\",\"groupIds\":[\"bq\",\"vuzlm\",\"felfktg\",\"lcrpw\"]},\"id\":\"xeznoi\",\"name\":\"brnjwmw\",\"type\":\"pn\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BotServiceManager manager = BotServiceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PrivateEndpointConnection response = manager.privateEndpointConnections()
            .define("bnhlmc")
            .withExistingBotService("gsopbyrqufegxu", "wz")
            .withPrivateEndpoint(new PrivateEndpoint())
            .withPrivateLinkServiceConnectionState(
                new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.PENDING)
                    .withDescription("jvegrhbpnaixexcc")
                    .withActionsRequired("reaxhcexdr"))
            .withGroupIds(Arrays.asList("qkghtpwijnhy"))
            .create();

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.APPROVED,
            response.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("tsgumhj", response.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("ikkx", response.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("bq", response.groupIds().get(0));
    }
}
