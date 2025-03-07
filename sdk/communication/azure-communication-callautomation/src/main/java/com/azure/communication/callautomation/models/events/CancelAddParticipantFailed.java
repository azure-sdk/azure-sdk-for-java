// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models.events;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;

/** The CancelAddParticipantFailed model. */
@Immutable
public final class CancelAddParticipantFailed extends CallAutomationEventBase {
    /*
     * The invitation ID used to cancel the add participant request.
     */
    private String invitationId;

    private CancelAddParticipantFailed() {
        invitationId = null;
    }

    /**
     * Get the invitationId property: The invitation ID used to cancel the add participant request.
     *
     * @return the invitationId value.
     */
    public String getInvitationId() {
        return invitationId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("invitationId", invitationId);
        super.writeFields(jsonWriter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CancelAddParticipantFailed from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CancelAddParticipantFailed if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CancelAddParticipantFailed.
     */
    public static CancelAddParticipantFailed fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            final CancelAddParticipantFailed event = new CancelAddParticipantFailed();
            while (jsonReader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("invitationId".equals(fieldName)) {
                    event.invitationId = reader.getString();
                } else {
                    if (!event.readField(fieldName, reader)) {
                        reader.skipChildren();
                    }
                }
            }
            return event;
        });
    }
}
