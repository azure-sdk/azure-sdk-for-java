// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.NetworkSecurityPerimeterConfigurationInner;
import com.azure.resourcemanager.batch.models.AccessRule;
import com.azure.resourcemanager.batch.models.NetworkSecurityPerimeter;
import com.azure.resourcemanager.batch.models.NetworkSecurityPerimeterConfigurationListResult;
import com.azure.resourcemanager.batch.models.NetworkSecurityPerimeterConfigurationProperties;
import com.azure.resourcemanager.batch.models.NetworkSecurityProfile;
import com.azure.resourcemanager.batch.models.ResourceAssociation;
import com.azure.resourcemanager.batch.models.ResourceAssociationAccessMode;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class NetworkSecurityPerimeterConfigurationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkSecurityPerimeterConfigurationListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Accepted\",\"provisioningIssues\":[{\"name\":\"mokzhjjklf\",\"properties\":{}},{\"name\":\"ouw\",\"properties\":{}},{\"name\":\"zrfze\",\"properties\":{}}],\"networkSecurityPerimeter\":{\"id\":\"izikayuhq\",\"perimeterGuid\":\"50951dba-365f-4f5f-b2ba-56743a8992f6\",\"location\":\"bs\"},\"resourceAssociation\":{\"name\":\"qwrvtldgmfp\",\"accessMode\":\"Learning\"},\"profile\":{\"name\":\"paslthaqfxssmwu\",\"accessRulesVersion\":1363759065,\"accessRules\":[{},{}],\"diagnosticSettingsVersion\":213351747,\"enabledLogCategories\":[\"drhneuyow\",\"kdw\"]}},\"id\":\"i\",\"name\":\"ib\",\"type\":\"rcgp\"},{\"properties\":{\"provisioningState\":\"Deleting\",\"provisioningIssues\":[{\"name\":\"j\",\"properties\":{}},{\"name\":\"lfzxiavrmbzonoki\",\"properties\":{}},{\"name\":\"q\",\"properties\":{}}],\"networkSecurityPerimeter\":{\"id\":\"zpfrla\",\"perimeterGuid\":\"747f6148-6b0a-4c5b-b2d1-83d9f069a620\",\"location\":\"rnwoiindfp\"},\"resourceAssociation\":{\"name\":\"ylwbtlhflsjcdhsz\",\"accessMode\":\"Enforced\"},\"profile\":{\"name\":\"gofel\",\"accessRulesVersion\":940217853,\"accessRules\":[{},{},{}],\"diagnosticSettingsVersion\":720803172,\"enabledLogCategories\":[\"dvriiiojnal\",\"hfkvtvsexsowuel\",\"qhhahhxvrhmzkwpj\",\"wws\"]}},\"id\":\"ghftqsxhqxujxuk\",\"name\":\"dxdigr\",\"type\":\"guufzd\"},{\"properties\":{\"provisioningState\":\"Creating\",\"provisioningIssues\":[{\"name\":\"hwhbotzingamv\",\"properties\":{}}],\"networkSecurityPerimeter\":{\"id\":\"szqzudphqamv\",\"perimeterGuid\":\"4a6db037-f831-43ee-a56b-6267a0519f47\",\"location\":\"wynwcvtbvkayhm\"},\"resourceAssociation\":{\"name\":\"yqiatkzwp\",\"accessMode\":\"Audit\"},\"profile\":{\"name\":\"cjaesgvvs\",\"accessRulesVersion\":1469869368,\"accessRules\":[{}],\"diagnosticSettingsVersion\":306781812,\"enabledLogCategories\":[\"hwyg\",\"lvdnkfx\",\"semdwzrmu\",\"apfcqdpsq\"]}},\"id\":\"vpsvuoymgcce\",\"name\":\"vezrypqlmfeo\",\"type\":\"erqwkyhkobopg\"}],\"nextLink\":\"dkow\"}")
            .toObject(NetworkSecurityPerimeterConfigurationListResult.class);
        Assertions.assertEquals("izikayuhq", model.value().get(0).properties().networkSecurityPerimeter().id());
        Assertions.assertEquals(UUID.fromString("50951dba-365f-4f5f-b2ba-56743a8992f6"),
            model.value().get(0).properties().networkSecurityPerimeter().perimeterGuid());
        Assertions.assertEquals("bs", model.value().get(0).properties().networkSecurityPerimeter().location());
        Assertions.assertEquals("qwrvtldgmfp", model.value().get(0).properties().resourceAssociation().name());
        Assertions.assertEquals(ResourceAssociationAccessMode.LEARNING,
            model.value().get(0).properties().resourceAssociation().accessMode());
        Assertions.assertEquals("paslthaqfxssmwu", model.value().get(0).properties().profile().name());
        Assertions.assertEquals(1363759065, model.value().get(0).properties().profile().accessRulesVersion());
        Assertions.assertEquals(213351747, model.value().get(0).properties().profile().diagnosticSettingsVersion());
        Assertions.assertEquals("drhneuyow", model.value().get(0).properties().profile().enabledLogCategories().get(0));
        Assertions.assertEquals("dkow", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkSecurityPerimeterConfigurationListResult model
            = new NetworkSecurityPerimeterConfigurationListResult()
                .withValue(
                    Arrays
                        .asList(
                            new NetworkSecurityPerimeterConfigurationInner()
                                .withProperties(
                                    new NetworkSecurityPerimeterConfigurationProperties()
                                        .withNetworkSecurityPerimeter(new NetworkSecurityPerimeter().withId("izikayuhq")
                                            .withPerimeterGuid(UUID.fromString("50951dba-365f-4f5f-b2ba-56743a8992f6"))
                                            .withLocation("bs"))
                                        .withResourceAssociation(new ResourceAssociation().withName("qwrvtldgmfp")
                                            .withAccessMode(ResourceAssociationAccessMode.LEARNING))
                                        .withProfile(new NetworkSecurityProfile().withName("paslthaqfxssmwu")
                                            .withAccessRulesVersion(1363759065)
                                            .withAccessRules(Arrays.asList(new AccessRule(), new AccessRule()))
                                            .withDiagnosticSettingsVersion(213351747)
                                            .withEnabledLogCategories(Arrays.asList("drhneuyow", "kdw")))),
                            new NetworkSecurityPerimeterConfigurationInner()
                                .withProperties(new NetworkSecurityPerimeterConfigurationProperties()
                                    .withNetworkSecurityPerimeter(new NetworkSecurityPerimeter().withId("zpfrla")
                                        .withPerimeterGuid(UUID.fromString("747f6148-6b0a-4c5b-b2d1-83d9f069a620"))
                                        .withLocation("rnwoiindfp"))
                                    .withResourceAssociation(new ResourceAssociation().withName("ylwbtlhflsjcdhsz")
                                        .withAccessMode(ResourceAssociationAccessMode.ENFORCED))
                                    .withProfile(new NetworkSecurityProfile().withName("gofel")
                                        .withAccessRulesVersion(940217853)
                                        .withAccessRules(
                                            Arrays.asList(new AccessRule(), new AccessRule(), new AccessRule()))
                                        .withDiagnosticSettingsVersion(720803172)
                                        .withEnabledLogCategories(
                                            Arrays.asList("dvriiiojnal", "hfkvtvsexsowuel", "qhhahhxvrhmzkwpj",
                                                "wws")))),
                            new NetworkSecurityPerimeterConfigurationInner()
                                .withProperties(new NetworkSecurityPerimeterConfigurationProperties()
                                    .withNetworkSecurityPerimeter(new NetworkSecurityPerimeter().withId("szqzudphqamv")
                                        .withPerimeterGuid(UUID.fromString("4a6db037-f831-43ee-a56b-6267a0519f47"))
                                        .withLocation("wynwcvtbvkayhm"))
                                    .withResourceAssociation(new ResourceAssociation().withName("yqiatkzwp")
                                        .withAccessMode(ResourceAssociationAccessMode.AUDIT))
                                    .withProfile(new NetworkSecurityProfile().withName("cjaesgvvs")
                                        .withAccessRulesVersion(1469869368)
                                        .withAccessRules(Arrays.asList(new AccessRule()))
                                        .withDiagnosticSettingsVersion(306781812)
                                        .withEnabledLogCategories(
                                            Arrays.asList("hwyg", "lvdnkfx", "semdwzrmu", "apfcqdpsq"))))))
                .withNextLink("dkow");
        model = BinaryData.fromObject(model).toObject(NetworkSecurityPerimeterConfigurationListResult.class);
        Assertions.assertEquals("izikayuhq", model.value().get(0).properties().networkSecurityPerimeter().id());
        Assertions.assertEquals(UUID.fromString("50951dba-365f-4f5f-b2ba-56743a8992f6"),
            model.value().get(0).properties().networkSecurityPerimeter().perimeterGuid());
        Assertions.assertEquals("bs", model.value().get(0).properties().networkSecurityPerimeter().location());
        Assertions.assertEquals("qwrvtldgmfp", model.value().get(0).properties().resourceAssociation().name());
        Assertions.assertEquals(ResourceAssociationAccessMode.LEARNING,
            model.value().get(0).properties().resourceAssociation().accessMode());
        Assertions.assertEquals("paslthaqfxssmwu", model.value().get(0).properties().profile().name());
        Assertions.assertEquals(1363759065, model.value().get(0).properties().profile().accessRulesVersion());
        Assertions.assertEquals(213351747, model.value().get(0).properties().profile().diagnosticSettingsVersion());
        Assertions.assertEquals("drhneuyow", model.value().get(0).properties().profile().enabledLogCategories().get(0));
        Assertions.assertEquals("dkow", model.nextLink());
    }
}
