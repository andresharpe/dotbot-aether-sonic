package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzbem extends zzbff implements zzbgt {
    private static final zzbem zza;
    private long zzb;
    private int zzf;

    static {
        zzbem zzbemVar = new zzbem();
        zza = zzbemVar;
        zzbff.zzan(zzbem.class, zzbemVar);
    }

    private zzbem() {
    }

    public static /* synthetic */ zzbem zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzbek zzbekVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzbel(zzbekVar);
                }
                return new zzbem();
            }
            return new zzbhd(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzb", "zzf"});
        }
        return (byte) 1;
    }
}
