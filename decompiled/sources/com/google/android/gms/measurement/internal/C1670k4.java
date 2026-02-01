package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.C1285y;

/* renamed from: com.google.android.gms.measurement.internal.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1670k4 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30835a;

    public C1670k4(Context context) {
        C1285y.l(context);
        this.f30835a = context;
    }

    private final C1720t1 k() {
        return C1638f2.F(this.f30835a, null, null).b();
    }

    @androidx.annotation.K
    public final int a(final Intent intent, int i4, final int i5) {
        C1638f2 F3 = C1638f2.F(this.f30835a, null, null);
        final C1720t1 b4 = F3.b();
        if (intent == null) {
            b4.u().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        F3.zzaw();
        b4.t().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i5), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            h(new Runnable() { // from class: com.google.android.gms.measurement.internal.h4
                @Override // java.lang.Runnable
                public final void run() {
                    C1670k4.this.c(i5, b4, intent);
                }
            });
        }
        return 2;
    }

    @androidx.annotation.K
    public final IBinder b(Intent intent) {
        if (intent == null) {
            k().p().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC1751y2(L4.d0(this.f30835a), null);
        }
        k().u().b("onBind received unknown action", action);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void c(int i4, C1720t1 c1720t1, Intent intent) {
        if (((InterfaceC1664j4) this.f30835a).a(i4)) {
            c1720t1.t().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i4));
            k().t().a("Completed wakeful intent.");
            ((InterfaceC1664j4) this.f30835a).b(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(C1720t1 c1720t1, JobParameters jobParameters) {
        c1720t1.t().a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC1664j4) this.f30835a).c(jobParameters, false);
    }

    @androidx.annotation.K
    public final void e() {
        C1638f2 F3 = C1638f2.F(this.f30835a, null, null);
        C1720t1 b4 = F3.b();
        F3.zzaw();
        b4.t().a("Local AppMeasurementService is starting up");
    }

    @androidx.annotation.K
    public final void f() {
        C1638f2 F3 = C1638f2.F(this.f30835a, null, null);
        C1720t1 b4 = F3.b();
        F3.zzaw();
        b4.t().a("Local AppMeasurementService is shutting down");
    }

    @androidx.annotation.K
    public final void g(Intent intent) {
        if (intent == null) {
            k().p().a("onRebind called with null intent");
        } else {
            k().t().b("onRebind called. action", intent.getAction());
        }
    }

    public final void h(Runnable runnable) {
        L4 d02 = L4.d0(this.f30835a);
        d02.a().x(new RunnableC1658i4(this, d02, runnable));
    }

    @TargetApi(24)
    @androidx.annotation.K
    public final boolean i(final JobParameters jobParameters) {
        C1638f2 F3 = C1638f2.F(this.f30835a, null, null);
        final C1720t1 b4 = F3.b();
        String string = jobParameters.getExtras().getString("action");
        F3.zzaw();
        b4.t().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            h(new Runnable() { // from class: com.google.android.gms.measurement.internal.g4
                @Override // java.lang.Runnable
                public final void run() {
                    C1670k4.this.d(b4, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    @androidx.annotation.K
    public final boolean j(Intent intent) {
        if (intent == null) {
            k().p().a("onUnbind called with null intent");
            return true;
        }
        k().t().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
