package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes.dex */
public final class zzag extends zzbff implements zzbgt {
    public static final zzbfd zza;
    private static final zzag zzb;
    private int zzf;
    private int zzj;
    private int zzl;
    private int zzm;
    private zzbfl zzg = zzbff.zzah();
    private zzbfl zzh = zzbff.zzah();
    private zzbfl zzi = zzbff.zzah();
    private zzbfl zzk = zzbff.zzah();

    static {
        zzag zzagVar = new zzag();
        zzb = zzagVar;
        zzbff.zzan(zzag.class, zzagVar);
        zza = zzbff.zzac(zzam.zzj(), zzagVar, zzagVar, null, 101, zzbip.zzk, zzag.class);
    }

    private zzag() {
    }

    public final int zza() {
        return this.zzl;
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
                        return zzb;
                    }
                    return new zzaf(null);
                }
                return new zzag();
            }
            return zzbff.zzam(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004င\u0000\u0005\u0016\u0006င\u0001\u0007င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zzi.size();
    }

    public final List zzf() {
        return this.zzg;
    }

    public final List zzg() {
        return this.zzh;
    }

    public final List zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzk;
    }
}
