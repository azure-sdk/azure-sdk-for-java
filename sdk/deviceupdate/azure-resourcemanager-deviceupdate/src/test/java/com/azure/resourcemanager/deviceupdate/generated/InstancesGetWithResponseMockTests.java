// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.deviceupdate.DeviceUpdateManager;
import com.azure.resourcemanager.deviceupdate.models.AuthenticationType;
import com.azure.resourcemanager.deviceupdate.models.Instance;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class InstancesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Failed\",\"accountName\":\"svuo\",\"iotHubs\":[{\"resourceId\":\"ccelve\"}],\"enableDiagnostics\":false,\"diagnosticStorageProperties\":{\"authenticationType\":\"KeyBased\",\"connectionString\":\"mfe\",\"resourceId\":\"kerqwkyh\"}},\"location\":\"bopgxedkowepbqp\",\"tags\":{\"njv\":\"kbwcc\"},\"id\":\"dw\",\"name\":\"lpqekf\",\"type\":\"nkhtjsyingw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DeviceUpdateManager manager = DeviceUpdateManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Instance response = manager.instances()
            .getWithResponse("lvdnkfx", "semdwzrmu", "apfcqdpsq", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("bopgxedkowepbqp", response.location());
        Assertions.assertEquals("kbwcc", response.tags().get("njv"));
        Assertions.assertEquals("ccelve", response.iotHubs().get(0).resourceId());
        Assertions.assertEquals(false, response.enableDiagnostics());
        Assertions.assertEquals(AuthenticationType.KEY_BASED,
            response.diagnosticStorageProperties().authenticationType());
        Assertions.assertEquals("mfe", response.diagnosticStorageProperties().connectionString());
        Assertions.assertEquals("kerqwkyh", response.diagnosticStorageProperties().resourceId());
    }
}
