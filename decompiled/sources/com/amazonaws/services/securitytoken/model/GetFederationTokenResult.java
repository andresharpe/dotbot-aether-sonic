package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class GetFederationTokenResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private Credentials f24176E;

    /* renamed from: F, reason: collision with root package name */
    private FederatedUser f24177F;

    /* renamed from: G, reason: collision with root package name */
    private Integer f24178G;

    public Credentials a() {
        return this.f24176E;
    }

    public FederatedUser b() {
        return this.f24177F;
    }

    public Integer c() {
        return this.f24178G;
    }

    public void d(Credentials credentials) {
        this.f24176E = credentials;
    }

    public void e(FederatedUser federatedUser) {
        this.f24177F = federatedUser;
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
        if (obj == null || !(obj instanceof GetFederationTokenResult)) {
            return false;
        }
        GetFederationTokenResult getFederationTokenResult = (GetFederationTokenResult) obj;
        if (getFederationTokenResult.a() == null) {
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
        if (getFederationTokenResult.a() != null && !getFederationTokenResult.a().equals(a())) {
            return false;
        }
        if (getFederationTokenResult.b() == null) {
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
        if (getFederationTokenResult.b() != null && !getFederationTokenResult.b().equals(b())) {
            return false;
        }
        if (getFederationTokenResult.c() == null) {
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
        if (getFederationTokenResult.c() == null || getFederationTokenResult.c().equals(c())) {
            return true;
        }
        return false;
    }

    public void f(Integer num) {
        this.f24178G = num;
    }

    public GetFederationTokenResult g(Credentials credentials) {
        this.f24176E = credentials;
        return this;
    }

    public GetFederationTokenResult h(FederatedUser federatedUser) {
        this.f24177F = federatedUser;
        return this;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        if (a() == null) {
            hashCode = 0;
        } else {
            hashCode = a().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (b() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (c() != null) {
            i4 = c().hashCode();
        }
        return i6 + i4;
    }

    public GetFederationTokenResult i(Integer num) {
        this.f24178G = num;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (a() != null) {
            sb.append("Credentials: " + a() + ",");
        }
        if (b() != null) {
            sb.append("FederatedUser: " + b() + ",");
        }
        if (c() != null) {
            sb.append("PackedPolicySize: " + c());
        }
        sb.append("}");
        return sb.toString();
    }
}
