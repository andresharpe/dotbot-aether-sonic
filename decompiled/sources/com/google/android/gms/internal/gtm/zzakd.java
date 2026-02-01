package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzakd extends zzbff implements zzbgt {
    private static final zzakd zza;
    private int zzb;
    private int zzf = 1;
    private String zzg = "";

    static {
        zzakd zzakdVar = new zzakd();
        zza = zzakdVar;
        zzbff.zzan(zzakd.class, zzakdVar);
    }

    private zzakd() {
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
                    return new zzakc(null);
                }
                return new zzakd();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzf", zzajz.zzc(), "zzg"});
        }
        return (byte) 1;
    }
}
