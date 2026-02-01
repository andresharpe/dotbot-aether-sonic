package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/* loaded from: classes.dex */
public class DecodeAuthorizationMessageResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24162E;

    public String a() {
        return this.f24162E;
    }

    public void b(String str) {
        this.f24162E = str;
    }

    public DecodeAuthorizationMessageResult c(String str) {
        this.f24162E = str;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DecodeAuthorizationMessageResult)) {
            return false;
        }
        DecodeAuthorizationMessageResult decodeAuthorizationMessageResult = (DecodeAuthorizationMessageResult) obj;
        if (decodeAuthorizationMessageResult.a() == null) {
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
        if (decodeAuthorizationMessageResult.a() == null || decodeAuthorizationMessageResult.a().equals(a())) {
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
            sb.append("DecodedMessage: " + a());
        }
        sb.append("}");
        return sb.toString();
    }
}
