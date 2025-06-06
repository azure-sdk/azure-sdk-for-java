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
import com.azure.resourcemanager.cloudhealth.models.DiscoveryRuleRecommendedSignalsBehavior;
import com.azure.resourcemanager.cloudhealth.models.HealthModel;
import com.azure.resourcemanager.cloudhealth.models.HealthModelProperties;
import com.azure.resourcemanager.cloudhealth.models.ManagedServiceIdentity;
import com.azure.resourcemanager.cloudhealth.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.cloudhealth.models.ModelDiscoverySettings;
import com.azure.resourcemanager.cloudhealth.models.UserAssignedIdentity;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class HealthModelsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"dataplaneEndpoint\":\"t\",\"provisioningState\":\"Succeeded\",\"discovery\":{\"scope\":\"ra\",\"addRecommendedSignals\":\"Disabled\",\"identity\":\"koowtl\"}},\"identity\":{\"principalId\":\"ux\",\"tenantId\":\"q\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{\"znkbykutwpfhpagm\":{\"principalId\":\"uuximerq\",\"clientId\":\"bw\"},\"evdlh\":{\"principalId\":\"skdsnfdsdoakg\",\"clientId\":\"lmkk\"},\"m\":{\"principalId\":\"pusdstt\",\"clientId\":\"ogvbbejdcngq\"}}},\"location\":\"kufgmj\",\"tags\":{\"enuuzkopbm\":\"rdgrtw\"},\"id\":\"nrfdw\",\"name\":\"yuhhziu\",\"type\":\"efozbhdms\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CloudHealthManager manager = CloudHealthManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        HealthModel response = manager.healthModels()
            .define("gdknnqv")
            .withRegion("ouicybxarzgszu")
            .withExistingResourceGroup("u")
            .withTags(mapOf("ciodhkhaz", "ciqopidoa"))
            .withProperties(
                new HealthModelProperties().withDiscovery(new ModelDiscoverySettings().withScope("rauwjuetaebu")
                    .withAddRecommendedSignals(DiscoveryRuleRecommendedSignalsBehavior.ENABLED)
                    .withIdentity("dmovsm")))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                .withUserAssignedIdentities(mapOf("twwaezkojvdcpzf", new UserAssignedIdentity())))
            .create();

        Assertions.assertEquals("kufgmj", response.location());
        Assertions.assertEquals("rdgrtw", response.tags().get("enuuzkopbm"));
        Assertions.assertEquals("ra", response.properties().discovery().scope());
        Assertions.assertEquals(DiscoveryRuleRecommendedSignalsBehavior.DISABLED,
            response.properties().discovery().addRecommendedSignals());
        Assertions.assertEquals("koowtl", response.properties().discovery().identity());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, response.identity().type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
