// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.UUID;

/** Azure Active Directory identity configuration for a resource. */
@Fluent
public class DatabaseIdentity {
    /*
     * The identity type
     */
    @JsonProperty(value = "type")
    private DatabaseIdentityType type;

    /*
     * The Azure Active Directory tenant id.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /*
     * The resource ids of the user assigned identities to use
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, DatabaseUserIdentity> userAssignedIdentities;

    /** Creates an instance of DatabaseIdentity class. */
    public DatabaseIdentity() {
    }

    /**
     * Get the type property: The identity type.
     *
     * @return the type value.
     */
    public DatabaseIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The identity type.
     *
     * @param type the type value to set.
     * @return the DatabaseIdentity object itself.
     */
    public DatabaseIdentity withType(DatabaseIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the tenantId property: The Azure Active Directory tenant id.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Get the userAssignedIdentities property: The resource ids of the user assigned identities to use.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, DatabaseUserIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The resource ids of the user assigned identities to use.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the DatabaseIdentity object itself.
     */
    public DatabaseIdentity withUserAssignedIdentities(Map<String, DatabaseUserIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
