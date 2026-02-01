package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class g implements com.android.volley.j {

    /* renamed from: d, reason: collision with root package name */
    private static final int f24582d = 4096;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final o f24583a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC1077e f24584b;

    /* renamed from: c, reason: collision with root package name */
    protected final h f24585c;

    @Deprecated
    public g(o oVar) {
        this(oVar, new h(4096));
    }

    @Deprecated
    protected static Map<String, String> b(com.android.volley.i[] iVarArr) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i4 = 0; i4 < iVarArr.length; i4++) {
            treeMap.put(iVarArr[i4].a(), iVarArr[i4].b());
        }
        return treeMap;
    }

    @Override // com.android.volley.j
    public com.android.volley.l a(Request<?> request) throws VolleyError {
        IOException iOException;
        n nVar;
        byte[] bArr;
        n b4;
        int e4;
        List<com.android.volley.i> d4;
        byte[] bArr2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                b4 = this.f24584b.b(request, m.c(request.p()));
                try {
                    e4 = b4.e();
                    d4 = b4.d();
                    break;
                } catch (IOException e5) {
                    bArr = null;
                    nVar = b4;
                    iOException = e5;
                }
            } catch (IOException e6) {
                iOException = e6;
                nVar = null;
                bArr = null;
            }
            w.a(request, w.e(request, iOException, elapsedRealtime, nVar, bArr));
        }
        if (e4 == 304) {
            return w.b(request, SystemClock.elapsedRealtime() - elapsedRealtime, d4);
        }
        InputStream a4 = b4.a();
        if (a4 != null) {
            bArr2 = w.c(a4, b4.c(), this.f24585c);
        } else {
            bArr2 = new byte[0];
        }
        w.d(SystemClock.elapsedRealtime() - elapsedRealtime, request, bArr2, e4);
        if (e4 >= 200 && e4 <= 299) {
            return new com.android.volley.l(e4, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, d4);
        }
        throw new IOException();
    }

    @Deprecated
    public g(o oVar, h hVar) {
        this.f24583a = oVar;
        this.f24584b = new C1073a(oVar);
        this.f24585c = hVar;
    }

    public g(AbstractC1077e abstractC1077e) {
        this(abstractC1077e, new h(4096));
    }

    public g(AbstractC1077e abstractC1077e, h hVar) {
        this.f24584b = abstractC1077e;
        this.f24583a = abstractC1077e;
        this.f24585c = hVar;
    }
}
