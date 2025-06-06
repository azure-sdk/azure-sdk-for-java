// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.messaging.eventgrid.systemevents.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A phone number.
 */
@Immutable
public final class PhoneNumberIdentifierModel implements JsonSerializable<PhoneNumberIdentifierModel> {
    /*
     * The phone number in E.164 format.
     */
    @Generated
    private final String value;

    /**
     * Creates an instance of PhoneNumberIdentifierModel class.
     * 
     * @param value the value value to set.
     */
    @Generated
    private PhoneNumberIdentifierModel(String value) {
        this.value = value;
    }

    /**
     * Get the value property: The phone number in E.164 format.
     * 
     * @return the value value.
     */
    @Generated
    public String getValue() {
        return this.value;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PhoneNumberIdentifierModel from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PhoneNumberIdentifierModel if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PhoneNumberIdentifierModel.
     */
    @Generated
    public static PhoneNumberIdentifierModel fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String value = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new PhoneNumberIdentifierModel(value);
        });
    }
}
