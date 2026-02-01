package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class GetIdentityPoolRolesResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f23983E;

    /* renamed from: F, reason: collision with root package name */
    private Map<String, String> f23984F;

    /* renamed from: G, reason: collision with root package name */
    private Map<String, RoleMapping> f23985G;

    public GetIdentityPoolRolesResult a(String str, RoleMapping roleMapping) {
        if (this.f23985G == null) {
            this.f23985G = new HashMap();
        }
        if (!this.f23985G.containsKey(str)) {
            this.f23985G.put(str, roleMapping);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public GetIdentityPoolRolesResult b(String str, String str2) {
        if (this.f23984F == null) {
            this.f23984F = new HashMap();
        }
        if (!this.f23984F.containsKey(str)) {
            this.f23984F.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public GetIdentityPoolRolesResult c() {
        this.f23985G = null;
        return this;
    }

    public GetIdentityPoolRolesResult d() {
        this.f23984F = null;
        return this;
    }

    public String e() {
        return this.f23983E;
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
        if (obj == null || !(obj instanceof GetIdentityPoolRolesResult)) {
            return false;
        }
        GetIdentityPoolRolesResult getIdentityPoolRolesResult = (GetIdentityPoolRolesResult) obj;
        if (getIdentityPoolRolesResult.e() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (e() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getIdentityPoolRolesResult.e() != null && !getIdentityPoolRolesResult.e().equals(e())) {
            return false;
        }
        if (getIdentityPoolRolesResult.g() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (g() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (getIdentityPoolRolesResult.g() != null && !getIdentityPoolRolesResult.g().equals(g())) {
            return false;
        }
        if (getIdentityPoolRolesResult.f() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (f() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (getIdentityPoolRolesResult.f() == null || getIdentityPoolRolesResult.f().equals(f())) {
            return true;
        }
        return false;
    }

    public Map<String, RoleMapping> f() {
        return this.f23985G;
    }

    public Map<String, String> g() {
        return this.f23984F;
    }

    public void h(String str) {
        this.f23983E = str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        if (e() == null) {
            hashCode = 0;
        } else {
            hashCode = e().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (g() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = g().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (f() != null) {
            i4 = f().hashCode();
        }
        return i6 + i4;
    }

    public void i(Map<String, RoleMapping> map) {
        this.f23985G = map;
    }

    public void j(Map<String, String> map) {
        this.f23984F = map;
    }

    public GetIdentityPoolRolesResult k(String str) {
        this.f23983E = str;
        return this;
    }

    public GetIdentityPoolRolesResult l(Map<String, RoleMapping> map) {
        this.f23985G = map;
        return this;
    }

    public GetIdentityPoolRolesResult m(Map<String, String> map) {
        this.f23984F = map;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (e() != null) {
            sb.append("IdentityPoolId: " + e() + ",");
        }
        if (g() != null) {
            sb.append("Roles: " + g() + ",");
        }
        if (f() != null) {
            sb.append("RoleMappings: " + f());
        }
        sb.append("}");
        return sb.toString();
    }
}
