// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties for generating a Notification. */
@Fluent
public final class NotifyParameters {
    /*
     * The type of event (i.e. AutoShutdown, Cost)
     */
    @JsonProperty(value = "eventName")
    private NotificationChannelEventType eventName;

    /*
     * Properties for the notification in json format.
     */
    @JsonProperty(value = "jsonPayload")
    private String jsonPayload;

    /** Creates an instance of NotifyParameters class. */
    public NotifyParameters() {
    }

    /**
     * Get the eventName property: The type of event (i.e. AutoShutdown, Cost).
     *
     * @return the eventName value.
     */
    public NotificationChannelEventType eventName() {
        return this.eventName;
    }

    /**
     * Set the eventName property: The type of event (i.e. AutoShutdown, Cost).
     *
     * @param eventName the eventName value to set.
     * @return the NotifyParameters object itself.
     */
    public NotifyParameters withEventName(NotificationChannelEventType eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * Get the jsonPayload property: Properties for the notification in json format.
     *
     * @return the jsonPayload value.
     */
    public String jsonPayload() {
        return this.jsonPayload;
    }

    /**
     * Set the jsonPayload property: Properties for the notification in json format.
     *
     * @param jsonPayload the jsonPayload value to set.
     * @return the NotifyParameters object itself.
     */
    public NotifyParameters withJsonPayload(String jsonPayload) {
        this.jsonPayload = jsonPayload;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
