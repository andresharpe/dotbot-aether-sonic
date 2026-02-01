package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbjx extends zzbff implements zzbgt {
    private static final zzbjx zza;
    private int zzb;
    private boolean zzf;
    private boolean zzg;

    static {
        zzbjx zzbjxVar = new zzbjx();
        zza = zzbjxVar;
        zzbff.zzan(zzbjx.class, zzbjxVar);
    }

    private zzbjx() {
    }

    public static zzbjx zze() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbjr zzbjrVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbjw(zzbjrVar);
                }
                return new zzbjx();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
