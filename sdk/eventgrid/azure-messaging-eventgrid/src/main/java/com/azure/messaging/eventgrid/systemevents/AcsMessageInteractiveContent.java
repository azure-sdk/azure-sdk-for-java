// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Message Interactive Content.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Fluent
@Deprecated
public final class AcsMessageInteractiveContent implements JsonSerializable<AcsMessageInteractiveContent> {

    /*
     * The Message interactive reply type
     */
    @Generated
    private AcsInteractiveReplyKind replyKind;

    /*
     * The Message Sent when a customer clicks a button
     */
    @Generated
    private AcsMessageInteractiveButtonReplyContent buttonReply;

    /*
     * The Message Sent when a customer selects an item from a list
     */
    @Generated
    private AcsMessageInteractiveListReplyContent listReply;

    /**
     * Creates an instance of AcsMessageInteractiveContent class.
     */
    @Generated
    public AcsMessageInteractiveContent() {
    }

    /**
     * Get the replyKind property: The Message interactive reply type.
     *
     * @return the replyKind value.
     */
    @Generated
    public AcsInteractiveReplyKind getReplyKind() {
        return this.replyKind;
    }

    /**
     * Set the replyKind property: The Message interactive reply type.
     *
     * @param replyKind the replyKind value to set.
     * @return the AcsMessageInteractiveContent object itself.
     */
    @Generated
    public AcsMessageInteractiveContent setReplyKind(AcsInteractiveReplyKind replyKind) {
        this.replyKind = replyKind;
        return this;
    }

    /**
     * Get the buttonReply property: The Message Sent when a customer clicks a button.
     *
     * @return the buttonReply value.
     */
    @Generated
    public AcsMessageInteractiveButtonReplyContent getButtonReply() {
        return this.buttonReply;
    }

    /**
     * Set the buttonReply property: The Message Sent when a customer clicks a button.
     *
     * @param buttonReply the buttonReply value to set.
     * @return the AcsMessageInteractiveContent object itself.
     */
    @Generated
    public AcsMessageInteractiveContent setButtonReply(AcsMessageInteractiveButtonReplyContent buttonReply) {
        this.buttonReply = buttonReply;
        return this;
    }

    /**
     * Get the listReply property: The Message Sent when a customer selects an item from a list.
     *
     * @return the listReply value.
     */
    @Generated
    public AcsMessageInteractiveListReplyContent getListReply() {
        return this.listReply;
    }

    /**
     * Set the listReply property: The Message Sent when a customer selects an item from a list.
     *
     * @param listReply the listReply value to set.
     * @return the AcsMessageInteractiveContent object itself.
     */
    @Generated
    public AcsMessageInteractiveContent setListReply(AcsMessageInteractiveListReplyContent listReply) {
        this.listReply = listReply;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.replyKind == null ? null : this.replyKind.toString());
        jsonWriter.writeJsonField("buttonReply", this.buttonReply);
        jsonWriter.writeJsonField("listReply", this.listReply);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsMessageInteractiveContent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsMessageInteractiveContent if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcsMessageInteractiveContent.
     */
    @Generated
    public static AcsMessageInteractiveContent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcsMessageInteractiveContent deserializedAcsMessageInteractiveContent = new AcsMessageInteractiveContent();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedAcsMessageInteractiveContent.replyKind
                        = AcsInteractiveReplyKind.fromString(reader.getString());
                } else if ("buttonReply".equals(fieldName)) {
                    deserializedAcsMessageInteractiveContent.buttonReply
                        = AcsMessageInteractiveButtonReplyContent.fromJson(reader);
                } else if ("listReply".equals(fieldName)) {
                    deserializedAcsMessageInteractiveContent.listReply
                        = AcsMessageInteractiveListReplyContent.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAcsMessageInteractiveContent;
        });
    }
}
