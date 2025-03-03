// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.purview.models.DimensionProperties;
import com.azure.resourcemanager.purview.models.OperationMetaMetricSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationMetaMetricSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationMetaMetricSpecification model = BinaryData.fromString(
            "{\"aggregationType\":\"aqtdoqmcbx\",\"dimensions\":[{\"displayName\":\"yslqbhsfx\",\"name\":\"lyt\",\"toBeExportedForCustomer\":true},{\"displayName\":\"pe\",\"name\":\"wfbkrvrns\",\"toBeExportedForCustomer\":true}],\"displayDescription\":\"johxcrsb\",\"displayName\":\"vasrruvwb\",\"enableRegionalMdmAccount\":\"qfsubcgjbirx\",\"internalMetricName\":\"ybsrfbjfdtwss\",\"name\":\"ftpvjzbexil\",\"resourceIdDimensionNameOverride\":\"nfqqnvwp\",\"sourceMdmNamespace\":\"taruoujmkcj\",\"supportedAggregationTypes\":[\"ytjrybnwjewgdr\",\"ervnaenqpehi\",\"doy\",\"mifthnzdnd\"],\"supportedTimeGrainTypes\":[\"nayqi\",\"ynduha\",\"hqlkthumaqo\"],\"unit\":\"gycdu\"}")
            .toObject(OperationMetaMetricSpecification.class);
        Assertions.assertEquals("aqtdoqmcbx", model.aggregationType());
        Assertions.assertEquals("yslqbhsfx", model.dimensions().get(0).displayName());
        Assertions.assertEquals("lyt", model.dimensions().get(0).name());
        Assertions.assertEquals(true, model.dimensions().get(0).toBeExportedForCustomer());
        Assertions.assertEquals("johxcrsb", model.displayDescription());
        Assertions.assertEquals("vasrruvwb", model.displayName());
        Assertions.assertEquals("qfsubcgjbirx", model.enableRegionalMdmAccount());
        Assertions.assertEquals("ybsrfbjfdtwss", model.internalMetricName());
        Assertions.assertEquals("ftpvjzbexil", model.name());
        Assertions.assertEquals("nfqqnvwp", model.resourceIdDimensionNameOverride());
        Assertions.assertEquals("taruoujmkcj", model.sourceMdmNamespace());
        Assertions.assertEquals("ytjrybnwjewgdr", model.supportedAggregationTypes().get(0));
        Assertions.assertEquals("nayqi", model.supportedTimeGrainTypes().get(0));
        Assertions.assertEquals("gycdu", model.unit());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationMetaMetricSpecification model
            = new OperationMetaMetricSpecification().withAggregationType("aqtdoqmcbx")
                .withDimensions(Arrays.asList(
                    new DimensionProperties().withDisplayName("yslqbhsfx")
                        .withName("lyt")
                        .withToBeExportedForCustomer(true),
                    new DimensionProperties().withDisplayName("pe")
                        .withName("wfbkrvrns")
                        .withToBeExportedForCustomer(true)))
                .withDisplayDescription("johxcrsb")
                .withDisplayName("vasrruvwb")
                .withEnableRegionalMdmAccount("qfsubcgjbirx")
                .withInternalMetricName("ybsrfbjfdtwss")
                .withName("ftpvjzbexil")
                .withResourceIdDimensionNameOverride("nfqqnvwp")
                .withSourceMdmNamespace("taruoujmkcj")
                .withSupportedAggregationTypes(Arrays.asList("ytjrybnwjewgdr", "ervnaenqpehi", "doy", "mifthnzdnd"))
                .withSupportedTimeGrainTypes(Arrays.asList("nayqi", "ynduha", "hqlkthumaqo"))
                .withUnit("gycdu");
        model = BinaryData.fromObject(model).toObject(OperationMetaMetricSpecification.class);
        Assertions.assertEquals("aqtdoqmcbx", model.aggregationType());
        Assertions.assertEquals("yslqbhsfx", model.dimensions().get(0).displayName());
        Assertions.assertEquals("lyt", model.dimensions().get(0).name());
        Assertions.assertEquals(true, model.dimensions().get(0).toBeExportedForCustomer());
        Assertions.assertEquals("johxcrsb", model.displayDescription());
        Assertions.assertEquals("vasrruvwb", model.displayName());
        Assertions.assertEquals("qfsubcgjbirx", model.enableRegionalMdmAccount());
        Assertions.assertEquals("ybsrfbjfdtwss", model.internalMetricName());
        Assertions.assertEquals("ftpvjzbexil", model.name());
        Assertions.assertEquals("nfqqnvwp", model.resourceIdDimensionNameOverride());
        Assertions.assertEquals("taruoujmkcj", model.sourceMdmNamespace());
        Assertions.assertEquals("ytjrybnwjewgdr", model.supportedAggregationTypes().get(0));
        Assertions.assertEquals("nayqi", model.supportedTimeGrainTypes().get(0));
        Assertions.assertEquals("gycdu", model.unit());
    }
}
