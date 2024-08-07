// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.sql.models.ManagedInstanceAdministratorType;
import java.io.IOException;
import java.util.UUID;

/**
 * An Azure SQL managed instance administrator.
 */
@Fluent
public final class ManagedInstanceAdministratorInner extends ProxyResource {
    /*
     * Resource properties.
     */
    private ManagedInstanceAdministratorProperties innerProperties;

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
     * Creates an instance of ManagedInstanceAdministratorInner class.
     */
    public ManagedInstanceAdministratorInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private ManagedInstanceAdministratorProperties innerProperties() {
        return this.innerProperties;
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
     * Get the administratorType property: Type of the managed instance administrator.
     * 
     * @return the administratorType value.
     */
    public ManagedInstanceAdministratorType administratorType() {
        return this.innerProperties() == null ? null : this.innerProperties().administratorType();
    }

    /**
     * Set the administratorType property: Type of the managed instance administrator.
     * 
     * @param administratorType the administratorType value to set.
     * @return the ManagedInstanceAdministratorInner object itself.
     */
    public ManagedInstanceAdministratorInner withAdministratorType(ManagedInstanceAdministratorType administratorType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedInstanceAdministratorProperties();
        }
        this.innerProperties().withAdministratorType(administratorType);
        return this;
    }

    /**
     * Get the login property: Login name of the managed instance administrator.
     * 
     * @return the login value.
     */
    public String login() {
        return this.innerProperties() == null ? null : this.innerProperties().login();
    }

    /**
     * Set the login property: Login name of the managed instance administrator.
     * 
     * @param login the login value to set.
     * @return the ManagedInstanceAdministratorInner object itself.
     */
    public ManagedInstanceAdministratorInner withLogin(String login) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedInstanceAdministratorProperties();
        }
        this.innerProperties().withLogin(login);
        return this;
    }

    /**
     * Get the sid property: SID (object ID) of the managed instance administrator.
     * 
     * @return the sid value.
     */
    public UUID sid() {
        return this.innerProperties() == null ? null : this.innerProperties().sid();
    }

    /**
     * Set the sid property: SID (object ID) of the managed instance administrator.
     * 
     * @param sid the sid value to set.
     * @return the ManagedInstanceAdministratorInner object itself.
     */
    public ManagedInstanceAdministratorInner withSid(UUID sid) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedInstanceAdministratorProperties();
        }
        this.innerProperties().withSid(sid);
        return this;
    }

    /**
     * Get the tenantId property: Tenant ID of the managed instance administrator.
     * 
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: Tenant ID of the managed instance administrator.
     * 
     * @param tenantId the tenantId value to set.
     * @return the ManagedInstanceAdministratorInner object itself.
     */
    public ManagedInstanceAdministratorInner withTenantId(UUID tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagedInstanceAdministratorProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedInstanceAdministratorInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedInstanceAdministratorInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedInstanceAdministratorInner.
     */
    public static ManagedInstanceAdministratorInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedInstanceAdministratorInner deserializedManagedInstanceAdministratorInner
                = new ManagedInstanceAdministratorInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedManagedInstanceAdministratorInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedManagedInstanceAdministratorInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedManagedInstanceAdministratorInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedManagedInstanceAdministratorInner.innerProperties
                        = ManagedInstanceAdministratorProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedInstanceAdministratorInner;
        });
    }
}
