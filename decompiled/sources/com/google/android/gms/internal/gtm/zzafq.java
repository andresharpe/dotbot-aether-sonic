package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzafq extends zzbff implements zzbgt {
    private static final zzafq zza;
    private int zzb;
    private Object zzg;
    private int zzh;
    private int zzf = 0;
    private zzbfp zzi = zzbff.zzaj();

    static {
        zzafq zzafqVar = new zzafq();
        zza = zzafqVar;
        zzbff.zzan(zzafq.class, zzafqVar);
    }

    private zzafq() {
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
                    return new zzafm(null);
                }
                return new zzafq();
            }
            return zzbff.zzam(zza, "\u0001\u0005\u0001\u0001\u0003\u0007\u0005\u0000\u0001\u0000\u0003ဌ\u0000\u0004\u001b\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"zzg", "zzf", "zzb", "zzh", zzafp.zzc(), "zzi", zzafa.class, zzafw.class, zzahj.class, zzahg.class});
        }
        return (byte) 1;
    }
}
