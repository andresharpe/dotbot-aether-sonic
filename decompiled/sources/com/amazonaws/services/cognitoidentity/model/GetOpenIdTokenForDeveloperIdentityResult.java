package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class GetOpenIdTokenForDeveloperIdentityResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f23990E;

    /* renamed from: F, reason: collision with root package name */
    private String f23991F;

    public String a() {
        return this.f23990E;
    }

    public String b() {
        return this.f23991F;
    }

    public void c(String str) {
        this.f23990E = str;
    }

    public void d(String str) {
        this.f23991F = str;
    }

    public GetOpenIdTokenForDeveloperIdentityResult e(String str) {
        this.f23990E = str;
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
        if (obj == null || !(obj instanceof GetOpenIdTokenForDeveloperIdentityResult)) {
            return false;
        }
        GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentityResult = (GetOpenIdTokenForDeveloperIdentityResult) obj;
        if (getOpenIdTokenForDeveloperIdentityResult.a() == null) {
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
        if (getOpenIdTokenForDeveloperIdentityResult.a() != null && !getOpenIdTokenForDeveloperIdentityResult.a().equals(a())) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityResult.b() == null) {
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
        if (getOpenIdTokenForDeveloperIdentityResult.b() == null || getOpenIdTokenForDeveloperIdentityResult.b().equals(b())) {
            return true;
        }
        return false;
    }

    public GetOpenIdTokenForDeveloperIdentityResult f(String str) {
        this.f23991F = str;
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
