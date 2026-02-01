package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;

/* renamed from: com.google.android.gms.measurement.internal.x4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1747x4 extends AbstractC1759z4 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f31042d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC1695p f31043e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f31044f;

    /* JADX INFO: Access modifiers changed from: protected */
    public C1747x4(L4 l4) {
        super(l4);
        this.f31042d = (AlarmManager) this.f31060a.d().getSystemService(androidx.core.app.C0.f11617w0);
    }

    private final int m() {
        if (this.f31044f == null) {
            this.f31044f = Integer.valueOf("measurement".concat(String.valueOf(this.f31060a.d().getPackageName())).hashCode());
        }
        return this.f31044f.intValue();
    }

    private final PendingIntent n() {
        Context d4 = this.f31060a.d();
        return PendingIntent.getBroadcast(d4, 0, new Intent().setClassName(d4, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.V.f29518a);
    }

    private final AbstractC1695p o() {
        if (this.f31043e == null) {
            this.f31043e = new C1741w4(this, this.f31057b.a0());
        }
        return this.f31043e;
    }

    @TargetApi(24)
    private final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f31060a.d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1759z4
    protected final boolean j() {
        AlarmManager alarmManager = this.f31042d;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        p();
        return false;
    }

    public final void k() {
        g();
        this.f31060a.b().t().a("Unscheduling upload");
        AlarmManager alarmManager = this.f31042d;
        if (alarmManager != null) {
            alarmManager.cancel(n());
        }
        o().b();
        p();
    }

    public final void l(long j4) {
        g();
        this.f31060a.zzaw();
        Context d4 = this.f31060a.d();
        if (!U4.W(d4)) {
            this.f31060a.b().o().a("Receiver not registered/enabled");
        }
        if (!U4.X(d4, false)) {
            this.f31060a.b().o().a("Service not registered/enabled");
        }
        k();
        this.f31060a.b().t().b("Scheduling upload, millis", Long.valueOf(j4));
        this.f31060a.zzav().c();
        this.f31060a.x();
        if (j4 < Math.max(0L, ((Long) C1643g1.f30746y.a(null)).longValue()) && !o().e()) {
            o().d(j4);
        }
        this.f31060a.zzaw();
        Context d5 = this.f31060a.d();
        ComponentName componentName = new ComponentName(d5, "com.google.android.gms.measurement.AppMeasurementJobService");
        int m4 = m();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.W.a(d5, new JobInfo.Builder(m4, componentName).setMinimumLatency(j4).setOverrideDeadline(j4 + j4).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }
}
