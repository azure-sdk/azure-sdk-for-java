// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UE Location Info properties.
 */
@Fluent
public final class UeLocationInfo {
    /*
     * Location Type
     */
    @JsonProperty(value = "locationType", required = true)
    private String locationType;

    /*
     * Type Allocation Code of UE
     */
    @JsonProperty(value = "tac", required = true)
    private String tac;

    /*
     * PLMN Identifier
     */
    @JsonProperty(value = "plmn", required = true)
    private PlmnId plmn;

    /**
     * Creates an instance of UeLocationInfo class.
     */
    public UeLocationInfo() {
    }

    /**
     * Get the locationType property: Location Type.
     * 
     * @return the locationType value.
     */
    public String locationType() {
        return this.locationType;
    }

    /**
     * Set the locationType property: Location Type.
     * 
     * @param locationType the locationType value to set.
     * @return the UeLocationInfo object itself.
     */
    public UeLocationInfo withLocationType(String locationType) {
        this.locationType = locationType;
        return this;
    }

    /**
     * Get the tac property: Type Allocation Code of UE.
     * 
     * @return the tac value.
     */
    public String tac() {
        return this.tac;
    }

    /**
     * Set the tac property: Type Allocation Code of UE.
     * 
     * @param tac the tac value to set.
     * @return the UeLocationInfo object itself.
     */
    public UeLocationInfo withTac(String tac) {
        this.tac = tac;
        return this;
    }

    /**
     * Get the plmn property: PLMN Identifier.
     * 
     * @return the plmn value.
     */
    public PlmnId plmn() {
        return this.plmn;
    }

    /**
     * Set the plmn property: PLMN Identifier.
     * 
     * @param plmn the plmn value to set.
     * @return the UeLocationInfo object itself.
     */
    public UeLocationInfo withPlmn(PlmnId plmn) {
        this.plmn = plmn;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (locationType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property locationType in model UeLocationInfo"));
        }
        if (tac() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property tac in model UeLocationInfo"));
        }
        if (plmn() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property plmn in model UeLocationInfo"));
        } else {
            plmn().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UeLocationInfo.class);
}
