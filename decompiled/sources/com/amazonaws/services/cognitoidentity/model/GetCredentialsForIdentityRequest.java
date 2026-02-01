package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class GetCredentialsForIdentityRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f23973J;

    /* renamed from: K, reason: collision with root package name */
    private Map<String, String> f23974K;

    /* renamed from: L, reason: collision with root package name */
    private String f23975L;

    public GetCredentialsForIdentityRequest A(String str) {
        this.f23975L = str;
        return this;
    }

    public GetCredentialsForIdentityRequest B(String str) {
        this.f23973J = str;
        return this;
    }

    public GetCredentialsForIdentityRequest C(Map<String, String> map) {
        this.f23974K = map;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetCredentialsForIdentityRequest)) {
            return false;
        }
        GetCredentialsForIdentityRequest getCredentialsForIdentityRequest = (GetCredentialsForIdentityRequest) obj;
        if (getCredentialsForIdentityRequest.t() == null) {
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
        if (getCredentialsForIdentityRequest.t() != null && !getCredentialsForIdentityRequest.t().equals(t())) {
            return false;
        }
        if (getCredentialsForIdentityRequest.u() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (u() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (getCredentialsForIdentityRequest.u() != null && !getCredentialsForIdentityRequest.u().equals(u())) {
            return false;
        }
        if (getCredentialsForIdentityRequest.s() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (s() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (getCredentialsForIdentityRequest.s() == null || getCredentialsForIdentityRequest.s().equals(s())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        if (t() == null) {
            hashCode = 0;
        } else {
            hashCode = t().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (u() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = u().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (s() != null) {
            i4 = s().hashCode();
        }
        return i6 + i4;
    }

    public GetCredentialsForIdentityRequest q(String str, String str2) {
        if (this.f23974K == null) {
            this.f23974K = new HashMap();
        }
        if (!this.f23974K.containsKey(str)) {
            this.f23974K.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public GetCredentialsForIdentityRequest r() {
        this.f23974K = null;
        return this;
    }

    public String s() {
        return this.f23975L;
    }

    public String t() {
        return this.f23973J;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (t() != null) {
            sb.append("IdentityId: " + t() + ",");
        }
        if (u() != null) {
            sb.append("Logins: " + u() + ",");
        }
        if (s() != null) {
            sb.append("CustomRoleArn: " + s());
        }
        sb.append("}");
        return sb.toString();
    }

    public Map<String, String> u() {
        return this.f23974K;
    }

    public void w(String str) {
        this.f23975L = str;
    }

    public void x(String str) {
        this.f23973J = str;
    }

    public void y(Map<String, String> map) {
        this.f23974K = map;
    }
}
