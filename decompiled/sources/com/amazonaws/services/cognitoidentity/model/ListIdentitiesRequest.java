package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ListIdentitiesRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24006J;

    /* renamed from: K, reason: collision with root package name */
    private Integer f24007K;

    /* renamed from: L, reason: collision with root package name */
    private String f24008L;

    /* renamed from: M, reason: collision with root package name */
    private Boolean f24009M;

    public void A(String str) {
        this.f24008L = str;
    }

    public ListIdentitiesRequest B(Boolean bool) {
        this.f24009M = bool;
        return this;
    }

    public ListIdentitiesRequest C(String str) {
        this.f24006J = str;
        return this;
    }

    public ListIdentitiesRequest D(Integer num) {
        this.f24007K = num;
        return this;
    }

    public ListIdentitiesRequest E(String str) {
        this.f24008L = str;
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
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListIdentitiesRequest)) {
            return false;
        }
        ListIdentitiesRequest listIdentitiesRequest = (ListIdentitiesRequest) obj;
        if (listIdentitiesRequest.r() == null) {
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
        if (listIdentitiesRequest.r() != null && !listIdentitiesRequest.r().equals(r())) {
            return false;
        }
        if (listIdentitiesRequest.s() == null) {
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
        if (listIdentitiesRequest.s() != null && !listIdentitiesRequest.s().equals(s())) {
            return false;
        }
        if (listIdentitiesRequest.t() == null) {
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
        if (listIdentitiesRequest.t() != null && !listIdentitiesRequest.t().equals(t())) {
            return false;
        }
        if (listIdentitiesRequest.q() == null) {
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
        if (listIdentitiesRequest.q() == null || listIdentitiesRequest.q().equals(q())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
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
        if (q() != null) {
            i4 = q().hashCode();
        }
        return i7 + i4;
    }

    public Boolean q() {
        return this.f24009M;
    }

    public String r() {
        return this.f24006J;
    }

    public Integer s() {
        return this.f24007K;
    }

    public String t() {
        return this.f24008L;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (r() != null) {
            sb.append("IdentityPoolId: " + r() + ",");
        }
        if (s() != null) {
            sb.append("MaxResults: " + s() + ",");
        }
        if (t() != null) {
            sb.append("NextToken: " + t() + ",");
        }
        if (q() != null) {
            sb.append("HideDisabled: " + q());
        }
        sb.append("}");
        return sb.toString();
    }

    public Boolean u() {
        return this.f24009M;
    }

    public void w(Boolean bool) {
        this.f24009M = bool;
    }

    public void x(String str) {
        this.f24006J = str;
    }

    public void y(Integer num) {
        this.f24007K = num;
    }
}
