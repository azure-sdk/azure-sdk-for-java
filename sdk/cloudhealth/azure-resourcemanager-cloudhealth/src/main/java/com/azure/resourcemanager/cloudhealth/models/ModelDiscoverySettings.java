// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.cloudhealth.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Settings for automatically discovering entities for the health model.
 */
@Fluent
public final class ModelDiscoverySettings implements JsonSerializable<ModelDiscoverySettings> {
    /*
     * The scope from which entities should be automatically discovered. For example, the resource id of a Service
     * Group.
     */
    private String scope;

    /*
     * Whether to add all recommended signals to the discovered entities.
     */
    private DiscoveryRuleRecommendedSignalsBehavior addRecommendedSignals;

    /*
     * Which Managed Identity of the health model to use for discovery. Defaults to SystemAssigned, if not set. Can be
     * set to 'SystemAssigned' or to the resource id of a user-assigned managed identity which is linked to the health
     * model.
     */
    private String identity;

    /**
     * Creates an instance of ModelDiscoverySettings class.
     */
    public ModelDiscoverySettings() {
    }

    /**
     * Get the scope property: The scope from which entities should be automatically discovered. For example, the
     * resource id of a Service Group.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope from which entities should be automatically discovered. For example, the
     * resource id of a Service Group.
     * 
     * @param scope the scope value to set.
     * @return the ModelDiscoverySettings object itself.
     */
    public ModelDiscoverySettings withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the addRecommendedSignals property: Whether to add all recommended signals to the discovered entities.
     * 
     * @return the addRecommendedSignals value.
     */
    public DiscoveryRuleRecommendedSignalsBehavior addRecommendedSignals() {
        return this.addRecommendedSignals;
    }

    /**
     * Set the addRecommendedSignals property: Whether to add all recommended signals to the discovered entities.
     * 
     * @param addRecommendedSignals the addRecommendedSignals value to set.
     * @return the ModelDiscoverySettings object itself.
     */
    public ModelDiscoverySettings
        withAddRecommendedSignals(DiscoveryRuleRecommendedSignalsBehavior addRecommendedSignals) {
        this.addRecommendedSignals = addRecommendedSignals;
        return this;
    }

    /**
     * Get the identity property: Which Managed Identity of the health model to use for discovery. Defaults to
     * SystemAssigned, if not set. Can be set to 'SystemAssigned' or to the resource id of a user-assigned managed
     * identity which is linked to the health model.
     * 
     * @return the identity value.
     */
    public String identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Which Managed Identity of the health model to use for discovery. Defaults to
     * SystemAssigned, if not set. Can be set to 'SystemAssigned' or to the resource id of a user-assigned managed
     * identity which is linked to the health model.
     * 
     * @param identity the identity value to set.
     * @return the ModelDiscoverySettings object itself.
     */
    public ModelDiscoverySettings withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scope() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property scope in model ModelDiscoverySettings"));
        }
        if (addRecommendedSignals() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property addRecommendedSignals in model ModelDiscoverySettings"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ModelDiscoverySettings.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeStringField("addRecommendedSignals",
            this.addRecommendedSignals == null ? null : this.addRecommendedSignals.toString());
        jsonWriter.writeStringField("identity", this.identity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ModelDiscoverySettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ModelDiscoverySettings if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ModelDiscoverySettings.
     */
    public static ModelDiscoverySettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ModelDiscoverySettings deserializedModelDiscoverySettings = new ModelDiscoverySettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("scope".equals(fieldName)) {
                    deserializedModelDiscoverySettings.scope = reader.getString();
                } else if ("addRecommendedSignals".equals(fieldName)) {
                    deserializedModelDiscoverySettings.addRecommendedSignals
                        = DiscoveryRuleRecommendedSignalsBehavior.fromString(reader.getString());
                } else if ("identity".equals(fieldName)) {
                    deserializedModelDiscoverySettings.identity = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedModelDiscoverySettings;
        });
    }
}
