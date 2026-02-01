package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class ListIdentitiesResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24010E;

    /* renamed from: F, reason: collision with root package name */
    private List<IdentityDescription> f24011F;

    /* renamed from: G, reason: collision with root package name */
    private String f24012G;

    public List<IdentityDescription> a() {
        return this.f24011F;
    }

    public String b() {
        return this.f24010E;
    }

    public String c() {
        return this.f24012G;
    }

    public void d(Collection<IdentityDescription> collection) {
        if (collection == null) {
            this.f24011F = null;
        } else {
            this.f24011F = new ArrayList(collection);
        }
    }

    public void e(String str) {
        this.f24010E = str;
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
        if (obj == null || !(obj instanceof ListIdentitiesResult)) {
            return false;
        }
        ListIdentitiesResult listIdentitiesResult = (ListIdentitiesResult) obj;
        if (listIdentitiesResult.b() == null) {
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
        if (listIdentitiesResult.b() != null && !listIdentitiesResult.b().equals(b())) {
            return false;
        }
        if (listIdentitiesResult.a() == null) {
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
        if (listIdentitiesResult.a() != null && !listIdentitiesResult.a().equals(a())) {
            return false;
        }
        if (listIdentitiesResult.c() == null) {
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
        if (listIdentitiesResult.c() == null || listIdentitiesResult.c().equals(c())) {
            return true;
        }
        return false;
    }

    public void f(String str) {
        this.f24012G = str;
    }

    public ListIdentitiesResult g(Collection<IdentityDescription> collection) {
        d(collection);
        return this;
    }

    public ListIdentitiesResult h(IdentityDescription... identityDescriptionArr) {
        if (a() == null) {
            this.f24011F = new ArrayList(identityDescriptionArr.length);
        }
        for (IdentityDescription identityDescription : identityDescriptionArr) {
            this.f24011F.add(identityDescription);
        }
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

    public ListIdentitiesResult i(String str) {
        this.f24010E = str;
        return this;
    }

    public ListIdentitiesResult j(String str) {
        this.f24012G = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (b() != null) {
            sb.append("IdentityPoolId: " + b() + ",");
        }
        if (a() != null) {
            sb.append("Identities: " + a() + ",");
        }
        if (c() != null) {
            sb.append("NextToken: " + c());
        }
        sb.append("}");
        return sb.toString();
    }
}
