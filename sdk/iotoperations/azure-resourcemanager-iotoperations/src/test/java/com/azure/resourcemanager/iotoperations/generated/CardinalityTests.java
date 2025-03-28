// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotoperations.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iotoperations.models.BackendChain;
import com.azure.resourcemanager.iotoperations.models.Cardinality;
import com.azure.resourcemanager.iotoperations.models.Frontend;
import org.junit.jupiter.api.Assertions;

public final class CardinalityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Cardinality model = BinaryData.fromString(
            "{\"backendChain\":{\"partitions\":494775669,\"redundancyFactor\":993666965,\"workers\":230831104},\"frontend\":{\"replicas\":1266013577,\"workers\":1797610507}}")
            .toObject(Cardinality.class);
        Assertions.assertEquals(494775669, model.backendChain().partitions());
        Assertions.assertEquals(993666965, model.backendChain().redundancyFactor());
        Assertions.assertEquals(230831104, model.backendChain().workers());
        Assertions.assertEquals(1266013577, model.frontend().replicas());
        Assertions.assertEquals(1797610507, model.frontend().workers());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Cardinality model = new Cardinality()
            .withBackendChain(
                new BackendChain().withPartitions(494775669).withRedundancyFactor(993666965).withWorkers(230831104))
            .withFrontend(new Frontend().withReplicas(1266013577).withWorkers(1797610507));
        model = BinaryData.fromObject(model).toObject(Cardinality.class);
        Assertions.assertEquals(494775669, model.backendChain().partitions());
        Assertions.assertEquals(993666965, model.backendChain().redundancyFactor());
        Assertions.assertEquals(230831104, model.backendChain().workers());
        Assertions.assertEquals(1266013577, model.frontend().replicas());
        Assertions.assertEquals(1797610507, model.frontend().workers());
    }
}
