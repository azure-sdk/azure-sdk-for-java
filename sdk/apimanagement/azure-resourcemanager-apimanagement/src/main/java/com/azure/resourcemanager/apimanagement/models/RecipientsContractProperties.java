// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Notification Parameter contract.
 */
@Fluent
public final class RecipientsContractProperties implements JsonSerializable<RecipientsContractProperties> {
    /*
     * List of Emails subscribed for the notification.
     */
    private List<String> emails;

    /*
     * List of Users subscribed for the notification.
     */
    private List<String> users;

    /**
     * Creates an instance of RecipientsContractProperties class.
     */
    public RecipientsContractProperties() {
    }

    /**
     * Get the emails property: List of Emails subscribed for the notification.
     * 
     * @return the emails value.
     */
    public List<String> emails() {
        return this.emails;
    }

    /**
     * Set the emails property: List of Emails subscribed for the notification.
     * 
     * @param emails the emails value to set.
     * @return the RecipientsContractProperties object itself.
     */
    public RecipientsContractProperties withEmails(List<String> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Get the users property: List of Users subscribed for the notification.
     * 
     * @return the users value.
     */
    public List<String> users() {
        return this.users;
    }

    /**
     * Set the users property: List of Users subscribed for the notification.
     * 
     * @param users the users value to set.
     * @return the RecipientsContractProperties object itself.
     */
    public RecipientsContractProperties withUsers(List<String> users) {
        this.users = users;
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
        jsonWriter.writeArrayField("emails", this.emails, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("users", this.users, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RecipientsContractProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RecipientsContractProperties if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RecipientsContractProperties.
     */
    public static RecipientsContractProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RecipientsContractProperties deserializedRecipientsContractProperties = new RecipientsContractProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("emails".equals(fieldName)) {
                    List<String> emails = reader.readArray(reader1 -> reader1.getString());
                    deserializedRecipientsContractProperties.emails = emails;
                } else if ("users".equals(fieldName)) {
                    List<String> users = reader.readArray(reader1 -> reader1.getString());
                    deserializedRecipientsContractProperties.users = users;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRecipientsContractProperties;
        });
    }
}
