// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.ContainerAppJobExecutionsInner;
import com.azure.resourcemanager.appcontainers.fluent.models.JobExecutionInner;
import com.azure.resourcemanager.appcontainers.models.JobExecutionContainer;
import com.azure.resourcemanager.appcontainers.models.JobExecutionTemplate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ContainerAppJobExecutionsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContainerAppJobExecutionsInner model = BinaryData.fromString(
            "{\"value\":[{\"name\":\"erteeammxqiekk\",\"id\":\"ddrtkgdojb\",\"type\":\"vavrefdees\",\"properties\":{\"status\":\"Succeeded\",\"startTime\":\"2021-07-23T13:42:28Z\",\"endTime\":\"2021-08-23T12:07:03Z\",\"template\":{\"containers\":[{}],\"initContainers\":[{},{}]}}},{\"name\":\"rtujwsawddjibab\",\"id\":\"ititvtzeexavoxt\",\"type\":\"lecdmdqbw\",\"properties\":{\"status\":\"Running\",\"startTime\":\"2021-11-30T11:49:15Z\",\"endTime\":\"2021-06-26T00:13:12Z\",\"template\":{\"containers\":[{},{}],\"initContainers\":[{},{},{}]}}},{\"name\":\"hhxud\",\"id\":\"vodhtn\",\"type\":\"rudhzmmesckdl\",\"properties\":{\"status\":\"Degraded\",\"startTime\":\"2021-07-08T07:35:07Z\",\"endTime\":\"2021-09-27T03:23:27Z\",\"template\":{\"containers\":[{}],\"initContainers\":[{}]}}}],\"nextLink\":\"wmdboxdfgsftuf\"}")
            .toObject(ContainerAppJobExecutionsInner.class);
        Assertions.assertEquals("erteeammxqiekk", model.value().get(0).name());
        Assertions.assertEquals("ddrtkgdojb", model.value().get(0).id());
        Assertions.assertEquals("vavrefdees", model.value().get(0).type());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-23T13:42:28Z"), model.value().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-23T12:07:03Z"), model.value().get(0).endTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContainerAppJobExecutionsInner model = new ContainerAppJobExecutionsInner().withValue(Arrays.asList(
            new JobExecutionInner().withName("erteeammxqiekk")
                .withId("ddrtkgdojb")
                .withType("vavrefdees")
                .withStartTime(OffsetDateTime.parse("2021-07-23T13:42:28Z"))
                .withEndTime(OffsetDateTime.parse("2021-08-23T12:07:03Z"))
                .withTemplate(new JobExecutionTemplate().withContainers(Arrays.asList(new JobExecutionContainer()))
                    .withInitContainers(Arrays.asList(new JobExecutionContainer(), new JobExecutionContainer()))),
            new JobExecutionInner().withName("rtujwsawddjibab")
                .withId("ititvtzeexavoxt")
                .withType("lecdmdqbw")
                .withStartTime(OffsetDateTime.parse("2021-11-30T11:49:15Z"))
                .withEndTime(OffsetDateTime.parse("2021-06-26T00:13:12Z"))
                .withTemplate(new JobExecutionTemplate()
                    .withContainers(Arrays.asList(new JobExecutionContainer(), new JobExecutionContainer()))
                    .withInitContainers(Arrays.asList(new JobExecutionContainer(), new JobExecutionContainer(),
                        new JobExecutionContainer()))),
            new JobExecutionInner().withName("hhxud")
                .withId("vodhtn")
                .withType("rudhzmmesckdl")
                .withStartTime(OffsetDateTime.parse("2021-07-08T07:35:07Z"))
                .withEndTime(OffsetDateTime.parse("2021-09-27T03:23:27Z"))
                .withTemplate(new JobExecutionTemplate().withContainers(Arrays.asList(new JobExecutionContainer()))
                    .withInitContainers(Arrays.asList(new JobExecutionContainer())))));
        model = BinaryData.fromObject(model).toObject(ContainerAppJobExecutionsInner.class);
        Assertions.assertEquals("erteeammxqiekk", model.value().get(0).name());
        Assertions.assertEquals("ddrtkgdojb", model.value().get(0).id());
        Assertions.assertEquals("vavrefdees", model.value().get(0).type());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-23T13:42:28Z"), model.value().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-23T12:07:03Z"), model.value().get(0).endTime());
    }
}
