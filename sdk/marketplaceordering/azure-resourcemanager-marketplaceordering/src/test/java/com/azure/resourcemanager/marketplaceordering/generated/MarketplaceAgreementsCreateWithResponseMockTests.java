// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.marketplaceordering.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.marketplaceordering.MarketplaceOrderingManager;
import com.azure.resourcemanager.marketplaceordering.fluent.models.AgreementTermsInner;
import com.azure.resourcemanager.marketplaceordering.models.AgreementTerms;
import com.azure.resourcemanager.marketplaceordering.models.OfferType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class MarketplaceAgreementsCreateWithResponseMockTests {
    @Test
    public void testCreateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"publisher\":\"b\",\"product\":\"tmut\",\"plan\":\"qktapspwgcuert\",\"licenseTextLink\":\"kdosvqw\",\"privacyPolicyLink\":\"mdgbbjfdd\",\"marketplaceTermsLink\":\"bmbexppbhtqqro\",\"retrieveDatetime\":\"2021-07-17T13:14:27Z\",\"signature\":\"psalgbqux\",\"accepted\":false},\"id\":\"jgzjaoyfhrtx\",\"name\":\"lnerkujysvleju\",\"type\":\"fqawrlyxw\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MarketplaceOrderingManager manager = MarketplaceOrderingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        AgreementTerms response = manager.marketplaceAgreements()
            .createWithResponse(OfferType.VIRTUALMACHINE, "zwyiftyhxhur", "k", "tyxolniwpwc",
                new AgreementTermsInner().withPublisher("fkgiawxk")
                    .withProduct("ypl")
                    .withPlan("kbasyypn")
                    .withLicenseTextLink("hsgcbacphejkot")
                    .withPrivacyPolicyLink("qgoulznd")
                    .withMarketplaceTermsLink("kwy")
                    .withRetrieveDatetime(OffsetDateTime.parse("2021-09-01T01:28:54Z"))
                    .withSignature("gibma")
                    .withAccepted(false),
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("b", response.publisher());
        Assertions.assertEquals("tmut", response.product());
        Assertions.assertEquals("qktapspwgcuert", response.plan());
        Assertions.assertEquals("kdosvqw", response.licenseTextLink());
        Assertions.assertEquals("mdgbbjfdd", response.privacyPolicyLink());
        Assertions.assertEquals("bmbexppbhtqqro", response.marketplaceTermsLink());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-17T13:14:27Z"), response.retrieveDatetime());
        Assertions.assertEquals("psalgbqux", response.signature());
        Assertions.assertEquals(false, response.accepted());
    }
}
