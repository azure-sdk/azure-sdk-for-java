// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Base type for data change detection policies.
 */
@Immutable
public class DataChangeDetectionPolicy implements JsonSerializable<DataChangeDetectionPolicy> {
    /*
     * A URI fragment specifying the type of data change detection policy.
     */
    @Generated
    private String odataType = "DataChangeDetectionPolicy";

    /**
     * Creates an instance of DataChangeDetectionPolicy class.
     */
    @Generated
    public DataChangeDetectionPolicy() {
    }

    /**
     * Get the odataType property: A URI fragment specifying the type of data change detection policy.
     * 
     * @return the odataType value.
     */
    @Generated
    public String getOdataType() {
        return this.odataType;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", this.odataType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataChangeDetectionPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataChangeDetectionPolicy if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataChangeDetectionPolicy.
     */
    @Generated
    public static DataChangeDetectionPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("@odata.type".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("#Microsoft.Azure.Search.HighWaterMarkChangeDetectionPolicy".equals(discriminatorValue)) {
                    return HighWaterMarkChangeDetectionPolicy.fromJson(readerToUse.reset());
                } else if ("#Microsoft.Azure.Search.SqlIntegratedChangeTrackingPolicy".equals(discriminatorValue)) {
                    return SqlIntegratedChangeTrackingPolicy.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static DataChangeDetectionPolicy fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataChangeDetectionPolicy deserializedDataChangeDetectionPolicy = new DataChangeDetectionPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    deserializedDataChangeDetectionPolicy.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataChangeDetectionPolicy;
        });
    }
}
