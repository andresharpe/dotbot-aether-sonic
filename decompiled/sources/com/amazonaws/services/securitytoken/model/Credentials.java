package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes.dex */
public class Credentials implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24157E;

    /* renamed from: F, reason: collision with root package name */
    private String f24158F;

    /* renamed from: G, reason: collision with root package name */
    private String f24159G;

    /* renamed from: H, reason: collision with root package name */
    private Date f24160H;

    public Credentials() {
    }

    public String a() {
        return this.f24157E;
    }

    public Date b() {
        return this.f24160H;
    }

    public String c() {
        return this.f24158F;
    }

    public String d() {
        return this.f24159G;
    }

    public void e(String str) {
        this.f24157E = str;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Credentials)) {
            return false;
        }
        Credentials credentials = (Credentials) obj;
        if (credentials.a() == null) {
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
        if (credentials.a() != null && !credentials.a().equals(a())) {
            return false;
        }
        if (credentials.c() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (c() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (credentials.c() != null && !credentials.c().equals(c())) {
            return false;
        }
        if (credentials.d() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (d() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (credentials.d() != null && !credentials.d().equals(d())) {
            return false;
        }
        if (credentials.b() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (b() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (credentials.b() == null || credentials.b().equals(b())) {
            return true;
        }
        return false;
    }

    public void f(Date date) {
        this.f24160H = date;
    }

    public void g(String str) {
        this.f24158F = str;
    }

    public void h(String str) {
        this.f24159G = str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i4 = 0;
        if (a() == null) {
            hashCode = 0;
        } else {
            hashCode = a().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (c() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = c().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (d() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (b() != null) {
            i4 = b().hashCode();
        }
        return i7 + i4;
    }

    public Credentials i(String str) {
        this.f24157E = str;
        return this;
    }

    public Credentials j(Date date) {
        this.f24160H = date;
        return this;
    }

    public Credentials k(String str) {
        this.f24158F = str;
        return this;
    }

    public Credentials l(String str) {
        this.f24159G = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (a() != null) {
            sb.append("AccessKeyId: " + a() + ",");
        }
        if (c() != null) {
            sb.append("SecretAccessKey: " + c() + ",");
        }
        if (d() != null) {
            sb.append("SessionToken: " + d() + ",");
        }
        if (b() != null) {
            sb.append("Expiration: " + b());
        }
        sb.append("}");
        return sb.toString();
    }

    public Credentials(String str, String str2, String str3, Date date) {
        e(str);
        g(str2);
        h(str3);
        f(date);
    }
}
