// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager;
import com.azure.resourcemanager.containerservicefleet.models.FleetUpdateStrategy;
import com.azure.resourcemanager.containerservicefleet.models.UpdateGroup;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStrategy;
import com.azure.resourcemanager.containerservicefleet.models.UpdateStage;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class FleetUpdateStrategiesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"strategy\":{\"stages\":[{\"name\":\"cofudflvkgjub\",\"groups\":[{\"name\":\"nnqvsa\"},{\"name\":\"nqntorudsgsahm\"},{\"name\":\"yc\"}],\"afterStageWaitInSeconds\":698533794},{\"name\":\"uwjuetaeburuvdmo\",\"groups\":[{\"name\":\"zlxwabmqoefkifr\"}],\"afterStageWaitInSeconds\":1599154818}]}},\"eTag\":\"qujmqlgkf\",\"id\":\"ndo\",\"name\":\"ongbjcnt\",\"type\":\"jitcjedftwwaez\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerServiceFleetManager manager = ContainerServiceFleetManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        FleetUpdateStrategy response = manager.fleetUpdateStrategies()
            .define("kdlfoa")
            .withExistingFleet("ujhemmsbvdkcrodt", "infwjlfltkacjve")
            .withStrategy(new UpdateRunStrategy().withStages(Arrays.asList(
                new UpdateStage().withName("pagao")
                    .withGroups(Arrays.asList(new UpdateGroup().withName("lpqblylsyxk"),
                        new UpdateGroup().withName("jnsjervtiagxsd"), new UpdateGroup().withName("zuempsbzkf"),
                        new UpdateGroup().withName("beyvpnqicvinvkjj")))
                    .withAfterStageWaitInSeconds(602936654),
                new UpdateStage().withName("rbuukzclewyhmlwp")
                    .withGroups(
                        Arrays.asList(new UpdateGroup().withName("zpof"), new UpdateGroup().withName("cckwyfzqwhxxbu"),
                            new UpdateGroup().withName("qa"), new UpdateGroup().withName("zfeqztppri")))
                    .withAfterStageWaitInSeconds(2094175875),
                new UpdateStage().withName("or")
                    .withGroups(Arrays.asList(new UpdateGroup().withName("tolmncwsobqw")))
                    .withAfterStageWaitInSeconds(1051180868))))
            .withIfMatch("udutnco")
            .withIfNoneMatch("mr")
            .create();

        Assertions.assertEquals("cofudflvkgjub", response.strategy().stages().get(0).name());
        Assertions.assertEquals("nnqvsa", response.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(698533794, response.strategy().stages().get(0).afterStageWaitInSeconds());
    }
}
