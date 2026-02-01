package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaky extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzaky zzb;
    private int zzf;
    private double zzg;
    private byte zzi = 2;
    private int zzh = 800;

    static {
        zzaky zzakyVar = new zzaky();
        zzb = zzakyVar;
        zzbff.zzan(zzaky.class, zzakyVar);
        zza = zzbff.zzac(zzbmd.zze(), zzakyVar, zzakyVar, null, 15303159, zzbip.zzk, zzaky.class);
    }

    private zzaky() {
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
                            this.zzi = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaku(null);
                }
                return new zzaky();
            }
            return zzbff.zzam(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔀ\u0000\u0002ဌ\u0001", new Object[]{"zzf", "zzg", "zzh", zzakx.zzc()});
        }
        return Byte.valueOf(this.zzi);
    }
}
