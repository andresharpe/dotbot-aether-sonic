package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbtz extends zzbff implements zzbgt {
    private static final zzbtz zza;
    private int zzb;
    private int zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzbtz zzbtzVar = new zzbtz();
        zza = zzbtzVar;
        zzbff.zzan(zzbtz.class, zzbtzVar);
    }

    private zzbtz() {
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
                    return new zzbtv(null);
                }
                return new zzbtz();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zzf", zzbty.zzb(), "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
