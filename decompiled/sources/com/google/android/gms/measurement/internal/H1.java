package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes2.dex */
public final class H1 {

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.D
    final String f30193a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30194b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30195c;

    /* renamed from: d, reason: collision with root package name */
    private final long f30196d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J1 f30197e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ H1(J1 j12, String str, long j4, G1 g12) {
        boolean z3;
        this.f30197e = j12;
        C1285y.h("health_monitor");
        if (j4 > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C1285y.a(z3);
        this.f30193a = "health_monitor:start";
        this.f30194b = "health_monitor:count";
        this.f30195c = "health_monitor:value";
        this.f30196d = j4;
    }

    @androidx.annotation.j0
    private final long c() {
        return this.f30197e.m().getLong(this.f30193a, 0L);
    }

    @androidx.annotation.j0
    private final void d() {
        this.f30197e.f();
        long a4 = this.f30197e.f31060a.zzav().a();
        SharedPreferences.Editor edit = this.f30197e.m().edit();
        edit.remove(this.f30194b);
        edit.remove(this.f30195c);
        edit.putLong(this.f30193a, a4);
        edit.apply();
    }

    @androidx.annotation.j0
    public final Pair a() {
        long abs;
        this.f30197e.f();
        this.f30197e.f();
        long c4 = c();
        if (c4 == 0) {
            d();
            abs = 0;
        } else {
            abs = Math.abs(c4 - this.f30197e.f31060a.zzav().a());
        }
        long j4 = this.f30196d;
        if (abs < j4) {
            return null;
        }
        if (abs > j4 + j4) {
            d();
            return null;
        }
        String string = this.f30197e.m().getString(this.f30195c, null);
        long j5 = this.f30197e.m().getLong(this.f30194b, 0L);
        d();
        if (string != null && j5 > 0) {
            return new Pair(string, Long.valueOf(j5));
        }
        return J1.f30248x;
    }

    @androidx.annotation.j0
    public final void b(String str, long j4) {
        this.f30197e.f();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j5 = this.f30197e.m().getLong(this.f30194b, 0L);
        if (j5 <= 0) {
            SharedPreferences.Editor edit = this.f30197e.m().edit();
            edit.putString(this.f30195c, str);
            edit.putLong(this.f30194b, 1L);
            edit.apply();
            return;
        }
        long nextLong = this.f30197e.f31060a.L().s().nextLong();
        long j6 = j5 + 1;
        long j7 = Long.MAX_VALUE / j6;
        SharedPreferences.Editor edit2 = this.f30197e.m().edit();
        if ((Long.MAX_VALUE & nextLong) < j7) {
            edit2.putString(this.f30195c, str);
        }
        edit2.putLong(this.f30194b, j6);
        edit2.apply();
    }
}
