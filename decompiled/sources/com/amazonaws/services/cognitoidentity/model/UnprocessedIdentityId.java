package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class UnprocessedIdentityId implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24056E;

    /* renamed from: F, reason: collision with root package name */
    private String f24057F;

    public String a() {
        return this.f24057F;
    }

    public String b() {
        return this.f24056E;
    }

    public void c(ErrorCode errorCode) {
        this.f24057F = errorCode.toString();
    }

    public void d(String str) {
        this.f24057F = str;
    }

    public void e(String str) {
        this.f24056E = str;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnprocessedIdentityId)) {
            return false;
        }
        UnprocessedIdentityId unprocessedIdentityId = (UnprocessedIdentityId) obj;
        if (unprocessedIdentityId.b() == null) {
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
        if (unprocessedIdentityId.b() != null && !unprocessedIdentityId.b().equals(b())) {
            return false;
        }
        if (unprocessedIdentityId.a() == null) {
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
        if (unprocessedIdentityId.a() == null || unprocessedIdentityId.a().equals(a())) {
            return true;
        }
        return false;
    }

    public UnprocessedIdentityId f(ErrorCode errorCode) {
        this.f24057F = errorCode.toString();
        return this;
    }

    public UnprocessedIdentityId g(String str) {
        this.f24057F = str;
        return this;
    }

    public UnprocessedIdentityId h(String str) {
        this.f24056E = str;
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
            sb.append("ErrorCode: " + a());
        }
        sb.append("}");
        return sb.toString();
    }
}
