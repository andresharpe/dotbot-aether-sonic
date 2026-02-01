package com.amazonaws.services.securitytoken.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class AssumeRoleWithWebIdentityRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24142J;

    /* renamed from: K, reason: collision with root package name */
    private String f24143K;

    /* renamed from: L, reason: collision with root package name */
    private String f24144L;

    /* renamed from: M, reason: collision with root package name */
    private String f24145M;

    /* renamed from: N, reason: collision with root package name */
    private List<PolicyDescriptorType> f24146N;

    /* renamed from: O, reason: collision with root package name */
    private String f24147O;

    /* renamed from: P, reason: collision with root package name */
    private Integer f24148P;

    public void A(String str) {
        this.f24147O = str;
    }

    public void B(Collection<PolicyDescriptorType> collection) {
        if (collection == null) {
            this.f24146N = null;
        } else {
            this.f24146N = new ArrayList(collection);
        }
    }

    public void C(String str) {
        this.f24145M = str;
    }

    public void D(String str) {
        this.f24142J = str;
    }

    public void E(String str) {
        this.f24143K = str;
    }

    public void F(String str) {
        this.f24144L = str;
    }

    public AssumeRoleWithWebIdentityRequest G(Integer num) {
        this.f24148P = num;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest H(String str) {
        this.f24147O = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest I(Collection<PolicyDescriptorType> collection) {
        B(collection);
        return this;
    }

    public AssumeRoleWithWebIdentityRequest J(PolicyDescriptorType... policyDescriptorTypeArr) {
        if (s() == null) {
            this.f24146N = new ArrayList(policyDescriptorTypeArr.length);
        }
        for (PolicyDescriptorType policyDescriptorType : policyDescriptorTypeArr) {
            this.f24146N.add(policyDescriptorType);
        }
        return this;
    }

    public AssumeRoleWithWebIdentityRequest K(String str) {
        this.f24145M = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest L(String str) {
        this.f24142J = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest M(String str) {
        this.f24143K = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest N(String str) {
        this.f24144L = str;
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
        boolean z15;
        boolean z16;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleWithWebIdentityRequest)) {
            return false;
        }
        AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest = (AssumeRoleWithWebIdentityRequest) obj;
        if (assumeRoleWithWebIdentityRequest.u() == null) {
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
        if (assumeRoleWithWebIdentityRequest.u() != null && !assumeRoleWithWebIdentityRequest.u().equals(u())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.w() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (w() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.w() != null && !assumeRoleWithWebIdentityRequest.w().equals(w())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.x() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (x() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.x() != null && !assumeRoleWithWebIdentityRequest.x().equals(x())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.t() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (t() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.t() != null && !assumeRoleWithWebIdentityRequest.t().equals(t())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.s() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (s() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 ^ z12) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.s() != null && !assumeRoleWithWebIdentityRequest.s().equals(s())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.r() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (r() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 ^ z14) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.r() != null && !assumeRoleWithWebIdentityRequest.r().equals(r())) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.q() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (q() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z15 ^ z16) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.q() == null || assumeRoleWithWebIdentityRequest.q().equals(q())) {
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
        int hashCode6;
        int i4 = 0;
        if (u() == null) {
            hashCode = 0;
        } else {
            hashCode = u().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (w() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = w().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (x() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = x().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (t() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t().hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        if (s() == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = s().hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        if (r() == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = r().hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        if (q() != null) {
            i4 = q().hashCode();
        }
        return i10 + i4;
    }

    public Integer q() {
        return this.f24148P;
    }

    public String r() {
        return this.f24147O;
    }

    public List<PolicyDescriptorType> s() {
        return this.f24146N;
    }

    public String t() {
        return this.f24145M;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (u() != null) {
            sb.append("RoleArn: " + u() + ",");
        }
        if (w() != null) {
            sb.append("RoleSessionName: " + w() + ",");
        }
        if (x() != null) {
            sb.append("WebIdentityToken: " + x() + ",");
        }
        if (t() != null) {
            sb.append("ProviderId: " + t() + ",");
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
        return this.f24142J;
    }

    public String w() {
        return this.f24143K;
    }

    public String x() {
        return this.f24144L;
    }

    public void y(Integer num) {
        this.f24148P = num;
    }
}
