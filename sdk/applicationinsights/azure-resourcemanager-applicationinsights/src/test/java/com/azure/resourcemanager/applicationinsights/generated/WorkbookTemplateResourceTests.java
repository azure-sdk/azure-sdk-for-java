// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.applicationinsights.models.WorkbookTemplateResource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class WorkbookTemplateResourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkbookTemplateResource model = BinaryData.fromString(
            "{\"location\":\"touwaboekqv\",\"tags\":{\"flhhcaal\":\"nsmvbxwyj\"},\"id\":\"jixisxyawjoyaqcs\",\"name\":\"yjpkiidzyexz\",\"type\":\"eli\"}")
            .toObject(WorkbookTemplateResource.class);
        Assertions.assertEquals("touwaboekqv", model.location());
        Assertions.assertEquals("nsmvbxwyj", model.tags().get("flhhcaal"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkbookTemplateResource model
            = new WorkbookTemplateResource().withLocation("touwaboekqv").withTags(mapOf("flhhcaal", "nsmvbxwyj"));
        model = BinaryData.fromObject(model).toObject(WorkbookTemplateResource.class);
        Assertions.assertEquals("touwaboekqv", model.location());
        Assertions.assertEquals("nsmvbxwyj", model.tags().get("flhhcaal"));
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
