package com.google.android.gms.auth.api.signin;

import K0.c;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.N;
import androidx.annotation.P;
import com.google.android.gms.common.C1297s;
import com.google.android.gms.common.api.C1164a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1240b;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.D;
import com.spotify.android.appremote.internal.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@c.a(creator = "GoogleSignInOptionsCreator")
/* loaded from: classes.dex */
public class GoogleSignInOptions extends K0.a implements C1164a.d.f, ReflectedParcelable {

    @N
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: P, reason: collision with root package name */
    @N
    public static final GoogleSignInOptions f27844P;

    /* renamed from: Q, reason: collision with root package name */
    @N
    public static final GoogleSignInOptions f27845Q;

    /* renamed from: R, reason: collision with root package name */
    @N
    @D
    public static final Scope f27846R = new Scope(C1297s.f28868a);

    /* renamed from: S, reason: collision with root package name */
    @N
    @D
    public static final Scope f27847S = new Scope("email");

    /* renamed from: T, reason: collision with root package name */
    @N
    @D
    public static final Scope f27848T = new Scope(C1297s.f28870c);

    /* renamed from: U, reason: collision with root package name */
    @N
    @D
    public static final Scope f27849U;

    /* renamed from: V, reason: collision with root package name */
    @N
    @D
    public static final Scope f27850V;

    /* renamed from: W, reason: collision with root package name */
    private static Comparator<Scope> f27851W;

    /* renamed from: E, reason: collision with root package name */
    @c.h(id = 1)
    final int f27852E;

    /* renamed from: F, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getScopes", id = 2)
    private final ArrayList<Scope> f27853F;

    /* renamed from: G, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getAccount", id = 3)
    private Account f27854G;

    /* renamed from: H, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "isIdTokenRequested", id = 4)
    private boolean f27855H;

    /* renamed from: I, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "isServerAuthCodeRequested", id = 5)
    private final boolean f27856I;

    /* renamed from: J, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "isForceCodeForRefreshToken", id = 6)
    private final boolean f27857J;

    /* renamed from: K, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getServerClientId", id = 7)
    private String f27858K;

    /* renamed from: L, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getHostedDomain", id = 8)
    private String f27859L;

    /* renamed from: M, reason: collision with root package name */
    @c.InterfaceC0014c(getter = "getExtensions", id = 9)
    private ArrayList<com.google.android.gms.auth.api.signin.internal.a> f27860M;

    /* renamed from: N, reason: collision with root package name */
    @P
    @c.InterfaceC0014c(getter = "getLogSessionId", id = 10)
    private String f27861N;

    /* renamed from: O, reason: collision with root package name */
    private Map<Integer, com.google.android.gms.auth.api.signin.internal.a> f27862O;

    static {
        Scope scope = new Scope(C1297s.f28876i);
        f27849U = scope;
        f27850V = new Scope(C1297s.f28875h);
        a aVar = new a();
        aVar.d();
        aVar.f();
        f27844P = aVar.b();
        a aVar2 = new a();
        aVar2.g(scope, new Scope[0]);
        f27845Q = aVar2.b();
        CREATOR = new f();
        f27851W = new d();
    }

    @P
    public static GoogleSignInOptions F0(@P String str) throws JSONException {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(l.f48824l);
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new Scope(jSONArray.getString(i4)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, C1240b.f28682a);
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z3 = jSONObject.getBoolean("idTokenRequested");
        boolean z4 = jSONObject.getBoolean("serverAuthRequested");
        boolean z5 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, (ArrayList<Scope>) arrayList, account, z3, z4, z5, str3, str4, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<Integer, com.google.android.gms.auth.api.signin.internal.a> n1(@P List<com.google.android.gms.auth.api.signin.internal.a> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (com.google.android.gms.auth.api.signin.internal.a aVar : list) {
            hashMap.put(Integer.valueOf(aVar.c0()), aVar);
        }
        return hashMap;
    }

    @I0.a
    public boolean B0() {
        return this.f27856I;
    }

    @I0.a
    @N
    public ArrayList<com.google.android.gms.auth.api.signin.internal.a> c0() {
        return this.f27860M;
    }

    @P
    @I0.a
    public String e0() {
        return this.f27861N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0048, code lost:
    
        if (r1.equals(r4.z()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@androidx.annotation.P java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.a> r1 = r3.f27860M     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 > 0) goto L90
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.a> r1 = r4.f27860M     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 <= 0) goto L18
            goto L90
        L18:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f27853F     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.u0()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.f27853F     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.u0()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f27854G     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.z()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f27858K     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.x0()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f27858K     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.x0()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f27857J     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.y0()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f27855H     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.z0()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f27856I     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.B0()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f27861N     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.e0()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @N
    public final String f1() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f27853F, f27851W);
            Iterator<Scope> it = this.f27853F.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().c0());
            }
            jSONObject.put(l.f48824l, jSONArray);
            Account account = this.f27854G;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f27855H);
            jSONObject.put("forceCodeForRefreshToken", this.f27857J);
            jSONObject.put("serverAuthRequested", this.f27856I);
            if (!TextUtils.isEmpty(this.f27858K)) {
                jSONObject.put("serverClientId", this.f27858K);
            }
            if (!TextUtils.isEmpty(this.f27859L)) {
                jSONObject.put("hostedDomain", this.f27859L);
            }
            return jSONObject.toString();
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f27853F;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(arrayList2.get(i4).c0());
        }
        Collections.sort(arrayList);
        com.google.android.gms.auth.api.signin.internal.b bVar = new com.google.android.gms.auth.api.signin.internal.b();
        bVar.a(arrayList);
        bVar.a(this.f27854G);
        bVar.a(this.f27858K);
        bVar.c(this.f27857J);
        bVar.c(this.f27855H);
        bVar.c(this.f27856I);
        bVar.a(this.f27861N);
        return bVar.b();
    }

    @N
    public Scope[] i0() {
        ArrayList<Scope> arrayList = this.f27853F;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    @I0.a
    @N
    public ArrayList<Scope> u0() {
        return new ArrayList<>(this.f27853F);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@N Parcel parcel, int i4) {
        int a4 = K0.b.a(parcel);
        K0.b.F(parcel, 1, this.f27852E);
        K0.b.d0(parcel, 2, u0(), false);
        K0.b.S(parcel, 3, z(), i4, false);
        K0.b.g(parcel, 4, z0());
        K0.b.g(parcel, 5, B0());
        K0.b.g(parcel, 6, y0());
        K0.b.Y(parcel, 7, x0(), false);
        K0.b.Y(parcel, 8, this.f27859L, false);
        K0.b.d0(parcel, 9, c0(), false);
        K0.b.Y(parcel, 10, e0(), false);
        K0.b.b(parcel, a4);
    }

    @P
    @I0.a
    public String x0() {
        return this.f27858K;
    }

    @I0.a
    public boolean y0() {
        return this.f27857J;
    }

    @P
    @I0.a
    public Account z() {
        return this.f27854G;
    }

    @I0.a
    public boolean z0() {
        return this.f27855H;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Set<Scope> f27863a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f27864b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f27865c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f27866d;

        /* renamed from: e, reason: collision with root package name */
        @P
        private String f27867e;

        /* renamed from: f, reason: collision with root package name */
        @P
        private Account f27868f;

        /* renamed from: g, reason: collision with root package name */
        @P
        private String f27869g;

        /* renamed from: h, reason: collision with root package name */
        private Map<Integer, com.google.android.gms.auth.api.signin.internal.a> f27870h;

        /* renamed from: i, reason: collision with root package name */
        @P
        private String f27871i;

        public a() {
            this.f27863a = new HashSet();
            this.f27870h = new HashMap();
        }

        private final String m(String str) {
            C1285y.h(str);
            String str2 = this.f27867e;
            boolean z3 = true;
            if (str2 != null && !str2.equals(str)) {
                z3 = false;
            }
            C1285y.b(z3, "two different server client ids provided");
            return str;
        }

        @N
        public a a(@N com.google.android.gms.auth.api.signin.a aVar) {
            if (!this.f27870h.containsKey(Integer.valueOf(aVar.a()))) {
                List<Scope> c4 = aVar.c();
                if (c4 != null) {
                    this.f27863a.addAll(c4);
                }
                this.f27870h.put(Integer.valueOf(aVar.a()), new com.google.android.gms.auth.api.signin.internal.a(aVar));
                return this;
            }
            throw new IllegalStateException("Only one extension per type may be added");
        }

        @N
        public GoogleSignInOptions b() {
            if (this.f27863a.contains(GoogleSignInOptions.f27850V)) {
                Set<Scope> set = this.f27863a;
                Scope scope = GoogleSignInOptions.f27849U;
                if (set.contains(scope)) {
                    this.f27863a.remove(scope);
                }
            }
            if (this.f27866d && (this.f27868f == null || !this.f27863a.isEmpty())) {
                d();
            }
            return new GoogleSignInOptions(new ArrayList(this.f27863a), this.f27868f, this.f27866d, this.f27864b, this.f27865c, this.f27867e, this.f27869g, this.f27870h, this.f27871i);
        }

        @N
        public a c() {
            this.f27863a.add(GoogleSignInOptions.f27847S);
            return this;
        }

        @N
        public a d() {
            this.f27863a.add(GoogleSignInOptions.f27848T);
            return this;
        }

        @N
        public a e(@N String str) {
            this.f27866d = true;
            m(str);
            this.f27867e = str;
            return this;
        }

        @N
        public a f() {
            this.f27863a.add(GoogleSignInOptions.f27846R);
            return this;
        }

        @N
        public a g(@N Scope scope, @N Scope... scopeArr) {
            this.f27863a.add(scope);
            this.f27863a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @N
        public a h(@N String str) {
            i(str, false);
            return this;
        }

        @N
        public a i(@N String str, boolean z3) {
            this.f27864b = true;
            m(str);
            this.f27867e = str;
            this.f27865c = z3;
            return this;
        }

        @N
        public a j(@N String str) {
            this.f27868f = new Account(C1285y.h(str), C1240b.f28682a);
            return this;
        }

        @N
        public a k(@N String str) {
            this.f27869g = C1285y.h(str);
            return this;
        }

        @I0.a
        @N
        public a l(@N String str) {
            this.f27871i = str;
            return this;
        }

        public a(@N GoogleSignInOptions googleSignInOptions) {
            this.f27863a = new HashSet();
            this.f27870h = new HashMap();
            C1285y.l(googleSignInOptions);
            this.f27863a = new HashSet(googleSignInOptions.f27853F);
            this.f27864b = googleSignInOptions.f27856I;
            this.f27865c = googleSignInOptions.f27857J;
            this.f27866d = googleSignInOptions.f27855H;
            this.f27867e = googleSignInOptions.f27858K;
            this.f27868f = googleSignInOptions.f27854G;
            this.f27869g = googleSignInOptions.f27859L;
            this.f27870h = GoogleSignInOptions.n1(googleSignInOptions.f27860M);
            this.f27871i = googleSignInOptions.f27861N;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @c.b
    public GoogleSignInOptions(@c.e(id = 1) int i4, @c.e(id = 2) ArrayList<Scope> arrayList, @c.e(id = 3) @P Account account, @c.e(id = 4) boolean z3, @c.e(id = 5) boolean z4, @c.e(id = 6) boolean z5, @c.e(id = 7) @P String str, @c.e(id = 8) @P String str2, @c.e(id = 9) ArrayList<com.google.android.gms.auth.api.signin.internal.a> arrayList2, @c.e(id = 10) @P String str3) {
        this(i4, arrayList, account, z3, z4, z5, str, str2, n1(arrayList2), str3);
    }

    private GoogleSignInOptions(int i4, ArrayList<Scope> arrayList, @P Account account, boolean z3, boolean z4, boolean z5, @P String str, @P String str2, Map<Integer, com.google.android.gms.auth.api.signin.internal.a> map, @P String str3) {
        this.f27852E = i4;
        this.f27853F = arrayList;
        this.f27854G = account;
        this.f27855H = z3;
        this.f27856I = z4;
        this.f27857J = z5;
        this.f27858K = str;
        this.f27859L = str2;
        this.f27860M = new ArrayList<>(map.values());
        this.f27862O = map;
        this.f27861N = str3;
    }
}
