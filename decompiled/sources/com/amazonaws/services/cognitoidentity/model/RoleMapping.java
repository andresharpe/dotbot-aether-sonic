package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class RoleMapping implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24039E;

    /* renamed from: F, reason: collision with root package name */
    private String f24040F;

    /* renamed from: G, reason: collision with root package name */
    private RulesConfigurationType f24041G;

    public String a() {
        return this.f24040F;
    }

    public RulesConfigurationType b() {
        return this.f24041G;
    }

    public String c() {
        return this.f24039E;
    }

    public void d(AmbiguousRoleResolutionType ambiguousRoleResolutionType) {
        this.f24040F = ambiguousRoleResolutionType.toString();
    }

    public void e(String str) {
        this.f24040F = str;
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
        if (obj == null || !(obj instanceof RoleMapping)) {
            return false;
        }
        RoleMapping roleMapping = (RoleMapping) obj;
        if (roleMapping.c() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (roleMapping.c() != null && !roleMapping.c().equals(c())) {
            return false;
        }
        if (roleMapping.a() == null) {
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
        if (roleMapping.a() != null && !roleMapping.a().equals(a())) {
            return false;
        }
        if (roleMapping.b() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (b() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (roleMapping.b() == null || roleMapping.b().equals(b())) {
            return true;
        }
        return false;
    }

    public void f(RulesConfigurationType rulesConfigurationType) {
        this.f24041G = rulesConfigurationType;
    }

    public void g(RoleMappingType roleMappingType) {
        this.f24039E = roleMappingType.toString();
    }

    public void h(String str) {
        this.f24039E = str;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        if (c() == null) {
            hashCode = 0;
        } else {
            hashCode = c().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (a() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = a().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (b() != null) {
            i4 = b().hashCode();
        }
        return i6 + i4;
    }

    public RoleMapping i(AmbiguousRoleResolutionType ambiguousRoleResolutionType) {
        this.f24040F = ambiguousRoleResolutionType.toString();
        return this;
    }

    public RoleMapping j(String str) {
        this.f24040F = str;
        return this;
    }

    public RoleMapping k(RulesConfigurationType rulesConfigurationType) {
        this.f24041G = rulesConfigurationType;
        return this;
    }

    public RoleMapping l(RoleMappingType roleMappingType) {
        this.f24039E = roleMappingType.toString();
        return this;
    }

    public RoleMapping m(String str) {
        this.f24039E = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (c() != null) {
            sb.append("Type: " + c() + ",");
        }
        if (a() != null) {
            sb.append("AmbiguousRoleResolution: " + a() + ",");
        }
        if (b() != null) {
            sb.append("RulesConfiguration: " + b());
        }
        sb.append("}");
        return sb.toString();
    }
}
