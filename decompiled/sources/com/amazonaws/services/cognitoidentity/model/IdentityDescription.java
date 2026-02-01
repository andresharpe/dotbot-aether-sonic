package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class IdentityDescription implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f23996E;

    /* renamed from: F, reason: collision with root package name */
    private List<String> f23997F;

    /* renamed from: G, reason: collision with root package name */
    private Date f23998G;

    /* renamed from: H, reason: collision with root package name */
    private Date f23999H;

    public Date a() {
        return this.f23998G;
    }

    public String b() {
        return this.f23996E;
    }

    public Date c() {
        return this.f23999H;
    }

    public List<String> d() {
        return this.f23997F;
    }

    public void e(Date date) {
        this.f23998G = date;
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
        if (obj == null || !(obj instanceof IdentityDescription)) {
            return false;
        }
        IdentityDescription identityDescription = (IdentityDescription) obj;
        if (identityDescription.b() == null) {
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
        if (identityDescription.b() != null && !identityDescription.b().equals(b())) {
            return false;
        }
        if (identityDescription.d() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (d() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (identityDescription.d() != null && !identityDescription.d().equals(d())) {
            return false;
        }
        if (identityDescription.a() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (a() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (identityDescription.a() != null && !identityDescription.a().equals(a())) {
            return false;
        }
        if (identityDescription.c() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (c() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (identityDescription.c() == null || identityDescription.c().equals(c())) {
            return true;
        }
        return false;
    }

    public void f(String str) {
        this.f23996E = str;
    }

    public void g(Date date) {
        this.f23999H = date;
    }

    public void h(Collection<String> collection) {
        if (collection == null) {
            this.f23997F = null;
        } else {
            this.f23997F = new ArrayList(collection);
        }
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i4 = 0;
        if (b() == null) {
            hashCode = 0;
        } else {
            hashCode = b().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (d() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (a() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = a().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (c() != null) {
            i4 = c().hashCode();
        }
        return i7 + i4;
    }

    public IdentityDescription i(Date date) {
        this.f23998G = date;
        return this;
    }

    public IdentityDescription j(String str) {
        this.f23996E = str;
        return this;
    }

    public IdentityDescription k(Date date) {
        this.f23999H = date;
        return this;
    }

    public IdentityDescription l(Collection<String> collection) {
        h(collection);
        return this;
    }

    public IdentityDescription m(String... strArr) {
        if (d() == null) {
            this.f23997F = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f23997F.add(str);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (b() != null) {
            sb.append("IdentityId: " + b() + ",");
        }
        if (d() != null) {
            sb.append("Logins: " + d() + ",");
        }
        if (a() != null) {
            sb.append("CreationDate: " + a() + ",");
        }
        if (c() != null) {
            sb.append("LastModifiedDate: " + c());
        }
        sb.append("}");
        return sb.toString();
    }
}
