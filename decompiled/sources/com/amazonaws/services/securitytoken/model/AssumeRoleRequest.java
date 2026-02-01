package com.amazonaws.services.securitytoken.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class AssumeRoleRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24115J;

    /* renamed from: K, reason: collision with root package name */
    private String f24116K;

    /* renamed from: L, reason: collision with root package name */
    private List<PolicyDescriptorType> f24117L;

    /* renamed from: M, reason: collision with root package name */
    private String f24118M;

    /* renamed from: N, reason: collision with root package name */
    private Integer f24119N;

    /* renamed from: O, reason: collision with root package name */
    private List<Tag> f24120O;

    /* renamed from: P, reason: collision with root package name */
    private List<String> f24121P;

    /* renamed from: Q, reason: collision with root package name */
    private String f24122Q;

    /* renamed from: R, reason: collision with root package name */
    private String f24123R;

    /* renamed from: S, reason: collision with root package name */
    private String f24124S;

    public String A() {
        return this.f24124S;
    }

    public List<String> B() {
        return this.f24121P;
    }

    public void C(Integer num) {
        this.f24119N = num;
    }

    public void D(String str) {
        this.f24122Q = str;
    }

    public void E(String str) {
        this.f24118M = str;
    }

    public void F(Collection<PolicyDescriptorType> collection) {
        if (collection == null) {
            this.f24117L = null;
        } else {
            this.f24117L = new ArrayList(collection);
        }
    }

    public void G(String str) {
        this.f24115J = str;
    }

    public void H(String str) {
        this.f24116K = str;
    }

    public void I(String str) {
        this.f24123R = str;
    }

    public void J(Collection<Tag> collection) {
        if (collection == null) {
            this.f24120O = null;
        } else {
            this.f24120O = new ArrayList(collection);
        }
    }

    public void K(String str) {
        this.f24124S = str;
    }

    public void L(Collection<String> collection) {
        if (collection == null) {
            this.f24121P = null;
        } else {
            this.f24121P = new ArrayList(collection);
        }
    }

    public AssumeRoleRequest M(Integer num) {
        this.f24119N = num;
        return this;
    }

    public AssumeRoleRequest N(String str) {
        this.f24122Q = str;
        return this;
    }

    public AssumeRoleRequest O(String str) {
        this.f24118M = str;
        return this;
    }

    public AssumeRoleRequest P(Collection<PolicyDescriptorType> collection) {
        F(collection);
        return this;
    }

    public AssumeRoleRequest Q(PolicyDescriptorType... policyDescriptorTypeArr) {
        if (t() == null) {
            this.f24117L = new ArrayList(policyDescriptorTypeArr.length);
        }
        for (PolicyDescriptorType policyDescriptorType : policyDescriptorTypeArr) {
            this.f24117L.add(policyDescriptorType);
        }
        return this;
    }

    public AssumeRoleRequest R(String str) {
        this.f24115J = str;
        return this;
    }

    public AssumeRoleRequest S(String str) {
        this.f24116K = str;
        return this;
    }

    public AssumeRoleRequest T(String str) {
        this.f24123R = str;
        return this;
    }

    public AssumeRoleRequest U(Collection<Tag> collection) {
        J(collection);
        return this;
    }

    public AssumeRoleRequest V(Tag... tagArr) {
        if (y() == null) {
            this.f24120O = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.f24120O.add(tag);
        }
        return this;
    }

    public AssumeRoleRequest W(String str) {
        this.f24124S = str;
        return this;
    }

    public AssumeRoleRequest X(Collection<String> collection) {
        L(collection);
        return this;
    }

    public AssumeRoleRequest Y(String... strArr) {
        if (B() == null) {
            this.f24121P = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f24121P.add(str);
        }
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
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleRequest)) {
            return false;
        }
        AssumeRoleRequest assumeRoleRequest = (AssumeRoleRequest) obj;
        if (assumeRoleRequest.u() == null) {
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
        if (assumeRoleRequest.u() != null && !assumeRoleRequest.u().equals(u())) {
            return false;
        }
        if (assumeRoleRequest.w() == null) {
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
        if (assumeRoleRequest.w() != null && !assumeRoleRequest.w().equals(w())) {
            return false;
        }
        if (assumeRoleRequest.t() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (t() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (assumeRoleRequest.t() != null && !assumeRoleRequest.t().equals(t())) {
            return false;
        }
        if (assumeRoleRequest.s() == null) {
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
        if (assumeRoleRequest.s() != null && !assumeRoleRequest.s().equals(s())) {
            return false;
        }
        if (assumeRoleRequest.q() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (q() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 ^ z12) {
            return false;
        }
        if (assumeRoleRequest.q() != null && !assumeRoleRequest.q().equals(q())) {
            return false;
        }
        if (assumeRoleRequest.y() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (y() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 ^ z14) {
            return false;
        }
        if (assumeRoleRequest.y() != null && !assumeRoleRequest.y().equals(y())) {
            return false;
        }
        if (assumeRoleRequest.B() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (B() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z15 ^ z16) {
            return false;
        }
        if (assumeRoleRequest.B() != null && !assumeRoleRequest.B().equals(B())) {
            return false;
        }
        if (assumeRoleRequest.r() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (r() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z17 ^ z18) {
            return false;
        }
        if (assumeRoleRequest.r() != null && !assumeRoleRequest.r().equals(r())) {
            return false;
        }
        if (assumeRoleRequest.x() == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (x() == null) {
            z20 = true;
        } else {
            z20 = false;
        }
        if (z19 ^ z20) {
            return false;
        }
        if (assumeRoleRequest.x() != null && !assumeRoleRequest.x().equals(x())) {
            return false;
        }
        if (assumeRoleRequest.A() == null) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (A() == null) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (z21 ^ z22) {
            return false;
        }
        if (assumeRoleRequest.A() == null || assumeRoleRequest.A().equals(A())) {
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
        int hashCode7;
        int hashCode8;
        int hashCode9;
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
        if (t() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = t().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (s() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = s().hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        if (q() == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = q().hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        if (y() == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = y().hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        if (B() == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = B().hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        if (r() == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = r().hashCode();
        }
        int i12 = (i11 + hashCode8) * 31;
        if (x() == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = x().hashCode();
        }
        int i13 = (i12 + hashCode9) * 31;
        if (A() != null) {
            i4 = A().hashCode();
        }
        return i13 + i4;
    }

    public Integer q() {
        return this.f24119N;
    }

    public String r() {
        return this.f24122Q;
    }

    public String s() {
        return this.f24118M;
    }

    public List<PolicyDescriptorType> t() {
        return this.f24117L;
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
        if (t() != null) {
            sb.append("PolicyArns: " + t() + ",");
        }
        if (s() != null) {
            sb.append("Policy: " + s() + ",");
        }
        if (q() != null) {
            sb.append("DurationSeconds: " + q() + ",");
        }
        if (y() != null) {
            sb.append("Tags: " + y() + ",");
        }
        if (B() != null) {
            sb.append("TransitiveTagKeys: " + B() + ",");
        }
        if (r() != null) {
            sb.append("ExternalId: " + r() + ",");
        }
        if (x() != null) {
            sb.append("SerialNumber: " + x() + ",");
        }
        if (A() != null) {
            sb.append("TokenCode: " + A());
        }
        sb.append("}");
        return sb.toString();
    }

    public String u() {
        return this.f24115J;
    }

    public String w() {
        return this.f24116K;
    }

    public String x() {
        return this.f24123R;
    }

    public List<Tag> y() {
        return this.f24120O;
    }
}
