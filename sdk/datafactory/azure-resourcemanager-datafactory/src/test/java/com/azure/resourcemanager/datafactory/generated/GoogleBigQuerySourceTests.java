// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.GoogleBigQuerySource;

public final class GoogleBigQuerySourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GoogleBigQuerySource model = BinaryData.fromString(
            "{\"type\":\"GoogleBigQuerySource\",\"query\":\"datawaejxzkqcmddc\",\"queryTimeout\":\"datanxyr\",\"additionalColumns\":\"dataegabsfjrjzdqscgo\",\"sourceRetryCount\":\"datagd\",\"sourceRetryWait\":\"dataepgfrb\",\"maxConcurrentConnections\":\"dataoeh\",\"disableMetricsCollection\":\"datawwsgqziwo\",\"\":{\"okckxfk\":\"datawjssyazmmbuxq\",\"qf\":\"datatqkbyruheawuc\",\"jguwts\":\"datarbtbogxlyvebv\"}}")
            .toObject(GoogleBigQuerySource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GoogleBigQuerySource model = new GoogleBigQuerySource().withSourceRetryCount("datagd")
            .withSourceRetryWait("dataepgfrb")
            .withMaxConcurrentConnections("dataoeh")
            .withDisableMetricsCollection("datawwsgqziwo")
            .withQueryTimeout("datanxyr")
            .withAdditionalColumns("dataegabsfjrjzdqscgo")
            .withQuery("datawaejxzkqcmddc");
        model = BinaryData.fromObject(model).toObject(GoogleBigQuerySource.class);
    }
}
