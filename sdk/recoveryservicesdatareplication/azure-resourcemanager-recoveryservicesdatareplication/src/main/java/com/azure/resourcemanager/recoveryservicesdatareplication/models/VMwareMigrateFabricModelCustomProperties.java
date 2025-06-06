// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * VMware migrate fabric model custom properties.
 */
@Fluent
public final class VMwareMigrateFabricModelCustomProperties extends FabricModelCustomProperties {
    /*
     * Discriminator property for FabricModelCustomProperties.
     */
    private String instanceType = "VMwareMigrate";

    /*
     * Gets or sets the ARM Id of the VMware site.
     */
    private String vmwareSiteId;

    /*
     * Gets or sets the ARM Id of the migration solution.
     */
    private String migrationSolutionId;

    /**
     * Creates an instance of VMwareMigrateFabricModelCustomProperties class.
     */
    public VMwareMigrateFabricModelCustomProperties() {
    }

    /**
     * Get the instanceType property: Discriminator property for FabricModelCustomProperties.
     * 
     * @return the instanceType value.
     */
    @Override
    public String instanceType() {
        return this.instanceType;
    }

    /**
     * Get the vmwareSiteId property: Gets or sets the ARM Id of the VMware site.
     * 
     * @return the vmwareSiteId value.
     */
    public String vmwareSiteId() {
        return this.vmwareSiteId;
    }

    /**
     * Set the vmwareSiteId property: Gets or sets the ARM Id of the VMware site.
     * 
     * @param vmwareSiteId the vmwareSiteId value to set.
     * @return the VMwareMigrateFabricModelCustomProperties object itself.
     */
    public VMwareMigrateFabricModelCustomProperties withVmwareSiteId(String vmwareSiteId) {
        this.vmwareSiteId = vmwareSiteId;
        return this;
    }

    /**
     * Get the migrationSolutionId property: Gets or sets the ARM Id of the migration solution.
     * 
     * @return the migrationSolutionId value.
     */
    public String migrationSolutionId() {
        return this.migrationSolutionId;
    }

    /**
     * Set the migrationSolutionId property: Gets or sets the ARM Id of the migration solution.
     * 
     * @param migrationSolutionId the migrationSolutionId value to set.
     * @return the VMwareMigrateFabricModelCustomProperties object itself.
     */
    public VMwareMigrateFabricModelCustomProperties withMigrationSolutionId(String migrationSolutionId) {
        this.migrationSolutionId = migrationSolutionId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (vmwareSiteId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property vmwareSiteId in model VMwareMigrateFabricModelCustomProperties"));
        }
        if (migrationSolutionId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property migrationSolutionId in model VMwareMigrateFabricModelCustomProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VMwareMigrateFabricModelCustomProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("vmwareSiteId", this.vmwareSiteId);
        jsonWriter.writeStringField("migrationSolutionId", this.migrationSolutionId);
        jsonWriter.writeStringField("instanceType", this.instanceType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VMwareMigrateFabricModelCustomProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VMwareMigrateFabricModelCustomProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the VMwareMigrateFabricModelCustomProperties.
     */
    public static VMwareMigrateFabricModelCustomProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VMwareMigrateFabricModelCustomProperties deserializedVMwareMigrateFabricModelCustomProperties
                = new VMwareMigrateFabricModelCustomProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vmwareSiteId".equals(fieldName)) {
                    deserializedVMwareMigrateFabricModelCustomProperties.vmwareSiteId = reader.getString();
                } else if ("migrationSolutionId".equals(fieldName)) {
                    deserializedVMwareMigrateFabricModelCustomProperties.migrationSolutionId = reader.getString();
                } else if ("instanceType".equals(fieldName)) {
                    deserializedVMwareMigrateFabricModelCustomProperties.instanceType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVMwareMigrateFabricModelCustomProperties;
        });
    }
}
