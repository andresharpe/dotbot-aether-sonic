package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzyw extends zzbff implements zzbgt {
    private static final zzyw zza;
    private int zzb;
    private zzbbw zzf;
    private zzbbw zzg;
    private zzyr zzh;
    private int zzi;
    private zzyo zzj;
    private zzyj zzk;
    private byte zzl = 2;

    static {
        zzyw zzywVar = new zzyw();
        zza = zzywVar;
        zzbff.zzan(zzyw.class, zzywVar);
    }

    private zzyw() {
        zzbbw zzbbwVar = zzbbw.zzb;
        this.zzf = zzbbwVar;
        this.zzg = zzbbwVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        byte b4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (obj == null) {
                                b4 = 0;
                            } else {
                                b4 = 1;
                            }
                            this.zzl = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzys(null);
                }
                return new zzyw();
            }
            return zzbff.zzam(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ည\u0000\u0002ဉ\u0002\u0003ဌ\u0003\u0004ᐉ\u0004\u0005ည\u0001\u0006ဉ\u0005", new Object[]{"zzb", "zzf", "zzh", "zzi", zzyv.zzc(), "zzj", "zzg", "zzk"});
        }
        return Byte.valueOf(this.zzl);
    }
}
