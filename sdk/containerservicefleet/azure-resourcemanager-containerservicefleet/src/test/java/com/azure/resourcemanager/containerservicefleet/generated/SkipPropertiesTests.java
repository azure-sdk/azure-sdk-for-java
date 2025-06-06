// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.SkipProperties;
import com.azure.resourcemanager.containerservicefleet.models.SkipTarget;
import com.azure.resourcemanager.containerservicefleet.models.TargetType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SkipPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SkipProperties model = BinaryData.fromString(
            "{\"targets\":[{\"type\":\"Group\",\"name\":\"yexfwh\"},{\"type\":\"AfterStageWait\",\"name\":\"cibvyvdcsitynn\"}]}")
            .toObject(SkipProperties.class);
        Assertions.assertEquals(TargetType.GROUP, model.targets().get(0).type());
        Assertions.assertEquals("yexfwh", model.targets().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SkipProperties model = new SkipProperties()
            .withTargets(Arrays.asList(new SkipTarget().withType(TargetType.GROUP).withName("yexfwh"),
                new SkipTarget().withType(TargetType.AFTER_STAGE_WAIT).withName("cibvyvdcsitynn")));
        model = BinaryData.fromObject(model).toObject(SkipProperties.class);
        Assertions.assertEquals(TargetType.GROUP, model.targets().get(0).type());
        Assertions.assertEquals("yexfwh", model.targets().get(0).name());
    }
}
