package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzbib extends zzbhz {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* synthetic */ int zza(Object obj) {
        return ((zzbia) obj).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzbia) obj).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzbff zzbffVar = (zzbff) obj;
        zzbia zzbiaVar = zzbffVar.zzd;
        if (zzbiaVar == zzbia.zzc()) {
            zzbia zze = zzbia.zze();
            zzbffVar.zzd = zze;
            return zze;
        }
        return zzbiaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzbff) obj).zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        zzbia zzbiaVar = (zzbia) obj2;
        if (zzbiaVar.equals(zzbia.zzc())) {
            return obj;
        }
        return zzbia.zzd((zzbia) obj, zzbiaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* synthetic */ Object zzf() {
        return zzbia.zze();
    }

    @Override // com.google.android.gms.internal.gtm.zzbhz
    final /* synthetic */ Object zzg(Object obj) {
        ((zzbia) obj).zzf();
        return obj;
    }

    @Override // com.google.android.gms.internal.gtm.zzbhz
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i4, int i5) {
        ((zzbia) obj).zzh((i4 << 3) | 5, Integer.valueOf(i5));
    }

    @Override // com.google.android.gms.internal.gtm.zzbhz
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i4, long j4) {
        ((zzbia) obj).zzh((i4 << 3) | 1, Long.valueOf(j4));
    }

    @Override // com.google.android.gms.internal.gtm.zzbhz
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i4, Object obj2) {
        ((zzbia) obj).zzh((i4 << 3) | 3, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i4, zzbbw zzbbwVar) {
        ((zzbia) obj).zzh((i4 << 3) | 2, zzbbwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i4, long j4) {
        ((zzbia) obj).zzh(i4 << 3, Long.valueOf(j4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final void zzm(Object obj) {
        ((zzbff) obj).zzd.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzbff) obj).zzd = (zzbia) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzbff) obj).zzd = (zzbia) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final boolean zzq(zzbhe zzbheVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* synthetic */ void zzr(Object obj, zzbck zzbckVar) throws IOException {
        ((zzbia) obj).zzi(zzbckVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.gtm.zzbhz
    public final /* synthetic */ void zzs(Object obj, zzbck zzbckVar) throws IOException {
        ((zzbia) obj).zzj(zzbckVar);
    }
}
