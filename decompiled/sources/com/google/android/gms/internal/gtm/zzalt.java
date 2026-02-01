package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzalt extends zzbff implements zzbgt {
    private static final zzalt zza;
    private int zzb;
    private long zzf;

    static {
        zzalt zzaltVar = new zzalt();
        zza = zzaltVar;
        zzbff.zzan(zzalt.class, zzaltVar);
    }

    private zzalt() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzalr zzalrVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzals(zzalrVar);
                }
                return new zzalt();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
