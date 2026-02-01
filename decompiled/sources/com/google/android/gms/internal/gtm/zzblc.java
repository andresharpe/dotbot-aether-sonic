package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzblc extends zzbff implements zzbgt {
    private static final zzblc zza;
    private zzbfp zzb = zzbff.zzaj();

    static {
        zzblc zzblcVar = new zzblc();
        zza = zzblcVar;
        zzbff.zzan(zzblc.class, zzblcVar);
    }

    private zzblc() {
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
                    return new zzblb(null);
                }
                return new zzblc();
            }
            return zzbff.zzam(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzbla.class});
        }
        return (byte) 1;
    }
}
