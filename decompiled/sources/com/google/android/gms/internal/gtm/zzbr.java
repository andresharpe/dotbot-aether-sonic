package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbr implements Callable {
    final /* synthetic */ zzbs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbr(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcm zzcmVar;
        zzcmVar = this.zza.zza;
        zzcmVar.zzab();
        return null;
    }
}
