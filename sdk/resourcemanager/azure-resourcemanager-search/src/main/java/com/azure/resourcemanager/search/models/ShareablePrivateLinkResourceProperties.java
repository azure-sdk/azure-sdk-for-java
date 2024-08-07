// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the properties of a resource type that has been onboarded to private link service and that's supported by
 * search.
 */
@Immutable
public final class ShareablePrivateLinkResourceProperties
    implements JsonSerializable<ShareablePrivateLinkResourceProperties> {
    /*
     * The resource provider type for the resource that has been onboarded to private link service and that's supported
     * by search.
     */
    private String type;

    /*
     * The resource provider group id for the resource that has been onboarded to private link service and that's
     * supported by search.
     */
    private String groupId;

    /*
     * The description of the resource type that has been onboarded to private link service and that's supported by
     * search.
     */
    private String description;

    /**
     * Creates an instance of ShareablePrivateLinkResourceProperties class.
     */
    public ShareablePrivateLinkResourceProperties() {
    }

    /**
     * Get the type property: The resource provider type for the resource that has been onboarded to private link
     * service and that's supported by search.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the groupId property: The resource provider group id for the resource that has been onboarded to private link
     * service and that's supported by search.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the description property: The description of the resource type that has been onboarded to private link
     * service and that's supported by search.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ShareablePrivateLinkResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ShareablePrivateLinkResourceProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ShareablePrivateLinkResourceProperties.
     */
    public static ShareablePrivateLinkResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ShareablePrivateLinkResourceProperties deserializedShareablePrivateLinkResourceProperties
                = new ShareablePrivateLinkResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("type".equals(fieldName)) {
                    deserializedShareablePrivateLinkResourceProperties.type = reader.getString();
                } else if ("groupId".equals(fieldName)) {
                    deserializedShareablePrivateLinkResourceProperties.groupId = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedShareablePrivateLinkResourceProperties.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedShareablePrivateLinkResourceProperties;
        });
    }
}
