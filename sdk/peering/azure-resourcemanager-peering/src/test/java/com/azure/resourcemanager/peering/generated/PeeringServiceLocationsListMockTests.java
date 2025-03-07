// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.peering.PeeringManager;
import com.azure.resourcemanager.peering.models.PeeringServiceLocation;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PeeringServiceLocationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"country\":\"loxggdufiqn\",\"state\":\"euzaof\",\"azureRegion\":\"hvcyyysfg\"},\"id\":\"otcubi\",\"name\":\"p\",\"type\":\"ipwoqonmacjek\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PeeringManager manager = PeeringManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PeeringServiceLocation> response
            = manager.peeringServiceLocations().list("wjhhgdnhxmsivf", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("loxggdufiqn", response.iterator().next().country());
        Assertions.assertEquals("euzaof", response.iterator().next().state());
        Assertions.assertEquals("hvcyyysfg", response.iterator().next().azureRegion());
    }
}
