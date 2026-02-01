package com.amazonaws.regions;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@Deprecated
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23866a = "Region";

    /* renamed from: b, reason: collision with root package name */
    private static final String f23867b = "Name";

    /* renamed from: c, reason: collision with root package name */
    private static final String f23868c = "Domain";

    /* renamed from: d, reason: collision with root package name */
    private static final String f23869d = "Endpoint";

    /* renamed from: e, reason: collision with root package name */
    private static final String f23870e = "ServiceName";

    /* renamed from: f, reason: collision with root package name */
    private static final String f23871f = "Http";

    /* renamed from: g, reason: collision with root package name */
    private static final String f23872g = "Https";

    /* renamed from: h, reason: collision with root package name */
    private static final String f23873h = "Hostname";

    @Deprecated
    public d() {
    }

    private static void a(a aVar, Element element, boolean z3) {
        String b4 = b(f23870e, element);
        String b5 = b(f23873h, element);
        String b6 = b(f23871f, element);
        String b7 = b(f23872g, element);
        if (z3 && !h(b5)) {
            throw new IllegalStateException("Invalid service endpoint (" + b5 + ") is detected.");
        }
        aVar.i().put(b4, b5);
        aVar.c().put(b4, Boolean.valueOf(L1.a.f1650s3.equals(b6)));
        aVar.d().put(b4, Boolean.valueOf(L1.a.f1650s3.equals(b7)));
    }

    private static String b(String str, Element element) {
        Node item = element.getElementsByTagName(str).item(0);
        if (item == null) {
            return null;
        }
        return item.getChildNodes().item(0).getNodeValue();
    }

    private static List<a> c(InputStream inputStream, boolean z3) throws IOException {
        try {
            try {
                Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                NodeList elementsByTagName = parse.getElementsByTagName(f23866a);
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < elementsByTagName.getLength(); i4++) {
                    Node item = elementsByTagName.item(i4);
                    if (item.getNodeType() == 1) {
                        arrayList.add(e((Element) item, z3));
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (IOException e4) {
            throw e4;
        } catch (Exception e5) {
            throw new IOException("Unable to parse region metadata file: " + e5.getMessage(), e5);
        }
    }

    public static c d(InputStream inputStream) throws IOException {
        return new c(c(inputStream, false));
    }

    private static a e(Element element, boolean z3) {
        a aVar = new a(b(f23867b, element), b(f23868c, element));
        NodeList elementsByTagName = element.getElementsByTagName(f23869d);
        for (int i4 = 0; i4 < elementsByTagName.getLength(); i4++) {
            a(aVar, (Element) elementsByTagName.item(i4), z3);
        }
        return aVar;
    }

    private static boolean h(String str) {
        return str.endsWith(".amazonaws.com");
    }

    @Deprecated
    public List<a> f(InputStream inputStream) throws IOException {
        return c(inputStream, false);
    }

    @Deprecated
    public List<a> g(InputStream inputStream, boolean z3) throws IOException {
        return c(inputStream, z3);
    }
}
