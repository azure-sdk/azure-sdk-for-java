// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.batch.BatchManager;
import com.azure.resourcemanager.batch.models.DetectorResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BatchAccountsListDetectorsMockTests {
    @Test
    public void testListDetectors() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"value\":\"fajnjwltlwtjjguk\"},\"etag\":\"lhsnvkcdmx\",\"tags\":{\"aaomylweazu\":\"oaimlnw\",\"hwwn\":\"cse\",\"ousnfepgfewe\":\"jhlfzswpchwahf\",\"hdjhlimmbcx\":\"wlyxgncxyk\"},\"id\":\"h\",\"name\":\"cporxvxcjz\",\"type\":\"qizxfpxtgqscjavf\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BatchManager manager = BatchManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DetectorResponse> response
            = manager.batchAccounts().listDetectors("yhohujswtwkozzwc", "lkb", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("oaimlnw", response.iterator().next().tags().get("aaomylweazu"));
        Assertions.assertEquals("fajnjwltlwtjjguk", response.iterator().next().value());
    }
}
