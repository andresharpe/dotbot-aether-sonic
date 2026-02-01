package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class GetCredentialsForIdentityResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f23976E;

    /* renamed from: F, reason: collision with root package name */
    private Credentials f23977F;

    public Credentials a() {
        return this.f23977F;
    }

    public String b() {
        return this.f23976E;
    }

    public void c(Credentials credentials) {
        this.f23977F = credentials;
    }

    public void d(String str) {
        this.f23976E = str;
    }

    public GetCredentialsForIdentityResult e(Credentials credentials) {
        this.f23977F = credentials;
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
        if (obj == null || !(obj instanceof GetCredentialsForIdentityResult)) {
            return false;
        }
        GetCredentialsForIdentityResult getCredentialsForIdentityResult = (GetCredentialsForIdentityResult) obj;
        if (getCredentialsForIdentityResult.b() == null) {
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
        if (getCredentialsForIdentityResult.b() != null && !getCredentialsForIdentityResult.b().equals(b())) {
            return false;
        }
        if (getCredentialsForIdentityResult.a() == null) {
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
        if (getCredentialsForIdentityResult.a() == null || getCredentialsForIdentityResult.a().equals(a())) {
            return true;
        }
        return false;
    }

    public GetCredentialsForIdentityResult f(String str) {
        this.f23976E = str;
        return this;
    }

    public int hashCode() {
        int hashCode;
        int i4 = 0;
        if (b() == null) {
            hashCode = 0;
        } else {
            hashCode = b().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (a() != null) {
            i4 = a().hashCode();
        }
        return i5 + i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (b() != null) {
            sb.append("IdentityId: " + b() + ",");
        }
        if (a() != null) {
            sb.append("Credentials: " + a());
        }
        sb.append("}");
        return sb.toString();
    }
}
