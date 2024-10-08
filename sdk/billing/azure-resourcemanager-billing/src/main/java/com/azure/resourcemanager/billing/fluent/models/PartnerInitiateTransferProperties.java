// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Request parameters to initiate transfer.
 */
@Fluent
public final class PartnerInitiateTransferProperties implements JsonSerializable<PartnerInitiateTransferProperties> {
    /*
     * The email ID of the recipient to whom the transfer request is sent.
     */
    private String recipientEmailId;

    /*
     * Optional MPN ID of the reseller for transfer requests that are sent from a Microsoft Partner Agreement billing
     * account.
     */
    private String resellerId;

    /**
     * Creates an instance of PartnerInitiateTransferProperties class.
     */
    public PartnerInitiateTransferProperties() {
    }

    /**
     * Get the recipientEmailId property: The email ID of the recipient to whom the transfer request is sent.
     * 
     * @return the recipientEmailId value.
     */
    public String recipientEmailId() {
        return this.recipientEmailId;
    }

    /**
     * Set the recipientEmailId property: The email ID of the recipient to whom the transfer request is sent.
     * 
     * @param recipientEmailId the recipientEmailId value to set.
     * @return the PartnerInitiateTransferProperties object itself.
     */
    public PartnerInitiateTransferProperties withRecipientEmailId(String recipientEmailId) {
        this.recipientEmailId = recipientEmailId;
        return this;
    }

    /**
     * Get the resellerId property: Optional MPN ID of the reseller for transfer requests that are sent from a Microsoft
     * Partner Agreement billing account.
     * 
     * @return the resellerId value.
     */
    public String resellerId() {
        return this.resellerId;
    }

    /**
     * Set the resellerId property: Optional MPN ID of the reseller for transfer requests that are sent from a Microsoft
     * Partner Agreement billing account.
     * 
     * @param resellerId the resellerId value to set.
     * @return the PartnerInitiateTransferProperties object itself.
     */
    public PartnerInitiateTransferProperties withResellerId(String resellerId) {
        this.resellerId = resellerId;
        return this;
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
        jsonWriter.writeStringField("recipientEmailId", this.recipientEmailId);
        jsonWriter.writeStringField("resellerId", this.resellerId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PartnerInitiateTransferProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PartnerInitiateTransferProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PartnerInitiateTransferProperties.
     */
    public static PartnerInitiateTransferProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PartnerInitiateTransferProperties deserializedPartnerInitiateTransferProperties
                = new PartnerInitiateTransferProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("recipientEmailId".equals(fieldName)) {
                    deserializedPartnerInitiateTransferProperties.recipientEmailId = reader.getString();
                } else if ("resellerId".equals(fieldName)) {
                    deserializedPartnerInitiateTransferProperties.resellerId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPartnerInitiateTransferProperties;
        });
    }
}
