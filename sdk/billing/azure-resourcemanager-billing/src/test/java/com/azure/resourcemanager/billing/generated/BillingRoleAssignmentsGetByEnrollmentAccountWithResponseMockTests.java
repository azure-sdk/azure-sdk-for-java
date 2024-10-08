// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.BillingRoleAssignment;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BillingRoleAssignmentsGetByEnrollmentAccountWithResponseMockTests {
    @Test
    public void testGetByEnrollmentAccountWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"New\",\"createdOn\":\"2021-03-12T22:35:02Z\",\"createdByPrincipalTenantId\":\"q\",\"createdByPrincipalId\":\"pvevtarphklql\",\"createdByPrincipalPuid\":\"q\",\"createdByUserEmailAddress\":\"n\",\"modifiedOn\":\"2021-11-07T09:09:08Z\",\"modifiedByPrincipalPuid\":\"nofgijydgsebju\",\"modifiedByUserEmailAddress\":\"tevaebzm\",\"modifiedByPrincipalId\":\"whrjkejvaedogzo\",\"modifiedByPrincipalTenantId\":\"xbxxgjogcphivfhr\",\"principalPuid\":\"enfdvdoea\",\"principalId\":\"wusrjzhdt\",\"principalTenantId\":\"yfezfsmyljdzy\",\"roleDefinitionId\":\"r\",\"scope\":\"mwtqil\",\"userAuthenticationType\":\"nnkynkstd\",\"userEmailAddress\":\"whjfp\",\"principalTenantName\":\"xaqjyihjcwwvaos\",\"principalDisplayName\":\"favh\",\"principalType\":\"Everyone\",\"billingRequestId\":\"pwweifdyfaoex\",\"billingAccountId\":\"uwnrd\",\"billingAccountDisplayName\":\"zlaihsujtg\",\"billingProfileId\":\"bszam\",\"billingProfileDisplayName\":\"xejpd\",\"invoiceSectionId\":\"iqwzutiyelrn\",\"invoiceSectionDisplayName\":\"jt\",\"customerId\":\"qsznsyovqm\",\"customerDisplayName\":\"udptoqwrnfc\"},\"tags\":{\"gejjxum\":\"hlokmxwawfubk\",\"uktdrsjtmnkxjouw\":\"wynjmoozm\",\"cfhep\":\"zcfdtstiaxtyrnu\"},\"id\":\"qbcmlroiomme\",\"name\":\"soq\",\"type\":\"blcyeqdobobaq\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BillingRoleAssignment response = manager.billingRoleAssignments()
            .getByEnrollmentAccountWithResponse("ohktxagfujdbqjny", "xbvxgx", "q", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("hlokmxwawfubk", response.tags().get("gejjxum"));
        Assertions.assertEquals("enfdvdoea", response.properties().principalPuid());
        Assertions.assertEquals("wusrjzhdt", response.properties().principalId());
        Assertions.assertEquals("yfezfsmyljdzy", response.properties().principalTenantId());
        Assertions.assertEquals("r", response.properties().roleDefinitionId());
        Assertions.assertEquals("mwtqil", response.properties().scope());
        Assertions.assertEquals("nnkynkstd", response.properties().userAuthenticationType());
        Assertions.assertEquals("whjfp", response.properties().userEmailAddress());
    }
}
