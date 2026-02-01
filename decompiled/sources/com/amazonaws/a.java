package com.amazonaws;

import com.amazonaws.auth.C;
import com.amazonaws.auth.I;
import com.amazonaws.auth.J;
import com.amazonaws.http.s;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.C1070c;
import com.amazonaws.util.Classes;
import com.amazonaws.util.w;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: k, reason: collision with root package name */
    private static final String f23356k = "Amazon";

    /* renamed from: l, reason: collision with root package name */
    private static final String f23357l = "AWS";

    /* renamed from: m, reason: collision with root package name */
    public static final boolean f23358m = true;

    /* renamed from: n, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23359n = LogFactory.c(a.class);

    /* renamed from: a, reason: collision with root package name */
    protected volatile URI f23360a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f23361b;

    /* renamed from: c, reason: collision with root package name */
    protected d f23362c;

    /* renamed from: d, reason: collision with root package name */
    protected com.amazonaws.http.a f23363d;

    /* renamed from: e, reason: collision with root package name */
    protected final List<com.amazonaws.handlers.e> f23364e;

    /* renamed from: f, reason: collision with root package name */
    protected int f23365f;

    /* renamed from: g, reason: collision with root package name */
    private volatile I f23366g;

    /* renamed from: h, reason: collision with root package name */
    private volatile String f23367h;

    /* renamed from: i, reason: collision with root package name */
    protected volatile String f23368i;

    /* renamed from: j, reason: collision with root package name */
    private volatile com.amazonaws.regions.a f23369j;

    protected a(d dVar) {
        this(dVar, new s(dVar));
    }

    private String K() {
        int i4;
        String simpleName = Classes.b(a.class, this).getSimpleName();
        String b4 = j.b(simpleName);
        if (b4 != null) {
            return b4;
        }
        int indexOf = simpleName.indexOf("JavaClient");
        if (indexOf == -1 && (indexOf = simpleName.indexOf("Client")) == -1) {
            throw new IllegalStateException("Unrecognized suffix for the AWS http client class name " + simpleName);
        }
        int indexOf2 = simpleName.indexOf(f23356k);
        if (indexOf2 == -1) {
            indexOf2 = simpleName.indexOf(f23357l);
            if (indexOf2 != -1) {
                i4 = 3;
            } else {
                throw new IllegalStateException("Unrecognized prefix for the AWS http client class name " + simpleName);
            }
        } else {
            i4 = 6;
        }
        if (indexOf2 < indexOf) {
            return w.n(simpleName.substring(indexOf2 + i4, indexOf));
        }
        throw new IllegalStateException("Unrecognized AWS http client class name " + simpleName);
    }

    private I L(String str, String str2, String str3, boolean z3) {
        I c4;
        String m4 = this.f23362c.m();
        if (m4 == null) {
            c4 = J.b(str, str2);
        } else {
            c4 = J.c(m4, str);
        }
        if (c4 instanceof C) {
            C c5 = (C) c4;
            if (str3 != null) {
                c5.c(str3);
            } else if (str2 != null && z3) {
                c5.c(str2);
            }
        }
        synchronized (this) {
            this.f23369j = com.amazonaws.regions.a.g(str2);
        }
        return c4;
    }

    private I M(URI uri, String str, boolean z3) {
        if (uri != null) {
            String b02 = b0();
            return L(b02, C1070c.b(uri.getHost(), b02), str, z3);
        }
        throw new IllegalArgumentException("Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
    }

    @Deprecated
    protected static boolean g0() {
        if (System.getProperty(i.f23722i) != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    private boolean h0() {
        com.amazonaws.metrics.g l02 = l0();
        if (l02 != null && l02.b()) {
            return true;
        }
        return false;
    }

    private URI r0(String str) {
        if (!str.contains("://")) {
            str = this.f23362c.e().toString() + "://" + str;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public void I(com.amazonaws.handlers.e eVar) {
        this.f23364e.add(eVar);
    }

    @Deprecated
    public void J(com.amazonaws.handlers.g gVar) {
        this.f23364e.add(com.amazonaws.handlers.e.a(gVar));
    }

    @Deprecated
    protected void N(String str, String str2) {
    }

    @Deprecated
    protected void O(URI uri) {
    }

    @Deprecated
    protected final com.amazonaws.http.e P() {
        boolean z3;
        if (!h0() && !g0()) {
            z3 = false;
        } else {
            z3 = true;
        }
        return new com.amazonaws.http.e(this.f23364e, z3, this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.amazonaws.http.e Q(b bVar) {
        boolean z3;
        if (!i0(bVar) && !g0()) {
            z3 = false;
        } else {
            z3 = true;
        }
        return new com.amazonaws.http.e(this.f23364e, z3, this);
    }

    protected final com.amazonaws.http.e R(f<?> fVar) {
        return Q(fVar.k());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public final void S(AWSRequestMetrics aWSRequestMetrics, f<?> fVar, g<?> gVar) {
        T(aWSRequestMetrics, fVar, gVar, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public final void T(AWSRequestMetrics aWSRequestMetrics, f<?> fVar, g<?> gVar, boolean z3) {
        if (fVar != null) {
            aWSRequestMetrics.c(AWSRequestMetrics.Field.ClientExecuteTime);
            aWSRequestMetrics.g().c();
            U(fVar).a(fVar, gVar);
        }
        if (z3) {
            aWSRequestMetrics.k();
        }
    }

    @Deprecated
    protected final com.amazonaws.metrics.g U(f<?> fVar) {
        com.amazonaws.metrics.g i4 = fVar.k().i();
        if (i4 != null) {
            return i4;
        }
        com.amazonaws.metrics.g Y3 = Y();
        if (Y3 == null) {
            return AwsSdkMetrics.t();
        }
        return Y3;
    }

    public String V() {
        String uri;
        synchronized (this) {
            uri = this.f23360a.toString();
        }
        return uri;
    }

    public String W() {
        return this.f23368i;
    }

    public Regions X() {
        Regions b4;
        synchronized (this) {
            b4 = Regions.b(this.f23369j.e());
        }
        return b4;
    }

    @Deprecated
    public com.amazonaws.metrics.g Y() {
        return this.f23363d.f();
    }

    @Deprecated
    protected String Z() {
        return b0();
    }

    public void a(com.amazonaws.regions.a aVar) {
        String format;
        if (aVar != null) {
            String b02 = b0();
            if (aVar.l(b02)) {
                format = aVar.h(b02);
                int indexOf = format.indexOf("://");
                if (indexOf >= 0) {
                    format = format.substring(indexOf + 3);
                }
            } else {
                format = String.format("%s.%s.%s", W(), aVar.e(), aVar.b());
            }
            URI r02 = r0(format);
            I L3 = L(b02, aVar.e(), this.f23361b, false);
            synchronized (this) {
                this.f23360a = r02;
                this.f23366g = L3;
            }
            return;
        }
        throw new IllegalArgumentException("No region provided");
    }

    public String a0() {
        return b0();
    }

    protected String b0() {
        if (this.f23367h == null) {
            synchronized (this) {
                try {
                    if (this.f23367h == null) {
                        this.f23367h = K();
                        return this.f23367h;
                    }
                } finally {
                }
            }
        }
        return this.f23367h;
    }

    protected I c0() {
        return this.f23366g;
    }

    public void d(String str) {
        URI r02 = r0(str);
        I M3 = M(r02, this.f23361b, false);
        synchronized (this) {
            this.f23360a = r02;
            this.f23366g = M3;
        }
    }

    public I d0(URI uri) {
        return M(uri, this.f23361b, true);
    }

    public final String e0() {
        return this.f23361b;
    }

    public int f0() {
        return this.f23365f;
    }

    @Deprecated
    protected final boolean i0(b bVar) {
        com.amazonaws.metrics.g i4 = bVar.i();
        if (i4 != null && i4.b()) {
            return true;
        }
        return h0();
    }

    public void j0(com.amazonaws.handlers.e eVar) {
        this.f23364e.remove(eVar);
    }

    @Deprecated
    public void k0(com.amazonaws.handlers.g gVar) {
        this.f23364e.remove(com.amazonaws.handlers.e.a(gVar));
    }

    @Deprecated
    protected com.amazonaws.metrics.g l0() {
        com.amazonaws.metrics.g f4 = this.f23363d.f();
        if (f4 == null) {
            return AwsSdkMetrics.t();
        }
        return f4;
    }

    @Deprecated
    public void m0(d dVar) {
        com.amazonaws.metrics.g gVar;
        com.amazonaws.http.a aVar = this.f23363d;
        if (aVar != null) {
            gVar = aVar.f();
            aVar.t();
        } else {
            gVar = null;
        }
        this.f23362c = dVar;
        this.f23363d = new com.amazonaws.http.a(dVar, gVar);
    }

    @Deprecated
    public void n0(String str, String str2, String str3) {
        URI r02 = r0(str);
        I L3 = L(str2, str3, str3, true);
        synchronized (this) {
            this.f23366g = L3;
            this.f23360a = r02;
            this.f23361b = str3;
        }
    }

    public final void o0(String str) {
        this.f23367h = str;
    }

    public final void p0(String str) {
        I M3 = M(this.f23360a, str, true);
        synchronized (this) {
            this.f23366g = M3;
            this.f23361b = str;
        }
    }

    public void q0(int i4) {
        this.f23365f = i4;
    }

    public a s0(int i4) {
        q0(i4);
        return this;
    }

    public void shutdown() {
        this.f23363d.t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public a(d dVar, com.amazonaws.metrics.g gVar) {
        this(dVar, new s(dVar), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(d dVar, com.amazonaws.http.f fVar) {
        this.f23362c = dVar;
        this.f23363d = new com.amazonaws.http.a(dVar, fVar);
        this.f23364e = new CopyOnWriteArrayList();
    }

    @Deprecated
    protected a(d dVar, com.amazonaws.http.f fVar, com.amazonaws.metrics.g gVar) {
        this.f23362c = dVar;
        this.f23363d = new com.amazonaws.http.a(dVar, fVar, gVar);
        this.f23364e = new CopyOnWriteArrayList();
    }
}
