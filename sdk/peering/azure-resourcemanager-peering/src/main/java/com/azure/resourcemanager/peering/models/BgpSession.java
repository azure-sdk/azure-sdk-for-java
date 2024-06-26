// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that define a BGP session. */
@Fluent
public final class BgpSession {
    /*
     * The IPv4 prefix that contains both ends' IPv4 addresses.
     */
    @JsonProperty(value = "sessionPrefixV4")
    private String sessionPrefixV4;

    /*
     * The IPv6 prefix that contains both ends' IPv6 addresses.
     */
    @JsonProperty(value = "sessionPrefixV6")
    private String sessionPrefixV6;

    /*
     * The IPv4 session address on Microsoft's end.
     */
    @JsonProperty(value = "microsoftSessionIPv4Address")
    private String microsoftSessionIPv4Address;

    /*
     * The IPv6 session address on Microsoft's end.
     */
    @JsonProperty(value = "microsoftSessionIPv6Address")
    private String microsoftSessionIPv6Address;

    /*
     * The IPv4 session address on peer's end.
     */
    @JsonProperty(value = "peerSessionIPv4Address")
    private String peerSessionIPv4Address;

    /*
     * The IPv6 session address on peer's end.
     */
    @JsonProperty(value = "peerSessionIPv6Address")
    private String peerSessionIPv6Address;

    /*
     * The state of the IPv4 session.
     */
    @JsonProperty(value = "sessionStateV4", access = JsonProperty.Access.WRITE_ONLY)
    private SessionStateV4 sessionStateV4;

    /*
     * The state of the IPv6 session.
     */
    @JsonProperty(value = "sessionStateV6", access = JsonProperty.Access.WRITE_ONLY)
    private SessionStateV6 sessionStateV6;

    /*
     * The maximum number of prefixes advertised over the IPv4 session.
     */
    @JsonProperty(value = "maxPrefixesAdvertisedV4")
    private Integer maxPrefixesAdvertisedV4;

    /*
     * The maximum number of prefixes advertised over the IPv6 session.
     */
    @JsonProperty(value = "maxPrefixesAdvertisedV6")
    private Integer maxPrefixesAdvertisedV6;

    /*
     * The MD5 authentication key of the session.
     */
    @JsonProperty(value = "md5AuthenticationKey")
    private String md5AuthenticationKey;

    /** Creates an instance of BgpSession class. */
    public BgpSession() {
    }

    /**
     * Get the sessionPrefixV4 property: The IPv4 prefix that contains both ends' IPv4 addresses.
     *
     * @return the sessionPrefixV4 value.
     */
    public String sessionPrefixV4() {
        return this.sessionPrefixV4;
    }

    /**
     * Set the sessionPrefixV4 property: The IPv4 prefix that contains both ends' IPv4 addresses.
     *
     * @param sessionPrefixV4 the sessionPrefixV4 value to set.
     * @return the BgpSession object itself.
     */
    public BgpSession withSessionPrefixV4(String sessionPrefixV4) {
        this.sessionPrefixV4 = sessionPrefixV4;
        return this;
    }

    /**
     * Get the sessionPrefixV6 property: The IPv6 prefix that contains both ends' IPv6 addresses.
     *
     * @return the sessionPrefixV6 value.
     */
    public String sessionPrefixV6() {
        return this.sessionPrefixV6;
    }

    /**
     * Set the sessionPrefixV6 property: The IPv6 prefix that contains both ends' IPv6 addresses.
     *
     * @param sessionPrefixV6 the sessionPrefixV6 value to set.
     * @return the BgpSession object itself.
     */
    public BgpSession withSessionPrefixV6(String sessionPrefixV6) {
        this.sessionPrefixV6 = sessionPrefixV6;
        return this;
    }

    /**
     * Get the microsoftSessionIPv4Address property: The IPv4 session address on Microsoft's end.
     *
     * @return the microsoftSessionIPv4Address value.
     */
    public String microsoftSessionIPv4Address() {
        return this.microsoftSessionIPv4Address;
    }

    /**
     * Set the microsoftSessionIPv4Address property: The IPv4 session address on Microsoft's end.
     *
     * @param microsoftSessionIPv4Address the microsoftSessionIPv4Address value to set.
     * @return the BgpSession object itself.
     */
    public BgpSession withMicrosoftSessionIPv4Address(String microsoftSessionIPv4Address) {
        this.microsoftSessionIPv4Address = microsoftSessionIPv4Address;
        return this;
    }

    /**
     * Get the microsoftSessionIPv6Address property: The IPv6 session address on Microsoft's end.
     *
     * @return the microsoftSessionIPv6Address value.
     */
    public String microsoftSessionIPv6Address() {
        return this.microsoftSessionIPv6Address;
    }

    /**
     * Set the microsoftSessionIPv6Address property: The IPv6 session address on Microsoft's end.
     *
     * @param microsoftSessionIPv6Address the microsoftSessionIPv6Address value to set.
     * @return the BgpSession object itself.
     */
    public BgpSession withMicrosoftSessionIPv6Address(String microsoftSessionIPv6Address) {
        this.microsoftSessionIPv6Address = microsoftSessionIPv6Address;
        return this;
    }

    /**
     * Get the peerSessionIPv4Address property: The IPv4 session address on peer's end.
     *
     * @return the peerSessionIPv4Address value.
     */
    public String peerSessionIPv4Address() {
        return this.peerSessionIPv4Address;
    }

    /**
     * Set the peerSessionIPv4Address property: The IPv4 session address on peer's end.
     *
     * @param peerSessionIPv4Address the peerSessionIPv4Address value to set.
     * @return the BgpSession object itself.
     */
    public BgpSession withPeerSessionIPv4Address(String peerSessionIPv4Address) {
        this.peerSessionIPv4Address = peerSessionIPv4Address;
        return this;
    }

    /**
     * Get the peerSessionIPv6Address property: The IPv6 session address on peer's end.
     *
     * @return the peerSessionIPv6Address value.
     */
    public String peerSessionIPv6Address() {
        return this.peerSessionIPv6Address;
    }

    /**
     * Set the peerSessionIPv6Address property: The IPv6 session address on peer's end.
     *
     * @param peerSessionIPv6Address the peerSessionIPv6Address value to set.
     * @return the BgpSession object itself.
     */
    public BgpSession withPeerSessionIPv6Address(String peerSessionIPv6Address) {
        this.peerSessionIPv6Address = peerSessionIPv6Address;
        return this;
    }

    /**
     * Get the sessionStateV4 property: The state of the IPv4 session.
     *
     * @return the sessionStateV4 value.
     */
    public SessionStateV4 sessionStateV4() {
        return this.sessionStateV4;
    }

    /**
     * Get the sessionStateV6 property: The state of the IPv6 session.
     *
     * @return the sessionStateV6 value.
     */
    public SessionStateV6 sessionStateV6() {
        return this.sessionStateV6;
    }

    /**
     * Get the maxPrefixesAdvertisedV4 property: The maximum number of prefixes advertised over the IPv4 session.
     *
     * @return the maxPrefixesAdvertisedV4 value.
     */
    public Integer maxPrefixesAdvertisedV4() {
        return this.maxPrefixesAdvertisedV4;
    }

    /**
     * Set the maxPrefixesAdvertisedV4 property: The maximum number of prefixes advertised over the IPv4 session.
     *
     * @param maxPrefixesAdvertisedV4 the maxPrefixesAdvertisedV4 value to set.
     * @return the BgpSession object itself.
     */
    public BgpSession withMaxPrefixesAdvertisedV4(Integer maxPrefixesAdvertisedV4) {
        this.maxPrefixesAdvertisedV4 = maxPrefixesAdvertisedV4;
        return this;
    }

    /**
     * Get the maxPrefixesAdvertisedV6 property: The maximum number of prefixes advertised over the IPv6 session.
     *
     * @return the maxPrefixesAdvertisedV6 value.
     */
    public Integer maxPrefixesAdvertisedV6() {
        return this.maxPrefixesAdvertisedV6;
    }

    /**
     * Set the maxPrefixesAdvertisedV6 property: The maximum number of prefixes advertised over the IPv6 session.
     *
     * @param maxPrefixesAdvertisedV6 the maxPrefixesAdvertisedV6 value to set.
     * @return the BgpSession object itself.
     */
    public BgpSession withMaxPrefixesAdvertisedV6(Integer maxPrefixesAdvertisedV6) {
        this.maxPrefixesAdvertisedV6 = maxPrefixesAdvertisedV6;
        return this;
    }

    /**
     * Get the md5AuthenticationKey property: The MD5 authentication key of the session.
     *
     * @return the md5AuthenticationKey value.
     */
    public String md5AuthenticationKey() {
        return this.md5AuthenticationKey;
    }

    /**
     * Set the md5AuthenticationKey property: The MD5 authentication key of the session.
     *
     * @param md5AuthenticationKey the md5AuthenticationKey value to set.
     * @return the BgpSession object itself.
     */
    public BgpSession withMd5AuthenticationKey(String md5AuthenticationKey) {
        this.md5AuthenticationKey = md5AuthenticationKey;
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
