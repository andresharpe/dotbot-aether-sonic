package com.amazonaws.http;

import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.json.JsonUtils;
import com.amazonaws.util.w;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
public class p<T> implements m<com.amazonaws.c<T>> {

    /* renamed from: c, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23691c = LogFactory.d("com.amazonaws.request");

    /* renamed from: a, reason: collision with root package name */
    private com.amazonaws.transform.m<T, com.amazonaws.transform.c> f23692a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23693b = false;

    public p(com.amazonaws.transform.m<T, com.amazonaws.transform.c> mVar) {
        this.f23692a = mVar;
        if (mVar == null) {
            this.f23692a = new com.amazonaws.transform.n();
        }
    }

    @Override // com.amazonaws.http.m
    public boolean b() {
        return this.f23693b;
    }

    @Override // com.amazonaws.http.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.amazonaws.c<T> a(l lVar) throws Exception {
        com.amazonaws.util.h hVar;
        com.amazonaws.logging.c cVar = f23691c;
        cVar.o("Parsing service response JSON");
        String str = lVar.c().get("x-amz-crc32");
        InputStream d4 = lVar.d();
        if (d4 == null) {
            d4 = new ByteArrayInputStream("{}".getBytes(w.f24366b));
        }
        cVar.a("CRC32Checksum = " + str);
        cVar.a("content encoding = " + lVar.c().get("Content-Encoding"));
        boolean equals = "gzip".equals(lVar.c().get("Content-Encoding"));
        if (str != null) {
            hVar = new com.amazonaws.util.h(d4);
            d4 = hVar;
        } else {
            hVar = null;
        }
        if (equals) {
            d4 = new GZIPInputStream(d4);
        }
        com.amazonaws.util.json.b a4 = JsonUtils.a(new InputStreamReader(d4, w.f24366b));
        try {
            com.amazonaws.c<T> cVar2 = new com.amazonaws.c<>();
            T a5 = this.f23692a.a(new com.amazonaws.transform.c(a4, lVar));
            if (hVar != null) {
                if (hVar.d() != Long.parseLong(str)) {
                    throw new CRC32MismatchException("Client calculated crc32 checksum didn't match that calculated by server side");
                }
            }
            cVar2.e(a5);
            HashMap hashMap = new HashMap();
            hashMap.put(com.amazonaws.h.f23605b, lVar.c().get("x-amzn-RequestId"));
            cVar2.d(new com.amazonaws.h(hashMap));
            cVar.o("Done parsing service response");
            if (!this.f23693b) {
                try {
                    a4.close();
                } catch (IOException e4) {
                    f23691c.j("Error closing json parser", e4);
                }
            }
            return cVar2;
        } catch (Throwable th) {
            if (!this.f23693b) {
                try {
                    a4.close();
                } catch (IOException e5) {
                    f23691c.j("Error closing json parser", e5);
                }
            }
            throw th;
        }
    }

    @Deprecated
    protected void d(com.amazonaws.transform.c cVar) {
    }
}
