// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.oracledatabase.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * PeerDb Details.
 */
@Fluent
public final class PeerDbDetails implements JsonSerializable<PeerDbDetails> {
    /*
     * The Azure resource ID of the Disaster Recovery peer database, which is located in a different region from the
     * current peer database.
     */
    private String peerDbId;

    /*
     * Ocid of the Disaster Recovery peer database, which is located in a different region from the current peer
     * database.
     */
    private String peerDbOcid;

    /*
     * The location of the Disaster Recovery peer database.
     */
    private String peerDbLocation;

    /**
     * Creates an instance of PeerDbDetails class.
     */
    public PeerDbDetails() {
    }

    /**
     * Get the peerDbId property: The Azure resource ID of the Disaster Recovery peer database, which is located in a
     * different region from the current peer database.
     * 
     * @return the peerDbId value.
     */
    public String peerDbId() {
        return this.peerDbId;
    }

    /**
     * Set the peerDbId property: The Azure resource ID of the Disaster Recovery peer database, which is located in a
     * different region from the current peer database.
     * 
     * @param peerDbId the peerDbId value to set.
     * @return the PeerDbDetails object itself.
     */
    public PeerDbDetails withPeerDbId(String peerDbId) {
        this.peerDbId = peerDbId;
        return this;
    }

    /**
     * Get the peerDbOcid property: Ocid of the Disaster Recovery peer database, which is located in a different region
     * from the current peer database.
     * 
     * @return the peerDbOcid value.
     */
    public String peerDbOcid() {
        return this.peerDbOcid;
    }

    /**
     * Set the peerDbOcid property: Ocid of the Disaster Recovery peer database, which is located in a different region
     * from the current peer database.
     * 
     * @param peerDbOcid the peerDbOcid value to set.
     * @return the PeerDbDetails object itself.
     */
    public PeerDbDetails withPeerDbOcid(String peerDbOcid) {
        this.peerDbOcid = peerDbOcid;
        return this;
    }

    /**
     * Get the peerDbLocation property: The location of the Disaster Recovery peer database.
     * 
     * @return the peerDbLocation value.
     */
    public String peerDbLocation() {
        return this.peerDbLocation;
    }

    /**
     * Set the peerDbLocation property: The location of the Disaster Recovery peer database.
     * 
     * @param peerDbLocation the peerDbLocation value to set.
     * @return the PeerDbDetails object itself.
     */
    public PeerDbDetails withPeerDbLocation(String peerDbLocation) {
        this.peerDbLocation = peerDbLocation;
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
        jsonWriter.writeStringField("peerDbId", this.peerDbId);
        jsonWriter.writeStringField("peerDbOcid", this.peerDbOcid);
        jsonWriter.writeStringField("peerDbLocation", this.peerDbLocation);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PeerDbDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PeerDbDetails if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PeerDbDetails.
     */
    public static PeerDbDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PeerDbDetails deserializedPeerDbDetails = new PeerDbDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("peerDbId".equals(fieldName)) {
                    deserializedPeerDbDetails.peerDbId = reader.getString();
                } else if ("peerDbOcid".equals(fieldName)) {
                    deserializedPeerDbDetails.peerDbOcid = reader.getString();
                } else if ("peerDbLocation".equals(fieldName)) {
                    deserializedPeerDbDetails.peerDbLocation = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPeerDbDetails;
        });
    }
}
