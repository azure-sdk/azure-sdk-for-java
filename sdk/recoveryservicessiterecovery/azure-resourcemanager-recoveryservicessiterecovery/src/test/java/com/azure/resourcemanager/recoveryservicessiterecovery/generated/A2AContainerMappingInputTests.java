// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.A2AContainerMappingInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AgentAutoUpdateStatus;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AutomationAccountAuthenticationType;
import org.junit.jupiter.api.Assertions;

public final class A2AContainerMappingInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        A2AContainerMappingInput model = BinaryData.fromString(
            "{\"instanceType\":\"A2A\",\"agentAutoUpdateStatus\":\"Disabled\",\"automationAccountArmId\":\"qfblhkalehpa\",\"automationAccountAuthenticationType\":\"RunAsAccount\"}")
            .toObject(A2AContainerMappingInput.class);
        Assertions.assertEquals(AgentAutoUpdateStatus.DISABLED, model.agentAutoUpdateStatus());
        Assertions.assertEquals("qfblhkalehpa", model.automationAccountArmId());
        Assertions.assertEquals(AutomationAccountAuthenticationType.RUN_AS_ACCOUNT,
            model.automationAccountAuthenticationType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        A2AContainerMappingInput model
            = new A2AContainerMappingInput().withAgentAutoUpdateStatus(AgentAutoUpdateStatus.DISABLED)
                .withAutomationAccountArmId("qfblhkalehpa")
                .withAutomationAccountAuthenticationType(AutomationAccountAuthenticationType.RUN_AS_ACCOUNT);
        model = BinaryData.fromObject(model).toObject(A2AContainerMappingInput.class);
        Assertions.assertEquals(AgentAutoUpdateStatus.DISABLED, model.agentAutoUpdateStatus());
        Assertions.assertEquals("qfblhkalehpa", model.automationAccountArmId());
        Assertions.assertEquals(AutomationAccountAuthenticationType.RUN_AS_ACCOUNT,
            model.automationAccountAuthenticationType());
    }
}
