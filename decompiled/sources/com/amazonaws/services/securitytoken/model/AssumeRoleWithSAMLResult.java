package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class AssumeRoleWithSAMLResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private Credentials f24134E;

    /* renamed from: F, reason: collision with root package name */
    private AssumedRoleUser f24135F;

    /* renamed from: G, reason: collision with root package name */
    private Integer f24136G;

    /* renamed from: H, reason: collision with root package name */
    private String f24137H;

    /* renamed from: I, reason: collision with root package name */
    private String f24138I;

    /* renamed from: J, reason: collision with root package name */
    private String f24139J;

    /* renamed from: K, reason: collision with root package name */
    private String f24140K;

    /* renamed from: L, reason: collision with root package name */
    private String f24141L;

    public AssumedRoleUser a() {
        return this.f24135F;
    }

    public String b() {
        return this.f24140K;
    }

    public Credentials c() {
        return this.f24134E;
    }

    public String d() {
        return this.f24139J;
    }

    public String e() {
        return this.f24141L;
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
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleWithSAMLResult)) {
            return false;
        }
        AssumeRoleWithSAMLResult assumeRoleWithSAMLResult = (AssumeRoleWithSAMLResult) obj;
        if (assumeRoleWithSAMLResult.c() == null) {
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
        if (assumeRoleWithSAMLResult.c() != null && !assumeRoleWithSAMLResult.c().equals(c())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.a() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (a() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (assumeRoleWithSAMLResult.a() != null && !assumeRoleWithSAMLResult.a().equals(a())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.f() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (f() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleWithSAMLResult.f() != null && !assumeRoleWithSAMLResult.f().equals(f())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.g() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (g() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (assumeRoleWithSAMLResult.g() != null && !assumeRoleWithSAMLResult.g().equals(g())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.h() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (h() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 ^ z12) {
            return false;
        }
        if (assumeRoleWithSAMLResult.h() != null && !assumeRoleWithSAMLResult.h().equals(h())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.d() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (d() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 ^ z14) {
            return false;
        }
        if (assumeRoleWithSAMLResult.d() != null && !assumeRoleWithSAMLResult.d().equals(d())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.b() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (b() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z15 ^ z16) {
            return false;
        }
        if (assumeRoleWithSAMLResult.b() != null && !assumeRoleWithSAMLResult.b().equals(b())) {
            return false;
        }
        if (assumeRoleWithSAMLResult.e() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (e() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z17 ^ z18) {
            return false;
        }
        if (assumeRoleWithSAMLResult.e() == null || assumeRoleWithSAMLResult.e().equals(e())) {
            return true;
        }
        return false;
    }

    public Integer f() {
        return this.f24136G;
    }

    public String g() {
        return this.f24137H;
    }

    public String h() {
        return this.f24138I;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int i4 = 0;
        if (c() == null) {
            hashCode = 0;
        } else {
            hashCode = c().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (a() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = a().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (f() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = f().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (g() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = g().hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        if (h() == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = h().hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        if (d() == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = d().hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        if (b() == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = b().hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        if (e() != null) {
            i4 = e().hashCode();
        }
        return i11 + i4;
    }

    public void i(AssumedRoleUser assumedRoleUser) {
        this.f24135F = assumedRoleUser;
    }

    public void j(String str) {
        this.f24140K = str;
    }

    public void k(Credentials credentials) {
        this.f24134E = credentials;
    }

    public void l(String str) {
        this.f24139J = str;
    }

    public void m(String str) {
        this.f24141L = str;
    }

    public void n(Integer num) {
        this.f24136G = num;
    }

    public void o(String str) {
        this.f24137H = str;
    }

    public void p(String str) {
        this.f24138I = str;
    }

    public AssumeRoleWithSAMLResult q(AssumedRoleUser assumedRoleUser) {
        this.f24135F = assumedRoleUser;
        return this;
    }

    public AssumeRoleWithSAMLResult r(String str) {
        this.f24140K = str;
        return this;
    }

    public AssumeRoleWithSAMLResult s(Credentials credentials) {
        this.f24134E = credentials;
        return this;
    }

    public AssumeRoleWithSAMLResult t(String str) {
        this.f24139J = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (c() != null) {
            sb.append("Credentials: " + c() + ",");
        }
        if (a() != null) {
            sb.append("AssumedRoleUser: " + a() + ",");
        }
        if (f() != null) {
            sb.append("PackedPolicySize: " + f() + ",");
        }
        if (g() != null) {
            sb.append("Subject: " + g() + ",");
        }
        if (h() != null) {
            sb.append("SubjectType: " + h() + ",");
        }
        if (d() != null) {
            sb.append("Issuer: " + d() + ",");
        }
        if (b() != null) {
            sb.append("Audience: " + b() + ",");
        }
        if (e() != null) {
            sb.append("NameQualifier: " + e());
        }
        sb.append("}");
        return sb.toString();
    }

    public AssumeRoleWithSAMLResult u(String str) {
        this.f24141L = str;
        return this;
    }

    public AssumeRoleWithSAMLResult v(Integer num) {
        this.f24136G = num;
        return this;
    }

    public AssumeRoleWithSAMLResult w(String str) {
        this.f24137H = str;
        return this;
    }

    public AssumeRoleWithSAMLResult x(String str) {
        this.f24138I = str;
        return this;
    }
}
