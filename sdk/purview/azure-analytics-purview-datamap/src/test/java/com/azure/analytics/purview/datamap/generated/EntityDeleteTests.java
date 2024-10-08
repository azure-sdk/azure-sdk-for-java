// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.generated;

import com.azure.analytics.purview.datamap.models.EntityMutationResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public final class EntityDeleteTests extends DataMapClientTestBase {
    @Test
    @Disabled
    public void testEntityDeleteTests() {
        // method invocation
        EntityMutationResult response = entityClient.delete("fd279eb4-f6c3-1b0b-ad67-e4f8abd2972f");

        // response assertion
        Assertions.assertNotNull(response);
        // verify property "mutatedEntities"
        Assertions.assertNotNull(response.getMutatedEntities());
    }
}
