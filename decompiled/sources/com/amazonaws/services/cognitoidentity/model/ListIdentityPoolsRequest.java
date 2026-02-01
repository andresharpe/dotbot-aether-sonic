package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ListIdentityPoolsRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private Integer f24013J;

    /* renamed from: K, reason: collision with root package name */
    private String f24014K;

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListIdentityPoolsRequest)) {
            return false;
        }
        ListIdentityPoolsRequest listIdentityPoolsRequest = (ListIdentityPoolsRequest) obj;
        if (listIdentityPoolsRequest.q() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (q() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listIdentityPoolsRequest.q() != null && !listIdentityPoolsRequest.q().equals(q())) {
            return false;
        }
        if (listIdentityPoolsRequest.r() == null) {
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
        if (listIdentityPoolsRequest.r() == null || listIdentityPoolsRequest.r().equals(r())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i4 = 0;
        if (q() == null) {
            hashCode = 0;
        } else {
            hashCode = q().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (r() != null) {
            i4 = r().hashCode();
        }
        return i5 + i4;
    }

    public Integer q() {
        return this.f24013J;
    }

    public String r() {
        return this.f24014K;
    }

    public void s(Integer num) {
        this.f24013J = num;
    }

    public void t(String str) {
        this.f24014K = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (q() != null) {
            sb.append("MaxResults: " + q() + ",");
        }
        if (r() != null) {
            sb.append("NextToken: " + r());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListIdentityPoolsRequest u(Integer num) {
        this.f24013J = num;
        return this;
    }

    public ListIdentityPoolsRequest w(String str) {
        this.f24014K = str;
        return this;
    }
}
