// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.hardwaresecuritymodules.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hardwaresecuritymodules.fluent.models.PrivateEndpointConnectionInner;
import java.io.IOException;
import java.util.List;

/**
 * Properties of a Cloud HSM Cluster.
 */
@Fluent
public final class CloudHsmClusterProperties implements JsonSerializable<CloudHsmClusterProperties> {
    /*
     * State of security domain activation
     */
    private ActivationState activationState;

    /*
     * The Cloud HSM Cluster's auto-generated Domain Name Label Scope
     */
    private AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope;

    /*
     * An array of Cloud HSM Cluster's HSMs
     */
    private List<CloudHsmProperties> hsms;

    /*
     * List of private endpoint connection resources
     */
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * The Cloud HSM Cluster's provisioningState
     */
    private ProvisioningState provisioningState;

    /*
     * The Cloud HSM Cluster public network access
     */
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * Cloud HSM Cluster status message
     */
    private String statusMessage;

    /**
     * Creates an instance of CloudHsmClusterProperties class.
     */
    public CloudHsmClusterProperties() {
    }

    /**
     * Get the activationState property: State of security domain activation.
     * 
     * @return the activationState value.
     */
    public ActivationState activationState() {
        return this.activationState;
    }

    /**
     * Get the autoGeneratedDomainNameLabelScope property: The Cloud HSM Cluster's auto-generated Domain Name Label
     * Scope.
     * 
     * @return the autoGeneratedDomainNameLabelScope value.
     */
    public AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope() {
        return this.autoGeneratedDomainNameLabelScope;
    }

    /**
     * Set the autoGeneratedDomainNameLabelScope property: The Cloud HSM Cluster's auto-generated Domain Name Label
     * Scope.
     * 
     * @param autoGeneratedDomainNameLabelScope the autoGeneratedDomainNameLabelScope value to set.
     * @return the CloudHsmClusterProperties object itself.
     */
    public CloudHsmClusterProperties
        withAutoGeneratedDomainNameLabelScope(AutoGeneratedDomainNameLabelScope autoGeneratedDomainNameLabelScope) {
        this.autoGeneratedDomainNameLabelScope = autoGeneratedDomainNameLabelScope;
        return this;
    }

    /**
     * Get the hsms property: An array of Cloud HSM Cluster's HSMs.
     * 
     * @return the hsms value.
     */
    public List<CloudHsmProperties> hsms() {
        return this.hsms;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connection resources.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the provisioningState property: The Cloud HSM Cluster's provisioningState.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the publicNetworkAccess property: The Cloud HSM Cluster public network access.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: The Cloud HSM Cluster public network access.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the CloudHsmClusterProperties object itself.
     */
    public CloudHsmClusterProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the statusMessage property: Cloud HSM Cluster status message.
     * 
     * @return the statusMessage value.
     */
    public String statusMessage() {
        return this.statusMessage;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hsms() != null) {
            hsms().forEach(e -> e.validate());
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("autoGeneratedDomainNameLabelScope",
            this.autoGeneratedDomainNameLabelScope == null ? null : this.autoGeneratedDomainNameLabelScope.toString());
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CloudHsmClusterProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CloudHsmClusterProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CloudHsmClusterProperties.
     */
    public static CloudHsmClusterProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CloudHsmClusterProperties deserializedCloudHsmClusterProperties = new CloudHsmClusterProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("activationState".equals(fieldName)) {
                    deserializedCloudHsmClusterProperties.activationState
                        = ActivationState.fromString(reader.getString());
                } else if ("autoGeneratedDomainNameLabelScope".equals(fieldName)) {
                    deserializedCloudHsmClusterProperties.autoGeneratedDomainNameLabelScope
                        = AutoGeneratedDomainNameLabelScope.fromString(reader.getString());
                } else if ("hsms".equals(fieldName)) {
                    List<CloudHsmProperties> hsms = reader.readArray(reader1 -> CloudHsmProperties.fromJson(reader1));
                    deserializedCloudHsmClusterProperties.hsms = hsms;
                } else if ("privateEndpointConnections".equals(fieldName)) {
                    List<PrivateEndpointConnectionInner> privateEndpointConnections
                        = reader.readArray(reader1 -> PrivateEndpointConnectionInner.fromJson(reader1));
                    deserializedCloudHsmClusterProperties.privateEndpointConnections = privateEndpointConnections;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedCloudHsmClusterProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedCloudHsmClusterProperties.publicNetworkAccess
                        = PublicNetworkAccess.fromString(reader.getString());
                } else if ("statusMessage".equals(fieldName)) {
                    deserializedCloudHsmClusterProperties.statusMessage = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCloudHsmClusterProperties;
        });
    }
}
