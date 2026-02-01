package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ListTagsForResourceRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24017J;

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTagsForResourceRequest)) {
            return false;
        }
        ListTagsForResourceRequest listTagsForResourceRequest = (ListTagsForResourceRequest) obj;
        if (listTagsForResourceRequest.q() == null) {
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
        if (listTagsForResourceRequest.q() == null || listTagsForResourceRequest.q().equals(q())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        if (q() == null) {
            hashCode = 0;
        } else {
            hashCode = q().hashCode();
        }
        return 31 + hashCode;
    }

    public String q() {
        return this.f24017J;
    }

    public void r(String str) {
        this.f24017J = str;
    }

    public ListTagsForResourceRequest s(String str) {
        this.f24017J = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (q() != null) {
            sb.append("ResourceArn: " + q());
        }
        sb.append("}");
        return sb.toString();
    }
}
