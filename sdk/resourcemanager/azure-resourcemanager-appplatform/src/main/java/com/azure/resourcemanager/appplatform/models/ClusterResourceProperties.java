// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Service properties payload.
 */
@Fluent
public final class ClusterResourceProperties implements JsonSerializable<ClusterResourceProperties> {
    /*
     * Provisioning state of the Service
     */
    private ProvisioningState provisioningState;

    /*
     * Network profile of the Service
     */
    private NetworkProfile networkProfile;

    /*
     * Additional Service settings in vnet injection instance
     */
    private ServiceVNetAddons vnetAddons;

    /*
     * Version of the Service
     */
    private Integer version;

    /*
     * ServiceInstanceEntity Id which uniquely identifies a created resource
     */
    private String serviceId;

    /*
     * Power state of the Service
     */
    private PowerState powerState;

    /*
     * The zoneRedundant property.
     */
    private Boolean zoneRedundant;

    /*
     * Fully qualified dns name of the service instance
     */
    private String fqdn;

    /*
     * Purchasing 3rd party product of the Service resource.
     */
    private MarketplaceResource marketplaceResource;

    /**
     * Creates an instance of ClusterResourceProperties class.
     */
    public ClusterResourceProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the Service.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the networkProfile property: Network profile of the Service.
     * 
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Network profile of the Service.
     * 
     * @param networkProfile the networkProfile value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the vnetAddons property: Additional Service settings in vnet injection instance.
     * 
     * @return the vnetAddons value.
     */
    public ServiceVNetAddons vnetAddons() {
        return this.vnetAddons;
    }

    /**
     * Set the vnetAddons property: Additional Service settings in vnet injection instance.
     * 
     * @param vnetAddons the vnetAddons value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withVnetAddons(ServiceVNetAddons vnetAddons) {
        this.vnetAddons = vnetAddons;
        return this;
    }

    /**
     * Get the version property: Version of the Service.
     * 
     * @return the version value.
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Get the serviceId property: ServiceInstanceEntity Id which uniquely identifies a created resource.
     * 
     * @return the serviceId value.
     */
    public String serviceId() {
        return this.serviceId;
    }

    /**
     * Get the powerState property: Power state of the Service.
     * 
     * @return the powerState value.
     */
    public PowerState powerState() {
        return this.powerState;
    }

    /**
     * Get the zoneRedundant property: The zoneRedundant property.
     * 
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: The zoneRedundant property.
     * 
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Get the fqdn property: Fully qualified dns name of the service instance.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the marketplaceResource property: Purchasing 3rd party product of the Service resource.
     * 
     * @return the marketplaceResource value.
     */
    public MarketplaceResource marketplaceResource() {
        return this.marketplaceResource;
    }

    /**
     * Set the marketplaceResource property: Purchasing 3rd party product of the Service resource.
     * 
     * @param marketplaceResource the marketplaceResource value to set.
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withMarketplaceResource(MarketplaceResource marketplaceResource) {
        this.marketplaceResource = marketplaceResource;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (vnetAddons() != null) {
            vnetAddons().validate();
        }
        if (marketplaceResource() != null) {
            marketplaceResource().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("networkProfile", this.networkProfile);
        jsonWriter.writeJsonField("vnetAddons", this.vnetAddons);
        jsonWriter.writeBooleanField("zoneRedundant", this.zoneRedundant);
        jsonWriter.writeJsonField("marketplaceResource", this.marketplaceResource);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterResourceProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterResourceProperties.
     */
    public static ClusterResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterResourceProperties deserializedClusterResourceProperties = new ClusterResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedClusterResourceProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("networkProfile".equals(fieldName)) {
                    deserializedClusterResourceProperties.networkProfile = NetworkProfile.fromJson(reader);
                } else if ("vnetAddons".equals(fieldName)) {
                    deserializedClusterResourceProperties.vnetAddons = ServiceVNetAddons.fromJson(reader);
                } else if ("version".equals(fieldName)) {
                    deserializedClusterResourceProperties.version = reader.getNullable(JsonReader::getInt);
                } else if ("serviceId".equals(fieldName)) {
                    deserializedClusterResourceProperties.serviceId = reader.getString();
                } else if ("powerState".equals(fieldName)) {
                    deserializedClusterResourceProperties.powerState = PowerState.fromString(reader.getString());
                } else if ("zoneRedundant".equals(fieldName)) {
                    deserializedClusterResourceProperties.zoneRedundant = reader.getNullable(JsonReader::getBoolean);
                } else if ("fqdn".equals(fieldName)) {
                    deserializedClusterResourceProperties.fqdn = reader.getString();
                } else if ("marketplaceResource".equals(fieldName)) {
                    deserializedClusterResourceProperties.marketplaceResource = MarketplaceResource.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterResourceProperties;
        });
    }
}
