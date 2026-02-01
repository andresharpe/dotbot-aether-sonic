package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class UnlinkIdentityRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24053J;

    /* renamed from: K, reason: collision with root package name */
    private Map<String, String> f24054K;

    /* renamed from: L, reason: collision with root package name */
    private List<String> f24055L;

    public UnlinkIdentityRequest A(String str) {
        this.f24053J = str;
        return this;
    }

    public UnlinkIdentityRequest B(Map<String, String> map) {
        this.f24054K = map;
        return this;
    }

    public UnlinkIdentityRequest C(Collection<String> collection) {
        y(collection);
        return this;
    }

    public UnlinkIdentityRequest D(String... strArr) {
        if (u() == null) {
            this.f24055L = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f24055L.add(str);
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
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnlinkIdentityRequest)) {
            return false;
        }
        UnlinkIdentityRequest unlinkIdentityRequest = (UnlinkIdentityRequest) obj;
        if (unlinkIdentityRequest.s() == null) {
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
        if (unlinkIdentityRequest.s() != null && !unlinkIdentityRequest.s().equals(s())) {
            return false;
        }
        if (unlinkIdentityRequest.t() == null) {
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
        if (unlinkIdentityRequest.t() != null && !unlinkIdentityRequest.t().equals(t())) {
            return false;
        }
        if (unlinkIdentityRequest.u() == null) {
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
        if (unlinkIdentityRequest.u() == null || unlinkIdentityRequest.u().equals(u())) {
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

    public UnlinkIdentityRequest q(String str, String str2) {
        if (this.f24054K == null) {
            this.f24054K = new HashMap();
        }
        if (!this.f24054K.containsKey(str)) {
            this.f24054K.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public UnlinkIdentityRequest r() {
        this.f24054K = null;
        return this;
    }

    public String s() {
        return this.f24053J;
    }

    public Map<String, String> t() {
        return this.f24054K;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (s() != null) {
            sb.append("IdentityId: " + s() + ",");
        }
        if (t() != null) {
            sb.append("Logins: " + t() + ",");
        }
        if (u() != null) {
            sb.append("LoginsToRemove: " + u());
        }
        sb.append("}");
        return sb.toString();
    }

    public List<String> u() {
        return this.f24055L;
    }

    public void w(String str) {
        this.f24053J = str;
    }

    public void x(Map<String, String> map) {
        this.f24054K = map;
    }

    public void y(Collection<String> collection) {
        if (collection == null) {
            this.f24055L = null;
        } else {
            this.f24055L = new ArrayList(collection);
        }
    }
}
