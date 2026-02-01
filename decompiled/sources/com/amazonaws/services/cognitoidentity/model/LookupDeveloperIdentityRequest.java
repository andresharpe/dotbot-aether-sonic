package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;

/* loaded from: classes.dex */
public class LookupDeveloperIdentityRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24019J;

    /* renamed from: K, reason: collision with root package name */
    private String f24020K;

    /* renamed from: L, reason: collision with root package name */
    private String f24021L;

    /* renamed from: M, reason: collision with root package name */
    private Integer f24022M;

    /* renamed from: N, reason: collision with root package name */
    private String f24023N;

    public void A(Integer num) {
        this.f24022M = num;
    }

    public void B(String str) {
        this.f24023N = str;
    }

    public LookupDeveloperIdentityRequest C(String str) {
        this.f24021L = str;
        return this;
    }

    public LookupDeveloperIdentityRequest D(String str) {
        this.f24020K = str;
        return this;
    }

    public LookupDeveloperIdentityRequest E(String str) {
        this.f24019J = str;
        return this;
    }

    public LookupDeveloperIdentityRequest F(Integer num) {
        this.f24022M = num;
        return this;
    }

    public LookupDeveloperIdentityRequest G(String str) {
        this.f24023N = str;
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
        if (obj == null || !(obj instanceof LookupDeveloperIdentityRequest)) {
            return false;
        }
        LookupDeveloperIdentityRequest lookupDeveloperIdentityRequest = (LookupDeveloperIdentityRequest) obj;
        if (lookupDeveloperIdentityRequest.s() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (s() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.s() != null && !lookupDeveloperIdentityRequest.s().equals(s())) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.r() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (r() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.r() != null && !lookupDeveloperIdentityRequest.r().equals(r())) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.q() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (q() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.q() != null && !lookupDeveloperIdentityRequest.q().equals(q())) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.t() == null) {
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
        if (lookupDeveloperIdentityRequest.t() != null && !lookupDeveloperIdentityRequest.t().equals(t())) {
            return false;
        }
        if (lookupDeveloperIdentityRequest.u() == null) {
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
        if (lookupDeveloperIdentityRequest.u() == null || lookupDeveloperIdentityRequest.u().equals(u())) {
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
        if (s() == null) {
            hashCode = 0;
        } else {
            hashCode = s().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (r() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (q() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = q().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (t() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = t().hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        if (u() != null) {
            i4 = u().hashCode();
        }
        return i8 + i4;
    }

    public String q() {
        return this.f24021L;
    }

    public String r() {
        return this.f24020K;
    }

    public String s() {
        return this.f24019J;
    }

    public Integer t() {
        return this.f24022M;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (s() != null) {
            sb.append("IdentityPoolId: " + s() + ",");
        }
        if (r() != null) {
            sb.append("IdentityId: " + r() + ",");
        }
        if (q() != null) {
            sb.append("DeveloperUserIdentifier: " + q() + ",");
        }
        if (t() != null) {
            sb.append("MaxResults: " + t() + ",");
        }
        if (u() != null) {
            sb.append("NextToken: " + u());
        }
        sb.append("}");
        return sb.toString();
    }

    public String u() {
        return this.f24023N;
    }

    public void w(String str) {
        this.f24021L = str;
    }

    public void x(String str) {
        this.f24020K = str;
    }

    public void y(String str) {
        this.f24019J = str;
    }
}
