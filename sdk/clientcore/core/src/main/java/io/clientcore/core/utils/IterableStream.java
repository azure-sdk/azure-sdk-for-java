// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * This class provides utility to iterate over values using standard 'for-each' style loops or to convert them into a
 * {@link Stream} and operate in that fashion.
 *
 * <p>
 * <strong>Code sample using Stream</strong>
 * </p>
 *
 * <!-- src_embed io.clientcore.core.utils.IterableStream.stream -->
 * <pre>
 * &#47;&#47; process the stream
 * myIterableStream.stream&#40;&#41;.forEach&#40;resp -&gt; &#123;
 *     if &#40;resp.getStatusCode&#40;&#41; == HttpURLConnection.HTTP_OK&#41; &#123;
 *         System.out.printf&#40;&quot;Response headers are %s. URI %s%n&quot;, resp.getHeaders&#40;&#41;, resp.getRequest&#40;&#41;.getUri&#40;&#41;&#41;;
 *         resp.getValue&#40;&#41;.forEach&#40;value -&gt; System.out.printf&#40;&quot;Response value is %d%n&quot;, value&#41;&#41;;
 *     &#125;
 * &#125;&#41;;
 * </pre>
 * <!-- end io.clientcore.core.utils.IterableStream.stream -->
 *
 * <p>
 * <strong>Code sample using Iterator</strong>
 * </p>
 *
 * <!-- src_embed io.clientcore.core.utils.IterableStream.iterator.while -->
 * <pre>
 * &#47;&#47; Iterate over iterator
 * for &#40;PagedResponse&lt;Integer&gt; resp : myIterableStream&#41; &#123;
 *     if &#40;resp.getStatusCode&#40;&#41; == HttpURLConnection.HTTP_OK&#41; &#123;
 *         System.out.printf&#40;&quot;Response headers are %s. URI %s%n&quot;, resp.getHeaders&#40;&#41;,
 *             resp.getRequest&#40;&#41;.getUri&#40;&#41;&#41;;
 *         resp.getValue&#40;&#41;.forEach&#40;value -&gt; System.out.printf&#40;&quot;Response value is %d%n&quot;, value&#41;&#41;;
 *     &#125;
 * &#125;
 * </pre>
 * <!-- end io.clientcore.core.utils.IterableStream.iterator.while -->
 *
 * <p>
 * <strong>Code sample using Stream and filter</strong>
 * </p>
 *
 * <!-- src_embed io.clientcore.core.utils.IterableStream.stream.filter -->
 * <pre>
 * &#47;&#47; process the stream
 * myIterableStream.stream&#40;&#41;.filter&#40;resp -&gt; resp.getStatusCode&#40;&#41; == HttpURLConnection.HTTP_OK&#41;
 *     .limit&#40;10&#41;
 *     .forEach&#40;resp -&gt; &#123;
 *         System.out.printf&#40;&quot;Response headers are %s. URI %s%n&quot;, resp.getHeaders&#40;&#41;,
 *             resp.getRequest&#40;&#41;.getUri&#40;&#41;&#41;;
 *         resp.getValue&#40;&#41;.forEach&#40;value -&gt; System.out.printf&#40;&quot;Response value is %d%n&quot;, value&#41;&#41;;
 *     &#125;&#41;;
 * </pre>
 * <!-- end io.clientcore.core.utils.IterableStream.stream.filter -->
 *
 * @param <T> The type of value in this {@link Iterable}.
 * @see Iterable
 */
public class IterableStream<T> implements Iterable<T> {
    /*
     * This is the default batch size that will be requested when using stream or iterable by page, this will indicate
     * to Reactor how many elements should be prefetched before another batch is requested.
     */
    private static final int DEFAULT_BATCH_SIZE = 1;
    private static final IterableStream<Object> EMPTY = new IterableStream<>(new ArrayList<>());

    private final Iterable<T> iterable;

    /**
     * Creates an instance with the given {@link Iterable}.
     *
     * @param iterable Collection of items to iterate over.
     * @throws NullPointerException If {@code iterable} is {@code null}.
     */
    public IterableStream(Iterable<T> iterable) {
        this.iterable = Objects.requireNonNull(iterable, "'iterable' cannot be null.");
    }

    /**
     * Utility function to provide {@link Stream} of value {@code T}.
     *
     * @return {@link Stream} of value {@code T}.
     */
    public Stream<T> stream() {
        return StreamSupport.stream(iterable.spliterator(), false);
    }

    /**
     * Utility function to provide {@link Iterator} of value {@code T}.
     *
     * @return {@link Iterator} of value {@code T}.
     */
    @Override
    public Iterator<T> iterator() {
        return iterable.iterator();
    }

    /**
     * Creates an {@link IterableStream} from an {@link Iterable}.
     * <p>
     * An empty {@link IterableStream} will be returned if the input iterable is {@code null}.
     *
     * @param iterable Collection of items to iterate over.
     * @param <T> The type of value in this {@link Iterable}.
     * @return An {@link IterableStream} based on the passed collection.
     */
    @SuppressWarnings("unchecked")
    public static <T> IterableStream<T> of(Iterable<T> iterable) {
        if (iterable == null) {
            return (IterableStream<T>) EMPTY;
        } else {
            return new IterableStream<T>(iterable);
        }
    }
}
