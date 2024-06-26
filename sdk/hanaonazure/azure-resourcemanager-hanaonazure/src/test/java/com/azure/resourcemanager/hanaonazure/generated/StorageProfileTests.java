// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hanaonazure.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hanaonazure.models.Disk;
import com.azure.resourcemanager.hanaonazure.models.SapSystemId;
import com.azure.resourcemanager.hanaonazure.models.StorageProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class StorageProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageProfile model =
            BinaryData
                .fromString(
                    "{\"nfsIpAddress\":\"dsbdkvwrwjf\",\"osDisks\":[{\"name\":\"hutje\",\"diskSizeGB\":1438650135,\"lun\":1403309762}],\"hanaSids\":[{\"gid\":\"gjzzdatqxhocdg\",\"memoryAllocation\":\"blgphuticn\",\"sid\":\"kao\",\"username\":\"yiftyhxhuro\",\"uid\":\"tyxolniwpwc\"},{\"gid\":\"jfkgiawxk\",\"memoryAllocation\":\"ypl\",\"sid\":\"kbasyypn\",\"username\":\"hsgcbacphejkot\",\"uid\":\"qgoulznd\"},{\"gid\":\"kwy\",\"memoryAllocation\":\"gfgibm\",\"sid\":\"gakeqsr\",\"username\":\"bzqqedqytbciq\",\"uid\":\"uflmm\"},{\"gid\":\"zsm\",\"memoryAllocation\":\"mglougpbkw\",\"sid\":\"utduqktapspwgcu\",\"username\":\"tumkdosvqwhbm\",\"uid\":\"bbjfddgmbmbexp\"}]}")
                .toObject(StorageProfile.class);
        Assertions.assertEquals("hutje", model.osDisks().get(0).name());
        Assertions.assertEquals(1438650135, model.osDisks().get(0).diskSizeGB());
        Assertions.assertEquals("gjzzdatqxhocdg", model.hanaSids().get(0).gid());
        Assertions.assertEquals("kao", model.hanaSids().get(0).sid());
        Assertions.assertEquals("yiftyhxhuro", model.hanaSids().get(0).username());
        Assertions.assertEquals("tyxolniwpwc", model.hanaSids().get(0).uid());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageProfile model =
            new StorageProfile()
                .withOsDisks(Arrays.asList(new Disk().withName("hutje").withDiskSizeGB(1438650135)))
                .withHanaSids(
                    Arrays
                        .asList(
                            new SapSystemId()
                                .withGid("gjzzdatqxhocdg")
                                .withSid("kao")
                                .withUsername("yiftyhxhuro")
                                .withUid("tyxolniwpwc"),
                            new SapSystemId()
                                .withGid("jfkgiawxk")
                                .withSid("kbasyypn")
                                .withUsername("hsgcbacphejkot")
                                .withUid("qgoulznd"),
                            new SapSystemId()
                                .withGid("kwy")
                                .withSid("gakeqsr")
                                .withUsername("bzqqedqytbciq")
                                .withUid("uflmm"),
                            new SapSystemId()
                                .withGid("zsm")
                                .withSid("utduqktapspwgcu")
                                .withUsername("tumkdosvqwhbm")
                                .withUid("bbjfddgmbmbexp")));
        model = BinaryData.fromObject(model).toObject(StorageProfile.class);
        Assertions.assertEquals("hutje", model.osDisks().get(0).name());
        Assertions.assertEquals(1438650135, model.osDisks().get(0).diskSizeGB());
        Assertions.assertEquals("gjzzdatqxhocdg", model.hanaSids().get(0).gid());
        Assertions.assertEquals("kao", model.hanaSids().get(0).sid());
        Assertions.assertEquals("yiftyhxhuro", model.hanaSids().get(0).username());
        Assertions.assertEquals("tyxolniwpwc", model.hanaSids().get(0).uid());
    }
}
