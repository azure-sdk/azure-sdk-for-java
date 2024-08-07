// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.autoconfigure.implementation.aadb2c.security;

import com.azure.spring.cloud.autoconfigure.implementation.aadb2c.security.exception.AadB2cConfigurationException;
import org.springframework.util.Assert;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * To get AAD B2C URLs for configuration.
 */
public final class AadB2cUrl {

    private static final String MSG_USER_FLOW_CANNOT_BE_EMPTY = "user flow should have text.";

    private AadB2cUrl() {

    }

    private static final String AUTHORIZATION_URL_PATTERN = "oauth2/v2.0/authorize";

    private static final String TOKEN_URL_PATTERN = "oauth2/v2.0/token?p=";

    private static final String JWKSET_URL_PATTERN = "discovery/v2.0/keys?p=";

    private static final String END_SESSION_URL_PATTERN = "oauth2/v2.0/logout?post_logout_redirect_uri=%s&p=%s";

    private static final String AAD_TOKEN_URL_PATTERN = "https://login.microsoftonline.com/%s/oauth2/v2.0/token";
    private static final String AAD_JWKSET_URL_PATTERN = "https://login.microsoftonline.com/%s/discovery/v2.0/keys";

    /**
     * Gets the authorization URL.
     *
     * @param baseUri the base URI
     * @return the authorization URL
     */
    public static String getAuthorizationUrl(String baseUri) {
        return addSlash(baseUri) + AUTHORIZATION_URL_PATTERN;
    }

    /**
     * Gets the token URL.
     *
     * @param baseUri the base URI
     * @param userFlow the user flow
     * @return the token URL
     */
    public static String getTokenUrl(String baseUri, String userFlow) {
        Assert.hasText(userFlow, MSG_USER_FLOW_CANNOT_BE_EMPTY);

        return addSlash(baseUri) + TOKEN_URL_PATTERN + userFlow;
    }

    /**
     * Gets the AAD token URL.
     *
     * @param tenantId the tenant ID
     * @return the AAD token URL
     */
    public static String getAADTokenUrl(String tenantId) {
        Assert.hasText(tenantId, "tenantId should have text.");
        return String.format(AAD_TOKEN_URL_PATTERN, tenantId);
    }

    /**
     * Gets the AAD JWK set URL
     *
     * @param tenantId the tenant ID
     * @return the AAD JWK set URL
     */
    public static String getAADJwkSetUrl(String tenantId) {
        Assert.hasText(tenantId, "tenantId should have text.");
        return String.format(AAD_JWKSET_URL_PATTERN, tenantId);
    }

    /**
     * Gets the JWK set URL.
     *
     * @param baseUri the base URI
     * @param userFlow the user flow
     * @return the JWK set URL
     */
    public static String getJwkSetUrl(String baseUri, String userFlow) {
        Assert.hasText(userFlow, MSG_USER_FLOW_CANNOT_BE_EMPTY);

        return addSlash(baseUri) + JWKSET_URL_PATTERN + userFlow;
    }

    /**
     * Gets the end session URL.
     *
     * @param baseUri the base URI
     * @param logoutUrl the logout URL
     * @param userFlow the user flow
     * @return the end session URL
     */
    public static String getEndSessionUrl(String baseUri, String logoutUrl, String userFlow) {
        Assert.hasText(logoutUrl, "logoutUrl should have text.");
        Assert.hasText(userFlow, MSG_USER_FLOW_CANNOT_BE_EMPTY);

        return addSlash(baseUri) + String.format(END_SESSION_URL_PATTERN, getEncodedURL(logoutUrl), userFlow);
    }

    private static String getEncodedURL(String url) {
        Assert.hasText(url, "url should have text.");

        try {
            return URLEncoder.encode(url, "utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new AadB2cConfigurationException("failed to encode url: " + url, e);
        }
    }

    private static String addSlash(String uri) {
        return uri.endsWith("/") ? uri : uri + "/";
    }
}
