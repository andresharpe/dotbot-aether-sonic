package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1640f4 extends AbstractC1759z4 {

    /* renamed from: d, reason: collision with root package name */
    private final Map f30657d;

    /* renamed from: e, reason: collision with root package name */
    public final E1 f30658e;

    /* renamed from: f, reason: collision with root package name */
    public final E1 f30659f;

    /* renamed from: g, reason: collision with root package name */
    public final E1 f30660g;

    /* renamed from: h, reason: collision with root package name */
    public final E1 f30661h;

    /* renamed from: i, reason: collision with root package name */
    public final E1 f30662i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1640f4(L4 l4) {
        super(l4);
        this.f30657d = new HashMap();
        J1 D3 = this.f31060a.D();
        D3.getClass();
        this.f30658e = new E1(D3, "last_delete_stale", 0L);
        J1 D4 = this.f31060a.D();
        D4.getClass();
        this.f30659f = new E1(D4, "backoff", 0L);
        J1 D5 = this.f31060a.D();
        D5.getClass();
        this.f30660g = new E1(D5, "last_upload", 0L);
        J1 D6 = this.f31060a.D();
        D6.getClass();
        this.f30661h = new E1(D6, "last_upload_attempt", 0L);
        J1 D7 = this.f31060a.D();
        D7.getClass();
        this.f30662i = new E1(D7, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1759z4
    protected final boolean j() {
        return false;
    }

    @androidx.annotation.j0
    @Deprecated
    final Pair k(String str) {
        C1634e4 c1634e4;
        a.C0259a a4;
        f();
        long c4 = this.f31060a.zzav().c();
        C1634e4 c1634e42 = (C1634e4) this.f30657d.get(str);
        if (c1634e42 != null && c4 < c1634e42.f30610c) {
            return new Pair(c1634e42.f30608a, Boolean.valueOf(c1634e42.f30609b));
        }
        com.google.android.gms.ads.identifier.a.d(true);
        long p4 = c4 + this.f31060a.x().p(str, C1643g1.f30702c);
        try {
            a4 = com.google.android.gms.ads.identifier.a.a(this.f31060a.d());
        } catch (Exception e4) {
            this.f31060a.b().o().b("Unable to get advertising id", e4);
            c1634e4 = new C1634e4("", false, p4);
        }
        if (a4 == null) {
            return new Pair("", Boolean.FALSE);
        }
        String a5 = a4.a();
        if (a5 != null) {
            c1634e4 = new C1634e4(a5, a4.b(), p4);
        } else {
            c1634e4 = new C1634e4("", a4.b(), p4);
        }
        this.f30657d.put(str, c1634e4);
        com.google.android.gms.ads.identifier.a.d(false);
        return new Pair(c1634e4.f30608a, Boolean.valueOf(c1634e4.f30609b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final Pair l(String str, C1653i c1653i) {
        if (c1653i.i(zzah.AD_STORAGE)) {
            return k(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    @Deprecated
    public final String m(String str, boolean z3) {
        String str2;
        f();
        if (z3) {
            str2 = (String) k(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest r4 = U4.r();
        if (r4 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, r4.digest(str2.getBytes())));
    }
}
