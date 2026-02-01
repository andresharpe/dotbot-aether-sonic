package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzazq extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzazq zzb;
    private zzbfp zzf = zzbff.zzaj();

    static {
        zzazq zzazqVar = new zzazq();
        zzb = zzazqVar;
        zzbff.zzan(zzazq.class, zzazqVar);
        zza = zzbff.zzac(zzbmd.zze(), zzazqVar, zzazqVar, null, 20497290, zzbip.zzk, zzazq.class);
    }

    private zzazq() {
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
                        return zzb;
                    }
                    return new zzazp(null);
                }
                return new zzazq();
            }
            return zzbff.zzam(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzf", zzazn.class});
        }
        return (byte) 1;
    }
}
