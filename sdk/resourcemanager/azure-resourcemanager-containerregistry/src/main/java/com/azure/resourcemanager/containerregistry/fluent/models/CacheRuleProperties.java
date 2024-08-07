// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The properties of a cache rule.
 */
@Fluent
public final class CacheRuleProperties implements JsonSerializable<CacheRuleProperties> {
    /*
     * The ARM resource ID of the credential store which is associated with the cache rule.
     */
    private String credentialSetResourceId;

    /*
     * Source repository pulled from upstream.
     */
    private String sourceRepository;

    /*
     * Target repository specified in docker pull command.
     * Eg: docker pull myregistry.azurecr.io/{targetRepository}:{tag}
     */
    private String targetRepository;

    /*
     * The creation date of the cache rule.
     */
    private OffsetDateTime creationDate;

    /*
     * Provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of CacheRuleProperties class.
     */
    public CacheRuleProperties() {
    }

    /**
     * Get the credentialSetResourceId property: The ARM resource ID of the credential store which is associated with
     * the cache rule.
     * 
     * @return the credentialSetResourceId value.
     */
    public String credentialSetResourceId() {
        return this.credentialSetResourceId;
    }

    /**
     * Set the credentialSetResourceId property: The ARM resource ID of the credential store which is associated with
     * the cache rule.
     * 
     * @param credentialSetResourceId the credentialSetResourceId value to set.
     * @return the CacheRuleProperties object itself.
     */
    public CacheRuleProperties withCredentialSetResourceId(String credentialSetResourceId) {
        this.credentialSetResourceId = credentialSetResourceId;
        return this;
    }

    /**
     * Get the sourceRepository property: Source repository pulled from upstream.
     * 
     * @return the sourceRepository value.
     */
    public String sourceRepository() {
        return this.sourceRepository;
    }

    /**
     * Set the sourceRepository property: Source repository pulled from upstream.
     * 
     * @param sourceRepository the sourceRepository value to set.
     * @return the CacheRuleProperties object itself.
     */
    public CacheRuleProperties withSourceRepository(String sourceRepository) {
        this.sourceRepository = sourceRepository;
        return this;
    }

    /**
     * Get the targetRepository property: Target repository specified in docker pull command.
     * Eg: docker pull myregistry.azurecr.io/{targetRepository}:{tag}.
     * 
     * @return the targetRepository value.
     */
    public String targetRepository() {
        return this.targetRepository;
    }

    /**
     * Set the targetRepository property: Target repository specified in docker pull command.
     * Eg: docker pull myregistry.azurecr.io/{targetRepository}:{tag}.
     * 
     * @param targetRepository the targetRepository value to set.
     * @return the CacheRuleProperties object itself.
     */
    public CacheRuleProperties withTargetRepository(String targetRepository) {
        this.targetRepository = targetRepository;
        return this;
    }

    /**
     * Get the creationDate property: The creation date of the cache rule.
     * 
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
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
        jsonWriter.writeStringField("credentialSetResourceId", this.credentialSetResourceId);
        jsonWriter.writeStringField("sourceRepository", this.sourceRepository);
        jsonWriter.writeStringField("targetRepository", this.targetRepository);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CacheRuleProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CacheRuleProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CacheRuleProperties.
     */
    public static CacheRuleProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CacheRuleProperties deserializedCacheRuleProperties = new CacheRuleProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("credentialSetResourceId".equals(fieldName)) {
                    deserializedCacheRuleProperties.credentialSetResourceId = reader.getString();
                } else if ("sourceRepository".equals(fieldName)) {
                    deserializedCacheRuleProperties.sourceRepository = reader.getString();
                } else if ("targetRepository".equals(fieldName)) {
                    deserializedCacheRuleProperties.targetRepository = reader.getString();
                } else if ("creationDate".equals(fieldName)) {
                    deserializedCacheRuleProperties.creationDate = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedCacheRuleProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCacheRuleProperties;
        });
    }
}
