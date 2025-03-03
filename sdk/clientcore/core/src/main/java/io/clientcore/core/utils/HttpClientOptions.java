// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.utils;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.TypeConditions;
import io.clientcore.core.http.client.HttpClient;
import io.clientcore.core.http.client.HttpClientProvider;
import io.clientcore.core.http.models.ProxyOptions;
import io.clientcore.core.instrumentation.logging.ClientLogger;
import io.clientcore.core.utils.configuration.Configuration;

import java.time.Duration;
import java.util.ServiceLoader;

import static io.clientcore.core.implementation.utils.ImplUtils.getDefaultHttpConnectTimeout;
import static io.clientcore.core.implementation.utils.ImplUtils.getDefaultHttpReadTimeout;
import static io.clientcore.core.implementation.utils.ImplUtils.getDefaultHttpResponseTimeout;
import static io.clientcore.core.implementation.utils.ImplUtils.getDefaultHttpWriteTimeout;
import static io.clientcore.core.implementation.utils.ImplUtils.getTimeout;

/**
 * General configuration options for {@link HttpClient HttpClients}.
 * <p>
 * {@link HttpClient} implementations may not support all configuration options in this class.
 */
@Metadata(conditions = TypeConditions.FLUENT)
public final class HttpClientOptions extends ClientOptions {
    private static final Duration DEFAULT_CONNECTION_IDLE_TIMEOUT = Duration.ofSeconds(60);

    private static final ClientLogger LOGGER = new ClientLogger(HttpClientOptions.class);

    private ProxyOptions proxyOptions;
    private Configuration configuration;
    private Duration connectTimeout;
    private Duration writeTimeout;
    private Duration responseTimeout;
    private Duration readTimeout;
    private Integer maximumConnectionPoolSize;
    private Duration connectionIdleTimeout;
    private Class<? extends HttpClientProvider> httpClientProvider;

    /**
     * Creates a new instance of {@link HttpClientOptions}.
     */
    public HttpClientOptions() {
    }

    @Override
    public HttpClientOptions setApplicationId(String applicationId) {
        super.setApplicationId(applicationId);

        return this;
    }

    /**
     * Sets the {@link ProxyOptions proxy options} that the {@link HttpClient} will use.
     *
     * @param proxyOptions The proxy options to use.
     * @return The updated HttpClientOptions object.
     */
    public HttpClientOptions setProxyOptions(ProxyOptions proxyOptions) {
        this.proxyOptions = proxyOptions;
        return this;
    }

    /**
     * Gets the {@link ProxyOptions proxy options} that the {@link HttpClient} will use.
     *
     * @return The proxy options to use.
     */
    public ProxyOptions getProxyOptions() {
        return proxyOptions;
    }

    /**
     * Sets the configuration store that the {@link HttpClient} will use.
     *
     * @param configuration The configuration store to use.
     * @return The updated HttpClientOptions object.
     */
    public HttpClientOptions setConfiguration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Gets the configuration store that the {@link HttpClient} will use.
     *
     * @return The configuration store to use.
     */
    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the connection timeout for a request to be sent.
     * <p>
     * The connection timeout begins once the request attempts to connect to the remote host and finishes when the
     * connection is resolved.
     * <p>
     * If {@code connectTimeout} is null either {@link Configuration#REQUEST_CONNECT_TIMEOUT_IN_MS} or a 10-second
     * timeout will be used, if it is a {@link Duration} less than or equal to zero then no timeout will be applied.
     * When applying the timeout the greatest of one millisecond and the value of {@code connectTimeout} will be used.
     * <p>
     * The default connection timeout is 10 seconds.
     *
     * @param connectTimeout Connect timeout duration.
     * @return The updated HttpClientOptions object.
     */
    public HttpClientOptions setConnectTimeout(Duration connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * Gets the connection timeout for a request to be sent.
     * <p>
     * The connection timeout begins once the request attempts to connect to the remote host and finishes when the
     * connection is resolved.
     * <p>
     * If {@code connectTimeout} is null either {@link Configuration#REQUEST_CONNECT_TIMEOUT_IN_MS} or a
     * 10-second timeout will be used, if it is a {@link Duration} less than or equal to zero then no timeout will be
     * applied. When applying the timeout the greatest of one millisecond and the value of {@code connectTimeout} will
     * be used.
     * <p>
     * The default connection timeout is 10 seconds.
     *
     * @return The connection timeout of a request to be sent.
     */
    public Duration getConnectTimeout() {
        return getTimeout(connectTimeout, getDefaultHttpConnectTimeout());
    }

    /**
     * Sets the writing timeout for a request to be sent.
     * <p>
     * The writing timeout does not apply to the entire request but to each emission being sent over the wire. For
     * example a request body which emits {@code 10} {@code 8KB} buffers will trigger {@code 10} write operations, the
     * outbound buffer will be periodically checked to determine if it is still draining.
     * <p>
     * If {@code writeTimeout} is null either {@link Configuration#REQUEST_WRITE_TIMEOUT_IN_MS} or a 60-second
     * timeout will be used, if it is a {@link Duration} less than or equal to zero then no write timeout will be
     * applied. When applying the timeout the greatest of one millisecond and the value of {@code writeTimeout} will be
     * used.
     * <p>
     * The default writing timeout is 60 seconds.
     *
     * @param writeTimeout Write operation timeout duration.
     * @return The updated HttpClientOptions object.
     */
    public HttpClientOptions setWriteTimeout(Duration writeTimeout) {
        this.writeTimeout = writeTimeout;
        return this;
    }

    /**
     * Gets the writing timeout for a request to be sent.
     * <p>
     * The writing timeout does not apply to the entire request but to each emission being sent over the wire. For
     * example a request body which emits {@code 10} {@code 8KB} buffers will trigger {@code 10} write operations, the
     * outbound buffer will be periodically checked to determine if it is still draining.
     * <p>
     * If {@code writeTimeout} is null either {@link Configuration#REQUEST_WRITE_TIMEOUT_IN_MS} or a 60-second
     * timeout will be used, if it is a {@link Duration} less than or equal to zero then no write timeout will be
     * applied. When applying the timeout the greatest of one millisecond and the value of {@code writeTimeout} will be
     * used.
     * <p>
     * The default writing timeout is 60 seconds.
     *
     * @return The writing timeout of a request to be sent.
     */
    public Duration getWriteTimeout() {
        return getTimeout(writeTimeout, getDefaultHttpWriteTimeout());
    }

    /**
     * Sets the response timeout duration used when waiting for a server to reply.
     * <p>
     * The response timeout begins once the request write completes and finishes once the first response read is
     * triggered when the server response is received.
     * <p>
     * If {@code responseTimeout} is null either {@link Configuration#REQUEST_RESPONSE_TIMEOUT_IN_MS} or a
     * 60-second timeout will be used, if it is a {@link Duration} less than or equal to zero then no timeout will be
     * applied to the response. When applying the timeout the greatest of one millisecond and the value of
     * {@code responseTimeout} will be used.
     * <p>
     * The default response timeout is 60 seconds.
     *
     * @param responseTimeout Response timeout duration.
     * @return The updated HttpClientOptions object.
     */
    public HttpClientOptions setResponseTimeout(Duration responseTimeout) {
        this.responseTimeout = responseTimeout;
        return this;
    }

    /**
     * Gets the response timeout duration used when waiting for a server to reply.
     * <p>
     * The response timeout begins once the request write completes and finishes once the first response read is
     * triggered when the server response is received.
     * <p>
     * If {@code responseTimeout} is null either {@link Configuration#REQUEST_RESPONSE_TIMEOUT_IN_MS} or a
     * 60-second timeout will be used, if it is a {@link Duration} less than or equal to zero then no timeout will be
     * applied to the response. When applying the timeout the greatest of one millisecond and the value of
     * {@code responseTimeout} will be used.
     * <p>
     * The default response timeout is 60 seconds.
     *
     * @return The response timeout duration.
     */
    public Duration getResponseTimeout() {
        return getTimeout(responseTimeout, getDefaultHttpResponseTimeout());
    }

    /**
     * Sets the read timeout duration used when reading the server response.
     * <p>
     * The read timeout begins once the first response read is triggered after the server response is received. This
     * timeout triggers periodically but won't fire its operation if another read operation has completed between when
     * the timeout is triggered and completes.
     * <p>
     * If {@code readTimeout} is null either {@link Configuration#REQUEST_READ_TIMEOUT_IN_MS} or a 60-second
     * timeout will be used, if it is a {@link Duration} less than or equal to zero then no timeout period will be
     * applied to response read. When applying the timeout the greatest of one millisecond and the value of
     * {@code readTimeout} will be used.
     * <p>
     * The default read timeout is 60 seconds.
     *
     * @param readTimeout Read timeout duration.
     * @return The updated HttpClientOptions object.
     */
    public HttpClientOptions setReadTimeout(Duration readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    /**
     * Gets the read timeout duration used when reading the server response.
     * <p>
     * The read timeout begins once the first response read is triggered after the server response is received. This
     * timeout triggers periodically but won't fire its operation if another read operation has completed between when
     * the timeout is triggered and completes.
     * <p>
     * If {@code readTimeout} is null either {@link Configuration#REQUEST_READ_TIMEOUT_IN_MS} or a 60-second
     * timeout will be used, if it is a {@link Duration} less than or equal to zero then no timeout period will be
     * applied to response read. When applying the timeout the greatest of one millisecond and the value of
     * {@code readTimeout} will be used.
     * <p>
     * The default read timeout is 60 seconds.
     *
     * @return The read timeout duration.
     */
    public Duration getReadTimeout() {
        return getTimeout(readTimeout, getDefaultHttpReadTimeout());
    }

    /**
     * Sets the maximum connection pool size used by the underlying HTTP client.
     * <p>
     * Modifying the maximum connection pool size may have effects on the performance of an application. Increasing the
     * maximum connection pool will result in more connections being available for an application but may result in more
     * contention for network resources. It is recommended to perform performance analysis on different maximum
     * connection pool sizes to find the right configuration for an application.
     * <p>
     * This maximum connection pool size is not a global configuration but an instance level configuration for each
     * {@link HttpClient} created using this {@link HttpClientOptions}.
     * <p>
     * The default maximum connection pool size is determined by the underlying HTTP client. Setting the maximum
     * connection pool size to null resets the configuration to use the default determined by the underlying HTTP
     * client.
     *
     * @param maximumConnectionPoolSize The maximum connection pool size.
     * @return The updated HttpClientOptions object.
     * @throws IllegalArgumentException If {@code maximumConnectionPoolSize} is not null and is less than {@code 1}.
     */
    public HttpClientOptions setMaximumConnectionPoolSize(Integer maximumConnectionPoolSize) {
        if (maximumConnectionPoolSize != null && maximumConnectionPoolSize <= 0) {
            throw LOGGER.logThrowableAsError(
                new IllegalArgumentException("'maximumConnectionPoolSize' cannot be less than 1."));
        }

        this.maximumConnectionPoolSize = maximumConnectionPoolSize;
        return this;
    }

    /**
     * Gets the maximum connection pool size used by the underlying HTTP client.
     * <p>
     * Modifying the maximum connection pool size may have effects on the performance of an application. Increasing the
     * maximum connection pool will result in more connections being available for an application but may result in more
     * contention for network resources. It is recommended to perform performance analysis on different maximum
     * connection pool sizes to find the right configuration for an application.
     * <p>
     * This maximum connection pool size is not a global configuration but an instance level configuration for each
     * {@link HttpClient} created using this {@link HttpClientOptions}.
     * <p>
     * The default maximum connection pool size is determined by the underlying HTTP client. Setting the maximum
     * connection pool size to null resets the configuration to use the default determined by the underlying HTTP
     * client.
     *
     * @return The maximum connection pool size.
     */
    public Integer getMaximumConnectionPoolSize() {
        return maximumConnectionPoolSize;
    }

    /**
     * Sets the duration of time before an idle connection.
     * <p>
     * The connection idle timeout begins once the connection has completed its last network request. Every time the
     * connection is used the idle timeout will reset.
     * <p>
     * If {@code connectionIdleTimeout} is null a 60-second timeout will be used, if it is a {@link Duration} less than
     * or equal to zero then no timeout period will be applied. When applying the timeout the greatest of one
     * millisecond and the value of {@code connectionIdleTimeout} will be used.
     * <p>
     * The default connection idle timeout is 60 seconds.
     *
     * @param connectionIdleTimeout The connection idle timeout duration.
     * @return The updated HttpClientOptions object.
     */
    public HttpClientOptions setConnectionIdleTimeout(Duration connectionIdleTimeout) {
        this.connectionIdleTimeout = connectionIdleTimeout;
        return this;
    }

    /**
     * Gets the duration of time before an idle connection is closed.
     * <p>
     * The default connection idle timeout is 60 seconds.
     *
     * @return The connection idle timeout duration.
     */
    public Duration getConnectionIdleTimeout() {
        return getTimeout(connectionIdleTimeout, DEFAULT_CONNECTION_IDLE_TIMEOUT);
    }

    /**
     * Sets the type of the {@link HttpClientProvider} implementation that should be used to construct an instance of
     * {@link HttpClient}.
     * <p>
     * If the value isn't set or is an empty string the first {@link HttpClientProvider} resolved by {@link ServiceLoader} will
     * be used to create an instance of {@link HttpClient}. If the value is set and doesn't match any
     * {@link HttpClientProvider} resolved by {@link ServiceLoader} an {@link IllegalStateException} will be thrown when
     * attempting to create an instance of {@link HttpClient}.
     *
     * @param httpClientProvider The {@link HttpClientProvider} implementation used to create an instance of
     * {@link HttpClient}.
     * @return The updated HttpClientOptions object.
     */
    public HttpClientOptions setHttpClientProvider(Class<? extends HttpClientProvider> httpClientProvider) {
        this.httpClientProvider = httpClientProvider;
        return this;
    }

    /**
     * Gets type of the {@link HttpClientProvider} implementation that should be used to construct an instance of
     * {@link HttpClient}.
     *
     * @return The {@link HttpClientProvider} implementation used to create an instance of {@link HttpClient}.
     */
    public Class<? extends HttpClientProvider> getHttpClientProvider() {
        return httpClientProvider;
    }
}
