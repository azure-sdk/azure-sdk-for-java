// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * Settings for SMB multichannel.
 */
@Fluent
public final class SmbMultichannel implements XmlSerializable<SmbMultichannel> {
    /*
     * If SMB multichannel is enabled.
     */
    @Generated
    private Boolean enabled;

    /**
     * Creates an instance of SmbMultichannel class.
     */
    @Generated
    public SmbMultichannel() {
    }

    /**
     * Get the enabled property: If SMB multichannel is enabled.
     * 
     * @return the enabled value.
     */
    @Generated
    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: If SMB multichannel is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the SmbMultichannel object itself.
     */
    @Generated
    public SmbMultichannel setEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        rootElementName = rootElementName == null || rootElementName.isEmpty() ? "Multichannel" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        xmlWriter.writeBooleanElement("Enabled", this.enabled);
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of SmbMultichannel from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @return An instance of SmbMultichannel if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the SmbMultichannel.
     */
    @Generated
    public static SmbMultichannel fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of SmbMultichannel from the XmlReader.
     * 
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of SmbMultichannel if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the SmbMultichannel.
     */
    @Generated
    public static SmbMultichannel fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName
            = rootElementName == null || rootElementName.isEmpty() ? "Multichannel" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            SmbMultichannel deserializedSmbMultichannel = new SmbMultichannel();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();

                if ("Enabled".equals(elementName.getLocalPart())) {
                    deserializedSmbMultichannel.enabled = reader.getNullableElement(Boolean::parseBoolean);
                } else {
                    reader.skipElement();
                }
            }

            return deserializedSmbMultichannel;
        });
    }
}
