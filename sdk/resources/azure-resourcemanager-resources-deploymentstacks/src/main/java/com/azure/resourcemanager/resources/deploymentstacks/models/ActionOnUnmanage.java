// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.deploymentstacks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines the behavior of resources that are no longer managed after the stack is updated or deleted.
 */
@Fluent
public final class ActionOnUnmanage implements JsonSerializable<ActionOnUnmanage> {
    /*
     * Specifies an action for a newly unmanaged resource. Delete will attempt to delete the resource from Azure. Detach
     * will leave the resource in it's current state.
     */
    private DeploymentStacksDeleteDetachEnum resources;

    /*
     * Specifies an action for a newly unmanaged resource. Delete will attempt to delete the resource from Azure. Detach
     * will leave the resource in it's current state.
     */
    private DeploymentStacksDeleteDetachEnum resourceGroups;

    /*
     * Specifies an action for a newly unmanaged resource. Delete will attempt to delete the resource from Azure. Detach
     * will leave the resource in it's current state.
     */
    private DeploymentStacksDeleteDetachEnum managementGroups;

    /**
     * Creates an instance of ActionOnUnmanage class.
     */
    public ActionOnUnmanage() {
    }

    /**
     * Get the resources property: Specifies an action for a newly unmanaged resource. Delete will attempt to delete the
     * resource from Azure. Detach will leave the resource in it's current state.
     * 
     * @return the resources value.
     */
    public DeploymentStacksDeleteDetachEnum resources() {
        return this.resources;
    }

    /**
     * Set the resources property: Specifies an action for a newly unmanaged resource. Delete will attempt to delete the
     * resource from Azure. Detach will leave the resource in it's current state.
     * 
     * @param resources the resources value to set.
     * @return the ActionOnUnmanage object itself.
     */
    public ActionOnUnmanage withResources(DeploymentStacksDeleteDetachEnum resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the resourceGroups property: Specifies an action for a newly unmanaged resource. Delete will attempt to
     * delete the resource from Azure. Detach will leave the resource in it's current state.
     * 
     * @return the resourceGroups value.
     */
    public DeploymentStacksDeleteDetachEnum resourceGroups() {
        return this.resourceGroups;
    }

    /**
     * Set the resourceGroups property: Specifies an action for a newly unmanaged resource. Delete will attempt to
     * delete the resource from Azure. Detach will leave the resource in it's current state.
     * 
     * @param resourceGroups the resourceGroups value to set.
     * @return the ActionOnUnmanage object itself.
     */
    public ActionOnUnmanage withResourceGroups(DeploymentStacksDeleteDetachEnum resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }

    /**
     * Get the managementGroups property: Specifies an action for a newly unmanaged resource. Delete will attempt to
     * delete the resource from Azure. Detach will leave the resource in it's current state.
     * 
     * @return the managementGroups value.
     */
    public DeploymentStacksDeleteDetachEnum managementGroups() {
        return this.managementGroups;
    }

    /**
     * Set the managementGroups property: Specifies an action for a newly unmanaged resource. Delete will attempt to
     * delete the resource from Azure. Detach will leave the resource in it's current state.
     * 
     * @param managementGroups the managementGroups value to set.
     * @return the ActionOnUnmanage object itself.
     */
    public ActionOnUnmanage withManagementGroups(DeploymentStacksDeleteDetachEnum managementGroups) {
        this.managementGroups = managementGroups;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resources() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property resources in model ActionOnUnmanage"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ActionOnUnmanage.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resources", this.resources == null ? null : this.resources.toString());
        jsonWriter.writeStringField("resourceGroups",
            this.resourceGroups == null ? null : this.resourceGroups.toString());
        jsonWriter.writeStringField("managementGroups",
            this.managementGroups == null ? null : this.managementGroups.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ActionOnUnmanage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ActionOnUnmanage if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ActionOnUnmanage.
     */
    public static ActionOnUnmanage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ActionOnUnmanage deserializedActionOnUnmanage = new ActionOnUnmanage();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resources".equals(fieldName)) {
                    deserializedActionOnUnmanage.resources
                        = DeploymentStacksDeleteDetachEnum.fromString(reader.getString());
                } else if ("resourceGroups".equals(fieldName)) {
                    deserializedActionOnUnmanage.resourceGroups
                        = DeploymentStacksDeleteDetachEnum.fromString(reader.getString());
                } else if ("managementGroups".equals(fieldName)) {
                    deserializedActionOnUnmanage.managementGroups
                        = DeploymentStacksDeleteDetachEnum.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedActionOnUnmanage;
        });
    }
}
