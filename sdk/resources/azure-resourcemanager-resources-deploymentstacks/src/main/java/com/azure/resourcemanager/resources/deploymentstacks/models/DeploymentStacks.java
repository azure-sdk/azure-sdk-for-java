// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.deploymentstacks.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.deploymentstacks.fluent.models.DeploymentStackInner;

/**
 * Resource collection API of DeploymentStacks.
 */
public interface DeploymentStacks {
    /**
     * Lists all the Deployment stacks within the specified Resource Group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Deployment stacks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeploymentStack> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the Deployment stacks within the specified Resource Group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Deployment stacks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeploymentStack> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the Deployment stacks within the specified Subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Deployment stacks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeploymentStack> list();

    /**
     * Lists all the Deployment stacks within the specified Subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Deployment stacks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeploymentStack> list(Context context);

    /**
     * Lists all the Deployment stacks within the specified Management Group.
     * 
     * @param managementGroupId Management Group id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Deployment stacks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeploymentStack> listAtManagementGroup(String managementGroupId);

    /**
     * Lists all the Deployment stacks within the specified Management Group.
     * 
     * @param managementGroupId Management Group id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Deployment stacks as paginated response with {@link PagedIterable}.
     */
    PagedIterable<DeploymentStack> listAtManagementGroup(String managementGroupId, Context context);

    /**
     * Gets a Deployment stack with a given name at Resource Group scope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentStackName Name of the deployment stack.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Deployment stack with a given name at Resource Group scope along with {@link Response}.
     */
    Response<DeploymentStack> getByResourceGroupWithResponse(String resourceGroupName, String deploymentStackName,
        Context context);

    /**
     * Gets a Deployment stack with a given name at Resource Group scope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentStackName Name of the deployment stack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Deployment stack with a given name at Resource Group scope.
     */
    DeploymentStack getByResourceGroup(String resourceGroupName, String deploymentStackName);

    /**
     * Deletes a Deployment stack by name at Resource Group scope. When operation completes, status code 200 returned
     * without content.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentStackName Name of the deployment stack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String deploymentStackName);

    /**
     * Deletes a Deployment stack by name at Resource Group scope. When operation completes, status code 200 returned
     * without content.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentStackName Name of the deployment stack.
     * @param unmanageActionResources Flag to indicate delete rather than detach for unmanaged resources.
     * @param unmanageActionResourceGroups Flag to indicate delete rather than detach for unmanaged resource groups.
     * @param unmanageActionManagementGroups Flag to indicate delete rather than detach for unmanaged management groups.
     * @param bypassStackOutOfSyncError Flag to bypass service errors that indicate the stack resource list is not
     * correctly synchronized.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String deploymentStackName,
        UnmanageActionResourceMode unmanageActionResources,
        UnmanageActionResourceGroupMode unmanageActionResourceGroups,
        UnmanageActionManagementGroupMode unmanageActionManagementGroups, Boolean bypassStackOutOfSyncError,
        Context context);

    /**
     * Creates or updates a Deployment stack at Subscription scope.
     * 
     * @param deploymentStackName Name of the deployment stack.
     * @param deploymentStack Deployment stack supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deployment stack object.
     */
    DeploymentStack createOrUpdateAtSubscription(String deploymentStackName, DeploymentStackInner deploymentStack);

    /**
     * Creates or updates a Deployment stack at Subscription scope.
     * 
     * @param deploymentStackName Name of the deployment stack.
     * @param deploymentStack Deployment stack supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deployment stack object.
     */
    DeploymentStack createOrUpdateAtSubscription(String deploymentStackName, DeploymentStackInner deploymentStack,
        Context context);

    /**
     * Gets a Deployment stack with a given name at Subscription scope.
     * 
     * @param deploymentStackName Name of the deployment stack.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Deployment stack with a given name at Subscription scope along with {@link Response}.
     */
    Response<DeploymentStack> getAtSubscriptionWithResponse(String deploymentStackName, Context context);

    /**
     * Gets a Deployment stack with a given name at Subscription scope.
     * 
     * @param deploymentStackName Name of the deployment stack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Deployment stack with a given name at Subscription scope.
     */
    DeploymentStack getAtSubscription(String deploymentStackName);

    /**
     * Deletes a Deployment stack by name at Subscription scope. When operation completes, status code 200 returned
     * without content.
     * 
     * @param deploymentStackName Name of the deployment stack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAtSubscription(String deploymentStackName);

    /**
     * Deletes a Deployment stack by name at Subscription scope. When operation completes, status code 200 returned
     * without content.
     * 
     * @param deploymentStackName Name of the deployment stack.
     * @param unmanageActionResources Flag to indicate delete rather than detach for unmanaged resources.
     * @param unmanageActionResourceGroups Flag to indicate delete rather than detach for unmanaged resource groups.
     * @param unmanageActionManagementGroups Flag to indicate delete rather than detach for unmanaged management groups.
     * @param bypassStackOutOfSyncError Flag to bypass service errors that indicate the stack resource list is not
     * correctly synchronized.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAtSubscription(String deploymentStackName, UnmanageActionResourceMode unmanageActionResources,
        UnmanageActionResourceGroupMode unmanageActionResourceGroups,
        UnmanageActionManagementGroupMode unmanageActionManagementGroups, Boolean bypassStackOutOfSyncError,
        Context context);

    /**
     * Creates or updates a Deployment stack at Management Group scope.
     * 
     * @param managementGroupId Management Group id.
     * @param deploymentStackName Name of the deployment stack.
     * @param deploymentStack Deployment stack supplied to the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deployment stack object.
     */
    DeploymentStack createOrUpdateAtManagementGroup(String managementGroupId, String deploymentStackName,
        DeploymentStackInner deploymentStack);

    /**
     * Creates or updates a Deployment stack at Management Group scope.
     * 
     * @param managementGroupId Management Group id.
     * @param deploymentStackName Name of the deployment stack.
     * @param deploymentStack Deployment stack supplied to the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return deployment stack object.
     */
    DeploymentStack createOrUpdateAtManagementGroup(String managementGroupId, String deploymentStackName,
        DeploymentStackInner deploymentStack, Context context);

    /**
     * Gets a Deployment stack with a given name at Management Group scope.
     * 
     * @param managementGroupId Management Group id.
     * @param deploymentStackName Name of the deployment stack.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Deployment stack with a given name at Management Group scope along with {@link Response}.
     */
    Response<DeploymentStack> getAtManagementGroupWithResponse(String managementGroupId, String deploymentStackName,
        Context context);

    /**
     * Gets a Deployment stack with a given name at Management Group scope.
     * 
     * @param managementGroupId Management Group id.
     * @param deploymentStackName Name of the deployment stack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Deployment stack with a given name at Management Group scope.
     */
    DeploymentStack getAtManagementGroup(String managementGroupId, String deploymentStackName);

    /**
     * Deletes a Deployment stack by name at Management Group scope. When operation completes, status code 200 returned
     * without content.
     * 
     * @param managementGroupId Management Group id.
     * @param deploymentStackName Name of the deployment stack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAtManagementGroup(String managementGroupId, String deploymentStackName);

    /**
     * Deletes a Deployment stack by name at Management Group scope. When operation completes, status code 200 returned
     * without content.
     * 
     * @param managementGroupId Management Group id.
     * @param deploymentStackName Name of the deployment stack.
     * @param unmanageActionResources Flag to indicate delete rather than detach for unmanaged resources.
     * @param unmanageActionResourceGroups Flag to indicate delete rather than detach for unmanaged resource groups.
     * @param unmanageActionManagementGroups Flag to indicate delete rather than detach for unmanaged management groups.
     * @param bypassStackOutOfSyncError Flag to bypass service errors that indicate the stack resource list is not
     * correctly synchronized.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteAtManagementGroup(String managementGroupId, String deploymentStackName,
        UnmanageActionResourceMode unmanageActionResources,
        UnmanageActionResourceGroupMode unmanageActionResourceGroups,
        UnmanageActionManagementGroupMode unmanageActionManagementGroups, Boolean bypassStackOutOfSyncError,
        Context context);

    /**
     * Exports the template used to create the Deployment stack at Resource Group scope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentStackName Name of the deployment stack.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return export Template specific properties of the Deployment stack along with {@link Response}.
     */
    Response<DeploymentStackTemplateDefinition> exportTemplateAtResourceGroupWithResponse(String resourceGroupName,
        String deploymentStackName, Context context);

    /**
     * Exports the template used to create the Deployment stack at Resource Group scope.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentStackName Name of the deployment stack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return export Template specific properties of the Deployment stack.
     */
    DeploymentStackTemplateDefinition exportTemplateAtResourceGroup(String resourceGroupName,
        String deploymentStackName);

    /**
     * Exports the template used to create the Deployment stack at Subscription scope.
     * 
     * @param deploymentStackName Name of the deployment stack.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return export Template specific properties of the Deployment stack along with {@link Response}.
     */
    Response<DeploymentStackTemplateDefinition> exportTemplateAtSubscriptionWithResponse(String deploymentStackName,
        Context context);

    /**
     * Exports the template used to create the Deployment stack at Subscription scope.
     * 
     * @param deploymentStackName Name of the deployment stack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return export Template specific properties of the Deployment stack.
     */
    DeploymentStackTemplateDefinition exportTemplateAtSubscription(String deploymentStackName);

    /**
     * Exports the template used to create the Deployment stack at Management Group scope.
     * 
     * @param managementGroupId Management Group id.
     * @param deploymentStackName Name of the deployment stack.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return export Template specific properties of the Deployment stack along with {@link Response}.
     */
    Response<DeploymentStackTemplateDefinition> exportTemplateAtManagementGroupWithResponse(String managementGroupId,
        String deploymentStackName, Context context);

    /**
     * Exports the template used to create the Deployment stack at Management Group scope.
     * 
     * @param managementGroupId Management Group id.
     * @param deploymentStackName Name of the deployment stack.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return export Template specific properties of the Deployment stack.
     */
    DeploymentStackTemplateDefinition exportTemplateAtManagementGroup(String managementGroupId,
        String deploymentStackName);

    /**
     * Runs preflight validation on the Resource Group scoped Deployment stack template to verify its acceptance to
     * Azure Resource Manager.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentStackName Name of the deployment stack.
     * @param deploymentStack Deployment stack to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Deployment stack validation result.
     */
    DeploymentStackValidateResult validateStackAtResourceGroup(String resourceGroupName, String deploymentStackName,
        DeploymentStackInner deploymentStack);

    /**
     * Runs preflight validation on the Resource Group scoped Deployment stack template to verify its acceptance to
     * Azure Resource Manager.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentStackName Name of the deployment stack.
     * @param deploymentStack Deployment stack to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Deployment stack validation result.
     */
    DeploymentStackValidateResult validateStackAtResourceGroup(String resourceGroupName, String deploymentStackName,
        DeploymentStackInner deploymentStack, Context context);

    /**
     * Runs preflight validation on the Subscription scoped Deployment stack template to verify its acceptance to Azure
     * Resource Manager.
     * 
     * @param deploymentStackName Name of the deployment stack.
     * @param deploymentStack Deployment stack to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Deployment stack validation result.
     */
    DeploymentStackValidateResult validateStackAtSubscription(String deploymentStackName,
        DeploymentStackInner deploymentStack);

    /**
     * Runs preflight validation on the Subscription scoped Deployment stack template to verify its acceptance to Azure
     * Resource Manager.
     * 
     * @param deploymentStackName Name of the deployment stack.
     * @param deploymentStack Deployment stack to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Deployment stack validation result.
     */
    DeploymentStackValidateResult validateStackAtSubscription(String deploymentStackName,
        DeploymentStackInner deploymentStack, Context context);

    /**
     * Runs preflight validation on the Management Group scoped Deployment stack template to verify its acceptance to
     * Azure Resource Manager.
     * 
     * @param managementGroupId Management Group id.
     * @param deploymentStackName Name of the deployment stack.
     * @param deploymentStack Deployment stack to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Deployment stack validation result.
     */
    DeploymentStackValidateResult validateStackAtManagementGroup(String managementGroupId, String deploymentStackName,
        DeploymentStackInner deploymentStack);

    /**
     * Runs preflight validation on the Management Group scoped Deployment stack template to verify its acceptance to
     * Azure Resource Manager.
     * 
     * @param managementGroupId Management Group id.
     * @param deploymentStackName Name of the deployment stack.
     * @param deploymentStack Deployment stack to validate.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Deployment stack validation result.
     */
    DeploymentStackValidateResult validateStackAtManagementGroup(String managementGroupId, String deploymentStackName,
        DeploymentStackInner deploymentStack, Context context);

    /**
     * Gets a Deployment stack with a given name at Resource Group scope.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Deployment stack with a given name at Resource Group scope along with {@link Response}.
     */
    DeploymentStack getById(String id);

    /**
     * Gets a Deployment stack with a given name at Resource Group scope.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Deployment stack with a given name at Resource Group scope along with {@link Response}.
     */
    Response<DeploymentStack> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a Deployment stack by name at Resource Group scope. When operation completes, status code 200 returned
     * without content.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a Deployment stack by name at Resource Group scope. When operation completes, status code 200 returned
     * without content.
     * 
     * @param id the resource ID.
     * @param unmanageActionResources Flag to indicate delete rather than detach for unmanaged resources.
     * @param unmanageActionResourceGroups Flag to indicate delete rather than detach for unmanaged resource groups.
     * @param unmanageActionManagementGroups Flag to indicate delete rather than detach for unmanaged management groups.
     * @param bypassStackOutOfSyncError Flag to bypass service errors that indicate the stack resource list is not
     * correctly synchronized.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, UnmanageActionResourceMode unmanageActionResources,
        UnmanageActionResourceGroupMode unmanageActionResourceGroups,
        UnmanageActionManagementGroupMode unmanageActionManagementGroups, Boolean bypassStackOutOfSyncError,
        Context context);

    /**
     * Begins definition for a new DeploymentStack resource.
     * 
     * @param name resource name.
     * @return the first stage of the new DeploymentStack definition.
     */
    DeploymentStack.DefinitionStages.Blank define(String name);
}
