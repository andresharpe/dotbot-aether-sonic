package com.google.android.gms.internal.gtm;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzbig extends zzbii {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbig(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.gtm.zzbii
    public final double zza(Object obj, long j4) {
        return Double.longBitsToDouble(zzk(obj, j4));
    }

    @Override // com.google.android.gms.internal.gtm.zzbii
    public final float zzb(Object obj, long j4) {
        return Float.intBitsToFloat(zzj(obj, j4));
    }

    @Override // com.google.android.gms.internal.gtm.zzbii
    public final void zzc(Object obj, long j4, boolean z3) {
        if (zzbij.zzb) {
            zzbij.zzD(obj, j4, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzbij.zzE(obj, j4, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbii
    public final void zzd(Object obj, long j4, byte b4) {
        if (zzbij.zzb) {
            zzbij.zzD(obj, j4, b4);
        } else {
            zzbij.zzE(obj, j4, b4);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbii
    public final void zze(Object obj, long j4, double d4) {
        zzo(obj, j4, Double.doubleToLongBits(d4));
    }

    @Override // com.google.android.gms.internal.gtm.zzbii
    public final void zzf(Object obj, long j4, float f4) {
        zzn(obj, j4, Float.floatToIntBits(f4));
    }

    @Override // com.google.android.gms.internal.gtm.zzbii
    public final boolean zzg(Object obj, long j4) {
        if (zzbij.zzb) {
            return zzbij.zzt(obj, j4);
        }
        return zzbij.zzu(obj, j4);
    }
}
