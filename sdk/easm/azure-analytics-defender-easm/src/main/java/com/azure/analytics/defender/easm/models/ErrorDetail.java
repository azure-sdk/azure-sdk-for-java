// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * This is the top-level error object whose code matches the x-ms-error-code response header.
 */
@Immutable
public final class ErrorDetail implements JsonSerializable<ErrorDetail> {

    /*
     * This is one of a server-defined set of error codes.
     */
    @Generated
    private final String code;

    /*
     * This is a human-readable representation of the error.
     */
    @Generated
    private final String message;

    /*
     * This is the error target.
     */
    @Generated
    private String target;

    /*
     * This is an array of details about specific errors that led to this reported error.
     */
    @Generated
    private List<ErrorDetail> details;

    /*
     * This is an object containing more specific information than the current object about the error.
     */
    @Generated
    private InnerError innererror;

    /**
     * Creates an instance of ErrorDetail class.
     *
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @Generated
    private ErrorDetail(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: This is one of a server-defined set of error codes.
     *
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: This is a human-readable representation of the error.
     *
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the target property: This is the error target.
     *
     * @return the target value.
     */
    @Generated
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the details property: This is an array of details about specific errors that led to this reported error.
     *
     * @return the details value.
     */
    @Generated
    public List<ErrorDetail> getDetails() {
        return this.details;
    }

    /**
     * Get the innererror property: This is an object containing more specific information than the current object about
     * the error.
     *
     * @return the innererror value.
     */
    @Generated
    public InnerError getInnererror() {
        return this.innererror;
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
        jsonWriter.writeStringField("target", this.target);
        jsonWriter.writeArrayField("details", this.details, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("innererror", this.innererror);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ErrorDetail from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ErrorDetail if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ErrorDetail.
     */
    @Generated
    public static ErrorDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String code = null;
            String message = null;
            String target = null;
            List<ErrorDetail> details = null;
            InnerError innererror = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("code".equals(fieldName)) {
                    code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    message = reader.getString();
                } else if ("target".equals(fieldName)) {
                    target = reader.getString();
                } else if ("details".equals(fieldName)) {
                    details = reader.readArray(reader1 -> ErrorDetail.fromJson(reader1));
                } else if ("innererror".equals(fieldName)) {
                    innererror = InnerError.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            ErrorDetail deserializedErrorDetail = new ErrorDetail(code, message);
            deserializedErrorDetail.target = target;
            deserializedErrorDetail.details = details;
            deserializedErrorDetail.innererror = innererror;
            return deserializedErrorDetail;
        });
    }
}
