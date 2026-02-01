package com.amazonaws.auth;

import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult;
import com.amazonaws.services.securitytoken.model.Credentials;
import java.util.Date;

/* loaded from: classes.dex */
public class L implements InterfaceC1030h {

    /* renamed from: j, reason: collision with root package name */
    public static final int f23395j = 3600;

    /* renamed from: k, reason: collision with root package name */
    public static final int f23396k = 500;

    /* renamed from: a, reason: collision with root package name */
    private final com.amazonaws.services.securitytoken.a f23397a;

    /* renamed from: b, reason: collision with root package name */
    private m f23398b;

    /* renamed from: c, reason: collision with root package name */
    private Date f23399c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23400d;

    /* renamed from: e, reason: collision with root package name */
    private final String f23401e;

    /* renamed from: f, reason: collision with root package name */
    private final String f23402f;

    /* renamed from: g, reason: collision with root package name */
    private int f23403g;

    /* renamed from: h, reason: collision with root package name */
    private int f23404h;

    /* renamed from: i, reason: collision with root package name */
    private String f23405i;

    public L(String str, String str2, String str3) {
        this(str, str2, str3, new com.amazonaws.d());
    }

    private boolean e() {
        if (this.f23398b == null || this.f23399c.getTime() - System.currentTimeMillis() < this.f23404h * 1000) {
            return true;
        }
        return false;
    }

    private void h() {
        AssumeRoleWithWebIdentityResult j4 = this.f23397a.j(new AssumeRoleWithWebIdentityRequest().N(this.f23400d).K(this.f23401e).L(this.f23402f).M("ProviderSession").G(Integer.valueOf(this.f23403g)));
        Credentials c4 = j4.c();
        this.f23405i = j4.f();
        this.f23398b = new q(c4.a(), c4.c(), c4.d());
        this.f23399c = c4.b();
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public InterfaceC1029g a() {
        if (e()) {
            h();
        }
        return this.f23398b;
    }

    public int b() {
        return this.f23404h;
    }

    public int c() {
        return this.f23403g;
    }

    public String d() {
        return this.f23405i;
    }

    public void f(int i4) {
        this.f23404h = i4;
    }

    public void g(int i4) {
        this.f23403g = i4;
    }

    public L i(int i4) {
        f(i4);
        return this;
    }

    public L j(int i4) {
        g(i4);
        return this;
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public void refresh() {
        h();
    }

    public L(String str, String str2, String str3, com.amazonaws.d dVar) {
        this(str, str2, str3, new com.amazonaws.services.securitytoken.b(new o(), dVar));
    }

    public L(String str, String str2, String str3, com.amazonaws.services.securitytoken.a aVar) {
        this.f23397a = aVar;
        this.f23401e = str2;
        this.f23400d = str;
        this.f23402f = str3;
        this.f23403g = 3600;
        this.f23404h = 500;
    }
}
