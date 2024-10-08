// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.models.DscMetaConfiguration;
import org.junit.jupiter.api.Assertions;

public final class DscMetaConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DscMetaConfiguration model = BinaryData.fromString(
            "{\"configurationModeFrequencyMins\":1593902435,\"rebootNodeIfNeeded\":false,\"configurationMode\":\"tuo\",\"actionAfterReboot\":\"hfuiuaodsfc\",\"certificateId\":\"vxodpu\",\"refreshFrequencyMins\":1447641859,\"allowModuleOverwrite\":true}")
            .toObject(DscMetaConfiguration.class);
        Assertions.assertEquals(1593902435, model.configurationModeFrequencyMins());
        Assertions.assertEquals(false, model.rebootNodeIfNeeded());
        Assertions.assertEquals("tuo", model.configurationMode());
        Assertions.assertEquals("hfuiuaodsfc", model.actionAfterReboot());
        Assertions.assertEquals("vxodpu", model.certificateId());
        Assertions.assertEquals(1447641859, model.refreshFrequencyMins());
        Assertions.assertEquals(true, model.allowModuleOverwrite());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DscMetaConfiguration model = new DscMetaConfiguration().withConfigurationModeFrequencyMins(1593902435)
            .withRebootNodeIfNeeded(false)
            .withConfigurationMode("tuo")
            .withActionAfterReboot("hfuiuaodsfc")
            .withCertificateId("vxodpu")
            .withRefreshFrequencyMins(1447641859)
            .withAllowModuleOverwrite(true);
        model = BinaryData.fromObject(model).toObject(DscMetaConfiguration.class);
        Assertions.assertEquals(1593902435, model.configurationModeFrequencyMins());
        Assertions.assertEquals(false, model.rebootNodeIfNeeded());
        Assertions.assertEquals("tuo", model.configurationMode());
        Assertions.assertEquals("hfuiuaodsfc", model.actionAfterReboot());
        Assertions.assertEquals("vxodpu", model.certificateId());
        Assertions.assertEquals(1447641859, model.refreshFrequencyMins());
        Assertions.assertEquals(true, model.allowModuleOverwrite());
    }
}
