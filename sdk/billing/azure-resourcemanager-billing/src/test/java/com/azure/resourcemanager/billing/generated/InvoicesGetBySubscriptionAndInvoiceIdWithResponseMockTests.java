// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.Invoice;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class InvoicesGetBySubscriptionAndInvoiceIdWithResponseMockTests {
    @Test
    public void testGetBySubscriptionAndInvoiceIdWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"dueDate\":\"2021-10-03T14:21:22Z\",\"invoiceDate\":\"2021-02-27T09:08:37Z\",\"status\":\"Void\",\"amountDue\":{\"currency\":\"py\",\"value\":83.36014},\"azurePrepaymentApplied\":{\"currency\":\"eblydyv\",\"value\":47.9007},\"billedAmount\":{\"currency\":\"ocxnehvsmtodl\",\"value\":57.823967},\"creditAmount\":{\"currency\":\"ucygvo\",\"value\":34.292477},\"freeAzureCreditApplied\":{\"currency\":\"ssxlghieegjlg\",\"value\":45.138866},\"subTotal\":{\"currency\":\"eksgbuxantuygd\",\"value\":8.260214},\"taxAmount\":{\"currency\":\"pirpiwrqof\",\"value\":3.015864},\"totalAmount\":{\"currency\":\"jnlex\",\"value\":70.006035},\"invoicePeriodStartDate\":\"2021-09-02T12:37:37Z\",\"invoicePeriodEndDate\":\"2021-03-18T11:37:29Z\",\"invoiceType\":\"AzureService\",\"isMonthlyInvoice\":true,\"billingProfileId\":\"uuuercta\",\"billingProfileDisplayName\":\"yintqpbrlcy\",\"purchaseOrderNumber\":\"uczkgofxyfsruc\",\"documents\":[],\"payments\":[],\"rebillDetails\":{},\"documentType\":\"CreditNote\",\"billedDocumentId\":\"st\",\"creditForDocumentId\":\"eaqnrmvvfkoxm\",\"subscriptionId\":\"hktuidvrma\"},\"id\":\"lpdwwexymzvlazi\",\"name\":\"bhpwvqsgnyy\",\"type\":\"uzivensrpmeyyvp\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        BillingManager manager =
            BillingManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Invoice response =
            manager
                .invoices()
                .getBySubscriptionAndInvoiceIdWithResponse("zfrgqhaohcm", com.azure.core.util.Context.NONE)
                .getValue();
    }
}
