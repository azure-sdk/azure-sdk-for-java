// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.VMTypeEnum;
import com.azure.resourcemanager.avs.models.WorkloadNetworkProvisioningState;
import java.io.IOException;

/**
 * NSX Virtual Machine Properties.
 */
@Immutable
public final class WorkloadNetworkVirtualMachineProperties
    implements JsonSerializable<WorkloadNetworkVirtualMachineProperties> {
    /*
     * The provisioning state of the resource.
     */
    private WorkloadNetworkProvisioningState provisioningState;

    /*
     * Display name of the VM.
     */
    private String displayName;

    /*
     * Virtual machine type.
     */
    private VMTypeEnum vmType;

    /**
     * Creates an instance of WorkloadNetworkVirtualMachineProperties class.
     */
    private WorkloadNetworkVirtualMachineProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public WorkloadNetworkProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the displayName property: Display name of the VM.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the vmType property: Virtual machine type.
     * 
     * @return the vmType value.
     */
    public VMTypeEnum vmType() {
        return this.vmType;
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
        jsonWriter.writeStringField("displayName", this.displayName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkloadNetworkVirtualMachineProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkloadNetworkVirtualMachineProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkloadNetworkVirtualMachineProperties.
     */
    public static WorkloadNetworkVirtualMachineProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkloadNetworkVirtualMachineProperties deserializedWorkloadNetworkVirtualMachineProperties
                = new WorkloadNetworkVirtualMachineProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedWorkloadNetworkVirtualMachineProperties.provisioningState
                        = WorkloadNetworkProvisioningState.fromString(reader.getString());
                } else if ("displayName".equals(fieldName)) {
                    deserializedWorkloadNetworkVirtualMachineProperties.displayName = reader.getString();
                } else if ("vmType".equals(fieldName)) {
                    deserializedWorkloadNetworkVirtualMachineProperties.vmType
                        = VMTypeEnum.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWorkloadNetworkVirtualMachineProperties;
        });
    }
}
