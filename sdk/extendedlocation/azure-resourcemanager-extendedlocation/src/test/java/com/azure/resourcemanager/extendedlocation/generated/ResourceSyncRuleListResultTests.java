// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.extendedlocation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.extendedlocation.models.ResourceSyncRuleListResult;

public final class ResourceSyncRuleListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceSyncRuleListResult model = BinaryData.fromString(
            "{\"nextLink\":\"jqabcypmivkwlzuv\",\"value\":[{\"properties\":{\"priority\":1023174750,\"provisioningState\":\"bacfionlebxetq\",\"selector\":{\"matchExpressions\":[{},{}],\"matchLabels\":{\"feallnwsu\":\"nqbqqwxr\",\"c\":\"isnjampmngnz\",\"ochcbonqvpkvl\":\"aqw\"}},\"targetResourceGroup\":\"njeaseipheofloke\"},\"location\":\"ienjbdlwtgr\",\"tags\":{\"umasxazjpq\":\"jp\",\"ualhbxxhejj\":\"e\",\"ynpwlbj\":\"zvdudgwdslfhotwm\",\"sop\":\"pgacftadehxnlty\"},\"id\":\"usue\",\"name\":\"nzwdejba\",\"type\":\"orxzdmohctbqvud\"},{\"properties\":{\"priority\":1222672575,\"provisioningState\":\"nvowgujju\",\"selector\":{\"matchExpressions\":[{},{},{}],\"matchLabels\":{\"xhbkuofq\":\"lhslazjdyggdtj\",\"kh\":\"e\"}},\"targetResourceGroup\":\"n\"},\"location\":\"fyexfwhy\",\"tags\":{\"naamde\":\"bvyvdcsity\"},\"id\":\"tehfiqscjeypvh\",\"name\":\"zrkgqhcjrefovg\",\"type\":\"kqsleyyvxy\"}]}")
            .toObject(ResourceSyncRuleListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceSyncRuleListResult model = new ResourceSyncRuleListResult();
        model = BinaryData.fromObject(model).toObject(ResourceSyncRuleListResult.class);
    }
}
