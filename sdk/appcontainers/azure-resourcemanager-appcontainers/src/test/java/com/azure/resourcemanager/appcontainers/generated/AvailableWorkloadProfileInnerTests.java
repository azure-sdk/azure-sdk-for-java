// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.AvailableWorkloadProfileInner;
import com.azure.resourcemanager.appcontainers.models.Applicability;
import com.azure.resourcemanager.appcontainers.models.AvailableWorkloadProfileProperties;
import org.junit.jupiter.api.Assertions;

public final class AvailableWorkloadProfileInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableWorkloadProfileInner model = BinaryData.fromString(
            "{\"location\":\"aoqvuh\",\"properties\":{\"category\":\"f\",\"applicability\":\"LocationDefault\",\"cores\":848102718,\"memoryGiB\":1726993489,\"gpus\":661873212,\"displayName\":\"hjq\"},\"id\":\"pyeicxm\",\"name\":\"ciwqvhk\",\"type\":\"ixuigdtopbobj\"}")
            .toObject(AvailableWorkloadProfileInner.class);
        Assertions.assertEquals("aoqvuh", model.location());
        Assertions.assertEquals("f", model.properties().category());
        Assertions.assertEquals(Applicability.LOCATION_DEFAULT, model.properties().applicability());
        Assertions.assertEquals(848102718, model.properties().cores());
        Assertions.assertEquals(1726993489, model.properties().memoryGiB());
        Assertions.assertEquals(661873212, model.properties().gpus());
        Assertions.assertEquals("hjq", model.properties().displayName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableWorkloadProfileInner model = new AvailableWorkloadProfileInner().withLocation("aoqvuh")
            .withProperties(new AvailableWorkloadProfileProperties().withCategory("f")
                .withApplicability(Applicability.LOCATION_DEFAULT)
                .withCores(848102718)
                .withMemoryGiB(1726993489)
                .withGpus(661873212)
                .withDisplayName("hjq"));
        model = BinaryData.fromObject(model).toObject(AvailableWorkloadProfileInner.class);
        Assertions.assertEquals("aoqvuh", model.location());
        Assertions.assertEquals("f", model.properties().category());
        Assertions.assertEquals(Applicability.LOCATION_DEFAULT, model.properties().applicability());
        Assertions.assertEquals(848102718, model.properties().cores());
        Assertions.assertEquals(1726993489, model.properties().memoryGiB());
        Assertions.assertEquals(661873212, model.properties().gpus());
        Assertions.assertEquals("hjq", model.properties().displayName());
    }
}
