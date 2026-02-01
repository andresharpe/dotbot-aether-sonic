package com.amazonaws;

import com.amazonaws.util.B;
import java.net.InetAddress;
import javax.net.ssl.TrustManager;

/* loaded from: classes.dex */
public class d {

    /* renamed from: B, reason: collision with root package name */
    public static final boolean f23539B = true;

    /* renamed from: w, reason: collision with root package name */
    public static final int f23540w = 15000;

    /* renamed from: x, reason: collision with root package name */
    public static final int f23541x = 15000;

    /* renamed from: y, reason: collision with root package name */
    public static final int f23542y = 10;

    /* renamed from: a, reason: collision with root package name */
    private String f23544a;

    /* renamed from: b, reason: collision with root package name */
    private int f23545b;

    /* renamed from: c, reason: collision with root package name */
    private com.amazonaws.retry.b f23546c;

    /* renamed from: d, reason: collision with root package name */
    private InetAddress f23547d;

    /* renamed from: e, reason: collision with root package name */
    private Protocol f23548e;

    /* renamed from: f, reason: collision with root package name */
    private String f23549f;

    /* renamed from: g, reason: collision with root package name */
    private int f23550g;

    /* renamed from: h, reason: collision with root package name */
    private String f23551h;

    /* renamed from: i, reason: collision with root package name */
    private String f23552i;

    /* renamed from: j, reason: collision with root package name */
    @Deprecated
    private String f23553j;

    /* renamed from: k, reason: collision with root package name */
    @Deprecated
    private String f23554k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f23555l;

    /* renamed from: m, reason: collision with root package name */
    private int f23556m;

    /* renamed from: n, reason: collision with root package name */
    private int f23557n;

    /* renamed from: o, reason: collision with root package name */
    private int f23558o;

    /* renamed from: p, reason: collision with root package name */
    private int f23559p;

    /* renamed from: q, reason: collision with root package name */
    private int f23560q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f23561r;

    /* renamed from: s, reason: collision with root package name */
    private String f23562s;

    /* renamed from: t, reason: collision with root package name */
    private TrustManager f23563t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f23564u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f23565v;

    /* renamed from: z, reason: collision with root package name */
    public static final String f23543z = B.b();

    /* renamed from: A, reason: collision with root package name */
    public static final com.amazonaws.retry.b f23538A = com.amazonaws.retry.a.f23909e;

    public d() {
        this.f23544a = f23543z;
        this.f23545b = -1;
        this.f23546c = f23538A;
        this.f23548e = Protocol.HTTPS;
        this.f23549f = null;
        this.f23550g = -1;
        this.f23551h = null;
        this.f23552i = null;
        this.f23553j = null;
        this.f23554k = null;
        this.f23556m = 10;
        this.f23557n = 15000;
        this.f23558o = 15000;
        this.f23559p = 0;
        this.f23560q = 0;
        this.f23561r = true;
        this.f23563t = null;
        this.f23564u = false;
        this.f23565v = false;
    }

    public void A(Boolean bool) {
        this.f23555l = bool.booleanValue();
    }

    public void B(Protocol protocol) {
        this.f23548e = protocol;
    }

    @Deprecated
    public void C(String str) {
        this.f23553j = str;
    }

    public void D(String str) {
        this.f23549f = str;
    }

    public void E(String str) {
        this.f23552i = str;
    }

    public void F(int i4) {
        this.f23550g = i4;
    }

    public void G(String str) {
        this.f23551h = str;
    }

    @Deprecated
    public void H(String str) {
        this.f23554k = str;
    }

    public void I(com.amazonaws.retry.b bVar) {
        this.f23546c = bVar;
    }

    public void J(String str) {
        this.f23562s = str;
    }

    public void K(int i4, int i5) {
        this.f23559p = i4;
        this.f23560q = i5;
    }

    public void L(int i4) {
        this.f23557n = i4;
    }

    public void M(TrustManager trustManager) {
        this.f23563t = trustManager;
    }

    public void N(boolean z3) {
        this.f23561r = z3;
    }

    public void O(String str) {
        this.f23544a = str;
    }

    public boolean P() {
        return this.f23561r;
    }

    public d Q(int i4) {
        u(i4);
        return this;
    }

    public d R(boolean z3) {
        this.f23564u = z3;
        return this;
    }

    public d S(boolean z3) {
        w(z3);
        return this;
    }

    public d T(InetAddress inetAddress) {
        x(inetAddress);
        return this;
    }

    public d U(int i4) {
        y(i4);
        return this;
    }

    public d V(int i4) {
        z(i4);
        return this;
    }

    public d W(boolean z3) {
        A(Boolean.valueOf(z3));
        return this;
    }

    public d X(Protocol protocol) {
        B(protocol);
        return this;
    }

    @Deprecated
    public d Y(String str) {
        C(str);
        return this;
    }

    public d Z(String str) {
        D(str);
        return this;
    }

    public int a() {
        return this.f23558o;
    }

    public d a0(String str) {
        E(str);
        return this;
    }

    public InetAddress b() {
        return this.f23547d;
    }

    public d b0(int i4) {
        F(i4);
        return this;
    }

    public int c() {
        return this.f23556m;
    }

    public d c0(String str) {
        G(str);
        return this;
    }

    public int d() {
        return this.f23545b;
    }

    @Deprecated
    public d d0(String str) {
        H(str);
        return this;
    }

    public Protocol e() {
        return this.f23548e;
    }

    public d e0(boolean z3) {
        N(z3);
        return this;
    }

    @Deprecated
    public String f() {
        return this.f23553j;
    }

    public d f0(com.amazonaws.retry.b bVar) {
        I(bVar);
        return this;
    }

    public String g() {
        return this.f23549f;
    }

    public d g0(String str) {
        J(str);
        return this;
    }

    public String h() {
        return this.f23552i;
    }

    public d h0(int i4, int i5) {
        K(i4, i5);
        return this;
    }

    public int i() {
        return this.f23550g;
    }

    public d i0(int i4) {
        L(i4);
        return this;
    }

    public String j() {
        return this.f23551h;
    }

    public d j0(TrustManager trustManager) {
        M(trustManager);
        return this;
    }

    public String k() {
        return this.f23554k;
    }

    public d k0(String str) {
        O(str);
        return this;
    }

    public com.amazonaws.retry.b l() {
        return this.f23546c;
    }

    public String m() {
        return this.f23562s;
    }

    public int[] n() {
        return new int[]{this.f23559p, this.f23560q};
    }

    public int o() {
        return this.f23557n;
    }

    public TrustManager p() {
        return this.f23563t;
    }

    public String q() {
        return this.f23544a;
    }

    public boolean r() {
        return this.f23564u;
    }

    public boolean s() {
        return this.f23565v;
    }

    public boolean t() {
        return this.f23555l;
    }

    public void u(int i4) {
        this.f23558o = i4;
    }

    public void v(boolean z3) {
        this.f23564u = z3;
    }

    public void w(boolean z3) {
        this.f23565v = z3;
    }

    public void x(InetAddress inetAddress) {
        this.f23547d = inetAddress;
    }

    public void y(int i4) {
        this.f23556m = i4;
    }

    public void z(int i4) {
        if (i4 >= 0) {
            this.f23545b = i4;
            return;
        }
        throw new IllegalArgumentException("maxErrorRetry shoud be non-negative");
    }

    public d(d dVar) {
        this.f23544a = f23543z;
        this.f23545b = -1;
        this.f23546c = f23538A;
        this.f23548e = Protocol.HTTPS;
        this.f23549f = null;
        this.f23550g = -1;
        this.f23551h = null;
        this.f23552i = null;
        this.f23553j = null;
        this.f23554k = null;
        this.f23556m = 10;
        this.f23557n = 15000;
        this.f23558o = 15000;
        this.f23559p = 0;
        this.f23560q = 0;
        this.f23561r = true;
        this.f23563t = null;
        this.f23564u = false;
        this.f23565v = false;
        this.f23558o = dVar.f23558o;
        this.f23556m = dVar.f23556m;
        this.f23545b = dVar.f23545b;
        this.f23546c = dVar.f23546c;
        this.f23547d = dVar.f23547d;
        this.f23548e = dVar.f23548e;
        this.f23553j = dVar.f23553j;
        this.f23549f = dVar.f23549f;
        this.f23552i = dVar.f23552i;
        this.f23550g = dVar.f23550g;
        this.f23551h = dVar.f23551h;
        this.f23554k = dVar.f23554k;
        this.f23555l = dVar.f23555l;
        this.f23557n = dVar.f23557n;
        this.f23544a = dVar.f23544a;
        this.f23561r = dVar.f23561r;
        this.f23560q = dVar.f23560q;
        this.f23559p = dVar.f23559p;
        this.f23562s = dVar.f23562s;
        this.f23563t = dVar.f23563t;
        this.f23564u = dVar.f23564u;
        this.f23565v = dVar.f23565v;
    }
}
