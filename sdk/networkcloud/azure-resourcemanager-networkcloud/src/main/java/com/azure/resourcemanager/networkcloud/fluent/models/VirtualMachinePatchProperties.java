// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.networkcloud.models.ImageRepositoryCredentials;
import java.io.IOException;

/**
 * VirtualMachinePatchProperties represents the properties of the virtual machine that can be patched.
 */
@Fluent
public final class VirtualMachinePatchProperties implements JsonSerializable<VirtualMachinePatchProperties> {
    /*
     * The credentials used to login to the image repository that has access to the specified image.
     */
    private ImageRepositoryCredentials vmImageRepositoryCredentials;

    /**
     * Creates an instance of VirtualMachinePatchProperties class.
     */
    public VirtualMachinePatchProperties() {
    }

    /**
     * Get the vmImageRepositoryCredentials property: The credentials used to login to the image repository that has
     * access to the specified image.
     * 
     * @return the vmImageRepositoryCredentials value.
     */
    public ImageRepositoryCredentials vmImageRepositoryCredentials() {
        return this.vmImageRepositoryCredentials;
    }

    /**
     * Set the vmImageRepositoryCredentials property: The credentials used to login to the image repository that has
     * access to the specified image.
     * 
     * @param vmImageRepositoryCredentials the vmImageRepositoryCredentials value to set.
     * @return the VirtualMachinePatchProperties object itself.
     */
    public VirtualMachinePatchProperties
        withVmImageRepositoryCredentials(ImageRepositoryCredentials vmImageRepositoryCredentials) {
        this.vmImageRepositoryCredentials = vmImageRepositoryCredentials;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmImageRepositoryCredentials() != null) {
            vmImageRepositoryCredentials().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("vmImageRepositoryCredentials", this.vmImageRepositoryCredentials);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachinePatchProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachinePatchProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachinePatchProperties.
     */
    public static VirtualMachinePatchProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachinePatchProperties deserializedVirtualMachinePatchProperties
                = new VirtualMachinePatchProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vmImageRepositoryCredentials".equals(fieldName)) {
                    deserializedVirtualMachinePatchProperties.vmImageRepositoryCredentials
                        = ImageRepositoryCredentials.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachinePatchProperties;
        });
    }
}
