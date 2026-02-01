package com.google.android.gms.internal.gtm;

import android.os.Looper;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcx implements Runnable {
    final /* synthetic */ zzcy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcx(zzcy zzcyVar) {
        this.zza = zzcyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbx zzbxVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzbxVar = this.zza.zzb;
            zzbxVar.zzd().i(this);
            return;
        }
        boolean zzh = this.zza.zzh();
        this.zza.zzd = 0L;
        if (zzh) {
            this.zza.zza();
        }
    }
}
