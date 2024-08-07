// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.OperationResult;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class OperationsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"name\":\"zzjgehkfki\",\"isDataAction\":false,\"display\":{\"provider\":\"okffqyinljqepqwh\",\"resource\":\"monstshiyxgve\",\"operation\":\"clduc\",\"description\":\"irdsvuwcob\"},\"origin\":\"gstmninwjizciln\",\"nextLink\":\"gshejjtbxqmulux\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ServiceFabricManagedClustersManager manager = ServiceFabricManagedClustersManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<OperationResult> response = manager.operations().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("zzjgehkfki", response.iterator().next().name());
        Assertions.assertEquals(false, response.iterator().next().isDataAction());
        Assertions.assertEquals("okffqyinljqepqwh", response.iterator().next().display().provider());
        Assertions.assertEquals("monstshiyxgve", response.iterator().next().display().resource());
        Assertions.assertEquals("clduc", response.iterator().next().display().operation());
        Assertions.assertEquals("irdsvuwcob", response.iterator().next().display().description());
        Assertions.assertEquals("gstmninwjizciln", response.iterator().next().origin());
        Assertions.assertEquals("gshejjtbxqmulux", response.iterator().next().nextLink());
    }
}
