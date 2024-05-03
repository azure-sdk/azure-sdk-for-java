// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.vision.face.samples;

import com.azure.ai.vision.face.FaceAdministrationClient;
import com.azure.ai.vision.face.FaceAdministrationClientBuilder;
import com.azure.ai.vision.face.FaceClient;
import com.azure.ai.vision.face.FaceClientBuilder;
import com.azure.ai.vision.face.models.FaceDetectionModel;
import com.azure.ai.vision.face.models.FaceDetectionResult;
import com.azure.ai.vision.face.models.FaceIdentificationResult;
import com.azure.ai.vision.face.models.FaceOperationResult;
import com.azure.ai.vision.face.models.FaceRecognitionModel;
import com.azure.ai.vision.face.models.PersonDirectoryFace;
import com.azure.ai.vision.face.models.PersonDirectoryPerson;
import com.azure.ai.vision.face.samples.utils.AddPersonFacesPollerContainer;
import com.azure.ai.vision.face.samples.utils.ConfigurationHelper;
import com.azure.ai.vision.face.samples.utils.Resources;
import com.azure.ai.vision.face.samples.utils.Utils;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class IdentifyPersonAmongPersonsSample {
    public static void main(String[] args) {
        //Create client to run detect and identify operations
        FaceClient client = new FaceClientBuilder()
            .endpoint(ConfigurationHelper.getEndpoint())
            .credential(new AzureKeyCredential(ConfigurationHelper.getAccountKey()))
            .buildClient();

        List<String> personIds = createPersons();
        String faceId = detectImage(client);

        List<FaceIdentificationResult> result = identifyAmongPersons(client, faceId, personIds);
        Utils.logObject("Identify result: ", result);
    }

    private static List<String> createPersons() {
        //Create FaceAdministrationClient
        FaceAdministrationClient administrationClient = new FaceAdministrationClientBuilder()
            .endpoint(ConfigurationHelper.getEndpoint())
            .credential(new AzureKeyCredential(ConfigurationHelper.getAccountKey()))
            .buildClient();

        List<AddPersonFacesPollerContainer> list = new ArrayList<>();

        AddPersonFacesPollerContainer pollerContainer = createPersonAndAddFaces(
            administrationClient, "Ron", "Family1", Resources.TEST_IMAGE_PATH_FAMILY1_SON1,
            "User 0001", Resources.TEST_IMAGE_PATH_FAMILY1_SON2, "User 0002");
        list.add(pollerContainer);

        pollerContainer =  createPersonAndAddFaces(
            administrationClient, "Gill", "Family1", Resources.TEST_IMAGE_PATH_FAMILY1_DAUGHTER1,
            "User 0001", Resources.TEST_IMAGE_PATH_FAMILY1_DAUGHTER2, "User 0002");
        list.add(pollerContainer);

        pollerContainer =  createPersonAndAddFaces(
            administrationClient, "Anna", "Family2,Singing", Resources.TEST_IMAGE_PATH_FAMILY1_LADY1,
            "User 0001", Resources.TEST_IMAGE_PATH_FAMILY1_LADY2, "User 0002");
        list.add(pollerContainer);

        return list.stream().map(container -> {
            SyncPoller<FaceOperationResult, PersonDirectoryFace> poller =
                container.getLastAddPersonFacePoller();

            poller
                .setPollInterval(Duration.ofSeconds(1))
                .waitForCompletion(Duration.ofSeconds(60));

            return container.getPersonId();
        }).collect(Collectors.toList());
    }

    private static AddPersonFacesPollerContainer createPersonAndAddFaces(
        FaceAdministrationClient client,
        String name, String userDataForPersons,
        String imagePath1, String imageUserData1,
        String imagePath2, String imageUserData2) {

        // Create Persons
        // Create the first person
        SyncPoller<FaceOperationResult, PersonDirectoryPerson> syncPoller =
            client.beginCreatePerson(name, userDataForPersons);

        PersonDirectoryPerson person = syncPoller
            .setPollInterval(Duration.ofSeconds(1))
            .getFinalResult(Duration.ofSeconds(60));

        // Add face to first person, this is an async operation, we should wait for it to complete
        // However, we want to add two images to this person, we can only wait for the 2nd operation
        // complete and ignore the Poller of the first one.
        BinaryData imageData = Utils.loadFromFile(imagePath1);
        //Per above description, we don't wait for this request.
        client.beginAddPersonFace(
            person.getPersonId(), FaceRecognitionModel.RECOGNITION_04, imageData, null,
            FaceDetectionModel.DETECTION_03, imageUserData1);

        imageData = Utils.loadFromFile(imagePath2);
        // We need to wait for this operation complete, we return the poller and wait for it to complete later.
        SyncPoller<FaceOperationResult, PersonDirectoryFace> poller = client.beginAddPersonFace(
            person.getPersonId(), FaceRecognitionModel.RECOGNITION_04, imageData, null,
            FaceDetectionModel.DETECTION_03, imageUserData2);

        return new AddPersonFacesPollerContainer(poller, person.getPersonId());
    }

    private static String detectImage(FaceClient client) {
        BinaryData imageData = Utils.loadFromFile(Resources.TEST_IMAGE_PATH_FAMILY1_DAUGHTER3);
        List<FaceDetectionResult> results = client.detect(
            imageData, FaceDetectionModel.DETECTION_03, FaceRecognitionModel.RECOGNITION_04, true);

        FaceDetectionResult result = results.get(0);

        return result.getFaceId();
    }

    private static List<FaceIdentificationResult> identifyAmongPersons(FaceClient client, String faceId, List<String> personIds) {
        return client.identifyFromPersonDirectory(Collections.singletonList(faceId), personIds);
    }
}
