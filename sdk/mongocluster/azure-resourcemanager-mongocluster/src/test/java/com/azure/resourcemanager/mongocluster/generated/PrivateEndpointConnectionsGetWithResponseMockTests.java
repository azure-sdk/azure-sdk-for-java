// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mongocluster.MongoClusterManager;
import com.azure.resourcemanager.mongocluster.models.PrivateEndpointConnectionResource;
import com.azure.resourcemanager.mongocluster.models.PrivateEndpointServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"groupIds\":[\"jrunmpxtt\"],\"privateEndpoint\":{\"id\":\"rbnlankxmyskp\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"btkcxywnytnrsyn\",\"actionsRequired\":\"idybyxczf\"},\"provisioningState\":\"Deleting\"},\"id\":\"axdbabph\",\"name\":\"wrqlfktsthsuco\",\"type\":\"mnyyazt\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MongoClusterManager manager = MongoClusterManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PrivateEndpointConnectionResource response = manager.privateEndpointConnections()
            .getWithResponse("uynhijg", "mebf", "iarbutrcvpna", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            response.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("btkcxywnytnrsyn",
            response.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("idybyxczf",
            response.properties().privateLinkServiceConnectionState().actionsRequired());
    }
}
