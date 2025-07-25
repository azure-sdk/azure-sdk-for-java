// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Client authentication settings for namespace resource.
 */
@Fluent
public final class ClientAuthenticationSettings implements JsonSerializable<ClientAuthenticationSettings> {
    /*
     * Alternative authentication name sources related to client authentication settings for namespace resource.
     */
    private List<AlternativeAuthenticationNameSource> alternativeAuthenticationNameSources;

    /*
     * Custom JWT authentication settings for namespace resource.
     */
    private CustomJwtAuthenticationSettings customJwtAuthentication;

    /*
     * Authentication settings for a webhook endpoint within a Namespace resource.
     */
    private WebhookAuthenticationSettings webhookAuthentication;

    /**
     * Creates an instance of ClientAuthenticationSettings class.
     */
    public ClientAuthenticationSettings() {
    }

    /**
     * Get the alternativeAuthenticationNameSources property: Alternative authentication name sources related to client
     * authentication settings for namespace resource.
     * 
     * @return the alternativeAuthenticationNameSources value.
     */
    public List<AlternativeAuthenticationNameSource> alternativeAuthenticationNameSources() {
        return this.alternativeAuthenticationNameSources;
    }

    /**
     * Set the alternativeAuthenticationNameSources property: Alternative authentication name sources related to client
     * authentication settings for namespace resource.
     * 
     * @param alternativeAuthenticationNameSources the alternativeAuthenticationNameSources value to set.
     * @return the ClientAuthenticationSettings object itself.
     */
    public ClientAuthenticationSettings withAlternativeAuthenticationNameSources(
        List<AlternativeAuthenticationNameSource> alternativeAuthenticationNameSources) {
        this.alternativeAuthenticationNameSources = alternativeAuthenticationNameSources;
        return this;
    }

    /**
     * Get the customJwtAuthentication property: Custom JWT authentication settings for namespace resource.
     * 
     * @return the customJwtAuthentication value.
     */
    public CustomJwtAuthenticationSettings customJwtAuthentication() {
        return this.customJwtAuthentication;
    }

    /**
     * Set the customJwtAuthentication property: Custom JWT authentication settings for namespace resource.
     * 
     * @param customJwtAuthentication the customJwtAuthentication value to set.
     * @return the ClientAuthenticationSettings object itself.
     */
    public ClientAuthenticationSettings
        withCustomJwtAuthentication(CustomJwtAuthenticationSettings customJwtAuthentication) {
        this.customJwtAuthentication = customJwtAuthentication;
        return this;
    }

    /**
     * Get the webhookAuthentication property: Authentication settings for a webhook endpoint within a Namespace
     * resource.
     * 
     * @return the webhookAuthentication value.
     */
    public WebhookAuthenticationSettings webhookAuthentication() {
        return this.webhookAuthentication;
    }

    /**
     * Set the webhookAuthentication property: Authentication settings for a webhook endpoint within a Namespace
     * resource.
     * 
     * @param webhookAuthentication the webhookAuthentication value to set.
     * @return the ClientAuthenticationSettings object itself.
     */
    public ClientAuthenticationSettings withWebhookAuthentication(WebhookAuthenticationSettings webhookAuthentication) {
        this.webhookAuthentication = webhookAuthentication;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (customJwtAuthentication() != null) {
            customJwtAuthentication().validate();
        }
        if (webhookAuthentication() != null) {
            webhookAuthentication().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("alternativeAuthenticationNameSources", this.alternativeAuthenticationNameSources,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeJsonField("customJwtAuthentication", this.customJwtAuthentication);
        jsonWriter.writeJsonField("webhookAuthentication", this.webhookAuthentication);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClientAuthenticationSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClientAuthenticationSettings if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClientAuthenticationSettings.
     */
    public static ClientAuthenticationSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClientAuthenticationSettings deserializedClientAuthenticationSettings = new ClientAuthenticationSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("alternativeAuthenticationNameSources".equals(fieldName)) {
                    List<AlternativeAuthenticationNameSource> alternativeAuthenticationNameSources = reader
                        .readArray(reader1 -> AlternativeAuthenticationNameSource.fromString(reader1.getString()));
                    deserializedClientAuthenticationSettings.alternativeAuthenticationNameSources
                        = alternativeAuthenticationNameSources;
                } else if ("customJwtAuthentication".equals(fieldName)) {
                    deserializedClientAuthenticationSettings.customJwtAuthentication
                        = CustomJwtAuthenticationSettings.fromJson(reader);
                } else if ("webhookAuthentication".equals(fieldName)) {
                    deserializedClientAuthenticationSettings.webhookAuthentication
                        = WebhookAuthenticationSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClientAuthenticationSettings;
        });
    }
}
