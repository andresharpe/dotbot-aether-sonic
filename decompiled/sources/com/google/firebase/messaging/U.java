package com.google.firebase.messaging;

import K0.c;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.C1821f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

@c.a(creator = "RemoteMessageCreator")
@c.g({1})
/* loaded from: classes2.dex */
public final class U extends K0.a {
    public static final Parcelable.Creator<U> CREATOR = new V();

    /* renamed from: H, reason: collision with root package name */
    public static final int f36784H = 0;

    /* renamed from: I, reason: collision with root package name */
    public static final int f36785I = 1;

    /* renamed from: J, reason: collision with root package name */
    public static final int f36786J = 2;

    /* renamed from: E, reason: collision with root package name */
    @c.InterfaceC0014c(id = 2)
    Bundle f36787E;

    /* renamed from: F, reason: collision with root package name */
    private Map<String, String> f36788F;

    /* renamed from: G, reason: collision with root package name */
    private d f36789G;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f36790a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<String, String> f36791b;

        public b(@androidx.annotation.N String str) {
            Bundle bundle = new Bundle();
            this.f36790a = bundle;
            this.f36791b = new androidx.collection.a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(C1821f.d.f36974g, str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        @androidx.annotation.N
        public b a(@androidx.annotation.N String str, @androidx.annotation.P String str2) {
            this.f36791b.put(str, str2);
            return this;
        }

        @androidx.annotation.N
        public U b() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f36791b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f36790a);
            this.f36790a.remove("from");
            return new U(bundle);
        }

        @androidx.annotation.N
        public b c() {
            this.f36791b.clear();
            return this;
        }

        @androidx.annotation.P
        public String d() {
            return this.f36790a.getString(C1821f.d.f36971d);
        }

        @androidx.annotation.N
        public Map<String, String> e() {
            return this.f36791b;
        }

        @androidx.annotation.N
        public String f() {
            return this.f36790a.getString(C1821f.d.f36975h, "");
        }

        @androidx.annotation.P
        public String g() {
            return this.f36790a.getString(C1821f.d.f36971d);
        }

        @androidx.annotation.F(from = 0, to = 86400)
        public int h() {
            return Integer.parseInt(this.f36790a.getString(C1821f.d.f36971d, com.harman.jbl.partybox.ui.effectlab.a.f43472q));
        }

        @androidx.annotation.N
        public b i(@androidx.annotation.P String str) {
            this.f36790a.putString(C1821f.d.f36972e, str);
            return this;
        }

        @androidx.annotation.N
        public b j(@androidx.annotation.N Map<String, String> map) {
            this.f36791b.clear();
            this.f36791b.putAll(map);
            return this;
        }

        @androidx.annotation.N
        public b k(@androidx.annotation.N String str) {
            this.f36790a.putString(C1821f.d.f36975h, str);
            return this;
        }

        @androidx.annotation.N
        public b l(@androidx.annotation.P String str) {
            this.f36790a.putString(C1821f.d.f36971d, str);
            return this;
        }

        @com.google.android.gms.common.internal.D
        @androidx.annotation.N
        public b m(byte[] bArr) {
            this.f36790a.putByteArray(C1821f.d.f36970c, bArr);
            return this;
        }

        @androidx.annotation.N
        public b n(@androidx.annotation.F(from = 0, to = 86400) int i4) {
            this.f36790a.putString(C1821f.d.f36976i, String.valueOf(i4));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface c {
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f36792a;

        /* renamed from: b, reason: collision with root package name */
        private final String f36793b;

        /* renamed from: c, reason: collision with root package name */
        private final String[] f36794c;

        /* renamed from: d, reason: collision with root package name */
        private final String f36795d;

        /* renamed from: e, reason: collision with root package name */
        private final String f36796e;

        /* renamed from: f, reason: collision with root package name */
        private final String[] f36797f;

        /* renamed from: g, reason: collision with root package name */
        private final String f36798g;

        /* renamed from: h, reason: collision with root package name */
        private final String f36799h;

        /* renamed from: i, reason: collision with root package name */
        private final String f36800i;

        /* renamed from: j, reason: collision with root package name */
        private final String f36801j;

        /* renamed from: k, reason: collision with root package name */
        private final String f36802k;

        /* renamed from: l, reason: collision with root package name */
        private final String f36803l;

        /* renamed from: m, reason: collision with root package name */
        private final String f36804m;

        /* renamed from: n, reason: collision with root package name */
        private final Uri f36805n;

        /* renamed from: o, reason: collision with root package name */
        private final String f36806o;

        /* renamed from: p, reason: collision with root package name */
        private final Integer f36807p;

        /* renamed from: q, reason: collision with root package name */
        private final Integer f36808q;

        /* renamed from: r, reason: collision with root package name */
        private final Integer f36809r;

        /* renamed from: s, reason: collision with root package name */
        private final int[] f36810s;

        /* renamed from: t, reason: collision with root package name */
        private final Long f36811t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f36812u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f36813v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f36814w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f36815x;

        /* renamed from: y, reason: collision with root package name */
        private final boolean f36816y;

        /* renamed from: z, reason: collision with root package name */
        private final long[] f36817z;

        private static String[] p(L l4, String str) {
            Object[] g4 = l4.g(str);
            if (g4 == null) {
                return null;
            }
            String[] strArr = new String[g4.length];
            for (int i4 = 0; i4 < g4.length; i4++) {
                strArr[i4] = String.valueOf(g4[i4]);
            }
            return strArr;
        }

        @androidx.annotation.P
        public Integer A() {
            return this.f36808q;
        }

        @androidx.annotation.P
        public String a() {
            return this.f36795d;
        }

        @androidx.annotation.P
        public String[] b() {
            return this.f36797f;
        }

        @androidx.annotation.P
        public String c() {
            return this.f36796e;
        }

        @androidx.annotation.P
        public String d() {
            return this.f36804m;
        }

        @androidx.annotation.P
        public String e() {
            return this.f36803l;
        }

        @androidx.annotation.P
        public String f() {
            return this.f36802k;
        }

        public boolean g() {
            return this.f36816y;
        }

        public boolean h() {
            return this.f36814w;
        }

        public boolean i() {
            return this.f36815x;
        }

        @androidx.annotation.P
        public Long j() {
            return this.f36811t;
        }

        @androidx.annotation.P
        public String k() {
            return this.f36798g;
        }

        @androidx.annotation.P
        public Uri l() {
            String str = this.f36799h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @androidx.annotation.P
        public int[] m() {
            return this.f36810s;
        }

        @androidx.annotation.P
        public Uri n() {
            return this.f36805n;
        }

        public boolean o() {
            return this.f36813v;
        }

        @androidx.annotation.P
        public Integer q() {
            return this.f36809r;
        }

        @androidx.annotation.P
        public Integer r() {
            return this.f36807p;
        }

        @androidx.annotation.P
        public String s() {
            return this.f36800i;
        }

        public boolean t() {
            return this.f36812u;
        }

        @androidx.annotation.P
        public String u() {
            return this.f36801j;
        }

        @androidx.annotation.P
        public String v() {
            return this.f36806o;
        }

        @androidx.annotation.P
        public String w() {
            return this.f36792a;
        }

        @androidx.annotation.P
        public String[] x() {
            return this.f36794c;
        }

        @androidx.annotation.P
        public String y() {
            return this.f36793b;
        }

        @androidx.annotation.P
        public long[] z() {
            return this.f36817z;
        }

        private d(L l4) {
            this.f36792a = l4.p(C1821f.c.f36948g);
            this.f36793b = l4.h(C1821f.c.f36948g);
            this.f36794c = p(l4, C1821f.c.f36948g);
            this.f36795d = l4.p(C1821f.c.f36949h);
            this.f36796e = l4.h(C1821f.c.f36949h);
            this.f36797f = p(l4, C1821f.c.f36949h);
            this.f36798g = l4.p(C1821f.c.f36950i);
            this.f36800i = l4.o();
            this.f36801j = l4.p(C1821f.c.f36952k);
            this.f36802k = l4.p(C1821f.c.f36953l);
            this.f36803l = l4.p(C1821f.c.f36935A);
            this.f36804m = l4.p(C1821f.c.f36938D);
            this.f36805n = l4.f();
            this.f36799h = l4.p(C1821f.c.f36951j);
            this.f36806o = l4.p(C1821f.c.f36954m);
            this.f36807p = l4.b(C1821f.c.f36957p);
            this.f36808q = l4.b(C1821f.c.f36962u);
            this.f36809r = l4.b(C1821f.c.f36961t);
            this.f36812u = l4.a(C1821f.c.f36956o);
            this.f36813v = l4.a(C1821f.c.f36955n);
            this.f36814w = l4.a(C1821f.c.f36958q);
            this.f36815x = l4.a(C1821f.c.f36959r);
            this.f36816y = l4.a(C1821f.c.f36960s);
            this.f36811t = l4.j(C1821f.c.f36965x);
            this.f36810s = l4.e();
            this.f36817z = l4.q();
        }
    }

    @c.b
    public U(@c.e(id = 2) Bundle bundle) {
        this.f36787E = bundle;
    }

    private int x0(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    public int B0() {
        String string = this.f36787E.getString(C1821f.d.f36978k);
        if (string == null) {
            string = this.f36787E.getString(C1821f.d.f36980m);
        }
        return x0(string);
    }

    public int E0() {
        String string = this.f36787E.getString(C1821f.d.f36979l);
        if (string == null) {
            if ("1".equals(this.f36787E.getString(C1821f.d.f36981n))) {
                return 2;
            }
            string = this.f36787E.getString(C1821f.d.f36980m);
        }
        return x0(string);
    }

    @androidx.annotation.P
    @com.google.android.gms.common.internal.D
    public byte[] F0() {
        return this.f36787E.getByteArray(C1821f.d.f36970c);
    }

    @androidx.annotation.P
    public String M0() {
        return this.f36787E.getString(C1821f.d.f36983p);
    }

    public long Y0() {
        Object obj = this.f36787E.get(C1821f.d.f36977j);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                Log.w(C1821f.f36920a, "Invalid sent time: " + obj);
                return 0L;
            }
        }
        return 0L;
    }

    @androidx.annotation.P
    public String a1() {
        return this.f36787E.getString(C1821f.d.f36974g);
    }

    @androidx.annotation.P
    public String c0() {
        return this.f36787E.getString(C1821f.d.f36972e);
    }

    @androidx.annotation.N
    public Map<String, String> e0() {
        if (this.f36788F == null) {
            this.f36788F = C1821f.d.a(this.f36787E);
        }
        return this.f36788F;
    }

    public int f1() {
        Object obj = this.f36787E.get(C1821f.d.f36976i);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w(C1821f.f36920a, "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h1(Intent intent) {
        intent.putExtras(this.f36787E);
    }

    @androidx.annotation.P
    public String i0() {
        return this.f36787E.getString("from");
    }

    @I0.a
    public Intent i1() {
        Intent intent = new Intent();
        intent.putExtras(this.f36787E);
        return intent;
    }

    @androidx.annotation.P
    public String u0() {
        String string = this.f36787E.getString(C1821f.d.f36975h);
        if (string == null) {
            return this.f36787E.getString(C1821f.d.f36973f);
        }
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.N Parcel parcel, int i4) {
        V.c(this, parcel, i4);
    }

    @androidx.annotation.P
    public String y0() {
        return this.f36787E.getString(C1821f.d.f36971d);
    }

    @androidx.annotation.P
    public d z0() {
        if (this.f36789G == null && L.v(this.f36787E)) {
            this.f36789G = new d(new L(this.f36787E));
        }
        return this.f36789G;
    }
}
