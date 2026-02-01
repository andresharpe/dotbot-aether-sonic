package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ListTagsForResourceResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private Map<String, String> f24018E;

    public ListTagsForResourceResult a(String str, String str2) {
        if (this.f24018E == null) {
            this.f24018E = new HashMap();
        }
        if (!this.f24018E.containsKey(str)) {
            this.f24018E.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public ListTagsForResourceResult b() {
        this.f24018E = null;
        return this;
    }

    public Map<String, String> c() {
        return this.f24018E;
    }

    public void d(Map<String, String> map) {
        this.f24018E = map;
    }

    public ListTagsForResourceResult e(Map<String, String> map) {
        this.f24018E = map;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTagsForResourceResult)) {
            return false;
        }
        ListTagsForResourceResult listTagsForResourceResult = (ListTagsForResourceResult) obj;
        if (listTagsForResourceResult.c() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (listTagsForResourceResult.c() == null || listTagsForResourceResult.c().equals(c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        if (c() == null) {
            hashCode = 0;
        } else {
            hashCode = c().hashCode();
        }
        return 31 + hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (c() != null) {
            sb.append("Tags: " + c());
        }
        sb.append("}");
        return sb.toString();
    }
}
