package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class DeleteIdentitiesResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private List<UnprocessedIdentityId> f23953E;

    public List<UnprocessedIdentityId> a() {
        return this.f23953E;
    }

    public void b(Collection<UnprocessedIdentityId> collection) {
        if (collection == null) {
            this.f23953E = null;
        } else {
            this.f23953E = new ArrayList(collection);
        }
    }

    public DeleteIdentitiesResult c(Collection<UnprocessedIdentityId> collection) {
        b(collection);
        return this;
    }

    public DeleteIdentitiesResult d(UnprocessedIdentityId... unprocessedIdentityIdArr) {
        if (a() == null) {
            this.f23953E = new ArrayList(unprocessedIdentityIdArr.length);
        }
        for (UnprocessedIdentityId unprocessedIdentityId : unprocessedIdentityIdArr) {
            this.f23953E.add(unprocessedIdentityId);
        }
        return this;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteIdentitiesResult)) {
            return false;
        }
        DeleteIdentitiesResult deleteIdentitiesResult = (DeleteIdentitiesResult) obj;
        if (deleteIdentitiesResult.a() == null) {
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
        if (deleteIdentitiesResult.a() == null || deleteIdentitiesResult.a().equals(a())) {
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
            sb.append("UnprocessedIdentityIds: " + a());
        }
        sb.append("}");
        return sb.toString();
    }
}
