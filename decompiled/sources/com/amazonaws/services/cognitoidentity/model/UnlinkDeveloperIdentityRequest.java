package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;

/* loaded from: classes.dex */
public class UnlinkDeveloperIdentityRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24049J;

    /* renamed from: K, reason: collision with root package name */
    private String f24050K;

    /* renamed from: L, reason: collision with root package name */
    private String f24051L;

    /* renamed from: M, reason: collision with root package name */
    private String f24052M;

    public UnlinkDeveloperIdentityRequest A(String str) {
        this.f24051L = str;
        return this;
    }

    public UnlinkDeveloperIdentityRequest B(String str) {
        this.f24052M = str;
        return this;
    }

    public UnlinkDeveloperIdentityRequest C(String str) {
        this.f24049J = str;
        return this;
    }

    public UnlinkDeveloperIdentityRequest D(String str) {
        this.f24050K = str;
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
        if (obj == null || !(obj instanceof UnlinkDeveloperIdentityRequest)) {
            return false;
        }
        UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest = (UnlinkDeveloperIdentityRequest) obj;
        if (unlinkDeveloperIdentityRequest.s() == null) {
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
        if (unlinkDeveloperIdentityRequest.s() != null && !unlinkDeveloperIdentityRequest.s().equals(s())) {
            return false;
        }
        if (unlinkDeveloperIdentityRequest.t() == null) {
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
        if (unlinkDeveloperIdentityRequest.t() != null && !unlinkDeveloperIdentityRequest.t().equals(t())) {
            return false;
        }
        if (unlinkDeveloperIdentityRequest.q() == null) {
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
        if (unlinkDeveloperIdentityRequest.q() != null && !unlinkDeveloperIdentityRequest.q().equals(q())) {
            return false;
        }
        if (unlinkDeveloperIdentityRequest.r() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (r() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (unlinkDeveloperIdentityRequest.r() == null || unlinkDeveloperIdentityRequest.r().equals(r())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
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
        if (q() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = q().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (r() != null) {
            i4 = r().hashCode();
        }
        return i7 + i4;
    }

    public String q() {
        return this.f24051L;
    }

    public String r() {
        return this.f24052M;
    }

    public String s() {
        return this.f24049J;
    }

    public String t() {
        return this.f24050K;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (s() != null) {
            sb.append("IdentityId: " + s() + ",");
        }
        if (t() != null) {
            sb.append("IdentityPoolId: " + t() + ",");
        }
        if (q() != null) {
            sb.append("DeveloperProviderName: " + q() + ",");
        }
        if (r() != null) {
            sb.append("DeveloperUserIdentifier: " + r());
        }
        sb.append("}");
        return sb.toString();
    }

    public void u(String str) {
        this.f24051L = str;
    }

    public void w(String str) {
        this.f24052M = str;
    }

    public void x(String str) {
        this.f24049J = str;
    }

    public void y(String str) {
        this.f24050K = str;
    }
}
