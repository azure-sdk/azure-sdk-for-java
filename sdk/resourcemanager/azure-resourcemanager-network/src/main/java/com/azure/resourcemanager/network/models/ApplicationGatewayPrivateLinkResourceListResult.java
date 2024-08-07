// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayPrivateLinkResourceInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListApplicationGatewayPrivateLinkResources API service call. Gets all private link resources for an
 * application gateway.
 */
@Fluent
public final class ApplicationGatewayPrivateLinkResourceListResult
    implements JsonSerializable<ApplicationGatewayPrivateLinkResourceListResult> {
    /*
     * List of private link resources of an application gateway.
     */
    private List<ApplicationGatewayPrivateLinkResourceInner> value;

    /*
     * URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ApplicationGatewayPrivateLinkResourceListResult class.
     */
    public ApplicationGatewayPrivateLinkResourceListResult() {
    }

    /**
     * Get the value property: List of private link resources of an application gateway.
     * 
     * @return the value value.
     */
    public List<ApplicationGatewayPrivateLinkResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of private link resources of an application gateway.
     * 
     * @param value the value value to set.
     * @return the ApplicationGatewayPrivateLinkResourceListResult object itself.
     */
    public ApplicationGatewayPrivateLinkResourceListResult
        withValue(List<ApplicationGatewayPrivateLinkResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ApplicationGatewayPrivateLinkResourceListResult object itself.
     */
    public ApplicationGatewayPrivateLinkResourceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayPrivateLinkResourceListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayPrivateLinkResourceListResult if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGatewayPrivateLinkResourceListResult.
     */
    public static ApplicationGatewayPrivateLinkResourceListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayPrivateLinkResourceListResult deserializedApplicationGatewayPrivateLinkResourceListResult
                = new ApplicationGatewayPrivateLinkResourceListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ApplicationGatewayPrivateLinkResourceInner> value
                        = reader.readArray(reader1 -> ApplicationGatewayPrivateLinkResourceInner.fromJson(reader1));
                    deserializedApplicationGatewayPrivateLinkResourceListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedApplicationGatewayPrivateLinkResourceListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayPrivateLinkResourceListResult;
        });
    }
}
