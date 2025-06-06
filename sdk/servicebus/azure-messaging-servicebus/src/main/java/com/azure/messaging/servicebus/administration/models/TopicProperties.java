// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.models;

import com.azure.core.annotation.Fluent;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationAsyncClient;
import com.azure.messaging.servicebus.administration.ServiceBusAdministrationClient;
import com.azure.messaging.servicebus.administration.implementation.EntityHelper;
import com.azure.messaging.servicebus.administration.implementation.models.EntityAvailabilityStatus;
import com.azure.messaging.servicebus.administration.implementation.models.MessageCountDetails;
import com.azure.messaging.servicebus.administration.implementation.models.TopicDescription;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.azure.messaging.servicebus.implementation.MessageUtils.toPrimitive;

/**
 * Represents the static properties of the topic.
 *
 * @see ServiceBusAdministrationAsyncClient#getTopic(String)
 * @see ServiceBusAdministrationClient#getTopic(String)
 */
@Fluent
public final class TopicProperties {
    private Duration autoDeleteOnIdle;
    private Duration defaultMessageTimeToLive;
    private Duration duplicateDetectionHistoryTimeWindow;
    private final boolean enableBatchedOperations;
    private boolean enableExpress;
    private Boolean enableSubscriptionPartitioning;
    private final EntityAvailabilityStatus entityAvailabilityStatus;
    private boolean filteringMessagesBeforePublishing;
    private Boolean isAnonymousAccessible;
    private final List<AuthorizationRule> authorizationRules;
    private EntityStatus status;
    private final OffsetDateTime createdAt;
    private final OffsetDateTime updatedAt;
    private final OffsetDateTime accessedAt;
    private long maxSizeInMegabytes;
    private long maxMessageSizeInKilobytes;
    private final MessageCountDetails messageCountDetails;
    private boolean requiresDuplicateDetection;
    private final long sizeInBytes;
    private final int subscriptionCount;
    private boolean supportOrdering;
    private final boolean enablePartitioning;
    private String userMetadata;

    private String topicName;

    static {
        // This is used by classes in different packages to get access to private and package-private methods.
        EntityHelper.setTopicAccessor(new EntityHelper.TopicAccessor() {
            @Override
            public TopicProperties toModel(TopicDescription options) {
                return new TopicProperties(options);
            }

            @Override
            public TopicDescription toImplementation(TopicProperties topic,
                List<com.azure.messaging.servicebus.administration.implementation.models.AuthorizationRule> rules) {
                final TopicDescription description = new TopicDescription().setAccessedAt(topic.getAccessedAt())
                    .setAutoDeleteOnIdle(topic.getAutoDeleteOnIdle())
                    .setCreatedAt(topic.getCreatedAt())
                    .setDefaultMessageTimeToLive(topic.getDefaultMessageTimeToLive())
                    .setDuplicateDetectionHistoryTimeWindow(topic.getDuplicateDetectionHistoryTimeWindow())
                    .setEnablePartitioning(topic.isPartitioningEnabled())
                    .setEnableSubscriptionPartitioning(topic.isEnableSubscriptionPartitioning())
                    .setEnableExpress(topic.enableExpress)
                    .setEnableBatchedOperations(topic.enableBatchedOperations)
                    .setEntityAvailabilityStatus(topic.entityAvailabilityStatus)
                    .setFilteringMessagesBeforePublishing(topic.isFilteringMessagesBeforePublishing())
                    .setIsAnonymousAccessible(topic.isAnonymousAccessible)
                    .setMaxSizeInMegabytes(topic.getMaxSizeInMegabytes())
                    .setMaxMessageSizeInKilobytes(topic.getMaxMessageSizeInKilobytes())
                    .setMessageCountDetails(topic.getMessageCountDetails())
                    .setSupportOrdering(topic.supportOrdering)
                    .setSubscriptionCount(topic.getSubscriptionCount())
                    .setStatus(topic.getStatus())
                    .setSizeInBytes(topic.getSizeInBytes())
                    .setRequiresDuplicateDetection(topic.isDuplicateDetectionRequired())
                    .setUpdatedAt(topic.getUpdatedAt())
                    .setUserMetadata(topic.getUserMetadata());

                if (!rules.isEmpty()) {
                    description.setAuthorizationRules(rules);
                }
                if (topic.getMaxMessageSizeInKilobytes() != 0) {
                    description.setMaxMessageSizeInKilobytes(topic.getMaxMessageSizeInKilobytes());
                }

                return description;
            }

            @Override
            public void setName(TopicProperties topicProperties, String name) {
                topicProperties.setName(name);
            }
        });
    }

    /**
     * Creates a topic with the given options.
     *
     * @param topic Options to set on the topic.
     */
    TopicProperties(TopicDescription topic) {
        Objects.requireNonNull(topic, "'options' cannot be null.");
        this.accessedAt = topic.getAccessedAt();
        this.authorizationRules = topic.getAuthorizationRules()
            .stream()
            .map(SharedAccessAuthorizationRule::new)
            .collect(Collectors.toList());
        this.autoDeleteOnIdle = topic.getAutoDeleteOnIdle();
        this.createdAt = topic.getCreatedAt();
        this.defaultMessageTimeToLive = topic.getDefaultMessageTimeToLive();
        this.duplicateDetectionHistoryTimeWindow = topic.getDuplicateDetectionHistoryTimeWindow();
        this.filteringMessagesBeforePublishing = toPrimitive(topic.isFilteringMessagesBeforePublishing());
        this.enableBatchedOperations = toPrimitive(topic.isEnableBatchedOperations());
        this.enableExpress = toPrimitive(topic.isEnableExpress());
        this.enablePartitioning = toPrimitive(topic.isEnablePartitioning());
        this.enableSubscriptionPartitioning = topic.isEnableSubscriptionPartitioning();
        this.entityAvailabilityStatus = topic.getEntityAvailabilityStatus();
        this.isAnonymousAccessible = topic.isAnonymousAccessible();
        this.maxSizeInMegabytes = toPrimitive(topic.getMaxSizeInMegabytes());
        this.maxMessageSizeInKilobytes = toPrimitive(topic.getMaxMessageSizeInKilobytes());
        this.messageCountDetails = topic.getMessageCountDetails();
        this.requiresDuplicateDetection = toPrimitive(topic.isRequiresDuplicateDetection());
        this.sizeInBytes = toPrimitive(topic.getSizeInBytes());
        this.status = topic.getStatus();
        this.subscriptionCount = toPrimitive(topic.getSubscriptionCount());
        this.supportOrdering = toPrimitive(topic.isSupportOrdering());
        this.updatedAt = topic.getUpdatedAt();
        this.userMetadata = topic.getUserMetadata();
    }

    /**
     * Gets the name of the topic.
     *
     * @return The name of the topic;
     */
    public String getName() {
        return topicName;
    }

    /**
     * Sets the topic name.
     *
     * @param topicName Name of the topic.
     * @return the TopicDescription object itself.
     */
    TopicProperties setName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * Get the defaultMessageTimeToLive property: ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value.
     */
    public Duration getDefaultMessageTimeToLive() {
        return this.defaultMessageTimeToLive;
    }

    /**
     * Set the defaultMessageTimeToLive property: ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set.
     * @return the TopicDescription object itself.
     */
    public TopicProperties setDefaultMessageTimeToLive(Duration defaultMessageTimeToLive) {
        this.defaultMessageTimeToLive = defaultMessageTimeToLive;
        return this;
    }

    /**
     * Get the maxSizeInMegabytes property: The maximum size of the topic in megabytes, which is the size of memory
     * allocated for the topic.
     *
     * @return the maxSizeInMegabytes value.
     */
    public long getMaxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }

    /**
     * Set the maxSizeInMegabytes property: The maximum size of the topic in megabytes, which is the size of memory
     * allocated for the topic.
     *
     * @param maxSizeInMegabytes the maxSizeInMegabytes value to set.
     * @return the TopicDescription object itself.
     */
    public TopicProperties setMaxSizeInMegabytes(long maxSizeInMegabytes) {
        this.maxSizeInMegabytes = maxSizeInMegabytes;
        return this;
    }

    /**
     * Get the requiresDuplicateDetection property: A value indicating if this topic requires duplicate detection.
     *
     * @return the requiresDuplicateDetection value.
     */
    public boolean isDuplicateDetectionRequired() {
        return this.requiresDuplicateDetection;
    }

    /**
     * Set the requiresDuplicateDetection property: A value indicating if this topic requires duplicate detection.
     *
     * @param requiresDuplicateDetection the requiresDuplicateDetection value to set.
     * @return the TopicDescription object itself.
     */
    public TopicProperties setDuplicateDetectionRequired(boolean requiresDuplicateDetection) {
        this.requiresDuplicateDetection = requiresDuplicateDetection;
        return this;
    }

    /**
     * Get the duplicateDetectionHistoryTimeWindow property: ISO 8601 timeSpan structure that defines the duration of
     * the duplicate detection history. The default value is 10 minutes.
     *
     * @return the duplicateDetectionHistoryTimeWindow value.
     */
    public Duration getDuplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }

    /**
     * Set the duplicateDetectionHistoryTimeWindow property: ISO 8601 timeSpan structure that defines the duration of
     * the duplicate detection history. The default value is 10 minutes.
     *
     * @param duplicateDetectionHistoryTimeWindow the duplicateDetectionHistoryTimeWindow value to set.
     * @return the TopicDescription object itself.
     */
    public TopicProperties setDuplicateDetectionHistoryTimeWindow(Duration duplicateDetectionHistoryTimeWindow) {
        this.duplicateDetectionHistoryTimeWindow = duplicateDetectionHistoryTimeWindow;
        return this;
    }

    /**
     * Get the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @return the enableBatchedOperations value.
     */
    public boolean isBatchedOperationsEnabled() {
        return this.enableBatchedOperations;
    }

    /**
     * Get the authorizationRules property: Authorization rules for resource.
     *
     * @return the authorizationRules value.
     */
    public List<AuthorizationRule> getAuthorizationRules() {
        return this.authorizationRules;
    }

    /**
     * Get the status property: Status of a Service Bus resource.
     *
     * @return the status value.
     */
    public EntityStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of a Service Bus resource.
     *
     * @param status the status value to set.
     * @return the TopicDescription object itself.
     */
    public TopicProperties setStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the supportOrdering property: A value that indicates whether the topic supports ordering.
     *
     * @return the supportOrdering value.
     */
    public boolean isOrderingSupported() {
        return this.supportOrdering;
    }

    /**
     * Set the supportOrdering property: A value that indicates whether the topic supports ordering.
     *
     * @param supportOrdering the supportOrdering value to set.
     * @return the TopicDescription object itself.
     */
    public TopicProperties setOrderingSupported(boolean supportOrdering) {
        this.supportOrdering = supportOrdering;
        return this;
    }

    /**
     * Get the autoDeleteOnIdle property: ISO 8601 timeSpan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value.
     */
    public Duration getAutoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }

    /**
     * Set the autoDeleteOnIdle property: ISO 8601 timeSpan idle interval after which the topic is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set.
     * @return the TopicDescription object itself.
     */
    public TopicProperties setAutoDeleteOnIdle(Duration autoDeleteOnIdle) {
        this.autoDeleteOnIdle = autoDeleteOnIdle;
        return this;
    }

    /**
     * Get the enablePartitioning property: A value that indicates whether the topic is to be partitioned across
     * multiple message brokers.
     *
     * @return the enablePartitioning value.
     */
    public boolean isPartitioningEnabled() {
        return this.enablePartitioning;
    }

    /**
     * Get the userMetadata property: Metadata associated with the topic.
     *
     * @return the userMetadata value.
     */
    public String getUserMetadata() {
        return this.userMetadata;
    }

    /**
     * Set the userMetadata property: Metadata associated with the topic.
     *
     * @param userMetadata the userMetadata value to set.
     * @return the TopicDescription object itself.
     */
    public TopicProperties setUserMetadata(String userMetadata) {
        this.userMetadata = userMetadata;
        return this;
    }

    /**
     * Get the sizeInBytes property: The size of the topic, in bytes.
     *
     * @return the sizeInBytes value.
     */
    long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Get the filteringMessagesBeforePublishing property: Filter messages before publishing.
     *
     * @return the filteringMessagesBeforePublishing value.
     */
    boolean isFilteringMessagesBeforePublishing() {
        return this.filteringMessagesBeforePublishing;
    }

    /**
     * Set the filteringMessagesBeforePublishing property: Filter messages before publishing.
     *
     * @param filteringMessagesBeforePublishing the filteringMessagesBeforePublishing value to set.
     * @return the TopicDescription object itself.
     */
    TopicProperties setFilteringMessagesBeforePublishing(boolean filteringMessagesBeforePublishing) {
        this.filteringMessagesBeforePublishing = filteringMessagesBeforePublishing;
        return this;
    }

    /**
     * Get the isAnonymousAccessible property: A value indicating if the resource can be accessed without authorization.
     *
     * @return the isAnonymousAccessible value.
     */
    boolean isAnonymousAccessible() {
        return this.isAnonymousAccessible;
    }

    /**
     * Set the isAnonymousAccessible property: A value indicating if the resource can be accessed without authorization.
     *
     * @param isAnonymousAccessible the isAnonymousAccessible value to set.
     * @return the TopicDescription object itself.
     */
    TopicProperties setIsAnonymousAccessible(boolean isAnonymousAccessible) {
        this.isAnonymousAccessible = isAnonymousAccessible;
        return this;
    }

    /**
     * Get the createdAt property: The exact time the topic was created.
     *
     * @return the createdAt value.
     */
    OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The exact time a message was updated in the topic.
     *
     * @return the updatedAt value.
     */
    OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the accessedAt property: Last time a message was sent, or the last time there was a receive request to this
     * topic.
     *
     * @return the accessedAt value.
     */
    OffsetDateTime getAccessedAt() {
        return this.accessedAt;
    }

    /**
     * Get the messageCountDetails property: Details about the message counts in entity.
     *
     * @return the messageCountDetails value.
     */
    MessageCountDetails getMessageCountDetails() {
        return this.messageCountDetails;
    }

    /**
     * Get the subscriptionCount property: The number of subscriptions in the topic.
     *
     * @return the subscriptionCount value.
     */
    int getSubscriptionCount() {
        return this.subscriptionCount;
    }

    /**
     * Get the entityAvailabilityStatus property: Availability status of the entity.
     *
     * @return the entityAvailabilityStatus value.
     */
    EntityAvailabilityStatus getEntityAvailabilityStatus() {
        return this.entityAvailabilityStatus;
    }

    /**
     * Get the enableSubscriptionPartitioning property: A value that indicates whether the topic's subscription is to be
     * partitioned.
     *
     * @return the enableSubscriptionPartitioning value.
     */
    boolean isEnableSubscriptionPartitioning() {
        return this.enableSubscriptionPartitioning;
    }

    /**
     * Set the enableSubscriptionPartitioning property: A value that indicates whether the topic's subscription is to be
     * partitioned.
     *
     * @param enableSubscriptionPartitioning the enableSubscriptionPartitioning value to set.
     * @return the TopicDescription object itself.
     */
    TopicProperties setEnableSubscriptionPartitioning(boolean enableSubscriptionPartitioning) {
        this.enableSubscriptionPartitioning = enableSubscriptionPartitioning;
        return this;
    }

    /**
     * Get the enableExpress property: A value that indicates whether Express Entities are enabled. An express queue
     * holds a message in memory temporarily before writing it to persistent storage.
     *
     * @return the enableExpress value.
     */
    boolean isEnableExpress() {
        return this.enableExpress;
    }

    /**
     * Set the enableExpress property: A value that indicates whether Express Entities are enabled. An express queue
     * holds a message in memory temporarily before writing it to persistent storage.
     *
     * @param enableExpress the enableExpress value to set.
     * @return the TopicDescription object itself.
     */
    TopicProperties setEnableExpress(boolean enableExpress) {
        this.enableExpress = enableExpress;
        return this;
    }

    /**
     * Get the maxMessageSizeInKilobytes property: The maximum size of a message in kilobytes.
     *
     * @return the maxMessageSizeInKilobytes value.
     */
    public long getMaxMessageSizeInKilobytes() {
        return this.maxMessageSizeInKilobytes;
    }

    /**
     * Set the maxMessageSizeInKilobytes property: The maximum size of a message in kilobytes.
     *
     * @param maxMessageSizeInKilobytes the maxMessageSizeInKilobytes value to set.
     * @return the QueueDescription object itself.
     */
    public TopicProperties setMaxMessageSizeInKilobytes(long maxMessageSizeInKilobytes) {
        this.maxMessageSizeInKilobytes = maxMessageSizeInKilobytes;
        return this;
    }
}
