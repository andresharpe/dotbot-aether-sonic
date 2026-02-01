package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class DeleteIdentitiesRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private List<String> f23952J;

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteIdentitiesRequest)) {
            return false;
        }
        DeleteIdentitiesRequest deleteIdentitiesRequest = (DeleteIdentitiesRequest) obj;
        if (deleteIdentitiesRequest.q() == null) {
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
        if (deleteIdentitiesRequest.q() == null || deleteIdentitiesRequest.q().equals(q())) {
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

    public List<String> q() {
        return this.f23952J;
    }

    public void r(Collection<String> collection) {
        if (collection == null) {
            this.f23952J = null;
        } else {
            this.f23952J = new ArrayList(collection);
        }
    }

    public DeleteIdentitiesRequest s(Collection<String> collection) {
        r(collection);
        return this;
    }

    public DeleteIdentitiesRequest t(String... strArr) {
        if (q() == null) {
            this.f23952J = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f23952J.add(str);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (q() != null) {
            sb.append("IdentityIdsToDelete: " + q());
        }
        sb.append("}");
        return sb.toString();
    }
}
