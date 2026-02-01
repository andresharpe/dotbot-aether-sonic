package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzamu extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzamu zzb;
    private byte zzg = 2;
    private zzbfp zzf = zzbff.zzaj();

    static {
        zzamu zzamuVar = new zzamu();
        zzb = zzamuVar;
        zzbff.zzan(zzamu.class, zzamuVar);
        zza = zzbff.zzac(zzbmd.zze(), zzamuVar, zzamuVar, null, 16709385, zzbip.zzk, zzamu.class);
    }

    private zzamu() {
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
                    return new zzamt(null);
                }
                return new zzamu();
            }
            return zzbff.zzam(zzb, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0001\u0003Л", new Object[]{"zzf", zzamq.class});
        }
        return Byte.valueOf(this.zzg);
    }
}
