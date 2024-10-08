// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Localizable String object containing the name and a localized value.
 */
@Fluent
public final class SignalRServiceUsageName implements JsonSerializable<SignalRServiceUsageName> {
    /*
     * The identifier of the usage.
     */
    private String value;

    /*
     * Localized name of the usage.
     */
    private String localizedValue;

    /**
     * Creates an instance of SignalRServiceUsageName class.
     */
    public SignalRServiceUsageName() {
    }

    /**
     * Get the value property: The identifier of the usage.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The identifier of the usage.
     * 
     * @param value the value value to set.
     * @return the SignalRServiceUsageName object itself.
     */
    public SignalRServiceUsageName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: Localized name of the usage.
     * 
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: Localized name of the usage.
     * 
     * @param localizedValue the localizedValue value to set.
     * @return the SignalRServiceUsageName object itself.
     */
    public SignalRServiceUsageName withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("value", this.value);
        jsonWriter.writeStringField("localizedValue", this.localizedValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SignalRServiceUsageName from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SignalRServiceUsageName if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SignalRServiceUsageName.
     */
    public static SignalRServiceUsageName fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SignalRServiceUsageName deserializedSignalRServiceUsageName = new SignalRServiceUsageName();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedSignalRServiceUsageName.value = reader.getString();
                } else if ("localizedValue".equals(fieldName)) {
                    deserializedSignalRServiceUsageName.localizedValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSignalRServiceUsageName;
        });
    }
}
