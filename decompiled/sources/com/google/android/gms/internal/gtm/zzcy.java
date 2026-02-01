package com.google.android.gms.internal.gtm;

import android.os.Handler;
import com.google.android.gms.common.internal.C1285y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzcy {
    private static volatile Handler zza;
    private final zzbx zzb;
    private final Runnable zzc;
    private volatile long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcy(zzbx zzbxVar) {
        C1285y.l(zzbxVar);
        this.zzb = zzbxVar;
        this.zzc = new zzcx(this);
    }

    private final Handler zzi() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzcy.class) {
            try {
                if (zza == null) {
                    zza = new zzgc(this.zzb.zza().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public abstract void zza();

    public final long zzb() {
        if (this.zzd == 0) {
            return 0L;
        }
        return Math.abs(this.zzb.zzr().a() - this.zzd);
    }

    public final void zze(long j4) {
        if (!zzh()) {
            return;
        }
        long j5 = 0;
        if (j4 < 0) {
            zzf();
            return;
        }
        long abs = j4 - Math.abs(this.zzb.zzr().a() - this.zzd);
        if (abs >= 0) {
            j5 = abs;
        }
        zzi().removeCallbacks(this.zzc);
        if (!zzi().postDelayed(this.zzc, j5)) {
            this.zzb.zzm().zzJ("Failed to adjust delayed post. time", Long.valueOf(j5));
        }
    }

    public final void zzf() {
        this.zzd = 0L;
        zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long j4) {
        zzf();
        if (j4 >= 0) {
            this.zzd = this.zzb.zzr().a();
            if (!zzi().postDelayed(this.zzc, j4)) {
                this.zzb.zzm().zzJ("Failed to schedule delayed post. time", Long.valueOf(j4));
            }
        }
    }

    public final boolean zzh() {
        return this.zzd != 0;
    }
}
