package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class DescribeIdentityResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f23967E;

    /* renamed from: F, reason: collision with root package name */
    private List<String> f23968F;

    /* renamed from: G, reason: collision with root package name */
    private Date f23969G;

    /* renamed from: H, reason: collision with root package name */
    private Date f23970H;

    public Date a() {
        return this.f23969G;
    }

    public String b() {
        return this.f23967E;
    }

    public Date c() {
        return this.f23970H;
    }

    public List<String> d() {
        return this.f23968F;
    }

    public void e(Date date) {
        this.f23969G = date;
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
        if (obj == null || !(obj instanceof DescribeIdentityResult)) {
            return false;
        }
        DescribeIdentityResult describeIdentityResult = (DescribeIdentityResult) obj;
        if (describeIdentityResult.b() == null) {
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
        if (describeIdentityResult.b() != null && !describeIdentityResult.b().equals(b())) {
            return false;
        }
        if (describeIdentityResult.d() == null) {
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
        if (describeIdentityResult.d() != null && !describeIdentityResult.d().equals(d())) {
            return false;
        }
        if (describeIdentityResult.a() == null) {
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
        if (describeIdentityResult.a() != null && !describeIdentityResult.a().equals(a())) {
            return false;
        }
        if (describeIdentityResult.c() == null) {
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
        if (describeIdentityResult.c() == null || describeIdentityResult.c().equals(c())) {
            return true;
        }
        return false;
    }

    public void f(String str) {
        this.f23967E = str;
    }

    public void g(Date date) {
        this.f23970H = date;
    }

    public void h(Collection<String> collection) {
        if (collection == null) {
            this.f23968F = null;
        } else {
            this.f23968F = new ArrayList(collection);
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

    public DescribeIdentityResult i(Date date) {
        this.f23969G = date;
        return this;
    }

    public DescribeIdentityResult j(String str) {
        this.f23967E = str;
        return this;
    }

    public DescribeIdentityResult k(Date date) {
        this.f23970H = date;
        return this;
    }

    public DescribeIdentityResult l(Collection<String> collection) {
        h(collection);
        return this;
    }

    public DescribeIdentityResult m(String... strArr) {
        if (d() == null) {
            this.f23968F = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f23968F.add(str);
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
