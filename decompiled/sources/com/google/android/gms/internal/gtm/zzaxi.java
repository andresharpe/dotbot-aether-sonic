package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzaxi extends zzbff implements zzbgt {
    private static final zzaxi zza;
    private byte zzg = 2;
    private zzbfp zzb = zzbff.zzaj();
    private zzbfl zzf = zzbff.zzah();

    static {
        zzaxi zzaxiVar = new zzaxi();
        zza = zzaxiVar;
        zzbff.zzan(zzaxi.class, zzaxiVar);
    }

    private zzaxi() {
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
                        return zza;
                    }
                    return new zzaxh(null);
                }
                return new zzaxi();
            }
            return zzbff.zzam(zza, "\u0001\u0002\u0000\u0000\u0007\b\u0002\u0000\u0002\u0001\u0007Л\b\u0016", new Object[]{"zzb", zzaxg.class, "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
