package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbls extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzbls zzb;
    private zzbfp zzf = zzbff.zzaj();

    static {
        zzbls zzblsVar = new zzbls();
        zzb = zzblsVar;
        zzbff.zzan(zzbls.class, zzblsVar);
        zza = zzbff.zzac(zzbmd.zze(), zzblsVar, zzblsVar, null, 75852568, zzbip.zzk, zzbls.class);
    }

    private zzbls() {
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
                    return new zzblr(null);
                }
                return new zzbls();
            }
            return zzbff.zzam(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzf", zzblm.class});
        }
        return (byte) 1;
    }
}
