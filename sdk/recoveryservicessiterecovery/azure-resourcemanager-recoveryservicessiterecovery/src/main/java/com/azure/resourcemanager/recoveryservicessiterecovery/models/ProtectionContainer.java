// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectionContainerInner;

/**
 * An immutable client-side representation of ProtectionContainer.
 */
public interface ProtectionContainer {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: The custom data.
     * 
     * @return the properties value.
     */
    ProtectionContainerProperties properties();

    /**
     * Gets the location property: Resource Location.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectionContainerInner
     * object.
     * 
     * @return the inner object.
     */
    ProtectionContainerInner innerModel();

    /**
     * The entirety of the ProtectionContainer definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The ProtectionContainer definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the ProtectionContainer definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the ProtectionContainer definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName, fabricName.
             * 
             * @param resourceGroupName The name of the resource group where the recovery services vault is present.
             * @param resourceName The name of the recovery services vault.
             * @param fabricName Unique fabric ARM name.
             * @return the next definition stage.
             */
            WithCreate withExistingReplicationFabric(String resourceGroupName, String resourceName, String fabricName);
        }

        /**
         * The stage of the ProtectionContainer definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            ProtectionContainer create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            ProtectionContainer create(Context context);
        }

        /**
         * The stage of the ProtectionContainer definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: Create protection container input properties..
             * 
             * @param properties Create protection container input properties.
             * @return the next definition stage.
             */
            WithCreate withProperties(CreateProtectionContainerInputProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    ProtectionContainer refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    ProtectionContainer refresh(Context context);

    /**
     * Adds a protectable item to the replication protection container.
     * 
     * The operation to a add a protectable item to a protection container(Add physical server).
     * 
     * @param discoverProtectableItemRequest The request object to add a protectable item.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    ProtectionContainer discoverProtectableItem(DiscoverProtectableItemRequest discoverProtectableItemRequest);

    /**
     * Adds a protectable item to the replication protection container.
     * 
     * The operation to a add a protectable item to a protection container(Add physical server).
     * 
     * @param discoverProtectableItemRequest The request object to add a protectable item.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    ProtectionContainer discoverProtectableItem(DiscoverProtectableItemRequest discoverProtectableItemRequest,
        Context context);

    /**
     * Removes a protection container.
     * 
     * Operation to remove a protection container.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete();

    /**
     * Removes a protection container.
     * 
     * Operation to remove a protection container.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(Context context);

    /**
     * Switches protection from one container to another.
     * 
     * Operation to switch protection from one container to another.
     * 
     * @param switchInput Switch protection input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    ProtectionContainer switchClusterProtection(SwitchClusterProtectionInput switchInput);

    /**
     * Switches protection from one container to another.
     * 
     * Operation to switch protection from one container to another.
     * 
     * @param switchInput Switch protection input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    ProtectionContainer switchClusterProtection(SwitchClusterProtectionInput switchInput, Context context);

    /**
     * Switches protection from one container to another or one replication provider to another.
     * 
     * Operation to switch protection from one container to another or one replication provider to another.
     * 
     * @param switchInput Switch protection input.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    ProtectionContainer switchProtection(SwitchProtectionInput switchInput);

    /**
     * Switches protection from one container to another or one replication provider to another.
     * 
     * Operation to switch protection from one container to another or one replication provider to another.
     * 
     * @param switchInput Switch protection input.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return protection container details.
     */
    ProtectionContainer switchProtection(SwitchProtectionInput switchInput, Context context);
}
