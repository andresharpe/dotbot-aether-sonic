package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class FederatedUser implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24164E;

    /* renamed from: F, reason: collision with root package name */
    private String f24165F;

    public FederatedUser() {
    }

    public String a() {
        return this.f24165F;
    }

    public String b() {
        return this.f24164E;
    }

    public void c(String str) {
        this.f24165F = str;
    }

    public void d(String str) {
        this.f24164E = str;
    }

    public FederatedUser e(String str) {
        this.f24165F = str;
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
        if (obj == null || !(obj instanceof FederatedUser)) {
            return false;
        }
        FederatedUser federatedUser = (FederatedUser) obj;
        if (federatedUser.b() == null) {
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
        if (federatedUser.b() != null && !federatedUser.b().equals(b())) {
            return false;
        }
        if (federatedUser.a() == null) {
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
        if (federatedUser.a() == null || federatedUser.a().equals(a())) {
            return true;
        }
        return false;
    }

    public FederatedUser f(String str) {
        this.f24164E = str;
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
            sb.append("FederatedUserId: " + b() + ",");
        }
        if (a() != null) {
            sb.append("Arn: " + a());
        }
        sb.append("}");
        return sb.toString();
    }

    public FederatedUser(String str, String str2) {
        d(str);
        c(str2);
    }
}
