// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.RestorableSqlContainerGetResultInner;
import java.io.IOException;
import java.util.List;

/**
 * The List operation response, that contains the SQL container events and their properties.
 */
@Immutable
public final class RestorableSqlContainersListResult implements JsonSerializable<RestorableSqlContainersListResult> {
    /*
     * List of SQL container events and their properties.
     */
    private List<RestorableSqlContainerGetResultInner> value;

    /**
     * Creates an instance of RestorableSqlContainersListResult class.
     */
    public RestorableSqlContainersListResult() {
    }

    /**
     * Get the value property: List of SQL container events and their properties.
     * 
     * @return the value value.
     */
    public List<RestorableSqlContainerGetResultInner> value() {
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
     * Reads an instance of RestorableSqlContainersListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorableSqlContainersListResult if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RestorableSqlContainersListResult.
     */
    public static RestorableSqlContainersListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorableSqlContainersListResult deserializedRestorableSqlContainersListResult
                = new RestorableSqlContainersListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<RestorableSqlContainerGetResultInner> value
                        = reader.readArray(reader1 -> RestorableSqlContainerGetResultInner.fromJson(reader1));
                    deserializedRestorableSqlContainersListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorableSqlContainersListResult;
        });
    }
}
