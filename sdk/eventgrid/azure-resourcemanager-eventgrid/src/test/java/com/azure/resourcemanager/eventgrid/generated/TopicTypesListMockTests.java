// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.models.ResourceRegionType;
import com.azure.resourcemanager.eventgrid.models.TopicTypeInfo;
import com.azure.resourcemanager.eventgrid.models.TopicTypeProvisioningState;
import com.azure.resourcemanager.eventgrid.models.TopicTypeSourceScope;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class TopicTypesListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provider\":\"whgjsmbcsl\",\"displayName\":\"gsabdgdheronsdu\",\"description\":\"kzvzuatqhgzuyxtr\",\"resourceRegionType\":\"GlobalResource\",\"provisioningState\":\"Failed\",\"supportedLocations\":[\"gqj\",\"vitp\",\"pvsffavdhpiwrm\",\"wkgjwb\"],\"sourceResourceFormat\":\"dwfbwxy\",\"supportedScopesForSource\":[\"ManagementGroup\"],\"areRegionalAndGlobalSourcesSupported\":true,\"additionalEnforcedPermissions\":[{\"permissionName\":\"drmegajrzc\",\"isDataAction\":true},{\"permissionName\":\"zskwqk\",\"isDataAction\":false},{\"permissionName\":\"eiphgliupqs\",\"isDataAction\":true}]},\"id\":\"bkjlcaxsqcomji\",\"name\":\"i\",\"type\":\"ncevxxkdevpxi\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        EventGridManager manager = EventGridManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<TopicTypeInfo> response = manager.topicTypes().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("whgjsmbcsl", response.iterator().next().provider());
        Assertions.assertEquals("gsabdgdheronsdu", response.iterator().next().displayName());
        Assertions.assertEquals("kzvzuatqhgzuyxtr", response.iterator().next().description());
        Assertions.assertEquals(ResourceRegionType.GLOBAL_RESOURCE, response.iterator().next().resourceRegionType());
        Assertions.assertEquals(TopicTypeProvisioningState.FAILED, response.iterator().next().provisioningState());
        Assertions.assertEquals("gqj", response.iterator().next().supportedLocations().get(0));
        Assertions.assertEquals("dwfbwxy", response.iterator().next().sourceResourceFormat());
        Assertions.assertEquals(TopicTypeSourceScope.MANAGEMENT_GROUP,
            response.iterator().next().supportedScopesForSource().get(0));
        Assertions.assertTrue(response.iterator().next().areRegionalAndGlobalSourcesSupported());
        Assertions.assertEquals("drmegajrzc",
            response.iterator().next().additionalEnforcedPermissions().get(0).permissionName());
        Assertions.assertTrue(response.iterator().next().additionalEnforcedPermissions().get(0).isDataAction());
    }
}
