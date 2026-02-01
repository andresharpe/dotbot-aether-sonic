package com.amazonaws.services.cognitoidentity.model;

import com.amazonaws.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CreateIdentityPoolRequest extends b implements Serializable {

    /* renamed from: J, reason: collision with root package name */
    private String f23929J;

    /* renamed from: K, reason: collision with root package name */
    private Boolean f23930K;

    /* renamed from: L, reason: collision with root package name */
    private Boolean f23931L;

    /* renamed from: M, reason: collision with root package name */
    private Map<String, String> f23932M;

    /* renamed from: N, reason: collision with root package name */
    private String f23933N;

    /* renamed from: O, reason: collision with root package name */
    private List<String> f23934O;

    /* renamed from: P, reason: collision with root package name */
    private List<CognitoIdentityProvider> f23935P;

    /* renamed from: Q, reason: collision with root package name */
    private List<String> f23936Q;

    /* renamed from: R, reason: collision with root package name */
    private Map<String, String> f23937R;

    public String A() {
        return this.f23929J;
    }

    public Map<String, String> B() {
        return this.f23937R;
    }

    public List<String> C() {
        return this.f23934O;
    }

    public List<String> D() {
        return this.f23936Q;
    }

    public Map<String, String> E() {
        return this.f23932M;
    }

    public Boolean F() {
        return this.f23931L;
    }

    public Boolean G() {
        return this.f23930K;
    }

    public void H(Boolean bool) {
        this.f23931L = bool;
    }

    public void I(Boolean bool) {
        this.f23930K = bool;
    }

    public void J(Collection<CognitoIdentityProvider> collection) {
        if (collection == null) {
            this.f23935P = null;
        } else {
            this.f23935P = new ArrayList(collection);
        }
    }

    public void K(String str) {
        this.f23933N = str;
    }

    public void L(String str) {
        this.f23929J = str;
    }

    public void M(Map<String, String> map) {
        this.f23937R = map;
    }

    public void N(Collection<String> collection) {
        if (collection == null) {
            this.f23934O = null;
        } else {
            this.f23934O = new ArrayList(collection);
        }
    }

    public void O(Collection<String> collection) {
        if (collection == null) {
            this.f23936Q = null;
        } else {
            this.f23936Q = new ArrayList(collection);
        }
    }

    public void P(Map<String, String> map) {
        this.f23932M = map;
    }

    public CreateIdentityPoolRequest Q(Boolean bool) {
        this.f23931L = bool;
        return this;
    }

    public CreateIdentityPoolRequest R(Boolean bool) {
        this.f23930K = bool;
        return this;
    }

    public CreateIdentityPoolRequest S(Collection<CognitoIdentityProvider> collection) {
        J(collection);
        return this;
    }

    public CreateIdentityPoolRequest T(CognitoIdentityProvider... cognitoIdentityProviderArr) {
        if (x() == null) {
            this.f23935P = new ArrayList(cognitoIdentityProviderArr.length);
        }
        for (CognitoIdentityProvider cognitoIdentityProvider : cognitoIdentityProviderArr) {
            this.f23935P.add(cognitoIdentityProvider);
        }
        return this;
    }

    public CreateIdentityPoolRequest U(String str) {
        this.f23933N = str;
        return this;
    }

    public CreateIdentityPoolRequest V(String str) {
        this.f23929J = str;
        return this;
    }

    public CreateIdentityPoolRequest W(Map<String, String> map) {
        this.f23937R = map;
        return this;
    }

    public CreateIdentityPoolRequest X(Collection<String> collection) {
        N(collection);
        return this;
    }

    public CreateIdentityPoolRequest Y(String... strArr) {
        if (C() == null) {
            this.f23934O = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f23934O.add(str);
        }
        return this;
    }

    public CreateIdentityPoolRequest Z(Collection<String> collection) {
        O(collection);
        return this;
    }

    public CreateIdentityPoolRequest a0(String... strArr) {
        if (D() == null) {
            this.f23936Q = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f23936Q.add(str);
        }
        return this;
    }

    public CreateIdentityPoolRequest b0(Map<String, String> map) {
        this.f23932M = map;
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
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateIdentityPoolRequest)) {
            return false;
        }
        CreateIdentityPoolRequest createIdentityPoolRequest = (CreateIdentityPoolRequest) obj;
        if (createIdentityPoolRequest.A() == null) {
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
        if (createIdentityPoolRequest.A() != null && !createIdentityPoolRequest.A().equals(A())) {
            return false;
        }
        if (createIdentityPoolRequest.w() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (w() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (createIdentityPoolRequest.w() != null && !createIdentityPoolRequest.w().equals(w())) {
            return false;
        }
        if (createIdentityPoolRequest.u() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (u() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (createIdentityPoolRequest.u() != null && !createIdentityPoolRequest.u().equals(u())) {
            return false;
        }
        if (createIdentityPoolRequest.E() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (E() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (createIdentityPoolRequest.E() != null && !createIdentityPoolRequest.E().equals(E())) {
            return false;
        }
        if (createIdentityPoolRequest.y() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (y() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 ^ z12) {
            return false;
        }
        if (createIdentityPoolRequest.y() != null && !createIdentityPoolRequest.y().equals(y())) {
            return false;
        }
        if (createIdentityPoolRequest.C() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (C() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 ^ z14) {
            return false;
        }
        if (createIdentityPoolRequest.C() != null && !createIdentityPoolRequest.C().equals(C())) {
            return false;
        }
        if (createIdentityPoolRequest.x() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (x() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z15 ^ z16) {
            return false;
        }
        if (createIdentityPoolRequest.x() != null && !createIdentityPoolRequest.x().equals(x())) {
            return false;
        }
        if (createIdentityPoolRequest.D() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (D() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z17 ^ z18) {
            return false;
        }
        if (createIdentityPoolRequest.D() != null && !createIdentityPoolRequest.D().equals(D())) {
            return false;
        }
        if (createIdentityPoolRequest.B() == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (B() == null) {
            z20 = true;
        } else {
            z20 = false;
        }
        if (z19 ^ z20) {
            return false;
        }
        if (createIdentityPoolRequest.B() == null || createIdentityPoolRequest.B().equals(B())) {
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
        int i4 = 0;
        if (A() == null) {
            hashCode = 0;
        } else {
            hashCode = A().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (w() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = w().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (u() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = u().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (E() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = E().hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        if (y() == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = y().hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        if (C() == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = C().hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        if (x() == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = x().hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        if (D() == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = D().hashCode();
        }
        int i12 = (i11 + hashCode8) * 31;
        if (B() != null) {
            i4 = B().hashCode();
        }
        return i12 + i4;
    }

    public CreateIdentityPoolRequest q(String str, String str2) {
        if (this.f23937R == null) {
            this.f23937R = new HashMap();
        }
        if (!this.f23937R.containsKey(str)) {
            this.f23937R.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public CreateIdentityPoolRequest r(String str, String str2) {
        if (this.f23932M == null) {
            this.f23932M = new HashMap();
        }
        if (!this.f23932M.containsKey(str)) {
            this.f23932M.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public CreateIdentityPoolRequest s() {
        this.f23937R = null;
        return this;
    }

    public CreateIdentityPoolRequest t() {
        this.f23932M = null;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (A() != null) {
            sb.append("IdentityPoolName: " + A() + ",");
        }
        if (w() != null) {
            sb.append("AllowUnauthenticatedIdentities: " + w() + ",");
        }
        if (u() != null) {
            sb.append("AllowClassicFlow: " + u() + ",");
        }
        if (E() != null) {
            sb.append("SupportedLoginProviders: " + E() + ",");
        }
        if (y() != null) {
            sb.append("DeveloperProviderName: " + y() + ",");
        }
        if (C() != null) {
            sb.append("OpenIdConnectProviderARNs: " + C() + ",");
        }
        if (x() != null) {
            sb.append("CognitoIdentityProviders: " + x() + ",");
        }
        if (D() != null) {
            sb.append("SamlProviderARNs: " + D() + ",");
        }
        if (B() != null) {
            sb.append("IdentityPoolTags: " + B());
        }
        sb.append("}");
        return sb.toString();
    }

    public Boolean u() {
        return this.f23931L;
    }

    public Boolean w() {
        return this.f23930K;
    }

    public List<CognitoIdentityProvider> x() {
        return this.f23935P;
    }

    public String y() {
        return this.f23933N;
    }
}
