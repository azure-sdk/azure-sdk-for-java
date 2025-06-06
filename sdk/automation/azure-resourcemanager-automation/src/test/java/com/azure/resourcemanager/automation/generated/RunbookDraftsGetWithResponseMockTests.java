// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.automation.AutomationManager;
import com.azure.resourcemanager.automation.models.RunbookDraft;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RunbookDraftsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"inEdit\":true,\"draftContentLink\":{\"uri\":\"j\",\"contentHash\":{\"algorithm\":\"oqfx\",\"value\":\"emhkftbaewht\"},\"version\":\"loamfmxtllfltym\"},\"creationTime\":\"2021-08-05T01:22:40Z\",\"lastModifiedTime\":\"2021-10-11T19:08:35Z\",\"parameters\":{\"rxqwqnjxrd\":{\"type\":\"hggabqbgamklil\",\"isMandatory\":true,\"position\":1220311983,\"defaultValue\":\"fhsdpzouhkt\"},\"ljphraspifleimi\":{\"type\":\"dtullygtavczcxdf\",\"isMandatory\":false,\"position\":466957223,\"defaultValue\":\"mlx\"},\"kljmtznpaxwfq\":{\"type\":\"mdbgi\",\"isMandatory\":false,\"position\":383695478,\"defaultValue\":\"mdrjuqbpxt\"}},\"outputTypes\":[\"qi\",\"rcltungbsoljckm\"]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AutomationManager manager = AutomationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        RunbookDraft response = manager.runbookDrafts()
            .getWithResponse("xga", "tdtkwppthuz", "pr", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(true, response.inEdit());
        Assertions.assertEquals("j", response.draftContentLink().uri());
        Assertions.assertEquals("oqfx", response.draftContentLink().contentHash().algorithm());
        Assertions.assertEquals("emhkftbaewht", response.draftContentLink().contentHash().value());
        Assertions.assertEquals("loamfmxtllfltym", response.draftContentLink().version());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-05T01:22:40Z"), response.creationTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-11T19:08:35Z"), response.lastModifiedTime());
        Assertions.assertEquals("hggabqbgamklil", response.parameters().get("rxqwqnjxrd").type());
        Assertions.assertEquals(true, response.parameters().get("rxqwqnjxrd").isMandatory());
        Assertions.assertEquals(1220311983, response.parameters().get("rxqwqnjxrd").position());
        Assertions.assertEquals("fhsdpzouhkt", response.parameters().get("rxqwqnjxrd").defaultValue());
        Assertions.assertEquals("qi", response.outputTypes().get(0));
    }
}
