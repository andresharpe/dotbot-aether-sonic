package com.google.android.gms.tagmanager;

/* loaded from: classes2.dex */
final class zzer {
    private final zzdr zza;
    private final com.google.android.gms.internal.gtm.zzam zzb;

    public zzer(zzdr zzdrVar, com.google.android.gms.internal.gtm.zzam zzamVar) {
        this.zza = zzdrVar;
        this.zzb = zzamVar;
    }

    public final int zza() {
        int zzY;
        int zzY2 = ((com.google.android.gms.internal.gtm.zzam) this.zza.zza()).zzY();
        com.google.android.gms.internal.gtm.zzam zzamVar = this.zzb;
        if (zzamVar == null) {
            zzY = 0;
        } else {
            zzY = zzamVar.zzY();
        }
        return zzY2 + zzY;
    }

    public final com.google.android.gms.internal.gtm.zzam zzb() {
        return this.zzb;
    }

    public final zzdr zzc() {
        return this.zza;
    }
}
