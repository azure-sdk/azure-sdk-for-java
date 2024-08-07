// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Error information that the API returned.
 */
@Immutable
public final class ErrorResponse implements JsonSerializable<ErrorResponse> {

    /*
     * Error code.
     */
    @Generated
    private final String code;

    /*
     * Message that explains the error that the service reported.
     */
    @Generated
    private final String message;

    /**
     * Creates an instance of ErrorResponse class.
     *
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @Generated
    private ErrorResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: Message that explains the error that the service reported.
     *
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ErrorResponse from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ErrorResponse if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ErrorResponse.
     */
    @Generated
    public static ErrorResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String code = null;
            String message = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("code".equals(fieldName)) {
                    code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new ErrorResponse(code, message);
        });
    }
}
