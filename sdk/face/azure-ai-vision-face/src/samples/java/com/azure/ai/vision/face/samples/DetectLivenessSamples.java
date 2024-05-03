// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face.samples;

import com.azure.ai.vision.face.FaceSessionClient;
import com.azure.ai.vision.face.FaceSessionClientBuilder;
import com.azure.ai.vision.face.models.CreateLivenessSessionContent;
import com.azure.ai.vision.face.models.CreateLivenessSessionResult;
import com.azure.ai.vision.face.models.LivenessOperationMode;
import com.azure.ai.vision.face.models.LivenessSession;
import com.azure.ai.vision.face.models.LivenessSessionAuditEntry;
import com.azure.ai.vision.face.models.LivenessSessionItem;
import com.azure.ai.vision.face.samples.utils.ConfigurationHelper;
import com.azure.ai.vision.face.samples.utils.Utils;
import com.azure.core.credential.AzureKeyCredential;

import java.util.List;
import java.util.UUID;

import static com.azure.ai.vision.face.samples.utils.Utils.log;
import static com.azure.ai.vision.face.samples.utils.Utils.logObject;

public class DetectLivenessSamples {
    public static void main(String[] args) {
        // Please refer to
        // https://learn.microsoft.com/en-us/azure/ai-services/computer-vision/tutorials/liveness
        // to learn more about liveness solution and the whole picture

        // Create a FaceSessionClient
        FaceSessionClient faceSessionClient = new FaceSessionClientBuilder()
            .endpoint(ConfigurationHelper.getEndpoint())
            .credential(new AzureKeyCredential(ConfigurationHelper.getAccountKey()))
            .buildClient();

        // Create a liveness session
        CreateLivenessSessionContent parameters = new CreateLivenessSessionContent(LivenessOperationMode.PASSIVE)
            .setDeviceCorrelationId(UUID.randomUUID().toString())
            .setSendResultsToClient(false)
            .setAuthTokenTimeToLiveInSeconds(60);

        CreateLivenessSessionResult livenessSessionCreationResult = faceSessionClient.createLivenessSession(parameters);
        logObject("Start a liveness session: ", livenessSessionCreationResult);

        // We can get the session result after creating the session.
        LivenessSession sessionResult = faceSessionClient.getLivenessSessionResult(livenessSessionCreationResult.getSessionId());
        logObject("Get liveness session result: " + sessionResult);

        // Then we should pass the auth token to the client device, the client device will leverage this token to perform
        // detect liveness.
        log("Please refer to https://learn.microsoft.com/en-us/azure/ai-services/computer-vision/tutorials/liveness to download client SDK to run session starts and detcet liveness call.");
        Utils.pressAnyKeyToContinue("Press any key to continue when you complete these steps to run sample to get session results ...");

        // After client devices perform the action, we can get the result from the following API
        sessionResult = faceSessionClient.getLivenessSessionResult(livenessSessionCreationResult.getSessionId());
        logObject("Get liveness session result after client device complete liveness check: ", sessionResult);

        // Get the details of all the request/response for liveness check for this sessions
        List<LivenessSessionAuditEntry> auditEntries = faceSessionClient.getLivenessSessionAuditEntries(
            livenessSessionCreationResult.getSessionId());
        logObject("Get audit entries: ", auditEntries);

        // We can also list all the liveness sessions of this face account.
        List<LivenessSessionItem> sessions = faceSessionClient.getLivenessSessions();
        logObject("List all the liveness sessions: ", sessions);

        // Delete this session
        faceSessionClient.deleteLivenessSession(livenessSessionCreationResult.getSessionId());
    }
}
