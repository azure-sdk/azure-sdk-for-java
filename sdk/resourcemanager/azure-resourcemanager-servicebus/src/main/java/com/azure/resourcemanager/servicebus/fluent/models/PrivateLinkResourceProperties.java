// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Properties of PrivateLinkResource.
 */
@Fluent
public final class PrivateLinkResourceProperties implements JsonSerializable<PrivateLinkResourceProperties> {
    /*
     * The groupId property.
     */
    private String groupId;

    /*
     * Required Members
     */
    private List<String> requiredMembers;

    /*
     * Required Zone Names
     */
    private List<String> requiredZoneNames;

    /**
     * Creates an instance of PrivateLinkResourceProperties class.
     */
    public PrivateLinkResourceProperties() {
    }

    /**
     * Get the groupId property: The groupId property.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The groupId property.
     * 
     * @param groupId the groupId value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the requiredMembers property: Required Members.
     * 
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Set the requiredMembers property: Required Members.
     * 
     * @param requiredMembers the requiredMembers value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withRequiredMembers(List<String> requiredMembers) {
        this.requiredMembers = requiredMembers;
        return this;
    }

    /**
     * Get the requiredZoneNames property: Required Zone Names.
     * 
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Set the requiredZoneNames property: Required Zone Names.
     * 
     * @param requiredZoneNames the requiredZoneNames value to set.
     * @return the PrivateLinkResourceProperties object itself.
     */
    public PrivateLinkResourceProperties withRequiredZoneNames(List<String> requiredZoneNames) {
        this.requiredZoneNames = requiredZoneNames;
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
        jsonWriter.writeStringField("groupId", this.groupId);
        jsonWriter.writeArrayField("requiredMembers", this.requiredMembers,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("requiredZoneNames", this.requiredZoneNames,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkResourceProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkResourceProperties.
     */
    public static PrivateLinkResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkResourceProperties deserializedPrivateLinkResourceProperties
                = new PrivateLinkResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("groupId".equals(fieldName)) {
                    deserializedPrivateLinkResourceProperties.groupId = reader.getString();
                } else if ("requiredMembers".equals(fieldName)) {
                    List<String> requiredMembers = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrivateLinkResourceProperties.requiredMembers = requiredMembers;
                } else if ("requiredZoneNames".equals(fieldName)) {
                    List<String> requiredZoneNames = reader.readArray(reader1 -> reader1.getString());
                    deserializedPrivateLinkResourceProperties.requiredZoneNames = requiredZoneNames;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkResourceProperties;
        });
    }
}
