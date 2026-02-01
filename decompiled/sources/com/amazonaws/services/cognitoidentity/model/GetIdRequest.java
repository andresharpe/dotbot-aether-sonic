package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class GetIdRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f23978J;

    /* renamed from: K, reason: collision with root package name */
    private String f23979K;

    /* renamed from: L, reason: collision with root package name */
    private Map<String, String> f23980L;

    public GetIdRequest A(String str) {
        this.f23978J = str;
        return this;
    }

    public GetIdRequest B(String str) {
        this.f23979K = str;
        return this;
    }

    public GetIdRequest C(Map<String, String> map) {
        this.f23980L = map;
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
        if (obj == null || !(obj instanceof GetIdRequest)) {
            return false;
        }
        GetIdRequest getIdRequest = (GetIdRequest) obj;
        if (getIdRequest.s() == null) {
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
        if (getIdRequest.s() != null && !getIdRequest.s().equals(s())) {
            return false;
        }
        if (getIdRequest.t() == null) {
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
        if (getIdRequest.t() != null && !getIdRequest.t().equals(t())) {
            return false;
        }
        if (getIdRequest.u() == null) {
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
        if (getIdRequest.u() == null || getIdRequest.u().equals(u())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        if (s() == null) {
            hashCode = 0;
        } else {
            hashCode = s().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (t() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = t().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (u() != null) {
            i4 = u().hashCode();
        }
        return i6 + i4;
    }

    public GetIdRequest q(String str, String str2) {
        if (this.f23980L == null) {
            this.f23980L = new HashMap();
        }
        if (!this.f23980L.containsKey(str)) {
            this.f23980L.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public GetIdRequest r() {
        this.f23980L = null;
        return this;
    }

    public String s() {
        return this.f23978J;
    }

    public String t() {
        return this.f23979K;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (s() != null) {
            sb.append("AccountId: " + s() + ",");
        }
        if (t() != null) {
            sb.append("IdentityPoolId: " + t() + ",");
        }
        if (u() != null) {
            sb.append("Logins: " + u());
        }
        sb.append("}");
        return sb.toString();
    }

    public Map<String, String> u() {
        return this.f23980L;
    }

    public void w(String str) {
        this.f23978J = str;
    }

    public void x(String str) {
        this.f23979K = str;
    }

    public void y(Map<String, String> map) {
        this.f23980L = map;
    }
}
