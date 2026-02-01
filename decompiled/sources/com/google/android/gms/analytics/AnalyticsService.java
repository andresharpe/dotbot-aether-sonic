package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.N;
import androidx.annotation.Y;
import com.google.android.gms.internal.gtm.zzfo;
import com.google.android.gms.internal.gtm.zzfp;

/* loaded from: classes.dex */
public final class AnalyticsService extends Service implements zzfo {

    /* renamed from: E, reason: collision with root package name */
    private zzfp f27743E;

    private final zzfp a() {
        if (this.f27743E == null) {
            this.f27743E = new zzfp(this);
        }
        return this.f27743E;
    }

    @Override // com.google.android.gms.internal.gtm.zzfo
    public boolean callServiceStopSelfResult(int i4) {
        return stopSelfResult(i4);
    }

    @Override // android.app.Service
    @N
    public IBinder onBind(@N Intent intent) {
        a();
        return null;
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

    @Override // com.google.android.gms.internal.gtm.zzfo
    public final void zza(@N JobParameters jobParameters, boolean z3) {
        throw new UnsupportedOperationException();
    }
}
