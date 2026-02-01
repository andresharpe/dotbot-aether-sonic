package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaoc extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzaoc zzb;
    private int zzf;
    private String zzg = "";

    static {
        zzaoc zzaocVar = new zzaoc();
        zzb = zzaocVar;
        zzbff.zzan(zzaoc.class, zzaocVar);
        zza = zzbff.zzac(zzbmd.zze(), zzaocVar, zzaocVar, null, 157211294, zzbip.zzk, zzaoc.class);
    }

    private zzaoc() {
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaob(null);
                }
                return new zzaoc();
            }
            return zzbff.zzam(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzf", "zzg"});
        }
        return (byte) 1;
    }
}
