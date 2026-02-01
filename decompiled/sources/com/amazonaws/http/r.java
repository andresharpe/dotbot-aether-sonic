package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.w;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public class r<T> implements m<com.amazonaws.c<T>> {

    /* renamed from: b, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23699b = LogFactory.d("com.amazonaws.request");

    /* renamed from: c, reason: collision with root package name */
    private static final XmlPullParserFactory f23700c;

    /* renamed from: a, reason: collision with root package name */
    private com.amazonaws.transform.m<T, com.amazonaws.transform.l> f23701a;

    static {
        try {
            f23700c = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e4) {
            throw new AmazonClientException("Couldn't initialize XmlPullParserFactory", e4);
        }
    }

    public r(com.amazonaws.transform.m<T, com.amazonaws.transform.l> mVar) {
        this.f23701a = mVar;
        if (mVar == null) {
            this.f23701a = new com.amazonaws.transform.o();
        }
    }

    @Override // com.amazonaws.http.m
    public boolean b() {
        return false;
    }

    @Override // com.amazonaws.http.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.c<T> a(l lVar) throws Exception {
        com.amazonaws.logging.c cVar = f23699b;
        cVar.o("Parsing service response XML");
        InputStream b4 = lVar.b();
        if (b4 == null) {
            b4 = new ByteArrayInputStream("<eof/>".getBytes(w.f24366b));
        }
        XmlPullParser newPullParser = f23700c.newPullParser();
        newPullParser.setInput(b4, null);
        com.amazonaws.c<T> cVar2 = new com.amazonaws.c<>();
        com.amazonaws.transform.l lVar2 = new com.amazonaws.transform.l(newPullParser, lVar.c());
        lVar2.g("ResponseMetadata/RequestId", 2, com.amazonaws.h.f23605b);
        lVar2.g("requestId", 2, com.amazonaws.h.f23605b);
        d(lVar2);
        cVar2.e(this.f23701a.a(lVar2));
        Map<String, String> c4 = lVar2.c();
        Map<String, String> c5 = lVar.c();
        if (c5 != null && c5.get("x-amzn-RequestId") != null) {
            c4.put(com.amazonaws.h.f23605b, c5.get("x-amzn-RequestId"));
        }
        cVar2.d(new com.amazonaws.h(c4));
        cVar.o("Done parsing service response");
        return cVar2;
    }

    protected void d(com.amazonaws.transform.l lVar) {
    }
}
