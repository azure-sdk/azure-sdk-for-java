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
import com.azure.resourcemanager.netapp.models.BackupStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupsGetLatestStatusWithResponseMockTests {
    @Test
    public void testGetLatestStatusWithResponse() throws Exception {
        String responseStr
            = "{\"healthy\":true,\"relationshipStatus\":\"Transferring\",\"mirrorState\":\"Mirrored\",\"unhealthyReason\":\"nlvhhtklnvnafvv\",\"errorMessage\":\"f\",\"lastTransferSize\":2144561382411200929,\"lastTransferType\":\"bo\",\"totalTransferBytes\":5433915956599731708,\"transferProgressBytes\":1068870497872313988}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BackupStatus response = manager.backups()
            .getLatestStatusWithResponse("xhpdulontacnpqwt", "htuevrhrljy", "ogwxhnsduugwb", "reur",
                com.azure.core.util.Context.NONE)
            .getValue();

    }
}
