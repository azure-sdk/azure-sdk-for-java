// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ClusterServerInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ClusterServerListResult;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ServerRole;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterServerListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterServerListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"fullyQualifiedDomainName\":\"jgrtfwvukxga\",\"role\":\"Coordinator\",\"state\":\"snhsjcnyejhkryh\",\"haState\":\"apcz\",\"availabilityZone\":\"okjye\",\"postgresqlVersion\":\"kvnipjoxz\",\"citusVersion\":\"chgejspodm\",\"serverEdition\":\"lzydehojwyahux\",\"storageQuotaInMb\":1511051439,\"vCores\":2090543753,\"enableHa\":true,\"enablePublicIpAccess\":true,\"isReadOnly\":true,\"administratorLogin\":\"jsprozvcpute\"},\"id\":\"vwmf\",\"name\":\"atscmd\",\"type\":\"pjhulsuuvmkj\"},{\"properties\":{\"fullyQualifiedDomainName\":\"rwfndiod\",\"role\":\"Worker\",\"state\":\"w\",\"haState\":\"dpvwryoqpsoaccta\",\"availabilityZone\":\"kljla\",\"postgresqlVersion\":\"cr\",\"citusVersion\":\"fdfdosygexpa\",\"serverEdition\":\"akhmsbzjhcrz\",\"storageQuotaInMb\":268305459,\"vCores\":656929943,\"enableHa\":false,\"enablePublicIpAccess\":true,\"isReadOnly\":false,\"administratorLogin\":\"qtrgqjbpfzfsinzg\"},\"id\":\"cjrwzoxxjtfellu\",\"name\":\"fziton\",\"type\":\"eqfpj\"},{\"properties\":{\"fullyQualifiedDomainName\":\"xofpdvhpfxxypi\",\"role\":\"Worker\",\"state\":\"ayhuy\",\"haState\":\"kpode\",\"availabilityZone\":\"oginuvamiheognar\",\"postgresqlVersion\":\"xth\",\"citusVersion\":\"tusivyevcciqihn\",\"serverEdition\":\"ngbwjz\",\"storageQuotaInMb\":1668036347,\"vCores\":670361377,\"enableHa\":true,\"enablePublicIpAccess\":true,\"isReadOnly\":false,\"administratorLogin\":\"vtz\"},\"id\":\"ufubl\",\"name\":\"ofx\",\"type\":\"eofjaeqjh\"}]}")
            .toObject(ClusterServerListResult.class);
        Assertions.assertEquals(ServerRole.COORDINATOR, model.value().get(0).role());
        Assertions.assertEquals("okjye", model.value().get(0).availabilityZone());
        Assertions.assertEquals("kvnipjoxz", model.value().get(0).postgresqlVersion());
        Assertions.assertEquals("chgejspodm", model.value().get(0).citusVersion());
        Assertions.assertEquals("lzydehojwyahux", model.value().get(0).serverEdition());
        Assertions.assertEquals(1511051439, model.value().get(0).storageQuotaInMb());
        Assertions.assertEquals(2090543753, model.value().get(0).vCores());
        Assertions.assertEquals(true, model.value().get(0).enableHa());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterServerListResult model = new ClusterServerListResult().withValue(Arrays.asList(
            new ClusterServerInner().withRole(ServerRole.COORDINATOR)
                .withAvailabilityZone("okjye")
                .withPostgresqlVersion("kvnipjoxz")
                .withCitusVersion("chgejspodm")
                .withServerEdition("lzydehojwyahux")
                .withStorageQuotaInMb(1511051439)
                .withVCores(2090543753)
                .withEnableHa(true),
            new ClusterServerInner().withRole(ServerRole.WORKER)
                .withAvailabilityZone("kljla")
                .withPostgresqlVersion("cr")
                .withCitusVersion("fdfdosygexpa")
                .withServerEdition("akhmsbzjhcrz")
                .withStorageQuotaInMb(268305459)
                .withVCores(656929943)
                .withEnableHa(false),
            new ClusterServerInner().withRole(ServerRole.WORKER)
                .withAvailabilityZone("oginuvamiheognar")
                .withPostgresqlVersion("xth")
                .withCitusVersion("tusivyevcciqihn")
                .withServerEdition("ngbwjz")
                .withStorageQuotaInMb(1668036347)
                .withVCores(670361377)
                .withEnableHa(true)));
        model = BinaryData.fromObject(model).toObject(ClusterServerListResult.class);
        Assertions.assertEquals(ServerRole.COORDINATOR, model.value().get(0).role());
        Assertions.assertEquals("okjye", model.value().get(0).availabilityZone());
        Assertions.assertEquals("kvnipjoxz", model.value().get(0).postgresqlVersion());
        Assertions.assertEquals("chgejspodm", model.value().get(0).citusVersion());
        Assertions.assertEquals("lzydehojwyahux", model.value().get(0).serverEdition());
        Assertions.assertEquals(1511051439, model.value().get(0).storageQuotaInMb());
        Assertions.assertEquals(2090543753, model.value().get(0).vCores());
        Assertions.assertEquals(true, model.value().get(0).enableHa());
    }
}
