// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.SnapshotPolicy;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SnapshotPoliciesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"etag\":\"lfwyfwlwxjwetn\",\"properties\":{\"hourlySchedule\":{\"snapshotsToKeep\":1420965357,\"minute\":742328216,\"usedBytes\":196092262674121483},\"dailySchedule\":{\"snapshotsToKeep\":1212889524,\"hour\":371223759,\"minute\":207185331,\"usedBytes\":5312666430658387729},\"weeklySchedule\":{\"snapshotsToKeep\":105779102,\"day\":\"mwqkchcxwaxf\",\"hour\":754983653,\"minute\":636641870,\"usedBytes\":4795680298569149997},\"monthlySchedule\":{\"snapshotsToKeep\":532990986,\"daysOfMonth\":\"vhpsylkkshkbffmb\",\"hour\":1864709283,\"minute\":1506746299,\"usedBytes\":6489766486374239892},\"enabled\":true,\"provisioningState\":\"jx\"},\"location\":\"ptfujgicgaaoept\",\"tags\":{\"vru\":\"utdewemxs\",\"jgehkf\":\"nz\",\"xokffqyin\":\"imrt\"},\"id\":\"jqepqwhi\",\"name\":\"monstshiyxgve\",\"type\":\"fclduccbirdsv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SnapshotPolicy response = manager.snapshotPolicies()
            .getWithResponse("kiwbuqnyoph", "fy", "sgcrpfbcunezzce", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ptfujgicgaaoept", response.location());
        Assertions.assertEquals("utdewemxs", response.tags().get("vru"));
        Assertions.assertEquals(1420965357, response.hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(742328216, response.hourlySchedule().minute());
        Assertions.assertEquals(196092262674121483L, response.hourlySchedule().usedBytes());
        Assertions.assertEquals(1212889524, response.dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(371223759, response.dailySchedule().hour());
        Assertions.assertEquals(207185331, response.dailySchedule().minute());
        Assertions.assertEquals(5312666430658387729L, response.dailySchedule().usedBytes());
        Assertions.assertEquals(105779102, response.weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("mwqkchcxwaxf", response.weeklySchedule().day());
        Assertions.assertEquals(754983653, response.weeklySchedule().hour());
        Assertions.assertEquals(636641870, response.weeklySchedule().minute());
        Assertions.assertEquals(4795680298569149997L, response.weeklySchedule().usedBytes());
        Assertions.assertEquals(532990986, response.monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("vhpsylkkshkbffmb", response.monthlySchedule().daysOfMonth());
        Assertions.assertEquals(1864709283, response.monthlySchedule().hour());
        Assertions.assertEquals(1506746299, response.monthlySchedule().minute());
        Assertions.assertEquals(6489766486374239892L, response.monthlySchedule().usedBytes());
        Assertions.assertEquals(true, response.enabled());
    }
}
