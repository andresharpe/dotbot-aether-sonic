package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class GetSessionTokenResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private Credentials f24182E;

    public Credentials a() {
        return this.f24182E;
    }

    public void b(Credentials credentials) {
        this.f24182E = credentials;
    }

    public GetSessionTokenResult c(Credentials credentials) {
        this.f24182E = credentials;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetSessionTokenResult)) {
            return false;
        }
        GetSessionTokenResult getSessionTokenResult = (GetSessionTokenResult) obj;
        if (getSessionTokenResult.a() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (a() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getSessionTokenResult.a() == null || getSessionTokenResult.a().equals(a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        if (a() == null) {
            hashCode = 0;
        } else {
            hashCode = a().hashCode();
        }
        return 31 + hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (a() != null) {
            sb.append("Credentials: " + a());
        }
        sb.append("}");
        return sb.toString();
    }
}
