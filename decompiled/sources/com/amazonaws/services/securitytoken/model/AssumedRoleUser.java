package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class AssumedRoleUser implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24155E;

    /* renamed from: F, reason: collision with root package name */
    private String f24156F;

    public String a() {
        return this.f24156F;
    }

    public String b() {
        return this.f24155E;
    }

    public void c(String str) {
        this.f24156F = str;
    }

    public void d(String str) {
        this.f24155E = str;
    }

    public AssumedRoleUser e(String str) {
        this.f24156F = str;
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
        if (obj == null || !(obj instanceof AssumedRoleUser)) {
            return false;
        }
        AssumedRoleUser assumedRoleUser = (AssumedRoleUser) obj;
        if (assumedRoleUser.b() == null) {
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
        if (assumedRoleUser.b() != null && !assumedRoleUser.b().equals(b())) {
            return false;
        }
        if (assumedRoleUser.a() == null) {
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
        if (assumedRoleUser.a() == null || assumedRoleUser.a().equals(a())) {
            return true;
        }
        return false;
    }

    public AssumedRoleUser f(String str) {
        this.f24155E = str;
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
            sb.append("AssumedRoleId: " + b() + ",");
        }
        if (a() != null) {
            sb.append("Arn: " + a());
        }
        sb.append("}");
        return sb.toString();
    }
}
