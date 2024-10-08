// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.extendedlocation.fluent.models.EnabledResourceTypeProperties;
import com.azure.resourcemanager.extendedlocation.models.EnabledResourceTypePropertiesTypesMetadataItem;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EnabledResourceTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnabledResourceTypeProperties model = BinaryData.fromString(
            "{\"clusterExtensionId\":\"vpmouexhdzxib\",\"extensionType\":\"ojnxqbzvdd\",\"typesMetadata\":[{\"apiVersion\":\"deicbtwnpzao\",\"resourceProviderNamespace\":\"uhrhcffcyddgl\",\"resourceType\":\"t\"},{\"apiVersion\":\"qkwpyeicxmqc\",\"resourceProviderNamespace\":\"q\",\"resourceType\":\"khixuigdtopbo\"},{\"apiVersion\":\"og\",\"resourceProviderNamespace\":\"e\",\"resourceType\":\"a\"}]}")
            .toObject(EnabledResourceTypeProperties.class);
        Assertions.assertEquals("vpmouexhdzxib", model.clusterExtensionId());
        Assertions.assertEquals("ojnxqbzvdd", model.extensionType());
        Assertions.assertEquals("deicbtwnpzao", model.typesMetadata().get(0).apiVersion());
        Assertions.assertEquals("uhrhcffcyddgl", model.typesMetadata().get(0).resourceProviderNamespace());
        Assertions.assertEquals("t", model.typesMetadata().get(0).resourceType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnabledResourceTypeProperties model
            = new EnabledResourceTypeProperties().withClusterExtensionId("vpmouexhdzxib")
                .withExtensionType("ojnxqbzvdd")
                .withTypesMetadata(Arrays.asList(
                    new EnabledResourceTypePropertiesTypesMetadataItem().withApiVersion("deicbtwnpzao")
                        .withResourceProviderNamespace("uhrhcffcyddgl")
                        .withResourceType("t"),
                    new EnabledResourceTypePropertiesTypesMetadataItem().withApiVersion("qkwpyeicxmqc")
                        .withResourceProviderNamespace("q")
                        .withResourceType("khixuigdtopbo"),
                    new EnabledResourceTypePropertiesTypesMetadataItem().withApiVersion("og")
                        .withResourceProviderNamespace("e")
                        .withResourceType("a")));
        model = BinaryData.fromObject(model).toObject(EnabledResourceTypeProperties.class);
        Assertions.assertEquals("vpmouexhdzxib", model.clusterExtensionId());
        Assertions.assertEquals("ojnxqbzvdd", model.extensionType());
        Assertions.assertEquals("deicbtwnpzao", model.typesMetadata().get(0).apiVersion());
        Assertions.assertEquals("uhrhcffcyddgl", model.typesMetadata().get(0).resourceProviderNamespace());
        Assertions.assertEquals("t", model.typesMetadata().get(0).resourceType());
    }
}
