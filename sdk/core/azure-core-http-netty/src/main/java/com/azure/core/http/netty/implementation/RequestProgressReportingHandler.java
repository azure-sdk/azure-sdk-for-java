// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.netty.implementation;

import com.azure.core.util.ProgressReporter;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.channel.FileRegion;

import java.util.Objects;

/**
 * Channel handler that reports progress as data is written to the channel.
 */
public final class RequestProgressReportingHandler extends ChannelOutboundHandlerAdapter {
    /**
     * Name of the handler when it is added into a ChannelPipeline.
     */
    public static final String HANDLER_NAME = "azureRequestProgressHandler";

    private final ProgressReporter progressReporter;

    /**
     * Creates a channel handler that reports progress as data is written to the channel.
     *
     * @param progressReporter The progress reporter.
     * @throws NullPointerException If {@code progressReporter} is null.
     */
    public RequestProgressReportingHandler(ProgressReporter progressReporter) {
        this.progressReporter = Objects.requireNonNull(progressReporter, "'progressReporter' must not be null");
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) {

        if (msg instanceof ByteBuf) {
            progressReporter.reportProgress(((ByteBuf) msg).readableBytes());
        } else if (msg instanceof ByteBufHolder) {
            progressReporter.reportProgress(((ByteBufHolder) msg).content().readableBytes());
        } else if (msg instanceof FileRegion) {
            progressReporter.reportProgress(((FileRegion) msg).count());
        }

        ctx.write(msg, promise.unvoid());
    }
}
