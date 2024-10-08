// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.billing.models.InstanceFlexibility;
import java.io.IOException;

/**
 * Properties specific to each reserved resource type. Not required if not applicable.
 */
@Fluent
public final class ReservationPurchaseRequestPropertiesReservedResourceProperties
    implements JsonSerializable<ReservationPurchaseRequestPropertiesReservedResourceProperties> {
    /*
     * Turning this on will apply the reservation discount to other VMs in the same VM size group. Only specify for
     * VirtualMachines reserved resource type.
     */
    private InstanceFlexibility instanceFlexibility;

    /**
     * Creates an instance of ReservationPurchaseRequestPropertiesReservedResourceProperties class.
     */
    public ReservationPurchaseRequestPropertiesReservedResourceProperties() {
    }

    /**
     * Get the instanceFlexibility property: Turning this on will apply the reservation discount to other VMs in the
     * same VM size group. Only specify for VirtualMachines reserved resource type.
     * 
     * @return the instanceFlexibility value.
     */
    public InstanceFlexibility instanceFlexibility() {
        return this.instanceFlexibility;
    }

    /**
     * Set the instanceFlexibility property: Turning this on will apply the reservation discount to other VMs in the
     * same VM size group. Only specify for VirtualMachines reserved resource type.
     * 
     * @param instanceFlexibility the instanceFlexibility value to set.
     * @return the ReservationPurchaseRequestPropertiesReservedResourceProperties object itself.
     */
    public ReservationPurchaseRequestPropertiesReservedResourceProperties
        withInstanceFlexibility(InstanceFlexibility instanceFlexibility) {
        this.instanceFlexibility = instanceFlexibility;
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
        jsonWriter.writeStringField("instanceFlexibility",
            this.instanceFlexibility == null ? null : this.instanceFlexibility.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReservationPurchaseRequestPropertiesReservedResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReservationPurchaseRequestPropertiesReservedResourceProperties if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * ReservationPurchaseRequestPropertiesReservedResourceProperties.
     */
    public static ReservationPurchaseRequestPropertiesReservedResourceProperties fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            ReservationPurchaseRequestPropertiesReservedResourceProperties deserializedReservationPurchaseRequestPropertiesReservedResourceProperties
                = new ReservationPurchaseRequestPropertiesReservedResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("instanceFlexibility".equals(fieldName)) {
                    deserializedReservationPurchaseRequestPropertiesReservedResourceProperties.instanceFlexibility
                        = InstanceFlexibility.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedReservationPurchaseRequestPropertiesReservedResourceProperties;
        });
    }
}
