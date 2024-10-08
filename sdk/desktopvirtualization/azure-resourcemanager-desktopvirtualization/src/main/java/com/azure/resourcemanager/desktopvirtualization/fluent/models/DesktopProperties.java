// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Schema for Desktop properties.
 */
@Fluent
public final class DesktopProperties implements JsonSerializable<DesktopProperties> {
    /*
     * ObjectId of Desktop. (internal use)
     */
    private String objectId;

    /*
     * Description of Desktop.
     */
    private String description;

    /*
     * Friendly name of Desktop.
     */
    private String friendlyName;

    /*
     * Hash of the icon.
     */
    private String iconHash;

    /*
     * The icon a 64 bit string as a byte array.
     */
    private byte[] iconContent;

    /**
     * Creates an instance of DesktopProperties class.
     */
    public DesktopProperties() {
    }

    /**
     * Get the objectId property: ObjectId of Desktop. (internal use).
     * 
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Get the description property: Description of Desktop.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of Desktop.
     * 
     * @param description the description value to set.
     * @return the DesktopProperties object itself.
     */
    public DesktopProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of Desktop.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of Desktop.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the DesktopProperties object itself.
     */
    public DesktopProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the iconHash property: Hash of the icon.
     * 
     * @return the iconHash value.
     */
    public String iconHash() {
        return this.iconHash;
    }

    /**
     * Get the iconContent property: The icon a 64 bit string as a byte array.
     * 
     * @return the iconContent value.
     */
    public byte[] iconContent() {
        return CoreUtils.clone(this.iconContent);
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
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("friendlyName", this.friendlyName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DesktopProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DesktopProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DesktopProperties.
     */
    public static DesktopProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DesktopProperties deserializedDesktopProperties = new DesktopProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("objectId".equals(fieldName)) {
                    deserializedDesktopProperties.objectId = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedDesktopProperties.description = reader.getString();
                } else if ("friendlyName".equals(fieldName)) {
                    deserializedDesktopProperties.friendlyName = reader.getString();
                } else if ("iconHash".equals(fieldName)) {
                    deserializedDesktopProperties.iconHash = reader.getString();
                } else if ("iconContent".equals(fieldName)) {
                    deserializedDesktopProperties.iconContent = reader.getBinary();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDesktopProperties;
        });
    }
}
