// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.email;

import com.azure.communication.email.models.*;
import com.azure.core.http.HttpClient;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.SyncPoller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Timeout(value = 10, unit = TimeUnit.MINUTES)
public class EmailClientTests extends EmailTestBase {

    private EmailClient emailClient;

    @BeforeEach
    public void beforeEach() {
        interceptorManager.removeSanitizers("AZSDK3493", "AZSDK3430");
    }

    @Override
    protected void beforeTest() {
        super.beforeTest();
    }

    @ParameterizedTest
    @MethodSource("getTestParameters")
    public void sendEmailToSingleRecipient(HttpClient httpClient) {
        emailClient = getEmailClient(httpClient);

        EmailMessage message = new EmailMessage().setSenderAddress(SENDER_ADDRESS)
            .setToRecipients(RECIPIENT_ADDRESS)
            .setSubject("test subject")
            .setBodyHtml("<h1>test message</h1>");

        SyncPoller<EmailSendResult, EmailSendResult> poller = emailClient.beginSend(message);
        PollResponse<EmailSendResult> response = poller.waitForCompletion();

        assertEquals(response.getValue().getStatus(), EmailSendStatus.SUCCEEDED);
    }

    @ParameterizedTest
    @MethodSource("getTestParameters")
    public void sendEmailToMultipleRecipients(HttpClient httpClient) {
        emailClient = getEmailClient(httpClient);

        EmailMessage message = new EmailMessage().setSenderAddress(SENDER_ADDRESS)
            .setSubject("test subject")
            .setBodyPlainText("test message")
            .setToRecipients(RECIPIENT_ADDRESS, SECOND_RECIPIENT_ADDRESS)
            .setCcRecipients(RECIPIENT_ADDRESS)
            .setBccRecipients(RECIPIENT_ADDRESS);

        SyncPoller<EmailSendResult, EmailSendResult> poller = emailClient.beginSend(message);
        PollResponse<EmailSendResult> response = poller.waitForCompletion();

        assertEquals(response.getValue().getStatus(), EmailSendStatus.SUCCEEDED);
    }

    @ParameterizedTest
    @MethodSource("getTestParameters")
    public void sendEmailWithAttachment(HttpClient httpClient) {
        emailClient = getEmailClient(httpClient);

        EmailAttachment attachment = new EmailAttachment("attachment.txt", "text/plain", BinaryData.fromString("test"));

        EmailMessage message = new EmailMessage().setSenderAddress(SENDER_ADDRESS)
            .setToRecipients(RECIPIENT_ADDRESS)
            .setSubject("test subject")
            .setBodyHtml("<h1>test message</h1>")
            .setAttachments(attachment);

        SyncPoller<EmailSendResult, EmailSendResult> poller = emailClient.beginSend(message);
        PollResponse<EmailSendResult> response = poller.waitForCompletion();

        assertEquals(response.getValue().getStatus(), EmailSendStatus.SUCCEEDED);
    }

    @ParameterizedTest
    @MethodSource("getTestParameters")
    public void sendEmailWithInlineAttachment(HttpClient httpClient) {
        emailClient = getEmailClient(httpClient);

        EmailAttachment attachment = new EmailAttachment("inlineimage.jpg", "image/jpeg", BinaryData.fromString("test"))
            .setContentId("inline_image");

        EmailMessage message = new EmailMessage().setSenderAddress(SENDER_ADDRESS)
            .setToRecipients(RECIPIENT_ADDRESS)
            .setSubject("test subject")
            .setBodyHtml("<h1>test message<img src=\"cid:inline_image\"></h1>")
            .setAttachments(attachment);

        SyncPoller<EmailSendResult, EmailSendResult> poller = emailClient.beginSend(message);
        PollResponse<EmailSendResult> response = poller.waitForCompletion();

        assertEquals(response.getValue().getStatus(), EmailSendStatus.SUCCEEDED);
    }

    @ParameterizedTest
    @MethodSource("getTestParameters")
    public void beginSendFromExistingOperationId(HttpClient httpClient) {
        emailClient = getEmailClient(httpClient);

        EmailMessage message = new EmailMessage().setSenderAddress(SENDER_ADDRESS)
            .setToRecipients(RECIPIENT_ADDRESS)
            .setSubject("test subject")
            .setBodyHtml("<h1>test message</h1>");

        SyncPoller<EmailSendResult, EmailSendResult> poller = emailClient.beginSend(message);
        PollResponse<EmailSendResult> response = poller.waitForCompletion();

        SyncPoller<EmailSendResult, EmailSendResult> poller2 = emailClient.beginSend(response.getValue().getId());
        PollResponse<EmailSendResult> response2 = poller2.waitForCompletion();

        assertEquals(response2.getValue().getStatus(), EmailSendStatus.SUCCEEDED);
    }
}
