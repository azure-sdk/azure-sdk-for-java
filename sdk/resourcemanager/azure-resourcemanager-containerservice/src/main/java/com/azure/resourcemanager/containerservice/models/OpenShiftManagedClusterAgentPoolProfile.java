// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines the configuration of the OpenShift cluster VMs.
 */
@Fluent
public final class OpenShiftManagedClusterAgentPoolProfile
    implements JsonSerializable<OpenShiftManagedClusterAgentPoolProfile> {
    /*
     * Unique name of the pool profile in the context of the subscription and resource group.
     */
    private String name;

    /*
     * Number of agents (VMs) to host docker containers.
     */
    private int count;

    /*
     * Size of agent VMs.
     */
    private OpenShiftContainerServiceVMSize vmSize;

    /*
     * Subnet CIDR for the peering.
     */
    private String subnetCidr;

    /*
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     */
    private OSType osType;

    /*
     * Define the role of the AgentPoolProfile.
     */
    private OpenShiftAgentPoolProfileRole role;

    /**
     * Creates an instance of OpenShiftManagedClusterAgentPoolProfile class.
     */
    public OpenShiftManagedClusterAgentPoolProfile() {
    }

    /**
     * Get the name property: Unique name of the pool profile in the context of the subscription and resource group.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Unique name of the pool profile in the context of the subscription and resource group.
     * 
     * @param name the name value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the count property: Number of agents (VMs) to host docker containers.
     * 
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: Number of agents (VMs) to host docker containers.
     * 
     * @param count the count value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the vmSize property: Size of agent VMs.
     * 
     * @return the vmSize value.
     */
    public OpenShiftContainerServiceVMSize vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Size of agent VMs.
     * 
     * @param vmSize the vmSize value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withVmSize(OpenShiftContainerServiceVMSize vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the subnetCidr property: Subnet CIDR for the peering.
     * 
     * @return the subnetCidr value.
     */
    public String subnetCidr() {
        return this.subnetCidr;
    }

    /**
     * Set the subnetCidr property: Subnet CIDR for the peering.
     * 
     * @param subnetCidr the subnetCidr value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * Get the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     * @param osType the osType value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the role property: Define the role of the AgentPoolProfile.
     * 
     * @return the role value.
     */
    public OpenShiftAgentPoolProfileRole role() {
        return this.role;
    }

    /**
     * Set the role property: Define the role of the AgentPoolProfile.
     * 
     * @param role the role value to set.
     * @return the OpenShiftManagedClusterAgentPoolProfile object itself.
     */
    public OpenShiftManagedClusterAgentPoolProfile withRole(OpenShiftAgentPoolProfileRole role) {
        this.role = role;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model OpenShiftManagedClusterAgentPoolProfile"));
        }
        if (vmSize() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property vmSize in model OpenShiftManagedClusterAgentPoolProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OpenShiftManagedClusterAgentPoolProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeIntField("count", this.count);
        jsonWriter.writeStringField("vmSize", this.vmSize == null ? null : this.vmSize.toString());
        jsonWriter.writeStringField("subnetCidr", this.subnetCidr);
        jsonWriter.writeStringField("osType", this.osType == null ? null : this.osType.toString());
        jsonWriter.writeStringField("role", this.role == null ? null : this.role.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OpenShiftManagedClusterAgentPoolProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OpenShiftManagedClusterAgentPoolProfile if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OpenShiftManagedClusterAgentPoolProfile.
     */
    public static OpenShiftManagedClusterAgentPoolProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OpenShiftManagedClusterAgentPoolProfile deserializedOpenShiftManagedClusterAgentPoolProfile
                = new OpenShiftManagedClusterAgentPoolProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterAgentPoolProfile.name = reader.getString();
                } else if ("count".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterAgentPoolProfile.count = reader.getInt();
                } else if ("vmSize".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterAgentPoolProfile.vmSize
                        = OpenShiftContainerServiceVMSize.fromString(reader.getString());
                } else if ("subnetCidr".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterAgentPoolProfile.subnetCidr = reader.getString();
                } else if ("osType".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterAgentPoolProfile.osType = OSType.fromString(reader.getString());
                } else if ("role".equals(fieldName)) {
                    deserializedOpenShiftManagedClusterAgentPoolProfile.role
                        = OpenShiftAgentPoolProfileRole.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOpenShiftManagedClusterAgentPoolProfile;
        });
    }
}
