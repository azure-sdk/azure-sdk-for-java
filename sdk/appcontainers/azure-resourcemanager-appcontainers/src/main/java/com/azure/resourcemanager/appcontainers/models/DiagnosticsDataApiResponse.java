// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Diagnostics data returned from a detector.
 */
@Fluent
public final class DiagnosticsDataApiResponse implements JsonSerializable<DiagnosticsDataApiResponse> {
    /*
     * Table response
     */
    private DiagnosticDataTableResponseObject table;

    /*
     * Details of the table response
     */
    private DiagnosticRendering renderingProperties;

    /**
     * Creates an instance of DiagnosticsDataApiResponse class.
     */
    public DiagnosticsDataApiResponse() {
    }

    /**
     * Get the table property: Table response.
     * 
     * @return the table value.
     */
    public DiagnosticDataTableResponseObject table() {
        return this.table;
    }

    /**
     * Set the table property: Table response.
     * 
     * @param table the table value to set.
     * @return the DiagnosticsDataApiResponse object itself.
     */
    public DiagnosticsDataApiResponse withTable(DiagnosticDataTableResponseObject table) {
        this.table = table;
        return this;
    }

    /**
     * Get the renderingProperties property: Details of the table response.
     * 
     * @return the renderingProperties value.
     */
    public DiagnosticRendering renderingProperties() {
        return this.renderingProperties;
    }

    /**
     * Set the renderingProperties property: Details of the table response.
     * 
     * @param renderingProperties the renderingProperties value to set.
     * @return the DiagnosticsDataApiResponse object itself.
     */
    public DiagnosticsDataApiResponse withRenderingProperties(DiagnosticRendering renderingProperties) {
        this.renderingProperties = renderingProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (table() != null) {
            table().validate();
        }
        if (renderingProperties() != null) {
            renderingProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("table", this.table);
        jsonWriter.writeJsonField("renderingProperties", this.renderingProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnosticsDataApiResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnosticsDataApiResponse if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiagnosticsDataApiResponse.
     */
    public static DiagnosticsDataApiResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnosticsDataApiResponse deserializedDiagnosticsDataApiResponse = new DiagnosticsDataApiResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("table".equals(fieldName)) {
                    deserializedDiagnosticsDataApiResponse.table = DiagnosticDataTableResponseObject.fromJson(reader);
                } else if ("renderingProperties".equals(fieldName)) {
                    deserializedDiagnosticsDataApiResponse.renderingProperties = DiagnosticRendering.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnosticsDataApiResponse;
        });
    }
}
