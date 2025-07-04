// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.networkcloud.NetworkCloudManager;
import com.azure.resourcemanager.networkcloud.models.RackSku;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RackSkusGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"computeMachines\":[{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":6287126159017172997,\"cpuSockets\":6971398222552947212,\"disks\":[{},{},{},{}],\"generation\":\"bqd\",\"hardwareVersion\":\"zfivfokpysthhzag\",\"memoryCapacityGB\":2982486049168027797,\"model\":\"rlhgenuze\",\"networkInterfaces\":[{},{},{}],\"totalThreads\":2804616123093564582,\"vendor\":\"aqszllrzl\"},\"rackSlot\":6491999255756678217},{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":7445555367362496230,\"cpuSockets\":6038615490563012340,\"disks\":[{},{},{}],\"generation\":\"hnxtmin\",\"hardwareVersion\":\"ogxsvtzarhz\",\"memoryCapacityGB\":6500675185406191303,\"model\":\"kt\",\"networkInterfaces\":[{},{}],\"totalThreads\":8991825584730610360,\"vendor\":\"oslpky\"},\"rackSlot\":4088164078886759572}],\"controllerMachines\":[{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":1896306886563878942,\"cpuSockets\":5326196815674801235,\"disks\":[{},{},{}],\"generation\":\"bmfuvqarwzxu\",\"hardwareVersion\":\"ebluimmbwx\",\"memoryCapacityGB\":7174777082072093492,\"model\":\"mbvx\",\"networkInterfaces\":[{},{},{}],\"totalThreads\":4554518187154848865,\"vendor\":\"kbudbtwaokb\"},\"rackSlot\":2348707380584486271},{\"properties\":{\"bootstrapProtocol\":\"PXE\",\"cpuCores\":8791700218699447257,\"cpuSockets\":2166787843434276226,\"disks\":[{},{},{},{}],\"generation\":\"sm\",\"hardwareVersion\":\"dujdigatoleksc\",\"memoryCapacityGB\":1047268040531450159,\"model\":\"nqimwbzxpdcldp\",\"networkInterfaces\":[{},{},{},{}],\"totalThreads\":589098770792925621,\"vendor\":\"aimouxwksq\"},\"rackSlot\":7429181770486958238}],\"description\":\"coibicziuswswjrk\",\"maxClusterSlots\":6271153326064321664,\"provisioningState\":\"Failed\",\"rackType\":\"Aggregator\",\"storageAppliances\":[{\"properties\":{\"capacityGB\":2457009566091847717,\"model\":\"rfwb\"},\"rackSlot\":8910764829235753869},{\"properties\":{\"capacityGB\":2529126508935602018,\"model\":\"zwvbhlimbyqecro\"},\"rackSlot\":7644007256707552227},{\"properties\":{\"capacityGB\":7515715028253040382,\"model\":\"aasaxx\"},\"rackSlot\":1872770039196464597}],\"supportedRackSkuIds\":[\"wiyjvzuko\"]},\"id\":\"nawnvz\",\"name\":\"lnk\",\"type\":\"ywsxvjabjqqaxu\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetworkCloudManager manager = NetworkCloudManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        RackSku response
            = manager.rackSkus().getWithResponse("mcgcjeinue", com.azure.core.util.Context.NONE).getValue();

    }
}
