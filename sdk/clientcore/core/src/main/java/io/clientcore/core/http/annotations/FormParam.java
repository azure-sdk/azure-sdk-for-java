// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.http.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation for form parameters to be sent to a REST API Request URI.
 *
 * <p><strong>Example:</strong></p>
 *
 * <!-- src_embed io.clientcore.core.annotation.http.FormParam.class -->
 * <pre>
 * &#64;HttpRequestInformation&#40;method = HttpMethod.POST, path = &quot;spellcheck&quot;, returnValueWireType = ResponseBody.class&#41;
 * Response&lt;ResponseBody&gt; spellChecker&#40;&#64;HeaderParam&#40;&quot;X-BingApis-SDK&quot;&#41; String xBingApisSDK,
 *     &#64;QueryParam&#40;&quot;UserId&quot;&#41; String userId, &#64;FormParam&#40;&quot;Text&quot;&#41; String text&#41;;
 * </pre>
 * <!-- end io.clientcore.core.annotation.http.FormParam.class -->
 *
 * <p>The value of parameter text will be encoded and encoded value will be added to the form data sent to the API.</p>
 */
@Retention(RUNTIME)
@Target(PARAMETER)
public @interface FormParam {
    /**
     * Gets the name of the key in a key-value pair as part of the form data.
     *
     * @return The name of the key in a key value pair as part of the form data.
     */
    String value();

    /**
     * Whether the form parameter is already form encoded.
     * <p>
     * A value true for this argument indicates that value of {@link FormParam#value()} is already encoded hence engine
     * should not encode it, by default value will be encoded.
     *
     * @return Whether this query parameter is already encoded.
     */
    boolean encoded() default false;
}
