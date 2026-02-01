package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaaq extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzaaq zzb;
    private int zzf;
    private zzwr zzg;
    private byte zzi = 2;
    private zzbfp zzh = zzbff.zzaj();

    static {
        zzaaq zzaaqVar = new zzaaq();
        zzb = zzaaqVar;
        zzbff.zzan(zzaaq.class, zzaaqVar);
        zza = zzbff.zzac(zzbmd.zze(), zzaaqVar, zzaaqVar, null, 98510069, zzbip.zzk, zzaaq.class);
    }

    private zzaaq() {
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
                    return new zzaap(null);
                }
                return new zzaaq();
            }
            return zzbff.zzam(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"zzf", "zzg", "zzh", zzye.class});
        }
        return Byte.valueOf(this.zzi);
    }
}
