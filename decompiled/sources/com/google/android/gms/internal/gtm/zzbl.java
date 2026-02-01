package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
final class zzbl implements Runnable {
    final /* synthetic */ zzbs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbl(zzbs zzbsVar, boolean z3) {
        this.zza = zzbsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcm zzcmVar;
        zzcmVar = this.zza.zza;
        zzcmVar.zzad();
    }
}
