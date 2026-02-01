package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzahd extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzahd zzb;
    private int zzf;
    private zzahb zzg;

    static {
        zzahd zzahdVar = new zzahd();
        zzb = zzahdVar;
        zzbff.zzan(zzahd.class, zzahdVar);
        zza = zzbff.zzac(zzbmd.zze(), zzahdVar, zzahdVar, null, 24882046, zzbip.zzk, zzahd.class);
    }

    private zzahd() {
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
                    return new zzahc(null);
                }
                return new zzahd();
            }
            return zzbff.zzam(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzf", "zzg"});
        }
        return (byte) 1;
    }
}
