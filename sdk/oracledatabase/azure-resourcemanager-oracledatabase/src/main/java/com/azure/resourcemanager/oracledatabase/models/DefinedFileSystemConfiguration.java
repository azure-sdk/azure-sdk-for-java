// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Predefined configurations for the file system.
 */
@Immutable
public final class DefinedFileSystemConfiguration implements JsonSerializable<DefinedFileSystemConfiguration> {
    /*
     * Checks if the data can be backed up
     */
    private Boolean isBackupPartition;

    /*
     * Checks if the mount path is resizable
     */
    private Boolean isResizable;

    /*
     * Minimum size of mount path in Gb
     */
    private Integer minSizeGb;

    /*
     * Mount path for the file system
     */
    private String mountPoint;

    /**
     * Creates an instance of DefinedFileSystemConfiguration class.
     */
    private DefinedFileSystemConfiguration() {
    }

    /**
     * Get the isBackupPartition property: Checks if the data can be backed up.
     * 
     * @return the isBackupPartition value.
     */
    public Boolean isBackupPartition() {
        return this.isBackupPartition;
    }

    /**
     * Get the isResizable property: Checks if the mount path is resizable.
     * 
     * @return the isResizable value.
     */
    public Boolean isResizable() {
        return this.isResizable;
    }

    /**
     * Get the minSizeGb property: Minimum size of mount path in Gb.
     * 
     * @return the minSizeGb value.
     */
    public Integer minSizeGb() {
        return this.minSizeGb;
    }

    /**
     * Get the mountPoint property: Mount path for the file system.
     * 
     * @return the mountPoint value.
     */
    public String mountPoint() {
        return this.mountPoint;
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
        jsonWriter.writeBooleanField("isBackupPartition", this.isBackupPartition);
        jsonWriter.writeBooleanField("isResizable", this.isResizable);
        jsonWriter.writeNumberField("minSizeGb", this.minSizeGb);
        jsonWriter.writeStringField("mountPoint", this.mountPoint);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DefinedFileSystemConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DefinedFileSystemConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DefinedFileSystemConfiguration.
     */
    public static DefinedFileSystemConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DefinedFileSystemConfiguration deserializedDefinedFileSystemConfiguration
                = new DefinedFileSystemConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("isBackupPartition".equals(fieldName)) {
                    deserializedDefinedFileSystemConfiguration.isBackupPartition
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("isResizable".equals(fieldName)) {
                    deserializedDefinedFileSystemConfiguration.isResizable = reader.getNullable(JsonReader::getBoolean);
                } else if ("minSizeGb".equals(fieldName)) {
                    deserializedDefinedFileSystemConfiguration.minSizeGb = reader.getNullable(JsonReader::getInt);
                } else if ("mountPoint".equals(fieldName)) {
                    deserializedDefinedFileSystemConfiguration.mountPoint = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDefinedFileSystemConfiguration;
        });
    }
}
