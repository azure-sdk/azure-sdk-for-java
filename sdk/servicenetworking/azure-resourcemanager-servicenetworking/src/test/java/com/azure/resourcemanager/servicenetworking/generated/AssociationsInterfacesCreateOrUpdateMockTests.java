// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicenetworking.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.servicenetworking.TrafficControllerManager;
import com.azure.resourcemanager.servicenetworking.models.Association;
import com.azure.resourcemanager.servicenetworking.models.AssociationProperties;
import com.azure.resourcemanager.servicenetworking.models.AssociationSubnet;
import com.azure.resourcemanager.servicenetworking.models.AssociationType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AssociationsInterfacesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"associationType\":\"subnets\",\"subnet\":{\"id\":\"dxyt\"},\"provisioningState\":\"Succeeded\"},\"location\":\"rxv\",\"tags\":{\"zntxhdz\":\"dw\"},\"id\":\"lrqjbhckfr\",\"name\":\"hrxsbk\",\"type\":\"vpycanuzbp\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        TrafficControllerManager manager = TrafficControllerManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Association response = manager.associationsInterfaces()
            .define("nmic")
            .withRegion("jbkcnxdhbttkph")
            .withExistingTrafficController("svlxotogtwrup", "sx")
            .withTags(mapOf("t", "nv", "crpab", "qnermclfplphoxu", "sbj", "ye", "wfqkquj", "azqugxywpmueefj"))
            .withProperties(new AssociationProperties().withAssociationType(AssociationType.SUBNETS)
                .withSubnet(new AssociationSubnet().withId("eoveilovnotyf")))
            .create();

        Assertions.assertEquals("rxv", response.location());
        Assertions.assertEquals("dw", response.tags().get("zntxhdz"));
        Assertions.assertEquals(AssociationType.SUBNETS, response.properties().associationType());
        Assertions.assertEquals("dxyt", response.properties().subnet().id());
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
