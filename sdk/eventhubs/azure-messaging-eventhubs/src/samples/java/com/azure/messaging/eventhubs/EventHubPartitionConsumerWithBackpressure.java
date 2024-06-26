// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.eventhubs;

import com.azure.core.credential.TokenCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.eventhubs.models.EventPosition;
import com.azure.messaging.eventhubs.models.PartitionEvent;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * Sample demonstrating an Event Hubs consumer that receives events from a single partition
 * using backpressure to control the number of events that are received from Event Hub.
 */
public class EventHubPartitionConsumerWithBackpressure {
    /**
     * Main method to invoke this demo to receive events from a partition with backpressure.
     *
     * @param args Unused arguments to the program.
     * @throws IOException If there's an error reading from stdin.
     */
    public static void main(String[] args) throws IOException {
        // The credential used is DefaultAzureCredential because it combines commonly used credentials
        // in deployment and development and chooses the credential to used based on its running environment.
        // More information can be found at: https://learn.microsoft.com/java/api/overview/azure/identity-readme
        TokenCredential tokenCredential = new DefaultAzureCredentialBuilder().build();

        // Create an async consumer
        //
        // "<<fully-qualified-namespace>>" will look similar to "{your-namespace}.servicebus.windows.net"
        // "<<event-hub-name>>" will be the name of the Event Hub instance you created inside the Event Hubs namespace.
        //
        // The "$Default" consumer group is created by default. This value can be found by going to the Event Hub
        // instance you are connecting to, and selecting the "Consumer groups" page.
        EventHubConsumerAsyncClient consumer = new EventHubClientBuilder()
            .credential("<<fully-qualified-namespace>>", "<<event-hub-name>>",
                tokenCredential)
            .consumerGroup(EventHubClientBuilder.DEFAULT_CONSUMER_GROUP_NAME)
            // set the prefetch count to 1
            .prefetchCount(1)
            .buildAsyncConsumerClient();

        // receive 10 messages from Event Hubs
        CountDownLatch countDownLatch = new CountDownLatch(10);

        // Create a receiver for partition "0" and subscribe with backpressure.  Start receiving messages from the
        // beginning of the event stream.
        consumer.receiveFromPartition("0", EventPosition.earliest())
            .subscribe(new Subscriber<PartitionEvent>() {
                Subscription subscription;
                @Override
                public void onSubscribe(Subscription subscription) {
                    this.subscription = subscription;
                    // Request one event from the service
                    subscription.request(1);
                }

                @Override
                public void onNext(PartitionEvent partitionEvent) {
                    // Process the event
                    System.out.println("Received event " + partitionEvent.getData().getSequenceNumber());
                    // Request the next event
                    subscription.request(1);

                    countDownLatch.countDown();
                    if (countDownLatch.getCount() == 0) {
                        subscription.cancel();
                    }
                }

                @Override
                public void onError(Throwable throwable) {
                    System.out.println("Error occurred " + throwable.getMessage());
                }

                @Override
                public void onComplete() {
                    System.out.println("Completed receiving events");
                }
            });

        // Wait for user to enter a key to terminate the process
        System.in.read();
        consumer.close();
    }
}
