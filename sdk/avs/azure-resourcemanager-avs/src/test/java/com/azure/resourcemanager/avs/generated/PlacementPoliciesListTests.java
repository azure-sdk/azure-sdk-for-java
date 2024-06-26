// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.PlacementPolicyInner;
import com.azure.resourcemanager.avs.models.PlacementPoliciesList;
import com.azure.resourcemanager.avs.models.PlacementPolicyProperties;
import com.azure.resourcemanager.avs.models.PlacementPolicyState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PlacementPoliciesListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PlacementPoliciesList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"type\":\"PlacementPolicyProperties\",\"state\":\"Disabled\",\"displayName\":\"ebrjcxe\",\"provisioningState\":\"Failed\"},\"id\":\"utttxfvjrbirp\",\"name\":\"xepcyvahfn\",\"type\":\"jky\"},{\"properties\":{\"type\":\"PlacementPolicyProperties\",\"state\":\"Enabled\",\"displayName\":\"ujqgidok\",\"provisioningState\":\"Failed\"},\"id\":\"yoxgvcltbgsnc\",\"name\":\"hkjeszzhbi\",\"type\":\"htxfvgxbfsmxnehm\"}],\"nextLink\":\"ec\"}")
            .toObject(PlacementPoliciesList.class);
        Assertions.assertEquals(PlacementPolicyState.DISABLED, model.value().get(0).properties().state());
        Assertions.assertEquals("ebrjcxe", model.value().get(0).properties().displayName());
        Assertions.assertEquals("ec", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PlacementPoliciesList model = new PlacementPoliciesList().withValue(Arrays.asList(
            new PlacementPolicyInner().withProperties(
                new PlacementPolicyProperties().withState(PlacementPolicyState.DISABLED).withDisplayName("ebrjcxe")),
            new PlacementPolicyInner().withProperties(
                new PlacementPolicyProperties().withState(PlacementPolicyState.ENABLED).withDisplayName("ujqgidok"))))
            .withNextLink("ec");
        model = BinaryData.fromObject(model).toObject(PlacementPoliciesList.class);
        Assertions.assertEquals(PlacementPolicyState.DISABLED, model.value().get(0).properties().state());
        Assertions.assertEquals("ebrjcxe", model.value().get(0).properties().displayName());
        Assertions.assertEquals("ec", model.nextLink());
    }
}
