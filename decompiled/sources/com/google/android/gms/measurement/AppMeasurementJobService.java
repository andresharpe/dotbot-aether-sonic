package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.K;
import androidx.annotation.N;
import com.google.android.gms.measurement.internal.C1670k4;
import com.google.android.gms.measurement.internal.InterfaceC1664j4;

@TargetApi(24)
/* loaded from: classes2.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC1664j4 {

    /* renamed from: E, reason: collision with root package name */
    private C1670k4 f30091E;

    private final C1670k4 d() {
        if (this.f30091E == null) {
            this.f30091E = new C1670k4(this);
        }
        return this.f30091E;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1664j4
    public final boolean a(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1664j4
    public final void b(@N Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1664j4
    @TargetApi(24)
    public final void c(@N JobParameters jobParameters, boolean z3) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    @K
    public void onCreate() {
        super.onCreate();
        d().e();
    }

    @Override // android.app.Service
    @K
    public void onDestroy() {
        d().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    @K
    public void onRebind(@N Intent intent) {
        d().g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@N JobParameters jobParameters) {
        d().i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@N JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    @K
    public boolean onUnbind(@N Intent intent) {
        d().j(intent);
        return true;
    }
}
