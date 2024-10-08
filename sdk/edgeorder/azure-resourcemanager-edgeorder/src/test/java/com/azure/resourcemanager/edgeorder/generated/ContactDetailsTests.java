// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.edgeorder.models.ContactDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ContactDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContactDetails model = BinaryData.fromString(
            "{\"contactName\":\"zfsinzgvf\",\"phone\":\"jrwzox\",\"phoneExtension\":\"tfell\",\"mobile\":\"fziton\",\"emailList\":[\"qfpjk\",\"lxofpdvhpfxxypin\"]}")
            .toObject(ContactDetails.class);
        Assertions.assertEquals("zfsinzgvf", model.contactName());
        Assertions.assertEquals("jrwzox", model.phone());
        Assertions.assertEquals("tfell", model.phoneExtension());
        Assertions.assertEquals("fziton", model.mobile());
        Assertions.assertEquals("qfpjk", model.emailList().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContactDetails model = new ContactDetails().withContactName("zfsinzgvf")
            .withPhone("jrwzox")
            .withPhoneExtension("tfell")
            .withMobile("fziton")
            .withEmailList(Arrays.asList("qfpjk", "lxofpdvhpfxxypin"));
        model = BinaryData.fromObject(model).toObject(ContactDetails.class);
        Assertions.assertEquals("zfsinzgvf", model.contactName());
        Assertions.assertEquals("jrwzox", model.phone());
        Assertions.assertEquals("tfell", model.phoneExtension());
        Assertions.assertEquals("fziton", model.mobile());
        Assertions.assertEquals("qfpjk", model.emailList().get(0));
    }
}
