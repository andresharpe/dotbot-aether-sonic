package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class UpdateIdentityPoolResult implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private String f24070E;

    /* renamed from: F, reason: collision with root package name */
    private String f24071F;

    /* renamed from: G, reason: collision with root package name */
    private Boolean f24072G;

    /* renamed from: H, reason: collision with root package name */
    private Boolean f24073H;

    /* renamed from: I, reason: collision with root package name */
    private Map<String, String> f24074I;

    /* renamed from: J, reason: collision with root package name */
    private String f24075J;

    /* renamed from: K, reason: collision with root package name */
    private List<String> f24076K;

    /* renamed from: L, reason: collision with root package name */
    private List<CognitoIdentityProvider> f24077L;

    /* renamed from: M, reason: collision with root package name */
    private List<String> f24078M;

    /* renamed from: N, reason: collision with root package name */
    private Map<String, String> f24079N;

    public UpdateIdentityPoolResult A(Boolean bool) {
        this.f24073H = bool;
        return this;
    }

    public UpdateIdentityPoolResult B(Boolean bool) {
        this.f24072G = bool;
        return this;
    }

    public UpdateIdentityPoolResult C(Collection<CognitoIdentityProvider> collection) {
        s(collection);
        return this;
    }

    public UpdateIdentityPoolResult D(CognitoIdentityProvider... cognitoIdentityProviderArr) {
        if (g() == null) {
            this.f24077L = new ArrayList(cognitoIdentityProviderArr.length);
        }
        for (CognitoIdentityProvider cognitoIdentityProvider : cognitoIdentityProviderArr) {
            this.f24077L.add(cognitoIdentityProvider);
        }
        return this;
    }

    public UpdateIdentityPoolResult E(String str) {
        this.f24075J = str;
        return this;
    }

    public UpdateIdentityPoolResult F(String str) {
        this.f24070E = str;
        return this;
    }

    public UpdateIdentityPoolResult G(String str) {
        this.f24071F = str;
        return this;
    }

    public UpdateIdentityPoolResult H(Map<String, String> map) {
        this.f24079N = map;
        return this;
    }

    public UpdateIdentityPoolResult I(Collection<String> collection) {
        x(collection);
        return this;
    }

    public UpdateIdentityPoolResult J(String... strArr) {
        if (l() == null) {
            this.f24076K = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f24076K.add(str);
        }
        return this;
    }

    public UpdateIdentityPoolResult K(Collection<String> collection) {
        y(collection);
        return this;
    }

    public UpdateIdentityPoolResult L(String... strArr) {
        if (m() == null) {
            this.f24078M = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.f24078M.add(str);
        }
        return this;
    }

    public UpdateIdentityPoolResult M(Map<String, String> map) {
        this.f24074I = map;
        return this;
    }

    public UpdateIdentityPoolResult a(String str, String str2) {
        if (this.f24079N == null) {
            this.f24079N = new HashMap();
        }
        if (!this.f24079N.containsKey(str)) {
            this.f24079N.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public UpdateIdentityPoolResult b(String str, String str2) {
        if (this.f24074I == null) {
            this.f24074I = new HashMap();
        }
        if (!this.f24074I.containsKey(str)) {
            this.f24074I.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public UpdateIdentityPoolResult c() {
        this.f24079N = null;
        return this;
    }

    public UpdateIdentityPoolResult d() {
        this.f24074I = null;
        return this;
    }

    public Boolean e() {
        return this.f24073H;
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
        if (obj == null || !(obj instanceof UpdateIdentityPoolResult)) {
            return false;
        }
        UpdateIdentityPoolResult updateIdentityPoolResult = (UpdateIdentityPoolResult) obj;
        if (updateIdentityPoolResult.i() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (updateIdentityPoolResult.i() != null && !updateIdentityPoolResult.i().equals(i())) {
            return false;
        }
        if (updateIdentityPoolResult.j() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (j() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (updateIdentityPoolResult.j() != null && !updateIdentityPoolResult.j().equals(j())) {
            return false;
        }
        if (updateIdentityPoolResult.f() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (f() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (updateIdentityPoolResult.f() != null && !updateIdentityPoolResult.f().equals(f())) {
            return false;
        }
        if (updateIdentityPoolResult.e() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (e() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 ^ z10) {
            return false;
        }
        if (updateIdentityPoolResult.e() != null && !updateIdentityPoolResult.e().equals(e())) {
            return false;
        }
        if (updateIdentityPoolResult.n() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (n() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 ^ z12) {
            return false;
        }
        if (updateIdentityPoolResult.n() != null && !updateIdentityPoolResult.n().equals(n())) {
            return false;
        }
        if (updateIdentityPoolResult.h() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (h() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z13 ^ z14) {
            return false;
        }
        if (updateIdentityPoolResult.h() != null && !updateIdentityPoolResult.h().equals(h())) {
            return false;
        }
        if (updateIdentityPoolResult.l() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (l() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z15 ^ z16) {
            return false;
        }
        if (updateIdentityPoolResult.l() != null && !updateIdentityPoolResult.l().equals(l())) {
            return false;
        }
        if (updateIdentityPoolResult.g() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (g() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (z17 ^ z18) {
            return false;
        }
        if (updateIdentityPoolResult.g() != null && !updateIdentityPoolResult.g().equals(g())) {
            return false;
        }
        if (updateIdentityPoolResult.m() == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (m() == null) {
            z20 = true;
        } else {
            z20 = false;
        }
        if (z19 ^ z20) {
            return false;
        }
        if (updateIdentityPoolResult.m() != null && !updateIdentityPoolResult.m().equals(m())) {
            return false;
        }
        if (updateIdentityPoolResult.k() == null) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (k() == null) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (z21 ^ z22) {
            return false;
        }
        if (updateIdentityPoolResult.k() == null || updateIdentityPoolResult.k().equals(k())) {
            return true;
        }
        return false;
    }

    public Boolean f() {
        return this.f24072G;
    }

    public List<CognitoIdentityProvider> g() {
        return this.f24077L;
    }

    public String h() {
        return this.f24075J;
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
        if (i() == null) {
            hashCode = 0;
        } else {
            hashCode = i().hashCode();
        }
        int i5 = (hashCode + 31) * 31;
        if (j() == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = j().hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        if (f() == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = f().hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        if (e() == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = e().hashCode();
        }
        int i8 = (i7 + hashCode4) * 31;
        if (n() == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = n().hashCode();
        }
        int i9 = (i8 + hashCode5) * 31;
        if (h() == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = h().hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        if (l() == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l().hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        if (g() == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = g().hashCode();
        }
        int i12 = (i11 + hashCode8) * 31;
        if (m() == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = m().hashCode();
        }
        int i13 = (i12 + hashCode9) * 31;
        if (k() != null) {
            i4 = k().hashCode();
        }
        return i13 + i4;
    }

    public String i() {
        return this.f24070E;
    }

    public String j() {
        return this.f24071F;
    }

    public Map<String, String> k() {
        return this.f24079N;
    }

    public List<String> l() {
        return this.f24076K;
    }

    public List<String> m() {
        return this.f24078M;
    }

    public Map<String, String> n() {
        return this.f24074I;
    }

    public Boolean o() {
        return this.f24073H;
    }

    public Boolean p() {
        return this.f24072G;
    }

    public void q(Boolean bool) {
        this.f24073H = bool;
    }

    public void r(Boolean bool) {
        this.f24072G = bool;
    }

    public void s(Collection<CognitoIdentityProvider> collection) {
        if (collection == null) {
            this.f24077L = null;
        } else {
            this.f24077L = new ArrayList(collection);
        }
    }

    public void t(String str) {
        this.f24075J = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (i() != null) {
            sb.append("IdentityPoolId: " + i() + ",");
        }
        if (j() != null) {
            sb.append("IdentityPoolName: " + j() + ",");
        }
        if (f() != null) {
            sb.append("AllowUnauthenticatedIdentities: " + f() + ",");
        }
        if (e() != null) {
            sb.append("AllowClassicFlow: " + e() + ",");
        }
        if (n() != null) {
            sb.append("SupportedLoginProviders: " + n() + ",");
        }
        if (h() != null) {
            sb.append("DeveloperProviderName: " + h() + ",");
        }
        if (l() != null) {
            sb.append("OpenIdConnectProviderARNs: " + l() + ",");
        }
        if (g() != null) {
            sb.append("CognitoIdentityProviders: " + g() + ",");
        }
        if (m() != null) {
            sb.append("SamlProviderARNs: " + m() + ",");
        }
        if (k() != null) {
            sb.append("IdentityPoolTags: " + k());
        }
        sb.append("}");
        return sb.toString();
    }

    public void u(String str) {
        this.f24070E = str;
    }

    public void v(String str) {
        this.f24071F = str;
    }

    public void w(Map<String, String> map) {
        this.f24079N = map;
    }

    public void x(Collection<String> collection) {
        if (collection == null) {
            this.f24076K = null;
        } else {
            this.f24076K = new ArrayList(collection);
        }
    }

    public void y(Collection<String> collection) {
        if (collection == null) {
            this.f24078M = null;
        } else {
            this.f24078M = new ArrayList(collection);
        }
    }

    public void z(Map<String, String> map) {
        this.f24074I = map;
    }
}
