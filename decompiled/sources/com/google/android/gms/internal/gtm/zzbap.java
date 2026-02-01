package com.google.android.gms.internal.gtm;

import com.clj.fastble.a;

/* loaded from: classes.dex */
public final class zzbap extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzbap zzb;
    private int zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        zzbap zzbapVar = new zzbap();
        zzb = zzbapVar;
        zzbff.zzan(zzbap.class, zzbapVar);
        zza = zzbff.zzac(zzban.zzc(), zzbapVar, zzbapVar, null, a.f26980l, zzbip.zzk, zzbap.class);
    }

    private zzbap() {
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
                    return new zzbao(null);
                }
                return new zzbap();
            }
            return zzbff.zzam(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
