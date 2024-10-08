// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Response body structure of data flow result for data preview, statistics or expression preview.
 */
@Fluent
public final class DataFlowDebugCommandResponseInner implements JsonSerializable<DataFlowDebugCommandResponseInner> {
    /*
     * The run status of data preview, statistics or expression preview.
     */
    private String status;

    /*
     * The result data of data preview, statistics or expression preview.
     */
    private String data;

    /**
     * Creates an instance of DataFlowDebugCommandResponseInner class.
     */
    public DataFlowDebugCommandResponseInner() {
    }

    /**
     * Get the status property: The run status of data preview, statistics or expression preview.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The run status of data preview, statistics or expression preview.
     * 
     * @param status the status value to set.
     * @return the DataFlowDebugCommandResponseInner object itself.
     */
    public DataFlowDebugCommandResponseInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the data property: The result data of data preview, statistics or expression preview.
     * 
     * @return the data value.
     */
    public String data() {
        return this.data;
    }

    /**
     * Set the data property: The result data of data preview, statistics or expression preview.
     * 
     * @param data the data value to set.
     * @return the DataFlowDebugCommandResponseInner object itself.
     */
    public DataFlowDebugCommandResponseInner withData(String data) {
        this.data = data;
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
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeStringField("data", this.data);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataFlowDebugCommandResponseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataFlowDebugCommandResponseInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataFlowDebugCommandResponseInner.
     */
    public static DataFlowDebugCommandResponseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataFlowDebugCommandResponseInner deserializedDataFlowDebugCommandResponseInner
                = new DataFlowDebugCommandResponseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedDataFlowDebugCommandResponseInner.status = reader.getString();
                } else if ("data".equals(fieldName)) {
                    deserializedDataFlowDebugCommandResponseInner.data = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataFlowDebugCommandResponseInner;
        });
    }
}
