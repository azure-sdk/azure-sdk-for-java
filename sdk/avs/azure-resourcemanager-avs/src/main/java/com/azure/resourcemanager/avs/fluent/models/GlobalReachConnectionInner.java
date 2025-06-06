// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.avs.models.GlobalReachConnectionProvisioningState;
import com.azure.resourcemanager.avs.models.GlobalReachConnectionStatus;
import java.io.IOException;

/**
 * A global reach connection resource.
 */
@Fluent
public final class GlobalReachConnectionInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    private GlobalReachConnectionProperties innerProperties;

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
     * Creates an instance of GlobalReachConnectionInner class.
     */
    public GlobalReachConnectionInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private GlobalReachConnectionProperties innerProperties() {
        return this.innerProperties;
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
     * Get the provisioningState property: The state of the ExpressRoute Circuit Authorization provisioning.
     * 
     * @return the provisioningState value.
     */
    public GlobalReachConnectionProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the addressPrefix property: The network used for global reach carved out from the original network block
     * provided for the private cloud.
     * 
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().addressPrefix();
    }

    /**
     * Get the authorizationKey property: Authorization key from the peer express route used for the global reach
     * connection.
     * 
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationKey();
    }

    /**
     * Set the authorizationKey property: Authorization key from the peer express route used for the global reach
     * connection.
     * 
     * @param authorizationKey the authorizationKey value to set.
     * @return the GlobalReachConnectionInner object itself.
     */
    public GlobalReachConnectionInner withAuthorizationKey(String authorizationKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GlobalReachConnectionProperties();
        }
        this.innerProperties().withAuthorizationKey(authorizationKey);
        return this;
    }

    /**
     * Get the circuitConnectionStatus property: The connection status of the global reach connection.
     * 
     * @return the circuitConnectionStatus value.
     */
    public GlobalReachConnectionStatus circuitConnectionStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().circuitConnectionStatus();
    }

    /**
     * Get the peerExpressRouteCircuit property: Identifier of the ExpressRoute Circuit to peer with in the global reach
     * connection.
     * 
     * @return the peerExpressRouteCircuit value.
     */
    public String peerExpressRouteCircuit() {
        return this.innerProperties() == null ? null : this.innerProperties().peerExpressRouteCircuit();
    }

    /**
     * Set the peerExpressRouteCircuit property: Identifier of the ExpressRoute Circuit to peer with in the global reach
     * connection.
     * 
     * @param peerExpressRouteCircuit the peerExpressRouteCircuit value to set.
     * @return the GlobalReachConnectionInner object itself.
     */
    public GlobalReachConnectionInner withPeerExpressRouteCircuit(String peerExpressRouteCircuit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GlobalReachConnectionProperties();
        }
        this.innerProperties().withPeerExpressRouteCircuit(peerExpressRouteCircuit);
        return this;
    }

    /**
     * Get the expressRouteId property: The ID of the Private Cloud's ExpressRoute Circuit that is participating in the
     * global reach connection.
     * 
     * @return the expressRouteId value.
     */
    public String expressRouteId() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRouteId();
    }

    /**
     * Set the expressRouteId property: The ID of the Private Cloud's ExpressRoute Circuit that is participating in the
     * global reach connection.
     * 
     * @param expressRouteId the expressRouteId value to set.
     * @return the GlobalReachConnectionInner object itself.
     */
    public GlobalReachConnectionInner withExpressRouteId(String expressRouteId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GlobalReachConnectionProperties();
        }
        this.innerProperties().withExpressRouteId(expressRouteId);
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
     * Reads an instance of GlobalReachConnectionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GlobalReachConnectionInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GlobalReachConnectionInner.
     */
    public static GlobalReachConnectionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GlobalReachConnectionInner deserializedGlobalReachConnectionInner = new GlobalReachConnectionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedGlobalReachConnectionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedGlobalReachConnectionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedGlobalReachConnectionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedGlobalReachConnectionInner.innerProperties
                        = GlobalReachConnectionProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedGlobalReachConnectionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGlobalReachConnectionInner;
        });
    }
}
