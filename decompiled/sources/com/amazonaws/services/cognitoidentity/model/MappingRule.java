package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class MappingRule implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24027E;

    /* renamed from: F, reason: collision with root package name */
    private String f24028F;

    /* renamed from: G, reason: collision with root package name */
    private String f24029G;

    /* renamed from: H, reason: collision with root package name */
    private String f24030H;

    public String a() {
        return this.f24027E;
    }

    public String b() {
        return this.f24028F;
    }

    public String c() {
        return this.f24030H;
    }

    public String d() {
        return this.f24029G;
    }

    public void e(String str) {
        this.f24027E = str;
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
        if (obj == null || !(obj instanceof MappingRule)) {
            return false;
        }
        MappingRule mappingRule = (MappingRule) obj;
        if (mappingRule.a() == null) {
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
        if (mappingRule.a() != null && !mappingRule.a().equals(a())) {
            return false;
        }
        if (mappingRule.b() == null) {
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
        if (mappingRule.b() != null && !mappingRule.b().equals(b())) {
            return false;
        }
        if (mappingRule.d() == null) {
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
        if (mappingRule.d() != null && !mappingRule.d().equals(d())) {
            return false;
        }
        if (mappingRule.c() == null) {
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
        if (mappingRule.c() == null || mappingRule.c().equals(c())) {
            return true;
        }
        return false;
    }

    public void f(MappingRuleMatchType mappingRuleMatchType) {
        this.f24028F = mappingRuleMatchType.toString();
    }

    public void g(String str) {
        this.f24028F = str;
    }

    public void h(String str) {
        this.f24030H = str;
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
        if (b() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (d() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (c() != null) {
            i4 = c().hashCode();
        }
        return i7 + i4;
    }

    public void i(String str) {
        this.f24029G = str;
    }

    public MappingRule j(String str) {
        this.f24027E = str;
        return this;
    }

    public MappingRule k(MappingRuleMatchType mappingRuleMatchType) {
        this.f24028F = mappingRuleMatchType.toString();
        return this;
    }

    public MappingRule l(String str) {
        this.f24028F = str;
        return this;
    }

    public MappingRule m(String str) {
        this.f24030H = str;
        return this;
    }

    public MappingRule n(String str) {
        this.f24029G = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (a() != null) {
            sb.append("Claim: " + a() + ",");
        }
        if (b() != null) {
            sb.append("MatchType: " + b() + ",");
        }
        if (d() != null) {
            sb.append("Value: " + d() + ",");
        }
        if (c() != null) {
            sb.append("RoleARN: " + c());
        }
        sb.append("}");
        return sb.toString();
    }
}
