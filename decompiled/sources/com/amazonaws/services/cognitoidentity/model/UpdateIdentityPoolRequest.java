package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class UpdateIdentityPoolRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f24060J;

    /* renamed from: K, reason: collision with root package name */
    private String f24061K;

    /* renamed from: L, reason: collision with root package name */
    private Boolean f24062L;

    /* renamed from: M, reason: collision with root package name */
    private Boolean f24063M;

    /* renamed from: N, reason: collision with root package name */
    private Map<String, String> f24064N;

    /* renamed from: O, reason: collision with root package name */
    private String f24065O;

    /* renamed from: P, reason: collision with root package name */
    private List<String> f24066P;

    /* renamed from: Q, reason: collision with root package name */
    private List<CognitoIdentityProvider> f24067Q;

    /* renamed from: R, reason: collision with root package name */
    private List<String> f24068R;

    /* renamed from: S, reason: collision with root package name */
    private Map<String, String> f24069S;

    public String A() {
        return this.f24060J;
    }

    public String B() {
        return this.f24061K;
    }

    public Map<String, String> C() {
        return this.f24069S;
    }

    public List<String> D() {
        return this.f24066P;
    }

    public List<String> E() {
        return this.f24068R;
    }

    public Map<String, String> F() {
        return this.f24064N;
    }

    public Boolean G() {
        return this.f24063M;
    }

    public Boolean H() {
        return this.f24062L;
    }

    public void I(Boolean bool) {
        this.f24063M = bool;
    }

    public void J(Boolean bool) {
        this.f24062L = bool;
    }

    public void K(Collection<CognitoIdentityProvider> collection) {
        if (collection == null) {
            this.f24067Q = null;
        } else {
            this.f24067Q = new ArrayList(collection);
        }
    }

    public void L(String str) {
        this.f24065O = str;
    }

    public void M(String str) {
        this.f24060J = str;
    }

    public void N(String str) {
        this.f24061K = str;
    }

    public void O(Map<String, String> map) {
        this.f24069S = map;
    }

    public void P(Collection<String> collection) {
        if (collection == null) {
            this.f24066P = null;
        } else {
            this.f24066P = new ArrayList(collection);
        }
    }

    public void Q(Collection<String> collection) {
        if (collection == null) {
            this.f24068R = null;
        } else {
            this.f24068R = new ArrayList(collection);
        }
    }

    public void R(Map<String, String> map) {
        this.f24064N = map;
    }

    public UpdateIdentityPoolRequest S(Boolean bool) {
        this.f24063M = bool;
        return this;
    }

    public UpdateIdentityPoolRequest T(Boolean bool) {
        this.f24062L = bool;
        return this;
    }

    public UpdateIdentityPoolRequest U(Collection<CognitoIdentityProvider> collection) {
        K(collection);
        return this;
    }

    public UpdateIdentityPoolRequest V(CognitoIdentityProvider... cognitoIdentityProviderArr) {
        if (x() == null) {
            this.f24067Q = new ArrayList(cognitoIdentityProviderArr.length);
        }
        for (CognitoIdentityProvider cognitoIdentityProvider : cognitoIdentityProviderArr) {
            this.f24067Q.add(cognitoIdentityProvider);
        }
        return this;
    }

    public UpdateIdentityPoolRequest W(String str) {
        this.f24065O = str;
        return this;
    }

    public UpdateIdentityPoolRequest X(String str) {
        this.f24060J = str;
        return this;
    }

    public UpdateIdentityPoolRequest Y(String str) {
        this.f24061K = str;
        return this;
    }

    public UpdateIdentityPoolRequest Z(Map<String, String> map) {
        this.f24069S = map;
        return this;
    }

    public UpdateIdentityPoolRequest a0(Collection<String> collection) {
        P(collection);
        return this;
    }

    public UpdateIdentityPoolRequest b0(String... strArr) {
        if (D() == null) {
            this.f24066P = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f24066P.add(str);
        }
        return this;
    }

    public UpdateIdentityPoolRequest c0(Collection<String> collection) {
        Q(collection);
        return this;
    }

    public UpdateIdentityPoolRequest d0(String... strArr) {
        if (E() == null) {
            this.f24068R = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f24068R.add(str);
        }
        return this;
    }

    public UpdateIdentityPoolRequest e0(Map<String, String> map) {
        this.f24064N = map;
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
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateIdentityPoolRequest)) {
            return false;
        }
        UpdateIdentityPoolRequest updateIdentityPoolRequest = (UpdateIdentityPoolRequest) obj;
        if (updateIdentityPoolRequest.A() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (A() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (updateIdentityPoolRequest.A() != null && !updateIdentityPoolRequest.A().equals(A())) {
            return false;
        }
        if (updateIdentityPoolRequest.B() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (B() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (updateIdentityPoolRequest.B() != null && !updateIdentityPoolRequest.B().equals(B())) {
            return false;
        }
        if (updateIdentityPoolRequest.w() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (w() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (updateIdentityPoolRequest.w() != null && !updateIdentityPoolRequest.w().equals(w())) {
            return false;
        }
        if (updateIdentityPoolRequest.u() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (u() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (updateIdentityPoolRequest.u() != null && !updateIdentityPoolRequest.u().equals(u())) {
            return false;
        }
        if (updateIdentityPoolRequest.F() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (F() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 ^ z12) {
            return false;
        }
        if (updateIdentityPoolRequest.F() != null && !updateIdentityPoolRequest.F().equals(F())) {
            return false;
        }
        if (updateIdentityPoolRequest.y() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (y() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 ^ z14) {
            return false;
        }
        if (updateIdentityPoolRequest.y() != null && !updateIdentityPoolRequest.y().equals(y())) {
            return false;
        }
        if (updateIdentityPoolRequest.D() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (D() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z15 ^ z16) {
            return false;
        }
        if (updateIdentityPoolRequest.D() != null && !updateIdentityPoolRequest.D().equals(D())) {
            return false;
        }
        if (updateIdentityPoolRequest.x() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (x() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z17 ^ z18) {
            return false;
        }
        if (updateIdentityPoolRequest.x() != null && !updateIdentityPoolRequest.x().equals(x())) {
            return false;
        }
        if (updateIdentityPoolRequest.E() == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (E() == null) {
            z20 = true;
        } else {
            z20 = false;
        }
        if (z19 ^ z20) {
            return false;
        }
        if (updateIdentityPoolRequest.E() != null && !updateIdentityPoolRequest.E().equals(E())) {
            return false;
        }
        if (updateIdentityPoolRequest.C() == null) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (C() == null) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (z21 ^ z22) {
            return false;
        }
        if (updateIdentityPoolRequest.C() == null || updateIdentityPoolRequest.C().equals(C())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int i4 = 0;
        if (A() == null) {
            hashCode = 0;
        } else {
            hashCode = A().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (B() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = B().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (w() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = w().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (u() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = u().hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        if (F() == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = F().hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        if (y() == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = y().hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        if (D() == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = D().hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        if (x() == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = x().hashCode();
        }
        int i12 = (i11 + hashCode8) * 31;
        if (E() == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = E().hashCode();
        }
        int i13 = (i12 + hashCode9) * 31;
        if (C() != null) {
            i4 = C().hashCode();
        }
        return i13 + i4;
    }

    public UpdateIdentityPoolRequest q(String str, String str2) {
        if (this.f24069S == null) {
            this.f24069S = new HashMap();
        }
        if (!this.f24069S.containsKey(str)) {
            this.f24069S.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public UpdateIdentityPoolRequest r(String str, String str2) {
        if (this.f24064N == null) {
            this.f24064N = new HashMap();
        }
        if (!this.f24064N.containsKey(str)) {
            this.f24064N.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public UpdateIdentityPoolRequest s() {
        this.f24069S = null;
        return this;
    }

    public UpdateIdentityPoolRequest t() {
        this.f24064N = null;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (A() != null) {
            sb.append("IdentityPoolId: " + A() + ",");
        }
        if (B() != null) {
            sb.append("IdentityPoolName: " + B() + ",");
        }
        if (w() != null) {
            sb.append("AllowUnauthenticatedIdentities: " + w() + ",");
        }
        if (u() != null) {
            sb.append("AllowClassicFlow: " + u() + ",");
        }
        if (F() != null) {
            sb.append("SupportedLoginProviders: " + F() + ",");
        }
        if (y() != null) {
            sb.append("DeveloperProviderName: " + y() + ",");
        }
        if (D() != null) {
            sb.append("OpenIdConnectProviderARNs: " + D() + ",");
        }
        if (x() != null) {
            sb.append("CognitoIdentityProviders: " + x() + ",");
        }
        if (E() != null) {
            sb.append("SamlProviderARNs: " + E() + ",");
        }
        if (C() != null) {
            sb.append("IdentityPoolTags: " + C());
        }
        sb.append("}");
        return sb.toString();
    }

    public Boolean u() {
        return this.f24063M;
    }

    public Boolean w() {
        return this.f24062L;
    }

    public List<CognitoIdentityProvider> x() {
        return this.f24067Q;
    }

    public String y() {
        return this.f24065O;
    }
}
