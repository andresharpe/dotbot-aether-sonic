package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zze extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zze zzb;
    private int zzf;
    private zzm zzg;
    private zzg zzh;
    private byte zzi = 2;

    static {
        zze zzeVar = new zze();
        zzb = zzeVar;
        zzbff.zzan(zze.class, zzeVar);
        zza = zzbff.zzac(zzam.zzj(), zzeVar, zzeVar, null, 47497405, zzbip.zzk, zze.class);
    }

    private zze() {
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
                    return new zzd(null);
                }
                return new zze();
            }
            return zzbff.zzam(zzb, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0001", new Object[]{"zzf", "zzg", "zzh"});
        }
        return Byte.valueOf(this.zzi);
    }
}
