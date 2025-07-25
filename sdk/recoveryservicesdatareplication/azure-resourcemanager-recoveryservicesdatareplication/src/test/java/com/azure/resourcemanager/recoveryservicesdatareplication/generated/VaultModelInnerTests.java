// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.VaultModelInner;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ManagedServiceIdentity;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.ReplicationVaultType;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.UserAssignedIdentity;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.VaultModelProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class VaultModelInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VaultModelInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Updating\",\"serviceResourceId\":\"wryoqpsoacc\",\"vaultType\":\"Migrate\"},\"identity\":{\"principalId\":\"ljlahbcryf\",\"tenantId\":\"fdosyg\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"olthqtrgqjbp\":{\"principalId\":\"jakhmsbzjh\",\"clientId\":\"zevdphlx\"},\"fpjkjlxofp\":{\"principalId\":\"fsinzgvfcjrwzoxx\",\"clientId\":\"felluwfzitonpe\"},\"yhuybbkpod\":{\"principalId\":\"hpf\",\"clientId\":\"ypininm\"},\"usivye\":{\"principalId\":\"ooginuvamih\",\"clientId\":\"gnarxzxtheo\"}}},\"location\":\"ciqihnhung\",\"tags\":{\"gxg\":\"zrnf\",\"fublj\":\"spemvtzfk\"},\"id\":\"fxqeof\",\"name\":\"aeqjhqjbasvms\",\"type\":\"jqul\"}")
            .toObject(VaultModelInner.class);
        Assertions.assertEquals("ciqihnhung", model.location());
        Assertions.assertEquals("zrnf", model.tags().get("gxg"));
        Assertions.assertEquals(ReplicationVaultType.MIGRATE, model.properties().vaultType());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VaultModelInner model = new VaultModelInner().withLocation("ciqihnhung")
            .withTags(mapOf("gxg", "zrnf", "fublj", "spemvtzfk"))
            .withProperties(new VaultModelProperties().withVaultType(ReplicationVaultType.MIGRATE))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf("olthqtrgqjbp", new UserAssignedIdentity(), "fpjkjlxofp", new UserAssignedIdentity(),
                        "yhuybbkpod", new UserAssignedIdentity(), "usivye", new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(VaultModelInner.class);
        Assertions.assertEquals("ciqihnhung", model.location());
        Assertions.assertEquals("zrnf", model.tags().get("gxg"));
        Assertions.assertEquals(ReplicationVaultType.MIGRATE, model.properties().vaultType());
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.identity().type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
