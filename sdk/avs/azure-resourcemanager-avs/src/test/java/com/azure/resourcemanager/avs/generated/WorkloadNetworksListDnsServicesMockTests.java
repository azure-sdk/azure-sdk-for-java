// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.DnsServiceLogLevelEnum;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDnsService;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkloadNetworksListDnsServicesMockTests {
    @Test
    public void testListDnsServices() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"displayName\":\"juahokqto\",\"dnsServiceIp\":\"auxofshfph\",\"defaultDnsZone\":\"nulaiywzejywhsl\",\"fqdnZones\":[\"jpllndnpdwrpq\",\"fgf\",\"gsnnf\",\"yetefyp\"],\"logLevel\":\"WARNING\",\"status\":\"SUCCESS\",\"provisioningState\":\"Building\",\"revision\":3540682391497785966},\"id\":\"rjvzuyt\",\"name\":\"rmlmuowo\",\"type\":\"bauiropi\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AvsManager manager = AvsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<WorkloadNetworkDnsService> response
            = manager.workloadNetworks().listDnsServices("w", "epdfgkmtdherng", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("juahokqto", response.iterator().next().displayName());
        Assertions.assertEquals("auxofshfph", response.iterator().next().dnsServiceIp());
        Assertions.assertEquals("nulaiywzejywhsl", response.iterator().next().defaultDnsZone());
        Assertions.assertEquals("jpllndnpdwrpq", response.iterator().next().fqdnZones().get(0));
        Assertions.assertEquals(DnsServiceLogLevelEnum.WARNING, response.iterator().next().logLevel());
        Assertions.assertEquals(3540682391497785966L, response.iterator().next().revision());
    }
}
