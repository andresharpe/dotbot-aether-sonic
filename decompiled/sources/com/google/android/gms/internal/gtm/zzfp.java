package com.google.android.gms.internal.gtm;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import androidx.annotation.Y;
import com.google.android.gms.common.internal.C1285y;
import com.google.android.gms.stats.d;

/* loaded from: classes.dex */
public final class zzfp {
    private static Boolean zza;
    private final Handler zzb;
    private final Context zzc;

    public zzfp(Context context) {
        C1285y.l(context);
        this.zzc = context;
        this.zzb = new zzgc();
    }

    public static boolean zzh(Context context) {
        C1285y.l(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z3 = false;
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"), 0);
            if (serviceInfo != null) {
                if (serviceInfo.enabled) {
                    z3 = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zza = Boolean.valueOf(z3);
        return z3;
    }

    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public final int zza(Intent intent, int i4, final int i5) {
        try {
            synchronized (zzfk.zza) {
                try {
                    d dVar = zzfk.zzb;
                    if (dVar != null && dVar.b()) {
                        dVar.c();
                    }
                } finally {
                }
            }
        } catch (SecurityException unused) {
        }
        zzbx zzg = zzbx.zzg(this.zzc);
        final zzfd zzm = zzg.zzm();
        if (intent == null) {
            zzm.zzQ("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzg.zzj();
        zzm.zzP("Local AnalyticsService called. startId, action", Integer.valueOf(i5), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            zzg(new Runnable() { // from class: com.google.android.gms.internal.gtm.zzfm
                @Override // java.lang.Runnable
                public final void run() {
                    zzfp.this.zzc(i5, zzm);
                }
            });
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(int i4, zzfd zzfdVar) {
        if (((zzfo) this.zzc).callServiceStopSelfResult(i4)) {
            zzfdVar.zzN("Local AnalyticsService processed last dispatch request");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzfd zzfdVar, JobParameters jobParameters) {
        zzfdVar.zzN("AnalyticsJobService processed last dispatch request");
        ((zzfo) this.zzc).zza(jobParameters, false);
    }

    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public final void zze() {
        zzbx zzg = zzbx.zzg(this.zzc);
        zzfd zzm = zzg.zzm();
        zzg.zzj();
        zzm.zzN("Local AnalyticsService is starting up");
    }

    @Y(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"})
    public final void zzf() {
        zzbx zzg = zzbx.zzg(this.zzc);
        zzfd zzm = zzg.zzm();
        zzg.zzj();
        zzm.zzN("Local AnalyticsService is shutting down");
    }

    public final void zzg(Runnable runnable) {
        zzbx.zzg(this.zzc).zzf().zze(new zzfn(this, runnable));
    }

    @TargetApi(24)
    public final boolean zzi(final JobParameters jobParameters) {
        zzbx zzg = zzbx.zzg(this.zzc);
        final zzfd zzm = zzg.zzm();
        String string = jobParameters.getExtras().getString("action");
        zzg.zzj();
        zzm.zzO("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            zzg(new Runnable() { // from class: com.google.android.gms.internal.gtm.zzfl
                @Override // java.lang.Runnable
                public final void run() {
                    zzfp.this.zzd(zzm, jobParameters);
                }
            });
            return true;
        }
        return true;
    }
}
