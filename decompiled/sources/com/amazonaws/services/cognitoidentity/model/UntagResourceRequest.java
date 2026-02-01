package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class UntagResourceRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24058J;

    /* renamed from: K, reason: collision with root package name */
    private List<String> f24059K;

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UntagResourceRequest)) {
            return false;
        }
        UntagResourceRequest untagResourceRequest = (UntagResourceRequest) obj;
        if (untagResourceRequest.q() == null) {
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
        if (untagResourceRequest.q() != null && !untagResourceRequest.q().equals(q())) {
            return false;
        }
        if (untagResourceRequest.r() == null) {
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
        if (untagResourceRequest.r() == null || untagResourceRequest.r().equals(r())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i4 = 0;
        if (q() == null) {
            hashCode = 0;
        } else {
            hashCode = q().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (r() != null) {
            i4 = r().hashCode();
        }
        return i5 + i4;
    }

    public String q() {
        return this.f24058J;
    }

    public List<String> r() {
        return this.f24059K;
    }

    public void s(String str) {
        this.f24058J = str;
    }

    public void t(Collection<String> collection) {
        if (collection == null) {
            this.f24059K = null;
        } else {
            this.f24059K = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (q() != null) {
            sb.append("ResourceArn: " + q() + ",");
        }
        if (r() != null) {
            sb.append("TagKeys: " + r());
        }
        sb.append("}");
        return sb.toString();
    }

    public UntagResourceRequest u(String str) {
        this.f24058J = str;
        return this;
    }

    public UntagResourceRequest w(Collection<String> collection) {
        t(collection);
        return this;
    }

    public UntagResourceRequest x(String... strArr) {
        if (r() == null) {
            this.f24059K = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f24059K.add(str);
        }
        return this;
    }
}
