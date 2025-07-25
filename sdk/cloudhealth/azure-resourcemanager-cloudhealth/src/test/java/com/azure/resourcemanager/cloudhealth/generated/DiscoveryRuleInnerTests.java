// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.cloudhealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cloudhealth.fluent.models.DiscoveryRuleInner;
import com.azure.resourcemanager.cloudhealth.models.DiscoveryRuleProperties;
import com.azure.resourcemanager.cloudhealth.models.DiscoveryRuleRecommendedSignalsBehavior;
import com.azure.resourcemanager.cloudhealth.models.DiscoveryRuleRelationshipDiscoveryBehavior;
import org.junit.jupiter.api.Assertions;

public final class DiscoveryRuleInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiscoveryRuleInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Failed\",\"displayName\":\"nqxwbp\",\"resourceGraphQuery\":\"kulpiujwaasi\",\"authenticationSetting\":\"qiiobyuqer\",\"discoverRelationships\":\"Disabled\",\"addRecommendedSignals\":\"Enabled\",\"deletionDate\":\"2021-08-06T10:56:27Z\",\"errorMessage\":\"cciuqgbdbutau\",\"numberOfDiscoveredEntities\":1736041382,\"entityName\":\"tkuwhhmhykojo\"},\"id\":\"fnndl\",\"name\":\"ichkoymkcdyhb\",\"type\":\"kkpwdreqnovvq\"}")
            .toObject(DiscoveryRuleInner.class);
        Assertions.assertEquals("nqxwbp", model.properties().displayName());
        Assertions.assertEquals("kulpiujwaasi", model.properties().resourceGraphQuery());
        Assertions.assertEquals("qiiobyuqer", model.properties().authenticationSetting());
        Assertions.assertEquals(DiscoveryRuleRelationshipDiscoveryBehavior.DISABLED,
            model.properties().discoverRelationships());
        Assertions.assertEquals(DiscoveryRuleRecommendedSignalsBehavior.ENABLED,
            model.properties().addRecommendedSignals());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiscoveryRuleInner model
            = new DiscoveryRuleInner().withProperties(new DiscoveryRuleProperties().withDisplayName("nqxwbp")
                .withResourceGraphQuery("kulpiujwaasi")
                .withAuthenticationSetting("qiiobyuqer")
                .withDiscoverRelationships(DiscoveryRuleRelationshipDiscoveryBehavior.DISABLED)
                .withAddRecommendedSignals(DiscoveryRuleRecommendedSignalsBehavior.ENABLED));
        model = BinaryData.fromObject(model).toObject(DiscoveryRuleInner.class);
        Assertions.assertEquals("nqxwbp", model.properties().displayName());
        Assertions.assertEquals("kulpiujwaasi", model.properties().resourceGraphQuery());
        Assertions.assertEquals("qiiobyuqer", model.properties().authenticationSetting());
        Assertions.assertEquals(DiscoveryRuleRelationshipDiscoveryBehavior.DISABLED,
            model.properties().discoverRelationships());
        Assertions.assertEquals(DiscoveryRuleRecommendedSignalsBehavior.ENABLED,
            model.properties().addRecommendedSignals());
    }
}
