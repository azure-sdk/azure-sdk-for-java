// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.automation.AutomationManager;
import com.azure.resourcemanager.automation.models.JobStream;
import com.azure.resourcemanager.automation.models.JobStreamType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class JobStreamsListByJobMockTests {
    @Test
    public void testListByJob() throws Exception {
        String responseStr
            = "{\"value\":[{\"id\":\"keboo\",\"properties\":{\"jobStreamId\":\"yacagae\",\"time\":\"2021-06-25T20:43:04Z\",\"streamType\":\"Progress\",\"streamText\":\"lm\",\"summary\":\"twgabdx\",\"value\":{\"qbpel\":\"datazbwjecooyvht\"}}}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AutomationManager manager = AutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<JobStream> response = manager.jobStreams()
            .listByJob("uqlhfwaf", "jzmpy", "guyfazbkocbygvt", "rmxkbcjwwdxom", "aw", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("keboo", response.iterator().next().id());
        Assertions.assertEquals("yacagae", response.iterator().next().jobStreamId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-25T20:43:04Z"), response.iterator().next().time());
        Assertions.assertEquals(JobStreamType.PROGRESS, response.iterator().next().streamType());
        Assertions.assertEquals("lm", response.iterator().next().streamText());
        Assertions.assertEquals("twgabdx", response.iterator().next().summary());
    }
}
