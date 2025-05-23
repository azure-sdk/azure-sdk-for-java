// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;

/**
 * The sync properties of the connected registry with its parent.
 */
@Fluent
public final class SyncProperties implements JsonSerializable<SyncProperties> {
    /*
     * The resource ID of the ACR token used to authenticate the connected registry to its parent during sync.
     */
    private String tokenId;

    /*
     * The cron expression indicating the schedule that the connected registry will sync with its parent.
     */
    private String schedule;

    /*
     * The time window during which sync is enabled for each schedule occurrence. Specify the duration using the format
     * P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     */
    private Duration syncWindow;

    /*
     * The period of time for which a message is available to sync before it is expired. Specify the duration using the
     * format P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     */
    private Duration messageTtl;

    /*
     * The last time a sync occurred between the connected registry and its parent.
     */
    private OffsetDateTime lastSyncTime;

    /*
     * The gateway endpoint used by the connected registry to communicate with its parent.
     */
    private String gatewayEndpoint;

    /**
     * Creates an instance of SyncProperties class.
     */
    public SyncProperties() {
    }

    /**
     * Get the tokenId property: The resource ID of the ACR token used to authenticate the connected registry to its
     * parent during sync.
     * 
     * @return the tokenId value.
     */
    public String tokenId() {
        return this.tokenId;
    }

    /**
     * Set the tokenId property: The resource ID of the ACR token used to authenticate the connected registry to its
     * parent during sync.
     * 
     * @param tokenId the tokenId value to set.
     * @return the SyncProperties object itself.
     */
    public SyncProperties withTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    /**
     * Get the schedule property: The cron expression indicating the schedule that the connected registry will sync with
     * its parent.
     * 
     * @return the schedule value.
     */
    public String schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: The cron expression indicating the schedule that the connected registry will sync with
     * its parent.
     * 
     * @param schedule the schedule value to set.
     * @return the SyncProperties object itself.
     */
    public SyncProperties withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the syncWindow property: The time window during which sync is enabled for each schedule occurrence. Specify
     * the duration using the format P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     * 
     * @return the syncWindow value.
     */
    public Duration syncWindow() {
        return this.syncWindow;
    }

    /**
     * Set the syncWindow property: The time window during which sync is enabled for each schedule occurrence. Specify
     * the duration using the format P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     * 
     * @param syncWindow the syncWindow value to set.
     * @return the SyncProperties object itself.
     */
    public SyncProperties withSyncWindow(Duration syncWindow) {
        this.syncWindow = syncWindow;
        return this;
    }

    /**
     * Get the messageTtl property: The period of time for which a message is available to sync before it is expired.
     * Specify the duration using the format P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     * 
     * @return the messageTtl value.
     */
    public Duration messageTtl() {
        return this.messageTtl;
    }

    /**
     * Set the messageTtl property: The period of time for which a message is available to sync before it is expired.
     * Specify the duration using the format P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     * 
     * @param messageTtl the messageTtl value to set.
     * @return the SyncProperties object itself.
     */
    public SyncProperties withMessageTtl(Duration messageTtl) {
        this.messageTtl = messageTtl;
        return this;
    }

    /**
     * Get the lastSyncTime property: The last time a sync occurred between the connected registry and its parent.
     * 
     * @return the lastSyncTime value.
     */
    public OffsetDateTime lastSyncTime() {
        return this.lastSyncTime;
    }

    /**
     * Get the gatewayEndpoint property: The gateway endpoint used by the connected registry to communicate with its
     * parent.
     * 
     * @return the gatewayEndpoint value.
     */
    public String gatewayEndpoint() {
        return this.gatewayEndpoint;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tokenId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property tokenId in model SyncProperties"));
        }
        if (messageTtl() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property messageTtl in model SyncProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SyncProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("tokenId", this.tokenId);
        jsonWriter.writeStringField("messageTtl", CoreUtils.durationToStringWithDays(this.messageTtl));
        jsonWriter.writeStringField("schedule", this.schedule);
        jsonWriter.writeStringField("syncWindow", CoreUtils.durationToStringWithDays(this.syncWindow));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SyncProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SyncProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SyncProperties.
     */
    public static SyncProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SyncProperties deserializedSyncProperties = new SyncProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tokenId".equals(fieldName)) {
                    deserializedSyncProperties.tokenId = reader.getString();
                } else if ("messageTtl".equals(fieldName)) {
                    deserializedSyncProperties.messageTtl
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("schedule".equals(fieldName)) {
                    deserializedSyncProperties.schedule = reader.getString();
                } else if ("syncWindow".equals(fieldName)) {
                    deserializedSyncProperties.syncWindow
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("lastSyncTime".equals(fieldName)) {
                    deserializedSyncProperties.lastSyncTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("gatewayEndpoint".equals(fieldName)) {
                    deserializedSyncProperties.gatewayEndpoint = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSyncProperties;
        });
    }
}
