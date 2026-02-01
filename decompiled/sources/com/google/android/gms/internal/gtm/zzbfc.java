package com.google.android.gms.internal.gtm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbfc implements zzbet {
    final zzbfi zza;
    final int zzb;
    final zzbip zzc;
    final boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfc(zzbfi zzbfiVar, int i4, zzbip zzbipVar, boolean z3, boolean z4) {
        this.zza = zzbfiVar;
        this.zzb = i4;
        this.zzc = zzbipVar;
        this.zzd = z3;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.zzb - ((zzbfc) obj).zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzbet
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzbet
    public final zzbgr zzb(zzbgr zzbgrVar, zzbgs zzbgsVar) {
        ((zzbez) zzbgrVar).zzz((zzbff) zzbgsVar);
        return zzbgrVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzbet
    public final zzbgx zzc(zzbgx zzbgxVar, zzbgx zzbgxVar2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.gtm.zzbet
    public final zzbip zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzbet
    public final zzbiq zze() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzbet
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzbet
    public final boolean zzg() {
        return this.zzd;
    }
}
