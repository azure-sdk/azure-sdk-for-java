// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.postgresql.PostgreSqlManager;
import com.azure.resourcemanager.postgresql.models.GeoRedundantBackup;
import com.azure.resourcemanager.postgresql.models.IdentityType;
import com.azure.resourcemanager.postgresql.models.InfrastructureEncryption;
import com.azure.resourcemanager.postgresql.models.MinimalTlsVersionEnum;
import com.azure.resourcemanager.postgresql.models.PublicNetworkAccessEnum;
import com.azure.resourcemanager.postgresql.models.Server;
import com.azure.resourcemanager.postgresql.models.ServerState;
import com.azure.resourcemanager.postgresql.models.ServerVersion;
import com.azure.resourcemanager.postgresql.models.SkuTier;
import com.azure.resourcemanager.postgresql.models.SslEnforcementEnum;
import com.azure.resourcemanager.postgresql.models.StorageAutogrow;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ServersListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"identity\":{\"principalId\":\"284ef273-4b75-4f20-b442-d2211ff6d403\",\"type\":\"SystemAssigned\",\"tenantId\":\"a72fef93-b3cd-4eb9-b448-acfdfbc43f06\"},\"sku\":{\"name\":\"egrpkhj\",\"tier\":\"GeneralPurpose\",\"capacity\":1641060352,\"size\":\"luicpdggkzzlvmbm\",\"family\":\"xmodf\"},\"properties\":{\"administratorLogin\":\"fy\",\"version\":\"10\",\"sslEnforcement\":\"Enabled\",\"minimalTlsVersion\":\"TLS1_1\",\"byokEnforcement\":\"yhrfouyftaakcpw\",\"infrastructureEncryption\":\"Disabled\",\"userVisibleState\":\"Disabled\",\"fullyQualifiedDomainName\":\"mnubexkpzksmond\",\"earliestRestoreDate\":\"2021-04-01T23:21:50Z\",\"storageProfile\":{\"backupRetentionDays\":1083170526,\"geoRedundantBackup\":\"Disabled\",\"storageMB\":326974416,\"storageAutogrow\":\"Disabled\"},\"replicationRole\":\"pkwhojvpa\",\"masterServerId\":\"gxysmocmbqfqvm\",\"replicaCapacity\":1181340997,\"publicNetworkAccess\":\"Enabled\",\"privateEndpointConnections\":[{\"id\":\"helxprglya\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"cbcuejrjxgciqi\"},\"provisioningState\":\"Dropping\"}},{\"id\":\"sxsdqrhzoymibm\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"ahwfluszdtmhrk\"},\"provisioningState\":\"Failed\"}},{\"id\":\"yvoqa\",\"properties\":{\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{\"status\":\"Rejected\",\"description\":\"pbtg\"},\"provisioningState\":\"Rejecting\"}}]},\"location\":\"wo\",\"tags\":{\"tkcnqxwb\":\"ashrt\",\"sipqii\":\"okulpiujwa\"},\"id\":\"byuqerpqlp\",\"name\":\"wcciuqgbdbu\",\"type\":\"auvfbtkuwhhmhyk\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        PostgreSqlManager manager = PostgreSqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Server> response
            = manager.servers().listByResourceGroup("wmgxcxrsl", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("wo", response.iterator().next().location());
        Assertions.assertEquals("ashrt", response.iterator().next().tags().get("tkcnqxwb"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("egrpkhj", response.iterator().next().sku().name());
        Assertions.assertEquals(SkuTier.GENERAL_PURPOSE, response.iterator().next().sku().tier());
        Assertions.assertEquals(1641060352, response.iterator().next().sku().capacity());
        Assertions.assertEquals("luicpdggkzzlvmbm", response.iterator().next().sku().size());
        Assertions.assertEquals("xmodf", response.iterator().next().sku().family());
        Assertions.assertEquals("fy", response.iterator().next().administratorLogin());
        Assertions.assertEquals(ServerVersion.ONE_ZERO, response.iterator().next().version());
        Assertions.assertEquals(SslEnforcementEnum.ENABLED, response.iterator().next().sslEnforcement());
        Assertions.assertEquals(MinimalTlsVersionEnum.TLS1_1, response.iterator().next().minimalTlsVersion());
        Assertions.assertEquals(InfrastructureEncryption.DISABLED,
            response.iterator().next().infrastructureEncryption());
        Assertions.assertEquals(ServerState.DISABLED, response.iterator().next().userVisibleState());
        Assertions.assertEquals("mnubexkpzksmond", response.iterator().next().fullyQualifiedDomainName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-01T23:21:50Z"),
            response.iterator().next().earliestRestoreDate());
        Assertions.assertEquals(1083170526, response.iterator().next().storageProfile().backupRetentionDays());
        Assertions.assertEquals(GeoRedundantBackup.DISABLED,
            response.iterator().next().storageProfile().geoRedundantBackup());
        Assertions.assertEquals(326974416, response.iterator().next().storageProfile().storageMB());
        Assertions.assertEquals(StorageAutogrow.DISABLED,
            response.iterator().next().storageProfile().storageAutogrow());
        Assertions.assertEquals("pkwhojvpa", response.iterator().next().replicationRole());
        Assertions.assertEquals("gxysmocmbqfqvm", response.iterator().next().masterServerId());
        Assertions.assertEquals(1181340997, response.iterator().next().replicaCapacity());
        Assertions.assertEquals(PublicNetworkAccessEnum.ENABLED, response.iterator().next().publicNetworkAccess());
    }
}
