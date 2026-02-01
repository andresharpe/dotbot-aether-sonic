package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class CognitoIdentityProvider implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f23925E;

    /* renamed from: F, reason: collision with root package name */
    private String f23926F;

    /* renamed from: G, reason: collision with root package name */
    private Boolean f23927G;

    public String a() {
        return this.f23926F;
    }

    public String b() {
        return this.f23925E;
    }

    public Boolean c() {
        return this.f23927G;
    }

    public Boolean d() {
        return this.f23927G;
    }

    public void e(String str) {
        this.f23926F = str;
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
        if (obj == null || !(obj instanceof CognitoIdentityProvider)) {
            return false;
        }
        CognitoIdentityProvider cognitoIdentityProvider = (CognitoIdentityProvider) obj;
        if (cognitoIdentityProvider.b() == null) {
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
        if (cognitoIdentityProvider.b() != null && !cognitoIdentityProvider.b().equals(b())) {
            return false;
        }
        if (cognitoIdentityProvider.a() == null) {
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
        if (cognitoIdentityProvider.a() != null && !cognitoIdentityProvider.a().equals(a())) {
            return false;
        }
        if (cognitoIdentityProvider.c() == null) {
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
        if (cognitoIdentityProvider.c() == null || cognitoIdentityProvider.c().equals(c())) {
            return true;
        }
        return false;
    }

    public void f(String str) {
        this.f23925E = str;
    }

    public void g(Boolean bool) {
        this.f23927G = bool;
    }

    public CognitoIdentityProvider h(String str) {
        this.f23926F = str;
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

    public CognitoIdentityProvider i(String str) {
        this.f23925E = str;
        return this;
    }

    public CognitoIdentityProvider j(Boolean bool) {
        this.f23927G = bool;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (b() != null) {
            sb.append("ProviderName: " + b() + ",");
        }
        if (a() != null) {
            sb.append("ClientId: " + a() + ",");
        }
        if (c() != null) {
            sb.append("ServerSideTokenCheck: " + c());
        }
        sb.append("}");
        return sb.toString();
    }
}
