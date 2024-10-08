// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PostgreSqlSource;

public final class PostgreSqlSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PostgreSqlSource model = BinaryData.fromString(
            "{\"type\":\"PostgreSqlSource\",\"query\":\"datayqdhaz\",\"queryTimeout\":\"dataug\",\"additionalColumns\":\"datasovo\",\"sourceRetryCount\":\"dataepkrncjrqhugu\",\"sourceRetryWait\":\"databqq\",\"maxConcurrentConnections\":\"datahcmvdowlqcyhfub\",\"disableMetricsCollection\":\"dataxqxxgrawbftznxfr\",\"\":{\"illjuco\":\"dataefiutbrn\",\"fim\":\"datarbkdieismdk\",\"lmn\":\"dataecij\"}}")
            .toObject(PostgreSqlSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PostgreSqlSource model = new PostgreSqlSource().withSourceRetryCount("dataepkrncjrqhugu")
            .withSourceRetryWait("databqq")
            .withMaxConcurrentConnections("datahcmvdowlqcyhfub")
            .withDisableMetricsCollection("dataxqxxgrawbftznxfr")
            .withQueryTimeout("dataug")
            .withAdditionalColumns("datasovo")
            .withQuery("datayqdhaz");
        model = BinaryData.fromObject(model).toObject(PostgreSqlSource.class);
    }
}
