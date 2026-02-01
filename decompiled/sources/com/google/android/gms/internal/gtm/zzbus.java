package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbus extends zzbff implements zzbgt {
    private static final zzbus zza;
    private int zzb;
    private String zzf = "";
    private int zzg;

    static {
        zzbus zzbusVar = new zzbus();
        zza = zzbusVar;
        zzbff.zzan(zzbus.class, zzbusVar);
    }

    private zzbus() {
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
                    return new zzbuo(null);
                }
                return new zzbus();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zzf", "zzg", zzbur.zzb()});
        }
        return (byte) 1;
    }
}
