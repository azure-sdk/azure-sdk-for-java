// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager;
import com.azure.resourcemanager.connectedvmware.models.Cluster;
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ClustersCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"uuid\":\"cjkgdirazftxej\",\"vCenterId\":\"bmdujtmvcopexc\",\"moRefId\":\"urbuhhlkyqltq\",\"inventoryItemId\":\"ogtu\",\"moName\":\"ffdjktsysidfvclg\",\"statuses\":[{\"type\":\"uijtkbu\",\"status\":\"ogsf\",\"reason\":\"ayiansharujtji\",\"message\":\"fzyjqt\",\"severity\":\"wkpqhjpenuygbq\",\"lastUpdatedAt\":\"2021-11-14T21:05Z\"}],\"customResourceName\":\"kewvnqv\",\"usedMemoryGB\":7373483158568002011,\"totalMemoryGB\":303660081981185328,\"usedCpuMHz\":6904489253760978104,\"totalCpuMHz\":6066393981630309590,\"datastoreIds\":[\"axpunjqikczvv\",\"tacgxmfc\"],\"networkIds\":[\"rxhtvso\"],\"provisioningState\":\"Succeeded\"},\"extendedLocation\":{\"type\":\"tsjgqrsx\",\"name\":\"ruuuybnch\"},\"kind\":\"izoyuelyetndnbf\",\"location\":\"yggagflnlgmt\",\"tags\":{\"rohkpigqfusu\":\"hzjmucftbyrp\",\"alhhjnhgwydyynfs\":\"kzmkwklsnoxaxmqe\",\"qtanarfdlpuk\":\"khgb\"},\"id\":\"py\",\"name\":\"neizjcpe\",\"type\":\"gkhnmgbrouxddbh\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ConnectedVMwareManager manager = ConnectedVMwareManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Cluster response = manager.clusters()
            .define("whslwkoj")
            .withRegion("antkwcegyamlbns")
            .withExistingResourceGroup("phwpnulaiywzej")
            .withTags(mapOf("m", "cjjvpilguooqja"))
            .withExtendedLocation(new ExtendedLocation().withType("quflqbctq").withName("mzjr"))
            .withKind("qzeqyjleziunjxdf")
            .withVCenterId("npdwr")
            .withMoRefId("afgfugsnn")
            .withInventoryItemId("yetefyp")
            .create();

        Assertions.assertEquals("yggagflnlgmt", response.location());
        Assertions.assertEquals("hzjmucftbyrp", response.tags().get("rohkpigqfusu"));
        Assertions.assertEquals("tsjgqrsx", response.extendedLocation().type());
        Assertions.assertEquals("ruuuybnch", response.extendedLocation().name());
        Assertions.assertEquals("izoyuelyetndnbf", response.kind());
        Assertions.assertEquals("bmdujtmvcopexc", response.vCenterId());
        Assertions.assertEquals("urbuhhlkyqltq", response.moRefId());
        Assertions.assertEquals("ogtu", response.inventoryItemId());
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
