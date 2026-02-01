package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.D6;
import com.google.android.gms.internal.measurement.Y5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1723t4 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1729u4 f30987a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1723t4(C1729u4 c1729u4) {
        this.f30987a = c1729u4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void a() {
        this.f30987a.f();
        if (this.f30987a.f31060a.D().t(this.f30987a.f31060a.zzav().a())) {
            this.f30987a.f31060a.D().f30258l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f30987a.f31060a.b().t().a("Detected application was in foreground");
                c(this.f30987a.f31060a.zzav().a(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.j0
    public final void b(long j4, boolean z3) {
        this.f30987a.f();
        this.f30987a.q();
        if (this.f30987a.f31060a.D().t(j4)) {
            this.f30987a.f31060a.D().f30258l.a(true);
            D6.b();
            if (this.f30987a.f31060a.x().z(null, C1643g1.f30739u0)) {
                this.f30987a.f31060a.z().t();
            }
        }
        this.f30987a.f31060a.D().f30261o.b(j4);
        if (this.f30987a.f31060a.D().f30258l.b()) {
            c(j4, z3);
        }
    }

    @androidx.annotation.j0
    @com.google.android.gms.common.util.D
    final void c(long j4, boolean z3) {
        this.f30987a.f();
        if (!this.f30987a.f31060a.m()) {
            return;
        }
        this.f30987a.f31060a.D().f30261o.b(j4);
        this.f30987a.f31060a.b().t().b("Session started, time", Long.valueOf(this.f30987a.f31060a.zzav().c()));
        Long valueOf = Long.valueOf(j4 / 1000);
        this.f30987a.f31060a.G().K(kotlinx.coroutines.W.f52989c, "_sid", valueOf, j4);
        this.f30987a.f31060a.D().f30258l.a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        if (this.f30987a.f31060a.x().z(null, C1643g1.f30701b0) && z3) {
            bundle.putLong("_aib", 1L);
        }
        this.f30987a.f31060a.G().t(kotlinx.coroutines.W.f52989c, "_s", j4, bundle);
        Y5.b();
        if (this.f30987a.f31060a.x().z(null, C1643g1.f30707e0)) {
            String a4 = this.f30987a.f31060a.D().f30266t.a();
            if (!TextUtils.isEmpty(a4)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a4);
                this.f30987a.f31060a.G().t(kotlinx.coroutines.W.f52989c, "_ssr", j4, bundle2);
            }
        }
    }
}
