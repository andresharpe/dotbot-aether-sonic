package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbth extends zzbff implements zzbgt {
    private static final zzbth zza;
    private int zzb;
    private int zzf;
    private int zzg;

    static {
        zzbth zzbthVar = new zzbth();
        zza = zzbthVar;
        zzbff.zzan(zzbth.class, zzbthVar);
    }

    private zzbth() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbte zzbteVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbtg(zzbteVar);
                }
                return new zzbth();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
