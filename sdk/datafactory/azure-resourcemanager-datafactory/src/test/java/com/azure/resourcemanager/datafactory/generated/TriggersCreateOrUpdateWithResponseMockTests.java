// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.Trigger;
import com.azure.resourcemanager.datafactory.models.TriggerResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TriggersCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"type\":\"Trigger\",\"description\":\"mm\",\"runtimeState\":\"Started\",\"annotations\":[\"datazfjlprljil\",\"datauavxidy\",\"datajmkfxzg\",\"datap\"],\"fbreyvrlycikwqt\":\"datama\"},\"name\":\"fryourlywxjvsqz\",\"type\":\"ysqy\",\"etag\":\"sqmikljc\",\"id\":\"ot\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        TriggerResource response = manager.triggers()
            .define("sktzrdxxsbbdo")
            .withExistingFactory("usxyugidkgsjivdt", "tkqqdqxslbrttlw")
            .withProperties(new Trigger().withDescription("jnbcdnjexcyh")
                .withAnnotations(Arrays.asList("dataraubx", "databmqgimwivqph"))
                .withAdditionalProperties(mapOf("mdx", "dataiwm", "twnhpcfsqdzi", "datawfajajpojzazzaks",
                    "qvinvryxwzxjxotp", "datavykysavevnerpyzu", "kinsry", "dataokmdaihgig", "type", "Trigger",
                    "runtimeState", "Stopped")))
            .withIfMatch("nyzytgkdw")
            .create();

        Assertions.assertEquals("ot", response.id());
        Assertions.assertEquals("mm", response.properties().description());
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
