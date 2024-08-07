// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Custom domain of app resource payload.
 */
@Fluent
public final class CustomDomainProperties implements JsonSerializable<CustomDomainProperties> {
    /*
     * The thumbprint of bound certificate.
     */
    private String thumbprint;

    /*
     * The app name of domain.
     */
    private String appName;

    /*
     * The bound certificate name of domain.
     */
    private String certName;

    /*
     * Provisioning state of the Domain
     */
    private CustomDomainResourceProvisioningState provisioningState;

    /**
     * Creates an instance of CustomDomainProperties class.
     */
    public CustomDomainProperties() {
    }

    /**
     * Get the thumbprint property: The thumbprint of bound certificate.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: The thumbprint of bound certificate.
     * 
     * @param thumbprint the thumbprint value to set.
     * @return the CustomDomainProperties object itself.
     */
    public CustomDomainProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the appName property: The app name of domain.
     * 
     * @return the appName value.
     */
    public String appName() {
        return this.appName;
    }

    /**
     * Get the certName property: The bound certificate name of domain.
     * 
     * @return the certName value.
     */
    public String certName() {
        return this.certName;
    }

    /**
     * Set the certName property: The bound certificate name of domain.
     * 
     * @param certName the certName value to set.
     * @return the CustomDomainProperties object itself.
     */
    public CustomDomainProperties withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Domain.
     * 
     * @return the provisioningState value.
     */
    public CustomDomainResourceProvisioningState provisioningState() {
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
        jsonWriter.writeStringField("thumbprint", this.thumbprint);
        jsonWriter.writeStringField("certName", this.certName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomDomainProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomDomainProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the CustomDomainProperties.
     */
    public static CustomDomainProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomDomainProperties deserializedCustomDomainProperties = new CustomDomainProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("thumbprint".equals(fieldName)) {
                    deserializedCustomDomainProperties.thumbprint = reader.getString();
                } else if ("appName".equals(fieldName)) {
                    deserializedCustomDomainProperties.appName = reader.getString();
                } else if ("certName".equals(fieldName)) {
                    deserializedCustomDomainProperties.certName = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedCustomDomainProperties.provisioningState
                        = CustomDomainResourceProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomDomainProperties;
        });
    }
}
