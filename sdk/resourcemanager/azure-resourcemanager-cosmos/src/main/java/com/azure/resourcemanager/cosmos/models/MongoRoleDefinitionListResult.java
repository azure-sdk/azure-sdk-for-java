// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.MongoRoleDefinitionGetResultsInner;
import java.io.IOException;
import java.util.List;

/**
 * The relevant Mongo Role Definitions.
 */
@Immutable
public final class MongoRoleDefinitionListResult implements JsonSerializable<MongoRoleDefinitionListResult> {
    /*
     * List of Mongo Role Definitions and their properties.
     */
    private List<MongoRoleDefinitionGetResultsInner> value;

    /**
     * Creates an instance of MongoRoleDefinitionListResult class.
     */
    public MongoRoleDefinitionListResult() {
    }

    /**
     * Get the value property: List of Mongo Role Definitions and their properties.
     * 
     * @return the value value.
     */
    public List<MongoRoleDefinitionGetResultsInner> value() {
        return this.value;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MongoRoleDefinitionListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MongoRoleDefinitionListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MongoRoleDefinitionListResult.
     */
    public static MongoRoleDefinitionListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MongoRoleDefinitionListResult deserializedMongoRoleDefinitionListResult
                = new MongoRoleDefinitionListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<MongoRoleDefinitionGetResultsInner> value
                        = reader.readArray(reader1 -> MongoRoleDefinitionGetResultsInner.fromJson(reader1));
                    deserializedMongoRoleDefinitionListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMongoRoleDefinitionListResult;
        });
    }
}
