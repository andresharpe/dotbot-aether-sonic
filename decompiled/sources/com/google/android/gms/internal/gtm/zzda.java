package com.google.android.gms.internal.gtm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import androidx.core.app.C0;
import com.google.android.gms.common.internal.C1285y;

/* loaded from: classes.dex */
public final class zzda extends zzbu {
    private boolean zza;
    private boolean zzb;
    private final AlarmManager zzc;
    private Integer zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzda(zzbx zzbxVar) {
        super(zzbxVar);
        this.zzc = (AlarmManager) zzo().getSystemService(C0.f11617w0);
    }

    private final int zzf() {
        if (this.zzd == null) {
            this.zzd = Integer.valueOf("analytics".concat(String.valueOf(zzo().getPackageName())).hashCode());
        }
        return this.zzd.intValue();
    }

    private final PendingIntent zzg() {
        Context zzo = zzo();
        return PendingIntent.getBroadcast(zzo, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsReceiver")), zzfw.zza);
    }

    public final void zza() {
        this.zzb = false;
        try {
            this.zzc.cancel(zzg());
        } catch (NullPointerException unused) {
        }
        JobScheduler jobScheduler = (JobScheduler) zzo().getSystemService("jobscheduler");
        int zzf = zzf();
        zzO("Cancelling job. JobID", Integer.valueOf(zzf));
        jobScheduler.cancel(zzf);
    }

    public final void zzb() {
        zzV();
        C1285y.s(this.zza, "Receiver not registered");
        zzw();
        long zzd = zzcv.zzd();
        if (zzd > 0) {
            zza();
            zzC().c();
            this.zzb = true;
            ((Boolean) zzew.zzR.zzb()).booleanValue();
            zzN("Scheduling upload with JobScheduler");
            Context zzo = zzo();
            ComponentName componentName = new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsJobService");
            int zzf = zzf();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            JobInfo build = new JobInfo.Builder(zzf, componentName).setMinimumLatency(zzd).setOverrideDeadline(zzd + zzd).setExtras(persistableBundle).build();
            zzO("Scheduling job. JobID", Integer.valueOf(zzf));
            zzfx.zza(zzo, build, "com.google.android.gms", "DispatchAlarm");
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
        try {
            zza();
            zzw();
            if (zzcv.zzd() > 0) {
                Context zzo = zzo();
                ActivityInfo receiverInfo = zzo.getPackageManager().getReceiverInfo(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo != null && receiverInfo.enabled) {
                    zzN("Receiver registered for local dispatch.");
                    this.zza = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final boolean zze() {
        return this.zzb;
    }
}
