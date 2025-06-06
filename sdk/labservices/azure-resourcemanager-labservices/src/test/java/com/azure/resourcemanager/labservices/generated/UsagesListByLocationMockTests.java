// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.labservices.LabServicesManager;
import com.azure.resourcemanager.labservices.models.Usage;
import com.azure.resourcemanager.labservices.models.UsageUnit;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class UsagesListByLocationMockTests {
    @Test
    public void testListByLocation() throws Exception {
        String responseStr
            = "{\"value\":[{\"currentValue\":1011085759791678741,\"limit\":2889779133399743822,\"unit\":\"Count\",\"name\":{\"localizedValue\":\"vlp\",\"skuInstances\":[\"kzbrmsgeivsiy\"],\"value\":\"kdncj\"},\"id\":\"onbzoggculapzwy\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        LabServicesManager manager = LabServicesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Usage> response
            = manager.usages().listByLocation("puunnoxyhkxgqd", "rihpfhoq", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(1011085759791678741L, response.iterator().next().currentValue());
        Assertions.assertEquals(2889779133399743822L, response.iterator().next().limit());
        Assertions.assertEquals(UsageUnit.COUNT, response.iterator().next().unit());
        Assertions.assertEquals("vlp", response.iterator().next().name().localizedValue());
        Assertions.assertEquals("kzbrmsgeivsiy", response.iterator().next().name().skuInstances().get(0));
        Assertions.assertEquals("kdncj", response.iterator().next().name().value());
        Assertions.assertEquals("onbzoggculapzwy", response.iterator().next().id());
    }
}
