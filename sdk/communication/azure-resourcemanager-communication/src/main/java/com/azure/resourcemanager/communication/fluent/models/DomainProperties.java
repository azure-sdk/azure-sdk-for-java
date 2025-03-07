// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.communication.models.DomainManagement;
import com.azure.resourcemanager.communication.models.DomainPropertiesVerificationRecords;
import com.azure.resourcemanager.communication.models.DomainPropertiesVerificationStates;
import com.azure.resourcemanager.communication.models.DomainsProvisioningState;
import com.azure.resourcemanager.communication.models.UserEngagementTracking;
import java.io.IOException;

/**
 * A class that describes the properties of a Domains resource.
 */
@Fluent
public final class DomainProperties implements JsonSerializable<DomainProperties> {
    /*
     * Provisioning state of the resource.
     */
    private DomainsProvisioningState provisioningState;

    /*
     * The location where the Domains resource data is stored at rest.
     */
    private String dataLocation;

    /*
     * P2 sender domain that is displayed to the email recipients [RFC 5322].
     */
    private String fromSenderDomain;

    /*
     * P1 sender domain that is present on the email envelope [RFC 5321].
     */
    private String mailFromSenderDomain;

    /*
     * Describes how a Domains resource is being managed.
     */
    private DomainManagement domainManagement;

    /*
     * List of VerificationStatusRecord
     */
    private DomainPropertiesVerificationStates verificationStates;

    /*
     * List of DnsRecord
     */
    private DomainPropertiesVerificationRecords verificationRecords;

    /*
     * Describes whether user engagement tracking is enabled or disabled.
     */
    private UserEngagementTracking userEngagementTracking;

    /**
     * Creates an instance of DomainProperties class.
     */
    public DomainProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public DomainsProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the dataLocation property: The location where the Domains resource data is stored at rest.
     * 
     * @return the dataLocation value.
     */
    public String dataLocation() {
        return this.dataLocation;
    }

    /**
     * Get the fromSenderDomain property: P2 sender domain that is displayed to the email recipients [RFC 5322].
     * 
     * @return the fromSenderDomain value.
     */
    public String fromSenderDomain() {
        return this.fromSenderDomain;
    }

    /**
     * Get the mailFromSenderDomain property: P1 sender domain that is present on the email envelope [RFC 5321].
     * 
     * @return the mailFromSenderDomain value.
     */
    public String mailFromSenderDomain() {
        return this.mailFromSenderDomain;
    }

    /**
     * Get the domainManagement property: Describes how a Domains resource is being managed.
     * 
     * @return the domainManagement value.
     */
    public DomainManagement domainManagement() {
        return this.domainManagement;
    }

    /**
     * Set the domainManagement property: Describes how a Domains resource is being managed.
     * 
     * @param domainManagement the domainManagement value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withDomainManagement(DomainManagement domainManagement) {
        this.domainManagement = domainManagement;
        return this;
    }

    /**
     * Get the verificationStates property: List of VerificationStatusRecord.
     * 
     * @return the verificationStates value.
     */
    public DomainPropertiesVerificationStates verificationStates() {
        return this.verificationStates;
    }

    /**
     * Get the verificationRecords property: List of DnsRecord.
     * 
     * @return the verificationRecords value.
     */
    public DomainPropertiesVerificationRecords verificationRecords() {
        return this.verificationRecords;
    }

    /**
     * Get the userEngagementTracking property: Describes whether user engagement tracking is enabled or disabled.
     * 
     * @return the userEngagementTracking value.
     */
    public UserEngagementTracking userEngagementTracking() {
        return this.userEngagementTracking;
    }

    /**
     * Set the userEngagementTracking property: Describes whether user engagement tracking is enabled or disabled.
     * 
     * @param userEngagementTracking the userEngagementTracking value to set.
     * @return the DomainProperties object itself.
     */
    public DomainProperties withUserEngagementTracking(UserEngagementTracking userEngagementTracking) {
        this.userEngagementTracking = userEngagementTracking;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (domainManagement() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property domainManagement in model DomainProperties"));
        }
        if (verificationStates() != null) {
            verificationStates().validate();
        }
        if (verificationRecords() != null) {
            verificationRecords().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DomainProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("domainManagement",
            this.domainManagement == null ? null : this.domainManagement.toString());
        jsonWriter.writeStringField("userEngagementTracking",
            this.userEngagementTracking == null ? null : this.userEngagementTracking.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DomainProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DomainProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DomainProperties.
     */
    public static DomainProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DomainProperties deserializedDomainProperties = new DomainProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("domainManagement".equals(fieldName)) {
                    deserializedDomainProperties.domainManagement = DomainManagement.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedDomainProperties.provisioningState
                        = DomainsProvisioningState.fromString(reader.getString());
                } else if ("dataLocation".equals(fieldName)) {
                    deserializedDomainProperties.dataLocation = reader.getString();
                } else if ("fromSenderDomain".equals(fieldName)) {
                    deserializedDomainProperties.fromSenderDomain = reader.getString();
                } else if ("mailFromSenderDomain".equals(fieldName)) {
                    deserializedDomainProperties.mailFromSenderDomain = reader.getString();
                } else if ("verificationStates".equals(fieldName)) {
                    deserializedDomainProperties.verificationStates
                        = DomainPropertiesVerificationStates.fromJson(reader);
                } else if ("verificationRecords".equals(fieldName)) {
                    deserializedDomainProperties.verificationRecords
                        = DomainPropertiesVerificationRecords.fromJson(reader);
                } else if ("userEngagementTracking".equals(fieldName)) {
                    deserializedDomainProperties.userEngagementTracking
                        = UserEngagementTracking.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDomainProperties;
        });
    }
}
