// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestackhci.models.ClusterDesiredProperties;
import com.azure.resourcemanager.azurestackhci.models.ClusterReportedProperties;
import com.azure.resourcemanager.azurestackhci.models.ConnectivityStatus;
import com.azure.resourcemanager.azurestackhci.models.IsolatedVmAttestationConfiguration;
import com.azure.resourcemanager.azurestackhci.models.LogCollectionProperties;
import com.azure.resourcemanager.azurestackhci.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningState;
import com.azure.resourcemanager.azurestackhci.models.RemoteSupportProperties;
import com.azure.resourcemanager.azurestackhci.models.SoftwareAssuranceProperties;
import com.azure.resourcemanager.azurestackhci.models.Status;
import com.azure.resourcemanager.azurestackhci.models.UserAssignedIdentity;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * Cluster details.
 */
@Fluent
public final class ClusterInner extends Resource {
    /*
     * Identity of Cluster resource
     */
    private ManagedServiceIdentity innerIdentity;

    /*
     * Cluster properties.
     */
    private ClusterProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ClusterInner class.
     */
    public ClusterInner() {
    }

    /**
     * Get the innerIdentity property: Identity of Cluster resource.
     * 
     * @return the innerIdentity value.
     */
    private ManagedServiceIdentity innerIdentity() {
        return this.innerIdentity;
    }

    /**
     * Get the innerProperties property: Cluster properties.
     * 
     * @return the innerProperties value.
     */
    private ClusterProperties innerProperties() {
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
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
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
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the principalId property: The service principal ID of the system assigned identity. This property will only
     * be provided for a system assigned identity.
     * 
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.innerIdentity() == null ? null : this.innerIdentity().principalId();
    }

    /**
     * Get the tenantId property: The tenant ID of the system assigned identity. This property will only be provided for
     * a system assigned identity.
     * 
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.innerIdentity() == null ? null : this.innerIdentity().tenantId();
    }

    /**
     * Get the type property: Type of managed service identity (where both SystemAssigned and UserAssigned types are
     * allowed).
     * 
     * @return the type value.
     */
    public ManagedServiceIdentityType typeIdentityType() {
        return this.innerIdentity() == null ? null : this.innerIdentity().type();
    }

    /**
     * Set the type property: Type of managed service identity (where both SystemAssigned and UserAssigned types are
     * allowed).
     * 
     * @param type the type value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withTypeIdentityType(ManagedServiceIdentityType type) {
        if (this.innerIdentity() == null) {
            this.innerIdentity = new ManagedServiceIdentity();
        }
        this.innerIdentity().withType(type);
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The set of user assigned identities associated with the resource. The
     * userAssignedIdentities dictionary keys will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
     * The dictionary values can be empty objects ({}) in requests.
     * 
     * @return the userAssignedIdentities value.
     */
    public Map<String, UserAssignedIdentity> userAssignedIdentities() {
        return this.innerIdentity() == null ? null : this.innerIdentity().userAssignedIdentities();
    }

    /**
     * Set the userAssignedIdentities property: The set of user assigned identities associated with the resource. The
     * userAssignedIdentities dictionary keys will be ARM resource ids in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}.
     * The dictionary values can be empty objects ({}) in requests.
     * 
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withUserAssignedIdentities(Map<String, UserAssignedIdentity> userAssignedIdentities) {
        if (this.innerIdentity() == null) {
            this.innerIdentity = new ManagedServiceIdentity();
        }
        this.innerIdentity().withUserAssignedIdentities(userAssignedIdentities);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: Status of the cluster agent.
     * 
     * @return the status value.
     */
    public Status status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the connectivityStatus property: Overall connectivity status for the cluster resource.
     * 
     * @return the connectivityStatus value.
     */
    public ConnectivityStatus connectivityStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().connectivityStatus();
    }

    /**
     * Get the cloudId property: Unique, immutable resource id.
     * 
     * @return the cloudId value.
     */
    public String cloudId() {
        return this.innerProperties() == null ? null : this.innerProperties().cloudId();
    }

    /**
     * Get the cloudManagementEndpoint property: Endpoint configured for management from the Azure portal.
     * 
     * @return the cloudManagementEndpoint value.
     */
    public String cloudManagementEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().cloudManagementEndpoint();
    }

    /**
     * Set the cloudManagementEndpoint property: Endpoint configured for management from the Azure portal.
     * 
     * @param cloudManagementEndpoint the cloudManagementEndpoint value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withCloudManagementEndpoint(String cloudManagementEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withCloudManagementEndpoint(cloudManagementEndpoint);
        return this;
    }

    /**
     * Get the aadClientId property: App id of cluster AAD identity.
     * 
     * @return the aadClientId value.
     */
    public String aadClientId() {
        return this.innerProperties() == null ? null : this.innerProperties().aadClientId();
    }

    /**
     * Set the aadClientId property: App id of cluster AAD identity.
     * 
     * @param aadClientId the aadClientId value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAadClientId(String aadClientId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withAadClientId(aadClientId);
        return this;
    }

    /**
     * Get the aadTenantId property: Tenant id of cluster AAD identity.
     * 
     * @return the aadTenantId value.
     */
    public String aadTenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().aadTenantId();
    }

    /**
     * Set the aadTenantId property: Tenant id of cluster AAD identity.
     * 
     * @param aadTenantId the aadTenantId value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAadTenantId(String aadTenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withAadTenantId(aadTenantId);
        return this;
    }

    /**
     * Get the aadApplicationObjectId property: Object id of cluster AAD identity.
     * 
     * @return the aadApplicationObjectId value.
     */
    public String aadApplicationObjectId() {
        return this.innerProperties() == null ? null : this.innerProperties().aadApplicationObjectId();
    }

    /**
     * Set the aadApplicationObjectId property: Object id of cluster AAD identity.
     * 
     * @param aadApplicationObjectId the aadApplicationObjectId value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAadApplicationObjectId(String aadApplicationObjectId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withAadApplicationObjectId(aadApplicationObjectId);
        return this;
    }

    /**
     * Get the aadServicePrincipalObjectId property: Id of cluster identity service principal.
     * 
     * @return the aadServicePrincipalObjectId value.
     */
    public String aadServicePrincipalObjectId() {
        return this.innerProperties() == null ? null : this.innerProperties().aadServicePrincipalObjectId();
    }

    /**
     * Set the aadServicePrincipalObjectId property: Id of cluster identity service principal.
     * 
     * @param aadServicePrincipalObjectId the aadServicePrincipalObjectId value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withAadServicePrincipalObjectId(String aadServicePrincipalObjectId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withAadServicePrincipalObjectId(aadServicePrincipalObjectId);
        return this;
    }

    /**
     * Get the softwareAssuranceProperties property: Software Assurance properties of the cluster.
     * 
     * @return the softwareAssuranceProperties value.
     */
    public SoftwareAssuranceProperties softwareAssuranceProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().softwareAssuranceProperties();
    }

    /**
     * Set the softwareAssuranceProperties property: Software Assurance properties of the cluster.
     * 
     * @param softwareAssuranceProperties the softwareAssuranceProperties value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withSoftwareAssuranceProperties(SoftwareAssuranceProperties softwareAssuranceProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withSoftwareAssuranceProperties(softwareAssuranceProperties);
        return this;
    }

    /**
     * Get the logCollectionProperties property: Log Collection properties of the cluster.
     * 
     * @return the logCollectionProperties value.
     */
    public LogCollectionProperties logCollectionProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().logCollectionProperties();
    }

    /**
     * Set the logCollectionProperties property: Log Collection properties of the cluster.
     * 
     * @param logCollectionProperties the logCollectionProperties value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withLogCollectionProperties(LogCollectionProperties logCollectionProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withLogCollectionProperties(logCollectionProperties);
        return this;
    }

    /**
     * Get the remoteSupportProperties property: RemoteSupport properties of the cluster.
     * 
     * @return the remoteSupportProperties value.
     */
    public RemoteSupportProperties remoteSupportProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().remoteSupportProperties();
    }

    /**
     * Set the remoteSupportProperties property: RemoteSupport properties of the cluster.
     * 
     * @param remoteSupportProperties the remoteSupportProperties value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withRemoteSupportProperties(RemoteSupportProperties remoteSupportProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withRemoteSupportProperties(remoteSupportProperties);
        return this;
    }

    /**
     * Get the desiredProperties property: Desired properties of the cluster.
     * 
     * @return the desiredProperties value.
     */
    public ClusterDesiredProperties desiredProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().desiredProperties();
    }

    /**
     * Set the desiredProperties property: Desired properties of the cluster.
     * 
     * @param desiredProperties the desiredProperties value to set.
     * @return the ClusterInner object itself.
     */
    public ClusterInner withDesiredProperties(ClusterDesiredProperties desiredProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterProperties();
        }
        this.innerProperties().withDesiredProperties(desiredProperties);
        return this;
    }

    /**
     * Get the reportedProperties property: Properties reported by cluster agent.
     * 
     * @return the reportedProperties value.
     */
    public ClusterReportedProperties reportedProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().reportedProperties();
    }

    /**
     * Get the isolatedVmAttestationConfiguration property: Attestation configurations for isolated VM (e.g. TVM, CVM)
     * of the cluster.
     * 
     * @return the isolatedVmAttestationConfiguration value.
     */
    public IsolatedVmAttestationConfiguration isolatedVmAttestationConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().isolatedVmAttestationConfiguration();
    }

    /**
     * Get the trialDaysRemaining property: Number of days remaining in the trial period.
     * 
     * @return the trialDaysRemaining value.
     */
    public Float trialDaysRemaining() {
        return this.innerProperties() == null ? null : this.innerProperties().trialDaysRemaining();
    }

    /**
     * Get the billingModel property: Type of billing applied to the resource.
     * 
     * @return the billingModel value.
     */
    public String billingModel() {
        return this.innerProperties() == null ? null : this.innerProperties().billingModel();
    }

    /**
     * Get the registrationTimestamp property: First cluster sync timestamp.
     * 
     * @return the registrationTimestamp value.
     */
    public OffsetDateTime registrationTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().registrationTimestamp();
    }

    /**
     * Get the lastSyncTimestamp property: Most recent cluster sync timestamp.
     * 
     * @return the lastSyncTimestamp value.
     */
    public OffsetDateTime lastSyncTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().lastSyncTimestamp();
    }

    /**
     * Get the lastBillingTimestamp property: Most recent billing meter timestamp.
     * 
     * @return the lastBillingTimestamp value.
     */
    public OffsetDateTime lastBillingTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().lastBillingTimestamp();
    }

    /**
     * Get the serviceEndpoint property: Region specific DataPath Endpoint of the cluster.
     * 
     * @return the serviceEndpoint value.
     */
    public String serviceEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceEndpoint();
    }

    /**
     * Get the resourceProviderObjectId property: Object id of RP Service Principal.
     * 
     * @return the resourceProviderObjectId value.
     */
    public String resourceProviderObjectId() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceProviderObjectId();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerIdentity() != null) {
            innerIdentity().validate();
        }
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
        jsonWriter.writeJsonField("identity", this.innerIdentity);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterInner.
     */
    public static ClusterInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterInner deserializedClusterInner = new ClusterInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedClusterInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedClusterInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedClusterInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedClusterInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedClusterInner.withTags(tags);
                } else if ("identity".equals(fieldName)) {
                    deserializedClusterInner.innerIdentity = ManagedServiceIdentity.fromJson(reader);
                } else if ("properties".equals(fieldName)) {
                    deserializedClusterInner.innerProperties = ClusterProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedClusterInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterInner;
        });
    }
}
