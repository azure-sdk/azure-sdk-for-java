// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.planetarycomputer.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.planetarycomputer.implementation.models.GeoCatalogListResult;
import com.azure.resourcemanager.planetarycomputer.models.AutoGeneratedDomainNameLabelScope;
import com.azure.resourcemanager.planetarycomputer.models.CatalogTier;
import com.azure.resourcemanager.planetarycomputer.models.ManagedServiceIdentityType;
import org.junit.jupiter.api.Assertions;

public final class GeoCatalogListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GeoCatalogListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"tier\":\"Basic\",\"catalogUri\":\"lwejdpv\",\"provisioningState\":\"Failed\",\"autoGeneratedDomainNameLabelScope\":\"SubscriptionReuse\"},\"identity\":{\"principalId\":\"oacctaza\",\"tenantId\":\"j\",\"type\":\"None\",\"userAssignedIdentities\":{\"hcrzevd\":{\"principalId\":\"ryffdfdosy\",\"clientId\":\"xpaojakhmsbz\"},\"tfell\":{\"principalId\":\"lxaolthqtrgqjbp\",\"clientId\":\"fsinzgvfcjrwzoxx\"},\"lxofpdvhpfxxypin\":{\"principalId\":\"fziton\",\"clientId\":\"qfpjk\"}}},\"location\":\"mayhuybbkpodepoo\",\"tags\":{\"eotusivyevc\":\"uvamiheognarxzxt\",\"un\":\"iqihn\",\"fygxgispemvtzfk\":\"bwjzr\"},\"id\":\"fublj\",\"name\":\"fxqeof\",\"type\":\"aeqjhqjbasvms\"},{\"properties\":{\"tier\":\"Basic\",\"catalogUri\":\"ngsntnbybk\",\"provisioningState\":\"Provisioning\",\"autoGeneratedDomainNameLabelScope\":\"SubscriptionReuse\"},\"identity\":{\"principalId\":\"lxxwrljdouskc\",\"tenantId\":\"kocrcjdkwtnhx\",\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{\"wnzlljfmppeeb\":{\"principalId\":\"ksqrglssai\",\"clientId\":\"p\"},\"zevndhkrwpdappds\":{\"principalId\":\"gxsabkyq\",\"clientId\":\"ujitcjcz\"}}},\"location\":\"kvwrwjfeu\",\"tags\":{\"zdatqxhocdg\":\"utjeltmrldhugj\",\"ozwyiftyhxhuro\":\"ablgphuticndvk\"},\"id\":\"ftyxolniw\",\"name\":\"wcukjfkgiawxk\",\"type\":\"ryplwckbasyypn\"},{\"properties\":{\"tier\":\"Basic\",\"catalogUri\":\"cbacphejkotynqg\",\"provisioningState\":\"Deleting\",\"autoGeneratedDomainNameLabelScope\":\"TenantReuse\"},\"identity\":{\"principalId\":\"i\",\"tenantId\":\"yqkgfg\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"ouf\":{\"principalId\":\"gakeqsr\",\"clientId\":\"bzqqedqytbciq\"},\"mutduqktaps\":{\"principalId\":\"mnkzsmod\",\"clientId\":\"lougpbkw\"},\"bbjfddgmbmbexp\":{\"principalId\":\"gcue\",\"clientId\":\"umkdosvqwhbmd\"},\"lgbquxig\":{\"principalId\":\"htqqrolfp\",\"clientId\":\"s\"}}},\"location\":\"jgzjaoyfhrtx\",\"tags\":{\"l\":\"erkujys\"},\"id\":\"juvf\",\"name\":\"awrlyx\",\"type\":\"jkcpr\"}],\"nextLink\":\"wbxgjvt\"}")
            .toObject(GeoCatalogListResult.class);
        Assertions.assertEquals("mayhuybbkpodepoo", model.value().get(0).location());
        Assertions.assertEquals("uvamiheognarxzxt", model.value().get(0).tags().get("eotusivyevc"));
        Assertions.assertEquals(CatalogTier.BASIC, model.value().get(0).properties().tier());
        Assertions.assertEquals(AutoGeneratedDomainNameLabelScope.SUBSCRIPTION_REUSE,
            model.value().get(0).properties().autoGeneratedDomainNameLabelScope());
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.value().get(0).identity().type());
        Assertions.assertEquals("wbxgjvt", model.nextLink());
    }
}
