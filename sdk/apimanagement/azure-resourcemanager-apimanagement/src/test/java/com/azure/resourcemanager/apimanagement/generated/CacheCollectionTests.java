// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.CacheContractInner;
import com.azure.resourcemanager.apimanagement.models.CacheCollection;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class CacheCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CacheCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"description\":\"ltngvmreupt\",\"connectionString\":\"klzmijajw\",\"useFromLocation\":\"l\",\"resourceId\":\"s\"},\"id\":\"aghm\",\"name\":\"ynwlslrcigtzjcv\",\"type\":\"xqlaps\"},{\"properties\":{\"description\":\"ovyxpavidnie\",\"connectionString\":\"wffcvvye\",\"useFromLocation\":\"slpuxgcbdsva\",\"resourceId\":\"nptw\"},\"id\":\"rkxgpazwugxyqvnj\",\"name\":\"bfe\",\"type\":\"hldiuhzzgqlm\"},{\"properties\":{\"description\":\"wz\",\"connectionString\":\"iudjp\",\"useFromLocation\":\"pqht\",\"resourceId\":\"hnmhkrezsdsux\"},\"id\":\"eqdgcruxsp\",\"name\":\"nymmqgwokmikpa\",\"type\":\"fbmjxuvji\"},{\"properties\":{\"description\":\"vhax\",\"connectionString\":\"vwzaehp\",\"useFromLocation\":\"hthdklmvetatlakf\",\"resourceId\":\"ixwgiksbbvtooxrp\"},\"id\":\"gwphchgjtnht\",\"name\":\"kfac\",\"type\":\"hmbfntumeezbxv\"}],\"count\":7030874116360138386,\"nextLink\":\"vwcga\"}")
            .toObject(CacheCollection.class);
        Assertions.assertEquals("ltngvmreupt", model.value().get(0).description());
        Assertions.assertEquals("klzmijajw", model.value().get(0).connectionString());
        Assertions.assertEquals("l", model.value().get(0).useFromLocation());
        Assertions.assertEquals("s", model.value().get(0).resourceId());
        Assertions.assertEquals(7030874116360138386L, model.count());
        Assertions.assertEquals("vwcga", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CacheCollection model = new CacheCollection().withValue(Arrays.asList(
            new CacheContractInner().withDescription("ltngvmreupt")
                .withConnectionString("klzmijajw")
                .withUseFromLocation("l")
                .withResourceId("s"),
            new CacheContractInner().withDescription("ovyxpavidnie")
                .withConnectionString("wffcvvye")
                .withUseFromLocation("slpuxgcbdsva")
                .withResourceId("nptw"),
            new CacheContractInner().withDescription("wz")
                .withConnectionString("iudjp")
                .withUseFromLocation("pqht")
                .withResourceId("hnmhkrezsdsux"),
            new CacheContractInner().withDescription("vhax")
                .withConnectionString("vwzaehp")
                .withUseFromLocation("hthdklmvetatlakf")
                .withResourceId("ixwgiksbbvtooxrp")))
            .withCount(7030874116360138386L)
            .withNextLink("vwcga");
        model = BinaryData.fromObject(model).toObject(CacheCollection.class);
        Assertions.assertEquals("ltngvmreupt", model.value().get(0).description());
        Assertions.assertEquals("klzmijajw", model.value().get(0).connectionString());
        Assertions.assertEquals("l", model.value().get(0).useFromLocation());
        Assertions.assertEquals("s", model.value().get(0).resourceId());
        Assertions.assertEquals(7030874116360138386L, model.count());
        Assertions.assertEquals("vwcga", model.nextLink());
    }
}
