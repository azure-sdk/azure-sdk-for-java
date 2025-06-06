// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.queue.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import java.time.OffsetDateTime;
import java.util.Objects;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * The object returned in the QueueMessageList array when calling Peek Messages on a Queue.
 */
@Fluent
public final class PeekedMessageItemInternal implements XmlSerializable<PeekedMessageItemInternal> {
    /*
     * The Id of the Message.
     */
    @Generated
    private String messageId;

    /*
     * The time the Message was inserted into the Queue.
     */
    @Generated
    private DateTimeRfc1123 insertionTime;

    /*
     * The time that the Message will expire and be automatically deleted.
     */
    @Generated
    private DateTimeRfc1123 expirationTime;

    /*
     * The number of times the message has been dequeued.
     */
    @Generated
    private long dequeueCount;

    /*
     * The content of the Message.
     */
    @Generated
    private String messageText;

    /**
     * Creates an instance of PeekedMessageItemInternal class.
     */
    @Generated
    public PeekedMessageItemInternal() {
    }

    /**
     * Get the messageId property: The Id of the Message.
     * 
     * @return the messageId value.
     */
    @Generated
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * Set the messageId property: The Id of the Message.
     * 
     * @param messageId the messageId value to set.
     * @return the PeekedMessageItemInternal object itself.
     */
    @Generated
    public PeekedMessageItemInternal setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Get the insertionTime property: The time the Message was inserted into the Queue.
     * 
     * @return the insertionTime value.
     */
    @Generated
    public OffsetDateTime getInsertionTime() {
        if (this.insertionTime == null) {
            return null;
        }
        return this.insertionTime.getDateTime();
    }

    /**
     * Set the insertionTime property: The time the Message was inserted into the Queue.
     * 
     * @param insertionTime the insertionTime value to set.
     * @return the PeekedMessageItemInternal object itself.
     */
    @Generated
    public PeekedMessageItemInternal setInsertionTime(OffsetDateTime insertionTime) {
        if (insertionTime == null) {
            this.insertionTime = null;
        } else {
            this.insertionTime = new DateTimeRfc1123(insertionTime);
        }
        return this;
    }

    /**
     * Get the expirationTime property: The time that the Message will expire and be automatically deleted.
     * 
     * @return the expirationTime value.
     */
    @Generated
    public OffsetDateTime getExpirationTime() {
        if (this.expirationTime == null) {
            return null;
        }
        return this.expirationTime.getDateTime();
    }

    /**
     * Set the expirationTime property: The time that the Message will expire and be automatically deleted.
     * 
     * @param expirationTime the expirationTime value to set.
     * @return the PeekedMessageItemInternal object itself.
     */
    @Generated
    public PeekedMessageItemInternal setExpirationTime(OffsetDateTime expirationTime) {
        if (expirationTime == null) {
            this.expirationTime = null;
        } else {
            this.expirationTime = new DateTimeRfc1123(expirationTime);
        }
        return this;
    }

    /**
     * Get the dequeueCount property: The number of times the message has been dequeued.
     * 
     * @return the dequeueCount value.
     */
    @Generated
    public long getDequeueCount() {
        return this.dequeueCount;
    }

    /**
     * Set the dequeueCount property: The number of times the message has been dequeued.
     * 
     * @param dequeueCount the dequeueCount value to set.
     * @return the PeekedMessageItemInternal object itself.
     */
    @Generated
    public PeekedMessageItemInternal setDequeueCount(long dequeueCount) {
        this.dequeueCount = dequeueCount;
        return this;
    }

    /**
     * Get the messageText property: The content of the Message.
     * 
     * @return the messageText value.
     */
    @Generated
    public String getMessageText() {
        return this.messageText;
    }

    /**
     * Set the messageText property: The content of the Message.
     * 
     * @param messageText the messageText value to set.
     * @return the PeekedMessageItemInternal object itself.
     */
    @Generated
    public PeekedMessageItemInternal setMessageText(String messageText) {
        this.messageText = messageText;
        return this;
    }

    @Generated
    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Generated
    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = rootElementName == null || rootElementName.isEmpty() ? "QueueMessage" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeStringElement("MessageId", this.messageId);
        xmlWriter.writeStringElement("InsertionTime", Objects.toString(this.insertionTime, null));
        xmlWriter.writeStringElement("ExpirationTime", Objects.toString(this.expirationTime, null));
        xmlWriter.writeLongElement("DequeueCount", this.dequeueCount);
        xmlWriter.writeStringElement("MessageText", this.messageText);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of PeekedMessageItemInternal from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of PeekedMessageItemInternal if the XmlReader was pointing to an instance of it, or null if
     * it was pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the PeekedMessageItemInternal.
     */
    @Generated
    public static PeekedMessageItemInternal fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of PeekedMessageItemInternal from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of PeekedMessageItemInternal if the XmlReader was pointing to an instance of it, or null if
     * it was pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the PeekedMessageItemInternal.
     */
    @Generated
    public static PeekedMessageItemInternal fromXml(XmlReader xmlReader, String rootElementName)
        throws XMLStreamException {
        String finalRootElementName
            = rootElementName == null || rootElementName.isEmpty() ? "QueueMessage" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            PeekedMessageItemInternal deserializedPeekedMessageItemInternal = new PeekedMessageItemInternal();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("MessageId".equals(elementName.getLocalPart())) {
                    deserializedPeekedMessageItemInternal.messageId = reader.getStringElement();
                } else if ("InsertionTime".equals(elementName.getLocalPart())) {
                    deserializedPeekedMessageItemInternal.insertionTime
                        = reader.getNullableElement(DateTimeRfc1123::new);
                } else if ("ExpirationTime".equals(elementName.getLocalPart())) {
                    deserializedPeekedMessageItemInternal.expirationTime
                        = reader.getNullableElement(DateTimeRfc1123::new);
                } else if ("DequeueCount".equals(elementName.getLocalPart())) {
                    deserializedPeekedMessageItemInternal.dequeueCount = reader.getLongElement();
                } else if ("MessageText".equals(elementName.getLocalPart())) {
                    deserializedPeekedMessageItemInternal.messageText = reader.getStringElement();
                } else {
                    reader.skipElement();
                }
            }

            return deserializedPeekedMessageItemInternal;
        });
    }
}
