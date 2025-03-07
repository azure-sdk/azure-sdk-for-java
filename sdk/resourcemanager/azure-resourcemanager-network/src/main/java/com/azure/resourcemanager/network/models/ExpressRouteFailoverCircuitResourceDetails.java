// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ExpressRouteFailoverCircuitResourceDetails model.
 */
@Fluent
public final class ExpressRouteFailoverCircuitResourceDetails
    implements JsonSerializable<ExpressRouteFailoverCircuitResourceDetails> {
    /*
     * NRP Resource URI of the circuit
     */
    private String nrpResourceUri;

    /*
     * Circuit Name
     */
    private String name;

    /*
     * Connection name associated with the circuit
     */
    private String connectionName;

    /**
     * Creates an instance of ExpressRouteFailoverCircuitResourceDetails class.
     */
    public ExpressRouteFailoverCircuitResourceDetails() {
    }

    /**
     * Get the nrpResourceUri property: NRP Resource URI of the circuit.
     * 
     * @return the nrpResourceUri value.
     */
    public String nrpResourceUri() {
        return this.nrpResourceUri;
    }

    /**
     * Set the nrpResourceUri property: NRP Resource URI of the circuit.
     * 
     * @param nrpResourceUri the nrpResourceUri value to set.
     * @return the ExpressRouteFailoverCircuitResourceDetails object itself.
     */
    public ExpressRouteFailoverCircuitResourceDetails withNrpResourceUri(String nrpResourceUri) {
        this.nrpResourceUri = nrpResourceUri;
        return this;
    }

    /**
     * Get the name property: Circuit Name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Circuit Name.
     * 
     * @param name the name value to set.
     * @return the ExpressRouteFailoverCircuitResourceDetails object itself.
     */
    public ExpressRouteFailoverCircuitResourceDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the connectionName property: Connection name associated with the circuit.
     * 
     * @return the connectionName value.
     */
    public String connectionName() {
        return this.connectionName;
    }

    /**
     * Set the connectionName property: Connection name associated with the circuit.
     * 
     * @param connectionName the connectionName value to set.
     * @return the ExpressRouteFailoverCircuitResourceDetails object itself.
     */
    public ExpressRouteFailoverCircuitResourceDetails withConnectionName(String connectionName) {
        this.connectionName = connectionName;
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
        jsonWriter.writeStringField("nrpResourceUri", this.nrpResourceUri);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("connectionName", this.connectionName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressRouteFailoverCircuitResourceDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteFailoverCircuitResourceDetails if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExpressRouteFailoverCircuitResourceDetails.
     */
    public static ExpressRouteFailoverCircuitResourceDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteFailoverCircuitResourceDetails deserializedExpressRouteFailoverCircuitResourceDetails
                = new ExpressRouteFailoverCircuitResourceDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nrpResourceUri".equals(fieldName)) {
                    deserializedExpressRouteFailoverCircuitResourceDetails.nrpResourceUri = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedExpressRouteFailoverCircuitResourceDetails.name = reader.getString();
                } else if ("connectionName".equals(fieldName)) {
                    deserializedExpressRouteFailoverCircuitResourceDetails.connectionName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteFailoverCircuitResourceDetails;
        });
    }
}
