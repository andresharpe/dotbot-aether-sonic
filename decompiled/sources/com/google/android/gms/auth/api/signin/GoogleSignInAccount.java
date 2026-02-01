package com.google.android.gms.auth.api.signin;

import K0.c;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1240b;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.D;
import com.google.android.gms.common.util.InterfaceC1306g;
import com.google.android.gms.common.util.k;
import com.spotify.sdk.android.auth.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@c.a(creator = "GoogleSignInAccountCreator")
/* loaded from: classes.dex */
public class GoogleSignInAccount extends K0.a implements ReflectedParcelable {

    @N
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* renamed from: R, reason: collision with root package name */
    @N
    @D
    public static InterfaceC1306g f27830R = k.e();

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f27831E;

    /* renamed from: F, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getId", id = 2)
    private String f27832F;

    /* renamed from: G, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getIdToken", id = 3)
    private String f27833G;

    /* renamed from: H, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getEmail", id = 4)
    private String f27834H;

    /* renamed from: I, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getDisplayName", id = 5)
    private String f27835I;

    /* renamed from: J, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getPhotoUrl", id = 6)
    private Uri f27836J;

    /* renamed from: K, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getServerAuthCode", id = 7)
    private String f27837K;

    /* renamed from: L, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getExpirationTimeSecs", id = 8)
    private long f27838L;

    /* renamed from: M, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getObfuscatedIdentifier", id = 9)
    private String f27839M;

    /* renamed from: N, reason: collision with root package name */
    @c.InterfaceC0014c(id = 10)
    List<Scope> f27840N;

    /* renamed from: O, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getGivenName", id = 11)
    private String f27841O;

    /* renamed from: P, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getFamilyName", id = 12)
    private String f27842P;

    /* renamed from: Q, reason: collision with root package name */
    private Set<Scope> f27843Q = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public GoogleSignInAccount(@c.e(id = 1) int i4, @c.e(id = 2) @P String str, @c.e(id = 3) @P String str2, @c.e(id = 4) @P String str3, @c.e(id = 5) @P String str4, @c.e(id = 6) @P Uri uri, @c.e(id = 7) @P String str5, @c.e(id = 8) long j4, @c.e(id = 9) String str6, @c.e(id = 10) List<Scope> list, @c.e(id = 11) @P String str7, @c.e(id = 12) @P String str8) {
        this.f27831E = i4;
        this.f27832F = str;
        this.f27833G = str2;
        this.f27834H = str3;
        this.f27835I = str4;
        this.f27836J = uri;
        this.f27837K = str5;
        this.f27838L = j4;
        this.f27839M = str6;
        this.f27840N = list;
        this.f27841O = str7;
        this.f27842P = str8;
    }

    @I0.a
    @N
    public static GoogleSignInAccount c0() {
        return l1(new Account("<<default account>>", C1240b.f28682a), new HashSet());
    }

    @I0.a
    @N
    public static GoogleSignInAccount e0(@N Account account) {
        return l1(account, new androidx.collection.c());
    }

    @N
    public static GoogleSignInAccount h1(@P String str, @P String str2, @P String str3, @P String str4, @P String str5, @P String str6, @P Uri uri, @P Long l4, @N String str7, @N Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l4.longValue(), C1285y.h(str7), new ArrayList((Collection) C1285y.l(set)), str5, str6);
    }

    @P
    public static GoogleSignInAccount i1(@P String str) throws JSONException {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new Scope(jSONArray.getString(i4)));
        }
        String optString2 = jSONObject.optString(b.c.f48986a);
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount h12 = h1(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        h12.f27837K = str7;
        return h12;
    }

    private static GoogleSignInAccount l1(Account account, Set<Scope> set) {
        return h1(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    @P
    public String B0() {
        return this.f27832F;
    }

    @P
    public String E0() {
        return this.f27833G;
    }

    @P
    public Uri F0() {
        return this.f27836J;
    }

    @I0.a
    @N
    public Set<Scope> M0() {
        HashSet hashSet = new HashSet(this.f27840N);
        hashSet.addAll(this.f27843Q);
        return hashSet;
    }

    @P
    public String Y0() {
        return this.f27837K;
    }

    @I0.a
    public boolean a1() {
        if (f27830R.a() / 1000 >= this.f27838L - 300) {
            return true;
        }
        return false;
    }

    public boolean equals(@P Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f27839M.equals(this.f27839M) || !googleSignInAccount.M0().equals(M0())) {
            return false;
        }
        return true;
    }

    @I0.a
    @N
    public GoogleSignInAccount f1(@N Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.f27843Q, scopeArr);
        }
        return this;
    }

    public int hashCode() {
        return ((this.f27839M.hashCode() + 527) * 31) + M0().hashCode();
    }

    @P
    public String i0() {
        return this.f27835I;
    }

    @N
    public final String j1() {
        return this.f27839M;
    }

    @N
    public final String k1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (B0() != null) {
                jSONObject.put(b.c.f48986a, B0());
            }
            if (E0() != null) {
                jSONObject.put("tokenId", E0());
            }
            if (u0() != null) {
                jSONObject.put("email", u0());
            }
            if (i0() != null) {
                jSONObject.put("displayName", i0());
            }
            if (y0() != null) {
                jSONObject.put("givenName", y0());
            }
            if (x0() != null) {
                jSONObject.put("familyName", x0());
            }
            Uri F02 = F0();
            if (F02 != null) {
                jSONObject.put("photoUrl", F02.toString());
            }
            if (Y0() != null) {
                jSONObject.put("serverAuthCode", Y0());
            }
            jSONObject.put("expirationTime", this.f27838L);
            jSONObject.put("obfuscatedIdentifier", this.f27839M);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f27840N;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: com.google.android.gms.auth.api.signin.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).c0().compareTo(((Scope) obj2).c0());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.c0());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    @P
    public String u0() {
        return this.f27834H;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f27831E);
        K0.b.Y(parcel, 2, B0(), false);
        K0.b.Y(parcel, 3, E0(), false);
        K0.b.Y(parcel, 4, u0(), false);
        K0.b.Y(parcel, 5, i0(), false);
        K0.b.S(parcel, 6, F0(), i4, false);
        K0.b.Y(parcel, 7, Y0(), false);
        K0.b.K(parcel, 8, this.f27838L);
        K0.b.Y(parcel, 9, this.f27839M, false);
        K0.b.d0(parcel, 10, this.f27840N, false);
        K0.b.Y(parcel, 11, y0(), false);
        K0.b.Y(parcel, 12, x0(), false);
        K0.b.b(parcel, a4);
    }

    @P
    public String x0() {
        return this.f27842P;
    }

    @P
    public String y0() {
        return this.f27841O;
    }

    @P
    public Account z() {
        String str = this.f27834H;
        if (str == null) {
            return null;
        }
        return new Account(str, C1240b.f28682a);
    }

    @N
    public Set<Scope> z0() {
        return new HashSet(this.f27840N);
    }
}
