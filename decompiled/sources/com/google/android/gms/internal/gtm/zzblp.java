package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzblp extends zzbff implements zzbgt {
    private static final zzblp zza;
    private int zzb;
    private String zzf = "";
    private zzbbw zzg = zzbbw.zzb;

    static {
        zzblp zzblpVar = new zzblp();
        zza = zzblpVar;
        zzbff.zzan(zzblp.class, zzblpVar);
    }

    private zzblp() {
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
                    return new zzblo(null);
                }
                return new zzblp();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzb", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
