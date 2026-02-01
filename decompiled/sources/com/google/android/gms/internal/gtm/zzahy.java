package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzahy extends zzbff implements zzbgt {
    private static final zzahy zza;
    private int zzb;
    private int zzf;
    private zzaie zzg;
    private int zzh;

    static {
        zzahy zzahyVar = new zzahy();
        zza = zzahyVar;
        zzbff.zzan(zzahy.class, zzahyVar);
    }

    private zzahy() {
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
                    return new zzahx(null);
                }
                return new zzahy();
            }
            return zzbff.zzam(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"zzb", "zzf", zzwu.zzc(), "zzg", "zzh", zzbki.zzb()});
        }
        return (byte) 1;
    }
}
