package com.amazonaws.services.securitytoken.model;

import com.amazonaws.b;
import java.io.Serializable;

/* loaded from: classes.dex */
public class GetSessionTokenRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private Integer f24179J;

    /* renamed from: K, reason: collision with root package name */
    private String f24180K;

    /* renamed from: L, reason: collision with root package name */
    private String f24181L;

    public GetSessionTokenRequest A(String str) {
        this.f24181L = str;
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
        if (obj == null || !(obj instanceof GetSessionTokenRequest)) {
            return false;
        }
        GetSessionTokenRequest getSessionTokenRequest = (GetSessionTokenRequest) obj;
        if (getSessionTokenRequest.q() == null) {
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
        if (getSessionTokenRequest.q() != null && !getSessionTokenRequest.q().equals(q())) {
            return false;
        }
        if (getSessionTokenRequest.r() == null) {
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
        if (getSessionTokenRequest.r() != null && !getSessionTokenRequest.r().equals(r())) {
            return false;
        }
        if (getSessionTokenRequest.s() == null) {
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
        if (getSessionTokenRequest.s() == null || getSessionTokenRequest.s().equals(s())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        if (q() == null) {
            hashCode = 0;
        } else {
            hashCode = q().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (r() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (s() != null) {
            i4 = s().hashCode();
        }
        return i6 + i4;
    }

    public Integer q() {
        return this.f24179J;
    }

    public String r() {
        return this.f24180K;
    }

    public String s() {
        return this.f24181L;
    }

    public void t(Integer num) {
        this.f24179J = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (q() != null) {
            sb.append("DurationSeconds: " + q() + ",");
        }
        if (r() != null) {
            sb.append("SerialNumber: " + r() + ",");
        }
        if (s() != null) {
            sb.append("TokenCode: " + s());
        }
        sb.append("}");
        return sb.toString();
    }

    public void u(String str) {
        this.f24180K = str;
    }

    public void w(String str) {
        this.f24181L = str;
    }

    public GetSessionTokenRequest x(Integer num) {
        this.f24179J = num;
        return this;
    }

    public GetSessionTokenRequest y(String str) {
        this.f24180K = str;
        return this;
    }
}
