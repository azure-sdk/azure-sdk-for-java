// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.fluent.models.DataCollectionRuleAssociationProxyOnlyResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * A pageable list of resources.
 */
@Fluent
public final class DataCollectionRuleAssociationProxyOnlyResourceListResult
    implements JsonSerializable<DataCollectionRuleAssociationProxyOnlyResourceListResult> {
    /*
     * A list of resources.
     */
    private List<DataCollectionRuleAssociationProxyOnlyResourceInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of DataCollectionRuleAssociationProxyOnlyResourceListResult class.
     */
    public DataCollectionRuleAssociationProxyOnlyResourceListResult() {
    }

    /**
     * Get the value property: A list of resources.
     * 
     * @return the value value.
     */
    public List<DataCollectionRuleAssociationProxyOnlyResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of resources.
     * 
     * @param value the value value to set.
     * @return the DataCollectionRuleAssociationProxyOnlyResourceListResult object itself.
     */
    public DataCollectionRuleAssociationProxyOnlyResourceListResult
        withValue(List<DataCollectionRuleAssociationProxyOnlyResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the DataCollectionRuleAssociationProxyOnlyResourceListResult object itself.
     */
    public DataCollectionRuleAssociationProxyOnlyResourceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property value in model DataCollectionRuleAssociationProxyOnlyResourceListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(DataCollectionRuleAssociationProxyOnlyResourceListResult.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataCollectionRuleAssociationProxyOnlyResourceListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataCollectionRuleAssociationProxyOnlyResourceListResult if the JsonReader was pointing to
     * an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the
     * DataCollectionRuleAssociationProxyOnlyResourceListResult.
     */
    public static DataCollectionRuleAssociationProxyOnlyResourceListResult fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            DataCollectionRuleAssociationProxyOnlyResourceListResult deserializedDataCollectionRuleAssociationProxyOnlyResourceListResult
                = new DataCollectionRuleAssociationProxyOnlyResourceListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<DataCollectionRuleAssociationProxyOnlyResourceInner> value = reader
                        .readArray(reader1 -> DataCollectionRuleAssociationProxyOnlyResourceInner.fromJson(reader1));
                    deserializedDataCollectionRuleAssociationProxyOnlyResourceListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedDataCollectionRuleAssociationProxyOnlyResourceListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataCollectionRuleAssociationProxyOnlyResourceListResult;
        });
    }
}
