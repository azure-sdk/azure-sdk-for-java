// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Artifact profile properties.
 */
@Fluent
public final class NsdArtifactProfile {
    /*
     * The artifact store resource id
     */
    @JsonProperty(value = "artifactStoreReference")
    private ReferencedResource artifactStoreReference;

    /*
     * Artifact name.
     */
    @JsonProperty(value = "artifactName")
    private String artifactName;

    /*
     * Artifact version.
     */
    @JsonProperty(value = "artifactVersion")
    private String artifactVersion;

    /**
     * Creates an instance of NsdArtifactProfile class.
     */
    public NsdArtifactProfile() {
    }

    /**
     * Get the artifactStoreReference property: The artifact store resource id.
     * 
     * @return the artifactStoreReference value.
     */
    public ReferencedResource artifactStoreReference() {
        return this.artifactStoreReference;
    }

    /**
     * Set the artifactStoreReference property: The artifact store resource id.
     * 
     * @param artifactStoreReference the artifactStoreReference value to set.
     * @return the NsdArtifactProfile object itself.
     */
    public NsdArtifactProfile withArtifactStoreReference(ReferencedResource artifactStoreReference) {
        this.artifactStoreReference = artifactStoreReference;
        return this;
    }

    /**
     * Get the artifactName property: Artifact name.
     * 
     * @return the artifactName value.
     */
    public String artifactName() {
        return this.artifactName;
    }

    /**
     * Set the artifactName property: Artifact name.
     * 
     * @param artifactName the artifactName value to set.
     * @return the NsdArtifactProfile object itself.
     */
    public NsdArtifactProfile withArtifactName(String artifactName) {
        this.artifactName = artifactName;
        return this;
    }

    /**
     * Get the artifactVersion property: Artifact version.
     * 
     * @return the artifactVersion value.
     */
    public String artifactVersion() {
        return this.artifactVersion;
    }

    /**
     * Set the artifactVersion property: Artifact version.
     * 
     * @param artifactVersion the artifactVersion value to set.
     * @return the NsdArtifactProfile object itself.
     */
    public NsdArtifactProfile withArtifactVersion(String artifactVersion) {
        this.artifactVersion = artifactVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (artifactStoreReference() != null) {
            artifactStoreReference().validate();
        }
    }
}
