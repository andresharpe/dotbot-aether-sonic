package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class GetCallerIdentityResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24168E;

    /* renamed from: F, reason: collision with root package name */
    private String f24169F;

    /* renamed from: G, reason: collision with root package name */
    private String f24170G;

    public String a() {
        return this.f24169F;
    }

    public String b() {
        return this.f24170G;
    }

    public String c() {
        return this.f24168E;
    }

    public void d(String str) {
        this.f24169F = str;
    }

    public void e(String str) {
        this.f24170G = str;
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
        if (obj == null || !(obj instanceof GetCallerIdentityResult)) {
            return false;
        }
        GetCallerIdentityResult getCallerIdentityResult = (GetCallerIdentityResult) obj;
        if (getCallerIdentityResult.c() == null) {
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
        if (getCallerIdentityResult.c() != null && !getCallerIdentityResult.c().equals(c())) {
            return false;
        }
        if (getCallerIdentityResult.a() == null) {
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
        if (getCallerIdentityResult.a() != null && !getCallerIdentityResult.a().equals(a())) {
            return false;
        }
        if (getCallerIdentityResult.b() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (b() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (getCallerIdentityResult.b() == null || getCallerIdentityResult.b().equals(b())) {
            return true;
        }
        return false;
    }

    public void f(String str) {
        this.f24168E = str;
    }

    public GetCallerIdentityResult g(String str) {
        this.f24169F = str;
        return this;
    }

    public GetCallerIdentityResult h(String str) {
        this.f24170G = str;
        return this;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
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
        if (b() != null) {
            i4 = b().hashCode();
        }
        return i6 + i4;
    }

    public GetCallerIdentityResult i(String str) {
        this.f24168E = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (c() != null) {
            sb.append("UserId: " + c() + ",");
        }
        if (a() != null) {
            sb.append("Account: " + a() + ",");
        }
        if (b() != null) {
            sb.append("Arn: " + b());
        }
        sb.append("}");
        return sb.toString();
    }
}
