package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaql extends zzbff implements zzbgt {
    private static final zzaql zza;
    private int zzb;
    private long zzf;
    private zzamq zzg;
    private double zzh;
    private float zzi;
    private byte zzj = 2;

    static {
        zzaql zzaqlVar = new zzaql();
        zza = zzaqlVar;
        zzbff.zzan(zzaql.class, zzaqlVar);
    }

    private zzaql() {
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
                            this.zzj = b4;
                            return null;
                        }
                        return zza;
                    }
                    return new zzaqk(null);
                }
                return new zzaql();
            }
            return zzbff.zzam(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဂ\u0000\u0002ᐉ\u0001\u0003က\u0002\u0004ခ\u0003", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
