package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class AssumeRoleResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private Credentials f24125E;

    /* renamed from: F, reason: collision with root package name */
    private AssumedRoleUser f24126F;

    /* renamed from: G, reason: collision with root package name */
    private Integer f24127G;

    public AssumedRoleUser a() {
        return this.f24126F;
    }

    public Credentials b() {
        return this.f24125E;
    }

    public Integer c() {
        return this.f24127G;
    }

    public void d(AssumedRoleUser assumedRoleUser) {
        this.f24126F = assumedRoleUser;
    }

    public void e(Credentials credentials) {
        this.f24125E = credentials;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleResult)) {
            return false;
        }
        AssumeRoleResult assumeRoleResult = (AssumeRoleResult) obj;
        if (assumeRoleResult.b() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (assumeRoleResult.b() != null && !assumeRoleResult.b().equals(b())) {
            return false;
        }
        if (assumeRoleResult.a() == null) {
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
        if (assumeRoleResult.a() != null && !assumeRoleResult.a().equals(a())) {
            return false;
        }
        if (assumeRoleResult.c() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleResult.c() == null || assumeRoleResult.c().equals(c())) {
            return true;
        }
        return false;
    }

    public void f(Integer num) {
        this.f24127G = num;
    }

    public AssumeRoleResult g(AssumedRoleUser assumedRoleUser) {
        this.f24126F = assumedRoleUser;
        return this;
    }

    public AssumeRoleResult h(Credentials credentials) {
        this.f24125E = credentials;
        return this;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        if (b() == null) {
            hashCode = 0;
        } else {
            hashCode = b().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (a() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = a().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (c() != null) {
            i4 = c().hashCode();
        }
        return i6 + i4;
    }

    public AssumeRoleResult i(Integer num) {
        this.f24127G = num;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (b() != null) {
            sb.append("Credentials: " + b() + ",");
        }
        if (a() != null) {
            sb.append("AssumedRoleUser: " + a() + ",");
        }
        if (c() != null) {
            sb.append("PackedPolicySize: " + c());
        }
        sb.append("}");
        return sb.toString();
    }
}
