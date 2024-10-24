// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.fluent.models.LicenseInner;
import com.azure.resourcemanager.hybridcompute.models.License;
import com.azure.resourcemanager.hybridcompute.models.LicenseCoreType;
import com.azure.resourcemanager.hybridcompute.models.LicenseDetails;
import com.azure.resourcemanager.hybridcompute.models.LicenseEdition;
import com.azure.resourcemanager.hybridcompute.models.LicenseState;
import com.azure.resourcemanager.hybridcompute.models.LicenseTarget;
import com.azure.resourcemanager.hybridcompute.models.LicenseType;
import com.azure.resourcemanager.hybridcompute.models.ProgramYear;
import com.azure.resourcemanager.hybridcompute.models.VolumeLicenseDetails;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class LicensesValidateLicenseMockTests {
    @Test
    public void testValidateLicense() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"tenantId\":\"dz\",\"licenseType\":\"ESU\",\"licenseDetails\":{\"state\":\"Deactivated\",\"target\":\"Windows Server 2012\",\"edition\":\"Datacenter\",\"type\":\"pCore\",\"processors\":1770480211,\"assignedLicenses\":496304877,\"immutableId\":\"p\",\"volumeLicenseDetails\":[{\"programYear\":\"Year 2\",\"invoiceId\":\"vyl\"},{\"programYear\":\"Year 2\",\"invoiceId\":\"vluwmncsttij\"}]}},\"location\":\"bvpoekrsgsgbdhu\",\"tags\":{\"zvhxnk\":\"njdgkynscliq\",\"bo\":\"mtk\",\"hihfrbbcevqagtlt\":\"ppnvdxz\",\"vgtrdcnifmzzs\":\"hlfkqojpy\"},\"id\":\"ymbrnysuxmpraf\",\"name\":\"g\",\"type\":\"khocxvdfffwaf\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridComputeManager manager = HybridComputeManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        License response = manager.licenses()
            .validateLicense(
                new LicenseInner().withLocation("lqtmldgxob")
                    .withTags(mapOf("yzriykhy", "clnpkci", "jlb", "wf"))
                    .withTenantId("ydzgkrvqeevtoe")
                    .withLicenseType(LicenseType.ESU)
                    .withLicenseDetails(new LicenseDetails().withState(LicenseState.ACTIVATED)
                        .withTarget(LicenseTarget.WINDOWS_SERVER_2012)
                        .withEdition(LicenseEdition.STANDARD)
                        .withType(LicenseCoreType.V_CORE)
                        .withProcessors(111539193)
                        .withVolumeLicenseDetails(Arrays.asList(
                            new VolumeLicenseDetails().withProgramYear(ProgramYear.YEAR_2).withInvoiceId("riglaec"),
                            new VolumeLicenseDetails().withProgramYear(ProgramYear.YEAR_2).withInvoiceId("icokpv")))),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("bvpoekrsgsgbdhu", response.location());
        Assertions.assertEquals("njdgkynscliq", response.tags().get("zvhxnk"));
        Assertions.assertEquals("dz", response.tenantId());
        Assertions.assertEquals(LicenseType.ESU, response.licenseType());
        Assertions.assertEquals(LicenseState.DEACTIVATED, response.licenseDetails().state());
        Assertions.assertEquals(LicenseTarget.WINDOWS_SERVER_2012, response.licenseDetails().target());
        Assertions.assertEquals(LicenseEdition.DATACENTER, response.licenseDetails().edition());
        Assertions.assertEquals(LicenseCoreType.P_CORE, response.licenseDetails().type());
        Assertions.assertEquals(1770480211, response.licenseDetails().processors());
        Assertions.assertEquals(ProgramYear.YEAR_2,
            response.licenseDetails().volumeLicenseDetails().get(0).programYear());
        Assertions.assertEquals("vyl", response.licenseDetails().volumeLicenseDetails().get(0).invoiceId());
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
