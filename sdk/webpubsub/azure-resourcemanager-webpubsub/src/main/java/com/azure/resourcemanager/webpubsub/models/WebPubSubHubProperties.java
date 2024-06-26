// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a hub. */
@Fluent
public final class WebPubSubHubProperties {
    /*
     * Event handler of a hub.
     */
    @JsonProperty(value = "eventHandlers")
    private List<EventHandler> eventHandlers;

    /*
     * Event listener settings for forwarding your client events to listeners.
     * Event listener is transparent to Web PubSub clients, and it doesn't return any result to clients nor interrupt
     * the lifetime of clients.
     * One event can be sent to multiple listeners, as long as it matches the filters in those listeners. The order of
     * the array elements doesn't matter.
     * Maximum count of event listeners among all hubs is 10.
     */
    @JsonProperty(value = "eventListeners")
    private List<EventListener> eventListeners;

    /*
     * The settings for configuring if anonymous connections are allowed for this hub: "allow" or "deny". Default to
     * "deny".
     */
    @JsonProperty(value = "anonymousConnectPolicy")
    private String anonymousConnectPolicy;

    /** Creates an instance of WebPubSubHubProperties class. */
    public WebPubSubHubProperties() {
    }

    /**
     * Get the eventHandlers property: Event handler of a hub.
     *
     * @return the eventHandlers value.
     */
    public List<EventHandler> eventHandlers() {
        return this.eventHandlers;
    }

    /**
     * Set the eventHandlers property: Event handler of a hub.
     *
     * @param eventHandlers the eventHandlers value to set.
     * @return the WebPubSubHubProperties object itself.
     */
    public WebPubSubHubProperties withEventHandlers(List<EventHandler> eventHandlers) {
        this.eventHandlers = eventHandlers;
        return this;
    }

    /**
     * Get the eventListeners property: Event listener settings for forwarding your client events to listeners. Event
     * listener is transparent to Web PubSub clients, and it doesn't return any result to clients nor interrupt the
     * lifetime of clients. One event can be sent to multiple listeners, as long as it matches the filters in those
     * listeners. The order of the array elements doesn't matter. Maximum count of event listeners among all hubs is 10.
     *
     * @return the eventListeners value.
     */
    public List<EventListener> eventListeners() {
        return this.eventListeners;
    }

    /**
     * Set the eventListeners property: Event listener settings for forwarding your client events to listeners. Event
     * listener is transparent to Web PubSub clients, and it doesn't return any result to clients nor interrupt the
     * lifetime of clients. One event can be sent to multiple listeners, as long as it matches the filters in those
     * listeners. The order of the array elements doesn't matter. Maximum count of event listeners among all hubs is 10.
     *
     * @param eventListeners the eventListeners value to set.
     * @return the WebPubSubHubProperties object itself.
     */
    public WebPubSubHubProperties withEventListeners(List<EventListener> eventListeners) {
        this.eventListeners = eventListeners;
        return this;
    }

    /**
     * Get the anonymousConnectPolicy property: The settings for configuring if anonymous connections are allowed for
     * this hub: "allow" or "deny". Default to "deny".
     *
     * @return the anonymousConnectPolicy value.
     */
    public String anonymousConnectPolicy() {
        return this.anonymousConnectPolicy;
    }

    /**
     * Set the anonymousConnectPolicy property: The settings for configuring if anonymous connections are allowed for
     * this hub: "allow" or "deny". Default to "deny".
     *
     * @param anonymousConnectPolicy the anonymousConnectPolicy value to set.
     * @return the WebPubSubHubProperties object itself.
     */
    public WebPubSubHubProperties withAnonymousConnectPolicy(String anonymousConnectPolicy) {
        this.anonymousConnectPolicy = anonymousConnectPolicy;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (eventHandlers() != null) {
            eventHandlers().forEach(e -> e.validate());
        }
        if (eventListeners() != null) {
            eventListeners().forEach(e -> e.validate());
        }
    }
}
