package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbjn extends zzbff implements zzbgt {
    private static final zzbjn zza;
    private int zzb;
    private int zzf;
    private String zzg = "*";

    static {
        zzbjn zzbjnVar = new zzbjn();
        zza = zzbjnVar;
        zzbff.zzan(zzbjn.class, zzbjnVar);
    }

    private zzbjn() {
    }

    public static zzbjn zze() {
        return zza;
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
                        return zza;
                    }
                    return new zzbjm(null);
                }
                return new zzbjn();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzf", zzbjq.zzb(), "zzg"});
        }
        return (byte) 1;
    }
}
