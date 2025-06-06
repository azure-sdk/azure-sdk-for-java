// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.messaging.eventgrid.systemevents.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Information related to a given self-hosted gateway deployment.
 */
@Immutable
public final class ApiManagementGatewayProperties implements JsonSerializable<ApiManagementGatewayProperties> {
    /*
     * Id of Gateway that is used to deploy the gateway to get the configuration for. This is the ARM resource ID
     * referenced in the Azure API Management instance. Uses the format,
     * `/subscriptions/<SubscriptionID>/resourceGroups/<ResourceGroup>/Microsoft.ApiManagement/service/<ServiceName>/
     * gateway/<GatewayName>`
     */
    @Generated
    private final String gatewayId;

    /*
     * Unique instance ID of the deployed gateway
     */
    @Generated
    private final String instanceId;

    /**
     * Creates an instance of ApiManagementGatewayProperties class.
     * 
     * @param gatewayId the gatewayId value to set.
     * @param instanceId the instanceId value to set.
     */
    @Generated
    private ApiManagementGatewayProperties(String gatewayId, String instanceId) {
        this.gatewayId = gatewayId;
        this.instanceId = instanceId;
    }

    /**
     * Get the gatewayId property: Id of Gateway that is used to deploy the gateway to get the configuration for. This
     * is the ARM resource ID referenced in the Azure API Management instance. Uses the format,
     * `/subscriptions/&lt;SubscriptionID&gt;/resourceGroups/&lt;ResourceGroup&gt;/Microsoft.ApiManagement/service/&lt;ServiceName&gt;/gateway/&lt;GatewayName&gt;`.
     * 
     * @return the gatewayId value.
     */
    @Generated
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * Get the instanceId property: Unique instance ID of the deployed gateway.
     * 
     * @return the instanceId value.
     */
    @Generated
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("gatewayId", this.gatewayId);
        jsonWriter.writeStringField("instanceId", this.instanceId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApiManagementGatewayProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApiManagementGatewayProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApiManagementGatewayProperties.
     */
    @Generated
    public static ApiManagementGatewayProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String gatewayId = null;
            String instanceId = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("gatewayId".equals(fieldName)) {
                    gatewayId = reader.getString();
                } else if ("instanceId".equals(fieldName)) {
                    instanceId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new ApiManagementGatewayProperties(gatewayId, instanceId);
        });
    }
}
