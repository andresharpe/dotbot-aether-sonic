package com.google.android.gms.internal.gtm;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzbcc {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzbcd zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbcc(zzbcb zzbcbVar) {
    }

    public static int zzs(int i4) {
        return (-(i4 & 1)) ^ (i4 >>> 1);
    }

    public static long zzt(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public abstract int zza();

    public abstract int zzb(int i4) throws zzbfs;

    public abstract int zzc() throws IOException;

    public abstract zzbbw zzd() throws IOException;

    public abstract String zze() throws IOException;

    public abstract String zzf() throws IOException;

    public abstract void zzg(int i4) throws zzbfs;

    public abstract void zzh(int i4);

    public abstract boolean zzi() throws IOException;

    public abstract boolean zzj() throws IOException;

    public abstract boolean zzk(int i4) throws IOException;
}
