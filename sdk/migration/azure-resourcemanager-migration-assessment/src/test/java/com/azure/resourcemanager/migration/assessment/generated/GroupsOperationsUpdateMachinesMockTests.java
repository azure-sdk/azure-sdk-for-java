// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager;
import com.azure.resourcemanager.migration.assessment.models.AssessmentType;
import com.azure.resourcemanager.migration.assessment.models.Group;
import com.azure.resourcemanager.migration.assessment.models.GroupBodyProperties;
import com.azure.resourcemanager.migration.assessment.models.GroupType;
import com.azure.resourcemanager.migration.assessment.models.GroupUpdateOperation;
import com.azure.resourcemanager.migration.assessment.models.ProvisioningState;
import com.azure.resourcemanager.migration.assessment.models.UpdateGroupBody;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class GroupsOperationsUpdateMachinesMockTests {
    @Test
    public void testUpdateMachines() throws Exception {
        String responseStr
            = "{\"properties\":{\"groupStatus\":\"Invalid\",\"machineCount\":2066098356,\"assessments\":[\"ulndhzyoeo\",\"ht\",\"llhsvidmyt\",\"l\"],\"supportedAssessmentTypes\":[\"MachineAssessment\",\"Unknown\",\"WebAppAssessment\"],\"areAssessmentsRunning\":true,\"createdTimestamp\":\"2021-03-05T10:18:22Z\",\"updatedTimestamp\":\"2020-12-23T04:34:54Z\",\"groupType\":\"Import\",\"provisioningState\":\"Succeeded\"},\"id\":\"qagywvtxig\",\"name\":\"jrktpgaeukya\",\"type\":\"ohpmwhqn\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MigrationAssessmentManager manager = MigrationAssessmentManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        Group response = manager.groupsOperations()
            .updateMachines("aqktkrumzu", "dkyzbfvxov", "kxiuxqggvqr",
                new UpdateGroupBody().withEtag("yhlwcjsqg")
                    .withProperties(new GroupBodyProperties().withOperationType(GroupUpdateOperation.REMOVE)
                        .withMachines(Arrays.asList("xrqrkijpeuqlsd", "eqztvxwmwwm", "swenawwa"))),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals(ProvisioningState.SUCCEEDED, response.properties().provisioningState());
        Assertions.assertEquals(AssessmentType.MACHINE_ASSESSMENT,
            response.properties().supportedAssessmentTypes().get(0));
        Assertions.assertEquals(GroupType.IMPORT, response.properties().groupType());
    }
}
