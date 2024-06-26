// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response body structure for starting data flow debug session.
 */
@Fluent
public final class StartDataFlowDebugSessionResponse implements JsonSerializable<StartDataFlowDebugSessionResponse> {
    /*
     * The ID of data flow debug job version.
     */
    private String jobVersion;

    /**
     * Creates an instance of StartDataFlowDebugSessionResponse class.
     */
    public StartDataFlowDebugSessionResponse() {
    }

    /**
     * Get the jobVersion property: The ID of data flow debug job version.
     * 
     * @return the jobVersion value.
     */
    public String getJobVersion() {
        return this.jobVersion;
    }

    /**
     * Set the jobVersion property: The ID of data flow debug job version.
     * 
     * @param jobVersion the jobVersion value to set.
     * @return the StartDataFlowDebugSessionResponse object itself.
     */
    public StartDataFlowDebugSessionResponse setJobVersion(String jobVersion) {
        this.jobVersion = jobVersion;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("jobVersion", this.jobVersion);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StartDataFlowDebugSessionResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of StartDataFlowDebugSessionResponse if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the StartDataFlowDebugSessionResponse.
     */
    public static StartDataFlowDebugSessionResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StartDataFlowDebugSessionResponse deserializedStartDataFlowDebugSessionResponse
                = new StartDataFlowDebugSessionResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jobVersion".equals(fieldName)) {
                    deserializedStartDataFlowDebugSessionResponse.jobVersion = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedStartDataFlowDebugSessionResponse;
        });
    }
}
