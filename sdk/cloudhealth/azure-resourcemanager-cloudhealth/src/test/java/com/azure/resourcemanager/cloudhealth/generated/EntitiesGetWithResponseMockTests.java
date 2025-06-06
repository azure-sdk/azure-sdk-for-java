// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.cloudhealth.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.cloudhealth.CloudHealthManager;
import com.azure.resourcemanager.cloudhealth.models.AlertSeverity;
import com.azure.resourcemanager.cloudhealth.models.DependenciesAggregationType;
import com.azure.resourcemanager.cloudhealth.models.Entity;
import com.azure.resourcemanager.cloudhealth.models.EntityImpact;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class EntitiesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Creating\",\"displayName\":\"vrwxkv\",\"kind\":\"k\",\"canvasPosition\":{\"x\":82.80639125467376,\"y\":93.13111838664105},\"icon\":{\"iconName\":\"gvjayvblmh\",\"customData\":\"zuhbxvvyhgsopb\"},\"healthObjective\":77.12165867646767,\"impact\":\"Suppressed\",\"labels\":{\"mctlpdngitv\":\"uvwzfbnh\"},\"signals\":{\"azureResource\":{\"signalAssignments\":[{\"signalDefinitions\":[]},{\"signalDefinitions\":[]},{\"signalDefinitions\":[]},{\"signalDefinitions\":[]}],\"authenticationSetting\":\"ixkwmyijejveg\",\"azureResourceId\":\"hbpnaixexccbd\"},\"azureLogAnalytics\":{\"signalAssignments\":[{\"signalDefinitions\":[]},{\"signalDefinitions\":[]},{\"signalDefinitions\":[]},{\"signalDefinitions\":[]}],\"authenticationSetting\":\"hcexdrrvqa\",\"logAnalyticsWorkspaceResourceId\":\"qkghtpwijnhy\"},\"azureMonitorWorkspace\":{\"signalAssignments\":[{\"signalDefinitions\":[]}],\"authenticationSetting\":\"ycxzbfvoo\",\"azureMonitorWorkspaceResourceId\":\"vrvmtgjqppyost\"},\"dependencies\":{\"aggregationType\":\"WorstOf\",\"degradedThreshold\":\"myhgfipnsxkmc\",\"unhealthyThreshold\":\"ekrrjr\"}},\"discoveredBy\":\"fxtsgum\",\"deletionDate\":\"2021-06-07T04:38:31Z\",\"healthState\":\"Healthy\",\"alerts\":{\"unhealthy\":{\"severity\":\"Sev0\",\"description\":\"slol\",\"actionGroupIds\":[\"vuzlm\",\"felfktg\"]},\"degraded\":{\"severity\":\"Sev3\",\"description\":\"pwjxezn\",\"actionGroupIds\":[\"brnjwmw\"]}}},\"id\":\"nbsazejjoqkag\",\"name\":\"hsxttaugzxnf\",\"type\":\"azpxdtnkdmkqjjl\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CloudHealthManager manager = CloudHealthManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        Entity response = manager.entities()
            .getWithResponse("irryuzhlh", "joqrvqqaatj", "nrvgoupmfiibfgg", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("vrwxkv", response.properties().displayName());
        Assertions.assertEquals("k", response.properties().kind());
        Assertions.assertEquals(82.80639125467376, response.properties().canvasPosition().x());
        Assertions.assertEquals(93.13111838664105, response.properties().canvasPosition().y());
        Assertions.assertEquals("gvjayvblmh", response.properties().icon().iconName());
        Assertions.assertEquals("zuhbxvvyhgsopb", response.properties().icon().customData());
        Assertions.assertEquals(77.12165867646767D, response.properties().healthObjective());
        Assertions.assertEquals(EntityImpact.SUPPRESSED, response.properties().impact());
        Assertions.assertEquals("uvwzfbnh", response.properties().labels().get("mctlpdngitv"));
        Assertions.assertEquals("ixkwmyijejveg",
            response.properties().signals().azureResource().authenticationSetting());
        Assertions.assertEquals("hbpnaixexccbd", response.properties().signals().azureResource().azureResourceId());
        Assertions.assertEquals("hcexdrrvqa",
            response.properties().signals().azureLogAnalytics().authenticationSetting());
        Assertions.assertEquals("qkghtpwijnhy",
            response.properties().signals().azureLogAnalytics().logAnalyticsWorkspaceResourceId());
        Assertions.assertEquals("ycxzbfvoo",
            response.properties().signals().azureMonitorWorkspace().authenticationSetting());
        Assertions.assertEquals("vrvmtgjqppyost",
            response.properties().signals().azureMonitorWorkspace().azureMonitorWorkspaceResourceId());
        Assertions.assertEquals(DependenciesAggregationType.WORST_OF,
            response.properties().signals().dependencies().aggregationType());
        Assertions.assertEquals("myhgfipnsxkmc", response.properties().signals().dependencies().degradedThreshold());
        Assertions.assertEquals("ekrrjr", response.properties().signals().dependencies().unhealthyThreshold());
        Assertions.assertEquals(AlertSeverity.SEV0, response.properties().alerts().unhealthy().severity());
        Assertions.assertEquals("slol", response.properties().alerts().unhealthy().description());
        Assertions.assertEquals("vuzlm", response.properties().alerts().unhealthy().actionGroupIds().get(0));
        Assertions.assertEquals(AlertSeverity.SEV3, response.properties().alerts().degraded().severity());
        Assertions.assertEquals("pwjxezn", response.properties().alerts().degraded().description());
        Assertions.assertEquals("brnjwmw", response.properties().alerts().degraded().actionGroupIds().get(0));
    }
}
