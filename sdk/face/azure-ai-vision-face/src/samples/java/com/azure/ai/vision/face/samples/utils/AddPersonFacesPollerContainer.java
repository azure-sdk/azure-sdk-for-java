// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face.samples.utils;

import com.azure.ai.vision.face.models.FaceOperationResult;
import com.azure.ai.vision.face.models.PersonDirectoryFace;
import com.azure.core.util.polling.SyncPoller;

public class AddPersonFacesPollerContainer {

    private final SyncPoller<FaceOperationResult, PersonDirectoryFace> poller;
    private final String personId;

    public AddPersonFacesPollerContainer(SyncPoller<FaceOperationResult, PersonDirectoryFace> poller, String personId) {
        this.poller = poller;
        this.personId = personId;
    }

    public SyncPoller<FaceOperationResult, PersonDirectoryFace> getLastAddPersonFacePoller() {
        return this.poller;
    }

    public String getPersonId() {
        return this.personId;
    }
}
