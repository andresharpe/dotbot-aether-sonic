package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class ListIdentityPoolsResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private List<IdentityPoolShortDescription> f24015E;

    /* renamed from: F, reason: collision with root package name */
    private String f24016F;

    public List<IdentityPoolShortDescription> a() {
        return this.f24015E;
    }

    public String b() {
        return this.f24016F;
    }

    public void c(Collection<IdentityPoolShortDescription> collection) {
        if (collection == null) {
            this.f24015E = null;
        } else {
            this.f24015E = new ArrayList(collection);
        }
    }

    public void d(String str) {
        this.f24016F = str;
    }

    public ListIdentityPoolsResult e(Collection<IdentityPoolShortDescription> collection) {
        c(collection);
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
        if (obj == null || !(obj instanceof ListIdentityPoolsResult)) {
            return false;
        }
        ListIdentityPoolsResult listIdentityPoolsResult = (ListIdentityPoolsResult) obj;
        if (listIdentityPoolsResult.a() == null) {
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
        if (listIdentityPoolsResult.a() != null && !listIdentityPoolsResult.a().equals(a())) {
            return false;
        }
        if (listIdentityPoolsResult.b() == null) {
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
        if (listIdentityPoolsResult.b() == null || listIdentityPoolsResult.b().equals(b())) {
            return true;
        }
        return false;
    }

    public ListIdentityPoolsResult f(IdentityPoolShortDescription... identityPoolShortDescriptionArr) {
        if (a() == null) {
            this.f24015E = new ArrayList(identityPoolShortDescriptionArr.length);
        }
        for (IdentityPoolShortDescription identityPoolShortDescription : identityPoolShortDescriptionArr) {
            this.f24015E.add(identityPoolShortDescription);
        }
        return this;
    }

    public ListIdentityPoolsResult g(String str) {
        this.f24016F = str;
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
            sb.append("IdentityPools: " + a() + ",");
        }
        if (b() != null) {
            sb.append("NextToken: " + b());
        }
        sb.append("}");
        return sb.toString();
    }
}
