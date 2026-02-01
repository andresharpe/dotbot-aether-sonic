package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
final class zzcb implements Runnable {
    final /* synthetic */ zzcd zza;
    final /* synthetic */ zzfa zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcb(zzcd zzcdVar, zzfa zzfaVar, byte[] bArr) {
        this.zza = zzcdVar;
        this.zzb = zzfaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zza.zza.zzg()) {
            this.zza.zza.zzE("Connected to service after a timeout");
            zzce.zzi(this.zza.zza, this.zzb);
        }
    }
}
