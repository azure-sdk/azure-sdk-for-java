// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.messaging.eventgrid.systemevents.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.AVS.PrivateCloudUpdated event.
 */
@Immutable
public final class AvsPrivateCloudUpdatedEventData extends AvsPrivateCloudEventData {

    /**
     * Creates an instance of AvsPrivateCloudUpdatedEventData class.
     *
     * @param operationId the operationId value to set.
     */
    @Generated
    private AvsPrivateCloudUpdatedEventData(String operationId) {
        super(operationId);
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("operationId", getOperationId());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvsPrivateCloudUpdatedEventData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvsPrivateCloudUpdatedEventData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AvsPrivateCloudUpdatedEventData.
     */
    @Generated
    public static AvsPrivateCloudUpdatedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String operationId = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("operationId".equals(fieldName)) {
                    operationId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new AvsPrivateCloudUpdatedEventData(operationId);
        });
    }
}
