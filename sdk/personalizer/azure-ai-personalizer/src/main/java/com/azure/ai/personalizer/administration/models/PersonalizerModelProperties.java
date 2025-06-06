// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.administration.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Properties related to the trained model.
 */
@Immutable
public final class PersonalizerModelProperties implements JsonSerializable<PersonalizerModelProperties> {
    /*
     * Creation time of the model.
     */
    @Generated
    private OffsetDateTime creationTime;

    /*
     * Last time the model was modified.
     */
    @Generated
    private OffsetDateTime lastModifiedTime;

    /**
     * Creates an instance of PersonalizerModelProperties class.
     */
    @Generated
    public PersonalizerModelProperties() {
    }

    /**
     * Get the creationTime property: Creation time of the model.
     * 
     * @return the creationTime value.
     */
    @Generated
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastModifiedTime property: Last time the model was modified.
     * 
     * @return the lastModifiedTime value.
     */
    @Generated
    public OffsetDateTime getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PersonalizerModelProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PersonalizerModelProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PersonalizerModelProperties.
     */
    @Generated
    public static PersonalizerModelProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PersonalizerModelProperties deserializedPersonalizerModelProperties = new PersonalizerModelProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("creationTime".equals(fieldName)) {
                    deserializedPersonalizerModelProperties.creationTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastModifiedTime".equals(fieldName)) {
                    deserializedPersonalizerModelProperties.lastModifiedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPersonalizerModelProperties;
        });
    }
}
