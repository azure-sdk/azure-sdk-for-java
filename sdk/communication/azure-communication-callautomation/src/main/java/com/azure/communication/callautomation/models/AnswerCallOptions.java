// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models;

import java.util.HashMap;

import com.azure.core.annotation.Fluent;

/**
 * The options for creating a call.
 */
@Fluent
public final class AnswerCallOptions {
    /**
     * The incoming call context.
     */
    private final String incomingCallContext;

    /**
     * The call back URl.
     */
    private final String callbackUrl;

    /**
     * Media Streaming Configuration.
     */
    private MediaStreamingOptions mediaStreamingOptions;

    /**
     * Transcription Configuration.
     */
    private TranscriptionOptions transcriptionOptions;

    /*
     * AI options for the call.
     */
    private CallIntelligenceOptions callIntelligenceOptions;

    /**
     * The operational context
     */
    private String operationContext;

    /**
     * Custom Context
     */
    private final CustomCallingContext customCallingContext;

    /**
     * Constructor
     *
     * @param incomingCallContext The incoming call context.
     * @param callbackUrl The call back URl.
     */
    public AnswerCallOptions(String incomingCallContext, String callbackUrl) {
        this.incomingCallContext = incomingCallContext;
        this.callbackUrl = callbackUrl;
        this.customCallingContext
            = new CustomCallingContext(new HashMap<String, String>(), new HashMap<String, String>());
    }

    /**
     * Get the incomingCallContext.
     *
     * @return the incomingCallContext.
     */
    public String getIncomingCallContext() {
        return incomingCallContext;
    }

    /**
     * Get the call back url.
     *
     * @return the call back url.
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Get the Transcription configuration.
     *
     * @return the transcriptionOptions.
     */
    public TranscriptionOptions getTranscriptionOptions() {
        return transcriptionOptions;
    }

    /**
     * Get the operationContext.
     *
     * @return the operationContext
     */
    public String getOperationContext() {
        return operationContext;
    }

    /**
     * Set the transcription configuration.
     *
     * @param transcriptionOptions The transcription options.
     * @return the AnswerCallOptions object itself.
     */
    public AnswerCallOptions setTranscriptionOptions(TranscriptionOptions transcriptionOptions) {
        this.transcriptionOptions = transcriptionOptions;
        return this;
    }

    /**
    * Set the operationContext.
    *
    * @param operationContext the operationContext to set
    * @return the AnswerCallOptions object itself.
    */
    public AnswerCallOptions setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the CallIntelligenceOptions property: AI options for the call such as cognitiveServicesEndpoint
     *
     * @return the callIntelligenceOptions value.
     */
    public CallIntelligenceOptions getCallIntelligenceOptions() {
        return this.callIntelligenceOptions;
    }

    /**
     * Set the CallIntelligenceOptions property: AI options for the call such as cognitiveServicesEndpoint
     *
     * @param callIntelligenceOptions the cognitiveServicesEndpoint value to set.
     * @return the AnswerCallOptions object itself.
     */
    public AnswerCallOptions setCallIntelligenceOptions(CallIntelligenceOptions callIntelligenceOptions) {
        this.callIntelligenceOptions = callIntelligenceOptions;
        return this;
    }

    /**
     * Get the Media Streaming configuration.
     *
     * @return the mediaStreamingOptions.
     */
    public MediaStreamingOptions getMediaStreamingOptions() {
        return mediaStreamingOptions;
    }

    /**
     * Set the media streaming configuration.
     *
     * @param mediaStreamingOptions The media streaming options.
     * @return the AnswerCallOptions object itself.
     */
    public AnswerCallOptions setMediaStreamingOptions(MediaStreamingOptions mediaStreamingOptions) {
        this.mediaStreamingOptions = mediaStreamingOptions;
        return this;
    }

    /**
     *  get custom context
     * @return custom context
     */
    public CustomCallingContext getCustomCallingContext() {
        return customCallingContext;
    }
}
