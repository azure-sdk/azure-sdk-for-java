// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.UpdateSensitivitySettingsRequest;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class UpdateSensitivitySettingsRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateSensitivitySettingsRequest model = BinaryData.fromString(
            "{\"sensitiveInfoTypesIds\":[\"fde11e5e-3b14-45fd-b05d-365c5e3f5237\",\"7d753030-6c2f-4d8d-b546-706531c32365\",\"8f98e6ce-c48b-40bc-a686-d874fe17696a\"],\"sensitivityThresholdLabelOrder\":15.116018,\"sensitivityThresholdLabelId\":\"0a294373-8876-4da0-a6c3-cb6d8efb3957\"}")
            .toObject(UpdateSensitivitySettingsRequest.class);
        Assertions.assertEquals(UUID.fromString("fde11e5e-3b14-45fd-b05d-365c5e3f5237"),
            model.sensitiveInfoTypesIds().get(0));
        Assertions.assertEquals(15.116018F, model.sensitivityThresholdLabelOrder());
        Assertions.assertEquals(UUID.fromString("0a294373-8876-4da0-a6c3-cb6d8efb3957"),
            model.sensitivityThresholdLabelId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateSensitivitySettingsRequest model = new UpdateSensitivitySettingsRequest()
            .withSensitiveInfoTypesIds(Arrays.asList(UUID.fromString("fde11e5e-3b14-45fd-b05d-365c5e3f5237"),
                UUID.fromString("7d753030-6c2f-4d8d-b546-706531c32365"),
                UUID.fromString("8f98e6ce-c48b-40bc-a686-d874fe17696a")))
            .withSensitivityThresholdLabelOrder(15.116018F)
            .withSensitivityThresholdLabelId(UUID.fromString("0a294373-8876-4da0-a6c3-cb6d8efb3957"));
        model = BinaryData.fromObject(model).toObject(UpdateSensitivitySettingsRequest.class);
        Assertions.assertEquals(UUID.fromString("fde11e5e-3b14-45fd-b05d-365c5e3f5237"),
            model.sensitiveInfoTypesIds().get(0));
        Assertions.assertEquals(15.116018F, model.sensitivityThresholdLabelOrder());
        Assertions.assertEquals(UUID.fromString("0a294373-8876-4da0-a6c3-cb6d8efb3957"),
            model.sensitivityThresholdLabelId());
    }
}
