// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.onlineexperimentation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Partial update of an online experimentation workspace resource.
 */
@Fluent
public final class OnlineExperimentationWorkspacePatch
    implements JsonSerializable<OnlineExperimentationWorkspacePatch> {
    /*
     * The managed service identities assigned to this resource.
     */
    private ManagedServiceIdentity identity;

    /*
     * Resource tags.
     */
    private Map<String, String> tags;

    /*
     * The SKU (Stock Keeping Unit) assigned to this resource.
     */
    private OnlineExperimentationWorkspaceSku sku;

    /*
     * Updatable properties of the online experimentation workspace resource.
     */
    private OnlineExperimentationWorkspacePatchProperties properties;

    /**
     * Creates an instance of OnlineExperimentationWorkspacePatch class.
     */
    public OnlineExperimentationWorkspacePatch() {
    }

    /**
     * Get the identity property: The managed service identities assigned to this resource.
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed service identities assigned to this resource.
     * 
     * @param identity the identity value to set.
     * @return the OnlineExperimentationWorkspacePatch object itself.
     */
    public OnlineExperimentationWorkspacePatch withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the OnlineExperimentationWorkspacePatch object itself.
     */
    public OnlineExperimentationWorkspacePatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the sku property: The SKU (Stock Keeping Unit) assigned to this resource.
     * 
     * @return the sku value.
     */
    public OnlineExperimentationWorkspaceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU (Stock Keeping Unit) assigned to this resource.
     * 
     * @param sku the sku value to set.
     * @return the OnlineExperimentationWorkspacePatch object itself.
     */
    public OnlineExperimentationWorkspacePatch withSku(OnlineExperimentationWorkspaceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the properties property: Updatable properties of the online experimentation workspace resource.
     * 
     * @return the properties value.
     */
    public OnlineExperimentationWorkspacePatchProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Updatable properties of the online experimentation workspace resource.
     * 
     * @param properties the properties value to set.
     * @return the OnlineExperimentationWorkspacePatch object itself.
     */
    public OnlineExperimentationWorkspacePatch
        withProperties(OnlineExperimentationWorkspacePatchProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OnlineExperimentationWorkspacePatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OnlineExperimentationWorkspacePatch if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OnlineExperimentationWorkspacePatch.
     */
    public static OnlineExperimentationWorkspacePatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OnlineExperimentationWorkspacePatch deserializedOnlineExperimentationWorkspacePatch
                = new OnlineExperimentationWorkspacePatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("identity".equals(fieldName)) {
                    deserializedOnlineExperimentationWorkspacePatch.identity = ManagedServiceIdentity.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedOnlineExperimentationWorkspacePatch.tags = tags;
                } else if ("sku".equals(fieldName)) {
                    deserializedOnlineExperimentationWorkspacePatch.sku
                        = OnlineExperimentationWorkspaceSku.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedOnlineExperimentationWorkspacePatch.properties
                        = OnlineExperimentationWorkspacePatchProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOnlineExperimentationWorkspacePatch;
        });
    }
}
