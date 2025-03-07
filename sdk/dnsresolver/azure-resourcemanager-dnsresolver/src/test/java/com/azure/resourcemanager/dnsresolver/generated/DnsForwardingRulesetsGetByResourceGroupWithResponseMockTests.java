// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.dnsresolver.DnsResolverManager;
import com.azure.resourcemanager.dnsresolver.models.DnsForwardingRuleset;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DnsForwardingRulesetsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"etag\":\"dtbnnha\",\"properties\":{\"dnsResolverOutboundEndpoints\":[{\"id\":\"crkvcikhnv\"},{\"id\":\"mqg\"},{\"id\":\"queziky\"}],\"provisioningState\":\"Failed\",\"resourceGuid\":\"kallatmel\"},\"location\":\"ipicc\",\"tags\":{\"v\":\"z\",\"yrnxxmueedn\":\"vvcnayr\",\"alm\":\"rdvstkwqqtch\",\"gdv\":\"mtdaa\"},\"id\":\"vgpiohgwxrt\",\"name\":\"udxepxgyqagv\",\"type\":\"vmnpkukghimdblx\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DnsResolverManager manager = DnsResolverManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DnsForwardingRuleset response = manager.dnsForwardingRulesets()
            .getByResourceGroupWithResponse("lxdy", "gsyocogj", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ipicc", response.location());
        Assertions.assertEquals("z", response.tags().get("v"));
        Assertions.assertEquals("crkvcikhnv", response.dnsResolverOutboundEndpoints().get(0).id());
    }
}
