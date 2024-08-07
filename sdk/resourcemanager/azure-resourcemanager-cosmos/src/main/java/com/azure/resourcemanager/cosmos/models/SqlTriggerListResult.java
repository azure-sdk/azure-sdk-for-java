// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.SqlTriggerGetResultsInner;
import java.io.IOException;
import java.util.List;

/**
 * The List operation response, that contains the triggers and their properties.
 */
@Immutable
public final class SqlTriggerListResult implements JsonSerializable<SqlTriggerListResult> {
    /*
     * List of triggers and their properties.
     */
    private List<SqlTriggerGetResultsInner> value;

    /**
     * Creates an instance of SqlTriggerListResult class.
     */
    public SqlTriggerListResult() {
    }

    /**
     * Get the value property: List of triggers and their properties.
     * 
     * @return the value value.
     */
    public List<SqlTriggerGetResultsInner> value() {
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
     * Reads an instance of SqlTriggerListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlTriggerListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SqlTriggerListResult.
     */
    public static SqlTriggerListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlTriggerListResult deserializedSqlTriggerListResult = new SqlTriggerListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SqlTriggerGetResultsInner> value
                        = reader.readArray(reader1 -> SqlTriggerGetResultsInner.fromJson(reader1));
                    deserializedSqlTriggerListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlTriggerListResult;
        });
    }
}
