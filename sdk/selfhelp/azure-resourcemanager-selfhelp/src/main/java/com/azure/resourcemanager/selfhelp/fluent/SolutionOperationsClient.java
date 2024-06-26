// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.selfhelp.fluent.models.SolutionResourceInner;
import com.azure.resourcemanager.selfhelp.models.SolutionPatchRequestBody;
import com.azure.resourcemanager.selfhelp.models.SolutionWarmUpRequestBody;

/**
 * An instance of this class provides access to all the operations defined in SolutionOperationsClient.
 */
public interface SolutionOperationsClient {
    /**
     * Creates a solution for the specific Azure resource or subscription using the inputs ‘solutionId and
     * requiredInputs’ from discovery solutions. &lt;br/&gt; Azure solutions comprise a comprehensive library of
     * self-help resources that have been thoughtfully curated by Azure engineers to aid customers in resolving typical
     * troubleshooting issues. These solutions encompass: &lt;br/&gt; (1.) Dynamic and context-aware diagnostics, guided
     * troubleshooting wizards, and data visualizations. &lt;br/&gt; (2.) Rich instructional video tutorials and
     * illustrative diagrams and images. &lt;br/&gt; (3.) Thoughtfully assembled textual troubleshooting instructions.
     * &lt;br/&gt; All these components are seamlessly converged into unified solutions tailored to address a specific
     * support problem area.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of solution response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SolutionResourceInner>, SolutionResourceInner> beginCreate(String scope,
        String solutionResourceName);

    /**
     * Creates a solution for the specific Azure resource or subscription using the inputs ‘solutionId and
     * requiredInputs’ from discovery solutions. &lt;br/&gt; Azure solutions comprise a comprehensive library of
     * self-help resources that have been thoughtfully curated by Azure engineers to aid customers in resolving typical
     * troubleshooting issues. These solutions encompass: &lt;br/&gt; (1.) Dynamic and context-aware diagnostics, guided
     * troubleshooting wizards, and data visualizations. &lt;br/&gt; (2.) Rich instructional video tutorials and
     * illustrative diagrams and images. &lt;br/&gt; (3.) Thoughtfully assembled textual troubleshooting instructions.
     * &lt;br/&gt; All these components are seamlessly converged into unified solutions tailored to address a specific
     * support problem area.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @param solutionRequestBody The required request body for this solution resource creation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of solution response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SolutionResourceInner>, SolutionResourceInner> beginCreate(String scope,
        String solutionResourceName, SolutionResourceInner solutionRequestBody, Context context);

    /**
     * Creates a solution for the specific Azure resource or subscription using the inputs ‘solutionId and
     * requiredInputs’ from discovery solutions. &lt;br/&gt; Azure solutions comprise a comprehensive library of
     * self-help resources that have been thoughtfully curated by Azure engineers to aid customers in resolving typical
     * troubleshooting issues. These solutions encompass: &lt;br/&gt; (1.) Dynamic and context-aware diagnostics, guided
     * troubleshooting wizards, and data visualizations. &lt;br/&gt; (2.) Rich instructional video tutorials and
     * illustrative diagrams and images. &lt;br/&gt; (3.) Thoughtfully assembled textual troubleshooting instructions.
     * &lt;br/&gt; All these components are seamlessly converged into unified solutions tailored to address a specific
     * support problem area.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return solution response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SolutionResourceInner create(String scope, String solutionResourceName);

    /**
     * Creates a solution for the specific Azure resource or subscription using the inputs ‘solutionId and
     * requiredInputs’ from discovery solutions. &lt;br/&gt; Azure solutions comprise a comprehensive library of
     * self-help resources that have been thoughtfully curated by Azure engineers to aid customers in resolving typical
     * troubleshooting issues. These solutions encompass: &lt;br/&gt; (1.) Dynamic and context-aware diagnostics, guided
     * troubleshooting wizards, and data visualizations. &lt;br/&gt; (2.) Rich instructional video tutorials and
     * illustrative diagrams and images. &lt;br/&gt; (3.) Thoughtfully assembled textual troubleshooting instructions.
     * &lt;br/&gt; All these components are seamlessly converged into unified solutions tailored to address a specific
     * support problem area.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @param solutionRequestBody The required request body for this solution resource creation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return solution response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SolutionResourceInner create(String scope, String solutionResourceName, SolutionResourceInner solutionRequestBody,
        Context context);

    /**
     * Get the solution using the applicable solutionResourceName while creating the solution.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the solution using the applicable solutionResourceName while creating the solution along with
     * {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SolutionResourceInner> getWithResponse(String scope, String solutionResourceName, Context context);

    /**
     * Get the solution using the applicable solutionResourceName while creating the solution.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the solution using the applicable solutionResourceName while creating the solution.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SolutionResourceInner get(String scope, String solutionResourceName);

    /**
     * Update the requiredInputs or additional information needed to execute the solution.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of solution response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SolutionResourceInner>, SolutionResourceInner> beginUpdate(String scope,
        String solutionResourceName);

    /**
     * Update the requiredInputs or additional information needed to execute the solution.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @param solutionPatchRequestBody The required request body for updating a solution resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of solution response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SolutionResourceInner>, SolutionResourceInner> beginUpdate(String scope,
        String solutionResourceName, SolutionPatchRequestBody solutionPatchRequestBody, Context context);

    /**
     * Update the requiredInputs or additional information needed to execute the solution.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return solution response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SolutionResourceInner update(String scope, String solutionResourceName);

    /**
     * Update the requiredInputs or additional information needed to execute the solution.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @param solutionPatchRequestBody The required request body for updating a solution resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return solution response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SolutionResourceInner update(String scope, String solutionResourceName,
        SolutionPatchRequestBody solutionPatchRequestBody, Context context);

    /**
     * Warm up the solution resource by preloading asynchronous diagnostics results into cache.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @param solutionWarmUpRequestBody The required request body for warming up a solution resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> warmUpWithResponse(String scope, String solutionResourceName,
        SolutionWarmUpRequestBody solutionWarmUpRequestBody, Context context);

    /**
     * Warm up the solution resource by preloading asynchronous diagnostics results into cache.
     * 
     * @param scope scope = resourceUri of affected resource.&lt;br/&gt; For example:
     * /subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read.
     * @param solutionResourceName Solution resource Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void warmUp(String scope, String solutionResourceName);
}
