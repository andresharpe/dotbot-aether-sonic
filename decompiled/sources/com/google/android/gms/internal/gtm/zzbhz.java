package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class zzbhz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzb(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzc(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzd(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zze(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i4, int i5);

    abstract void zzi(Object obj, int i4, long j4);

    abstract void zzj(Object obj, int i4, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzk(Object obj, int i4, zzbbw zzbbwVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzl(Object obj, int i4, long j4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzm(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzn(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzo(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzp(Object obj, zzbhe zzbheVar) throws IOException {
        int zzd = zzbheVar.zzd();
        int i4 = zzd >>> 3;
        int i5 = zzd & 7;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        if (i5 != 4) {
                            if (i5 == 5) {
                                zzh(obj, i4, zzbheVar.zzf());
                                return true;
                            }
                            throw zzbfs.zza();
                        }
                        return false;
                    }
                    Object zzf = zzf();
                    int i6 = 4 | (i4 << 3);
                    while (zzbheVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzbheVar)) {
                    }
                    if (i6 == zzbheVar.zzd()) {
                        zzg(zzf);
                        zzj(obj, i4, zzf);
                        return true;
                    }
                    throw zzbfs.zzb();
                }
                zzk(obj, i4, zzbheVar.zzq());
                return true;
            }
            zzi(obj, i4, zzbheVar.zzk());
            return true;
        }
        zzl(obj, i4, zzbheVar.zzl());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzq(zzbhe zzbheVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzr(Object obj, zzbck zzbckVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzs(Object obj, zzbck zzbckVar) throws IOException;
}
