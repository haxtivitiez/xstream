package com.thoughtworks.xstream.io.xml;

import org.dom4j.DocumentFactory;
import org.dom4j.Document;

public class Dom4JWriterTest extends AbstractXMLWriterTest {

    private Document document;

    protected void setUp() throws Exception {
        super.setUp();
        DocumentFactory documentFactory = new DocumentFactory();
        document = documentFactory.createDocument();
        writer = new Dom4JWriter(document);
    }

    protected void assertXmlProducedIs(String expected) {
        String actual = document.getRootElement().asXML().replaceAll("/>", " />");
        assertEquals(expected, actual);
    }

    // inherits tests from superclass
}