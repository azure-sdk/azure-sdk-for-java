// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hdinsight.HDInsightManager;
import com.azure.resourcemanager.hdinsight.models.AzureMonitorResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ExtensionsGetAzureMonitorStatusWithResponseMockTests {
    @Test
    public void testGetAzureMonitorStatusWithResponse() throws Exception {
        String responseStr
            = "{\"clusterMonitoringEnabled\":true,\"workspaceId\":\"khvuhxepmrutz\",\"selectedConfigurations\":{\"configurationVersion\":\"aobn\",\"globalConfigurations\":{\"ywart\":\"jdjltymkmvgui\",\"j\":\"pphkixkykxds\",\"kkflrmymyincqlhr\":\"emmucfxh\"},\"tableList\":[{\"name\":\"lmiiiovg\"},{\"name\":\"gxuugqkctotio\"},{\"name\":\"xteqdptjgwdtg\"},{\"name\":\"ranblwphqlkccu\"}]}}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HDInsightManager manager = HDInsightManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AzureMonitorResponse response = manager.extensions()
            .getAzureMonitorStatusWithResponse("fsxzecp", "xw", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(true, response.clusterMonitoringEnabled());
        Assertions.assertEquals("khvuhxepmrutz", response.workspaceId());
        Assertions.assertEquals("aobn", response.selectedConfigurations().configurationVersion());
        Assertions.assertEquals("jdjltymkmvgui", response.selectedConfigurations().globalConfigurations().get("ywart"));
        Assertions.assertEquals("lmiiiovg", response.selectedConfigurations().tableList().get(0).name());
    }
}
