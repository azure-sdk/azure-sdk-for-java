// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The type used for update operations of the Workspace.
 */
@Fluent
public final class WorkspaceUpdate implements JsonSerializable<WorkspaceUpdate> {
    /*
     * The SKU (Stock Keeping Unit) assigned to this resource.
     */
    private Sku sku;

    /*
     * Resource tags.
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of WorkspaceUpdate class.
     */
    public WorkspaceUpdate() {
    }

    /**
     * Get the sku property: The SKU (Stock Keeping Unit) assigned to this resource.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The SKU (Stock Keeping Unit) assigned to this resource.
     * 
     * @param sku the sku value to set.
     * @return the WorkspaceUpdate object itself.
     */
    public WorkspaceUpdate withSku(Sku sku) {
        this.sku = sku;
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
     * @return the WorkspaceUpdate object itself.
     */
    public WorkspaceUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("sku", this.sku);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkspaceUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkspaceUpdate if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkspaceUpdate.
     */
    public static WorkspaceUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkspaceUpdate deserializedWorkspaceUpdate = new WorkspaceUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sku".equals(fieldName)) {
                    deserializedWorkspaceUpdate.sku = Sku.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedWorkspaceUpdate.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkspaceUpdate;
        });
    }
}
