// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The properties that define a received route.
 */
@Immutable
public final class PeeringReceivedRouteInner implements JsonSerializable<PeeringReceivedRouteInner> {
    /*
     * The prefix.
     */
    private String prefix;

    /*
     * The next hop for the prefix.
     */
    private String nextHop;

    /*
     * The AS path for the prefix.
     */
    private String asPath;

    /*
     * The origin AS change information for the prefix.
     */
    private String originAsValidationState;

    /*
     * The RPKI validation state for the prefix and origin AS that's listed in the AS path.
     */
    private String rpkiValidationState;

    /*
     * The authority which holds the Route Origin Authorization record for the prefix, if any.
     */
    private String trustAnchor;

    /*
     * The received timestamp associated with the prefix.
     */
    private String receivedTimestamp;

    /**
     * Creates an instance of PeeringReceivedRouteInner class.
     */
    public PeeringReceivedRouteInner() {
    }

    /**
     * Get the prefix property: The prefix.
     * 
     * @return the prefix value.
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * Get the nextHop property: The next hop for the prefix.
     * 
     * @return the nextHop value.
     */
    public String nextHop() {
        return this.nextHop;
    }

    /**
     * Get the asPath property: The AS path for the prefix.
     * 
     * @return the asPath value.
     */
    public String asPath() {
        return this.asPath;
    }

    /**
     * Get the originAsValidationState property: The origin AS change information for the prefix.
     * 
     * @return the originAsValidationState value.
     */
    public String originAsValidationState() {
        return this.originAsValidationState;
    }

    /**
     * Get the rpkiValidationState property: The RPKI validation state for the prefix and origin AS that's listed in the
     * AS path.
     * 
     * @return the rpkiValidationState value.
     */
    public String rpkiValidationState() {
        return this.rpkiValidationState;
    }

    /**
     * Get the trustAnchor property: The authority which holds the Route Origin Authorization record for the prefix, if
     * any.
     * 
     * @return the trustAnchor value.
     */
    public String trustAnchor() {
        return this.trustAnchor;
    }

    /**
     * Get the receivedTimestamp property: The received timestamp associated with the prefix.
     * 
     * @return the receivedTimestamp value.
     */
    public String receivedTimestamp() {
        return this.receivedTimestamp;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PeeringReceivedRouteInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PeeringReceivedRouteInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PeeringReceivedRouteInner.
     */
    public static PeeringReceivedRouteInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PeeringReceivedRouteInner deserializedPeeringReceivedRouteInner = new PeeringReceivedRouteInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("prefix".equals(fieldName)) {
                    deserializedPeeringReceivedRouteInner.prefix = reader.getString();
                } else if ("nextHop".equals(fieldName)) {
                    deserializedPeeringReceivedRouteInner.nextHop = reader.getString();
                } else if ("asPath".equals(fieldName)) {
                    deserializedPeeringReceivedRouteInner.asPath = reader.getString();
                } else if ("originAsValidationState".equals(fieldName)) {
                    deserializedPeeringReceivedRouteInner.originAsValidationState = reader.getString();
                } else if ("rpkiValidationState".equals(fieldName)) {
                    deserializedPeeringReceivedRouteInner.rpkiValidationState = reader.getString();
                } else if ("trustAnchor".equals(fieldName)) {
                    deserializedPeeringReceivedRouteInner.trustAnchor = reader.getString();
                } else if ("receivedTimestamp".equals(fieldName)) {
                    deserializedPeeringReceivedRouteInner.receivedTimestamp = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPeeringReceivedRouteInner;
        });
    }
}
