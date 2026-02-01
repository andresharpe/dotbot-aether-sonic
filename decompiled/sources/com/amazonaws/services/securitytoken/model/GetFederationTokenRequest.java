package com.amazonaws.services.securitytoken.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class GetFederationTokenRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24171J;

    /* renamed from: K, reason: collision with root package name */
    private String f24172K;

    /* renamed from: L, reason: collision with root package name */
    private List<PolicyDescriptorType> f24173L;

    /* renamed from: M, reason: collision with root package name */
    private Integer f24174M;

    /* renamed from: N, reason: collision with root package name */
    private List<Tag> f24175N;

    public GetFederationTokenRequest() {
    }

    public void A(Collection<PolicyDescriptorType> collection) {
        if (collection == null) {
            this.f24173L = null;
        } else {
            this.f24173L = new ArrayList(collection);
        }
    }

    public void B(Collection<Tag> collection) {
        if (collection == null) {
            this.f24175N = null;
        } else {
            this.f24175N = new ArrayList(collection);
        }
    }

    public GetFederationTokenRequest C(Integer num) {
        this.f24174M = num;
        return this;
    }

    public GetFederationTokenRequest D(String str) {
        this.f24171J = str;
        return this;
    }

    public GetFederationTokenRequest E(String str) {
        this.f24172K = str;
        return this;
    }

    public GetFederationTokenRequest F(Collection<PolicyDescriptorType> collection) {
        A(collection);
        return this;
    }

    public GetFederationTokenRequest G(PolicyDescriptorType... policyDescriptorTypeArr) {
        if (t() == null) {
            this.f24173L = new ArrayList(policyDescriptorTypeArr.length);
        }
        for (PolicyDescriptorType policyDescriptorType : policyDescriptorTypeArr) {
            this.f24173L.add(policyDescriptorType);
        }
        return this;
    }

    public GetFederationTokenRequest H(Collection<Tag> collection) {
        B(collection);
        return this;
    }

    public GetFederationTokenRequest I(Tag... tagArr) {
        if (u() == null) {
            this.f24175N = new ArrayList(tagArr.length);
        }
        for (Tag tag : tagArr) {
            this.f24175N.add(tag);
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
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetFederationTokenRequest)) {
            return false;
        }
        GetFederationTokenRequest getFederationTokenRequest = (GetFederationTokenRequest) obj;
        if (getFederationTokenRequest.r() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (r() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getFederationTokenRequest.r() != null && !getFederationTokenRequest.r().equals(r())) {
            return false;
        }
        if (getFederationTokenRequest.s() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (s() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (getFederationTokenRequest.s() != null && !getFederationTokenRequest.s().equals(s())) {
            return false;
        }
        if (getFederationTokenRequest.t() == null) {
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
        if (getFederationTokenRequest.t() != null && !getFederationTokenRequest.t().equals(t())) {
            return false;
        }
        if (getFederationTokenRequest.q() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (q() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (getFederationTokenRequest.q() != null && !getFederationTokenRequest.q().equals(q())) {
            return false;
        }
        if (getFederationTokenRequest.u() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (u() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 ^ z12) {
            return false;
        }
        if (getFederationTokenRequest.u() == null || getFederationTokenRequest.u().equals(u())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i4 = 0;
        if (r() == null) {
            hashCode = 0;
        } else {
            hashCode = r().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (s() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = s().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (t() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = t().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (q() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = q().hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        if (u() != null) {
            i4 = u().hashCode();
        }
        return i8 + i4;
    }

    public Integer q() {
        return this.f24174M;
    }

    public String r() {
        return this.f24171J;
    }

    public String s() {
        return this.f24172K;
    }

    public List<PolicyDescriptorType> t() {
        return this.f24173L;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (r() != null) {
            sb.append("Name: " + r() + ",");
        }
        if (s() != null) {
            sb.append("Policy: " + s() + ",");
        }
        if (t() != null) {
            sb.append("PolicyArns: " + t() + ",");
        }
        if (q() != null) {
            sb.append("DurationSeconds: " + q() + ",");
        }
        if (u() != null) {
            sb.append("Tags: " + u());
        }
        sb.append("}");
        return sb.toString();
    }

    public List<Tag> u() {
        return this.f24175N;
    }

    public void w(Integer num) {
        this.f24174M = num;
    }

    public void x(String str) {
        this.f24171J = str;
    }

    public void y(String str) {
        this.f24172K = str;
    }

    public GetFederationTokenRequest(String str) {
        x(str);
    }
}
