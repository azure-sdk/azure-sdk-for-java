// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.fluent.models.ResolverUpdateContractProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** GraphQL API Resolver Update Contract details. */
@Fluent
public final class ResolverUpdateContract {
    /*
     * Properties of the GraphQL API Resolver entity that can be updated.
     */
    @JsonProperty(value = "properties")
    private ResolverUpdateContractProperties innerProperties;

    /** Creates an instance of ResolverUpdateContract class. */
    public ResolverUpdateContract() {
    }

    /**
     * Get the innerProperties property: Properties of the GraphQL API Resolver entity that can be updated.
     *
     * @return the innerProperties value.
     */
    private ResolverUpdateContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: Resolver Name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Resolver Name.
     *
     * @param displayName the displayName value to set.
     * @return the ResolverUpdateContract object itself.
     */
    public ResolverUpdateContract withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ResolverUpdateContractProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the path property: Path is type/field being resolved.
     *
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Set the path property: Path is type/field being resolved.
     *
     * @param path the path value to set.
     * @return the ResolverUpdateContract object itself.
     */
    public ResolverUpdateContract withPath(String path) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ResolverUpdateContractProperties();
        }
        this.innerProperties().withPath(path);
        return this;
    }

    /**
     * Get the description property: Description of the resolver. May include HTML formatting tags.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Description of the resolver. May include HTML formatting tags.
     *
     * @param description the description value to set.
     * @return the ResolverUpdateContract object itself.
     */
    public ResolverUpdateContract withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ResolverUpdateContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
