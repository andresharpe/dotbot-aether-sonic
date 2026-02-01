package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbsz extends zzbff implements zzbgt {
    private static final zzbsz zza;
    private int zzb;
    private long zzf;

    static {
        zzbsz zzbszVar = new zzbsz();
        zza = zzbszVar;
        zzbff.zzan(zzbsz.class, zzbszVar);
    }

    private zzbsz() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbsv zzbsvVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbsy(zzbsvVar);
                }
                return new zzbsz();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
