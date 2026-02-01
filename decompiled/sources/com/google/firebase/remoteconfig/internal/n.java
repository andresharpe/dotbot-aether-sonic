package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.P;
import androidx.annotation.i0;
import androidx.annotation.j0;
import com.google.firebase.remoteconfig.n;
import java.util.Date;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: d, reason: collision with root package name */
    @i0
    public static final long f37473d = -1;

    /* renamed from: f, reason: collision with root package name */
    @i0
    static final int f37475f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final long f37476g = -1;

    /* renamed from: i, reason: collision with root package name */
    private static final String f37478i = "fetch_timeout_in_seconds";

    /* renamed from: j, reason: collision with root package name */
    private static final String f37479j = "minimum_fetch_interval_in_seconds";

    /* renamed from: k, reason: collision with root package name */
    private static final String f37480k = "last_fetch_status";

    /* renamed from: l, reason: collision with root package name */
    private static final String f37481l = "last_fetch_time_in_millis";

    /* renamed from: m, reason: collision with root package name */
    private static final String f37482m = "last_fetch_etag";

    /* renamed from: n, reason: collision with root package name */
    private static final String f37483n = "backoff_end_time_in_millis";

    /* renamed from: o, reason: collision with root package name */
    private static final String f37484o = "num_failed_fetches";

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f37485a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f37486b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f37487c = new Object();

    /* renamed from: e, reason: collision with root package name */
    static final Date f37474e = new Date(-1);

    /* renamed from: h, reason: collision with root package name */
    @i0
    static final Date f37477h = new Date(-1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f37488a;

        /* renamed from: b, reason: collision with root package name */
        private Date f37489b;

        a(int i4, Date date) {
            this.f37488a = i4;
            this.f37489b = date;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Date a() {
            return this.f37489b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f37488a;
        }
    }

    public n(SharedPreferences sharedPreferences) {
        this.f37485a = sharedPreferences;
    }

    @j0
    public void a() {
        synchronized (this.f37486b) {
            this.f37485a.edit().clear().commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a b() {
        a aVar;
        synchronized (this.f37487c) {
            aVar = new a(this.f37485a.getInt(f37484o, 0), new Date(this.f37485a.getLong(f37483n, -1L)));
        }
        return aVar;
    }

    public long c() {
        return this.f37485a.getLong(f37478i, 60L);
    }

    public com.google.firebase.remoteconfig.m d() {
        q a4;
        synchronized (this.f37486b) {
            long j4 = this.f37485a.getLong(f37481l, -1L);
            int i4 = this.f37485a.getInt(f37480k, 0);
            a4 = q.d().c(i4).d(j4).b(new n.b().f(this.f37485a.getLong(f37478i, 60L)).g(this.f37485a.getLong(f37479j, k.f37443j)).c()).a();
        }
        return a4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @P
    public String e() {
        return this.f37485a.getString(f37482m, null);
    }

    int f() {
        return this.f37485a.getInt(f37480k, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Date g() {
        return new Date(this.f37485a.getLong(f37481l, -1L));
    }

    public long h() {
        return this.f37485a.getLong(f37479j, k.f37443j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        j(0, f37477h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j(int i4, Date date) {
        synchronized (this.f37487c) {
            this.f37485a.edit().putInt(f37484o, i4).putLong(f37483n, date.getTime()).apply();
        }
    }

    @j0
    public void k(com.google.firebase.remoteconfig.n nVar) {
        synchronized (this.f37486b) {
            this.f37485a.edit().putLong(f37478i, nVar.a()).putLong(f37479j, nVar.b()).commit();
        }
    }

    public void l(com.google.firebase.remoteconfig.n nVar) {
        synchronized (this.f37486b) {
            this.f37485a.edit().putLong(f37478i, nVar.a()).putLong(f37479j, nVar.b()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(String str) {
        synchronized (this.f37486b) {
            this.f37485a.edit().putString(f37482m, str).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        synchronized (this.f37486b) {
            this.f37485a.edit().putInt(f37480k, 1).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(Date date) {
        synchronized (this.f37486b) {
            this.f37485a.edit().putInt(f37480k, -1).putLong(f37481l, date.getTime()).apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f37486b) {
            this.f37485a.edit().putInt(f37480k, 2).apply();
        }
    }
}
