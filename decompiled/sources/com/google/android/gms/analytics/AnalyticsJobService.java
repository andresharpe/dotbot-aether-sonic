package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.N;
import androidx.annotation.Y;
import com.google.android.gms.internal.gtm.zzfo;
import com.google.android.gms.internal.gtm.zzfp;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AnalyticsJobService extends JobService implements zzfo {

    /* renamed from: E, reason: collision with root package name */
    private zzfp f27741E;

    private final zzfp a() {
        if (this.f27741E == null) {
            this.f27741E = new zzfp(this);
        }
        return this.f27741E;
    }

    @Override // com.google.android.gms.internal.gtm.zzfo
    public boolean callServiceStopSelfResult(int i4) {
        return stopSelfResult(i4);
    }

    @Override // android.app.Service
    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public final void onCreate() {
        super.onCreate();
        a().zze();
    }

    @Override // android.app.Service
    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public final void onDestroy() {
        a().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public final int onStartCommand(@N Intent intent, int i4, int i5) {
        a().zza(intent, i4, i5);
        return 2;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@N JobParameters jobParameters) {
        a().zzi(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@N JobParameters jobParameters) {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzfo
    @TargetApi(24)
    public final void zza(@N JobParameters jobParameters, boolean z3) {
        jobFinished(jobParameters, false);
    }
}
