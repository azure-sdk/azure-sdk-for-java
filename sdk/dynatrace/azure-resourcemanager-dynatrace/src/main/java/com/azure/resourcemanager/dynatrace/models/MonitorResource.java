// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dynatrace.fluent.models.MonitorResourceInner;
import java.util.Map;

/**
 * An immutable client-side representation of MonitorResource.
 */
public interface MonitorResource {
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
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: System metadata for this resource.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the identity property: The managed service identities assigned to this resource.
     * 
     * @return the identity value.
     */
    IdentityProperties identity();

    /**
     * Gets the monitoringStatus property: Status of the monitor.
     * 
     * @return the monitoringStatus value.
     */
    MonitoringStatus monitoringStatus();

    /**
     * Gets the marketplaceSubscriptionStatus property: Marketplace subscription status.
     * 
     * @return the marketplaceSubscriptionStatus value.
     */
    MarketplaceSubscriptionStatus marketplaceSubscriptionStatus();

    /**
     * Gets the dynatraceEnvironmentProperties property: Properties of the Dynatrace environment.
     * 
     * @return the dynatraceEnvironmentProperties value.
     */
    DynatraceEnvironmentProperties dynatraceEnvironmentProperties();

    /**
     * Gets the userInfo property: User info.
     * 
     * @return the userInfo value.
     */
    UserInfo userInfo();

    /**
     * Gets the planData property: Billing plan information.
     * 
     * @return the planData value.
     */
    PlanData planData();

    /**
     * Gets the liftrResourceCategory property: Liftr Resource category.
     * 
     * @return the liftrResourceCategory value.
     */
    LiftrResourceCategories liftrResourceCategory();

    /**
     * Gets the liftrResourcePreference property: The priority of the resource.
     * 
     * @return the liftrResourcePreference value.
     */
    Integer liftrResourcePreference();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

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
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.dynatrace.fluent.models.MonitorResourceInner object.
     * 
     * @return the inner object.
     */
    MonitorResourceInner innerModel();

    /**
     * The entirety of the MonitorResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The MonitorResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the MonitorResource definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the MonitorResource definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the MonitorResource definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the MonitorResource definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithIdentity, DefinitionStages.WithMonitoringStatus,
            DefinitionStages.WithMarketplaceSubscriptionStatus, DefinitionStages.WithDynatraceEnvironmentProperties,
            DefinitionStages.WithUserInfo, DefinitionStages.WithPlanData {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            MonitorResource create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            MonitorResource create(Context context);
        }

        /**
         * The stage of the MonitorResource definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the MonitorResource definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed service identities assigned to this resource..
             * 
             * @param identity The managed service identities assigned to this resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityProperties identity);
        }

        /**
         * The stage of the MonitorResource definition allowing to specify monitoringStatus.
         */
        interface WithMonitoringStatus {
            /**
             * Specifies the monitoringStatus property: Status of the monitor..
             * 
             * @param monitoringStatus Status of the monitor.
             * @return the next definition stage.
             */
            WithCreate withMonitoringStatus(MonitoringStatus monitoringStatus);
        }

        /**
         * The stage of the MonitorResource definition allowing to specify marketplaceSubscriptionStatus.
         */
        interface WithMarketplaceSubscriptionStatus {
            /**
             * Specifies the marketplaceSubscriptionStatus property: Marketplace subscription status..
             * 
             * @param marketplaceSubscriptionStatus Marketplace subscription status.
             * @return the next definition stage.
             */
            WithCreate withMarketplaceSubscriptionStatus(MarketplaceSubscriptionStatus marketplaceSubscriptionStatus);
        }

        /**
         * The stage of the MonitorResource definition allowing to specify dynatraceEnvironmentProperties.
         */
        interface WithDynatraceEnvironmentProperties {
            /**
             * Specifies the dynatraceEnvironmentProperties property: Properties of the Dynatrace environment..
             * 
             * @param dynatraceEnvironmentProperties Properties of the Dynatrace environment.
             * @return the next definition stage.
             */
            WithCreate
                withDynatraceEnvironmentProperties(DynatraceEnvironmentProperties dynatraceEnvironmentProperties);
        }

        /**
         * The stage of the MonitorResource definition allowing to specify userInfo.
         */
        interface WithUserInfo {
            /**
             * Specifies the userInfo property: User info..
             * 
             * @param userInfo User info.
             * @return the next definition stage.
             */
            WithCreate withUserInfo(UserInfo userInfo);
        }

        /**
         * The stage of the MonitorResource definition allowing to specify planData.
         */
        interface WithPlanData {
            /**
             * Specifies the planData property: Billing plan information..
             * 
             * @param planData Billing plan information.
             * @return the next definition stage.
             */
            WithCreate withPlanData(PlanData planData);
        }
    }

    /**
     * Begins update for the MonitorResource resource.
     * 
     * @return the stage of resource update.
     */
    MonitorResource.Update update();

    /**
     * The template for MonitorResource update.
     */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        MonitorResource apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        MonitorResource apply(Context context);
    }

    /**
     * The MonitorResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the MonitorResource update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    MonitorResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    MonitorResource refresh(Context context);

    /**
     * List the resources currently being monitored by the Dynatrace monitor resource.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the resources being monitored by Dynatrace monitor resource as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<MonitoredResource> listMonitoredResources();

    /**
     * List the resources currently being monitored by the Dynatrace monitor resource.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all the resources being monitored by Dynatrace monitor resource as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<MonitoredResource> listMonitoredResources(Context context);

    /**
     * Returns the payload that needs to be passed in the request body for installing Dynatrace agent on a VM.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of payload to be passed while installing VM agent along with {@link Response}.
     */
    Response<VMExtensionPayload> getVMHostPayloadWithResponse(Context context);

    /**
     * Returns the payload that needs to be passed in the request body for installing Dynatrace agent on a VM.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of payload to be passed while installing VM agent.
     */
    VMExtensionPayload getVMHostPayload();

    /**
     * List the VM/VMSS resources currently being monitored by the Dynatrace resource.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list VM Host Operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VMInfo> listHosts();

    /**
     * List the VM/VMSS resources currently being monitored by the Dynatrace resource.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response of a list VM Host Operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VMInfo> listHosts(Context context);

    /**
     * Get metric status.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metric status along with {@link Response}.
     */
    Response<MetricsStatusResponse> getMetricStatusWithResponse(Context context);

    /**
     * Get metric status.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metric status.
     */
    MetricsStatusResponse getMetricStatus();

    /**
     * Gets list of App Services with Dynatrace PaaS OneAgent enabled.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of App Services with Dynatrace PaaS OneAgent enabled as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<AppServiceInfo> listAppServices();

    /**
     * Gets list of App Services with Dynatrace PaaS OneAgent enabled.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of App Services with Dynatrace PaaS OneAgent enabled as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<AppServiceInfo> listAppServices(Context context);

    /**
     * Gets the SSO configuration details from the partner.
     * 
     * @param request The details of the get sso details request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server on
     * status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SSO configuration details from the partner along with {@link Response}.
     */
    Response<SsoDetailsResponse> getSsoDetailsWithResponse(SsoDetailsRequest request, Context context);

    /**
     * Gets the SSO configuration details from the partner.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server on
     * status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SSO configuration details from the partner.
     */
    SsoDetailsResponse getSsoDetails();

    /**
     * Gets all the Dynatrace environments that a user can link a azure resource to.
     * 
     * @param request The details of the linkable environment request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Dynatrace environments that a user can link a azure resource to as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<LinkableEnvironmentResponse> listLinkableEnvironments(LinkableEnvironmentRequest request);

    /**
     * Gets all the Dynatrace environments that a user can link a azure resource to.
     * 
     * @param request The details of the linkable environment request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Dynatrace environments that a user can link a azure resource to as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<LinkableEnvironmentResponse> listLinkableEnvironments(LinkableEnvironmentRequest request,
        Context context);
}
