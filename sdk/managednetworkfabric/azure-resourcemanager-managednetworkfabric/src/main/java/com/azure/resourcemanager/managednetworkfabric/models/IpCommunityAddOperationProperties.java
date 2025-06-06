// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * IP Community add operation properties.
 */
@Fluent
public class IpCommunityAddOperationProperties implements JsonSerializable<IpCommunityAddOperationProperties> {
    /*
     * List of IP Community IDs.
     */
    private IpCommunityIdList add;

    /**
     * Creates an instance of IpCommunityAddOperationProperties class.
     */
    public IpCommunityAddOperationProperties() {
    }

    /**
     * Get the add property: List of IP Community IDs.
     * 
     * @return the add value.
     */
    public IpCommunityIdList add() {
        return this.add;
    }

    /**
     * Set the add property: List of IP Community IDs.
     * 
     * @param add the add value to set.
     * @return the IpCommunityAddOperationProperties object itself.
     */
    public IpCommunityAddOperationProperties withAdd(IpCommunityIdList add) {
        this.add = add;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (add() != null) {
            add().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("add", this.add);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IpCommunityAddOperationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IpCommunityAddOperationProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IpCommunityAddOperationProperties.
     */
    public static IpCommunityAddOperationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IpCommunityAddOperationProperties deserializedIpCommunityAddOperationProperties
                = new IpCommunityAddOperationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("add".equals(fieldName)) {
                    deserializedIpCommunityAddOperationProperties.add = IpCommunityIdList.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIpCommunityAddOperationProperties;
        });
    }
}
