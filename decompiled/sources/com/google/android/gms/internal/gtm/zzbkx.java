package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbkx extends zzbff implements zzbgt {
    private static final zzbkx zza;
    private int zzb;
    private String zzf = "";
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzbkx zzbkxVar = new zzbkx();
        zza = zzbkxVar;
        zzbff.zzan(zzbkx.class, zzbkxVar);
    }

    private zzbkx() {
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
                    return new zzbkw(null);
                }
                return new zzbkx();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzf", "zzg", zzblq.class});
        }
        return (byte) 1;
    }
}
