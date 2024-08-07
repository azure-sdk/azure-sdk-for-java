// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitPeeringConfig;
import com.azure.resourcemanager.network.models.ExpressRoutePeeringState;
import com.azure.resourcemanager.network.models.ExpressRoutePeeringType;
import com.azure.resourcemanager.network.models.Ipv6ExpressRouteCircuitPeeringConfig;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;

/**
 * Properties of express route cross connection peering.
 */
@Fluent
public final class ExpressRouteCrossConnectionPeeringProperties
    implements JsonSerializable<ExpressRouteCrossConnectionPeeringProperties> {
    /*
     * The peering type.
     */
    private ExpressRoutePeeringType peeringType;

    /*
     * The peering state.
     */
    private ExpressRoutePeeringState state;

    /*
     * The Azure ASN.
     */
    private Integer azureAsn;

    /*
     * The peer ASN.
     */
    private Long peerAsn;

    /*
     * The primary address prefix.
     */
    private String primaryPeerAddressPrefix;

    /*
     * The secondary address prefix.
     */
    private String secondaryPeerAddressPrefix;

    /*
     * The primary port.
     */
    private String primaryAzurePort;

    /*
     * The secondary port.
     */
    private String secondaryAzurePort;

    /*
     * The shared key.
     */
    private String sharedKey;

    /*
     * The VLAN ID.
     */
    private Integer vlanId;

    /*
     * The Microsoft peering configuration.
     */
    private ExpressRouteCircuitPeeringConfig microsoftPeeringConfig;

    /*
     * The provisioning state of the express route cross connection peering resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The GatewayManager Etag.
     */
    private String gatewayManagerEtag;

    /*
     * Who was the last to modify the peering.
     */
    private String lastModifiedBy;

    /*
     * The IPv6 peering configuration.
     */
    private Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig;

    /**
     * Creates an instance of ExpressRouteCrossConnectionPeeringProperties class.
     */
    public ExpressRouteCrossConnectionPeeringProperties() {
    }

    /**
     * Get the peeringType property: The peering type.
     * 
     * @return the peeringType value.
     */
    public ExpressRoutePeeringType peeringType() {
        return this.peeringType;
    }

    /**
     * Set the peeringType property: The peering type.
     * 
     * @param peeringType the peeringType value to set.
     * @return the ExpressRouteCrossConnectionPeeringProperties object itself.
     */
    public ExpressRouteCrossConnectionPeeringProperties withPeeringType(ExpressRoutePeeringType peeringType) {
        this.peeringType = peeringType;
        return this;
    }

    /**
     * Get the state property: The peering state.
     * 
     * @return the state value.
     */
    public ExpressRoutePeeringState state() {
        return this.state;
    }

    /**
     * Set the state property: The peering state.
     * 
     * @param state the state value to set.
     * @return the ExpressRouteCrossConnectionPeeringProperties object itself.
     */
    public ExpressRouteCrossConnectionPeeringProperties withState(ExpressRoutePeeringState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the azureAsn property: The Azure ASN.
     * 
     * @return the azureAsn value.
     */
    public Integer azureAsn() {
        return this.azureAsn;
    }

    /**
     * Get the peerAsn property: The peer ASN.
     * 
     * @return the peerAsn value.
     */
    public Long peerAsn() {
        return this.peerAsn;
    }

    /**
     * Set the peerAsn property: The peer ASN.
     * 
     * @param peerAsn the peerAsn value to set.
     * @return the ExpressRouteCrossConnectionPeeringProperties object itself.
     */
    public ExpressRouteCrossConnectionPeeringProperties withPeerAsn(Long peerAsn) {
        this.peerAsn = peerAsn;
        return this;
    }

    /**
     * Get the primaryPeerAddressPrefix property: The primary address prefix.
     * 
     * @return the primaryPeerAddressPrefix value.
     */
    public String primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix;
    }

    /**
     * Set the primaryPeerAddressPrefix property: The primary address prefix.
     * 
     * @param primaryPeerAddressPrefix the primaryPeerAddressPrefix value to set.
     * @return the ExpressRouteCrossConnectionPeeringProperties object itself.
     */
    public ExpressRouteCrossConnectionPeeringProperties withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the secondaryPeerAddressPrefix property: The secondary address prefix.
     * 
     * @return the secondaryPeerAddressPrefix value.
     */
    public String secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix;
    }

    /**
     * Set the secondaryPeerAddressPrefix property: The secondary address prefix.
     * 
     * @param secondaryPeerAddressPrefix the secondaryPeerAddressPrefix value to set.
     * @return the ExpressRouteCrossConnectionPeeringProperties object itself.
     */
    public ExpressRouteCrossConnectionPeeringProperties
        withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the primaryAzurePort property: The primary port.
     * 
     * @return the primaryAzurePort value.
     */
    public String primaryAzurePort() {
        return this.primaryAzurePort;
    }

    /**
     * Get the secondaryAzurePort property: The secondary port.
     * 
     * @return the secondaryAzurePort value.
     */
    public String secondaryAzurePort() {
        return this.secondaryAzurePort;
    }

    /**
     * Get the sharedKey property: The shared key.
     * 
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: The shared key.
     * 
     * @param sharedKey the sharedKey value to set.
     * @return the ExpressRouteCrossConnectionPeeringProperties object itself.
     */
    public ExpressRouteCrossConnectionPeeringProperties withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
        return this;
    }

    /**
     * Get the vlanId property: The VLAN ID.
     * 
     * @return the vlanId value.
     */
    public Integer vlanId() {
        return this.vlanId;
    }

    /**
     * Set the vlanId property: The VLAN ID.
     * 
     * @param vlanId the vlanId value to set.
     * @return the ExpressRouteCrossConnectionPeeringProperties object itself.
     */
    public ExpressRouteCrossConnectionPeeringProperties withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get the microsoftPeeringConfig property: The Microsoft peering configuration.
     * 
     * @return the microsoftPeeringConfig value.
     */
    public ExpressRouteCircuitPeeringConfig microsoftPeeringConfig() {
        return this.microsoftPeeringConfig;
    }

    /**
     * Set the microsoftPeeringConfig property: The Microsoft peering configuration.
     * 
     * @param microsoftPeeringConfig the microsoftPeeringConfig value to set.
     * @return the ExpressRouteCrossConnectionPeeringProperties object itself.
     */
    public ExpressRouteCrossConnectionPeeringProperties
        withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route cross connection peering
     * resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the gatewayManagerEtag property: The GatewayManager Etag.
     * 
     * @return the gatewayManagerEtag value.
     */
    public String gatewayManagerEtag() {
        return this.gatewayManagerEtag;
    }

    /**
     * Set the gatewayManagerEtag property: The GatewayManager Etag.
     * 
     * @param gatewayManagerEtag the gatewayManagerEtag value to set.
     * @return the ExpressRouteCrossConnectionPeeringProperties object itself.
     */
    public ExpressRouteCrossConnectionPeeringProperties withGatewayManagerEtag(String gatewayManagerEtag) {
        this.gatewayManagerEtag = gatewayManagerEtag;
        return this;
    }

    /**
     * Get the lastModifiedBy property: Who was the last to modify the peering.
     * 
     * @return the lastModifiedBy value.
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Get the ipv6PeeringConfig property: The IPv6 peering configuration.
     * 
     * @return the ipv6PeeringConfig value.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig() {
        return this.ipv6PeeringConfig;
    }

    /**
     * Set the ipv6PeeringConfig property: The IPv6 peering configuration.
     * 
     * @param ipv6PeeringConfig the ipv6PeeringConfig value to set.
     * @return the ExpressRouteCrossConnectionPeeringProperties object itself.
     */
    public ExpressRouteCrossConnectionPeeringProperties
        withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig) {
        this.ipv6PeeringConfig = ipv6PeeringConfig;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (microsoftPeeringConfig() != null) {
            microsoftPeeringConfig().validate();
        }
        if (ipv6PeeringConfig() != null) {
            ipv6PeeringConfig().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("peeringType", this.peeringType == null ? null : this.peeringType.toString());
        jsonWriter.writeStringField("state", this.state == null ? null : this.state.toString());
        jsonWriter.writeNumberField("peerASN", this.peerAsn);
        jsonWriter.writeStringField("primaryPeerAddressPrefix", this.primaryPeerAddressPrefix);
        jsonWriter.writeStringField("secondaryPeerAddressPrefix", this.secondaryPeerAddressPrefix);
        jsonWriter.writeStringField("sharedKey", this.sharedKey);
        jsonWriter.writeNumberField("vlanId", this.vlanId);
        jsonWriter.writeJsonField("microsoftPeeringConfig", this.microsoftPeeringConfig);
        jsonWriter.writeStringField("gatewayManagerEtag", this.gatewayManagerEtag);
        jsonWriter.writeJsonField("ipv6PeeringConfig", this.ipv6PeeringConfig);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressRouteCrossConnectionPeeringProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteCrossConnectionPeeringProperties if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExpressRouteCrossConnectionPeeringProperties.
     */
    public static ExpressRouteCrossConnectionPeeringProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteCrossConnectionPeeringProperties deserializedExpressRouteCrossConnectionPeeringProperties
                = new ExpressRouteCrossConnectionPeeringProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("peeringType".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.peeringType
                        = ExpressRoutePeeringType.fromString(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.state
                        = ExpressRoutePeeringState.fromString(reader.getString());
                } else if ("azureASN".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.azureAsn
                        = reader.getNullable(JsonReader::getInt);
                } else if ("peerASN".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.peerAsn
                        = reader.getNullable(JsonReader::getLong);
                } else if ("primaryPeerAddressPrefix".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.primaryPeerAddressPrefix
                        = reader.getString();
                } else if ("secondaryPeerAddressPrefix".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.secondaryPeerAddressPrefix
                        = reader.getString();
                } else if ("primaryAzurePort".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.primaryAzurePort = reader.getString();
                } else if ("secondaryAzurePort".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.secondaryAzurePort = reader.getString();
                } else if ("sharedKey".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.sharedKey = reader.getString();
                } else if ("vlanId".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.vlanId
                        = reader.getNullable(JsonReader::getInt);
                } else if ("microsoftPeeringConfig".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.microsoftPeeringConfig
                        = ExpressRouteCircuitPeeringConfig.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("gatewayManagerEtag".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.gatewayManagerEtag = reader.getString();
                } else if ("lastModifiedBy".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.lastModifiedBy = reader.getString();
                } else if ("ipv6PeeringConfig".equals(fieldName)) {
                    deserializedExpressRouteCrossConnectionPeeringProperties.ipv6PeeringConfig
                        = Ipv6ExpressRouteCircuitPeeringConfig.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteCrossConnectionPeeringProperties;
        });
    }
}
