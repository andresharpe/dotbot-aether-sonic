package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class GetOpenIdTokenResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f23994E;

    /* renamed from: F, reason: collision with root package name */
    private String f23995F;

    public String a() {
        return this.f23994E;
    }

    public String b() {
        return this.f23995F;
    }

    public void c(String str) {
        this.f23994E = str;
    }

    public void d(String str) {
        this.f23995F = str;
    }

    public GetOpenIdTokenResult e(String str) {
        this.f23994E = str;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetOpenIdTokenResult)) {
            return false;
        }
        GetOpenIdTokenResult getOpenIdTokenResult = (GetOpenIdTokenResult) obj;
        if (getOpenIdTokenResult.a() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (a() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getOpenIdTokenResult.a() != null && !getOpenIdTokenResult.a().equals(a())) {
            return false;
        }
        if (getOpenIdTokenResult.b() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (b() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (getOpenIdTokenResult.b() == null || getOpenIdTokenResult.b().equals(b())) {
            return true;
        }
        return false;
    }

    public GetOpenIdTokenResult f(String str) {
        this.f23995F = str;
        return this;
    }

    public int hashCode() {
        int hashCode;
        int i4 = 0;
        if (a() == null) {
            hashCode = 0;
        } else {
            hashCode = a().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (b() != null) {
            i4 = b().hashCode();
        }
        return i5 + i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (a() != null) {
            sb.append("IdentityId: " + a() + ",");
        }
        if (b() != null) {
            sb.append("Token: " + b());
        }
        sb.append("}");
        return sb.toString();
    }
}
