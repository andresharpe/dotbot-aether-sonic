package com.google.android.gms.tagmanager;

import java.util.List;

/* loaded from: classes2.dex */
final class zzay implements Runnable {
    final /* synthetic */ List zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzbd zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzay(zzbd zzbdVar, List list, long j4) {
        this.zzc = zzbdVar;
        this.zza = list;
        this.zzb = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzl(this.zza, this.zzb);
    }
}
