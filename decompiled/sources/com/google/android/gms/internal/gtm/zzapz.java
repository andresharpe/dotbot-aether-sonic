package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzapz extends zzbff implements zzbgt {
    private static final zzapz zza;
    private int zzb;
    private double zzf;

    static {
        zzapz zzapzVar = new zzapz();
        zza = zzapzVar;
        zzbff.zzan(zzapz.class, zzapzVar);
    }

    private zzapz() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzapx zzapxVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzapy(zzapxVar);
                }
                return new zzapz();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
