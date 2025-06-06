// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import java.time.OffsetDateTime;
import java.util.Base64;

/**
 * The FilesUploadRangeHeaders model.
 */
@Fluent
public final class FilesUploadRangeHeaders {
    /*
     * The x-ms-version property.
     */
    @Generated
    private String xMsVersion;

    /*
     * The ETag property.
     */
    @Generated
    private String eTag;

    /*
     * The Last-Modified property.
     */
    @Generated
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-structured-body property.
     */
    @Generated
    private String xMsStructuredBody;

    /*
     * The x-ms-request-id property.
     */
    @Generated
    private String xMsRequestId;

    /*
     * The x-ms-request-server-encrypted property.
     */
    @Generated
    private Boolean xMsRequestServerEncrypted;

    /*
     * The Date property.
     */
    @Generated
    private DateTimeRfc1123 date;

    /*
     * The x-ms-file-last-write-time property.
     */
    @Generated
    private OffsetDateTime xMsFileLastWriteTime;

    /*
     * The Content-MD5 property.
     */
    @Generated
    private byte[] contentMD5;

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    private static final HttpHeaderName X_MS_STRUCTURED_BODY = HttpHeaderName.fromString("x-ms-structured-body");

    private static final HttpHeaderName X_MS_REQUEST_SERVER_ENCRYPTED
        = HttpHeaderName.fromString("x-ms-request-server-encrypted");

    private static final HttpHeaderName X_MS_FILE_LAST_WRITE_TIME
        = HttpHeaderName.fromString("x-ms-file-last-write-time");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of FilesUploadRangeHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public FilesUploadRangeHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        this.eTag = rawHeaders.getValue(HttpHeaderName.ETAG);
        String lastModified = rawHeaders.getValue(HttpHeaderName.LAST_MODIFIED);
        if (lastModified != null) {
            this.lastModified = new DateTimeRfc1123(lastModified);
        } else {
            this.lastModified = null;
        }
        this.xMsStructuredBody = rawHeaders.getValue(X_MS_STRUCTURED_BODY);
        this.xMsRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_REQUEST_ID);
        String xMsRequestServerEncrypted = rawHeaders.getValue(X_MS_REQUEST_SERVER_ENCRYPTED);
        if (xMsRequestServerEncrypted != null) {
            this.xMsRequestServerEncrypted = Boolean.parseBoolean(xMsRequestServerEncrypted);
        } else {
            this.xMsRequestServerEncrypted = null;
        }
        String date = rawHeaders.getValue(HttpHeaderName.DATE);
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        } else {
            this.date = null;
        }
        String xMsFileLastWriteTime = rawHeaders.getValue(X_MS_FILE_LAST_WRITE_TIME);
        if (xMsFileLastWriteTime != null) {
            this.xMsFileLastWriteTime = OffsetDateTime.parse(xMsFileLastWriteTime);
        } else {
            this.xMsFileLastWriteTime = null;
        }
        String contentMD5 = rawHeaders.getValue(HttpHeaderName.CONTENT_MD5);
        if (contentMD5 != null) {
            this.contentMD5 = Base64.getDecoder().decode(contentMD5);
        } else {
            this.contentMD5 = null;
        }
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     * 
     * @return the xMsVersion value.
     */
    @Generated
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     * 
     * @param xMsVersion the xMsVersion value to set.
     * @return the FilesUploadRangeHeaders object itself.
     */
    @Generated
    public FilesUploadRangeHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     * 
     * @return the eTag value.
     */
    @Generated
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     * 
     * @param eTag the eTag value to set.
     * @return the FilesUploadRangeHeaders object itself.
     */
    @Generated
    public FilesUploadRangeHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     * 
     * @return the lastModified value.
     */
    @Generated
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     * 
     * @param lastModified the lastModified value to set.
     * @return the FilesUploadRangeHeaders object itself.
     */
    @Generated
    public FilesUploadRangeHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsStructuredBody property: The x-ms-structured-body property.
     * 
     * @return the xMsStructuredBody value.
     */
    @Generated
    public String getXMsStructuredBody() {
        return this.xMsStructuredBody;
    }

    /**
     * Set the xMsStructuredBody property: The x-ms-structured-body property.
     * 
     * @param xMsStructuredBody the xMsStructuredBody value to set.
     * @return the FilesUploadRangeHeaders object itself.
     */
    @Generated
    public FilesUploadRangeHeaders setXMsStructuredBody(String xMsStructuredBody) {
        this.xMsStructuredBody = xMsStructuredBody;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     * 
     * @return the xMsRequestId value.
     */
    @Generated
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     * 
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the FilesUploadRangeHeaders object itself.
     */
    @Generated
    public FilesUploadRangeHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     * 
     * @return the xMsRequestServerEncrypted value.
     */
    @Generated
    public Boolean isXMsRequestServerEncrypted() {
        return this.xMsRequestServerEncrypted;
    }

    /**
     * Set the xMsRequestServerEncrypted property: The x-ms-request-server-encrypted property.
     * 
     * @param xMsRequestServerEncrypted the xMsRequestServerEncrypted value to set.
     * @return the FilesUploadRangeHeaders object itself.
     */
    @Generated
    public FilesUploadRangeHeaders setXMsRequestServerEncrypted(Boolean xMsRequestServerEncrypted) {
        this.xMsRequestServerEncrypted = xMsRequestServerEncrypted;
        return this;
    }

    /**
     * Get the date property: The Date property.
     * 
     * @return the date value.
     */
    @Generated
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     * 
     * @param date the date value to set.
     * @return the FilesUploadRangeHeaders object itself.
     */
    @Generated
    public FilesUploadRangeHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }

    /**
     * Get the xMsFileLastWriteTime property: The x-ms-file-last-write-time property.
     * 
     * @return the xMsFileLastWriteTime value.
     */
    @Generated
    public OffsetDateTime getXMsFileLastWriteTime() {
        return this.xMsFileLastWriteTime;
    }

    /**
     * Set the xMsFileLastWriteTime property: The x-ms-file-last-write-time property.
     * 
     * @param xMsFileLastWriteTime the xMsFileLastWriteTime value to set.
     * @return the FilesUploadRangeHeaders object itself.
     */
    @Generated
    public FilesUploadRangeHeaders setXMsFileLastWriteTime(OffsetDateTime xMsFileLastWriteTime) {
        this.xMsFileLastWriteTime = xMsFileLastWriteTime;
        return this;
    }

    /**
     * Get the contentMD5 property: The Content-MD5 property.
     * 
     * @return the contentMD5 value.
     */
    @Generated
    public byte[] getContentMD5() {
        return CoreUtils.clone(this.contentMD5);
    }

    /**
     * Set the contentMD5 property: The Content-MD5 property.
     * 
     * @param contentMD5 the contentMD5 value to set.
     * @return the FilesUploadRangeHeaders object itself.
     */
    @Generated
    public FilesUploadRangeHeaders setContentMD5(byte[] contentMD5) {
        this.contentMD5 = CoreUtils.clone(contentMD5);
        return this;
    }
}
