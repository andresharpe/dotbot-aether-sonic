package com.google.android.gms.internal.gtm;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzbbn extends zzbbp {
    final /* synthetic */ zzbbw zza;
    private int zzb = 0;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbn(zzbbw zzbbwVar) {
        this.zza = zzbbwVar;
        this.zzc = zzbbwVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbbr
    public final byte zza() {
        int i4 = this.zzb;
        if (i4 < this.zzc) {
            this.zzb = i4 + 1;
            return this.zza.zzb(i4);
        }
        throw new NoSuchElementException();
    }
}
