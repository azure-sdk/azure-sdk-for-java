// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Planned failover model custom properties.
 */
@Immutable
public class PlannedFailoverModelCustomProperties implements JsonSerializable<PlannedFailoverModelCustomProperties> {
    /*
     * Discriminator property for PlannedFailoverModelCustomProperties.
     */
    private String instanceType = "PlannedFailoverModelCustomProperties";

    /**
     * Creates an instance of PlannedFailoverModelCustomProperties class.
     */
    public PlannedFailoverModelCustomProperties() {
    }

    /**
     * Get the instanceType property: Discriminator property for PlannedFailoverModelCustomProperties.
     * 
     * @return the instanceType value.
     */
    public String instanceType() {
        return this.instanceType;
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
        jsonWriter.writeStringField("instanceType", this.instanceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PlannedFailoverModelCustomProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PlannedFailoverModelCustomProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PlannedFailoverModelCustomProperties.
     */
    public static PlannedFailoverModelCustomProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("instanceType".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("HyperVToAzStackHCI".equals(discriminatorValue)) {
                    return HyperVToAzStackHciPlannedFailoverCustomProps.fromJson(readerToUse.reset());
                } else if ("VMwareToAzStackHCI".equals(discriminatorValue)) {
                    return VMwareToAzStackHciPlannedFailoverCustomProps.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    static PlannedFailoverModelCustomProperties fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PlannedFailoverModelCustomProperties deserializedPlannedFailoverModelCustomProperties
                = new PlannedFailoverModelCustomProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceType".equals(fieldName)) {
                    deserializedPlannedFailoverModelCustomProperties.instanceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPlannedFailoverModelCustomProperties;
        });
    }
}
