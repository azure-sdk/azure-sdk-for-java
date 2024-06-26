// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.deviceregistry.DeviceRegistryManager;
import com.azure.resourcemanager.deviceregistry.models.ActionType;
import com.azure.resourcemanager.deviceregistry.models.Operation;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"ltyfsop\",\"isDataAction\":false,\"display\":{\"provider\":\"snzwd\",\"resource\":\"bavo\",\"operation\":\"zdmohctbqvu\",\"description\":\"xdn\"},\"origin\":\"user\",\"actionType\":\"Internal\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DeviceRegistryManager manager = DeviceRegistryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Operation> response = manager.operations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("snzwd", response.iterator().next().display().provider());
        Assertions.assertEquals("bavo", response.iterator().next().display().resource());
        Assertions.assertEquals("zdmohctbqvu", response.iterator().next().display().operation());
        Assertions.assertEquals("xdn", response.iterator().next().display().description());
        Assertions.assertEquals(ActionType.INTERNAL, response.iterator().next().actionType());
    }
}
