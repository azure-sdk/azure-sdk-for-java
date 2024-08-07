// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A request to send a text notification.
 */
@Immutable
public final class TextNotificationContent extends NotificationContent {

    /*
     * The type discriminator describing a notification type.
     */
    @Generated
    private CommunicationMessageKind kind = CommunicationMessageKind.TEXT;

    /*
     * Message content.
     */
    @Generated
    private final String content;

    /**
     * Creates an instance of TextNotificationContent class.
     *
     * @param channelRegistrationId the channelRegistrationId value to set.
     * @param to the to value to set.
     * @param content the content value to set.
     */
    @Generated
    public TextNotificationContent(String channelRegistrationId, List<String> to, String content) {
        super(channelRegistrationId, to);
        this.content = content;
    }

    /**
     * Get the kind property: The type discriminator describing a notification type.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public CommunicationMessageKind getKind() {
        return this.kind;
    }

    /**
     * Get the content property: Message content.
     *
     * @return the content value.
     */
    @Generated
    public String getContent() {
        return this.content;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("channelRegistrationId", getChannelRegistrationId());
        jsonWriter.writeArrayField("to", getTo(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TextNotificationContent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TextNotificationContent if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TextNotificationContent.
     */
    @Generated
    public static TextNotificationContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String channelRegistrationId = null;
            List<String> to = null;
            String content = null;
            CommunicationMessageKind kind = CommunicationMessageKind.TEXT;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("channelRegistrationId".equals(fieldName)) {
                    channelRegistrationId = reader.getString();
                } else if ("to".equals(fieldName)) {
                    to = reader.readArray(reader1 -> reader1.getString());
                } else if ("content".equals(fieldName)) {
                    content = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    kind = CommunicationMessageKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            TextNotificationContent deserializedTextNotificationContent
                = new TextNotificationContent(channelRegistrationId, to, content);
            deserializedTextNotificationContent.kind = kind;
            return deserializedTextNotificationContent;
        });
    }
}
