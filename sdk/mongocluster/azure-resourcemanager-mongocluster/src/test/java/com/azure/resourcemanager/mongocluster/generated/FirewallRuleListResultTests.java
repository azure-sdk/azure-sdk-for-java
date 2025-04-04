// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mongocluster.implementation.models.FirewallRuleListResult;
import org.junit.jupiter.api.Assertions;

public final class FirewallRuleListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FirewallRuleListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Updating\",\"startIpAddress\":\"gbquxigj\",\"endIpAddress\":\"jgzjaoyfhrtx\"},\"id\":\"n\",\"name\":\"rkujy\",\"type\":\"vlejuvfqa\"},{\"properties\":{\"provisioningState\":\"Failed\",\"startIpAddress\":\"xwjkcprbnwbxg\",\"endIpAddress\":\"vtb\"},\"id\":\"ysszdnrujqguh\",\"name\":\"uouq\",\"type\":\"prwzwbnguitnwui\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"startIpAddress\":\"x\",\"endIpAddress\":\"fizuckyf\"},\"id\":\"rfidfvzwdz\",\"name\":\"htymw\",\"type\":\"sdkf\"}],\"nextLink\":\"wxmnteiwao\"}")
            .toObject(FirewallRuleListResult.class);
        Assertions.assertEquals("gbquxigj", model.value().get(0).properties().startIpAddress());
        Assertions.assertEquals("jgzjaoyfhrtx", model.value().get(0).properties().endIpAddress());
        Assertions.assertEquals("wxmnteiwao", model.nextLink());
    }
}
