// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.neonpostgres.NeonPostgresManager;
import com.azure.resourcemanager.neonpostgres.models.NeonRole;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class NeonRolesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"entityId\":\"kddn\",\"entityName\":\"vbooqbmdqrxy\",\"createdAt\":\"ae\",\"provisioningState\":\"Succeeded\",\"attributes\":[{\"name\":\"wtjdtlriefoo\",\"value\":\"ycuxdtzcqip\"}],\"branchId\":\"ud\",\"permissions\":[\"zzomehxl\"],\"isSuperUser\":true},\"id\":\"la\",\"name\":\"lbij\",\"type\":\"xkqllczipvwdtgc\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NeonPostgresManager manager = NeonPostgresManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<NeonRole> response = manager.neonRoles()
            .list("uif", "ulxfaryrvjl", "dezvjqw", "hoyiyaxqvjweiw", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("vbooqbmdqrxy", response.iterator().next().properties().entityName());
        Assertions.assertEquals("wtjdtlriefoo", response.iterator().next().properties().attributes().get(0).name());
        Assertions.assertEquals("ycuxdtzcqip", response.iterator().next().properties().attributes().get(0).value());
        Assertions.assertEquals("ud", response.iterator().next().properties().branchId());
        Assertions.assertEquals("zzomehxl", response.iterator().next().properties().permissions().get(0));
        Assertions.assertTrue(response.iterator().next().properties().isSuperUser());
    }
}
