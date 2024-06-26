// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Each event in a server-sent events stream has an `event` and `data` property:
 *
 * ```
 * event: thread.created
 * data: {"id": "thread_123", "object": "thread", ...}
 * ```
 *
 * We emit events whenever a new object is created, transitions to a new state, or is being
 * streamed in parts (deltas). For example, we emit `thread.run.created` when a new run
 * is created, `thread.run.completed` when a run completes, and so on. When an Assistant chooses
 * to create a message during a run, we emit a `thread.message.created event`, a
 * `thread.message.in_progress` event, many `thread.message.delta` events, and finally a
 * `thread.message.completed` event.
 *
 * We may add additional events over time, so we recommend handling unknown events gracefully
 * in your code.
 */
public final class AssistantStreamEvent extends ExpandableStringEnum<AssistantStreamEvent> {

    /**
     * Event sent when a new thread is created. The data of this event is of type AssistantThread.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_CREATED = fromString("thread.created");

    /**
     * Event sent when a new run is created. The data of this event is of type ThreadRun.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_CREATED = fromString("thread.run.created");

    /**
     * Event sent when a run moves to `queued` status. The data of this event is of type ThreadRun.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_QUEUED = fromString("thread.run.queued");

    /**
     * Event sent when a run moves to `in_progress` status. The data of this event is of type ThreadRun.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_IN_PROGRESS = fromString("thread.run.in_progress");

    /**
     * Event sent when a run moves to `requires_action` status. The data of this event is of type ThreadRun.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_REQUIRES_ACTION = fromString("thread.run.requires_action");

    /**
     * Event sent when a run is completed. The data of this event is of type ThreadRun.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_COMPLETED = fromString("thread.run.completed");

    /**
     * Event sent when a run fails. The data of this event is of type ThreadRun.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_FAILED = fromString("thread.run.failed");

    /**
     * Event sent when a run moves to `cancelling` status. The data of this event is of type ThreadRun.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_CANCELLING = fromString("thread.run.cancelling");

    /**
     * Event sent when a run is cancelled. The data of this event is of type ThreadRun.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_CANCELLED = fromString("thread.run.cancelled");

    /**
     * Event sent when a run is expired. The data of this event is of type ThreadRun.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_EXPIRED = fromString("thread.run.expired");

    /**
     * Event sent when a new thread run step is created. The data of this event is of type RunStep.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_STEP_CREATED = fromString("thread.run.step.created");

    /**
     * Event sent when a run step moves to `in_progress` status. The data of this event is of type RunStep.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_STEP_IN_PROGRESS = fromString("thread.run.step.in_progress");

    /**
     * Event sent when a run stepis being streamed. The data of this event is of type RunStepDeltaChunk.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_STEP_DELTA = fromString("thread.run.step.delta");

    /**
     * Event sent when a run step is completed. The data of this event is of type RunStep.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_STEP_COMPLETED = fromString("thread.run.step.completed");

    /**
     * Event sent when a run step fails. The data of this event is of type RunStep.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_STEP_FAILED = fromString("thread.run.step.failed");

    /**
     * Event sent when a run step is cancelled. The data of this event is of type RunStep.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_STEP_CANCELLED = fromString("thread.run.step.cancelled");

    /**
     * Event sent when a run step is expired. The data of this event is of type RunStep.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_RUN_STEP_EXPIRED = fromString("thread.run.step.expired");

    /**
     * Event sent when a new message is created. The data of this event is of type ThreadMessage.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_MESSAGE_CREATED = fromString("thread.message.created");

    /**
     * Event sent when a message moves to `in_progress` status. The data of this event is of type ThreadMessage.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_MESSAGE_IN_PROGRESS = fromString("thread.message.in_progress");

    /**
     * Event sent when a message is being streamed. The data of this event is of type MessageDeltaChunk.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_MESSAGE_DELTA = fromString("thread.message.delta");

    /**
     * Event sent when a message is completed. The data of this event is of type ThreadMessage.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_MESSAGE_COMPLETED = fromString("thread.message.completed");

    /**
     * Event sent before a message is completed. The data of this event is of type ThreadMessage.
     */
    @Generated
    public static final AssistantStreamEvent THREAD_MESSAGE_INCOMPLETE = fromString("thread.message.incomplete");

    /**
     * Event sent when an error occurs, such as an internal server error or a timeout.
     */
    @Generated
    public static final AssistantStreamEvent ERROR = fromString("error");

    /**
     * Event sent when the stream is done.
     */
    @Generated
    public static final AssistantStreamEvent DONE = fromString("done");

    /**
     * Creates a new instance of AssistantStreamEvent value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AssistantStreamEvent() {
    }

    /**
     * Creates or finds a AssistantStreamEvent from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AssistantStreamEvent.
     */
    @Generated
    public static AssistantStreamEvent fromString(String name) {
        return fromString(name, AssistantStreamEvent.class);
    }

    /**
     * Gets known AssistantStreamEvent values.
     *
     * @return known AssistantStreamEvent values.
     */
    @Generated
    public static Collection<AssistantStreamEvent> values() {
        return values(AssistantStreamEvent.class);
    }
}
