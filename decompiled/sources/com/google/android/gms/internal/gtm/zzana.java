package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzana extends zzbff implements zzbgt {
    private static final zzana zza;
    private int zzb;
    private zzann zzf;

    static {
        zzana zzanaVar = new zzana();
        zza = zzanaVar;
        zzbff.zzan(zzana.class, zzanaVar);
    }

    private zzana() {
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
                    return new zzamz(null);
                }
                return new zzana();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u000f\u000f\u0001\u0000\u0000\u0000\u000fဉ\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
