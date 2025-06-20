// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.core.test.junitextensions;

import com.azure.core.test.TestBase;
import com.azure.core.test.TestContextManager;
import com.azure.core.test.TestMode;
import com.azure.core.test.annotation.RecordWithoutRequestBody;
import com.azure.core.test.implementation.TestingHelpers;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.azure.core.test.TestBase.isTestProxyEnabled;
import static com.azure.core.test.implementation.TestingHelpers.getTestName;
import static com.azure.core.test.utils.TestUtils.toURI;

/**
 * A {@link ParameterResolver} implementation that resolves {@link TestContextManager} parameters.
 * <p>
 * Used by the {@link TestBase#setupTest(TestContextManager)} method.
 */
public final class TestContextManagerParameterResolver implements ParameterResolver {
    private static final Pattern CLASS_ITERATION_PATTERN = Pattern.compile("class-template-invocation:#(\\d+)");
    private static final Pattern TEST_ITERATION_PATTERN = Pattern.compile("test-template-invocation:#(\\d+)");

    /**
     * Creates a new instance of TestContextManagerParameterResolver.
     */
    public TestContextManagerParameterResolver() {
    }

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
        throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == TestContextManager.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext context)
        throws ParameterResolutionException {
        TestMode localTestMode = TestingHelpers.getTestMode();
        // for unit tests of playback/recording in azure-core-test, allow for changing the mode per-test.
        if (context.getTags().contains("Record")) {
            localTestMode = TestMode.RECORD;
        } else if (context.getTags().contains("Playback")) {
            localTestMode = TestMode.PLAYBACK;
        } else if (context.getTags().contains("Live")) {
            localTestMode = TestMode.LIVE;
        }

        String trackerTestName = getTestName(context.getTestMethod(), context.getDisplayName(), context.getTestClass());
        Path testClassPath = Paths.get(
            toURI(context.getTestClass().get().getResource(context.getTestClass().get().getSimpleName() + ".class")));

        TestContextManager testContextManager = new TestContextManager(context.getTestMethod().get(), localTestMode,
            isTestProxyEnabled(), context.getTestClass().get().getAnnotation(RecordWithoutRequestBody.class) != null,
            testClassPath, trackerTestName);
        testContextManager.setTestIteration(getTestIteration(context));

        return testContextManager;
    }

    private static Integer getTestIteration(ExtensionContext extensionContext) {
        if (extensionContext == null) {
            return null;
        }

        String uniqueId = extensionContext.getUniqueId();

        int classIteration = -1;
        int methodIteration = -1;

        Matcher matcher = CLASS_ITERATION_PATTERN.matcher(uniqueId);
        if (matcher.find()) {
            classIteration = Integer.parseInt(matcher.group(1));
        }

        matcher = TEST_ITERATION_PATTERN.matcher(uniqueId);
        if (matcher.find()) {
            methodIteration = Integer.parseInt(matcher.group(1));
        }

        if (classIteration == -1 && methodIteration == -1) {
            // There was neither a parameterized class nor method, therefore there isn't an iteration number.
            return null;
        } else if (classIteration == -1) {
            // There was only a method iteration, return it.
            return methodIteration;
        } else if (methodIteration == -1) {
            // There was only a class iteration, return it.
            return classIteration;
        } else {
            // There was both a class and method iteration, return their multiplication.
            return methodIteration * classIteration;
        }
    }
}
