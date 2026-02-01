package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class Tag implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24191E;

    /* renamed from: F, reason: collision with root package name */
    private String f24192F;

    public String a() {
        return this.f24191E;
    }

    public String b() {
        return this.f24192F;
    }

    public void c(String str) {
        this.f24191E = str;
    }

    public void d(String str) {
        this.f24192F = str;
    }

    public Tag e(String str) {
        this.f24191E = str;
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
        if (obj == null || !(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        if (tag.a() == null) {
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
        if (tag.a() != null && !tag.a().equals(a())) {
            return false;
        }
        if (tag.b() == null) {
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
        if (tag.b() == null || tag.b().equals(b())) {
            return true;
        }
        return false;
    }

    public Tag f(String str) {
        this.f24192F = str;
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
            sb.append("Key: " + a() + ",");
        }
        if (b() != null) {
            sb.append("Value: " + b());
        }
        sb.append("}");
        return sb.toString();
    }
}
