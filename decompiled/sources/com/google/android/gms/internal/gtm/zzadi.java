package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzadi extends zzbff implements zzbgt {
    private static final zzadi zza;
    private int zzb;
    private int zzf;
    private zzbfp zzg = zzbff.zzaj();

    static {
        zzadi zzadiVar = new zzadi();
        zza = zzadiVar;
        zzbff.zzan(zzadi.class, zzadiVar);
    }

    private zzadi() {
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
                    return new zzadh(null);
                }
                return new zzadi();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u001b", new Object[]{"zzb", "zzf", "zzg", zzaee.class});
        }
        return (byte) 1;
    }
}
