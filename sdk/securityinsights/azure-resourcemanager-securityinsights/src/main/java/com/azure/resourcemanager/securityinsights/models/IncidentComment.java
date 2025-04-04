// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securityinsights.fluent.models.IncidentCommentInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of IncidentComment.
 */
public interface IncidentComment {
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
     * Gets the etag property: Etag of the azure resource.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the createdTimeUtc property: The time the comment was created.
     * 
     * @return the createdTimeUtc value.
     */
    OffsetDateTime createdTimeUtc();

    /**
     * Gets the lastModifiedTimeUtc property: The time the comment was updated.
     * 
     * @return the lastModifiedTimeUtc value.
     */
    OffsetDateTime lastModifiedTimeUtc();

    /**
     * Gets the message property: The comment message.
     * 
     * @return the message value.
     */
    String message();

    /**
     * Gets the author property: Describes the client that created the comment.
     * 
     * @return the author value.
     */
    ClientInfo author();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.securityinsights.fluent.models.IncidentCommentInner object.
     * 
     * @return the inner object.
     */
    IncidentCommentInner innerModel();

    /**
     * The entirety of the IncidentComment definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The IncidentComment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the IncidentComment definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the IncidentComment definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, workspaceName, incidentId.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param workspaceName The name of the workspace.
             * @param incidentId Incident ID.
             * @return the next definition stage.
             */
            WithCreate withExistingIncident(String resourceGroupName, String workspaceName, String incidentId);
        }

        /**
         * The stage of the IncidentComment definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithEtag, DefinitionStages.WithMessage {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            IncidentComment create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            IncidentComment create(Context context);
        }

        /**
         * The stage of the IncidentComment definition allowing to specify etag.
         */
        interface WithEtag {
            /**
             * Specifies the etag property: Etag of the azure resource.
             * 
             * @param etag Etag of the azure resource.
             * @return the next definition stage.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the IncidentComment definition allowing to specify message.
         */
        interface WithMessage {
            /**
             * Specifies the message property: The comment message.
             * 
             * @param message The comment message.
             * @return the next definition stage.
             */
            WithCreate withMessage(String message);
        }
    }

    /**
     * Begins update for the IncidentComment resource.
     * 
     * @return the stage of resource update.
     */
    IncidentComment.Update update();

    /**
     * The template for IncidentComment update.
     */
    interface Update extends UpdateStages.WithEtag, UpdateStages.WithMessage {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        IncidentComment apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        IncidentComment apply(Context context);
    }

    /**
     * The IncidentComment update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the IncidentComment update allowing to specify etag.
         */
        interface WithEtag {
            /**
             * Specifies the etag property: Etag of the azure resource.
             * 
             * @param etag Etag of the azure resource.
             * @return the next definition stage.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the IncidentComment update allowing to specify message.
         */
        interface WithMessage {
            /**
             * Specifies the message property: The comment message.
             * 
             * @param message The comment message.
             * @return the next definition stage.
             */
            Update withMessage(String message);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    IncidentComment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    IncidentComment refresh(Context context);
}
