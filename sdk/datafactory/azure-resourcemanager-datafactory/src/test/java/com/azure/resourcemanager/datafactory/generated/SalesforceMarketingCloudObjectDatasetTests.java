// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SalesforceMarketingCloudObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SalesforceMarketingCloudObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceMarketingCloudObjectDataset model = BinaryData.fromString(
            "{\"type\":\"SalesforceMarketingCloudObject\",\"typeProperties\":{\"tableName\":\"datadsluokcevoxd\"},\"description\":\"pwmgwxwukfjv\",\"structure\":\"datalaxseisv\",\"schema\":\"datagyphheovejkpalec\",\"linkedServiceName\":{\"referenceName\":\"tlthrt\",\"parameters\":{\"qefnquoll\":\"datavfssrg\",\"qqiehdhjofywwna\":\"datauurmuzem\"}},\"parameters\":{\"slqcxuthv\":{\"type\":\"Int\",\"defaultValue\":\"datarx\"}},\"annotations\":[\"datalyyhrgmabspmlu\",\"datayju\",\"datakedputocrb\",\"datagqicmdrgcuzjmvkr\"],\"folder\":{\"name\":\"cqhgcmljzksqimy\"},\"\":{\"qpvhszopeukufds\":\"datavfiomhc\",\"fsjbpwjwz\":\"databsskgqjemosq\"}}")
            .toObject(SalesforceMarketingCloudObjectDataset.class);
        Assertions.assertEquals("pwmgwxwukfjv", model.description());
        Assertions.assertEquals("tlthrt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("slqcxuthv").type());
        Assertions.assertEquals("cqhgcmljzksqimy", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceMarketingCloudObjectDataset model = new SalesforceMarketingCloudObjectDataset()
            .withDescription("pwmgwxwukfjv")
            .withStructure("datalaxseisv")
            .withSchema("datagyphheovejkpalec")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("tlthrt")
                .withParameters(mapOf("qefnquoll", "datavfssrg", "qqiehdhjofywwna", "datauurmuzem")))
            .withParameters(
                mapOf("slqcxuthv", new ParameterSpecification().withType(ParameterType.INT).withDefaultValue("datarx")))
            .withAnnotations(Arrays.asList("datalyyhrgmabspmlu", "datayju", "datakedputocrb", "datagqicmdrgcuzjmvkr"))
            .withFolder(new DatasetFolder().withName("cqhgcmljzksqimy"))
            .withTableName("datadsluokcevoxd");
        model = BinaryData.fromObject(model).toObject(SalesforceMarketingCloudObjectDataset.class);
        Assertions.assertEquals("pwmgwxwukfjv", model.description());
        Assertions.assertEquals("tlthrt", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.INT, model.parameters().get("slqcxuthv").type());
        Assertions.assertEquals("cqhgcmljzksqimy", model.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
