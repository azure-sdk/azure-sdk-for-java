// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cosmos.fluent.models.SqlRoleAssignmentGetResultsInner;
import java.io.IOException;
import java.util.List;

/**
 * The relevant Role Assignments.
 */
@Immutable
public final class SqlRoleAssignmentListResult implements JsonSerializable<SqlRoleAssignmentListResult> {
    /*
     * List of Role Assignments and their properties
     */
    private List<SqlRoleAssignmentGetResultsInner> value;

    /**
     * Creates an instance of SqlRoleAssignmentListResult class.
     */
    public SqlRoleAssignmentListResult() {
    }

    /**
     * Get the value property: List of Role Assignments and their properties.
     * 
     * @return the value value.
     */
    public List<SqlRoleAssignmentGetResultsInner> value() {
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
     * Reads an instance of SqlRoleAssignmentListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SqlRoleAssignmentListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SqlRoleAssignmentListResult.
     */
    public static SqlRoleAssignmentListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SqlRoleAssignmentListResult deserializedSqlRoleAssignmentListResult = new SqlRoleAssignmentListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SqlRoleAssignmentGetResultsInner> value
                        = reader.readArray(reader1 -> SqlRoleAssignmentGetResultsInner.fromJson(reader1));
                    deserializedSqlRoleAssignmentListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSqlRoleAssignmentListResult;
        });
    }
}
