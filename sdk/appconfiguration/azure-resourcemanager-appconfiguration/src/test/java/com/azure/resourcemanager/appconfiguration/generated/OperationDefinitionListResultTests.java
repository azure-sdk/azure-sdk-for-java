// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appconfiguration.fluent.models.OperationDefinitionInner;
import com.azure.resourcemanager.appconfiguration.models.LogSpecification;
import com.azure.resourcemanager.appconfiguration.models.MetricSpecification;
import com.azure.resourcemanager.appconfiguration.models.OperationDefinitionDisplay;
import com.azure.resourcemanager.appconfiguration.models.OperationDefinitionListResult;
import com.azure.resourcemanager.appconfiguration.models.OperationProperties;
import com.azure.resourcemanager.appconfiguration.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationDefinitionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDefinitionListResult model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"inqpjwnzll\",\"isDataAction\":true,\"display\":{\"provider\":\"eebvmgxsab\",\"resource\":\"qduujitcjczdz\",\"operation\":\"ndhkrw\",\"description\":\"appd\"},\"origin\":\"dkvwrwjfe\",\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{},{},{},{}],\"metricSpecifications\":[{}]}}},{\"name\":\"ltmrldh\",\"isDataAction\":false,\"display\":{\"provider\":\"datqxhocdgeabl\",\"resource\":\"huticndvkao\",\"operation\":\"yiftyhxhuro\",\"description\":\"tyxolniwpwc\"},\"origin\":\"jfkgiawxk\",\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{},{},{},{}],\"metricSpecifications\":[{},{},{}]}}},{\"name\":\"basyy\",\"isDataAction\":true,\"display\":{\"provider\":\"sgcbac\",\"resource\":\"ejk\",\"operation\":\"ynqgoulzndlikwyq\",\"description\":\"fgibmadgakeq\"},\"origin\":\"xybz\",\"properties\":{\"serviceSpecification\":{\"logSpecifications\":[{},{}],\"metricSpecifications\":[{},{},{}]}}}],\"nextLink\":\"ciqfou\"}")
            .toObject(OperationDefinitionListResult.class);
        Assertions.assertEquals("inqpjwnzll", model.value().get(0).name());
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("qduujitcjczdz", model.value().get(0).display().resource());
        Assertions.assertEquals("ndhkrw", model.value().get(0).display().operation());
        Assertions.assertEquals("appd", model.value().get(0).display().description());
        Assertions.assertEquals("dkvwrwjfe", model.value().get(0).origin());
        Assertions.assertEquals("ciqfou", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDefinitionListResult model = new OperationDefinitionListResult().withValue(Arrays.asList(
            new OperationDefinitionInner().withName("inqpjwnzll")
                .withIsDataAction(true)
                .withDisplay(new OperationDefinitionDisplay().withResource("qduujitcjczdz")
                    .withOperation("ndhkrw")
                    .withDescription("appd"))
                .withOrigin("dkvwrwjfe")
                .withProperties(new OperationProperties().withServiceSpecification(new ServiceSpecification()
                    .withLogSpecifications(Arrays.asList(new LogSpecification(), new LogSpecification(),
                        new LogSpecification(), new LogSpecification()))
                    .withMetricSpecifications(Arrays.asList(new MetricSpecification())))),
            new OperationDefinitionInner().withName("ltmrldh")
                .withIsDataAction(false)
                .withDisplay(new OperationDefinitionDisplay().withResource("huticndvkao")
                    .withOperation("yiftyhxhuro")
                    .withDescription("tyxolniwpwc"))
                .withOrigin("jfkgiawxk")
                .withProperties(new OperationProperties().withServiceSpecification(new ServiceSpecification()
                    .withLogSpecifications(Arrays.asList(new LogSpecification(), new LogSpecification(),
                        new LogSpecification(), new LogSpecification()))
                    .withMetricSpecifications(Arrays.asList(new MetricSpecification(), new MetricSpecification(),
                        new MetricSpecification())))),
            new OperationDefinitionInner().withName("basyy")
                .withIsDataAction(true)
                .withDisplay(new OperationDefinitionDisplay().withResource("ejk")
                    .withOperation("ynqgoulzndlikwyq")
                    .withDescription("fgibmadgakeq"))
                .withOrigin("xybz")
                .withProperties(new OperationProperties().withServiceSpecification(new ServiceSpecification()
                    .withLogSpecifications(Arrays.asList(new LogSpecification(), new LogSpecification()))
                    .withMetricSpecifications(Arrays.asList(new MetricSpecification(), new MetricSpecification(),
                        new MetricSpecification()))))))
            .withNextLink("ciqfou");
        model = BinaryData.fromObject(model).toObject(OperationDefinitionListResult.class);
        Assertions.assertEquals("inqpjwnzll", model.value().get(0).name());
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
        Assertions.assertEquals("qduujitcjczdz", model.value().get(0).display().resource());
        Assertions.assertEquals("ndhkrw", model.value().get(0).display().operation());
        Assertions.assertEquals("appd", model.value().get(0).display().description());
        Assertions.assertEquals("dkvwrwjfe", model.value().get(0).origin());
        Assertions.assertEquals("ciqfou", model.nextLink());
    }
}
