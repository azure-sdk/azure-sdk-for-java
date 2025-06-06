// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.administration.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.administration.implementation.models.QueueDescription;
import com.azure.messaging.servicebus.administration.implementation.models.QueueDescriptionEntry;
import com.azure.messaging.servicebus.administration.implementation.models.QueueDescriptionFeed;
import com.azure.messaging.servicebus.administration.implementation.models.RuleDescription;
import com.azure.messaging.servicebus.administration.implementation.models.SubscriptionDescription;
import com.azure.messaging.servicebus.administration.implementation.models.TopicDescription;
import com.azure.messaging.servicebus.administration.implementation.models.TopicDescriptionEntry;
import com.azure.messaging.servicebus.administration.implementation.models.TopicDescriptionFeed;
import com.azure.messaging.servicebus.administration.models.AuthorizationRule;
import com.azure.messaging.servicebus.administration.models.CreateQueueOptions;
import com.azure.messaging.servicebus.administration.models.CreateSubscriptionOptions;
import com.azure.messaging.servicebus.administration.models.CreateTopicOptions;
import com.azure.messaging.servicebus.administration.models.QueueProperties;
import com.azure.messaging.servicebus.administration.models.RuleAction;
import com.azure.messaging.servicebus.administration.models.RuleFilter;
import com.azure.messaging.servicebus.administration.models.RuleProperties;
import com.azure.messaging.servicebus.administration.models.SharedAccessAuthorizationRule;
import com.azure.messaging.servicebus.administration.models.SubscriptionProperties;
import com.azure.messaging.servicebus.administration.models.TopicProperties;
import com.azure.xml.XmlReader;

import javax.xml.stream.XMLStreamException;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQueries;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Used to access internal methods on {@link QueueProperties}.
 */
public final class EntityHelper {
    private static final ClientLogger LOGGER = new ClientLogger(EntityHelper.class);
    // Name of the entity type when listing queues and topics.
    public static final String QUEUES_ENTITY_TYPE = "queues";
    public static final String TOPICS_ENTITY_TYPE = "topics";

    public static final int NUMBER_OF_ELEMENTS = 100;
    private static QueueAccessor queueAccessor;
    private static SubscriptionAccessor subscriptionAccessor;
    private static TopicAccessor topicAccessor;
    private static RuleAccessor ruleAccessor;

    static {
        try {
            Class.forName(QueueProperties.class.getName(), true, QueueProperties.class.getClassLoader());
            Class.forName(SubscriptionProperties.class.getName(), true, SubscriptionProperties.class.getClassLoader());
            Class.forName(TopicProperties.class.getName(), true, TopicProperties.class.getClassLoader());
            Class.forName(RuleProperties.class.getName(), true, RuleProperties.class.getClassLoader());
        } catch (ClassNotFoundException e) {
            throw LOGGER.logExceptionAsError(new IllegalStateException(e));
        }
    }

    /**
     * Gets a queue description given the options.
     *
     * @param options The options.
     *
     * @return The corresponding queue.
     */
    public static QueueDescription getQueueDescription(CreateQueueOptions options) {
        Objects.requireNonNull(options, "'options' cannot be null.");
        final QueueDescription description = new QueueDescription().setAutoDeleteOnIdle(options.getAutoDeleteOnIdle())
            .setDefaultMessageTimeToLive(options.getDefaultMessageTimeToLive())
            .setDeadLetteringOnMessageExpiration(options.isDeadLetteringOnMessageExpiration())
            .setDuplicateDetectionHistoryTimeWindow(options.getDuplicateDetectionHistoryTimeWindow())
            .setEnableBatchedOperations(options.isBatchedOperationsEnabled())
            .setEnablePartitioning(options.isPartitioningEnabled())
            .setForwardTo(options.getForwardTo())
            .setForwardDeadLetteredMessagesTo(options.getForwardDeadLetteredMessagesTo())
            .setLockDuration(options.getLockDuration())
            .setMaxDeliveryCount(options.getMaxDeliveryCount())
            .setMaxSizeInMegabytes(options.getMaxSizeInMegabytes())
            .setRequiresDuplicateDetection(options.isDuplicateDetectionRequired())
            .setRequiresSession(options.isSessionRequired())
            .setStatus(options.getStatus())
            .setUserMetadata(options.getUserMetadata());

        if (!options.getAuthorizationRules().isEmpty()) {
            description.setAuthorizationRules(toImplementation(options.getAuthorizationRules()));
        }

        if (options.getMaxMessageSizeInKilobytes() != 0) {
            description.setMaxMessageSizeInKilobytes(options.getMaxMessageSizeInKilobytes());
        }

        return description;
    }

    public static SubscriptionDescription getSubscriptionDescription(CreateSubscriptionOptions options) {
        Objects.requireNonNull(options, "'options' cannot be null.");
        return new SubscriptionDescription().setAutoDeleteOnIdle(options.getAutoDeleteOnIdle())
            .setDefaultMessageTimeToLive(options.getDefaultMessageTimeToLive())
            .setDeadLetteringOnFilterEvaluationExceptions(options.isDeadLetteringOnFilterEvaluationExceptions())
            .setDeadLetteringOnMessageExpiration(options.isDeadLetteringOnMessageExpiration())
            .setEnableBatchedOperations(options.isBatchedOperationsEnabled())
            .setForwardTo(options.getForwardTo())
            .setForwardDeadLetteredMessagesTo(options.getForwardDeadLetteredMessagesTo())
            .setLockDuration(options.getLockDuration())
            .setMaxDeliveryCount(options.getMaxDeliveryCount())
            .setRequiresSession(options.isSessionRequired())
            .setStatus(options.getStatus())
            .setUserMetadata(options.getUserMetadata())
            .setDefaultRuleDescription(
                options.getDefaultRule() != null ? EntityHelper.toImplementation(options.getDefaultRule()) : null);
    }

    public static TopicDescription getTopicDescription(CreateTopicOptions options) {
        Objects.requireNonNull(options, "'options' cannot be null.");
        final TopicDescription description = new TopicDescription().setAutoDeleteOnIdle(options.getAutoDeleteOnIdle())
            .setDefaultMessageTimeToLive(options.getDefaultMessageTimeToLive())
            .setDuplicateDetectionHistoryTimeWindow(options.getDuplicateDetectionHistoryTimeWindow())
            .setEnableBatchedOperations(options.isBatchedOperationsEnabled())
            .setEnablePartitioning(options.isPartitioningEnabled())
            .setMaxSizeInMegabytes(options.getMaxSizeInMegabytes())
            .setRequiresDuplicateDetection(options.isDuplicateDetectionRequired())
            .setSupportOrdering(options.isSupportOrdering())
            .setStatus(options.getStatus())
            .setUserMetadata(options.getUserMetadata());

        if (!options.getAuthorizationRules().isEmpty()) {
            description.setAuthorizationRules(toImplementation(options.getAuthorizationRules()));
        }

        if (options.getMaxMessageSizeInKilobytes() != 0) {
            description.setMaxMessageSizeInKilobytes(options.getMaxMessageSizeInKilobytes());
        }

        return description;
    }

    /**
     * Creates a new queue given the existing queue.
     *
     * @param properties Options to create queue with.
     *
     * @return A new {@link QueueProperties} with the set options.
     */
    public static QueueDescription toImplementation(QueueProperties properties) {
        Objects.requireNonNull(properties, "'properties' cannot be null.");

        if (queueAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'queueAccessor' should not be null."));
        }

        final List<com.azure.messaging.servicebus.administration.implementation.models.AuthorizationRule> rules
            = !properties.getAuthorizationRules().isEmpty()
                ? toImplementation(properties.getAuthorizationRules())
                : Collections.emptyList();

        return queueAccessor.toImplementation(properties, rules);
    }

    /**
     * Creates a new rule action given an existing rule action.
     *
     * @param properties Rule properties.
     * @return A new instance of {@link com.azure.messaging.servicebus.administration.implementation.models.RuleAction}.
     */
    public static com.azure.messaging.servicebus.administration.implementation.models.RuleAction
        toImplementation(RuleAction properties) {
        Objects.requireNonNull(properties, "'properties' cannot be null.");

        if (ruleAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'ruleAccessor' should not be null."));
        }

        return ruleAccessor.toImplementation(properties);
    }

    /**
     * Creates a new rule description given an existing rule.
     *
     * @param properties Rule properties.
     * @return A new instance of {@link RuleDescription}.
     */
    public static RuleDescription toImplementation(RuleProperties properties) {
        Objects.requireNonNull(properties, "'properties' cannot be null.");

        if (ruleAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'ruleAccessor' should not be null."));
        }

        return ruleAccessor.toImplementation(properties);
    }

    /**
     * Creates a new rule filter given an existing rule filter.
     *
     * @param properties Rule filter.
     * @return A new instance of {@link com.azure.messaging.servicebus.administration.implementation.models.RuleFilter}.
     */
    public static com.azure.messaging.servicebus.administration.implementation.models.RuleFilter
        toImplementation(RuleFilter properties) {
        Objects.requireNonNull(properties, "'properties' cannot be null.");

        if (ruleAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'ruleAccessor' should not be null."));
        }

        return ruleAccessor.toImplementation(properties);
    }

    /**
     * Creates a new queue given the existing queue.
     *
     * @param description Options to create queue with.
     *
     * @return A new {@link SubscriptionProperties} with the set options.
     */
    public static SubscriptionDescription toImplementation(SubscriptionProperties description) {
        Objects.requireNonNull(description, "'description' cannot be null.");

        if (subscriptionAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'subscriptionAccessor' should not be null."));
        }

        return subscriptionAccessor.toImplementation(description);
    }

    /**
     * Creates a new queue given the existing queue.
     *
     * @param properties Options to create queue with.
     *
     * @return A new {@link TopicProperties} with the set options.
     */
    public static TopicDescription toImplementation(TopicProperties properties) {
        Objects.requireNonNull(properties, "'properties' cannot be null.");

        if (topicAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'topicAccessor' should not be null."));
        }

        final List<com.azure.messaging.servicebus.administration.implementation.models.AuthorizationRule> rules
            = !properties.getAuthorizationRules().isEmpty()
                ? toImplementation(properties.getAuthorizationRules())
                : Collections.emptyList();

        return topicAccessor.toImplementation(properties, rules);
    }

    /**
     * Creates a new queue given the existing queue.
     *
     * @param description Options to create queue with.
     *
     * @return A new {@link QueueProperties} with the set options.
     */
    public static QueueProperties toModel(QueueDescription description) {
        Objects.requireNonNull(description, "'description' cannot be null.");

        if (queueAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'queueAccessor' should not be null."));
        }

        return queueAccessor.toModel(description);
    }

    /**
     * Gets a new rule action based on the existing rule description.
     *
     * @param description The implementation type.
     * @return A new {@link RuleAction} with the set options.
     */
    public static RuleAction
        toModel(com.azure.messaging.servicebus.administration.implementation.models.RuleAction description) {
        Objects.requireNonNull(description, "'description' cannot be null.");

        if (ruleAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'ruleAccessor' should not be null."));
        }

        return ruleAccessor.toModel(description);
    }

    /**
     * Gets a new rule filter based on the existing rule description.
     *
     * @param description The implementation type.
     * @return A new {@link RuleFilter} with the set options.
     */
    public static RuleFilter
        toModel(com.azure.messaging.servicebus.administration.implementation.models.RuleFilter description) {
        Objects.requireNonNull(description, "'description' cannot be null.");

        if (ruleAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'ruleAccessor' should not be null."));
        }

        return ruleAccessor.toModel(description);
    }

    /**
     * Gets a new rule based on the existing rule description.
     *
     * @param description The implementation type.
     * @return A new {@link RuleProperties} with the set options.
     */
    public static RuleProperties toModel(RuleDescription description) {
        Objects.requireNonNull(description, "'description' cannot be null.");

        if (ruleAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'ruleAccessor' should not be null."));
        }

        return ruleAccessor.toModel(description);
    }

    /**
     * Creates a new subscription given the options.
     *
     * @param options Options to create topic with.
     *
     * @return A new {@link SubscriptionProperties} with the set options.
     */
    public static SubscriptionProperties toModel(SubscriptionDescription options) {
        Objects.requireNonNull(options, "'options' cannot be null.");

        if (subscriptionAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'subscriptionAccessor' should not be null."));
        }

        return subscriptionAccessor.toModel(options);
    }

    /**
     * Creates a new topic given the options.
     *
     * @param description Options to create topic with.
     *
     * @return A new {@link TopicProperties} with the set options.
     */
    public static TopicProperties toModel(TopicDescription description) {
        Objects.requireNonNull(description, "'description' cannot be null.");

        if (topicAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'topicAccessor' should not be null."));
        }

        return topicAccessor.toModel(description);
    }

    /**
     * Sets the queue accessor.
     *
     * @param accessor The queue accessor to set on the queue helper.
     */
    public static void setQueueAccessor(QueueAccessor accessor) {
        Objects.requireNonNull(accessor, "'accessor' cannot be null.");

        if (EntityHelper.queueAccessor != null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'accessor' is already set."));
        }

        EntityHelper.queueAccessor = accessor;
    }

    /**
     * Sets the queue name on a {@link QueueProperties}.
     *
     * @param queueProperties Queue to set name on.
     * @param name Name of the queue.
     */
    public static void setQueueName(QueueProperties queueProperties, String name) {
        if (queueAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'queueAccessor' should not be null."));
        }

        queueAccessor.setName(queueProperties, name);
    }

    /**
     * Sets the rule accessor.
     *
     * @param accessor The rule accessor.
     */
    public static void setRuleAccessor(RuleAccessor accessor) {
        Objects.requireNonNull(accessor, "'accessor' cannot be null.");

        if (EntityHelper.ruleAccessor != null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'ruleAccessor' is already set."));
        }

        EntityHelper.ruleAccessor = accessor;
    }

    /**
     * Sets the subscription accessor.
     *
     * @param accessor The subscription accessor.
     */
    public static void setSubscriptionAccessor(SubscriptionAccessor accessor) {
        Objects.requireNonNull(accessor, "'accessor' cannot be null.");

        if (EntityHelper.subscriptionAccessor != null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'subscriptionAccessor' is already set."));
        }

        EntityHelper.subscriptionAccessor = accessor;
    }

    /**
     * Sets the subscription name on a {@link SubscriptionProperties}.
     *
     * @param subscription Subscription to set name on.
     * @param subscriptionName Name of the subscription.
     */
    public static void setSubscriptionName(SubscriptionProperties subscription, String subscriptionName) {
        if (subscriptionAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'subscriptionAccessor' should not be null."));
        }

        subscriptionAccessor.setSubscriptionName(subscription, subscriptionName);
    }

    /**
     * Sets the queue accessor.
     *
     * @param accessor The queue accessor to set on the queue helper.
     */
    public static void setTopicAccessor(TopicAccessor accessor) {
        Objects.requireNonNull(accessor, "'accessor' cannot be null.");

        if (EntityHelper.topicAccessor != null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'topicAccessor' is already set."));
        }

        EntityHelper.topicAccessor = accessor;
    }

    /**
     * Sets the topic name on a {@link SubscriptionProperties}.
     *
     * @param subscription Subscription to set name on.
     * @param topicName Name of the topic.
     */
    public static void setTopicName(SubscriptionProperties subscription, String topicName) {
        if (subscriptionAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'subscriptionAccessor' should not be null."));
        }

        subscriptionAccessor.setTopicName(subscription, topicName);
    }

    /**
     * Sets the topic name on a {@link TopicProperties}.
     *
     * @param topicProperties Topic to set name on.
     * @param topicName Name of the topic.
     */
    public static void setTopicName(TopicProperties topicProperties, String topicName) {
        if (topicAccessor == null) {
            throw LOGGER.logExceptionAsError(new IllegalStateException("'topicAccessor' should not be null."));
        }

        topicAccessor.setName(topicProperties, topicName);
    }

    private static List<com.azure.messaging.servicebus.administration.implementation.models.AuthorizationRule>
        toImplementation(List<AuthorizationRule> rules) {
        return rules.stream().map(rule -> {
            final com.azure.messaging.servicebus.administration.implementation.models.AuthorizationRule implementation
                = new com.azure.messaging.servicebus.administration.implementation.models.AuthorizationRule()
                    .setClaimType(rule.getClaimType())
                    .setClaimValue(rule.getClaimValue())
                    .setCreatedTime(rule.getCreatedAt())
                    .setKeyName(rule.getKeyName())
                    .setModifiedTime(rule.getModifiedAt())
                    .setPrimaryKey(rule.getPrimaryKey())
                    .setSecondaryKey(rule.getSecondaryKey())
                    .setRights(rule.getAccessRights());

            if (rule instanceof SharedAccessAuthorizationRule) {
                // This is the type name constant.
                implementation.setType("SharedAccessAuthorizationRule");
            } else {
                final String className = rule.getClass().getName();
                LOGGER.atWarning().addKeyValue("type", className).log("AuthorizationRule type is unknown.");
                implementation.setType(className);
            }

            return implementation;
        }).collect(Collectors.toList());
    }

    /**
     * Interface for accessing methods on a queue.
     */
    public interface QueueAccessor {
        /**
         * Creates a new queue from the given {@code queueDescription}.
         *
         * @param queueDescription Queue description to use.
         *
         * @return A new queue with the properties set.
         */
        QueueDescription toImplementation(QueueProperties queueDescription,
            List<com.azure.messaging.servicebus.administration.implementation.models.AuthorizationRule> rules);

        /**
         * Creates a new queue from the given {@code queueDescription}.
         *
         * @param queueDescription Queue description to use.
         *
         * @return A new queue with the properties set.
         */
        QueueProperties toModel(QueueDescription queueDescription);

        /**
         * Sets the name on a queueDescription.
         *
         * @param queueProperties Queue to set name on.
         * @param name Name of the queue.
         */
        void setName(QueueProperties queueProperties, String name);
    }

    /**
     * Interface for accessing methods on a rule.
     */
    public interface RuleAccessor {
        RuleProperties toModel(RuleDescription ruleDescriptionImpl);

        RuleAction
            toModel(com.azure.messaging.servicebus.administration.implementation.models.RuleAction implementation);

        RuleFilter
            toModel(com.azure.messaging.servicebus.administration.implementation.models.RuleFilter implementation);

        RuleDescription toImplementation(RuleProperties ruleProperties);

        com.azure.messaging.servicebus.administration.implementation.models.RuleAction
            toImplementation(RuleAction model);

        com.azure.messaging.servicebus.administration.implementation.models.RuleFilter
            toImplementation(RuleFilter model);
    }

    /**
     * Interface for accessing methods on a subscription.
     */
    public interface SubscriptionAccessor {
        /**
         * Creates a model subscription with the given implementation.
         *
         * @param subscription Options used to create subscription.
         *
         * @return A new subscription.
         */
        SubscriptionProperties toModel(SubscriptionDescription subscription);

        /**
         * Creates the implementation subscription with the given subscription.
         *
         * @param subscription Options used to create subscription.
         *
         * @return A new subscription.
         */
        SubscriptionDescription toImplementation(SubscriptionProperties subscription);

        /**
         * Sets the topic name on a subscription.
         *
         * @param subscriptionProperties Subscription to set name on.
         * @param topicName Name of the topic.
         */
        void setTopicName(SubscriptionProperties subscriptionProperties, String topicName);

        /**
         * Sets the subscription name on a subscription description.
         *
         * @param subscriptionProperties Subscription to set name on.
         * @param subscriptionName Name of the subscription.
         */
        void setSubscriptionName(SubscriptionProperties subscriptionProperties, String subscriptionName);
    }

    /**
     * Interface for accessing methods on a topic.
     */
    public interface TopicAccessor {
        /**
         * Sets properties on the TopicProperties based on the CreateTopicOptions.
         *
         * @param topic The model topic.
         *
         * @return A new topic with the properties set.
         */
        TopicDescription toImplementation(TopicProperties topic,
            List<com.azure.messaging.servicebus.administration.implementation.models.AuthorizationRule> rules);

        /**
         * Sets properties on the TopicProperties based on the CreateTopicOptions.
         *
         * @param topic The implementation topic.
         *
         * @return A new topic with the properties set.
         */
        TopicProperties toModel(TopicDescription topic);

        /**
         * Sets the name on a topicDescription.
         *
         * @param topicProperties Topic to set name.
         * @param name Name of the topic.
         */
        void setName(TopicProperties topicProperties, String name);
    }

    /**
     * Converts a Response into its corresponding {@link QueueDescriptionFeed} then mapped into {@link
     * QueueProperties}.
     *
     * @param response HTTP Response to deserialize.
     * @param logger The ClientLogger logging errors and warnings.
     * @return The corresponding HTTP response with convenience properties set.
     */
    public static Response<QueueDescriptionFeed> deserializeQueueFeed(Response<Object> response, ClientLogger logger) {
        String responseBody = response.getValue().toString();

        try (XmlReader xmlReader = XmlReader.fromString(responseBody)) {
            QueueDescriptionFeed entry = QueueDescriptionFeed.fromXml(xmlReader);
            return new SimpleResponse<>(response, entry);
        } catch (IllegalStateException ex) {
            try (XmlReader xmlReader = XmlReader.fromString(responseBody)) {
                TopicDescriptionFeed entryTopic = TopicDescriptionFeed.fromXml(xmlReader);
                logger.atWarning()
                    .addKeyValue("entityName", entryTopic.getTitle())
                    .log("Expected queue feed, but it is a topic feed.");
                return new SimpleResponse<>(response, null);
            } catch (IllegalStateException ignored) {
                return new SimpleResponse<>(response, null);
            } catch (XMLStreamException e) {
                throw new RuntimeException(e);
            }
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Converts a Response into its corresponding {@link QueueDescriptionEntry} then mapped into {@link
     * QueueProperties}.
     *
     * @param response HTTP Response to deserialize.
     * @param logger The ClientLogger logging errors and warnings.
     * @return The corresponding HTTP response with convenience properties set.
     */
    public static Response<QueueProperties> deserializeQueue(Response<Object> response, ClientLogger logger) {
        String responseBody = response.getValue().toString();

        try (XmlReader xmlReader = XmlReader.fromString(responseBody)) {
            QueueDescriptionEntry entry = QueueDescriptionEntry.fromXml(xmlReader);
            // This was an empty response (ie. 204).
            if (entry == null) {
                return new SimpleResponse<>(response, null);
            } else if (entry.getContent() == null) {
                logger.atInfo().addKeyValue("entry", entry).log("The entry content is null. The entity may not exist.");
                return new SimpleResponse<>(response, null);
            }

            final QueueProperties result = EntityHelper.toModel(entry.getContent().getQueueDescription());
            final String queueName = entry.getTitle().getContent();
            EntityHelper.setQueueName(result, queueName);

            return new SimpleResponse<>(response, result);
        } catch (IllegalStateException ex) {
            try (XmlReader xmlReader = XmlReader.fromString(responseBody)) {
                TopicDescriptionEntry entryTopic = TopicDescriptionEntry.fromXml(xmlReader);
                logger.atWarning()
                    .addKeyValue("entityName", entryTopic.getTitle())
                    .log("Expected queue, but it is a topic.");
                return new SimpleResponse<>(response, null);
            } catch (IllegalStateException ignored) {
                return new SimpleResponse<>(response, null);
            } catch (XMLStreamException e) {
                throw new RuntimeException(e);
            }
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Converts a Response into its corresponding {@link TopicDescriptionFeed} then mapped into {@link
     * QueueProperties}.
     *
     * @param response HTTP Response to deserialize.
     * @param logger The ClientLogger logging errors and warnings.
     * @return The corresponding HTTP response with convenience properties set.
     */
    public static Response<TopicDescriptionFeed> deserializeTopicFeed(Response<Object> response, ClientLogger logger) {
        String responseBody = response.getValue().toString();

        try (XmlReader xmlReader = XmlReader.fromString(responseBody)) {
            TopicDescriptionFeed entry = TopicDescriptionFeed.fromXml(xmlReader);
            return new SimpleResponse<>(response, entry);
        } catch (IllegalStateException ex) {
            try (XmlReader xmlReader = XmlReader.fromString(responseBody)) {
                QueueDescriptionFeed entryTopic = QueueDescriptionFeed.fromXml(xmlReader);
                logger.atWarning()
                    .addKeyValue("entityName", entryTopic.getTitle())
                    .log("Expected topic feed, but it is a queue feed.");
                return new SimpleResponse<>(response, null);
            } catch (IllegalStateException ignored) {
                return new SimpleResponse<>(response, null);
            } catch (XMLStreamException e) {
                throw new RuntimeException(e);
            }
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Converts a Response into its corresponding {@link TopicDescriptionEntry} then mapped into {@link
     * QueueProperties}.
     *
     * @param response HTTP Response to deserialize.
     * @param logger The ClientLogger logging errors and warnings.
     * @return The corresponding HTTP response with convenience properties set.
     */
    public static Response<TopicProperties> deserializeTopic(Response<Object> response, ClientLogger logger) {
        String responseBody = response.getValue().toString();

        try (XmlReader xmlReader = XmlReader.fromString(responseBody)) {
            TopicDescriptionEntry entry = TopicDescriptionEntry.fromXml(xmlReader);
            // This was an empty response (ie. 204).
            if (entry == null) {
                return new SimpleResponse<>(response, null);
            } else if (entry.getContent() == null) {
                logger.atWarning()
                    .addKeyValue("entry", entry)
                    .log("The entry content is null. The entity may not exist.");
                return new SimpleResponse<>(response, null);
            }

            final TopicProperties result = EntityHelper.toModel(entry.getContent().getTopicDescription());
            final String topicName = entry.getTitle().getContent();
            EntityHelper.setTopicName(result, topicName);

            return new SimpleResponse<>(response, result);
        } catch (IllegalStateException ex) {
            try (XmlReader xmlReader = XmlReader.fromString(responseBody)) {
                QueueDescriptionEntry entryQueue = QueueDescriptionEntry.fromXml(xmlReader);
                logger.atWarning()
                    .addKeyValue("entityName", entryQueue.getTitle())
                    .log("Expected topic, but it is a queue.");
                return new SimpleResponse<>(response, null);
            } catch (IllegalStateException ignored) {
                return new SimpleResponse<>(response, null);
            } catch (XMLStreamException e) {
                throw new RuntimeException(e);
            }
        } catch (XMLStreamException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Attempts to parse an ISO datetime string as best possible. The initial attempt will use
     * {@link OffsetDateTime#from(TemporalAccessor)} and will fall back to
     * {@link java.time.LocalDateTime#from(TemporalAccessor)} and apply {@link ZoneOffset#UTC} as the
     * timezone.
     *
     * @param datetimeString The datetime string to parse.
     * @return The {@link OffsetDateTime} representing the string.
     * @throws DateTimeParseException If the datetime is neither an ISO offset datetime or ISO local datetime.
     */
    public static OffsetDateTime parseOffsetDateTimeBest(String datetimeString) {
        TemporalAccessor temporal
            = DateTimeFormatter.ISO_DATE_TIME.parseBest(datetimeString, OffsetDateTime::from, LocalDateTime::from);

        return (temporal.query(TemporalQueries.offset()) == null)
            ? LocalDateTime.from(temporal).atOffset(ZoneOffset.UTC)
            : OffsetDateTime.from(temporal);
    }
}
