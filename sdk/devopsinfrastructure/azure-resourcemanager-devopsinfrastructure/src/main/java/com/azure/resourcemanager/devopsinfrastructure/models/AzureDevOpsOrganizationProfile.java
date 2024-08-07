// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.devopsinfrastructure.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Azure DevOps organization profile.
 */
@Fluent
public final class AzureDevOpsOrganizationProfile extends OrganizationProfile {
    /*
     * Discriminator property for OrganizationProfile.
     */
    private String kind = "AzureDevOps";

    /*
     * The list of Azure DevOps organizations the pool should be present in.
     */
    private List<Organization> organizations;

    /*
     * The type of permission which determines which accounts are admins on the Azure DevOps pool.
     */
    private AzureDevOpsPermissionProfile permissionProfile;

    /**
     * Creates an instance of AzureDevOpsOrganizationProfile class.
     */
    public AzureDevOpsOrganizationProfile() {
    }

    /**
     * Get the kind property: Discriminator property for OrganizationProfile.
     * 
     * @return the kind value.
     */
    @Override
    public String kind() {
        return this.kind;
    }

    /**
     * Get the organizations property: The list of Azure DevOps organizations the pool should be present in.
     * 
     * @return the organizations value.
     */
    public List<Organization> organizations() {
        return this.organizations;
    }

    /**
     * Set the organizations property: The list of Azure DevOps organizations the pool should be present in.
     * 
     * @param organizations the organizations value to set.
     * @return the AzureDevOpsOrganizationProfile object itself.
     */
    public AzureDevOpsOrganizationProfile withOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
        return this;
    }

    /**
     * Get the permissionProfile property: The type of permission which determines which accounts are admins on the
     * Azure DevOps pool.
     * 
     * @return the permissionProfile value.
     */
    public AzureDevOpsPermissionProfile permissionProfile() {
        return this.permissionProfile;
    }

    /**
     * Set the permissionProfile property: The type of permission which determines which accounts are admins on the
     * Azure DevOps pool.
     * 
     * @param permissionProfile the permissionProfile value to set.
     * @return the AzureDevOpsOrganizationProfile object itself.
     */
    public AzureDevOpsOrganizationProfile withPermissionProfile(AzureDevOpsPermissionProfile permissionProfile) {
        this.permissionProfile = permissionProfile;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (organizations() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property organizations in model AzureDevOpsOrganizationProfile"));
        } else {
            organizations().forEach(e -> e.validate());
        }
        if (permissionProfile() != null) {
            permissionProfile().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureDevOpsOrganizationProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("organizations", this.organizations, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("kind", this.kind);
        jsonWriter.writeJsonField("permissionProfile", this.permissionProfile);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureDevOpsOrganizationProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureDevOpsOrganizationProfile if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureDevOpsOrganizationProfile.
     */
    public static AzureDevOpsOrganizationProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureDevOpsOrganizationProfile deserializedAzureDevOpsOrganizationProfile
                = new AzureDevOpsOrganizationProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("organizations".equals(fieldName)) {
                    List<Organization> organizations = reader.readArray(reader1 -> Organization.fromJson(reader1));
                    deserializedAzureDevOpsOrganizationProfile.organizations = organizations;
                } else if ("kind".equals(fieldName)) {
                    deserializedAzureDevOpsOrganizationProfile.kind = reader.getString();
                } else if ("permissionProfile".equals(fieldName)) {
                    deserializedAzureDevOpsOrganizationProfile.permissionProfile
                        = AzureDevOpsPermissionProfile.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureDevOpsOrganizationProfile;
        });
    }
}
