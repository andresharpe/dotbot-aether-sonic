package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzamh extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzamh zzb;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private long zzi;
    private boolean zzj;
    private int zzk;
    private zzaky zzl;
    private zzaky zzm;
    private zzaky zzn;
    private byte zzo = 2;

    static {
        zzamh zzamhVar = new zzamh();
        zzb = zzamhVar;
        zzbff.zzan(zzamh.class, zzamhVar);
        zza = zzbff.zzac(zzbmd.zze(), zzamhVar, zzamhVar, null, 1321489, zzbip.zzk, zzamh.class);
    }

    private zzamh() {
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
                            this.zzo = b4;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzama(null);
                }
                return new zzamh();
            }
            return zzbff.zzam(zzb, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\u0003\u0001ဇ\u0003\u0002ဇ\u0000\u0003ဌ\u0001\u0005ဌ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\tဂ\u0002\u000bᐉ\u0007", new Object[]{"zzf", "zzj", "zzg", "zzh", zzamg.zzc(), "zzk", zzamd.zzc(), "zzl", "zzm", "zzi", "zzn"});
        }
        return Byte.valueOf(this.zzo);
    }
}
