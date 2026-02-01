package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class GetIdResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f23981E;

    public String a() {
        return this.f23981E;
    }

    public void b(String str) {
        this.f23981E = str;
    }

    public GetIdResult c(String str) {
        this.f23981E = str;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetIdResult)) {
            return false;
        }
        GetIdResult getIdResult = (GetIdResult) obj;
        if (getIdResult.a() == null) {
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
        if (getIdResult.a() == null || getIdResult.a().equals(a())) {
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
            sb.append("IdentityId: " + a());
        }
        sb.append("}");
        return sb.toString();
    }
}
