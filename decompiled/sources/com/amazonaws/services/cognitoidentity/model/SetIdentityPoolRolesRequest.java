package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SetIdentityPoolRolesRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24043J;

    /* renamed from: K, reason: collision with root package name */
    private Map<String, String> f24044K;

    /* renamed from: L, reason: collision with root package name */
    private Map<String, RoleMapping> f24045L;

    public void A(Map<String, RoleMapping> map) {
        this.f24045L = map;
    }

    public void B(Map<String, String> map) {
        this.f24044K = map;
    }

    public SetIdentityPoolRolesRequest C(String str) {
        this.f24043J = str;
        return this;
    }

    public SetIdentityPoolRolesRequest D(Map<String, RoleMapping> map) {
        this.f24045L = map;
        return this;
    }

    public SetIdentityPoolRolesRequest E(Map<String, String> map) {
        this.f24044K = map;
        return this;
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
        if (obj == null || !(obj instanceof SetIdentityPoolRolesRequest)) {
            return false;
        }
        SetIdentityPoolRolesRequest setIdentityPoolRolesRequest = (SetIdentityPoolRolesRequest) obj;
        if (setIdentityPoolRolesRequest.u() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (u() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (setIdentityPoolRolesRequest.u() != null && !setIdentityPoolRolesRequest.u().equals(u())) {
            return false;
        }
        if (setIdentityPoolRolesRequest.x() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (x() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (setIdentityPoolRolesRequest.x() != null && !setIdentityPoolRolesRequest.x().equals(x())) {
            return false;
        }
        if (setIdentityPoolRolesRequest.w() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (w() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (setIdentityPoolRolesRequest.w() == null || setIdentityPoolRolesRequest.w().equals(w())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        if (u() == null) {
            hashCode = 0;
        } else {
            hashCode = u().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (x() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = x().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (w() != null) {
            i4 = w().hashCode();
        }
        return i6 + i4;
    }

    public SetIdentityPoolRolesRequest q(String str, RoleMapping roleMapping) {
        if (this.f24045L == null) {
            this.f24045L = new HashMap();
        }
        if (!this.f24045L.containsKey(str)) {
            this.f24045L.put(str, roleMapping);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public SetIdentityPoolRolesRequest r(String str, String str2) {
        if (this.f24044K == null) {
            this.f24044K = new HashMap();
        }
        if (!this.f24044K.containsKey(str)) {
            this.f24044K.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public SetIdentityPoolRolesRequest s() {
        this.f24045L = null;
        return this;
    }

    public SetIdentityPoolRolesRequest t() {
        this.f24044K = null;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (u() != null) {
            sb.append("IdentityPoolId: " + u() + ",");
        }
        if (x() != null) {
            sb.append("Roles: " + x() + ",");
        }
        if (w() != null) {
            sb.append("RoleMappings: " + w());
        }
        sb.append("}");
        return sb.toString();
    }

    public String u() {
        return this.f24043J;
    }

    public Map<String, RoleMapping> w() {
        return this.f24045L;
    }

    public Map<String, String> x() {
        return this.f24044K;
    }

    public void y(String str) {
        this.f24043J = str;
    }
}
