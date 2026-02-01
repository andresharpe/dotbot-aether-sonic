package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class GetOpenIdTokenRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f23992J;

    /* renamed from: K, reason: collision with root package name */
    private Map<String, String> f23993K;

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetOpenIdTokenRequest)) {
            return false;
        }
        GetOpenIdTokenRequest getOpenIdTokenRequest = (GetOpenIdTokenRequest) obj;
        if (getOpenIdTokenRequest.s() == null) {
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
        if (getOpenIdTokenRequest.s() != null && !getOpenIdTokenRequest.s().equals(s())) {
            return false;
        }
        if (getOpenIdTokenRequest.t() == null) {
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
        if (getOpenIdTokenRequest.t() == null || getOpenIdTokenRequest.t().equals(t())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i4 = 0;
        if (s() == null) {
            hashCode = 0;
        } else {
            hashCode = s().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (t() != null) {
            i4 = t().hashCode();
        }
        return i5 + i4;
    }

    public GetOpenIdTokenRequest q(String str, String str2) {
        if (this.f23993K == null) {
            this.f23993K = new HashMap();
        }
        if (!this.f23993K.containsKey(str)) {
            this.f23993K.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public GetOpenIdTokenRequest r() {
        this.f23993K = null;
        return this;
    }

    public String s() {
        return this.f23992J;
    }

    public Map<String, String> t() {
        return this.f23993K;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (s() != null) {
            sb.append("IdentityId: " + s() + ",");
        }
        if (t() != null) {
            sb.append("Logins: " + t());
        }
        sb.append("}");
        return sb.toString();
    }

    public void u(String str) {
        this.f23992J = str;
    }

    public void w(Map<String, String> map) {
        this.f23993K = map;
    }

    public GetOpenIdTokenRequest x(String str) {
        this.f23992J = str;
        return this;
    }

    public GetOpenIdTokenRequest y(Map<String, String> map) {
        this.f23993K = map;
        return this;
    }
}
