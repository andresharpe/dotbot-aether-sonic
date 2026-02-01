package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class LookupDeveloperIdentityResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24024E;

    /* renamed from: F, reason: collision with root package name */
    private List<String> f24025F;

    /* renamed from: G, reason: collision with root package name */
    private String f24026G;

    public List<String> a() {
        return this.f24025F;
    }

    public String b() {
        return this.f24024E;
    }

    public String c() {
        return this.f24026G;
    }

    public void d(Collection<String> collection) {
        if (collection == null) {
            this.f24025F = null;
        } else {
            this.f24025F = new ArrayList(collection);
        }
    }

    public void e(String str) {
        this.f24024E = str;
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
        if (obj == null || !(obj instanceof LookupDeveloperIdentityResult)) {
            return false;
        }
        LookupDeveloperIdentityResult lookupDeveloperIdentityResult = (LookupDeveloperIdentityResult) obj;
        if (lookupDeveloperIdentityResult.b() == null) {
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
        if (lookupDeveloperIdentityResult.b() != null && !lookupDeveloperIdentityResult.b().equals(b())) {
            return false;
        }
        if (lookupDeveloperIdentityResult.a() == null) {
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
        if (lookupDeveloperIdentityResult.a() != null && !lookupDeveloperIdentityResult.a().equals(a())) {
            return false;
        }
        if (lookupDeveloperIdentityResult.c() == null) {
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
        if (lookupDeveloperIdentityResult.c() == null || lookupDeveloperIdentityResult.c().equals(c())) {
            return true;
        }
        return false;
    }

    public void f(String str) {
        this.f24026G = str;
    }

    public LookupDeveloperIdentityResult g(Collection<String> collection) {
        d(collection);
        return this;
    }

    public LookupDeveloperIdentityResult h(String... strArr) {
        if (a() == null) {
            this.f24025F = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f24025F.add(str);
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

    public LookupDeveloperIdentityResult i(String str) {
        this.f24024E = str;
        return this;
    }

    public LookupDeveloperIdentityResult j(String str) {
        this.f24026G = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (b() != null) {
            sb.append("IdentityId: " + b() + ",");
        }
        if (a() != null) {
            sb.append("DeveloperUserIdentifierList: " + a() + ",");
        }
        if (c() != null) {
            sb.append("NextToken: " + c());
        }
        sb.append("}");
        return sb.toString();
    }
}
