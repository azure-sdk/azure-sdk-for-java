// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.management.exception.ManagementError;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hybridcompute.models.EsuEligibility;
import com.azure.resourcemanager.hybridcompute.models.EsuKey;
import com.azure.resourcemanager.hybridcompute.models.EsuKeyState;
import com.azure.resourcemanager.hybridcompute.models.EsuServerType;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileProductType;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileSubscriptionStatus;
import com.azure.resourcemanager.hybridcompute.models.ProductFeature;
import com.azure.resourcemanager.hybridcompute.models.ProvisioningState;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Describes a license profile in a hybrid machine.
 */
@Fluent
public final class LicenseProfileInner extends Resource {
    /*
     * Describe the properties of a license profile.
     */
    private LicenseProfileProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of LicenseProfileInner class.
     */
    public LicenseProfileInner() {
    }

    /**
     * Get the innerProperties property: Describe the properties of a license profile.
     * 
     * @return the innerProperties value.
     */
    private LicenseProfileProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LicenseProfileInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LicenseProfileInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the softwareAssuranceCustomer property: Specifies if this machine is licensed as part of a Software Assurance
     * agreement.
     * 
     * @return the softwareAssuranceCustomer value.
     */
    public Boolean softwareAssuranceCustomer() {
        return this.innerProperties() == null ? null : this.innerProperties().softwareAssuranceCustomer();
    }

    /**
     * Set the softwareAssuranceCustomer property: Specifies if this machine is licensed as part of a Software Assurance
     * agreement.
     * 
     * @param softwareAssuranceCustomer the softwareAssuranceCustomer value to set.
     * @return the LicenseProfileInner object itself.
     */
    public LicenseProfileInner withSoftwareAssuranceCustomer(Boolean softwareAssuranceCustomer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProfileProperties();
        }
        this.innerProperties().withSoftwareAssuranceCustomer(softwareAssuranceCustomer);
        return this;
    }

    /**
     * Get the assignedLicense property: The resource id of the license.
     * 
     * @return the assignedLicense value.
     */
    public String assignedLicense() {
        return this.innerProperties() == null ? null : this.innerProperties().assignedLicense();
    }

    /**
     * Set the assignedLicense property: The resource id of the license.
     * 
     * @param assignedLicense the assignedLicense value to set.
     * @return the LicenseProfileInner object itself.
     */
    public LicenseProfileInner withAssignedLicense(String assignedLicense) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProfileProperties();
        }
        this.innerProperties().withAssignedLicense(assignedLicense);
        return this;
    }

    /**
     * Get the serverType property: The type of the Esu servers.
     * 
     * @return the serverType value.
     */
    public EsuServerType serverType() {
        return this.innerProperties() == null ? null : this.innerProperties().serverType();
    }

    /**
     * Get the esuEligibility property: Indicates the eligibility state of Esu.
     * 
     * @return the esuEligibility value.
     */
    public EsuEligibility esuEligibility() {
        return this.innerProperties() == null ? null : this.innerProperties().esuEligibility();
    }

    /**
     * Get the esuKeyState property: Indicates whether there is an ESU Key currently active for the machine.
     * 
     * @return the esuKeyState value.
     */
    public EsuKeyState esuKeyState() {
        return this.innerProperties() == null ? null : this.innerProperties().esuKeyState();
    }

    /**
     * Get the assignedLicenseImmutableId property: The guid id of the license.
     * 
     * @return the assignedLicenseImmutableId value.
     */
    public String assignedLicenseImmutableId() {
        return this.innerProperties() == null ? null : this.innerProperties().assignedLicenseImmutableId();
    }

    /**
     * Get the esuKeys property: The list of ESU keys.
     * 
     * @return the esuKeys value.
     */
    public List<EsuKey> esuKeys() {
        return this.innerProperties() == null ? null : this.innerProperties().esuKeys();
    }

    /**
     * Get the subscriptionStatus property: Indicates the subscription status of the product.
     * 
     * @return the subscriptionStatus value.
     */
    public LicenseProfileSubscriptionStatus subscriptionStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionStatus();
    }

    /**
     * Set the subscriptionStatus property: Indicates the subscription status of the product.
     * 
     * @param subscriptionStatus the subscriptionStatus value to set.
     * @return the LicenseProfileInner object itself.
     */
    public LicenseProfileInner withSubscriptionStatus(LicenseProfileSubscriptionStatus subscriptionStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProfileProperties();
        }
        this.innerProperties().withSubscriptionStatus(subscriptionStatus);
        return this;
    }

    /**
     * Get the productType property: Indicates the product type of the license.
     * 
     * @return the productType value.
     */
    public LicenseProfileProductType productType() {
        return this.innerProperties() == null ? null : this.innerProperties().productType();
    }

    /**
     * Set the productType property: Indicates the product type of the license.
     * 
     * @param productType the productType value to set.
     * @return the LicenseProfileInner object itself.
     */
    public LicenseProfileInner withProductType(LicenseProfileProductType productType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProfileProperties();
        }
        this.innerProperties().withProductType(productType);
        return this;
    }

    /**
     * Get the enrollmentDate property: The timestamp in UTC when the user enrolls the feature.
     * 
     * @return the enrollmentDate value.
     */
    public OffsetDateTime enrollmentDate() {
        return this.innerProperties() == null ? null : this.innerProperties().enrollmentDate();
    }

    /**
     * Get the billingStartDate property: The timestamp in UTC when the billing starts.
     * 
     * @return the billingStartDate value.
     */
    public OffsetDateTime billingStartDate() {
        return this.innerProperties() == null ? null : this.innerProperties().billingStartDate();
    }

    /**
     * Get the disenrollmentDate property: The timestamp in UTC when the user disenrolled the feature.
     * 
     * @return the disenrollmentDate value.
     */
    public OffsetDateTime disenrollmentDate() {
        return this.innerProperties() == null ? null : this.innerProperties().disenrollmentDate();
    }

    /**
     * Get the billingEndDate property: The timestamp in UTC when the billing ends.
     * 
     * @return the billingEndDate value.
     */
    public OffsetDateTime billingEndDate() {
        return this.innerProperties() == null ? null : this.innerProperties().billingEndDate();
    }

    /**
     * Get the error property: The errors that were encountered during the feature enrollment or disenrollment.
     * 
     * @return the error value.
     */
    public ManagementError error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
    }

    /**
     * Get the productFeatures property: The list of product features.
     * 
     * @return the productFeatures value.
     */
    public List<ProductFeature> productFeatures() {
        return this.innerProperties() == null ? null : this.innerProperties().productFeatures();
    }

    /**
     * Set the productFeatures property: The list of product features.
     * 
     * @param productFeatures the productFeatures value to set.
     * @return the LicenseProfileInner object itself.
     */
    public LicenseProfileInner withProductFeatures(List<ProductFeature> productFeatures) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProfileProperties();
        }
        this.innerProperties().withProductFeatures(productFeatures);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LicenseProfileInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LicenseProfileInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LicenseProfileInner.
     */
    public static LicenseProfileInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LicenseProfileInner deserializedLicenseProfileInner = new LicenseProfileInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedLicenseProfileInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedLicenseProfileInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedLicenseProfileInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedLicenseProfileInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedLicenseProfileInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedLicenseProfileInner.innerProperties = LicenseProfileProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedLicenseProfileInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLicenseProfileInner;
        });
    }
}
