// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Definition of the DSC Report Resource.
 */
@Fluent
public final class DscReportResource implements JsonSerializable<DscReportResource> {
    /*
     * Gets or sets the ID of the resource.
     */
    private String resourceId;

    /*
     * Gets or sets the source info of the resource.
     */
    private String sourceInfo;

    /*
     * Gets or sets the Resource Navigation values for resources the resource depends on.
     */
    private List<DscReportResourceNavigation> dependsOn;

    /*
     * Gets or sets the module name of the resource.
     */
    private String moduleName;

    /*
     * Gets or sets the module version of the resource.
     */
    private String moduleVersion;

    /*
     * Gets or sets the name of the resource.
     */
    private String resourceName;

    /*
     * Gets or sets the error of the resource.
     */
    private String error;

    /*
     * Gets or sets the status of the resource.
     */
    private String status;

    /*
     * Gets or sets the duration in seconds for the resource.
     */
    private Double durationInSeconds;

    /*
     * Gets or sets the start date of the resource.
     */
    private OffsetDateTime startDate;

    /**
     * Creates an instance of DscReportResource class.
     */
    public DscReportResource() {
    }

    /**
     * Get the resourceId property: Gets or sets the ID of the resource.
     * 
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Gets or sets the ID of the resource.
     * 
     * @param resourceId the resourceId value to set.
     * @return the DscReportResource object itself.
     */
    public DscReportResource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the sourceInfo property: Gets or sets the source info of the resource.
     * 
     * @return the sourceInfo value.
     */
    public String sourceInfo() {
        return this.sourceInfo;
    }

    /**
     * Set the sourceInfo property: Gets or sets the source info of the resource.
     * 
     * @param sourceInfo the sourceInfo value to set.
     * @return the DscReportResource object itself.
     */
    public DscReportResource withSourceInfo(String sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    /**
     * Get the dependsOn property: Gets or sets the Resource Navigation values for resources the resource depends on.
     * 
     * @return the dependsOn value.
     */
    public List<DscReportResourceNavigation> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the dependsOn property: Gets or sets the Resource Navigation values for resources the resource depends on.
     * 
     * @param dependsOn the dependsOn value to set.
     * @return the DscReportResource object itself.
     */
    public DscReportResource withDependsOn(List<DscReportResourceNavigation> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get the moduleName property: Gets or sets the module name of the resource.
     * 
     * @return the moduleName value.
     */
    public String moduleName() {
        return this.moduleName;
    }

    /**
     * Set the moduleName property: Gets or sets the module name of the resource.
     * 
     * @param moduleName the moduleName value to set.
     * @return the DscReportResource object itself.
     */
    public DscReportResource withModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * Get the moduleVersion property: Gets or sets the module version of the resource.
     * 
     * @return the moduleVersion value.
     */
    public String moduleVersion() {
        return this.moduleVersion;
    }

    /**
     * Set the moduleVersion property: Gets or sets the module version of the resource.
     * 
     * @param moduleVersion the moduleVersion value to set.
     * @return the DscReportResource object itself.
     */
    public DscReportResource withModuleVersion(String moduleVersion) {
        this.moduleVersion = moduleVersion;
        return this;
    }

    /**
     * Get the resourceName property: Gets or sets the name of the resource.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: Gets or sets the name of the resource.
     * 
     * @param resourceName the resourceName value to set.
     * @return the DscReportResource object itself.
     */
    public DscReportResource withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the error property: Gets or sets the error of the resource.
     * 
     * @return the error value.
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error property: Gets or sets the error of the resource.
     * 
     * @param error the error value to set.
     * @return the DscReportResource object itself.
     */
    public DscReportResource withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get the status property: Gets or sets the status of the resource.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Gets or sets the status of the resource.
     * 
     * @param status the status value to set.
     * @return the DscReportResource object itself.
     */
    public DscReportResource withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the durationInSeconds property: Gets or sets the duration in seconds for the resource.
     * 
     * @return the durationInSeconds value.
     */
    public Double durationInSeconds() {
        return this.durationInSeconds;
    }

    /**
     * Set the durationInSeconds property: Gets or sets the duration in seconds for the resource.
     * 
     * @param durationInSeconds the durationInSeconds value to set.
     * @return the DscReportResource object itself.
     */
    public DscReportResource withDurationInSeconds(Double durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
        return this;
    }

    /**
     * Get the startDate property: Gets or sets the start date of the resource.
     * 
     * @return the startDate value.
     */
    public OffsetDateTime startDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: Gets or sets the start date of the resource.
     * 
     * @param startDate the startDate value to set.
     * @return the DscReportResource object itself.
     */
    public DscReportResource withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dependsOn() != null) {
            dependsOn().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("sourceInfo", this.sourceInfo);
        jsonWriter.writeArrayField("dependsOn", this.dependsOn, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("moduleName", this.moduleName);
        jsonWriter.writeStringField("moduleVersion", this.moduleVersion);
        jsonWriter.writeStringField("resourceName", this.resourceName);
        jsonWriter.writeStringField("error", this.error);
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeNumberField("durationInSeconds", this.durationInSeconds);
        jsonWriter.writeStringField("startDate",
            this.startDate == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startDate));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DscReportResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DscReportResource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DscReportResource.
     */
    public static DscReportResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DscReportResource deserializedDscReportResource = new DscReportResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    deserializedDscReportResource.resourceId = reader.getString();
                } else if ("sourceInfo".equals(fieldName)) {
                    deserializedDscReportResource.sourceInfo = reader.getString();
                } else if ("dependsOn".equals(fieldName)) {
                    List<DscReportResourceNavigation> dependsOn
                        = reader.readArray(reader1 -> DscReportResourceNavigation.fromJson(reader1));
                    deserializedDscReportResource.dependsOn = dependsOn;
                } else if ("moduleName".equals(fieldName)) {
                    deserializedDscReportResource.moduleName = reader.getString();
                } else if ("moduleVersion".equals(fieldName)) {
                    deserializedDscReportResource.moduleVersion = reader.getString();
                } else if ("resourceName".equals(fieldName)) {
                    deserializedDscReportResource.resourceName = reader.getString();
                } else if ("error".equals(fieldName)) {
                    deserializedDscReportResource.error = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedDscReportResource.status = reader.getString();
                } else if ("durationInSeconds".equals(fieldName)) {
                    deserializedDscReportResource.durationInSeconds = reader.getNullable(JsonReader::getDouble);
                } else if ("startDate".equals(fieldName)) {
                    deserializedDscReportResource.startDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDscReportResource;
        });
    }
}
