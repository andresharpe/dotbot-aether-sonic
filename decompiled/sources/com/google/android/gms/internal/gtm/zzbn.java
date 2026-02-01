package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbn implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbs zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbn(zzbs zzbsVar, int i4) {
        this.zzb = zzbsVar;
        this.zza = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcm zzcmVar;
        zzcmVar = this.zzb.zza;
        zzcmVar.zzY(this.zza * 1000);
    }
}
