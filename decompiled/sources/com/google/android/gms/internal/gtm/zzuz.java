package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzuz extends zzbff implements zzbgt {
    private static final zzuz zza;
    private int zzb;
    private String zzf = "";
    private String zzg = "";

    static {
        zzuz zzuzVar = new zzuz();
        zza = zzuzVar;
        zzbff.zzan(zzuz.class, zzuzVar);
    }

    private zzuz() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    zzus zzusVar = null;
                    if (i5 != 4) {
                        if (i5 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzuy(zzusVar);
                }
                return new zzuz();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
