// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.ProbeInner;
import java.io.IOException;
import java.util.List;

/**
 * Response for ListProbe API service call.
 */
@Fluent
public final class LoadBalancerProbeListResult implements JsonSerializable<LoadBalancerProbeListResult> {
    /*
     * A list of probes in a load balancer.
     */
    private List<ProbeInner> value;

    /*
     * The URL to get the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of LoadBalancerProbeListResult class.
     */
    public LoadBalancerProbeListResult() {
    }

    /**
     * Get the value property: A list of probes in a load balancer.
     * 
     * @return the value value.
     */
    public List<ProbeInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of probes in a load balancer.
     * 
     * @param value the value value to set.
     * @return the LoadBalancerProbeListResult object itself.
     */
    public LoadBalancerProbeListResult withValue(List<ProbeInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBalancerProbeListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBalancerProbeListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LoadBalancerProbeListResult.
     */
    public static LoadBalancerProbeListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBalancerProbeListResult deserializedLoadBalancerProbeListResult = new LoadBalancerProbeListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ProbeInner> value = reader.readArray(reader1 -> ProbeInner.fromJson(reader1));
                    deserializedLoadBalancerProbeListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedLoadBalancerProbeListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBalancerProbeListResult;
        });
    }
}
