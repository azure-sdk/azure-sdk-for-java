// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The configuration parameters used while performing resilient VM creation.
 */
@Fluent
public final class ResilientVMCreationPolicy implements JsonSerializable<ResilientVMCreationPolicy> {
    /*
     * Specifies whether resilient VM creation should be enabled on the virtual machine scale set. The default value is
     * false.
     */
    private Boolean enabled;

    /**
     * Creates an instance of ResilientVMCreationPolicy class.
     */
    public ResilientVMCreationPolicy() {
    }

    /**
     * Get the enabled property: Specifies whether resilient VM creation should be enabled on the virtual machine scale
     * set. The default value is false.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Specifies whether resilient VM creation should be enabled on the virtual machine scale
     * set. The default value is false.
     * 
     * @param enabled the enabled value to set.
     * @return the ResilientVMCreationPolicy object itself.
     */
    public ResilientVMCreationPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        jsonWriter.writeBooleanField("enabled", this.enabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResilientVMCreationPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResilientVMCreationPolicy if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResilientVMCreationPolicy.
     */
    public static ResilientVMCreationPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResilientVMCreationPolicy deserializedResilientVMCreationPolicy = new ResilientVMCreationPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedResilientVMCreationPolicy.enabled = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResilientVMCreationPolicy;
        });
    }
}
