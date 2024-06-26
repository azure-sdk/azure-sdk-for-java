// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.notificationhubs.models.ServiceSpecification;

public final class ServiceSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceSpecification model = BinaryData.fromString(
            "{\"logSpecifications\":[{\"name\":\"ibnuqqkpik\",\"displayName\":\"rgvtqag\",\"blobDuration\":\"uynhijg\",\"categoryGroups\":[\"bfs\"]},{\"name\":\"rbu\",\"displayName\":\"cvpnazzmhjrunmpx\",\"blobDuration\":\"dbhrbnlankxm\",\"categoryGroups\":[\"pbh\"]}],\"metricSpecifications\":[{\"name\":\"kcxywnyt\",\"displayName\":\"synlqidybyxczfc\",\"displayDescription\":\"aaxdbabphlwrq\",\"unit\":\"ktsthsucocmny\",\"aggregationType\":\"zt\",\"availabilities\":[{\"timeGrain\":\"wrqpue\",\"blobDuration\":\"kzywbiex\"},{\"timeGrain\":\"eyueaxibxujwb\",\"blobDuration\":\"walm\"}],\"supportedTimeGrainTypes\":[\"oxaepd\"],\"metricFilterPattern\":\"jancu\",\"fillGapWithZero\":true},{\"name\":\"wbavxbniwdj\",\"displayName\":\"zt\",\"displayDescription\":\"bpg\",\"unit\":\"ytxhp\",\"aggregationType\":\"bzpfzab\",\"availabilities\":[{\"timeGrain\":\"hxw\",\"blobDuration\":\"tyq\"}],\"supportedTimeGrainTypes\":[\"bbovplwzbhvgyugu\",\"svmkfssxquk\"],\"metricFilterPattern\":\"plgmgsxnk\",\"fillGapWithZero\":false},{\"name\":\"es\",\"displayName\":\"vlopwiyighx\",\"displayDescription\":\"dwzbaiue\",\"unit\":\"a\",\"aggregationType\":\"nyqupedeojnabck\",\"availabilities\":[{\"timeGrain\":\"xpsiebtfhvpes\",\"blobDuration\":\"skrdqmhjj\"},{\"timeGrain\":\"tldwkyzxuutk\",\"blobDuration\":\"ws\"},{\"timeGrain\":\"svlxotogtwrup\",\"blobDuration\":\"xvnmicykvceov\"}],\"supportedTimeGrainTypes\":[\"ovnotyfjfcnjbkcn\"],\"metricFilterPattern\":\"hbttkphyw\",\"fillGapWithZero\":true},{\"name\":\"t\",\"displayName\":\"nermcl\",\"displayDescription\":\"lphox\",\"unit\":\"crpab\",\"aggregationType\":\"epsbjtazqu\",\"availabilities\":[{\"timeGrain\":\"pmueefjzwfqk\",\"blobDuration\":\"jidsuyonobglaoc\"},{\"timeGrain\":\"tcc\",\"blobDuration\":\"yudxytlmoy\"},{\"timeGrain\":\"vwfudwpzntxhd\",\"blobDuration\":\"lrqjbhckfr\"},{\"timeGrain\":\"rxsbkyvp\",\"blobDuration\":\"anuzbpzkafkuw\"}],\"supportedTimeGrainTypes\":[\"nwbmeh\"],\"metricFilterPattern\":\"eyvjusrtslhspkde\",\"fillGapWithZero\":true}]}")
            .toObject(ServiceSpecification.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceSpecification model = new ServiceSpecification();
        model = BinaryData.fromObject(model).toObject(ServiceSpecification.class);
    }
}
