package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.x;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f23609e = "User-Agent";

    /* renamed from: f, reason: collision with root package name */
    private static final String f23610f = "aws-sdk-invocation-id";

    /* renamed from: g, reason: collision with root package name */
    private static final String f23611g = "aws-sdk-retry";

    /* renamed from: h, reason: collision with root package name */
    private static final int f23612h = 200;

    /* renamed from: i, reason: collision with root package name */
    private static final int f23613i = 307;

    /* renamed from: j, reason: collision with root package name */
    private static final int f23614j = 300;

    /* renamed from: k, reason: collision with root package name */
    private static final int f23615k = 413;

    /* renamed from: l, reason: collision with root package name */
    private static final int f23616l = 503;

    /* renamed from: m, reason: collision with root package name */
    private static final int f23617m = 1000;

    /* renamed from: n, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23618n = LogFactory.d("com.amazonaws.request");

    /* renamed from: o, reason: collision with root package name */
    static final com.amazonaws.logging.c f23619o = LogFactory.c(a.class);

    /* renamed from: a, reason: collision with root package name */
    final f f23620a;

    /* renamed from: b, reason: collision with root package name */
    final com.amazonaws.d f23621b;

    /* renamed from: c, reason: collision with root package name */
    private final com.amazonaws.metrics.g f23622c;

    /* renamed from: d, reason: collision with root package name */
    private final k f23623d;

    public a(com.amazonaws.d dVar) {
        this(dVar, new s(dVar));
    }

    static String c(String str, String str2) {
        if (str.contains(str2)) {
            return str;
        }
        return str.trim() + " " + str2.trim();
    }

    private String h(String str) {
        int indexOf;
        int indexOf2 = str.indexOf("(");
        if (str.contains(" + 15")) {
            indexOf = str.indexOf(" + 15");
        } else {
            indexOf = str.indexOf(" - 15");
        }
        return str.substring(indexOf2 + 1, indexOf);
    }

    private <T extends Throwable> T k(T t3, AWSRequestMetrics aWSRequestMetrics) {
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.Exception;
        aWSRequestMetrics.h(field);
        aWSRequestMetrics.a(field, t3);
        return t3;
    }

    private boolean l(l lVar) {
        int e4 = lVar.e();
        if (e4 >= 200 && e4 < f23614j) {
            return true;
        }
        return false;
    }

    private static boolean m(l lVar) {
        int e4 = lVar.e();
        String str = lVar.c().get(h.f23649h);
        if (e4 == 307 && str != null && !str.isEmpty()) {
            return true;
        }
        return false;
    }

    private long o(com.amazonaws.b bVar, AmazonClientException amazonClientException, int i4, com.amazonaws.retry.b bVar2) {
        int i5 = i4 - 2;
        long a4 = bVar2.a().a(bVar, amazonClientException, i5);
        com.amazonaws.logging.c cVar = f23619o;
        if (cVar.f()) {
            cVar.a("Retriable error detected, will retry in " + a4 + "ms, attempt number: " + i5);
        }
        try {
            Thread.sleep(a4);
            return a4;
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e4.getMessage(), e4);
        }
    }

    private boolean s(com.amazonaws.b bVar, InputStream inputStream, AmazonClientException amazonClientException, int i4, com.amazonaws.retry.b bVar2) {
        int i5 = i4 - 1;
        int d4 = this.f23621b.d();
        if (d4 < 0 || !bVar2.d()) {
            d4 = bVar2.b();
        }
        if (i5 >= d4) {
            return false;
        }
        if (inputStream != null && !inputStream.markSupported()) {
            com.amazonaws.logging.c cVar = f23619o;
            if (cVar.f()) {
                cVar.a("Content not repeatable");
            }
            return false;
        }
        return bVar2.c().a(bVar, amazonClientException, i5);
    }

    void a(com.amazonaws.f<?> fVar, com.amazonaws.g<?> gVar, List<com.amazonaws.handlers.e> list, AmazonClientException amazonClientException) {
        Iterator<com.amazonaws.handlers.e> it = list.iterator();
        while (it.hasNext()) {
            it.next().b(fVar, gVar, amazonClientException);
        }
    }

    <T> void b(com.amazonaws.f<?> fVar, List<com.amazonaws.handlers.e> list, com.amazonaws.g<T> gVar, x xVar) {
        Iterator<com.amazonaws.handlers.e> it = list.iterator();
        while (it.hasNext()) {
            it.next().c(fVar, gVar);
        }
    }

    public <T> com.amazonaws.g<T> d(com.amazonaws.f<?> fVar, m<com.amazonaws.c<T>> mVar, m<AmazonServiceException> mVar2, e eVar) {
        com.amazonaws.g<T> gVar;
        if (eVar != null) {
            List<com.amazonaws.handlers.e> p4 = p(fVar, eVar);
            AWSRequestMetrics a4 = eVar.a();
            try {
                gVar = e(fVar, mVar, mVar2, eVar);
                try {
                    b(fVar, p4, gVar, a4.g().c());
                    return gVar;
                } catch (AmazonClientException e4) {
                    e = e4;
                    a(fVar, gVar, p4, e);
                    throw e;
                }
            } catch (AmazonClientException e5) {
                e = e5;
                gVar = null;
            }
        } else {
            throw new AmazonClientException("Internal SDK Error: No execution context parameter specified.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03ec A[Catch: all -> 0x03ab, TRY_ENTER, TryCatch #6 {all -> 0x03ab, blocks: (B:61:0x03e2, B:64:0x03ec, B:65:0x0402, B:67:0x0444, B:81:0x0470, B:246:0x03a5, B:247:0x03aa), top: B:60:0x03e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0444 A[Catch: all -> 0x03ab, TRY_LEAVE, TryCatch #6 {all -> 0x03ab, blocks: (B:61:0x03e2, B:64:0x03ec, B:65:0x0402, B:67:0x0444, B:81:0x0470, B:246:0x03a5, B:247:0x03aa), top: B:60:0x03e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0470 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    <T> com.amazonaws.g<T> e(com.amazonaws.f<?> r27, com.amazonaws.http.m<com.amazonaws.c<T>> r28, com.amazonaws.http.m<com.amazonaws.AmazonServiceException> r29, com.amazonaws.http.e r30) {
        /*
            Method dump skipped, instructions count: 1162
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.http.a.e(com.amazonaws.f, com.amazonaws.http.m, com.amazonaws.http.m, com.amazonaws.http.e):com.amazonaws.g");
    }

    public com.amazonaws.metrics.g f() {
        return this.f23622c;
    }

    protected void finalize() throws Throwable {
        t();
        super.finalize();
    }

    @Deprecated
    public com.amazonaws.h g(com.amazonaws.b bVar) {
        return null;
    }

    AmazonServiceException i(com.amazonaws.f<?> fVar, m<AmazonServiceException> mVar, l lVar) throws IOException {
        AmazonServiceException amazonServiceException;
        int e4 = lVar.e();
        try {
            amazonServiceException = mVar.a(lVar);
            f23618n.a("Received error response: " + amazonServiceException.toString());
        } catch (Exception e5) {
            if (e4 == f23615k) {
                amazonServiceException = new AmazonServiceException("Request entity too large");
                amazonServiceException.l(fVar.b());
                amazonServiceException.m(f23615k);
                amazonServiceException.j(AmazonServiceException.ErrorType.Client);
                amazonServiceException.h("Request entity too large");
            } else if (e4 == 503 && "Service Unavailable".equalsIgnoreCase(lVar.f())) {
                amazonServiceException = new AmazonServiceException("Service unavailable");
                amazonServiceException.l(fVar.b());
                amazonServiceException.m(503);
                amazonServiceException.j(AmazonServiceException.ErrorType.Service);
                amazonServiceException.h("Service unavailable");
            } else {
                if (e5 instanceof IOException) {
                    throw ((IOException) e5);
                }
                throw new AmazonClientException("Unable to unmarshall error response (" + e5.getMessage() + "). Response Code: " + e4 + ", Response Text: " + lVar.f() + ", Response Headers: " + lVar.c(), e5);
            }
        }
        amazonServiceException.m(e4);
        amazonServiceException.l(fVar.b());
        amazonServiceException.fillInStackTrace();
        return amazonServiceException;
    }

    <T> T j(com.amazonaws.f<?> fVar, m<com.amazonaws.c<T>> mVar, l lVar, e eVar) throws IOException {
        try {
            AWSRequestMetrics a4 = eVar.a();
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ResponseProcessingTime;
            a4.n(field);
            try {
                com.amazonaws.c<T> a5 = mVar.a(lVar);
                a4.c(field);
                if (a5 != null) {
                    com.amazonaws.logging.c cVar = f23618n;
                    if (cVar.f()) {
                        cVar.a("Received successful response: " + lVar.e() + ", AWS Request ID: " + a5.a());
                    }
                    a4.a(AWSRequestMetrics.Field.AWSRequestID, a5.a());
                    return a5.c();
                }
                throw new RuntimeException("Unable to unmarshall response metadata. Response Code: " + lVar.e() + ", Response Text: " + lVar.f());
            } catch (Throwable th) {
                a4.c(AWSRequestMetrics.Field.ResponseProcessingTime);
                throw th;
            }
        } catch (CRC32MismatchException e4) {
            throw e4;
        } catch (IOException e5) {
            throw e5;
        } catch (Exception e6) {
            throw new AmazonClientException("Unable to unmarshall response (" + e6.getMessage() + "). Response Code: " + lVar.e() + ", Response Text: " + lVar.f(), e6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    int n(l lVar, AmazonServiceException amazonServiceException) {
        Date k4;
        Date date = new Date();
        String str = lVar.c().get(h.f23646e);
        try {
            if (str != 0) {
                try {
                    if (!str.isEmpty()) {
                        k4 = com.amazonaws.util.k.k(str);
                        str = (int) ((date.getTime() - k4.getTime()) / 1000);
                        return str;
                    }
                } catch (RuntimeException e4) {
                    e = e4;
                    str = 0;
                    f23619o.j("Unable to parse clock skew offset from response: " + str, e);
                    return 0;
                }
            }
            k4 = com.amazonaws.util.k.i(h(amazonServiceException.getMessage()));
            str = (int) ((date.getTime() - k4.getTime()) / 1000);
            return str;
        } catch (RuntimeException e5) {
            e = e5;
        }
    }

    List<com.amazonaws.handlers.e> p(com.amazonaws.f<?> fVar, e eVar) {
        List<com.amazonaws.handlers.e> d4 = eVar.d();
        if (d4 == null) {
            return Collections.emptyList();
        }
        for (com.amazonaws.handlers.e eVar2 : d4) {
            if (eVar2 instanceof com.amazonaws.handlers.c) {
                ((com.amazonaws.handlers.c) eVar2).e(eVar.c());
            }
            eVar2.d(fVar);
        }
        return d4;
    }

    void q(com.amazonaws.f<?> fVar, Exception exc) {
        if (fVar.getContent() == null) {
            return;
        }
        if (fVar.getContent().markSupported()) {
            try {
                fVar.getContent().reset();
                return;
            } catch (IOException unused) {
                throw new AmazonClientException("Encountered an exception and couldn't reset the stream to retry", exc);
            }
        }
        throw new AmazonClientException("Encountered an exception and stream is not resettable", exc);
    }

    void r(com.amazonaws.f<?> fVar) {
        String str;
        RequestClientOptions g4;
        String e4;
        String str2 = com.amazonaws.d.f23543z;
        com.amazonaws.b k4 = fVar.k();
        if (k4 != null && (g4 = k4.g()) != null && (e4 = g4.e(RequestClientOptions.Marker.USER_AGENT)) != null) {
            str = c(str2, e4);
        } else {
            str = str2;
        }
        if (!str2.equals(this.f23621b.q())) {
            str = c(str, this.f23621b.q());
        }
        fVar.addHeader("User-Agent", str);
    }

    public void t() {
        this.f23620a.shutdown();
    }

    @Deprecated
    public a(com.amazonaws.d dVar, com.amazonaws.metrics.g gVar) {
        this(dVar, new s(dVar), gVar);
    }

    public a(com.amazonaws.d dVar, f fVar) {
        this.f23623d = new k();
        this.f23621b = dVar;
        this.f23620a = fVar;
        this.f23622c = null;
    }

    @Deprecated
    public a(com.amazonaws.d dVar, f fVar, com.amazonaws.metrics.g gVar) {
        this.f23623d = new k();
        this.f23621b = dVar;
        this.f23620a = fVar;
        this.f23622c = gVar;
    }
}
