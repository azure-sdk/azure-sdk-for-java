// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.connectedvmware.models.ExtendedLocation;
import com.azure.resourcemanager.connectedvmware.models.HardwareProfile;
import com.azure.resourcemanager.connectedvmware.models.InfrastructureProfile;
import com.azure.resourcemanager.connectedvmware.models.NetworkProfile;
import com.azure.resourcemanager.connectedvmware.models.OsProfileForVMInstance;
import com.azure.resourcemanager.connectedvmware.models.PlacementProfile;
import com.azure.resourcemanager.connectedvmware.models.ProvisioningState;
import com.azure.resourcemanager.connectedvmware.models.ResourceStatus;
import com.azure.resourcemanager.connectedvmware.models.SecurityProfile;
import com.azure.resourcemanager.connectedvmware.models.StorageProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Define the virtualMachineInstance. */
@Fluent
public final class VirtualMachineInstanceInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private VirtualMachineInstanceProperties innerProperties = new VirtualMachineInstanceProperties();

    /*
     * Gets or sets the extended location.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of VirtualMachineInstanceInner class. */
    public VirtualMachineInstanceInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineInstanceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the extendedLocation property: Gets or sets the extended location.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: Gets or sets the extended location.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the VirtualMachineInstanceInner object itself.
     */
    public VirtualMachineInstanceInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
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
     * Get the placementProfile property: Placement properties.
     *
     * @return the placementProfile value.
     */
    public PlacementProfile placementProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().placementProfile();
    }

    /**
     * Set the placementProfile property: Placement properties.
     *
     * @param placementProfile the placementProfile value to set.
     * @return the VirtualMachineInstanceInner object itself.
     */
    public VirtualMachineInstanceInner withPlacementProfile(PlacementProfile placementProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineInstanceProperties();
        }
        this.innerProperties().withPlacementProfile(placementProfile);
        return this;
    }

    /**
     * Get the osProfile property: OS properties.
     *
     * @return the osProfile value.
     */
    public OsProfileForVMInstance osProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().osProfile();
    }

    /**
     * Set the osProfile property: OS properties.
     *
     * @param osProfile the osProfile value to set.
     * @return the VirtualMachineInstanceInner object itself.
     */
    public VirtualMachineInstanceInner withOsProfile(OsProfileForVMInstance osProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineInstanceProperties();
        }
        this.innerProperties().withOsProfile(osProfile);
        return this;
    }

    /**
     * Get the hardwareProfile property: Hardware properties.
     *
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().hardwareProfile();
    }

    /**
     * Set the hardwareProfile property: Hardware properties.
     *
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the VirtualMachineInstanceInner object itself.
     */
    public VirtualMachineInstanceInner withHardwareProfile(HardwareProfile hardwareProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineInstanceProperties();
        }
        this.innerProperties().withHardwareProfile(hardwareProfile);
        return this;
    }

    /**
     * Get the networkProfile property: Network properties.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().networkProfile();
    }

    /**
     * Set the networkProfile property: Network properties.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the VirtualMachineInstanceInner object itself.
     */
    public VirtualMachineInstanceInner withNetworkProfile(NetworkProfile networkProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineInstanceProperties();
        }
        this.innerProperties().withNetworkProfile(networkProfile);
        return this;
    }

    /**
     * Get the storageProfile property: Storage properties.
     *
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().storageProfile();
    }

    /**
     * Set the storageProfile property: Storage properties.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the VirtualMachineInstanceInner object itself.
     */
    public VirtualMachineInstanceInner withStorageProfile(StorageProfile storageProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineInstanceProperties();
        }
        this.innerProperties().withStorageProfile(storageProfile);
        return this;
    }

    /**
     * Get the securityProfile property: Gets the security profile.
     *
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().securityProfile();
    }

    /**
     * Set the securityProfile property: Gets the security profile.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the VirtualMachineInstanceInner object itself.
     */
    public VirtualMachineInstanceInner withSecurityProfile(SecurityProfile securityProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineInstanceProperties();
        }
        this.innerProperties().withSecurityProfile(securityProfile);
        return this;
    }

    /**
     * Get the infrastructureProfile property: Gets the infrastructure profile.
     *
     * @return the infrastructureProfile value.
     */
    public InfrastructureProfile infrastructureProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().infrastructureProfile();
    }

    /**
     * Set the infrastructureProfile property: Gets the infrastructure profile.
     *
     * @param infrastructureProfile the infrastructureProfile value to set.
     * @return the VirtualMachineInstanceInner object itself.
     */
    public VirtualMachineInstanceInner withInfrastructureProfile(InfrastructureProfile infrastructureProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineInstanceProperties();
        }
        this.innerProperties().withInfrastructureProfile(infrastructureProfile);
        return this;
    }

    /**
     * Get the powerState property: Gets the power state of the virtual machine.
     *
     * @return the powerState value.
     */
    public String powerState() {
        return this.innerProperties() == null ? null : this.innerProperties().powerState();
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<ResourceStatus> statuses() {
        return this.innerProperties() == null ? null : this.innerProperties().statuses();
    }

    /**
     * Get the provisioningState property: Gets the provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceUid property: Gets or sets a unique identifier for the vm resource.
     *
     * @return the resourceUid value.
     */
    public String resourceUid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceUid();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model VirtualMachineInstanceInner"));
        } else {
            innerProperties().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineInstanceInner.class);
}
