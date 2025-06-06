// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.messaging.eventgrid.systemevents.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Schema of common properties of all chat thread events.
 */
@Immutable
public class AcsChatThreadEventBaseProperties extends AcsChatEventBaseProperties {
    /*
     * The original creation time of the thread
     */
    @Generated
    private final OffsetDateTime createTime;

    /*
     * The version of the thread
     */
    @Generated
    private Long version;

    /*
     * The transaction id will be used as co-relation vector
     */
    @Generated
    private String transactionId;

    /**
     * Creates an instance of AcsChatThreadEventBaseProperties class.
     * 
     * @param recipientCommunicationIdentifier the recipientCommunicationIdentifier value to set.
     * @param threadId the threadId value to set.
     * @param createTime the createTime value to set.
     */
    @Generated
    protected AcsChatThreadEventBaseProperties(CommunicationIdentifierModel recipientCommunicationIdentifier,
        String threadId, OffsetDateTime createTime) {
        super(recipientCommunicationIdentifier, threadId);
        this.createTime = createTime;
    }

    /**
     * Get the createTime property: The original creation time of the thread.
     * 
     * @return the createTime value.
     */
    @Generated
    public OffsetDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Get the version property: The version of the thread.
     * 
     * @return the version value.
     */
    @Generated
    public Long getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the thread.
     * 
     * @param version the version value to set.
     * @return the AcsChatThreadEventBaseProperties object itself.
     */
    @Generated
    AcsChatThreadEventBaseProperties setVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * Get the transactionId property: The transaction id will be used as co-relation vector.
     * 
     * @return the transactionId value.
     */
    @Generated
    @Override
    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("recipientCommunicationIdentifier", getRecipientCommunicationIdentifier());
        jsonWriter.writeStringField("threadId", getThreadId());
        jsonWriter.writeStringField("transactionId", getTransactionId());
        jsonWriter.writeStringField("createTime",
            this.createTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createTime));
        jsonWriter.writeNumberField("version", this.version);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsChatThreadEventBaseProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsChatThreadEventBaseProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsChatThreadEventBaseProperties.
     */
    @Generated
    public static AcsChatThreadEventBaseProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CommunicationIdentifierModel recipientCommunicationIdentifier = null;
            String threadId = null;
            String transactionId = null;
            OffsetDateTime createTime = null;
            Long version = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("recipientCommunicationIdentifier".equals(fieldName)) {
                    recipientCommunicationIdentifier = CommunicationIdentifierModel.fromJson(reader);
                } else if ("threadId".equals(fieldName)) {
                    threadId = reader.getString();
                } else if ("transactionId".equals(fieldName)) {
                    transactionId = reader.getString();
                } else if ("createTime".equals(fieldName)) {
                    createTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("version".equals(fieldName)) {
                    version = reader.getNullable(JsonReader::getLong);
                } else {
                    reader.skipChildren();
                }
            }
            AcsChatThreadEventBaseProperties deserializedAcsChatThreadEventBaseProperties
                = new AcsChatThreadEventBaseProperties(recipientCommunicationIdentifier, threadId, createTime);
            deserializedAcsChatThreadEventBaseProperties.transactionId = transactionId;
            deserializedAcsChatThreadEventBaseProperties.version = version;

            return deserializedAcsChatThreadEventBaseProperties;
        });
    }
}
