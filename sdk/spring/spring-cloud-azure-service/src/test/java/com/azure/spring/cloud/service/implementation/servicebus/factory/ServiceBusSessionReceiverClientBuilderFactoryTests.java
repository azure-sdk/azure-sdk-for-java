// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.service.implementation.servicebus.factory;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;
import com.azure.messaging.servicebus.models.SubQueue;
import com.azure.spring.cloud.service.implementation.servicebus.properties.ServiceBusProcessorClientTestProperties;
import com.azure.spring.cloud.service.implementation.servicebus.properties.ServiceBusReceiverClientTestProperties;
import com.azure.spring.cloud.service.servicebus.properties.ServiceBusEntityType;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class ServiceBusSessionReceiverClientBuilderFactoryTests extends AbstractServiceBusSubClientBuilderFactoryTests<
    ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder,
    ServiceBusReceiverClientTestProperties,
    ServiceBusSessionReceiverClientBuilderFactory> {

    @Test
    void queueConfigured() {
        ServiceBusProcessorClientTestProperties properties = new ServiceBusProcessorClientTestProperties();
        properties.setNamespace("test-namespace");
        properties.setEntityType(ServiceBusEntityType.QUEUE);
        properties.setEntityName("test-queue");

        final ServiceBusSessionReceiverClientBuilderFactory factory = createClientBuilderFactoryWithMockBuilder(properties);
        final ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder builder = factory.build();
        builder.buildClient();

        verify(builder, times(1)).queueName("test-queue");
    }

    @Override
    protected ServiceBusReceiverClientTestProperties createMinimalServiceProperties() {
        ServiceBusReceiverClientTestProperties properties = new ServiceBusReceiverClientTestProperties();
        properties.setNamespace("test-namespace");
        properties.setEntityName("test");
        properties.setEntityType(ServiceBusEntityType.TOPIC);
        properties.setSubscriptionName("test-subscription");
        return properties;
    }

    @Override
    protected ServiceBusSessionReceiverClientBuilderFactory createClientBuilderFactoryWithMockBuilder(ServiceBusReceiverClientTestProperties properties) {
        return spy(new ServiceBusSessionReceiverClientBuilderFactoryExt(getSharedServiceBusClientBuilder(properties), properties));
    }

    @Override
    void verifyServicePropertiesConfigured(boolean isShareServiceClientBuilder) {
        ServiceBusReceiverClientTestProperties properties = getServiceBusReceiverClientTestProperties(isShareServiceClientBuilder);

        final ServiceBusSessionReceiverClientBuilderFactory factory = createClientBuilderFactoryWithMockBuilder(properties);
        doReturn(isShareServiceClientBuilder).when(factory).isShareServiceBusClientBuilder();
        final ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder builder = factory.build();
        builder.buildClient();

        verify(factory.getServiceBusClientBuilder(), times(1)).customEndpointAddress(customEndpoint);

        verify(builder, times(1)).topicName("test-topic");
        verify(builder, times(1)).subscriptionName("test-subscription");
        verify(builder, times(1)).receiveMode(ServiceBusReceiveMode.PEEK_LOCK);
        verify(builder, times(1)).subQueue(SubQueue.NONE);
        verify(builder, times(1)).prefetchCount(100);
        verify(builder, times(1)).maxAutoLockRenewDuration(Duration.ofSeconds(5));
        verify(builder, times(1)).disableAutoComplete();

        verify(factory.getServiceBusClientBuilder(), times(1)).fullyQualifiedNamespace(properties.getFullyQualifiedNamespace());
    }

    private ServiceBusReceiverClientTestProperties getServiceBusReceiverClientTestProperties(boolean isShareServiceClientBuilder) {
        ServiceBusReceiverClientTestProperties properties = new ServiceBusReceiverClientTestProperties();
        properties.setNamespace("test-namespace");
        properties.setEntityName("test-topic");
        properties.setEntityType(ServiceBusEntityType.TOPIC);
        properties.setSubscriptionName("test-subscription");
        properties.setReceiveMode(ServiceBusReceiveMode.PEEK_LOCK);
        properties.setSubQueue(SubQueue.NONE);
        properties.setPrefetchCount(100);
        properties.setMaxAutoLockRenewDuration(Duration.ofSeconds(5));
        properties.setAutoComplete(false);
        properties.setCustomEndpointAddress(this.customEndpoint);
        properties.setShareServiceBusClientBuilder(isShareServiceClientBuilder);
        return properties;
    }

    @Override
    void buildClient(ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder builder) {
        builder.buildClient();
    }

    static class ServiceBusSessionReceiverClientBuilderFactoryExt extends ServiceBusSessionReceiverClientBuilderFactory {
        private ServiceBusClientBuilder serviceBusClientBuilder;
        private final ServiceBusReceiverClientTestProperties properties;

        ServiceBusSessionReceiverClientBuilderFactoryExt(ServiceBusClientBuilder serviceBusClientBuilder,
                                                         ServiceBusReceiverClientTestProperties properties) {
            super(serviceBusClientBuilder, properties);
            this.properties = properties;
            if (properties.isShareServiceBusClientBuilder() && serviceBusClientBuilder != null) {
                this.serviceBusClientBuilder = serviceBusClientBuilder;
            }
        }

        @Override
        public ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder createBuilderInstance() {
            return mock(ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder.class);
        }

        @Override
        protected ServiceBusClientBuilder getServiceBusClientBuilder() {
            if (!this.isShareServiceBusClientBuilder() && this.serviceBusClientBuilder == null) {
                TestServiceBusClientBuilderFactory clientBuilderFactory = spy(new TestServiceBusClientBuilderFactory(properties));
                this.serviceBusClientBuilder = clientBuilderFactory.build();
            }
            return this.serviceBusClientBuilder;
        }
    }
}
