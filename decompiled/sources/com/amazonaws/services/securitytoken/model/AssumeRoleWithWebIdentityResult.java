package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class AssumeRoleWithWebIdentityResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private Credentials f24149E;

    /* renamed from: F, reason: collision with root package name */
    private String f24150F;

    /* renamed from: G, reason: collision with root package name */
    private AssumedRoleUser f24151G;

    /* renamed from: H, reason: collision with root package name */
    private Integer f24152H;

    /* renamed from: I, reason: collision with root package name */
    private String f24153I;

    /* renamed from: J, reason: collision with root package name */
    private String f24154J;

    public AssumedRoleUser a() {
        return this.f24151G;
    }

    public String b() {
        return this.f24154J;
    }

    public Credentials c() {
        return this.f24149E;
    }

    public Integer d() {
        return this.f24152H;
    }

    public String e() {
        return this.f24153I;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleWithWebIdentityResult)) {
            return false;
        }
        AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentityResult = (AssumeRoleWithWebIdentityResult) obj;
        if (assumeRoleWithWebIdentityResult.c() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.c() != null && !assumeRoleWithWebIdentityResult.c().equals(c())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.f() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (f() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.f() != null && !assumeRoleWithWebIdentityResult.f().equals(f())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.a() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (a() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.a() != null && !assumeRoleWithWebIdentityResult.a().equals(a())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.d() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (d() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.d() != null && !assumeRoleWithWebIdentityResult.d().equals(d())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.e() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (e() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 ^ z12) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.e() != null && !assumeRoleWithWebIdentityResult.e().equals(e())) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.b() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (b() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 ^ z14) {
            return false;
        }
        if (assumeRoleWithWebIdentityResult.b() == null || assumeRoleWithWebIdentityResult.b().equals(b())) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.f24150F;
    }

    public void g(AssumedRoleUser assumedRoleUser) {
        this.f24151G = assumedRoleUser;
    }

    public void h(String str) {
        this.f24154J = str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i4 = 0;
        if (c() == null) {
            hashCode = 0;
        } else {
            hashCode = c().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (f() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = f().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (a() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = a().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (d() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d().hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        if (e() == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = e().hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        if (b() != null) {
            i4 = b().hashCode();
        }
        return i9 + i4;
    }

    public void i(Credentials credentials) {
        this.f24149E = credentials;
    }

    public void j(Integer num) {
        this.f24152H = num;
    }

    public void k(String str) {
        this.f24153I = str;
    }

    public void l(String str) {
        this.f24150F = str;
    }

    public AssumeRoleWithWebIdentityResult m(AssumedRoleUser assumedRoleUser) {
        this.f24151G = assumedRoleUser;
        return this;
    }

    public AssumeRoleWithWebIdentityResult n(String str) {
        this.f24154J = str;
        return this;
    }

    public AssumeRoleWithWebIdentityResult o(Credentials credentials) {
        this.f24149E = credentials;
        return this;
    }

    public AssumeRoleWithWebIdentityResult p(Integer num) {
        this.f24152H = num;
        return this;
    }

    public AssumeRoleWithWebIdentityResult q(String str) {
        this.f24153I = str;
        return this;
    }

    public AssumeRoleWithWebIdentityResult r(String str) {
        this.f24150F = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (c() != null) {
            sb.append("Credentials: " + c() + ",");
        }
        if (f() != null) {
            sb.append("SubjectFromWebIdentityToken: " + f() + ",");
        }
        if (a() != null) {
            sb.append("AssumedRoleUser: " + a() + ",");
        }
        if (d() != null) {
            sb.append("PackedPolicySize: " + d() + ",");
        }
        if (e() != null) {
            sb.append("Provider: " + e() + ",");
        }
        if (b() != null) {
            sb.append("Audience: " + b());
        }
        sb.append("}");
        return sb.toString();
    }
}
