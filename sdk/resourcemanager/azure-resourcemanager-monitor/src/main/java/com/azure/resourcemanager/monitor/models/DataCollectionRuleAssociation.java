// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Definition of association of a data collection rule with a monitored Azure resource.
 */
@Fluent
public class DataCollectionRuleAssociation implements JsonSerializable<DataCollectionRuleAssociation> {
    /*
     * Description of the association.
     */
    private String description;

    /*
     * The resource ID of the data collection rule that is to be associated.
     */
    private String dataCollectionRuleId;

    /*
     * The resource ID of the data collection endpoint that is to be associated.
     */
    private String dataCollectionEndpointId;

    /*
     * The resource provisioning state.
     */
    private KnownDataCollectionRuleAssociationProvisioningState provisioningState;

    /*
     * Metadata about the resource
     */
    private DataCollectionRuleAssociationMetadata metadata;

    /**
     * Creates an instance of DataCollectionRuleAssociation class.
     */
    public DataCollectionRuleAssociation() {
    }

    /**
     * Get the description property: Description of the association.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the association.
     * 
     * @param description the description value to set.
     * @return the DataCollectionRuleAssociation object itself.
     */
    public DataCollectionRuleAssociation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the dataCollectionRuleId property: The resource ID of the data collection rule that is to be associated.
     * 
     * @return the dataCollectionRuleId value.
     */
    public String dataCollectionRuleId() {
        return this.dataCollectionRuleId;
    }

    /**
     * Set the dataCollectionRuleId property: The resource ID of the data collection rule that is to be associated.
     * 
     * @param dataCollectionRuleId the dataCollectionRuleId value to set.
     * @return the DataCollectionRuleAssociation object itself.
     */
    public DataCollectionRuleAssociation withDataCollectionRuleId(String dataCollectionRuleId) {
        this.dataCollectionRuleId = dataCollectionRuleId;
        return this;
    }

    /**
     * Get the dataCollectionEndpointId property: The resource ID of the data collection endpoint that is to be
     * associated.
     * 
     * @return the dataCollectionEndpointId value.
     */
    public String dataCollectionEndpointId() {
        return this.dataCollectionEndpointId;
    }

    /**
     * Set the dataCollectionEndpointId property: The resource ID of the data collection endpoint that is to be
     * associated.
     * 
     * @param dataCollectionEndpointId the dataCollectionEndpointId value to set.
     * @return the DataCollectionRuleAssociation object itself.
     */
    public DataCollectionRuleAssociation withDataCollectionEndpointId(String dataCollectionEndpointId) {
        this.dataCollectionEndpointId = dataCollectionEndpointId;
        return this;
    }

    /**
     * Get the provisioningState property: The resource provisioning state.
     * 
     * @return the provisioningState value.
     */
    public KnownDataCollectionRuleAssociationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The resource provisioning state.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the DataCollectionRuleAssociation object itself.
     */
    DataCollectionRuleAssociation
        withProvisioningState(KnownDataCollectionRuleAssociationProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the metadata property: Metadata about the resource.
     * 
     * @return the metadata value.
     */
    public DataCollectionRuleAssociationMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Metadata about the resource.
     * 
     * @param metadata the metadata value to set.
     * @return the DataCollectionRuleAssociation object itself.
     */
    DataCollectionRuleAssociation withMetadata(DataCollectionRuleAssociationMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("dataCollectionRuleId", this.dataCollectionRuleId);
        jsonWriter.writeStringField("dataCollectionEndpointId", this.dataCollectionEndpointId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataCollectionRuleAssociation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataCollectionRuleAssociation if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DataCollectionRuleAssociation.
     */
    public static DataCollectionRuleAssociation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataCollectionRuleAssociation deserializedDataCollectionRuleAssociation
                = new DataCollectionRuleAssociation();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedDataCollectionRuleAssociation.description = reader.getString();
                } else if ("dataCollectionRuleId".equals(fieldName)) {
                    deserializedDataCollectionRuleAssociation.dataCollectionRuleId = reader.getString();
                } else if ("dataCollectionEndpointId".equals(fieldName)) {
                    deserializedDataCollectionRuleAssociation.dataCollectionEndpointId = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedDataCollectionRuleAssociation.provisioningState
                        = KnownDataCollectionRuleAssociationProvisioningState.fromString(reader.getString());
                } else if ("metadata".equals(fieldName)) {
                    deserializedDataCollectionRuleAssociation.metadata
                        = DataCollectionRuleAssociationMetadata.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataCollectionRuleAssociation;
        });
    }
}
