package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzayy extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzayy zzb;
    private byte zzg = 2;
    private zzbfp zzf = zzbff.zzaj();

    static {
        zzayy zzayyVar = new zzayy();
        zzb = zzayyVar;
        zzbff.zzan(zzayy.class, zzayyVar);
        zza = zzbff.zzac(zzbmd.zze(), zzayyVar, zzayyVar, null, 14251185, zzbip.zzk, zzayy.class);
    }

    private zzayy() {
    }

    @Override // com.google.android.gms.internal.gtm.zzbff
    public final Object zzb(int i4, Object obj, Object obj2) {
        byte b4;
        int i5 = i4 - 1;
        if (i5 != 0) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 != 5) {
                            if (obj == null) {
                                b4 = 0;
                            } else {
                                b4 = 1;
                            }
                            this.zzg = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzayx(null);
                }
                return new zzayy();
            }
            return zzbff.zzam(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzf", zzayv.class});
        }
        return Byte.valueOf(this.zzg);
    }
}
