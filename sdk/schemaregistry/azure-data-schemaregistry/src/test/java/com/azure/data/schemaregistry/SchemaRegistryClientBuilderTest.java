// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.schemaregistry;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.policy.ExponentialBackoffOptions;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.core.test.utils.MockTokenCredential;
import com.azure.identity.ClientSecretCredential;
import com.azure.identity.ClientSecretCredentialBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit tests for {@link SchemaRegistryClientBuilder}.
 */
public class SchemaRegistryClientBuilderTest {
    @Test
    public void testNullCredentials() {
        assertThrows(NullPointerException.class, () -> new SchemaRegistryClientBuilder().buildAsyncClient());
    }

    @Test
    public void testNullEndpoint() {
        ClientSecretCredential credential = new ClientSecretCredentialBuilder().tenantId("tenant-id")
            .clientId("client-id")
            .clientSecret("client-secret")
            .build();
        assertThrows(NullPointerException.class,
            () -> new SchemaRegistryClientBuilder().credential(credential).buildAsyncClient());
    }

    @Test
    public void testInvalidEndpoint() {
        // Arrange
        final TokenCredential credential = new MockTokenCredential();

        // Act & Assert
        assertThrows(IllegalArgumentException.class,
            () -> new SchemaRegistryClientBuilder().credential(credential)
                .fullyQualifiedNamespace("")
                .buildAsyncClient());
    }

    @Test
    public void testSchemaRegistryClientCreation() {

        ClientSecretCredential credential = new ClientSecretCredentialBuilder().tenantId("tenant-id")
            .clientId("client-id")
            .clientSecret("client-secret")
            .build();

        Assertions.assertNotNull(new SchemaRegistryClientBuilder().credential(credential)
            .fullyQualifiedNamespace("https://localhost")
            .httpClient(request -> Mono.just(new MockHttpResponse(request, 200)))
            .buildAsyncClient());
    }

    @Test
    public void bothRetryOptionsAndRetryPolicySet() {
        ClientSecretCredential credential = new ClientSecretCredentialBuilder().tenantId("tenant-id")
            .clientId("client-id")
            .clientSecret("client-secret")
            .build();

        assertThrows(IllegalStateException.class,
            () -> new SchemaRegistryClientBuilder().credential(credential)
                .fullyQualifiedNamespace("https://localhost")
                .retryOptions(new RetryOptions(new ExponentialBackoffOptions()))
                .retryPolicy(new RetryPolicy())
                .buildAsyncClient());
    }
}
