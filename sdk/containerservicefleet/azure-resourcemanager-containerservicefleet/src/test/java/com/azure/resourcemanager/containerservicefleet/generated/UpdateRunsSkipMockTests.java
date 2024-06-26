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
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpgradeType;
import com.azure.resourcemanager.containerservicefleet.models.NodeImageSelectionType;
import com.azure.resourcemanager.containerservicefleet.models.SkipProperties;
import com.azure.resourcemanager.containerservicefleet.models.SkipTarget;
import com.azure.resourcemanager.containerservicefleet.models.TargetType;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRun;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class UpdateRunsSkipMockTests {
    @Test
    public void testSkip() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"updateStrategyId\":\"uqgbdbutauvfbt\",\"strategy\":{\"stages\":[{\"name\":\"hhmhykojoxa\",\"groups\":[{\"name\":\"dlpichkoymkcdyhb\"}],\"afterStageWaitInSeconds\":556339960},{\"name\":\"pwdreqnovvqf\",\"groups\":[{\"name\":\"jxywsuws\"},{\"name\":\"rsndsytgadgvra\"}],\"afterStageWaitInSeconds\":350666785},{\"name\":\"neqn\",\"groups\":[{\"name\":\"rwlqu\"},{\"name\":\"ijfqkacewiipfp\"},{\"name\":\"bjibwwiftohq\"},{\"name\":\"vpuvks\"}],\"afterStageWaitInSeconds\":710710602}]},\"managedClusterUpdate\":{\"upgrade\":{\"type\":\"NodeImageOnly\",\"kubernetesVersion\":\"kn\"},\"nodeImageSelection\":{\"type\":\"Consistent\"}},\"status\":{\"status\":{\"startTime\":\"2021-04-07T05:17:19Z\",\"completedTime\":\"2021-01-19T19:16:07Z\",\"state\":\"NotStarted\"},\"stages\":[{\"status\":{},\"name\":\"lqiyntorzihl\",\"groups\":[{},{}],\"afterStageWaitStatus\":{}},{\"status\":{},\"name\":\"srmslyzr\",\"groups\":[{},{},{}],\"afterStageWaitStatus\":{}},{\"status\":{},\"name\":\"kqqzqioxiysu\",\"groups\":[{},{}],\"afterStageWaitStatus\":{}},{\"status\":{},\"name\":\"edyatrwyhqmibzyh\",\"groups\":[{},{},{}],\"afterStageWaitStatus\":{}}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{}]}}},\"eTag\":\"ynpcdpumnzgmwznm\",\"id\":\"iknsorgjh\",\"name\":\"bldtlww\",\"type\":\"lkdmtncvokotllxd\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ContainerServiceFleetManager manager = ContainerServiceFleetManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        UpdateRun response = manager.updateRuns()
            .skip("nwashrtd", "kcnqxwbpo", "ulpiuj",
                new SkipProperties()
                    .withTargets(Arrays.asList(new SkipTarget().withType(TargetType.GROUP).withName("sipqii"),
                        new SkipTarget().withType(TargetType.STAGE).withName("yuq"))),
                "rpqlp", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("uqgbdbutauvfbt", response.updateStrategyId());
        Assertions.assertEquals("hhmhykojoxa", response.strategy().stages().get(0).name());
        Assertions.assertEquals("dlpichkoymkcdyhb", response.strategy().stages().get(0).groups().get(0).name());
        Assertions.assertEquals(556339960, response.strategy().stages().get(0).afterStageWaitInSeconds());
        Assertions.assertEquals(ManagedClusterUpgradeType.NODE_IMAGE_ONLY,
            response.managedClusterUpdate().upgrade().type());
        Assertions.assertEquals("kn", response.managedClusterUpdate().upgrade().kubernetesVersion());
        Assertions.assertEquals(NodeImageSelectionType.CONSISTENT,
            response.managedClusterUpdate().nodeImageSelection().type());
    }
}
