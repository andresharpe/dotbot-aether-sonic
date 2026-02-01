package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;

/* loaded from: classes.dex */
public class MergeDeveloperIdentitiesRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24031J;

    /* renamed from: K, reason: collision with root package name */
    private String f24032K;

    /* renamed from: L, reason: collision with root package name */
    private String f24033L;

    /* renamed from: M, reason: collision with root package name */
    private String f24034M;

    public MergeDeveloperIdentitiesRequest A(String str) {
        this.f24032K = str;
        return this;
    }

    public MergeDeveloperIdentitiesRequest B(String str) {
        this.f24033L = str;
        return this;
    }

    public MergeDeveloperIdentitiesRequest C(String str) {
        this.f24034M = str;
        return this;
    }

    public MergeDeveloperIdentitiesRequest D(String str) {
        this.f24031J = str;
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
        if (obj == null || !(obj instanceof MergeDeveloperIdentitiesRequest)) {
            return false;
        }
        MergeDeveloperIdentitiesRequest mergeDeveloperIdentitiesRequest = (MergeDeveloperIdentitiesRequest) obj;
        if (mergeDeveloperIdentitiesRequest.t() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (t() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.t() != null && !mergeDeveloperIdentitiesRequest.t().equals(t())) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.q() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (q() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.q() != null && !mergeDeveloperIdentitiesRequest.q().equals(q())) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.r() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (r() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.r() != null && !mergeDeveloperIdentitiesRequest.r().equals(r())) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.s() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (s() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (mergeDeveloperIdentitiesRequest.s() == null || mergeDeveloperIdentitiesRequest.s().equals(s())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i4 = 0;
        if (t() == null) {
            hashCode = 0;
        } else {
            hashCode = t().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (q() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = q().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (r() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (s() != null) {
            i4 = s().hashCode();
        }
        return i7 + i4;
    }

    public String q() {
        return this.f24032K;
    }

    public String r() {
        return this.f24033L;
    }

    public String s() {
        return this.f24034M;
    }

    public String t() {
        return this.f24031J;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (t() != null) {
            sb.append("SourceUserIdentifier: " + t() + ",");
        }
        if (q() != null) {
            sb.append("DestinationUserIdentifier: " + q() + ",");
        }
        if (r() != null) {
            sb.append("DeveloperProviderName: " + r() + ",");
        }
        if (s() != null) {
            sb.append("IdentityPoolId: " + s());
        }
        sb.append("}");
        return sb.toString();
    }

    public void u(String str) {
        this.f24032K = str;
    }

    public void w(String str) {
        this.f24033L = str;
    }

    public void x(String str) {
        this.f24034M = str;
    }

    public void y(String str) {
        this.f24031J = str;
    }
}
