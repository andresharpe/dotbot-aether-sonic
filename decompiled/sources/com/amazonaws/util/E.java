package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Date;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private static com.amazonaws.logging.c f24264a = LogFactory.c(E.class);

    /* renamed from: b, reason: collision with root package name */
    private static DocumentBuilderFactory f24265b = DocumentBuilderFactory.newInstance();

    public static Boolean a(String str, Node node) throws XPathExpressionException {
        String n4 = n(str, node);
        if (p(n4)) {
            return null;
        }
        return Boolean.valueOf(n4);
    }

    public static Byte b(String str, Node node) throws XPathExpressionException {
        String n4 = n(str, node);
        if (p(n4)) {
            return null;
        }
        return Byte.valueOf(n4);
    }

    public static ByteBuffer c(String str, Node node) throws XPathExpressionException {
        String n4 = n(str, node);
        if (p(n4) || o(node)) {
            return null;
        }
        return ByteBuffer.wrap(Base64.b(n4));
    }

    public static Date d(String str, Node node) throws XPathExpressionException {
        String n4 = n(str, node);
        if (p(n4)) {
            return null;
        }
        return k.j(n4);
    }

    public static Double e(String str, Node node) throws XPathExpressionException {
        String n4 = n(str, node);
        if (p(n4)) {
            return null;
        }
        return Double.valueOf(n4);
    }

    public static Float f(String str, Node node) throws XPathExpressionException {
        String n4 = n(str, node);
        if (p(n4)) {
            return null;
        }
        return Float.valueOf(n4);
    }

    public static Integer g(String str, Node node) throws XPathExpressionException {
        String n4 = n(str, node);
        if (p(n4)) {
            return null;
        }
        return Integer.valueOf(n4);
    }

    public static Long h(String str, Node node) throws XPathExpressionException {
        String n4 = n(str, node);
        if (p(n4)) {
            return null;
        }
        return Long.valueOf(n4);
    }

    public static Node i(String str, Node node) throws XPathExpressionException {
        if (node == null) {
            return null;
        }
        return (Node) r().evaluate(str, node, XPathConstants.NODE);
    }

    public static String j(String str, Node node) throws XPathExpressionException {
        return n(str, node);
    }

    public static Document k(InputStream inputStream) throws SAXException, IOException, ParserConfigurationException {
        r rVar = new r(inputStream);
        Document parse = f24265b.newDocumentBuilder().parse(rVar);
        rVar.close();
        return parse;
    }

    public static Document l(String str) throws SAXException, IOException, ParserConfigurationException {
        return k(new ByteArrayInputStream(str.getBytes(w.f24366b)));
    }

    public static Document m(URL url) throws SAXException, IOException, ParserConfigurationException {
        return k(url.openStream());
    }

    private static String n(String str, Node node) throws XPathExpressionException {
        if (o(node)) {
            return null;
        }
        if (!".".equals(str) && i(str, node) == null) {
            return null;
        }
        return r().evaluate(str, node).trim();
    }

    public static boolean o(Node node) {
        return node == null;
    }

    private static boolean p(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return false;
    }

    public static int q(NodeList nodeList) {
        if (nodeList == null) {
            return 0;
        }
        return nodeList.getLength();
    }

    public static XPath r() {
        return XPathFactory.newInstance().newXPath();
    }
}
