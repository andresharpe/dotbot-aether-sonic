package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class GetOpenIdTokenForDeveloperIdentityRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f23986J;

    /* renamed from: K, reason: collision with root package name */
    private String f23987K;

    /* renamed from: L, reason: collision with root package name */
    private Map<String, String> f23988L;

    /* renamed from: M, reason: collision with root package name */
    private Long f23989M;

    public void A(Map<String, String> map) {
        this.f23988L = map;
    }

    public void B(Long l4) {
        this.f23989M = l4;
    }

    public GetOpenIdTokenForDeveloperIdentityRequest C(String str) {
        this.f23987K = str;
        return this;
    }

    public GetOpenIdTokenForDeveloperIdentityRequest D(String str) {
        this.f23986J = str;
        return this;
    }

    public GetOpenIdTokenForDeveloperIdentityRequest E(Map<String, String> map) {
        this.f23988L = map;
        return this;
    }

    public GetOpenIdTokenForDeveloperIdentityRequest F(Long l4) {
        this.f23989M = l4;
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
        if (obj == null || !(obj instanceof GetOpenIdTokenForDeveloperIdentityRequest)) {
            return false;
        }
        GetOpenIdTokenForDeveloperIdentityRequest getOpenIdTokenForDeveloperIdentityRequest = (GetOpenIdTokenForDeveloperIdentityRequest) obj;
        if (getOpenIdTokenForDeveloperIdentityRequest.t() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (t() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.t() != null && !getOpenIdTokenForDeveloperIdentityRequest.t().equals(t())) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.s() == null) {
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
        if (getOpenIdTokenForDeveloperIdentityRequest.s() != null && !getOpenIdTokenForDeveloperIdentityRequest.s().equals(s())) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.u() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (u() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.u() != null && !getOpenIdTokenForDeveloperIdentityRequest.u().equals(u())) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.w() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (w() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (getOpenIdTokenForDeveloperIdentityRequest.w() == null || getOpenIdTokenForDeveloperIdentityRequest.w().equals(w())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i4 = 0;
        if (t() == null) {
            hashCode = 0;
        } else {
            hashCode = t().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (s() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = s().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (u() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = u().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (w() != null) {
            i4 = w().hashCode();
        }
        return i7 + i4;
    }

    public GetOpenIdTokenForDeveloperIdentityRequest q(String str, String str2) {
        if (this.f23988L == null) {
            this.f23988L = new HashMap();
        }
        if (!this.f23988L.containsKey(str)) {
            this.f23988L.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public GetOpenIdTokenForDeveloperIdentityRequest r() {
        this.f23988L = null;
        return this;
    }

    public String s() {
        return this.f23987K;
    }

    public String t() {
        return this.f23986J;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (t() != null) {
            sb.append("IdentityPoolId: " + t() + ",");
        }
        if (s() != null) {
            sb.append("IdentityId: " + s() + ",");
        }
        if (u() != null) {
            sb.append("Logins: " + u() + ",");
        }
        if (w() != null) {
            sb.append("TokenDuration: " + w());
        }
        sb.append("}");
        return sb.toString();
    }

    public Map<String, String> u() {
        return this.f23988L;
    }

    public Long w() {
        return this.f23989M;
    }

    public void x(String str) {
        this.f23987K = str;
    }

    public void y(String str) {
        this.f23986J = str;
    }
}
