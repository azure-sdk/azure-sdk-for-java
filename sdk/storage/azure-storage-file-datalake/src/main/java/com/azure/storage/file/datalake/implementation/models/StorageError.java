// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * The StorageError model.
 */
@Fluent
public final class StorageError implements XmlSerializable<StorageError> {
    /*
     * The service error response object.
     */
    @Generated
    private StorageErrorError error;

    /**
     * Creates an instance of StorageError class.
     */
    @Generated
    public StorageError() {
    }

    /**
     * Get the error property: The service error response object.
     * 
     * @return the error value.
     */
    @Generated
    public StorageErrorError getError() {
        return this.error;
    }

    /**
     * Set the error property: The service error response object.
     * 
     * @param error the error value to set.
     * @return the StorageError object itself.
     */
    @Generated
    public StorageError setError(StorageErrorError error) {
        this.error = error;
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
        rootElementName = rootElementName == null || rootElementName.isEmpty() ? "StorageError" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeXml(this.error, "error");
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of StorageError from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of StorageError if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the StorageError.
     */
    @Generated
    public static StorageError fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of StorageError from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of StorageError if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the StorageError.
     */
    @Generated
    public static StorageError fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName
            = rootElementName == null || rootElementName.isEmpty() ? "StorageError" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            StorageError deserializedStorageError = new StorageError();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("error".equals(elementName.getLocalPart())) {
                    deserializedStorageError.error = StorageErrorError.fromXml(reader, "error");
                } else {
                    reader.skipElement();
                }
            }

            return deserializedStorageError;
        });
    }
}
