package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzyi extends zzbff implements zzbgt {
    private static final zzyi zza;
    private int zzb;
    private zzbfp zzf = zzbff.zzaj();
    private zzyl zzg;

    static {
        zzyi zzyiVar = new zzyi();
        zza = zzyiVar;
        zzbff.zzan(zzyi.class, zzyiVar);
    }

    private zzyi() {
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
                    return new zzyh(null);
                }
                return new zzyi();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzf", zzagb.class, "zzg"});
        }
        return (byte) 1;
    }
}
