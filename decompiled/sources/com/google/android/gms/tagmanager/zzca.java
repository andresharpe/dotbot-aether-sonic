package com.google.android.gms.tagmanager;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzca implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcb zzc;
    final /* synthetic */ zzcb zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzca(zzcb zzcbVar, zzcb zzcbVar2, long j4, String str, byte[] bArr) {
        this.zzc = zzcbVar;
        this.zzd = zzcbVar2;
        this.zza = j4;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcc zzccVar;
        zzcc zzccVar2;
        Context context;
        zzccVar = this.zzc.zze;
        if (zzccVar == null) {
            zzfe zzg = zzfe.zzg();
            context = this.zzc.zzf;
            zzg.zzl(context, this.zzd);
            this.zzc.zze = zzg.zzf();
        }
        zzccVar2 = this.zzc.zze;
        zzccVar2.zzb(this.zza, this.zzb);
    }
}
