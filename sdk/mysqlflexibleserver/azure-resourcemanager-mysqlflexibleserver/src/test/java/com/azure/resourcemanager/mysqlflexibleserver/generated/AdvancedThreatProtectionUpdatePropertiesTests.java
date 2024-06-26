// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.AdvancedThreatProtectionUpdateProperties;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdvancedThreatProtectionState;
import org.junit.jupiter.api.Assertions;

public final class AdvancedThreatProtectionUpdatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AdvancedThreatProtectionUpdateProperties model
            = BinaryData.fromString("{\"state\":\"Enabled\"}").toObject(AdvancedThreatProtectionUpdateProperties.class);
        Assertions.assertEquals(AdvancedThreatProtectionState.ENABLED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AdvancedThreatProtectionUpdateProperties model
            = new AdvancedThreatProtectionUpdateProperties().withState(AdvancedThreatProtectionState.ENABLED);
        model = BinaryData.fromObject(model).toObject(AdvancedThreatProtectionUpdateProperties.class);
        Assertions.assertEquals(AdvancedThreatProtectionState.ENABLED, model.state());
    }
}
