package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.ads.identifier.a;
import com.google.android.gms.common.internal.C1285y;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class J1 extends A2 {

    /* renamed from: x, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    static final Pair f30248x = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f30249c;

    /* renamed from: d, reason: collision with root package name */
    public H1 f30250d;

    /* renamed from: e, reason: collision with root package name */
    public final E1 f30251e;

    /* renamed from: f, reason: collision with root package name */
    public final E1 f30252f;

    /* renamed from: g, reason: collision with root package name */
    public final I1 f30253g;

    /* renamed from: h, reason: collision with root package name */
    private String f30254h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f30255i;

    /* renamed from: j, reason: collision with root package name */
    private long f30256j;

    /* renamed from: k, reason: collision with root package name */
    public final E1 f30257k;

    /* renamed from: l, reason: collision with root package name */
    public final C1 f30258l;

    /* renamed from: m, reason: collision with root package name */
    public final I1 f30259m;

    /* renamed from: n, reason: collision with root package name */
    public final C1 f30260n;

    /* renamed from: o, reason: collision with root package name */
    public final E1 f30261o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30262p;

    /* renamed from: q, reason: collision with root package name */
    public final C1 f30263q;

    /* renamed from: r, reason: collision with root package name */
    public final C1 f30264r;

    /* renamed from: s, reason: collision with root package name */
    public final E1 f30265s;

    /* renamed from: t, reason: collision with root package name */
    public final I1 f30266t;

    /* renamed from: u, reason: collision with root package name */
    public final I1 f30267u;

    /* renamed from: v, reason: collision with root package name */
    public final E1 f30268v;

    /* renamed from: w, reason: collision with root package name */
    public final D1 f30269w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J1(C1638f2 c1638f2) {
        super(c1638f2);
        this.f30257k = new E1(this, "session_timeout", 1800000L);
        this.f30258l = new C1(this, "start_new_session", true);
        this.f30261o = new E1(this, "last_pause_time", 0L);
        this.f30259m = new I1(this, "non_personalized_ads", null);
        this.f30260n = new C1(this, "allow_remote_dynamite", false);
        this.f30251e = new E1(this, "first_open_time", 0L);
        this.f30252f = new E1(this, "app_install_time", 0L);
        this.f30253g = new I1(this, "app_instance_id", null);
        this.f30263q = new C1(this, "app_backgrounded", false);
        this.f30264r = new C1(this, "deep_link_retrieval_complete", false);
        this.f30265s = new E1(this, "deep_link_retrieval_attempts", 0L);
        this.f30266t = new I1(this, "firebase_feature_rollouts", null);
        this.f30267u = new I1(this, "deferred_attribution_cache", null);
        this.f30268v = new E1(this, "deferred_attribution_cache_timestamp", 0L);
        this.f30269w = new D1(this, "default_event_parameters", null);
    }

    @Override // com.google.android.gms.measurement.internal.A2
    @androidx.annotation.j0
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    protected final void g() {
        SharedPreferences sharedPreferences = this.f31060a.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f30249c = sharedPreferences;
        boolean z3 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f30262p = z3;
        if (!z3) {
            SharedPreferences.Editor edit = this.f30249c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f31060a.x();
        this.f30250d = new H1(this, "health_monitor", Math.max(0L, ((Long) C1643g1.f30704d.a(null)).longValue()), null);
    }

    @Override // com.google.android.gms.measurement.internal.A2
    protected final boolean h() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @androidx.annotation.j0
    @com.google.android.gms.common.util.D
    public final SharedPreferences m() {
        f();
        i();
        C1285y.l(this.f30249c);
        return this.f30249c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final Pair n(String str) {
        f();
        long c4 = this.f31060a.zzav().c();
        String str2 = this.f30254h;
        if (str2 != null && c4 < this.f30256j) {
            return new Pair(str2, Boolean.valueOf(this.f30255i));
        }
        this.f30256j = c4 + this.f31060a.x().p(str, C1643g1.f30702c);
        com.google.android.gms.ads.identifier.a.d(true);
        try {
            a.C0259a a4 = com.google.android.gms.ads.identifier.a.a(this.f31060a.d());
            this.f30254h = "";
            String a5 = a4.a();
            if (a5 != null) {
                this.f30254h = a5;
            }
            this.f30255i = a4.b();
        } catch (Exception e4) {
            this.f31060a.b().o().b("Unable to get advertising id", e4);
            this.f30254h = "";
        }
        com.google.android.gms.ads.identifier.a.d(false);
        return new Pair(this.f30254h, Boolean.valueOf(this.f30255i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final C1653i o() {
        f();
        return C1653i.b(m().getString("consent_settings", "G1"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final Boolean p() {
        f();
        if (m().contains("measurement_enabled")) {
            return Boolean.valueOf(m().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void q(Boolean bool) {
        f();
        SharedPreferences.Editor edit = m().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void r(boolean z3) {
        f();
        this.f31060a.b().t().b("App measurement setting deferred collection", Boolean.valueOf(z3));
        SharedPreferences.Editor edit = m().edit();
        edit.putBoolean("deferred_analytics_collection", z3);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean s() {
        SharedPreferences sharedPreferences = this.f30249c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t(long j4) {
        if (j4 - this.f30257k.a() > this.f30261o.a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final boolean u(int i4) {
        return C1653i.j(i4, m().getInt("consent_source", 100));
    }
}
