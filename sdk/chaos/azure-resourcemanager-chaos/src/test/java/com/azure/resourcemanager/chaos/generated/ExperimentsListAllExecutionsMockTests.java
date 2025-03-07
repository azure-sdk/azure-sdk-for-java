// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.chaos.ChaosManager;
import com.azure.resourcemanager.chaos.models.ExperimentExecution;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ExperimentsListAllExecutionsMockTests {
    @Test
    public void testListAllExecutions() throws Exception {
        String responseStr
            = "{\"value\":[{\"type\":\"jw\",\"id\":\"wqiok\",\"name\":\"sx\",\"properties\":{\"status\":\"msvpkjpr\",\"startedAt\":\"2021-06-29T04:33:46Z\",\"stoppedAt\":\"2021-06-26T08:15:06Z\"}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ChaosManager manager = ChaosManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ExperimentExecution> response
            = manager.experiments().listAllExecutions("ceamtm", "zuo", com.azure.core.util.Context.NONE);

    }
}
