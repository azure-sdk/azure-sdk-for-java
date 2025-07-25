// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.compute.models.ExtendedLocation;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * disk access resource.
 */
@Fluent
public final class DiskAccessInner extends Resource {
    /*
     * The properties property.
     */
    private DiskAccessProperties innerProperties;

    /*
     * The extended location where the disk access will be created. Extended location cannot be changed.
     */
    private ExtendedLocation extendedLocation;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of DiskAccessInner class.
     */
    public DiskAccessInner() {
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private DiskAccessProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the extendedLocation property: The extended location where the disk access will be created. Extended location
     * cannot be changed.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location where the disk access will be created. Extended location
     * cannot be changed.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the DiskAccessInner object itself.
     */
    public DiskAccessInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiskAccessInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiskAccessInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the privateEndpointConnections property: A readonly collection of private endpoint connections created on the
     * disk. Currently only one endpoint connection is supported.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Get the provisioningState property: The disk access resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the timeCreated property: The time when the disk access was created.
     * 
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeJsonField("extendedLocation", this.extendedLocation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiskAccessInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiskAccessInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DiskAccessInner.
     */
    public static DiskAccessInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiskAccessInner deserializedDiskAccessInner = new DiskAccessInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedDiskAccessInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedDiskAccessInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedDiskAccessInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedDiskAccessInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedDiskAccessInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedDiskAccessInner.innerProperties = DiskAccessProperties.fromJson(reader);
                } else if ("extendedLocation".equals(fieldName)) {
                    deserializedDiskAccessInner.extendedLocation = ExtendedLocation.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedDiskAccessInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiskAccessInner;
        });
    }
}
