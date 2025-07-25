// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.chat;

import com.azure.communication.chat.implementation.ChatOptionsProvider;
import com.azure.communication.chat.models.ChatMessage;
import com.azure.communication.chat.models.ChatMessageReadReceipt;
import com.azure.communication.chat.models.ChatMessageType;
import com.azure.communication.chat.models.ChatParticipant;
import com.azure.communication.chat.models.ChatRetentionPolicy;
import com.azure.communication.chat.models.ChatThreadProperties;
import com.azure.communication.chat.models.CreateChatThreadOptions;
import com.azure.communication.chat.models.CreateChatThreadResult;
import com.azure.communication.chat.models.ListChatMessagesOptions;
import com.azure.communication.chat.models.ListParticipantsOptions;
import com.azure.communication.chat.models.ListReadReceiptOptions;
import com.azure.communication.chat.models.NoneRetentionPolicy;
import com.azure.communication.chat.models.SendChatMessageOptions;
import com.azure.communication.chat.models.SendChatMessageResult;
import com.azure.communication.chat.models.ThreadCreationDateRetentionPolicy;
import com.azure.communication.chat.models.TypingNotificationOptions;
import com.azure.communication.chat.models.UpdateChatMessageOptions;
import com.azure.communication.chat.models.UpdateChatThreadOptions;
import com.azure.communication.common.CommunicationUserIdentifier;
import com.azure.communication.identity.CommunicationIdentityClient;
import com.azure.communication.identity.models.CommunicationTokenScope;
import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Set the AZURE_TEST_MODE environment variable to either PLAYBACK or RECORD to determine if tests are playback or
 * live. By default, tests are run in playback mode.
 */
public class ChatThreadClientTest extends ChatClientTestBase {

    private ClientLogger logger = new ClientLogger(ChatThreadClientTest.class);

    private CommunicationIdentityClient communicationClient;
    private ChatClient client;
    private ChatThreadClient chatThreadClient;
    private String threadId;

    private CommunicationUserIdentifier firstParticipant;
    private CommunicationUserIdentifier secondParticipant;
    private CommunicationUserIdentifier firstAddedParticipant;
    private CommunicationUserIdentifier secondAddedParticipant;

    @Override
    protected void afterTest() {
        super.afterTest();
    }

    private void setupTest(HttpClient httpClient, String testName) {
        communicationClient = getCommunicationIdentityClientBuilder(
            interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient).buildClient();
        firstParticipant = communicationClient.createUser();
        secondParticipant = communicationClient.createUser();
        firstAddedParticipant = communicationClient.createUser();
        secondAddedParticipant = communicationClient.createUser();

        List<CommunicationTokenScope> scopes = Arrays.asList(CommunicationTokenScope.CHAT);
        AccessToken response = communicationClient.getToken(firstParticipant, scopes);

        ChatClientBuilder chatBuilder = getChatClientBuilder(response.getToken(), httpClient);
        client = addLoggingPolicyForIdentityClientBuilder(chatBuilder, testName).buildClient();

        CreateChatThreadOptions threadRequest
            = ChatOptionsProvider.createThreadOptions(firstParticipant.getId(), secondParticipant.getId());

        CreateChatThreadResult createChatThreadResult = client.createChatThread(threadRequest);
        chatThreadClient = client.getChatThreadClient(createChatThreadResult.getChatThread().getId());

        threadId = chatThreadClient.getChatThreadId();
    }

    private void setupTestWithCreationDateRetentionPolicy(HttpClient httpClient, String testName, int deleteAfterDays) {
        communicationClient = getCommunicationIdentityClientBuilder(
            interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient).buildClient();
        firstParticipant = communicationClient.createUser();
        secondParticipant = communicationClient.createUser();
        firstAddedParticipant = communicationClient.createUser();
        secondAddedParticipant = communicationClient.createUser();

        List<CommunicationTokenScope> scopes = Arrays.asList(CommunicationTokenScope.CHAT);
        AccessToken response = communicationClient.getToken(firstParticipant, scopes);

        ChatClientBuilder chatBuilder = getChatClientBuilder(response.getToken(), httpClient);
        client = addLoggingPolicyForIdentityClientBuilder(chatBuilder, testName).buildClient();

        CreateChatThreadOptions threadRequest
            = ChatOptionsProvider.createThreadOptions(firstParticipant.getId(), secondParticipant.getId());
        threadRequest.setRetentionPolicy(new ThreadCreationDateRetentionPolicy(deleteAfterDays));

        CreateChatThreadResult createChatThreadResult = client.createChatThread(threadRequest);
        chatThreadClient = client.getChatThreadClient(createChatThreadResult.getChatThread().getId());

        threadId = chatThreadClient.getChatThreadId();
    }

    private void setupUnitTest(HttpClient mockHttpClient) {
        String threadId = "19:4b72178530934b7790135dd9359205e0@thread.v2";
        String mockToken
            = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjEwMl9pbnQiLCJ0eXAiOiJKV1QifQ.eyJza3lwZWlkIjoic3Bvb2w6NTdiOWJhYzktZGY2Yy00ZDM5LWE3M2ItMjZlOTQ0YWRmNmVhXzNmMDExNi03YzAwOTQ5MGRjIiwic2NwIjoxNzkyLCJjc2kiOiIxNTk3ODcyMDgyIiwiaWF0IjoxNTk3ODcyMDgyLCJleHAiOjE1OTc5NTg0ODIsImFjc1Njb3BlIjoiY2hhdCIsInJlc291cmNlSWQiOiI1N2I5YmFjOS1kZjZjLTRkMzktYTczYi0yNmU5NDRhZGY2ZWEifQ.l2UXI0KH2LXZQoz7FPsfLZS0CX8cYsnW3CMECfqwuncV8WqrTD7RbqZDfAaYXn0t5sHrGM4CRbpx4LwIZhXOlmsmOdTdHSsPUCIqJscwNjQmltvOrIt11DOmObQ63w0kYq9QrlB-lyZNzTEAED2FhMwBAbhZOokRtFajYD7KvJb1w9oUXousQ_z6zZqjbt1Cy4Ll3zO1GR4G7yRV8vK3bLnN2IWPaEkoqx8PHeHLa9Cb4joowseRfQxFHv28xcCF3r9SBCauUeJcmbwBmnOAOLS-EAJTLiGhil7m3BNyLN5RnYbsK5ComtL2-02TbkPilpy21OhW0MJkicSFlCbYvg";
        client = getChatClientBuilder(mockToken, mockHttpClient).buildClient();
        chatThreadClient = client.getChatThreadClient(threadId);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canUpdateThreadTopic(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canUpdateThread");
        String newTopic = "Update Test";

        // Action & Assert
        chatThreadClient.updateTopic(newTopic);

        ChatThreadProperties chatThreadProperties = chatThreadClient.getProperties();
        assertEquals(chatThreadProperties.getTopic(), newTopic);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canUpdateThreadTopicWithResponse(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canUpdateThreadWithResponse");
        String newTopic = "Update Test";

        // Action & Assert
        chatThreadClient.updateTopicWithResponse(newTopic, Context.NONE);

        ChatThreadProperties chatThreadProperties = chatThreadClient.getProperties();
        assertEquals(chatThreadProperties.getTopic(), newTopic);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canUpdateThreadTopicWithThreadCreationDateRetentionPolicy(HttpClient httpClient) {
        // Arrange
        setupTestWithCreationDateRetentionPolicy(httpClient,
            "canUpdateThreadTopicWithThreadCreationDateRetentionPolicy", 50);
        String newTopic = "Update Test";

        // Action & Assert
        chatThreadClient.updateTopicWithResponse(newTopic, Context.NONE);

        ChatThreadProperties chatThreadProperties = chatThreadClient.getProperties();
        assertEquals(chatThreadProperties.getTopic(), newTopic);

        ChatRetentionPolicy chatRetentionPolicy = chatThreadProperties.getRetentionPolicy();
        assertNotNull(chatRetentionPolicy);
        assertEquals("threadCreationDate", chatRetentionPolicy.getKind().getValue());
        ThreadCreationDateRetentionPolicy datePolicy = (ThreadCreationDateRetentionPolicy) chatRetentionPolicy;
        assertEquals(50, datePolicy.getDeleteThreadAfterDays());
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canUpdateThreadPropertiesWithThreadCreationDateRetentionPolicy(HttpClient httpClient) {
        // Arrange
        setupTestWithCreationDateRetentionPolicy(httpClient,
            "canUpdateThreadPropertiesWithThreadCreationDateRetentionPolicy", 50);

        String newTopic = "Updated Topic";
        ThreadCreationDateRetentionPolicy updatedPolicy = new ThreadCreationDateRetentionPolicy(90); // changed from 50 → 90

        UpdateChatThreadOptions options
            = new UpdateChatThreadOptions().setTopic(newTopic).setRetentionPolicy(updatedPolicy);

        // Act
        chatThreadClient.updateThreadPropertiesWithResponse(options, Context.NONE);

        // Assert
        ChatThreadProperties chatThreadProperties = chatThreadClient.getProperties();
        assertEquals(newTopic, chatThreadProperties.getTopic());

        ChatRetentionPolicy chatRetentionPolicy = chatThreadProperties.getRetentionPolicy();
        assertNotNull(chatRetentionPolicy);
        assertEquals("threadCreationDate", chatRetentionPolicy.getKind().getValue());

        ThreadCreationDateRetentionPolicy datePolicy = (ThreadCreationDateRetentionPolicy) chatRetentionPolicy;
        assertEquals(90, datePolicy.getDeleteThreadAfterDays());
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canUpdateThreadPropertiesToNoneRetentionPolicy(HttpClient httpClient) {
        // Arrange
        setupTestWithCreationDateRetentionPolicy(httpClient, "canUpdateThreadPropertiesToNoneRetentionPolicy", 60);

        String newTopic = "Updated Topic With None Policy";
        NoneRetentionPolicy nonePolicy = new NoneRetentionPolicy();

        UpdateChatThreadOptions options
            = new UpdateChatThreadOptions().setTopic(newTopic).setRetentionPolicy(nonePolicy);

        // Act
        chatThreadClient.updateThreadPropertiesWithResponse(options, Context.NONE);

        // Assert
        ChatThreadProperties chatThreadProperties = chatThreadClient.getProperties();
        assertEquals(newTopic, chatThreadProperties.getTopic());

        ChatRetentionPolicy chatRetentionPolicy = chatThreadProperties.getRetentionPolicy();
        assertNotNull(chatRetentionPolicy);
        assertEquals("none", chatRetentionPolicy.getKind().getValue());

        assertTrue(chatRetentionPolicy instanceof NoneRetentionPolicy);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canUpdateThreadPropertiesTopic(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canUpdateThreadPropertiesTopic");
        String newTopic = "Updated Topic";
        UpdateChatThreadOptions options = new UpdateChatThreadOptions().setTopic(newTopic);

        // Act
        chatThreadClient.updateThreadProperties(options);

        // Assert
        ChatThreadProperties chatThreadProperties = chatThreadClient.getProperties();
        assertEquals(chatThreadProperties.getTopic(), newTopic);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canUpdateThreadPropertiesWithResponse(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canUpdateThreadPropertiesWithResponse");
        String newTopic = "Updated Topic With Response";
        UpdateChatThreadOptions options = new UpdateChatThreadOptions().setTopic(newTopic);

        // Act
        Response<Void> response = chatThreadClient.updateThreadPropertiesWithResponse(options, Context.NONE);

        // Assert
        assertEquals(204, response.getStatusCode());
        ChatThreadProperties chatThreadProperties = chatThreadClient.getProperties();
        assertEquals(chatThreadProperties.getTopic(), newTopic);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canUpdateThreadPropertiesWithMetadata(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canUpdateThreadPropertiesWithMetadata");
        String newTopic = "Topic with Metadata";
        Map<String, String> metadata = new HashMap<>();
        metadata.put("key1", "value1");
        metadata.put("key2", "value2");
        UpdateChatThreadOptions options = new UpdateChatThreadOptions().setTopic(newTopic).setMetadata(metadata);

        // Act
        chatThreadClient.updateThreadProperties(options);

        // Assert
        ChatThreadProperties chatThreadProperties = chatThreadClient.getProperties();
        assertEquals(newTopic, chatThreadProperties.getTopic());
        assertEquals("value1", chatThreadProperties.getMetadata().get("key1"));
        assertEquals("value2", chatThreadProperties.getMetadata().get("key2"));
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canUpdateThreadWithRetentionPolicy(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canUpdateThreadWithRetentionPolicy");
        String newTopic = "Topic with Retention";
        ThreadCreationDateRetentionPolicy retentionPolicy = new ThreadCreationDateRetentionPolicy(90);
        UpdateChatThreadOptions options
            = new UpdateChatThreadOptions().setTopic(newTopic).setRetentionPolicy(retentionPolicy);

        // Act
        chatThreadClient.updateThreadProperties(options);

        // Assert
        ChatThreadProperties chatThreadProperties = chatThreadClient.getProperties();
        assertEquals(newTopic, chatThreadProperties.getTopic());

        ChatRetentionPolicy actualPolicy = chatThreadProperties.getRetentionPolicy();
        assertNotNull(actualPolicy);
        assertTrue(actualPolicy instanceof ThreadCreationDateRetentionPolicy);
        assertEquals("threadCreationDate", actualPolicy.getKind().getValue());
        assertEquals(90, ((ThreadCreationDateRetentionPolicy) actualPolicy).getDeleteThreadAfterDays());
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canAddListAndRemoveParticipants(HttpClient httpClient) throws InterruptedException {
        // Arrange
        setupTest(httpClient, "canAddListAndRemoveParticipants");
        firstAddedParticipant = communicationClient.createUser();
        secondAddedParticipant = communicationClient.createUser();

        Iterable<ChatParticipant> participants
            = ChatOptionsProvider.addParticipantsOptions(firstAddedParticipant.getId(), secondAddedParticipant.getId());

        // Action & Assert
        chatThreadClient.addParticipants(participants);

        PagedIterable<ChatParticipant> participantsResponse = chatThreadClient.listParticipants();

        // process the iterableByPage
        List<ChatParticipant> returnedparticipants = new ArrayList<ChatParticipant>();
        participantsResponse.iterableByPage().forEach(resp -> {
            assertEquals(200, resp.getStatusCode());
            resp.getItems().forEach(item -> returnedparticipants.add(item));
        });

        for (ChatParticipant participant : participants) {
            assertTrue(checkParticipantsListContainsParticipantId(returnedparticipants,
                ((CommunicationUserIdentifier) participant.getCommunicationIdentifier()).getId()));
        }

        assertTrue(returnedparticipants.size() == 4);

        for (ChatParticipant participant : participants) {
            chatThreadClient.removeParticipant(participant.getCommunicationIdentifier());
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canAddListAndRemoveParticipantsWithOptions(HttpClient httpClient) throws InterruptedException {
        // Arrange
        setupTest(httpClient, "canAddListAndRemoveParticipantsWithOptions");
        firstAddedParticipant = communicationClient.createUser();
        secondAddedParticipant = communicationClient.createUser();

        Iterable<ChatParticipant> participants
            = ChatOptionsProvider.addParticipantsOptions(firstAddedParticipant.getId(), secondAddedParticipant.getId());

        // Action & Assert
        chatThreadClient.addParticipants(participants);

        PagedIterable<ChatParticipant> participantsResponse
            = chatThreadClient.listParticipants(new ListParticipantsOptions().setMaxPageSize(2), Context.NONE);

        // process the iterableByPage
        List<ChatParticipant> returnedParticipants = new ArrayList<ChatParticipant>();
        participantsResponse.iterableByPage().forEach(resp -> {
            assertEquals(200, resp.getStatusCode());
            resp.getItems().forEach(item -> returnedParticipants.add(item));
        });

        for (ChatParticipant participant : participants) {
            assertTrue(checkParticipantsListContainsParticipantId(returnedParticipants,
                ((CommunicationUserIdentifier) participant.getCommunicationIdentifier()).getId()));
        }

        assertTrue(returnedParticipants.size() == 4);

        for (ChatParticipant participant : participants) {
            chatThreadClient.removeParticipant(participant.getCommunicationIdentifier());
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canAddListAndRemoveParticipantsWithResponse(HttpClient httpClient) throws InterruptedException {
        // Arrange
        setupTest(httpClient, "canAddListAndRemoveParticipantsWithResponse");

        // Action & Assert
        PagedIterable<ChatParticipant> membersResponse = chatThreadClient.listParticipants();

        // process the iterableByPage
        List<ChatParticipant> returnedMembers = new ArrayList<ChatParticipant>();
        membersResponse.iterableByPage().forEach(resp -> {
            assertEquals(resp.getStatusCode(), 200);
            resp.getItems().forEach(item -> returnedMembers.add(item));
        });

        assertEquals(returnedMembers.size(), 2);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canAddListAndRemoveMembersWithResponse(HttpClient httpClient) throws InterruptedException {
        // Arrange
        setupTest(httpClient, "canAddListAndRemoveMembersWithResponse");
        firstAddedParticipant = communicationClient.createUser();
        secondAddedParticipant = communicationClient.createUser();

        Iterable<ChatParticipant> participants
            = ChatOptionsProvider.addParticipantsOptions(firstAddedParticipant.getId(), secondAddedParticipant.getId());

        // Action & Assert
        chatThreadClient.addParticipantsWithResponse(participants, Context.NONE);

        PagedIterable<ChatParticipant> participantsResponse = chatThreadClient.listParticipants();

        // process the iterableByPage
        List<ChatParticipant> returnedParticipants = new ArrayList<ChatParticipant>();
        participantsResponse.iterableByPage().forEach(resp -> {
            assertEquals(200, resp.getStatusCode());
            resp.getItems().forEach(item -> returnedParticipants.add(item));
        });

        for (ChatParticipant participant : participants) {
            assertTrue(checkParticipantsListContainsParticipantId(returnedParticipants,
                ((CommunicationUserIdentifier) participant.getCommunicationIdentifier()).getId()));
        }

        assertTrue(returnedParticipants.size() == 4);

        for (ChatParticipant participant : participants) {
            chatThreadClient.removeParticipantWithResponse(participant.getCommunicationIdentifier(), Context.NONE);
        }
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canAddSingleParticipant(HttpClient httpClient) throws InterruptedException {
        // Arrange
        setupTest(httpClient, "canAddSingleParticipant");
        CommunicationUserIdentifier participant = communicationClient.createUser();

        // Action & Assert
        chatThreadClient.addParticipant(new ChatParticipant().setCommunicationIdentifier(participant));

        PagedIterable<ChatParticipant> participantsResponse = chatThreadClient.listParticipants();
        assertTrue(participantsResponse.stream()
            .anyMatch(p -> ((CommunicationUserIdentifier) p.getCommunicationIdentifier()).getId()
                .equals(participant.getId())));
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canAddSingleParticipantWithResponse(HttpClient httpClient) throws InterruptedException {
        // Arrange
        setupTest(httpClient, "canAddSingleParticipantWithResponse");
        CommunicationUserIdentifier participant = communicationClient.createUser();

        // Action & Assert
        chatThreadClient.addParticipantWithResponse(new ChatParticipant().setCommunicationIdentifier(participant),
            Context.NONE);

        PagedIterable<ChatParticipant> participantsResponse = chatThreadClient.listParticipants();
        assertTrue(participantsResponse.stream()
            .anyMatch(p -> ((CommunicationUserIdentifier) p.getCommunicationIdentifier()).getId()
                .equals(participant.getId())));
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canSendThenGetMessage(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canSendThenGetMessage");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();

        // Action & Assert
        SendChatMessageResult response = chatThreadClient.sendMessage(messageRequest);

        ChatMessage message = chatThreadClient.getMessage(response.getId());
        assertEquals(message.getContent().getMessage(), messageRequest.getContent());
        assertEquals(message.getSenderDisplayName(), messageRequest.getSenderDisplayName());
        assertTrue(message.getMetadata().equals(messageRequest.getMetadata()));
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canSendThenGetMessageWithResponse(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canSendThenGetMessageWithResponse");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();

        // Action & Assert
        SendChatMessageResult response
            = chatThreadClient.sendMessageWithResponse(messageRequest, Context.NONE).getValue();

        ChatMessage message = chatThreadClient.getMessageWithResponse(response.getId(), Context.NONE).getValue();
        assertEquals(message.getContent().getMessage(), messageRequest.getContent());
        assertEquals(message.getSenderDisplayName(), messageRequest.getSenderDisplayName());
        assertTrue(message.getMetadata().equals(messageRequest.getMetadata()));
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canDeleteExistingMessage(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canDeleteExistingMessage");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();

        SendChatMessageResult response = chatThreadClient.sendMessage(messageRequest);

        // Action & Assert
        chatThreadClient.deleteMessage(response.getId());
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canDeleteExistingMessageWithResponse(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canDeleteExistingMessageWithResponse");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();

        SendChatMessageResult response = chatThreadClient.sendMessage(messageRequest);

        // Action & Assert
        chatThreadClient.deleteMessageWithResponse(response.getId(), Context.NONE);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canUpdateExistingMessage(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canUpdateExistingMessage");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();
        UpdateChatMessageOptions updateMessageRequest = ChatOptionsProvider.updateMessageOptions();

        SendChatMessageResult response = chatThreadClient.sendMessage(messageRequest);

        // Action & Assert
        chatThreadClient.updateMessage(response.getId(), updateMessageRequest);

        ChatMessage message = chatThreadClient.getMessage(response.getId());
        assertEquals(message.getContent().getMessage(), updateMessageRequest.getContent());

        assertFalse(message.getMetadata().containsKey("tags"));
        assertEquals(message.getMetadata().get("deliveryMode"), updateMessageRequest.getMetadata().get("deliveryMode"));
        assertEquals(message.getMetadata().get("onedriveReferences"),
            updateMessageRequest.getMetadata().get("onedriveReferences"));
        assertEquals(message.getMetadata().get("amsreferences"), messageRequest.getMetadata().get("amsreferences"));
        assertEquals(message.getMetadata().get("key"), messageRequest.getMetadata().get("key"));
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canUpdateExistingMessageWithResponse(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canUpdateExistingMessageWithResponse");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();
        UpdateChatMessageOptions updateMessageRequest = ChatOptionsProvider.updateMessageOptions();

        SendChatMessageResult response = chatThreadClient.sendMessage(messageRequest);

        // Action & Assert
        chatThreadClient.updateMessageWithResponse(response.getId(), updateMessageRequest, Context.NONE);

        ChatMessage message = chatThreadClient.getMessage(response.getId());
        assertEquals(message.getContent().getMessage(), updateMessageRequest.getContent());

        assertFalse(message.getMetadata().containsKey("tags"));
        assertEquals(message.getMetadata().get("deliveryMode"), updateMessageRequest.getMetadata().get("deliveryMode"));
        assertEquals(message.getMetadata().get("onedriveReferences"),
            updateMessageRequest.getMetadata().get("onedriveReferences"));
        assertEquals(message.getMetadata().get("amsreferences"), messageRequest.getMetadata().get("amsreferences"));
        assertEquals(message.getMetadata().get("key"), messageRequest.getMetadata().get("key"));
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canListMessagesWithOptionsSync(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canListMessagesWithOptionsSync");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();
        chatThreadClient.sendMessage(messageRequest);
        chatThreadClient.sendMessage(messageRequest);

        // Action & Assert
        PagedIterable<ChatMessage> messagesResponse = chatThreadClient.listMessages();

        // process the iterableByPage
        List<ChatMessage> returnedMessages = new ArrayList<ChatMessage>();
        messagesResponse.iterableByPage().forEach(resp -> {
            assertEquals(200, resp.getStatusCode());
            resp.getItems().forEach(item -> {
                if (item.getType().equals(ChatMessageType.TEXT)) {
                    returnedMessages.add(item);
                }
            });
        });

        assertTrue(returnedMessages.size() == 2);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canListMessagesWithOptions(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canListMessagesWithOptions");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();
        chatThreadClient.sendMessage(messageRequest);
        chatThreadClient.sendMessage(messageRequest);

        ListChatMessagesOptions options = new ListChatMessagesOptions();
        options.setMaxPageSize(10);
        options.setStartTime(OffsetDateTime.parse("2020-09-08T01:02:14.387Z"));

        // Action & Assert
        PagedIterable<ChatMessage> messagesResponse = chatThreadClient.listMessages(options, Context.NONE);

        // process the iterableByPage
        List<ChatMessage> returnedMessages = new ArrayList<ChatMessage>();
        messagesResponse.iterableByPage().forEach(resp -> {
            assertEquals(200, resp.getStatusCode());
            resp.getItems().forEach(item -> {
                if (item.getType().equals(ChatMessageType.TEXT)) {
                    returnedMessages.add(item);
                }
            });
        });

        assertEquals(returnedMessages.size(), 2);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canSendTypingNotification(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canSendTypingNotification");

        // Action & Assert
        chatThreadClient.sendTypingNotification();
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canSendTypingNotificationWithResponse(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canSendTypingNotificationWithResponse");

        // Action & Assert
        chatThreadClient.sendTypingNotificationWithResponse(Context.NONE);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canSendTypingNotificationWithResponseWithOptions(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canSendTypingNotificationWithResponseWithOptions");

        TypingNotificationOptions options = new TypingNotificationOptions();
        options.setSenderDisplayName("Sender");

        // Action & Assert
        chatThreadClient.sendTypingNotificationWithResponse(options, Context.NONE);
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(named = "SKIP_LIVE_TEST", matches = "(?i)(true)")
    public void canSendThenListReadReceipts(HttpClient httpClient) throws InterruptedException {
        // Arrange
        setupTest(httpClient, "canSendThenListReadReceipts");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();

        SendChatMessageResult response = chatThreadClient.sendMessage(messageRequest);

        // Action & Assert
        chatThreadClient.sendReadReceipt(response.getId());

        PagedIterable<ChatMessageReadReceipt> readReceiptsResponse = chatThreadClient.listReadReceipts();

        // process the iterableByPage
        List<ChatMessageReadReceipt> returnedReadReceipts = new ArrayList<ChatMessageReadReceipt>();
        readReceiptsResponse.iterableByPage().forEach(resp -> {
            assertEquals(200, resp.getStatusCode());
            resp.getItems().forEach(item -> returnedReadReceipts.add(item));
        });

        assertTrue(returnedReadReceipts.size() > 0);
        checkReadReceiptListContainsMessageId(returnedReadReceipts, response.getId());
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(named = "SKIP_LIVE_TEST", matches = "(?i)(true)")
    public void canSendThenListReadReceiptsWithOptions(HttpClient httpClient) throws InterruptedException {
        // Arrange
        setupTest(httpClient, "canSendThenListReadReceiptsWithOptions");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();

        SendChatMessageResult response = chatThreadClient.sendMessage(messageRequest);

        // Action & Assert
        chatThreadClient.sendReadReceipt(response.getId());

        // Add delay to allow the read receipt to be available in list
        Thread.sleep(1000);

        PagedIterable<ChatMessageReadReceipt> readReceiptsResponse
            = chatThreadClient.listReadReceipts(new ListReadReceiptOptions().setMaxPageSize(1), Context.NONE);

        // process the iterableByPage
        List<ChatMessageReadReceipt> returnedReadReceipts = new ArrayList<ChatMessageReadReceipt>();
        readReceiptsResponse.iterableByPage().forEach(resp -> {
            assertEquals(200, resp.getStatusCode());
            resp.getItems().forEach(item -> returnedReadReceipts.add(item));
        });

        assertTrue(returnedReadReceipts.size() > 0);
        checkReadReceiptListContainsMessageId(returnedReadReceipts, response.getId());
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    @DisabledIfEnvironmentVariable(named = "SKIP_LIVE_TEST", matches = "(?i)(true)")
    public void canSendThenListReadReceiptsWithResponse(HttpClient httpClient) throws InterruptedException {
        // Arrange
        setupTest(httpClient, "canSendThenListReadReceiptsWithResponse");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();

        SendChatMessageResult response = chatThreadClient.sendMessage(messageRequest);

        // Action & Assert
        chatThreadClient.sendReadReceiptWithResponse(response.getId(), Context.NONE);

        PagedIterable<ChatMessageReadReceipt> readReceiptsResponse = chatThreadClient.listReadReceipts();

        // process the iterableByPage
        List<ChatMessageReadReceipt> returnedReadReceipts = new ArrayList<ChatMessageReadReceipt>();
        readReceiptsResponse.iterableByPage().forEach(resp -> {
            assertEquals(200, resp.getStatusCode());
            resp.getItems().forEach(item -> returnedReadReceipts.add(item));
        });

        assertTrue(returnedReadReceipts.size() > 0);
        checkReadReceiptListContainsMessageId(returnedReadReceipts, response.getId());
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canSendReadReceiptSync(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canSendReadReceiptSync");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();

        SendChatMessageResult response = chatThreadClient.sendMessage(messageRequest);

        // Action & Assert
        chatThreadClient.sendReadReceipt(response.getId());
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canSendReadReceiptWithResponseSync(HttpClient httpClient) throws InterruptedException {
        // Arrange
        setupTest(httpClient, "canSendReadReceiptWithResponseSync");
        SendChatMessageOptions messageRequest = ChatOptionsProvider.sendMessageOptions();

        SendChatMessageResult response = chatThreadClient.sendMessage(messageRequest);

        // Action & Assert
        Response<Void> sendResponse = chatThreadClient.sendReadReceiptWithResponse(response.getId(), Context.NONE);
        assertEquals(200, sendResponse.getStatusCode());
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canGetChatThreadProperties(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canGetChatThreadPropertiesSync");

        // Action & Assert
        ChatThreadProperties chatThreadProperties = chatThreadClient.getProperties();
        assertEquals(chatThreadClient.getChatThreadId(), chatThreadProperties.getId());
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void canGetChatThreadPropertiesWithResponse(HttpClient httpClient) {
        // Arrange
        setupTest(httpClient, "canGetChatThreadPropertiesWithResponseSync");

        // Action & Assert
        ChatThreadProperties chatThreadProperties = chatThreadClient.getPropertiesWithResponse(Context.NONE).getValue();
        assertEquals(chatThreadClient.getChatThreadId(), chatThreadProperties.getId());
    }

    @ParameterizedTest
    @MethodSource("com.azure.core.test.TestBase#getHttpClients")
    public void cannotAddParticipantsWithResponseWithNullOptions(HttpClient httpClient) {
        assertThrows(NullPointerException.class, () -> {
            chatThreadClient.addParticipantsWithResponse(null, Context.NONE);
        });
    }
}
