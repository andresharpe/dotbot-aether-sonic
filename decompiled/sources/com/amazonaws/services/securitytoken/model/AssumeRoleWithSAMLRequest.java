package com.amazonaws.services.securitytoken.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class AssumeRoleWithSAMLRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24128J;

    /* renamed from: K, reason: collision with root package name */
    private String f24129K;

    /* renamed from: L, reason: collision with root package name */
    private String f24130L;

    /* renamed from: M, reason: collision with root package name */
    private List<PolicyDescriptorType> f24131M;

    /* renamed from: N, reason: collision with root package name */
    private String f24132N;

    /* renamed from: O, reason: collision with root package name */
    private Integer f24133O;

    public void A(Collection<PolicyDescriptorType> collection) {
        if (collection == null) {
            this.f24131M = null;
        } else {
            this.f24131M = new ArrayList(collection);
        }
    }

    public void B(String str) {
        this.f24129K = str;
    }

    public void C(String str) {
        this.f24128J = str;
    }

    public void D(String str) {
        this.f24130L = str;
    }

    public AssumeRoleWithSAMLRequest E(Integer num) {
        this.f24133O = num;
        return this;
    }

    public AssumeRoleWithSAMLRequest F(String str) {
        this.f24132N = str;
        return this;
    }

    public AssumeRoleWithSAMLRequest G(Collection<PolicyDescriptorType> collection) {
        A(collection);
        return this;
    }

    public AssumeRoleWithSAMLRequest H(PolicyDescriptorType... policyDescriptorTypeArr) {
        if (s() == null) {
            this.f24131M = new ArrayList(policyDescriptorTypeArr.length);
        }
        for (PolicyDescriptorType policyDescriptorType : policyDescriptorTypeArr) {
            this.f24131M.add(policyDescriptorType);
        }
        return this;
    }

    public AssumeRoleWithSAMLRequest I(String str) {
        this.f24129K = str;
        return this;
    }

    public AssumeRoleWithSAMLRequest J(String str) {
        this.f24128J = str;
        return this;
    }

    public AssumeRoleWithSAMLRequest K(String str) {
        this.f24130L = str;
        return this;
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
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleWithSAMLRequest)) {
            return false;
        }
        AssumeRoleWithSAMLRequest assumeRoleWithSAMLRequest = (AssumeRoleWithSAMLRequest) obj;
        if (assumeRoleWithSAMLRequest.u() == null) {
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
        if (assumeRoleWithSAMLRequest.u() != null && !assumeRoleWithSAMLRequest.u().equals(u())) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.t() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (t() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.t() != null && !assumeRoleWithSAMLRequest.t().equals(t())) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.w() == null) {
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
        if (assumeRoleWithSAMLRequest.w() != null && !assumeRoleWithSAMLRequest.w().equals(w())) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.s() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (s() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.s() != null && !assumeRoleWithSAMLRequest.s().equals(s())) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.r() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (r() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 ^ z12) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.r() != null && !assumeRoleWithSAMLRequest.r().equals(r())) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.q() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (q() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 ^ z14) {
            return false;
        }
        if (assumeRoleWithSAMLRequest.q() == null || assumeRoleWithSAMLRequest.q().equals(q())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i4 = 0;
        if (u() == null) {
            hashCode = 0;
        } else {
            hashCode = u().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (t() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = t().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (w() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = w().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (s() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = s().hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        if (r() == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r().hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        if (q() != null) {
            i4 = q().hashCode();
        }
        return i9 + i4;
    }

    public Integer q() {
        return this.f24133O;
    }

    public String r() {
        return this.f24132N;
    }

    public List<PolicyDescriptorType> s() {
        return this.f24131M;
    }

    public String t() {
        return this.f24129K;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (u() != null) {
            sb.append("RoleArn: " + u() + ",");
        }
        if (t() != null) {
            sb.append("PrincipalArn: " + t() + ",");
        }
        if (w() != null) {
            sb.append("SAMLAssertion: " + w() + ",");
        }
        if (s() != null) {
            sb.append("PolicyArns: " + s() + ",");
        }
        if (r() != null) {
            sb.append("Policy: " + r() + ",");
        }
        if (q() != null) {
            sb.append("DurationSeconds: " + q());
        }
        sb.append("}");
        return sb.toString();
    }

    public String u() {
        return this.f24128J;
    }

    public String w() {
        return this.f24130L;
    }

    public void x(Integer num) {
        this.f24133O = num;
    }

    public void y(String str) {
        this.f24132N = str;
    }
}
