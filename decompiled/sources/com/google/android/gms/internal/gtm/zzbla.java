package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbla extends zzbff implements zzbgt {
    private static final zzbla zza;
    private int zzb;
    private String zzf = "";
    private zzblq zzg;

    static {
        zzbla zzblaVar = new zzbla();
        zza = zzblaVar;
        zzbff.zzan(zzbla.class, zzblaVar);
    }

    private zzbla() {
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
                    return new zzbkz(null);
                }
                return new zzbla();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
