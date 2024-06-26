// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.GitLabGroupInner;
import com.azure.resourcemanager.security.fluent.models.GitLabGroupListResponseInner;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.GitLabGroupProperties;
import com.azure.resourcemanager.security.models.OnboardingState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GitLabGroupListResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitLabGroupListResponseInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningStatusMessage\":\"qdktwtkvihlp\",\"provisioningStatusUpdateTimeUtc\":\"2021-02-27T05:27:05Z\",\"provisioningState\":\"DeletionFailure\",\"fullyQualifiedName\":\"nguuzhwvla\",\"fullyQualifiedFriendlyName\":\"cmhjhausybkeky\",\"url\":\"fztsi\",\"onboardingState\":\"NotApplicable\"},\"id\":\"v\",\"name\":\"syeiih\",\"type\":\"ymkouih\"},{\"properties\":{\"provisioningStatusMessage\":\"u\",\"provisioningStatusUpdateTimeUtc\":\"2021-08-18T17:28:52Z\",\"provisioningState\":\"Succeeded\",\"fullyQualifiedName\":\"hogsmgbvmtd\",\"fullyQualifiedFriendlyName\":\"qbe\",\"url\":\"nfvegl\",\"onboardingState\":\"Onboarded\"},\"id\":\"vkbiw\",\"name\":\"nhtfgfi\",\"type\":\"udy\"}],\"nextLink\":\"zpacz\"}")
            .toObject(GitLabGroupListResponseInner.class);
        Assertions.assertEquals(DevOpsProvisioningState.DELETION_FAILURE,
            model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(OnboardingState.NOT_APPLICABLE, model.value().get(0).properties().onboardingState());
        Assertions.assertEquals("zpacz", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitLabGroupListResponseInner model = new GitLabGroupListResponseInner().withValue(Arrays.asList(
            new GitLabGroupInner().withProperties(
                new GitLabGroupProperties().withProvisioningState(DevOpsProvisioningState.DELETION_FAILURE)
                    .withOnboardingState(OnboardingState.NOT_APPLICABLE)),
            new GitLabGroupInner()
                .withProperties(new GitLabGroupProperties().withProvisioningState(DevOpsProvisioningState.SUCCEEDED)
                    .withOnboardingState(OnboardingState.ONBOARDED))))
            .withNextLink("zpacz");
        model = BinaryData.fromObject(model).toObject(GitLabGroupListResponseInner.class);
        Assertions.assertEquals(DevOpsProvisioningState.DELETION_FAILURE,
            model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(OnboardingState.NOT_APPLICABLE, model.value().get(0).properties().onboardingState());
        Assertions.assertEquals("zpacz", model.nextLink());
    }
}
