// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.models.AutomationRuleModifyPropertiesAction;
import com.azure.resourcemanager.securityinsights.models.IncidentClassification;
import com.azure.resourcemanager.securityinsights.models.IncidentClassificationReason;
import com.azure.resourcemanager.securityinsights.models.IncidentLabel;
import com.azure.resourcemanager.securityinsights.models.IncidentOwnerInfo;
import com.azure.resourcemanager.securityinsights.models.IncidentPropertiesAction;
import com.azure.resourcemanager.securityinsights.models.IncidentSeverity;
import com.azure.resourcemanager.securityinsights.models.IncidentStatus;
import com.azure.resourcemanager.securityinsights.models.OwnerType;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class AutomationRuleModifyPropertiesActionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutomationRuleModifyPropertiesAction model = BinaryData.fromString(
            "{\"actionType\":\"ModifyProperties\",\"actionConfiguration\":{\"severity\":\"Informational\",\"status\":\"New\",\"classification\":\"TruePositive\",\"classificationReason\":\"SuspiciousActivity\",\"classificationComment\":\"mrsieekp\",\"owner\":{\"email\":\"aapm\",\"assignedTo\":\"qmeqwigpibudqwyx\",\"objectId\":\"c20b53ae-8fa6-4963-bb1b-69b6dad0a3c5\",\"userPrincipalName\":\"ybpmzznrtffyaq\",\"ownerType\":\"Unknown\"},\"labels\":[{\"labelName\":\"eioqaqhvse\",\"labelType\":\"User\"},{\"labelName\":\"qyrxp\",\"labelType\":\"User\"}]},\"order\":801625089}")
            .toObject(AutomationRuleModifyPropertiesAction.class);
        Assertions.assertEquals(801625089, model.order());
        Assertions.assertEquals(IncidentSeverity.INFORMATIONAL, model.actionConfiguration().severity());
        Assertions.assertEquals(IncidentStatus.NEW, model.actionConfiguration().status());
        Assertions.assertEquals(IncidentClassification.TRUE_POSITIVE, model.actionConfiguration().classification());
        Assertions.assertEquals(IncidentClassificationReason.SUSPICIOUS_ACTIVITY,
            model.actionConfiguration().classificationReason());
        Assertions.assertEquals("mrsieekp", model.actionConfiguration().classificationComment());
        Assertions.assertEquals("aapm", model.actionConfiguration().owner().email());
        Assertions.assertEquals("qmeqwigpibudqwyx", model.actionConfiguration().owner().assignedTo());
        Assertions.assertEquals(UUID.fromString("c20b53ae-8fa6-4963-bb1b-69b6dad0a3c5"),
            model.actionConfiguration().owner().objectId());
        Assertions.assertEquals("ybpmzznrtffyaq", model.actionConfiguration().owner().userPrincipalName());
        Assertions.assertEquals(OwnerType.UNKNOWN, model.actionConfiguration().owner().ownerType());
        Assertions.assertEquals("eioqaqhvse", model.actionConfiguration().labels().get(0).labelName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutomationRuleModifyPropertiesAction model = new AutomationRuleModifyPropertiesAction().withOrder(801625089)
            .withActionConfiguration(new IncidentPropertiesAction().withSeverity(IncidentSeverity.INFORMATIONAL)
                .withStatus(IncidentStatus.NEW)
                .withClassification(IncidentClassification.TRUE_POSITIVE)
                .withClassificationReason(IncidentClassificationReason.SUSPICIOUS_ACTIVITY)
                .withClassificationComment("mrsieekp")
                .withOwner(new IncidentOwnerInfo().withEmail("aapm")
                    .withAssignedTo("qmeqwigpibudqwyx")
                    .withObjectId(UUID.fromString("c20b53ae-8fa6-4963-bb1b-69b6dad0a3c5"))
                    .withUserPrincipalName("ybpmzznrtffyaq")
                    .withOwnerType(OwnerType.UNKNOWN))
                .withLabels(Arrays.asList(new IncidentLabel().withLabelName("eioqaqhvse"),
                    new IncidentLabel().withLabelName("qyrxp"))));
        model = BinaryData.fromObject(model).toObject(AutomationRuleModifyPropertiesAction.class);
        Assertions.assertEquals(801625089, model.order());
        Assertions.assertEquals(IncidentSeverity.INFORMATIONAL, model.actionConfiguration().severity());
        Assertions.assertEquals(IncidentStatus.NEW, model.actionConfiguration().status());
        Assertions.assertEquals(IncidentClassification.TRUE_POSITIVE, model.actionConfiguration().classification());
        Assertions.assertEquals(IncidentClassificationReason.SUSPICIOUS_ACTIVITY,
            model.actionConfiguration().classificationReason());
        Assertions.assertEquals("mrsieekp", model.actionConfiguration().classificationComment());
        Assertions.assertEquals("aapm", model.actionConfiguration().owner().email());
        Assertions.assertEquals("qmeqwigpibudqwyx", model.actionConfiguration().owner().assignedTo());
        Assertions.assertEquals(UUID.fromString("c20b53ae-8fa6-4963-bb1b-69b6dad0a3c5"),
            model.actionConfiguration().owner().objectId());
        Assertions.assertEquals("ybpmzznrtffyaq", model.actionConfiguration().owner().userPrincipalName());
        Assertions.assertEquals(OwnerType.UNKNOWN, model.actionConfiguration().owner().ownerType());
        Assertions.assertEquals("eioqaqhvse", model.actionConfiguration().labels().get(0).labelName());
    }
}
