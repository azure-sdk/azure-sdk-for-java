// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The AzureEventHubsParameter model.
 */
@Fluent
public final class AzureEventHubsParameter implements JsonSerializable<AzureEventHubsParameter> {
    /*
     * The connection string of this Azure Event Hubs
     */
    @Generated
    private String connectionString;

    /*
     * The consumer group to be used in this data feed
     */
    @Generated
    private String consumerGroup;

    /**
     * Creates an instance of AzureEventHubsParameter class.
     */
    @Generated
    public AzureEventHubsParameter() {
    }

    /**
     * Get the connectionString property: The connection string of this Azure Event Hubs.
     * 
     * @return the connectionString value.
     */
    @Generated
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of this Azure Event Hubs.
     * 
     * @param connectionString the connectionString value to set.
     * @return the AzureEventHubsParameter object itself.
     */
    @Generated
    public AzureEventHubsParameter setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the consumerGroup property: The consumer group to be used in this data feed.
     * 
     * @return the consumerGroup value.
     */
    @Generated
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    /**
     * Set the consumerGroup property: The consumer group to be used in this data feed.
     * 
     * @param consumerGroup the consumerGroup value to set.
     * @return the AzureEventHubsParameter object itself.
     */
    @Generated
    public AzureEventHubsParameter setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("consumerGroup", this.consumerGroup);
        jsonWriter.writeStringField("connectionString", this.connectionString);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureEventHubsParameter from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureEventHubsParameter if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureEventHubsParameter.
     */
    @Generated
    public static AzureEventHubsParameter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureEventHubsParameter deserializedAzureEventHubsParameter = new AzureEventHubsParameter();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("consumerGroup".equals(fieldName)) {
                    deserializedAzureEventHubsParameter.consumerGroup = reader.getString();
                } else if ("connectionString".equals(fieldName)) {
                    deserializedAzureEventHubsParameter.connectionString = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureEventHubsParameter;
        });
    }
}
