// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Record of the service account.
 */
@Fluent
public final class ServiceAccountRecord {
    /*
     * Type of account
     */
    @JsonProperty(value = "kind")
    private String kind;

    /*
     * Id of the service account
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Metadata of the record
     */
    @JsonProperty(value = "metadata")
    private MetadataEntity metadata;

    /*
     * Name of the service account
     */
    @JsonProperty(value = "display_name")
    private String displayName;

    /*
     * Description of the service account
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of ServiceAccountRecord class.
     */
    public ServiceAccountRecord() {
    }

    /**
     * Get the kind property: Type of account.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Type of account.
     * 
     * @param kind the kind value to set.
     * @return the ServiceAccountRecord object itself.
     */
    public ServiceAccountRecord withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the id property: Id of the service account.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Id of the service account.
     * 
     * @param id the id value to set.
     * @return the ServiceAccountRecord object itself.
     */
    public ServiceAccountRecord withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the metadata property: Metadata of the record.
     * 
     * @return the metadata value.
     */
    public MetadataEntity metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Metadata of the record.
     * 
     * @param metadata the metadata value to set.
     * @return the ServiceAccountRecord object itself.
     */
    public ServiceAccountRecord withMetadata(MetadataEntity metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the displayName property: Name of the service account.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Name of the service account.
     * 
     * @param displayName the displayName value to set.
     * @return the ServiceAccountRecord object itself.
     */
    public ServiceAccountRecord withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: Description of the service account.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the service account.
     * 
     * @param description the description value to set.
     * @return the ServiceAccountRecord object itself.
     */
    public ServiceAccountRecord withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
    }
}
